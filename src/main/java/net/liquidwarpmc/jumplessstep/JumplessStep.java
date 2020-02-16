package net.liquidwarpmc.jumplessstep;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JumplessStep implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("JumplessStep");

	@Override
	public void onInitialize() {
			LOGGER.info("[Jumpless Step] initialized!");
	}
}
