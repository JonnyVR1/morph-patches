package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.C8318a;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c3m;
import p153l.dbc0;
import p153l.kcg0;
import p153l.llb0;
import p153l.mh40;
import p153l.nbr;
import p153l.p9r;
import p153l.x20;
import p153l.xh40;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u0014¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b0\u0010-J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0014¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010v¨\u0006x"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "newQuickChatAudioHeader", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;)V", "", "startValue", "endValue", "Ll/x20;", "endAction", "", "setDuration", "", "w", "(IILl/x20;J)V", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "state", "F", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "", "showFlash", "J", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", Constants.KEY_T, "()V", "", Constants.KEY_KEY, "extra", "Ll/c3m;", Grade.TYPE, "K", "(Ljava/lang/String;Ljava/lang/Object;Ll/c3m;)V", "hideHeadView", "L", "u", "speedDuration", BaseSei.f14625Y, "(J)V", "A", "G", "D", "height", "m", "(I)V", ResourceDirection.f39656v, "()Z", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "getNewQuickChatAudioHeader", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "n", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_pullbg_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_pullbg_svga", "c", "o", "set_pullbg_svga_flash", "_pullbg_svga_flash", "Lv/VLinear;", Constants.INAPP_DATA_TAG, "Lv/VLinear;", "r", "()Lv/VLinear;", "set_tips_layout", "(Lv/VLinear;)V", "_tips_layout", "Lv/VImage;", "e", "Lv/VImage;", "q", "()Lv/VImage;", "set_tips_icon", "(Lv/VImage;)V", "_tips_icon", "Lv/VText;", "f", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VText;", "set_tips_text", "(Lv/VText;)V", "_tips_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "g", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "p", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "set_quickchat_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;)V", "_quickchat_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/xh40;", RXScreenCaptureService.KEY_INDEX, "Ll/xh40;", "quickChatBubble", "j", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "scrollState", "Ll/kcg0;", "k", "Ll/kcg0;", "timeSubscription", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8318a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewQuickChatAudioHeader newQuickChatAudioHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SVGAnimationView _pullbg_svga;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SVGAnimationView _pullbg_svga_flash;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _tips_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _tips_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tips_text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public QuickChatPullHeadAnim _quickchat_pullhead_anim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public xh40 quickChatBubble;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public NewQuickChatAudioHeader.NewHeaderState scrollState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public kcg0 timeSubscription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26384a;

        static {
            int[] iArr = new int[NewQuickChatAudioHeader.NewHeaderState.values().length];
            try {
                iArr[NewQuickChatAudioHeader.NewHeaderState.NormalState.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewQuickChatAudioHeader.NewHeaderState.NormalTipsState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewQuickChatAudioHeader.NewHeaderState.VideoTipsState.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NewQuickChatAudioHeader.NewHeaderState.SearchState.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26384a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b extends AnimListener {
        public b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105525M0(C8318a.this.m43181o(), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f26386a;

        public c(x20 x20Var) {
            this.f26386a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f26386a.call();
        }
    }

    public C8318a(@NotNull NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.getClass();
        this.newQuickChatAudioHeader = newQuickChatAudioHeader;
        Act act = newQuickChatAudioHeader.getAct();
        this.act = act;
        this.scrollState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(act);
        layoutInflaterM171370a.getClass();
        m43178l(layoutInflaterM171370a, newQuickChatAudioHeader);
        m43187u();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m43152B(C8318a c8318a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8318a.m43171A(j);
    }

    /* JADX INFO: renamed from: C */
    public static final void m43153C(C8318a c8318a, View view) {
        c8318a.newQuickChatAudioHeader.m42991G();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m43154E(C8318a c8318a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c8318a.m43172D(j);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m43155H(C8318a c8318a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8318a.m43174G(j);
    }

    /* JADX INFO: renamed from: I */
    public static final void m43156I(C8318a c8318a, View view) {
        c8318a.newQuickChatAudioHeader.m42991G();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m43157M(C8318a c8318a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c8318a.m43177L(z);
    }

    /* JADX INFO: renamed from: a */
    public static void m43158a(final C8318a c8318a) {
        if (c8318a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalTipsState) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.ch40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8318a.m43153C(this.f81757a, view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m43159b(C8318a c8318a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8318a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: d */
    public static void m43161d(C8318a c8318a) {
        if (c8318a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalState) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: e */
    public static void m43162e(final C8318a c8318a) {
        if (c8318a.scrollState != NewQuickChatAudioHeader.NewHeaderState.VideoTipsState) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.kh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8318a.m43156I(this.f126694a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m43163f(C8318a c8318a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8318a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: g */
    public static void m43164g(C8318a c8318a, View view) {
        c8318a.newQuickChatAudioHeader.m42991G();
    }

    /* JADX INFO: renamed from: j */
    public static void m43167j(C8318a c8318a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8318a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: k */
    public static void m43168k(C8318a c8318a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8318a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8318a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: x */
    public static final void m43169x(C8318a c8318a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c8318a.m43179m(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m43170z(C8318a c8318a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8318a.m43190y(j);
    }

    /* JADX INFO: renamed from: A */
    public final void m43171A(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m43182p().m43299j0();
        m43173F(newHeaderState);
        if (this.newQuickChatAudioHeader.m43005z()) {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new x20() { // from class: l.ih40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43158a(this.f114870a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new x20() { // from class: l.jh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43159b(this.f120806a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m43172D(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.SearchState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        this.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.bh40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8318a.m43164g(this.f76730a, view);
            }
        });
        m43182p().m43299j0();
        m43173F(newHeaderState);
        if (!this.newQuickChatAudioHeader.m43005z()) {
            this.newQuickChatAudioHeader.setHeaderState(newHeaderState);
        } else {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getLOADING_VIEW_HEIGHT(), new x20() { // from class: l.dh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43167j(this.f88417a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m43173F(NewQuickChatAudioHeader.NewHeaderState state) {
        String str;
        bnl0.m105525M0(m43184r(), true);
        m43183q().setImageResource(0);
        int i = a.f26384a[state.ordinal()];
        if (i == 1) {
            bnl0.m105525M0(m43184r(), false);
            str = "";
        } else if (i == 2) {
            m43183q().setImageResource(dbc0.f87522vo);
            str = "下拉立即匹配在线用户";
        } else if (i == 3) {
            m43183q().setImageResource(dbc0.f86867bp);
            str = "视频闪聊功能限时开放中，下拉马上体验";
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            str = "正在匹配合适的在线用户";
        }
        m43185s().setText(str);
    }

    /* JADX INFO: renamed from: G */
    public final void m43174G(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m43182p().m43299j0();
        m43173F(newHeaderState);
        if (this.newQuickChatAudioHeader.m43005z()) {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new x20() { // from class: l.eh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43162e(this.f94000a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new x20() { // from class: l.fh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43163f(this.f99008a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m43175J(boolean showFlash) {
        if (m43180n().isAnimating()) {
            return;
        }
        bnl0.m105524M(m43180n(), true);
        m43180n().startAnimation();
        if (showFlash) {
            bnl0.m105524M(m43181o(), true);
            m43181o().startAnimation();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m43176K(@NotNull String key, @NotNull Object extra, @NotNull c3m grade) {
        key.getClass();
        extra.getClass();
        grade.getClass();
        CorePopLevel corePopLevel = CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS;
        xh40 xh40Var = this.quickChatBubble;
        xh40 xh40Var2 = null;
        if (grade == corePopLevel) {
            if (xh40Var == null) {
                Intrinsics.m88391r("quickChatBubble");
                xh40Var = null;
            }
            xh40Var.m210999U(key).m211000V((OnlineMatchMatchUser) extra);
            xh40 xh40Var3 = this.quickChatBubble;
            if (xh40Var3 == null) {
                Intrinsics.m88391r("quickChatBubble");
                xh40Var3 = null;
            }
            xh40Var3.m126745x(grade);
        } else {
            if (xh40Var == null) {
                Intrinsics.m88391r("quickChatBubble");
                xh40Var = null;
            }
            xh40Var.m210999U(key).m211001W((OnlineMatchPushUser) extra);
            xh40 xh40Var4 = this.quickChatBubble;
            if (xh40Var4 == null) {
                Intrinsics.m88391r("quickChatBubble");
                xh40Var4 = null;
            }
            xh40Var4.m126745x(grade);
        }
        llb0 llb0VarM154703c = llb0.m154703c();
        xh40 xh40Var5 = this.quickChatBubble;
        if (xh40Var5 == null) {
            Intrinsics.m88391r("quickChatBubble");
        } else {
            xh40Var2 = xh40Var5;
        }
        llb0VarM154703c.m154710i(xh40Var2);
    }

    /* JADX INFO: renamed from: L */
    public final void m43177L(boolean hideHeadView) {
        bsj0.m106263U(this.timeSubscription);
        if (hideHeadView) {
            m43182p().m43299j0();
        }
        m43180n().stopAnimation(false);
        m43181o().stopAnimation(false);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m43178l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM158412b = mh40.m158412b(this, inflater, parent);
        viewM158412b.getClass();
        return viewM158412b;
    }

    /* JADX INFO: renamed from: m */
    public final void m43179m(int height) {
        int i = a.f26384a[this.newQuickChatAudioHeader.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH()) {
                m43180n().stopAnimation(false);
                m43181o().stopAnimation(false);
            } else {
                m43175J(true);
            }
            m43182p().setPullHeight(height);
        } else if (i != 2 && i != 3 && i != 4) {
            nbr.m162172a();
            return;
        } else {
            m43175J(false);
            m43182p().m43299j0();
        }
        this.newQuickChatAudioHeader.m43003x(height);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SVGAnimationView m43180n() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_pullbg_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final SVGAnimationView m43181o() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga_flash;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_pullbg_svga_flash");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final QuickChatPullHeadAnim m43182p() {
        QuickChatPullHeadAnim quickChatPullHeadAnim = this._quickchat_pullhead_anim;
        if (quickChatPullHeadAnim != null) {
            return quickChatPullHeadAnim;
        }
        Intrinsics.m88391r("_quickchat_pullhead_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m43183q() {
        VImage vImage = this._tips_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_tips_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VLinear m43184r() {
        VLinear vLinear = this._tips_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_tips_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m43185s() {
        VText vText = this._tips_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tips_text");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final void m43186t() {
        this.quickChatBubble = new xh40(this.act);
    }

    /* JADX INFO: renamed from: u */
    public final void m43187u() {
        m43182p().setData(this.newQuickChatAudioHeader);
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga").autoPlay(false).repeatCount(1).animListener(new b()).into(m43181o());
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga").repeatCount(-1).autoPlay(false).into(m43180n());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m43188v() {
        xh40 xh40Var = this.quickChatBubble;
        if (xh40Var == null) {
            Intrinsics.m88391r("quickChatBubble");
            xh40Var = null;
        }
        return xh40Var.m210993N();
    }

    /* JADX INFO: renamed from: w */
    public final void m43189w(int startValue, int endValue, x20 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lh40
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C8318a.m43169x(this.f132069a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m43190y(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m43173F(newHeaderState);
        if (this.newQuickChatAudioHeader.m43005z()) {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH(), new x20() { // from class: l.gh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43161d(this.f104068a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m43189w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new x20() { // from class: l.hh40
                @Override // p153l.x20
                public final void call() {
                    C8318a.m43168k(this.f109478a);
                }
            }, speedDuration);
        }
    }
}
