package p153l;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.BatteryManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class yeu extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public kcg0 f199405i;

    /* JADX INFO: renamed from: j */
    public kcg0 f199406j;

    /* JADX INFO: renamed from: k */
    public int f199407k;

    /* JADX INFO: renamed from: l */
    public long f199408l;

    /* JADX INFO: renamed from: m */
    public long f199409m;

    /* JADX INFO: renamed from: n */
    public long f199410n;

    /* JADX INFO: renamed from: o */
    public long f199411o;

    /* JADX INFO: renamed from: p */
    public BatteryManager f199412p;

    /* JADX INFO: renamed from: q */
    public final int f199413q;

    public yeu(dum dumVar) {
        super(dumVar);
        this.f199413q = vpy.m202349a(this.f196919f).f95428c;
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m215454L3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ Boolean m215461T3(Act.C4450r c4450r) {
        return c4450r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m82486a(c4450r.f16062a.get()));
    }

    /* JADX INFO: renamed from: e4 */
    private void m215464e4() {
        if (vxr.m203876d().m171018q0()) {
            C22421c.just(m215466X3()).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.xeu
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f193978a.m215468Z3((HashMap) obj);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.oeu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147014a.m215474g4((HashMap) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m215465W3() {
        this.f199409m = TrafficStats.getUidTxBytes(Process.myUid()) - this.f199408l;
        this.f199408l = TrafficStats.getTotalTxBytes();
        this.f199411o = TrafficStats.getTotalRxBytes() - this.f199410n;
        this.f199410n = TrafficStats.getTotalRxBytes();
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v16, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v20, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v24, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v32, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v37, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v59, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.oo2] */
    /* JADX INFO: renamed from: X3 */
    public final HashMap<String, Object> m215466X3() {
        mob0 mob0VarMo101589g;
        HashMap<String, Object> map = new HashMap<>();
        try {
            szl szlVar = (szl) m138856F3(new c210(4500));
            if (szlVar != null && (mob0VarMo101589g = szlVar.mo101589g()) != null) {
                map.put("mm_app_cpu", Integer.valueOf(mob0VarMo101589g.m159244a()));
                map.put("mm_sys_cpu", Integer.valueOf(mob0VarMo101589g.f137809b));
                map.put("mm_video_width", Integer.valueOf(mob0VarMo101589g.m159250g()));
                map.put("mm_video_height", Integer.valueOf(mob0VarMo101589g.m159249f()));
                map.put("mm_send_bitrate", Integer.valueOf(mob0VarMo101589g.m159246c()));
                map.put("mm_video_bitrate", Long.valueOf(mob0VarMo101589g.m159247d()));
                map.put("mm_audio_bitrate", Long.valueOf(mob0VarMo101589g.m159245b()));
                map.put("mm_video_frame_rate", Long.valueOf(mob0VarMo101589g.m159248e()));
            }
            map.put("live_room_trace_id", m213810E2().m202200x());
            map.put("liveId", m213810E2().m202191k());
            map.put("roomId", m213810E2().m202194o());
            map.put("anchorId", m213810E2().m168532l0() != null ? m213810E2().m168532l0().f56859id : "NA");
            map.put(UserId.TYPE, zrv.f205799a.m207631D0());
            map.put("room_type", m215467Y3());
            map.put("live_role", m213815L2() ? "anchor" : "audience");
            h0m h0mVar = (h0m) m138856F3(new z310(4500));
            if (h0mVar != null) {
                map.put("push_type", h0mVar.mo133182a().mo73088i1().name());
            }
            map.put("pull_url", m213810E2().mo183435j().streamUrl.push);
            map.put("push_url", m213810E2().mo183435j().streamUrl.pullFlv);
            map.put("watch_duration", Integer.valueOf(m213810E2().m168542p0()));
            p1w.C19272a c19272aM168535m0 = m213810E2().m168535m0();
            map.put("p_conn_state", c19272aM168535m0.m170293a() == null ? "null" : c19272aM168535m0.m170293a());
            map.put("p_conn_state_duration", Integer.valueOf((int) ((System.currentTimeMillis() - c19272aM168535m0.f150215d) / 1000)));
            if (!TextUtils.isEmpty(c19272aM168535m0.f150214c)) {
                map.put("p_conn_failed_reason", c19272aM168535m0.f150214c);
            }
            map.put("p_conn_url", c19272aM168535m0.f150213b);
            map.put("member_count", Integer.valueOf((int) m213810E2().mo183435j().memberCount));
            map.put("reward_count", Long.valueOf((long) m213810E2().mo183435j().rewardPoint));
            map.put("live_network_type", ConnectivityReceiver.m82465e());
            map.put(RankLevel.city, zrv.f205799a.m207651V().location.region.city);
            map.put("country", zrv.f205799a.m207651V().location.region.country);
            String str = (String) m138856F3(new al10(4500));
            if (str != null) {
                map.put("call_id", str);
            }
            String str2 = (String) m138856F3(new ju70(4500));
            if (str2 != null) {
                map.put("pk_id", str2);
            }
            bgt bgtVar = (bgt) m138856F3(new rxj(4500));
            if (bgtVar != null) {
                map.put("gift_list_size", Integer.valueOf(bgtVar.m104237a()));
            }
            if (!wft.m206159b(2)) {
                long j = BaseGameHelper.f51823j;
                if (j != 0) {
                    map.put("sud_game_id", Long.valueOf(j));
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        map.toString();
        return map;
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m215467Y3() {
        return m213810E2() instanceof rwn0 ? BLiveType.voiceLive : "live";
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ HashMap m215468Z3(HashMap map) {
        Act act = act();
        if (act != null) {
            map.put("cpu_usage", Float.valueOf(etb.m122431b()));
            map.put("mem_usage", Integer.valueOf(vpy.m202349a(act).f95428c / 1000));
            map.put("live_ui_frame_rate", Integer.valueOf(this.f199407k));
            if (this.f199412p == null) {
                this.f199412p = (BatteryManager) act.getSystemService("batterymanager");
            }
            map.put("battery", Integer.valueOf(this.f199412p.getIntProperty(4)));
            map.put("temperature", Integer.valueOf((int) m215475h4(0)));
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m215469a4(jsv jsvVar) {
        nsh0.m164609k("liveType =" + m215467Y3() + ",liveId = " + m213810E2().m202191k() + ", liveState = " + jsvVar, "[live][state]", "[change]");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m215470b4(NetworkInfo networkInfo) {
        nsh0.m164609k("liveType =" + m215467Y3() + ",liveId = " + m213810E2().m202191k() + ", netConfig = " + networkInfo.toString(), "[live][room][net]", "[change]");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m215471c4(Boolean bool) {
        m215473f4(m213810E2().mo183435j(), bool.booleanValue());
        if (bool.booleanValue()) {
            nsh0.m164608j("[live][app][foreground_change]", "liveType =" + m215467Y3() + ",liveId = " + m213810E2().m202191k() + ", enter foreground");
            return;
        }
        nsh0.m164608j("[live][app][foreground_change]", "liveType =" + m215467Y3() + ",liveId = " + m213810E2().m202191k() + ", enter background");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m215472d4(Long l2) {
        m215465W3();
        if (l2.longValue() % ((long) vxr.m203876d().m171020r0()) == 0) {
            m215464e4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m215473f4(BLiveAbsData bLiveAbsData, final boolean z) {
        fgt.m125530b(this, m213815L2() ? "anchor_switch_foreground" : "audience_switch_foreground", new y20() { // from class: l.weu
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put(DownloadService.KEY_FOREGROUND, Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m215474g4(HashMap<String, Object> map) {
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "";
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = "e_live_livingroom_state";
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: h4 */
    public float m215475h4(int i) {
        try {
            Process processExec = Runtime.getRuntime().exec("cat sys/class/thermal/thermal_zone" + i + "/temp");
            processExec.waitFor();
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            if (line != null) {
                return Float.parseFloat(line) / 1000.0f;
            }
            return 51.0f;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0.0f;
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f199405i);
        psd0.m173633z(this.f199406j);
        FpsMonitor.m82314x().mo82318b("LiveTraceModel");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().f185208b).subscribe(dhw.m115829h(new y20() { // from class: l.neu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141685a.m215469a4((jsv) obj);
            }
        }));
        duringCreated(m213810E2().m168446B0()).subscribe(dhw.m115825d(new y20() { // from class: l.peu
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164609k("longlink state changed,connect:" + ((Boolean) obj), "[live]long_link_status", "[change]");
            }
        }));
        duringCreated(m138865k3()).filter(new qcj() { // from class: l.qeu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((NetworkInfo) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.reu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162689a.m215470b4((NetworkInfo) obj);
            }
        }));
        this.f199405i = Act.foreground().map(new qcj() { // from class: l.seu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yeu.m215461T3((Act.C4450r) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.teu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173895a.m215471c4((Boolean) obj);
            }
        }, new y20() { // from class: l.ueu
            @Override // p153l.y20
            public final void call(Object obj) {
                yeu.m215454L3((Throwable) obj);
            }
        }));
        this.f199406j = C22421c.interval(2L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.veu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183848a.m215472d4((Long) obj);
            }
        }));
        FpsMonitor.m82314x().mo82323h("LiveTraceModel", new C21566a());
    }

    /* JADX INFO: renamed from: l.yeu$a */
    public class C21566a implements utl<m4j> {
        public C21566a() {
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo82334b(m4j m4jVar, String str) {
            yeu.this.f199407k = m4jVar.f134804a;
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: a */
        public void mo82333a(String str) {
        }
    }
}
