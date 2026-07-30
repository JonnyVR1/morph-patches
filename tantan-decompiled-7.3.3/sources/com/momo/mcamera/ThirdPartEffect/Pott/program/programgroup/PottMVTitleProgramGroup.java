package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieBitmapGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerSlidingGeomAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.TextureLottieGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottParameter;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.ScrollEffectProgram;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.util.MDLogTag;
import p153l.jv0;
import p153l.l26;
import p153l.lej;

/* JADX INFO: loaded from: classes6.dex */
public class PottMVTitleProgramGroup extends EsTemplateProgramGroup {
    private int ChinaCityCnt;
    private int ChinaProvinceCnt;
    float[][] animation;
    private lej countryBuffer;
    private int countryCnt;
    MMFrameGeomeAttrInfo countryGInfo;
    private String mapType;
    TextureLottieGeomeAttrInfo nomralForCountry;
    StickerSlidingGeomAttrInfo[] numbersInfo;
    ScrollEffectProgram scrollEffectProgram;
    MaskModel stickerMaskmodel;
    int tmpTextureHeight;
    int tmpTextureWidth;
    private Bitmap userHeadIconBitmap;
    private String userHeadIcondPath;
    private Bitmap userIdBitmap;
    private String userIdPath;
    private Bitmap userNickNameBitmap;
    private String userNickNamePath;
    private int worldCityCnt;

