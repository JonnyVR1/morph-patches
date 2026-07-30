package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzFlowTagsView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.manager.LoveBuzzConstants;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bt0;
import l.dp2;
import l.e51;
import l.f6w;
import l.g9w;
import l.h6c0;
import l.h6w;
import l.hhx;
import l.hlm0;
import l.hvc0;
import l.j8w;
import l.kp3;
import l.lsi0;
import l.m6w;
import l.oe50;
import l.p9w;
import l.pib;
import l.t100;
import l.u9w;
import l.v4c0;
import l.vwb;
import l.xdl0;
import l.y2c0;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002®\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\bJ\u0019\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\bJ\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\bR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\"\u0010f\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010[\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R\"\u0010j\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010T\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR\"\u0010n\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010]\"\u0004\bm\u0010_R\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010x\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010[\u001a\u0004\bv\u0010]\"\u0004\bw\u0010_R\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010[\u001a\u0005\b\u0081\u0001\u0010]\"\u0005\b\u0082\u0001\u0010_R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010[\u001a\u0005\b\u009d\u0001\u0010]\"\u0005\b\u009e\u0001\u0010_R)\u0010¦\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010©\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010¨\u0001R\u001b\u0010¬\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Ll/glm0;", "Ll/dp2;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "i0", "()V", "g0", "", "res", "", "needQuit", "m0", "(IZ)V", "j0", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "Landroid/view/View;", "N", "(Ljava/util/List;)Ljava/util/List;", "tag", "M", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "time", "maxProgress", "s0", "(II)V", "v0", "q0", "u0", "o0", "p0", "w0", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "r", "y", "k", "p", "x", "j", "destroy", "q", "z", MessageElement.XPATH_PREFIX, "l", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f0", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_voice_call_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_voice_call_root", "Lv/VImage;", "g", "Lv/VImage;", "c0", "()Lv/VImage;", "set_vb_report", "(Lv/VImage;)V", "_vb_report", XHTMLElement.XPATH_PREFIX, "e0", "set_vb_zoom", "_vb_zoom", "Lcom/tantan/library/svga/SVGAnimationView;", "i", "Lcom/tantan/library/svga/SVGAnimationView;", "d0", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_vb_svg_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_vb_svg_bg", "Lv/VDraweeView;", "Lv/VDraweeView;", "V", "()Lv/VDraweeView;", "set_vb_peer_avatar", "(Lv/VDraweeView;)V", "_vb_peer_avatar", "Lv/VText;", "Lv/VText;", "X", "()Lv/VText;", "set_vb_peer_name", "(Lv/VText;)V", "_vb_peer_name", "W", "set_vb_peer_info", "_vb_peer_info", "Y", "set_vb_peer_region", "_vb_peer_region", "n", "U", "set_vb_mee_avatar", "_vb_mee_avatar", "o", "get_vb_me_name", "set_vb_me_name", "_vb_me_name", "Lv/VLinear;", "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_vb_peer_tag_root", "(Lv/VLinear;)V", "_vb_peer_tag_root", "b0", "set_vb_peer_tag_root_vb_tag", "_vb_peer_tag_root_vb_tag", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "a0", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;", "set_vb_peer_tag_root_tags", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzFlowTagsView;)V", "_vb_peer_tag_root_tags", "s", "T", "set_vb_desc", "_vb_desc", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "t", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "P", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "set_match_view", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;)V", "_match_view", "Landroid/widget/FrameLayout;", "u", "Landroid/widget/FrameLayout;", "Q", "()Landroid/widget/FrameLayout;", "set_progress_root", "(Landroid/widget/FrameLayout;)V", "_progress_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "v", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "R", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "set_progress_root_call_progress", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;)V", "_progress_root_call_progress", "w", "O", "set_countdown_time", "_countdown_time", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "S", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;", "set_vb_control", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/view/VoiceBuzzCallControlView;)V", "_vb_control", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "timer", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "resetAnim", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"l/glm0$b", "Ll/oe50;", "", "b", "()V", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0311b implements oe50 {
        public C0311b() {
        }

        /* JADX INFO: renamed from: a */
        public void m4644a() {
            glm0.this.m4616P().m228h();
        }

        /* JADX INFO: renamed from: b */
        public void m4645b() {
            glm0.m4604n0(glm0.this, 0, false, 3, null);
        }
    }

    /* JADX INFO: renamed from: l.glm0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/glm0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0312c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3948a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ glm0 f3949b;

        public C0312c(boolean z, glm0 glm0Var) {
            this.f3948a = z;
            this.f3949b = glm0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (this.f3948a && m6w.INSTANCE.a(this.f3949b.c())) {
                this.f3949b.m4617Q().animate().alpha(0.0f).setDuration(400L).start();
            }
            ValueAnimator valueAnimator = this.f3949b.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.f3949b.resetAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: l.glm0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/glm0$d", "Landroid/os/CountDownTimer;", "", "it", "", "onTick", "(J)V", "onFinish", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountDownTimerC0313d extends CountDownTimer {
        public CountDownTimerC0313d(long j) {
            super(j, 25L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            glm0.this.m4611v0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long it) {
            int i = it < 25 ? 0 : (int) it;
            m6w m6wVar = m6w.INSTANCE;
            if (m6wVar.a(glm0.this.c())) {
                glm0.this.m4618R().setProgress(i);
                glm0.this.m4615O().setText(m6wVar.c(it));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glm0(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m4586A(glm0 glm0Var, View view) {
        User userE = glm0Var.e();
        if (userE != null) {
            glm0Var.c().startActivity(CoreModule.P().a().jr(glm0Var.c(), ((DbObject) userE).id, "from_voice_buzz", false));
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m4589E(glm0 glm0Var) {
        ViewGroup.LayoutParams layoutParams = glm0Var.m4616P().getLayoutParams();
        layoutParams.height = glm0Var.m4619S().getHeight() + t100.d(310.0f);
        glm0Var.m4616P().setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G */
    public static void m4591G(glm0 glm0Var, View view) {
        p9w.INSTANCE.C0();
        Act act = glm0Var.act();
        if (act != null) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m4592H(final glm0 glm0Var, View view) {
        p9w.v0(p9w.INSTANCE, (String) null, 1, (Object) null);
        f6w.b0(f6w.INSTANCE, glm0Var.c(), new Function0() { // from class: l.flm0
            public final Object invoke() {
                return glm0.m4598h0(this.f3658a);
            }
        }, (String) null, 4, (Object) null);
    }

    /* JADX INFO: renamed from: N */
    private final List<View> m4596N(List<? extends Tag> userTagsData) {
        View viewM4614M;
        if (!NullChecker.a(userTagsData) || !m6w.INSTANCE.a(act())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.a(tag) && (viewM4614M = m4614M(tag)) != null) {
                arrayList.add(viewM4614M);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m4597g0() {
        xdl0.E0(m4629c0(), new View.OnClickListener() { // from class: l.blm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m4592H(this.f2407a, view);
            }
        });
        xdl0.E0(m4622V(), new View.OnClickListener() { // from class: l.clm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m4586A(this.f2724a, view);
            }
        });
        xdl0.E0(m4631e0(), new View.OnClickListener() { // from class: l.dlm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                glm0.m4591G(this.f3029a, view);
            }
        });
        m4619S().setControlVBListener(new C0311b());
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m4598h0(glm0 glm0Var) {
        j8w.f1(j8w.Companion.a(), (String) null, 1, (Object) null);
        m4604n0(glm0Var, R.string.e0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private final void m4599i0() {
        m6w.INSTANCE.l(new View[]{m4617Q(), m4620T(), m4615O()});
        m4618R().m304c(y2c0.V, 0);
        hhx hhxVarB0 = j8w.Companion.a().B0();
        long jC = hhxVarB0.c();
        m4608s0((int) jC, ((long) hhxVarB0.h()) < jC ? hhxVarB0.k() * 1000 : hhxVarB0.h());
    }

    /* JADX INFO: renamed from: j0 */
    private final void m4600j0() {
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
            m4605p0();
        } else {
            m4599i0();
        }
        v(userPa);
        m4637o0();
        m4624X().setText(userPa.name);
        Integer numD = g9w.INSTANCE.d(userPa.location.region);
        xdl0.M(m4625Y(), NullChecker.a(numD));
        if (NullChecker.a(numD)) {
            u9w u9wVar = u9w.INSTANCE;
            u9wVar.q(userPa, m4623W());
            u9wVar.n(userPa, m4625Y(), 16.0f, 16.0f, false);
            AppCompatTextView appCompatTextViewM4625Y = m4625Y();
            numD.getClass();
            xdl0.l(appCompatTextViewM4625Y, hvc0.b(numD.intValue()));
        } else {
            u9w.INSTANCE.o(userPa, m4623W(), 16.0f, 16.0f);
        }
        boolean zEquals = TEnum.equals(userPa.gender, "male");
        List<? extends Tag> listN = vwb.n(userPa.profile.tags, new w9j() { // from class: l.ykm0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return glm0.m4601k0((Tag) obj);
            }
        });
        listN.getClass();
        ArrayList arrayListN = vwb.n(userPa.profile.tags, new w9j() { // from class: l.zkm0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return glm0.m4602l0((Tag) obj);
            }
        });
        arrayListN.getClass();
        if (!vwb.J(listN) && listN.size() < 10 && !vwb.J(arrayListN)) {
            int size = 10 - listN.size();
            if (arrayListN.size() < size) {
                listN.addAll(arrayListN);
            } else {
                listN.addAll(arrayListN.subList(0, size));
            }
        }
        if (vwb.J(listN)) {
            xdl0.M(m4626Z(), false);
        } else {
            xdl0.M(m4626Z(), true);
            m4628b0().setText(c().getString(zEquals ? R.string.V0 : R.string.U0));
            m4627a0().setTags(m4596N(listN));
            Drawable drawableB = hvc0.b(y2c0.x0);
            drawableB.getClass();
            int i = t100.s;
            drawableB.setBounds(0, 0, i, i);
            xdl0.k(m4628b0(), drawableB);
        }
        m4616P().post(new Runnable() { // from class: l.alm0
            @Override // java.lang.Runnable
            public final void run() {
                glm0.m4589E(this.f2236a);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m4601k0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.d("personality", tag.category));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m4602l0(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.d("personality", tag.category));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    private final void m4603m0(@StringRes int res, boolean needQuit) {
        if (needQuit) {
            BuzzMediaCallManager.INSTANCE.W();
        }
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.a(c())) {
            if (res != -1) {
                m4612w0(res);
            }
            m4610u0();
            m4619S().m150t0();
            m6wVar.d(new View[]{m4632f0(), m4629c0(), m4631e0(), m4622V()});
            e51.J(d());
            e51.H(c(), d(), 2000L);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m4604n0(glm0 glm0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.z0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        glm0Var.m4603m0(i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    private final void m4605p0() {
        if (j8w.Companion.a().B0().f() != LoveBuzzConstants.MATCH.MATCHED) {
            m6w.INSTANCE.l(new View[]{m4617Q(), m4620T(), m4615O()});
        } else {
            m6w.INSTANCE.j(new View[]{m4620T(), m4615O()});
            m4606q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m4606q0() {
        m4610u0();
        hhx hhxVarB0 = j8w.Companion.a().B0();
        final boolean z = hhxVarB0.f() == LoveBuzzConstants.MATCH.MATCHED;
        if (z) {
            m4618R().m304c(y2c0.m, 1);
            m4618R().m306e();
            if (!hhxVarB0.e()) {
                m4616P().m229i();
                hhxVarB0.n(true);
            }
        }
        if (xdl0.O0(m4617Q())) {
            final int maxProgress = m4618R().getMaxProgress();
            final int iC = (int) hhxVarB0.c();
            ValueAnimator valueAnimator = this.resetAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m4618R().getProgress(), maxProgress);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(bt0.b);
            valueAnimatorOfInt.addListener(new C0312c(z, this));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.elm0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    glm0.m4607r0(this.f3330a, z, maxProgress, iC, valueAnimator2);
                }
            });
            this.resetAnim = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m4607r0(glm0 glm0Var, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        glm0Var.m4618R().setProgress(iIntValue);
        if (z || iIntValue < i) {
            return;
        }
        m4609t0(glm0Var, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m4608s0(int time, int maxProgress) {
        if (m6w.INSTANCE.a(c())) {
            m4610u0();
            j8w.Companion.a().B0().o(maxProgress);
            m4618R().setMax(maxProgress);
            if (!m4618R().m303b()) {
                m4618R().m305d();
            }
            CountDownTimerC0313d countDownTimerC0313d = new CountDownTimerC0313d(time);
            this.timer = countDownTimerC0313d;
            countDownTimerC0313d.start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m4609t0(glm0 glm0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        glm0Var.m4608s0(i, i2);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m4610u0() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m4611v0() {
        m4610u0();
        m4604n0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m4612w0(@StringRes int res) {
        if (res == -1) {
            return;
        }
        lsi0.w(res);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final View m4613J(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = hlm0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: M */
    public final View m4614M(Tag tag) {
        Act act = act();
        if (act == null) {
            return null;
        }
        View viewInflate = act.inflater().inflate(h6c0.w, (ViewGroup) null);
        viewInflate.getClass();
        AppCompatTextView appCompatTextViewFindViewById = viewInflate.findViewById(v4c0.b);
        appCompatTextViewFindViewById.getClass();
        AppCompatTextView appCompatTextView = (VText) appCompatTextViewFindViewById;
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setBackgroundResource(y2c0.Y);
        appCompatTextView.setText(tag.value);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m4615O() {
        VText vText = this._countdown_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_countdown_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LoveBuzzMatchView m4616P() {
        LoveBuzzMatchView loveBuzzMatchView = this._match_view;
        if (loveBuzzMatchView != null) {
            return loveBuzzMatchView;
        }
        Intrinsics.r("_match_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final FrameLayout m4617Q() {
        FrameLayout frameLayout = this._progress_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_progress_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ZebraProgress m4618R() {
        ZebraProgress zebraProgress = this._progress_root_call_progress;
        if (zebraProgress != null) {
            return zebraProgress;
        }
        Intrinsics.r("_progress_root_call_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VoiceBuzzCallControlView m4619S() {
        VoiceBuzzCallControlView voiceBuzzCallControlView = this._vb_control;
        if (voiceBuzzCallControlView != null) {
            return voiceBuzzCallControlView;
        }
        Intrinsics.r("_vb_control");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m4620T() {
        VText vText = this._vb_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vb_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VDraweeView m4621U() {
        VDraweeView vDraweeView = this._vb_mee_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_vb_mee_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VDraweeView m4622V() {
        VDraweeView vDraweeView = this._vb_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_vb_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m4623W() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m4624X() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vb_peer_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m4625Y() {
        VText vText = this._vb_peer_region;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vb_peer_region");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m4626Z() {
        VLinear vLinear = this._vb_peer_tag_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_vb_peer_tag_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final BuzzFlowTagsView m4627a0() {
        BuzzFlowTagsView buzzFlowTagsView = this._vb_peer_tag_root_tags;
        if (buzzFlowTagsView != null) {
            return buzzFlowTagsView;
        }
        Intrinsics.r("_vb_peer_tag_root_tags");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m4628b0() {
        VText vText = this._vb_peer_tag_root_vb_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_vb_peer_tag_root_vb_tag");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m4629c0() {
        VImage vImage = this._vb_report;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_vb_report");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final SVGAnimationView m4630d0() {
        SVGAnimationView sVGAnimationView = this._vb_svg_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_vb_svg_bg");
        return null;
    }

    public void destroy() {
        Dialog showingDialog;
        if (m6w.INSTANCE.a(c()) && (showingDialog = c().getShowingDialog()) != null) {
            showingDialog.dismiss();
        }
        e51.J(d());
        m4619S().setControlVBListener(null);
        m4610u0();
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
    public final VImage m4631e0() {
        VImage vImage = this._vb_zoom;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_vb_zoom");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final ConstraintLayout m4632f0() {
        ConstraintLayout constraintLayout = this._voice_call_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_voice_call_root");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m4613J(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public void m4633j() {
        if (NullChecker.a(m4616P())) {
            m4616P().m227g();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4634k() {
        m4619S().m144D0();
        m4637o0();
    }

    /* JADX INFO: renamed from: l */
    public void m4635l() {
        m4604n0(this, 0, false, 3, null);
    }

    /* JADX INFO: renamed from: m */
    public void m4636m() {
        m4603m0(R.string.r, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4637o0() {
        LoveBuzzConstants.MATCH matchF = j8w.Companion.a().B0().f();
        LoveBuzzConstants.MATCH match = LoveBuzzConstants.MATCH.MATCHED;
        boolean z = matchF == match || matchF == LoveBuzzConstants.MATCH.PEER_LIKE_ME;
        User userE = e();
        if (userE != null) {
            u9w u9wVar = u9w.INSTANCE;
            VDraweeView vDraweeViewM4622V = m4622V();
            Picture.ImageUri imageUriProfileSmall = u9wVar.j(userE).profileSmall();
            imageUriProfileSmall.getClass();
            u9wVar.g(vDraweeViewM4622V, imageUriProfileSmall, z ? 100 : 0, true);
        }
        User userP9 = CoreModule.c.e0.p9();
        u9w u9wVar2 = u9w.INSTANCE;
        VDraweeView vDraweeViewM4621U = m4621U();
        userP9.getClass();
        Picture.ImageUri imageUriProfileSmall2 = u9wVar2.j(userP9).profileSmall();
        imageUriProfileSmall2.getClass();
        u9wVar2.g(vDraweeViewM4621U, imageUriProfileSmall2, (matchF == match || matchF == LoveBuzzConstants.MATCH.ME_LIKE_PEER) ? 100 : 0, true);
        m4605p0();
    }

    /* JADX INFO: renamed from: p */
    public void m4638p() {
        m4637o0();
    }

    /* JADX INFO: renamed from: q */
    public void m4639q() {
        m4604n0(this, R.string.r, false, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m4640r() {
        xdl0.X(m4629c0(), xdl0.F0() + t100.h);
        SVGALoader.with(c()).from(kp3.INSTANCE.n()).autoPlay(true).into(m4630d0());
        m4627a0().m165c();
        BuzzFlowTagsView buzzFlowTagsViewM4627a0 = m4627a0();
        int i = t100.g;
        buzzFlowTagsViewM4627a0.setHeightLineSpace(i);
        m4627a0().setPadding(i, i, i, i);
        m4597g0();
        m4600j0();
    }

    /* JADX INFO: renamed from: x */
    public void m4641x() {
        h6w.INSTANCE.f(C0(), m4619S(), "voice_bonus_tip");
    }

    /* JADX INFO: renamed from: y */
    public void m4642y() {
        m4606q0();
        m4619S().m145E0();
    }

    /* JADX INFO: renamed from: z */
    public void m4643z() {
        BuzzMediaCallManager.v(BuzzMediaCallManager.INSTANCE, 0, 1, (Object) null);
        Act act = act();
        if (act != null) {
            act.finish();
        }
    }
}
