package com.p051p1.mobile.putong.core.p058ui.quickaudio;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.NewVoiceCallFloatView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.dr40;
import p153l.fo0;
import p153l.kcg0;
import p153l.psd0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.uqx;
import p153l.w1n0;
import p153l.x20;
import p153l.xzm0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0084\u00012\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0014J7\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0014¢\u0006\u0004\b+\u0010\u0014J\u000f\u0010,\u001a\u00020\fH\u0014¢\u0006\u0004\b,\u0010\u0014J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u0014R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00103\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010]R\u0016\u0010e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010i\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010dR\u0016\u0010k\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010dR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010rR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010]R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallFloatView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "E", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "N", "(Lcom/p1/mobile/putong/data/User;)V", "M", "()V", "P", "G", "onFinishInflate", "L", "", "changed", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAttachedToWindow", "onDetachedFromWindow", "process", BloodType.f39576O, "(I)V", "Q", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_normal_head", "()Lv/VDraweeView;", "set_normal_head", "(Lv/VDraweeView;)V", "_normal_head", "b", "Lv/VFrame;", "get_online_match_profile", "()Lv/VFrame;", "set_online_match_profile", "(Lv/VFrame;)V", "_online_match_profile", "Lcom/p1/mobile/putong/core/newui/talk/view/NewTalkProgressView;", "c", "Lcom/p1/mobile/putong/core/newui/talk/view/NewTalkProgressView;", "get_online_match_profile_progress", "()Lcom/p1/mobile/putong/core/newui/talk/view/NewTalkProgressView;", "set_online_match_profile_progress", "(Lcom/p1/mobile/putong/core/newui/talk/view/NewTalkProgressView;)V", "_online_match_profile_progress", Constants.INAPP_DATA_TAG, "get_online_match_profile_head", "set_online_match_profile_head", "_online_match_profile_head", "Lv/VText;", "e", "Lv/VText;", "get_tip", "()Lv/VText;", "set_tip", "(Lv/VText;)V", "_tip", "Landroid/app/Activity;", "f", "Landroid/app/Activity;", "getAct", "()Landroid/app/Activity;", "setAct", "(Landroid/app/Activity;)V", SocialConstants.PARAM_ACT, "g", "Z", "isQuickChat", "()Z", "setQuickChat", "(Z)V", "isDrag", RXScreenCaptureService.KEY_INDEX, "I", "mWidth", "j", "mHeight", "k", "screenWidth", BLiveStormDanmakuGiftResourceType.f45292l, "screenHeight", "Landroid/animation/ValueAnimator;", "m", "Landroid/animation/ValueAnimator;", "valueAnimator", "Ll/kcg0;", "n", "Ll/kcg0;", "subscribeInnerState", "o", "subscribeTime", "p", "subQuickAudioProgress", "Landroid/view/GestureDetector;", "q", "Landroid/view/GestureDetector;", "gestureDetector", "Ll/x20;", "r", "Ll/x20;", "layoutAction", BLiveStormDanmakuGiftResourceType.f45294s, "isCalling", Constants.KEY_T, "Lcom/p1/mobile/putong/data/User;", "Companion", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NewVoiceCallFloatView extends VFrame {

    /* JADX INFO: renamed from: u */
    public static int f36180u;

    /* JADX INFO: renamed from: v */
    public static int f36181v;

    /* JADX INFO: renamed from: w */
    public static int f36182w;

    /* JADX INFO: renamed from: x */
    public static int f36183x;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _normal_head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _online_match_profile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NewTalkProgressView _online_match_profile_progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _online_match_profile_head;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Activity act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isQuickChat;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isDrag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int mHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int screenWidth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int screenHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public kcg0 subscribeInnerState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public kcg0 subscribeTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public kcg0 subQuickAudioProgress;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final x20 layoutAction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean isCalling;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public User user;

    /* JADX INFO: renamed from: y */
    public static final int f36184y = 300;

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final List<x20> f36185z = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.NewVoiceCallFloatView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/quickaudio/NewVoiceCallFloatView$b", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8974b extends GestureDetector.SimpleOnGestureListener {
        public C8974b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            e.getClass();
            if (NewVoiceCallFloatView.this.isDrag) {
                return true;
            }
            sfj0.m185596c("e_audiochatsmall", "p_audiochatsmall", new sfj0.C20032a[0]);
            NewVoiceCallFloatView.this.performClick();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.layoutAction = new x20() { // from class: l.ar40
            @Override // p153l.x20
            public final void call() {
                NewVoiceCallFloatView.m55667z(this.f72912a);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static void m55657B(NewVoiceCallFloatView newVoiceCallFloatView, long j) {
        if (xzm0.m213760p().m213769l() == 3) {
            if (!newVoiceCallFloatView.isCalling) {
                newVoiceCallFloatView.isCalling = true;
                newVoiceCallFloatView.get_tip().setTextColor(Color.parseColor("#e6000000"));
            }
            newVoiceCallFloatView.get_tip().setText(w1n0.m204455b(j));
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m55660K(NewVoiceCallFloatView newVoiceCallFloatView) {
        if (NullChecker.m82486a(newVoiceCallFloatView.getParent())) {
            ViewParent parent = newVoiceCallFloatView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(newVoiceCallFloatView);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m55661R(NewVoiceCallFloatView newVoiceCallFloatView, User user, Integer num) {
        num.getClass();
        if (num.intValue() < 100) {
            newVoiceCallFloatView.m55673O(num.intValue());
        } else {
            newVoiceCallFloatView.isQuickChat = false;
            newVoiceCallFloatView.m55672N(user);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m55662p(NewVoiceCallFloatView newVoiceCallFloatView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        f36182w = iIntValue;
        newVoiceCallFloatView.layout(iIntValue, newVoiceCallFloatView.getTop(), newVoiceCallFloatView.getWidth() + iIntValue, newVoiceCallFloatView.getBottom());
    }

    /* JADX INFO: renamed from: s */
    public static void m55663s(final NewVoiceCallFloatView newVoiceCallFloatView, int i) {
        if (i == 0) {
            newVoiceCallFloatView.get_tip().setText("通话结束");
            newVoiceCallFloatView.get_tip().setTextColor(Color.parseColor("#ff4444"));
            newVoiceCallFloatView.postDelayed(new Runnable() { // from class: l.br40
                @Override // java.lang.Runnable
                public final void run() {
                    NewVoiceCallFloatView.m55660K(this.f77979a);
                }
            }, 1000L);
        } else if (i == 1 || i == 3) {
            newVoiceCallFloatView.get_tip().setText(R$string.f21545L6);
        }
    }

    /* JADX INFO: renamed from: u */
    public static Boolean m55664u(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static Boolean m55666w(long j) {
        return Boolean.valueOf(j > 0);
    }

    /* JADX INFO: renamed from: z */
    public static void m55667z(NewVoiceCallFloatView newVoiceCallFloatView) {
        newVoiceCallFloatView.m55670L();
    }

    /* JADX INFO: renamed from: E */
    public final void m55668E(View view) {
        dr40.m117683a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final void m55669G() {
        kcg0 kcg0VarSubscribe = xzm0.m213760p().m213766i().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wq40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewVoiceCallFloatView.m55663s(this.f190380a, ((Integer) obj).intValue());
            }
        }));
        kcg0VarSubscribe.getClass();
        this.subscribeInnerState = kcg0VarSubscribe;
        C22507a<Long> c22507a = uqx.m197379C().f180530l;
        final Function1 function1 = new Function1() { // from class: l.xq40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewVoiceCallFloatView.m55666w(((Long) obj).longValue());
            }
        };
        kcg0 kcg0VarSubscribe2 = c22507a.filter(new qcj() { // from class: l.yq40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewVoiceCallFloatView.m55664u(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zq40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewVoiceCallFloatView.m55657B(this.f205568a, ((Long) obj).longValue());
            }
        }));
        kcg0VarSubscribe2.getClass();
        this.subscribeTime = kcg0VarSubscribe2;
        m55675Q();
    }

    /* JADX INFO: renamed from: L */
    public final void m55670L() {
        if (f36182w == 0 && f36183x == 0) {
            return;
        }
        if (getLeft() == f36182w && getTop() == f36183x) {
            return;
        }
        if (NullChecker.m82486a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = f36182w;
            marginLayoutParams.topMargin = f36183x;
        }
        int i = f36182w;
        int i2 = f36183x;
        layout(i, i2, this.mWidth + i, this.mHeight + i2);
        m55671M();
    }

    /* JADX INFO: renamed from: M */
    public final void m55671M() {
        List<x20> list = f36185z;
        if (list.isEmpty()) {
            return;
        }
        Iterator<x20> it = list.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m55672N(User user) {
        if (this.isQuickChat) {
            uqb0.f180374G.m127120O(get_online_match_profile_head(), user.m61308fp().profileSmall().formatted(), 2, 50);
        } else {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
            if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
                uqb0.f180374G.m127115L0(get_normal_head(), user.getAnonymousUrl());
            } else {
                uqb0.f180374G.m127115L0(get_normal_head(), user.m61308fp().profileSmall().formatted());
            }
        }
        bnl0.m105524M(get_normal_head(), !this.isQuickChat);
        bnl0.m105524M(get_online_match_profile(), this.isQuickChat);
    }

    /* JADX INFO: renamed from: O */
    public final void m55673O(int process) {
        get_online_match_profile_progress().setProgress(process);
    }

    /* JADX INFO: renamed from: P */
    public final void m55674P() {
        if (getLeft() == 0 || getLeft() == this.screenWidth - getWidth()) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = getLeft() + (getWidth() / 2) < this.screenWidth / 2 ? ValueAnimator.ofInt(getLeft(), 0) : ValueAnimator.ofInt(getLeft(), this.screenWidth - getWidth());
        this.valueAnimator = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(f36184y);
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vq40
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NewVoiceCallFloatView.m55662p(this.f185330a, valueAnimator2);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m55675Q() {
        if (this.isQuickChat) {
            kcg0 kcg0Var = this.subQuickAudioProgress;
            if (kcg0Var != null) {
                kcg0Var.getClass();
                if (!kcg0Var.isUnsubscribed()) {
                    return;
                }
            }
            final User user = this.user;
            if (user != null) {
                this.subQuickAudioProgress = CoreModule.m30933P().m143412i().mo180332H3(user.f56859id).subscribe(psd0.m173596G(new y20() { // from class: l.cr40
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        NewVoiceCallFloatView.m55661R(this.f83296a, user, (Integer) obj);
                    }
                }));
            }
        }
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
    public final VDraweeView get_normal_head() {
        VDraweeView vDraweeView = this._normal_head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_normal_head");
        return null;
    }

    @NotNull
    public final VFrame get_online_match_profile() {
        VFrame vFrame = this._online_match_profile;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_online_match_profile");
        return null;
    }

    @NotNull
    public final VDraweeView get_online_match_profile_head() {
        VDraweeView vDraweeView = this._online_match_profile_head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_online_match_profile_head");
        return null;
    }

    @NotNull
    public final NewTalkProgressView get_online_match_profile_progress() {
        NewTalkProgressView newTalkProgressView = this._online_match_profile_progress;
        if (newTalkProgressView != null) {
            return newTalkProgressView;
        }
        Intrinsics.m88391r("_online_match_profile_progress");
        return null;
    }

    @NotNull
    public final VText get_tip() {
        VText vText = this._tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tip");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f36185z.add(this.layoutAction);
        m55669G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f36185z.remove(this.layoutAction);
        kcg0 kcg0Var = this.subscribeInnerState;
        kcg0 kcg0Var2 = null;
        if (kcg0Var == null) {
            Intrinsics.m88391r("subscribeInnerState");
            kcg0Var = null;
        }
        psd0.m173633z(kcg0Var);
        kcg0 kcg0Var3 = this.subscribeTime;
        if (kcg0Var3 == null) {
            Intrinsics.m88391r("subscribeTime");
        } else {
            kcg0Var2 = kcg0Var3;
        }
        psd0.m173633z(kcg0Var2);
        psd0.m173633z(this.subQuickAudioProgress);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55668E(this);
        Activity activityM105508E = bnl0.m105508E(this);
        activityM105508E.getClass();
        setAct(activityM105508E);
        this.gestureDetector = new GestureDetector(getContext(), new C8974b());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m55670L();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mWidth = w;
        this.mHeight = h;
        this.screenWidth = bnl0.m105592y0();
        this.screenHeight = bnl0.m105588w0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            Intrinsics.m88391r("gestureDetector");
            gestureDetector = null;
        }
        gestureDetector.onTouchEvent(event);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.isDrag = false;
            f36180u = (int) event.getX();
            f36181v = (int) event.getY();
        } else if (action == 1) {
            setPressed(false);
            m55674P();
            this.isDrag = false;
        } else if (action == 2) {
            float x = event.getX() - f36180u;
            float y = event.getY() - f36181v;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.isDrag = true;
                int left = (int) (getLeft() + x);
                int width = getWidth() + left;
                int top = (int) (getTop() + y);
                int height = getHeight() + top;
                if (left < 0) {
                    width = getWidth();
                    left = 0;
                } else {
                    int i2 = this.screenWidth;
                    if (width > i2) {
                        left = i2 - getWidth();
                        width = i2;
                    }
                }
                if (top < 0) {
                    height = getHeight();
                } else {
                    int i3 = this.screenHeight;
                    if (height > i3) {
                        top = i3 - getHeight();
                        height = i3;
                    }
                    i = top;
                }
                f36182w = left;
                f36183x = i;
                layout(left, i, width, height);
            }
        } else if (action == 3) {
            setPressed(false);
            m55674P();
            this.isDrag = false;
        }
        return true;
    }

    public final void setAct(@NotNull Activity activity) {
        activity.getClass();
        this.act = activity;
    }

    public final void setQuickChat(boolean z) {
        this.isQuickChat = z;
    }

    public final void set_normal_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._normal_head = vDraweeView;
    }

    public final void set_online_match_profile(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._online_match_profile = vFrame;
    }

    public final void set_online_match_profile_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._online_match_profile_head = vDraweeView;
    }

    public final void set_online_match_profile_progress(@NotNull NewTalkProgressView newTalkProgressView) {
        newTalkProgressView.getClass();
        this._online_match_profile_progress = newTalkProgressView;
    }

    public final void set_tip(@NotNull VText vText) {
        vText.getClass();
        this._tip = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallFloatView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewVoiceCallFloatView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewVoiceCallFloatView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
