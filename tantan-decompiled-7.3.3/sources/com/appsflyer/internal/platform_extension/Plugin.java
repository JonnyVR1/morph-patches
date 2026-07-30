package com.appsflyer.internal.platform_extension;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, m88121d2 = {"Lcom/appsflyer/internal/platform_extension/Plugin;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pluginName", "Ljava/lang/String;", "getPluginName", "()Ljava/lang/String;", "NATIVE", "UNITY", "FLUTTER", "REACT_NATIVE", "ADOBE_AIR", "ADOBE_MOBILE", "COCOS_2DX", "CORDOVA", "MPARTICLE", "NATIVE_SCRIPT", "EXPO", "UNREAL", "XAMARIN", "CAPACITOR", "SEGMENT"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public enum Plugin {
    NATIVE("android_native"),
    UNITY("android_unity"),
    FLUTTER("android_flutter"),
    REACT_NATIVE("android_react_native"),
    ADOBE_AIR("android_adobe_air"),
    ADOBE_MOBILE("android_adobe_mobile"),
    COCOS_2DX("android_cocos2dx"),
    CORDOVA("android_cordova"),
    MPARTICLE("android_mparticle"),
    NATIVE_SCRIPT("android_native_script"),
    EXPO("android_expo"),
    UNREAL("android_unreal"),
    XAMARIN("android_xamarin"),
    CAPACITOR("android_capacitor"),
    SEGMENT("android_segment");


    @NotNull
    private final String pluginName;

    Plugin(String str) {
        this.pluginName = str;
    }

    @JvmName
    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }
}
