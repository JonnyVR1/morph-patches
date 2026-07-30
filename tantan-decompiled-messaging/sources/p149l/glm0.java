package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzFlowTagsView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002®\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\bJ\u0019\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\bR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\"\u0010f\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010[\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R\"\u0010j\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010T\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR\"\u0010n\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010]\"\u0004\bm\u0010_R\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010x\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010[\u001a\u0005\b\u0081\u0001\u0010]\"\u0005\b\u0082\u0001\u0010_R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010[\u001a\u0005\b\u009d\u0001\u0010]\"\u0005\b\u009e\u0001\u0010_R)\u0010¦\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010«\u0001¨\u0006¯\u0001"}, m87232d2 = {"Ll/glm0;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "i0", "()V", "g0", "", ShareConstants.RES_PATH, "", "needQuit", "m0", "(IZ)V", "j0", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "Landroid/view/View;", "N", "(Ljava/util/List;)Ljava/util/List;", "tag", "M", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "time", "maxProgress", "s0", "(II)V", "v0", "q0", "u0", "o0", "p0", "w0", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", BaseSei.f13931Y, "k", "p", BaseSei.f13930X, "j", "destroy", "q", BaseSei.f13932Z, "m", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_voice_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_voice_call_root", "Lv/VImage;", "g", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "h", "e0", "set_vb_zoom", "_vb_zoom", "Lcom/tantan/library/svga/SVGAnimationView;", RXScreenCaptureService.KEY_INDEX, "Lcom/tantan/library/svga/SVGAnimationView;", "d0", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_vb_svg_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_vb_svg_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VDraweeView;", "set_vb_peer_avatar", "(Lv/VDraweeView;)V", "_vb_peer_avatar", "Lv/VText;", "Lv/VText;", "X", "()Lv/VText;", "set_vb_peer_name", "(Lv/VText;)V", "_vb_peer_name", "W", "set_vb_peer_info", "_vb_peer_info", "Y", "set_vb_peer_region", "_vb_peer_region", "n", "U", "set_vb_mee_avatar", "_vb_mee_avatar", "o", "get_vb_me_name", "set_vb_me_name", "_vb_me_name", "Lv/VLinear;", "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_vb_peer_tag_root", "(Lv/VLinear;)V", "_vb_peer_tag_root", "b0", "set_vb_peer_tag_root_vb_tag", "_vb_peer_tag_root_vb_tag", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "set_vb_peer_tag_root_tags", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;)V", "_vb_peer_tag_root_tags", BLiveStormDanmakuGiftResourceType.f44446s, j6f.GPS_DIRECTION_TRUE, "set_vb_desc", "_vb_desc", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Landroid/widget/FrameLayout;", "u", "Landroid/widget/FrameLayout;", "Q", "()Landroid/widget/FrameLayout;", "set_progress_root", "(Landroid/widget/FrameLayout;)V", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", ResourceDirection.f38808v, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "R", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "w", BloodType.f38728O, "set_countdown_time", "_countdown_time", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", j6f.LATITUDE_SOUTH, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;)V", "_vb_control", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class glm0 extends dp2 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ConstraintLayout _voice_call_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _vb_report;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _vb_zoom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SVGAnimationView _vb_svg_bg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _vb_peer_avatar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _vb_peer_name;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _vb_peer_info;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _vb_peer_region;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _vb_mee_avatar;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _vb_me_name;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _vb_peer_tag_root;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _vb_peer_tag_root_vb_tag;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public BuzzFlowTagsView _vb_peer_tag_root_tags;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _vb_desc;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public LoveBuzzMatchView _match_view;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public FrameLayout _progress_root;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ZebraProgress _progress_root_call_progress;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _countdown_time;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VoiceBuzzCallControlView _vb_control;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public CountDownTimer timer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator resetAnim;

    /* JADX INFO: renamed from: l.glm0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/glm0$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17109b implements oe50 {
        public C17109b() {
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: a */
        public void mo126822a() {
            glm0.this.m126803P().m47199h();
        }

        @Override // p149l.oe50
        /* JADX INFO: renamed from: b */
        public void mo126823b() {
            glm0.m126791n0(glm0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.glm0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/glm0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17110c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f103363a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ glm0 f103364b;

        public C17110c(boolean z, glm0 glm0Var) {
            this.f103363a = z;
            this.f103364b = glm0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f103363a && m6w.INSTANCE.m153296a(this.f103364b.getAct())) {
                this.f103364b.m126804Q().animate().alpha(0.0f).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f103364b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f103364b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.glm0$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/glm0$d", "Landroid/os/CountDownTimer;", "", Careers.f38732it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class CountDownTimerC17111d extends CountDownTimer {
        public CountDownTimerC17111d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            glm0.this.m126798v0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.m153296a(glm0.this.getAct())) {
                glm0.this.m126805R().setProgress(i);
                glm0.this.m126802O().setText(m6wVar.m153298c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glm0(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m126773A(glm0 glm0Var, View view) {
        User peerUser = glm0Var.getPeerUser();
        if (peerUser != null) {
            glm0Var.getAct().startActivity(CoreModule.m29935P().m94651a().mo33528jr(glm0Var.getAct(), peerUser.f56011id, "from_voice_buzz", false));
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m126776E(glm0 glm0Var) {
        ViewGroup.LayoutParams layoutParams = glm0Var.m126803P().getLayoutParams();
        layoutParams.height = glm0Var.m126806S().getHeight() + t100.m186890d(310.0f);
        glm0Var.m126803P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m126778G(glm0 glm0Var, View view) {
        p9w.INSTANCE.m167904C0();
        Act act = glm0Var.getAct();
        if (act != null) {
            act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m126779H(final glm0 glm0Var, View view) {
        p9w.m167899v0(p9w.INSTANCE, null, 1, null);
        f6w.m119655b0(f6w.INSTANCE, glm0Var.getAct(), new Function0() { // from class: l.flm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return glm0.m126785h0(this.f98199a);
            }
        }, null, 4, null);
    }

    /* JADX INFO: renamed from: N */
    private final List<View> m126783N(List<? extends Tag> userTagsData) {
        View viewM126801M;
        if (!NullChecker.m81303a(userTagsData) || !m6w.INSTANCE.m153296a(getAct())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.m81303a(tag) && (viewM126801M = m126801M(tag)) != null) {
                arrayList.add(viewM126801M);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m126784g0() {
        xdl0.m208329E0(m126816c0(), new View.OnClickListener() { // from class: l.blm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m126779H(this.f76197a, view);
            }
        });
        xdl0.m208329E0(m126809V(), new View.OnClickListener() { // from class: l.clm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m126773A(this.f81449a, view);
            }
        });
        xdl0.m208329E0(m126818e0(), new View.OnClickListener() { // from class: l.dlm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m126778G(this.f86846a, view);
            }
        });
        m126806S().setControlVBListener(new C17109b());
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m126785h0(glm0 glm0Var) {
        j8w.m140389f1(j8w.INSTANCE.m140473a(), null, 1, null);
        m126791n0(glm0Var, R$string.f20217e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    private final void m126786i0() {
        m6w.INSTANCE.m153307l(m126804Q(), m126807T(), m126802O());
        m126805R().m47274c(y2c0.f195541V, 0);
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        long jM131177c = hhxVarM140417B0.m131177c();
        m126795s0((int) jM131177c, ((long) hhxVarM140417B0.getProgressMax()) < jM131177c ? hhxVarM140417B0.getTotalDuration() * 1000 : hhxVarM140417B0.getProgressMax());
    }

    /* JADX INFO: renamed from: j0 */
    private final void m126787j0() {
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
            m126792p0();
        } else {
            m126786i0();
        }
        m112859v(userM169430Pa);
        m126820o0();
        m126811X().setText(userM169430Pa.name);
        Integer numM124853d = g9w.INSTANCE.m124853d(userM169430Pa.location.region);
        xdl0.m208344M(m126812Y(), NullChecker.m81303a(numM124853d));
        if (NullChecker.m81303a(numM124853d)) {
            u9w u9wVar = u9w.INSTANCE;
            u9wVar.m192684q(userM169430Pa, m126810W());
            u9wVar.m192681n(userM169430Pa, m126812Y(), 16.0f, 16.0f, false);
            VText vTextM126812Y = m126812Y();
            numM124853d.getClass();
            xdl0.m208385l(vTextM126812Y, hvc0.m133155b(numM124853d.intValue()));
        } else {
            u9w.INSTANCE.m192682o(userM169430Pa, m126810W(), 16.0f, 16.0f);
        }
        boolean zEquals = TEnum.equals(userM169430Pa.gender, "male");
        List<? extends Tag> listM200339n = vwb.m200339n(userM169430Pa.profile.tags, new w9j() { // from class: l.ykm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return glm0.m126788k0((Tag) obj);
            }
        });
        listM200339n.getClass();
        ArrayList arrayListM200339n = vwb.m200339n(userM169430Pa.profile.tags, new w9j() { // from class: l.zkm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return glm0.m126789l0((Tag) obj);
            }
        });
        arrayListM200339n.getClass();
        if (!vwb.m200296J(listM200339n) && listM200339n.size() < 10 && !vwb.m200296J(arrayListM200339n)) {
            int size = 10 - listM200339n.size();
            if (arrayListM200339n.size() < size) {
                listM200339n.addAll(arrayListM200339n);
            } else {
                listM200339n.addAll(arrayListM200339n.subList(0, size));
            }
        }
        if (vwb.m200296J(listM200339n)) {
            xdl0.m208344M(m126813Z(), false);
        } else {
            xdl0.m208344M(m126813Z(), true);
            m126815b0().setText(getAct().getString(zEquals ? R$string.f20195V0 : R$string.f20193U0));
            m126814a0().setTags(m126783N(listM200339n));
            Drawable drawableM133155b = hvc0.m133155b(y2c0.f195593x0);
            drawableM133155b.getClass();
            int i = t100.f167270s;
            drawableM133155b.setBounds(0, 0, i, i);
            xdl0.m208383k(m126815b0(), drawableM133155b);
        }
        m126803P().post(new Runnable() { // from class: l.alm0
            @Override // java.lang.Runnable
            public final void run() {
                glm0.m126776E(this.f70476a);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m126788k0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.m87488d("personality", tag.category));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m126789l0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.m87488d("personality", tag.category));
    }

    /* JADX INFO: renamed from: m0 */
    private final void m126790m0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m46958W();
        }
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.m153296a(getAct())) {
            if (res != -1) {
                m126799w0(res);
            }
            m126797u0();
            m126806S().m47125t0();
            m6wVar.m153299d(m126819f0(), m126816c0(), m126818e0(), m126809V());
            e51.m114745J(getEndRunnable());
            e51.m114743H(getAct(), getEndRunnable(), 2000L);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m126791n0(glm0 glm0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f20267z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        glm0Var.m126790m0(i, z);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m126792p0() {
        if (j8w.INSTANCE.m140473a().m140417B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            m6w.INSTANCE.m153307l(m126804Q(), m126807T(), m126802O());
        } else {
            m6w.INSTANCE.m153305j(m126807T(), m126802O());
            m126793q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m126793q0() {
        m126797u0();
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        final boolean z = hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m126805R().m47274c(y2c0.f195570m, 1);
            m126805R().m47276e();
            if (!hhxVarM140417B0.getMatchAnimPlay()) {
                m126803P().m47200i();
                hhxVarM140417B0.m131188n(true);
            }
        }
        if (xdl0.m208349O0(m126804Q())) {
            final int maxProgress = m126805R().getMaxProgress();
            final int iM131177c = (int) hhxVarM140417B0.m131177c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m126805R().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.f77155b);
            valueAnimatorOfInt.addListener(new C17110c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.elm0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    glm0.m126794r0(this.f92125a, z, maxProgress, iM131177c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m126794r0(glm0 glm0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        glm0Var.m126805R().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m126796t0(glm0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m126795s0(int time, int maxProgress) {
        if (m6w.INSTANCE.m153296a(getAct())) {
            m126797u0();
            j8w.INSTANCE.m140473a().m140417B0().m131189o(maxProgress);
            m126805R().setMax(maxProgress);
            if (!m126805R().m47273b()) {
                m126805R().m47275d();
            }
            CountDownTimerC17111d countDownTimerC17111d = new CountDownTimerC17111d(time);
            this.timer = countDownTimerC17111d;
            countDownTimerC17111d.start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m126796t0(glm0 glm0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        glm0Var.m126795s0(i, i2);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m126797u0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m126798v0() {
        m126797u0();
        m126791n0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m126799w0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.m151593w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m126800J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM131678b = hlm0.m131678b(this, inflater, parent);
        viewM131678b.getClass();
        return viewM131678b;
    }

    /* JADX INFO: renamed from: M */
    public final View m126801M(Tag tag) {
        Act act = getAct();
        if (act == null) {
            return null;
        }
        View viewInflate = act.inflater().inflate(h6c0.f106046w, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(v4c0.f179895b);
        viewFindViewById.getClass();
        VText vText = (VText) viewFindViewById;
        vText.setTextColor(-1);
        vText.setBackgroundResource(y2c0.f195544Y);
        vText.setText(tag.value);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m126802O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m126803P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m87502r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final FrameLayout m126804Q() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ZebraProgress m126805R() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m87502r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VoiceBuzzCallControlView m126806S() {
        VoiceBuzzCallControlView voiceBuzzCallControlView = this._vb_control;
        if (voiceBuzzCallControlView != null) {
            return voiceBuzzCallControlView;
        }
        Intrinsics.m87502r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m126807T() {
        VText vText = this._vb_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VDraweeView m126808U() {
        VDraweeView vDraweeView = this._vb_mee_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_vb_mee_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VDraweeView m126809V() {
        VDraweeView vDraweeView = this._vb_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_vb_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m126810W() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m126811X() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m126812Y() {
        VText vText = this._vb_peer_region;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_region");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m126813Z() {
        VLinear vLinear = this._vb_peer_tag_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_vb_peer_tag_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final BuzzFlowTagsView m126814a0() {
        BuzzFlowTagsView buzzFlowTagsView = this._vb_peer_tag_root_tags;
        if (buzzFlowTagsView != null) {
            return buzzFlowTagsView;
        }
        Intrinsics.m87502r("_vb_peer_tag_root_tags");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m126815b0() {
        VText vText = this._vb_peer_tag_root_vb_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_tag_root_vb_tag");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m126816c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final SVGAnimationView m126817d0() {
        SVGAnimationView sVGAnimationView = this._vb_svg_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_vb_svg_bg");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.m153296a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.m114745J(getEndRunnable());
        m126806S().setControlVBListener(null);
        m126797u0();
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
    /* JADX INFO: renamed from: e0 */
    public final VImage m126818e0() {
        VImage vImage = this._vb_zoom;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_vb_zoom");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ConstraintLayout m126819f0() {
        ConstraintLayout constraintLayout = this._voice_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_voice_call_root");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m126800J(inflater, parent);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: j */
    public void mo112851j() {
        if (NullChecker.m81303a(m126803P())) {
            m126803P().m47198g();
        }
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: k */
    public void mo112852k() {
        m126806S().m47119D0();
        m126820o0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: l */
    public void mo112853l() {
        m126791n0(this, 0, false, 3, null);
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: m */
    public void mo112854m() {
        m126790m0(R$string.f20250r, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m126820o0() {
        LoveBuzzConstants$MATCH matched = j8w.INSTANCE.m140473a().m140417B0().getMatched();
        LoveBuzzConstants$MATCH loveBuzzConstants$MATCH = LoveBuzzConstants$MATCH.MATCHED;
        boolean z = matched == loveBuzzConstants$MATCH || matched == LoveBuzzConstants$MATCH.PEER_LIKE_ME;
        User peerUser = getPeerUser();
        if (peerUser != null) {
            u9w u9wVar = u9w.INSTANCE;
            VDraweeView vDraweeViewM126809V = m126809V();
            Picture.ImageUri imageUriProfileSmall = u9wVar.m192677j(peerUser).profileSmall();
            imageUriProfileSmall.getClass();
            u9wVar.m192674g(vDraweeViewM126809V, imageUriProfileSmall, z ? 100 : 0, true);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        u9w u9wVar2 = u9w.INSTANCE;
        VDraweeView vDraweeViewM126808U = m126808U();
        userM169527p9.getClass();
        Picture.ImageUri imageUriProfileSmall2 = u9wVar2.m192677j(userM169527p9).profileSmall();
        imageUriProfileSmall2.getClass();
        u9wVar2.m192674g(vDraweeViewM126808U, imageUriProfileSmall2, (matched == loveBuzzConstants$MATCH || matched == LoveBuzzConstants$MATCH.ME_LIKE_PEER) ? 100 : 0, true);
        m126792p0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: p */
    public void mo112856p() {
        m126820o0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: q */
    public void mo112857q() {
        m126791n0(this, R$string.f20250r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m126821r() {
        xdl0.m208360X(m126816c0(), xdl0.m208331F0() + t100.f167259h);
        SVGALoader.with(getAct()).from(kp3.INSTANCE.m146824n()).autoPlay(true).into(m126817d0());
        m126814a0().m47140c();
        BuzzFlowTagsView buzzFlowTagsViewM126814a0 = m126814a0();
        int i = t100.f167258g;
        buzzFlowTagsViewM126814a0.setHeightLineSpace(i);
        m126814a0().setPadding(i, i, i, i);
        m126784g0();
        m126787j0();
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: x */
    public void mo112861x() {
        h6w.INSTANCE.m129534f(getContext(), m126806S(), "voice_bonus_tip");
    }

    @Override // p149l.dp2
    /* JADX INFO: renamed from: y */
    public void mo112862y() {
        m126793q0();
        m126806S().m47120E0();
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
