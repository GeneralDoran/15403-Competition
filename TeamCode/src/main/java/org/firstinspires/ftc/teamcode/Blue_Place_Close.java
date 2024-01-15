package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Close Place Blue", group = "Encoder")
public class Blue_Place_Close extends Auto_Util {
    public void runOpMode() throws InterruptedException {
        initAuto();

        waitForStart();
        if (true) {
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            intakeWork(5);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,18,-18,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            place(20);
            wait(500);
            reload();
            encoderStrafe(STRAFE_SPEED,-10,-10,10,0);
        } else if (false) {
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            encoderDrive(DRIVE_SPEED,-18,18,10,0);
            encoderDrive(DRIVE_SPEED,-2.5,-2.5,10,0);
            intakeWork(5);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,36,-36,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            encoderStrafe(STRAFE_SPEED,5,5,10,0);
            place(20);
            wait(500);
            reload();
            encoderStrafe(STRAFE_SPEED,-25,-25,10,0);
        } else if (false) {
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            encoderDrive(DRIVE_SPEED,18,-18,10,0);
            encoderDrive(DRIVE_SPEED,-2.5,-2.5,10,0);
            intakeWork(5);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderStrafe(STRAFE_SPEED,-5,-5,10,0);
            place(20);
            wait(500);
            reload();
            encoderStrafe(STRAFE_SPEED,-5,-5,10,0);
        }

    }
}
