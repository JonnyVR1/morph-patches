package p153l;

import android.content.Context;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public class pmg0 extends uxg0 {

    /* JADX INFO: renamed from: a */
    public final Context f153183a;

    public pmg0(Context context) {
        this.f153183a = context;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: b */
    public aig0 mo118414b(lxg0 lxg0Var, int i) {
        return new aig0(Okio.source(this.f153183a.getContentResolver().openInputStream(lxg0Var.f133955a)), 2);
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: d */
    public boolean mo118415d(lxg0 lxg0Var) {
        return "content".equals(lxg0Var.f133955a.getScheme());
    }
}
