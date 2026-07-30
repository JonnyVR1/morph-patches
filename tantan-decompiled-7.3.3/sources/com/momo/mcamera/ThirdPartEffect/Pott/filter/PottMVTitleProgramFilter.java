package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import com.core.glcore.util.JsonUtil;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerSlidingGeomAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.TextureLottieGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.MMFramRenderProgram;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.ScrollEffectProgram;
import com.momo.mcamera.mask.MaskModel;
import p153l.l26;
import p153l.lej;

/* JADX INFO: loaded from: classes6.dex */
public class PottMVTitleProgramFilter extends PottMVFilter {
    MMFrameGeomeAttrInfo countryGInfo;
    LottieMMFrameGeomeAttrInfo headIconGInfo;
    LottieMMFrameGeomeAttrInfo headTextGInfo;
    MaskModel model;
    TextureLottieGeomeAttrInfo nomralForCountry;
    MMFramRenderProgram normal;
    StickerSlidingGeomAttrInfo[] numbersInfo;
    ScrollEffectProgram scrollEffectProgram;
    StickerItemGeomeAttrInfo stickerItemGeomeAttrInfo;
    private String headPngPath = "/sdcard/maskdir/touxiang.png";
    private String headTextPngPath = "/sdcard/maskdir/touxiangwenzi.png";
    private String countryPngPath = "/sdcard/maskdir/guojiachengshi.png";
    private String lottieJsonPath = "/sdcard/maskdir/config.json";
    LottieConfig lottieConfig = null;

    private void initAllProgram() {
        float[][] fArr = {new float[]{12.0f, 20.0f, 30.0f}, new float[]{14.0f, 25.0f, 35.0f}, new float[]{20.0f, 31.0f, 43.0f}, new float[]{23.0f, 35.0f, 45.0f}};
        loadLottieFile();
        this.normal = new MMFramRenderProgram();
        this.scrollEffectProgram = new ScrollEffectProgram();
        this.headIconGInfo = new LottieMMFrameGeomeAttrInfo(this.headPngPath);
        this.headTextGInfo = new LottieMMFrameGeomeAttrInfo(this.headTextPngPath);
        this.countryGInfo = new MMFrameGeomeAttrInfo(this.countryPngPath);
        int i = 0;
        this.stickerItemGeomeAttrInfo = new StickerItemGeomeAttrInfo(this.model.getStickers().get(0), l26.f129743a);
        this.nomralForCountry = new TextureLottieGeomeAttrInfo();
        this.numbersInfo = new StickerSlidingGeomAttrInfo[4];
        while (i < 4) {
            int i2 = i + 1;
            this.numbersInfo[i] = new StickerSlidingGeomAttrInfo(this.model.getStickers().get(1), i2);
            this.numbersInfo[i].updateAnimationRange(fArr[i]);
            i = i2;
        }
    }

