package p153l;

import android.os.Environment;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class a6g0 {

    /* JADX INFO: renamed from: a */
    private static Boolean f68728a = Boolean.TRUE;

    @Nullable
    @RequiresApi(api = 8)
    /* JADX INFO: renamed from: a */
    public static File m96326a() {
        return f68728a.booleanValue() ? Environment.getExternalStorageDirectory() : jv0.m147001a().getExternalFilesDir("MOMOCARD");
    }

    @RequiresApi(api = 8)
    /* JADX INFO: renamed from: b */
    public static String m96327b() {
        return m96326a().getAbsolutePath();
    }
}
