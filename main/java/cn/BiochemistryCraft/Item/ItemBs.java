package cn.BiochemistryCraft.Item;

import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cn.BiochemistryCraft.BiochemistryCraft;
public class ItemBs extends Item{
    public static final String[] BloodKind = new String[] {"cow", "pig", "chicken", "wolf", "player", "bat", "horse", "mooshroom", "ocelot", "sheep", "squid",
		"cavespider", "creeper", "enderman", "ghast", "magmacube", "pigzombie", "silverfish", "slime", "spider", "witch", "zombie"};
    public static IIcon i1;
    public static IIcon i2;
    public int xz;
	public ItemBs( int xzs){
		super();
		this.xz = xzs;
		this.setCreativeTab(BiochemistryCraft.biocreativetab);
		this.setMaxStackSize(16);
		this.setMaxDamage(1);
	}
	public static String getxzsmean(int xz){
		switch(xz){
			case 0: return "CowBlood"; 
			case 1: return "PigBlood"; 
			case 2: return "ChickenBlood"; 
			case 3: return "WolfBlood";
			case 4: return "HumanBlood";
			case 5: return "BatBlood";
			case 6: return "HorseBlood";
			case 7: return "MushroomBlood";
			case 8: return "CatBlood";
			case 9: return "SheepBlood";
			case 10: return "SquidBlood";
			case 11: return "CavespiderBlood";
			case 12: return "CreeperBlood";
			case 13: return "EndermanBlood";
			case 14: return "GhostBlood";
			case 15: return "MagmacubeBlood";
			case 16: return "PigzombieBlood";
			case 17: return "SilverfishBlood";
			case 18: return "SlimeBlood";
			case 19: return "SpiderBlood";
			case 20: return "WitchBlood";
			case 21: return "ZombieBlood";
			
		}
		return "";
	}
}
