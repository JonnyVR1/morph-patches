package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.rzb0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u0006+"}, d2 = {"Ll/u4q0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Ll/sub0;", "Landroid/view/View;", "translationTarget", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "headerView", "<init>", "(Landroid/view/View;Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;)V", "to", "k", "(Ll/sub0;)Landroid/view/View;", "act", "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "toActHelper", "Landroid/animation/Animator;", "l", "(Lcom/p1/mobile/android/app/Act;Ll/sub0;)Landroid/animation/Animator;", "m", "a", "Landroid/view/View;", "getTranslationTarget", "()Landroid/view/View;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "n", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "", "c", "I", "startY", "d", "startBottom", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "start", "end", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class u4q0 extends Act.w<Act, sub0> {

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

    /* JADX INFO: renamed from: l.u4q0$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/u4q0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1215a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sub0 f20992b;

        public C1215a(sub0 sub0Var) {
            this.f20992b = sub0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            u4q0.this.getHeaderView().mo6131h();
            this.f20992b.mo5909C().setClipBounds(null);
        }
    }

    public u4q0(@NotNull View view, @NotNull QuickChatHeaderBaseView quickChatHeaderBaseView) {
        view.getClass();
        quickChatHeaderBaseView.getClass();
        this.translationTarget = view;
        this.headerView = quickChatHeaderBaseView;
    }

    /* JADX INFO: renamed from: i */
    public static void m22748i(u4q0 u4q0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        u4q0Var.translationTarget.setTranslationY(((Rect) animatedValue).bottom - u4q0Var.startY);
    }

    /* JADX INFO: renamed from: j */
    public static void m22749j(u4q0 u4q0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        u4q0Var.translationTarget.setTranslationY(((Rect) animatedValue).bottom - u4q0Var.startBottom);
    }

    /* JADX INFO: renamed from: f */
    public void m22753f(@NotNull Act act) {
        act.getClass();
        int i = rzb0.w;
        act.overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: g */
    public void m22754g(@NotNull Act act) {
        act.getClass();
        int i = rzb0.w;
        act.overridePendingTransition(i, i);
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public View m22750a(@NotNull sub0 to) {
        to.getClass();
        return to.mo5910p();
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Animator m22751c(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        xdl0.g gVarI0 = xdl0.i0(this.headerView);
        int i = gVarI0.b;
        this.startY = i;
        this.startBottom = gVarI0.d + i;
        this.start = new Rect(0, gVarI0.b, gVarI0.c + gVarI0.a, this.startBottom);
        this.end = new Rect(0, 0, toActHelper.mo5909C().getWidth(), toActHelper.mo5909C().getHeight());
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo5909C(), "clipBounds", rectEvaluator, this.start, this.end);
        objectAnimatorOfObject.getClass();
        toActHelper.mo5909C().setClipBounds(this.start);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.s4q0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                u4q0.m22749j(this.f20093a, valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new C1215a(toActHelper));
        objectAnimatorOfObject.setDuration(270L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(toActHelper.mo5908B());
        arrayList.add(objectAnimatorOfObject);
        Animator gotoNextActAnim = this.headerView.getGotoNextActAnim();
        if (gotoNextActAnim != null) {
            arrayList.add(gotoNextActAnim);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Animator m22752d(@NotNull Act from, @NotNull sub0 toActHelper) {
        from.getClass();
        toActHelper.getClass();
        toActHelper.mo5911w();
        xdl0.g gVarI0 = xdl0.i0(this.headerView);
        int i = this.startY;
        this.start = new Rect(0, i, gVarI0.c + gVarI0.a, i);
        RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
        if (this.end == null) {
            CrashHelper.c(new Throwable(" end nullpoint exception check " + this.end + " ==  " + this.start + " === " + this.startY + " ==  " + gVarI0));
            this.end = new Rect(0, 0, toActHelper.mo5909C().getWidth(), toActHelper.mo5909C().getHeight());
        }
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(toActHelper.mo5909C(), "clipBounds", rectEvaluator, this.end, this.start);
        objectAnimatorOfObject.getClass();
        toActHelper.mo5909C().setClipBounds(this.end);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t4q0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                u4q0.m22748i(this.f20558a, valueAnimator);
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
