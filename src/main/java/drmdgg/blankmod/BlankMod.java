package drmdgg.blankmod;

import org.apache.logging.log4j.LogManager;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("blankmod")
public class BlankMod 
{
	public static BlankMod instance;
	public static final String modid = "blankmod";
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(modid);
	
		
	public BlankMod() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);		
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		logger.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		logger.info("clientRegistries method registered.");
	}
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
			
          
			
			);
			logger.info("Items registered");
		}
		
		 @SubscribeEvent
	     public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	        {
	            event.getRegistry().registerAll
	        (

	        	
	        );       
	        logger.info("Blocks registered.");
	        }
		 

		 
		private static ResourceLocation location(String name) //must add location in item and block lines
		{
			return new ResourceLocation(BlankMod.modid, name);
		}
		
		
	}
}

