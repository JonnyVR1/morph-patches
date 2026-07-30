package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class v23 {
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x000f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:16), block:B:8:0x000f */
    /* JADX INFO: renamed from: a */
    public static Bitmap m196705a(String str) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    qyl.m177042a(fileInputStream);
                    return bitmapDecodeStream;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    qyl.m177042a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                qyl.m177042a(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            qyl.m177042a(closeable2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX INFO: renamed from: b */
    public static Bitmap m196706b(String str) throws Throwable {
        Closeable closeable;
        Throwable th;
        InputStream inputStream;
        try {
            try {
                str = (HttpURLConnection) new URL(str).openConnection();
                try {
                    str.setDoInput(true);
                    str.connect();
                    inputStream = str.getInputStream();
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        str.disconnect();
                        qyl.m177042a(inputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (str != 0) {
                            str.disconnect();
                        }
                        qyl.m177042a(inputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th2) {
                    closeable = null;
                    th = th2;
                    if (str != 0) {
                        str.disconnect();
                    }
                    qyl.m177042a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            str = 0;
            inputStream = null;
        } catch (Throwable th4) {
            closeable = null;
            th = th4;
            str = 0;
        }
    }
}
