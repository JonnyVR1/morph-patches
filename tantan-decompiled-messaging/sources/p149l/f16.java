package p149l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public class f16 {

    /* JADX INFO: renamed from: a */
    public static boolean f94044a = false;

    /* JADX INFO: renamed from: b */
    public static Application f94045b;

    /* JADX INFO: renamed from: a */
    public static Application m119092a() {
        if (f94044a) {
            return f94045b;
        }
        upk0.m194883a("you should call init first!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m119093b(Context context) {
        if (context instanceof Application) {
            f94045b = (Application) context;
        } else {
            f94045b = (Application) context.getApplicationContext();
        }
        f94044a = true;
    }
}
