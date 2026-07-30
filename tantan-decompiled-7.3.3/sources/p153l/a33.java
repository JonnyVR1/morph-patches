package p153l;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a33 {

    /* JADX INFO: renamed from: l.a33$a */
    public static class C15630a {

        /* JADX INFO: renamed from: a */
        public int f68264a;

        /* JADX INFO: renamed from: b */
        public int f68265b;

        /* JADX INFO: renamed from: c */
        public int f68266c;

        /* JADX INFO: renamed from: d */
        public int f68267d;

        /* JADX INFO: renamed from: e */
        public int f68268e;

        /* JADX INFO: renamed from: a */
        public byte[] m95768a() {
            return ByteBuffer.allocate(20).putInt(this.f68264a).putInt(this.f68265b).putInt(this.f68266c).putInt(this.f68267d).putInt(this.f68268e).array();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m95765a(HashMap<String, String> map, String str) {
        String str2;
        if (map == null || map.size() <= 0 || str == null || str.length() <= 0 || !map.containsKey(str) || (str2 = map.get(str)) == null || str2.length() <= 0) {
            return 0;
        }
        return new Integer(str2).intValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m95766b(String str, Bitmap bitmap) throws Exception {
        m95767c(str, bitmap, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m95767c(String str, Bitmap bitmap, HashMap<String, String> map) throws Exception {
        if (str == null || bitmap == null) {
            mnd0.m159157a("Bitmap or path is null");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        C15630a c15630a = new C15630a();
        c15630a.f68264a = bitmap.getWidth();
        c15630a.f68265b = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        c15630a.f68266c = config == null ? -1 : config.ordinal();
        c15630a.f68267d = bitmap.getWidth() * bitmap.getHeight() * 4;
        int iM95765a = m95765a(map, p7f.TAG_PIXEL_X_DIMENSION);
        int iM95765a2 = m95765a(map, p7f.TAG_PIXEL_Y_DIMENSION);
        int iM95765a3 = m95765a(map, p7f.TAG_THUMBNAIL_IMAGE_WIDTH);
        int iM95765a4 = m95765a(map, p7f.TAG_THUMBNAIL_IMAGE_LENGTH);
        int iM95765a5 = m95765a(map, p7f.TAG_IMAGE_WIDTH);
        int iM95765a6 = m95765a(map, p7f.TAG_IMAGE_LENGTH);
        int i = c15630a.f68264a;
        if ((i != iM95765a5 || c15630a.f68265b != iM95765a6) && iM95765a6 > 0 && iM95765a5 > 0) {
            float f = iM95765a5;
            float f2 = (f * 1.0f) / iM95765a6;
            int i2 = c15630a.f68265b;
            float f3 = (i * 1.0f) / i2;
            float f4 = (iM95765a3 * 1.0f) / f;
            int i3 = (int) (i * f4);
            int i4 = (int) (i2 * f4);
            if (i3 > 0 && i4 > 0 && (iM95765a3 > i || iM95765a4 > i2 || f2 != f3)) {
                map.put(p7f.TAG_THUMBNAIL_IMAGE_WIDTH, String.valueOf(i3));
                map.put(p7f.TAG_THUMBNAIL_IMAGE_LENGTH, String.valueOf(i4));
            }
            map.put(p7f.TAG_IMAGE_WIDTH, String.valueOf(c15630a.f68264a));
            map.put(p7f.TAG_IMAGE_LENGTH, String.valueOf(c15630a.f68265b));
            if (iM95765a2 > 0 && iM95765a > 0) {
                map.put(p7f.TAG_PIXEL_X_DIMENSION, String.valueOf(c15630a.f68264a));
                map.put(p7f.TAG_PIXEL_Y_DIMENSION, String.valueOf(c15630a.f68265b));
            }
        }
        String strM202517d = (map == null || map.size() <= 0) ? null : vrq.m202514b().m202517d(map);
        if (strM202517d != null) {
            c15630a.f68268e = strM202517d.getBytes().length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(c15630a.m95768a());
        byteBufferAllocate.position(0);
        fileOutputStream.write(byteBufferAllocate.array());
        if (strM202517d != null && strM202517d.length() > 0) {
            fileOutputStream.write(strM202517d.getBytes());
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
