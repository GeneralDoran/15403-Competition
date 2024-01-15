package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Close Place Red", group = "Encoder")
public class Red_Place_Close extends Auto_Util {
    public void runOpMode() throws InterruptedException {
        initAuto();

        waitForStart();
        if (false) {
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2,2,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-22,-22,10,0);
            encoderStrafe(0.1,8,8,10,0);
            encoderDrive(0.1,-2,-2,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderStrafe(STRAFE_SPEED,-25,-25,10,0);
        } else if (true) {
            encoderDrive(DRIVE_SPEED,-16,-16,10,0);
            encoderStrafe(STRAFE_SPEED,13,13,10,0);
            intakeWork(1);
            encoderStrafe(STRAFE_SPEED,-15,-15,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(0.1,13,13,10,0);
            encoderDrive(0.1,-4.5,-4.5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(0.1,2,2,10,0);
            encoderStrafe(STRAFE_SPEED,-30,-30,10,0);
        } else if (false) {
            encoderStrafe(STRAFE_SPEED,-5,-5,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderDrive(DRIVE_SPEED,-12,12,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderStrafe(0.1,12,12,10,0);
            encoderDrive(0.1,-2,-2,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(0.1,1,1,10,0);
            encoderStrafe(STRAFE_SPEED,-15,-15,10,0);
        }

    }
}

