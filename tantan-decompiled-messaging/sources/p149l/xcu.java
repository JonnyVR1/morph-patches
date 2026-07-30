package p149l;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.BatteryManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class xcu extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public c4g0 f192257i;

    /* JADX INFO: renamed from: j */
    public c4g0 f192258j;

    /* JADX INFO: renamed from: k */
    public int f192259k;

    /* JADX INFO: renamed from: l */
    public long f192260l;

    /* JADX INFO: renamed from: m */
    public long f192261m;

    /* JADX INFO: renamed from: n */
    public long f192262n;

    /* JADX INFO: renamed from: o */
    public long f192263o;

    /* JADX INFO: renamed from: p */
    public BatteryManager f192264p;

    /* JADX INFO: renamed from: q */
    public final int f192265q;

    public xcu(bsm bsmVar) {
        super(bsmVar);
        this.f192265q = ygy.m214780a(this.f188513f).f107861c;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m208135L3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ Boolean m208142T3(Act.C4299r c4299r) {
        return c4299r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m81303a(c4299r.f15343a.get()));
    }

    /* JADX INFO: renamed from: e4 */
    private void m208145e4() {
        if (uvr.m196087d().m162711q0()) {
            C22306c.just(m208147X3()).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.wcu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f185718a.m208149Z3((HashMap) obj);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.ncu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138230a.m208155g4((HashMap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m208146W3() {
        this.f192261m = TrafficStats.getUidTxBytes(Process.myUid()) - this.f192260l;
        this.f192260l = TrafficStats.getTotalTxBytes();
        this.f192263o = TrafficStats.getTotalRxBytes() - this.f192262n;
        this.f192262n = TrafficStats.getTotalRxBytes();
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
    public final HashMap<String, Object> m208147X3() {
        igb0 igb0VarMo185826g;
        HashMap<String, Object> map = new HashMap<>();
        try {
            zwl zwlVar = (zwl) m129297F3(new tt00(4500));
            if (zwlVar != null && (igb0VarMo185826g = zwlVar.mo185826g()) != null) {
                map.put("mm_app_cpu", Integer.valueOf(igb0VarMo185826g.m135966a()));
                map.put("mm_sys_cpu", Integer.valueOf(igb0VarMo185826g.f113097b));
                map.put("mm_video_width", Integer.valueOf(igb0VarMo185826g.m135972g()));
                map.put("mm_video_height", Integer.valueOf(igb0VarMo185826g.m135971f()));
                map.put("mm_send_bitrate", Integer.valueOf(igb0VarMo185826g.m135968c()));
                map.put("mm_video_bitrate", Long.valueOf(igb0VarMo185826g.m135969d()));
                map.put("mm_audio_bitrate", Long.valueOf(igb0VarMo185826g.m135967b()));
                map.put("mm_video_frame_rate", Long.valueOf(igb0VarMo185826g.m135970e()));
            }
            map.put("live_room_trace_id", m206027E2().m149826x());
            map.put("liveId", m206027E2().m149814k());
            map.put("roomId", m206027E2().m149818o());
            map.put("anchorId", m206027E2().m132146l0() != null ? m206027E2().m132146l0().f56011id : "NA");
            map.put(UserId.TYPE, ypv.f199493a.m199309D0());
            map.put("room_type", m208148Y3());
            map.put("live_role", m206032L2() ? "anchor" : "audience");
            oxl oxlVar = (oxl) m129297F3(new rv00(4500));
            if (oxlVar != null) {
                map.put("push_type", oxlVar.mo133471a().mo71905i1().name());
            }
            map.put("pull_url", m206027E2().mo149813j().streamUrl.push);
            map.put("push_url", m206027E2().mo149813j().streamUrl.pullFlv);
            map.put("watch_duration", Integer.valueOf(m206027E2().m132157p0()));
            rzv.C19818a c19818aM132149m0 = m206027E2().m132149m0();
            map.put("p_conn_state", c19818aM132149m0.m181798a() == null ? "null" : c19818aM132149m0.m181798a());
            map.put("p_conn_state_duration", Integer.valueOf((int) ((System.currentTimeMillis() - c19818aM132149m0.f161704d) / 1000)));
            if (!TextUtils.isEmpty(c19818aM132149m0.f161703c)) {
                map.put("p_conn_failed_reason", c19818aM132149m0.f161703c);
            }
            map.put("p_conn_url", c19818aM132149m0.f161702b);
            map.put("member_count", Integer.valueOf((int) m206027E2().mo149813j().memberCount));
            map.put("reward_count", Long.valueOf((long) m206027E2().mo149813j().rewardPoint));
            map.put("live_network_type", ConnectivityReceiver.m81282e());
            map.put(RankLevel.city, ypv.f199493a.m199329V().location.region.city);
            map.put("country", ypv.f199493a.m199329V().location.region.country);
            String str = (String) m129297F3(new qc10(4500));
            if (str != null) {
                map.put("call_id", str);
            }
            String str2 = (String) m129297F3(new dm70(4500));
            if (str2 != null) {
                map.put("pk_id", str2);
            }
            aet aetVar = (aet) m129297F3(new bvj(4500));
            if (aetVar != null) {
                map.put("gift_list_size", Integer.valueOf(aetVar.m96127a()));
            }
            if (!vdt.m198092b(2)) {
                long j = BaseGameHelper.f50975j;
                if (j != 0) {
                    map.put("sud_game_id", Long.valueOf(j));
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        map.toString();
        return map;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m208148Y3() {
        return m206027E2() instanceof nnn0 ? BLiveType.voiceLive : "live";
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ HashMap m208149Z3(HashMap map) {
        Act act = act();
        if (act != null) {
            map.put("cpu_usage", Float.valueOf(qrb.m175982b()));
            map.put("mem_usage", Integer.valueOf(ygy.m214780a(act).f107861c / 1000));
            map.put("live_ui_frame_rate", Integer.valueOf(this.f192259k));
            if (this.f192264p == null) {
                this.f192264p = (BatteryManager) act.getSystemService("batterymanager");
            }
            map.put("battery", Integer.valueOf(this.f192264p.getIntProperty(4)));
            map.put("temperature", Integer.valueOf((int) m208156h4(0)));
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m208150a4(iqv iqvVar) {
        gkh0.m126628k("liveType =" + m208148Y3() + ",liveId = " + m206027E2().m149814k() + ", liveState = " + iqvVar, "[live][state]", "[change]");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m208151b4(NetworkInfo networkInfo) {
        gkh0.m126628k("liveType =" + m208148Y3() + ",liveId = " + m206027E2().m149814k() + ", netConfig = " + networkInfo.toString(), "[live][room][net]", "[change]");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m208152c4(Boolean bool) {
        m208154f4(m206027E2().mo149813j(), bool.booleanValue());
        if (bool.booleanValue()) {
            gkh0.m126627j("[live][app][foreground_change]", "liveType =" + m208148Y3() + ",liveId = " + m206027E2().m149814k() + ", enter foreground");
            return;
        }
        gkh0.m126627j("[live][app][foreground_change]", "liveType =" + m208148Y3() + ",liveId = " + m206027E2().m149814k() + ", enter background");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m208153d4(Long l2) {
        m208146W3();
        if (l2.longValue() % ((long) uvr.m196087d().m162713r0()) == 0) {
            m208145e4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m208154f4(BLiveAbsData bLiveAbsData, final boolean z) {
        eet.m116003b(this, m206032L2() ? "anchor_switch_foreground" : "audience_switch_foreground", new e30() { // from class: l.vcu
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put(DownloadService.KEY_FOREGROUND, Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m208155g4(HashMap<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "";
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = "e_live_livingroom_state";
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: h4 */
    public float m208156h4(int i) {
        try {
            Process processExec = Runtime.getRuntime().exec("cat sys/class/thermal/thermal_zone" + i + "/temp");
            processExec.waitFor();
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            if (line != null) {
                return Float.parseFloat(line) / 1000.0f;
            }
            return 51.0f;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0.0f;
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f192257i);
        mkd0.m154992z(this.f192258j);
        FpsMonitor.m81131x().mo81135b("LiveTraceModel");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().f128033b).subscribe(ffw.m121197h(new e30() { // from class: l.mcu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133187a.m208150a4((iqv) obj);
            }
        }));
        duringCreated(m206027E2().m132056B0()).subscribe(ffw.m121193d(new e30() { // from class: l.ocu
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126628k("longlink state changed,connect:" + ((Boolean) obj), "[live]long_link_status", "[change]");
            }
        }));
        duringCreated(m129306k3()).filter(new w9j() { // from class: l.pcu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((NetworkInfo) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.qcu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153821a.m208151b4((NetworkInfo) obj);
            }
        }));
        this.f192257i = Act.foreground().map(new w9j() { // from class: l.rcu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xcu.m208142T3((Act.C4299r) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.scu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163769a.m208152c4((Boolean) obj);
            }
        }, new e30() { // from class: l.tcu
            @Override // p149l.e30
            public final void call(Object obj) {
                xcu.m208135L3((Throwable) obj);
            }
        }));
        this.f192258j = C22306c.interval(2L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ucu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175864a.m208153d4((Long) obj);
            }
        }));
        FpsMonitor.m81131x().mo81140h("LiveTraceModel", new C21085a());
    }

    /* JADX INFO: renamed from: l.xcu$a */
    public class C21085a implements grl<r1j> {
        public C21085a() {
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo81151b(r1j r1jVar, String str) {
            xcu.this.f192259k = r1jVar.f157281a;
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: a */
        public void mo81150a(String str) {
        }
    }
}
