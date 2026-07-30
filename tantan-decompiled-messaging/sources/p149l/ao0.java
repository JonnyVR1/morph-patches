package p149l;

import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ao0 {

    /* JADX INFO: renamed from: a */
    private static String f70780a;

    /* JADX INFO: renamed from: a */
    public static String m97838a() {
        String string = f70780a;
        if (string == null) {
            string = Settings.System.getString(ggw.m126041a().getContentResolver(), rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}));
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            f70780a = string;
        }
        return string;
    }
}
