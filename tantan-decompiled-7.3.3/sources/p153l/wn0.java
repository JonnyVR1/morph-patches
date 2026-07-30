package p153l;

import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class wn0 {

    /* JADX INFO: renamed from: a */
    private static String f189844a;

    /* JADX INFO: renamed from: a */
    public static String m207136a() {
        String string = f189844a;
        if (string == null) {
            string = Settings.System.getString(eiw.m120945a().getContentResolver(), qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}));
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            f189844a = string;
        }
        return string;
    }
}
