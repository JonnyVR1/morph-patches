package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.AccountDeleteAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountInactiveAct;
import com.p046p1.mobile.putong.core.p053ui.account.AccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordChangeAct;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordVerificationAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Marker;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.zx */
/* JADX INFO: loaded from: classes8.dex */
public class C21800zx implements s7m<C16954fx> {

    /* JADX INFO: renamed from: A */
    public C16954fx f205338A;

    /* JADX INFO: renamed from: B */
    public int f205339B = 0;

    /* JADX INFO: renamed from: a */
    public VLinear f205340a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f205341b;

    /* JADX INFO: renamed from: c */
    public VText f205342c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f205343d;

    /* JADX INFO: renamed from: e */
    public VScroll f205344e;

    /* JADX INFO: renamed from: f */
    public VFrame f205345f;

    /* JADX INFO: renamed from: g */
    public VLinear f205346g;

    /* JADX INFO: renamed from: h */
    public VText f205347h;

    /* JADX INFO: renamed from: i */
    public ImageView f205348i;

    /* JADX INFO: renamed from: j */
    public VLinear f205349j;

    /* JADX INFO: renamed from: k */
    public VText f205350k;

    /* JADX INFO: renamed from: l */
    public VText f205351l;

    /* JADX INFO: renamed from: m */
    public VFrame f205352m;

    /* JADX INFO: renamed from: n */
    public VLinear f205353n;

    /* JADX INFO: renamed from: o */
    public VText f205354o;

    /* JADX INFO: renamed from: p */
    public VText f205355p;

    /* JADX INFO: renamed from: q */
    public VLinear f205356q;

    /* JADX INFO: renamed from: r */
    public VText f205357r;

    /* JADX INFO: renamed from: s */
    public VFrame f205358s;

    /* JADX INFO: renamed from: t */
    public VLinear f205359t;

    /* JADX INFO: renamed from: u */
    public VFrame f205360u;

    /* JADX INFO: renamed from: v */
    public VLinear f205361v;

    /* JADX INFO: renamed from: w */
    public VLinear f205362w;

    /* JADX INFO: renamed from: x */
    public VText f205363x;

    /* JADX INFO: renamed from: y */
    public VText f205364y;

    /* JADX INFO: renamed from: z */
    public AccountSecureAct f205365z;

