package p153l;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.AccountDeleteAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountInactiveAct;
import com.p051p1.mobile.putong.core.p058ui.account.AccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordChangeAct;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordVerificationAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Marker;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.tx */
/* JADX INFO: loaded from: classes9.dex */
public class C20416tx implements iam<C21908zw> {

    /* JADX INFO: renamed from: A */
    public C21908zw f176438A;

    /* JADX INFO: renamed from: B */
    public int f176439B = 0;

    /* JADX INFO: renamed from: a */
    public VLinear f176440a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f176441b;

    /* JADX INFO: renamed from: c */
    public VText f176442c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f176443d;

    /* JADX INFO: renamed from: e */
    public VScroll f176444e;

    /* JADX INFO: renamed from: f */
    public VFrame f176445f;

    /* JADX INFO: renamed from: g */
    public VLinear f176446g;

    /* JADX INFO: renamed from: h */
    public VText f176447h;

    /* JADX INFO: renamed from: i */
    public ImageView f176448i;

    /* JADX INFO: renamed from: j */
    public VLinear f176449j;

    /* JADX INFO: renamed from: k */
    public VText f176450k;

    /* JADX INFO: renamed from: l */
    public VText f176451l;

    /* JADX INFO: renamed from: m */
    public VFrame f176452m;

    /* JADX INFO: renamed from: n */
    public VLinear f176453n;

    /* JADX INFO: renamed from: o */
    public VText f176454o;

    /* JADX INFO: renamed from: p */
    public VText f176455p;

    /* JADX INFO: renamed from: q */
    public VLinear f176456q;

    /* JADX INFO: renamed from: r */
    public VText f176457r;

    /* JADX INFO: renamed from: s */
    public VFrame f176458s;

    /* JADX INFO: renamed from: t */
    public VLinear f176459t;

    /* JADX INFO: renamed from: u */
    public VFrame f176460u;

    /* JADX INFO: renamed from: v */
    public VLinear f176461v;

    /* JADX INFO: renamed from: w */
    public VLinear f176462w;

    /* JADX INFO: renamed from: x */
    public VText f176463x;

    /* JADX INFO: renamed from: y */
    public VText f176464y;

    /* JADX INFO: renamed from: z */
    public AccountSecureAct f176465z;

