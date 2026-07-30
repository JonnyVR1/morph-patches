package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivilegeDetail;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class wtd0 {

    /* JADX INFO: renamed from: o */
    public static volatile wtd0 f190740o;

    /* JADX INFO: renamed from: a */
    public vxd0 f190741a = new vxd0("svip_unmatch_desc_show_time", 0);

    /* JADX INFO: renamed from: b */
    public final jxd0 f190742b;

    /* JADX INFO: renamed from: c */
    public final jxd0 f190743c;

    /* JADX INFO: renamed from: d */
    public final jxd0 f190744d;

    /* JADX INFO: renamed from: e */
    public final jxd0 f190745e;

    /* JADX INFO: renamed from: f */
    public final jxd0 f190746f;

    /* JADX INFO: renamed from: g */
    public final jxd0 f190747g;

    /* JADX INFO: renamed from: h */
    public final jxd0 f190748h;

    /* JADX INFO: renamed from: i */
    public final jxd0 f190749i;

    /* JADX INFO: renamed from: j */
    public final byd0 f190750j;

    /* JADX INFO: renamed from: k */
    public final vxd0 f190751k;

    /* JADX INFO: renamed from: l */
    public final jxd0 f190752l;

    /* JADX INFO: renamed from: m */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final byd0 f190753m;

    /* JADX INFO: renamed from: n */
    public final byd0 f190754n;

    public wtd0() {
        Boolean bool = Boolean.FALSE;
        this.f190742b = new jxd0("svip_new_function_guide_shown_Intl", bool);
        this.f190743c = new jxd0("svip_letter_cover_guide_shown", bool);
        this.f190744d = new jxd0("svip_privacy_membership_setting_tip_read" + CoreModule.m30929H().userId(), bool);
        this.f190745e = new jxd0("svip_you_like_dot_click_intl" + CoreModule.m30929H().userId(), bool);
        this.f190746f = new jxd0("svip_you_like_flag_click_intl" + CoreModule.m30929H().userId(), bool);
        this.f190747g = new jxd0("premium_filter_me_tab_tip_intl" + CoreModule.m30929H().userId(), bool);
        this.f190748h = new jxd0("premium_advanced_filter_dot_click_intl" + CoreModule.m30929H().userId(), bool);
        this.f190749i = new jxd0("premium_filter_set_item_tip_dot_click_intl" + CoreModule.m30929H().userId(), bool);
        this.f190750j = new byd0("vip_upgrade_svip_last_active_timestamp_" + CoreModule.m30929H().userId(), 0L);
        this.f190751k = new vxd0("vip_upgrade_svip_current_day_active_count_" + CoreModule.m30929H().userId(), 0);
        this.f190752l = new jxd0("vip_upgrade_svip_active_shown_" + CoreModule.m30929H().userId(), bool);
        this.f190753m = new byd0("vip_upgrade_svip_purchase_dialog_shown_timestamp_" + CoreModule.m30929H().userId(), 0L);
        this.f190754n = new byd0("vip_upgrade_svip_purchase_dialog_first_shown_timestamp_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: d */
    public static long m207832d(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: e */
    public static wtd0 m207833e() {
        if (f190740o == null) {
            synchronized (wtd0.class) {
                try {
                    if (f190740o == null) {
                        f190740o = new wtd0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f190740o;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: i */
    public static Pair<PrivilegeDetail, PrivilegeDetail> m207834i(String str) {
        PrivilegeDetail privilegeDetail;
        PrivilegeDetail privilegeDetail2;
        PrivilegeDetail privilegeDetail3 = null;
        if (TextUtils.isEmpty(str)) {
            privilegeDetail2 = null;
        } else {
            try {
                List<PrivilegeDetail> list = PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
                if (jyb.m147479J(list)) {
                    privilegeDetail2 = null;
                } else {
                    privilegeDetail = (PrivilegeDetail) jyb.m147529r(list, new qcj() { // from class: l.utd0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
                        }
                    });
                    try {
                        privilegeDetail2 = (PrivilegeDetail) jyb.m147529r(list, new qcj() { // from class: l.vtd0
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
                            }
                        });
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m82479c(e);
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
    public static void m207835m() {
        f190740o = null;
    }

    /* JADX INFO: renamed from: c */
    public void m207836c() {
        jxd0 jxd0Var = this.f190743c;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        this.f190745e.put(bool);
        this.f190746f.put(bool);
        this.f190747g.put(bool);
        this.f190748h.put(bool);
        this.f190749i.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public jxd0 m207837f() {
        return this.f190748h;
    }

    /* JADX INFO: renamed from: g */
    public jxd0 m207838g() {
        return this.f190747g;
    }

    /* JADX INFO: renamed from: h */
    public jxd0 m207839h() {
        return this.f190749i;
    }

    /* JADX INFO: renamed from: j */
    public jxd0 m207840j() {
        return this.f190745e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m207841k() {
        return !this.f190746f.get().booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public long m207842l() {
        if (this.f190754n.get().longValue() == 0) {
            this.f190754n.put(Long.valueOf(pzi0.m174454o()));
        }
        return this.f190754n.get().longValue();
    }

    /* JADX INFO: renamed from: n */
    public void m207843n() {
        m207844o();
        this.f190748h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public void m207844o() {
        this.f190747g.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public void m207845p() {
        this.f190749i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public void m207846q() {
        this.f190742b.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r */
    public void m207847r() {
        this.f190746f.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public void m207848s() {
        this.f190745e.put(Boolean.TRUE);
    }
}
