package p006l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksStateExpandView;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksStateHideView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PicksUser;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.bt0;
import l.d30;
import l.l9r;
import l.mqi0;
import l.s7m;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b)\u0010$J\u001d\u0010*\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b*\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Ll/ue70;", "Ll/s7m;", "Ll/me70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "headerView", "Landroid/content/Context;", "context", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;Landroid/content/Context;)V", "", "v", "()V", "presenter", "j", "(Ll/me70;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "act", "()Lcom/p1/mobile/android/app/Act;", "q", "()Landroid/view/View;", "n", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "", "Lcom/p1/mobile/putong/core/data/PicksUser;", "list", "u", "(Ljava/util/List;)V", "k", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "s", "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "x", "w", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "b", "Landroid/content/Context;", "getContext", "c", "Ll/me70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", "d", "Lkotlin/Lazy;", "m", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", "expandView", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "e", "p", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "hideView", "f", "Ljava/util/List;", "Ll/yf70;", "g", "l", "()Ll/yf70;", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ue70 implements s7m<me70> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PicksHeaderView headerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public me70 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy expandView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy hideView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public List<? extends PicksUser> list;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l.ue70$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1341a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23509a;

        static {
            int[] iArr = new int[PicksHelper.HeaderType.values().length];
            try {
                iArr[PicksHelper.HeaderType.EXPAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PicksHelper.HeaderType.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23509a = iArr;
        }
    }

    public ue70(@NotNull PicksHeaderView picksHeaderView, @NotNull Context context) {
        picksHeaderView.getClass();
        context.getClass();
        this.headerView = picksHeaderView;
        this.context = context;
        this.expandView = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.qe70
            public final Object invoke() {
                return ue70.m25177a(this.f19724a);
            }
        });
        this.hideView = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.re70
            public final Object invoke() {
                return ue70.m25183i(this.f20532a);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.se70
            public final Object invoke() {
                return ue70.m25178b(this.f21270a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static PicksStateExpandView m25177a(ue70 ue70Var) {
        Object objInflate = ue70Var.headerView.get_state_expand().inflate();
        objInflate.getClass();
        return (PicksStateExpandView) objInflate;
    }

    /* JADX INFO: renamed from: b */
    public static yf70 m25178b(ue70 ue70Var) {
        me70 me70Var = ue70Var.presenter;
        if (me70Var == null) {
            Intrinsics.r("presenter");
            me70Var = null;
        }
        return new yf70(me70Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m25179c(ue70 ue70Var) {
        List<? extends PicksUser> list = ue70Var.list;
        if (list == null) {
            Intrinsics.r("list");
            list = null;
        }
        ue70Var.m25197x(list);
        ue70Var.m25192p().setAlpha(0.0f);
        ue70Var.m25190m().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static void m25180d(ue70 ue70Var) {
        ue70Var.m25188k();
    }

    /* JADX INFO: renamed from: e */
    public static void m25181e(ue70 ue70Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        ViewGroup.LayoutParams layoutParams = ue70Var.headerView.getLayoutParams();
        layoutParams.height = (int) fFloatValue;
        ue70Var.headerView.setLayoutParams(layoutParams);
        ue70Var.headerView.requestLayout();
    }

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
    /* JADX INFO: renamed from: f */
    public static void m25182f(ue70 ue70Var) {
        PicksHelper.INSTANCE.m10199b().getExpandViewShow().put(Long.valueOf(mqi0.o()));
        xdl0.M(ue70Var.m25190m(), false);
        ue70Var.headerView.removeView(ue70Var.m25190m());
    }

    /* JADX INFO: renamed from: i */
    public static PicksStateHideView m25183i(ue70 ue70Var) {
        Object objInflate = ue70Var.headerView.get_state_hide().inflate();
        objInflate.getClass();
        return (PicksStateHideView) objInflate;
    }

    /* JADX INFO: renamed from: v */
    private final void m25184v() {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        m25192p().m10304l0();
    }

    @NotNull
    /* JADX INFO: renamed from: C0, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    @NotNull
    public Act act() {
        Act act = this.context;
        act.getClass();
        return act;
    }

    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return m25193q();
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m25186i1(@NotNull me70 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final void m25188k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.headerView.getMeasuredHeight(), t100.d(71.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ne70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ue70.m25181e(this.f17625a, valueAnimator);
            }
        });
        bt0.w(bt0.z(new Animator[]{bt0.p(m25190m(), "alpha", 0L, 500L, (Interpolator) null, new float[]{0.0f}), bt0.p(m25192p(), "alpha", 200L, 500L, (Interpolator) null, new float[]{1.0f}), bt0.k(valueAnimatorOfFloat, (Interpolator) null, 200L, 500L), bt0.j(10)}), new Runnable() { // from class: l.oe70
            @Override // java.lang.Runnable
            public final void run() {
                ue70.m25179c(this.f18173a);
            }
        }, new Runnable() { // from class: l.pe70
            @Override // java.lang.Runnable
            public final void run() {
                ue70.m25182f(this.f18696a);
            }
        }).start();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final yf70 m25189l() {
        return (yf70) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final PicksStateExpandView m25190m() {
        return (PicksStateExpandView) this.expandView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PicksHeaderView getHeaderView() {
        return this.headerView;
    }

    /* JADX INFO: renamed from: p */
    public final PicksStateHideView m25192p() {
        return (PicksStateHideView) this.hideView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m25193q() {
        int i = C1341a.f23509a[this.headerView.getType().ordinal()];
        if (i == 1) {
            return m25190m();
        }
        if (i == 2) {
            return m25192p();
        }
        l9r.a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final PicksHelper.HeaderType m25194s() {
        return this.headerView.getType();
    }

    /* JADX INFO: renamed from: u */
    public final void m25195u(@NotNull List<? extends PicksUser> list) {
        list.getClass();
        this.list = list;
        if (list.isEmpty()) {
            m25184v();
        } else if (this.headerView.getType() != PicksHelper.HeaderType.EXPAND || list.size() <= 4) {
            m25197x(list);
        } else {
            m25196w(list);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m25196w(List<? extends PicksUser> list) {
        PicksStateExpandView picksStateExpandViewM25190m = m25190m();
        me70 me70Var = this.presenter;
        if (me70Var == null) {
            Intrinsics.r("presenter");
            me70Var = null;
        }
        picksStateExpandViewM25190m.m10298H(me70Var, m25189l(), list, new d30() { // from class: l.te70
            public final void call() {
                ue70.m25180d(this.f22054a);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m25197x(List<? extends PicksUser> list) {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        if (list.isEmpty()) {
            m25184v();
        } else {
            m25192p().m10303k0(list.get(0));
        }
    }

    public void destroy() {
    }
}
