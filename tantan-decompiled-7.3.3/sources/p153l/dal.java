package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSEventId;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class dal {
    /* JADX INFO: renamed from: a */
    public static void m115123a(DialogStrategyQueue dialogStrategyQueue) {
        m115126d(dialogStrategyQueue);
        m115128f(dialogStrategyQueue);
        m115127e(dialogStrategyQueue);
        m115125c(dialogStrategyQueue);
        m115124b(dialogStrategyQueue);
    }

    /* JADX INFO: renamed from: b */
    public static void m115124b(DialogStrategyQueue dialogStrategyQueue) {
        if (spl0.m187393s()) {
            List<OMSDialogInfo> listM181659W = pk50.m172568j().m172574f().m181659W(OMSEventId.e_page_switch, "p_suggest_users_home_view");
            if (jyb.m147479J(listM181659W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM181659W) {
                if (NullChecker.m82486a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    dialogStrategyQueue.m38409c(new mbl(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m115125c(DialogStrategyQueue dialogStrategyQueue) {
        if (d09.m113369f()) {
            dialogStrategyQueue.m38409c(new rtk());
        }
        if (s7a.m184989r()) {
            dialogStrategyQueue.m38409c(new od80());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m115126d(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m38409c(new cal());
        dialogStrategyQueue.m38409c(new bbl());
        dialogStrategyQueue.m38409c(new py2());
        if (gra.m131600M2()) {
            dialogStrategyQueue.m38409c(new ich0());
        }
        dialogStrategyQueue.m38409c(new gg50(OmsDialog.p_offline_popup.getIdentifier(), false));
        dialogStrategyQueue.m38409c(new qjj(OmsDialog.p_vip_upgrade_popup.getIdentifier(), true));
    }

    /* JADX INFO: renamed from: e */
    public static void m115127e(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m38409c(new e230());
        if (s7a.m184982k()) {
            dialogStrategyQueue.m38409c(new zei());
        }
        if (s7a.m184997z()) {
            dialogStrategyQueue.m38409c(new xnq0());
        }
        if (CoreModule.f18264c.f20443y2.m216799E3()) {
            dialogStrategyQueue.m38409c(new oy80());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m115128f(DialogStrategyQueue dialogStrategyQueue) {
        dialogStrategyQueue.m38409c(new vi0());
        dialogStrategyQueue.m38409c(new vtk(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), true));
        dialogStrategyQueue.m38409c(new lz40());
        dialogStrategyQueue.m38409c(new pb0());
        if (spl0.m187400z()) {
            return;
        }
        dialogStrategyQueue.m38409c(new rl70(OmsDialog.real_person_guide.getIdentifier(), true));
    }
}
