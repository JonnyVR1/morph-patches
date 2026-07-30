package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.VideoBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0098\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010g\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010y\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010i\u001a\u0004\bw\u0010k\"\u0004\bx\u0010mR\"\u0010|\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010i\u001a\u0004\bz\u0010k\"\u0004\b{\u0010mR&\u0010\u0083\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b&\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b4\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, m87232d2 = {"Ll/k1l0;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "Y", "", ShareConstants.RES_PATH, "", "needQuit", "e0", "(IZ)V", "b0", "time", "maxProgress", "j0", "(II)V", "m0", "h0", "l0", "g0", "d0", "()Z", "n0", "(I)V", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "c0", BaseSei.f13931Y, "k", "p", "X", BaseSei.f13930X, "j", "destroy", "q", "m", BLiveStormDanmakuGiftResourceType.f44444l, "n", BaseSei.f13932Z, BLiveStormDanmakuGiftResourceType.f44446s, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "W", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_video_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_video_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "R", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", "h", "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", RXScreenCaptureService.KEY_INDEX, "K", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "M", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", j6f.LATITUDE_SOUTH, "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", j6f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", "L", "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", BloodType.f38728O, "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "Q", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "P", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "N", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/Runnable;", Constants.KEY_T, "Ljava/lang/Runnable;", "noFaceRunnable", "Landroid/os/CountDownTimer;", "u", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", ResourceDirection.f38808v, "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/k1l0$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17909b implements oe50 {
        public C17909b() {
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: a */
        public void mo126822a() {
            k1l0.this.m144207M().m47199h();
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: b */
        public void mo126823b() {
            k1l0.m144195f0(k1l0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.k1l0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/k1l0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17910c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f120630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ k1l0 f120631b;

        public C17910c(boolean z, k1l0 k1l0Var) {
            this.f120630a = z;
            this.f120631b = k1l0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f120630a && m6w.INSTANCE.m153296a(this.f120631b.getAct())) {
                this.f120631b.m144213S().animate().alpha(0.0f).setDuration(400L).start();
                this.f120631b.m144209O().animate().translationX(-t100.f167261j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f120631b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f120631b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.k1l0$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/k1l0$d", "Landroid/os/CountDownTimer;", "", Careers.f38732it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class CountDownTimerC17911d extends CountDownTimer {
        public CountDownTimerC17911d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            k1l0.this.m144202m0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.m153296a(k1l0.this.getAct())) {
                k1l0.this.m144214T().setProgress(i);
                k1l0.this.m144206L().setText(m6wVar.m153298c(it));
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
                k1l0.m144181A(this.f94107a);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static void m144181A(k1l0 k1l0Var) {
        if (m6w.INSTANCE.m153296a(k1l0Var.getAct()) && !BuzzMediaCallManager.INSTANCE.m46955T()) {
            p9w.INSTANCE.m167901A0();
            k1l0Var.m144208N().m47144d();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m144183C(final k1l0 k1l0Var, View view) {
        j8w.m140398l1(j8w.INSTANCE.m140473a(), "report_snapshot", null, 2, null);
        p9w.INSTANCE.m167958u0("videoBuzz");
        f6w.INSTANCE.m119693a0(k1l0Var.getAct(), new Function0() { // from class: l.j1l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k1l0.m144190Z(this.f115821a);
            }
        }, "videoBuzz");
    }

    /* JADX INFO: renamed from: F */
    public static void m144185F(k1l0 k1l0Var) {
        ViewGroup.LayoutParams layoutParams = k1l0Var.m144207M().getLayoutParams();
        layoutParams.height = k1l0Var.m144215U().getHeight() + t100.m186890d(310.0f);
        k1l0Var.m144207M().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: J */
    private final void m144188J() {
        SurfaceView surfaceView;
        String userId = j8w.INSTANCE.m140473a().m140417B0().getUserId();
        if (userId == null || (surfaceView = BuzzMediaCallManager.INSTANCE.m46946J().get(Long.valueOf(Long.parseLong(userId)))) == null || Intrinsics.m87488d(surfaceView.getParent(), m144212R())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m144212R().removeAllViews();
        m144212R().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: Y */
    private final void m144189Y() {
        xdl0.m208329E0(m144216V(), new View.OnClickListener() { // from class: l.g1l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k1l0.m144183C(this.f100185a, view);
            }
        });
        m144215U().setControlVBListener(new C17909b());
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m144190Z(k1l0 k1l0Var) {
        j8w.INSTANCE.m140473a().m140444e1("videoBuzz");
        m144195f0(k1l0Var, R$string.f20217e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m144191a0() {
        m6w.INSTANCE.m153307l(m144214T(), m144206L());
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long jM131177c = hhxVarM140417B0.m131177c();
        m144199j0((int) jM131177c, ((long) hhxVarM140417B0.getProgressMax()) < jM131177c ? hhxVarM140417B0.getTotalDuration() * 1000 : hhxVarM140417B0.getProgressMax());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b0 */
    private final void m144192b0() {
        bp2 presenter = getPresenter();
        if (presenter != null) {
            presenter.m103030E0();
        }
        bp2 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.m103031F0();
        }
        m6w.INSTANCE.m153307l(m144213S(), m144206L(), m144209O(), m144215U(), m144216V(), m144205K());
        m144215U().m47236w0("videoBuzz");
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        pib pibVar = CoreModule.f17545c.f19639e0;
        String userId = hhxVarM140417B0.getUserId();
        if (userId == null) {
            userId = "";
        }
        User userM169430Pa = pibVar.m169430Pa(userId);
        if (userM169430Pa == null) {
            return;
        }
        if (hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED) {
            m144196g0();
        } else {
            m144191a0();
        }
        m112859v(userM169430Pa);
        m144210P().setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM169430Pa.age);
        m144211Q().setText(userM169430Pa.name);
        m144207M().post(new Runnable() { // from class: l.h1l0
            @Override // java.lang.Runnable
            public final void run() {
                k1l0.m144185F(this.f105437a);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m144193d0() {
        return NullChecker.m81303a(m144216V()) && xdl0.m208349O0(m144216V());
    }

    /* JADX INFO: renamed from: e0 */
    private final void m144194e0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m46958W();
        }
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.m153296a(getAct())) {
            if (res != -1) {
                m144203n0(res);
            }
            m144201l0();
            m144215U().m47235q0();
            m6wVar.m153299d(m144217W(), m144216V(), m144215U());
            e51.m114745J(getEndRunnable());
            e51.m114743H(getAct(), getEndRunnable(), 2000L);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m144195f0(k1l0 k1l0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f20267z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        k1l0Var.m144194e0(i, z);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m144196g0() {
        if (j8w.INSTANCE.m140473a().m140417B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            m6w.INSTANCE.m153307l(m144213S(), m144206L());
        } else {
            m6w.INSTANCE.m153305j(m144206L());
            m144197h0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m144197h0() {
        m144201l0();
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getStartTime() == 0) {
            return;
        }
        final boolean z = hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m144214T().m47274c(y2c0.f195570m, 1);
            m144214T().m47276e();
            qa2.INSTANCE.m173681a("VideoBuzzCallViewModel", "callData.matchAnimPlay " + hhxVarM140417B0.getMatchAnimPlay());
            if (!hhxVarM140417B0.getMatchAnimPlay()) {
                m144207M().m47200i();
                hhxVarM140417B0.m131188n(true);
            }
        }
        if (xdl0.m208349O0(m144213S())) {
            final int maxProgress = m144214T().getMaxProgress();
            final int iM131177c = (int) hhxVarM140417B0.m131177c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m144214T().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.f77155b);
            valueAnimatorOfInt.addListener(new C17910c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i1l0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    k1l0.m144198i0(this.f110467a, z, maxProgress, iM131177c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m144198i0(k1l0 k1l0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        k1l0Var.m144214T().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m144200k0(k1l0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m144199j0(int time, int maxProgress) {
        if (m6w.INSTANCE.m153296a(getAct())) {
            m144201l0();
            j8w.INSTANCE.m140473a().m140417B0().m131189o(maxProgress);
            m144214T().setMax(maxProgress);
            if (!m144214T().m47273b()) {
                m144214T().m47275d();
            }
            CountDownTimerC17911d countDownTimerC17911d = new CountDownTimerC17911d(time);
            this.timer = countDownTimerC17911d;
            countDownTimerC17911d.start();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m144200k0(k1l0 k1l0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        k1l0Var.m144199j0(i, i2);
    }

    /* JADX INFO: renamed from: l0 */
    private final void m144201l0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final void m144202m0() {
        m144201l0();
        m144195f0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m144203n0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.m151593w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m144204G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM148194b = l1l0.m148194b(this, inflater, parent);
        viewM148194b.getClass();
        return viewM148194b;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m144205K() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m144206L() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LoveBuzzMatchView m144207M() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m87502r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final BuzzNoFaceTipView m144208N() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.m87502r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m144209O() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m144210P() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VText m144211Q() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final FrameLayout m144212R() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final FrameLayout m144213S() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final ZebraProgress m144214T() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m87502r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final MediaBuzzCallControlView m144215U() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.m87502r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m144216V() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final ConstraintLayout m144217W() {
        ConstraintLayout constraintLayout = this._video_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_video_call_root");
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final void m144218X() {
        if (m144193d0()) {
            m144196g0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m144219c0() {
        Act act = getAct();
        VideoBuzzAct videoBuzzAct = act instanceof VideoBuzzAct ? (VideoBuzzAct) act : null;
        if (videoBuzzAct != null) {
            VideoBuzzAct.m47066a2(videoBuzzAct, false, 1, null);
        }
        m144188J();
        if (BuzzMediaCallManager.INSTANCE.m46955T()) {
            return;
        }
        e51.m114745J(this.noFaceRunnable);
        e51.m114743H(getAct(), this.noFaceRunnable, 3000L);
    }

    @Override // p149l.s7m
    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.m153296a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.m114745J(getEndRunnable());
        m144215U().setControlVBListener(null);
        m144201l0();
        ValueAnimator valueAnimator = this.resetAnim;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m144204G(inflater, parent);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: j */
    public void mo112851j() {
        if (NullChecker.m81303a(m144207M())) {
            m144207M().m47198g();
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: k */
    public void mo112852k() {
        m144215U().m47237y0();
        m144218X();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: l */
    public void mo112853l() {
        m144195f0(this, 0, false, 3, null);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: m */
    public void mo112854m() {
        m144194e0(R$string.f20250r, false);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: n */
    public void mo112855n() {
        m144188J();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: p */
    public void mo112856p() {
        m144218X();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: q */
    public void mo112857q() {
        m144195f0(this, R$string.f20250r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m144220r() {
        xdl0.m208360X(m144216V(), xdl0.m208331F0() + t100.f167259h);
        m144214T().m47274c(y2c0.f195583s0, 0);
        m144189Y();
        m144192b0();
        m144219c0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: s */
    public void mo112858s() {
        if (m6w.INSTANCE.m153296a(getAct()) && xdl0.m208349O0(m144208N())) {
            m144208N().m47143b();
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: x */
    public void mo112861x() {
        h6w.INSTANCE.m129534f(getContext(), m144215U(), "video_bonus_tip");
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: y */
    public void mo112862y() {
        m144197h0();
        m144215U().m47238z0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: z */
    public void mo112863z() {
        BuzzMediaCallManager.m46936v(BuzzMediaCallManager.INSTANCE, 0, 1, null);
        Act act = getAct();
        if (act != null) {
            act.lambda$debugItems$19();
        }
    }
}
