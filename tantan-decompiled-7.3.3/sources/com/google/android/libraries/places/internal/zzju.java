package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzju {
    @Nullable
    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return zzb(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    @Nullable
    private static String zzb(Signature signature) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return zzsi.zzi().zzk(bArrDigest, 0, bArrDigest.length);
        } catch (NoSuchAlgorithmException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }
}
