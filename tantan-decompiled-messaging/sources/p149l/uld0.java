package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivilegeDetail;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class uld0 {

    /* JADX INFO: renamed from: o */
    public static volatile uld0 f177045o;

    /* JADX INFO: renamed from: a */
    public tpd0 f177046a = new tpd0("svip_unmatch_desc_show_time", 0);

    /* JADX INFO: renamed from: b */
    public final hpd0 f177047b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f177048c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f177049d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f177050e;

    /* JADX INFO: renamed from: f */
    public final hpd0 f177051f;

    /* JADX INFO: renamed from: g */
    public final hpd0 f177052g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f177053h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f177054i;

    /* JADX INFO: renamed from: j */
    public final zpd0 f177055j;

    /* JADX INFO: renamed from: k */
    public final tpd0 f177056k;

    /* JADX INFO: renamed from: l */
    public final hpd0 f177057l;

    /* JADX INFO: renamed from: m */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final zpd0 f177058m;

    /* JADX INFO: renamed from: n */
    public final zpd0 f177059n;

    public uld0() {
        Boolean bool = Boolean.FALSE;
        this.f177047b = new hpd0("svip_new_function_guide_shown_Intl", bool);
        this.f177048c = new hpd0("svip_letter_cover_guide_shown", bool);
        this.f177049d = new hpd0("svip_privacy_membership_setting_tip_read" + CoreModule.m29931H().userId(), bool);
        this.f177050e = new hpd0("svip_you_like_dot_click_intl" + CoreModule.m29931H().userId(), bool);
        this.f177051f = new hpd0("svip_you_like_flag_click_intl" + CoreModule.m29931H().userId(), bool);
        this.f177052g = new hpd0("premium_filter_me_tab_tip_intl" + CoreModule.m29931H().userId(), bool);
        this.f177053h = new hpd0("premium_advanced_filter_dot_click_intl" + CoreModule.m29931H().userId(), bool);
        this.f177054i = new hpd0("premium_filter_set_item_tip_dot_click_intl" + CoreModule.m29931H().userId(), bool);
        this.f177055j = new zpd0("vip_upgrade_svip_last_active_timestamp_" + CoreModule.m29931H().userId(), 0L);
        this.f177056k = new tpd0("vip_upgrade_svip_current_day_active_count_" + CoreModule.m29931H().userId(), 0);
        this.f177057l = new hpd0("vip_upgrade_svip_active_shown_" + CoreModule.m29931H().userId(), bool);
        this.f177058m = new zpd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.m29931H().userId(), 0L);
        this.f177059n = new zpd0("vip_upgrade_svip_purchase_dialog_first_shown_timestamp_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: d */
    public static long m194219d(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m81303a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: e */
    public static uld0 m194220e() {
        if (f177045o == null) {
            synchronized (uld0.class) {
                try {
                    if (f177045o == null) {
                        f177045o = new uld0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f177045o;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: i */
    public static Pair<PrivilegeDetail, PrivilegeDetail> m194221i(String str) {
        PrivilegeDetail privilegeDetail;
        PrivilegeDetail privilegeDetail2;
        PrivilegeDetail privilegeDetail3 = null;
        if (TextUtils.isEmpty(str)) {
            privilegeDetail2 = null;
        } else {
            try {
                List<PrivilegeDetail> list = PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
                if (vwb.m200296J(list)) {
                    privilegeDetail2 = null;
                } else {
                    privilegeDetail = (PrivilegeDetail) vwb.m200346r(list, new w9j() { // from class: l.sld0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
                        }
                    });
                    try {
                        privilegeDetail2 = (PrivilegeDetail) vwb.m200346r(list, new w9j() { // from class: l.tld0
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
                            }
                        });
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m81296c(e);
                        privilegeDetail2 = null;
                    }
                    privilegeDetail3 = privilegeDetail;
                }
            } catch (IOException e2) {
                e = e2;
                privilegeDetail = null;
            }
        }
        return Pair.create(privilegeDetail3, privilegeDetail2);
    }

    /* JADX INFO: renamed from: m */
    public static void m194222m() {
        f177045o = null;
    }

    /* JADX INFO: renamed from: c */
    public void m194223c() {
        hpd0 hpd0Var = this.f177048c;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f177050e.put(bool);
        this.f177051f.put(bool);
        this.f177052g.put(bool);
        this.f177053h.put(bool);
        this.f177054i.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public hpd0 m194224f() {
        return this.f177053h;
    }

    /* JADX INFO: renamed from: g */
    public hpd0 m194225g() {
        return this.f177052g;
    }

    /* JADX INFO: renamed from: h */
    public hpd0 m194226h() {
        return this.f177054i;
    }

    /* JADX INFO: renamed from: j */
    public hpd0 m194227j() {
        return this.f177050e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m194228k() {
        return !this.f177051f.get().booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public long m194229l() {
        if (this.f177059n.get().longValue() == 0) {
            this.f177059n.put(Long.valueOf(mqi0.m155944o()));
        }
        return this.f177059n.get().longValue();
    }

    /* JADX INFO: renamed from: n */
    public void m194230n() {
        m194231o();
        this.f177053h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public void m194231o() {
        this.f177052g.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public void m194232p() {
        this.f177054i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public void m194233q() {
        this.f177047b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r */
    public void m194234r() {
        this.f177051f.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public void m194235s() {
        this.f177050e.put(Boolean.TRUE);
    }
}
