package p153l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class iuq0 {

    /* JADX INFO: renamed from: a */
    private static DateFormat f116977a;

    /* JADX INFO: renamed from: a */
    public static DateFormat m142233a() {
        if (f116977a == null) {
            f116977a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f116977a;
    }
}
