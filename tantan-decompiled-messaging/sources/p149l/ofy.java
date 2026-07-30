package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.CountDownTimer;
import android.text.TextUtils;
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
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.memoji.MemojiBuzzAct;
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
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ·\u00012\u00020\u0001:\u0002¸\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ9\u0010<\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\bR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010k\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010J\u001a\u0004\bi\u0010L\"\u0004\bj\u0010NR\"\u0010r\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0084\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b,\u0010t\u001a\u0005\b\u0082\u0001\u0010v\"\u0005\b\u0083\u0001\u0010xR%\u0010\u0087\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b1\u0010t\u001a\u0005\b\u0085\u0001\u0010v\"\u0005\b\u0086\u0001\u0010xR%\u0010\u008a\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b(\u0010Q\u001a\u0005\b\u0088\u0001\u0010S\"\u0005\b\u0089\u0001\u0010UR)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b?\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u009c\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b<\u0010t\u001a\u0005\b\u009a\u0001\u0010v\"\u0005\b\u009b\u0001\u0010xR&\u0010 \u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010t\u001a\u0005\b\u009e\u0001\u0010v\"\u0005\b\u009f\u0001\u0010xR*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u0002058\u0002X\u0082D¢\u0006\u0007\n\u0005\b.\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010¬\u0001R\u0019\u0010®\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010¬\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006¹\u0001"}, m87232d2 = {"Ll/ofy;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "g0", "()V", "e0", "", ShareConstants.RES_PATH, "", "needQuit", "k0", "(IZ)V", "h0", "time", "maxProgress", "q0", "(II)V", "t0", "o0", "s0", "m0", "j0", "()Z", "u0", "(I)V", "L", "M", "n0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "i0", BaseSei.f13931Y, "k", "p", "d0", BaseSei.f13930X, "j", "destroy", "q", "m", BLiveStormDanmakuGiftResourceType.f44444l, "n", "", Constants.KEY_KEY, "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", BaseSei.f13932Z, BLiveStormDanmakuGiftResourceType.f44446s, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_memoji_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_memoji_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "Y", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", "h", "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", RXScreenCaptureService.KEY_INDEX, "N", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "Z", "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", BloodType.f38728O, "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "X", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "W", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "R", "set_memoji_control", "_memoji_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "b0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lv/VFrame;", Constants.KEY_T, "Lv/VFrame;", j6f.LATITUDE_SOUTH, "()Lv/VFrame;", "set_memoji_tips", "(Lv/VFrame;)V", "_memoji_tips", j6f.GPS_DIRECTION_TRUE, "set_memoji_tips_count_down", "_memoji_tips_count_down", ResourceDirection.f38808v, "get_memoji_tips_count_tip", "set_memoji_tips_count_tip", "_memoji_tips_count_tip", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "w", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/String;", "MEMOJI_BUZZ_READY_CLOSE", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "memojiRunnable", "noFaceRunnable", "Landroid/os/CountDownTimer;", "A", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "B", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ofy extends dp2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public CountDownTimer timer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator resetAnim;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ConstraintLayout _memoji_call_root;

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
    public View _memoji_control;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public MediaBuzzCallControlView _vb_control;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VFrame _memoji_tips;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _memoji_tips_count_down;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _memoji_tips_count_tip;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public BuzzNoFaceTipView _no_face_tip;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final String MEMOJI_BUZZ_READY_CLOSE;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public Runnable memojiRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public Runnable noFaceRunnable;

    /* JADX INFO: renamed from: l.ofy$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/ofy$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18928b implements oe50 {
        public C18928b() {
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: a */
        public void mo126822a() {
            ofy.this.m164130P().m47199h();
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: b */
        public void mo126823b() {
            ofy.m164121l0(ofy.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.ofy$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/ofy$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18929c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f143788a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ofy f143789b;

        public C18929c(boolean z, ofy ofyVar) {
            this.f143788a = z;
            this.f143789b = ofyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f143788a && m6w.INSTANCE.m153296a(this.f143789b.getAct())) {
                this.f143789b.m164140Z().animate().alpha(0.0f).setDuration(400L).start();
                this.f143789b.m164136V().animate().translationX(-t100.f167261j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f143789b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f143789b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.ofy$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/ofy$d", "Landroid/os/CountDownTimer;", "", Careers.f38732it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class CountDownTimerC18930d extends CountDownTimer {
        public CountDownTimerC18930d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ofy.this.m164155t0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.m153296a(ofy.this.getAct())) {
                ofy.this.m164141a0().setProgress(i);
                ofy.this.m164129O().setText(m6wVar.m153298c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofy(@NotNull Act act) {
        super(act);
        act.getClass();
        this.MEMOJI_BUZZ_READY_CLOSE = "memoji_buzz_ready_close";
        this.memojiRunnable = new Runnable() { // from class: l.hfy
            @Override // java.lang.Runnable
            public final void run() {
                ofy.m164115G(this.f107531a);
            }
        };
        this.noFaceRunnable = new Runnable() { // from class: l.ify
            @Override // java.lang.Runnable
            public final void run() {
                ofy.m164113E(this.f113062a);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static void m164111B(final ofy ofyVar, View view) {
        j8w.INSTANCE.m140473a().m140453k1("report_snapshot", "memojiBuzz");
        p9w.INSTANCE.m167958u0("memojiBuzz");
        f6w.INSTANCE.m119693a0(ofyVar.getAct(), new Function0() { // from class: l.mfy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ofy.m164120f0(this.f133630a);
            }
        }, "memojiBuzz");
    }

    /* JADX INFO: renamed from: E */
    public static void m164113E(ofy ofyVar) {
        if (m6w.INSTANCE.m153296a(ofyVar.getAct()) && !BuzzMediaCallManager.INSTANCE.m46955T()) {
            p9w.INSTANCE.m167931e0();
            ofyVar.m164135U().m47144d();
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m164114F(ofy ofyVar) {
        ViewGroup.LayoutParams layoutParams = ofyVar.m164130P().getLayoutParams();
        layoutParams.height = ofyVar.m164142b0().getHeight() + t100.m186890d(310.0f);
        ofyVar.m164130P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m164115G(ofy ofyVar) {
        if (m6w.INSTANCE.m153296a(ofyVar.getAct())) {
            ofyVar.m164132R().setAlpha(1.0f);
            ofyVar.m164127M();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m164116H(ofy ofyVar, View view) {
        p9w.INSTANCE.m167930d0();
        ofyVar.m164151n0();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m164119e0() {
        xdl0.m208329E0(m164143c0(), new View.OnClickListener() { // from class: l.kfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ofy.m164111B(this.f122981a, view);
            }
        });
        m164142b0().setControlVBListener(new C18928b());
        xdl0.m208329E0(m164132R(), new View.OnClickListener() { // from class: l.lfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ofy.m164116H(this.f127937a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m164120f0(ofy ofyVar) {
        j8w.INSTANCE.m140473a().m140444e1("memojiBuzz");
        m164121l0(ofyVar, R$string.f20217e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m164121l0(ofy ofyVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f20267z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        ofyVar.m164149k0(i, z);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m164122p0(ofy ofyVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        ofyVar.m164141a0().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m164123r0(ofyVar, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m164123r0(ofy ofyVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        ofyVar.m164153q0(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m164124s0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m164125I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM168659b = pfy.m168659b(this, inflater, parent);
        viewM168659b.getClass();
        return viewM168659b;
    }

    /* JADX INFO: renamed from: L */
    public final void m164126L() {
        SurfaceView surfaceView;
        String userId = j8w.INSTANCE.m140473a().m140417B0().getUserId();
        if (userId == null || (surfaceView = BuzzMediaCallManager.INSTANCE.m46946J().get(Long.valueOf(Long.parseLong(userId)))) == null || Intrinsics.m87488d(surfaceView.getParent(), m164139Y())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m164139Y().removeAllViews();
        m164139Y().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: M */
    public final void m164127M() {
        xdl0.m208344M(m164133S(), true);
        m164134T().setText("5");
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g(this.MEMOJI_BUZZ_READY_CLOSE).m31517a(true).m31522f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS + mqi0.m155944o()).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m164128N() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m164129O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m164130P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m87502r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final ConstraintLayout m164131Q() {
        ConstraintLayout constraintLayout = this._memoji_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_memoji_call_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m164132R() {
        View view = this._memoji_control;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_memoji_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VFrame m164133S() {
        VFrame vFrame = this._memoji_tips;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_memoji_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m164134T() {
        VText vText = this._memoji_tips_count_down;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_memoji_tips_count_down");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final BuzzNoFaceTipView m164135U() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.m87502r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m164136V() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m164137W() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m164138X() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final FrameLayout m164139Y() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m164140Z() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ZebraProgress m164141a0() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m87502r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final MediaBuzzCallControlView m164142b0() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.m87502r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m164143c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vb_report");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m164144d0() {
        if (m164148j0()) {
            m164150m0();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.m153296a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.m114745J(this.memojiRunnable);
        CoreModule.f17545c.f19685t1.m31516u(this.MEMOJI_BUZZ_READY_CLOSE);
        e51.m114745J(getEndRunnable());
        m164142b0().setControlVBListener(null);
        m164124s0();
        ValueAnimator valueAnimator = this.resetAnim;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m164145g0() {
        m6w.INSTANCE.m153307l(m164141a0(), m164129O());
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long jM131177c = hhxVarM140417B0.m131177c();
        m164153q0((int) jM131177c, ((long) hhxVarM140417B0.getProgressMax()) < jM131177c ? hhxVarM140417B0.getTotalDuration() * 1000 : hhxVarM140417B0.getProgressMax());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h0 */
    public final void m164146h0() {
        bp2 presenter = getPresenter();
        if (presenter != null) {
            presenter.m103030E0();
        }
        bp2 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.m103031F0();
        }
        m6w.INSTANCE.m153307l(m164140Z(), m164129O(), m164136V(), m164142b0(), m164143c0(), m164128N());
        m164142b0().m47236w0("memojiBuzz");
        j8w.Companion companion = j8w.INSTANCE;
        hhx hhxVarM140417B0 = companion.m140473a().m140417B0();
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
            m164150m0();
        } else {
            m164145g0();
        }
        m112859v(userM169430Pa);
        m164137W().setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM169430Pa.age);
        m164138X().setText(userM169430Pa.name);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        m112860w(userM169527p9 != null ? userM169527p9.gender : null);
        m164130P().post(new Runnable() { // from class: l.jfy
            @Override // java.lang.Runnable
            public final void run() {
                ofy.m164114F(this.f117700a);
            }
        });
        m164132R().setBackgroundResource(u9w.INSTANCE.m192679l(0, getSelfGender()));
        e51.m114743H(getAct(), this.memojiRunnable, ((long) companion.m140473a().m140417B0().getMemojiDuration()) * 1000);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m164147i0() {
        Act act = getAct();
        MemojiBuzzAct memojiBuzzAct = act instanceof MemojiBuzzAct ? (MemojiBuzzAct) act : null;
        if (memojiBuzzAct != null) {
            MemojiBuzzAct.m47007a2(memojiBuzzAct, false, 1, null);
        }
        m164126L();
        if (BuzzMediaCallManager.INSTANCE.m46955T()) {
            return;
        }
        e51.m114745J(this.noFaceRunnable);
        e51.m114743H(getAct(), this.noFaceRunnable, 3000L);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m164125I(inflater, parent);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: j */
    public void mo112851j() {
        if (NullChecker.m81303a(m164130P())) {
            m164130P().m47198g();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m164148j0() {
        return NullChecker.m81303a(m164143c0()) && xdl0.m208349O0(m164143c0());
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: k */
    public void mo112852k() {
        m164142b0().m47237y0();
        m164144d0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m164149k0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m46958W();
        }
        CoreModule.f17545c.f19685t1.m31516u(this.MEMOJI_BUZZ_READY_CLOSE);
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.m153296a(getAct())) {
            if (res != -1) {
                m164156u0(res);
            }
            m164124s0();
            m164142b0().m47235q0();
            m6wVar.m153299d(m164131Q(), m164143c0(), m164142b0());
            e51.m114745J(getEndRunnable());
            e51.m114743H(getAct(), getEndRunnable(), 2000L);
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: l */
    public void mo112853l() {
        m164121l0(this, 0, false, 3, null);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: m */
    public void mo112854m() {
        m164149k0(R$string.f20250r, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m164150m0() {
        if (j8w.INSTANCE.m140473a().m140417B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            m6w.INSTANCE.m153307l(m164140Z(), m164129O());
        } else {
            m6w.INSTANCE.m153305j(m164129O());
            m164152o0();
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: n */
    public void mo112855n() {
        m164126L();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m164151n0() {
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long startTime = (hhxVarM140417B0.getStartTime() + ((long) (hhxVarM140417B0.getMemojiDuration() * 1000))) - mqi0.m155944o();
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("MemojiBuzzCallViewModel", "renderMemojiIcon,result " + startTime);
        if (startTime > 0) {
            lsi0.m151593w(R$string.f20266z);
            return;
        }
        qa2Var.m173681a("MemojiBuzzCallViewModel", "renderMemojiIcon, _memoji_tips visible " + xdl0.m208349O0(m164133S()));
        if (xdl0.m208349O0(m164133S())) {
            CoreModule.f17545c.f19685t1.m31516u(this.MEMOJI_BUZZ_READY_CLOSE);
            xdl0.m208344M(m164133S(), false);
            m164132R().setBackgroundResource(u9w.INSTANCE.m192679l(1, getSelfGender()));
        } else {
            boolean zM46960Y = BuzzMediaCallManager.INSTANCE.m46960Y();
            lsi0.m151593w(zM46960Y ? R$string.f20152A : R$string.f20154B);
            qa2Var.m173681a("MemojiBuzzCallViewModel", "renderMemojiIcon, memojiOpenControl " + zM46960Y);
            m164132R().setBackgroundResource(zM46960Y ? u9w.INSTANCE.m192679l(1, getSelfGender()) : u9w.INSTANCE.m192679l(2, getSelfGender()));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m164152o0() {
        m164124s0();
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        if (hhxVarM140417B0.getStartTime() == 0) {
            return;
        }
        final boolean z = hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m164141a0().m47274c(y2c0.f195570m, 1);
            m164141a0().m47276e();
            qa2.INSTANCE.m173681a("MemojiBuzzCallViewModel", "callData.matchAnimPlay " + hhxVarM140417B0.getMatchAnimPlay());
            if (!hhxVarM140417B0.getMatchAnimPlay()) {
                m164130P().m47200i();
                hhxVarM140417B0.m131188n(true);
            }
        }
        if (xdl0.m208349O0(m164140Z())) {
            final int maxProgress = m164141a0().getMaxProgress();
            final int iM131177c = (int) hhxVarM140417B0.m131177c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m164141a0().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.f77155b);
            valueAnimatorOfInt.addListener(new C18929c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nfy
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ofy.m164122p0(this.f138825a, z, maxProgress, iM131177c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: p */
    public void mo112856p() {
        m164144d0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: q */
    public void mo112857q() {
        m164121l0(this, R$string.f20250r, false, 2, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m164153q0(int time, int maxProgress) {
        if (m6w.INSTANCE.m153296a(getAct())) {
            m164124s0();
            j8w.INSTANCE.m140473a().m140417B0().m131189o(maxProgress);
            m164141a0().setMax(maxProgress);
            if (!m164141a0().m47273b()) {
                m164141a0().m47275d();
            }
            CountDownTimerC18930d countDownTimerC18930d = new CountDownTimerC18930d(time);
            this.timer = countDownTimerC18930d;
            countDownTimerC18930d.start();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m164154r() {
        xdl0.m208360X(m164143c0(), xdl0.m208331F0() + t100.f167259h);
        m164141a0().m47274c(y2c0.f195583s0, 0);
        m164119e0();
        m164146h0();
        m164147i0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: s */
    public void mo112858s() {
        if (m6w.INSTANCE.m153296a(getAct()) && xdl0.m208349O0(m164135U())) {
            m164135U().m47143b();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m164155t0() {
        m164124s0();
        m164121l0(this, 0, false, 3, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        if (TextUtils.equals(this.MEMOJI_BUZZ_READY_CLOSE, key)) {
            long j = endTime - currentTime;
            m164134T().setText(String.valueOf(j / 1000));
            if (j <= 0) {
                xdl0.m208344M(m164133S(), false);
                m164151n0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m164156u0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.m151593w(res);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: x */
    public void mo112861x() {
        h6w.INSTANCE.m129534f(getContext(), m164142b0(), "memoji_bonus_tip");
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: y */
    public void mo112862y() {
        m164152o0();
        m164142b0().m47238z0();
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
