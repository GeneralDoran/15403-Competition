package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

//import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;


@TeleOp(name="baby teleop", group="Pushbot")
public class babyteleop extends Auto_Util {
    babyhwmap robot=new babyhwmap();

    private ElapsedTime runtime = new ElapsedTime();

    //power variables
    static double turnPower;
    static double fwdBackPower;
    static double strafePower;
    static double lbPower;
    static double lfPower;
    static double rbPower;
    static double rfPower;
    static double slowamount ;
    public double intakePower = 0.5;
    public double pivPower = .4;
    public double extPower = .7;

//toggle variables
    private boolean changed1 = false;
    private boolean changed2 = false;
    private boolean changed3 = false;
    private boolean changed4 = false;
    private boolean changed6 = false;
    private boolean changed7 = false;
    private boolean changed8 = false;
    private boolean changed9 = false;

    //servo position variables
    static double open = .77;
    static double closed = .4;
    static double pixel_open = .3;
    //motor position variables
    int low = 1613;
    int med = 2420;
    int high = 3226;
    int zero = 0;
    int CurrentPos = zero;

    public void runOpMode(){
        robot.init(hardwareMap);

        telemetry.addData("Status,", "Ready to run");
        telemetry.update();
        initAuto();
        waitForStart();


        while(opModeIsActive()) {

            //Drive
            fwdBackPower = gamepad1.left_stick_y * slowamount;
            strafePower = gamepad1.left_stick_x * slowamount;
            turnPower = gamepad1.right_stick_x * slowamount;

            lfPower = (fwdBackPower - turnPower - strafePower);
            rfPower = (fwdBackPower + turnPower + strafePower);
            lbPower = (fwdBackPower - turnPower + strafePower);
            rbPower = (fwdBackPower + turnPower - strafePower);

            robot.leftfrontDrive.setPower(lfPower);
            robot.leftbackDrive.setPower(lbPower);
            robot.rightfrontDrive.setPower(rfPower);
            robot.rightbackDrive.setPower(rbPower);

           //slow mode
            if (gamepad1.right_bumper){
                slowamount = 0.5;}
           // else if (gamepad1.left_bumper) {
              //  slowamount = 0.1;}
            else{
                slowamount = 1;}

            //Intake
            robot.Intake.setPower(intakePower);

            //pivot motor controls
            if(gamepad2.right_bumper){
                robot.armMotorOne.setPower(gamepad2.right_stick_y*.1);
            } else if(gamepad1.a){
                robot.armMotorOne.setPower(gamepad2.right_stick_y);
            } else{
                robot.armMotorOne.setPower(gamepad2.right_stick_y*.4);
            }
            //extension motor controls
            if(gamepad2.left_bumper){
                robot.armMotorTwo.setPower(gamepad2.left_stick_y*.7 - .08);
            } else if(gamepad2.left_trigger != 0){
                robot.armMotorTwo.setPower(gamepad2.left_stick_y);
            }else{
                robot.armMotorTwo.setPower(gamepad2.left_stick_y*.7);
            }

            //pixel drop servo
            if(gamepad2.dpad_up){
                robot.pixelServo.setPosition(1);
            } else{
                robot.pixelServo.setPosition(0);
            }
            //plane launch
            if(gamepad1.a && gamepad1.b){
                robot.planeServo.setPosition(open);
            } else {
                robot.planeServo.setPosition(closed);
            }

            //arm servo controller
            if(gamepad1.x) {
                robot.armServo.setPosition(pixel_open);
            }else{
                robot.armServo.setPosition(0);
            }

            //intake directional toggle
            if(gamepad1.left_bumper && !changed3){
                if(intakePower == 0.5){
                    intakePower = -1;
                }else{
                    intakePower = 0.5;
                }
                changed3 = true;
            } else if(!gamepad1.dpad_up){changed3 = false;}

            if(gamepad1.dpad_right && !changed7){
                double save = intakePower;
                if(intakePower == -1){
                    intakePower = 0.5;
                } else{
                    intakePower = -1;
                } changed7 = true;
            } else if(!gamepad1.dpad_right){changed7 = false;}

            if(gamepad1.dpad_down && !changed8){
                double save = intakePower;
                if(intakePower == -1 || intakePower == 0.5){
                    intakePower = 0;
                } else{
                    intakePower = save;
                } changed8 = true;
            } else if(!gamepad1.dpad_down){changed8 = false;}


            //arm auto position
            if(gamepad2.b && !changed1 ){
                if(CurrentPos == zero){
                    CurrentPos = low;
                } else if(CurrentPos == med){
                    CurrentPos = low;
                } else if (CurrentPos == high){
                    CurrentPos = low;
                }
                robot.armMotorOne.setTargetPosition(CurrentPos);
                robot.armMotorOne.setPower(pivPower);
            } else if(!gamepad2.b){
                changed1 = false;
            }
            if(gamepad2.a && !changed4){
                if(CurrentPos == low){
                    CurrentPos = zero;
                } else if(CurrentPos == med){
                    CurrentPos = zero;
                } else if (CurrentPos == high){
                    CurrentPos = zero;
                }
                robot.armMotorOne.setTargetPosition(CurrentPos);
                robot.armMotorOne.setPower(pivPower);

            } else if(!gamepad2.a){
                changed4 = false;
            }
            if(gamepad2.x && !changed2){
                if(CurrentPos == zero){
                    CurrentPos = med;
                } else if(CurrentPos == low){
                    CurrentPos = med;
                } else if (CurrentPos == high){
                    CurrentPos = med;
                }
                robot.armMotorOne.setTargetPosition(CurrentPos);
                robot.armMotorOne.setPower(pivPower);

            } else if(!gamepad2.x){
                changed2 = false;
            }
            if(gamepad2.y && !changed6){
                if(CurrentPos == zero){
                    CurrentPos = high;
                } else if(CurrentPos == low){
                    CurrentPos = high;
                } else if (CurrentPos == med){
                    CurrentPos = high;
                }
                robot.armMotorOne.setTargetPosition(CurrentPos);
                robot.armMotorOne.setPower(pivPower);

            } else if(!gamepad2.x){
                changed6 = false;
            }
            telemetry.addData("encoder value", robot.armMotorOne.getCurrentPosition());

            robot.armMotorOne.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }





    //Unused Code Graveyard
           /* if(gamepad1.a){
                robot.armMotorOne.setPower(1);
            } else if(gamepad1.b){
                robot.armMotorOne.setPower(-1);
            } else{
                robot.armMotorOne.setPower(0);
            }
          if(gamepad1.x){
                robot.armMotorTwo.setPower(1);
            } else if(gamepad1.y){
                robot.armMotorTwo.setPower(-1);

            } else{
              robot.armMotorTwo.setPower(0);
          }*/

           /*while(gamepad1.dpad_up){
                robot.leftfrontDrive.setPower(1);
            }
            while(gamepad1.dpad_left){
                robot.rightfrontDrive.setPower(1);
            }
            while(gamepad1.dpad_down){
                robot.leftbackDrive.setPower(1);
            }
            while(gamepad1.dpad_right){
                robot.rightbackDrive.setPower(1);
            }*/

    }








}