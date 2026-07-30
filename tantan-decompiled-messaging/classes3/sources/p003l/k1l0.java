package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.video.VideoBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.manager.LoveBuzzConstants;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.bp2;
import l.bt0;
import l.dp2;
import l.e51;
import l.f6w;
import l.h6w;
import l.hhx;
import l.j8w;
import l.l1l0;
import l.lsi0;
import l.m6w;
import l.oe50;
import l.p9w;
import l.pib;
import l.qa2;
import l.t100;
import l.xdl0;
import l.y2c0;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0098\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010y\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010i\u001a\u0004\bw\u0010k\"\u0004\bx\u0010mR\"\u0010|\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010i\u001a\u0004\bz\u0010k\"\u0004\b{\u0010mR&\u0010\u0083\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b&\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b4\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, d2 = {"Ll/k1l0;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "Y", "", "res", "", "needQuit", "e0", "(IZ)V", "b0", "time", "maxProgress", "j0", "(II)V", "m0", "h0", "l0", "g0", "d0", "()Z", "n0", "(I)V", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "c0", "y", "k", "p", "X", "x", "j", "destroy", "q", MessageElement.XPATH_PREFIX, "l", "n", "z", "s", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "W", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_video_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_video_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "R", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", XHTMLElement.XPATH_PREFIX, "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", "i", "K", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "M", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", "V", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "S", "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "T", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", "L", "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", "O", "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "Q", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "P", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "N", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/Runnable;", "t", "Ljava/lang/Runnable;", "noFaceRunnable", "Landroid/os/CountDownTimer;", "u", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "v", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k1l0 extends dp2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ConstraintLayout _video_call_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public FrameLayout _peer_surface_root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _top_mask;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _bottom_mask;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LoveBuzzMatchView _match_view;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _vb_report;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public FrameLayout _progress_root;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ZebraProgress _progress_root_call_progress;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _countdown_time;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VLinear _peer_info_root;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _peer_info_root_peer_info;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _peer_info_root_peer_age;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public MediaBuzzCallControlView _vb_control;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public BuzzNoFaceTipView _no_face_tip;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public Runnable noFaceRunnable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public CountDownTimer timer;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator resetAnim;

    /* JADX INFO: renamed from: l.k1l0$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"l/k1l0$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0362b implements oe50 {
        public C0362b() {
        }

        /* JADX INFO: renamed from: a */
        public void m5544a() {
            k1l0.this.m5519M().m228h();
        }

        /* JADX INFO: renamed from: b */
        public void m5545b() {
            k1l0.m5507f0(k1l0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.k1l0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/k1l0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0363c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f4792a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ k1l0 f4793b;

        public C0363c(boolean z, k1l0 k1l0Var) {
            this.f4792a = z;
            this.f4793b = k1l0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f4792a && m6w.INSTANCE.a(this.f4793b.c())) {
                this.f4793b.m5525S().animate().alpha(0.0f).setDuration(400L).start();
                this.f4793b.m5521O().animate().translationX(-t100.j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f4793b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f4793b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.k1l0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/k1l0$d", "Landroid/os/CountDownTimer;", "", "it", "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountDownTimerC0364d extends CountDownTimer {
        public CountDownTimerC0364d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            k1l0.this.m5514m0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.a(k1l0.this.c())) {
                k1l0.this.m5526T().setProgress(i);
                k1l0.this.m5518L().setText(m6wVar.c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1l0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.noFaceRunnable = new Runnable() { // from class: l.f1l0
            @Override // java.lang.Runnable
            public final void run() {
                k1l0.m5493A(this.f3449a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m5493A(k1l0 k1l0Var) {
        if (m6w.INSTANCE.a(k1l0Var.act()) && !BuzzMediaCallManager.INSTANCE.T()) {
            p9w.INSTANCE.A0();
            k1l0Var.m5520N().m169d();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m5495C(final k1l0 k1l0Var, View view) {
        j8w.l1(j8w.Companion.a(), "report_snapshot", (String) null, 2, (Object) null);
        p9w.INSTANCE.u0("videoBuzz");
        f6w.INSTANCE.a0(k1l0Var.c(), new Function0() { // from class: l.j1l0
            public final Object invoke() {
                return k1l0.m5502Z(this.f4546a);
            }
        }, "videoBuzz");
    }

    /* JADX INFO: renamed from: F */
    public static void m5497F(k1l0 k1l0Var) {
        ViewGroup.LayoutParams layoutParams = k1l0Var.m5519M().getLayoutParams();
        layoutParams.height = k1l0Var.m5527U().getHeight() + t100.d(310.0f);
        k1l0Var.m5519M().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: J */
    private final void m5500J() {
        SurfaceView surfaceView;
        String strL = j8w.Companion.a().B0().l();
        if (strL == null || (surfaceView = (SurfaceView) BuzzMediaCallManager.INSTANCE.J().get(Long.valueOf(Long.parseLong(strL)))) == null || Intrinsics.d(surfaceView.getParent(), m5524R())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m5524R().removeAllViews();
        m5524R().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: Y */
    private final void m5501Y() {
        xdl0.E0(m5528V(), new View.OnClickListener() { // from class: l.g1l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k1l0.m5495C(this.f3787a, view);
            }
        });
        m5527U().setControlVBListener(new C0362b());
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m5502Z(k1l0 k1l0Var) {
        j8w.Companion.a().e1("videoBuzz");
        m5507f0(k1l0Var, R.string.e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    private final void m5503a0() {
        m6w.INSTANCE.l(new View[]{m5526T(), m5518L()});
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long jC = hhxVarB0.c();
        m5511j0((int) jC, ((long) hhxVarB0.h()) < jC ? hhxVarB0.k() * 1000 : hhxVarB0.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b0 */
    private final void m5504b0() {
        bp2 bp2VarF = f();
        if (bp2VarF != null) {
            bp2VarF.E0();
        }
        bp2 bp2VarF2 = f();
        if (bp2VarF2 != null) {
            bp2VarF2.F0();
        }
        m6w.INSTANCE.l(new View[]{m5525S(), m5518L(), m5521O(), m5527U(), m5528V(), m5517K()});
        m5527U().m266w0("videoBuzz");
        hhx hhxVarB0 = j8w.Companion.a().B0();
        pib pibVar = CoreModule.c.e0;
        String strL = hhxVarB0.l();
        if (strL == null) {
            strL = "";
        }
        User userPa = pibVar.Pa(strL);
        if (userPa == null) {
            return;
        }
        if (hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED) {
            m5508g0();
        } else {
            m5503a0();
        }
        v(userPa);
        m5522P().setText(" " + userPa.age);
        m5523Q().setText(userPa.name);
        m5519M().post(new Runnable() { // from class: l.h1l0
            @Override // java.lang.Runnable
            public final void run() {
                k1l0.m5497F(this.f4098a);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m5505d0() {
        return NullChecker.a(m5528V()) && xdl0.O0(m5528V());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    private final void m5506e0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.W();
        }
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.a(c())) {
            if (res != -1) {
                m5515n0(res);
            }
            m5513l0();
            m5527U().m265q0();
            m6wVar.d(new View[]{m5529W(), m5528V(), m5527U()});
            e51.J(d());
            e51.H(c(), d(), 2000L);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m5507f0(k1l0 k1l0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        k1l0Var.m5506e0(i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private final void m5508g0() {
        if (j8w.Companion.a().B0().f() != LoveBuzzConstants.MATCH.MATCHED) {
            m6w.INSTANCE.l(new View[]{m5525S(), m5518L()});
        } else {
            m6w.INSTANCE.j(new View[]{m5518L()});
            m5509h0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m5509h0() {
        m5513l0();
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.j() == 0) {
            return;
        }
        final boolean z = hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED;
        if (z) {
            m5526T().m304c(y2c0.m, 1);
            m5526T().m306e();
            qa2.INSTANCE.a("VideoBuzzCallViewModel", "callData.matchAnimPlay " + hhxVarB0.e());
            if (!hhxVarB0.e()) {
                m5519M().m229i();
                hhxVarB0.n(true);
            }
        }
        if (xdl0.O0(m5525S())) {
            final int maxProgress = m5526T().getMaxProgress();
            final int iC = (int) hhxVarB0.c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m5526T().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.b);
            valueAnimatorOfInt.addListener(new C0363c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i1l0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    k1l0.m5510i0(this.f4317a, z, maxProgress, iC, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m5510i0(k1l0 k1l0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        k1l0Var.m5526T().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m5512k0(k1l0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m5511j0(int time, int maxProgress) {
        if (m6w.INSTANCE.a(c())) {
            m5513l0();
            j8w.Companion.a().B0().o(maxProgress);
            m5526T().setMax(maxProgress);
            if (!m5526T().m303b()) {
                m5526T().m305d();
            }
            CountDownTimerC0364d countDownTimerC0364d = new CountDownTimerC0364d(time);
            this.timer = countDownTimerC0364d;
            countDownTimerC0364d.start();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m5512k0(k1l0 k1l0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        k1l0Var.m5511j0(i, i2);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m5513l0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final void m5514m0() {
        m5513l0();
        m5507f0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m5515n0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m5516G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = l1l0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m5517K() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m5518L() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LoveBuzzMatchView m5519M() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final BuzzNoFaceTipView m5520N() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m5521O() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m5522P() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VText m5523Q() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final FrameLayout m5524R() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final FrameLayout m5525S() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ZebraProgress m5526T() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final MediaBuzzCallControlView m5527U() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m5528V() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final ConstraintLayout m5529W() {
        ConstraintLayout constraintLayout = this._video_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_video_call_root");
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final void m5530X() {
        if (m5505d0()) {
            m5508g0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m5531c0() {
        VideoBuzzAct videoBuzzActC = c();
        VideoBuzzAct videoBuzzAct = videoBuzzActC instanceof VideoBuzzAct ? videoBuzzActC : null;
        if (videoBuzzAct != null) {
            VideoBuzzAct.m78a2(videoBuzzAct, false, 1, null);
        }
        m5500J();
        if (BuzzMediaCallManager.INSTANCE.T()) {
            return;
        }
        e51.J(this.noFaceRunnable);
        e51.H(c(), this.noFaceRunnable, 3000L);
    }

    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.a(c()) && (showingDialog = c().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.J(d());
        m5527U().setControlVBListener(null);
        m5513l0();
        ValueAnimator valueAnimator = this.resetAnim;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m5516G(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public void m5532j() {
        if (NullChecker.a(m5519M())) {
            m5519M().m227g();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5533k() {
        m5527U().m267y0();
        m5530X();
    }

    /* JADX INFO: renamed from: l */
    public void m5534l() {
        m5507f0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: m */
    public void m5535m() {
        m5506e0(R.string.r, false);
    }

    /* JADX INFO: renamed from: n */
    public void m5536n() {
        m5500J();
    }

    /* JADX INFO: renamed from: p */
    public void m5537p() {
        m5530X();
    }

    /* JADX INFO: renamed from: q */
    public void m5538q() {
        m5507f0(this, R.string.r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m5539r() {
        xdl0.X(m5528V(), xdl0.F0() + t100.h);
        m5526T().m304c(y2c0.s0, 0);
        m5501Y();
        m5504b0();
        m5531c0();
    }

    /* JADX INFO: renamed from: s */
    public void m5540s() {
        if (m6w.INSTANCE.a(c()) && xdl0.O0(m5520N())) {
            m5520N().m168b();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m5541x() {
        h6w.INSTANCE.f(C0(), m5527U(), "video_bonus_tip");
    }

    /* JADX INFO: renamed from: y */
    public void m5542y() {
        m5509h0();
        m5527U().m268z0();
    }

    /* JADX INFO: renamed from: z */
    public void m5543z() {
        BuzzMediaCallManager.v(BuzzMediaCallManager.INSTANCE, 0, 1, (Object) null);
        Act act = act();
        if (act != null) {
            act.finish();
        }
    }
}
