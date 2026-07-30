package p006l;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qlh0 {

    /* JADX INFO: renamed from: a */
    public static final String f19900a;

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f19901b;

    /* JADX INFO: renamed from: l.qlh0$a */
    public static /* synthetic */ class C1179a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19902a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f19902a = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19902a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        File fileV = rhi.v();
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("tantan");
        sb.append(str);
        sb.append("camera");
        f19900a = new File(fileV, sb.toString()).getAbsolutePath();
        f19901b = new SimpleDateFormat("yyyyMMdd_HHmmss");
    }

    /* JADX INFO: renamed from: a */
    public static void m22285a() {
        File file = new File(f19900a + File.separator + "temp");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22286b(Bitmap.CompressFormat compressFormat) {
        int i = C1179a.f19902a[compressFormat.ordinal()];
        if (i != 1) {
            return i != 2 ? ".jpg" : ".webp";
        }
        return ".png";
    }

    /* JADX INFO: renamed from: c */
    public static String m22287c(int i) {
        if (i != 1) {
            return i != 3 ? ".mp4" : ".amr";
        }
        return ".3gp";
    }

    /* JADX INFO: renamed from: d */
    public static String m22288d(@Nullable String str, Bitmap.CompressFormat compressFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append(f19900a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("image");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f19901b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m22286b(compressFormat);
    }

    /* JADX INFO: renamed from: e */
    public static String m22289e(@Nullable String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(f19900a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("video");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f19901b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m22287c(i);
    }

    /* JADX INFO: renamed from: f */
    public static String m22290f() {
        StringBuilder sb = new StringBuilder();
        sb.append(f19900a);
        String str = File.separator;
        sb.append(str);
        sb.append("temp");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + str + f19901b.format(new Date());
    }
}
