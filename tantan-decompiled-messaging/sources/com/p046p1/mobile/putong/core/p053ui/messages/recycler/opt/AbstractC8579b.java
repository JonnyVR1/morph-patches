package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import android.view.View;
import com.google.common.collect.Lists;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.eqq;
import p149l.hjc0;
import p149l.j760;
import p149l.jjc0;
import p149l.vwb;
import p149l.xmr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8579b extends AbstractC8578a implements ChoreographerFrameCallbackC8582e.a {

    /* JADX INFO: renamed from: t */
    public ChoreographerFrameCallbackC8582e f32233t;

    /* JADX INFO: renamed from: u */
    public ChoreographerFrameCallbackC8582e.a f32234u;

    public AbstractC8579b() {
        ChoreographerFrameCallbackC8582e choreographerFrameCallbackC8582e = new ChoreographerFrameCallbackC8582e();
        this.f32233t = choreographerFrameCallbackC8582e;
        choreographerFrameCallbackC8582e.m49730h(this);
    }

    /* JADX INFO: renamed from: x0 */
    private void m49691x0() {
        if (this.f32222i.isEmpty()) {
            m49716e();
            return;
        }
        List<hjc0> list = this.f32222i;
        hjc0 hjc0Var = list.get(list.size() - 1);
        int i = hjc0Var.f108060a + hjc0Var.f108062c + this.f32230q;
        if (this.f32224k.getRenderContentHeight() - i != 0) {
            m49693B0(this.f32224k.getRenderContentHeight() - i);
        } else {
            m49716e();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m49692A0(ChoreographerFrameCallbackC8582e.a aVar) {
        this.f32234u = this.f32224k;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000e A[PHI: r1
      0x000e: PHI (r1v4 int) = (r1v1 int), (r1v2 int) binds: [B:3:0x000c, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B0 */
    public void m49693B0(int i) {
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
        m49694C0(i, 2, iAbs);
    }

    /* JADX INFO: renamed from: C0 */
    public void m49694C0(int i, int i2, long j) {
        this.f32233t.m49733k(i, i2).m49731i(j).m49734l();
    }

    /* JADX INFO: renamed from: D0 */
    public void m49695D0() {
        if (this.f32233t.m49728f()) {
            this.f32233t.m49724b();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: a */
    public void mo49628a() {
        if (NullChecker.m81303a(this.f32234u)) {
            this.f32234u.mo49628a();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: b */
    public void mo49629b(boolean z) {
        xmr.m210146b("lllll", "onAnimScrollEnd 剩余任务数：" + m49721l() + " : " + z);
        if (NullChecker.m81303a(this.f32234u)) {
            this.f32234u.mo49629b(z);
        }
        m49716e();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: c */
    public void mo49630c(int i, float f, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        if (NullChecker.m81303a(this.f32234u)) {
            i4 = i2;
            i5 = i3;
            z2 = z;
            this.f32234u.mo49630c(i, f, i4, i5, z2);
        } else {
            i4 = i2;
            i5 = i3;
            z2 = z;
        }
        if (z2 || !m49710w0(i4, i5)) {
            return;
        }
        this.f32233t.m49724b();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ChoreographerFrameCallbackC8582e.a
    /* JADX INFO: renamed from: f */
    public void mo49696f() {
        if (NullChecker.m81303a(this.f32234u)) {
            this.f32234u.mo49696f();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a, com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d
    /* JADX INFO: renamed from: j */
    public void mo49679j(AbstractC8580c abstractC8580c) {
        if (abstractC8580c instanceof AbstractC8580c.c) {
            if (this.f32221h.mo108013m() <= 0) {
                m49716e();
                return;
            }
            m49700m0(((AbstractC8580c.c) abstractC8580c).f32236a);
        } else if (abstractC8580c == AbstractRunnableC8581d.f32239g) {
            xmr.m210146b("lllll", "执行滚动到底部的逻辑");
            m49688y();
            m49691x0();
            return;
        }
        super.mo49679j(abstractC8580c);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m49697j0(boolean z, hjc0 hjc0Var, boolean z2, boolean z3, int i, List<hjc0> list) {
        if (vwb.m200296J(list)) {
            return 0;
        }
        hjc0 hjc0Var2 = list.get(0);
        List<hjc0> listM15930q = Lists.m15930q(list);
        if (z) {
            int i2 = hjc0Var.f108060a;
            for (hjc0 hjc0Var3 : listM15930q) {
                hjc0Var3.f108060a = i2 - hjc0Var3.f108062c;
                this.f32222i.add(0, hjc0Var3);
                i2 = hjc0Var3.f108060a;
            }
        } else {
            int i3 = hjc0Var.f108060a + hjc0Var.f108062c;
            for (hjc0 hjc0Var4 : listM15930q) {
                this.f32222i.add(hjc0Var4);
                hjc0Var4.f108060a = i3;
                i3 += hjc0Var4.f108062c;
            }
        }
        if (z2) {
            return z3 ? -(hjc0Var2.f108060a + this.f32230q) : (-(hjc0Var2.f108060a + this.f32230q)) - hjc0Var2.f108062c;
        }
        return z3 ? (-(hjc0Var2.f108060a + this.f32230q)) + i : ((-(hjc0Var2.f108060a + this.f32230q)) - hjc0Var2.f108062c) + i;
    }

    /* JADX INFO: renamed from: k0 */
    public void m49698k0() {
        this.f32233t.m49724b();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m49699l0(int i) {
        return i >= 0 && i < this.f32221h.mo108013m() && this.f32221h.mo108013m() > 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m49700m0(eqq eqqVar) {
        if (eqqVar.f92829e > 0) {
            m49701n0(eqqVar);
        } else {
            m49695D0();
            m49704q0(eqqVar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m49701n0(eqq eqqVar) {
        int i = eqqVar.f92825a;
        if (i == 2) {
            m49702o0(eqqVar);
            return;
        }
        if (i == 3) {
            m49702o0(eqqVar);
        } else if (i == 1) {
            m49702o0(eqqVar);
        } else if (i == 0) {
            m49703p0(eqqVar);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m49702o0(eqq eqqVar) {
        int i;
        int i2;
        boolean z;
        int iMo108013m = this.f32221h.mo108013m();
        int i3 = m49649E().f108065f;
        int i4 = m49650F().f108065f;
        int i5 = eqqVar.f92825a;
        int i6 = 2;
        if (i5 == 2) {
            i = 0;
        } else {
            i = i5 == 3 ? iMo108013m - 1 : eqqVar.f92826b;
        }
        if (i < 0 || i >= iMo108013m) {
            m49716e();
            return;
        }
        if (i >= i3 && i <= i4) {
            hjc0 hjc0VarM49706s0 = m49706s0(i);
            if (hjc0VarM49706s0 == null) {
                m49716e();
                return;
            }
            int i7 = hjc0VarM49706s0.f108060a + this.f32230q;
            if (!eqqVar.f92827c) {
                i7 += hjc0VarM49706s0.f108062c;
            }
            m49694C0((eqqVar.f92828d ? -i7 : this.f32224k.getRenderContentHeight() - i7) + eqqVar.f92830f, eqqVar.f92831g ? 2 : 1, eqqVar.f92829e);
            return;
        }
        hjc0 hjc0VarM49650F = m49650F();
        if (i < i3) {
            hjc0VarM49650F = m49649E();
            z = true;
            i2 = i3;
        } else {
            i2 = i4;
            z = false;
        }
        j760<Boolean, Integer> j760VarM49705r0 = m49705r0(z, i2, i, eqqVar.f92827c, eqqVar.f92828d, eqqVar.f92830f, hjc0VarM49650F);
        int iIntValue = j760VarM49705r0.f116565b.intValue();
        if (!j760VarM49705r0.f116564a.booleanValue() && !eqqVar.f92831g) {
            i6 = 1;
        }
        m49694C0(iIntValue, i6, eqqVar.f92829e);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m49703p0(eqq eqqVar) {
        this.f32233t.m49733k(eqqVar.f92826b, 1).m49731i((int) eqqVar.f92829e).m49734l();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: q0 */
    public final void m49704q0(final eqq eqqVar) {
        int iMo108013m;
        int i;
        boolean z;
        int i2;
        int i3 = eqqVar.f92825a;
        if (i3 == 0) {
            m49662R(new Runnable() { // from class: l.xq2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193977a.m49709v0(eqqVar);
                }
            }, "doSelectInner");
            return;
        }
        int i4 = 0;
        boolean z2 = true;
        if (i3 == 2) {
            i2 = eqqVar.f92830f;
        } else {
            if (i3 != 3) {
                if (i3 == 1) {
                    i4 = eqqVar.f92826b;
                    boolean z3 = eqqVar.f92827c;
                    z = eqqVar.f92828d;
                    z2 = z3;
                    i2 = eqqVar.f92830f;
                } else {
                    iMo108013m = -1;
                    i = 0;
                }
                xmr.m210145a(eqqVar.toString());
                if (m49699l0(i4)) {
                    m49716e();
                    return;
                }
                m49711y0(i4, z2, z, i2);
                m49688y();
                m49658N();
            }
            iMo108013m = this.f32221h.mo108013m() - 1;
            i = eqqVar.f92830f;
            z2 = false;
            i4 = iMo108013m;
            i2 = i;
        }
        z = z2;
        xmr.m210145a(eqqVar.toString());
        if (m49699l0(i4)) {
            m49716e();
            return;
        }
        m49711y0(i4, z2, z, i2);
        m49688y();
        m49658N();
    }

    /* JADX INFO: renamed from: r0 */
    public final j760<Boolean, Integer> m49705r0(boolean z, int i, int i2, boolean z2, boolean z3, int i3, hjc0 hjc0Var) {
        int iM49697j0;
        ArrayList arrayList = new ArrayList();
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        int realWidth = this.f32224k.getRealWidth();
        int i4 = 1;
        int i5 = z ? 1 : -1;
        boolean z4 = false;
        int i6 = i2;
        int i7 = 0;
        while (i7 < renderContentHeight && ((z && i6 < i) || (!z && i6 > i))) {
            hjc0 hjc0VarM49648D = m49648D(i6, realWidth, renderContentHeight);
            hjc0VarM49648D.f108065f = i6;
            int i8 = hjc0VarM49648D.f108067h;
            if (i8 == 1) {
                this.f32224k.addView(hjc0VarM49648D.f108066g.f194078a, 0);
            } else if (i8 == 2) {
                TantanListView tantanListView = this.f32224k;
                View view = hjc0VarM49648D.f108066g.f194078a;
                tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
            }
            hjc0VarM49648D.f108067h = 3;
            arrayList.add(hjc0VarM49648D);
            i7 += hjc0VarM49648D.f108062c;
            i6 += i5;
        }
        if (i6 == i) {
            iM49697j0 = m49697j0(z, hjc0Var, z3, z2, renderContentHeight, arrayList) + i3;
        } else if (vwb.m200296J(arrayList)) {
            iM49697j0 = 0;
        } else {
            if (i3 * i5 > 0) {
                int iAbs = Math.abs(i3) + renderContentHeight;
                while (i7 < iAbs && ((z && i6 < i) || (!z && i6 > i))) {
                    hjc0 hjc0VarM49648D2 = m49648D(i6, realWidth, renderContentHeight);
                    hjc0VarM49648D2.f108065f = i6;
                    int i9 = hjc0VarM49648D2.f108067h;
                    if (i9 == i4) {
                        this.f32224k.addView(hjc0VarM49648D2.f108066g.f194078a, 0);
                    } else if (i9 == 2) {
                        TantanListView tantanListView2 = this.f32224k;
                        View view2 = hjc0VarM49648D2.f108066g.f194078a;
                        tantanListView2.attachViewToParent(view2, 0, view2.getLayoutParams());
                    }
                    hjc0VarM49648D2.f108067h = 3;
                    arrayList.add(hjc0VarM49648D2);
                    i7 += hjc0VarM49648D2.f108062c;
                    i6 += i5;
                    i4 = 1;
                }
            }
            boolean z5 = i6 != i;
            iM49697j0 = m49697j0(z, hjc0Var, z3, z2, renderContentHeight, arrayList);
            z4 = z5;
        }
        return new j760<>(Boolean.valueOf(z4), Integer.valueOf(iM49697j0));
    }

    /* JADX INFO: renamed from: s0 */
    public final hjc0 m49706s0(int i) {
        for (hjc0 hjc0Var : this.f32222i) {
            if (hjc0Var.f108065f == i) {
                return hjc0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m49707t0() {
        return this.f32233t.m49727e();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m49708u0() {
        return this.f32233t.f32256j;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m49709v0(eqq eqqVar) {
        this.f32230q -= eqqVar.f92826b;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m49710w0(int i, int i2) {
        return m49674d0(i, i2);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m49711y0(int i, boolean z, boolean z2, int i2) {
        jjc0 jjc0Var = this.f32225l;
        if (jjc0Var == null) {
            this.f32225l = new jjc0();
            return;
        }
        jjc0Var.f118269m = z;
        jjc0Var.f118267k = i;
        jjc0Var.f118266j = this.f32221h.mo108012d(i);
        jjc0 jjc0Var2 = this.f32225l;
        if (z2) {
            jjc0Var2.f118268l = i2;
        } else {
            jjc0Var2.f118268l = this.f32224k.getRenderContentHeight() + i2;
        }
        this.f32225l.f118265i = this.f32230q;
        this.f32230q = 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m49712z0(eqq eqqVar) {
        m49718h(new AbstractC8580c.c(eqqVar));
    }
}
