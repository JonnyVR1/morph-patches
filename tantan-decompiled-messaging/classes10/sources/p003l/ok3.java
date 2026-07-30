package p003l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.p001ui.dlg.SVipSeeRecoverDlg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersDialogView;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.f6c0;
import l.fy80;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.n3b0;
import l.nvb0;
import l.o7r;
import l.p4c0;
import l.roj0;
import l.u4c0;
import l.u4e;
import l.v7c0;
import l.w0c0;
import l.wg50;
import l.x2c0;
import l.yij0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import v.VRangeSlider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class ok3 extends s4e {

    /* JADX INFO: renamed from: g */
    public static boolean f6668g = false;

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8463B(boolean z, Runnable runnable) {
        if (z) {
            zvf0.r("e_superlike_first_use_make_sure", "p_superlike_first_use_view");
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8464C(Settings settings, Settings settings2, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.a(settings) && CoreModule.H().signedIn_()) {
            SettingGroups settingGroups = new SettingGroups();
            UserSearchSettings userSearchSettings = new UserSearchSettings();
            settingGroups.search = userSearchSettings;
            userSearchSettings.minAge = settings.getSearchMinAge();
            settingGroups.search.maxAge = settings.getSearchMaxAge();
            SettingGroups settingGroupsSubtract = settingGroups.subtract(settings2.getSettingGroup());
            if (NullChecker.a(settingGroupsSubtract)) {
                CoreModule.c.m0.k8(settingGroupsSubtract).subscribe(mkd0.H(new e30() { // from class: l.bk3
                    public final void call(Object obj) {
                        ok3.m8490v((roj0) obj);
                    }
                }, new e30() { // from class: l.ck3
                    public final void call(Object obj) {
                        yij0.D((Throwable) obj);
                    }
                }));
            }
        }
        cwf0Var.g();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m8465D(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400121) {
            lsi0.j("无效二维码");
        } else {
            lsi0.j("登录失败,请稍后再试");
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m8467F(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m8468G(Act act, final boolean z, String str, String str2, boolean z2, final Runnable runnable, final Runnable runnable2) {
        String string;
        if (z) {
            gxg0.m6892s(act, str, str2, runnable, runnable2);
            return;
        }
        final cwf0 cwf0VarC = null;
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.oe, (ViewGroup) null);
        GradientBgButton gradientBgButtonFindViewById = viewGroup.findViewById(u4c0.a2);
        GradientBgButton gradientBgButtonFindViewById2 = viewGroup.findViewById(u4c0.i9);
        String string2 = act.getString(z ? R.string.ap : R.string.qq, str);
        if (z) {
            string = act.getString(z2 ? R.string.Zo : R.string.Yo, str2);
        } else {
            string = act.getString(R.string.pq, str2);
        }
        CharSequence charSequenceB0 = string;
        String strString = act.string(z ? R.string.w : R.string.x);
        if (!z) {
            gradientBgButtonFindViewById2.setIcon(act.drawable(x2c0.uu));
            gradientBgButtonFindViewById2.setButtonColorEnd(act.color(w0c0.Z1));
            gradientBgButtonFindViewById2.setButtonColorStart(act.color(w0c0.a2));
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(charSequenceB0.toString().split("\n")[1]);
            charSequenceB0 = i0g0.b0(charSequenceB0.toString(), arrayList, Color.parseColor("#4a4a4a"), eqh0.c(3));
        } catch (Exception e) {
            CrashHelper.c(new Exception("firstSuperLikeOrUndo exception:" + e.getMessage(), e));
        }
        gradientBgButtonFindViewById.setCenterText("x" + str2);
        if (z) {
            cwf0VarC = i0e.c("p_superlike_first_use_view", Dialog.class.getName());
            cwf0VarC.o(u4e.b("passive", "alert", "alert_self_definition_basic", "superlike_button", "swipe_page", "tips"));
        }
        Dialog dialogZ = act.dialog().b0(viewGroup).y(true).v().G0(string2.toString()).F(charSequenceB0).v0(strString, new Runnable() { // from class: l.rj3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m8463B(z, runnable);
            }
        }).n0(act.getResources().getString(R.string.c), new Runnable() { // from class: l.sj3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m8467F(runnable2);
            }
        }).B(true).A(new DialogInterface.OnCancelListener() { // from class: l.tj3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ok3.m8481m(runnable2, dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.uj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ok3.m8476h(z, cwf0VarC, dialogInterface);
            }
        }).z();
        if (z) {
            i0e.f(cwf0VarC);
        }
        dialogZ.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m8469H(final Act act, int i, List<String> list) {
        n3b0.z(i);
        n3b0.y(list);
        final Dialog dialogZ = act.dialog().L(v7c0.n).M(f6c0.e0).B(false).z();
        final cwf0 cwf0VarC = i0e.c("p_no_match_svip", dialogZ.getClass().getName());
        cwf0VarC.o(ic50.j().f().U(OmsDialog.p_no_match_svip.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        LikersDialogView likersDialogViewP = dialogZ.P();
        likersDialogViewP.c(list);
        likersDialogViewP.n.setOnClickListener(new View.OnClickListener() { // from class: l.xj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m8483o(dialogZ, act, view);
            }
        });
        likersDialogViewP.o.setOnClickListener(new View.OnClickListener() { // from class: l.yj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogZ.dismiss();
            }
        });
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zj3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: I */
    public static void m8470I(final Act act, int i, List<String> list) {
        n3b0.z(i);
        n3b0.y(list);
        final Dialog dialogZ = act.dialog().u().M(f6c0.rf).B(false).z();
        final cwf0 cwf0VarC = i0e.c("p_no_match_see_purchase_guide_view", dialogZ.getClass().getName());
        cwf0VarC.o(ic50.j().f().U(OmsDialog.see_guide.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        dialogZ.P().g(act, fy80.o(Privilege.see_not_match_guide), PurchaseType.TYPE_GET_LIKERS, new d30() { // from class: l.hk3
            public final void call() {
                ok3.m8493y(dialogZ, act);
            }
        }, new d30() { // from class: l.ik3
            public final void call() {
                dialogZ.dismiss();
            }
        });
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: J */
    public static void m8471J(final Act act, int i, CoreLikers.a aVar) {
        cwf0 cwf0VarC = i0e.c("p_offline_popup", Dialog.class.getName());
        JSONObject jSONObjectU = ic50.j().f().U(OmsDialog.p_offline_popup.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide"));
        try {
            jSONObjectU.put("pop_type", "popup");
        } catch (JSONException unused) {
        }
        cwf0VarC.o(jSONObjectU);
        final Dialog dialogZ0 = act.dialog().M(f6c0.e0).L(v7c0.n).z0();
        LikersDialogView likersDialogViewP = dialogZ0.P();
        likersDialogViewP.b(i, aVar);
        likersDialogViewP.n.setOnClickListener(new View.OnClickListener() { // from class: l.pj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m8479k(dialogZ0, act, view);
            }
        });
        likersDialogViewP.o.setOnClickListener(new View.OnClickListener() { // from class: l.ak3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogZ0.dismiss();
            }
        });
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: K */
    public static void m8472K(final Act act, final Settings settings) {
        final cwf0 cwf0VarC = i0e.c("p_quickchat_match_timeout_popup", Dialog.class.getName());
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(f6c0.m8);
        View viewG = l5j0Var.getDelegate().g(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewG);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewG.setBackgroundColor(act.getResources().getColor(android.R.color.transparent));
        l5j0Var.getWindow().setDimAmount(0.3f);
        l5j0Var.findViewById(u4c0.ge).setTypeface(eqh0.c(3), 1);
        l5j0Var.findViewById(u4c0.xc).setTypeface(eqh0.c(3), 1);
        VRangeSlider vRangeSliderFindViewById = l5j0Var.findViewById(u4c0.jc);
        final TextView textView = (TextView) l5j0Var.findViewById(u4c0.B);
        final Settings settingsClone = settings.clone();
        Runnable runnable = new Runnable() { // from class: l.lk3
            @Override // java.lang.Runnable
            public final void run() {
                ok3.m8487s(textView, settingsClone);
            }
        };
        runnable.run();
        float fIntValue = settingsClone.getSearchAgeAllowedMinimum().intValue();
        float fIntValue2 = settingsClone.getSearchAgeAllowedMaximum().intValue();
        if (fIntValue <= 0.0f) {
            fIntValue = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue2 <= 0.0f) {
            fIntValue2 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        vRangeSliderFindViewById.setValueFrom(fIntValue);
        vRangeSliderFindViewById.setValueTo(fIntValue2);
        float fIntValue3 = settingsClone.getSearchMinAge().intValue();
        float fIntValue4 = settingsClone.getSearchMaxAge().intValue();
        if (fIntValue3 <= 0.0f) {
            fIntValue3 = User.AGE_DEFAULT_SEARCH_MIN;
        }
        if (fIntValue4 <= 0.0f) {
            fIntValue4 = User.AGE_DEFAULT_SEARCH_MAX;
        }
        if (settingsClone.getSearchAgeAllowedMinimum().intValue() > fIntValue3) {
            fIntValue3 = settingsClone.getSearchAgeAllowedMinimum().intValue();
        }
        vRangeSliderFindViewById.setValues(new Float[]{Float.valueOf(fIntValue3), Float.valueOf(fIntValue4)});
        f6668g = false;
        vRangeSliderFindViewById.f(new C3395a(settingsClone, runnable));
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mk3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ok3.m8464C(settingsClone, settings, cwf0VarC, dialogInterface);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.nk3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwf0VarC.r();
            }
        });
        l5j0Var.findViewById(u4c0.xc).setOnClickListener(new View.OnClickListener() { // from class: l.qj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m8480l(act, l5j0Var, settingsClone, view);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: L */
    public static void m8473L(Act act, int i) {
        final cwf0 cwf0VarC = i0e.c("p_see_popup_expired_svip", Dialog.class.getName());
        cwf0VarC.o(ic50.j().f().U(OmsDialog.p_offline_popup.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        final Dialog dialogZ0 = act.dialog().M(f6c0.qc).L(v7c0.n).B(false).z0();
        ((SVipSeeRecoverDlg) dialogZ0.P()).m2506d(act, i, new d30() { // from class: l.kk3
            public final void call() {
                ok3.m8478j(dialogZ0, cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: M */
    public static void m8474M(final Act act) {
        View viewInflate = o7r.a(act).inflate(f6c0.a0, (ViewGroup) null);
        final dd80 dd80VarO = act.newDialog().R(viewInflate).P(false).O();
        final cwf0 cwf0VarC = i0e.c("p_vip_expired", dd80VarO.getClass().getName());
        cwf0VarC.o(ic50.j().f().U(OmsDialog.p_vip_expired.getIdentifier(), u4e.b("passive", "alert", "alert_self_definition_basic", "null", "swipe_page", "guide")));
        viewInflate.findViewById(u4c0.L4).setOnClickListener(new View.OnClickListener() { // from class: l.dk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ok3.m8486r(dd80VarO, act, view);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ek3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        viewInflate.findViewById(u4c0.s2).setOnClickListener(new View.OnClickListener() { // from class: l.fk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarO.dismiss();
            }
        });
        i0e.f(cwf0VarC);
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: N */
    public static void m8475N(Act act, final String str) {
        act.dialog().m0(act.string(R.string.S1)).v0(act.string(R.string.pi), new Runnable() { // from class: l.gk3
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.e0.Qa(str).subscribe(mkd0.H(new e30() { // from class: l.vj3
                    public final void call(Object obj) {
                        lsi0.y("登录成功");
                    }
                }, new e30() { // from class: l.wj3
                    public final void call(Object obj) {
                        ok3.m8465D((Throwable) obj);
                    }
                }));
            }
        }).F("确认是否要登录网页版探探").z().show();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8476h(boolean z, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (z) {
            i0e.e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8478j(Dialog dialog, cwf0 cwf0Var) {
        dialog.dismiss();
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8479k(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.P().a().Rm(act, "p_popup_see,default");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m8480l(Act act, l5j0 l5j0Var, Settings settings, View view) {
        OnlineMatchManager.z().o0(act, false);
        l5j0Var.dismiss();
        if (NullChecker.a(Act.foreground_()) && NullChecker.a(Act.foreground_().a.get()) && !(Act.foreground_().a.get() instanceof DropDownAct)) {
            if (Act.foreground_().a.get() instanceof QuickChatLoftAct) {
                nvb0.m(act, "text_quick_chat");
            } else if (!(Act.foreground_().a.get() instanceof QuickChatSearchingAct)) {
                act.startActivity(NewMainAct.k7(act));
            }
        }
        lsi0.y("闪聊匹配搜索中，合拍的人正在赶来...");
        zvf0.u("e_quickchat_match_timeout_popup_start", "p_quickchat_match_timeout_popup", new j760[]{j760.a("is_move", Boolean.valueOf(f6668g)), j760.a("age_range", String.format("(%s,%s)", settings.getSearchMinAge(), settings.getSearchMaxAge()))});
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m8481m(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m8483o(Dialog dialog, Act act, View view) {
        dialog.dismiss();
        CoreModule.P().a().wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m8486r(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        c.J1(act, "p_home,expired_vip", Privilege.vip_unlimited_likes);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8487s(TextView textView, Settings settings) {
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? "+" : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m8490v(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8493y(Dialog dialog, Act act) {
        dialog.dismiss();
        CoreModule.P().a().wr(act, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: l.ok3$a */
    public class C3395a implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f6669a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f6670b;

        public C3395a(Settings settings, Runnable runnable) {
            this.f6669a = settings;
            this.f6670b = runnable;
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8496b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f6669a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f6669a.getSearchAgeAllowedMinimum().intValue() || f > this.f6669a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f6669a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f6669a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f6669a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f6670b.run();
            ok3.f6668g = true;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8495a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }
    }
}
