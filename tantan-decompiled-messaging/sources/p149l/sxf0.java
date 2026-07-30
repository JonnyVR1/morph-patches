package p149l;

import android.os.Environment;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class sxf0 {

    /* JADX INFO: renamed from: a */
    private static Boolean f166790a = Boolean.TRUE;

    @Nullable
    @RequiresApi(api = 8)
    /* JADX INFO: renamed from: a */
    public static File m186401a() {
        return f166790a.booleanValue() ? Environment.getExternalStorageDirectory() : ev0.m118233a().getExternalFilesDir("MOMOCARD");
    }

    @RequiresApi(api = 8)
    /* JADX INFO: renamed from: b */
    public static String m186402b() {
        return m186401a().getAbsolutePath();
    }
}