    /* JADX INFO: renamed from: l.tx$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public String[] f176466a;

        /* JADX INFO: renamed from: b */
        public String[] f176467b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f176468c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public a() {
            this.f176466a = new String[]{C20416tx.this.getAct().getString(R$string.f28760q0), C20416tx.this.getAct().getString(R$string.f28766r0), C20416tx.this.getAct().getString(R$string.f28772s0), C20416tx.this.getAct().getString(R$string.f28778t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m193416f() {
            C20416tx.this.f176438A.m221836m0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m193417g(int i, String str) {
            sfj0.m185596c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", sfj0.C20032a.m185615h("delete_account_reason", this.f176468c[i]));
            C20416tx.this.getAct().progress(R$string.f28619R0);
            C20416tx.this.f176438A.m221836m0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m193418h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f176467b[i];
            sfj0.m185596c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", sfj0.C20032a.m185615h("delete_account_reason", this.f176468c[i]));
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            w1e.m204402f(l4g0VarM204399c);
            C20416tx.this.getAct().dialog().m21502E0(R$string.f28790v0).m21499D(R$string.f28796w0).m21540k0(R$string.f28663a).m21555t0(R$string.f28717j, new Runnable() { // from class: l.rx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165260a.m193417g(i, str);
                }
            }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.sx
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            }).m21567z0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntlCountryCodeController.m29112i()) {
                C20416tx.this.f176438A.m221841s0(AccountDeleteAct.m45283Z1(C20416tx.this.getAct()));
                return;
            }
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            w1e.m204402f(l4g0VarM204399c);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || !CoreModule.f18273l.m143405a().mo34492e2() || CoreModule.f18264c.f20312H0.m155435Y4() > 0 || (CoreModule.m30930K().mo31838xf() && CoreModule.f18264c.f20315I0.m144054K3() > 0)) {
                C21356xk.INSTANCE.m211278f(true, C20416tx.this.getAct(), new Function0() { // from class: l.ox
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f149588a.m193416f();
                    }
                });
            } else {
                C20416tx.this.getAct().dialog().m21502E0(R$string.f28784u0).m21535f0(this.f176466a).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.px
                    @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                    /* JADX INFO: renamed from: a */
                    public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f154458a.m193418h(dialog, view2, i, charSequence);
                    }
                }).m21540k0(R$string.f28663a).m21525V(new DialogInterface.OnDismissListener() { // from class: l.qx
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        w1e.m204401e(l4g0VarM204399c);
                    }
                }).m21567z0();
            }
        }
    }

    public C20416tx(AccountSecureAct accountSecureAct) {
        this.f176465z = accountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m193375H(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m193376I(View view) {
        this.f176438A.m221842t0(PasswordVerificationAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m193377J(View view) {
        this.f176438A.m221842t0(PasswordChangeAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m193378K(View view) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na()) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116593na().settings) && TextUtils.isEmpty(CoreModule.f18264c.f20381e0.m116593na().settings.linkedPhoneNumber.number) && TextUtils.isEmpty(CoreModule.f18264c.f20381e0.m116593na().settings.phoneNumber.number)) {
            getAct().startActivity(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else {
            getAct().startActivity(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m193379L(View view) {
        i4g0.m138520r("e_account_and_security_view_delete_account", "p_account_and_security_view");
        this.f176438A.m221841s0(AccountInactiveAct.m45284Z1(getAct(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m193380M(View view) {
        i4g0.m138520r("e_auto_renew_subscriptions_management", getAct().pageId());
        this.f176438A.m221842t0(CoreModule.m30930K().getSubscriptionsActClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m193381N(View view) {
        int i = this.f176439B;
        if (i == 0) {
            this.f176438A.m221841s0(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
        } else if (i == 1) {
            getAct().startActivity(new Intent(getAct(), (Class<?>) PasswordVerificationAct.class));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m193397A(User user) {
        this.f176441b.setTitle(getAct().getString(R$string.f28751o3));
        this.f176441b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ix
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117304a.m193375H(view);
            }
        });
        this.f176454o.setText(getAct().getString(R$string.f28787u3));
        bnl0.m105524M(this.f176458s, false);
        if (!TEnum.equals(user.source, "facebook") && !TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !TEnum.equals(user.source, "google")) {
            boolean zEquals = TEnum.equals(user.source, "china-mobile");
            VFrame vFrame = this.f176445f;
            if (zEquals) {
                bnl0.m105524M(vFrame, false);
            } else {
                bnl0.m105524M(vFrame, true);
                this.f176446g.setOnClickListener(new View.OnClickListener() { // from class: l.jx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f122978a.m193376I(view);
                    }
                });
            }
            this.f176453n.setOnClickListener(new View.OnClickListener() { // from class: l.kx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129158a.m193377J(view);
                }
            });
        } else if (TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) {
            bnl0.m105524M(this.f176445f, true);
            bnl0.m105524M(this.f176448i, true);
            bnl0.m105524M(this.f176452m, false);
            bnl0.m105515H0(this.f176447h, "");
            this.f176446g.setOnClickListener(new View.OnClickListener() { // from class: l.lx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133875a.m193378K(view);
                }
            });
        } else {
            bnl0.m105524M(this.f176445f, false);
            bnl0.m105524M(this.f176452m, false);
        }
        i4g0.m138526x("e_account_and_security_view_delete_account", "p_account_and_security_view");
        if (gta.m132210e().m132214d().mo34951xi()) {
            bnl0.m105524M(this.f176456q, false);
            bnl0.m105524M(this.f176462w, true);
            this.f176463x.setText(q8g0.m175796b0("注销后您在本账号上的所有配对、消息、特权将永久消失。注销并非退出登录", jyb.m147507f0("注销并非退出登录"), getAct().getResources().getColor(j9c0.f118869f), Typeface.DEFAULT));
            bnl0.m105509E0(this.f176464y, new View.OnClickListener() { // from class: l.mx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139170a.m193379L(view);
                }
            });
        }
        this.f176456q.setOnClickListener(new a());
        i4g0.m138526x("e_auto_renew_subscriptions_management", getAct().pageId());
        this.f176459t.setOnClickListener(new View.OnClickListener() { // from class: l.nx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144057a.m193380M(view);
            }
        });
        if (IntlCountryCodeController.m29112i()) {
            this.f176457r.setText(R$string.f28594M0);
        }
        final boolean z = TEnum.equals(user.source, "facebook") && TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia) && m193398B(user);
        boolean z2 = TEnum.equals(user.source, "google") && TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia) && m193398B(user);
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq") && !z && !z2) {
            bnl0.m105524M(this.f176449j, false);
        } else {
            bnl0.m105509E0(this.f176446g, new View.OnClickListener() { // from class: l.bx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78802a.m193381N(view);
                }
            });
            getAct().duringCreated(CoreModule.m30930K().mo31798me().map(new qcj() { // from class: l.cx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).settings;
                }
            }).filter(new qcj() { // from class: l.dx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Settings settings = (Settings) obj;
                    return Boolean.valueOf((settings == null || (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(settings.linkedPhoneNumber.number))) ? false : true);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.ex
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96224a.m193403O(z, (Settings) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m193398B(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return false;
        }
        return (TextUtils.isEmpty(settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m193399C(View view) {
        this.f176438A.m221842t0(PasswordChangeAct.class);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176465z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m193400E(View view) {
        this.f176438A.m221841s0(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m193401F(View view) {
        this.f176438A.m221841s0(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.bind_mobile)));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m193402G(View view) {
        this.f176438A.m221841s0(CoreModule.m30929H().phoneVerificationActArgs(getAct(), VerifyReason.get(VerifyReason.change_phone)));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m193403O(boolean z, Settings settings) {
        bnl0.m105524M(this.f176445f, true);
        bnl0.m105540X(this.f176445f, qa00.m175859d(8.0f));
        bnl0.m105505C0(this.f176446g, qa00.m175859d(60.0f));
        bnl0.m105524M(this.f176449j, true);
        this.f176450k.setText(R$string.f28799w3);
        this.f176447h.setTextColor(getAct().color(j9c0.f118874k));
        if (!TextUtils.isEmpty(settings.phoneNumber.number)) {
            this.f176439B = 1;
            this.f176447h.setText(Marker.ANY_NON_NULL_MARKER + settings.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(settings.phoneNumber.number));
            this.f176451l.setText(R$string.f28805x3);
            this.f176451l.setCompoundDrawablesWithIntrinsicBounds(kbc0.f124916v, 0, 0, 0);
            this.f176451l.setTextColor(Color.parseColor("#54c6fc"));
            this.f176451l.setBackground(getAct().drawable(kbc0.f124896o0));
        } else if (!TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            this.f176439B = 2;
            this.f176447h.setText(Marker.ANY_NON_NULL_MARKER + settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(settings.linkedPhoneNumber.number));
            this.f176451l.setText(R$string.f28811y3);
            this.f176451l.setCompoundDrawablesWithIntrinsicBounds(kbc0.f124913u, 0, 0, 0);
            this.f176451l.setTextColor(getAct().getResources().getColor(j9c0.f118870g));
            this.f176451l.setBackground(getAct().drawable(kbc0.f124893n0));
        }
        if (z) {
            bnl0.m105591y(this.f176446g, false);
            bnl0.m105524M(this.f176448i, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m193404P(User user) {
        bnl0.m105591y(this.f176446g, false);
        bnl0.m105524M(this.f176448i, false);
        bnl0.m105524M(this.f176445f, true);
        String strM193408x = m193408x(user);
        if (TextUtils.isEmpty(strM193408x)) {
            return;
        }
        this.f176447h.setText(strM193408x);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m193405u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public View m193405u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20688ux.m198397b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AccountSecureAct getAct() {
        return this.f176465z;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C21908zw c21908zw) {
        this.f176438A = c21908zw;
    }

    /* JADX INFO: renamed from: x */
    public final String m193408x(User user) {
        Settings settings = user.settings;
        if (settings == null) {
            return null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(settings.phoneNumber.number);
        Settings settings2 = user.settings;
        if (!zIsEmpty) {
            return Marker.ANY_NON_NULL_MARKER + settings2.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(user.settings.phoneNumber.number);
        }
        if (TextUtils.isEmpty(settings2.linkedPhoneNumber.number)) {
            return null;
        }
        return Marker.ANY_NON_NULL_MARKER + user.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(user.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: y */
    public void m193409y(Throwable th) {
        getAct().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: z */
    public void m193410z(User user) {
        if (this.f176444e.getVisibility() == 4) {
            this.f176444e.setVisibility(0);
            this.f176443d.setVisibility(4);
        }
        if (!TEnum.equals(user.source, "wechat") && !TEnum.equals(user.source, "qq")) {
            if (!TextUtils.isEmpty(m193408x(user))) {
                this.f176447h.setText(m193408x(user));
            }
            this.f176447h.setTextColor(getAct().color(j9c0.f118876m));
            bnl0.m105524M(this.f176445f, true);
            if ((TEnum.equals(user.source, "facebook") || TEnum.equals(user.source, "google")) && m193398B(user) && TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
                m193404P(user);
                return;
            }
            return;
        }
        if (!NullChecker.m82487b(user.settings) || TextUtils.isEmpty(user.settings.phoneNumber.number)) {
            bnl0.m105524M(this.f176452m, false);
        } else {
            bnl0.m105524M(this.f176452m, true);
            this.f176453n.setOnClickListener(new View.OnClickListener() { // from class: l.ax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73806a.m193399C(view);
                }
            });
        }
        bnl0.m105525M0(this.f176445f, true);
        boolean zIsEmpty = TextUtils.isEmpty(user.settings.phoneNumber.number);
        VText vText = this.f176447h;
        if (zIsEmpty) {
            vText.setText(getAct().string(R$string.f28776s4));
            this.f176447h.setTextColor(Color.parseColor("#d75842"));
            boolean zIsEmpty2 = TextUtils.isEmpty(user.settings.linkedPhoneNumber.number);
            VLinear vLinear = this.f176446g;
            if (zIsEmpty2) {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.gx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f106877a.m193401F(view);
                    }
                });
                return;
            } else {
                vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.fx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f101229a.m193400E(view);
                    }
                });
                return;
            }
        }
        vText.setTextColor(getAct().color(j9c0.f118876m));
        this.f176446g.setOnClickListener(new View.OnClickListener() { // from class: l.hx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111959a.m193402G(view);
            }
        });
        this.f176447h.setText(Marker.ANY_NON_NULL_MARKER + user.settings.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(user.settings.phoneNumber.number));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
