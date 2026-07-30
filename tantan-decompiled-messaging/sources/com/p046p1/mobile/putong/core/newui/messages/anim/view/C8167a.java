package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.C8167a;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.d30;
import p149l.hdb0;
import p149l.i0m;
import p149l.j940;
import p149l.l9r;
import p149l.o7r;
import p149l.x2c0;
import p149l.xdl0;
import p149l.y840;
import p149l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u0014¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b0\u0010-J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0014¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010v¨\u0006x"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "newQuickChatAudioHeader", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;)V", "", "startValue", "endValue", "Ll/d30;", "endAction", "", "setDuration", "", "w", "(IILl/d30;J)V", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "state", "F", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "", "showFlash", "J", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", Constants.KEY_T, "()V", "", Constants.KEY_KEY, "extra", "Ll/i0m;", Grade.TYPE, "K", "(Ljava/lang/String;Ljava/lang/Object;Ll/i0m;)V", "hideHeadView", "L", "u", "speedDuration", BaseSei.f13931Y, "(J)V", "A", "G", "D", "height", "m", "(I)V", ResourceDirection.f38808v, "()Z", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "getNewQuickChatAudioHeader", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "n", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_pullbg_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_pullbg_svga", "c", "o", "set_pullbg_svga_flash", "_pullbg_svga_flash", "Lv/VLinear;", Constants.INAPP_DATA_TAG, "Lv/VLinear;", "r", "()Lv/VLinear;", "set_tips_layout", "(Lv/VLinear;)V", "_tips_layout", "Lv/VImage;", "e", "Lv/VImage;", "q", "()Lv/VImage;", "set_tips_icon", "(Lv/VImage;)V", "_tips_icon", "Lv/VText;", "f", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VText;", "set_tips_text", "(Lv/VText;)V", "_tips_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "g", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "p", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "set_quickchat_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;)V", "_quickchat_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/j940;", RXScreenCaptureService.KEY_INDEX, "Ll/j940;", "quickChatBubble", "j", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "scrollState", "Ll/c4g0;", "k", "Ll/c4g0;", "timeSubscription", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8167a {

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
    public j940 quickChatBubble;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public NewQuickChatAudioHeader.NewHeaderState scrollState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public c4g0 timeSubscription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25642a;

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
            f25642a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b extends AnimListener {
        public b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208345M0(C8167a.this.m42170o(), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f25644a;

        public c(d30 d30Var) {
            this.f25644a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f25644a.call();
        }
    }

    public C8167a(@NotNull NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.getClass();
        this.newQuickChatAudioHeader = newQuickChatAudioHeader;
        Act act = newQuickChatAudioHeader.getAct();
        this.act = act;
        this.scrollState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(act);
        layoutInflaterM163037a.getClass();
        m42167l(layoutInflaterM163037a, newQuickChatAudioHeader);
        m42176u();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m42141B(C8167a c8167a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8167a.m42160A(j);
    }

    /* JADX INFO: renamed from: C */
    public static final void m42142C(C8167a c8167a, View view) {
        c8167a.newQuickChatAudioHeader.m41980G();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m42143E(C8167a c8167a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c8167a.m42161D(j);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m42144H(C8167a c8167a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8167a.m42163G(j);
    }

    /* JADX INFO: renamed from: I */
    public static final void m42145I(C8167a c8167a, View view) {
        c8167a.newQuickChatAudioHeader.m41980G();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m42146M(C8167a c8167a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c8167a.m42166L(z);
    }

    /* JADX INFO: renamed from: a */
    public static void m42147a(final C8167a c8167a) {
        if (c8167a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalTipsState) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.o840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8167a.m42142C(this.f142598a, view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m42148b(C8167a c8167a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8167a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: d */
    public static void m42150d(C8167a c8167a) {
        if (c8167a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalState) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: e */
    public static void m42151e(final C8167a c8167a) {
        if (c8167a.scrollState != NewQuickChatAudioHeader.NewHeaderState.VideoTipsState) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.w840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8167a.m42145I(this.f185159a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m42152f(C8167a c8167a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8167a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: g */
    public static void m42153g(C8167a c8167a, View view) {
        c8167a.newQuickChatAudioHeader.m41980G();
    }

    /* JADX INFO: renamed from: j */
    public static void m42156j(C8167a c8167a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8167a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: k */
    public static void m42157k(C8167a c8167a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c8167a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c8167a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: x */
    public static final void m42158x(C8167a c8167a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c8167a.m42168m(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m42159z(C8167a c8167a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8167a.m42179y(j);
    }

    /* JADX INFO: renamed from: A */
    public final void m42160A(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m42171p().m42288j0();
        m42162F(newHeaderState);
        if (this.newQuickChatAudioHeader.m41994z()) {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.u840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42147a(this.f175097a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.v840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42148b(this.f180451a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m42161D(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.SearchState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        this.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.n840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8167a.m42153g(this.f137581a, view);
            }
        });
        m42171p().m42288j0();
        m42162F(newHeaderState);
        if (!this.newQuickChatAudioHeader.m41994z()) {
            this.newQuickChatAudioHeader.setHeaderState(newHeaderState);
        } else {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.p840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42156j(this.f147565a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m42162F(NewQuickChatAudioHeader.NewHeaderState state) {
        String str;
        xdl0.m208345M0(m42173r(), true);
        m42172q().setImageResource(0);
        int i = a.f25642a[state.ordinal()];
        if (i == 1) {
            xdl0.m208345M0(m42173r(), false);
            str = "";
        } else if (i == 2) {
            m42172q().setImageResource(x2c0.f189369Gn);
            str = "下拉立即匹配在线用户";
        } else if (i == 3) {
            m42172q().setImageResource(x2c0.f190403no);
            str = "视频闪聊功能限时开放中，下拉马上体验";
        } else {
            if (i != 4) {
                l9r.m149037a();
                return;
            }
            str = "正在匹配合适的在线用户";
        }
        m42174s().setText(str);
    }

    /* JADX INFO: renamed from: G */
    public final void m42163G(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m42171p().m42288j0();
        m42162F(newHeaderState);
        if (this.newQuickChatAudioHeader.m41994z()) {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.q840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42151e(this.f153132a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.r840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42152f(this.f158123a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m42164J(boolean showFlash) {
        if (m42169n().isAnimating()) {
            return;
        }
        xdl0.m208344M(m42169n(), true);
        m42169n().startAnimation();
        if (showFlash) {
            xdl0.m208344M(m42170o(), true);
            m42170o().startAnimation();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m42165K(@NotNull String key, @NotNull Object extra, @NotNull i0m grade) {
        key.getClass();
        extra.getClass();
        grade.getClass();
        CorePopLevel corePopLevel = CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS;
        j940 j940Var = this.quickChatBubble;
        j940 j940Var2 = null;
        if (grade == corePopLevel) {
            if (j940Var == null) {
                Intrinsics.m87502r("quickChatBubble");
                j940Var = null;
            }
            j940Var.m140538U(key).m140539V((OnlineMatchMatchUser) extra);
            j940 j940Var3 = this.quickChatBubble;
            if (j940Var3 == null) {
                Intrinsics.m87502r("quickChatBubble");
                j940Var3 = null;
            }
            j940Var3.m96808x(grade);
        } else {
            if (j940Var == null) {
                Intrinsics.m87502r("quickChatBubble");
                j940Var = null;
            }
            j940Var.m140538U(key).m140540W((OnlineMatchPushUser) extra);
            j940 j940Var4 = this.quickChatBubble;
            if (j940Var4 == null) {
                Intrinsics.m87502r("quickChatBubble");
                j940Var4 = null;
            }
            j940Var4.m96808x(grade);
        }
        hdb0 hdb0VarM130575c = hdb0.m130575c();
        j940 j940Var5 = this.quickChatBubble;
        if (j940Var5 == null) {
            Intrinsics.m87502r("quickChatBubble");
        } else {
            j940Var2 = j940Var5;
        }
        hdb0VarM130575c.m130582i(j940Var2);
    }

    /* JADX INFO: renamed from: L */
    public final void m42166L(boolean hideHeadView) {
        yij0.m214943U(this.timeSubscription);
        if (hideHeadView) {
            m42171p().m42288j0();
        }
        m42169n().stopAnimation(false);
        m42170o().stopAnimation(false);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m42167l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM213362b = y840.m213362b(this, inflater, parent);
        viewM213362b.getClass();
        return viewM213362b;
    }

    /* JADX INFO: renamed from: m */
    public final void m42168m(int height) {
        int i = a.f25642a[this.newQuickChatAudioHeader.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH()) {
                m42169n().stopAnimation(false);
                m42170o().stopAnimation(false);
            } else {
                m42164J(true);
            }
            m42171p().setPullHeight(height);
        } else if (i != 2 && i != 3 && i != 4) {
            l9r.m149037a();
            return;
        } else {
            m42164J(false);
            m42171p().m42288j0();
        }
        this.newQuickChatAudioHeader.m41992x(height);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SVGAnimationView m42169n() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_pullbg_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final SVGAnimationView m42170o() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga_flash;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_pullbg_svga_flash");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final QuickChatPullHeadAnim m42171p() {
        QuickChatPullHeadAnim quickChatPullHeadAnim = this._quickchat_pullhead_anim;
        if (quickChatPullHeadAnim != null) {
            return quickChatPullHeadAnim;
        }
        Intrinsics.m87502r("_quickchat_pullhead_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m42172q() {
        VImage vImage = this._tips_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_tips_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VLinear m42173r() {
        VLinear vLinear = this._tips_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_tips_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m42174s() {
        VText vText = this._tips_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tips_text");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final void m42175t() {
        this.quickChatBubble = new j940(this.act);
    }

    /* JADX INFO: renamed from: u */
    public final void m42176u() {
        m42171p().setData(this.newQuickChatAudioHeader);
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga").autoPlay(false).repeatCount(1).animListener(new b()).into(m42170o());
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga").repeatCount(-1).autoPlay(false).into(m42169n());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m42177v() {
        j940 j940Var = this.quickChatBubble;
        if (j940Var == null) {
            Intrinsics.m87502r("quickChatBubble");
            j940Var = null;
        }
        return j940Var.m140532N();
    }

    /* JADX INFO: renamed from: w */
    public final void m42178w(int startValue, int endValue, d30 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x840
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C8167a.m42158x(this.f191439a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m42179y(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m42162F(newHeaderState);
        if (this.newQuickChatAudioHeader.m41994z()) {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.s840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42150d(this.f162994a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m42178w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.t840
                @Override // p149l.d30
                public final void call() {
                    C8167a.m42157k(this.f168801a);
                }
            }, speedDuration);
        }
    }
}
