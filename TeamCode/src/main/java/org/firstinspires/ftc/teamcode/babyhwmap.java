package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class babyhwmap extends HardwareMapUtil {
    HardwareMap hwmap = null;

    public DcMotor leftfrontDrive = null;

    public DcMotor rightfrontDrive = null;

    public DcMotor leftbackDrive = null;

    public DcMotor rightbackDrive = null;

    public DcMotor armMotorOne = null;
    public DcMotor armMotorTwo = null;
    public DcMotor Intake = null;
    public Servo armServo = null;
    public Servo planeServo = null;
    public Servo pixelServo = null;


    public void init(HardwareMap ahwMap){
        hwMap=ahwMap;
        leftfrontDrive = HardwareInitMotor("lfD", true);
        rightfrontDrive = HardwareInitMotor("rfD", false);
        leftbackDrive = HardwareInitMotor("lbD", true);
        rightbackDrive = HardwareInitMotor("rbD", false);
        armMotorOne = HardwareInitMotor("arm_1", true);
        armMotorTwo = HardwareInitMotor("arm_2", true);
        Intake = HardwareInitMotor("intake", true);
        armServo = hwMap.get(Servo.class, "servo");
        planeServo = hwMap.get(Servo.class, "planeServo");
        pixelServo = hwMap.get(Servo.class, "pixelServo");


        //armServo.setDirection(DcMotorSimple.Direction.FORWARD);

        leftfrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightfrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftbackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightbackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armMotorOne.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armMotorTwo.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);















    }






















}
