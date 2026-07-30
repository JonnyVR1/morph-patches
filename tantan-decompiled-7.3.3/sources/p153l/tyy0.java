package p153l;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tyy0 extends txy0 {

    /* JADX INFO: renamed from: h */
    public final HashMap f176727h = new HashMap();

    /* JADX INFO: renamed from: i */
    @Nullable
    public Handler f176728i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public btx0 f176729j;

    /* JADX INFO: renamed from: A */
    public abstract void mo170185A(Object obj, mzy0 mzy0Var, d0u0 d0u0Var);

    /* JADX INFO: renamed from: B */
    public final void m193632B(final Object obj, mzy0 mzy0Var) {
        lev0.m153956d(!this.f176727h.containsKey(obj));
        lzy0 lzy0Var = new lzy0() { // from class: l.xxy0
            @Override // p153l.lzy0
            /* JADX INFO: renamed from: a */
            public final void mo149093a(mzy0 mzy0Var2, d0u0 d0u0Var) {
                this.f196706a.mo170185A(obj, mzy0Var2, d0u0Var);
            }
        };
        yxy0 yxy0Var = new yxy0(this, obj);
        this.f176727h.put(obj, new zxy0(mzy0Var, lzy0Var, yxy0Var));
        Handler handler = this.f176728i;
        handler.getClass();
        mzy0Var.mo160937f(handler, yxy0Var);
        Handler handler2 = this.f176728i;
        handler2.getClass();
        mzy0Var.mo160940j(handler2, yxy0Var);
        mzy0Var.mo160938g(lzy0Var, this.f176729j, m193543o());
        if (m193551z()) {
            return;
        }
        mzy0Var.mo160941l(lzy0Var);
    }

    /* JADX INFO: renamed from: C */
    public int mo179573C(Object obj, int i) {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public abstract kzy0 mo170186E(Object obj, kzy0 kzy0Var);

    @Override // p153l.mzy0
    @CallSuper
    /* JADX INFO: renamed from: G */
    public void mo128352G() throws IOException {
        Iterator it = this.f176727h.values().iterator();
        while (it.hasNext()) {
            ((zxy0) it.next()).f206531a.mo128352G();
        }
    }

    @Override // p153l.txy0
    @CallSuper
    /* JADX INFO: renamed from: t */
    public final void mo193548t() {
        for (zxy0 zxy0Var : this.f176727h.values()) {
            zxy0Var.f206531a.mo160941l(zxy0Var.f206532b);
        }
    }

    @Override // p153l.txy0
    @CallSuper
    /* JADX INFO: renamed from: u */
    public final void mo193549u() {
        for (zxy0 zxy0Var : this.f176727h.values()) {
            zxy0Var.f206531a.mo160942n(zxy0Var.f206532b);
        }
    }

    @Override // p153l.txy0
    @CallSuper
    /* JADX INFO: renamed from: v */
    public void mo128583v(@Nullable btx0 btx0Var) {
        this.f176729j = btx0Var;
        this.f176728i = mpw0.m159399L(null);
    }

    @Override // p153l.txy0
    @CallSuper
    /* JADX INFO: renamed from: x */
    public void mo128362x() {
        for (zxy0 zxy0Var : this.f176727h.values()) {
            zxy0Var.f206531a.mo160939h(zxy0Var.f206532b);
            zxy0Var.f206531a.mo160936e(zxy0Var.f206533c);
            zxy0Var.f206531a.mo160934a(zxy0Var.f206533c);
        }
        this.f176727h.clear();
    }

    /* JADX INFO: renamed from: D */
    public long mo179574D(Object obj, long j, @Nullable kzy0 kzy0Var) {
        return j;
    }
}
