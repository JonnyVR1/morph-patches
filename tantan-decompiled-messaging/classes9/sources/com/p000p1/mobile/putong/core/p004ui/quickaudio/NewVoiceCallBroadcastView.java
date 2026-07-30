package com.p000p1.mobile.putong.core.p004ui.quickaudio;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.NewVoiceCallBroadcastView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.d30;
import l.gi40;
import l.i0e;
import l.lsi0;
import l.mqm0;
import l.o6j0;
import l.t100;
import l.tqm0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VFrame_Shadow;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\"\u0010=\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0017R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView;", "Lv/VFrame_Shadow;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "l", "(Landroid/view/View;)V", "n", "()V", "o", "onFinishInflate", "p", "", "show", "r", "(Z)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "get_head", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "Lv/VImage;", "j", "Lv/VImage;", "get_reject", "()Lv/VImage;", "set_reject", "(Lv/VImage;)V", "_reject", "k", "get_accept", "set_accept", "_accept", "Ll/tqm0;", "Ll/tqm0;", "voiceCallManager", "m", "Z", "isRemoved", "()Z", "setRemoved", "Landroid/app/Activity;", "Landroid/app/Activity;", "getAct", "()Landroid/app/Activity;", "setAct", "(Landroid/app/Activity;)V", "act", "", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Ll/cwf0;", "Ll/cwf0;", "getPageHelper", "()Ll/cwf0;", "pageHelper", "Landroid/view/GestureDetector;", "q", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "setGestureDetector", "(Landroid/view/GestureDetector;)V", "gestureDetector", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewVoiceCallBroadcastView extends VFrame_Shadow {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _head;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _name;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _reject;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _accept;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final tqm0 voiceCallManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isRemoved;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Activity act;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String userId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final cwf0 pageHelper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallBroadcastView$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0244a implements Animator.AnimatorListener {
        public C0244a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (NullChecker.a(NewVoiceCallBroadcastView.this.getParent())) {
                NewVoiceCallBroadcastView.this.m7812r(false);
                ViewParent parent = NewVoiceCallBroadcastView.this.getParent();
                parent.getClass();
                ((ViewGroup) parent).removeView(NewVoiceCallBroadcastView.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallBroadcastView$b */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView$b", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e1", "e2", "", "velocityX", "velocityY", "", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0245b extends GestureDetector.SimpleOnGestureListener {
        public C0245b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            e2.getClass();
            if (e2.getRawY() - (e1 != null ? e1.getRawY() : 0.0f) >= (-t100.i)) {
                return super.onFling(e1, e2, velocityX, velocityY);
            }
            NewVoiceCallBroadcastView.this.m7810o();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NewVoiceCallBroadcastView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        tqm0 tqm0VarP = tqm0.p();
        tqm0VarP.getClass();
        this.voiceCallManager = tqm0VarP;
        this.userId = "";
        cwf0 cwf0VarC = i0e.c("p_voice_callme", "Dialog");
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
        this.gestureDetector = new GestureDetector(getContext(), new C0245b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static void m7803i(NewVoiceCallBroadcastView newVoiceCallBroadcastView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        newVoiceCallBroadcastView.setTranslationY(t100.d(152.0f) * ((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: j */
    public static void m7804j(NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        o6j0.c("e_voice_callme_no", "p_voice_callme", new o6j0.a[0]);
        mqm0.h().e("CalleeReject", tqm0.p().k());
        newVoiceCallBroadcastView.m7810o();
    }

    /* JADX INFO: renamed from: k */
    public static void m7805k(final NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        mqm0.h().e("CalleeAccept", tqm0.p().k());
        if (CoreModule.m1854P().m11713i().m19820U1(new d30() { // from class: l.fi40
            public final void call() {
                NewVoiceCallBroadcastView.m7807q(this.f12721a);
            }
        }, newVoiceCallBroadcastView.getAct())) {
            return;
        }
        o6j0.c("e_voice_callme_yes", "p_voice_callme", new o6j0.a[]{o6j0.a.h("channel", tqm0.p().j())});
        newVoiceCallBroadcastView.m7809n();
    }

    /* JADX INFO: renamed from: q */
    public static final void m7807q(NewVoiceCallBroadcastView newVoiceCallBroadcastView) {
        newVoiceCallBroadcastView.m7809n();
    }

    @NotNull
    public final Activity getAct() {
        Activity activity = this.act;
        if (activity != null) {
            return activity;
        }
        Intrinsics.r("act");
        return null;
    }

    @NotNull
    public final GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    @NotNull
    public final cwf0 getPageHelper() {
        return this.pageHelper;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final VImage get_accept() {
        VImage vImage = this._accept;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_accept");
        return null;
    }

    @NotNull
    public final VDraweeView get_head() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_head");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final VImage get_reject() {
        VImage vImage = this._reject;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_reject");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m7808l(View view) {
        gi40.a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m7809n() {
        if (CoreModule.m1854P().m11713i().m19716C(100011)) {
            if (CoreModule.m1855Q().Zo().b()) {
                lsi0.y("当前正在语聊中，无法语音电话");
                mqm0.h().e("CalleeAcceptFail", "otherCalling");
            } else {
                mqm0.h().e("CalleeAcceptSuccess", tqm0.p().k());
                tqm0.p().e();
                m7811p();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7810o() {
        this.voiceCallManager.n();
        m7811p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        Activity activityE = xdl0.E(this);
        activityE.getClass();
        setAct(activityE);
        m7808l(this);
        xdl0.E0(get_reject(), new View.OnClickListener() { // from class: l.ci40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewVoiceCallBroadcastView.m7804j(this.f9663a, view);
            }
        });
        xdl0.E0(get_accept(), new View.OnClickListener() { // from class: l.di40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewVoiceCallBroadcastView.m7805k(this.f10403a, view);
            }
        });
    }

    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        this.gestureDetector.onTouchEvent(event);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m7811p() {
        this.isRemoved = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ei40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewVoiceCallBroadcastView.m7803i(this.f11161a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0244a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: r */
    public final void m7812r(boolean show) {
        cwf0 cwf0Var = this.pageHelper;
        if (show) {
            i0e.f(cwf0Var);
        } else {
            i0e.e(cwf0Var);
        }
    }

    public final void setAct(@NotNull Activity activity) {
        activity.getClass();
        this.act = activity;
    }

    public final void setGestureDetector(@NotNull GestureDetector gestureDetector) {
        gestureDetector.getClass();
        this.gestureDetector = gestureDetector;
    }

    public final void setRemoved(boolean z) {
        this.isRemoved = z;
    }

    public final void setUserId(@NotNull String str) {
        str.getClass();
        this.userId = str;
    }

    public final void set_accept(@NotNull VImage vImage) {
        vImage.getClass();
        this._accept = vImage;
    }

    public final void set_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._head = vDraweeView;
    }

    public final void set_name(@NotNull TextView textView) {
        textView.getClass();
        this._name = textView;
    }

    public final void set_reject(@NotNull VImage vImage) {
        vImage.getClass();
        this._reject = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallBroadcastView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallBroadcastView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewVoiceCallBroadcastView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
