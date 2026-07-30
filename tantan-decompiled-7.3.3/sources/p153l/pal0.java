package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.video.VideoBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0098\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010y\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010i\u001a\u0004\bw\u0010k\"\u0004\bx\u0010mR\"\u0010|\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010i\u001a\u0004\bz\u0010k\"\u0004\b{\u0010mR&\u0010\u0083\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b&\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b4\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, m88121d2 = {"Ll/pal0;", "Ll/up2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "Y", "", ShareConstants.RES_PATH, "", "needQuit", "e0", "(IZ)V", "b0", "time", "maxProgress", "j0", "(II)V", "m0", "h0", "l0", "g0", "d0", "()Z", "n0", "(I)V", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "c0", BaseSei.f14625Y, "k", "p", "X", BaseSei.f14624X, "j", "destroy", "q", "m", BLiveStormDanmakuGiftResourceType.f45292l, "n", BaseSei.f14626Z, BLiveStormDanmakuGiftResourceType.f45294s, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "W", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_video_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_video_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "R", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", "h", "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", RXScreenCaptureService.KEY_INDEX, "K", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "M", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", p7f.LATITUDE_SOUTH, "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", p7f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", "L", "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", BloodType.f39576O, "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "Q", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "P", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "N", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/Runnable;", Constants.KEY_T, "Ljava/lang/Runnable;", "noFaceRunnable", "Landroid/os/CountDownTimer;", "u", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", ResourceDirection.f39656v, "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pal0 extends up2 {

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

    /* JADX INFO: renamed from: l.pal0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/pal0$b", "Ll/vm50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19330b implements vm50 {
        public C19330b() {
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: a */
        public void mo151617a() {
            pal0.this.m171448M().m48382h();
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: b */
        public void mo151618b() {
            pal0.m171436f0(pal0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.pal0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/pal0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19331c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f151308a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pal0 f151309b;

        public C19331c(boolean z, pal0 pal0Var) {
            this.f151308a = z;
            this.f151309b = pal0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f151308a && k8w.INSTANCE.m148752a(this.f151309b.getAct())) {
                this.f151309b.m171454S().animate().alpha(0.0f).setDuration(400L).start();
                this.f151309b.m171450O().animate().translationX(-qa00.f156323j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f151309b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f151309b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.pal0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/pal0$d", "Landroid/os/CountDownTimer;", "", Careers.f39580it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CountDownTimerC19332d extends CountDownTimer {
        public CountDownTimerC19332d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            pal0.this.m171443m0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            k8w k8wVar = k8w.INSTANCE;
            if (k8wVar.m148752a(pal0.this.getAct())) {
                pal0.this.m171455T().setProgress(i);
                pal0.this.m171447L().setText(k8wVar.m148754c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pal0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.noFaceRunnable = new Runnable() { // from class: l.kal0
            @Override // java.lang.Runnable
            public final void run() {
                pal0.m171422A(this.f124699a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m171422A(pal0 pal0Var) {
        if (k8w.INSTANCE.m148752a(pal0Var.getAct()) && !BuzzMediaCallManager.INSTANCE.m48138T()) {
            nbw.INSTANCE.m162205A0();
            pal0Var.m171449N().m48327d();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m171424C(final pal0 pal0Var, View view) {
        haw.m134245l1(haw.INSTANCE.m134320a(), "report_snapshot", null, 2, null);
        nbw.INSTANCE.m162262u0("videoBuzz");
        d8w.INSTANCE.m114978a0(pal0Var.getAct(), new Function0() { // from class: l.oal0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pal0.m171431Z(this.f145745a);
            }
        }, "videoBuzz");
    }

    /* JADX INFO: renamed from: F */
    public static void m171426F(pal0 pal0Var) {
        ViewGroup.LayoutParams layoutParams = pal0Var.m171448M().getLayoutParams();
        layoutParams.height = pal0Var.m171456U().getHeight() + qa00.m175859d(310.0f);
        pal0Var.m171448M().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: J */
    private final void m171429J() {
        SurfaceView surfaceView;
        String userId = haw.INSTANCE.m134320a().m134264B0().getUserId();
        if (userId == null || (surfaceView = BuzzMediaCallManager.INSTANCE.m48129J().get(Long.valueOf(Long.parseLong(userId)))) == null || Intrinsics.m88377d(surfaceView.getParent(), m171453R())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m171453R().removeAllViews();
        m171453R().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: Y */
    private final void m171430Y() {
        bnl0.m105509E0(m171457V(), new View.OnClickListener() { // from class: l.lal0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pal0.m171424C(this.f130709a, view);
            }
        });
        m171456U().setControlVBListener(new C19330b());
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m171431Z(pal0 pal0Var) {
        haw.INSTANCE.m134320a().m134291e1("videoBuzz");
        m171436f0(pal0Var, R$string.f20959e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m171432a0() {
        k8w.INSTANCE.m148763l(m171455T(), m171447L());
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long jM122074c = eqxVarM134264B0.m122074c();
        m171440j0((int) jM122074c, ((long) eqxVarM134264B0.getProgressMax()) < jM122074c ? eqxVarM134264B0.getTotalDuration() * 1000 : eqxVarM134264B0.getProgressMax());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b0 */
    private final void m171433b0() {
        sp2 presenter = getPresenter();
        if (presenter != null) {
            presenter.m187320E0();
        }
        sp2 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.m187321F0();
        }
        k8w.INSTANCE.m148763l(m171454S(), m171447L(), m171450O(), m171456U(), m171457V(), m171446K());
        m171456U().m48419w0("videoBuzz");
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        dkb dkbVar = CoreModule.f18264c.f20381e0;
        String userId = eqxVarM134264B0.getUserId();
        if (userId == null) {
            userId = "";
        }
        User userM116503Pa = dkbVar.m116503Pa(userId);
        if (userM116503Pa == null) {
            return;
        }
        if (eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            m171437g0();
        } else {
            m171432a0();
        }
        m197044v(userM116503Pa);
        m171451P().setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM116503Pa.age);
        m171452Q().setText(userM116503Pa.name);
        m171448M().post(new Runnable() { // from class: l.mal0
            @Override // java.lang.Runnable
            public final void run() {
                pal0.m171426F(this.f135560a);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m171434d0() {
        return NullChecker.m82486a(m171457V()) && bnl0.m105529O0(m171457V());
    }

    /* JADX INFO: renamed from: e0 */
    private final void m171435e0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m48141W();
        }
        k8w k8wVar = k8w.INSTANCE;
        if (k8wVar.m148752a(getAct())) {
            if (res != -1) {
                m171444n0(res);
            }
            m171442l0();
            m171456U().m48418q0();
            k8wVar.m148755d(m171458W(), m171457V(), m171456U());
            l51.m152890J(getEndRunnable());
            l51.m152888H(getAct(), getEndRunnable(), 2000L);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m171436f0(pal0 pal0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f21009z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        pal0Var.m171435e0(i, z);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m171437g0() {
        if (haw.INSTANCE.m134320a().m134264B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            k8w.INSTANCE.m148763l(m171454S(), m171447L());
        } else {
            k8w.INSTANCE.m148761j(m171447L());
            m171438h0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m171438h0() {
        m171442l0();
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getStartTime() == 0) {
            return;
        }
        final boolean z = eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m171455T().m48457c(ebc0.f92892m, 1);
            m171455T().m48459e();
            xa2.INSTANCE.m209830a("VideoBuzzCallViewModel", "callData.matchAnimPlay " + eqxVarM134264B0.getMatchAnimPlay());
            if (!eqxVarM134264B0.getMatchAnimPlay()) {
                m171448M().m48383i();
                eqxVarM134264B0.m122085n(true);
            }
        }
        if (bnl0.m105529O0(m171454S())) {
            final int maxProgress = m171455T().getMaxProgress();
            final int iM122074c = (int) eqxVarM134264B0.m122074c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m171455T().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(gt0.f106347b);
            valueAnimatorOfInt.addListener(new C19331c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nal0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pal0.m171439i0(this.f141027a, z, maxProgress, iM122074c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m171439i0(pal0 pal0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        pal0Var.m171455T().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m171441k0(pal0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m171440j0(int time, int maxProgress) {
        if (k8w.INSTANCE.m148752a(getAct())) {
            m171442l0();
            haw.INSTANCE.m134320a().m134264B0().m122086o(maxProgress);
            m171455T().setMax(maxProgress);
            if (!m171455T().m48456b()) {
                m171455T().m48458d();
            }
            CountDownTimerC19332d countDownTimerC19332d = new CountDownTimerC19332d(time);
            this.timer = countDownTimerC19332d;
            countDownTimerC19332d.start();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m171441k0(pal0 pal0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        pal0Var.m171440j0(i, i2);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m171442l0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final void m171443m0() {
        m171442l0();
        m171436f0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m171444n0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        o1j0.m165649w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m171445G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM175945b = qal0.m175945b(this, inflater, parent);
        viewM175945b.getClass();
        return viewM175945b;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m171446K() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m171447L() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LoveBuzzMatchView m171448M() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m88391r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final BuzzNoFaceTipView m171449N() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.m88391r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m171450O() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m171451P() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VText m171452Q() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final FrameLayout m171453R() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final FrameLayout m171454S() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ZebraProgress m171455T() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m88391r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final MediaBuzzCallControlView m171456U() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.m88391r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m171457V() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final ConstraintLayout m171458W() {
        ConstraintLayout constraintLayout = this._video_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_video_call_root");
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final void m171459X() {
        if (m171434d0()) {
            m171437g0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m171460c0() {
        Act act = getAct();
        VideoBuzzAct videoBuzzAct = act instanceof VideoBuzzAct ? (VideoBuzzAct) act : null;
        if (videoBuzzAct != null) {
            VideoBuzzAct.m48249b2(videoBuzzAct, false, 1, null);
        }
        m171429J();
        if (BuzzMediaCallManager.INSTANCE.m48138T()) {
            return;
        }
        l51.m152890J(this.noFaceRunnable);
        l51.m152888H(getAct(), this.noFaceRunnable, 3000L);
    }

    @Override // p153l.iam
    public void destroy() {
        Dialog showingDialog;
        if (k8w.INSTANCE.m148752a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        l51.m152890J(getEndRunnable());
        m171456U().setControlVBListener(null);
        m171442l0();
        ValueAnimator valueAnimator = this.resetAnim;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m171445G(inflater, parent);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: j */
    public void mo151606j() {
        if (NullChecker.m82486a(m171448M())) {
            m171448M().m48381g();
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: k */
    public void mo151607k() {
        m171456U().m48420y0();
        m171459X();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: l */
    public void mo151608l() {
        m171436f0(this, 0, false, 3, null);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: m */
    public void mo151609m() {
        m171435e0(R$string.f20992r, false);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: n */
    public void mo155146n() {
        m171429J();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: p */
    public void mo151611p() {
        m171459X();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: q */
    public void mo151612q() {
        m171436f0(this, R$string.f20992r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m171461r() {
        bnl0.m105540X(m171457V(), bnl0.m105511F0() + qa00.f156321h);
        m171455T().m48457c(ebc0.f92905s0, 0);
        m171430Y();
        m171433b0();
        m171460c0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: s */
    public void mo155151s() {
        if (k8w.INSTANCE.m148752a(getAct()) && bnl0.m105529O0(m171449N())) {
            m171449N().m48326b();
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: x */
    public void mo151614x() {
        f8w.INSTANCE.m124570f(getContext(), m171456U(), "video_bonus_tip");
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: y */
    public void mo151615y() {
        m171438h0();
        m171456U().m48421z0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: z */
    public void mo151616z() {
        BuzzMediaCallManager.m48119v(BuzzMediaCallManager.INSTANCE, 0, 1, null);
        Act act = getAct();
        if (act != null) {
            act.lambda$debugItems$19();
        }
    }
}
