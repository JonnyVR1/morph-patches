package p153l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksStateExpandView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksStateHideView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b)\u0010$J\u001d\u0010*\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b*\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010B¨\u0006D"}, m88121d2 = {"Ll/an70;", "Ll/iam;", "Ll/sm70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "headerView", "Landroid/content/Context;", "context", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;Landroid/content/Context;)V", "", ResourceDirection.f39656v, "()V", "presenter", "j", "(Ll/sm70;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "q", "()Landroid/view/View;", "n", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "", "Lcom/p1/mobile/putong/core/data/PicksUser;", "list", "u", "(Ljava/util/List;)V", "k", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", BaseSei.f14624X, "w", "a", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "b", "Landroid/content/Context;", "getContext", "c", "Ll/sm70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "m", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", "expandView", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "e", "p", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateHideView;", "hideView", "f", "Ljava/util/List;", "Ll/eo70;", "g", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/eo70;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class an70 implements iam<sm70> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PicksHeaderView headerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public sm70 presenter;

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

    /* JADX INFO: renamed from: l.an70$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C15749a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72327a;

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
            f72327a = iArr;
        }
    }

    public an70(@NotNull PicksHeaderView picksHeaderView, @NotNull Context context) {
        picksHeaderView.getClass();
        context.getClass();
        this.headerView = picksHeaderView;
        this.context = context;
        this.expandView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wm70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return an70.m98935a(this.f189780a);
            }
        });
        this.hideView = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.xm70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return an70.m98941i(this.f195055a);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ym70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return an70.m98936b(this.f200643a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static PicksStateExpandView m98935a(an70 an70Var) {
        View viewInflate = an70Var.headerView.get_state_expand().inflate();
        viewInflate.getClass();
        return (PicksStateExpandView) viewInflate;
    }

    /* JADX INFO: renamed from: b */
    public static eo70 m98936b(an70 an70Var) {
        sm70 sm70Var = an70Var.presenter;
        if (sm70Var == null) {
            Intrinsics.m88391r("presenter");
            sm70Var = null;
        }
        return new eo70(sm70Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m98937c(an70 an70Var) {
        List<? extends PicksUser> list = an70Var.list;
        if (list == null) {
            Intrinsics.m88391r("list");
            list = null;
        }
        an70Var.m98953x(list);
        an70Var.m98948p().setAlpha(0.0f);
        an70Var.m98946m().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static void m98938d(an70 an70Var) {
        an70Var.m98944k();
    }

    /* JADX INFO: renamed from: e */
    public static void m98939e(an70 an70Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        ViewGroup.LayoutParams layoutParams = an70Var.headerView.getLayoutParams();
        layoutParams.height = (int) fFloatValue;
        an70Var.headerView.setLayoutParams(layoutParams);
        an70Var.headerView.requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public static void m98940f(an70 an70Var) {
        PicksHelper.INSTANCE.m57923b().getExpandViewShow().put(Long.valueOf(pzi0.m174454o()));
        bnl0.m105524M(an70Var.m98946m(), false);
        an70Var.headerView.removeView(an70Var.m98946m());
    }

    /* JADX INFO: renamed from: i */
    public static PicksStateHideView m98941i(an70 an70Var) {
        View viewInflate = an70Var.headerView.get_state_hide().inflate();
        viewInflate.getClass();
        return (PicksStateHideView) viewInflate;
    }

    /* JADX INFO: renamed from: v */
    private final void m98942v() {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        m98948p().m58016l0();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        Context context = this.context;
        context.getClass();
        return (Act) context;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return m98949q();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull sm70 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final void m98944k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.headerView.getMeasuredHeight(), qa00.m175859d(71.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tm70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                an70.m98939e(this.f174891a, valueAnimator);
            }
        });
        gt0.m132177w(gt0.m132180z(gt0.m132170p(m98946m(), "alpha", 0L, 500L, null, 0.0f), gt0.m132170p(m98948p(), "alpha", 200L, 500L, null, 1.0f), gt0.m132165k(valueAnimatorOfFloat, null, 200L, 500L), gt0.m132164j(10)), new Runnable() { // from class: l.um70
            @Override // java.lang.Runnable
            public final void run() {
                an70.m98937c(this.f179607a);
            }
        }, new Runnable() { // from class: l.vm70
            @Override // java.lang.Runnable
            public final void run() {
                an70.m98940f(this.f184674a);
            }
        }).start();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final eo70 m98945l() {
        return (eo70) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final PicksStateExpandView m98946m() {
        return (PicksStateExpandView) this.expandView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PicksHeaderView getHeaderView() {
        return this.headerView;
    }

    /* JADX INFO: renamed from: p */
    public final PicksStateHideView m98948p() {
        return (PicksStateHideView) this.hideView.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m98949q() {
        int i = C15749a.f72327a[this.headerView.getType().ordinal()];
        if (i == 1) {
            return m98946m();
        }
        if (i == 2) {
            return m98948p();
        }
        nbr.m162172a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final PicksHelper.HeaderType m98950s() {
        return this.headerView.getType();
    }

    /* JADX INFO: renamed from: u */
    public final void m98951u(@NotNull List<? extends PicksUser> list) {
        list.getClass();
        this.list = list;
        if (list.isEmpty()) {
            m98942v();
        } else if (this.headerView.getType() != PicksHelper.HeaderType.EXPAND || list.size() <= 4) {
            m98953x(list);
        } else {
            m98952w(list);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m98952w(List<? extends PicksUser> list) {
        PicksStateExpandView picksStateExpandViewM98946m = m98946m();
        sm70 sm70Var = this.presenter;
        if (sm70Var == null) {
            Intrinsics.m88391r("presenter");
            sm70Var = null;
        }
        picksStateExpandViewM98946m.m58011H(sm70Var, m98945l(), list, new x20() { // from class: l.zm70
            @Override // p153l.x20
            public final void call() {
                an70.m98938d(this.f205044a);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m98953x(List<? extends PicksUser> list) {
        this.headerView.setType(PicksHelper.HeaderType.HIDE);
        if (list.isEmpty()) {
            m98942v();
        } else {
            m98948p().m58015k0(list.get(0));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