    public PottMVTitleProgramGroup() {
        super("/title");
        this.animation = new float[][]{new float[]{12.0f, 20.0f, 30.0f}, new float[]{14.0f, 25.0f, 35.0f}, new float[]{20.0f, 31.0f, 43.0f}, new float[]{23.0f, 35.0f, 45.0f}, new float[]{23.0f, 35.0f, 45.0f}};
        this.mapType = PottParameter.MAP_TYPE_WORLD;
        this.tmpTextureWidth = 0;
        this.tmpTextureHeight = 0;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void destroy() {
        super.destroy();
        ScrollEffectProgram scrollEffectProgram = this.scrollEffectProgram;
        if (scrollEffectProgram != null) {
            scrollEffectProgram.destroy();
            this.scrollEffectProgram = null;
        }
        this.userNickNamePath = null;
        this.userHeadIcondPath = null;
        this.userIdBitmap = null;
        this.userHeadIconBitmap = null;
        this.userIdPath = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup, com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface
    public void drawGroup() {
        StickerSlidingGeomAttrInfo[] stickerSlidingGeomAttrInfoArr = this.numbersInfo;
        if (stickerSlidingGeomAttrInfoArr == null || this.nomralForCountry == null) {
            MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse Config failed !!!");
            super.drawGroup();
            return;
        }
        int frameWidth = stickerSlidingGeomAttrInfoArr[0].getFrameWidth();
        int frameHeight = this.numbersInfo[0].getFrameHeight();
        int i = this.tmpTextureWidth;
        int i2 = this.tmpTextureHeight;
        boolean z = true;
        if (this.countryBuffer == null) {
            this.countryBuffer = new lej(i, i2);
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            this.countryBuffer.m153895b(i, i2);
            this.nomralForCountry.updateInputeTexture(new int[]{this.countryBuffer.m153902i()[0]});
            GLES20.glBindFramebuffer(36160, iArr[0]);
        }
        this.nomralForCountry.setTimeStamp(this.curTimeStamp);
        this.nomralForCountry.updateBitmapInfo(i, i2);
        if (this.nomralForCountry.getFrameTexture() != null && this.nomralForCountry.getAlphaValue() > 0.0f) {
            int[] iArr2 = new int[1];
            char c = 4;
            int[] iArr3 = new int[4];
            GLES20.glGetIntegerv(36006, iArr2, 0);
            GLES20.glGetIntegerv(2978, iArr3, 0);
            this.countryGInfo.setBaseRenderSize(i, i2);
            StickerSlidingGeomAttrInfo[] stickerSlidingGeomAttrInfoArr2 = this.numbersInfo;
            int length = stickerSlidingGeomAttrInfoArr2.length;
            int i3 = 0;
            while (i3 < length) {
                boolean z2 = z;
                StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo = stickerSlidingGeomAttrInfoArr2[i3];
                if (stickerSlidingGeomAttrInfo != null) {
                    stickerSlidingGeomAttrInfo.setBaseRenderSize(i, i2);
                    stickerSlidingGeomAttrInfo.setTimeStamp(this.curTimeStamp);
                    stickerSlidingGeomAttrInfo.setRotate(180.0f, 0.0f, 0.0f);
                }
                i3++;
                z = z2;
                c = c;
                iArr3 = iArr3;
            }
            boolean z3 = z;
            char c2 = c;
            int[] iArr4 = iArr3;
            GLES20.glBindFramebuffer(36160, this.countryBuffer.m153901h()[0]);
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            this.countryGInfo.setRotate(180.0f, 0.0f, 0.0f);
            float frameWidth2 = (i - this.countryGInfo.getFrameWidth()) * 1.0f;
            float f = i;
            float frameHeight2 = (i2 - this.countryGInfo.getFrameHeight()) * 1.0f;
            float f2 = i2;
            this.countryGInfo.setTraslate(frameWidth2 / f, -(frameHeight2 / f2));
            RenderRunner.drawTexture(this.normal, this.countryGInfo);
            float f3 = frameWidth;
            float f4 = -((((f - (f3 * 3.0f)) - (-15.0f)) * 1.0f) / f);
            float f5 = -((f2 - (this.numbersInfo[0].getFrameHeight() * 1.0f)) / f2);
            this.numbersInfo[0].setTraslate(f4, f5);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[0].getVerticalRatio());
            RenderRunner.drawTexture(this.scrollEffectProgram, this.numbersInfo[0]);
            float f6 = -(((f - (5.0f * f3)) - (-15.0f)) / f);
            this.numbersInfo[z3 ? 1 : 0].setTraslate(f6, f5);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[z3 ? 1 : 0].getVerticalRatio());
            RenderRunner.drawTexture(this.scrollEffectProgram, this.numbersInfo[z3 ? 1 : 0]);
            float f7 = frameHeight;
            float f8 = -(((f2 - (f7 * 3.0f)) - (f7 / 3.0f)) / f2);
            this.numbersInfo[2].setTraslate(f6, f8);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[2].getVerticalRatio());
            RenderRunner.drawTexture(this.scrollEffectProgram, this.numbersInfo[2]);
            this.numbersInfo[3].setTraslate(f4, f8);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[3].getVerticalRatio());
            RenderRunner.drawTexture(this.scrollEffectProgram, this.numbersInfo[3]);
            StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo2 = this.numbersInfo[c2];
            if (stickerSlidingGeomAttrInfo2 != null) {
                stickerSlidingGeomAttrInfo2.setTraslate(-((((f - (f3 * 1.0f)) - (-15.0f)) * 1.0f) / f), f8);
                this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[c2].getVerticalRatio());
                RenderRunner.drawTexture(this.scrollEffectProgram, this.numbersInfo[c2]);
            }
            GLES20.glBindFramebuffer(36160, iArr2[0]);
            GLES20.glViewport(iArr4[0], iArr4[z3 ? 1 : 0], iArr4[2], iArr4[3]);
        }
        super.drawGroup();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public boolean initProgram() {
        super.initProgram();
        this.scrollEffectProgram = new ScrollEffectProgram();
        return true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public boolean onParseLayers(LottieConfig lottieConfig, Layers layers, AssetValue assetValue) {
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo;
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo2;
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo3;
        String layerName = layers.getLayerName();
        if (layerName.equalsIgnoreCase("head")) {
            if (this.userHeadIconBitmap != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap = this.userHeadIconBitmap;
                lottieBitmapGeomeAttrInfo.setBitmapWithTarget(bitmap, bitmap.getWidth(), this.userHeadIconBitmap.getHeight());
                lottieMMFrameGeomeAttrInfo3 = lottieBitmapGeomeAttrInfo;
            } else {
                lottieMMFrameGeomeAttrInfo3 = new LottieMMFrameGeomeAttrInfo(this.userHeadIcondPath);
            }
            lottieMMFrameGeomeAttrInfo3.setLottieConfig(layers);
            addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo3);
        } else if (layerName.equalsIgnoreCase(Constants.KEY_KV)) {
            boolean zEqualsIgnoreCase = this.mapType.equalsIgnoreCase(PottParameter.MAP_TYPE_WORLD);
            String str = this.baseFolder;
            this.countryGInfo = new MMFrameGeomeAttrInfo(zEqualsIgnoreCase ? str + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName() + "_world.png" : str + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName() + "_china.png");
            TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = new TextureLottieGeomeAttrInfo();
            this.nomralForCountry = textureLottieGeomeAttrInfo;
            textureLottieGeomeAttrInfo.setLottieConfig(layers);
            this.tmpTextureWidth = assetValue.getWidth();
            this.tmpTextureHeight = assetValue.getHeight();
            addRunerTask(this.normal, this.nomralForCountry);
        } else if (layerName.equalsIgnoreCase(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            if (this.userNickNameBitmap != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo2 = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap2 = this.userNickNameBitmap;
                lottieBitmapGeomeAttrInfo2.setBitmapWithTarget(bitmap2, bitmap2.getWidth(), this.userNickNameBitmap.getHeight());
                lottieMMFrameGeomeAttrInfo2 = lottieBitmapGeomeAttrInfo2;
            } else {
                lottieMMFrameGeomeAttrInfo2 = new LottieMMFrameGeomeAttrInfo(this.userNickNamePath);
            }
            lottieMMFrameGeomeAttrInfo2.setLottieConfig(layers);
            addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo2);
        } else if (layerName.equalsIgnoreCase("id")) {
            if (this.userIdBitmap != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo3 = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap3 = this.userIdBitmap;
                lottieBitmapGeomeAttrInfo3.setBitmapWithTarget(bitmap3, bitmap3.getWidth(), this.userIdBitmap.getHeight());
                lottieMMFrameGeomeAttrInfo = lottieBitmapGeomeAttrInfo3;
            } else {
                lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.userIdPath);
            }
            lottieMMFrameGeomeAttrInfo.setLottieConfig(layers);
            addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo);
        } else {
            if (layerName.equalsIgnoreCase("numbers")) {
                int i = this.countryCnt;
                int i2 = this.worldCityCnt;
                if (this.mapType.equalsIgnoreCase(PottParameter.MAP_TYPE_CHINA)) {
                    i = this.ChinaProvinceCnt;
                    i2 = this.ChinaCityCnt;
                }
                int[] iArr = {i / 10, i % 10, i2 % 10, i2 / 10, i2 / 100};
                this.numbersInfo = new StickerSlidingGeomAttrInfo[5];
                Sticker sticker = new Sticker();
                String[] strArrSplit = assetValue.getFolderPath().split("/");
                String str2 = this.baseFolder;
                sticker.setImageFolderPath(strArrSplit != null ? str2 + "/" + strArrSplit[0] : str2 + "/" + assetValue.getFolderPath());
                sticker.setImagePreName(assetValue.getSourceName());
                sticker.setFrameNumber(assetValue.getFrameCount());
                sticker.setFrameRate(25);
                sticker.setImageWidth(assetValue.getWidth());
                sticker.setImageHeight(assetValue.getHeight());
                sticker.setAlwaysShow(true);
                sticker.setUseImageCache(true);
                sticker.setLoopStart(assetValue.getFrameCount() - 1);
                for (int i3 = 0; i3 < 5; i3++) {
                    this.numbersInfo[i3] = new StickerSlidingGeomAttrInfo(sticker, iArr[i3]);
                    this.numbersInfo[i3].updateAnimationRange(this.animation[i3]);
                }
                if (iArr[4] == 0) {
                    this.numbersInfo[4] = null;
                }
            } else if (layerName.equalsIgnoreCase("titlecover")) {
                MaskModel mask = MaskStore.getInstance().getMask(jv0.m147001a(), this.baseFolder + "/" + assetValue.getFolderPath());
                this.stickerMaskmodel = mask;
                if (mask == null || mask.getStickers() == null || this.stickerMaskmodel.getStickers().size() < 1) {
                    MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse config error !! the param.txt of cover sticker is wrong !!");
                    recycleAllData();
                    return false;
                }
                addRunerTask(this.normal, new StickerItemGeomeAttrInfo(this.stickerMaskmodel.getStickers().get(0), l26.f129743a));
            }
        }
        return true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void recycleAllData() {
        super.recycleAllData();
        StickerSlidingGeomAttrInfo[] stickerSlidingGeomAttrInfoArr = this.numbersInfo;
        if (stickerSlidingGeomAttrInfoArr != null) {
            for (StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo : stickerSlidingGeomAttrInfoArr) {
                if (stickerSlidingGeomAttrInfo != null) {
                    stickerSlidingGeomAttrInfo.recycleResourceInGlThread();
                }
            }
            this.numbersInfo = null;
        }
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.countryGInfo;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.countryGInfo = null;
        }
        TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = this.nomralForCountry;
        if (textureLottieGeomeAttrInfo != null) {
            textureLottieGeomeAttrInfo.recycleResourceInGlThread();
            this.nomralForCountry = null;
        }
        this.stickerMaskmodel = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public synchronized void resetStatus() {
        try {
            super.resetStatus();
            StickerSlidingGeomAttrInfo[] stickerSlidingGeomAttrInfoArr = this.numbersInfo;
            if (stickerSlidingGeomAttrInfoArr != null) {
                for (StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo : stickerSlidingGeomAttrInfoArr) {
                    if (stickerSlidingGeomAttrInfo != null) {
                        stickerSlidingGeomAttrInfo.resetStatus();
                    }
                }
            }
            MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.countryGInfo;
            if (mMFrameGeomeAttrInfo != null) {
                mMFrameGeomeAttrInfo.resetStatus();
            }
            TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = this.nomralForCountry;
            if (textureLottieGeomeAttrInfo != null) {
                textureLottieGeomeAttrInfo.resetStatus();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setChinaCityCnt(int i) {
        this.ChinaCityCnt = i;
    }

    public void setChinaProvinceCnt(int i) {
        this.ChinaProvinceCnt = i;
    }

    public void setCountryCnt(int i) {
        this.countryCnt = i;
    }

    public void setMapType(String str) {
        this.mapType = str;
    }

    public void setUserHeadIconBitmap(Bitmap bitmap) {
        this.userHeadIconBitmap = bitmap;
    }

    public void setUserHeadIcondPath(String str) {
        this.userHeadIcondPath = str;
    }

    public void setUserIdBitmap(Bitmap bitmap) {
        this.userIdBitmap = bitmap;
    }

    public void setUserIdPath(String str) {
        this.userIdPath = str;
    }

    public void setUserNickNameBitmap(Bitmap bitmap) {
        this.userNickNameBitmap = bitmap;
    }

    public void setUserNickNamePath(String str) {
        this.userNickNamePath = str;
    }

    public void setWorldCityCnt(int i) {
        this.worldCityCnt = i;
    }

    public PottMVTitleProgramGroup(String str) {
        super(str);
        this.animation = new float[][]{new float[]{12.0f, 20.0f, 30.0f}, new float[]{14.0f, 25.0f, 35.0f}, new float[]{20.0f, 31.0f, 43.0f}, new float[]{23.0f, 35.0f, 45.0f}, new float[]{23.0f, 35.0f, 45.0f}};
        this.mapType = PottParameter.MAP_TYPE_WORLD;
        this.tmpTextureWidth = 0;
        this.tmpTextureHeight = 0;
    }
}
