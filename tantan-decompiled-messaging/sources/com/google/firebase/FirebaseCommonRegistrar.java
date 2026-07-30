package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m16664a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m16665b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m16666c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m16667d(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return ChannelConstant.Action.AIDL_ACTION_WATCH;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create(FIREBASE_COMMON, BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext(TARGET_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: l.tli
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m16666c((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(MIN_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: l.uli
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m16665b((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_PLATFORM, new LibraryVersionComponent.VersionExtractor() { // from class: l.vli
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m16667d((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_INSTALLER, new LibraryVersionComponent.VersionExtractor() { // from class: l.wli
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m16664a((Context) obj);
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create(KOTLIN, strDetectVersion));
        }
        return arrayList;
    }
}
