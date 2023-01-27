package frc.lib.util;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveModuleConstants {
    public final int driveMotorID;
    public final int angleMotorID;
    public final int cancoderID;
    public final Rotation2d angleOffset;
    public final double encoderOffset;
    public final boolean encoderReversed;

    /**
     * Swerve Module Constants to be used when creating swerve modules.
     * @param driveMotorID
     * @param angleMotorID
     * @param cancoderID
     * @param angleOffset
     * @param encoderOffset
     * @param encoderReversed
     */
    public SwerveModuleConstants(int driveMotorID, int angleMotorID, int cancoderID, Rotation2d angleOffset, double encoderOffset, boolean encoderReversed) {
        this.driveMotorID = driveMotorID;
        this.angleMotorID = angleMotorID;
        this.cancoderID = cancoderID;
        this.angleOffset = angleOffset;
        this.encoderOffset = encoderOffset;
        this.encoderReversed = encoderReversed;
    }
}
