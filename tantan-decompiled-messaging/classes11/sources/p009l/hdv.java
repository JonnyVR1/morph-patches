package p009l;

import com.p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import java.util.HashSet;
import l.dqd0;
import l.hpd0;
import l.pht;
import l.tpd0;
import l.vqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hdv {

    /* JADX INFO: renamed from: a */
    public vqd0 f13988a = new vqd0("live_magic_gesture_selected_record_" + ypv.f23196a.m23619D0(), new HashSet());

    /* JADX INFO: renamed from: b */
    public zpd0 f13989b = new zpd0("live_enter_room_time_" + ypv.f23196a.m23619D0(), 0L);

    /* JADX INFO: renamed from: c */
    public zpd0 f13990c = new zpd0("first_live_enter_room_time_" + ypv.f23196a.m23619D0(), 0L);

    /* JADX INFO: renamed from: d */
    public pht f13991d = new pht("multi_call_asset_" + ypv.f23196a.m23619D0(), (BLiveMultiCallAsset) null);

    /* JADX INFO: renamed from: e */
    public final zpd0 f13992e = new zpd0("multi_call_stay_show_time_" + ypv.f23196a.m23619D0(), 0L);

    /* JADX INFO: renamed from: f */
    public final hpd0 f13993f;

    /* JADX INFO: renamed from: g */
    public final tpd0 f13994g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f13995h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f13996i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f13997j;

    /* JADX INFO: renamed from: k */
    public final hpd0 f13998k;

    /* JADX INFO: renamed from: l */
    public final hpd0 f13999l;

    /* JADX INFO: renamed from: m */
    public final hpd0 f14000m;

    /* JADX INFO: renamed from: n */
    public final tpd0 f14001n;

    /* JADX INFO: renamed from: o */
    public final hpd0 f14002o;

    /* JADX INFO: renamed from: p */
    public final hpd0 f14003p;

    /* JADX INFO: renamed from: q */
    public final hpd0 f14004q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f14005r;

    /* JADX INFO: renamed from: s */
    public dqd0 f14006s;

    /* JADX INFO: renamed from: t */
    public hpd0 f14007t;

    /* JADX INFO: renamed from: u */
    public zpd0 f14008u;

    /* JADX INFO: renamed from: v */
    public hpd0 f14009v;

    public hdv() {
        String str = "multi_call_match_stay_not_show_" + ypv.f23196a.m23619D0();
        Boolean bool = Boolean.FALSE;
        this.f13993f = new hpd0(str, bool);
        this.f13994g = new tpd0("multiCallEntryUpgradeShowCount_" + ypv.f23196a.m23619D0(), 0);
        this.f13995h = new zpd0("multiCallEntryUpgradeShowTime_" + ypv.f23196a.m23619D0(), 0L);
        String str2 = "switch_gift_" + ypv.f23196a.m23619D0();
        Boolean bool2 = Boolean.TRUE;
        this.f13996i = new hpd0(str2, bool2);
        this.f13997j = new hpd0("has_gift_effect_switch_" + ypv.f23196a.m23619D0(), bool);
        this.f13998k = new hpd0("switch_gift_live_" + ypv.f23196a.m23619D0(), bool);
        this.f13999l = new hpd0("has_gift_effect_switch_live_" + ypv.f23196a.m23619D0(), bool);
        this.f14000m = new hpd0("live_pk_mute_confirm_show" + ypv.f23196a.m23619D0(), bool2);
        this.f14001n = new tpd0("live_pk_mute_icon_bubble_show_num" + ypv.f23196a.m23619D0(), 0);
        this.f14002o = new hpd0("has_show_voice_functions_dialog_" + ypv.f23196a.m23619D0(), bool);
        this.f14003p = new hpd0("has_show_share_screen_volume_tip" + ypv.f23196a.m23619D0(), bool);
        this.f14004q = new hpd0("has_show_grow_dot_" + ypv.f23196a.m23619D0(), bool);
        this.f14005r = new hpd0("has_show_dash_dot_" + ypv.f23196a.m23619D0(), bool);
        this.f14006s = new dqd0("live_small_window_local_position_" + ypv.f23196a.m23619D0());
        this.f14007t = new hpd0("live_voice_mute_v2_" + ypv.f23196a.m23619D0(), bool);
        this.f14008u = new zpd0("small_float_alert_time_" + ypv.f23196a.m23619D0(), 0L);
        this.f14009v = new hpd0("hadShowVoiceAuctionShipOperationTip_" + ypv.f23196a.m23619D0(), bool);
    }
}
