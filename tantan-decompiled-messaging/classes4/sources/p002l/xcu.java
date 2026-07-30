package p002l;

import android.app.Activity;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.BatteryManager;
import android.os.Process;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.dm70;
import l.e30;
import l.ffw;
import l.gkh0;
import l.grl;
import l.igb0;
import l.jo0;
import l.l3f;
import l.mkd0;
import l.nnn0;
import l.qc10;
import l.qrb;
import l.r1j;
import l.uvr;
import l.vdt;
import l.w9j;
import l.ygy;
import l.ypv;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xcu extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public c4g0 f22220i;

    /* JADX INFO: renamed from: j */
    public c4g0 f22221j;

    /* JADX INFO: renamed from: k */
    public int f22222k;

    /* JADX INFO: renamed from: l */
    public long f22223l;

    /* JADX INFO: renamed from: m */
    public long f22224m;

    /* JADX INFO: renamed from: n */
    public long f22225n;

    /* JADX INFO: renamed from: o */
    public long f22226o;

    /* JADX INFO: renamed from: p */
    public BatteryManager f22227p;

    /* JADX INFO: renamed from: q */
    public final int f22228q;

    public xcu(bsm bsmVar) {
        super(bsmVar);
        this.f22228q = ygy.a(this.f22037f).c;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m25834L3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ Boolean m25841T3(Act.r rVar) {
        return rVar == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.a((Activity) rVar.a.get()));
    }

    /* JADX INFO: renamed from: e4 */
    private void m25844e4() {
        if (uvr.d().q0()) {
            c.just(m25846X3()).observeOn(Schedulers.io()).map(new w9j() { // from class: l.wcu
                public final Object call(Object obj) {
                    return this.f21641a.m25848Z3((HashMap) obj);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.ncu
                public final void call(Object obj) {
                    this.f15949a.m25854g4((HashMap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m25845W3() {
        this.f22224m = TrafficStats.getUidTxBytes(Process.myUid()) - this.f22223l;
        this.f22223l = TrafficStats.getTotalTxBytes();
        this.f22226o = TrafficStats.getTotalRxBytes() - this.f22225n;
        this.f22225n = TrafficStats.getTotalRxBytes();
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v16, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v20, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v24, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v32, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v37, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v59, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public final HashMap<String, Object> m25846X3() {
        igb0 igb0VarMo22656g;
        HashMap<String, Object> map = new HashMap<>();
        try {
            zwl zwlVar = (zwl) m14184F3(new tt00(4500));
            if (zwlVar != null && (igb0VarMo22656g = zwlVar.mo22656g()) != null) {
                map.put("mm_app_cpu", Integer.valueOf(igb0VarMo22656g.a()));
                map.put("mm_sys_cpu", Integer.valueOf(igb0VarMo22656g.b));
                map.put("mm_video_width", Integer.valueOf(igb0VarMo22656g.g()));
                map.put("mm_video_height", Integer.valueOf(igb0VarMo22656g.f()));
                map.put("mm_send_bitrate", Integer.valueOf(igb0VarMo22656g.c()));
                map.put("mm_video_bitrate", Long.valueOf(igb0VarMo22656g.d()));
                map.put("mm_audio_bitrate", Long.valueOf(igb0VarMo22656g.b()));
                map.put("mm_video_frame_rate", Long.valueOf(igb0VarMo22656g.e()));
            }
            map.put("live_room_trace_id", m25547E2().m17247x());
            map.put("liveId", m25547E2().m17235k());
            map.put("roomId", m25547E2().m17239o());
            map.put("anchorId", m25547E2().m14582l0() != null ? ((DbObject) m25547E2().m14582l0()).id : "NA");
            map.put("userid", ypv.a.D0());
            map.put("room_type", m25847Y3());
            map.put("live_role", m25552L2() ? "anchor" : "audience");
            oxl oxlVar = (oxl) m14184F3(new rv00(4500));
            if (oxlVar != null) {
                map.put("push_type", oxlVar.mo14924a().mo5284i1().name());
            }
            map.put("pull_url", m25547E2().m17234j().streamUrl.push);
            map.put("push_url", m25547E2().m17234j().streamUrl.pullFlv);
            map.put("watch_duration", Integer.valueOf(m25547E2().m14593p0()));
            rzv.C0801a c0801aM14585m0 = m25547E2().m14585m0();
            map.put("p_conn_state", c0801aM14585m0.m22181a() == null ? "null" : c0801aM14585m0.m22181a());
            map.put("p_conn_state_duration", Integer.valueOf((int) ((System.currentTimeMillis() - c0801aM14585m0.f18744d) / 1000)));
            if (!TextUtils.isEmpty(c0801aM14585m0.f18743c)) {
                map.put("p_conn_failed_reason", c0801aM14585m0.f18743c);
            }
            map.put("p_conn_url", c0801aM14585m0.f18742b);
            map.put("member_count", Integer.valueOf((int) m25547E2().m17234j().memberCount));
            map.put("reward_count", Long.valueOf((long) m25547E2().m17234j().rewardPoint));
            map.put("live_network_type", ConnectivityReceiver.e());
            map.put("city", ypv.a.V().location.region.city);
            map.put("country", ypv.a.V().location.region.country);
            String str = (String) m14184F3(new qc10(4500));
            if (str != null) {
                map.put("call_id", str);
            }
            String str2 = (String) m14184F3(new dm70(4500));
            if (str2 != null) {
                map.put("pk_id", str2);
            }
            aet aetVar = (aet) m14184F3(new bvj(4500));
            if (aetVar != null) {
                map.put("gift_list_size", Integer.valueOf(aetVar.m9608a()));
            }
            if (!vdt.b(2)) {
                long j = BaseGameHelper.f7017j;
                if (j != 0) {
                    map.put("sud_game_id", Long.valueOf(j));
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        map.toString();
        return map;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m25847Y3() {
        return m25547E2() instanceof nnn0 ? "voiceLive" : "live";
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ HashMap m25848Z3(HashMap map) {
        Act act = act();
        if (act != null) {
            map.put("cpu_usage", Float.valueOf(qrb.b()));
            map.put("mem_usage", Integer.valueOf(ygy.a(act).c / 1000));
            map.put("live_ui_frame_rate", Integer.valueOf(this.f22222k));
            if (this.f22227p == null) {
                this.f22227p = (BatteryManager) act.getSystemService("batterymanager");
            }
            map.put("battery", Integer.valueOf(this.f22227p.getIntProperty(4)));
            map.put("temperature", Integer.valueOf((int) m25855h4(0)));
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m25849a4(iqv iqvVar) {
        gkh0.k("liveType =" + m25847Y3() + ",liveId = " + m25547E2().m17235k() + ", liveState = " + iqvVar, new String[]{"[live][state]", "[change]"});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m25850b4(NetworkInfo networkInfo) {
        gkh0.k("liveType =" + m25847Y3() + ",liveId = " + m25547E2().m17235k() + ", netConfig = " + networkInfo.toString(), new String[]{"[live][room][net]", "[change]"});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m25851c4(Boolean bool) {
        m25853f4(m25547E2().m17234j(), bool.booleanValue());
        if (bool.booleanValue()) {
            gkh0.j("[live][app][foreground_change]", "liveType =" + m25847Y3() + ",liveId = " + m25547E2().m17235k() + ", enter foreground");
            return;
        }
        gkh0.j("[live][app][foreground_change]", "liveType =" + m25847Y3() + ",liveId = " + m25547E2().m17235k() + ", enter background");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m25852d4(Long l2) {
        m25845W3();
        if (l2.longValue() % ((long) uvr.d().r0()) == 0) {
            m25844e4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m25853f4(BLiveAbsData bLiveAbsData, final boolean z) {
        eet.m12448b(this, m25552L2() ? "anchor_switch_foreground" : "audience_switch_foreground", new e30() { // from class: l.vcu
            public final void call(Object obj) {
                ((Map) obj).put("foreground", Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m25854g4(HashMap<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.n = "";
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = "e_live_livingroom_state";
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: h4 */
    public float m25855h4(int i) {
        try {
            Process processExec = Runtime.getRuntime().exec("cat sys/class/thermal/thermal_zone" + i + "/temp");
            processExec.waitFor();
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            if (line != null) {
                return Float.parseFloat(line) / 1000.0f;
            }
            return 51.0f;
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0.0f;
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f22220i);
        mkd0.z(this.f22221j);
        FpsMonitor.x().b("LiveTraceModel");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m25856t() {
        super.t();
        duringCreated(m25547E2().f14866b).subscribe(ffw.h(new e30() { // from class: l.mcu
            public final void call(Object obj) {
                this.f15341a.m25849a4((iqv) obj);
            }
        }));
        duringCreated(m25547E2().m14491B0()).subscribe(ffw.d(new e30() { // from class: l.ocu
            public final void call(Object obj) {
                gkh0.k("longlink state changed,connect:" + ((Boolean) obj), new String[]{"[live]long_link_status", "[change]"});
            }
        }));
        duringCreated(m14193k3()).filter(new w9j() { // from class: l.pcu
            public final Object call(Object obj) {
                return Boolean.valueOf(((NetworkInfo) obj) != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.qcu
            public final void call(Object obj) {
                this.f17908a.m25850b4((NetworkInfo) obj);
            }
        }));
        this.f22220i = Act.foreground().map(new w9j() { // from class: l.rcu
            public final Object call(Object obj) {
                return xcu.m25841T3((Act.r) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.H(new e30() { // from class: l.scu
            public final void call(Object obj) {
                this.f18927a.m25851c4((Boolean) obj);
            }
        }, new e30() { // from class: l.tcu
            public final void call(Object obj) {
                xcu.m25834L3((Throwable) obj);
            }
        }));
        this.f22221j = c.interval(2L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.ucu
            public final void call(Object obj) {
                this.f20589a.m25852d4((Long) obj);
            }
        }));
        FpsMonitor.x().h("LiveTraceModel", new C0896a());
    }

    /* JADX INFO: renamed from: l.xcu$a */
    public class C0896a implements grl<r1j> {
        public C0896a() {
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m25858b(r1j r1jVar, String str) {
            xcu.this.f22222k = r1jVar.a;
        }

        /* JADX INFO: renamed from: a */
        public void m25857a(String str) {
        }
    }
}
