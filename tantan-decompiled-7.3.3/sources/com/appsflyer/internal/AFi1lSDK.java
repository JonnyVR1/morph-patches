package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1lSDK {
    @NotNull
    Map<String, Object> getMonetizationNetwork();

    void getRevenue(@NotNull PluginInfo pluginInfo);
}
