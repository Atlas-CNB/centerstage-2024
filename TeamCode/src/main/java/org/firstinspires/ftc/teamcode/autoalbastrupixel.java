package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Autoalbastrupixel", group="Robot")
//@Disabled
public class autoalbastrupixel extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotorEx FrontLeftMotor;
    private DcMotorEx FrontRightMotor;
    private DcMotorEx RearLeftMotor;

    private DcMotorEx RearRightMotor;

    private DcMotorEx AxleMotor;
    private Servo ServoFaras;
    private Servo ServoBratSuperior;

    double time=0;
    double startPositionBrat;

    double startPositionFaras;

    long driveUntil = 0;
    long driveFaras = 0;
    long driveBrat = 0;
    long AxleSafety = 0;
    long pozitieExtraFaras = 0;

    int wantedLevel = 0;
    int wantedFarasLevel = 0;
    int wantedBratLevel = 0;
    boolean AxleRun = false;
    @Override
    public void runOpMode() {

        FrontLeftMotor = hardwareMap.get(DcMotorEx.class, "FrontLeftMotor");
        FrontRightMotor = hardwareMap.get(DcMotorEx.class, "FrontRightMotor");
        RearLeftMotor = hardwareMap.get(DcMotorEx.class, "RearLeftMotor");
        RearRightMotor = hardwareMap.get(DcMotorEx.class, "RearRightMotor");
        AxleMotor = hardwareMap.get(DcMotorEx.class, "AxleMotor");
        ServoFaras = hardwareMap.get(Servo.class, "ServoFaras");
        ServoBratSuperior = hardwareMap.get(Servo.class, "ServoBratSuperior");

        startPositionFaras = 0.43;
        startPositionBrat = 0.00;
        telemetry.addData("startPositionFaras este ", "%f", startPositionFaras);
        telemetry.addData("startPositionBratSup este ", "%f", startPositionBrat);
        ServoFaras.setPosition(startPositionFaras);
        ServoBratSuperior.setPosition(startPositionBrat);

        FrontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        RearLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");

        waitForStart();

        //merge fata usor
        FrontLeftMotor.setPower(-0.5);
        FrontRightMotor.setPower(-0.5);
        RearLeftMotor.setPower(-0.5);
        RearRightMotor.setPower(-0.5);
        sleep(100);

        //strafe stanga
        FrontLeftMotor.setPower(0.5);
        FrontRightMotor.setPower(-0.5);
        RearLeftMotor.setPower(-0.5);
        RearRightMotor.setPower(0.5);
        sleep(500);

        //merge fata pana la panou
        FrontLeftMotor.setPower(-0.5);
        FrontRightMotor.setPower(-0.5);
        RearLeftMotor.setPower(-0.5);
        RearRightMotor.setPower(-0.5);
        sleep(500);

        //ridica bratul
        ServoBratSuperior.setPosition(1.00);

        //rotire pe spate stanga la panou
        FrontLeftMotor.setPower(0.5);
        FrontRightMotor.setPower(-0.5);
        RearLeftMotor.setPower(0.5);
        RearRightMotor.setPower(-0.5);
        sleep(800);

        //mers aproape
        FrontLeftMotor.setPower(0.5);
        FrontRightMotor.setPower(0.5);
        RearLeftMotor.setPower(0.5);
        RearRightMotor.setPower(0.5);
        sleep(400);

        //lansare faras
        ServoFaras.setPosition(0.2);


        FrontLeftMotor.setPower(0.0);
        FrontRightMotor.setPower(0.0);
        RearLeftMotor.setPower(0.0);
        RearRightMotor.setPower(0.0);

    }

}