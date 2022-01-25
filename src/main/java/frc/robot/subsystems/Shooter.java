package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    private WPI_TalonFX shooterTalon1;
    private WPI_TalonFX shooterTalon2;
    private VictorSP shooterVictor1;

    public Shooter() {
        shooterTalon1 = new WPI_TalonFX(0);
        shooterTalon2 = new WPI_TalonFX(1);
        shooterVictor1 = new VictorSP(0);
    }

    public WPI_TalonFX getShooterTalon1() {
        return shooterTalon1;
    }

    public WPI_TalonFX getShooterTalon2() {
        return shooterTalon2;
    }

    public VictorSP getShooterVictor1() {
        return shooterVictor1;
    }


}
