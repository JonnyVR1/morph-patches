package p153l;

import android.content.DialogInterface;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.QuestionCategory;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class vvj {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m203013a(x20 x20Var, DialogInterface dialogInterface) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m203014b(String str, String str2) {
        return str + Constants.SEPARATOR_COMMA + str2 + ",click";
    }

    /* JADX INFO: renamed from: c */
    public static void m203015c(Act act, CoreGiftPanelName coreGiftPanelName, y20<CoreGiftInfo> y20Var, String str, String str2, String str3, final x20 x20Var, int i) {
        Act act2;
        rul qvjVar;
        rul pz20Var;
        if (act.isDialogShowing() && ((act.getShowingDialog() instanceof pz20) || (act.getShowingDialog() instanceof qvj))) {
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180463f() && (coreGiftPanelName.equals(CoreGiftPanelName.get("note")) || coreGiftPanelName.equals(CoreGiftPanelName.get("greet")))) {
            qvjVar = new qvj(act, coreGiftPanelName, y20Var, str2, str3);
            act2 = act;
        } else {
            act2 = act;
            if (CoreModule.m30932N().mo61451Co()) {
                pz20Var = new qvj(act2, coreGiftPanelName, y20Var, str2, str3);
            } else if (CoreModule.m30933P().m143412i().mo180445b5()) {
                pz20Var = new pz20(act2, coreGiftPanelName, y20Var, str2, str3);
            } else {
                qvjVar = null;
            }
            qvjVar = pz20Var;
        }
        if (NullChecker.m82486a(qvjVar)) {
            if (act2 instanceof MessagesAct) {
                qvjVar.mo174340k(((MessagesAct) act2).mo50158l().m111048t7().f160402k1.getHeight());
            } else if (CoreModule.m30933P().m143412i().mo180541t4(act2)) {
                qvjVar.mo174340k(act2.screenHeight);
                qvjVar.mo174338d(i);
                qvjVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.uvj
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        vvj.m203013a(x20Var, dialogInterface);
                    }
                });
            }
            qvjVar.mo174337b(str);
            qvjVar.mo174339j();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m203016d(Act act, CoreGiftPanelName coreGiftPanelName, y20<CoreGiftInfo> y20Var, String str, String str2, x20 x20Var) {
        m203015c(act, coreGiftPanelName, y20Var, str, str2, "", x20Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m203017e(String str, String str2, boolean z) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20385f1.m155888N3())) {
            GiftInfoTotalData giftInfoTotalDataM155888N3 = CoreModule.f18264c.f20385f1.m155888N3();
            i4g0.m138519q("e_gift", str, jyb.m147494Y("giftId", giftInfoTotalDataM155888N3.giftInfo().f56859id), jyb.m147494Y("gift_type", giftInfoTotalDataM155888N3.giftInfo().name), jyb.m147494Y("giftName", giftInfoTotalDataM155888N3.giftInfo().name), jyb.m147494Y("module", "e_gift_bar"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(giftInfoTotalDataM155888N3.getIndexOnPage() + 1)), jyb.m147494Y("giftBarPageId", Integer.valueOf(giftInfoTotalDataM155888N3.getPageIndex() + 1)), jyb.m147494Y("enoughCoin", Boolean.valueOf(z)), jyb.m147494Y("gift_num", 1), jyb.m147494Y("giftUnitPrice", Double.valueOf(giftInfoTotalDataM155888N3.giftInfo().unitCoinPrice / 10.0d)), jyb.m147494Y("gift_bar_tab", QuestionCategory.classic), jyb.m147494Y("gift_receiver_id", str2), jyb.m147494Y("orderId", 1), jyb.m147494Y("giftCombos", 1), jyb.m147494Y("combo_id", ""), jyb.m147494Y("gift_send_type", ""), jyb.m147494Y("gift_scenario", "vas"));
        }
    }
}
