package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.C0331a;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.d30;
import l.hdb0;
import l.i0m;
import l.l9r;
import l.x2c0;
import l.xdl0;
import l.y840;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.j940;
import p009l.o7r;
import p009l.yij0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u0014¢\u0006\u0004\b)\u0010\u0017J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b0\u0010-J\u0015\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0014¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010v¨\u0006x"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "newQuickChatAudioHeader", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;)V", "", "startValue", "endValue", "Ll/d30;", "endAction", "", "setDuration", "", "w", "(IILl/d30;J)V", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "state", "F", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "", "showFlash", "J", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "l", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "t", "()V", "", "key", "extra", "Ll/i0m;", "grade", "K", "(Ljava/lang/String;Ljava/lang/Object;Ll/i0m;)V", "hideHeadView", "L", "u", "speedDuration", "y", "(J)V", "A", "G", "D", "height", "m", "(I)V", "v", "()Z", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "getNewQuickChatAudioHeader", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "n", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_pullbg_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_pullbg_svga", "c", "o", "set_pullbg_svga_flash", "_pullbg_svga_flash", "Lv/VLinear;", "d", "Lv/VLinear;", "r", "()Lv/VLinear;", "set_tips_layout", "(Lv/VLinear;)V", "_tips_layout", "Lv/VImage;", "e", "Lv/VImage;", "q", "()Lv/VImage;", "set_tips_icon", "(Lv/VImage;)V", "_tips_icon", "Lv/VText;", "f", "Lv/VText;", "s", "()Lv/VText;", "set_tips_text", "(Lv/VText;)V", "_tips_text", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "g", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "p", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;", "set_quickchat_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/QuickChatPullHeadAnim;)V", "_quickchat_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/j940;", "i", "Ll/j940;", "quickChatBubble", "j", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "scrollState", "Ll/c4g0;", "k", "Ll/c4g0;", "timeSubscription", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0331a {

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
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4420a;

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
            f4420a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends AnimListener {
        public b() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M0(C0331a.this.m6312o(), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.a$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/a$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f4422a;

        public c(d30 d30Var) {
            this.f4422a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f4422a.call();
        }
    }

    public C0331a(@NotNull NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.getClass();
        this.newQuickChatAudioHeader = newQuickChatAudioHeader;
        Act act = newQuickChatAudioHeader.getAct();
        this.act = act;
        this.scrollState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(act);
        layoutInflaterM19649a.getClass();
        m6309l(layoutInflaterM19649a, newQuickChatAudioHeader);
        m6318u();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m6283B(C0331a c0331a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c0331a.m6302A(j);
    }

    /* JADX INFO: renamed from: C */
    public static final void m6284C(C0331a c0331a, View view) {
        c0331a.newQuickChatAudioHeader.m6122G();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m6285E(C0331a c0331a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c0331a.m6303D(j);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m6286H(C0331a c0331a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c0331a.m6305G(j);
    }

    /* JADX INFO: renamed from: I */
    public static final void m6287I(C0331a c0331a, View view) {
        c0331a.newQuickChatAudioHeader.m6122G();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m6288M(C0331a c0331a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c0331a.m6308L(z);
    }

    /* JADX INFO: renamed from: a */
    public static void m6289a(final C0331a c0331a) {
        if (c0331a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalTipsState) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.o840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0331a.m6284C(this.f17870a, view);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m6290b(C0331a c0331a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c0331a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: d */
    public static void m6292d(C0331a c0331a) {
        if (c0331a.scrollState != NewQuickChatAudioHeader.NewHeaderState.NormalState) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: e */
    public static void m6293e(final C0331a c0331a) {
        if (c0331a.scrollState != NewQuickChatAudioHeader.NewHeaderState.VideoTipsState) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.w840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0331a.m6287I(this.f21945a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m6294f(C0331a c0331a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c0331a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: g */
    public static void m6295g(C0331a c0331a, View view) {
        c0331a.newQuickChatAudioHeader.m6122G();
    }

    /* JADX INFO: renamed from: j */
    public static void m6298j(C0331a c0331a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c0331a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: k */
    public static void m6299k(C0331a c0331a) {
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = c0331a.scrollState;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState2 = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        if (newHeaderState != newHeaderState2) {
            return;
        }
        c0331a.newQuickChatAudioHeader.setHeaderState(newHeaderState2);
    }

    /* JADX INFO: renamed from: x */
    public static final void m6300x(C0331a c0331a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c0331a.m6310m(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m6301z(C0331a c0331a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c0331a.m6321y(j);
    }

    /* JADX INFO: renamed from: A */
    public final void m6302A(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m6313p().m6437j0();
        m6304F(newHeaderState);
        if (this.newQuickChatAudioHeader.m6136z()) {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.u840
                public final void call() {
                    C0331a.m6289a(this.f21015a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.v840
                public final void call() {
                    C0331a.m6290b(this.f21480a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m6303D(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.SearchState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        this.newQuickChatAudioHeader.setOnClickListener(new View.OnClickListener() { // from class: l.n840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0331a.m6295g(this.f17354a, view);
            }
        });
        m6313p().m6437j0();
        m6304F(newHeaderState);
        if (!this.newQuickChatAudioHeader.m6136z()) {
            this.newQuickChatAudioHeader.setHeaderState(newHeaderState);
        } else {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getLOADING_VIEW_HEIGHT(), new d30() { // from class: l.p840
                public final void call() {
                    C0331a.m6298j(this.f18427a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m6304F(NewQuickChatAudioHeader.NewHeaderState state) {
        String str;
        xdl0.M0(m6315r(), true);
        m6314q().setImageResource(0);
        int i = a.f4420a[state.ordinal()];
        if (i == 1) {
            xdl0.M0(m6315r(), false);
            str = "";
        } else if (i == 2) {
            m6314q().setImageResource(x2c0.Gn);
            str = "下拉立即匹配在线用户";
        } else if (i == 3) {
            m6314q().setImageResource(x2c0.no);
            str = "视频闪聊功能限时开放中，下拉马上体验";
        } else {
            if (i != 4) {
                l9r.a();
                return;
            }
            str = "正在匹配合适的在线用户";
        }
        m6316s().setText(str);
    }

    /* JADX INFO: renamed from: G */
    public final void m6305G(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.VideoTipsState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m6313p().m6437j0();
        m6304F(newHeaderState);
        if (this.newQuickChatAudioHeader.m6136z()) {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.q840
                public final void call() {
                    C0331a.m6293e(this.f19065a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.r840
                public final void call() {
                    C0331a.m6294f(this.f19693a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m6306J(boolean showFlash) {
        if (m6311n().isAnimating()) {
            return;
        }
        xdl0.M(m6311n(), true);
        m6311n().startAnimation();
        if (showFlash) {
            xdl0.M(m6312o(), true);
            m6312o().startAnimation();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m6307K(@NotNull String key, @NotNull Object extra, @NotNull i0m grade) {
        key.getClass();
        extra.getClass();
        grade.getClass();
        CorePopLevel corePopLevel = CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS;
        j940 j940Var = this.quickChatBubble;
        j940 j940Var2 = null;
        if (grade == corePopLevel) {
            if (j940Var == null) {
                Intrinsics.r("quickChatBubble");
                j940Var = null;
            }
            j940Var.m16902U(key).m16903V((OnlineMatchMatchUser) extra);
            j940 j940Var3 = this.quickChatBubble;
            if (j940Var3 == null) {
                Intrinsics.r("quickChatBubble");
                j940Var3 = null;
            }
            j940Var3.x(grade);
        } else {
            if (j940Var == null) {
                Intrinsics.r("quickChatBubble");
                j940Var = null;
            }
            j940Var.m16902U(key).m16904W((OnlineMatchPushUser) extra);
            j940 j940Var4 = this.quickChatBubble;
            if (j940Var4 == null) {
                Intrinsics.r("quickChatBubble");
                j940Var4 = null;
            }
            j940Var4.x(grade);
        }
        hdb0 hdb0VarC = hdb0.c();
        j940 j940Var5 = this.quickChatBubble;
        if (j940Var5 == null) {
            Intrinsics.r("quickChatBubble");
        } else {
            j940Var2 = j940Var5;
        }
        hdb0VarC.i(j940Var2);
    }

    /* JADX INFO: renamed from: L */
    public final void m6308L(boolean hideHeadView) {
        yij0.m25399U(this.timeSubscription);
        if (hideHeadView) {
            m6313p().m6437j0();
        }
        m6311n().stopAnimation(false);
        m6312o().stopAnimation(false);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m6309l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = y840.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: m */
    public final void m6310m(int height) {
        int i = a.f4420a[this.newQuickChatAudioHeader.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH()) {
                m6311n().stopAnimation(false);
                m6312o().stopAnimation(false);
            } else {
                m6306J(true);
            }
            m6313p().setPullHeight(height);
        } else if (i != 2 && i != 3 && i != 4) {
            l9r.a();
            return;
        } else {
            m6306J(false);
            m6313p().m6437j0();
        }
        this.newQuickChatAudioHeader.m6134x(height);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SVGAnimationView m6311n() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_pullbg_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final SVGAnimationView m6312o() {
        SVGAnimationView sVGAnimationView = this._pullbg_svga_flash;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_pullbg_svga_flash");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final QuickChatPullHeadAnim m6313p() {
        QuickChatPullHeadAnim quickChatPullHeadAnim = this._quickchat_pullhead_anim;
        if (quickChatPullHeadAnim != null) {
            return quickChatPullHeadAnim;
        }
        Intrinsics.r("_quickchat_pullhead_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m6314q() {
        VImage vImage = this._tips_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_tips_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VLinear m6315r() {
        VLinear vLinear = this._tips_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_tips_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m6316s() {
        VText vText = this._tips_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tips_text");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final void m6317t() {
        this.quickChatBubble = new j940(this.act);
    }

    /* JADX INFO: renamed from: u */
    public final void m6318u() {
        m6313p().setData(this.newQuickChatAudioHeader);
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga").autoPlay(false).repeatCount(1).animListener(new b()).into(m6312o());
        SVGALoader.with(this.act).from("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga").repeatCount(-1).autoPlay(false).into(m6311n());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6319v() {
        j940 j940Var = this.quickChatBubble;
        if (j940Var == null) {
            Intrinsics.r("quickChatBubble");
            j940Var = null;
        }
        return j940Var.m16896N();
    }

    /* JADX INFO: renamed from: w */
    public final void m6320w(int startValue, int endValue, d30 endAction, long setDuration) {
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
                    C0331a.m6300x(this.f22470a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new c(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m6321y(long speedDuration) {
        NewQuickChatAudioHeader newQuickChatAudioHeader = this.newQuickChatAudioHeader;
        NewQuickChatAudioHeader.NewHeaderState newHeaderState = NewQuickChatAudioHeader.NewHeaderState.NormalState;
        newQuickChatAudioHeader.setHeaderState(newHeaderState);
        m6304F(newHeaderState);
        if (this.newQuickChatAudioHeader.m6136z()) {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, this.newQuickChatAudioHeader.getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.s840
                public final void call() {
                    C0331a.m6292d(this.f20130a);
                }
            }, speedDuration);
        } else {
            this.scrollState = newHeaderState;
            m6320w(this.newQuickChatAudioHeader.getLayoutParams().height, 0, new d30() { // from class: l.t840
                public final void call() {
                    C0331a.m6299k(this.f20578a);
                }
            }, speedDuration);
        }
    }
}
