package p149l;

import android.content.DialogInterface;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.QuestionCategory;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class ftj {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123056a(d30 d30Var, DialogInterface dialogInterface) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m123057b(String str, String str2) {
        return str + Constants.SEPARATOR_COMMA + str2 + ",click";
    }

    /* JADX INFO: renamed from: c */
    public static void m123058c(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2, String str3, final d30 d30Var, int i) {
        Act act2;
        dsl atjVar;
        dsl fr20Var;
        if (act.isDialogShowing() && ((act.getShowingDialog() instanceof fr20) || (act.getShowingDialog() instanceof atj))) {
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158371f() && (coreGiftPanelName.equals(CoreGiftPanelName.get("note")) || coreGiftPanelName.equals(CoreGiftPanelName.get("greet")))) {
            atjVar = new atj(act, coreGiftPanelName, e30Var, str2, str3);
            act2 = act;
        } else {
            act2 = act;
            if (CoreModule.m29934N().mo60267Co()) {
                fr20Var = new atj(act2, coreGiftPanelName, e30Var, str2, str3);
            } else if (CoreModule.m29935P().m94658i().mo158353b5()) {
                fr20Var = new fr20(act2, coreGiftPanelName, e30Var, str2, str3);
            } else {
                atjVar = null;
            }
            atjVar = fr20Var;
        }
        if (NullChecker.m81303a(atjVar)) {
            if (act2 instanceof MessagesAct) {
                atjVar.mo98815k(((MessagesAct) act2).mo48974l().m120842t7().f171739k1.getHeight());
            } else if (CoreModule.m29935P().m94658i().mo158449t4(act2)) {
                atjVar.mo98815k(act2.screenHeight);
                atjVar.mo98813d(i);
                atjVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.etj
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ftj.m123056a(d30Var, dialogInterface);
                    }
                });
            }
            atjVar.mo98812b(str);
            atjVar.mo98814j();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m123059d(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2, d30 d30Var) {
        m123058c(act, coreGiftPanelName, e30Var, str, str2, "", d30Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m123060e(String str, String str2, boolean z) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19643f1.m118050N3())) {
            GiftInfoTotalData giftInfoTotalDataM118050N3 = CoreModule.f17545c.f19643f1.m118050N3();
            zvf0.m220395q("e_gift", str, vwb.m200311Y("giftId", giftInfoTotalDataM118050N3.giftInfo().f56011id), vwb.m200311Y("gift_type", giftInfoTotalDataM118050N3.giftInfo().name), vwb.m200311Y("giftName", giftInfoTotalDataM118050N3.giftInfo().name), vwb.m200311Y("module", "e_gift_bar"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(giftInfoTotalDataM118050N3.getIndexOnPage() + 1)), vwb.m200311Y("giftBarPageId", Integer.valueOf(giftInfoTotalDataM118050N3.getPageIndex() + 1)), vwb.m200311Y("enoughCoin", Boolean.valueOf(z)), vwb.m200311Y("gift_num", 1), vwb.m200311Y("giftUnitPrice", Double.valueOf(giftInfoTotalDataM118050N3.giftInfo().unitCoinPrice / 10.0d)), vwb.m200311Y("gift_bar_tab", QuestionCategory.classic), vwb.m200311Y("gift_receiver_id", str2), vwb.m200311Y("orderId", 1), vwb.m200311Y("giftCombos", 1), vwb.m200311Y("combo_id", ""), vwb.m200311Y("gift_send_type", ""), vwb.m200311Y("gift_scenario", "vas"));
        }
    }
}
