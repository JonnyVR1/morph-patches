package com.appsflyer;

/* JADX INFO: loaded from: classes.dex */
public class AFVersionDeclaration {
    private static String googleSdkIdentifier;

    private AFVersionDeclaration() {
    }

    public static void init() {
        googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:6.15.0";
    }
}
