package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import p153l.dct0;
import p153l.mws0;
import p153l.wtq0;
import p153l.yzv;

/* JADX INFO: loaded from: classes6.dex */
public final class zzek extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            dct0.m115296e("Failed to load metadata: Package name not found.", e);
        } catch (NullPointerException e2) {
            dct0.m115296e("Failed to load metadata: Null pointer exception.", e2);
        }
        mws0 mws0VarM160595a = mws0.m160595a();
        if (bundle == null) {
            dct0.m115295d("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str != null) {
                            if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                wtq0.m207906a("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                                return;
                            }
                            dct0.m115293b("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                            if (bool == null || !bool.booleanValue()) {
                                mws0VarM160595a.m160596b(context, str);
                            }
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                wtq0.m207906a("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                                return;
                            }
                            dct0.m115293b("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                        }
                    } catch (ClassCastException e3) {
                        yzv.m218057a("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e3);
                        return;
                    }
                } catch (ClassCastException e4) {
                    yzv.m218057a("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e4);
                    return;
                }
            } catch (ClassCastException e5) {
                yzv.m218057a("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e5);
                return;
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z) {
                dct0.m115293b("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z2) {
                dct0.m115293b("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
