package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.TextureLottieGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottParameter;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import com.momo.mcamera.util.MDLogTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p149l.ev0;
import p149l.g16;
import p149l.rbj;

/* JADX INFO: loaded from: classes6.dex */
public class PottMVMapProgramGroup extends EsTemplateProgramGroup {
    MMFrameGeomeAttrInfo countryGInfo;
    List<LottieMMFrameGeomeAttrInfo> flagsInfo;
    rbj mapBuffer;
    int mapHeight;
    String mapType;
    int mapWidth;
    TextureLottieGeomeAttrInfo nomralForCountry;
    List<PointF> travelList;

    public PottMVMapProgramGroup() {
        super("tailer/map/");
        this.flagsInfo = new ArrayList();
        this.mapWidth = 1124;
        this.mapHeight = 743;
        this.mapType = PottParameter.MAP_TYPE_WORLD;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void destroy() {
        super.destroy();
        if (this.travelList != null) {
            this.travelList = null;
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup, com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface
    public synchronized void drawGroup() {
        try {
            if (this.nomralForCountry != null && this.countryGInfo != null) {
                if (this.mapBuffer == null) {
                    rbj rbjVar = new rbj(this.mapWidth, this.mapHeight);
                    this.mapBuffer = rbjVar;
                    rbjVar.m178603b(this.mapWidth, this.mapHeight);
                    this.nomralForCountry.updateInputeTexture(new int[]{this.mapBuffer.m178610i()[0]});
                }
                this.nomralForCountry.setTimeStamp(this.curTimeStamp);
                this.nomralForCountry.updateBitmapInfo(this.mapWidth, this.mapHeight);
                if (this.nomralForCountry.getFrameTexture() != null && this.nomralForCountry.getAlphaValue() > 0.0f) {
                    int[] iArr = new int[1];
                    int[] iArr2 = new int[4];
                    GLES20.glGetIntegerv(36006, iArr, 0);
                    GLES20.glGetIntegerv(2978, iArr2, 0);
                    GLES20.glBindFramebuffer(36160, this.mapBuffer.m178609h()[0]);
                    GLES20.glViewport(0, 0, this.mapWidth, this.mapHeight);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16640);
                    this.countryGInfo.setBaseRenderSize(this.mapWidth, this.mapHeight);
                    this.countryGInfo.setRotate(180.0f, 0.0f, 0.0f);
                    RenderRunner.drawTexture(this.normal, this.countryGInfo);
                    for (LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo : this.flagsInfo) {
                        lottieMMFrameGeomeAttrInfo.setTimeStamp(this.curTimeStamp);
                        lottieMMFrameGeomeAttrInfo.setBaseRenderSize(this.mapWidth, this.mapHeight);
                        lottieMMFrameGeomeAttrInfo.setRotate(180.0f, 0.0f, 0.0f);
                        RenderRunner.drawTexture(this.normal, lottieMMFrameGeomeAttrInfo);
                    }
                    GLES20.glBindFramebuffer(36160, iArr[0]);
                    GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                }
                super.drawGroup();
                return;
            }
            MDLog.m7391e(MDLogTag.FILTER_TAG, "Parse Config error !! do not render ");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public boolean onParseLayers(LottieConfig lottieConfig, Layers layers, AssetValue assetValue) {
        String layerName = layers.getLayerName();
        if (layerName.equalsIgnoreCase("flags")) {
            String str = (this.baseFolder + "/" + assetValue.getFolderPath() + "/") + assetValue.getSourceName();
            Random random = new Random();
            List<PointF> list = this.travelList;
            if (list == null) {
                MDLog.m7399w(MDLogTag.FILTER_TAG, "Do not set Location list !");
                return true;
            }
            for (PointF pointF : list) {
                int frameCount = assetValue.getFrameCount();
                LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(frameCount > 0 ? str + String.format("_%03d", Integer.valueOf(random.nextInt(frameCount))) + ".png" : str);
                lottieMMFrameGeomeAttrInfo.setAlphaValue(0.0f);
                lottieMMFrameGeomeAttrInfo.setLottieConfig(layers);
                lottieMMFrameGeomeAttrInfo.setTraslate((pointF.x * 2.0f) - 1.0f, (pointF.y * 2.0f) - 1.0f);
                this.flagsInfo.add(lottieMMFrameGeomeAttrInfo);
            }
            return true;
        }
        if (layerName.equalsIgnoreCase("map")) {
            boolean zEqualsIgnoreCase = this.mapType.equalsIgnoreCase(PottParameter.MAP_TYPE_WORLD);
            String str2 = this.baseFolder;
            this.countryGInfo = new MMFrameGeomeAttrInfo(zEqualsIgnoreCase ? str2 + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName() + "_world.png" : str2 + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName() + "_china.png");
            TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = new TextureLottieGeomeAttrInfo();
            this.nomralForCountry = textureLottieGeomeAttrInfo;
            textureLottieGeomeAttrInfo.setLottieConfig(layers);
            this.mapWidth = assetValue.getWidth();
            this.mapHeight = assetValue.getHeight();
            addRunerTask(this.normal, this.nomralForCountry);
            return true;
        }
        boolean zEqualsIgnoreCase2 = layerName.equalsIgnoreCase("maptextsticker");
        String str3 = this.baseFolder;
        if (!zEqualsIgnoreCase2) {
            LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo2 = new LottieMMFrameGeomeAttrInfo(str3 + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName());
            lottieMMFrameGeomeAttrInfo2.setLottieConfig(layers);
            addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo2);
            return true;
        }
        MaskModel mask = MaskStore.getInstance().getMask(ev0.m118233a(), str3 + "/" + assetValue.getFolderPath());
        if (mask == null || mask.getStickers() == null || mask.getStickers().size() <= 0) {
            MDLog.m7391e(MDLogTag.FILTER_TAG, "Parse config error !! the param.txt of cover sticker is wrong !!");
            recycleAllData();
            return false;
        }
        addRunerTask(this.normal, new StickerItemGeomeAttrInfo(mask.getStickers().get(0), g16.f100119a));
        return true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void recycleAllData() {
        super.recycleAllData();
        TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = this.nomralForCountry;
        if (textureLottieGeomeAttrInfo != null) {
            textureLottieGeomeAttrInfo.recycleResourceInGlThread();
            this.nomralForCountry = null;
        }
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.countryGInfo;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.countryGInfo = null;
        }
        Iterator<LottieMMFrameGeomeAttrInfo> it = this.flagsInfo.iterator();
        while (it.hasNext()) {
            it.next().recycleResourceInGlThread();
        }
        this.flagsInfo.clear();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public synchronized void resetStatus() {
        try {
            super.resetStatus();
            TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = this.nomralForCountry;
            if (textureLottieGeomeAttrInfo != null) {
                textureLottieGeomeAttrInfo.resetStatus();
            }
            MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.countryGInfo;
            if (mMFrameGeomeAttrInfo != null) {
                mMFrameGeomeAttrInfo.resetStatus();
            }
            for (LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo : this.flagsInfo) {
                lottieMMFrameGeomeAttrInfo.resetStatus();
                lottieMMFrameGeomeAttrInfo.setAlphaValue(0.0f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMapType(String str) {
        this.mapType = str;
    }

    public void setTravelList(List<PointF> list) {
        this.travelList = list;
    }

    public PottMVMapProgramGroup(String str) {
        super(str);
        this.flagsInfo = new ArrayList();
        this.mapWidth = 1124;
        this.mapHeight = 743;
        this.mapType = PottParameter.MAP_TYPE_WORLD;
    }
}
