package p149l;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class r6w0 {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static final r6w0 f157985b = new r6w0();

    /* JADX INFO: renamed from: a */
    public Context f157986a;

    /* JADX INFO: renamed from: b */
    public static r6w0 m178099b() {
        return f157985b;
    }

    /* JADX INFO: renamed from: a */
    public final Context m178100a() {
        return this.f157986a;
    }

    /* JADX INFO: renamed from: c */
    public final void m178101c(Context context) {
        this.f157986a = context != null ? context.getApplicationContext() : null;
    }
}
