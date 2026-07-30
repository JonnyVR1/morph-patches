package com.tencent.p101mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14340b {

    /* JADX INFO: renamed from: a */
    public static Context f60123a;

    /* JADX INFO: renamed from: b */
    private static final int f60124b;

    /* JADX INFO: renamed from: c */
    private static final int f60125c;

    /* JADX INFO: renamed from: d */
    private static final int f60126d;

    /* JADX INFO: renamed from: e */
    public static ThreadPoolExecutor f60127e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f60124b = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f60125c = i;
        int i2 = (iAvailableProcessors * 2) + 1;
        f60126d = i2;
        f60127e = new ThreadPoolExecutor(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    /* JADX INFO: renamed from: a */
    public static int m84179a(ContentResolver contentResolver, Uri uri) {
        Log.m84176i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m84178w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
                return iAvailable;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            Log.m84178w("MicroMsg.SDK.Util", "getFileSize fail, " + e.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84183b(String str) {
        return str == null || str.length() <= 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m84180a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f60123a != null && str.startsWith("content")) {
            try {
                return m84179a(f60123a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m84181a(String str, int i) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84182a(int i) {
        return i == 36 || i == 46;
    }
}
