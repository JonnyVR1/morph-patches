package com.google.firebase.remoteconfig.ktx;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p149l.eri;
import p149l.jri;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Lcom/google/firebase/ktx/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "(Lcom/google/firebase/ktx/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", Constants.KEY_KEY, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "", "Lkotlin/ExtensionFunctionType;", "init", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "getRemoteConfig", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Ll/eri;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Ll/eri;", "getConfigUpdates$annotations", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "configUpdates", "com.google.firebase-firebase-config"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class RemoteConfigKt {
    @Deprecated
    @NotNull
    public static final FirebaseRemoteConfigValue get(@NotNull FirebaseRemoteConfig firebaseRemoteConfig, @NotNull String str) {
        firebaseRemoteConfig.getClass();
        str.getClass();
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        value.getClass();
        return value;
    }

    @NotNull
    public static final eri<ConfigUpdate> getConfigUpdates(@NotNull FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.getClass();
        return jri.m142946e(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    @Deprecated
    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    @NotNull
    public static final FirebaseRemoteConfig getRemoteConfig(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.getClass();
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfig remoteConfig(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        firebase.getClass();
        firebaseApp.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        firebaseRemoteConfig.getClass();
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfigSettings remoteConfigSettings(@NotNull Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> function1) {
        function1.getClass();
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        function1.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        firebaseRemoteConfigSettingsBuild.getClass();
        return firebaseRemoteConfigSettingsBuild;
    }
}
