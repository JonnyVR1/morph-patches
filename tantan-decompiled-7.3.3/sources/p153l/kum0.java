package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzFlowTagsView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002®\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\bJ\u0019\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\bR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\"\u0010f\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010[\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R\"\u0010j\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010T\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR\"\u0010n\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010]\"\u0004\bm\u0010_R\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010x\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010[\u001a\u0005\b\u0081\u0001\u0010]\"\u0005\b\u0082\u0001\u0010_R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010[\u001a\u0005\b\u009d\u0001\u0010]\"\u0005\b\u009e\u0001\u0010_R)\u0010¦\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010«\u0001¨\u0006¯\u0001"}, m88121d2 = {"Ll/kum0;", "Ll/up2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "i0", "()V", "g0", "", ShareConstants.RES_PATH, "", "needQuit", "m0", "(IZ)V", "j0", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "Landroid/view/View;", "N", "(Ljava/util/List;)Ljava/util/List;", "tag", "M", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "time", "maxProgress", "s0", "(II)V", "v0", "q0", "u0", "o0", "p0", "w0", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", BaseSei.f14625Y, "k", "p", BaseSei.f14624X, "j", "destroy", "q", BaseSei.f14626Z, "m", BLiveStormDanmakuGiftResourceType.f45292l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_voice_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_voice_call_root", "Lv/VImage;", "g", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", "h", "e0", "set_vb_zoom", "_vb_zoom", "Lcom/tantan/library/svga/SVGAnimationView;", RXScreenCaptureService.KEY_INDEX, "Lcom/tantan/library/svga/SVGAnimationView;", "d0", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_vb_svg_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_vb_svg_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VDraweeView;", "set_vb_peer_avatar", "(Lv/VDraweeView;)V", "_vb_peer_avatar", "Lv/VText;", "Lv/VText;", "X", "()Lv/VText;", "set_vb_peer_name", "(Lv/VText;)V", "_vb_peer_name", "W", "set_vb_peer_info", "_vb_peer_info", "Y", "set_vb_peer_region", "_vb_peer_region", "n", "U", "set_vb_mee_avatar", "_vb_mee_avatar", "o", "get_vb_me_name", "set_vb_me_name", "_vb_me_name", "Lv/VLinear;", "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_vb_peer_tag_root", "(Lv/VLinear;)V", "_vb_peer_tag_root", "b0", "set_vb_peer_tag_root_vb_tag", "_vb_peer_tag_root_vb_tag", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "set_vb_peer_tag_root_tags", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;)V", "_vb_peer_tag_root_tags", BLiveStormDanmakuGiftResourceType.f45294s, p7f.GPS_DIRECTION_TRUE, "set_vb_desc", "_vb_desc", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", Constants.KEY_T, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Landroid/widget/FrameLayout;", "u", "Landroid/widget/FrameLayout;", "Q", "()Landroid/widget/FrameLayout;", "set_progress_root", "(Landroid/widget/FrameLayout;)V", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", ResourceDirection.f39656v, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "R", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "w", BloodType.f39576O, "set_countdown_time", "_countdown_time", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", p7f.LATITUDE_SOUTH, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;)V", "_vb_control", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class kum0 extends up2 {

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

    /* JADX INFO: renamed from: l.kum0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/kum0$b", "Ll/vm50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18274b implements vm50 {
        public C18274b() {
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: a */
        public void mo151617a() {
            kum0.this.m151589P().m48382h();
        }

        @Override // p153l.vm50
        /* JADX INFO: renamed from: b */
        public void mo151618b() {
            kum0.m151577n0(kum0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.kum0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/kum0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18275c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f128908a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kum0 f128909b;

        public C18275c(boolean z, kum0 kum0Var) {
            this.f128908a = z;
            this.f128909b = kum0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f128908a && k8w.INSTANCE.m148752a(this.f128909b.getAct())) {
                this.f128909b.m151590Q().animate().alpha(0.0f).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f128909b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f128909b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.kum0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/kum0$d", "Landroid/os/CountDownTimer;", "", Careers.f39580it, "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CountDownTimerC18276d extends CountDownTimer {
        public CountDownTimerC18276d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            kum0.this.m151584v0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            k8w k8wVar = k8w.INSTANCE;
            if (k8wVar.m148752a(kum0.this.getAct())) {
                kum0.this.m151591R().setProgress(i);
                kum0.this.m151588O().setText(k8wVar.m148754c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kum0(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m151559A(kum0 kum0Var, View view) {
        User peerUser = kum0Var.getPeerUser();
        if (peerUser != null) {
            kum0Var.getAct().startActivity(CoreModule.m30933P().m143405a().mo34531jr(kum0Var.getAct(), peerUser.f56859id, "from_voice_buzz", false));
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m151562E(kum0 kum0Var) {
        ViewGroup.LayoutParams layoutParams = kum0Var.m151589P().getLayoutParams();
        layoutParams.height = kum0Var.m151592S().getHeight() + qa00.m175859d(310.0f);
        kum0Var.m151589P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m151564G(kum0 kum0Var, View view) {
        nbw.INSTANCE.m162208C0();
        Act act = kum0Var.getAct();
        if (act != null) {
            act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m151565H(final kum0 kum0Var, View view) {
        nbw.m162203v0(nbw.INSTANCE, null, 1, null);
        d8w.m114940b0(d8w.INSTANCE, kum0Var.getAct(), new Function0() { // from class: l.jum0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kum0.m151571h0(this.f122727a);
            }
        }, null, 4, null);
    }

    /* JADX INFO: renamed from: N */
    private final List<View> m151569N(List<? extends Tag> userTagsData) {
        View viewM151587M;
        if (!NullChecker.m82486a(userTagsData) || !k8w.INSTANCE.m148752a(getAct())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.m82486a(tag) && (viewM151587M = m151587M(tag)) != null) {
                arrayList.add(viewM151587M);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m151570g0() {
        bnl0.m105509E0(m151602c0(), new View.OnClickListener() { // from class: l.fum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kum0.m151565H(this.f100926a, view);
            }
        });
        bnl0.m105509E0(m151595V(), new View.OnClickListener() { // from class: l.gum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kum0.m151559A(this.f106522a, view);
            }
        });
        bnl0.m105509E0(m151604e0(), new View.OnClickListener() { // from class: l.hum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kum0.m151564G(this.f111680a, view);
            }
        });
        m151592S().setControlVBListener(new C18274b());
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m151571h0(kum0 kum0Var) {
        haw.m134236f1(haw.INSTANCE.m134320a(), null, 1, null);
        m151577n0(kum0Var, R$string.f20959e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    private final void m151572i0() {
        k8w.INSTANCE.m148763l(m151590Q(), m151593T(), m151588O());
        m151591R().m48457c(ebc0.f92863V, 0);
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        long jM122074c = eqxVarM134264B0.m122074c();
        m151581s0((int) jM122074c, ((long) eqxVarM134264B0.getProgressMax()) < jM122074c ? eqxVarM134264B0.getTotalDuration() * 1000 : eqxVarM134264B0.getProgressMax());
    }

    /* JADX INFO: renamed from: j0 */
    private final void m151573j0() {
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
            m151578p0();
        } else {
            m151572i0();
        }
        m197044v(userM116503Pa);
        m151610o0();
        m151597X().setText(userM116503Pa.name);
        Integer numM120282d = ebw.INSTANCE.m120282d(userM116503Pa.location.region);
        bnl0.m105524M(m151598Y(), NullChecker.m82486a(numM120282d));
        if (NullChecker.m82486a(numM120282d)) {
            sbw sbwVar = sbw.INSTANCE;
            sbwVar.m185352q(userM116503Pa, m151596W());
            sbwVar.m185349n(userM116503Pa, m151598Y(), 16.0f, 16.0f, false);
            VText vTextM151598Y = m151598Y();
            numM120282d.getClass();
            bnl0.m105565l(vTextM151598Y, k3d0.m148006b(numM120282d.intValue()));
        } else {
            sbw.INSTANCE.m185350o(userM116503Pa, m151596W(), 16.0f, 16.0f);
        }
        boolean zEquals = TEnum.equals(userM116503Pa.gender, "male");
        List<? extends Tag> listM147522n = jyb.m147522n(userM116503Pa.profile.tags, new qcj() { // from class: l.cum0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kum0.m151574k0((Tag) obj);
            }
        });
        listM147522n.getClass();
        ArrayList arrayListM147522n = jyb.m147522n(userM116503Pa.profile.tags, new qcj() { // from class: l.dum0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kum0.m151575l0((Tag) obj);
            }
        });
        arrayListM147522n.getClass();
        if (!jyb.m147479J(listM147522n) && listM147522n.size() < 10 && !jyb.m147479J(arrayListM147522n)) {
            int size = 10 - listM147522n.size();
            if (arrayListM147522n.size() < size) {
                listM147522n.addAll(arrayListM147522n);
            } else {
                listM147522n.addAll(arrayListM147522n.subList(0, size));
            }
        }
        if (jyb.m147479J(listM147522n)) {
            bnl0.m105524M(m151599Z(), false);
        } else {
            bnl0.m105524M(m151599Z(), true);
            m151601b0().setText(getAct().getString(zEquals ? R$string.f20937V0 : R$string.f20935U0));
            m151600a0().setTags(m151569N(listM147522n));
            Drawable drawableM148006b = k3d0.m148006b(ebc0.f92915x0);
            drawableM148006b.getClass();
            int i = qa00.f156332s;
            drawableM148006b.setBounds(0, 0, i, i);
            bnl0.m105563k(m151601b0(), drawableM148006b);
        }
        m151589P().post(new Runnable() { // from class: l.eum0
            @Override // java.lang.Runnable
            public final void run() {
                kum0.m151562E(this.f95911a);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m151574k0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.m88377d("personality", tag.category));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m151575l0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.m88377d("personality", tag.category));
    }

    /* JADX INFO: renamed from: m0 */
    private final void m151576m0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.m48141W();
        }
        k8w k8wVar = k8w.INSTANCE;
        if (k8wVar.m148752a(getAct())) {
            if (res != -1) {
                m151585w0(res);
            }
            m151583u0();
            m151592S().m48308t0();
            k8wVar.m148755d(m151605f0(), m151602c0(), m151604e0(), m151595V());
            l51.m152890J(getEndRunnable());
            l51.m152888H(getAct(), getEndRunnable(), 2000L);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m151577n0(kum0 kum0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R$string.f21009z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        kum0Var.m151576m0(i, z);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m151578p0() {
        if (haw.INSTANCE.m134320a().m134264B0().getMatched() != LoveBuzzConstants$MATCH.MATCHED) {
            k8w.INSTANCE.m148763l(m151590Q(), m151593T(), m151588O());
        } else {
            k8w.INSTANCE.m148761j(m151593T(), m151588O());
            m151579q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m151579q0() {
        m151583u0();
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        final boolean z = eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED;
        if (z) {
            m151591R().m48457c(ebc0.f92892m, 1);
            m151591R().m48459e();
            if (!eqxVarM134264B0.getMatchAnimPlay()) {
                m151589P().m48383i();
                eqxVarM134264B0.m122085n(true);
            }
        }
        if (bnl0.m105529O0(m151590Q())) {
            final int maxProgress = m151591R().getMaxProgress();
            final int iM122074c = (int) eqxVarM134264B0.m122074c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m151591R().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(gt0.f106347b);
            valueAnimatorOfInt.addListener(new C18275c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ium0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    kum0.m151580r0(this.f116958a, z, maxProgress, iM122074c, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m151580r0(kum0 kum0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        kum0Var.m151591R().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m151582t0(kum0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m151581s0(int time, int maxProgress) {
        if (k8w.INSTANCE.m148752a(getAct())) {
            m151583u0();
            haw.INSTANCE.m134320a().m134264B0().m122086o(maxProgress);
            m151591R().setMax(maxProgress);
            if (!m151591R().m48456b()) {
                m151591R().m48458d();
            }
            CountDownTimerC18276d countDownTimerC18276d = new CountDownTimerC18276d(time);
            this.timer = countDownTimerC18276d;
            countDownTimerC18276d.start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m151582t0(kum0 kum0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        kum0Var.m151581s0(i, i2);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m151583u0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m151584v0() {
        m151583u0();
        m151577n0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m151585w0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        o1j0.m165649w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m151586J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM155949b = lum0.m155949b(this, inflater, parent);
        viewM155949b.getClass();
        return viewM155949b;
    }

    /* JADX INFO: renamed from: M */
    public final View m151587M(Tag tag) {
        Act act = getAct();
        if (act == null) {
            return null;
        }
        View viewInflate = act.inflater().inflate(mec0.f136488w, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(bdc0.f76245b);
        viewFindViewById.getClass();
        VText vText = (VText) viewFindViewById;
        vText.setTextColor(-1);
        vText.setBackgroundResource(ebc0.f92866Y);
        vText.setText(tag.value);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m151588O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m151589P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.m88391r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final FrameLayout m151590Q() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ZebraProgress m151591R() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.m88391r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VoiceBuzzCallControlView m151592S() {
        VoiceBuzzCallControlView voiceBuzzCallControlView = this._vb_control;
        if (voiceBuzzCallControlView != null) {
            return voiceBuzzCallControlView;
        }
        Intrinsics.m88391r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m151593T() {
        VText vText = this._vb_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VDraweeView m151594U() {
        VDraweeView vDraweeView = this._vb_mee_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_vb_mee_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VDraweeView m151595V() {
        VDraweeView vDraweeView = this._vb_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_vb_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m151596W() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m151597X() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m151598Y() {
        VText vText = this._vb_peer_region;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_region");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m151599Z() {
        VLinear vLinear = this._vb_peer_tag_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_vb_peer_tag_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final BuzzFlowTagsView m151600a0() {
        BuzzFlowTagsView buzzFlowTagsView = this._vb_peer_tag_root_tags;
        if (buzzFlowTagsView != null) {
            return buzzFlowTagsView;
        }
        Intrinsics.m88391r("_vb_peer_tag_root_tags");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m151601b0() {
        VText vText = this._vb_peer_tag_root_vb_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_tag_root_vb_tag");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m151602c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final SVGAnimationView m151603d0() {
        SVGAnimationView sVGAnimationView = this._vb_svg_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_vb_svg_bg");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        Dialog showingDialog;
        if (k8w.INSTANCE.m148752a(getAct()) && (showingDialog = getAct().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        l51.m152890J(getEndRunnable());
        m151592S().setControlVBListener(null);
        m151583u0();
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
    public final VImage m151604e0() {
        VImage vImage = this._vb_zoom;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_vb_zoom");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ConstraintLayout m151605f0() {
        ConstraintLayout constraintLayout = this._voice_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_voice_call_root");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m151586J(inflater, parent);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: j */
    public void mo151606j() {
        if (NullChecker.m82486a(m151589P())) {
            m151589P().m48381g();
        }
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: k */
    public void mo151607k() {
        m151592S().m48302D0();
        m151610o0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: l */
    public void mo151608l() {
        m151577n0(this, 0, false, 3, null);
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: m */
    public void mo151609m() {
        m151576m0(R$string.f20992r, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m151610o0() {
        LoveBuzzConstants$MATCH matched = haw.INSTANCE.m134320a().m134264B0().getMatched();
        LoveBuzzConstants$MATCH loveBuzzConstants$MATCH = LoveBuzzConstants$MATCH.MATCHED;
        boolean z = matched == loveBuzzConstants$MATCH || matched == LoveBuzzConstants$MATCH.PEER_LIKE_ME;
        User peerUser = getPeerUser();
        if (peerUser != null) {
            sbw sbwVar = sbw.INSTANCE;
            VDraweeView vDraweeViewM151595V = m151595V();
            Picture.ImageUri imageUriProfileSmall = sbwVar.m185345j(peerUser).profileSmall();
            imageUriProfileSmall.getClass();
            sbwVar.m185342g(vDraweeViewM151595V, imageUriProfileSmall, z ? 100 : 0, true);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        sbw sbwVar2 = sbw.INSTANCE;
        VDraweeView vDraweeViewM151594U = m151594U();
        userM116600p9.getClass();
        Picture.ImageUri imageUriProfileSmall2 = sbwVar2.m185345j(userM116600p9).profileSmall();
        imageUriProfileSmall2.getClass();
        sbwVar2.m185342g(vDraweeViewM151594U, imageUriProfileSmall2, (matched == loveBuzzConstants$MATCH || matched == LoveBuzzConstants$MATCH.ME_LIKE_PEER) ? 100 : 0, true);
        m151578p0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: p */
    public void mo151611p() {
        m151610o0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: q */
    public void mo151612q() {
        m151577n0(this, R$string.f20992r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m151613r() {
        bnl0.m105540X(m151602c0(), bnl0.m105511F0() + qa00.f156321h);
        SVGALoader.with(getAct()).from(kq3.INSTANCE.m150820n()).autoPlay(true).into(m151603d0());
        m151600a0().m48323c();
        BuzzFlowTagsView buzzFlowTagsViewM151600a0 = m151600a0();
        int i = qa00.f156320g;
        buzzFlowTagsViewM151600a0.setHeightLineSpace(i);
        m151600a0().setPadding(i, i, i, i);
        m151570g0();
        m151573j0();
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: x */
    public void mo151614x() {
        f8w.INSTANCE.m124570f(getContext(), m151592S(), "voice_bonus_tip");
    }

    @Override // p153l.up2
    /* JADX INFO: renamed from: y */
    public void mo151615y() {
        m151579q0();
        m151592S().m48303E0();
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
