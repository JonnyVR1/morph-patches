package p149l;

import android.os.Environment;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class rxf0 {

    /* JADX INFO: renamed from: a */
    private static Boolean f161449a = Boolean.TRUE;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static File m181556a() {
        return f161449a.booleanValue() ? Environment.getExternalStorageDirectory() : dv0.m113757a().getExternalFilesDir("MOMOCARD");
    }

    /* JADX INFO: renamed from: b */
    public static String m181557b() {
        return m181556a().getAbsolutePath();
    }
}
