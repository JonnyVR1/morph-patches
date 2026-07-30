package p009l;

import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.DialogShowInfo;
import java.util.ArrayList;
import java.util.List;
import l.fzc0;
import l.gzc0;
import l.hpd0;
import l.tpd0;
import l.zl80;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g3a {
    /* JADX INFO: renamed from: a */
    public static List<ac50> m14775a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ac50(OmsDialog.p_prompt_notification_auth_popup_view.getIdentifier(), ((Integer) new tpd0("notification_home_dialog_show_cnt", 0).get()).intValue(), ((Long) new zpd0("notification_home_dialog_show_time", 0L).get()).longValue()));
        zpd0 zpd0Var = new zpd0("lost_location_notify_dlg", 0L);
        arrayList.add(new ac50(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), ((Long) zpd0Var.get()).longValue() > 0 ? 1 : 0, ((Long) zpd0Var.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.real_person_guide.getIdentifier(), Math.max(3 - ((Integer) new tpd0("has_pic_verification_intro_show_count", 3).get()).intValue(), 0), ((Long) new zpd0("last_pic_verification_guide_shown_time", 0L).get()).longValue()));
        zpd0 zpd0Var2 = new zpd0("LastShowAPPStoreGuideDlgTime", 0L);
        tpd0 tpd0Var = new tpd0("AppStoreGuideDlgShowCount", 0);
        arrayList.add(new ac50(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), ((Long) zpd0Var2.get()).longValue() > 0 ? 1 : 0, ((Long) zpd0Var2.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), ((Integer) tpd0Var.get()).intValue(), ((Long) zpd0Var2.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_vip_upgrade_popup.getIdentifier(), ((Boolean) CoreModule.c.e0.h0.get()).booleanValue() ? 1 : 0, 0L));
        new DialogShowInfo();
        zpd0 zpd0Var3 = new zpd0("rate_popup_last_shown_new", 0L);
        arrayList.add(new ac50(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), ((Long) zpd0Var3.get()).longValue() > 0 ? 1 : 0, ((Long) zpd0Var3.get()).longValue()));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<ac50> m14776b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ac50(OmsDialog.p_vip_expired.getIdentifier(), fzc0.b().a() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_purchase_guide_page.getIdentifier(), ((Long) xni.m24946a().f22670f.get()).longValue() > 0 ? 1 : 0, ((Long) xni.m24946a().f22670f.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_purchase_expire_page.getIdentifier(), ((Long) xni.m24946a().f22671g.get()).longValue() > 0 ? 1 : 0, ((Long) xni.m24946a().f22671g.get()).longValue()));
        String str = "special_like_dlg_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        arrayList.add(new ac50(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), ((Boolean) new hpd0(str, bool).get()).booleanValue() ? 1 : 0, 0L));
        StringBuilder sb = new StringBuilder("has_shown_crop_picture_guide_dlg_");
        sb.append(CoreModule.H().userId());
        arrayList.add(new ac50(OmsDialog.p_profile_picture_popup.getIdentifier(), ((Boolean) new hpd0(sb.toString(), bool).get()).booleanValue() ? 1 : 0, 0L));
        long jLongValue = ((Long) CoreModule.c.e0.R0.get()).longValue();
        arrayList.add(new ac50(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), jLongValue > 0 ? 1 : 0, jLongValue));
        arrayList.add(new ac50(OmsDialog.alert_cheat_tips_popup.getIdentifier(), ((Integer) CoreModule.c.f0.z0.get()).intValue(), ((Long) CoreModule.c.f0.n0.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_choose_sale_expire.getIdentifier(), ((Boolean) zl80.g().d.get()).booleanValue() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_no_match_svip.getIdentifier(), ((Integer) CoreModule.c.m0.D0.get()).intValue(), ((Long) CoreModule.c.m0.E0.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.see_guide.getIdentifier(), ((Integer) CoreModule.c.m0.D0.get()).intValue(), ((Long) CoreModule.c.m0.E0.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_verification_merge_popup.getIdentifier(), ((Integer) new tpd0("picAndAvatarVerSwipeNotifyCount" + CoreModule.H().userId(), 0).get()).intValue(), ((Long) new zpd0("lastPicAndAvatarVerShowTime" + CoreModule.H().userId(), 0L).get()).longValue()));
        zpd0 zpd0Var = new zpd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.H().userId(), 0L);
        arrayList.add(new ac50(OmsDialog.p_purchase_page.getIdentifier(), ((Long) zpd0Var.get()).longValue() > 0 ? 1 : 0, ((Long) zpd0Var.get()).longValue()));
        arrayList.add(new ac50(OmsDialog.p_new_users_see_purchase_guide_see_view.getIdentifier(), ((Boolean) CoreModule.h.a.get()).booleanValue() ? 1 : 0, 0L));
        arrayList.add(new ac50(OmsDialog.p_offline_popup.getIdentifier(), ((Long) gzc0.c0().d.get()).longValue() <= 0 ? 0 : 1, ((Long) gzc0.c0().d.get()).longValue()));
        return arrayList;
    }
}
