package com.tencent.p106mm.opensdk.utils;

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
public final class C14503b {

    /* JADX INFO: renamed from: a */
    public static Context f60971a;

    /* JADX INFO: renamed from: b */
    private static final int f60972b;

    /* JADX INFO: renamed from: c */
    private static final int f60973c;

    /* JADX INFO: renamed from: d */
    private static final int f60974d;

    /* JADX INFO: renamed from: e */
    public static ThreadPoolExecutor f60975e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f60972b = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        f60973c = i;
        int i2 = (iAvailableProcessors * 2) + 1;
        f60974d = i2;
        f60975e = new ThreadPoolExecutor(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    /* JADX INFO: renamed from: a */
    public static int m85362a(ContentResolver contentResolver, Uri uri) {
        Log.m85359i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m85361w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
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
            Log.m85361w("MicroMsg.SDK.Util", "getFileSize fail, " + e.getMessage());
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
    public static boolean m85366b(String str) {
        return str == null || str.length() <= 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m85363a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f60971a != null && str.startsWith("content")) {
            try {
                return m85362a(f60971a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m85364a(String str, int i) {
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
    public static boolean m85365a(int i) {
        return i == 36 || i == 46;
    }
}
