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
import p153l.bvq0;
import p153l.j6r0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ae */
/* JADX INFO: loaded from: classes2.dex */
public class C14982ae {

    /* JADX INFO: renamed from: a */
    private static long f63688a = 0;

    /* JADX INFO: renamed from: a */
    private static boolean f63689a = false;

    /* JADX INFO: renamed from: b */
    private static long f63690b;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ae$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        int f63691a;

        /* JADX INFO: renamed from: a */
        byte[] f63692a;

        public a(byte[] bArr, int i) {
            this.f63692a = bArr;
            this.f63691a = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ae$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public long f63693a;

        /* JADX INFO: renamed from: a */
        public Bitmap f63694a;

        public b(Bitmap bitmap, long j) {
            this.f63694a = bitmap;
            this.f63693a = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v5 java.net.HttpURLConnection) = (r3v4 java.net.HttpURLConnection), (r3v6 java.net.HttpURLConnection) binds: [B:48:0x00d6, B:52:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static a m87588a(String str, boolean z) throws Throwable {
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
                                    ouq0.m169393m("length 102400 exhausted.");
                                    a aVar = new a(null, ShareConstants.MD5_FILE_BUF_LENGTH);
                                    j6r0.m143691b(inputStream);
                                    httpURLConnection.disconnect();
                                    return aVar;
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                a aVar2 = new a(byteArray, byteArray.length);
                                j6r0.m143691b(inputStream);
                                httpURLConnection.disconnect();
                                return aVar2;
                            } catch (SocketTimeoutException unused) {
                                ouq0.m169378B("Connect timeout to " + str);
                                j6r0.m143691b(inputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            } catch (IOException e) {
                                e = e;
                                ouq0.m169397q(e);
                                j6r0.m143691b(inputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            }
                        }
                        ouq0.m169393m("Invalid Http Response Code " + responseCode + " received");
                    } else {
                        ouq0.m169393m("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + bvq0.m106589c(str, 3));
                    }
                    j6r0.m143691b(null);
                    httpURLConnection.disconnect();
                    return null;
                } catch (SocketTimeoutException unused2) {
                    inputStream = null;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    j6r0.m143691b(autoCloseInputStream);
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
    private static synchronized void m87595b(Context context) {
        try {
            if (f63689a) {
                return;
            }
            f63688a = 0L;
            f63690b = 0L;
            try {
                File file = new File(m87590a(context));
                if (!file.exists()) {
                    f63689a = true;
                    ouq0.m169403w("Init pic cache finish.");
                    return;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        f63688a += file2.length();
                        long j = f63690b;
                        if (j <= 0) {
                            f63690b = file2.lastModified();
                        } else {
                            f63690b = Math.min(j, file2.lastModified());
                        }
                    }
                }
                f63689a = true;
            } catch (Throwable th) {
                try {
                    ouq0.m169378B("Init pic cache error: " + th);
                    f63689a = true;
                } catch (Throwable th2) {
                    f63689a = true;
                    ouq0.m169403w("Init pic cache finish.");
                    throw th2;
                }
            }
            ouq0.m169403w("Init pic cache finish.");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized Bitmap m87594b(Context context, String str) {
        Bitmap bitmap;
        FileInputStream fileInputStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            File file = new File(m87590a(context), bvq0.m106588b(str));
            if (!file.exists()) {
                j6r0.m143691b(null);
                return null;
            }
            if (System.currentTimeMillis() - file.lastModified() > 1209600000) {
                ouq0.m169393m("The pic cache has expired.");
                j6r0.m143691b(null);
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2);
                file.setLastModified(System.currentTimeMillis());
                j6r0.m143691b(fileInputStream2);
            } catch (Throwable th) {
                Bitmap bitmap2 = bitmapDecodeStream;
                fileInputStream = fileInputStream2;
                th = th;
                bitmap = bitmap2;
                try {
                    ouq0.m169378B("Load bmp from cache error: " + th);
                    j6r0.m143691b(fileInputStream);
                    bitmapDecodeStream = bitmap;
                } catch (Throwable th2) {
                    j6r0.m143691b(fileInputStream);
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
    public static b m87589a(Context context, String str, boolean z) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        try {
            try {
                Bitmap bitmapM87594b = m87594b(context, str);
                if (bitmapM87594b != null) {
                    bVar.f63694a = bitmapM87594b;
                    j6r0.m143691b(null);
                    return bVar;
                }
                a aVarM87588a = m87588a(str, z);
                if (aVarM87588a == null) {
                    j6r0.m143691b(null);
                    return bVar;
                }
                bVar.f63693a = aVarM87588a.f63691a;
                byte[] bArr = aVarM87588a.f63692a;
                if (bArr != null) {
                    if (z) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int iM87586a = m87586a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = iM87586a;
                            bVar.f63694a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            ouq0.m169397q(e);
                            j6r0.m143691b(byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            j6r0.m143691b(byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f63694a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                m87592a(context, aVarM87588a.f63692a, str);
                j6r0.m143691b(byteArrayInputStream);
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
    public static Bitmap m87587a(Context context, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        Uri uri = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    int iM87586a = m87586a(context, inputStreamOpenInputStream);
                    inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = iM87586a;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        j6r0.m143691b(inputStreamOpenInputStream2);
                        j6r0.m143691b(inputStreamOpenInputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e) {
                        e = e;
                        ouq0.m169397q(e);
                        j6r0.m143691b(inputStreamOpenInputStream2);
                        j6r0.m143691b(inputStreamOpenInputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamOpenInputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    j6r0.m143691b(r0);
                    j6r0.m143691b(inputStreamOpenInputStream);
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
    private static int m87586a(Context context, InputStream inputStream) {
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
        ouq0.m169393m("decode dimension failed for bitmap.");
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m87592a(Context context, byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            ouq0.m169393m("cannot save small icon cause bitmap is null");
            return;
        }
        m87591a(context);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(m87590a(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, bvq0.m106588b(str));
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
                        f63688a += file2.length();
                        long j = f63690b;
                        if (j <= 0) {
                            f63690b = file2.lastModified();
                        } else {
                            f63690b = Math.min(j, file2.lastModified());
                        }
                        j6r0.m143691b(bufferedOutputStream2);
                        j6r0.m143691b(fileOutputStream);
                    } catch (Exception e) {
                        e = e;
                        bufferedOutputStream = bufferedOutputStream2;
                        ouq0.m169378B("Save pic error: " + e);
                        j6r0.m143691b(bufferedOutputStream);
                        j6r0.m143691b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        j6r0.m143691b(bufferedOutputStream);
                        j6r0.m143691b(fileOutputStream);
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
    private static synchronized void m87591a(Context context) {
        long jLastModified;
        m87595b(context);
        if (f63688a < 62914560 && System.currentTimeMillis() - f63690b < 1209600000) {
            return;
        }
        try {
            File file = new File(m87590a(context));
            if (!file.exists()) {
                ouq0.m169393m("The pic cache dir do not exists.");
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                m87593a(fileArrListFiles);
                long length = f63688a;
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
                f63688a = Math.max(length, 0L);
                f63690b = jLastModified;
            } else {
                ouq0.m169393m("The pic cache file list is null.");
            }
        } catch (Throwable th) {
            ouq0.m169378B("Clear pic cache error: " + th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87593a(File[] fileArr) {
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
                ouq0.m169378B("Sort pic cache error: " + th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m87590a(Context context) {
        return context.getCacheDir().getPath() + File.separator + "mipush_icon";
    }
}
