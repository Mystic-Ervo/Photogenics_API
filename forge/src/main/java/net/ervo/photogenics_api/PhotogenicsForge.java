package net.ervo.photogenics_api;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class PhotogenicsForge {
    
    public PhotogenicsForge() {

	    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }

	public static void addCameraReactive(ICameraReactive reactive, IEventBus eventBus) {
		eventBus.addListener(reactive::onShutterOpen);
	}
}