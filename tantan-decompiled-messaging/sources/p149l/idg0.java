package p149l;

import android.content.SharedPreferences;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class idg0 {

    /* JADX INFO: renamed from: b */
    public static idg0 f112552b;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f112553a = Utils.getApp().getSharedPreferences("sudmgp_local_file_encrypt_key", 0);

    /* JADX INFO: renamed from: a */
    public static idg0 m135446a() {
        if (f112552b == null) {
            synchronized (idg0.class) {
                try {
                    if (f112552b == null) {
                        f112552b = new idg0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112552b;
    }
}
