package com.mrgreaper2004.twistedmod3.handlers;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

/**
 * Created by mrgre on 02/02/2017.
 * based off of the psi soundhandler by vazkii
 */
public final class SoundHandler {

    public static SoundEvent bunnyBegA;
    public static SoundEvent bunnyBegB;
    public static SoundEvent bunnyBegC;
    public static SoundEvent bunnyBegD;
    public static SoundEvent bunnyBegE;
    public static SoundEvent bunnyRelease;
    public static SoundEvent bunnyElectricfy;
    public static SoundEvent bunnyExp;
    public static SoundEvent bunnyOww;
    public static SoundEvent bunnynernernanerner;
    public static SoundEvent bunnyResistance;
    public static SoundEvent bunnySwordInsert;
    public static SoundEvent exp_trail;
    public static SoundEvent growl;
    public static SoundEvent laugh;
    public static SoundEvent laughb;
    public static SoundEvent laughc;
    public static SoundEvent littleBunny;
    public static SoundEvent monster;
    public static SoundEvent smackBadHuman;
    public static SoundEvent alarm_airraidA;
    public static SoundEvent alarm_airraidB;
    public static SoundEvent alarm_genericA;
    public static SoundEvent alarm_genericB;
    public static SoundEvent alarm_genericC;
    public static SoundEvent alarm_genericD;
    public static SoundEvent alarm_genericE;
    public static SoundEvent alarm_genericF;
    public static SoundEvent alarm_klaxonA;
    public static SoundEvent alarm_klaxonB;
    public static SoundEvent alarm_scifiA;
    public static SoundEvent alarm_scifiB;
    public static SoundEvent alarm_scifiC;
    public static SoundEvent orphanCry;
    public static SoundEvent evilvoice_Beautiful;
    public static SoundEvent evilvoice_BeCareful;
    public static SoundEvent evilvoice_BloodBunny;
    public static SoundEvent evilvoice_BringToLife;
    public static SoundEvent evilvoice_BurnIt;
    public static SoundEvent evilvoice_Delicous;
    public static SoundEvent evilvoice_DoNotPityOrphan;
    public static SoundEvent evilvoice_DontSpillIt;
    public static SoundEvent evilvoice_IsItDead;
    public static SoundEvent evilvoice_LookCreated;
    public static SoundEvent evilvoice_NoPower;
    public static SoundEvent evilvoice_NoseTwitch;
    public static SoundEvent evilvoice_ReleaseEvilCreature;
    public static SoundEvent evilvoice_Replant;
    public static SoundEvent evilvoice_SomeTimesWrong;
    public static SoundEvent evilvoice_ThePowerCalls;
    public static SoundEvent evilvoice_WeakBringLife;
    public static SoundEvent evilvoice_WorldTremble;
    public static SoundEvent deathOrbStartup;
    public static SoundEvent deathOrbLaunch;
    public static SoundEvent deathOrbRelease;
    public static SoundEvent alarm_scifiD;


    private static int size = 0;

    public static void init() {
        System.out.print("TWISTED MOD >>>> registering sounds");
        size = SoundEvent.REGISTRY.getKeys().size();
        bunnyBegA = register("bunnyBegA");
        bunnyBegB = register("bunnyBegB");
        bunnyBegC = register("bunnyBegC");
        bunnyBegD = register("bunnyBegD");
        bunnyBegE = register("bunnyBegE");
        bunnyRelease = register("bunnyRelease");
        bunnyElectricfy =register("bunnyElectricfy");
        bunnyExp =register("bunnyExp");
        bunnyOww = register("bunnyOww");
        bunnynernernanerner = register("bunnynernernanerner");
        bunnyResistance = register("bunnyResistance");
        bunnySwordInsert = register("bunnySwordInsert");
        exp_trail= register("exp_trail");
        growl = register("growl");
        laugh = register("laugh");
        laughb = register("laughb");
        laughc=register("laughc");
        littleBunny= register("littleBunny");
        monster = register("monster");
        smackBadHuman= register("smackBadHuman");
        alarm_airraidA= register("alarm_airraidA");
        alarm_airraidB= register("alarm_airraidB");
        alarm_genericA=register("alarm_genericA");
        alarm_genericB= register("alarm_genericB");
        alarm_genericC=register("alarm_genericC");
        alarm_genericD=register("alarm_genericD");
        alarm_genericE=register("alarm_genericE");
        alarm_genericF= register("alarm_genericF");
        alarm_klaxonA=register("alarm_klaxonA");
        alarm_klaxonB=register("alarm_klaxonB");
        alarm_scifiA=register("alarm_scifiA");
        alarm_scifiB=register("alarm_scifiB");
        alarm_scifiC=register("alarm_scifiC");
        orphanCry=register("orphanCry");
        evilvoice_Beautiful=register("evilvoice_Beautiful");
        evilvoice_BeCareful=register("evilvoice_BeCareful");
        evilvoice_BloodBunny=register("evilvoice_BloodBunny");
        evilvoice_BringToLife=register("evilvoice_BringToLife");
        evilvoice_BurnIt=register("evilvoice_BurnIt");
        evilvoice_Delicous=register("evilvoice_Delicous");
        evilvoice_DoNotPityOrphan=register("evilvoice_DoNotPityOrphan");
        evilvoice_DontSpillIt=register("evilvoice_DontSpillIt");
        evilvoice_IsItDead=register("evilvoice_IsItDead");
        evilvoice_LookCreated=register("evilvoice_LookCreated");
        evilvoice_NoPower=register("evilvoice_NoPower");
        evilvoice_NoseTwitch=register("evilvoice_NoseTwitch");
        evilvoice_ReleaseEvilCreature=register("evilvoice_ReleaseEvilCreature");
        evilvoice_Replant=register("evilvoice_Replant");
        evilvoice_SomeTimesWrong=register("evilvoice_SomeTimesWrong");
        evilvoice_ThePowerCalls=register("evilvoice_ThePowerCalls");
        evilvoice_WeakBringLife=register("evilvoice_WeakBringLife");
        evilvoice_WorldTremble=register("evilvoice_WorldTremble");
        deathOrbStartup=register("deathOrbStartup");
        deathOrbLaunch=register("deathOrbLaunch");
        deathOrbRelease=register("deathOrbRelease");
        alarm_scifiD=register("alarm_scifiD");
    }

    public static SoundEvent register(String name) {
        ResourceLocation loc = new ResourceLocation(TwistedMod3.MODID,name);
        SoundEvent e = new SoundEvent(loc);
        System.out.print("registered "+name+" from "+loc.toString());

        SoundEvent.REGISTRY.register(size, loc, e);
        size++;

        return e;
    }

}