    /* JADX INFO: renamed from: l.zx$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public String[] f205366a;

        /* JADX INFO: renamed from: b */
        public String[] f205367b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f205368c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public a() {
            this.f205366a = new String[]{C21800zx.this.getAct().getString(R$string.f27912q0), C21800zx.this.getAct().getString(R$string.f27918r0), C21800zx.this.getAct().getString(R$string.f27924s0), C21800zx.this.getAct().getString(R$string.f27930t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m220784f() {
            C21800zx.this.f205338A.m123605m0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m220785g(int i, String str) {
            o6j0.m162859c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", o6j0.C18854a.m162878h("delete_account_reason", this.f205368c[i]));
            C21800zx.this.getAct().progress(R$string.f27771R0);
            C21800zx.this.f205338A.m123605m0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m220786h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f205367b[i];
            o6j0.m162859c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", o6j0.C18854a.m162878h("delete_account_reason", this.f205368c[i]));
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            i0e.m133797f(cwf0VarM133794c);
            C21800zx.this.getAct().dialog().m20503E0(R$string.f27942v0).m20500D(R$string.f27948w0).m20541k0(R$string.f27815a).m20556t0(R$string.f27869j, new Runnable() { // from class: l.xx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194802a.m220785g(i, str);
                }
            }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.yx
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            }).m20568z0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntlCountryCodeController.m28113i()) {
                C21800zx.this.f205338A.m123610s0(AccountDeleteAct.m44100Y1(C21800zx.this.getAct()));
                return;
            }
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            i0e.m133797f(cwf0VarM133794c);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || !CoreModule.f17554l.m94651a().mo33489e2() || CoreModule.f17545c.f19570H0.m210347Y4() > 0 || (CoreModule.m29932K().mo30835xf() && CoreModule.f17545c.f19573I0.m140257K3() > 0)) {
                C16185cl.INSTANCE.m107439f(true, C21800zx.this.getAct(), new Function0() { // from class: l.ux
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f178692a.m220784f();
                    }
                });
            } else {
                C21800zx.this.getAct().dialog().m20503E0(R$string.f27936u0).m20536f0(this.f205366a).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.vx
                    @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                    /* JADX INFO: renamed from: a */
                    public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f183407a.m220786h(dialog, view2, i, charSequence);
                    }
                }).m20541k0(R$string.f27815a).m20526V(new DialogInterface.OnDismissListener() { // from class: l.wx
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.m133796e(cwf0VarM133794c);
                    }
                }).m20568z0();
            }
        }
    }

    public C21800zx(AccountSecureAct accountSecureAct) {
        this.f205365z = accountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m220743H(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m220744I(View view) {
        this.f205338A.m123611t0(PasswordVerificationAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m220745J(View view) {
        this.f205338A.m123611t0(PasswordChangeAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m220746K(View view) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na()) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169520na().settings) && TextUtils.isEmpty(CoreModule.f17545c.f19639e0.m169520na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.f17545c.f19639e0.m169520na().settings.phoneNumber.number)) {
            getAct().startActivity(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else {
            getAct().startActivity(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m220747L(View view) {
        zvf0.m220396r("e_account_and_security_view_delete_account", "p_account_and_security_view");
        this.f205338A.m123610s0(AccountInactiveAct.m44101Y1(getAct(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m220748M(View view) {
        zvf0.m220396r("e_auto_renew_subscriptions_management", getAct().pageId());
        this.f205338A.m123611t0(CoreModule.m29932K().getSubscriptionsActClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m220749N(View view) {
        int i = this.f205339B;
        if (i == 0) {
            this.f205338A.m123610s0(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else if (i == 1) {
            getAct().startActivity(new Intent(getAct(), (Class<?>) PasswordVerificationAct.class));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m220765A(User user) {
        this.f205341b.setTitle(getAct().getString(R$string.f27903o3));
        this.f205341b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146103a.m220743H(view);
            }
        });
        this.f205354o.setText(getAct().getString(R$string.f27939u3));
        xdl0.m208344M(this.f205358s, false);
        if (!TEnum.equals(user.source, "facebook") && !TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !TEnum.equals(user.source, "google")) {
            boolean zEquals = TEnum.equals(user.source, "china-mobile");
            VFrame vFrame = this.f205345f;
            if (zEquals) {
                xdl0.m208344M(vFrame, false);
            } else {
                xdl0.m208344M(vFrame, true);
                this.f205346g.setOnClickListener(new View.OnClickListener() { // from class: l.px
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f151614a.m220744I(view);
                    }
                });
            }
            this.f205353n.setOnClickListener(new View.OnClickListener() { // from class: l.qx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156800a.m220745J(view);
                }
            });
        } else if (TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) {
            xdl0.m208344M(this.f205345f, true);
            xdl0.m208344M(this.f205348i, true);
            xdl0.m208344M(this.f205352m, false);
            xdl0.m208335H0(this.f205347h, "");
            this.f205346g.setOnClickListener(new View.OnClickListener() { // from class: l.rx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161389a.m220746K(view);
                }
            });
        } else {
            xdl0.m208344M(this.f205345f, false);
            xdl0.m208344M(this.f205352m, false);
        }
        zvf0.m220402x("e_account_and_security_view_delete_account", "p_account_and_security_view");
        if (ura.m195053e().m195057d().mo33948xi()) {
            xdl0.m208344M(this.f205356q, false);
            xdl0.m208344M(this.f205362w, true);
            this.f205363x.setText(i0g0.m133861b0("注销后您在本账号上的所有配对、消息、特权将永久消失。注销并非退出登录", vwb.m200324f0("注销并非退出登录"), getAct().getResources().getColor(c1c0.f78249f), Typeface.DEFAULT));
            xdl0.m208329E0(this.f205364y, new View.OnClickListener() { // from class: l.sx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166769a.m220747L(view);
                }
            });
        }
        this.f205356q.setOnClickListener(new a());
        zvf0.m220402x("e_auto_renew_subscriptions_management", getAct().pageId());
        this.f205359t.setOnClickListener(new View.OnClickListener() { // from class: l.tx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172441a.m220748M(view);
            }
        });
        if (IntlCountryCodeController.m28113i()) {
            this.f205357r.setText(R$string.f27746M0);
        }
        final boolean z = TEnum.equals(user.source, "facebook") && TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia) && m220766B(user);
        boolean z2 = TEnum.equals(user.source, "google") && TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia) && m220766B(user);
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !z && !z2) {
            xdl0.m208344M(this.f205349j, false);
        } else {
            xdl0.m208329E0(this.f205346g, new View.OnClickListener() { // from class: l.hx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109810a.m220749N(view);
                }
            });
            getAct().duringCreated(CoreModule.m29932K().mo30795me().map(new w9j() { // from class: l.ix
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).settings;
                }
            }).filter(new w9j() { // from class: l.jx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Settings settings = (Settings) obj;
                    return Boolean.valueOf((settings == null || (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number))) ? false : true);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.kx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125042a.m220771O(z, (Settings) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m220766B(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return false;
        }
        return (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m220767C(View view) {
        this.f205338A.m123611t0(PasswordChangeAct.class);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205365z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m220768E(View view) {
        this.f205338A.m123610s0(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m220769F(View view) {
        this.f205338A.m123610s0(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m220770G(View view) {
        this.f205338A.m123610s0(CoreModule.m29931H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m220771O(boolean z, Settings settings) {
        xdl0.m208344M(this.f205345f, true);
        xdl0.m208360X(this.f205345f, t100.m186890d(8.0f));
        xdl0.m208325C0(this.f205346g, t100.m186890d(60.0f));
        xdl0.m208344M(this.f205349j, true);
        this.f205350k.setText(R$string.f27951w3);
        this.f205347h.setTextColor(getAct().color(c1c0.f78254k));
        if (!TextUtils.isEmpty(settings.phoneNumber.number)) {
            this.f205339B = 1;
            this.f205347h.setText(Marker.ANY_NON_NULL_MARKER + settings.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(settings.phoneNumber.number));
            this.f205351l.setText(R$string.f27957x3);
            this.f205351l.setCompoundDrawablesWithIntrinsicBounds(e3c0.f89153v, 0, 0, 0);
            this.f205351l.setTextColor(Color.parseColor("#54c6fc"));
            this.f205351l.setBackground(getAct().drawable(e3c0.f89133o0));
        } else if (!TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            this.f205339B = 2;
            this.f205347h.setText(Marker.ANY_NON_NULL_MARKER + settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(settings.linkedPhoneNumber.number));
            this.f205351l.setText(R$string.f27963y3);
            this.f205351l.setCompoundDrawablesWithIntrinsicBounds(e3c0.f89150u, 0, 0, 0);
            this.f205351l.setTextColor(getAct().getResources().getColor(c1c0.f78250g));
            this.f205351l.setBackground(getAct().drawable(e3c0.f89130n0));
        }
        if (z) {
            xdl0.m208411y(this.f205346g, false);
            xdl0.m208344M(this.f205348i, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m220772P(User user) {
        xdl0.m208411y(this.f205346g, false);
        xdl0.m208344M(this.f205348i, false);
        xdl0.m208344M(this.f205345f, true);
        String strM220776x = m220776x(user);
        if (TextUtils.isEmpty(strM220776x)) {
            return;
        }
        this.f205347h.setText(strM220776x);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m220773u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public View m220773u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15756ay.m99533b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AccountSecureAct getAct() {
        return this.f205365z;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C16954fx c16954fx) {
        this.f205338A = c16954fx;
    }

    /* JADX INFO: renamed from: x */
    public final String m220776x(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(settings.phoneNumber.number);
        Settings settings2 = user.settings;
        if (!zIsEmpty) {
            return Marker.ANY_NON_NULL_MARKER + settings2.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(user.settings.phoneNumber.number);
        }
        if (TextUtils.isEmpty(settings2.linkedPhoneNumber.number)) {
            return null;
        }
        return Marker.ANY_NON_NULL_MARKER + user.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: y */
    public void m220777y(Throwable th) {
        getAct().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: z */
    public void m220778z(User user) {
        if (this.f205344e.getVisibility() == 4) {
            this.f205344e.setVisibility(0);
            this.f205343d.setVisibility(4);
        }
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq")) {
            if (!TextUtils.isEmpty(m220776x(user))) {
                this.f205347h.setText(m220776x(user));
            }
            this.f205347h.setTextColor(getAct().color(c1c0.f78256m));
            xdl0.m208344M(this.f205345f, true);
            if ((TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) && m220766B(user) && TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
                m220772P(user);
                return;
            }
            return;
        }
        if (!NullChecker.m81304b(user.settings) || TextUtils.isEmpty(user.settings.phoneNumber.number)) {
            xdl0.m208344M(this.f205352m, false);
        } else {
            xdl0.m208344M(this.f205352m, true);
            this.f205353n.setOnClickListener(new View.OnClickListener() { // from class: l.gx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104804a.m220767C(view);
                }
            });
        }
        xdl0.m208345M0(this.f205345f, true);
        boolean zIsEmpty = TextUtils.isEmpty(user.settings.phoneNumber.number);
        VText vText = this.f205347h;
        if (zIsEmpty) {
            vText.setText(getAct().string(R$string.f27928s4));
            this.f205347h.setTextColor(Color.parseColor("#d75842"));
            boolean zIsEmpty2 = TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
            VLinear vLinear = this.f205346g;
            if (zIsEmpty2) {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.mx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f136099a.m220769F(view);
                    }
                });
                return;
            } else {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.lx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f130328a.m220768E(view);
                    }
                });
                return;
            }
        }
        vText.setTextColor(getAct().color(c1c0.f78256m));
        this.f205346g.setOnClickListener(new View.OnClickListener() { // from class: l.nx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140990a.m220770G(view);
            }
        });
        this.f205347h.setText(Marker.ANY_NON_NULL_MARKER + user.settings.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(user.settings.phoneNumber.number));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
