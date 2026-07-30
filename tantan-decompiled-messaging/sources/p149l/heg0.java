package p149l;

import android.content.Context;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public class heg0 extends mpg0 {

    /* JADX INFO: renamed from: a */
    public final Context f107371a;

    public heg0(Context context) {
        this.f107371a = context;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: b */
    public s9g0 mo113471b(dpg0 dpg0Var, int i) {
        return new s9g0(Okio.source(this.f107371a.getContentResolver().openInputStream(dpg0Var.f87271a)), 2);
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: d */
    public boolean mo113472d(dpg0 dpg0Var) {
        return "content".equals(dpg0Var.f87271a.getScheme());
    }
}
