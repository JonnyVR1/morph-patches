package com.momo.xeengine.gift;

import android.content.Context;
import com.momo.xeengine.XEnginePreferences;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class GiftSDKPreferencesImpl implements GiftSDKPreferences {
    private IResourceDownloader downloader;

    public static class Holder {
        static GiftSDKPreferences instance = new GiftSDKPreferencesImpl();
    }

    private GiftSDKPreferencesImpl() {
        this.downloader = null;
    }

    @Override // com.momo.xeengine.gift.GiftSDKPreferences
    public IResourceDownloader getDownloader() {
        return this.downloader;
    }

    @Override // com.momo.xeengine.gift.GiftSDKPreferences
    public void init(Context context) {
        XEnginePreferences.setApplicationContext(context);
        if (this.downloader == null) {
            this.downloader = new ResourceDownloaderImpl();
        }
    }

    @Override // com.momo.xeengine.gift.GiftSDKPreferences
    public void setDownloader(@NotNull IResourceDownloader iResourceDownloader) {
        if (iResourceDownloader != null) {
            this.downloader = iResourceDownloader;
        }
    }
}
