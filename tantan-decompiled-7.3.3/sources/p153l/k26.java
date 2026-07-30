package p153l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class k26 {

    /* JADX INFO: renamed from: a */
    public static boolean f123575a = false;

    /* JADX INFO: renamed from: b */
    public static Application f123576b;

    /* JADX INFO: renamed from: a */
    public static Application m147943a() {
        if (f123575a) {
            return f123576b;
        }
        azk0.m101074a("you should call init first!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m147944b(Context context) {
        if (context instanceof Application) {
            f123576b = (Application) context;
        } else {
            f123576b = (Application) context.getApplicationContext();
        }
        f123575a = true;
    }
}
