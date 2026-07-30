package p009l;

import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.g6a;
import l.ogl0;
import l.u750;
import l.upa;
import l.vwb;
import l.vy8;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class n7l {
    /* JADX INFO: renamed from: a */
    public static void m18803a(DialogStrategyQueue dialogStrategyQueue) {
        m18806d(dialogStrategyQueue);
        m18808f(dialogStrategyQueue);
        m18807e(dialogStrategyQueue);
        m18805c(dialogStrategyQueue);
        m18804b(dialogStrategyQueue);
    }

    /* JADX INFO: renamed from: b */
    public static void m18804b(DialogStrategyQueue dialogStrategyQueue) {
        if (ogl0.s()) {
            List<OMSDialogInfo> listM17402W = ic50.m16316j().m16322f().m17402W("e_page_switch", "p_suggest_users_home_view");
            if (vwb.J(listM17402W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM17402W) {
                if (NullChecker.a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    dialogStrategyQueue.m1377c(new w8l(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18805c(DialogStrategyQueue dialogStrategyQueue) {
        if (vy8.f()) {
            dialogStrategyQueue.m1377c(new brk());
        }
        if (g6a.r()) {
            dialogStrategyQueue.m1377c(new i580());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18806d(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m1377c(new m7l());
        dialogStrategyQueue.m1377c(new l8l());
        dialogStrategyQueue.m1377c(new ay2());
        if (upa.M2()) {
            dialogStrategyQueue.m1377c(new a4h0());
        }
        dialogStrategyQueue.m1377c(new u750(OmsDialog.p_offline_popup.getIdentifier(), false));
        dialogStrategyQueue.m1377c(new wgj(OmsDialog.p_vip_upgrade_popup.getIdentifier(), true));
    }

    /* JADX INFO: renamed from: e */
    public static void m18807e(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m1377c(new ut20());
        if (g6a.k()) {
            dialogStrategyQueue.m1377c(new kdi());
        }
        if (g6a.z()) {
            dialogStrategyQueue.m1377c(new seq0());
        }
        if (CoreModule.c.y2.E3()) {
            dialogStrategyQueue.m1377c(new kq80());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m18808f(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m1377c(new zi0());
        dialogStrategyQueue.m1377c(new frk(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), true));
        dialogStrategyQueue.m1377c(new xq40());
        dialogStrategyQueue.m1377c(new tb0());
        if (ogl0.z()) {
            return;
        }
        dialogStrategyQueue.m1377c(new ld70(OmsDialog.real_person_guide.getIdentifier(), true));
    }
}
