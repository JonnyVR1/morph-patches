package com.appsflyer.internal.platform_extension;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r"}, m88121d2 = {"Lcom/appsflyer/internal/platform_extension/PluginInfo;", "", "Lcom/appsflyer/internal/platform_extension/Plugin;", "plugin", "", WBConstants.AUTH_PARAMS_VERSION, "", "additionalParams", "<init>", "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/appsflyer/internal/platform_extension/Plugin;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", Constants.COPY_TYPE, "(Lcom/appsflyer/internal/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;)Lcom/appsflyer/internal/platform_extension/PluginInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getAdditionalParams", "Lcom/appsflyer/internal/platform_extension/Plugin;", "getPlugin", "Ljava/lang/String;", "getVersion"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final /* data */ class PluginInfo {

    @NotNull
    private final Map<String, String> additionalParams;

    @NotNull
    private final Plugin plugin;

    @NotNull
    private final String version;

    @JvmOverloads
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        plugin.getClass();
        str.getClass();
        map.getClass();
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((i & 2) != 0) {
            str = pluginInfo.version;
        }
        if ((i & 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Plugin getPlugin() {
        return this.plugin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.additionalParams;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String version, @NotNull Map<String, String> additionalParams) {
        plugin.getClass();
        version.getClass();
        additionalParams.getClass();
        return new PluginInfo(plugin, version, additionalParams);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) other;
        return this.plugin == pluginInfo.plugin && Intrinsics.m88377d(this.version, pluginInfo.version) && Intrinsics.m88377d(this.additionalParams, pluginInfo.additionalParams);
    }

    @JvmName
    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    @JvmName
    @NotNull
    public final Plugin getPlugin() {
        return this.plugin;
    }

    @JvmName
    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return (((this.plugin.hashCode() * 31) + this.version.hashCode()) * 31) + this.additionalParams.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.plugin);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", additionalParams=");
        sb.append(this.additionalParams);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        plugin.getClass();
        str.getClass();
    }
}
