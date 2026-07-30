package p153l;

import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class mgt0 extends aas0 {

    /* JADX INFO: renamed from: c */
    public final bft0 f136781c;

    /* JADX INFO: renamed from: d */
    public final ugt0 f136782d;

    /* JADX INFO: renamed from: e */
    public final String f136783e;

    /* JADX INFO: renamed from: f */
    public final String[] f136784f;

    public mgt0(bft0 bft0Var, ugt0 ugt0Var, String str, String[] strArr) {
        this.f136781c = bft0Var;
        this.f136782d = ugt0Var;
        this.f136783e = str;
        this.f136784f = strArr;
        bxy0.m106915A().m163008c(this);
    }

    @Override // p153l.aas0
    /* JADX INFO: renamed from: a */
    public final void mo96666a() {
        try {
            this.f136782d.mo163241v(this.f136783e, this.f136784f);
        } finally {
            C2098b.f9751l.post(new lgt0(this));
        }
    }

    @Override // p153l.aas0
    /* JADX INFO: renamed from: b */
    public final hpr mo96667b() {
        return (((Boolean) jas0.m144075c().m176505a(sgs0.f168181W1)).booleanValue() && (this.f136782d instanceof nht0)) ? oct0.f146737e.mo155969R(new Callable() { // from class: l.kgt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f126648a.m158378d();
            }
        }) : super.mo96667b();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Boolean m158378d() throws Exception {
        return Boolean.valueOf(this.f136782d.mo163242w(this.f136783e, this.f136784f, this));
    }

    /* JADX INFO: renamed from: e */
    public final String m158379e() {
        return this.f136783e;
    }
}
