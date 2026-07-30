package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import android.graphics.Bitmap;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieBitmapGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;

/* JADX INFO: loaded from: classes6.dex */
public class PottMVTemplateProgramGroup extends EsTemplateProgramGroup {
    String localBitmapPath;
    private String useLocationPath;
    private Bitmap userLocationBmp;

    public PottMVTemplateProgramGroup() {
        super("/template");
        this.localBitmapPath = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public void destroy() {
        super.destroy();
        this.userLocationBmp = null;
        this.useLocationPath = null;
        this.localBitmapPath = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup
    public boolean onParseLayers(LottieConfig lottieConfig, Layers layers, AssetValue assetValue) {
        LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo;
        String layerName = layers.getLayerName();
        if (layerName.equalsIgnoreCase("diming")) {
            if (this.userLocationBmp != null) {
                LottieBitmapGeomeAttrInfo lottieBitmapGeomeAttrInfo = new LottieBitmapGeomeAttrInfo(null);
                Bitmap bitmap = this.userLocationBmp;
                lottieBitmapGeomeAttrInfo.setBitmapWithTarget(bitmap, bitmap.getWidth(), this.userLocationBmp.getHeight());
                lottieMMFrameGeomeAttrInfo = lottieBitmapGeomeAttrInfo;
            } else {
                lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.useLocationPath);
            }
        } else if (layerName.equalsIgnoreCase("userimage")) {
            lottieMMFrameGeomeAttrInfo = new LottieBitmapGeomeAttrInfo(this.localBitmapPath);
        } else {
            lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.baseFolder + "/" + assetValue.getFolderPath() + "/" + assetValue.getSourceName());
        }
        lottieMMFrameGeomeAttrInfo.setTargetWidthAndHeight(assetValue.getWidth(), assetValue.getHeight());
        lottieMMFrameGeomeAttrInfo.setLottieConfig(layers);
        addRunerTask(this.normal, lottieMMFrameGeomeAttrInfo);
        return true;
    }

    public void setLocalBitmapPath(String str) {
        this.localBitmapPath = str;
    }

    public void setUseLocationPath(String str) {
        this.useLocationPath = str;
    }

    public void setUserLocationBmp(Bitmap bitmap) {
        this.userLocationBmp = bitmap;
    }
}
