package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSEventId;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n7l {
    /* JADX INFO: renamed from: a */
    public static void m158147a(DialogStrategyQueue dialogStrategyQueue) {
        m158150d(dialogStrategyQueue);
        m158152f(dialogStrategyQueue);
        m158151e(dialogStrategyQueue);
        m158149c(dialogStrategyQueue);
        m158148b(dialogStrategyQueue);
    }

    /* JADX INFO: renamed from: b */
    public static void m158148b(DialogStrategyQueue dialogStrategyQueue) {
        if (ogl0.m164266s()) {
            List<OMSDialogInfo> listM145236W = ic50.m135327j().m135333f().m145236W(OMSEventId.e_page_switch, "p_suggest_users_home_view");
            if (vwb.m200296J(listM145236W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM145236W) {
                if (NullChecker.m81303a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    dialogStrategyQueue.m37406c(new w8l(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m158149c(DialogStrategyQueue dialogStrategyQueue) {
        if (vy8.m200608f()) {
            dialogStrategyQueue.m37406c(new brk());
        }
        if (g6a.m124569r()) {
            dialogStrategyQueue.m37406c(new i580());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m158150d(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m37406c(new m7l());
        dialogStrategyQueue.m37406c(new l8l());
        dialogStrategyQueue.m37406c(new ay2());
        if (upa.m194669M2()) {
            dialogStrategyQueue.m37406c(new a4h0());
        }
        dialogStrategyQueue.m37406c(new u750(OmsDialog.p_offline_popup.getIdentifier(), false));
        dialogStrategyQueue.m37406c(new wgj(OmsDialog.p_vip_upgrade_popup.getIdentifier(), true));
    }

    /* JADX INFO: renamed from: e */
    public static void m158151e(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m37406c(new ut20());
        if (g6a.m124562k()) {
            dialogStrategyQueue.m37406c(new kdi());
        }
        if (g6a.m124577z()) {
            dialogStrategyQueue.m37406c(new seq0());
        }
        if (CoreModule.f17545c.f19701y2.m155330E3()) {
            dialogStrategyQueue.m37406c(new kq80());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m158152f(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m37406c(new zi0());
        dialogStrategyQueue.m37406c(new frk(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), true));
        dialogStrategyQueue.m37406c(new xq40());
        dialogStrategyQueue.m37406c(new tb0());
        if (ogl0.m164273z()) {
            return;
        }
        dialogStrategyQueue.m37406c(new ld70(OmsDialog.real_person_guide.getIdentifier(), true));
    }
}