    private void loadLottieFile() {
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(null, this.lottieJsonPath);
        if (TextUtils.isEmpty(strJsonStringFromFile)) {
            return;
        }
        try {
            this.lottieConfig = (LottieConfig) JsonUtil.getInstance().fromJson(strJsonStringFromFile, LottieConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("zhangzhe", "get Json Cofnig is wrong !!");
        }
    }

    public void addMaskModel(MaskModel maskModel) {
        this.model = maskModel;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.model = null;
        MMFramRenderProgram mMFramRenderProgram = this.normal;
        if (mMFramRenderProgram != null) {
            mMFramRenderProgram.destroy();
            this.normal = null;
        }
        ScrollEffectProgram scrollEffectProgram = this.scrollEffectProgram;
        if (scrollEffectProgram != null) {
            scrollEffectProgram.destroy();
            this.scrollEffectProgram = null;
        }
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo = this.headIconGInfo;
        if (lottieMMFrameGeomeAttrInfo != null) {
            lottieMMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.headIconGInfo = null;
        }
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo2 = this.headTextGInfo;
        if (lottieMMFrameGeomeAttrInfo2 != null) {
            lottieMMFrameGeomeAttrInfo2.recycleResourceInGlThread();
            this.headTextGInfo = null;
        }
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.countryGInfo;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.countryGInfo = null;
        }
        StickerSlidingGeomAttrInfo[] stickerSlidingGeomAttrInfoArr = this.numbersInfo;
        if (stickerSlidingGeomAttrInfoArr != null) {
            for (StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo : stickerSlidingGeomAttrInfoArr) {
                stickerSlidingGeomAttrInfo.recycleResourceInGlThread();
            }
            this.numbersInfo = null;
        }
        TextureLottieGeomeAttrInfo textureLottieGeomeAttrInfo = this.nomralForCountry;
        if (textureLottieGeomeAttrInfo != null) {
            textureLottieGeomeAttrInfo.recycleResourceInGlThread();
            this.nomralForCountry = null;
        }
        StickerItemGeomeAttrInfo stickerItemGeomeAttrInfo = this.stickerItemGeomeAttrInfo;
        if (stickerItemGeomeAttrInfo != null) {
            stickerItemGeomeAttrInfo.recycleResourceInGlThread();
            this.stickerItemGeomeAttrInfo = null;
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj
    public /* bridge */ /* synthetic */ void drawSub() {
        super.drawSub();
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        this.headTextGInfo.setBaseRenderSize(getWidth(), getHeight());
        this.headIconGInfo.setBaseRenderSize(getWidth(), getHeight());
        this.stickerItemGeomeAttrInfo.setBaseRenderSize(getWidth(), getHeight());
        this.countryGInfo.setBaseRenderSize(getWidth(), getHeight());
        this.nomralForCountry.setBaseRenderSize(getWidth(), getHeight());
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        setBackgroundRed(1.0f);
        setBackgroundGreen(1.0f);
        setBackgroundBlue(1.0f);
        initAllProgram();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public void onDrawPrograms() {
        drawTexture(this.normal, this.stickerItemGeomeAttrInfo);
        this.headIconGInfo.setTimeStamp(this.curTimeStamp);
        this.headTextGInfo.setTimeStamp(this.curTimeStamp);
        drawTexture(this.normal, this.headIconGInfo);
        drawTexture(this.normal, this.headTextGInfo);
        this.nomralForCountry.setTimeStamp(this.curTimeStamp);
        if (this.nomralForCountry.getFrameTexture() != null && this.nomralForCountry.getAlphaValue() > 0.0f) {
            int frameWidth = this.numbersInfo[0].getFrameWidth();
            int frameHeight = this.numbersInfo[0].getFrameHeight();
            int frameWidth2 = this.countryGInfo.getFrameWidth() + (frameWidth * 2);
            float f = frameHeight;
            int frameHeight2 = (int) (this.countryGInfo.getFrameHeight() + (0.125f * f));
            lej lejVar = new lej(frameWidth2, frameHeight2);
            lejVar.m153895b(frameWidth2, frameHeight2);
            this.countryGInfo.setBaseRenderSize(frameWidth2, frameHeight2);
            for (StickerSlidingGeomAttrInfo stickerSlidingGeomAttrInfo : this.numbersInfo) {
                stickerSlidingGeomAttrInfo.setBaseRenderSize(frameWidth2, frameHeight2);
                stickerSlidingGeomAttrInfo.setTimeStamp(this.curTimeStamp);
                stickerSlidingGeomAttrInfo.setRotate(180.0f, 0.0f, 0.0f);
            }
            GLES20.glBindFramebuffer(36160, lejVar.m153901h()[0]);
            GLES20.glViewport(0, 0, frameWidth2, frameHeight2);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            this.countryGInfo.setRotate(180.0f, 0.0f, 0.0f);
            float f2 = frameWidth2;
            float f3 = frameHeight2;
            this.countryGInfo.setTraslate(((frameWidth2 - this.countryGInfo.getFrameWidth()) * 1.0f) / f2, -(((frameHeight2 - this.countryGInfo.getFrameHeight()) * 1.0f) / f3));
            drawTexture(this.normal, this.countryGInfo);
            float frameWidth3 = ((frameWidth2 - this.numbersInfo[0].getFrameWidth()) * 1.0f) / f2;
            float f4 = -((f3 - (this.numbersInfo[0].getFrameHeight() * 1.0f)) / f3);
            this.numbersInfo[0].setTraslate(-frameWidth3, f4);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[0].getVerticalRatio());
            drawTexture(this.scrollEffectProgram, this.numbersInfo[0]);
            float f5 = -((f2 - (frameWidth * 3.0f)) / f2);
            this.numbersInfo[1].setTraslate(f5, f4);
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[1].getVerticalRatio());
            drawTexture(this.scrollEffectProgram, this.numbersInfo[1]);
            this.numbersInfo[2].setTraslate(f5, -(((f3 - (f * 3.0f)) - (f / 3.0f)) / f3));
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[2].getVerticalRatio());
            drawTexture(this.scrollEffectProgram, this.numbersInfo[2]);
            this.numbersInfo[3].setTraslate(-(((frameWidth2 - frameWidth) * 1.0f) / f2), -(((f3 - (f * 1.0f)) / f3) * (-1.0f)));
            this.scrollEffectProgram.setTexturedVerticalOffset(this.numbersInfo[3].getVerticalRatio());
            drawTexture(this.scrollEffectProgram, this.numbersInfo[3]);
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            this.nomralForCountry.updateBitmapInfo(frameWidth2, frameHeight2);
            this.nomralForCountry.updateInputeTexture(new int[]{lejVar.m153902i()[0]});
            drawTexture(this.normal, this.nomralForCountry);
        }
        super.onDrawPrograms();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gam
    public /* bridge */ /* synthetic */ void setTimeStamp(long j) {
        super.setTimeStamp(j);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public /* bridge */ /* synthetic */ void setTotalFrameCount(long j) {
        super.setTotalFrameCount(j);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public /* bridge */ /* synthetic */ Bitmap snapPicture(int i, int i2) {
        return super.snapPicture(i, i2);
    }
}
