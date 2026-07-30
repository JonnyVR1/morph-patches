package p003l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.QuestionCategory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ftj {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6507a(d30 d30Var, DialogInterface dialogInterface) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6508b(String str, String str2) {
        return str + "," + str2 + ",click";
    }

    /* JADX INFO: renamed from: c */
    public static void m6509c(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2, String str3, final d30 d30Var, int i) {
        Act act2;
        dsl atjVar;
        dsl fr20Var;
        if (act.isDialogShowing() && ((act.getShowingDialog() instanceof fr20) || (act.getShowingDialog() instanceof atj))) {
            return;
        }
        if (CoreModule.P().i().f() && (coreGiftPanelName.equals(CoreGiftPanelName.get("note")) || coreGiftPanelName.equals(CoreGiftPanelName.get(GiftSubBizType.greet)))) {
            atjVar = new atj(act, coreGiftPanelName, e30Var, str2, str3);
            act2 = act;
        } else {
            act2 = act;
            if (CoreModule.N().Co()) {
                fr20Var = new atj(act2, coreGiftPanelName, e30Var, str2, str3);
            } else if (CoreModule.P().i().b5()) {
                fr20Var = new fr20(act2, coreGiftPanelName, e30Var, str2, str3);
            } else {
                atjVar = null;
            }
            atjVar = fr20Var;
        }
        if (NullChecker.a(atjVar)) {
            if (act2 instanceof MessagesAct) {
                atjVar.mo5640k(((MessagesAct) act2).l().t7().k1.getHeight());
            } else if (CoreModule.P().i().t4(act2)) {
                atjVar.mo5640k(act2.screenHeight);
                atjVar.mo5638d(i);
                atjVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.etj
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ftj.m6507a(d30Var, dialogInterface);
                    }
                });
            }
            atjVar.mo5637b(str);
            atjVar.mo5639j();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6510d(Act act, CoreGiftPanelName coreGiftPanelName, e30<CoreGiftInfo> e30Var, String str, String str2, d30 d30Var) {
        m6509c(act, coreGiftPanelName, e30Var, str, str2, "", d30Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m6511e(String str, String str2, boolean z) {
        if (NullChecker.a(CoreModule.c.f1.N3())) {
            GiftInfoTotalData giftInfoTotalDataN3 = CoreModule.c.f1.N3();
            zvf0.q("e_gift", str, new j760[]{vwb.Y("giftId", ((DbObject) giftInfoTotalDataN3.giftInfo()).id), vwb.Y("gift_type", giftInfoTotalDataN3.giftInfo().name), vwb.Y("giftName", giftInfoTotalDataN3.giftInfo().name), vwb.Y("module", "e_gift_bar"), vwb.Y("index", Integer.valueOf(giftInfoTotalDataN3.getIndexOnPage() + 1)), vwb.Y("giftBarPageId", Integer.valueOf(giftInfoTotalDataN3.getPageIndex() + 1)), vwb.Y("enoughCoin", Boolean.valueOf(z)), vwb.Y("gift_num", 1), vwb.Y("giftUnitPrice", Double.valueOf(giftInfoTotalDataN3.giftInfo().unitCoinPrice / 10.0d)), vwb.Y("gift_bar_tab", QuestionCategory.classic), vwb.Y("gift_receiver_id", str2), vwb.Y("orderId", 1), vwb.Y("giftCombos", 1), vwb.Y("combo_id", ""), vwb.Y("gift_send_type", ""), vwb.Y("gift_scenario", "vas")});
        }
    }
}
