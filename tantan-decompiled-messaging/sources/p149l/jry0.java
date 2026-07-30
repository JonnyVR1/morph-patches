package p149l;

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
public final class jry0 extends npy0 {

    /* JADX INFO: renamed from: t */
    public static final nis0 f119456t;

    /* JADX INFO: renamed from: k */
    public final gqy0[] f119457k;

    /* JADX INFO: renamed from: l */
    public final xqt0[] f119458l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f119459m;

    /* JADX INFO: renamed from: n */
    public final Map f119460n;

    /* JADX INFO: renamed from: o */
    public final yiw0 f119461o;

    /* JADX INFO: renamed from: p */
    public int f119462p;

    /* JADX INFO: renamed from: q */
    public long[][] f119463q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public zzvg f119464r;

    /* JADX INFO: renamed from: s */
    public final ppy0 f119465s;

    static {
        for0 for0Var = new for0();
        for0Var.m122516a("MergingMediaSource");
        f119456t = for0Var.m122518c();
    }

    public jry0(boolean z, boolean z2, gqy0... gqy0VarArr) {
        ppy0 ppy0Var = new ppy0();
        this.f119457k = gqy0VarArr;
        this.f119465s = ppy0Var;
        this.f119459m = new ArrayList(Arrays.asList(gqy0VarArr));
        this.f119462p = -1;
        this.f119458l = new xqt0[gqy0VarArr.length];
        this.f119463q = new long[0][];
        this.f119460n = new HashMap();
        this.f119461o = hjw0.m131416a(8).m121637b(2).mo12533c();
    }

    @Override // p149l.npy0
    /* JADX INFO: renamed from: A */
    public final /* bridge */ /* synthetic */ void mo142978A(Object obj, gqy0 gqy0Var, xqt0 xqt0Var) {
        int iMo113617b;
        if (this.f119464r != null) {
            return;
        }
        if (this.f119462p == -1) {
            iMo113617b = xqt0Var.mo113617b();
            this.f119462p = iMo113617b;
        } else {
            int iMo113617b2 = xqt0Var.mo113617b();
            int i = this.f119462p;
            if (iMo113617b2 != i) {
                this.f119464r = new zzvg(0);
                return;
            }
            iMo113617b = i;
        }
        if (this.f119463q.length == 0) {
            this.f119463q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iMo113617b, this.f119458l.length);
        }
        this.f119459m.remove(gqy0Var);
        this.f119458l[((Integer) obj).intValue()] = xqt0Var;
        if (this.f119459m.isEmpty()) {
            m160438w(this.f119458l[0]);
        }
    }

    @Override // p149l.npy0
    @Nullable
    /* JADX INFO: renamed from: E */
    public final /* bridge */ /* synthetic */ eqy0 mo142979E(Object obj, eqy0 eqy0Var) {
        if (((Integer) obj).intValue() == 0) {
            return eqy0Var;
        }
        return null;
    }

    @Override // p149l.npy0, p149l.gqy0
    /* JADX INFO: renamed from: G */
    public final void mo98640G() throws IOException {
        zzvg zzvgVar = this.f119464r;
        if (zzvgVar != null) {
            throw zzvgVar;
        }
        super.mo98640G();
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: d */
    public final nis0 mo98642d() {
        gqy0[] gqy0VarArr = this.f119457k;
        return gqy0VarArr.length > 0 ? gqy0VarArr[0].mo98642d() : f119456t;
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: i */
    public final cqy0 mo98643i(eqy0 eqy0Var, wwy0 wwy0Var, long j) {
        xqt0[] xqt0VarArr = this.f119458l;
        int length = this.f119457k.length;
        cqy0[] cqy0VarArr = new cqy0[length];
        int iMo112550a = xqt0VarArr[0].mo112550a(eqy0Var.f92867a);
        for (int i = 0; i < length; i++) {
            cqy0VarArr[i] = this.f119457k[i].mo98643i(eqy0Var.m117806a(this.f119458l[i].mo112553f(iMo112550a)), wwy0Var, j - this.f119463q[iMo112550a][i]);
        }
        return new iry0(this.f119465s, this.f119463q[iMo112550a], cqy0VarArr);
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: k */
    public final void mo98644k(cqy0 cqy0Var) {
        iry0 iry0Var = (iry0) cqy0Var;
        int i = 0;
        while (true) {
            gqy0[] gqy0VarArr = this.f119457k;
            if (i >= gqy0VarArr.length) {
                return;
            }
            gqy0VarArr[i].mo98644k(iry0Var.m137934h(i));
            i++;
        }
    }

    @Override // p149l.noy0, p149l.gqy0
    /* JADX INFO: renamed from: m */
    public final void mo98645m(nis0 nis0Var) {
        this.f119457k[0].mo98645m(nis0Var);
    }

    @Override // p149l.npy0, p149l.noy0
    /* JADX INFO: renamed from: v */
    public final void mo98646v(@Nullable vjx0 vjx0Var) {
        super.mo98646v(vjx0Var);
        int i = 0;
        while (true) {
            gqy0[] gqy0VarArr = this.f119457k;
            if (i >= gqy0VarArr.length) {
                return;
            }
            m160551B(Integer.valueOf(i), gqy0VarArr[i]);
            i++;
        }
    }

    @Override // p149l.npy0, p149l.noy0
    /* JADX INFO: renamed from: x */
    public final void mo98647x() {
        super.mo98647x();
        Arrays.fill(this.f119458l, (Object) null);
        this.f119462p = -1;
        this.f119464r = null;
        this.f119459m.clear();
        Collections.addAll(this.f119459m, this.f119457k);
    }
}
