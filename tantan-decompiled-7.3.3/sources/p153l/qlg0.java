package p153l;

import android.content.SharedPreferences;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class qlg0 {

    /* JADX INFO: renamed from: b */
    public static qlg0 f158228b;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f158229a = Utils.getApp().getSharedPreferences("sudmgp_local_file_encrypt_key", 0);

    /* JADX INFO: renamed from: a */
    public static qlg0 m177003a() {
        if (f158228b == null) {
            synchronized (qlg0.class) {
                try {
                    if (f158228b == null) {
                        f158228b = new qlg0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f158228b;
    }
}
