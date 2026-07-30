package p149l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class clq0 {

    /* JADX INFO: renamed from: a */
    private static DateFormat f81458a;

    /* JADX INFO: renamed from: a */
    public static DateFormat m107577a() {
        if (f81458a == null) {
            f81458a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f81458a;
    }
}
