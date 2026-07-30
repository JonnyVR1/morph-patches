package com.momo.xeengine.lightningrender;

import androidx.annotation.Keep;
import com.momo.xeengine.XEngineException;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.somanager.IXEngineSOLoader;
import com.momo.xeengine.somanager.XEngineSOManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class LightningRenderBuilder {
    private boolean useInnerProcessor = false;
    private String innerProcessorName = null;
    private String tag = "LightningRender";
    private final IXEngineSOLoader.LoaderCallback mSOLoadCallback = new IXEngineSOLoader.LoaderCallback() { // from class: com.momo.xeengine.lightningrender.LightningRenderBuilder.1
        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onFailed(String str) {
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onProcess(int i, double d) {
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onSuccess() {
        }
    };

    public ILightningRender build() throws XEngineException {
        XEngineSOManager.check(this.mSOLoadCallback);
        XEnginePreferences.checkEngineEnv();
        return new LightningRenderImpl(this.tag, this.useInnerProcessor, this.innerProcessorName);
    }

    @Deprecated
    public void setDelay(boolean z) {
    }

    public LightningRenderBuilder setInnerProcessorName(String str) {
        this.innerProcessorName = str;
        return this;
    }

    public LightningRenderBuilder setTag(String str) {
        this.tag = str;
        return this;
    }

    public LightningRenderBuilder setUseInnerProcessor(boolean z) {
        this.useInnerProcessor = z;
        return this;
    }
}
