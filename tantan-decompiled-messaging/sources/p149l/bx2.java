package p149l;

import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bx2 extends zw2 {

    /* JADX INFO: renamed from: x */
    public C22393b<roj0> f77725x;

    /* JADX INFO: renamed from: y */
    public boolean f77726y;

    /* JADX INFO: renamed from: l.bx2$b */
    public static /* synthetic */ class C16003b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77728a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f77728a = iArr;
            try {
                iArr[CardOperation.SWIPE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77728a[CardOperation.SWIPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77728a[CardOperation.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bx2(Context context) {
        super(context);
        this.f77725x = C22393b.m221521b();
        this.f77726y = false;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo99351A0(CardOperation cardOperation, boolean z) {
        pol0 pol0VarM220509G = m220509G();
        if (pol0VarM220509G == null) {
            return false;
        }
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        this.f205098i.m219535a(pol0VarM220509G.f150540k);
        View view = pol0VarM220509G.f150530a;
        this.f205095f.m172940e();
        this.f205098i.m219536b();
        this.f205094e.mo184171j(view);
        if (this.f205098i.m219542h(pol0VarM220509G.f150540k) && z && !zo0.f204072y) {
            if (BifrostLayout.f23321d) {
                cardOperation.name();
            }
            return false;
        }
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        pol0VarM220509G.f150539j = VirtualState.PRE_OUT;
        og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
        og4Var.f143804d = zo0.f204056i;
        og4Var.f143802b = CardAnimType.ANIM_OUT;
        og4Var.f143808h = cardOperation;
        og4Var.f143809i = z ? zo0.f204072y : true;
        qo0 qo0Var = new qo0();
        og4Var.m164160a(pol0VarM220509G.f150540k);
        og4Var.m164161b(VirtualState.RENDING);
        og4Var.f143806f = qo0Var;
        og4Var.f143805e = -1;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        qo0Var.m175720e(pol0VarM220509G.f150530a);
        if (qo0Var.f155520c == 0.0f && qo0Var.f155518a == 0.0f) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(measuredHeight / 5);
        }
        int i = C16003b.f77728a[cardOperation.ordinal()];
        if (i == 1) {
            qo0Var.f155521d = zo0.f204062o * (-1.0f) * measuredWidth;
            qo0Var.f155523f = 1.0f;
            qo0Var.f155525h = zo0.f204064q * (-1.0f);
            long j = zo0.f204060m;
            if (j > 1) {
                qo0Var.f155519b = (((-j) / 2) + (System.currentTimeMillis() % zo0.f204060m)) * zo0.f204059l;
            }
            qo0Var.f155529l = 1.0f;
        } else if (i == 2) {
            qo0Var.f155521d = zo0.f204062o * measuredWidth;
            qo0Var.f155523f = 1.0f;
            qo0Var.f155525h = zo0.f204064q;
            long j2 = zo0.f204060m;
            if (j2 > 1) {
                qo0Var.f155519b = (((-j2) / 2) + (System.currentTimeMillis() % zo0.f204060m)) * zo0.f204059l;
            }
            qo0Var.f155529l = 1.0f;
        } else if (i == 3) {
            qo0Var.f155519b = zo0.f204062o * (-1.0f) * measuredHeight;
            qo0Var.f155523f = 1.0f;
            qo0Var.f155525h = 0.0f;
            og4Var.f143804d = zo0.f204056i;
            qo0Var.f155529l = 1.0f;
        }
        og4Var.m164175p(new PathInterpolator(zo0.f204063p, 0.0f, 1.0f, 1.0f));
        this.f205093d.mo122786f(og4Var);
        this.f205098i.m219538d(og4Var);
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p149l.jl4
    /* JADX INFO: renamed from: a */
    public void mo104259a() {
        long jUptimeMillis;
        long j;
        ArrayList arrayList;
        int i;
        boolean z;
        if (zo0.f204039C) {
            m104267y0();
            return;
        }
        String str = BifrostLayout.f23320c;
        m220523Y("notify begin ");
        System.currentTimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ListIterator<pol0> listIterator = this.f205090a.listIterator();
        List<pol0> list = this.f205090a;
        boolean z2 = list == null || list.isEmpty();
        pol0 pol0Var = null;
        int i2 = -1;
        while (listIterator.hasNext()) {
            pol0 next = listIterator.next();
            VirtualState virtualState = next.f150539j;
            VirtualState virtualState2 = VirtualState.PRE_OUT;
            if (virtualState == virtualState2) {
                if (!m104265w0(next.f150531b, next.f150534e)) {
                    this.f205098i.m219535a(next.f150540k);
                    arrayList2.add(next);
                    listIterator.remove();
                    int iIndexOfChild = m220507B().indexOfChild(next.f150530a);
                    if (BifrostLayout.f23321d) {
                        if (iIndexOfChild < 0) {
                            Objects.toString(next.f150539j);
                            next.f150530a.hashCode();
                        } else {
                            Objects.toString(next.f150539j);
                            next.f150530a.hashCode();
                        }
                    }
                    m220507B().removeViewInLayout(next.f150530a);
                    if (i2 < 0) {
                        i2 = next.f150534e;
                    }
                    String str2 = BifrostLayout.f23320c;
                } else if (i2 < 0) {
                    i2 = next.f150534e + 1;
                }
            } else if (virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT) {
                arrayList2.add(next);
                listIterator.remove();
                int iIndexOfChild2 = m220507B().indexOfChild(next.f150530a);
                if (BifrostLayout.f23321d) {
                    if (iIndexOfChild2 < 0) {
                        Objects.toString(next.f150539j);
                        next.f150530a.hashCode();
                    } else {
                        Objects.toString(next.f150539j);
                        next.f150530a.hashCode();
                        next.hashCode();
                    }
                }
                m220507B().removeViewInLayout(next.f150530a);
                if (i2 < 0) {
                    i2 = next.f150534e;
                }
            } else if (virtualState == virtualState2) {
                i2 = next.f150534e;
                pol0Var = next;
            }
        }
        if (BifrostLayout.f23321d) {
            sb.append(" setp1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
            jUptimeMillis2 = SystemClock.uptimeMillis();
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iMax = Math.max(0, Math.min(this.f205094e.mo100899f(), m220506A().mo107797m()));
        ArrayList<pol0> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str3 = BifrostLayout.f23320c;
        if (BifrostLayout.f23321d) {
            sb.append(" setp1.1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
        }
        int i3 = 0;
        int iMo99355r0 = 0;
        while (i3 < iMax) {
            int i4 = i3 + i2;
            if (i4 >= this.f205094e.mo100899f()) {
                j = jUptimeMillis2;
            } else {
                int iMo100901h = this.f205094e.mo100901h(i4);
                j = jUptimeMillis2;
                String strMo100902i = this.f205094e.mo100902i(i4);
                if (pol0Var == null || !TextUtils.equals(strMo100902i, pol0Var.f150531b) || pol0Var.f150533d != iMo100901h) {
                    if (BifrostLayout.f23321d) {
                        arrayList2.size();
                    }
                    pol0 pol0VarM104264v0 = m104264v0(arrayList2, iMo100901h, strMo100902i);
                    if (BifrostLayout.f23321d) {
                        arrayList2.size();
                    }
                    if (pol0VarM104264v0 == null) {
                        pol0VarM104264v0 = new pol0();
                        arrayList = arrayList2;
                        View viewM178472a = this.f205100k.m178472a(iMo100901h);
                        if (viewM178472a == null) {
                            i = iMax;
                            z = z2;
                            viewM178472a = this.f205094e.mo100898e(iMo100901h, m220553r(), o7r.m163037a(m220553r()));
                            if (BifrostLayout.f23321d) {
                                viewM178472a.hashCode();
                            }
                        } else {
                            i = iMax;
                            z = z2;
                            if (BifrostLayout.f23321d) {
                                viewM178472a.hashCode();
                            }
                        }
                        pol0VarM104264v0.f150533d = iMo100901h;
                        pol0VarM104264v0.f150530a = viewM178472a;
                    } else {
                        arrayList = arrayList2;
                        i = iMax;
                        z = z2;
                        if (BifrostLayout.f23321d) {
                            pol0VarM104264v0.f150530a.hashCode();
                            pol0VarM104264v0.hashCode();
                        }
                    }
                    if (BifrostLayout.f23321d && pol0VarM104264v0.f150530a.getParent() != null) {
                        pol0VarM104264v0.f150530a.hashCode();
                    }
                    jn2.m142261n(pol0VarM104264v0.f150530a);
                    pol0VarM104264v0.m170602c(strMo100902i, this.f205094e.mo100900g(i4));
                    pol0VarM104264v0.f150534e = i4;
                    pol0VarM104264v0.f150539j = VirtualState.INIT;
                    pol0VarM104264v0.f150535f = iMo99355r0;
                    arrayList3.add(pol0VarM104264v0);
                    Object objMo100900g = this.f205094e.mo100900g(i4);
                    if (objMo100900g instanceof kj4) {
                        iMo99355r0 += mo99355r0((kj4) objMo100900g, arrayList4, pol0VarM104264v0);
                    }
                    if (BifrostLayout.f23321d) {
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
        if (BifrostLayout.f23321d) {
            sb.append(" setp2:");
            sb.append(SystemClock.uptimeMillis() - j2);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        } else {
            jUptimeMillis = j2;
        }
        if (!arrayList5.isEmpty()) {
            for (pol0 pol0Var2 : arrayList5) {
                m220507B().removeViewInLayout(pol0Var2.f150530a);
                this.f205100k.m178473b(pol0Var2);
                this.f205094e.mo100903l(pol0Var2.f150530a, false);
            }
        }
        System.currentTimeMillis();
        if (BifrostLayout.f23321d) {
            arrayList3.size();
        }
        if (BifrostLayout.f23321d) {
            sb.append(" setp3:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        for (pol0 pol0Var3 : arrayList3) {
            if (BifrostLayout.f23321d) {
                String str4 = pol0Var3.f150531b;
                pol0Var3.f150530a.hashCode();
            }
            this.f205090a.add(pol0Var3);
            if (BifrostLayout.f23321d && pol0Var3.f150530a.getParent() != null) {
                pol0Var3.f150530a.hashCode();
            }
            m220507B().m38794s(pol0Var3.f150530a);
            boolean zM200296J = vwb.m200296J(arrayList4);
            yw2 yw2Var = this.f205094e;
            if (zM200296J) {
                yw2Var.mo100897d(pol0Var3.f150530a, pol0Var3.f150534e);
                String str5 = BifrostLayout.f23320c;
            } else {
                yw2Var.mo100897d(pol0Var3.f150530a, pol0Var3.f150534e);
                String str6 = BifrostLayout.f23320c;
            }
            if (BifrostLayout.f23321d) {
                sb.append(" setp bind:");
                sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
                sb.append("|");
                jUptimeMillis = SystemClock.uptimeMillis();
            }
            if (BifrostLayout.f23321d) {
                pol0Var3.f150530a.hashCode();
            }
        }
        if (BifrostLayout.f23321d) {
            sb.append(" setp4:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f23321d) {
            System.currentTimeMillis();
        }
        if (z3) {
            m104261s0();
        } else if (arrayList4.size() > 0) {
            this.f205098i.m219539e(arrayList4);
        }
        if (BifrostLayout.f23321d) {
            sb.append(" setp5:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f23321d) {
            System.currentTimeMillis();
        }
        this.f205092c.m142264f();
        if (BifrostLayout.f23321d) {
            sb.append(" setp6:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            SystemClock.uptimeMillis();
        }
        String str7 = BifrostLayout.f23320c;
        m220523Y("notify data ");
        m220507B().requestLayout();
    }

    @Override // p149l.jl4
    /* JADX INFO: renamed from: b */
    public String mo104260b() {
        return m220559z("notify");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX INFO: renamed from: r0 */
    public int mo99355r0(kj4 kj4Var, List<og4> list, pol0 pol0Var) {
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
        if (cardOperation == null || pol0Var.f150534e != 0) {
            return 0;
        }
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        og4 og4Var = new og4(pol0Var.f150540k, pol0Var);
        og4Var.f143801a = new zo0.InterpolatorC21740a();
        og4Var.f143801a = this.f205093d.mo122784d();
        og4Var.f143802b = CardAnimType.ANIM_INSERT;
        og4Var.f143804d = zo0.f204057j;
        this.f205095f.m172940e();
        qo0 qo0Var = new qo0();
        qo0Var.m175717b();
        int i = C16003b.f77728a[cardOperation.ordinal()];
        if (i == 1) {
            qo0Var.f155520c = this.f205091b.getMeasuredWidth() * (-1.2f);
            qo0Var.f155518a = 0.0f;
            qo0Var.f155522e = 1.0f;
            qo0Var.f155524g = 15.0f;
        } else if (i == 2) {
            qo0Var.f155520c = this.f205091b.getMeasuredWidth() * 1.2f;
            qo0Var.f155518a = 0.0f;
            qo0Var.f155522e = 1.0f;
            qo0Var.f155524g = -15.0f;
        } else if (i == 3) {
            qo0Var.f155520c = 0.0f;
            float measuredHeight = this.f205091b.getMeasuredHeight() * (-1.0f);
            qo0Var.f155518a = measuredHeight;
            qo0Var.f155522e = 1.0f;
            qo0Var.f155524g = 0.0f;
            pol0Var.f150530a.setTranslationY(measuredHeight);
        }
        pol0Var.f150538i = cardOperation;
        og4Var.m164160a(pol0Var.f150540k);
        og4Var.f143806f = qo0Var;
        list.add(og4Var);
        return -1;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m104261s0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = m220507B().animate();
        m220507B().setAlpha(0.0f);
        m220507B().setScaleX(0.9f);
        m220507B().setScaleY(0.9f);
        viewPropertyAnimatorAnimate.setListener(new C16002a());
        viewPropertyAnimatorAnimate.setDuration(500L).setStartDelay(200L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }

    /* JADX INFO: renamed from: t0 */
    public final int m104262t0(pol0 pol0Var, int i, int i2, List<og4> list) {
        jn2.m142261n(pol0Var.f150530a);
        pol0Var.m170602c(this.f205094e.mo100902i(i), this.f205094e.mo100900g(i));
        pol0Var.f150534e = i;
        pol0Var.f150539j = VirtualState.INIT;
        pol0Var.f150535f = i2;
        pol0Var.f150537h = true;
        Object objMo100900g = this.f205094e.mo100900g(i);
        return objMo100900g instanceof kj4 ? i2 + mo99355r0((kj4) objMo100900g, list, pol0Var) : i2;
    }

    /* JADX INFO: renamed from: u0 */
    public C22306c<roj0> mo104263u0() {
        return this.f77725x;
    }

    /* JADX INFO: renamed from: v0 */
    public final pol0 m104264v0(List<pol0> list, int i, String str) {
        if (list.isEmpty()) {
            return null;
        }
        ListIterator<pol0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            pol0 next = listIterator.next();
            if (next.f150533d == i && TextUtils.equals(str, next.f150531b)) {
                listIterator.remove();
                return next;
            }
        }
        ListIterator listIterator2 = Lists.m15930q(list).listIterator();
        while (listIterator2.hasNext()) {
            pol0 pol0Var = (pol0) listIterator2.next();
            if (pol0Var.f150533d == i) {
                listIterator2.remove();
                return pol0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m104265w0(String str, int i) {
        int iMo100899f = this.f205094e.mo100899f();
        for (int i2 = 0; i2 < iMo100899f; i2++) {
            if (TextUtils.equals(this.f205094e.mo100902i(i2), str) && i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m104266x0() {
        if (BifrostLayout.f23321d) {
            int childCount = m220507B().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m220507B().getChildAt(i);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" : ");
                sb.append(childAt.getClass().getSimpleName());
                sb.append(" ,");
                sb.append(childAt.hashCode());
            }
            String str = BifrostLayout.f23320c;
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
    public final void m104267y0() {
        pol0 next;
        pol0 pol0Var;
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.f77726y = true;
        String str = BifrostLayout.f23320c;
        List<pol0> list = this.f205090a;
        boolean z4 = false;
        boolean z5 = list == null || list.isEmpty();
        System.currentTimeMillis();
        ListIterator<pol0> listIterator = this.f205090a.listIterator();
        int iMin = Math.min(this.f205094e.mo100899f(), m220506A().mo107797m());
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
                if (BifrostLayout.f23321d) {
                    String str2 = next.f150531b;
                }
                next.f150536g = z3;
                VirtualState virtualState = next.f150539j;
                if (virtualState == VirtualState.ANIM_OUT) {
                    next.f150536g = z4;
                } else if (virtualState != VirtualState.PRE_OUT) {
                    if (i2 >= iMin) {
                    }
                } else if (m104265w0(next.f150531b, next.f150534e)) {
                    if (r8 < 0) {
                        r8 = next.f150534e + (z3 ? 1 : 0);
                    }
                    next.f150536g = z4;
                } else {
                    this.f205098i.m219535a(next.f150540k);
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
            if (i5 >= this.f205094e.mo100899f()) {
                i2++;
                i = i4;
            } else {
                if (next == null || next.f150533d == this.f205094e.mo100901h(i5)) {
                    pol0Var = next;
                    z = z4;
                } else {
                    int i6 = i5 + 1;
                    if (i6 < this.f205094e.mo100899f() && next.f150533d == this.f205094e.mo100901h(i6) && listIterator.hasPrevious()) {
                        listIterator.previous();
                        String str3 = BifrostLayout.f23320c;
                        z = z3 ? 1 : 0;
                    } else {
                        z = z4;
                    }
                    String str4 = BifrostLayout.f23320c;
                    pol0Var = null;
                }
                if (pol0Var == null || pol0Var.f150533d != this.f205094e.mo100901h(i5)) {
                    int iMo100901h = this.f205094e.mo100901h(i5);
                    pol0 pol0Var2 = new pol0();
                    View viewM178472a = this.f205100k.m178472a(iMo100901h);
                    if (viewM178472a == null) {
                        viewM178472a = this.f205094e.mo100898e(iMo100901h, m220553r(), o7r.m163037a(m220553r()));
                        String str5 = BifrostLayout.f23320c;
                    } else {
                        String str6 = BifrostLayout.f23320c;
                    }
                    pol0Var2.f150533d = iMo100901h;
                    pol0Var2.f150530a = viewM178472a;
                    int iM104262t0 = m104262t0(pol0Var2, i5, i3, arrayList);
                    m220507B().m38795t(pol0Var2.f150530a, Math.min(i4, m220507B().getChildCount()));
                    if (!z) {
                        i4 = i + 2;
                    }
                    i2++;
                    listIterator.add(pol0Var2);
                    this.f205092c.m142266h(pol0Var2.f150530a, i5, pol0Var2);
                    i3 = iM104262t0;
                    z2 = z5;
                } else {
                    this.f205094e.mo100903l(pol0Var.f150530a, z3);
                    int iM104262t1 = m104262t0(pol0Var, i5, i3, arrayList);
                    pol0Var.f150536g = false;
                    i2++;
                    String str7 = BifrostLayout.f23320c;
                    z2 = z5;
                    i3 = iM104262t1;
                }
                i = i4;
                z5 = z2;
                z3 = true;
                z4 = false;
            }
        }
        ListIterator<pol0> listIterator2 = this.f205090a.listIterator();
        while (listIterator2.hasNext()) {
            pol0 next2 = listIterator2.next();
            if (next2.f150536g) {
                this.f205091b.removeViewInLayout(next2.f150530a);
                this.f205094e.mo100903l(next2.f150530a, z4);
                String str8 = BifrostLayout.f23320c;
                this.f205100k.m178473b(next2);
                listIterator2.remove();
            } else if (next2.f150537h) {
                this.f205094e.mo100897d(next2.f150530a, next2.f150534e);
                if (this.f205093d.mo122788h() && this.f205093d.mo122781a() < 1.0f) {
                    int i7 = next2.f150534e;
                    if (i7 == z3) {
                        next2.f150530a.setAlpha(Math.min(1.0f, Math.max(this.f205093d.mo122781a(), this.f205093d.mo122781a())));
                    } else {
                        View view = next2.f150530a;
                        if (i7 == 2) {
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                    }
                }
            }
            next2.f150536g = z4;
            next2.f150537h = z4;
        }
        if (z5) {
            m104261s0();
        } else if (arrayList.size() > 0) {
            this.f205098i.m219539e(arrayList);
        }
        if (BifrostLayout.f23321d) {
            System.currentTimeMillis();
        }
        this.f205092c.m142264f();
        if (BifrostLayout.f23321d) {
            this.f205090a.size();
        }
        m220523Y("notify data ");
        m220507B().requestLayout();
        this.f77726y = z4;
        m104266x0();
        m220554s().mo102794a(this.f205094e.mo100899f());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo104268z0() {
        pol0 pol0VarM220509G = m220509G();
        if (pol0VarM220509G != null) {
            this.f205098i.m219536b();
            VirtualState virtualState = VirtualState.RENDING;
            pol0VarM220509G.f150539j = virtualState;
            og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
            og4Var.f143802b = CardAnimType.ANIM_BACK;
            og4Var.m164160a(pol0VarM220509G.f150540k);
            og4Var.m164161b(virtualState);
            qo0 qo0Var = new qo0();
            og4Var.f143804d = zo0.f204058k;
            og4Var.f143805e = 0;
            og4Var.m164161b(virtualState);
            qo0Var.m175720e(m220509G().f150530a);
            qo0Var.m175717b();
            og4Var.m164173n(qo0Var);
            this.f205098i.m219538d(og4Var);
        }
    }

    /* JADX INFO: renamed from: l.bx2$a */
    public class C16002a implements Animator.AnimatorListener {
        public C16002a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            bx2.this.f77725x.onNext(roj0.f160388a);
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
