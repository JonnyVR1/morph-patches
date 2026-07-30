package com.momo.mcamera.mask.cartoon;

import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.facewarp.FaceWarpProcessor;
import com.momo.xeengine.lightningrender.ILightningRender;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class CartoonMutex {
    private static final int MAKEUP_SIZE = 8;
    private static final int MICRO_SIZE = 21;
    private volatile boolean isCurrentCartoonStatus;
    private String lastMakeupPath;
    private volatile boolean microProcessOnce = false;
    private boolean microMutex = true;
    private HashMap<String, Float> lastMakeupValues = new HashMap<>(8);
    private HashMap<String, Float> lastMcrioValues = new HashMap<>(21);

    private void clearMakeupValues(ILightningRender iLightningRender) {
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_EYES, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_LIPS, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_LUT, 0.0f);
        iLightningRender.getMakeupLevel().setEffectIntensity(ILightningRender.IMakeupLevel.MAKEUP_ALL, 0.0f);
    }

    private void clearMircoValues(FaceWarpProcessor faceWarpProcessor) {
        HashMap<String, Float> map = this.lastMcrioValues;
        if (map == null || map.isEmpty() || faceWarpProcessor == null) {
            return;
        }
        Iterator<Map.Entry<String, Float>> it = this.lastMcrioValues.entrySet().iterator();
        while (it.hasNext()) {
            faceWarpProcessor.setFaceBeautyValue(it.next().getKey(), 0.0f);
        }
    }

    private void makeupEnable(ILightningRender iLightningRender, boolean z) {
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_EYES, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_LIPS, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_LUT, z);
        iLightningRender.getMakeupLevel().disableEffect(ILightningRender.IMakeupLevel.MAKEUP_ALL, z);
    }

    public void addMaskModel(MaskModel maskModel, ILightningRender iLightningRender, FaceWarpProcessor faceWarpProcessor) {
        if (maskModel == null || maskModel.getAdditionalInfo() == null || iLightningRender == null) {
            return;
        }
        if (!maskModel.getAdditionalInfo().isCartoonFaceEnable()) {
            if (this.isCurrentCartoonStatus) {
                revertAllValue(iLightningRender, faceWarpProcessor);
                return;
            }
            return;
        }
        if (maskModel.getAdditionalInfo().getCartoonFaceType() == 4) {
            this.microMutex = false;
        } else {
            this.microMutex = true;
        }
        this.isCurrentCartoonStatus = true;
        iLightningRender.setCartoonFaceEnable(true);
        makeupEnable(iLightningRender, true);
        if (this.microMutex) {
            clearMircoValues(faceWarpProcessor);
        }
        clearMakeupValues(iLightningRender);
        this.microProcessOnce = true;
    }

    public boolean doProcess() {
        return this.isCurrentCartoonStatus;
    }

    public boolean intercept() {
        return this.isCurrentCartoonStatus;
    }

    public boolean interceptMakeup(String str, float f) {
        this.lastMakeupValues.put(str, Float.valueOf(f));
        return this.isCurrentCartoonStatus;
    }

    public boolean interceptMakeupPath(String str) {
        this.lastMakeupPath = str;
        return this.isCurrentCartoonStatus;
    }

    public boolean interceptMicro(String str, float f) {
        this.lastMcrioValues.put(str, Float.valueOf(f));
        return this.isCurrentCartoonStatus && this.microMutex;
    }

    public boolean interceptMicroProcess() {
        boolean z = this.isCurrentCartoonStatus && this.microMutex;
        if (!this.microProcessOnce) {
            return z;
        }
        this.microProcessOnce = false;
        return false;
    }

    public boolean interceptRemoveAllMakeup() {
        this.lastMakeupPath = null;
        this.lastMakeupValues.clear();
        return false;
    }

    public boolean interceptRemoveMakeup(String str) {
        this.lastMakeupValues.put(str, Float.valueOf(0.0f));
        return this.isCurrentCartoonStatus;
    }

    public void revertAllValue(ILightningRender iLightningRender, FaceWarpProcessor faceWarpProcessor) {
        this.isCurrentCartoonStatus = false;
        this.microProcessOnce = false;
        if (iLightningRender != null) {
            iLightningRender.setCartoonFaceEnable(false);
            makeupEnable(iLightningRender, false);
            revertMakeupValue(iLightningRender);
        }
        if (faceWarpProcessor != null) {
            revertMicroValue(faceWarpProcessor);
        }
    }

    public void revertMakeupValue(ILightningRender iLightningRender) {
        if (iLightningRender != null) {
            String str = this.lastMakeupPath;
            if (str != null) {
                iLightningRender.addLibraryPath(str);
                iLightningRender.getMakeupLevel().addEffect(this.lastMakeupPath);
            }
            HashMap<String, Float> map = this.lastMakeupValues;
            if (map == null || map.isEmpty()) {
                return;
            }
            for (Map.Entry<String, Float> entry : this.lastMakeupValues.entrySet()) {
                iLightningRender.getMakeupLevel().setEffectIntensity(entry.getKey(), entry.getValue().floatValue());
            }
        }
    }

    public void revertMicroBodyMakeupValues(ILightningRender iLightningRender, FaceWarpProcessor faceWarpProcessor) {
        if (this.isCurrentCartoonStatus) {
            revertAllValue(iLightningRender, faceWarpProcessor);
        }
        this.isCurrentCartoonStatus = false;
    }

    public void revertMicroValue(FaceWarpProcessor faceWarpProcessor) {
        HashMap<String, Float> map = this.lastMcrioValues;
        if (map == null || map.isEmpty() || faceWarpProcessor == null) {
            return;
        }
        for (Map.Entry<String, Float> entry : this.lastMcrioValues.entrySet()) {
            faceWarpProcessor.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
        }
    }

    public void setCartoonFaceEnable(boolean z) {
        this.isCurrentCartoonStatus = z;
    }
}
