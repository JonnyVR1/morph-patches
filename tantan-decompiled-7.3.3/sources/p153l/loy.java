package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.memoji.MemojiBuzzAct;
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
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ·\u00012\u00020\u0001:\u0002¸\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ9\u0010<\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\bR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010k\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010J\u001a\u0004\bi\u0010L\"\u0004\bj\u0010NR\"\u0010r\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0084\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b,\u0010t\u001a\u0005\b\u0082\u0001\u0010v\"\u0005\b\u0083\u0001\u0010xR%\u0010\u0087\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b1\u0010t\u001a\u0005\b\u0085\u0001\u0010v\"\u0005\b\u0086\u0001\u0010xR%\u0010\u008a\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b(\u0010Q\u001a\u0005\b\u0088\u0001\u0010S\"\u0005\b\u0089\u0001\u0010UR)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b?\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u009c\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b<\u0010t\u001a\u0005\b\u009a\u0001\u0010v\"\u0005\b\u009b\u0001\u0010xR&\u0010 \u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010t\u001a\u0005\b\u009e\u0001\u0010v\"\u0005\b\u009f\u0001\u0010xR*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u0002058\u0002X\u0082D¢\u0006\u0007\n\u0005\b.\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010¬\u0001R\u0019\u0010®\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010¬\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006¹\u0001"}, m88121d2 = {"Ll/loy;", "Ll/up2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "g0", "()V", "e0", "", ShareConstants.RES_PATH, "", "needQuit", "k0", "(IZ)V", "h0", "time", "maxProgress", "q0", "(II)V", "t0", "o0", "s0", "m0", "j0", "()Z", "u0", "(I)V", "L", "M", "n0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "i0", BaseSei.f14625Y, "k", "p", "d0", BaseSei.f14624X, "j", "destroy", "q", "m", BLiveStormDanmakuGiftResourceType.f45292l, "n", "", Constants.KEY_KEY, "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", BaseSei.f14626Z, BLiveStormDanmakuGiftResourceType.f45294s, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_memoji_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_memoji_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "Y", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", "h", "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", RXScreenCaptureService.KEY_INDEX, "N", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "Z", "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", BloodType.f39576O, "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "X", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "W", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "R", "set_memoji_control", "_memoji_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "b0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lv/VFrame;", Constants.KEY_T, "Lv/VFrame;", p7f.LATITUDE_SOUTH, "()Lv/VFrame;", "set_memoji_tips", "(Lv/VFrame;)V", "_memoji_tips", p7f.GPS_DIRECTION_TRUE, "set_memoji_tips_count_down", "_memoji_tips_count_down", ResourceDirection.f39656v, "get_memoji_tips_count_tip", "set_memoji_tips_count_tip", "_memoji_tips_count_tip", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "w", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/String;", "MEMOJI_BUZZ_READY_CLOSE", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "memojiRunnable", "noFaceRunnable", "Landroid/os/CountDownTimer;", "A", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "B", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class loy extends up2 {

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

    /* JADX INFO: renamed from: l.loy$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/loy$b", "Ll/vm50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18432b implements vm50 {
        public C18432b() {
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: a */
        public void mo151617a() {
            loy.this.m155125P().m48382h();
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: b */
        public void mo151618b() {
            loy.m155116l0(loy.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.loy$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/loy$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18433c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f132986a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ loy f132987b;

        public C18433c(boolean z, loy loyVar) {
            this.f132986a = z;
            this.f132987b = loyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f132986a && k8w.INSTANCE.m148752a(this.f132987b.getAct())) {
                this.f132987b.m155135Z().animate().alpha(0.0f).setDuration(400L).start();
                this.f132987b.m155131V().animate().translationX(-qa00.f156323j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f132987b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f132987b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.loy$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/loy$d", "Landroid/os/CountDownTimer;", "", Careers.f39580it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CountDownTimerC18434d extends CountDownTimer {
        public CountDownTimerC18434d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            loy.this.m155152t0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            k8w k8wVar = k8w.INSTANCE;
            if (k8wVar.m148752a(loy.this.getAct())) {
                loy.this.m155136a0().setProgress(i);
                loy.this.m155124O().setText(k8wVar.m148754c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loy(@NotNull Act act) {
        super(act);
        act.getClass();
        this.MEMOJI_BUZZ_READY_CLOSE = "memoji_buzz_ready_close";
        this.memojiRunnable = new Runnable() { // from class: l.eoy
            @Override // java.lang.Runnable
            public final void run() {
                loy.m155110G(this.f95190a);
            }
        };
        this.noFaceRunnable = new Runnable() { // from class: l.foy
            @Override // java.lang.Runnable
            public final void run() {
                loy.m155108E(this.f100095a);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static void m155106B(final loy loyVar, View view) {
        haw.INSTANCE.m134320a().m134300k1("report_snapshot", "memojiBuzz");
        nbw.INSTANCE.m162262u0("memojiBuzz");
        d8w.INSTANCE.m114978a0(loyVar.getAct(), new Function0() { // from class: l.joy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return loy.m155115f0(this.f122063a);
            }
        }, "memojiBuzz");
    }

    /* JADX INFO: renamed from: E */
    public static void m155108E(loy loyVar) {
        if (k8w.INSTANCE.m148752a(loyVar.getAct()) && !BuzzMediaCallManager.INSTANCE.m48138T()) {
            nbw.INSTANCE.m162235e0();
            loyVar.m155130U().m48327d();
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m155109F(loy loyVar) {
        ViewGroup.LayoutParams layoutParams = loyVar.m155125P().getLayoutParams();
        layoutParams.height = loyVar.m155137b0().getHeight() + qa00.m175859d(310.0f);
        loyVar.m155125P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m155110G(loy loyVar) {
        if (k8w.INSTANCE.m148752a(loyVar.getAct())) {
            loyVar.m155127R().setAlpha(1.0f);
            loyVar.m155122M();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m155111H(loy loyVar, View view) {
        nbw.INSTANCE.m162234d0();
        loyVar.m155147n0();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m155114e0() {
        bnl0.m105509E0(m155138c0(), new View.OnClickListener() { // from class: l.hoy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                loy.m155106B(this.f110966a, view);
            }
        });
        m155137b0().setControlVBListener(new C18432b());
        bnl0.m105509E0(m155127R(), new View.OnClickListener() { // from class: l.ioy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                loy.m155111H(this.f116229a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m155115f0(loy loyVar) {
        haw.INSTANCE.m134320a().m134291e1("memojiBuzz");
        m155116l0(loyVar, R$string.f20959e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m155116l0(loy loyVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f21009z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        loyVar.m155144k0(i, z);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m155117p0(loy loyVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        loyVar.m155136a0().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m155118r0(loyVar, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m155118r0(loy loyVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        loyVar.m155149q0(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m155119s0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m155120I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM159326b = moy.m159326b(this, inflater, parent);
        viewM159326b.getClass();
        return viewM159326b;
    }

    /* JADX INFO: renamed from: L */
    public final void m155121L() {
        SurfaceView surfaceView;
        String userId = haw.INSTANCE.m134320a().m134264B0().getUserId();
        if (userId == null || (surfaceView = BuzzMediaCallManager.INSTANCE.m48129J().get(Long.valueOf(Long.parseLong(userId)))) == null || Intrinsics.m88377d(surfaceView.getParent(), m155134Y())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m155134Y().removeAllViews();
        m155134Y().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: M */
    public final void m155122M() {
        bnl0.m105524M(m155128S(), true);
        m155129T().setText("5");
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g(this.MEMOJI_BUZZ_READY_CLOSE).m32520a(true).m32525f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS + pzi0.m174454o()).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m155123N() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m155124O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m155125P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m88391r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final ConstraintLayout m155126Q() {
        ConstraintLayout constraintLayout = this._memoji_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_memoji_call_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m155127R() {
        View view = this._memoji_control;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_memoji_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VFrame m155128S() {
        VFrame vFrame = this._memoji_tips;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_memoji_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m155129T() {
        VText vText = this._memoji_tips_count_down;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_memoji_tips_count_down");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final BuzzNoFaceTipView m155130U() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.m88391r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m155131V() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m155132W() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m155133X() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final FrameLayout m155134Y() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m155135Z() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ZebraProgress m155136a0() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m88391r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final MediaBuzzCallControlView m155137b0() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.m88391r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m155138c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_vb_report");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m155139d0() {
        if (m155143j0()) {
            m155145m0();
        }
    }

    @Override // p153l.iam
    public void destroy() {
        Dialog showingDialog;
        if (k8w.INSTANCE.m148752a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        l51.m152890J(this.memojiRunnable);
        CoreModule.f18264c.f20427t1.m32519u(this.MEMOJI_BUZZ_READY_CLOSE);
        l51.m152890J(getEndRunnable());
        m155137b0().setControlVBListener(null);
        m155119s0();
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
    public final void m155140g0() {
        k8w.INSTANCE.m148763l(m155136a0(), m155124O());
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long jM122074c = eqxVarM134264B0.m122074c();
        m155149q0((int) jM122074c, ((long) eqxVarM134264B0.getProgressMax()) < jM122074c ? eqxVarM134264B0.getTotalDuration() * 1000 : eqxVarM134264B0.getProgressMax());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h0 */
    public final void m155141h0() {
        sp2 presenter = getPresenter();
        if (presenter != null) {
            presenter.m187320E0();
        }
        sp2 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.m187321F0();
        }
        k8w.INSTANCE.m148763l(m155135Z(), m155124O(), m155131V(), m155137b0(), m155138c0(), m155123N());
        m155137b0().m48419w0("memojiBuzz");
        haw.Companion companion = haw.INSTANCE;
        eqx eqxVarM134264B0 = companion.m134320a().m134264B0();
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
            m155145m0();
        } else {
            m155140g0();
        }
        m197044v(userM116503Pa);
        m155132W().setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM116503Pa.age);
        m155133X().setText(userM116503Pa.name);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        m197045w(userM116600p9 != null ? userM116600p9.gender : null);
        m155125P().post(new Runnable() { // from class: l.goy
            @Override // java.lang.Runnable
            public final void run() {
                loy.m155109F(this.f105400a);
            }
        });
        m155127R().setBackgroundResource(sbw.INSTANCE.m185347l(0, getSelfGender()));
        l51.m152888H(getAct(), this.memojiRunnable, ((long) companion.m134320a().m134264B0().getMemojiDuration()) * 1000);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m155142i0() {
        Act act = getAct();
        MemojiBuzzAct memojiBuzzAct = act instanceof MemojiBuzzAct ? (MemojiBuzzAct) act : null;
        if (memojiBuzzAct != null) {
            MemojiBuzzAct.m48190b2(memojiBuzzAct, false, 1, null);
        }
        m155121L();
        if (BuzzMediaCallManager.INSTANCE.m48138T()) {
            return;
        }
        l51.m152890J(this.noFaceRunnable);
        l51.m152888H(getAct(), this.noFaceRunnable, 3000L);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m155120I(inflater, parent);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: j */
    public void mo151606j() {
        if (NullChecker.m82486a(m155125P())) {
            m155125P().m48381g();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m155143j0() {
        return NullChecker.m82486a(m155138c0()) && bnl0.m105529O0(m155138c0());
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: k */
    public void mo151607k() {
        m155137b0().m48420y0();
        m155139d0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m155144k0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m48141W();
        }
        CoreModule.f18264c.f20427t1.m32519u(this.MEMOJI_BUZZ_READY_CLOSE);
        k8w k8wVar = k8w.INSTANCE;
        if (k8wVar.m148752a(getAct())) {
            if (res != -1) {
                m155153u0(res);
            }
            m155119s0();
            m155137b0().m48418q0();
            k8wVar.m148755d(m155126Q(), m155138c0(), m155137b0());
            l51.m152890J(getEndRunnable());
            l51.m152888H(getAct(), getEndRunnable(), 2000L);
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: l */
    public void mo151608l() {
        m155116l0(this, 0, false, 3, null);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: m */
    public void mo151609m() {
        m155144k0(R$string.f20992r, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m155145m0() {
        if (haw.INSTANCE.m134320a().m134264B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            k8w.INSTANCE.m148763l(m155135Z(), m155124O());
        } else {
            k8w.INSTANCE.m148761j(m155124O());
            m155148o0();
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: n */
    public void mo155146n() {
        m155121L();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m155147n0() {
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long startTime = (eqxVarM134264B0.getStartTime() + ((long) (eqxVarM134264B0.getMemojiDuration() * 1000))) - pzi0.m174454o();
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("MemojiBuzzCallViewModel", "renderMemojiIcon,result " + startTime);
        if (startTime > 0) {
            o1j0.m165649w(R$string.f21008z);
            return;
        }
        xa2Var.m209830a("MemojiBuzzCallViewModel", "renderMemojiIcon, _memoji_tips visible " + bnl0.m105529O0(m155128S()));
        if (bnl0.m105529O0(m155128S())) {
            CoreModule.f18264c.f20427t1.m32519u(this.MEMOJI_BUZZ_READY_CLOSE);
            bnl0.m105524M(m155128S(), false);
            m155127R().setBackgroundResource(sbw.INSTANCE.m185347l(1, getSelfGender()));
        } else {
            boolean zM48143Y = BuzzMediaCallManager.INSTANCE.m48143Y();
            o1j0.m165649w(zM48143Y ? R$string.f20894A : R$string.f20896B);
            xa2Var.m209830a("MemojiBuzzCallViewModel", "renderMemojiIcon, memojiOpenControl " + zM48143Y);
            m155127R().setBackgroundResource(zM48143Y ? sbw.INSTANCE.m185347l(1, getSelfGender()) : sbw.INSTANCE.m185347l(2, getSelfGender()));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m155148o0() {
        m155119s0();
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        if (eqxVarM134264B0.getStartTime() == 0) {
            return;
        }
        final boolean z = eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m155136a0().m48457c(ebc0.f92892m, 1);
            m155136a0().m48459e();
            xa2.INSTANCE.m209830a("MemojiBuzzCallViewModel", "callData.matchAnimPlay " + eqxVarM134264B0.getMatchAnimPlay());
            if (!eqxVarM134264B0.getMatchAnimPlay()) {
                m155125P().m48383i();
                eqxVarM134264B0.m122085n(true);
            }
        }
        if (bnl0.m105529O0(m155135Z())) {
            final int maxProgress = m155136a0().getMaxProgress();
            final int iM122074c = (int) eqxVarM134264B0.m122074c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m155136a0().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(gt0.f106347b);
            valueAnimatorOfInt.addListener(new C18433c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.koy
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    loy.m155117p0(this.f127807a, z, maxProgress, iM122074c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: p */
    public void mo151611p() {
        m155139d0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: q */
    public void mo151612q() {
        m155116l0(this, R$string.f20992r, false, 2, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m155149q0(int time, int maxProgress) {
        if (k8w.INSTANCE.m148752a(getAct())) {
            m155119s0();
            haw.INSTANCE.m134320a().m134264B0().m122086o(maxProgress);
            m155136a0().setMax(maxProgress);
            if (!m155136a0().m48456b()) {
                m155136a0().m48458d();
            }
            CountDownTimerC18434d countDownTimerC18434d = new CountDownTimerC18434d(time);
            this.timer = countDownTimerC18434d;
            countDownTimerC18434d.start();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m155150r() {
        bnl0.m105540X(m155138c0(), bnl0.m105511F0() + qa00.f156321h);
        m155136a0().m48457c(ebc0.f92905s0, 0);
        m155114e0();
        m155141h0();
        m155142i0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: s */
    public void mo155151s() {
        if (k8w.INSTANCE.m148752a(getAct()) && bnl0.m105529O0(m155130U())) {
            m155130U().m48326b();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m155152t0() {
        m155119s0();
        m155116l0(this, 0, false, 3, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        if (TextUtils.equals(this.MEMOJI_BUZZ_READY_CLOSE, key)) {
            long j = endTime - currentTime;
            m155129T().setText(String.valueOf(j / 1000));
            if (j <= 0) {
                bnl0.m105524M(m155128S(), false);
                m155147n0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m155153u0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        o1j0.m165649w(res);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: x */
    public void mo151614x() {
        f8w.INSTANCE.m124570f(getContext(), m155137b0(), "memoji_bonus_tip");
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: y */
    public void mo151615y() {
        m155148o0();
        m155137b0().m48421z0();
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
