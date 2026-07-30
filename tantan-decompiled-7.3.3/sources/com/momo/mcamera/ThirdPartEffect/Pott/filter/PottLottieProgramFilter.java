package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.core.glcore.util.JsonUtil;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PottLottieProgramFilter extends PottMVFilter {
    LottieConfig lottieConfig;
    private String lottieJsonPath2 = "/sdcard/maskdir/fourth/";
    List<LottieMMFrameGeomeAttrInfo> geomeAttrInfos = new ArrayList();

    public PottLottieProgramFilter() {
        initAllInfo();
    }

    private void initAllInfo() {
        loadLottieFile(this.lottieJsonPath2 + "config.json");
        HashMap map = new HashMap();
        LottieConfig lottieConfig = this.lottieConfig;
        if (lottieConfig == null || lottieConfig.getLayers() == null || this.lottieConfig.getAssetValues() == null) {
            return;
        }
        for (AssetValue assetValue : this.lottieConfig.getAssetValues()) {
            map.put(assetValue.getImageId(), assetValue);
        }
        List<Layers> layers = this.lottieConfig.getLayers();
        layers.size();
        for (Layers layers2 : layers) {
            AssetValue assetValue2 = (AssetValue) map.get(layers2.getRefImageId());
            LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo = new LottieMMFrameGeomeAttrInfo(this.lottieJsonPath2 + "/" + assetValue2.getFolderPath() + "/" + assetValue2.getSourceName());
            lottieMMFrameGeomeAttrInfo.setLottieConfig(layers2);
            this.geomeAttrInfos.add(lottieMMFrameGeomeAttrInfo);
        }
    }

    private void loadLottieFile(String str) {
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(null, str);
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

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.lottieConfig = null;
        Iterator<LottieMMFrameGeomeAttrInfo> it = this.geomeAttrInfos.iterator();
        while (it.hasNext()) {
            it.next().recycleResourceInGlThread();
        }
        this.geomeAttrInfos.clear();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj
    public /* bridge */ /* synthetic */ void drawSub() {
        super.drawSub();
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        Iterator<LottieMMFrameGeomeAttrInfo> it = this.geomeAttrInfos.iterator();
        while (it.hasNext()) {
            it.next().setBaseRenderSize(getWidth(), getHeight());
        }
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        setBackgroundRed(1.0f);
        setBackgroundGreen(1.0f);
        setBackgroundBlue(1.0f);
        setBackgroundAlpha(1.0f);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public void onDrawPrograms() {
        if (this.geomeAttrInfos.size() == 0) {
            initAllInfo();
        }
        for (int size = this.geomeAttrInfos.size() - 1; size >= 0; size--) {
            LottieMMFrameGeomeAttrInfo lottieMMFrameGeomeAttrInfo = this.geomeAttrInfos.get(size);
            lottieMMFrameGeomeAttrInfo.setTimeStamp(this.curTimeStamp);
            drawTexture(this.normal, lottieMMFrameGeomeAttrInfo);
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
