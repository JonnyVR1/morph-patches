package p003l;

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
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
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
import l.lsi0;
import l.m6w;
import l.mqi0;
import l.oe50;
import l.p9w;
import l.pfy;
import l.pib;
import l.qa2;
import l.t100;
import l.u9w;
import l.xdl0;
import l.y2c0;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ·\u00012\u00020\u0001:\u0002¸\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ9\u0010<\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\bR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010k\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010J\u001a\u0004\bi\u0010L\"\u0004\bj\u0010NR\"\u0010r\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0084\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b,\u0010t\u001a\u0005\b\u0082\u0001\u0010v\"\u0005\b\u0083\u0001\u0010xR%\u0010\u0087\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b1\u0010t\u001a\u0005\b\u0085\u0001\u0010v\"\u0005\b\u0086\u0001\u0010xR%\u0010\u008a\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b(\u0010Q\u001a\u0005\b\u0088\u0001\u0010S\"\u0005\b\u0089\u0001\u0010UR)\u0010\u0091\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b?\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u009c\u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b<\u0010t\u001a\u0005\b\u009a\u0001\u0010v\"\u0005\b\u009b\u0001\u0010xR&\u0010 \u0001\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010t\u001a\u0005\b\u009e\u0001\u0010v\"\u0005\b\u009f\u0001\u0010xR*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u0002058\u0002X\u0082D¢\u0006\u0007\n\u0005\b.\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010¬\u0001R\u0019\u0010®\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010¬\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001¨\u0006¹\u0001"}, d2 = {"Ll/ofy;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "g0", "()V", "e0", "", "res", "", "needQuit", "k0", "(IZ)V", "h0", "time", "maxProgress", "q0", "(II)V", "t0", "o0", "s0", "m0", "j0", "()Z", "u0", "(I)V", "L", "M", "n0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "i0", "y", "k", "p", "d0", "x", "j", "destroy", "q", MessageElement.XPATH_PREFIX, "l", "n", "", "key", "", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "z", "s", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_memoji_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_memoji_call_root", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "Y", "()Landroid/widget/FrameLayout;", "set_peer_surface_root", "(Landroid/widget/FrameLayout;)V", "_peer_surface_root", XHTMLElement.XPATH_PREFIX, "Landroid/view/View;", "get_top_mask", "()Landroid/view/View;", "set_top_mask", "(Landroid/view/View;)V", "_top_mask", "i", "N", "set_bottom_mask", "_bottom_mask", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Lv/VImage;", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "Z", "set_progress_root", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "Lv/VText;", "Lv/VText;", "O", "()Lv/VText;", "set_countdown_time", "(Lv/VText;)V", "_countdown_time", "Lv/VLinear;", "o", "Lv/VLinear;", "V", "()Lv/VLinear;", "set_peer_info_root", "(Lv/VLinear;)V", "_peer_info_root", "X", "set_peer_info_root_peer_info", "_peer_info_root_peer_info", "W", "set_peer_info_root_peer_age", "_peer_info_root_peer_age", "R", "set_memoji_control", "_memoji_control", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "b0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MediaBuzzCallControlView;)V", "_vb_control", "Lv/VFrame;", "t", "Lv/VFrame;", "S", "()Lv/VFrame;", "set_memoji_tips", "(Lv/VFrame;)V", "_memoji_tips", "T", "set_memoji_tips_count_down", "_memoji_tips_count_down", "v", "get_memoji_tips_count_tip", "set_memoji_tips_count_tip", "_memoji_tips_count_tip", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "w", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "U", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;", "set_no_face_tip", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzNoFaceTipView;)V", "_no_face_tip", "Ljava/lang/String;", "MEMOJI_BUZZ_READY_CLOSE", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "memojiRunnable", "noFaceRunnable", "Landroid/os/CountDownTimer;", "A", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "B", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"l/ofy$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0452b implements oe50 {
        public C0452b() {
        }

        /* JADX INFO: renamed from: a */
        public void m6705a() {
            ofy.this.m6666P().m228h();
        }

        /* JADX INFO: renamed from: b */
        public void m6706b() {
            ofy.m6657l0(ofy.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.ofy$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/ofy$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0453c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ofy f6151b;

        public C0453c(boolean z, ofy ofyVar) {
            this.f6150a = z;
            this.f6151b = ofyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f6150a && m6w.INSTANCE.a(this.f6151b.c())) {
                this.f6151b.m6676Z().animate().alpha(0.0f).setDuration(400L).start();
                this.f6151b.m6672V().animate().translationX(-t100.j).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f6151b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f6151b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.ofy$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/ofy$d", "Landroid/os/CountDownTimer;", "", "it", "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountDownTimerC0454d extends CountDownTimer {
        public CountDownTimerC0454d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ofy.this.m6699t0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.a(ofy.this.c())) {
                ofy.this.m6677a0().setProgress(i);
                ofy.this.m6665O().setText(m6wVar.c(it));
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
                ofy.m6651G(this.f4182a);
            }
        };
        this.noFaceRunnable = new Runnable() { // from class: l.ify
            @Override // java.lang.Runnable
            public final void run() {
                ofy.m6649E(this.f4400a);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static void m6647B(final ofy ofyVar, View view) {
        j8w.Companion.a().k1("report_snapshot", "memojiBuzz");
        p9w.INSTANCE.u0("memojiBuzz");
        f6w.INSTANCE.a0(ofyVar.c(), new Function0() { // from class: l.mfy
            public final Object invoke() {
                return ofy.m6656f0(this.f5625a);
            }
        }, "memojiBuzz");
    }

    /* JADX INFO: renamed from: E */
    public static void m6649E(ofy ofyVar) {
        if (m6w.INSTANCE.a(ofyVar.act()) && !BuzzMediaCallManager.INSTANCE.T()) {
            p9w.INSTANCE.e0();
            ofyVar.m6671U().m169d();
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m6650F(ofy ofyVar) {
        ViewGroup.LayoutParams layoutParams = ofyVar.m6666P().getLayoutParams();
        layoutParams.height = ofyVar.m6678b0().getHeight() + t100.d(310.0f);
        ofyVar.m6666P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m6651G(ofy ofyVar) {
        if (m6w.INSTANCE.a(ofyVar.act())) {
            ofyVar.m6668R().setAlpha(1.0f);
            ofyVar.m6663M();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m6652H(ofy ofyVar, View view) {
        p9w.INSTANCE.d0();
        ofyVar.m6692n0();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m6655e0() {
        xdl0.E0(m6679c0(), new View.OnClickListener() { // from class: l.kfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ofy.m6647B(this.f4919a, view);
            }
        });
        m6678b0().setControlVBListener(new C0452b());
        xdl0.E0(m6668R(), new View.OnClickListener() { // from class: l.lfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ofy.m6652H(this.f5295a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m6656f0(ofy ofyVar) {
        j8w.Companion.a().e1("memojiBuzz");
        m6657l0(ofyVar, R.string.e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m6657l0(ofy ofyVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        ofyVar.m6687k0(i, z);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m6658p0(ofy ofyVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        ofyVar.m6677a0().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m6659r0(ofyVar, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m6659r0(ofy ofyVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        ofyVar.m6696q0(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m6660s0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m6661I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = pfy.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: L */
    public final void m6662L() {
        SurfaceView surfaceView;
        String strL = j8w.Companion.a().B0().l();
        if (strL == null || (surfaceView = (SurfaceView) BuzzMediaCallManager.INSTANCE.J().get(Long.valueOf(Long.parseLong(strL)))) == null || Intrinsics.d(surfaceView.getParent(), m6675Y())) {
            return;
        }
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(surfaceView);
        }
        m6675Y().removeAllViews();
        m6675Y().addView(surfaceView, 0);
    }

    /* JADX INFO: renamed from: M */
    public final void m6663M() {
        xdl0.M(m6669S(), true);
        m6670T().setText("5");
        c0.a aVar = new c0.a();
        aVar.g(this.MEMOJI_BUZZ_READY_CLOSE).a(true).f(5000 + mqi0.o()).d(this);
        CoreModule.c.t1.r(aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m6664N() {
        View view = this._bottom_mask;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m6665O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m6666P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final ConstraintLayout m6667Q() {
        ConstraintLayout constraintLayout = this._memoji_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_memoji_call_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m6668R() {
        View view = this._memoji_control;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_memoji_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VFrame m6669S() {
        VFrame vFrame = this._memoji_tips;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_memoji_tips");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m6670T() {
        VText vText = this._memoji_tips_count_down;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_memoji_tips_count_down");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final BuzzNoFaceTipView m6671U() {
        BuzzNoFaceTipView buzzNoFaceTipView = this._no_face_tip;
        if (buzzNoFaceTipView != null) {
            return buzzNoFaceTipView;
        }
        Intrinsics.r("_no_face_tip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m6672V() {
        VLinear vLinear = this._peer_info_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_peer_info_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m6673W() {
        VText vText = this._peer_info_root_peer_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_root_peer_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m6674X() {
        VText vText = this._peer_info_root_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_root_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final FrameLayout m6675Y() {
        FrameLayout frameLayout = this._peer_surface_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_peer_surface_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m6676Z() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final ZebraProgress m6677a0() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final MediaBuzzCallControlView m6678b0() {
        MediaBuzzCallControlView mediaBuzzCallControlView = this._vb_control;
        if (mediaBuzzCallControlView != null) {
            return mediaBuzzCallControlView;
        }
        Intrinsics.r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m6679c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_vb_report");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6680d0() {
        if (m6685j0()) {
            m6690m0();
        }
    }

    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.a(c()) && (showingDialog = c().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.J(this.memojiRunnable);
        CoreModule.c.t1.u(this.MEMOJI_BUZZ_READY_CLOSE);
        e51.J(d());
        m6678b0().setControlVBListener(null);
        m6660s0();
        ValueAnimator valueAnimator = this.resetAnim;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public final void m6681g0() {
        m6w.INSTANCE.l(new View[]{m6677a0(), m6665O()});
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long jC = hhxVarB0.c();
        m6696q0((int) jC, ((long) hhxVarB0.h()) < jC ? hhxVarB0.k() * 1000 : hhxVarB0.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h0 */
    public final void m6682h0() {
        bp2 bp2VarF = f();
        if (bp2VarF != null) {
            bp2VarF.E0();
        }
        bp2 bp2VarF2 = f();
        if (bp2VarF2 != null) {
            bp2VarF2.F0();
        }
        m6w.INSTANCE.l(new View[]{m6676Z(), m6665O(), m6672V(), m6678b0(), m6679c0(), m6664N()});
        m6678b0().m266w0("memojiBuzz");
        j8w.a aVar = j8w.Companion;
        hhx hhxVarB0 = aVar.a().B0();
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
            m6690m0();
        } else {
            m6681g0();
        }
        v(userPa);
        m6673W().setText(" " + userPa.age);
        m6674X().setText(userPa.name);
        User userP9 = CoreModule.c.e0.p9();
        w(userP9 != null ? userP9.gender : null);
        m6666P().post(new Runnable() { // from class: l.jfy
            @Override // java.lang.Runnable
            public final void run() {
                ofy.m6650F(this.f4637a);
            }
        });
        m6668R().setBackgroundResource(u9w.INSTANCE.l(0, i()));
        e51.H(c(), this.memojiRunnable, ((long) aVar.a().B0().g()) * 1000);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m6683i0() {
        MemojiBuzzAct memojiBuzzActC = c();
        MemojiBuzzAct memojiBuzzAct = memojiBuzzActC instanceof MemojiBuzzAct ? memojiBuzzActC : null;
        if (memojiBuzzAct != null) {
            MemojiBuzzAct.m15a2(memojiBuzzAct, false, 1, null);
        }
        m6662L();
        if (BuzzMediaCallManager.INSTANCE.T()) {
            return;
        }
        e51.J(this.noFaceRunnable);
        e51.H(c(), this.noFaceRunnable, 3000L);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m6661I(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public void m6684j() {
        if (NullChecker.a(m6666P())) {
            m6666P().m227g();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m6685j0() {
        return NullChecker.a(m6679c0()) && xdl0.O0(m6679c0());
    }

    /* JADX INFO: renamed from: k */
    public void m6686k() {
        m6678b0().m267y0();
        m6680d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m6687k0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.W();
        }
        CoreModule.c.t1.u(this.MEMOJI_BUZZ_READY_CLOSE);
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.a(c())) {
            if (res != -1) {
                m6701u0(res);
            }
            m6660s0();
            m6678b0().m265q0();
            m6wVar.d(new View[]{m6667Q(), m6679c0(), m6678b0()});
            e51.J(d());
            e51.H(c(), d(), 2000L);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m6688l() {
        m6657l0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: m */
    public void m6689m() {
        m6687k0(R.string.r, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final void m6690m0() {
        if (j8w.Companion.a().B0().f() != LoveBuzzConstants.MATCH.MATCHED) {
            m6w.INSTANCE.l(new View[]{m6676Z(), m6665O()});
        } else {
            m6w.INSTANCE.j(new View[]{m6665O()});
            m6693o0();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6691n() {
        m6662L();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6692n0() {
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long j = (hhxVarB0.j() + ((long) (hhxVarB0.g() * 1000))) - mqi0.o();
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.a("MemojiBuzzCallViewModel", "renderMemojiIcon,result " + j);
        if (j > 0) {
            lsi0.w(R.string.z);
            return;
        }
        qa2Var.a("MemojiBuzzCallViewModel", "renderMemojiIcon, _memoji_tips visible " + xdl0.O0(m6669S()));
        if (xdl0.O0(m6669S())) {
            CoreModule.c.t1.u(this.MEMOJI_BUZZ_READY_CLOSE);
            xdl0.M(m6669S(), false);
            m6668R().setBackgroundResource(u9w.INSTANCE.l(1, i()));
        } else {
            boolean zY = BuzzMediaCallManager.INSTANCE.Y();
            lsi0.w(zY ? R.string.A : R.string.B);
            qa2Var.a("MemojiBuzzCallViewModel", "renderMemojiIcon, memojiOpenControl " + zY);
            m6668R().setBackgroundResource(zY ? u9w.INSTANCE.l(1, i()) : u9w.INSTANCE.l(2, i()));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m6693o0() {
        m6660s0();
        hhx hhxVarB0 = j8w.Companion.a().B0();
        if (hhxVarB0.j() == 0) {
            return;
        }
        final boolean z = hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED;
        if (z) {
            m6677a0().m304c(y2c0.m, 1);
            m6677a0().m306e();
            qa2.INSTANCE.a("MemojiBuzzCallViewModel", "callData.matchAnimPlay " + hhxVarB0.e());
            if (!hhxVarB0.e()) {
                m6666P().m229i();
                hhxVarB0.n(true);
            }
        }
        if (xdl0.O0(m6676Z())) {
            final int maxProgress = m6677a0().getMaxProgress();
            final int iC = (int) hhxVarB0.c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m6677a0().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.b);
            valueAnimatorOfInt.addListener(new C0453c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nfy
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ofy.m6658p0(this.f5893a, z, maxProgress, iC, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m6694p() {
        m6680d0();
    }

    /* JADX INFO: renamed from: q */
    public void m6695q() {
        m6657l0(this, R.string.r, false, 2, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6696q0(int time, int maxProgress) {
        if (m6w.INSTANCE.a(c())) {
            m6660s0();
            j8w.Companion.a().B0().o(maxProgress);
            m6677a0().setMax(maxProgress);
            if (!m6677a0().m303b()) {
                m6677a0().m305d();
            }
            CountDownTimerC0454d countDownTimerC0454d = new CountDownTimerC0454d(time);
            this.timer = countDownTimerC0454d;
            countDownTimerC0454d.start();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6697r() {
        xdl0.X(m6679c0(), xdl0.F0() + t100.h);
        m6677a0().m304c(y2c0.s0, 0);
        m6655e0();
        m6682h0();
        m6683i0();
    }

    /* JADX INFO: renamed from: s */
    public void m6698s() {
        if (m6w.INSTANCE.a(c()) && xdl0.O0(m6671U())) {
            m6671U().m168b();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m6699t0() {
        m6660s0();
        m6657l0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: u */
    public void m6700u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        if (TextUtils.equals(this.MEMOJI_BUZZ_READY_CLOSE, key)) {
            long j = endTime - currentTime;
            m6670T().setText(String.valueOf(j / 1000));
            if (j <= 0) {
                xdl0.M(m6669S(), false);
                m6692n0();
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m6701u0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.w(res);
    }

    /* JADX INFO: renamed from: x */
    public void m6702x() {
        h6w.INSTANCE.f(C0(), m6678b0(), "memoji_bonus_tip");
    }

    /* JADX INFO: renamed from: y */
    public void m6703y() {
        m6693o0();
        m6678b0().m268z0();
    }

    /* JADX INFO: renamed from: z */
    public void m6704z() {
        BuzzMediaCallManager.v(BuzzMediaCallManager.INSTANCE, 0, 1, (Object) null);
        Act act = act();
        if (act != null) {
            act.finish();
        }
    }
}
