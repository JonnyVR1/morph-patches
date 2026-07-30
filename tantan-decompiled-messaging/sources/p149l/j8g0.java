package p149l;

import android.content.Context;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class j8g0 extends heg0 {
    public j8g0(Context context) {
        super(context);
    }

    @Override // p149l.heg0, p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) {
        return new s9g0(null, Okio.source(this.f107371a.getContentResolver().openInputStream(dpg0Var.f87271a)), 2, new j6f(dpg0Var.f87271a.getPath()).getAttributeInt(j6f.TAG_ORIENTATION, 1));
    }

    @Override // p149l.heg0, p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        return "file".equals(dpg0Var.f87271a.getScheme());
    }
}
