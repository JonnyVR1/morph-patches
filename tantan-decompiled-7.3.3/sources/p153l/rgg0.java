package p153l;

import android.content.Context;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class rgg0 extends pmg0 {
    public rgg0(Context context) {
        super(context);
    }

    @Override // p153l.pmg0, p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) {
        return new aig0(null, Okio.source(this.f153183a.getContentResolver().openInputStream(lxg0Var.f133955a)), 2, new p7f(lxg0Var.f133955a.getPath()).getAttributeInt(p7f.TAG_ORIENTATION, 1));
    }

    @Override // p153l.pmg0, p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        return "file".equals(lxg0Var.f133955a.getScheme());
    }
}
