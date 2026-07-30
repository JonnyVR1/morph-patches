package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.agora.utils2.internal.CommonUtility;

/* JADX INFO: loaded from: classes2.dex */
public class MMKVContentProvider extends ContentProvider {
    protected static final String FUNCTION_NAME = "mmkvFromAshmemID";
    protected static final String KEY = "KEY";
    protected static final String KEY_CRYPT = "KEY_CRYPT";
    protected static final String KEY_MODE = "KEY_MODE";
    protected static final String KEY_SIZE = "KEY_SIZE";
    private static Uri gUri;

    @Nullable
    public static Uri contentUri(Context context) {
        String strQueryAuthority;
        Uri uri = gUri;
        if (uri != null) {
            return uri;
        }
        if (context == null || (strQueryAuthority = queryAuthority(context)) == null) {
            return null;
        }
        Uri uri2 = Uri.parse(CommonUtility.PREFIX_URI.concat(strQueryAuthority));
        gUri = uri2;
        return uri2;
    }

    public static String getProcessNameByPID(@NonNull Context context, int i) {
        if (i == Process.myPid()) {
            return MMKVProcessUtil.getCurrentProcessName(context);
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    @NonNull
    private Bundle mmkvFromAshmemID(String str, int i, int i2, String str2) throws RuntimeException {
        MMKV mmkvMmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), str, i, i2, str2);
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvMmkvWithAshmemID);
        mmkvMmkvWithAshmemID.ashmemFD();
        mmkvMmkvWithAshmemID.ashmemMetaFD();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY, parcelableMMKV);
        return bundle;
    }

    @Nullable
    private static String queryAuthority(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (str.equals(FUNCTION_NAME) && bundle != null) {
            try {
                return mmkvFromAshmemID(str2, bundle.getInt(KEY_SIZE), bundle.getInt(KEY_MODE), bundle.getString(KEY_CRYPT));
            } catch (Exception e) {
                Log.e("MMKV", e.getMessage());
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return getContext() != null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
