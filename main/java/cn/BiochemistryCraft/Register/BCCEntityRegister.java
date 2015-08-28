package cn.BiochemistryCraft.Register;

import cn.BiochemistryCraft.BiochemistryCraft;
import cn.BiochemistryCraft.Entity.EntityBioPig;
import cn.BiochemistryCraft.Entity.EntityLavaZommbie;
import cn.BiochemistryCraft.Entity.Throwable.EntityAcid;
import cn.BiochemistryCraft.TileEntity.TileentityBioExtracter;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class BCCEntityRegister {
    
	public void EntityRegisterInit()
	{
		GameRegistry.registerTileEntity(TileentityBioExtracter.class, "TileentityBioExtracter");
//		EntityRegistry.registerGlobalEntityID(EntityDiable.class, "Le_Diable", 500);
		EntityRegistry.registerGlobalEntityID(EntityAcid.class, "Acid", 402);
		EntityRegistry.registerGlobalEntityID(EntityBioPig.class, "BioPig", 403);
		EntityRegistry.registerGlobalEntityID(EntityLavaZommbie.class, "LavaZombie", 501, 44975, 7969893);
//		EntityRegistry.registerModEntity(EntityDiable.class, "Le_Diable", 500, BiochemistryCraft.instance, 64, 64, true);
		EntityRegistry.registerModEntity(EntityAcid.class, "Acid", 402, BiochemistryCraft.instance, 32, 32, true);
		EntityRegistry.registerModEntity(EntityBioPig.class, "BioPig", 403, BiochemistryCraft.instance, 32, 32, true);
		EntityRegistry.registerModEntity(EntityLavaZommbie.class, "LavaZombie", 501, BiochemistryCraft.instance, 64, 64, true);
	}

}