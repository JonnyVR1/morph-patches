package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.dlg.SVipSeeRecoverDlg;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipItemDetailPage;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersDialogView;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p147v.VButton;
import p147v.VRangeSlider;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public final class ok3 extends s4e {

    /* JADX INFO: renamed from: g */
    public static boolean f144393g = false;

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m164803B(boolean z, Runnable runnable) {
        if (z) {
            zvf0.m220396r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m164804C(Settings settings, Settings settings2, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(settings) && CoreModule.m29931H().signedIn_()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.minAge = settings.getSearchMinAge();
            settingGroups.search.maxAge = settings.getSearchMaxAge();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(settings2.getSettingGroup());
            if (NullChecker.m81303a(settingGroupsSubtract)) {
                CoreModule.f17545c.f19663m0.m31121k8(settingGroupsSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.bk3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ok3.m164830v((roj0) obj);
                    }
                }, new e30() { // from class: l.ck3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        yij0.m214926D((Throwable) obj);
                    }
                }));
            }
        }
        cwf0Var.m109031g();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m164805D(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400121) {
            lsi0.m151580j("无效二维码");
        } else {
            lsi0.m151580j("登录失败,请稍后再试");
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m164807F(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m164808G(Act act, final boolean z, String str, String str2, boolean z2, final Runnable runnable, final Runnable runnable2) {
        String string;
        if (z) {
            gxg0.m128610s(act, str, str2, runnable, runnable2);
            return;
        }
        final cwf0 cwf0VarM133794c = null;
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.f95934oe, (ViewGroup) null);
        GradientBgButton gradientBgButton = (GradientBgButton) viewGroup.findViewById(u4c0.f174154a2);
        GradientBgButton gradientBgButton2 = (GradientBgButton) viewGroup.findViewById(u4c0.f174297i9);
        String string2 = act.getString(z ? R$string.f18372ap : R$string.f18865qq, str);
        if (z) {
            string = act.getString(z2 ? R$string.f18341Zo : R$string.f18311Yo, str2);
        } else {
            string = act.getString(R$string.f18835pq, str2);
        }
        CharSequence charSequenceM133861b0 = string;
        String strString = act.string(z ? R$string.f19018w : R$string.f19048x);
        if (!z) {
            gradientBgButton2.setIcon(act.drawable(x2c0.f190633uu));
            gradientBgButton2.setButtonColorEnd(act.color(w0c0.f183826Z1));
            gradientBgButton2.setButtonColorStart(act.color(w0c0.f183830a2));
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(charSequenceM133861b0.toString().split(SignParameters.NEW_LINE)[1]);
            charSequenceM133861b0 = i0g0.m133861b0(charSequenceM133861b0.toString(), arrayList, Color.parseColor("#4a4a4a"), eqh0.m117752c(3));
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("firstSuperLikeOrUndo exception:" + e.getMessage(), e));
        }
        gradientBgButton.setCenterText(BaseSei.f13930X + str2);
        if (z) {
            cwf0VarM133794c = i0e.m133794c("p_superlike_first_use_view", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        }
        Dialog dialogM20567z = act.dialog().m20532b0(viewGroup).m20565y(true).m20559v().m20507G0(string2.toString()).m20504F(charSequenceM133861b0).m20560v0(strString, new Runnable() { // from class: l.rj3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m164803B(z, runnable);
            }
        }).m20544n0(act.getResources().getString(R$string.f18408c), new Runnable() { // from class: l.sj3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m164807F(runnable2);
            }
        }).m20496B(true).m20494A(new DialogInterface.OnCancelListener() { // from class: l.tj3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ok3.m164821m(runnable2, dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.uj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ok3.m164816h(z, cwf0VarM133794c, dialogInterface);
            }
        }).m20567z();
        if (z) {
            i0e.m133797f(cwf0VarM133794c);
        }
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m164809H(final Act act, int i, List<String> list) {
        n3b0.m157751z(i);
        n3b0.m157750y(list);
        final Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180367n).m20517M(f6c0.f95751e0).m20496B(false).m20567z();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_no_match_svip", dialogM20567z.getClass().getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_no_match_svip.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        LikersDialogView likersDialogView = (LikersDialogView) dialogM20567z.m20458P();
        likersDialogView.m56573c(list);
        likersDialogView.f37286n.setOnClickListener(new View.OnClickListener() { // from class: l.xj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m164823o(dialogM20567z, act, view);
            }
        });
        likersDialogView.f37287o.setOnClickListener(new View.OnClickListener() { // from class: l.yj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM20567z.dismiss();
            }
        });
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: I */
    public static void m164810I(final Act act, int i, List<String> list) {
        n3b0.m157751z(i);
        n3b0.m157750y(list);
        final Dialog dialogM20567z = act.dialog().m20557u().m20517M(f6c0.f95986rf).m20496B(false).m20567z();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_no_match_see_purchase_guide_view", dialogM20567z.getClass().getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.see_guide.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        ((VipItemDetailPage) dialogM20567z.m20458P()).m56273g(act, fy80.m123719o(Privilege.see_not_match_guide), PurchaseType.TYPE_GET_LIKERS, new d30() { // from class: l.hk3
            @Override // p149l.d30
            public final void call() {
                ok3.m164833y(dialogM20567z, act);
            }
        }, new d30() { // from class: l.ik3
            @Override // p149l.d30
            public final void call() {
                dialogM20567z.dismiss();
            }
        });
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: J */
    public static void m164811J(final Act act, int i, CoreLikers.C4719a c4719a) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_offline_popup", Dialog.class.getName());
        JSONObject jSONObjectM145234U = ic50.m135327j().m135333f().m145234U(OmsDialog.p_offline_popup.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide"));
        try {
            jSONObjectM145234U.put("pop_type", BannerLoc.popup);
        } catch (JSONException unused) {
        }
        cwf0VarM133794c.m109039o(jSONObjectM145234U);
        final Dialog dialogM20568z0 = act.dialog().m20517M(f6c0.f95751e0).m20516L(v7c0.f180367n).m20568z0();
        LikersDialogView likersDialogView = (LikersDialogView) dialogM20568z0.m20458P();
        likersDialogView.m56572b(i, c4719a);
        likersDialogView.f37286n.setOnClickListener(new View.OnClickListener() { // from class: l.pj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m164819k(dialogM20568z0, act, view);
            }
        });
        likersDialogView.f37287o.setOnClickListener(new View.OnClickListener() { // from class: l.ak3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogM20568z0.dismiss();
            }
        });
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: K */
    public static void m164812K(final Act act, final Settings settings) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_match_timeout_popup", Dialog.class.getName());
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(f6c0.f95894m8);
        View viewMo302g = l5j0Var.getDelegate().mo302g(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo302g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo302g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        l5j0Var.getWindow().setDimAmount(0.3f);
        ((VText) l5j0Var.findViewById(u4c0.f174268ge)).setTypeface(eqh0.m117752c(3), 1);
        ((VButton) l5j0Var.findViewById(u4c0.f174554xc)).setTypeface(eqh0.m117752c(3), 1);
        VRangeSlider vRangeSlider = (VRangeSlider) l5j0Var.findViewById(u4c0.f174316jc);
        final TextView textView = (TextView) l5j0Var.findViewById(u4c0.f173733B);
        final Settings settingsMo223809clone = settings.mo223809clone();
        Runnable runnable = new Runnable() { // from class: l.lk3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m164827s(textView, settingsMo223809clone);
            }
        };
        runnable.run();
        float fIntValue = settingsMo223809clone.getSearchAgeAllowedMinimum().intValue();
        float fIntValue2 = settingsMo223809clone.getSearchAgeAllowedMaximum().intValue();
        if (fIntValue <= 0.0f) {
            fIntValue = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue2 <= 0.0f) {
            fIntValue2 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        vRangeSlider.setValueFrom(fIntValue);
        vRangeSlider.setValueTo(fIntValue2);
        float fIntValue3 = settingsMo223809clone.getSearchMinAge().intValue();
        float fIntValue4 = settingsMo223809clone.getSearchMaxAge().intValue();
        if (fIntValue3 <= 0.0f) {
            fIntValue3 = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue4 <= 0.0f) {
            fIntValue4 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        if (settingsMo223809clone.getSearchAgeAllowedMinimum().intValue() > fIntValue3) {
            fIntValue3 = settingsMo223809clone.getSearchAgeAllowedMinimum().intValue();
        }
        vRangeSlider.setValues(Float.valueOf(fIntValue3), Float.valueOf(fIntValue4));
        f144393g = false;
        vRangeSlider.mo222965f(new C18966a(settingsMo223809clone, runnable));
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ok3.m164804C(settingsMo223809clone, settings, cwf0VarM133794c, dialogInterface);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.nk3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwf0VarM133794c.m109042r();
            }
        });
        l5j0Var.findViewById(u4c0.f174554xc).setOnClickListener(new View.OnClickListener() { // from class: l.qj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m164820l(act, l5j0Var, settingsMo223809clone, view);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: L */
    public static void m164813L(Act act, int i) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_see_popup_expired_svip", Dialog.class.getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_offline_popup.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        final Dialog dialogM20568z0 = act.dialog().m20517M(f6c0.f95966qc).m20516L(v7c0.f180367n).m20496B(false).m20568z0();
        ((SVipSeeRecoverDlg) dialogM20568z0.m20458P()).m45189d(act, i, new d30() { // from class: l.kk3
            @Override // p149l.d30
            public final void call() {
                ok3.m164818j(dialogM20568z0, cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: M */
    public static void m164814M(final Act act) {
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95683a0, (ViewGroup) null);
        final dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110961P(false).m110960O();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_vip_expired", dd80VarM110960O.getClass().getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_vip_expired.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        viewInflate.findViewById(u4c0.f173908L4).setOnClickListener(new View.OnClickListener() { // from class: l.dk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m164826r(dd80VarM110960O, act, view);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ek3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        viewInflate.findViewById(u4c0.f174459s2).setOnClickListener(new View.OnClickListener() { // from class: l.fk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110960O.dismiss();
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: N */
    public static void m164815N(Act act, final String str) {
        act.dialog().m20543m0(act.string(R$string.f18108S1)).m20560v0(act.string(R$string.f18827pi), new Runnable() { // from class: l.gk3
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19639e0.m169434Qa(str).subscribe(mkd0.m154956H(new e30() { // from class: l.vj3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lsi0.m151595y("登录成功");
                    }
                }, new e30() { // from class: l.wj3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ok3.m164805D((Throwable) obj);
                    }
                }));
            }
        }).m20504F("确认是否要登录网页版探探").m20567z().show();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m164816h(boolean z, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (z) {
            i0e.m133796e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m164818j(Dialog dialog, cwf0 cwf0Var) {
        dialog.dismiss();
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m164819k(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.m29935P().m94651a().mo33401Rm(act, "p_popup_see,default");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m164820l(Act act, l5j0 l5j0Var, Settings settings, View view) {
        OnlineMatchManager.m50143z().m50183o0(act, false);
        l5j0Var.m101651T();
        if (NullChecker.m81303a(Act.foreground_()) && NullChecker.m81303a(Act.foreground_().f15343a.get()) && !(Act.foreground_().f15343a.get() instanceof DropDownAct)) {
            if (Act.foreground_().f15343a.get() instanceof QuickChatLoftAct) {
                nvb0.m161582m(act, "text_quick_chat");
            } else if (!(Act.foreground_().f15343a.get() instanceof QuickChatSearchingAct)) {
                act.startActivity(NewMainAct.m39740k7(act));
            }
        }
        lsi0.m151595y("闪聊匹配搜索中，合拍的人正在赶来...");
        zvf0.m220399u("e_quickchat_match_timeout_popup_start", "p_quickchat_match_timeout_popup", j760.m140076a("is_move", Boolean.valueOf(f144393g)), j760.m140076a("age_range", String.format("(%s,%s)", settings.getSearchMinAge(), settings.getSearchMaxAge())));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m164821m(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m164823o(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.m29935P().m94651a().mo33622wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m164826r(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        C8764c.m53403J1(act, "p_home,expired_vip", Privilege.vip_unlimited_likes);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m164827s(TextView textView, Settings settings) {
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m164830v(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m164833y(Dialog dialog, Act act) {
        dialog.dismiss();
        CoreModule.m29935P().m94651a().mo33622wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: l.ok3$a */
    public class C18966a implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f144394a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f144395b;

        public C18966a(Settings settings, Runnable runnable) {
            this.f144394a = settings;
            this.f144395b = runnable;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f144394a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f144394a.getSearchAgeAllowedMinimum().intValue() || f > this.f144394a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f144394a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f144394a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f144394a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f144395b.run();
            ok3.f144393g = true;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }
    }
}
