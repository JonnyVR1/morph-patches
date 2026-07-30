package com.momo.xeengine.gift;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.momo.xeengine.XEnginePreferences;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes8.dex */
public final class GiftUtils {
    private static String extractFileExtension(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String path = new URL(str).getPath();
                int iLastIndexOf = path.lastIndexOf(46);
                if (iLastIndexOf != -1 && iLastIndexOf < path.length() - 1) {
                    return path.substring(iLastIndexOf + 1);
                }
            } catch (Exception unused) {
            }
        }
        return ShareConstants.RES_PATH;
    }

    public static boolean fileExitsAtCacheDir(String str) {
        try {
            return new File(getCacheDir() + "/" + str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getCacheDir() {
        File file = new File(XEnginePreferences.getContext().getCacheDir(), "XEGiftPlayer");
        if (!file.exists() && !file.mkdirs()) {
            Log.e("XEGiftUtils", "Failed to create cache directory");
        }
        return file.getAbsolutePath();
    }

    public static String getMD5FromString(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static String getResourceNameWithURL(String str) {
        return String.format("%s.%s", getMD5FromString(str), extractFileExtension(str));
    }

    public static String getResourcePathWithURL(String str) {
        return new File(getCacheDir(), getResourceNameWithURL(str)).getAbsolutePath();
    }

    public static Bitmap loadBitmapFromFile(String str) {
        try {
            return BitmapFactory.decodeFile(getCacheDir() + "/" + str);
        } catch (Exception e) {
            Log.e("BitmapLoader", "Error loading bitmap from file", e);
            return null;
        }
    }

    public static String readFileToString(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append(SignParameters.NEW_LINE);
                    return sb.toString();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }
}
