package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzvg;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class p0z0 extends tyy0 {

    /* JADX INFO: renamed from: t */
    public static final trs0 f150115t;

    /* JADX INFO: renamed from: k */
    public final mzy0[] f150116k;

    /* JADX INFO: renamed from: l */
    public final d0u0[] f150117l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f150118m;

    /* JADX INFO: renamed from: n */
    public final Map f150119n;

    /* JADX INFO: renamed from: o */
    public final esw0 f150120o;

    /* JADX INFO: renamed from: p */
    public int f150121p;

    /* JADX INFO: renamed from: q */
    public long[][] f150122q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public zzvg f150123r;

    /* JADX INFO: renamed from: s */
    public final vyy0 f150124s;

    static {
        lxr0 lxr0Var = new lxr0();
        lxr0Var.m156235a("MergingMediaSource");
        f150115t = lxr0Var.m156237c();
    }

    public p0z0(boolean z, boolean z2, mzy0... mzy0VarArr) {
        vyy0 vyy0Var = new vyy0();
        this.f150116k = mzy0VarArr;
        this.f150124s = vyy0Var;
        this.f150118m = new ArrayList(Arrays.asList(mzy0VarArr));
        this.f150121p = -1;
        this.f150117l = new d0u0[mzy0VarArr.length];
        this.f150122q = new long[0][];
        this.f150119n = new HashMap();
        this.f150120o = nsw0.m164646a(8).m155735b(2).mo12587c();
    }

    @Override // p153l.tyy0
    /* JADX INFO: renamed from: A */
    public final /* bridge */ /* synthetic */ void mo170185A(Object obj, mzy0 mzy0Var, d0u0 d0u0Var) {
        int iMo113458b;
        if (this.f150123r != null) {
            return;
        }
        if (this.f150121p == -1) {
            iMo113458b = d0u0Var.mo113458b();
            this.f150121p = iMo113458b;
        } else {
            int iMo113458b2 = d0u0Var.mo113458b();
            int i = this.f150121p;
            if (iMo113458b2 != i) {
                this.f150123r = new zzvg(0);
                return;
            }
            iMo113458b = i;
        }
        if (this.f150122q.length == 0) {
            this.f150122q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iMo113458b, this.f150117l.length);
        }
        this.f150118m.remove(mzy0Var);
        this.f150117l[((Integer) obj).intValue()] = d0u0Var;
        if (this.f150118m.isEmpty()) {
            m193550w(this.f150117l[0]);
        }
    }

    @Override // p153l.tyy0
    @Nullable
    /* JADX INFO: renamed from: E */
    public final /* bridge */ /* synthetic */ kzy0 mo170186E(Object obj, kzy0 kzy0Var) {
        if (((Integer) obj).intValue() == 0) {
            return kzy0Var;
        }
        return null;
    }

    @Override // p153l.tyy0, p153l.mzy0
    /* JADX INFO: renamed from: G */
    public final void mo128352G() throws IOException {
        zzvg zzvgVar = this.f150123r;
        if (zzvgVar != null) {
            throw zzvgVar;
        }
        super.mo128352G();
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: d */
    public final trs0 mo128582d() {
        mzy0[] mzy0VarArr = this.f150116k;
        return mzy0VarArr.length > 0 ? mzy0VarArr[0].mo128582d() : f150115t;
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: i */
    public final izy0 mo128359i(kzy0 kzy0Var, c6z0 c6z0Var, long j) {
        d0u0[] d0u0VarArr = this.f150117l;
        int length = this.f150116k.length;
        izy0[] izy0VarArr = new izy0[length];
        int iMo113457a = d0u0VarArr[0].mo113457a(kzy0Var.f129476a);
        for (int i = 0; i < length; i++) {
            izy0VarArr[i] = this.f150116k[i].mo128359i(kzy0Var.m152239a(this.f150117l[i].mo113460f(iMo113457a)), c6z0Var, j - this.f150122q[iMo113457a][i]);
        }
        return new o0z0(this.f150124s, this.f150122q[iMo113457a], izy0VarArr);
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: k */
    public final void mo128360k(izy0 izy0Var) {
        o0z0 o0z0Var = (o0z0) izy0Var;
        int i = 0;
        while (true) {
            mzy0[] mzy0VarArr = this.f150116k;
            if (i >= mzy0VarArr.length) {
                return;
            }
            mzy0VarArr[i].mo128360k(o0z0Var.m165568h(i));
            i++;
        }
    }

    @Override // p153l.txy0, p153l.mzy0
    /* JADX INFO: renamed from: m */
    public final void mo128361m(trs0 trs0Var) {
        this.f150116k[0].mo128361m(trs0Var);
    }

    @Override // p153l.tyy0, p153l.txy0
    /* JADX INFO: renamed from: v */
    public final void mo128583v(@Nullable btx0 btx0Var) {
        super.mo128583v(btx0Var);
        int i = 0;
        while (true) {
            mzy0[] mzy0VarArr = this.f150116k;
            if (i >= mzy0VarArr.length) {
                return;
            }
            m193632B(Integer.valueOf(i), mzy0VarArr[i]);
            i++;
        }
    }

    @Override // p153l.tyy0, p153l.txy0
    /* JADX INFO: renamed from: x */
    public final void mo128362x() {
        super.mo128362x();
        Arrays.fill(this.f150117l, (Object) null);
        this.f150121p = -1;
        this.f150123r = null;
        this.f150118m.clear();
        Collections.addAll(this.f150118m, this.f150116k);
    }
}
