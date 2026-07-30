package p153l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class qki {

    /* JADX INFO: renamed from: a */
    private static final String[] f158140a = {"../", "~/"};

    /* JADX INFO: renamed from: a */
    public static boolean m176952a(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }
}
