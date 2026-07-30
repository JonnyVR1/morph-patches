package p149l;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class qlh0 {

    /* JADX INFO: renamed from: a */
    public static final String f155229a;

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f155230b;

    /* JADX INFO: renamed from: l.qlh0$a */
    public static /* synthetic */ class C19535a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155231a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f155231a = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155231a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        File fileM179378v = rhi.m179378v();
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("tantan");
        sb.append(str);
        sb.append("camera");
        f155229a = new File(fileM179378v, sb.toString()).getAbsolutePath();
        f155230b = new SimpleDateFormat("yyyyMMdd_HHmmss");
    }

    /* JADX INFO: renamed from: a */
    public static void m175482a() {
        File file = new File(f155229a + File.separator + "temp");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m175483b(Bitmap.CompressFormat compressFormat) {
        int i = C19535a.f155231a[compressFormat.ordinal()];
        if (i != 1) {
            return i != 2 ? ".jpg" : ".webp";
        }
        return ".png";
    }

    /* JADX INFO: renamed from: c */
    public static String m175484c(int i) {
        if (i != 1) {
            return i != 3 ? ".mp4" : ".amr";
        }
        return ".3gp";
    }

    /* JADX INFO: renamed from: d */
    public static String m175485d(@Nullable String str, Bitmap.CompressFormat compressFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append(f155229a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("image");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f155230b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m175483b(compressFormat);
    }

    /* JADX INFO: renamed from: e */
    public static String m175486e(@Nullable String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(f155229a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("video");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f155230b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m175484c(i);
    }

    /* JADX INFO: renamed from: f */
    public static String m175487f() {
        StringBuilder sb = new StringBuilder();
        sb.append(f155229a);
        String str = File.separator;
        sb.append(str);
        sb.append("temp");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + str + f155230b.format(new Date());
    }
}
