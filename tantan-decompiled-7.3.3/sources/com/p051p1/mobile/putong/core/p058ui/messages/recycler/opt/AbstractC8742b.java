package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.view.View;
import com.google.common.collect.Lists;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.fsq;
import p153l.jyb;
import p153l.orc0;
import p153l.pf60;
import p153l.qrc0;
import p153l.yor;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8742b extends AbstractC8741a implements ChoreographerFrameCallbackC8745e.a {

    /* JADX INFO: renamed from: t */
    public ChoreographerFrameCallbackC8745e f33081t;

    /* JADX INFO: renamed from: u */
    public ChoreographerFrameCallbackC8745e.a f33082u;

    public AbstractC8742b() {
        ChoreographerFrameCallbackC8745e choreographerFrameCallbackC8745e = new ChoreographerFrameCallbackC8745e();
        this.f33081t = choreographerFrameCallbackC8745e;
        choreographerFrameCallbackC8745e.m50913h(this);
    }

    /* JADX INFO: renamed from: x0 */
    private void m50874x0() {
        if (this.f33070i.isEmpty()) {
            m50899e();
            return;
        }
        List<orc0> list = this.f33070i;
        orc0 orc0Var = list.get(list.size() - 1);
        int i = orc0Var.f148688a + orc0Var.f148690c + this.f33078q;
        if (this.f33072k.getRenderContentHeight() - i != 0) {
            m50876B0(this.f33072k.getRenderContentHeight() - i);
        } else {
            m50899e();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m50875A0(ChoreographerFrameCallbackC8745e.a aVar) {
        this.f33082u = this.f33072k;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000e A[PHI: r1
      0x000e: PHI (r1v4 int) = (r1v1 int), (r1v2 int) binds: [B:3:0x000c, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B0 */
    public void m50876B0(int i) {
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
        m50877C0(i, 2, iAbs);
    }

    /* JADX INFO: renamed from: C0 */
    public void m50877C0(int i, int i2, long j) {
        this.f33081t.m50916k(i, i2).m50914i(j).m50917l();
    }

    /* JADX INFO: renamed from: D0 */
    public void m50878D0() {
        if (this.f33081t.m50911f()) {
            this.f33081t.m50907b();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: a */
    public void mo50811a() {
        if (NullChecker.m82486a(this.f33082u)) {
            this.f33082u.mo50811a();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: b */
    public void mo50812b(boolean z) {
        yor.m216991b("lllll", "onAnimScrollEnd 剩余任务数：" + m50904l() + " : " + z);
        if (NullChecker.m82486a(this.f33082u)) {
            this.f33082u.mo50812b(z);
        }
        m50899e();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: c */
    public void mo50813c(int i, float f, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        if (NullChecker.m82486a(this.f33082u)) {
            i4 = i2;
            i5 = i3;
            z2 = z;
            this.f33082u.mo50813c(i, f, i4, i5, z2);
        } else {
            i4 = i2;
            i5 = i3;
            z2 = z;
        }
        if (z2 || !m50893w0(i4, i5)) {
            return;
        }
        this.f33081t.m50907b();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ChoreographerFrameCallbackC8745e.a
    /* JADX INFO: renamed from: f */
    public void mo50879f() {
        if (NullChecker.m82486a(this.f33082u)) {
            this.f33082u.mo50879f();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a, com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d
    /* JADX INFO: renamed from: j */
    public void mo50862j(AbstractC8743c abstractC8743c) {
        if (abstractC8743c instanceof AbstractC8743c.c) {
            if (this.f33069h.mo118497m() <= 0) {
                m50899e();
                return;
            }
            m50883m0(((AbstractC8743c.c) abstractC8743c).f33084a);
        } else if (abstractC8743c == AbstractRunnableC8744d.f33087g) {
            yor.m216991b("lllll", "执行滚动到底部的逻辑");
            m50871y();
            m50874x0();
            return;
        }
        super.mo50862j(abstractC8743c);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m50880j0(boolean z, orc0 orc0Var, boolean z2, boolean z3, int i, List<orc0> list) {
        if (jyb.m147479J(list)) {
            return 0;
        }
        orc0 orc0Var2 = list.get(0);
        List<orc0> listM15984q = Lists.m15984q(list);
        if (z) {
            int i2 = orc0Var.f148688a;
            for (orc0 orc0Var3 : listM15984q) {
                orc0Var3.f148688a = i2 - orc0Var3.f148690c;
                this.f33070i.add(0, orc0Var3);
                i2 = orc0Var3.f148688a;
            }
        } else {
            int i3 = orc0Var.f148688a + orc0Var.f148690c;
            for (orc0 orc0Var4 : listM15984q) {
                this.f33070i.add(orc0Var4);
                orc0Var4.f148688a = i3;
                i3 += orc0Var4.f148690c;
            }
        }
        if (z2) {
            return z3 ? -(orc0Var2.f148688a + this.f33078q) : (-(orc0Var2.f148688a + this.f33078q)) - orc0Var2.f148690c;
        }
        return z3 ? (-(orc0Var2.f148688a + this.f33078q)) + i : ((-(orc0Var2.f148688a + this.f33078q)) - orc0Var2.f148690c) + i;
    }

    /* JADX INFO: renamed from: k0 */
    public void m50881k0() {
        this.f33081t.m50907b();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m50882l0(int i) {
        return i >= 0 && i < this.f33069h.mo118497m() && this.f33069h.mo118497m() > 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m50883m0(fsq fsqVar) {
        if (fsqVar.f100677e > 0) {
            m50884n0(fsqVar);
        } else {
            m50878D0();
            m50887q0(fsqVar);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m50884n0(fsq fsqVar) {
        int i = fsqVar.f100673a;
        if (i == 2) {
            m50885o0(fsqVar);
            return;
        }
        if (i == 3) {
            m50885o0(fsqVar);
        } else if (i == 1) {
            m50885o0(fsqVar);
        } else if (i == 0) {
            m50886p0(fsqVar);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m50885o0(fsq fsqVar) {
        int i;
        int i2;
        boolean z;
        int iMo118497m = this.f33069h.mo118497m();
        int i3 = m50832E().f148693f;
        int i4 = m50833F().f148693f;
        int i5 = fsqVar.f100673a;
        int i6 = 2;
        if (i5 == 2) {
            i = 0;
        } else {
            i = i5 == 3 ? iMo118497m - 1 : fsqVar.f100674b;
        }
        if (i < 0 || i >= iMo118497m) {
            m50899e();
            return;
        }
        if (i >= i3 && i <= i4) {
            orc0 orc0VarM50889s0 = m50889s0(i);
            if (orc0VarM50889s0 == null) {
                m50899e();
                return;
            }
            int i7 = orc0VarM50889s0.f148688a + this.f33078q;
            if (!fsqVar.f100675c) {
                i7 += orc0VarM50889s0.f148690c;
            }
            m50877C0((fsqVar.f100676d ? -i7 : this.f33072k.getRenderContentHeight() - i7) + fsqVar.f100678f, fsqVar.f100679g ? 2 : 1, fsqVar.f100677e);
            return;
        }
        orc0 orc0VarM50833F = m50833F();
        if (i < i3) {
            orc0VarM50833F = m50832E();
            z = true;
            i2 = i3;
        } else {
            i2 = i4;
            z = false;
        }
        pf60<Boolean, Integer> pf60VarM50888r0 = m50888r0(z, i2, i, fsqVar.f100675c, fsqVar.f100676d, fsqVar.f100678f, orc0VarM50833F);
        int iIntValue = pf60VarM50888r0.f152157b.intValue();
        if (!pf60VarM50888r0.f152156a.booleanValue() && !fsqVar.f100679g) {
            i6 = 1;
        }
        m50877C0(iIntValue, i6, fsqVar.f100677e);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m50886p0(fsq fsqVar) {
        this.f33081t.m50916k(fsqVar.f100674b, 1).m50914i((int) fsqVar.f100677e).m50917l();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: q0 */
    public final void m50887q0(final fsq fsqVar) {
        int iMo118497m;
        int i;
        boolean z;
        int i2;
        int i3 = fsqVar.f100673a;
        if (i3 == 0) {
            m50845R(new Runnable() { // from class: l.nr2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143360a.m50892v0(fsqVar);
                }
            }, "doSelectInner");
            return;
        }
        int i4 = 0;
        boolean z2 = true;
        if (i3 == 2) {
            i2 = fsqVar.f100678f;
        } else {
            if (i3 != 3) {
                if (i3 == 1) {
                    i4 = fsqVar.f100674b;
                    boolean z3 = fsqVar.f100675c;
                    z = fsqVar.f100676d;
                    z2 = z3;
                    i2 = fsqVar.f100678f;
                } else {
                    iMo118497m = -1;
                    i = 0;
                }
                yor.m216990a(fsqVar.toString());
                if (m50882l0(i4)) {
                    m50899e();
                    return;
                }
                m50894y0(i4, z2, z, i2);
                m50871y();
                m50841N();
            }
            iMo118497m = this.f33069h.mo118497m() - 1;
            i = fsqVar.f100678f;
            z2 = false;
            i4 = iMo118497m;
            i2 = i;
        }
        z = z2;
        yor.m216990a(fsqVar.toString());
        if (m50882l0(i4)) {
            m50899e();
            return;
        }
        m50894y0(i4, z2, z, i2);
        m50871y();
        m50841N();
    }

    /* JADX INFO: renamed from: r0 */
    public final pf60<Boolean, Integer> m50888r0(boolean z, int i, int i2, boolean z2, boolean z3, int i3, orc0 orc0Var) {
        int iM50880j0;
        ArrayList arrayList = new ArrayList();
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        int realWidth = this.f33072k.getRealWidth();
        int i4 = 1;
        int i5 = z ? 1 : -1;
        boolean z4 = false;
        int i6 = i2;
        int i7 = 0;
        while (i7 < renderContentHeight && ((z && i6 < i) || (!z && i6 > i))) {
            orc0 orc0VarM50831D = m50831D(i6, realWidth, renderContentHeight);
            orc0VarM50831D.f148693f = i6;
            int i8 = orc0VarM50831D.f148695h;
            if (i8 == 1) {
                this.f33072k.addView(orc0VarM50831D.f148694g.f143454a, 0);
            } else if (i8 == 2) {
                TantanListView tantanListView = this.f33072k;
                View view = orc0VarM50831D.f148694g.f143454a;
                tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
            }
            orc0VarM50831D.f148695h = 3;
            arrayList.add(orc0VarM50831D);
            i7 += orc0VarM50831D.f148690c;
            i6 += i5;
        }
        if (i6 == i) {
            iM50880j0 = m50880j0(z, orc0Var, z3, z2, renderContentHeight, arrayList) + i3;
        } else if (jyb.m147479J(arrayList)) {
            iM50880j0 = 0;
        } else {
            if (i3 * i5 > 0) {
                int iAbs = Math.abs(i3) + renderContentHeight;
                while (i7 < iAbs && ((z && i6 < i) || (!z && i6 > i))) {
                    orc0 orc0VarM50831D2 = m50831D(i6, realWidth, renderContentHeight);
                    orc0VarM50831D2.f148693f = i6;
                    int i9 = orc0VarM50831D2.f148695h;
                    if (i9 == i4) {
                        this.f33072k.addView(orc0VarM50831D2.f148694g.f143454a, 0);
                    } else if (i9 == 2) {
                        TantanListView tantanListView2 = this.f33072k;
                        View view2 = orc0VarM50831D2.f148694g.f143454a;
                        tantanListView2.attachViewToParent(view2, 0, view2.getLayoutParams());
                    }
                    orc0VarM50831D2.f148695h = 3;
                    arrayList.add(orc0VarM50831D2);
                    i7 += orc0VarM50831D2.f148690c;
                    i6 += i5;
                    i4 = 1;
                }
            }
            boolean z5 = i6 != i;
            iM50880j0 = m50880j0(z, orc0Var, z3, z2, renderContentHeight, arrayList);
            z4 = z5;
        }
        return new pf60<>(Boolean.valueOf(z4), Integer.valueOf(iM50880j0));
    }

    /* JADX INFO: renamed from: s0 */
    public final orc0 m50889s0(int i) {
        for (orc0 orc0Var : this.f33070i) {
            if (orc0Var.f148693f == i) {
                return orc0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m50890t0() {
        return this.f33081t.m50910e();
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m50891u0() {
        return this.f33081t.f33104j;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m50892v0(fsq fsqVar) {
        this.f33078q -= fsqVar.f100674b;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m50893w0(int i, int i2) {
        return m50857d0(i, i2);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m50894y0(int i, boolean z, boolean z2, int i2) {
        qrc0 qrc0Var = this.f33073l;
        if (qrc0Var == null) {
            this.f33073l = new qrc0();
            return;
        }
        qrc0Var.f159099m = z;
        qrc0Var.f159097k = i;
        qrc0Var.f159096j = this.f33069h.mo118496d(i);
        qrc0 qrc0Var2 = this.f33073l;
        if (z2) {
            qrc0Var2.f159098l = i2;
        } else {
            qrc0Var2.f159098l = this.f33072k.getRenderContentHeight() + i2;
        }
        this.f33073l.f159095i = this.f33078q;
        this.f33078q = 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m50895z0(fsq fsqVar) {
        m50901h(new AbstractC8743c.c(fsqVar));
    }
}
