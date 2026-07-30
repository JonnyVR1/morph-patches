package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.view.View;
import com.google.common.collect.Lists;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.vwb;
import p002l.eqq;
import p002l.hjc0;
import p002l.jjc0;
import p002l.xmr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0004b extends AbstractC0003a implements ChoreographerFrameCallbackC0007e.a {

    /* JADX INFO: renamed from: t */
    public ChoreographerFrameCallbackC0007e f55t;

    /* JADX INFO: renamed from: u */
    public ChoreographerFrameCallbackC0007e.a f56u;

    public AbstractC0004b() {
        ChoreographerFrameCallbackC0007e choreographerFrameCallbackC0007e = new ChoreographerFrameCallbackC0007e();
        this.f55t = choreographerFrameCallbackC0007e;
        choreographerFrameCallbackC0007e.m144h(this);
    }

    /* JADX INFO: renamed from: x0 */
    private void m105x0() {
        if (this.f44i.isEmpty()) {
            m130e();
            return;
        }
        List<hjc0> list = this.f44i;
        hjc0 hjc0Var = list.get(list.size() - 1);
        int i = hjc0Var.f12070a + hjc0Var.f12072c + this.f52q;
        if (this.f46k.getRenderContentHeight() - i != 0) {
            m107B0(this.f46k.getRenderContentHeight() - i);
        } else {
            m130e();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m106A0(ChoreographerFrameCallbackC0007e.a aVar) {
        this.f56u = this.f46k;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000e A[PHI: r1
      0x000e: PHI (r1v4 int) = (r1v1 int), (r1v2 int) binds: [B:3:0x000c, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B0 */
    public void m107B0(int i) {
        int iAbs = (int) (Math.abs(i) / 1.7f);
        int i2 = 350;
        if (iAbs < 350) {
            iAbs = i2;
        } else {
            i2 = 800;
            if (iAbs > 800) {
                iAbs = i2;
            }
        }
        m108C0(i, 2, iAbs);
    }

    /* JADX INFO: renamed from: C0 */
    public void m108C0(int i, int i2, long j) {
        this.f55t.m147k(i, i2).m145i(j).m148l();
    }

    /* JADX INFO: renamed from: D0 */
    public void m109D0() {
        if (this.f55t.m142f()) {
            this.f55t.m138b();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: a */
    public void mo42a() {
        if (NullChecker.a(this.f56u)) {
            this.f56u.mo42a();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: b */
    public void mo43b(boolean z) {
        xmr.m26035b("lllll", "onAnimScrollEnd 剩余任务数：" + m135l() + " : " + z);
        if (NullChecker.a(this.f56u)) {
            this.f56u.mo43b(z);
        }
        m130e();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: c */
    public void mo44c(int i, float f, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        if (NullChecker.a(this.f56u)) {
            i4 = i2;
            i5 = i3;
            z2 = z;
            this.f56u.mo44c(i, f, i4, i5, z2);
        } else {
            i4 = i2;
            i5 = i3;
            z2 = z;
        }
        if (z2 || !m124w0(i4, i5)) {
            return;
        }
        this.f55t.m138b();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.ChoreographerFrameCallbackC0007e.a
    /* JADX INFO: renamed from: f */
    public void mo110f() {
        if (NullChecker.a(this.f56u)) {
            this.f56u.mo110f();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a, com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d
    /* JADX INFO: renamed from: j */
    public void mo93j(AbstractC0005c abstractC0005c) {
        if (abstractC0005c instanceof AbstractC0005c.c) {
            if (this.f43h.mo11202m() <= 0) {
                m130e();
                return;
            }
            m114m0(((AbstractC0005c.c) abstractC0005c).f58a);
        } else if (abstractC0005c == AbstractRunnableC0006d.f61g) {
            xmr.m26035b("lllll", "执行滚动到底部的逻辑");
            m102y();
            m105x0();
            return;
        }
        super.mo93j(abstractC0005c);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m111j0(boolean z, hjc0 hjc0Var, boolean z2, boolean z3, int i, List<hjc0> list) {
        if (vwb.J(list)) {
            return 0;
        }
        hjc0 hjc0Var2 = list.get(0);
        List<hjc0> listQ = Lists.q(list);
        if (z) {
            int i2 = hjc0Var.f12070a;
            for (hjc0 hjc0Var3 : listQ) {
                hjc0Var3.f12070a = i2 - hjc0Var3.f12072c;
                this.f44i.add(0, hjc0Var3);
                i2 = hjc0Var3.f12070a;
            }
        } else {
            int i3 = hjc0Var.f12070a + hjc0Var.f12072c;
            for (hjc0 hjc0Var4 : listQ) {
                this.f44i.add(hjc0Var4);
                hjc0Var4.f12070a = i3;
                i3 += hjc0Var4.f12072c;
            }
        }
        if (z2) {
            return z3 ? -(hjc0Var2.f12070a + this.f52q) : (-(hjc0Var2.f12070a + this.f52q)) - hjc0Var2.f12072c;
        }
        return z3 ? (-(hjc0Var2.f12070a + this.f52q)) + i : ((-(hjc0Var2.f12070a + this.f52q)) - hjc0Var2.f12072c) + i;
    }

    /* JADX INFO: renamed from: k0 */
    public void m112k0() {
        this.f55t.m138b();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m113l0(int i) {
        return i >= 0 && i < this.f43h.mo11202m() && this.f43h.mo11202m() > 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m114m0(eqq eqqVar) {
        if (eqqVar.f9942e > 0) {
            m115n0(eqqVar);
        } else {
            m109D0();
            m118q0(eqqVar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m115n0(eqq eqqVar) {
        int i = eqqVar.f9938a;
        if (i == 2) {
            m116o0(eqqVar);
            return;
        }
        if (i == 3) {
            m116o0(eqqVar);
        } else if (i == 1) {
            m116o0(eqqVar);
        } else if (i == 0) {
            m117p0(eqqVar);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m116o0(eqq eqqVar) {
        int i;
        int i2;
        boolean z;
        int iMo11202m = this.f43h.mo11202m();
        int i3 = m63E().f12075f;
        int i4 = m64F().f12075f;
        int i5 = eqqVar.f9938a;
        int i6 = 2;
        if (i5 == 2) {
            i = 0;
        } else {
            i = i5 == 3 ? iMo11202m - 1 : eqqVar.f9939b;
        }
        if (i < 0 || i >= iMo11202m) {
            m130e();
            return;
        }
        if (i >= i3 && i <= i4) {
            hjc0 hjc0VarM120s0 = m120s0(i);
            if (hjc0VarM120s0 == null) {
                m130e();
                return;
            }
            int i7 = hjc0VarM120s0.f12070a + this.f52q;
            if (!eqqVar.f9940c) {
                i7 += hjc0VarM120s0.f12072c;
            }
            m108C0((eqqVar.f9941d ? -i7 : this.f46k.getRenderContentHeight() - i7) + eqqVar.f9943f, eqqVar.f9944g ? 2 : 1, eqqVar.f9942e);
            return;
        }
        hjc0 hjc0VarM64F = m64F();
        if (i < i3) {
            hjc0VarM64F = m63E();
            z = true;
            i2 = i3;
        } else {
            i2 = i4;
            z = false;
        }
        j760<Boolean, Integer> j760VarM119r0 = m119r0(z, i2, i, eqqVar.f9940c, eqqVar.f9941d, eqqVar.f9943f, hjc0VarM64F);
        int iIntValue = ((Integer) j760VarM119r0.b).intValue();
        if (!((Boolean) j760VarM119r0.a).booleanValue() && !eqqVar.f9944g) {
            i6 = 1;
        }
        m108C0(iIntValue, i6, eqqVar.f9942e);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m117p0(eqq eqqVar) {
        this.f55t.m147k(eqqVar.f9939b, 1).m145i((int) eqqVar.f9942e).m148l();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: q0 */
    public final void m118q0(final eqq eqqVar) {
        int iMo11202m;
        int i;
        boolean z;
        int i2;
        int i3 = eqqVar.f9938a;
        if (i3 == 0) {
            m76R(new Runnable() { // from class: l.xq2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22399a.m123v0(eqqVar);
                }
            }, "doSelectInner");
            return;
        }
        int i4 = 0;
        boolean z2 = true;
        if (i3 == 2) {
            i2 = eqqVar.f9943f;
        } else {
            if (i3 != 3) {
                if (i3 == 1) {
                    i4 = eqqVar.f9939b;
                    boolean z3 = eqqVar.f9940c;
                    z = eqqVar.f9941d;
                    z2 = z3;
                    i2 = eqqVar.f9943f;
                } else {
                    iMo11202m = -1;
                    i = 0;
                }
                xmr.m26034a(eqqVar.toString());
                if (m113l0(i4)) {
                    m130e();
                    return;
                }
                m125y0(i4, z2, z, i2);
                m102y();
                m72N();
            }
            iMo11202m = this.f43h.mo11202m() - 1;
            i = eqqVar.f9943f;
            z2 = false;
            i4 = iMo11202m;
            i2 = i;
        }
        z = z2;
        xmr.m26034a(eqqVar.toString());
        if (m113l0(i4)) {
            m130e();
            return;
        }
        m125y0(i4, z2, z, i2);
        m102y();
        m72N();
    }

    /* JADX INFO: renamed from: r0 */
    public final j760<Boolean, Integer> m119r0(boolean z, int i, int i2, boolean z2, boolean z3, int i3, hjc0 hjc0Var) {
        int iM111j0;
        ArrayList arrayList = new ArrayList();
        int renderContentHeight = this.f46k.getRenderContentHeight();
        int realWidth = this.f46k.getRealWidth();
        int i4 = 1;
        int i5 = z ? 1 : -1;
        boolean z4 = false;
        int i6 = i2;
        int i7 = 0;
        while (i7 < renderContentHeight && ((z && i6 < i) || (!z && i6 > i))) {
            hjc0 hjc0VarM62D = m62D(i6, realWidth, renderContentHeight);
            hjc0VarM62D.f12075f = i6;
            int i8 = hjc0VarM62D.f12077h;
            if (i8 == 1) {
                this.f46k.addView(hjc0VarM62D.f12076g.f22421a, 0);
            } else if (i8 == 2) {
                TantanListView tantanListView = this.f46k;
                View view = hjc0VarM62D.f12076g.f22421a;
                tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
            }
            hjc0VarM62D.f12077h = 3;
            arrayList.add(hjc0VarM62D);
            i7 += hjc0VarM62D.f12072c;
            i6 += i5;
        }
        if (i6 == i) {
            iM111j0 = m111j0(z, hjc0Var, z3, z2, renderContentHeight, arrayList) + i3;
        } else if (vwb.J(arrayList)) {
            iM111j0 = 0;
        } else {
            if (i3 * i5 > 0) {
                int iAbs = Math.abs(i3) + renderContentHeight;
                while (i7 < iAbs && ((z && i6 < i) || (!z && i6 > i))) {
                    hjc0 hjc0VarM62D2 = m62D(i6, realWidth, renderContentHeight);
                    hjc0VarM62D2.f12075f = i6;
                    int i9 = hjc0VarM62D2.f12077h;
                    if (i9 == i4) {
                        this.f46k.addView(hjc0VarM62D2.f12076g.f22421a, 0);
                    } else if (i9 == 2) {
                        TantanListView tantanListView2 = this.f46k;
                        View view2 = hjc0VarM62D2.f12076g.f22421a;
                        tantanListView2.attachViewToParent(view2, 0, view2.getLayoutParams());
                    }
                    hjc0VarM62D2.f12077h = 3;
                    arrayList.add(hjc0VarM62D2);
                    i7 += hjc0VarM62D2.f12072c;
                    i6 += i5;
                    i4 = 1;
                }
            }
            boolean z5 = i6 != i;
            iM111j0 = m111j0(z, hjc0Var, z3, z2, renderContentHeight, arrayList);
            z4 = z5;
        }
        return new j760<>(Boolean.valueOf(z4), Integer.valueOf(iM111j0));
    }

    /* JADX INFO: renamed from: s0 */
    public final hjc0 m120s0(int i) {
        for (hjc0 hjc0Var : this.f44i) {
            if (hjc0Var.f12075f == i) {
                return hjc0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m121t0() {
        return this.f55t.m141e();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m122u0() {
        return this.f55t.f78j;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m123v0(eqq eqqVar) {
        this.f52q -= eqqVar.f9939b;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m124w0(int i, int i2) {
        return m88d0(i, i2);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m125y0(int i, boolean z, boolean z2, int i2) {
        jjc0 jjc0Var = this.f47l;
        if (jjc0Var == null) {
            this.f47l = new jjc0();
            return;
        }
        jjc0Var.f13820m = z;
        jjc0Var.f13818k = i;
        jjc0Var.f13817j = this.f43h.mo11201d(i);
        jjc0 jjc0Var2 = this.f47l;
        if (z2) {
            jjc0Var2.f13819l = i2;
        } else {
            jjc0Var2.f13819l = this.f46k.getRenderContentHeight() + i2;
        }
        this.f47l.f13816i = this.f52q;
        this.f52q = 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m126z0(eqq eqqVar) {
        m132h(new AbstractC0005c.c(eqqVar));
    }
}
