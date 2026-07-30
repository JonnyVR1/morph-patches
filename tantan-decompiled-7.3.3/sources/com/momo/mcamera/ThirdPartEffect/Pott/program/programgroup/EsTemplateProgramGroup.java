package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.AssetValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.MMFramRenderProgram;
import com.momo.mcamera.util.JsonConfigParseHelpler;
import com.momo.mcamera.util.MDLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p153l.d33;
import p153l.gam;
import p153l.jk90;

/* JADX INFO: loaded from: classes6.dex */
public abstract class EsTemplateProgramGroup implements ProgramGroupRenderInterface, gam {
    private static final int ErrorCode = -1;
    public static final int RENDERING_READY = 0;
    public static final int RENDER_END = 3;
    public static final int RENDER_RUNNING = 1;
    public static final int RENDER_TAIL = 2;
    jk90 errorListener;
    MMFramRenderProgram normal;
    int renderHeight;
    int renderWidth;
    String templateFolder;
    List<RenderRunner> renderRunners = new ArrayList();
    long curTimeStamp = 0;
    long firstRenderTime = -1;
    public long templateTotalTimeInMs = 50000;
    public long templateTailerTimeInMs = Constants.ONE_MIN_IN_MILLIS;
    boolean initialized = false;
    int rendingStatus = 0;
    LottieConfig lottieConfig = null;
    protected String baseFolder = "";

    public EsTemplateProgramGroup(String str) {
        this.templateFolder = str;
    }

    private void updateRunningStatus(long j) {
        if (j >= 0 && j <= this.templateTailerTimeInMs) {
            this.rendingStatus = 1;
            return;
        }
        if (j > this.templateTailerTimeInMs && j <= this.templateTotalTimeInMs) {
            this.rendingStatus = 2;
        } else if (j > this.templateTotalTimeInMs) {
            this.rendingStatus = 3;
        }
    }

    public void addRunerTask(d33 d33Var, MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo) {
        this.renderRunners.add(new RenderRunner(mMFrameGeomeAttrInfo, d33Var));
    }

    public void destroy() {
        recycleAllData();
        MMFramRenderProgram mMFramRenderProgram = this.normal;
        if (mMFramRenderProgram != null) {
            mMFramRenderProgram.destroy();
            this.normal = null;
        }
        this.rendingStatus = 0;
        Iterator<RenderRunner> it = this.renderRunners.iterator();
        while (it.hasNext()) {
            it.next().recycleData();
        }
        this.renderRunners.clear();
        this.baseFolder = null;
        this.templateFolder = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface
    public synchronized void drawGroup() {
        if (!this.initialized) {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Current render group is not initilaized !! Error !!");
            return;
        }
        if (this.firstRenderTime < 0) {
            this.firstRenderTime = this.curTimeStamp;
        }
        updateRunningStatus(this.curTimeStamp - this.firstRenderTime);
        if (this.rendingStatus == 3) {
            return;
        }
        for (int size = this.renderRunners.size() - 1; size >= 0; size--) {
            this.renderRunners.get(size).renderRunning(this.curTimeStamp);
        }
    }

    public long getFadeOutDurationInMs() {
        return this.templateTotalTimeInMs - this.templateTailerTimeInMs;
    }

    public int getRendingStatus() {
        return this.rendingStatus;
    }

    public boolean initAllInfo() {
        if (!initProgram()) {
            MDLog.m7445e(MDLogTag.FILTER_TAG, "Init all program error !!");
            return false;
        }
        if (parseConfig()) {
            return true;
        }
        MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse config  error !!");
        return false;
    }

    public boolean initProgram() {
        this.normal = new MMFramRenderProgram();
        return true;
    }

    public abstract boolean onParseLayers(LottieConfig lottieConfig, Layers layers, AssetValue assetValue);

    public boolean parseConfig() {
        if (this.baseFolder == null || this.initialized) {
            return this.initialized;
        }
        LottieConfig lottieConfigLoadLottieFile = JsonConfigParseHelpler.loadLottieFile(this.baseFolder + "/config.json");
        this.lottieConfig = lottieConfigLoadLottieFile;
        if (lottieConfigLoadLottieFile == null || lottieConfigLoadLottieFile.getAssetValues() == null || this.lottieConfig.getLayers() == null) {
            MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse config error !");
            recycleAllData();
            return false;
        }
        HashMap map = new HashMap();
        for (AssetValue assetValue : this.lottieConfig.getAssetValues()) {
            map.put(assetValue.getImageId(), assetValue);
        }
        for (Layers layers : this.lottieConfig.getLayers()) {
            layers.getLayerName();
            if (!onParseLayers(this.lottieConfig, layers, (AssetValue) map.get(layers.getRefImageId()))) {
                MDLog.m7445e(MDLogTag.FILTER_TAG, "Parse lottie layers failed !! return !");
                recycleAllData();
                return false;
            }
        }
        this.initialized = true;
        return true;
    }

    public void recycleAllData() {
    }

    public void recycleImageBuffers() {
        Iterator<RenderRunner> it = this.renderRunners.iterator();
        while (it.hasNext()) {
            it.next().info.recycleImageBuffers();
        }
    }

    public synchronized void resetStatus() {
        this.rendingStatus = 0;
        this.curTimeStamp = 0L;
        this.firstRenderTime = -1L;
        Iterator<RenderRunner> it = this.renderRunners.iterator();
        while (it.hasNext()) {
            it.next().info.resetStatus();
        }
    }

    public void setBaseFolder(String str) {
        this.baseFolder = str;
    }

    public void setTemplateTailerTimeInMs(long j) {
        this.templateTailerTimeInMs = j;
    }

    public void setTemplateTotalTimeInMs(long j) {
        this.templateTotalTimeInMs = j;
    }

    @Override // p153l.gam
    public synchronized void setTimeStamp(long j) {
        this.curTimeStamp = j;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.config.ProgramGroupRenderInterface
    public void updateRenderSize(int i, int i2) {
        this.renderWidth = i;
        this.renderHeight = i2;
        for (int size = this.renderRunners.size() - 1; size >= 0; size--) {
            this.renderRunners.get(size).updateRnederSize(i, i2);
        }
    }

    public void setErrorListener(jk90 jk90Var) {
    }
}
