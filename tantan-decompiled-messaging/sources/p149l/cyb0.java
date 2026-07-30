package p149l;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00105\u001a\u0004\bC\u00107\"\u0004\bD\u00109R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\ba\u00107\"\u0004\bb\u00109R\"\u0010f\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bd\u00107\"\u0004\be\u00109¨\u0006g"}, m87232d2 = {"Ll/cyb0;", "Ll/s7m;", "Ll/vxb0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "r", "()V", BaseSei.f13931Y, "", "k", "()Ljava/lang/CharSequence;", "", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "B", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/vxb0;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/animation/Animator;", "enterAnimation", "()Landroid/animation/Animator;", "exitAnimation", "j", "A", BaseSei.f13932Z, "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "Lv/VRelative;", "b", "Lv/VRelative;", "q", "()Lv/VRelative;", "set_rootView", "(Lv/VRelative;)V", "_rootView", "Lcom/tantan/library/svga/SVGAnimationView;", "c", "Lcom/tantan/library/svga/SVGAnimationView;", "u", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg_loading", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg_loading", "Lv/VFrame;", Constants.INAPP_DATA_TAG, "Lv/VFrame;", "get_center_svga_layout", "()Lv/VFrame;", "set_center_svga_layout", "(Lv/VFrame;)V", "_center_svga_layout", ResourceDirection.f38808v, "set_svga_ic", "_svga_ic", "Lv/VLinear;", "f", "Lv/VLinear;", "p", "()Lv/VLinear;", "set_desc_layout", "(Lv/VLinear;)V", "_desc_layout", "Lv/VText;", "g", "Lv/VText;", "n", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "h", BLiveStormDanmakuGiftResourceType.f44446s, "set_sub_desc", "_sub_desc", "Lv/VImage;", "Lv/VImage;", "m", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "w", "set_svga_pop_pre", "_svga_pop_pre", BaseSei.f13930X, "set_svga_pop_real", "_svga_pop_real", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cyb0 implements s7m<vxb0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatSearchingAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _rootView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SVGAnimationView _svga_bg_loading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _center_svga_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SVGAnimationView _svga_ic;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _desc_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _sub_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SVGAnimationView _svga_pop_pre;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SVGAnimationView _svga_pop_real;

    /* JADX INFO: renamed from: l.cyb0$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/cyb0$a", "Lcom/tantan/library/svga/AnimListener;", "", "onStart", "()V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16274a extends AnimListener {
        public C16274a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m109274a(cyb0 cyb0Var) {
            cyb0Var.m109271x().startAnimation();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            QuickChatSearchingAct quickChatSearchingAct = cyb0.this.act;
            final cyb0 cyb0Var = cyb0.this;
            e51.m114743H(quickChatSearchingAct, new Runnable() { // from class: l.byb0
                @Override // java.lang.Runnable
                public final void run() {
                    cyb0.C16274a.m109274a(cyb0Var);
                }
            }, 6000L);
        }
    }

    public cyb0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m109250a(cyb0 cyb0Var, View view) {
        cyb0Var.m109257B();
    }

    /* JADX INFO: renamed from: b */
    public static void m109251b(cyb0 cyb0Var) {
        cyb0Var.m109270w().startAnimation();
    }

    /* JADX INFO: renamed from: c */
    public static void m109252c(String str, cyb0 cyb0Var, View view) {
        zvf0.m220399u("e_quickchat_matching_cancel_popup_exit", str, j760.m140076a("chat_type", "quickchat"));
        if (OnlineMatchManager.m50143z().m50155L()) {
            OnlineMatchManager.m50143z().f32594I.onNext(vwb.m200311Y("notify_normal_state", null));
            OnlineMatchManager.m50143z().m50191v();
        } else {
            sqb0.Companion companion = sqb0.INSTANCE;
            if (companion.m185577f().m185554Y()) {
                companion.m185577f().m185540D0();
            }
        }
        cyb0Var.act.m47815F2();
    }

    /* JADX INFO: renamed from: d */
    public static void m109253d(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: r */
    private final void m109255r() {
        m109272y();
        xdl0.m208329E0(m109263m(), new View.OnClickListener() { // from class: l.xxb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyb0.m109250a(this.f194849a, view);
            }
        });
        m109256A();
    }

    /* JADX INFO: renamed from: A */
    public final void m109256A() {
        VText vTextM109264n = m109264n();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM109264n.setText(String.format("正在%s匹配中", Arrays.copyOf(new Object[]{TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "在线" : "语音"}, 1)));
        m109267s().setText(m109261k());
    }

    /* JADX INFO: renamed from: B */
    public final void m109257B() {
        if (!wxb0.m205979a()) {
            this.act.m47815F2();
            return;
        }
        final String str = "p_quickchat_matching_cancel_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_matching_cancel_popup", "dlg");
        cwf0VarM133794c.m109040p(j760.m140076a("tooltips_trigger_mode", "passive"), j760.m140076a("chat_type", "quickchat"));
        xh0 xh0VarM208722a = new xh0.C21150a(this.act).m208731j("是否要停止寻找，退出页面将停止匹配").m208727f("退出").m208739r("继续寻找").m208724c(new View.OnClickListener() { // from class: l.yxb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyb0.m109252c(str, this, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.zxb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cyb0.m109253d(cwf0VarM133794c, dialogInterface);
            }
        }).m208722a();
        if (xh0VarM208722a != null) {
            xh0VarM208722a.m208721g();
        }
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m109258e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM114054b = dyb0.m114054b(this, inflater, parent);
        viewM114054b.getClass();
        return viewM114054b;
    }

    @NotNull
    public Animator enterAnimation() {
        SVGAnimationView sVGAnimationViewM109269v = m109269v();
        Property<View, Float> property = bt0.f77162i;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorM103739l = bt0.m103739l(sVGAnimationViewM109269v, property, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        VRelative vRelativeM109266q = m109266q();
        Property property2 = View.ALPHA;
        Animator animatorM103749v = bt0.m103749v(bt0.m103753z(animatorM103739l, bt0.m103739l(vRelativeM109266q, property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(m109265p(), property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(m109265p(), View.TRANSLATION_Y, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167271t, 0.0f)), new Runnable() { // from class: l.ayb0
            @Override // java.lang.Runnable
            public final void run() {
                cyb0.m109251b(this.f72265a);
            }
        });
        animatorM103749v.getClass();
        return animatorM103749v;
    }

    @NotNull
    public Animator exitAnimation() {
        SVGAnimationView sVGAnimationViewM109269v = m109269v();
        Property<View, Float> property = bt0.f77162i;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorM103739l = bt0.m103739l(sVGAnimationViewM109269v, property, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        VRelative vRelativeM109266q = m109266q();
        Property property2 = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, bt0.m103739l(vRelativeM109266q, property2, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), bt0.m103739l(m109265p(), property2, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), bt0.m103739l(m109265p(), View.TRANSLATION_Y, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, t100.f167271t));
        animatorM103753z.getClass();
        return animatorM103753z;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m109258e(inflater, parent);
        m109255r();
        return m109266q();
    }

    /* JADX INFO: renamed from: j */
    public final void m109260j() {
        m109266q().setAlpha(0.0f);
        m109265p().setAlpha(0.0f);
        cxq.m109104b(m109269v(), 0.0f);
        SVGAnimationView.stopAnimation$default(m109270w(), false, 1, null);
        SVGAnimationView.stopAnimation$default(m109271x(), false, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m109261k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("为你找到在线的%s", Arrays.copyOf(new Object[]{zz6.m221004u0() ? "他" : "她"}, 1));
    }

    /* JADX INFO: renamed from: l */
    public final String m109262l() {
        return TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga" : "https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VImage m109263m() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m109264n() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VLinear m109265p() {
        VLinear vLinear = this._desc_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_desc_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VRelative m109266q() {
        VRelative vRelative = this._rootView;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m109267s() {
        VText vText = this._sub_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final SVGAnimationView m109268u() {
        SVGAnimationView sVGAnimationView = this._svga_bg_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_bg_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SVGAnimationView m109269v() {
        SVGAnimationView sVGAnimationView = this._svga_ic;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_ic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final SVGAnimationView m109270w() {
        SVGAnimationView sVGAnimationView = this._svga_pop_pre;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_pop_pre");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final SVGAnimationView m109271x() {
        SVGAnimationView sVGAnimationView = this._svga_pop_real;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_pop_real");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m109272y() {
        int iM208412y0 = xdl0.m208412y0();
        if (iM208412y0 > 0) {
            float f = iM208412y0;
            float f2 = 1.17f * f;
            float fM186890d = (f2 - t100.m186890d(375.0f)) / 2.0f;
            ViewGroup.LayoutParams layoutParams = m109263m().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = t100.f167265n + Integer.max((int) fM186890d, 0);
            m109263m().setLayoutParams(marginLayoutParams);
            xdl0.m208325C0(m109268u(), (int) f2);
            int i = (int) (f * 2.16f);
            xdl0.m208325C0(m109270w(), i);
            xdl0.m208325C0(m109271x(), i);
        }
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga").into(m109268u());
        xdl0.m208344M(m109268u(), true);
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).animListener(new C16274a()).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m109270w());
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m109271x());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from(m109262l()).into(m109269v());
    }

    /* JADX INFO: renamed from: z */
    public final void m109273z() {
        m109264n().setText("匹配已结束");
        m109267s().setText("请退出稍后再试试吧");
        m109265p().invalidate();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable vxb0 presenter) {
    }
}
