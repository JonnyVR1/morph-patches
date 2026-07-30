package p149l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class thi {

    /* JADX INFO: renamed from: a */
    private static final String[] f170251a = {"../", "~/"};

    /* JADX INFO: renamed from: a */
    public static boolean m188911a(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }
}
