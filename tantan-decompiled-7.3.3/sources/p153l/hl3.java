package p153l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.dlg.SVipSeeRecoverDlg;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipItemDetailPage;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersDialogView;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p151v.VButton;
import p151v.VRangeSlider;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public final class hl3 extends g6e {

    /* JADX INFO: renamed from: g */
    public static boolean f110476g = false;

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m135659B(boolean z, Runnable runnable) {
        if (z) {
            i4g0.m138520r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m135660C(Settings settings, Settings settings2, l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(settings) && CoreModule.m30929H().signedIn_()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.minAge = settings.getSearchMinAge();
            settingGroups.search.maxAge = settings.getSearchMaxAge();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(settings2.getSettingGroup());
            if (NullChecker.m82486a(settingGroupsSubtract)) {
                CoreModule.f18264c.f20405m0.m32124k8(settingGroupsSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.uk3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        hl3.m135686v((uxj0) obj);
                    }
                }, new y20() { // from class: l.vk3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bsj0.m106246D((Throwable) obj);
                    }
                }));
            }
        }
        l4g0Var.m152772g();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m135661D(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400121) {
            o1j0.m165636j("无效二维码");
        } else {
            o1j0.m165636j("登录失败,请稍后再试");
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m135663F(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m135664G(Act act, final boolean z, String str, String str2, boolean z2, final Runnable runnable, final Runnable runnable2) {
        String string;
        if (z) {
            o5h0.m166146s(act, str, str2, runnable, runnable2);
            return;
        }
        final l4g0 l4g0VarM204399c = null;
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(kec0.f126107ve, (ViewGroup) null);
        GradientBgButton gradientBgButton = (GradientBgButton) viewGroup.findViewById(adc0.f70279c2);
        GradientBgButton gradientBgButton2 = (GradientBgButton) viewGroup.findViewById(adc0.f70421k9);
        String string2 = act.getString(z ? R$string.f19781wp : R$string.f18653Lq, str);
        if (z) {
            string = act.getString(z2 ? R$string.f19750vp : R$string.f19719up, str2);
        } else {
            string = act.getString(R$string.f18622Kq, str2);
        }
        CharSequence charSequenceM175796b0 = string;
        String strString = act.string(z ? R$string.f19755w : R$string.f19786x);
        if (!z) {
            gradientBgButton2.setIcon(act.drawable(dbc0.f87101iv));
            gradientBgButton2.setButtonColorEnd(act.color(c9c0.f80399a2));
            gradientBgButton2.setButtonColorStart(act.color(c9c0.f80403b2));
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(charSequenceM175796b0.toString().split(SignParameters.NEW_LINE)[1]);
            charSequenceM175796b0 = q8g0.m175796b0(charSequenceM175796b0.toString(), arrayList, Color.parseColor("#4a4a4a"), lyh0.m156283c(3));
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("firstSuperLikeOrUndo exception:" + e.getMessage(), e));
        }
        gradientBgButton.setCenterText(BaseSei.f14624X + str2);
        if (z) {
            l4g0VarM204399c = w1e.m204399c("p_superlike_first_use_view", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        }
        Dialog dialogM21566z = act.dialog().m21531b0(viewGroup).m21564y(true).m21558v().m21506G0(string2.toString()).m21503F(charSequenceM175796b0).m21559v0(strString, new Runnable() { // from class: l.kk3
            @Override // java.lang.Runnable
            public final void run() {
                hl3.m135659B(z, runnable);
            }
        }).m21543n0(act.getResources().getString(R$string.f19138c), new Runnable() { // from class: l.lk3
            @Override // java.lang.Runnable
            public final void run() {
                hl3.m135663F(runnable2);
            }
        }).m21495B(true).m21493A(new DialogInterface.OnCancelListener() { // from class: l.mk3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                hl3.m135677m(runnable2, dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.nk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hl3.m135672h(z, l4g0VarM204399c, dialogInterface);
            }
        }).m21566z();
        if (z) {
            w1e.m204402f(l4g0VarM204399c);
        }
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m135665H(final Act act, int i, List<String> list) {
        rbb0.m180753z(i);
        rbb0.m180752y(list);
        final Dialog dialogM21566z = act.dialog().m21515L(agc0.f71128n).m21516M(kec0.f125805e0).m21495B(false).m21566z();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_no_match_svip", dialogM21566z.getClass().getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_no_match_svip.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        LikersDialogView likersDialogView = (LikersDialogView) dialogM21566z.m21457P();
        likersDialogView.m57756c(list);
        likersDialogView.f38134n.setOnClickListener(new View.OnClickListener() { // from class: l.qk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hl3.m135679o(dialogM21566z, act, view);
            }
        });
        likersDialogView.f38135o.setOnClickListener(new View.OnClickListener() { // from class: l.rk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM21566z.dismiss();
            }
        });
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: I */
    public static void m135666I(final Act act, int i, List<String> list) {
        rbb0.m180753z(i);
        rbb0.m180752y(list);
        final Dialog dialogM21566z = act.dialog().m21556u().m21516M(kec0.f126159yf).m21495B(false).m21566z();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_no_match_see_purchase_guide_view", dialogM21566z.getClass().getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.see_guide.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        ((VipItemDetailPage) dialogM21566z.m21457P()).m57456g(act, j690.m143623o(Privilege.see_not_match_guide), PurchaseType.TYPE_GET_LIKERS, new x20() { // from class: l.al3
            @Override // p153l.x20
            public final void call() {
                hl3.m135689y(dialogM21566z, act);
            }
        }, new x20() { // from class: l.bl3
            @Override // p153l.x20
            public final void call() {
                dialogM21566z.dismiss();
            }
        });
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cl3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: J */
    public static void m135667J(final Act act, int i, CoreLikers.C4870a c4870a) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_offline_popup", Dialog.class.getName());
        JSONObject jSONObjectM181657U = pk50.m172568j().m172574f().m181657U(OmsDialog.p_offline_popup.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide"));
        try {
            jSONObjectM181657U.put("pop_type", BannerLoc.popup);
        } catch (JSONException unused) {
        }
        l4g0VarM204399c.m152780o(jSONObjectM181657U);
        final Dialog dialogM21567z0 = act.dialog().m21516M(kec0.f125805e0).m21515L(agc0.f71128n).m21567z0();
        LikersDialogView likersDialogView = (LikersDialogView) dialogM21567z0.m21457P();
        likersDialogView.m57755b(i, c4870a);
        likersDialogView.f38134n.setOnClickListener(new View.OnClickListener() { // from class: l.ik3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hl3.m135675k(dialogM21567z0, act, view);
            }
        });
        likersDialogView.f38135o.setOnClickListener(new View.OnClickListener() { // from class: l.tk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM21567z0.dismiss();
            }
        });
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: K */
    public static void m135668K(final Act act, final Settings settings) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_match_timeout_popup", Dialog.class.getName());
        final pej0 pej0Var = new pej0(act);
        pej0Var.setContentView(kec0.f126067t8);
        View viewMo303g = pej0Var.getDelegate().mo303g(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo303g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo303g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        pej0Var.getWindow().setDimAmount(0.3f);
        ((VText) pej0Var.findViewById(adc0.f70409je)).setTypeface(lyh0.m156283c(3), 1);
        ((VButton) pej0Var.findViewById(adc0.f70679zc)).setTypeface(lyh0.m156283c(3), 1);
        VRangeSlider vRangeSlider = (VRangeSlider) pej0Var.findViewById(adc0.f70441lc);
        final TextView textView = (TextView) pej0Var.findViewById(adc0.f69821B);
        final Settings settingsMo225055clone = settings.mo225055clone();
        Runnable runnable = new Runnable() { // from class: l.el3
            @Override // java.lang.Runnable
            public final void run() {
                hl3.m135683s(textView, settingsMo225055clone);
            }
        };
        runnable.run();
        float fIntValue = settingsMo225055clone.getSearchAgeAllowedMinimum().intValue();
        float fIntValue2 = settingsMo225055clone.getSearchAgeAllowedMaximum().intValue();
        if (fIntValue <= 0.0f) {
            fIntValue = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue2 <= 0.0f) {
            fIntValue2 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        vRangeSlider.setValueFrom(fIntValue);
        vRangeSlider.setValueTo(fIntValue2);
        float fIntValue3 = settingsMo225055clone.getSearchMinAge().intValue();
        float fIntValue4 = settingsMo225055clone.getSearchMaxAge().intValue();
        if (fIntValue3 <= 0.0f) {
            fIntValue3 = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue4 <= 0.0f) {
            fIntValue4 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        if (settingsMo225055clone.getSearchAgeAllowedMinimum().intValue() > fIntValue3) {
            fIntValue3 = settingsMo225055clone.getSearchAgeAllowedMinimum().intValue();
        }
        vRangeSlider.setValues(Float.valueOf(fIntValue3), Float.valueOf(fIntValue4));
        f110476g = false;
        vRangeSlider.mo224211f(new C17492a(settingsMo225055clone, runnable));
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fl3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hl3.m135660C(settingsMo225055clone, settings, l4g0VarM204399c, dialogInterface);
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.gl3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                l4g0VarM204399c.m152783r();
            }
        });
        pej0Var.findViewById(adc0.f70679zc).setOnClickListener(new View.OnClickListener() { // from class: l.jk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hl3.m135676l(act, pej0Var, settingsMo225055clone, view);
            }
        });
        pej0Var.show();
    }

    /* JADX INFO: renamed from: L */
    public static void m135669L(Act act, int i) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_see_popup_expired_svip", Dialog.class.getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_offline_popup.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        final Dialog dialogM21567z0 = act.dialog().m21516M(kec0.f126139xc).m21515L(agc0.f71128n).m21495B(false).m21567z0();
        ((SVipSeeRecoverDlg) dialogM21567z0.m21457P()).m46372d(act, i, new x20() { // from class: l.dl3
            @Override // p153l.x20
            public final void call() {
                hl3.m135674j(dialogM21567z0, l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: M */
    public static void m135670M(final Act act) {
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125737a0, (ViewGroup) null);
        final jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146021P(false).m146020O();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_vip_expired", jl80VarM146020O.getClass().getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_vip_expired.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        viewInflate.findViewById(adc0.f70030N4).setOnClickListener(new View.OnClickListener() { // from class: l.wk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hl3.m135682r(jl80VarM146020O, act, view);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        viewInflate.findViewById(adc0.f70584u2).setOnClickListener(new View.OnClickListener() { // from class: l.yk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146020O.dismiss();
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: N */
    public static void m135671N(Act act, final String str) {
        act.dialog().m21542m0(act.string(R$string.f18838S1)).m21559v0(act.string(R$string.f18614Ki), new Runnable() { // from class: l.zk3
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20381e0.m116507Qa(str).subscribe(psd0.m173597H(new y20() { // from class: l.ok3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o1j0.m165651y("登录成功");
                    }
                }, new y20() { // from class: l.pk3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        hl3.m135661D((Throwable) obj);
                    }
                }));
            }
        }).m21503F("确认是否要登录网页版探探").m21566z().show();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m135672h(boolean z, l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (z) {
            w1e.m204401e(l4g0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m135674j(Dialog dialog, l4g0 l4g0Var) {
        dialog.dismiss();
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m135675k(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.m30933P().m143405a().mo34404Rm(act, "p_popup_see,default");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m135676l(Act act, pej0 pej0Var, Settings settings, View view) {
        OnlineMatchManager.m51326z().m51366o0(act, false);
        pej0Var.m176562T();
        if (NullChecker.m82486a(Act.foreground_()) && NullChecker.m82486a(Act.foreground_().f16062a.get()) && !(Act.foreground_().f16062a.get() instanceof DropDownAct)) {
            if (Act.foreground_().f16062a.get() instanceof QuickChatLoftAct) {
                r3c0.m179591m(act, "text_quick_chat");
            } else if (!(Act.foreground_().f16062a.get() instanceof QuickChatSearchingAct)) {
                act.startActivity(NewMainAct.m40761q7(act));
            }
        }
        o1j0.m165651y("闪聊匹配搜索中，合拍的人正在赶来...");
        i4g0.m138523u("e_quickchat_match_timeout_popup_start", "p_quickchat_match_timeout_popup", pf60.m172085a("is_move", Boolean.valueOf(f110476g)), pf60.m172085a("age_range", String.format("(%s,%s)", settings.getSearchMinAge(), settings.getSearchMaxAge())));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m135677m(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m135679o(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.m30933P().m143405a().mo34625wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m135682r(jl80 jl80Var, Act act, View view) {
        jl80Var.dismiss();
        C8927c.m54586J1(act, "p_home,expired_vip", Privilege.vip_unlimited_likes);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m135683s(TextView textView, Settings settings) {
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m135686v(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m135689y(Dialog dialog, Act act) {
        dialog.dismiss();
        CoreModule.m30933P().m143405a().mo34625wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: l.hl3$a */
    public class C17492a implements cp50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f110477a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f110478b;

        public C17492a(Settings settings, Runnable runnable) {
            this.f110477a = settings;
            this.f110478b = runnable;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f110477a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f110477a.getSearchAgeAllowedMinimum().intValue() || f > this.f110477a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f110477a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f110477a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f110477a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f110478b.run();
            hl3.f110476g = true;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }
    }
}
