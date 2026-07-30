package p149l;

import com.meituan.robust.Constants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class bgv {

    /* JADX INFO: renamed from: A */
    public StringBuilder f75500A;

    /* JADX INFO: renamed from: a */
    public final hpd0 f75501a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f75502b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f75503c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f75504d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f75505e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f75506f;

    /* JADX INFO: renamed from: g */
    public final uqd0 f75507g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f75508h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f75509i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f75510j;

    /* JADX INFO: renamed from: k */
    public final zpd0 f75511k;

    /* JADX INFO: renamed from: l */
    public final ypd0 f75512l;

    /* JADX INFO: renamed from: m */
    public final xpd0 f75513m;

    /* JADX INFO: renamed from: n */
    public final vpd0 f75514n;

    /* JADX INFO: renamed from: o */
    public final wpd0 f75515o;

    /* JADX INFO: renamed from: p */
    public final vqd0 f75516p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f75517q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f75518r;

    /* JADX INFO: renamed from: s */
    public final uqd0 f75519s;

    /* JADX INFO: renamed from: t */
    public final hpd0 f75520t;

    /* JADX INFO: renamed from: u */
    public final y9p f75521u;

    /* JADX INFO: renamed from: v */
    public final x9p f75522v;

    /* JADX INFO: renamed from: w */
    public final hpd0 f75523w;

    /* JADX INFO: renamed from: x */
    public final uqd0 f75524x;

    /* JADX INFO: renamed from: y */
    public final uqd0 f75525y;

    /* JADX INFO: renamed from: z */
    public final uqd0 f75526z;

    public bgv() {
        String str = "first_dialog_show" + ypv.f199493a.m199309D0();
        Boolean bool = Boolean.TRUE;
        this.f75501a = new hpd0(str, bool);
        this.f75502b = new hpd0("send_gift_confirm_dialog_show" + ypv.f199493a.m199309D0(), bool);
        String str2 = "is_live_paid_user" + ypv.f199493a.m199309D0();
        Boolean bool2 = Boolean.FALSE;
        this.f75503c = new hpd0(str2, bool2);
        this.f75504d = new hpd0("is_first_recharge_dialog_show" + ypv.f199493a.m199309D0(), bool2);
        this.f75505e = new zpd0("latest_send_live_gift_time" + ypv.f199493a.m199309D0(), 0L);
        this.f75506f = new tpd0("live_treasure_watch_live_seconds" + ypv.f199493a.m199309D0(), 0);
        this.f75507g = new uqd0("live_treasure_box_status" + ypv.f199493a.m199309D0(), "created");
        this.f75508h = new zpd0("live_package_gift_latest_update_time" + ypv.f199493a.m199309D0(), 0L);
        this.f75509i = new hpd0("live_packet_gift_action_show" + ypv.f199493a.m199309D0(), bool2);
        this.f75510j = new hpd0("live_unit_switch_star" + ypv.f199493a.m199309D0(), bool2);
        this.f75511k = new zpd0("live_gift_send_notice_last_show_timestamp" + ypv.f199493a.m199309D0(), 0L);
        this.f75512l = new ypd0("live_resource_cdn_info_" + ypv.f199493a.m199309D0(), null);
        this.f75513m = new xpd0("live_resource_" + ypv.f199493a.m199309D0(), null);
        this.f75514n = new vpd0("live_gift_item_" + ypv.f199493a.m199309D0(), null);
        this.f75515o = new wpd0("live_medals_item_" + ypv.f199493a.m199309D0(), null);
        this.f75516p = new vqd0("gift_notice_not_show_" + ypv.f199493a.m199309D0(), new HashSet());
        this.f75517q = new tpd0("live_guide_gift_show_time" + ypv.f199493a.m199309D0(), 0);
        this.f75518r = new hpd0("live_whole_mike_alert_dialog_show" + ypv.f199493a.m199309D0(), bool);
        this.f75519s = new uqd0("live_consume_alert_status" + ypv.f199493a.m199309D0(), "");
        this.f75520t = new hpd0("live_packet_progress_tips_show" + ypv.f199493a.m199309D0(), bool);
        this.f75521u = new y9p("intl_live_template_cdn_info", null);
        this.f75522v = new x9p("intl_live_template", null);
        this.f75523w = new hpd0("intl_sud_game_first_load" + ypv.f199493a.m199309D0(), bool);
        this.f75524x = new uqd0("intl_game_board_item_" + ypv.f199493a.m199309D0(), "");
        this.f75525y = new uqd0("intl_octopus_game_load_history" + ypv.f199493a.m199309D0(), "");
        this.f75526z = new uqd0("virtual_square_tab_show_dot" + ypv.f199493a.m199309D0(), "");
        this.f75500A = new StringBuilder();
    }

    /* JADX INFO: renamed from: A */
    public void m101713A(long j) {
        this.f75511k.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: B */
    public void m101714B() {
        this.f75509i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public void m101715C(boolean z) {
        this.f75510j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: D */
    public void m101716D(String str) {
        this.f75507g.put(str);
    }

    /* JADX INFO: renamed from: E */
    public void m101717E(Integer num) {
        this.f75506f.put(num);
    }

    /* JADX INFO: renamed from: F */
    public void m101718F(String str) {
        String str2 = this.f75524x.get();
        this.f75524x.put(str2 + str + Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: G */
    public void m101719G(String str) {
        String str2 = this.f75525y.get();
        this.f75525y.put(str2 + ";;" + str);
    }

    /* JADX INFO: renamed from: H */
    public void m101720H(String str) {
        String str2 = this.f75526z.get();
        this.f75526z.put(str2 + str + Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: a */
    public boolean m101721a() {
        return this.f75502b.get().booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m101722b() {
        return this.f75501a.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m101723c(String str) {
        return !this.f75524x.get().contains(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m101724d() {
        return this.f75520t.get().booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m101725e(String str) {
        return !this.f75526z.get().contains(str);
    }

    /* JADX INFO: renamed from: f */
    public void m101726f() {
        this.f75518r.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public boolean m101727g() {
        return this.f75518r.get().booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public String m101728h() {
        return this.f75519s.get();
    }

    /* JADX INFO: renamed from: i */
    public boolean m101729i() {
        return this.f75504d.get().booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public boolean m101730j() {
        return this.f75503c.get().booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public long m101731k() {
        return this.f75505e.get().longValue();
    }

    /* JADX INFO: renamed from: l */
    public Long m101732l() {
        return this.f75508h.get();
    }

    /* JADX INFO: renamed from: m */
    public long m101733m() {
        return this.f75511k.get().longValue();
    }

    /* JADX INFO: renamed from: n */
    public boolean m101734n() {
        return this.f75510j.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public String m101735o() {
        return this.f75507g.get();
    }

    /* JADX INFO: renamed from: p */
    public int m101736p() {
        return this.f75506f.get().intValue();
    }

    /* JADX INFO: renamed from: q */
    public boolean m101737q(String str) {
        return !this.f75525y.get().contains(str);
    }

    /* JADX INFO: renamed from: r */
    public boolean m101738r() {
        return this.f75509i.get().booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public void m101739s(Long l2) {
        this.f75508h.put(l2);
    }

    /* JADX INFO: renamed from: t */
    public void m101740t() {
        this.f75520t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public void m101741u(Boolean bool) {
        this.f75502b.put(bool);
    }

    /* JADX INFO: renamed from: v */
    public void m101742v(String str) {
        this.f75519s.put(str);
    }

    /* JADX INFO: renamed from: w */
    public void m101743w(Boolean bool) {
        this.f75501a.put(bool);
    }

    /* JADX INFO: renamed from: x */
    public void m101744x(boolean z) {
        if (this.f75504d.get().booleanValue()) {
            return;
        }
        this.f75504d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: y */
    public void m101745y(boolean z) {
        if (this.f75503c.get().booleanValue()) {
            return;
        }
        this.f75503c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: z */
    public void m101746z() {
        this.f75505e.put(Long.valueOf(mqi0.m155944o()));
    }
}
