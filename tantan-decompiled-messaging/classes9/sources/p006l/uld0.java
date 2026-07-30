package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PrivilegeDetail;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import l.hpd0;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uld0 {

    /* JADX INFO: renamed from: o */
    public static volatile uld0 f23615o;

    /* JADX INFO: renamed from: a */
    public tpd0 f23616a = new tpd0("svip_unmatch_desc_show_time", 0);

    /* JADX INFO: renamed from: b */
    public final hpd0 f23617b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f23618c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f23619d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f23620e;

    /* JADX INFO: renamed from: f */
    public final hpd0 f23621f;

    /* JADX INFO: renamed from: g */
    public final hpd0 f23622g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f23623h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f23624i;

    /* JADX INFO: renamed from: j */
    public final zpd0 f23625j;

    /* JADX INFO: renamed from: k */
    public final tpd0 f23626k;

    /* JADX INFO: renamed from: l */
    public final hpd0 f23627l;

    /* JADX INFO: renamed from: m */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final zpd0 f23628m;

    /* JADX INFO: renamed from: n */
    public final zpd0 f23629n;

    public uld0() {
        Boolean bool = Boolean.FALSE;
        this.f23617b = new hpd0("svip_new_function_guide_shown_Intl", bool);
        this.f23618c = new hpd0("svip_letter_cover_guide_shown", bool);
        this.f23619d = new hpd0("svip_privacy_membership_setting_tip_read" + CoreModule.m1850H().userId(), bool);
        this.f23620e = new hpd0("svip_you_like_dot_click_intl" + CoreModule.m1850H().userId(), bool);
        this.f23621f = new hpd0("svip_you_like_flag_click_intl" + CoreModule.m1850H().userId(), bool);
        this.f23622g = new hpd0("premium_filter_me_tab_tip_intl" + CoreModule.m1850H().userId(), bool);
        this.f23623h = new hpd0("premium_advanced_filter_dot_click_intl" + CoreModule.m1850H().userId(), bool);
        this.f23624i = new hpd0("premium_filter_set_item_tip_dot_click_intl" + CoreModule.m1850H().userId(), bool);
        this.f23625j = new zpd0("vip_upgrade_svip_last_active_timestamp_" + CoreModule.m1850H().userId(), 0L);
        this.f23626k = new tpd0("vip_upgrade_svip_current_day_active_count_" + CoreModule.m1850H().userId(), 0);
        this.f23627l = new hpd0("vip_upgrade_svip_active_shown_" + CoreModule.m1850H().userId(), bool);
        this.f23628m = new zpd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.m1850H().userId(), 0L);
        this.f23629n = new zpd0("vip_upgrade_svip_purchase_dialog_first_shown_timestamp_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: d */
    public static long m25254d(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: e */
    public static uld0 m25255e() {
        if (f23615o == null) {
            synchronized (uld0.class) {
                try {
                    if (f23615o == null) {
                        f23615o = new uld0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23615o;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: i */
    public static Pair<PrivilegeDetail, PrivilegeDetail> m25256i(String str) {
        PrivilegeDetail privilegeDetail;
        PrivilegeDetail privilegeDetail2;
        PrivilegeDetail privilegeDetail3 = null;
        if (TextUtils.isEmpty(str)) {
            privilegeDetail2 = null;
        } else {
            try {
                List list = (List) PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
                if (vwb.J(list)) {
                    privilegeDetail2 = null;
                } else {
                    privilegeDetail = (PrivilegeDetail) vwb.r(list, new w9j() { // from class: l.sld0
                        public final Object call(Object obj) {
                            return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
                        }
                    });
                    try {
                        privilegeDetail2 = (PrivilegeDetail) vwb.r(list, new w9j() { // from class: l.tld0
                            public final Object call(Object obj) {
                                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
                            }
                        });
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.c(e);
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
    public static void m25257m() {
        f23615o = null;
    }

    /* JADX INFO: renamed from: c */
    public void m25258c() {
        hpd0 hpd0Var = this.f23618c;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f23620e.put(bool);
        this.f23621f.put(bool);
        this.f23622g.put(bool);
        this.f23623h.put(bool);
        this.f23624i.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public hpd0 m25259f() {
        return this.f23623h;
    }

    /* JADX INFO: renamed from: g */
    public hpd0 m25260g() {
        return this.f23622g;
    }

    /* JADX INFO: renamed from: h */
    public hpd0 m25261h() {
        return this.f23624i;
    }

    /* JADX INFO: renamed from: j */
    public hpd0 m25262j() {
        return this.f23620e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m25263k() {
        return !((Boolean) this.f23621f.get()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public long m25264l() {
        if (((Long) this.f23629n.get()).longValue() == 0) {
            this.f23629n.put(Long.valueOf(mqi0.o()));
        }
        return ((Long) this.f23629n.get()).longValue();
    }

    /* JADX INFO: renamed from: n */
    public void m25265n() {
        m25266o();
        this.f23623h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public void m25266o() {
        this.f23622g.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public void m25267p() {
        this.f23624i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public void m25268q() {
        this.f23617b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r */
    public void m25269r() {
        this.f23621f.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public void m25270s() {
        this.f23620e.put(Boolean.TRUE);
    }
}
