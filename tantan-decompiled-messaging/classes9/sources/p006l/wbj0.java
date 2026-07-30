package p006l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hvc0;
import l.i0g0;
import l.osi0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J!\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0015R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\"\u0010>\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010)\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\"\u0010B\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\"\u0010F\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\"\u0010J\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010)\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\"\u0010b\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010)\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R\"\u0010f\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u00101\u001a\u0004\bd\u00103\"\u0004\be\u00105R\"\u0010j\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u00101\u001a\u0004\bh\u00103\"\u0004\bi\u00105R\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010o\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006p"}, d2 = {"Ll/wbj0;", "Ll/c3f0;", "Ll/pbj0;", "Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/act/TtcAccountBindAct;", "act", "<init>", "(Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/act/TtcAccountBindAct;)V", "", "s", "()Ljava/lang/String;", "", "isPhone", "", "O", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "I", "K", "()Z", "M", "()V", "N", "L", "J", "inflateView", "Lv/VLinear;", "c", "Lv/VLinear;", "y", "()Lv/VLinear;", "set_layout_yes_root", "(Lv/VLinear;)V", "_layout_yes_root", "Lv/VImage;", "d", "Lv/VImage;", "w", "()Lv/VImage;", "set_iv_yes_select", "(Lv/VImage;)V", "_iv_yes_select", "Lv/VText;", "e", "Lv/VText;", "H", "()Lv/VText;", "set_tv_yes_desc", "(Lv/VText;)V", "_tv_yes_desc", "f", "x", "set_layout_no_root", "_layout_no_root", "g", "v", "set_iv_no_select", "_iv_no_select", "h", "G", "set_tv_no_desc", "_tv_no_desc", "i", "u", "set_continue_btn", "_continue_btn", "j", "F", "set_tv_contact", "_tv_contact", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "k", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "z", "()Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "set_loading_svga", "(Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;)V", "_loading_svga", "Landroidx/constraintlayout/widget/ConstraintLayout;", "l", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_top", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_top", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_top", "m", "A", "set_top_toolbar_back", "_top_toolbar_back", "n", "B", "set_top_toolbar_icon", "_top_toolbar_icon", "o", "C", "set_top_toolbar_right_btn", "_top_toolbar_right_btn", "p", "E", "set_top_toolbar_title", "_top_toolbar_title", "", "currentState", "r", "Z", "isWebRequesting", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class wbj0 extends c3f0<pbj0, TtcAccountBindAct> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _layout_yes_root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _iv_yes_select;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_yes_desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _layout_no_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _iv_no_select;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _tv_no_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _continue_btn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _tv_contact;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public AnimEffectPlayer _loading_svga;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ConstraintLayout _top;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _top_toolbar_back;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _top_toolbar_icon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _top_toolbar_right_btn;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _top_toolbar_title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int currentState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isWebRequesting;

    /* JADX INFO: renamed from: l.wbj0$a */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l/wbj0$a", "Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1401a extends SVGAAnimListenerAdapter {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbj0(@NotNull TtcAccountBindAct ttcAccountBindAct) {
        super(ttcAccountBindAct);
        ttcAccountBindAct.getClass();
    }

    /* JADX INFO: renamed from: j */
    public static void m26321j(boolean z, wbj0 wbj0Var, View view) {
        zvf0.s("e_clone_if_ttcuser_contact_us", "p_clone_if_ttcuser", MapsKt.mapOf(TuplesKt.a("sign_type", z ? "phone_number" : "email")));
        Act act = wbj0Var.act();
        if (act != null) {
            wbj0Var.m13097f(WebViewAct.Z1(act, hvc0.c(R$string.f128T1), wbj0Var.m26342s()));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m26322k(wbj0 wbj0Var, boolean z, View view) {
        wbj0Var.currentState = 1;
        wbj0Var.m26340O(z);
    }

    /* JADX INFO: renamed from: l */
    public static void m26323l(wbj0 wbj0Var, boolean z, View view) {
        wbj0Var.currentState = 2;
        wbj0Var.m26340O(z);
    }

    /* JADX INFO: renamed from: m */
    public static void m26324m(wbj0 wbj0Var, boolean z, View view) {
        ((pbj0) wbj0Var.f9324b).m21064c1();
        zvf0.s("e_clone_register_new", "p_clone_if_ttcuser", MapsKt.mapOf(TuplesKt.a("sign_type", z ? "phone_number" : "email")));
    }

    /* JADX INFO: renamed from: n */
    public static void m26325n(wbj0 wbj0Var, boolean z, View view) {
        try {
            ((pbj0) wbj0Var.f9324b).m21065f1(System.currentTimeMillis());
            if (wbj0Var.m26336K()) {
                try {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(z ? "tantanapp://account/bindPhone" : "tantanapp://account/bindEmail"));
                        intent.setPackage("com.p1.mobile.putong");
                        Act act = wbj0Var.act();
                        if (act != null) {
                            act.startActivity(intent);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception unused) {
                        osi0.g("please install Tantan app");
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Exception unused2) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setClassName("com.p1.mobile.putong", "com.p1.mobile.putong.ui.splash.SplashProxyAct");
                    Act act2 = wbj0Var.act();
                    if (act2 != null) {
                        act2.startActivity(intent2);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            } else {
                ((TtcAccountBindAct) wbj0Var.f9323a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.p1.mobile.putong")));
            }
            zvf0.s("e_clone_bind_ttc", "p_clone_if_ttcuser", MapsKt.mapOf(TuplesKt.a("sign_type", z ? "phone_number" : "email")));
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m26326p(wbj0 wbj0Var, View view) {
        ((TtcAccountBindAct) wbj0Var.f9323a).finish();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VImage m26327A() {
        VImage vImage = this._top_toolbar_back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_top_toolbar_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VImage m26328B() {
        VImage vImage = this._top_toolbar_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_top_toolbar_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m26329C() {
        VText vText = this._top_toolbar_right_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_top_toolbar_right_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m26330E() {
        VText vText = this._top_toolbar_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_top_toolbar_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VText m26331F() {
        VText vText = this._tv_contact;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_contact");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VText m26332G() {
        VText vText = this._tv_no_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_no_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VText m26333H() {
        VText vText = this._tv_yes_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_yes_desc");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m26334I(final boolean isPhone) {
        m26340O(isPhone);
        m26328B().setVisibility(8);
        m26329C().setVisibility(8);
        m26330E().setVisibility(8);
        xdl0.E0(m26327A(), new View.OnClickListener() { // from class: l.qbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbj0.m26326p(this.f19705a, view);
            }
        });
        xdl0.E0(m26331F(), new View.OnClickListener() { // from class: l.rbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbj0.m26321j(isPhone, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final boolean m26335J() {
        return this.currentState == 1;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m26336K() {
        PackageManager packageManager;
        try {
            Act act = act();
            return ((act == null || (packageManager = act.getPackageManager()) == null) ? null : packageManager.getPackageInfo("com.p1.mobile.putong", 0)) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsWebRequesting() {
        return this.isWebRequesting;
    }

    /* JADX INFO: renamed from: M */
    public final void m26338M() {
        this.isWebRequesting = true;
        m26348z().startSVGAAnimWithListener("account_loading_progress.svga", -1, new C1401a());
    }

    /* JADX INFO: renamed from: N */
    public final void m26339N() {
        this.isWebRequesting = false;
        m26348z().stopAnimCompletely();
    }

    /* JADX INFO: renamed from: O */
    public final void m26340O(final boolean isPhone) {
        int i = this.currentState;
        if (i == 0) {
            m26343u().setVisibility(8);
            m26331F().setVisibility(8);
            m26345w().setSelected(false);
            m26333H().setVisibility(8);
            m26344v().setSelected(false);
            m26332G().setVisibility(8);
        } else if (i == 1) {
            m26343u().setVisibility(0);
            m26331F().setVisibility(0);
            if (isPhone) {
                m26343u().setText(R$string.f138V1);
                m26333H().setText(R$string.f143W1);
            } else {
                m26343u().setText(R$string.f181d1);
                m26333H().setText(R$string.f187e1);
            }
            xdl0.E0(m26343u(), new View.OnClickListener() { // from class: l.sbj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wbj0.m26325n(this.f21251a, isPhone, view);
                }
            });
            m26345w().setSelected(true);
            m26333H().setVisibility(0);
            m26344v().setSelected(false);
            m26332G().setVisibility(8);
        } else if (i == 2) {
            m26343u().setVisibility(0);
            m26331F().setVisibility(0);
            if (isPhone) {
                m26343u().setText(R$string.f133U1);
                m26332G().setText("");
            } else {
                m26343u().setText(R$string.f175c1);
                m26332G().setText("");
            }
            xdl0.E0(m26343u(), new View.OnClickListener() { // from class: l.tbj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wbj0.m26324m(this.f22000a, isPhone, view);
                }
            });
            m26345w().setSelected(false);
            m26333H().setVisibility(8);
            m26344v().setSelected(true);
            m26332G().setVisibility(0);
        }
        xdl0.E0(m26347y(), new View.OnClickListener() { // from class: l.ubj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbj0.m26322k(this.f23480a, isPhone, view);
            }
        });
        xdl0.E0(m26346x(), new View.OnClickListener() { // from class: l.vbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbj0.m26323l(this.f24249a, isPhone, view);
            }
        });
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m26341q(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final View m26341q(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM27192b = xbj0.m27192b(this, inflater, parent);
        viewM27192b.getClass();
        return viewM27192b;
    }

    /* JADX INFO: renamed from: s */
    public final String m26342s() {
        String strY = i0g0.y();
        if (strY == null) {
            return "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}";
        }
        switch (strY.hashCode()) {
            case 99994381:
                return !strY.equals("id-ID") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=a08b0b24a8804ea5b1d565f125bf8151&params={\"isLoginIn\":false}";
            case 100828572:
                return !strY.equals("ja-JP") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=03924c5f0b0d48018f7e10f58c7a011d&params={\"isLoginIn\":false}";
            case 102169200:
                return !strY.equals("ko-KR") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=55a63095cf36415285da517e236c1b4a&params={\"isLoginIn\":false}";
            case 110272621:
                return !strY.equals("th-TH") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=65a296d588744addab94c3b7ebe5c31e&params={\"isLoginIn\":false}";
            case 112149522:
                return !strY.equals("vi-VN") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=142d5b6f390f4fcf96d4595484af1bbb&params={\"isLoginIn\":false}";
            case 115813226:
                return !strY.equals("zh-CN") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=636ab0fc2f2a4100a9fd7208478a375b&params={\"isLoginIn\":false}";
            case 115813762:
                return !strY.equals("zh-TW") ? "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}" : "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=a9499c7dfc374b9b9c420cac8037e73c&params={\"isLoginIn\":false}";
            default:
                return "https://sg.sobot.com/ticketclient/index.html?sysNum=7e5b561662e84bbf98e690c8e5e7d613&deployId=627a2e743ced4d1a871dea7331708504&params={\"isLoginIn\":false}";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VText m26343u() {
        VText vText = this._continue_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_continue_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VImage m26344v() {
        VImage vImage = this._iv_no_select;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_no_select");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VImage m26345w() {
        VImage vImage = this._iv_yes_select;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_iv_yes_select");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VLinear m26346x() {
        VLinear vLinear = this._layout_no_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_layout_no_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VLinear m26347y() {
        VLinear vLinear = this._layout_yes_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_layout_yes_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final AnimEffectPlayer m26348z() {
        AnimEffectPlayer animEffectPlayer = this._loading_svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_loading_svga");
        return null;
    }
}
