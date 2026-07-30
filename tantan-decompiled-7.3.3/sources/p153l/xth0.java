package p153l;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class xth0 {

    /* JADX INFO: renamed from: a */
    public static final String f196214a;

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f196215b;

    /* JADX INFO: renamed from: l.xth0$a */
    public static /* synthetic */ class C21448a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f196216a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f196216a = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f196216a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        File fileM168034v = oki.m168034v();
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("tantan");
        sb.append(str);
        sb.append("camera");
        f196214a = new File(fileM168034v, sb.toString()).getAbsolutePath();
        f196215b = new SimpleDateFormat("yyyyMMdd_HHmmss");
    }

    /* JADX INFO: renamed from: a */
    public static void m213081a() {
        File file = new File(f196214a + File.separator + "temp");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m213082b(Bitmap.CompressFormat compressFormat) {
        int i = C21448a.f196216a[compressFormat.ordinal()];
        if (i != 1) {
            return i != 2 ? ".jpg" : ".webp";
        }
        return ".png";
    }

    /* JADX INFO: renamed from: c */
    public static String m213083c(int i) {
        if (i != 1) {
            return i != 3 ? ".mp4" : ".amr";
        }
        return ".3gp";
    }

    /* JADX INFO: renamed from: d */
    public static String m213084d(@Nullable String str, Bitmap.CompressFormat compressFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append(f196214a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("image");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f196215b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m213082b(compressFormat);
    }

    /* JADX INFO: renamed from: e */
    public static String m213085e(@Nullable String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(f196214a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("video");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            str = f196215b.format(new Date());
        }
        return file.getAbsolutePath() + str2 + str + m213083c(i);
    }

    /* JADX INFO: renamed from: f */
    public static String m213086f() {
        StringBuilder sb = new StringBuilder();
        sb.append(f196214a);
        String str = File.separator;
        sb.append(str);
        sb.append("temp");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + str + f196215b.format(new Date());
    }
}
