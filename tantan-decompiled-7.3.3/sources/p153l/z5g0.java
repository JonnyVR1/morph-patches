package p153l;

import android.os.Environment;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class z5g0 {

    /* JADX INFO: renamed from: a */
    private static Boolean f203035a = Boolean.TRUE;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static File m218659a() {
        return f203035a.booleanValue() ? Environment.getExternalStorageDirectory() : kv0.m151647a().getExternalFilesDir("MOMOCARD");
    }

    /* JADX INFO: renamed from: b */
    public static String m218660b() {
        return m218659a().getAbsolutePath();
    }
}
