package com.momo.xeengine.gift;

import android.content.Context;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface GiftSDKPreferences {
    @NotNull
    static GiftSDKPreferences getInstance() {
        return GiftSDKPreferencesImpl.Holder.instance;
    }

    IResourceDownloader getDownloader();

    void init(Context context);

    void setDownloader(@NotNull IResourceDownloader iResourceDownloader);
}
