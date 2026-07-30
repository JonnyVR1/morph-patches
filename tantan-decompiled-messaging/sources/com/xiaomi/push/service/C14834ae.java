package com.xiaomi.push.service;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.ugc.TXRecordCommon;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import p149l.dxq0;
import p149l.ilq0;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ae */
/* JADX INFO: loaded from: classes2.dex */
public class C14834ae {

    /* JADX INFO: renamed from: a */
    private static long f62841a = 0;

    /* JADX INFO: renamed from: a */
    private static boolean f62842a = false;

    /* JADX INFO: renamed from: b */
    private static long f62843b;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ae$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        int f62844a;

        /* JADX INFO: renamed from: a */
        byte[] f62845a;

        public a(byte[] bArr, int i) {
            this.f62845a = bArr;
            this.f62844a = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ae$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public long f62846a;

        /* JADX INFO: renamed from: a */
        public Bitmap f62847a;

        public b(Bitmap bitmap, long j) {
            this.f62847a = bitmap;
            this.f62846a = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v5 java.net.HttpURLConnection) = (r3v4 java.net.HttpURLConnection), (r3v6 java.net.HttpURLConnection) binds: [B:48:0x00d6, B:52:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static a m86417a(String str, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream = 0;
        autoCloseInputStream = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
                    httpURLConnection.setReadTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0 (Linux; U;) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser");
                    httpURLConnection.connect();
                    int contentLength = httpURLConnection.getContentLength();
                    if (!z || contentLength <= 102400) {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                int i = z ? 102400 : 2048000;
                                byte[] bArr = new byte[1024];
                                while (i > 0) {
                                    int i2 = inputStream.read(bArr, 0, 1024);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    i -= i2;
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                                if (i <= 0) {
                                    ilq0.m137040m("length 102400 exhausted.");
                                    a aVar = new a(null, ShareConstants.MD5_FILE_BUF_LENGTH);
                                    dxq0.m114018b(inputStream);
                                    httpURLConnection.disconnect();
                                    return aVar;
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                a aVar2 = new a(byteArray, byteArray.length);
                                dxq0.m114018b(inputStream);
                                httpURLConnection.disconnect();
                                return aVar2;
                            } catch (SocketTimeoutException unused) {
                                ilq0.m137025B("Connect timeout to " + str);
                                dxq0.m114018b(inputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            } catch (IOException e) {
                                e = e;
                                ilq0.m137044q(e);
                                dxq0.m114018b(inputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            }
                        }
                        ilq0.m137040m("Invalid Http Response Code " + responseCode + " received");
                    } else {
                        ilq0.m137040m("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + vlq0.m198840c(str, 3));
                    }
                    dxq0.m114018b(null);
                    httpURLConnection.disconnect();
                    return null;
                } catch (SocketTimeoutException unused2) {
                    inputStream = null;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    dxq0.m114018b(autoCloseInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                autoCloseInputStream = "Invalid Http Response Code ";
            }
        } catch (SocketTimeoutException unused3) {
            inputStream = null;
            httpURLConnection = null;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized void m86424b(Context context) {
        if (f62842a) {
            return;
        }
        f62841a = 0L;
        f62843b = 0L;
        try {
            File file = new File(m86419a(context));
            if (!file.exists()) {
                f62842a = true;
                ilq0.m137050w("Init pic cache finish.");
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    f62841a += file2.length();
                    long j = f62843b;
                    if (j <= 0) {
                        f62843b = file2.lastModified();
                    } else {
                        f62843b = Math.min(j, file2.lastModified());
                    }
                }
            }
            f62842a = true;
        } catch (Throwable th) {
            try {
                ilq0.m137025B("Init pic cache error: " + th);
                f62842a = true;
            } catch (Throwable th2) {
                f62842a = true;
                ilq0.m137050w("Init pic cache finish.");
                throw th2;
            }
        }
        ilq0.m137050w("Init pic cache finish.");
    }

    /* JADX INFO: renamed from: b */
    private static synchronized Bitmap m86423b(Context context, String str) {
        Bitmap bitmap;
        FileInputStream fileInputStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            File file = new File(m86419a(context), vlq0.m198839b(str));
            if (!file.exists()) {
                dxq0.m114018b(null);
                return null;
            }
            if (System.currentTimeMillis() - file.lastModified() > 1209600000) {
                ilq0.m137040m("The pic cache has expired.");
                dxq0.m114018b(null);
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2);
                file.setLastModified(System.currentTimeMillis());
                dxq0.m114018b(fileInputStream2);
            } catch (Throwable th) {
                Bitmap bitmap2 = bitmapDecodeStream;
                fileInputStream = fileInputStream2;
                th = th;
                bitmap = bitmap2;
                try {
                    ilq0.m137025B("Load bmp from cache error: " + th);
                    dxq0.m114018b(fileInputStream);
                    bitmapDecodeStream = bitmap;
                } catch (Throwable th2) {
                    dxq0.m114018b(fileInputStream);
                    throw th2;
                }
            }
            return bitmapDecodeStream;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m86418a(Context context, String str, boolean z) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        try {
            try {
                Bitmap bitmapM86423b = m86423b(context, str);
                if (bitmapM86423b != null) {
                    bVar.f62847a = bitmapM86423b;
                    dxq0.m114018b(null);
                    return bVar;
                }
                a aVarM86417a = m86417a(str, z);
                if (aVarM86417a == null) {
                    dxq0.m114018b(null);
                    return bVar;
                }
                bVar.f62846a = aVarM86417a.f62844a;
                byte[] bArr = aVarM86417a.f62845a;
                if (bArr != null) {
                    if (z) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int iM86415a = m86415a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = iM86415a;
                            bVar.f62847a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            ilq0.m137044q(e);
                            dxq0.m114018b(byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            dxq0.m114018b(byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f62847a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                m86421a(context, aVarM86417a.f62845a, str);
                dxq0.m114018b(byteArrayInputStream);
                return bVar;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX INFO: renamed from: a */
    public static Bitmap m86416a(Context context, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        Uri uri = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    int iM86415a = m86415a(context, inputStreamOpenInputStream);
                    inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = iM86415a;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        dxq0.m114018b(inputStreamOpenInputStream2);
                        dxq0.m114018b(inputStreamOpenInputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e) {
                        e = e;
                        ilq0.m137044q(e);
                        dxq0.m114018b(inputStreamOpenInputStream2);
                        dxq0.m114018b(inputStreamOpenInputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamOpenInputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    dxq0.m114018b(r0);
                    dxq0.m114018b(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpenInputStream2 = null;
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m86415a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            int iRound = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
            int i2 = options.outWidth;
            if (i2 <= iRound || (i = options.outHeight) <= iRound) {
                return 1;
            }
            return Math.min(i2 / iRound, i / iRound);
        }
        ilq0.m137040m("decode dimension failed for bitmap.");
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m86421a(Context context, byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            ilq0.m137040m("cannot save small icon cause bitmap is null");
            return;
        }
        m86420a(context);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(m86419a(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, vlq0.m198839b(str));
            if (!file2.exists()) {
                file2.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.flush();
                        f62841a += file2.length();
                        long j = f62843b;
                        if (j <= 0) {
                            f62843b = file2.lastModified();
                        } else {
                            f62843b = Math.min(j, file2.lastModified());
                        }
                        dxq0.m114018b(bufferedOutputStream2);
                        dxq0.m114018b(fileOutputStream);
                    } catch (Exception e) {
                        e = e;
                        bufferedOutputStream = bufferedOutputStream2;
                        ilq0.m137025B("Save pic error: " + e);
                        dxq0.m114018b(bufferedOutputStream);
                        dxq0.m114018b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        dxq0.m114018b(bufferedOutputStream);
                        dxq0.m114018b(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m86420a(Context context) {
        long jLastModified;
        m86424b(context);
        if (f62841a < 62914560 && System.currentTimeMillis() - f62843b < 1209600000) {
            return;
        }
        try {
            File file = new File(m86419a(context));
            if (!file.exists()) {
                ilq0.m137040m("The pic cache dir do not exists.");
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                m86422a(fileArrListFiles);
                long length = f62841a;
                int length2 = fileArrListFiles.length - 1;
                while (true) {
                    if (length2 < 0) {
                        jLastModified = 0;
                        break;
                    }
                    File file2 = fileArrListFiles[length2];
                    if (file2 != null) {
                        if (length <= 31457280 && System.currentTimeMillis() - file2.lastModified() <= 864000000) {
                            jLastModified = file2.lastModified();
                            break;
                        }
                        length -= file2.length();
                        file2.delete();
                    }
                    length2--;
                }
                f62841a = Math.max(length, 0L);
                f62843b = jLastModified;
            } else {
                ilq0.m137040m("The pic cache file list is null.");
            }
        } catch (Throwable th) {
            ilq0.m137025B("Clear pic cache error: " + th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86422a(File[] fileArr) {
        if (fileArr != null) {
            try {
                if (fileArr.length > 1) {
                    Arrays.sort(fileArr, new Comparator<File>() { // from class: com.xiaomi.push.service.ae.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            if (file == file2) {
                                return 0;
                            }
                            if (file == null) {
                                return 1;
                            }
                            if (file2 == null) {
                                return -1;
                            }
                            long jLastModified = file.lastModified() - file2.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? 1 : -1;
                        }
                    });
                }
            } catch (Throwable th) {
                ilq0.m137025B("Sort pic cache error: " + th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m86419a(Context context) {
        return context.getCacheDir().getPath() + File.separator + "mipush_icon";
    }
}
