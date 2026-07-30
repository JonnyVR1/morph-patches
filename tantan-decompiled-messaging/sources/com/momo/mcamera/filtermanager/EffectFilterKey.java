package com.momo.mcamera.filtermanager;

import com.momo.mcamera.mask.BigMouthMaskFilter;
import com.momo.mcamera.mask.hotdance.HotDanceFilter;
import com.momo.mcamera.mask.motioncamera.MotionCameraFilter;
import java.util.HashMap;
import p149l.bsf;
import p149l.c300;
import p149l.cwb;
import p149l.esf;
import p149l.ey00;
import p149l.fgp0;
import p149l.fsf;
import p149l.gsf;
import p149l.hsf;
import p149l.ipf0;
import p149l.jpf0;
import p149l.jsf;
import p149l.koi;
import p149l.mrf;
import p149l.nrf;
import p149l.nsf;
import p149l.o1k;
import p149l.orf;
import p149l.prf;
import p149l.psf;
import p149l.srf;
import p149l.ulf0;
import p149l.urf;
import p149l.vrf;
import p149l.wrf;
import p149l.ybc0;
import p149l.zd5;
import p149l.zif0;
import p149l.zrf;

/* JADX INFO: loaded from: classes6.dex */
public class EffectFilterKey {
    private static volatile EffectFilterKey effectFilterKey;
    public HashMap<String, String> effectFilterMap;

    private EffectFilterKey() {
        this.effectFilterMap = null;
        this.effectFilterMap = new HashMap<>();
        reflectEffectFilter();
    }

    public static EffectFilterKey getInstance() {
        if (effectFilterKey == null) {
            synchronized (EffectFilterKey.class) {
                try {
                    if (effectFilterKey == null) {
                        effectFilterKey = new EffectFilterKey();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return effectFilterKey;
    }

    private void reflectEffectFilter() {
        this.effectFilterMap.put("ColorChange", zd5.class.getName());
        this.effectFilterMap.put("FishEye", koi.class.getName());
        this.effectFilterMap.put("Mosaic", ey00.class.getName());
        this.effectFilterMap.put("Crosshatch", cwb.class.getName());
        this.effectFilterMap.put("BigMouthKP", BigMouthMaskFilter.class.getName());
        this.effectFilterMap.put("MirrorFlip", c300.class.getName());
        this.effectFilterMap.put("MirrorVerticalFlip", jpf0.class.getName());
        this.effectFilterMap.put("MirrorHorizontalFlip", ipf0.class.getName());
        this.effectFilterMap.put("WaterReflection", fgp0.class.getName());
        this.effectFilterMap.put("Sketch", zif0.class.getName());
        this.effectFilterMap.put("RainDrops", hsf.class.getName());
        this.effectFilterMap.put("RainWindow", ybc0.class.getName());
        this.effectFilterMap.put("ParticleBlur", esf.class.getName());
        this.effectFilterMap.put("GrainCam", urf.class.getName());
        this.effectFilterMap.put("SoulOut", ulf0.class.getName());
        this.effectFilterMap.put("Dazzling", mrf.class.getName());
        this.effectFilterMap.put("Heartbeat", vrf.class.getName());
        this.effectFilterMap.put("RGBShift", gsf.class.getName());
        this.effectFilterMap.put("Shadowing", jsf.class.getName());
        this.effectFilterMap.put("Partition", fsf.class.getName());
        this.effectFilterMap.put("DoubleBW", orf.class.getName());
        this.effectFilterMap.put("Jitter", bsf.class.getName());
        this.effectFilterMap.put("Dizzy", nrf.class.getName());
        this.effectFilterMap.put("FilmThreeGrids", srf.class.getName());
        this.effectFilterMap.put("DuoColor", prf.class.getName());
        this.effectFilterMap.put("HueTV", wrf.class.getName());
        this.effectFilterMap.put("TransFilm", nsf.class.getName());
        this.effectFilterMap.put("VHSStreak", psf.class.getName());
        this.effectFilterMap.put("HyperZoom", zrf.class.getName());
        this.effectFilterMap.put("Glitter", o1k.class.getName());
        this.effectFilterMap.put("MotionCamera", MotionCameraFilter.class.getName());
        this.effectFilterMap.put("HotDance", HotDanceFilter.class.getName());
    }
}
