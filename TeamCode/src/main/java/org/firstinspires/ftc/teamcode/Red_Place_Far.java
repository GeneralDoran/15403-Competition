package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Far Place Red",group="Encoder")
public class Red_Place_Far extends ColorDetectionPractice {
    public void runOpMode() throws InterruptedException {
        initAuto();
        initOpenCVOther();
        waitForStart();
        telemetry.addLine("Started");
        loopOpenCVOther();
        String loc = getLocation();
        //String loc = "Left";

        if (loc.equals("Center")) { // center
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderStrafe(STRAFE_SPEED,10,10,10,0);
            encoderDrive(DRIVE_SPEED,-19.5,-19.5,10,0);
            encoderDrive(DRIVE_SPEED,-12.4,12.4,10,0);
            encoderDrive(DRIVE_SPEED,-69,-69,10,0);
            encoderStrafe(STRAFE_SPEED,-13,-13,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,16,16,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);

        } else if (loc.equals("Right")) { //right
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            encoderStrafe(STRAFE_SPEED,-13,-13,10,0);
            intakeWork(1);
            encoderStrafe(STRAFE_SPEED,12,12,10,0);
            encoderDrive(DRIVE_SPEED,-16,-16,10,0);
            encoderDrive(DRIVE_SPEED,-12.3,12.3,10,0);
            encoderDrive(DRIVE_SPEED,-59,-59,10,0);
            encoderStrafe(STRAFE_SPEED,-17.5,-17.5,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,20,20,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);

        } else if (loc.equals("Left")) { //left
            encoderDrive(DRIVE_SPEED,-11,-11,10,0);
            encoderStrafe(STRAFE_SPEED,6,6,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,-9,-9,10,0);
            encoderDrive(DRIVE_SPEED,-25,-25,10,0);
            encoderDrive(DRIVE_SPEED,-12.2,12.2,10,0);
            encoderDrive(DRIVE_SPEED,-56,-56,10,0);
            encoderStrafe(STRAFE_SPEED,-8,-8,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,11,11,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);
        }

    }
}
