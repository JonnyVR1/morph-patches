package p009l;

import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import l.roj0;
import l.vwb;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class bx2 extends zw2 {

    /* JADX INFO: renamed from: x */
    public b<roj0> f10341x;

    /* JADX INFO: renamed from: y */
    public boolean f10342y;

    /* JADX INFO: renamed from: l.bx2$b */
    public static /* synthetic */ class C0797b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10344a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f10344a = iArr;
            try {
                iArr[CardOperation.SWIPE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10344a[CardOperation.SWIPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10344a[CardOperation.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bx2(Context context) {
        super(context);
        this.f10341x = b.b();
        this.f10342y = false;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo11678A0(CardOperation cardOperation, boolean z) {
        pol0 pol0VarM25991G = m25991G();
        if (pol0VarM25991G == null) {
            return false;
        }
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        this.f23935i.m25879a(pol0VarM25991G.f18810k);
        View view = pol0VarM25991G.f18800a;
        this.f23932f.m20806e();
        this.f23935i.m25880b();
        this.f23931e.mo22190j(view);
        if (this.f23935i.m25886h(pol0VarM25991G.f18810k) && z && !zo0.f23796y) {
            if (BifrostLayout.f2099d) {
                cardOperation.name();
            }
            return false;
        }
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        pol0VarM25991G.f18809j = VirtualState.PRE_OUT;
        og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
        og4Var.f18009d = zo0.f23780i;
        og4Var.f18007b = CardAnimType.ANIM_OUT;
        og4Var.f18013h = cardOperation;
        og4Var.f18014i = z ? zo0.f23796y : true;
        qo0 qo0Var = new qo0();
        og4Var.m19739a(pol0VarM25991G.f18810k);
        og4Var.m19740b(VirtualState.RENDING);
        og4Var.f18011f = qo0Var;
        og4Var.f18010e = -1;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        qo0Var.m21119e(pol0VarM25991G.f18800a);
        if (qo0Var.f19397c == 0.0f && qo0Var.f19395a == 0.0f) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(measuredHeight / 5);
        }
        int i = C0797b.f10344a[cardOperation.ordinal()];
        if (i == 1) {
            qo0Var.f19398d = zo0.f23786o * (-1.0f) * measuredWidth;
            qo0Var.f19400f = 1.0f;
            qo0Var.f19402h = zo0.f23788q * (-1.0f);
            long j = zo0.f23784m;
            if (j > 1) {
                qo0Var.f19396b = (((-j) / 2) + (System.currentTimeMillis() % zo0.f23784m)) * zo0.f23783l;
            }
            qo0Var.f19406l = 1.0f;
        } else if (i == 2) {
            qo0Var.f19398d = zo0.f23786o * measuredWidth;
            qo0Var.f19400f = 1.0f;
            qo0Var.f19402h = zo0.f23788q;
            long j2 = zo0.f23784m;
            if (j2 > 1) {
                qo0Var.f19396b = (((-j2) / 2) + (System.currentTimeMillis() % zo0.f23784m)) * zo0.f23783l;
            }
            qo0Var.f19406l = 1.0f;
        } else if (i == 3) {
            qo0Var.f19396b = zo0.f23786o * (-1.0f) * measuredHeight;
            qo0Var.f19400f = 1.0f;
            qo0Var.f19402h = 0.0f;
            og4Var.f18009d = zo0.f23780i;
            qo0Var.f19406l = 1.0f;
        }
        og4Var.m19754p(new PathInterpolator(zo0.f23787p, 0.0f, 1.0f, 1.0f));
        this.f23930d.mo14557f(og4Var);
        this.f23935i.m25882d(og4Var);
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p009l.jl4
    /* JADX INFO: renamed from: a */
    public void mo12312a() {
        long jUptimeMillis;
        long j;
        ArrayList arrayList;
        int i;
        boolean z;
        if (zo0.f23763C) {
            m12320y0();
            return;
        }
        String str = BifrostLayout.f2098c;
        m26005Y("notify begin ");
        System.currentTimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ListIterator<pol0> listIterator = this.f23927a.listIterator();
        List<pol0> list = this.f23927a;
        boolean z2 = list == null || list.isEmpty();
        pol0 pol0Var = null;
        int i2 = -1;
        while (listIterator.hasNext()) {
            pol0 next = listIterator.next();
            VirtualState virtualState = next.f18809j;
            VirtualState virtualState2 = VirtualState.PRE_OUT;
            if (virtualState == virtualState2) {
                if (!m12318w0(next.f18801b, next.f18804e)) {
                    this.f23935i.m25879a(next.f18810k);
                    arrayList2.add(next);
                    listIterator.remove();
                    int iIndexOfChild = m25989B().indexOfChild(next.f18800a);
                    if (BifrostLayout.f2099d) {
                        if (iIndexOfChild < 0) {
                            Objects.toString(next.f18809j);
                            next.f18800a.hashCode();
                        } else {
                            Objects.toString(next.f18809j);
                            next.f18800a.hashCode();
                        }
                    }
                    m25989B().removeViewInLayout(next.f18800a);
                    if (i2 < 0) {
                        i2 = next.f18804e;
                    }
                    String str2 = BifrostLayout.f2098c;
                } else if (i2 < 0) {
                    i2 = next.f18804e + 1;
                }
            } else if (virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT) {
                arrayList2.add(next);
                listIterator.remove();
                int iIndexOfChild2 = m25989B().indexOfChild(next.f18800a);
                if (BifrostLayout.f2099d) {
                    if (iIndexOfChild2 < 0) {
                        Objects.toString(next.f18809j);
                        next.f18800a.hashCode();
                    } else {
                        Objects.toString(next.f18809j);
                        next.f18800a.hashCode();
                        next.hashCode();
                    }
                }
                m25989B().removeViewInLayout(next.f18800a);
                if (i2 < 0) {
                    i2 = next.f18804e;
                }
            } else if (virtualState == virtualState2) {
                i2 = next.f18804e;
                pol0Var = next;
            }
        }
        if (BifrostLayout.f2099d) {
            sb.append(" setp1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
            jUptimeMillis2 = SystemClock.uptimeMillis();
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iMax = Math.max(0, Math.min(this.f23931e.mo11924f(), m25988A().mo12725m()));
        ArrayList<pol0> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str3 = BifrostLayout.f2098c;
        if (BifrostLayout.f2099d) {
            sb.append(" setp1.1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
        }
        int i3 = 0;
        int iMo11682r0 = 0;
        while (i3 < iMax) {
            int i4 = i3 + i2;
            if (i4 >= this.f23931e.mo11924f()) {
                j = jUptimeMillis2;
            } else {
                int iMo11926h = this.f23931e.mo11926h(i4);
                j = jUptimeMillis2;
                String strMo11927i = this.f23931e.mo11927i(i4);
                if (pol0Var == null || !TextUtils.equals(strMo11927i, pol0Var.f18801b) || pol0Var.f18803d != iMo11926h) {
                    if (BifrostLayout.f2099d) {
                        arrayList2.size();
                    }
                    pol0 pol0VarM12317v0 = m12317v0(arrayList2, iMo11926h, strMo11927i);
                    if (BifrostLayout.f2099d) {
                        arrayList2.size();
                    }
                    if (pol0VarM12317v0 == null) {
                        pol0VarM12317v0 = new pol0();
                        arrayList = arrayList2;
                        View viewM21469a = this.f23937k.m21469a(iMo11926h);
                        if (viewM21469a == null) {
                            i = iMax;
                            z = z2;
                            viewM21469a = this.f23931e.mo11923e(iMo11926h, m26035r(), o7r.m19649a(m26035r()));
                            if (BifrostLayout.f2099d) {
                                viewM21469a.hashCode();
                            }
                        } else {
                            i = iMax;
                            z = z2;
                            if (BifrostLayout.f2099d) {
                                viewM21469a.hashCode();
                            }
                        }
                        pol0VarM12317v0.f18803d = iMo11926h;
                        pol0VarM12317v0.f18800a = viewM21469a;
                    } else {
                        arrayList = arrayList2;
                        i = iMax;
                        z = z2;
                        if (BifrostLayout.f2099d) {
                            pol0VarM12317v0.f18800a.hashCode();
                            pol0VarM12317v0.hashCode();
                        }
                    }
                    if (BifrostLayout.f2099d && pol0VarM12317v0.f18800a.getParent() != null) {
                        pol0VarM12317v0.f18800a.hashCode();
                    }
                    jn2.m17164n(pol0VarM12317v0.f18800a);
                    pol0VarM12317v0.m20521c(strMo11927i, this.f23931e.mo11925g(i4));
                    pol0VarM12317v0.f18804e = i4;
                    pol0VarM12317v0.f18809j = VirtualState.INIT;
                    pol0VarM12317v0.f18805f = iMo11682r0;
                    arrayList3.add(pol0VarM12317v0);
                    Object objMo11925g = this.f23931e.mo11925g(i4);
                    if (objMo11925g instanceof kj4) {
                        iMo11682r0 += mo11682r0((kj4) objMo11925g, arrayList4, pol0VarM12317v0);
                    }
                    if (BifrostLayout.f2099d) {
                        sb.append(" setp1.2." + i3 + ":");
                        sb.append(SystemClock.uptimeMillis() - j);
                        sb.append("|");
                    }
                }
                i3++;
                jUptimeMillis2 = j;
                arrayList2 = arrayList;
                iMax = i;
                z2 = z;
            }
            arrayList = arrayList2;
            i = iMax;
            z = z2;
            i3++;
            jUptimeMillis2 = j;
            arrayList2 = arrayList;
            iMax = i;
            z2 = z;
        }
        long j2 = jUptimeMillis2;
        ArrayList arrayList5 = arrayList2;
        boolean z3 = z2;
        if (BifrostLayout.f2099d) {
            sb.append(" setp2:");
            sb.append(SystemClock.uptimeMillis() - j2);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        } else {
            jUptimeMillis = j2;
        }
        if (!arrayList5.isEmpty()) {
            for (pol0 pol0Var2 : arrayList5) {
                m25989B().removeViewInLayout(pol0Var2.f18800a);
                this.f23937k.m21470b(pol0Var2);
                this.f23931e.mo11928l(pol0Var2.f18800a, false);
            }
        }
        System.currentTimeMillis();
        if (BifrostLayout.f2099d) {
            arrayList3.size();
        }
        if (BifrostLayout.f2099d) {
            sb.append(" setp3:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        for (pol0 pol0Var3 : arrayList3) {
            if (BifrostLayout.f2099d) {
                String str4 = pol0Var3.f18801b;
                pol0Var3.f18800a.hashCode();
            }
            this.f23927a.add(pol0Var3);
            if (BifrostLayout.f2099d && pol0Var3.f18800a.getParent() != null) {
                pol0Var3.f18800a.hashCode();
            }
            m25989B().m2790s(pol0Var3.f18800a);
            boolean zJ = vwb.J(arrayList4);
            yw2 yw2Var = this.f23931e;
            if (zJ) {
                yw2Var.mo11922d(pol0Var3.f18800a, pol0Var3.f18804e);
                String str5 = BifrostLayout.f2098c;
            } else {
                yw2Var.mo11922d(pol0Var3.f18800a, pol0Var3.f18804e);
                String str6 = BifrostLayout.f2098c;
            }
            if (BifrostLayout.f2099d) {
                sb.append(" setp bind:");
                sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
                sb.append("|");
                jUptimeMillis = SystemClock.uptimeMillis();
            }
            if (BifrostLayout.f2099d) {
                pol0Var3.f18800a.hashCode();
            }
        }
        if (BifrostLayout.f2099d) {
            sb.append(" setp4:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f2099d) {
            System.currentTimeMillis();
        }
        if (z3) {
            m12314s0();
        } else if (arrayList4.size() > 0) {
            this.f23935i.m25883e(arrayList4);
        }
        if (BifrostLayout.f2099d) {
            sb.append(" setp5:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f2099d) {
            System.currentTimeMillis();
        }
        this.f23929c.m17167f();
        if (BifrostLayout.f2099d) {
            sb.append(" setp6:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            SystemClock.uptimeMillis();
        }
        String str7 = BifrostLayout.f2098c;
        m26005Y("notify data ");
        m25989B().requestLayout();
    }

    @Override // p009l.jl4
    /* JADX INFO: renamed from: b */
    public String mo12313b() {
        return m26041z("notify");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX INFO: renamed from: r0 */
    public int mo11682r0(kj4 kj4Var, List<og4> list, pol0 pol0Var) {
        CardOperation cardOperation;
        int preBackOperation = kj4Var.getPreBackOperation();
        if (preBackOperation < 0) {
            cardOperation = null;
        } else if (preBackOperation == 0) {
            cardOperation = CardOperation.SWIPE_LEFT;
        } else if (preBackOperation == 1) {
            cardOperation = CardOperation.SWIPE_RIGHT;
        } else if (preBackOperation != 2) {
            cardOperation = null;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        kj4Var.resetPreAction();
        if (cardOperation == null || pol0Var.f18804e != 0) {
            return 0;
        }
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        og4 og4Var = new og4(pol0Var.f18810k, pol0Var);
        og4Var.f18006a = new zo0.InterpolatorC1371a();
        og4Var.f18006a = this.f23930d.mo14555d();
        og4Var.f18007b = CardAnimType.ANIM_INSERT;
        og4Var.f18009d = zo0.f23781j;
        this.f23932f.m20806e();
        qo0 qo0Var = new qo0();
        qo0Var.m21116b();
        int i = C0797b.f10344a[cardOperation.ordinal()];
        if (i == 1) {
            qo0Var.f19397c = this.f23928b.getMeasuredWidth() * (-1.2f);
            qo0Var.f19395a = 0.0f;
            qo0Var.f19399e = 1.0f;
            qo0Var.f19401g = 15.0f;
        } else if (i == 2) {
            qo0Var.f19397c = this.f23928b.getMeasuredWidth() * 1.2f;
            qo0Var.f19395a = 0.0f;
            qo0Var.f19399e = 1.0f;
            qo0Var.f19401g = -15.0f;
        } else if (i == 3) {
            qo0Var.f19397c = 0.0f;
            float measuredHeight = this.f23928b.getMeasuredHeight() * (-1.0f);
            qo0Var.f19395a = measuredHeight;
            qo0Var.f19399e = 1.0f;
            qo0Var.f19401g = 0.0f;
            pol0Var.f18800a.setTranslationY(measuredHeight);
        }
        pol0Var.f18808i = cardOperation;
        og4Var.m19739a(pol0Var.f18810k);
        og4Var.f18011f = qo0Var;
        list.add(og4Var);
        return -1;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m12314s0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = m25989B().animate();
        m25989B().setAlpha(0.0f);
        m25989B().setScaleX(0.9f);
        m25989B().setScaleY(0.9f);
        viewPropertyAnimatorAnimate.setListener(new C0796a());
        viewPropertyAnimatorAnimate.setDuration(500L).setStartDelay(200L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }

    /* JADX INFO: renamed from: t0 */
    public final int m12315t0(pol0 pol0Var, int i, int i2, List<og4> list) {
        jn2.m17164n(pol0Var.f18800a);
        pol0Var.m20521c(this.f23931e.mo11927i(i), this.f23931e.mo11925g(i));
        pol0Var.f18804e = i;
        pol0Var.f18809j = VirtualState.INIT;
        pol0Var.f18805f = i2;
        pol0Var.f18807h = true;
        Object objMo11925g = this.f23931e.mo11925g(i);
        return objMo11925g instanceof kj4 ? i2 + mo11682r0((kj4) objMo11925g, list, pol0Var) : i2;
    }

    /* JADX INFO: renamed from: u0 */
    public c<roj0> mo12316u0() {
        return this.f10341x;
    }

    /* JADX INFO: renamed from: v0 */
    public final pol0 m12317v0(List<pol0> list, int i, String str) {
        if (list.isEmpty()) {
            return null;
        }
        ListIterator<pol0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            pol0 next = listIterator.next();
            if (next.f18803d == i && TextUtils.equals(str, next.f18801b)) {
                listIterator.remove();
                return next;
            }
        }
        ListIterator listIterator2 = Lists.q(list).listIterator();
        while (listIterator2.hasNext()) {
            pol0 pol0Var = (pol0) listIterator2.next();
            if (pol0Var.f18803d == i) {
                listIterator2.remove();
                return pol0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m12318w0(String str, int i) {
        int iMo11924f = this.f23931e.mo11924f();
        for (int i2 = 0; i2 < iMo11924f; i2++) {
            if (TextUtils.equals(this.f23931e.mo11927i(i2), str) && i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m12319x0() {
        if (BifrostLayout.f2099d) {
            int childCount = m25989B().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m25989B().getChildAt(i);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" : ");
                sb.append(childAt.getClass().getSimpleName());
                sb.append(" ,");
                sb.append(childAt.hashCode());
            }
            String str = BifrostLayout.f2098c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: y0 */
    public final void m12320y0() {
        pol0 next;
        pol0 pol0Var;
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.f10342y = true;
        String str = BifrostLayout.f2098c;
        List<pol0> list = this.f23927a;
        boolean z4 = false;
        boolean z5 = list == null || list.isEmpty();
        System.currentTimeMillis();
        ListIterator<pol0> listIterator = this.f23927a.listIterator();
        int iMin = Math.min(this.f23931e.mo11924f(), m25988A().mo12725m());
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        ?? r8 = -1;
        while (true) {
            if (!listIterator.hasNext() && i2 >= iMin) {
                break;
            }
            int i4 = i + 1;
            if (listIterator.hasNext()) {
                next = listIterator.next();
                if (BifrostLayout.f2099d) {
                    String str2 = next.f18801b;
                }
                next.f18806g = z3;
                VirtualState virtualState = next.f18809j;
                if (virtualState == VirtualState.ANIM_OUT) {
                    next.f18806g = z4;
                } else if (virtualState != VirtualState.PRE_OUT) {
                    if (i2 >= iMin) {
                    }
                } else if (m12318w0(next.f18801b, next.f18804e)) {
                    if (r8 < 0) {
                        r8 = next.f18804e + (z3 ? 1 : 0);
                    }
                    next.f18806g = z4;
                } else {
                    this.f23935i.m25879a(next.f18810k);
                    if (i2 >= iMin) {
                    }
                }
                i = i4;
            } else {
                next = null;
            }
            if (r8 < 0) {
                r8 = z4;
            }
            int i5 = (r8 == true ? 1 : 0) + i2;
            if (i5 >= this.f23931e.mo11924f()) {
                i2++;
                i = i4;
            } else {
                if (next == null || next.f18803d == this.f23931e.mo11926h(i5)) {
                    pol0Var = next;
                    z = z4;
                } else {
                    int i6 = i5 + 1;
                    if (i6 < this.f23931e.mo11924f() && next.f18803d == this.f23931e.mo11926h(i6) && listIterator.hasPrevious()) {
                        listIterator.previous();
                        String str3 = BifrostLayout.f2098c;
                        z = z3 ? 1 : 0;
                    } else {
                        z = z4;
                    }
                    String str4 = BifrostLayout.f2098c;
                    pol0Var = null;
                }
                if (pol0Var == null || pol0Var.f18803d != this.f23931e.mo11926h(i5)) {
                    int iMo11926h = this.f23931e.mo11926h(i5);
                    pol0 pol0Var2 = new pol0();
                    View viewM21469a = this.f23937k.m21469a(iMo11926h);
                    if (viewM21469a == null) {
                        viewM21469a = this.f23931e.mo11923e(iMo11926h, m26035r(), o7r.m19649a(m26035r()));
                        String str5 = BifrostLayout.f2098c;
                    } else {
                        String str6 = BifrostLayout.f2098c;
                    }
                    pol0Var2.f18803d = iMo11926h;
                    pol0Var2.f18800a = viewM21469a;
                    int iM12315t0 = m12315t0(pol0Var2, i5, i3, arrayList);
                    m25989B().m2791t(pol0Var2.f18800a, Math.min(i4, m25989B().getChildCount()));
                    if (!z) {
                        i4 = i + 2;
                    }
                    i2++;
                    listIterator.add(pol0Var2);
                    this.f23929c.m17169h(pol0Var2.f18800a, i5, pol0Var2);
                    i3 = iM12315t0;
                    z2 = z5;
                } else {
                    this.f23931e.mo11928l(pol0Var.f18800a, z3);
                    int iM12315t1 = m12315t0(pol0Var, i5, i3, arrayList);
                    pol0Var.f18806g = false;
                    i2++;
                    String str7 = BifrostLayout.f2098c;
                    z2 = z5;
                    i3 = iM12315t1;
                }
                i = i4;
                z5 = z2;
                z3 = true;
                z4 = false;
            }
        }
        ListIterator<pol0> listIterator2 = this.f23927a.listIterator();
        while (listIterator2.hasNext()) {
            pol0 next2 = listIterator2.next();
            if (next2.f18806g) {
                this.f23928b.removeViewInLayout(next2.f18800a);
                this.f23931e.mo11928l(next2.f18800a, z4);
                String str8 = BifrostLayout.f2098c;
                this.f23937k.m21470b(next2);
                listIterator2.remove();
            } else if (next2.f18807h) {
                this.f23931e.mo11922d(next2.f18800a, next2.f18804e);
                if (this.f23930d.mo14559h() && this.f23930d.mo14552a() < 1.0f) {
                    int i7 = next2.f18804e;
                    if (i7 == z3) {
                        next2.f18800a.setAlpha(Math.min(1.0f, Math.max(this.f23930d.mo14552a(), this.f23930d.mo14552a())));
                    } else {
                        View view = next2.f18800a;
                        if (i7 == 2) {
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                    }
                }
            }
            next2.f18806g = z4;
            next2.f18807h = z4;
        }
        if (z5) {
            m12314s0();
        } else if (arrayList.size() > 0) {
            this.f23935i.m25883e(arrayList);
        }
        if (BifrostLayout.f2099d) {
            System.currentTimeMillis();
        }
        this.f23929c.m17167f();
        if (BifrostLayout.f2099d) {
            this.f23927a.size();
        }
        m26005Y("notify data ");
        m25989B().requestLayout();
        this.f10342y = z4;
        m12319x0();
        m26036s().mo12155a(this.f23931e.mo11924f());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo12321z0() {
        pol0 pol0VarM25991G = m25991G();
        if (pol0VarM25991G != null) {
            this.f23935i.m25880b();
            VirtualState virtualState = VirtualState.RENDING;
            pol0VarM25991G.f18809j = virtualState;
            og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
            og4Var.f18007b = CardAnimType.ANIM_BACK;
            og4Var.m19739a(pol0VarM25991G.f18810k);
            og4Var.m19740b(virtualState);
            qo0 qo0Var = new qo0();
            og4Var.f18009d = zo0.f23782k;
            og4Var.f18010e = 0;
            og4Var.m19740b(virtualState);
            qo0Var.m21119e(m25991G().f18800a);
            qo0Var.m21116b();
            og4Var.m19752n(qo0Var);
            this.f23935i.m25882d(og4Var);
        }
    }

    /* JADX INFO: renamed from: l.bx2$a */
    public class C0796a implements Animator.AnimatorListener {
        public C0796a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            bx2.this.f10341x.onNext(roj0.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }
}
