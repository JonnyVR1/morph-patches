package p153l;

import com.meituan.robust.Constants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public class civ {

    /* JADX INFO: renamed from: A */
    public StringBuilder f81993A;

    /* JADX INFO: renamed from: a */
    public final jxd0 f81994a;

    /* JADX INFO: renamed from: b */
    public final jxd0 f81995b;

    /* JADX INFO: renamed from: c */
    public final jxd0 f81996c;

    /* JADX INFO: renamed from: d */
    public final jxd0 f81997d;

    /* JADX INFO: renamed from: e */
    public final byd0 f81998e;

    /* JADX INFO: renamed from: f */
    public final vxd0 f81999f;

    /* JADX INFO: renamed from: g */
    public final wyd0 f82000g;

    /* JADX INFO: renamed from: h */
    public final byd0 f82001h;

    /* JADX INFO: renamed from: i */
    public final jxd0 f82002i;

    /* JADX INFO: renamed from: j */
    public final jxd0 f82003j;

    /* JADX INFO: renamed from: k */
    public final byd0 f82004k;

    /* JADX INFO: renamed from: l */
    public final ayd0 f82005l;

    /* JADX INFO: renamed from: m */
    public final zxd0 f82006m;

    /* JADX INFO: renamed from: n */
    public final xxd0 f82007n;

    /* JADX INFO: renamed from: o */
    public final yxd0 f82008o;

    /* JADX INFO: renamed from: p */
    public final xyd0 f82009p;

    /* JADX INFO: renamed from: q */
    public final vxd0 f82010q;

    /* JADX INFO: renamed from: r */
    public final jxd0 f82011r;

    /* JADX INFO: renamed from: s */
    public final wyd0 f82012s;

    /* JADX INFO: renamed from: t */
    public final jxd0 f82013t;

    /* JADX INFO: renamed from: u */
    public final ybp f82014u;

    /* JADX INFO: renamed from: v */
    public final xbp f82015v;

    /* JADX INFO: renamed from: w */
    public final jxd0 f82016w;

    /* JADX INFO: renamed from: x */
    public final wyd0 f82017x;

    /* JADX INFO: renamed from: y */
    public final wyd0 f82018y;

    /* JADX INFO: renamed from: z */
    public final wyd0 f82019z;

    public civ() {
        String str = "first_dialog_show" + zrv.f205799a.m207631D0();
        Boolean bool = Boolean.TRUE;
        this.f81994a = new jxd0(str, bool);
        this.f81995b = new jxd0("send_gift_confirm_dialog_show" + zrv.f205799a.m207631D0(), bool);
        String str2 = "is_live_paid_user" + zrv.f205799a.m207631D0();
        Boolean bool2 = Boolean.FALSE;
        this.f81996c = new jxd0(str2, bool2);
        this.f81997d = new jxd0("is_first_recharge_dialog_show" + zrv.f205799a.m207631D0(), bool2);
        this.f81998e = new byd0("latest_send_live_gift_time" + zrv.f205799a.m207631D0(), 0L);
        this.f81999f = new vxd0("live_treasure_watch_live_seconds" + zrv.f205799a.m207631D0(), 0);
        this.f82000g = new wyd0("live_treasure_box_status" + zrv.f205799a.m207631D0(), "created");
        this.f82001h = new byd0("live_package_gift_latest_update_time" + zrv.f205799a.m207631D0(), 0L);
        this.f82002i = new jxd0("live_packet_gift_action_show" + zrv.f205799a.m207631D0(), bool2);
        this.f82003j = new jxd0("live_unit_switch_star" + zrv.f205799a.m207631D0(), bool2);
        this.f82004k = new byd0("live_gift_send_notice_last_show_timestamp" + zrv.f205799a.m207631D0(), 0L);
        this.f82005l = new ayd0("live_resource_cdn_info_" + zrv.f205799a.m207631D0(), null);
        this.f82006m = new zxd0("live_resource_" + zrv.f205799a.m207631D0(), null);
        this.f82007n = new xxd0("live_gift_item_" + zrv.f205799a.m207631D0(), null);
        this.f82008o = new yxd0("live_medals_item_" + zrv.f205799a.m207631D0(), null);
        this.f82009p = new xyd0("gift_notice_not_show_" + zrv.f205799a.m207631D0(), new HashSet());
        this.f82010q = new vxd0("live_guide_gift_show_time" + zrv.f205799a.m207631D0(), 0);
        this.f82011r = new jxd0("live_whole_mike_alert_dialog_show" + zrv.f205799a.m207631D0(), bool);
        this.f82012s = new wyd0("live_consume_alert_status" + zrv.f205799a.m207631D0(), "");
        this.f82013t = new jxd0("live_packet_progress_tips_show" + zrv.f205799a.m207631D0(), bool);
        this.f82014u = new ybp("intl_live_template_cdn_info", null);
        this.f82015v = new xbp("intl_live_template", null);
        this.f82016w = new jxd0("intl_sud_game_first_load" + zrv.f205799a.m207631D0(), bool);
        this.f82017x = new wyd0("intl_game_board_item_" + zrv.f205799a.m207631D0(), "");
        this.f82018y = new wyd0("intl_octopus_game_load_history" + zrv.f205799a.m207631D0(), "");
        this.f82019z = new wyd0("virtual_square_tab_show_dot" + zrv.f205799a.m207631D0(), "");
        this.f81993A = new StringBuilder();
    }

    /* JADX INFO: renamed from: A */
    public void m109949A(long j) {
        this.f82004k.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: B */
    public void m109950B() {
        this.f82002i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public void m109951C(boolean z) {
        this.f82003j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: D */
    public void m109952D(String str) {
        this.f82000g.put(str);
    }

    /* JADX INFO: renamed from: E */
    public void m109953E(Integer num) {
        this.f81999f.put(num);
    }

    /* JADX INFO: renamed from: F */
    public void m109954F(String str) {
        String str2 = this.f82017x.get();
        this.f82017x.put(str2 + str + Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: G */
    public void m109955G(String str) {
        String str2 = this.f82018y.get();
        this.f82018y.put(str2 + ";;" + str);
    }

    /* JADX INFO: renamed from: H */
    public void m109956H(String str) {
        String str2 = this.f82019z.get();
        this.f82019z.put(str2 + str + Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: a */
    public boolean m109957a() {
        return this.f81995b.get().booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m109958b() {
        return this.f81994a.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m109959c(String str) {
        return !this.f82017x.get().contains(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m109960d() {
        return this.f82013t.get().booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m109961e(String str) {
        return !this.f82019z.get().contains(str);
    }

    /* JADX INFO: renamed from: f */
    public void m109962f() {
        this.f82011r.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public boolean m109963g() {
        return this.f82011r.get().booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public String m109964h() {
        return this.f82012s.get();
    }

    /* JADX INFO: renamed from: i */
    public boolean m109965i() {
        return this.f81997d.get().booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public boolean m109966j() {
        return this.f81996c.get().booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public long m109967k() {
        return this.f81998e.get().longValue();
    }

    /* JADX INFO: renamed from: l */
    public Long m109968l() {
        return this.f82001h.get();
    }

    /* JADX INFO: renamed from: m */
    public long m109969m() {
        return this.f82004k.get().longValue();
    }

    /* JADX INFO: renamed from: n */
    public boolean m109970n() {
        return this.f82003j.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public String m109971o() {
        return this.f82000g.get();
    }

    /* JADX INFO: renamed from: p */
    public int m109972p() {
        return this.f81999f.get().intValue();
    }

    /* JADX INFO: renamed from: q */
    public boolean m109973q(String str) {
        return !this.f82018y.get().contains(str);
    }

    /* JADX INFO: renamed from: r */
    public boolean m109974r() {
        return this.f82002i.get().booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public void m109975s(Long l2) {
        this.f82001h.put(l2);
    }

    /* JADX INFO: renamed from: t */
    public void m109976t() {
        this.f82013t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public void m109977u(Boolean bool) {
        this.f81995b.put(bool);
    }

    /* JADX INFO: renamed from: v */
    public void m109978v(String str) {
        this.f82012s.put(str);
    }

    /* JADX INFO: renamed from: w */
    public void m109979w(Boolean bool) {
        this.f81994a.put(bool);
    }

    /* JADX INFO: renamed from: x */
    public void m109980x(boolean z) {
        if (this.f81997d.get().booleanValue()) {
            return;
        }
        this.f81997d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: y */
    public void m109981y(boolean z) {
        if (this.f81996c.get().booleanValue()) {
            return;
        }
        this.f81996c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: z */
    public void m109982z() {
        this.f81998e.put(Long.valueOf(pzi0.m174454o()));
    }
}
