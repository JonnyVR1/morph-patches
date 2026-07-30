package p006l;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.bt0;
import l.cwf0;
import l.cxq;
import l.dyb0;
import l.e51;
import l.i0e;
import l.j760;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00105\u001a\u0004\bC\u00107\"\u0004\bD\u00109R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010c\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\ba\u00107\"\u0004\bb\u00109R\"\u0010f\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bd\u00107\"\u0004\be\u00109¨\u0006g"}, d2 = {"Ll/cyb0;", "Ll/s7m;", "Ll/vxb0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "r", "()V", "y", "", "k", "()Ljava/lang/CharSequence;", "", "l", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "B", "presenter", "i", "(Ll/vxb0;)V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/animation/Animator;", "enterAnimation", "()Landroid/animation/Animator;", "exitAnimation", "j", "A", "z", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "Lv/VRelative;", "b", "Lv/VRelative;", "q", "()Lv/VRelative;", "set_rootView", "(Lv/VRelative;)V", "_rootView", "Lcom/tantan/library/svga/SVGAnimationView;", "c", "Lcom/tantan/library/svga/SVGAnimationView;", "u", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg_loading", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg_loading", "Lv/VFrame;", "d", "Lv/VFrame;", "get_center_svga_layout", "()Lv/VFrame;", "set_center_svga_layout", "(Lv/VFrame;)V", "_center_svga_layout", "v", "set_svga_ic", "_svga_ic", "Lv/VLinear;", "f", "Lv/VLinear;", "p", "()Lv/VLinear;", "set_desc_layout", "(Lv/VLinear;)V", "_desc_layout", "Lv/VText;", "g", "Lv/VText;", "n", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "h", "s", "set_sub_desc", "_sub_desc", "Lv/VImage;", "Lv/VImage;", "m", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "w", "set_svga_pop_pre", "_svga_pop_pre", "x", "set_svga_pop_real", "_svga_pop_real", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/cyb0$a", "Lcom/tantan/library/svga/AnimListener;", "", "onStart", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0620a extends AnimListener {
        public C0620a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m13714a(cyb0 cyb0Var) {
            cyb0Var.m13711x().startAnimation();
        }

        public void onStart() {
            super.onStart();
            Act act = cyb0.this.act;
            final cyb0 cyb0Var = cyb0.this;
            e51.H(act, new Runnable() { // from class: l.byb0
                @Override // java.lang.Runnable
                public final void run() {
                    cyb0.C0620a.m13714a(cyb0Var);
                }
            }, 6000L);
        }
    }

    public cyb0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m13688a(cyb0 cyb0Var, View view) {
        cyb0Var.m13695B();
    }

    /* JADX INFO: renamed from: b */
    public static void m13689b(cyb0 cyb0Var) {
        cyb0Var.m13710w().startAnimation();
    }

    /* JADX INFO: renamed from: c */
    public static void m13690c(String str, cyb0 cyb0Var, View view) {
        zvf0.u("e_quickchat_matching_cancel_popup_exit", str, new j760[]{j760.a("chat_type", "quickchat")});
        if (OnlineMatchManager.z().L()) {
            OnlineMatchManager.z().I.onNext(vwb.Y("notify_normal_state", (Object) null));
            OnlineMatchManager.z().v();
        } else {
            sqb0.Companion companion = sqb0.INSTANCE;
            if (companion.m24115f().m24092Y()) {
                companion.m24115f().m24078D0();
            }
        }
        cyb0Var.act.finish();
    }

    /* JADX INFO: renamed from: d */
    public static void m13691d(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: r */
    private final void m13693r() {
        m13712y();
        xdl0.E0(m13703m(), new View.OnClickListener() { // from class: l.xxb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyb0.m13688a(this.f27775a, view);
            }
        });
        m13694A();
    }

    /* JADX INFO: renamed from: A */
    public final void m13694A() {
        VText vTextM13704n = m13704n();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM13704n.setText(String.format("正在%s匹配中", Arrays.copyOf(new Object[]{TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "在线" : "语音"}, 1)));
        m13707s().setText(m13701k());
    }

    /* JADX INFO: renamed from: B */
    public final void m13695B() {
        if (!wxb0.m26856a()) {
            this.act.finish();
            return;
        }
        final String str = "p_quickchat_matching_cancel_popup";
        final cwf0 cwf0VarC = i0e.c("p_quickchat_matching_cancel_popup", "dlg");
        cwf0VarC.p(new j760[]{j760.a("tooltips_trigger_mode", "passive"), j760.a("chat_type", "quickchat")});
        xh0 xh0VarA = new xh0.a(this.act).j("是否要停止寻找，退出页面将停止匹配").f("退出").r("继续寻找").c(new View.OnClickListener() { // from class: l.yxb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyb0.m13690c(str, this, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.zxb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cyb0.m13691d(cwf0VarC, dialogInterface);
            }
        }).a();
        if (xh0VarA != null) {
            xh0VarA.g();
        }
        i0e.f(cwf0VarC);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m13696C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m13697e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = dyb0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public Animator enterAnimation() {
        SVGAnimationView sVGAnimationViewM13709v = m13709v();
        Property property = bt0.i;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorL = bt0.l(sVGAnimationViewM13709v, property, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f});
        VRelative vRelativeM13706q = m13706q();
        Property property2 = View.ALPHA;
        Animator animatorV = bt0.v(bt0.z(new Animator[]{animatorL, bt0.l(vRelativeM13706q, property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(m13705p(), property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(m13705p(), View.TRANSLATION_Y, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.t, 0.0f})}), new Runnable() { // from class: l.ayb0
            @Override // java.lang.Runnable
            public final void run() {
                cyb0.m13689b(this.f8597a);
            }
        });
        animatorV.getClass();
        return animatorV;
    }

    @NotNull
    public Animator exitAnimation() {
        SVGAnimationView sVGAnimationViewM13709v = m13709v();
        Property property = bt0.i;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorL = bt0.l(sVGAnimationViewM13709v, property, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f});
        VRelative vRelativeM13706q = m13706q();
        Property property2 = View.ALPHA;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, bt0.l(vRelativeM13706q, property2, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f}), bt0.l(m13705p(), property2, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f}), bt0.l(m13705p(), View.TRANSLATION_Y, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, t100.t})});
        animatorZ.getClass();
        return animatorZ;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m13697e(inflater, parent);
        m13693r();
        return m13706q();
    }

    /* JADX INFO: renamed from: j */
    public final void m13700j() {
        m13706q().setAlpha(0.0f);
        m13705p().setAlpha(0.0f);
        cxq.b(m13709v(), 0.0f);
        SVGAnimationView.stopAnimation$default(m13710w(), false, 1, (Object) null);
        SVGAnimationView.stopAnimation$default(m13711x(), false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m13701k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("为你找到在线的%s", Arrays.copyOf(new Object[]{zz6.u0() ? "他" : "她"}, 1));
    }

    /* JADX INFO: renamed from: l */
    public final String m13702l() {
        return TextUtils.equals(this.act.getActive(), "text_quick_chat") ? "https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga" : "https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga";
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VImage m13703m() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m13704n() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VLinear m13705p() {
        VLinear vLinear = this._desc_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_desc_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VRelative m13706q() {
        VRelative vRelative = this._rootView;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m13707s() {
        VText vText = this._sub_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final SVGAnimationView m13708u() {
        SVGAnimationView sVGAnimationView = this._svga_bg_loading;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_bg_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SVGAnimationView m13709v() {
        SVGAnimationView sVGAnimationView = this._svga_ic;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_ic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final SVGAnimationView m13710w() {
        SVGAnimationView sVGAnimationView = this._svga_pop_pre;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_pop_pre");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final SVGAnimationView m13711x() {
        SVGAnimationView sVGAnimationView = this._svga_pop_real;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_pop_real");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m13712y() {
        int iY0 = xdl0.y0();
        if (iY0 > 0) {
            float f = iY0;
            float f2 = 1.17f * f;
            float fD = (f2 - t100.d(375.0f)) / 2.0f;
            ViewGroup.LayoutParams layoutParams = m13703m().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = t100.n + Integer.max((int) fD, 0);
            m13703m().setLayoutParams(marginLayoutParams);
            xdl0.C0(m13708u(), (int) f2);
            int i = (int) (f * 2.16f);
            xdl0.C0(m13710w(), i);
            xdl0.C0(m13711x(), i);
        }
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga").into(m13708u());
        xdl0.M(m13708u(), true);
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).animListener(new C0620a()).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m13710w());
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga").into(m13711x());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(-1).from(m13702l()).into(m13709v());
    }

    /* JADX INFO: renamed from: z */
    public final void m13713z() {
        m13704n().setText("匹配已结束");
        m13707s().setText("请退出稍后再试试吧");
        m13705p().invalidate();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m13699i1(@Nullable vxb0 presenter) {
    }
}
