package p009l;

import com.p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import com.p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import java.util.HashSet;
import l.hpd0;
import l.tpd0;
import l.uqd0;
import l.vpd0;
import l.vqd0;
import l.wpd0;
import l.x9p;
import l.xpd0;
import l.y9p;
import l.ypd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bgv {

    /* JADX INFO: renamed from: A */
    public StringBuilder f10075A;

    /* JADX INFO: renamed from: a */
    public final hpd0 f10076a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f10077b;

    /* JADX INFO: renamed from: c */
    public final hpd0 f10078c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f10079d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f10080e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f10081f;

    /* JADX INFO: renamed from: g */
    public final uqd0 f10082g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f10083h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f10084i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f10085j;

    /* JADX INFO: renamed from: k */
    public final zpd0 f10086k;

    /* JADX INFO: renamed from: l */
    public final ypd0 f10087l;

    /* JADX INFO: renamed from: m */
    public final xpd0 f10088m;

    /* JADX INFO: renamed from: n */
    public final vpd0 f10089n;

    /* JADX INFO: renamed from: o */
    public final wpd0 f10090o;

    /* JADX INFO: renamed from: p */
    public final vqd0 f10091p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f10092q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f10093r;

    /* JADX INFO: renamed from: s */
    public final uqd0 f10094s;

    /* JADX INFO: renamed from: t */
    public final hpd0 f10095t;

    /* JADX INFO: renamed from: u */
    public final y9p f10096u;

    /* JADX INFO: renamed from: v */
    public final x9p f10097v;

    /* JADX INFO: renamed from: w */
    public final hpd0 f10098w;

    /* JADX INFO: renamed from: x */
    public final uqd0 f10099x;

    /* JADX INFO: renamed from: y */
    public final uqd0 f10100y;

    /* JADX INFO: renamed from: z */
    public final uqd0 f10101z;

    public bgv() {
        String str = "first_dialog_show" + ypv.f23196a.m23619D0();
        Boolean bool = Boolean.TRUE;
        this.f10076a = new hpd0(str, bool);
        this.f10077b = new hpd0("send_gift_confirm_dialog_show" + ypv.f23196a.m23619D0(), bool);
        String str2 = "is_live_paid_user" + ypv.f23196a.m23619D0();
        Boolean bool2 = Boolean.FALSE;
        this.f10078c = new hpd0(str2, bool2);
        this.f10079d = new hpd0("is_first_recharge_dialog_show" + ypv.f23196a.m23619D0(), bool2);
        this.f10080e = new zpd0("latest_send_live_gift_time" + ypv.f23196a.m23619D0(), 0L);
        this.f10081f = new tpd0("live_treasure_watch_live_seconds" + ypv.f23196a.m23619D0(), 0);
        this.f10082g = new uqd0("live_treasure_box_status" + ypv.f23196a.m23619D0(), "created");
        this.f10083h = new zpd0("live_package_gift_latest_update_time" + ypv.f23196a.m23619D0(), 0L);
        this.f10084i = new hpd0("live_packet_gift_action_show" + ypv.f23196a.m23619D0(), bool2);
        this.f10085j = new hpd0("live_unit_switch_star" + ypv.f23196a.m23619D0(), bool2);
        this.f10086k = new zpd0("live_gift_send_notice_last_show_timestamp" + ypv.f23196a.m23619D0(), 0L);
        this.f10087l = new ypd0("live_resource_cdn_info_" + ypv.f23196a.m23619D0(), (BLiveResourceCDN) null);
        this.f10088m = new xpd0("live_resource_" + ypv.f23196a.m23619D0(), (BLiveResourceInfo) null);
        this.f10089n = new vpd0("live_gift_item_" + ypv.f23196a.m23619D0(), (BLiveGiftsFromCdnWarpData) null);
        this.f10090o = new wpd0("live_medals_item_" + ypv.f23196a.m23619D0(), (BLiveModelsFromCdnWarpData) null);
        this.f10091p = new vqd0("gift_notice_not_show_" + ypv.f23196a.m23619D0(), new HashSet());
        this.f10092q = new tpd0("live_guide_gift_show_time" + ypv.f23196a.m23619D0(), 0);
        this.f10093r = new hpd0("live_whole_mike_alert_dialog_show" + ypv.f23196a.m23619D0(), bool);
        this.f10094s = new uqd0("live_consume_alert_status" + ypv.f23196a.m23619D0(), "");
        this.f10095t = new hpd0("live_packet_progress_tips_show" + ypv.f23196a.m23619D0(), bool);
        this.f10096u = new y9p("intl_live_template_cdn_info", (BLiveIntlLiveTemplatesCdnData) null);
        this.f10097v = new x9p("intl_live_template", (BLiveIntlTemplateData) null);
        this.f10098w = new hpd0("intl_sud_game_first_load" + ypv.f23196a.m23619D0(), bool);
        this.f10099x = new uqd0("intl_game_board_item_" + ypv.f23196a.m23619D0(), "");
        this.f10100y = new uqd0("intl_octopus_game_load_history" + ypv.f23196a.m23619D0(), "");
        this.f10101z = new uqd0("virtual_square_tab_show_dot" + ypv.f23196a.m23619D0(), "");
        this.f10075A = new StringBuilder();
    }

    /* JADX INFO: renamed from: A */
    public void m11997A(long j) {
        this.f10086k.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: B */
    public void m11998B() {
        this.f10084i.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C */
    public void m11999C(boolean z) {
        this.f10085j.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: D */
    public void m12000D(String str) {
        this.f10082g.put(str);
    }

    /* JADX INFO: renamed from: E */
    public void m12001E(Integer num) {
        this.f10081f.put(num);
    }

    /* JADX INFO: renamed from: F */
    public void m12002F(String str) {
        String str2 = (String) this.f10099x.get();
        this.f10099x.put(str2 + str + ";");
    }

    /* JADX INFO: renamed from: G */
    public void m12003G(String str) {
        String str2 = (String) this.f10100y.get();
        this.f10100y.put(str2 + ";;" + str);
    }

    /* JADX INFO: renamed from: H */
    public void m12004H(String str) {
        String str2 = (String) this.f10101z.get();
        this.f10101z.put(str2 + str + ";");
    }

    /* JADX INFO: renamed from: a */
    public boolean m12005a() {
        return ((Boolean) this.f10077b.get()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m12006b() {
        return ((Boolean) this.f10076a.get()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m12007c(String str) {
        return !((String) this.f10099x.get()).contains(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m12008d() {
        return ((Boolean) this.f10095t.get()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m12009e(String str) {
        return !((String) this.f10101z.get()).contains(str);
    }

    /* JADX INFO: renamed from: f */
    public void m12010f() {
        this.f10093r.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public boolean m12011g() {
        return ((Boolean) this.f10093r.get()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public String m12012h() {
        return (String) this.f10094s.get();
    }

    /* JADX INFO: renamed from: i */
    public boolean m12013i() {
        return ((Boolean) this.f10079d.get()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public boolean m12014j() {
        return ((Boolean) this.f10078c.get()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public long m12015k() {
        return ((Long) this.f10080e.get()).longValue();
    }

    /* JADX INFO: renamed from: l */
    public Long m12016l() {
        return (Long) this.f10083h.get();
    }

    /* JADX INFO: renamed from: m */
    public long m12017m() {
        return ((Long) this.f10086k.get()).longValue();
    }

    /* JADX INFO: renamed from: n */
    public boolean m12018n() {
        return ((Boolean) this.f10085j.get()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public String m12019o() {
        return (String) this.f10082g.get();
    }

    /* JADX INFO: renamed from: p */
    public int m12020p() {
        return ((Integer) this.f10081f.get()).intValue();
    }

    /* JADX INFO: renamed from: q */
    public boolean m12021q(String str) {
        return !((String) this.f10100y.get()).contains(str);
    }

    /* JADX INFO: renamed from: r */
    public boolean m12022r() {
        return ((Boolean) this.f10084i.get()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public void m12023s(Long l2) {
        this.f10083h.put(l2);
    }

    /* JADX INFO: renamed from: t */
    public void m12024t() {
        this.f10095t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public void m12025u(Boolean bool) {
        this.f10077b.put(bool);
    }

    /* JADX INFO: renamed from: v */
    public void m12026v(String str) {
        this.f10094s.put(str);
    }

    /* JADX INFO: renamed from: w */
    public void m12027w(Boolean bool) {
        this.f10076a.put(bool);
    }

    /* JADX INFO: renamed from: x */
    public void m12028x(boolean z) {
        if (((Boolean) this.f10079d.get()).booleanValue()) {
            return;
        }
        this.f10079d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: y */
    public void m12029y(boolean z) {
        if (((Boolean) this.f10078c.get()).booleanValue()) {
            return;
        }
        this.f10078c.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: z */
    public void m12030z() {
        this.f10080e.put(Long.valueOf(mqi0.m18550o()));
    }
}
