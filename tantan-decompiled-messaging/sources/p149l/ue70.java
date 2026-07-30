package p149l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksStateExpandView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksStateHideView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b)\u0010$J\u001d\u0010*\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b*\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010B¨\u0006D"}, m87232d2 = {"Ll/ue70;", "Ll/s7m;", "Ll/me70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "headerView", "Landroid/content/Context;", "context", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;Landroid/content/Context;)V", "", ResourceDirection.f38808v, "()V", "presenter", "j", "(Ll/me70;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "q", "()Landroid/view/View;", "n", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "", "Lcom/p1/mobile/putong/core/data/PicksUser;", "list", "u", "(Ljava/util/List;)V", "k", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", BaseSei.f13930X, "w", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "b", "Landroid/content/Context;", "getContext", "c", "Ll/me70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "m", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", "expandView", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "e", "p", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "hideView", "f", "Ljava/util/List;", "Ll/yf70;", "g", BLiveStormDanmakuGiftResourceType.f44444l, "()Ll/yf70;", "adapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C20414a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176016a;

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
            f176016a = iArr;
        }
    }

    public ue70(@NotNull PicksHeaderView picksHeaderView, @NotNull Context context) {
        picksHeaderView.getClass();
        context.getClass();
        this.headerView = picksHeaderView;
        this.context = context;
        this.expandView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qe70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ue70.m193222a(this.f153999a);
            }
        });
        this.hideView = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.re70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ue70.m193228i(this.f159036a);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.se70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ue70.m193223b(this.f163933a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static PicksStateExpandView m193222a(ue70 ue70Var) {
        View viewInflate = ue70Var.headerView.get_state_expand().inflate();
        viewInflate.getClass();
        return (PicksStateExpandView) viewInflate;
    }

    /* JADX INFO: renamed from: b */
    public static yf70 m193223b(ue70 ue70Var) {
        me70 me70Var = ue70Var.presenter;
        if (me70Var == null) {
            Intrinsics.m87502r("presenter");
            me70Var = null;
        }
        return new yf70(me70Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m193224c(ue70 ue70Var) {
        List<? extends PicksUser> list = ue70Var.list;
        if (list == null) {
            Intrinsics.m87502r("list");
            list = null;
        }
        ue70Var.m193240x(list);
        ue70Var.m193235p().setAlpha(0.0f);
        ue70Var.m193233m().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static void m193225d(ue70 ue70Var) {
        ue70Var.m193231k();
    }

    /* JADX INFO: renamed from: e */
    public static void m193226e(ue70 ue70Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        ViewGroup.LayoutParams layoutParams = ue70Var.headerView.getLayoutParams();
        layoutParams.height = (int) fFloatValue;
        ue70Var.headerView.setLayoutParams(layoutParams);
        ue70Var.headerView.requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public static void m193227f(ue70 ue70Var) {
        PicksHelper.INSTANCE.m56740b().getExpandViewShow().put(Long.valueOf(mqi0.m155944o()));
        xdl0.m208344M(ue70Var.m193233m(), false);
        ue70Var.headerView.removeView(ue70Var.m193233m());
    }

    /* JADX INFO: renamed from: i */
    public static PicksStateHideView m193228i(ue70 ue70Var) {
        View viewInflate = ue70Var.headerView.get_state_hide().inflate();
        viewInflate.getClass();
        return (PicksStateHideView) viewInflate;
    }

    /* JADX INFO: renamed from: v */
    private final void m193229v() {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        m193235p().m56833l0();
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        Context context = this.context;
        context.getClass();
        return (Act) context;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return m193236q();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull me70 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final void m193231k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.headerView.getMeasuredHeight(), t100.m186890d(71.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ne70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ue70.m193226e(this.f138591a, valueAnimator);
            }
        });
        bt0.m103750w(bt0.m103753z(bt0.m103743p(m193233m(), "alpha", 0L, 500L, null, 0.0f), bt0.m103743p(m193235p(), "alpha", 200L, 500L, null, 1.0f), bt0.m103738k(valueAnimatorOfFloat, null, 200L, 500L), bt0.m103737j(10)), new Runnable() { // from class: l.oe70
            @Override // java.lang.Runnable
            public final void run() {
                ue70.m193224c(this.f143288a);
            }
        }, new Runnable() { // from class: l.pe70
            @Override // java.lang.Runnable
            public final void run() {
                ue70.m193227f(this.f148403a);
            }
        }).start();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final yf70 m193232l() {
        return (yf70) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final PicksStateExpandView m193233m() {
        return (PicksStateExpandView) this.expandView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PicksHeaderView getHeaderView() {
        return this.headerView;
    }

    /* JADX INFO: renamed from: p */
    public final PicksStateHideView m193235p() {
        return (PicksStateHideView) this.hideView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m193236q() {
        int i = C20414a.f176016a[this.headerView.getType().ordinal()];
        if (i == 1) {
            return m193233m();
        }
        if (i == 2) {
            return m193235p();
        }
        l9r.m149037a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final PicksHelper.HeaderType m193237s() {
        return this.headerView.getType();
    }

    /* JADX INFO: renamed from: u */
    public final void m193238u(@NotNull List<? extends PicksUser> list) {
        list.getClass();
        this.list = list;
        if (list.isEmpty()) {
            m193229v();
        } else if (this.headerView.getType() != PicksHelper.HeaderType.EXPAND || list.size() <= 4) {
            m193240x(list);
        } else {
            m193239w(list);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m193239w(List<? extends PicksUser> list) {
        PicksStateExpandView picksStateExpandViewM193233m = m193233m();
        me70 me70Var = this.presenter;
        if (me70Var == null) {
            Intrinsics.m87502r("presenter");
            me70Var = null;
        }
        picksStateExpandViewM193233m.m56828H(me70Var, m193232l(), list, new d30() { // from class: l.te70
            @Override // p149l.d30
            public final void call() {
                ue70.m193225d(this.f169801a);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m193240x(List<? extends PicksUser> list) {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        if (list.isEmpty()) {
            m193229v();
        } else {
            m193235p().m56832k0(list.get(0));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
