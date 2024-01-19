package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Close Place Blue", group = "Encoder")
public class Blue_Place_Close extends ColorDetectionPractice {
    public void runOpMode() throws InterruptedException {
        initAuto();
        initOpenCVOther();
        waitForStart();
        telemetry.addLine("Started");
        loopOpenCVOther();
        String loc = getLocation();

        if (loc.equals("Center")) { //center
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,12.3,-12.3,10,0);
            encoderDrive(DRIVE_SPEED,-22,-22,10,0);
            encoderStrafe(DRIVE_SPEED,-2,-2,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,17,17,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);

        } else if (loc.equals("Left")) { //left
            encoderDrive(DRIVE_SPEED,-11,-11,10,0);
            encoderStrafe(STRAFE_SPEED,6,6,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,12.2,-12.2,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(DRIVE_SPEED,-2,-2,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(0.1,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,12,12,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);

        } else if (loc.equals("Right")) { //right
            encoderDrive(DRIVE_SPEED,-17.5,-17.5,10,0);
            encoderStrafe(STRAFE_SPEED,-13,-13,10,0);
            intakeWork(1);
            encoderStrafe(STRAFE_SPEED,15,15,10,0);
            encoderDrive(DRIVE_SPEED,12.2,-12.2,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(0.1,-1,-1,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(0.1,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,23,23,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);
        }

    }
}

