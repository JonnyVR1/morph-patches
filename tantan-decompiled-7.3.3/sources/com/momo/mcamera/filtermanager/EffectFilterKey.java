package com.momo.mcamera.filtermanager;

import com.momo.mcamera.mask.BigMouthMaskFilter;
import com.momo.mcamera.mask.hotdance.HotDanceFilter;
import com.momo.mcamera.mask.motioncamera.MotionCameraFilter;
import java.util.HashMap;
import p153l.btf;
import p153l.ctf;
import p153l.dtf;
import p153l.duf0;
import p153l.f4k;
import p153l.fkc0;
import p153l.gri;
import p153l.gtf;
import p153l.irf0;
import p153l.itf;
import p153l.jpp0;
import p153l.ltf;
import p153l.mtf;
import p153l.ntf;
import p153l.o610;
import p153l.otf;
import p153l.qtf;
import p153l.qxb;
import p153l.rxf0;
import p153l.sxf0;
import p153l.tsf;
import p153l.usf;
import p153l.utf;
import p153l.vsf;
import p153l.wsf;
import p153l.wtf;
import p153l.zb00;
import p153l.ze5;
import p153l.zsf;

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
        this.effectFilterMap.put("ColorChange", ze5.class.getName());
        this.effectFilterMap.put("FishEye", gri.class.getName());
        this.effectFilterMap.put("Mosaic", o610.class.getName());
        this.effectFilterMap.put("Crosshatch", qxb.class.getName());
        this.effectFilterMap.put("BigMouthKP", BigMouthMaskFilter.class.getName());
        this.effectFilterMap.put("MirrorFlip", zb00.class.getName());
        this.effectFilterMap.put("MirrorVerticalFlip", sxf0.class.getName());
        this.effectFilterMap.put("MirrorHorizontalFlip", rxf0.class.getName());
        this.effectFilterMap.put("WaterReflection", jpp0.class.getName());
        this.effectFilterMap.put("Sketch", irf0.class.getName());
        this.effectFilterMap.put("RainDrops", otf.class.getName());
        this.effectFilterMap.put("RainWindow", fkc0.class.getName());
        this.effectFilterMap.put("ParticleBlur", ltf.class.getName());
        this.effectFilterMap.put("GrainCam", btf.class.getName());
        this.effectFilterMap.put("SoulOut", duf0.class.getName());
        this.effectFilterMap.put("Dazzling", tsf.class.getName());
        this.effectFilterMap.put("Heartbeat", ctf.class.getName());
        this.effectFilterMap.put("RGBShift", ntf.class.getName());
        this.effectFilterMap.put("Shadowing", qtf.class.getName());
        this.effectFilterMap.put("Partition", mtf.class.getName());
        this.effectFilterMap.put("DoubleBW", vsf.class.getName());
        this.effectFilterMap.put("Jitter", itf.class.getName());
        this.effectFilterMap.put("Dizzy", usf.class.getName());
        this.effectFilterMap.put("FilmThreeGrids", zsf.class.getName());
        this.effectFilterMap.put("DuoColor", wsf.class.getName());
        this.effectFilterMap.put("HueTV", dtf.class.getName());
        this.effectFilterMap.put("TransFilm", utf.class.getName());
        this.effectFilterMap.put("VHSStreak", wtf.class.getName());
        this.effectFilterMap.put("HyperZoom", gtf.class.getName());
        this.effectFilterMap.put("Glitter", f4k.class.getName());
        this.effectFilterMap.put("MotionCamera", MotionCameraFilter.class.getName());
        this.effectFilterMap.put("HotDance", HotDanceFilter.class.getName());
    }
}
