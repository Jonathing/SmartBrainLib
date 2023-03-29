package net.tslat.smartbrainlib;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.tslat.smartbrainlib.api.core.sensor.ExtendedSensor;

import java.util.function.Supplier;

public interface SBLLoader {
	void init();
	boolean isDevEnv();

	<T> Supplier<MemoryModuleType<T>> registerMemoryType(String id);

	<T extends ExtendedSensor<?>> Supplier<SensorType<T>> registerSensorType(String id, Supplier<T> sensor);

	<T extends LivingEntity> Supplier<EntityType<T>> registerEntityType(String registryName, Supplier<EntityType<T>> entityType);
}
