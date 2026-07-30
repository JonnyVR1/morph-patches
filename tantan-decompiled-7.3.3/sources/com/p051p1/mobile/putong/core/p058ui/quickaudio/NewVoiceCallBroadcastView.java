package com.p051p1.mobile.putong.core.p058ui.quickaudio;

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
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.NewVoiceCallBroadcastView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p153l.bnl0;
import p153l.l4g0;
import p153l.o1j0;
import p153l.qa00;
import p153l.qzm0;
import p153l.sfj0;
import p153l.uq40;
import p153l.w1e;
import p153l.x20;
import p153l.xzm0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\"\u0010=\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0017R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView;", "Lv/VFrame_Shadow;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/View;)V", "n", "()V", "o", "onFinishInflate", "p", "", "show", "r", "(Z)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "get_head", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Landroid/widget/TextView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/TextView;", "get_name", "()Landroid/widget/TextView;", "set_name", "(Landroid/widget/TextView;)V", "_name", "Lv/VImage;", "j", "Lv/VImage;", "get_reject", "()Lv/VImage;", "set_reject", "(Lv/VImage;)V", "_reject", "k", "get_accept", "set_accept", "_accept", "Ll/xzm0;", "Ll/xzm0;", "voiceCallManager", "m", "Z", "isRemoved", "()Z", "setRemoved", "Landroid/app/Activity;", "Landroid/app/Activity;", "getAct", "()Landroid/app/Activity;", "setAct", "(Landroid/app/Activity;)V", SocialConstants.PARAM_ACT, "", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Ll/l4g0;", "Ll/l4g0;", "getPageHelper", "()Ll/l4g0;", "pageHelper", "Landroid/view/GestureDetector;", "q", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "setGestureDetector", "(Landroid/view/GestureDetector;)V", "gestureDetector", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public final xzm0 voiceCallManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isRemoved;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Activity act;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String userId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final l4g0 pageHelper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallBroadcastView$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m88121d2 = {"com/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8971a implements Animator.AnimatorListener {
        public C8971a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            if (NullChecker.m82486a(NewVoiceCallBroadcastView.this.getParent())) {
                NewVoiceCallBroadcastView.this.m55656r(false);
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
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallBroadcastView$b", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e1", "e2", "", "velocityX", "velocityY", "", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8972b extends GestureDetector.SimpleOnGestureListener {
        public C8972b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            e2.getClass();
            if (e2.getRawY() - (e1 != null ? e1.getRawY() : 0.0f) >= (-qa00.f156322i)) {
                return super.onFling(e1, e2, velocityX, velocityY);
            }
            NewVoiceCallBroadcastView.this.m55654o();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallBroadcastView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        xzm0 xzm0VarM213760p = xzm0.m213760p();
        xzm0VarM213760p.getClass();
        this.voiceCallManager = xzm0VarM213760p;
        this.userId = "";
        l4g0 l4g0VarM204399c = w1e.m204399c("p_voice_callme", "Dialog");
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
        this.gestureDetector = new GestureDetector(getContext(), new C8972b());
    }

    /* JADX INFO: renamed from: i */
    public static void m55647i(NewVoiceCallBroadcastView newVoiceCallBroadcastView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        newVoiceCallBroadcastView.setTranslationY(qa00.m175859d(152.0f) * ((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: j */
    public static void m55648j(NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        sfj0.m185596c("e_voice_callme_no", "p_voice_callme", new sfj0.C20032a[0]);
        qzm0.m178812h().m178819e("CalleeReject", xzm0.m213760p().m213768k());
        newVoiceCallBroadcastView.m55654o();
    }

    /* JADX INFO: renamed from: k */
    public static void m55649k(final NewVoiceCallBroadcastView newVoiceCallBroadcastView, View view) {
        qzm0.m178812h().m178819e("CalleeAccept", xzm0.m213760p().m213768k());
        if (CoreModule.m30933P().m143412i().mo180404U1(new x20() { // from class: l.tq40
            @Override // p153l.x20
            public final void call() {
                NewVoiceCallBroadcastView.m55651q(this.f175675a);
            }
        }, newVoiceCallBroadcastView.getAct())) {
            return;
        }
        sfj0.m185596c("e_voice_callme_yes", "p_voice_callme", sfj0.C20032a.m185615h("channel", xzm0.m213760p().m213767j()));
        newVoiceCallBroadcastView.m55653n();
    }

    /* JADX INFO: renamed from: q */
    public static final void m55651q(NewVoiceCallBroadcastView newVoiceCallBroadcastView) {
        newVoiceCallBroadcastView.m55653n();
    }

    @NotNull
    public final Activity getAct() {
        Activity activity = this.act;
        if (activity != null) {
            return activity;
        }
        Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        return null;
    }

    @NotNull
    public final GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    @NotNull
    public final l4g0 getPageHelper() {
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
        Intrinsics.m88391r("_accept");
        return null;
    }

    @NotNull
    public final VDraweeView get_head() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_head");
        return null;
    }

    @NotNull
    public final TextView get_name() {
        TextView textView = this._name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final VImage get_reject() {
        VImage vImage = this._reject;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_reject");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m55652l(View view) {
        uq40.m197217a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m55653n() {
        if (CoreModule.m30933P().m143412i().mo180302C(100011)) {
            if (CoreModule.m30934Q().mo68436Zo().mo136898b()) {
                o1j0.m165651y("当前正在语聊中，无法语音电话");
                qzm0.m178812h().m178819e("CalleeAcceptFail", "otherCalling");
            } else {
                qzm0.m178812h().m178819e("CalleeAcceptSuccess", xzm0.m213760p().m213768k());
                xzm0.m213760p().m213762e();
                m55655p();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m55654o() {
        this.voiceCallManager.m213771n();
        m55655p();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Activity activityM105508E = bnl0.m105508E(this);
        activityM105508E.getClass();
        setAct(activityM105508E);
        m55652l(this);
        bnl0.m105509E0(get_reject(), new View.OnClickListener() { // from class: l.qq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewVoiceCallBroadcastView.m55648j(this.f158954a, view);
            }
        });
        bnl0.m105509E0(get_accept(), new View.OnClickListener() { // from class: l.rq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewVoiceCallBroadcastView.m55649k(this.f164430a, view);
            }
        });
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        this.gestureDetector.onTouchEvent(event);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m55655p() {
        this.isRemoved = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sq40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewVoiceCallBroadcastView.m55647i(this.f170144a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C8971a());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: r */
    public final void m55656r(boolean show) {
        l4g0 l4g0Var = this.pageHelper;
        if (show) {
            w1e.m204402f(l4g0Var);
        } else {
            w1e.m204401e(l4g0Var);
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
