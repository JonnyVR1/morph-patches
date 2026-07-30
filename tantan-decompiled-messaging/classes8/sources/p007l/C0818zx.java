package p007l;

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
import com.p003p1.mobile.android.app.Dialog;
import com.p003p1.mobile.putong.core.p006ui.account.AccountDeleteAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountInactiveAct;
import com.p003p1.mobile.putong.core.p006ui.account.AccountSecureAct;
import com.p003p1.mobile.putong.core.p006ui.account.PasswordChangeAct;
import com.p003p1.mobile.putong.core.p006ui.account.PasswordVerificationAct;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.ay;
import l.c1c0;
import l.cwf0;
import l.e30;
import l.e3c0;
import l.i0e;
import l.i0g0;
import l.o6j0;
import l.qib0;
import l.qy;
import l.t100;
import l.u4e;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VScroll;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.zx */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0818zx implements s7m<C0549fx> {

    /* JADX INFO: renamed from: A */
    public C0549fx f5575A;

    /* JADX INFO: renamed from: B */
    public int f5576B = 0;

    /* JADX INFO: renamed from: a */
    public VLinear f5577a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f5578b;

    /* JADX INFO: renamed from: c */
    public VText f5579c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f5580d;

    /* JADX INFO: renamed from: e */
    public VScroll f5581e;

    /* JADX INFO: renamed from: f */
    public VFrame f5582f;

    /* JADX INFO: renamed from: g */
    public VLinear f5583g;

    /* JADX INFO: renamed from: h */
    public VText f5584h;

    /* JADX INFO: renamed from: i */
    public ImageView f5585i;

    /* JADX INFO: renamed from: j */
    public VLinear f5586j;

    /* JADX INFO: renamed from: k */
    public VText f5587k;

    /* JADX INFO: renamed from: l */
    public VText f5588l;

    /* JADX INFO: renamed from: m */
    public VFrame f5589m;

    /* JADX INFO: renamed from: n */
    public VLinear f5590n;

    /* JADX INFO: renamed from: o */
    public VText f5591o;

    /* JADX INFO: renamed from: p */
    public VText f5592p;

    /* JADX INFO: renamed from: q */
    public VLinear f5593q;

    /* JADX INFO: renamed from: r */
    public VText f5594r;

    /* JADX INFO: renamed from: s */
    public VFrame f5595s;

    /* JADX INFO: renamed from: t */
    public VLinear f5596t;

    /* JADX INFO: renamed from: u */
    public VFrame f5597u;

    /* JADX INFO: renamed from: v */
    public VLinear f5598v;

    /* JADX INFO: renamed from: w */
    public VLinear f5599w;

    /* JADX INFO: renamed from: x */
    public VText f5600x;

    /* JADX INFO: renamed from: y */
    public VText f5601y;

    /* JADX INFO: renamed from: z */
    public AccountSecureAct f5602z;

    /* JADX INFO: renamed from: l.zx$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public String[] f5603a;

        /* JADX INFO: renamed from: b */
        public String[] f5604b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f5605c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public a() {
            this.f5603a = new String[]{C0818zx.this.act().getString(R.string.q0), C0818zx.this.act().getString(R.string.r0), C0818zx.this.act().getString(R.string.s0), C0818zx.this.act().getString(R.string.t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m12123f() {
            C0818zx.this.f5575A.m9182m0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m12124g(int i, String str) {
            o6j0.c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", new o6j0.a[]{o6j0.a.h("delete_account_reason", this.f5605c[i])});
            C0818zx.this.act().progress(R.string.R0);
            C0818zx.this.f5575A.m9182m0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m12125h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f5604b[i];
            o6j0.c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", new o6j0.a[]{o6j0.a.h("delete_account_reason", this.f5605c[i])});
            final cwf0 cwf0VarC = i0e.c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            cwf0VarC.o(u4e.b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            i0e.f(cwf0VarC);
            C0818zx.this.act().dialog().m774E0(R.string.v0).m771D(R.string.w0).m812k0(R.string.a).m827t0(R.string.j, new Runnable() { // from class: l.xx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5365a.m12124g(i, str);
                }
            }).m797V(new DialogInterface.OnDismissListener() { // from class: l.yx
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.e(cwf0VarC);
                }
            }).m839z0();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntlCountryCodeController.i()) {
                C0818zx.this.f5575A.m9187s0(AccountDeleteAct.m8436Y1(C0818zx.this.act()));
                return;
            }
            final cwf0 cwf0VarC = i0e.c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            cwf0VarC.o(u4e.b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            i0e.f(cwf0VarC);
            if (CoreModule.c.e0.p9().isVIP() || !CoreModule.l.a().e2() || CoreModule.c.H0.Y4() > 0 || (CoreModule.K().xf() && CoreModule.c.I0.K3() > 0)) {
                C0517cl.INSTANCE.m8790f(true, C0818zx.this.act(), new Function0() { // from class: l.ux
                    public final Object invoke() {
                        return this.f4940a.m12123f();
                    }
                });
            } else {
                C0818zx.this.act().dialog().m774E0(R.string.u0).m807f0(this.f5603a).m808g0(new Dialog.InterfaceC0223g() { // from class: l.vx
                    @Override // com.p003p1.mobile.android.app.Dialog.InterfaceC0223g
                    /* JADX INFO: renamed from: a */
                    public final void mo840a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f4995a.m12125h(dialog, view2, i, charSequence);
                    }
                }).m812k0(R.string.a).m797V(new DialogInterface.OnDismissListener() { // from class: l.wx
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.e(cwf0VarC);
                    }
                }).m839z0();
            }
        }
    }

    public C0818zx(AccountSecureAct accountSecureAct) {
        this.f5602z = accountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m12082H(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m12083I(View view) {
        this.f5575A.m9188t0(PasswordVerificationAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m12084J(View view) {
        this.f5575A.m9188t0(PasswordChangeAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m12085K(View view) {
        if (NullChecker.a(CoreModule.c.e0.na()) && NullChecker.a(CoreModule.c.e0.na().settings) && TextUtils.isEmpty(CoreModule.c.e0.na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.c.e0.na().settings.phoneNumber.number)) {
            act().startActivity(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("bind_mobile")));
        } else {
            act().startActivity(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("change-phone")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m12086L(View view) {
        zvf0.r("e_account_and_security_view_delete_account", "p_account_and_security_view");
        this.f5575A.m9187s0(AccountInactiveAct.m8439Y1(act(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m12087M(View view) {
        zvf0.r("e_auto_renew_subscriptions_management", act().pageId());
        this.f5575A.m9188t0(CoreModule.K().getSubscriptionsActClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m12088N(View view) {
        int i = this.f5576B;
        if (i == 0) {
            this.f5575A.m9187s0(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("bind_mobile")));
        } else if (i == 1) {
            act().startActivity(new Intent((Context) act(), (Class<?>) PasswordVerificationAct.class));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m12104A(User user) {
        this.f5578b.setTitle(act().getString(R.string.o3));
        this.f5578b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3582a.m12082H(view);
            }
        });
        this.f5591o.setText(act().getString(R.string.u3));
        xdl0.M(this.f5595s, false);
        if (!TEnum.equals(user.source, "facebook") && !TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !TEnum.equals(user.source, "google")) {
            boolean zEquals = TEnum.equals(user.source, "china-mobile");
            VFrame vFrame = this.f5582f;
            if (zEquals) {
                xdl0.M(vFrame, false);
            } else {
                xdl0.M(vFrame, true);
                this.f5583g.setOnClickListener(new View.OnClickListener() { // from class: l.px
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3804a.m12083I(view);
                    }
                });
            }
            this.f5590n.setOnClickListener(new View.OnClickListener() { // from class: l.qx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3985a.m12084J(view);
                }
            });
        } else if (TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) {
            xdl0.M(this.f5582f, true);
            xdl0.M(this.f5585i, true);
            xdl0.M(this.f5589m, false);
            xdl0.H0(this.f5584h, "");
            this.f5583g.setOnClickListener(new View.OnClickListener() { // from class: l.rx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4096a.m12085K(view);
                }
            });
        } else {
            xdl0.M(this.f5582f, false);
            xdl0.M(this.f5589m, false);
        }
        zvf0.x("e_account_and_security_view_delete_account", "p_account_and_security_view");
        if (ura.e().d().xi()) {
            xdl0.M(this.f5593q, false);
            xdl0.M(this.f5599w, true);
            this.f5600x.setText(i0g0.b0("注销后您在本账号上的所有配对、消息、特权将永久消失。注销并非退出登录", vwb.f0(new String[]{"注销并非退出登录"}), act().getResources().getColor(c1c0.f), Typeface.DEFAULT));
            xdl0.E0(this.f5601y, new View.OnClickListener() { // from class: l.sx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4192a.m12086L(view);
                }
            });
        }
        this.f5593q.setOnClickListener(new a());
        zvf0.x("e_auto_renew_subscriptions_management", act().pageId());
        this.f5596t.setOnClickListener(new View.OnClickListener() { // from class: l.tx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4448a.m12087M(view);
            }
        });
        if (IntlCountryCodeController.i()) {
            this.f5594r.setText(R.string.M0);
        }
        final boolean z = TEnum.equals(user.source, "facebook") && TEnum.equals(qib0.h0, "indonesia") && m12105B(user);
        boolean z2 = TEnum.equals(user.source, "google") && TEnum.equals(qib0.h0, "indonesia") && m12105B(user);
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !z && !z2) {
            xdl0.M(this.f5586j, false);
        } else {
            xdl0.E0(this.f5583g, new View.OnClickListener() { // from class: l.hx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2859a.m12088N(view);
                }
            });
            act().duringCreated(CoreModule.K().me().map(new w9j() { // from class: l.ix
                public final Object call(Object obj) {
                    return ((User) obj).settings;
                }
            }).filter(new w9j() { // from class: l.jx
                public final Object call(Object obj) {
                    Settings settings = (Settings) obj;
                    return Boolean.valueOf((settings == null || (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number))) ? false : true);
                }
            })).subscribe(mkd0.m9874G(new e30() { // from class: l.kx
                public final void call(Object obj) {
                    this.f3196a.m12110O(z, (Settings) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12105B(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return false;
        }
        return (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m12106C(View view) {
        this.f5575A.m9188t0(PasswordChangeAct.class);
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f5602z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m12107E(View view) {
        this.f5575A.m9187s0(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("change-phone")));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m12108F(View view) {
        this.f5575A.m9187s0(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("bind_mobile")));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m12109G(View view) {
        this.f5575A.m9187s0(CoreModule.H().phoneVerificationActArgs(act(), VerifyReason.get("change-phone")));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m12110O(boolean z, Settings settings) {
        xdl0.M(this.f5582f, true);
        xdl0.X(this.f5582f, t100.d(8.0f));
        xdl0.C0(this.f5583g, t100.d(60.0f));
        xdl0.M(this.f5586j, true);
        this.f5587k.setText(R.string.w3);
        this.f5584h.setTextColor(act().color(c1c0.k));
        if (!TextUtils.isEmpty(settings.phoneNumber.number)) {
            this.f5576B = 1;
            this.f5584h.setText("+" + settings.phoneNumber.countryCode + " " + qy.a(settings.phoneNumber.number));
            this.f5588l.setText(R.string.x3);
            this.f5588l.setCompoundDrawablesWithIntrinsicBounds(e3c0.v, 0, 0, 0);
            this.f5588l.setTextColor(Color.parseColor("#54c6fc"));
            this.f5588l.setBackground(act().drawable(e3c0.o0));
        } else if (!TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            this.f5576B = 2;
            this.f5584h.setText("+" + settings.linkedPhoneNumber.countryCode + " " + qy.a(settings.linkedPhoneNumber.number));
            this.f5588l.setText(R.string.y3);
            this.f5588l.setCompoundDrawablesWithIntrinsicBounds(e3c0.u, 0, 0, 0);
            this.f5588l.setTextColor(act().getResources().getColor(c1c0.g));
            this.f5588l.setBackground(act().drawable(e3c0.n0));
        }
        if (z) {
            xdl0.y(this.f5583g, false);
            xdl0.M(this.f5585i, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m12111P(User user) {
        xdl0.y(this.f5583g, false);
        xdl0.M(this.f5585i, false);
        xdl0.M(this.f5582f, true);
        String strM12115x = m12115x(user);
        if (TextUtils.isEmpty(strM12115x)) {
            return;
        }
        this.f5584h.setText(strM12115x);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12112u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public View m12112u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ay.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AccountSecureAct act() {
        return this.f5602z;
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0549fx c0549fx) {
        this.f5575A = c0549fx;
    }

    /* JADX INFO: renamed from: x */
    public final String m12115x(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(settings.phoneNumber.number);
        Settings settings2 = user.settings;
        if (!zIsEmpty) {
            return "+" + settings2.phoneNumber.countryCode + " " + qy.a(user.settings.phoneNumber.number);
        }
        if (TextUtils.isEmpty(settings2.linkedPhoneNumber.number)) {
            return null;
        }
        return "+" + user.settings.linkedPhoneNumber.countryCode + " " + qy.a(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: y */
    public void m12116y(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: z */
    public void m12117z(User user) {
        if (this.f5581e.getVisibility() == 4) {
            this.f5581e.setVisibility(0);
            this.f5580d.setVisibility(4);
        }
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq")) {
            if (!TextUtils.isEmpty(m12115x(user))) {
                this.f5584h.setText(m12115x(user));
            }
            this.f5584h.setTextColor(act().color(c1c0.m));
            xdl0.M(this.f5582f, true);
            if ((TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) && m12105B(user) && TEnum.equals(qib0.h0, "indonesia")) {
                m12111P(user);
                return;
            }
            return;
        }
        if (!NullChecker.b(user.settings) || TextUtils.isEmpty(user.settings.phoneNumber.number)) {
            xdl0.M(this.f5589m, false);
        } else {
            xdl0.M(this.f5589m, true);
            this.f5590n.setOnClickListener(new View.OnClickListener() { // from class: l.gx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2798a.m12106C(view);
                }
            });
        }
        xdl0.M0(this.f5582f, true);
        boolean zIsEmpty = TextUtils.isEmpty(user.settings.phoneNumber.number);
        VText vText = this.f5584h;
        if (zIsEmpty) {
            vText.setText(act().string(R.string.s4));
            this.f5584h.setTextColor(Color.parseColor("#d75842"));
            boolean zIsEmpty2 = TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
            VLinear vLinear = this.f5583g;
            if (zIsEmpty2) {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.mx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3336a.m12108F(view);
                    }
                });
                return;
            } else {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.lx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3273a.m12107E(view);
                    }
                });
                return;
            }
        }
        vText.setTextColor(act().color(c1c0.m));
        this.f5583g.setOnClickListener(new View.OnClickListener() { // from class: l.nx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3473a.m12109G(view);
            }
        });
        this.f5584h.setText("+" + user.settings.phoneNumber.countryCode + " " + qy.a(user.settings.phoneNumber.number));
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
