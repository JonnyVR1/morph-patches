package p153l;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class xfw0 {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static final xfw0 f194114b = new xfw0();

    /* JADX INFO: renamed from: a */
    public Context f194115a;

    /* JADX INFO: renamed from: b */
    public static xfw0 m210858b() {
        return f194114b;
    }

    /* JADX INFO: renamed from: a */
    public final Context m210859a() {
        return this.f194115a;
    }

    /* JADX INFO: renamed from: c */
    public final void m210860c(Context context) {
        this.f194115a = context != null ? context.getApplicationContext() : null;
    }
}
