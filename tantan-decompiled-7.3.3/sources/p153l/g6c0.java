package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00105\u001a\u0004\bC\u00107\"\u0004\bD\u00109R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\ba\u00107\"\u0004\bb\u00109R\"\u0010f\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bd\u00107\"\u0004\be\u00109¨\u0006g"}, m88121d2 = {"Ll/g6c0;", "Ll/iam;", "Ll/z5c0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "r", "()V", BaseSei.f14625Y, "", "k", "()Ljava/lang/CharSequence;", "", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "B", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/z5c0;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/animation/Animator;", "enterAnimation", "()Landroid/animation/Animator;", "exitAnimation", "j", "A", BaseSei.f14626Z, "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "Lv/VRelative;", "b", "Lv/VRelative;", "q", "()Lv/VRelative;", "set_rootView", "(Lv/VRelative;)V", "_rootView", "Lcom/tantan/library/svga/SVGAnimationView;", "c", "Lcom/tantan/library/svga/SVGAnimationView;", "u", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg_loading", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg_loading", "Lv/VFrame;", Constants.INAPP_DATA_TAG, "Lv/VFrame;", "get_center_svga_layout", "()Lv/VFrame;", "set_center_svga_layout", "(Lv/VFrame;)V", "_center_svga_layout", ResourceDirection.f39656v, "set_svga_ic", "_svga_ic", "Lv/VLinear;", "f", "Lv/VLinear;", "p", "()Lv/VLinear;", "set_desc_layout", "(Lv/VLinear;)V", "_desc_layout", "Lv/VText;", "g", "Lv/VText;", "n", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "h", BLiveStormDanmakuGiftResourceType.f45294s, "set_sub_desc", "_sub_desc", "Lv/VImage;", "Lv/VImage;", "m", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "w", "set_svga_pop_pre", "_svga_pop_pre", BaseSei.f14624X, "set_svga_pop_real", "_svga_pop_real", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g6c0 implements iam<z5c0> {

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

    /* JADX INFO: renamed from: l.g6c0$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/g6c0$a", "Lcom/tantan/library/svga/AnimListener;", "", "onStart", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17164a extends AnimListener {
        public C17164a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m129244a(g6c0 g6c0Var) {
            g6c0Var.m129241x().startAnimation();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            QuickChatSearchingAct quickChatSearchingAct = g6c0.this.act;
            final g6c0 g6c0Var = g6c0.this;
            l51.m152888H(quickChatSearchingAct, new Runnable() { // from class: l.f6c0
                @Override // java.lang.Runnable
                public final void run() {
                    g6c0.C17164a.m129244a(g6c0Var);
                }
            }, 6000L);
        }
    }

    public g6c0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m129220a(g6c0 g6c0Var, View view) {
        g6c0Var.m129227B();
    }

    /* JADX INFO: renamed from: b */
    public static void m129221b(g6c0 g6c0Var) {
        g6c0Var.m129240w().startAnimation();
    }

    /* JADX INFO: renamed from: c */
    public static void m129222c(String str, g6c0 g6c0Var, View view) {
        i4g0.m138523u("e_quickchat_matching_cancel_popup_exit", str, pf60.m172085a("chat_type", "quickchat"));
        if (OnlineMatchManager.m51326z().m51338L()) {
            OnlineMatchManager.m51326z().f33442I.onNext(jyb.m147494Y("notify_normal_state", null));
            OnlineMatchManager.m51326z().m51374v();
        } else {
            wyb0.Companion companion = wyb0.INSTANCE;
            if (companion.m208572f().m208549Y()) {
                companion.m208572f().m208535D0();
            }
        }
        g6c0Var.act.m48999H2();
    }

    /* JADX INFO: renamed from: d */
    public static void m129223d(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: r */
    private final void m129225r() {
        m129242y();
        bnl0.m105509E0(m129233m(), new View.OnClickListener() { // from class: l.b6c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g6c0.m129220a(this.f75175a, view);
            }
        });
        m129226A();
    }

    /* JADX INFO: renamed from: A */
    public final void m129226A() {
        VText vTextM129234n = m129234n();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM129234n.setText(String.format("正在%s匹配中", Arrays.copyOf(new Object[]{TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "在线" : "语音"}, 1)));
        m129237s().setText(m129231k());
    }

    /* JADX INFO: renamed from: B */
    public final void m129227B() {
        if (!a6c0.m96321a()) {
            this.act.m48999H2();
            return;
        }
        final String str = "p_quickchat_matching_cancel_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_matching_cancel_popup", "dlg");
        l4g0VarM204399c.m152781p(pf60.m172085a("tooltips_trigger_mode", "passive"), pf60.m172085a("chat_type", "quickchat"));
        th0 th0VarM191142a = new th0.C20312a(this.act).m191151j("是否要停止寻找，退出页面将停止匹配").m191147f("退出").m191159r("继续寻找").m191144c(new View.OnClickListener() { // from class: l.c6c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g6c0.m129222c(str, this, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.d6c0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                g6c0.m129223d(l4g0VarM204399c, dialogInterface);
            }
        }).m191142a();
        if (th0VarM191142a != null) {
            th0VarM191142a.m191141g();
        }
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m129228e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM133683b = h6c0.m133683b(this, inflater, parent);
        viewM133683b.getClass();
        return viewM133683b;
    }

    @NotNull
    public Animator enterAnimation() {
        SVGAnimationView sVGAnimationViewM129239v = m129239v();
        Property<View, Float> property = gt0.f106354i;
        r3c0 r3c0Var = r3c0.INSTANCE;
        Animator animatorM132166l = gt0.m132166l(sVGAnimationViewM129239v, property, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        VRelative vRelativeM129236q = m129236q();
        Property property2 = View.ALPHA;
        Animator animatorM132176v = gt0.m132176v(gt0.m132180z(animatorM132166l, gt0.m132166l(vRelativeM129236q, property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(m129235p(), property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(m129235p(), View.TRANSLATION_Y, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156333t, 0.0f)), new Runnable() { // from class: l.e6c0
            @Override // java.lang.Runnable
            public final void run() {
                g6c0.m129221b(this.f92272a);
            }
        });
        animatorM132176v.getClass();
        return animatorM132176v;
    }

    @NotNull
    public Animator exitAnimation() {
        SVGAnimationView sVGAnimationViewM129239v = m129239v();
        Property<View, Float> property = gt0.f106354i;
        r3c0 r3c0Var = r3c0.INSTANCE;
        Animator animatorM132166l = gt0.m132166l(sVGAnimationViewM129239v, property, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        VRelative vRelativeM129236q = m129236q();
        Property property2 = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, gt0.m132166l(vRelativeM129236q, property2, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), gt0.m132166l(m129235p(), property2, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), gt0.m132166l(m129235p(), View.TRANSLATION_Y, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, qa00.f156333t));
        animatorM132180z.getClass();
        return animatorM132180z;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m129228e(inflater, parent);
        m129225r();
        return m129236q();
    }

    /* JADX INFO: renamed from: j */
    public final void m129230j() {
        m129236q().setAlpha(0.0f);
        m129235p().setAlpha(0.0f);
        czq.m113346b(m129239v(), 0.0f);
        SVGAnimationView.stopAnimation$default(m129240w(), false, 1, null);
        SVGAnimationView.stopAnimation$default(m129241x(), false, 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m129231k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("为你找到在线的%s", Arrays.copyOf(new Object[]{c17.m107528u0() ? "他" : "她"}, 1));
    }

    /* JADX INFO: renamed from: l */
    public final String m129232l() {
        return TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga" : "https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VImage m129233m() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m129234n() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VLinear m129235p() {
        VLinear vLinear = this._desc_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_desc_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VRelative m129236q() {
        VRelative vRelative = this._rootView;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m129237s() {
        VText vText = this._sub_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final SVGAnimationView m129238u() {
        SVGAnimationView sVGAnimationView = this._svga_bg_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_bg_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SVGAnimationView m129239v() {
        SVGAnimationView sVGAnimationView = this._svga_ic;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_ic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final SVGAnimationView m129240w() {
        SVGAnimationView sVGAnimationView = this._svga_pop_pre;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_pop_pre");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final SVGAnimationView m129241x() {
        SVGAnimationView sVGAnimationView = this._svga_pop_real;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_pop_real");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m129242y() {
        int iM105592y0 = bnl0.m105592y0();
        if (iM105592y0 > 0) {
            float f = iM105592y0;
            float f2 = 1.17f * f;
            float fM175859d = (f2 - qa00.m175859d(375.0f)) / 2.0f;
            ViewGroup.LayoutParams layoutParams = m129233m().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = qa00.f156327n + Integer.max((int) fM175859d, 0);
            m129233m().setLayoutParams(marginLayoutParams);
            bnl0.m105505C0(m129238u(), (int) f2);
            int i = (int) (f * 2.16f);
            bnl0.m105505C0(m129240w(), i);
            bnl0.m105505C0(m129241x(), i);
        }
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga").into(m129238u());
        bnl0.m105524M(m129238u(), true);
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).animListener(new C17164a()).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m129240w());
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m129241x());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from(m129232l()).into(m129239v());
    }

    /* JADX INFO: renamed from: z */
    public final void m129243z() {
        m129234n().setText("匹配已结束");
        m129237s().setText("请退出稍后再试试吧");
        m129235p().invalidate();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable z5c0 presenter) {
    }
}
