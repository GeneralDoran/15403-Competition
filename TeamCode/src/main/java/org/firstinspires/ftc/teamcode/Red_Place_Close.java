package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Close Place Red", group = "Encoder")
public class Red_Place_Close extends ColorDetectionPractice {
    public void runOpMode() throws InterruptedException {
        initAuto();
        initOpenCV();
        waitForStart();
        telemetry.addLine("Started");
        loopOpenCV();
        String loc = getLocation();

        if (loc.equals("Center")) { //center
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-22,-22,10,0);
            encoderStrafe(DRIVE_SPEED,8,8,10,0);
            encoderDrive(0.1,-2,-2,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,-25,-25,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);

        } else if (loc.equals("Left")) { //left
            encoderDrive(DRIVE_SPEED,-15.5,-15.5,10,0);
            encoderStrafe(STRAFE_SPEED,13.5,13.5,10,0);
            intakeWork(1);
            encoderStrafe(STRAFE_SPEED,-15,-15,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(DRIVE_SPEED,13,13,10,0);
            encoderDrive(0.1,-4.5,-4.5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,-30,-30,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);

        } else if (loc.equals("Right")) { //right
            encoderStrafe(STRAFE_SPEED,-5,-5,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(STRAFE_SPEED,12,12,10,0);
            encoderDrive(0.1,-2,-2,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,-15,-15,10,0);
            encoderDrive(DRIVE_SPEED,-5,-5,10,0);
        }

    }
}

