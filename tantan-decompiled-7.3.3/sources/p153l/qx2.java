package p153l;

import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qx2 extends ox2 {

    /* JADX INFO: renamed from: x */
    public C22508b<uxj0> f160000x;

    /* JADX INFO: renamed from: y */
    public boolean f160001y;

    /* JADX INFO: renamed from: l.qx2$b */
    public static /* synthetic */ class C19688b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160003a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f160003a = iArr;
            try {
                iArr[CardOperation.SWIPE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160003a[CardOperation.SWIPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f160003a[CardOperation.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public qx2(Context context) {
        super(context);
        this.f160000x = C22508b.m222767b();
        this.f160001y = false;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo160614A0(CardOperation cardOperation, boolean z) {
        txl0 txl0VarM169622G = m169622G();
        if (txl0VarM169622G == null) {
            return false;
        }
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        this.f149599i.m202046a(txl0VarM169622G.f176578k);
        View view = txl0VarM169622G.f176568a;
        this.f149596f.m195495e();
        this.f149599i.m202047b();
        this.f149595e.mo165055j(view);
        if (this.f149599i.m202053h(txl0VarM169622G.f176578k) && z && !vo0.f184978y) {
            if (BifrostLayout.f24063d) {
                cardOperation.name();
            }
            return false;
        }
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        txl0VarM169622G.f176577j = VirtualState.PRE_OUT;
        nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
        nh4Var.f141910d = vo0.f184962i;
        nh4Var.f141908b = CardAnimType.ANIM_OUT;
        nh4Var.f141914h = cardOperation;
        nh4Var.f141915i = z ? vo0.f184978y : true;
        mo0 mo0Var = new mo0();
        nh4Var.m163026a(txl0VarM169622G.f176578k);
        nh4Var.m163027b(VirtualState.RENDING);
        nh4Var.f141912f = mo0Var;
        nh4Var.f141911e = -1;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        mo0Var.m159223e(txl0VarM169622G.f176568a);
        if (mo0Var.f137755c == 0.0f && mo0Var.f137753a == 0.0f) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(measuredHeight / 5);
        }
        int i = C19688b.f160003a[cardOperation.ordinal()];
        if (i == 1) {
            mo0Var.f137756d = vo0.f184968o * (-1.0f) * measuredWidth;
            mo0Var.f137758f = 1.0f;
            mo0Var.f137760h = vo0.f184970q * (-1.0f);
            long j = vo0.f184966m;
            if (j > 1) {
                mo0Var.f137754b = (((-j) / 2) + (System.currentTimeMillis() % vo0.f184966m)) * vo0.f184965l;
            }
            mo0Var.f137764l = 1.0f;
        } else if (i == 2) {
            mo0Var.f137756d = vo0.f184968o * measuredWidth;
            mo0Var.f137758f = 1.0f;
            mo0Var.f137760h = vo0.f184970q;
            long j2 = vo0.f184966m;
            if (j2 > 1) {
                mo0Var.f137754b = (((-j2) / 2) + (System.currentTimeMillis() % vo0.f184966m)) * vo0.f184965l;
            }
            mo0Var.f137764l = 1.0f;
        } else if (i == 3) {
            mo0Var.f137754b = vo0.f184968o * (-1.0f) * measuredHeight;
            mo0Var.f137758f = 1.0f;
            mo0Var.f137760h = 0.0f;
            nh4Var.f141910d = vo0.f184962i;
            mo0Var.f137764l = 1.0f;
        }
        nh4Var.m163041p(new PathInterpolator(vo0.f184969p, 0.0f, 1.0f, 1.0f));
        this.f149594d.mo164121f(nh4Var);
        this.f149599i.m202049d(nh4Var);
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p153l.im4
    /* JADX INFO: renamed from: a */
    public void mo140726a() {
        long jUptimeMillis;
        long j;
        ArrayList arrayList;
        int i;
        boolean z;
        if (vo0.f184945C) {
            m178569y0();
            return;
        }
        String str = BifrostLayout.f24062c;
        m169636Y("notify begin ");
        System.currentTimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ListIterator<txl0> listIterator = this.f149591a.listIterator();
        List<txl0> list = this.f149591a;
        boolean z2 = list == null || list.isEmpty();
        txl0 txl0Var = null;
        int i2 = -1;
        while (listIterator.hasNext()) {
            txl0 next = listIterator.next();
            VirtualState virtualState = next.f176577j;
            VirtualState virtualState2 = VirtualState.PRE_OUT;
            if (virtualState == virtualState2) {
                if (!m178567w0(next.f176569b, next.f176572e)) {
                    this.f149599i.m202046a(next.f176578k);
                    arrayList2.add(next);
                    listIterator.remove();
                    int iIndexOfChild = m169620B().indexOfChild(next.f176568a);
                    if (BifrostLayout.f24063d) {
                        if (iIndexOfChild < 0) {
                            Objects.toString(next.f176577j);
                            next.f176568a.hashCode();
                        } else {
                            Objects.toString(next.f176577j);
                            next.f176568a.hashCode();
                        }
                    }
                    m169620B().removeViewInLayout(next.f176568a);
                    if (i2 < 0) {
                        i2 = next.f176572e;
                    }
                    String str2 = BifrostLayout.f24062c;
                } else if (i2 < 0) {
                    i2 = next.f176572e + 1;
                }
            } else if (virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT) {
                arrayList2.add(next);
                listIterator.remove();
                int iIndexOfChild2 = m169620B().indexOfChild(next.f176568a);
                if (BifrostLayout.f24063d) {
                    if (iIndexOfChild2 < 0) {
                        Objects.toString(next.f176577j);
                        next.f176568a.hashCode();
                    } else {
                        Objects.toString(next.f176577j);
                        next.f176568a.hashCode();
                        next.hashCode();
                    }
                }
                m169620B().removeViewInLayout(next.f176568a);
                if (i2 < 0) {
                    i2 = next.f176572e;
                }
            } else if (virtualState == virtualState2) {
                i2 = next.f176572e;
                txl0Var = next;
            }
        }
        if (BifrostLayout.f24063d) {
            sb.append(" setp1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
            jUptimeMillis2 = SystemClock.uptimeMillis();
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iMax = Math.max(0, Math.min(this.f149595e.mo105831f(), m169619A().mo98958m()));
        ArrayList<txl0> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str3 = BifrostLayout.f24062c;
        if (BifrostLayout.f24063d) {
            sb.append(" setp1.1:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis2);
            sb.append("|");
        }
        int i3 = 0;
        int iMo174103r0 = 0;
        while (i3 < iMax) {
            int i4 = i3 + i2;
            if (i4 >= this.f149595e.mo105831f()) {
                j = jUptimeMillis2;
            } else {
                int iMo105833h = this.f149595e.mo105833h(i4);
                j = jUptimeMillis2;
                String strMo105834i = this.f149595e.mo105834i(i4);
                if (txl0Var == null || !TextUtils.equals(strMo105834i, txl0Var.f176569b) || txl0Var.f176571d != iMo105833h) {
                    if (BifrostLayout.f24063d) {
                        arrayList2.size();
                    }
                    txl0 txl0VarM178566v0 = m178566v0(arrayList2, iMo105833h, strMo105834i);
                    if (BifrostLayout.f24063d) {
                        arrayList2.size();
                    }
                    if (txl0VarM178566v0 == null) {
                        txl0VarM178566v0 = new txl0();
                        arrayList = arrayList2;
                        View viewM211129a = this.f149601k.m211129a(iMo105833h);
                        if (viewM211129a == null) {
                            i = iMax;
                            z = z2;
                            viewM211129a = this.f149595e.mo105830e(iMo105833h, m169667r(), p9r.m171370a(m169667r()));
                            if (BifrostLayout.f24063d) {
                                viewM211129a.hashCode();
                            }
                        } else {
                            i = iMax;
                            z = z2;
                            if (BifrostLayout.f24063d) {
                                viewM211129a.hashCode();
                            }
                        }
                        txl0VarM178566v0.f176571d = iMo105833h;
                        txl0VarM178566v0.f176568a = viewM211129a;
                    } else {
                        arrayList = arrayList2;
                        i = iMax;
                        z = z2;
                        if (BifrostLayout.f24063d) {
                            txl0VarM178566v0.f176568a.hashCode();
                            txl0VarM178566v0.hashCode();
                        }
                    }
                    if (BifrostLayout.f24063d && txl0VarM178566v0.f176568a.getParent() != null) {
                        txl0VarM178566v0.f176568a.hashCode();
                    }
                    qn2.m177167n(txl0VarM178566v0.f176568a);
                    txl0VarM178566v0.m193510c(strMo105834i, this.f149595e.mo105832g(i4));
                    txl0VarM178566v0.f176572e = i4;
                    txl0VarM178566v0.f176577j = VirtualState.INIT;
                    txl0VarM178566v0.f176573f = iMo174103r0;
                    arrayList3.add(txl0VarM178566v0);
                    Object objMo105832g = this.f149595e.mo105832g(i4);
                    if (objMo105832g instanceof jk4) {
                        iMo174103r0 += mo174103r0((jk4) objMo105832g, arrayList4, txl0VarM178566v0);
                    }
                    if (BifrostLayout.f24063d) {
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
        if (BifrostLayout.f24063d) {
            sb.append(" setp2:");
            sb.append(SystemClock.uptimeMillis() - j2);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        } else {
            jUptimeMillis = j2;
        }
        if (!arrayList5.isEmpty()) {
            for (txl0 txl0Var2 : arrayList5) {
                m169620B().removeViewInLayout(txl0Var2.f176568a);
                this.f149601k.m211130b(txl0Var2);
                this.f149595e.mo105835l(txl0Var2.f176568a, false);
            }
        }
        System.currentTimeMillis();
        if (BifrostLayout.f24063d) {
            arrayList3.size();
        }
        if (BifrostLayout.f24063d) {
            sb.append(" setp3:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        for (txl0 txl0Var3 : arrayList3) {
            if (BifrostLayout.f24063d) {
                String str4 = txl0Var3.f176569b;
                txl0Var3.f176568a.hashCode();
            }
            this.f149591a.add(txl0Var3);
            if (BifrostLayout.f24063d && txl0Var3.f176568a.getParent() != null) {
                txl0Var3.f176568a.hashCode();
            }
            m169620B().m39797s(txl0Var3.f176568a);
            boolean zM147479J = jyb.m147479J(arrayList4);
            nx2 nx2Var = this.f149595e;
            if (zM147479J) {
                nx2Var.mo105829d(txl0Var3.f176568a, txl0Var3.f176572e);
                String str5 = BifrostLayout.f24062c;
            } else {
                nx2Var.mo105829d(txl0Var3.f176568a, txl0Var3.f176572e);
                String str6 = BifrostLayout.f24062c;
            }
            if (BifrostLayout.f24063d) {
                sb.append(" setp bind:");
                sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
                sb.append("|");
                jUptimeMillis = SystemClock.uptimeMillis();
            }
            if (BifrostLayout.f24063d) {
                txl0Var3.f176568a.hashCode();
            }
        }
        if (BifrostLayout.f24063d) {
            sb.append(" setp4:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f24063d) {
            System.currentTimeMillis();
        }
        if (z3) {
            m178564s0();
        } else if (arrayList4.size() > 0) {
            this.f149599i.m202050e(arrayList4);
        }
        if (BifrostLayout.f24063d) {
            sb.append(" setp5:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        if (BifrostLayout.f24063d) {
            System.currentTimeMillis();
        }
        this.f149593c.m177170f();
        if (BifrostLayout.f24063d) {
            sb.append(" setp6:");
            sb.append(SystemClock.uptimeMillis() - jUptimeMillis);
            sb.append("|");
            SystemClock.uptimeMillis();
        }
        String str7 = BifrostLayout.f24062c;
        m169636Y("notify data ");
        m169620B().requestLayout();
    }

    @Override // p153l.im4
    /* JADX INFO: renamed from: b */
    public String mo140727b() {
        return m169673z("notify");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX INFO: renamed from: r0 */
    public int mo174103r0(jk4 jk4Var, List<nh4> list, txl0 txl0Var) {
        CardOperation cardOperation;
        int preBackOperation = jk4Var.getPreBackOperation();
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
        jk4Var.resetPreAction();
        if (cardOperation == null || txl0Var.f176572e != 0) {
            return 0;
        }
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        nh4 nh4Var = new nh4(txl0Var.f176578k, txl0Var);
        nh4Var.f141907a = new vo0.InterpolatorC20871a();
        nh4Var.f141907a = this.f149594d.mo164119d();
        nh4Var.f141908b = CardAnimType.ANIM_INSERT;
        nh4Var.f141910d = vo0.f184963j;
        this.f149596f.m195495e();
        mo0 mo0Var = new mo0();
        mo0Var.m159220b();
        int i = C19688b.f160003a[cardOperation.ordinal()];
        if (i == 1) {
            mo0Var.f137755c = this.f149592b.getMeasuredWidth() * (-1.2f);
            mo0Var.f137753a = 0.0f;
            mo0Var.f137757e = 1.0f;
            mo0Var.f137759g = 15.0f;
        } else if (i == 2) {
            mo0Var.f137755c = this.f149592b.getMeasuredWidth() * 1.2f;
            mo0Var.f137753a = 0.0f;
            mo0Var.f137757e = 1.0f;
            mo0Var.f137759g = -15.0f;
        } else if (i == 3) {
            mo0Var.f137755c = 0.0f;
            float measuredHeight = this.f149592b.getMeasuredHeight() * (-1.0f);
            mo0Var.f137753a = measuredHeight;
            mo0Var.f137757e = 1.0f;
            mo0Var.f137759g = 0.0f;
            txl0Var.f176568a.setTranslationY(measuredHeight);
        }
        txl0Var.f176576i = cardOperation;
        nh4Var.m163026a(txl0Var.f176578k);
        nh4Var.f141912f = mo0Var;
        list.add(nh4Var);
        return -1;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m178564s0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = m169620B().animate();
        m169620B().setAlpha(0.0f);
        m169620B().setScaleX(0.9f);
        m169620B().setScaleY(0.9f);
        viewPropertyAnimatorAnimate.setListener(new C19687a());
        viewPropertyAnimatorAnimate.setDuration(500L).setStartDelay(200L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }

    /* JADX INFO: renamed from: t0 */
    public final int m178565t0(txl0 txl0Var, int i, int i2, List<nh4> list) {
        qn2.m177167n(txl0Var.f176568a);
        txl0Var.m193510c(this.f149595e.mo105834i(i), this.f149595e.mo105832g(i));
        txl0Var.f176572e = i;
        txl0Var.f176577j = VirtualState.INIT;
        txl0Var.f176573f = i2;
        txl0Var.f176575h = true;
        Object objMo105832g = this.f149595e.mo105832g(i);
        return objMo105832g instanceof jk4 ? i2 + mo174103r0((jk4) objMo105832g, list, txl0Var) : i2;
    }

    /* JADX INFO: renamed from: u0 */
    public C22421c<uxj0> mo160620u0() {
        return this.f160000x;
    }

    /* JADX INFO: renamed from: v0 */
    public final txl0 m178566v0(List<txl0> list, int i, String str) {
        if (list.isEmpty()) {
            return null;
        }
        ListIterator<txl0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            txl0 next = listIterator.next();
            if (next.f176571d == i && TextUtils.equals(str, next.f176569b)) {
                listIterator.remove();
                return next;
            }
        }
        ListIterator listIterator2 = Lists.m15984q(list).listIterator();
        while (listIterator2.hasNext()) {
            txl0 txl0Var = (txl0) listIterator2.next();
            if (txl0Var.f176571d == i) {
                listIterator2.remove();
                return txl0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m178567w0(String str, int i) {
        int iMo105831f = this.f149595e.mo105831f();
        for (int i2 = 0; i2 < iMo105831f; i2++) {
            if (TextUtils.equals(this.f149595e.mo105834i(i2), str) && i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m178568x0() {
        if (BifrostLayout.f24063d) {
            int childCount = m169620B().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m169620B().getChildAt(i);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" : ");
                sb.append(childAt.getClass().getSimpleName());
                sb.append(" ,");
                sb.append(childAt.hashCode());
            }
            String str = BifrostLayout.f24062c;
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
    public final void m178569y0() {
        txl0 next;
        txl0 txl0Var;
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.f160001y = true;
        String str = BifrostLayout.f24062c;
        List<txl0> list = this.f149591a;
        boolean z4 = false;
        boolean z5 = list == null || list.isEmpty();
        System.currentTimeMillis();
        ListIterator<txl0> listIterator = this.f149591a.listIterator();
        int iMin = Math.min(this.f149595e.mo105831f(), m169619A().mo98958m());
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
                if (BifrostLayout.f24063d) {
                    String str2 = next.f176569b;
                }
                next.f176574g = z3;
                VirtualState virtualState = next.f176577j;
                if (virtualState == VirtualState.ANIM_OUT) {
                    next.f176574g = z4;
                } else if (virtualState != VirtualState.PRE_OUT) {
                    if (i2 >= iMin) {
                    }
                } else if (m178567w0(next.f176569b, next.f176572e)) {
                    if (r8 < 0) {
                        r8 = next.f176572e + (z3 ? 1 : 0);
                    }
                    next.f176574g = z4;
                } else {
                    this.f149599i.m202046a(next.f176578k);
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
            if (i5 >= this.f149595e.mo105831f()) {
                i2++;
                i = i4;
            } else {
                if (next == null || next.f176571d == this.f149595e.mo105833h(i5)) {
                    txl0Var = next;
                    z = z4;
                } else {
                    int i6 = i5 + 1;
                    if (i6 < this.f149595e.mo105831f() && next.f176571d == this.f149595e.mo105833h(i6) && listIterator.hasPrevious()) {
                        listIterator.previous();
                        String str3 = BifrostLayout.f24062c;
                        z = z3 ? 1 : 0;
                    } else {
                        z = z4;
                    }
                    String str4 = BifrostLayout.f24062c;
                    txl0Var = null;
                }
                if (txl0Var == null || txl0Var.f176571d != this.f149595e.mo105833h(i5)) {
                    int iMo105833h = this.f149595e.mo105833h(i5);
                    txl0 txl0Var2 = new txl0();
                    View viewM211129a = this.f149601k.m211129a(iMo105833h);
                    if (viewM211129a == null) {
                        viewM211129a = this.f149595e.mo105830e(iMo105833h, m169667r(), p9r.m171370a(m169667r()));
                        String str5 = BifrostLayout.f24062c;
                    } else {
                        String str6 = BifrostLayout.f24062c;
                    }
                    txl0Var2.f176571d = iMo105833h;
                    txl0Var2.f176568a = viewM211129a;
                    int iM178565t0 = m178565t0(txl0Var2, i5, i3, arrayList);
                    m169620B().m39798t(txl0Var2.f176568a, Math.min(i4, m169620B().getChildCount()));
                    if (!z) {
                        i4 = i + 2;
                    }
                    i2++;
                    listIterator.add(txl0Var2);
                    this.f149593c.m177172h(txl0Var2.f176568a, i5, txl0Var2);
                    i3 = iM178565t0;
                    z2 = z5;
                } else {
                    this.f149595e.mo105835l(txl0Var.f176568a, z3);
                    int iM178565t1 = m178565t0(txl0Var, i5, i3, arrayList);
                    txl0Var.f176574g = false;
                    i2++;
                    String str7 = BifrostLayout.f24062c;
                    z2 = z5;
                    i3 = iM178565t1;
                }
                i = i4;
                z5 = z2;
                z3 = true;
                z4 = false;
            }
        }
        ListIterator<txl0> listIterator2 = this.f149591a.listIterator();
        while (listIterator2.hasNext()) {
            txl0 next2 = listIterator2.next();
            if (next2.f176574g) {
                this.f149592b.removeViewInLayout(next2.f176568a);
                this.f149595e.mo105835l(next2.f176568a, z4);
                String str8 = BifrostLayout.f24062c;
                this.f149601k.m211130b(next2);
                listIterator2.remove();
            } else if (next2.f176575h) {
                this.f149595e.mo105829d(next2.f176568a, next2.f176572e);
                if (this.f149594d.mo164123h() && this.f149594d.mo164116a() < 1.0f) {
                    int i7 = next2.f176572e;
                    if (i7 == z3) {
                        next2.f176568a.setAlpha(Math.min(1.0f, Math.max(this.f149594d.mo164116a(), this.f149594d.mo164116a())));
                    } else {
                        View view = next2.f176568a;
                        if (i7 == 2) {
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                    }
                }
            }
            next2.f176574g = z4;
            next2.f176575h = z4;
        }
        if (z5) {
            m178564s0();
        } else if (arrayList.size() > 0) {
            this.f149599i.m202050e(arrayList);
        }
        if (BifrostLayout.f24063d) {
            System.currentTimeMillis();
        }
        this.f149593c.m177170f();
        if (BifrostLayout.f24063d) {
            this.f149591a.size();
        }
        m169636Y("notify data ");
        m169620B().requestLayout();
        this.f160001y = z4;
        m178568x0();
        m169668s().mo136416a(this.f149595e.mo105831f());
    }

    /* JADX INFO: renamed from: z0 */
    public void mo160621z0() {
        txl0 txl0VarM169622G = m169622G();
        if (txl0VarM169622G != null) {
            this.f149599i.m202047b();
            VirtualState virtualState = VirtualState.RENDING;
            txl0VarM169622G.f176577j = virtualState;
            nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
            nh4Var.f141908b = CardAnimType.ANIM_BACK;
            nh4Var.m163026a(txl0VarM169622G.f176578k);
            nh4Var.m163027b(virtualState);
            mo0 mo0Var = new mo0();
            nh4Var.f141910d = vo0.f184964k;
            nh4Var.f141911e = 0;
            nh4Var.m163027b(virtualState);
            mo0Var.m159223e(m169622G().f176568a);
            mo0Var.m159220b();
            nh4Var.m163039n(mo0Var);
            this.f149599i.m202049d(nh4Var);
        }
    }

    /* JADX INFO: renamed from: l.qx2$a */
    public class C19687a implements Animator.AnimatorListener {
        public C19687a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            qx2.this.f160000x.onNext(uxj0.f181467a);
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
