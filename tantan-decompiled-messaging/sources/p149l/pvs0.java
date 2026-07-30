package p149l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class pvs0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f151502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rvs0 f151503b;

    public pvs0(rvs0 rvs0Var, Context context) {
        this.f151502a = context;
        this.f151503b = rvs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        ovs0 ovs0VarM161759a;
        qvs0 qvs0Var = (qvs0) this.f151503b.f161270a.get(this.f151502a);
        if (qvs0Var != null) {
            if (qvs0Var.f156624a + ((Long) i9s0.f112254a.m115379e()).longValue() < vny0.m199064b().currentTimeMillis()) {
                ovs0VarM161759a = new nvs0(this.f151502a).m161759a();
            } else {
                ovs0VarM161759a = new nvs0(this.f151502a, qvs0Var.f156625b).m161759a();
            }
        } else {
            ovs0VarM161759a = new nvs0(this.f151502a).m161759a();
        }
        rvs0 rvs0Var = this.f151503b;
        rvs0Var.f161270a.put(this.f151502a, new qvs0(rvs0Var, ovs0VarM161759a));
        return ovs0VarM161759a;
    }
}
