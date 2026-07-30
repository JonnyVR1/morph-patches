package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u0006+"}, m88121d2 = {"Ll/ydq0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Ll/w2c0;", "Landroid/view/View;", "translationTarget", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "headerView", "<init>", "(Landroid/view/View;Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;)V", "to", "k", "(Ll/w2c0;)Landroid/view/View;", SocialConstants.PARAM_ACT, "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "toActHelper", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Ll/w2c0;)Landroid/animation/Animator;", "m", "a", "Landroid/view/View;", "getTranslationTarget", "()Landroid/view/View;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "n", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "", "c", "I", "startY", Constants.INAPP_DATA_TAG, "startBottom", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "start", "end", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ydq0 extends Act.AbstractC4455w<Act, w2c0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View translationTarget;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final QuickChatHeaderBaseView headerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int startY;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int startBottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Rect start;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Rect end;

    /* JADX INFO: renamed from: l.ydq0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/ydq0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21564a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w2c0 f198622b;

        public C21564a(w2c0 w2c0Var) {
            this.f198622b = w2c0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            ydq0.this.getHeaderView().mo43000h();
            this.f198622b.mo42796E().setClipBounds(null);
        }
    }

    public ydq0(@NotNull View view, @NotNull QuickChatHeaderBaseView quickChatHeaderBaseView) {
        view.getClass();
        quickChatHeaderBaseView.getClass();
        this.translationTarget = view;
        this.headerView = quickChatHeaderBaseView;
    }

    /* JADX INFO: renamed from: i */
    public static void m215270i(ydq0 ydq0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        ydq0Var.translationTarget.setTranslationY(((Rect) animatedValue).bottom - ydq0Var.startY);
    }

    /* JADX INFO: renamed from: j */
    public static void m215271j(ydq0 ydq0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        ydq0Var.translationTarget.setTranslationY(((Rect) animatedValue).bottom - ydq0Var.startBottom);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: f */
    public void mo21411f(@NotNull Act act) {
        act.getClass();
        int i = x7c0.f192708w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: g */
    public void mo21412g(@NotNull Act act) {
        act.getClass();
        int i = x7c0.f192708w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public View mo21421a(@NotNull w2c0 to) {
        to.getClass();
        return to.mo42797q();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(@NotNull Act from, @NotNull w2c0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.headerView);
        int i = c16067gM105560i0.f77560b;
        this.startY = i;
        this.startBottom = c16067gM105560i0.f77562d + i;
        this.start = new Rect(0, c16067gM105560i0.f77560b, c16067gM105560i0.f77561c + c16067gM105560i0.f77559a, this.startBottom);
        this.end = new Rect(0, 0, toActHelper.mo42796E().getWidth(), toActHelper.mo42796E().getHeight());
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo42796E(), "clipBounds", rectEvaluator, this.start, this.end);
        objectAnimatorOfObject.getClass();
        toActHelper.mo42796E().setClipBounds(this.start);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wdq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ydq0.m215271j(this.f188629a, valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new C21564a(toActHelper));
        objectAnimatorOfObject.setDuration(270L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(toActHelper.mo42795C());
        arrayList.add(objectAnimatorOfObject);
        Animator gotoNextActAnim = this.headerView.getGotoNextActAnim();
        if (gotoNextActAnim != null) {
            arrayList.add(gotoNextActAnim);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(@NotNull Act from, @NotNull w2c0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        toActHelper.mo42798w();
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.headerView);
        int i = this.startY;
        this.start = new Rect(0, i, c16067gM105560i0.f77561c + c16067gM105560i0.f77559a, i);
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        if (this.end == null) {
            CrashHelper.m82479c(new Throwable(" end nullpoint exception check " + this.end + " ==  " + this.start + " === " + this.startY + " ==  " + c16067gM105560i0));
            this.end = new Rect(0, 0, toActHelper.mo42796E().getWidth(), toActHelper.mo42796E().getHeight());
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo42796E(), "clipBounds", rectEvaluator, this.end, this.start);
        objectAnimatorOfObject.getClass();
        toActHelper.mo42796E().setClipBounds(this.end);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xdq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ydq0.m215270i(this.f193620a, valueAnimator);
            }
        });
        objectAnimatorOfObject.setDuration(300L);
        toActHelper.stop();
        return objectAnimatorOfObject;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final QuickChatHeaderBaseView getHeaderView() {
        return this.headerView;
    }
}
