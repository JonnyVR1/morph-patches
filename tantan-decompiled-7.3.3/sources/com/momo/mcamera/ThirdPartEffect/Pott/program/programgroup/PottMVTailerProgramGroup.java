package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import android.graphics.Bitmap;
import com.cosmos.mdlog.MDLog;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieBitmapGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import com.momo.mcamera.util.MDLogTag;
import p153l.jv0;
import p153l.l26;

/* JADX INFO: loaded from: classes6.dex */
public class PottMVTailerProgramGroup extends EsTemplateProgramGroup {
    private Bitmap userHeadIconBitmap;
    private String userHeadIcondPath;
    private Bitmap userIdBitmap;
    private String userIdPath;
    private Bitmap userNickNameBitmap;
    private String userNickNamePath;

    public PottMVTailerProgramGroup() {
        super("/tailer/end");
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void destroy() {
        super.destroy();
        this.userHeadIcondPath = null;
        this.userNickNamePath = null;
        this.userIdPath = null;
        this.userIdBitmap = null;
        this.userHeadIconBitmap = null;
        this.userNickNameBitmap = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup, com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface
    public synchronized void drawGroup() {
        super.drawGroup();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public boolean onParseLayers(LottieConfig lottieConfig, Layers layers, AssetValue assetValue) {
        MMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo;
        String layerName = layers.getLayerName();
        if (layerName.equalsIgnoreCase("userhead")) {
            if (this.userHeadIconBitmap != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap = this.userHeadIconBitmap;
                lottieBitmapGeomeAttrInfo.setBitmapWithTarget(bitmap, bitmap.getWidth(), this.userHeadIconBitmap.getHeight());
                lottieMMFrameGeomeAttrInfo = lottieBitmapGeomeAttrInfo;
            } else {
                lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.userHeadIcondPath);
            }
        } else if (layerName.equalsIgnoreCase(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            if (this.userNickNameBitmap != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo2 = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap2 = this.userNickNameBitmap;
                lottieBitmapGeomeAttrInfo2.setBitmapWithTarget(bitmap2, bitmap2.getWidth(), this.userNickNameBitmap.getHeight());
                lottieBitmapGeomeAttrInfo2.setAdditionalOffset((-(assetValue.getWidth() - this.userNickNameBitmap.getWidth())) / 2);
                lottieMMFrameGeomeAttrInfo = lottieBitmapGeomeAttrInfo2;
            } else {
                lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.userNickNamePath);
            }
        } else if (!layerName.equalsIgnoreCase("id")) {
            boolean zEqualsIgnoreCase = layerName.equalsIgnoreCase("tailer_sticker");
            String str = this.baseFolder;
            if (zEqualsIgnoreCase) {
                MaskModel mask = MaskStore.getInstance().getMask(jv0.m147001a(), str + "/" + assetValue.getFolderPath());
                if (mask == null || mask.getStickers() == null || mask.getStickers().size() <= 0) {
                    MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse config error !! the param.txt of cover sticker is wrong !!");
                    recycleAllData();
                    return false;
                }
                lottieMMFrameGeomeAttrInfo = new StickerItemGeomeAttrInfo(mask.getStickers().get(0), l26.f129743a);
            } else {
                lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(str + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName());
            }
        } else if (this.userIdBitmap != null) {
            LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo3 = new LottieBitmapGeomeAttrInfo(null);
            Bitmap bitmap3 = this.userIdBitmap;
            lottieBitmapGeomeAttrInfo3.setBitmapWithTarget(bitmap3, bitmap3.getWidth(), this.userIdBitmap.getHeight());
            lottieBitmapGeomeAttrInfo3.setAdditionalOffset((-(assetValue.getWidth() - this.userIdBitmap.getWidth())) / 2);
            lottieMMFrameGeomeAttrInfo = lottieBitmapGeomeAttrInfo3;
        } else {
            lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.userIdPath);
        }
        if (lottieMMFrameGeomeAttrInfo instanceof LottieMMFrameGeomeAttrInfo) {
            LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo2 = (LottieMMFrameGeomeAttrInfo) lottieMMFrameGeomeAttrInfo;
            lottieMMFrameGeomeAttrInfo2.setLottieConfig(layers);
            lottieMMFrameGeomeAttrInfo2.setLoopLastFrame(true);
        }
        addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo);
        return true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public synchronized void resetStatus() {
        super.resetStatus();
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

    public PottMVTailerProgramGroup(String str) {
        super(str);
    }
}
