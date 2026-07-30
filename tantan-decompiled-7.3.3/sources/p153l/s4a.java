package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.DialogShowInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s4a {
    /* JADX INFO: renamed from: a */
    public static List<hk50> m184453a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hk50(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), new vxd0("notification_home_dialog_show_cnt", 0).get().intValue(), new byd0("notification_home_dialog_show_time", 0L).get().longValue()));
        byd0 byd0Var = new byd0("lost_location_notify_dlg", 0L);
        arrayList.add(new hk50(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), byd0Var.get().longValue() > 0 ? 1 : 0, byd0Var.get().longValue()));
        arrayList.add(new hk50(OmsDialog.real_person_guide.getIdentifier(), Math.max(3 - new vxd0("has_pic_verification_intro_show_count", 3).get().intValue(), 0), new byd0("last_pic_verification_guide_shown_time", 0L).get().longValue()));
        byd0 byd0Var2 = new byd0("LastShowAPPStoreGuideDlgTime", 0L);
        vxd0 vxd0Var = new vxd0("AppStoreGuideDlgShowCount", 0);
        arrayList.add(new hk50(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), byd0Var2.get().longValue() > 0 ? 1 : 0, byd0Var2.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), vxd0Var.get().intValue(), byd0Var2.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_vip_upgrade_popup.getIdentifier(), CoreModule.f18264c.f20381e0.f89238h0.get().booleanValue() ? 1 : 0, 0L));
        new DialogShowInfo();
        byd0 byd0Var3 = new byd0("rate_popup_last_shown_new", 0L);
        arrayList.add(new hk50(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), byd0Var3.get().longValue() > 0 ? 1 : 0, byd0Var3.get().longValue()));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<hk50> m184454b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hk50(OmsDialog.p_vip_expired.getIdentifier(), i7d0.m138926b().m138928a() ? 1 : 0, 0L));
        arrayList.add(new hk50(OmsDialog.p_purchase_guide_page.getIdentifier(), tqi.m192301a().f175739f.get().longValue() > 0 ? 1 : 0, tqi.m192301a().f175739f.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_purchase_expire_page.getIdentifier(), tqi.m192301a().f175740g.get().longValue() > 0 ? 1 : 0, tqi.m192301a().f175740g.get().longValue()));
        String str = "special_like_dlg_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        arrayList.add(new hk50(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), new jxd0(str, bool).get().booleanValue() ? 1 : 0, 0L));
        StringBuilder sb = new StringBuilder("has_shown_crop_picture_guide_dlg_");
        sb.append(CoreModule.m30929H().userId());
        arrayList.add(new hk50(OmsDialog.p_profile_picture_popup.getIdentifier(), new jxd0(sb.toString(), bool).get().booleanValue() ? 1 : 0, 0L));
        long jLongValue = CoreModule.f18264c.f20381e0.f89111R0.get().longValue();
        arrayList.add(new hk50(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), jLongValue > 0 ? 1 : 0, jLongValue));
        arrayList.add(new hk50(OmsDialog.alert_cheat_tips_popup.getIdentifier(), CoreModule.f18264c.f20384f0.f20736z0.get().intValue(), CoreModule.f18264c.f20384f0.f20700n0.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_choose_sale_expire.getIdentifier(), du80.m118106g().f90775d.get().booleanValue() ? 1 : 0, 0L));
        arrayList.add(new hk50(OmsDialog.p_no_match_svip.getIdentifier(), CoreModule.f18264c.f20405m0.f20071D0.get().intValue(), CoreModule.f18264c.f20405m0.f20074E0.get().longValue()));
        arrayList.add(new hk50(OmsDialog.see_guide.getIdentifier(), CoreModule.f18264c.f20405m0.f20071D0.get().intValue(), CoreModule.f18264c.f20405m0.f20074E0.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_verification_merge_popup.getIdentifier(), new vxd0("picAndAvatarVerSwipeNotifyCount" + CoreModule.m30929H().userId(), 0).get().intValue(), new byd0("lastPicAndAvatarVerShowTime" + CoreModule.m30929H().userId(), 0L).get().longValue()));
        byd0 byd0Var = new byd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.m30929H().userId(), 0L);
        arrayList.add(new hk50(OmsDialog.p_purchase_page.getIdentifier(), byd0Var.get().longValue() > 0 ? 1 : 0, byd0Var.get().longValue()));
        arrayList.add(new hk50(OmsDialog.p_new_users_see_purchase_guide_see_view.getIdentifier(), CoreModule.f18269h.f186111a.get().booleanValue() ? 1 : 0, 0L));
        arrayList.add(new hk50(OmsDialog.p_offline_popup.getIdentifier(), j7d0.m143774c0().f118679d.get().longValue() <= 0 ? 0 : 1, j7d0.m143774c0().f118679d.get().longValue()));
        return arrayList;
    }
}
