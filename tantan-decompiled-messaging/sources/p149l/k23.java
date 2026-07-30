package p149l;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class k23 {

    /* JADX INFO: renamed from: l.k23$a */
    public static class C17913a {

        /* JADX INFO: renamed from: a */
        public int f120684a;

        /* JADX INFO: renamed from: b */
        public int f120685b;

        /* JADX INFO: renamed from: c */
        public int f120686c;

        /* JADX INFO: renamed from: d */
        public int f120687d;

        /* JADX INFO: renamed from: e */
        public int f120688e;

        /* JADX INFO: renamed from: a */
        public byte[] m144259a() {
            return ByteBuffer.allocate(20).putInt(this.f120684a).putInt(this.f120685b).putInt(this.f120686c).putInt(this.f120687d).putInt(this.f120688e).array();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m144256a(HashMap<String, String> map, String str) {
        String str2;
        if (map == null || map.size() <= 0 || str == null || str.length() <= 0 || !map.containsKey(str) || (str2 = map.get(str)) == null || str2.length() <= 0) {
            return 0;
        }
        return new Integer(str2).intValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m144257b(String str, Bitmap bitmap) throws Exception {
        m144258c(str, bitmap, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m144258c(String str, Bitmap bitmap, HashMap<String, String> map) throws Exception {
        if (str == null || bitmap == null) {
            jfd0.m141176a("Bitmap or path is null");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        C17913a c17913a = new C17913a();
        c17913a.f120684a = bitmap.getWidth();
        c17913a.f120685b = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        c17913a.f120686c = config == null ? -1 : config.ordinal();
        c17913a.f120687d = bitmap.getWidth() * bitmap.getHeight() * 4;
        int iM144256a = m144256a(map, j6f.TAG_PIXEL_X_DIMENSION);
        int iM144256a2 = m144256a(map, j6f.TAG_PIXEL_Y_DIMENSION);
        int iM144256a3 = m144256a(map, j6f.TAG_THUMBNAIL_IMAGE_WIDTH);
        int iM144256a4 = m144256a(map, j6f.TAG_THUMBNAIL_IMAGE_LENGTH);
        int iM144256a5 = m144256a(map, j6f.TAG_IMAGE_WIDTH);
        int iM144256a6 = m144256a(map, j6f.TAG_IMAGE_LENGTH);
        int i = c17913a.f120684a;
        if ((i != iM144256a5 || c17913a.f120685b != iM144256a6) && iM144256a6 > 0 && iM144256a5 > 0) {
            float f = iM144256a5;
            float f2 = (f * 1.0f) / iM144256a6;
            int i2 = c17913a.f120685b;
            float f3 = (i * 1.0f) / i2;
            float f4 = (iM144256a3 * 1.0f) / f;
            int i3 = (int) (i * f4);
            int i4 = (int) (i2 * f4);
            if (i3 > 0 && i4 > 0 && (iM144256a3 > i || iM144256a4 > i2 || f2 != f3)) {
                map.put(j6f.TAG_THUMBNAIL_IMAGE_WIDTH, String.valueOf(i3));
                map.put(j6f.TAG_THUMBNAIL_IMAGE_LENGTH, String.valueOf(i4));
            }
            map.put(j6f.TAG_IMAGE_WIDTH, String.valueOf(c17913a.f120684a));
            map.put(j6f.TAG_IMAGE_LENGTH, String.valueOf(c17913a.f120685b));
            if (iM144256a2 > 0 && iM144256a > 0) {
                map.put(j6f.TAG_PIXEL_X_DIMENSION, String.valueOf(c17913a.f120684a));
                map.put(j6f.TAG_PIXEL_Y_DIMENSION, String.valueOf(c17913a.f120685b));
            }
        }
        String strM194910d = (map == null || map.size() <= 0) ? null : upq.m194907b().m194910d(map);
        if (strM194910d != null) {
            c17913a.f120688e = strM194910d.getBytes().length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(c17913a.m144259a());
        byteBufferAllocate.position(0);
        fileOutputStream.write(byteBufferAllocate.array());
        if (strM194910d != null && strM194910d.length() > 0) {
            fileOutputStream.write(strM194910d.getBytes());
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
