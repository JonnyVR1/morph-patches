package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    @Nullable
    @KeepForSdk
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestZza;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestZza = zza("SHA1")) == null) {
            return null;
        }
        return messageDigestZza.digest(packageInfo.signatures[0].toByteArray());
    }

    @Nullable
    public static MessageDigest zza(@NonNull String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
