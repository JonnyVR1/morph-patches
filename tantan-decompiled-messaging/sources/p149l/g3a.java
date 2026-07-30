package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.DialogShowInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g3a {
    /* JADX INFO: renamed from: a */
    public static List<ac50> m124238a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ac50(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), new tpd0("notification_home_dialog_show_cnt", 0).get().intValue(), new zpd0("notification_home_dialog_show_time", 0L).get().longValue()));
        zpd0 zpd0Var = new zpd0("lost_location_notify_dlg", 0L);
        arrayList.add(new ac50(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), zpd0Var.get().longValue() > 0 ? 1 : 0, zpd0Var.get().longValue()));
        arrayList.add(new ac50(OmsDialog.real_person_guide.getIdentifier(), Math.max(3 - new tpd0("has_pic_verification_intro_show_count", 3).get().intValue(), 0), new zpd0("last_pic_verification_guide_shown_time", 0L).get().longValue()));
        zpd0 zpd0Var2 = new zpd0("LastShowAPPStoreGuideDlgTime", 0L);
        tpd0 tpd0Var = new tpd0("AppStoreGuideDlgShowCount", 0);
        arrayList.add(new ac50(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), zpd0Var2.get().longValue() > 0 ? 1 : 0, zpd0Var2.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), tpd0Var.get().intValue(), zpd0Var2.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_vip_upgrade_popup.getIdentifier(), CoreModule.f17545c.f19639e0.f149381h0.get().booleanValue() ? 1 : 0, 0L));
        new DialogShowInfo();
        zpd0 zpd0Var3 = new zpd0("rate_popup_last_shown_new", 0L);
        arrayList.add(new ac50(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), zpd0Var3.get().longValue() > 0 ? 1 : 0, zpd0Var3.get().longValue()));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<ac50> m124239b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ac50(OmsDialog.p_vip_expired.getIdentifier(), fzc0.m123824b().m123826a() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_purchase_guide_page.getIdentifier(), xni.m210163a().f193694f.get().longValue() > 0 ? 1 : 0, xni.m210163a().f193694f.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_purchase_expire_page.getIdentifier(), xni.m210163a().f193695g.get().longValue() > 0 ? 1 : 0, xni.m210163a().f193695g.get().longValue()));
        String str = "special_like_dlg_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        arrayList.add(new ac50(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), new hpd0(str, bool).get().booleanValue() ? 1 : 0, 0L));
        StringBuilder sb = new StringBuilder("has_shown_crop_picture_guide_dlg_");
        sb.append(CoreModule.m29931H().userId());
        arrayList.add(new ac50(OmsDialog.p_profile_picture_popup.getIdentifier(), new hpd0(sb.toString(), bool).get().booleanValue() ? 1 : 0, 0L));
        long jLongValue = CoreModule.f17545c.f19639e0.f149254R0.get().longValue();
        arrayList.add(new ac50(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), jLongValue > 0 ? 1 : 0, jLongValue));
        arrayList.add(new ac50(OmsDialog.alert_cheat_tips_popup.getIdentifier(), CoreModule.f17545c.f19642f0.f19994z0.get().intValue(), CoreModule.f17545c.f19642f0.f19958n0.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_choose_sale_expire.getIdentifier(), zl80.m219252g().f203602d.get().booleanValue() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_no_match_svip.getIdentifier(), CoreModule.f17545c.f19663m0.f19329D0.get().intValue(), CoreModule.f17545c.f19663m0.f19332E0.get().longValue()));
        arrayList.add(new ac50(OmsDialog.see_guide.getIdentifier(), CoreModule.f17545c.f19663m0.f19329D0.get().intValue(), CoreModule.f17545c.f19663m0.f19332E0.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_verification_merge_popup.getIdentifier(), new tpd0("picAndAvatarVerSwipeNotifyCount" + CoreModule.m29931H().userId(), 0).get().intValue(), new zpd0("lastPicAndAvatarVerShowTime" + CoreModule.m29931H().userId(), 0L).get().longValue()));
        zpd0 zpd0Var = new zpd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.m29931H().userId(), 0L);
        arrayList.add(new ac50(OmsDialog.p_purchase_page.getIdentifier(), zpd0Var.get().longValue() > 0 ? 1 : 0, zpd0Var.get().longValue()));
        arrayList.add(new ac50(OmsDialog.p_new_users_see_purchase_guide_see_view.getIdentifier(), CoreModule.f17550h.f119918a.get().booleanValue() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_offline_popup.getIdentifier(), gzc0.m128837c0().f105120d.get().longValue() <= 0 ? 0 : 1, gzc0.m128837c0().f105120d.get().longValue()));
        return arrayList;
    }
}
