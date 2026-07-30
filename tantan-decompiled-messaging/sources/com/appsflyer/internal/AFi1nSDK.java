package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1nSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.15.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m87240a("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), TuplesKt.m87240a(WBConstants.AUTH_PARAMS_VERSION, this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            mapMutableMapOf.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return mapMutableMapOf;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMonetizationNetwork = pluginInfo;
    }
}
