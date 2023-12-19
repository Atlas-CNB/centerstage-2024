package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.LightSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.SwitchableLight;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Testauto", group="Robot")
//@Disabled
public class testauto extends LinearOpMode {

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


        //merge fata
        FrontLeftMotor.setPower(-1.0);
        FrontRightMotor.setPower(-1.0);
        RearLeftMotor.setPower(-1.0);
        RearRightMotor.setPower(-1.0);
       sleep(800);

        //se roteste la dreapta
        FrontLeftMotor.setPower(-0.35);
        FrontRightMotor.setPower(0.35);
        RearLeftMotor.setPower(-0.35);
        RearRightMotor.setPower(0.35);

        sleep(800);

        //merge fata
        FrontLeftMotor.setPower(-1.0);
        FrontRightMotor.setPower(-1.0);
        RearLeftMotor.setPower(-1.0);
        RearRightMotor.setPower(-1.0);
        sleep(1500);

        //strafe dreapta
        FrontLeftMotor.setPower(-0.6);
        FrontRightMotor.setPower(0.4);
        RearLeftMotor.setPower(0.6);
        RearRightMotor.setPower(-0.4);
        sleep(300);
        //merge in fata
//        FrontLeftMotor.setPower(-1.0);
//        FrontRightMotor.setPower(-1.0);
//        RearLeftMotor.setPower(-1.0);
//        RearRightMotor.setPower(-1.0);
//
//        sleep(1000);

    //strafe dreapta
//        FrontLeftMotor.setPower(-0.4);
//        FrontRightMotor.setPower(0.4);
//        RearLeftMotor.setPower(0.4);
//        RearRightMotor.setPower(-0.4);
//
// sleep(1000);
//
//
//        //merge fata
//        FrontLeftMotor.setPower(-0.4);
//        FrontRightMotor.setPower(-0.4);
//        RearLeftMotor.setPower(-0.4);
//        RearRightMotor.setPower(-0.4);
//sleep(1000);

        //face strafe spre stanga
        //FrontLeftMotor.setPower(0.5);
        //FrontRightMotor.setPower(-0.5);
       // RearLeftMotor.setPower(-0.5);
        //RearRightMotor.setPower(0.5);


        //se ridica bratul si coboare farasul
        //ServoFaras.setPosition(0.2); sleep(1000);
       // ServoBratSuperior.setPosition(1.00);


        //driveFaras = System.currentTimeMillis() + 350;
        //if(driveFaras> System.currentTimeMillis())


        //se coboara farasul si bratul
        // ServoFaras.setPosition(0.4);
        //ServoBratSuperior.setPosition(0.00);

        //sleep(2000);

        //strafe dreapta
        //FrontLeftMotor.setPower(-0.5);
        //FrontRightMotor.setPower(0.5);
        //RearLeftMotor.setPower(0.5);
        //RearRightMotor.setPower(-0.5);

       // sleep(1000);
        //se parcheaza mergand in fata un pic
        //FrontLeftMotor.setPower(-0.5);
       // FrontRightMotor.setPower(-0.5);
       // RearLeftMotor.setPower(-0.5);
       // RearRightMotor.setPower(-0.5);

       // sleep(1000);

        FrontLeftMotor.setPower(0.0);
        FrontRightMotor.setPower(0.0);
        RearLeftMotor.setPower(0.0);
        RearRightMotor.setPower(0.0);
        sleep(2000);
    }

}