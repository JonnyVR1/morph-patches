package com.p051p1.mobile.putong.live.livingroom.util.pref;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.byd0;
import p153l.d3t;
import p153l.hxd0;
import p153l.jxd0;
import p153l.jyb;
import p153l.pxd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rcj;
import p153l.vxd0;
import p153l.wyd0;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class LiveWatchCounter {

    /* JADX INFO: renamed from: a */
    public byd0 f52659a;

    /* JADX INFO: renamed from: b */
    public pxd0<ValidWatchedAnchorData> f52660b;

    /* JADX INFO: renamed from: c */
    public pxd0<WatchedDurationData> f52661c;

    /* JADX INFO: renamed from: d */
    public vxd0 f52662d;

    /* JADX INFO: renamed from: e */
    public wyd0 f52663e;

    /* JADX INFO: renamed from: f */
    public byd0 f52664f;

    /* JADX INFO: renamed from: g */
    public long f52665g;

    /* JADX INFO: renamed from: h */
    public String f52666h;

    /* JADX INFO: renamed from: i */
    public jxd0 f52667i;

    public static final class ValidWatchedAnchorData implements pxd0.InterfaceC19463a<ValidWatchedAnchorData>, Serializable {
        private TreeMap<String, HashSet<String>> treeMap;

        private ValidWatchedAnchorData(TreeMap<String, HashSet<String>> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p153l.pxd0.InterfaceC19463a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.pxd0.InterfaceC19463a
        public ValidWatchedAnchorData trimAndCopy() {
            d3t.m113901d(this.treeMap, 15, false);
            return new ValidWatchedAnchorData(this.treeMap);
        }
    }

    public static final class WatchedDurationData implements pxd0.InterfaceC19463a<WatchedDurationData>, Serializable {
        private TreeMap<String, Long> treeMap;

        private WatchedDurationData(TreeMap<String, Long> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p153l.pxd0.InterfaceC19463a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.pxd0.InterfaceC19463a
        public WatchedDurationData trimAndCopy() {
            d3t.m113901d(this.treeMap, 15, false);
            return new WatchedDurationData(this.treeMap);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter$a */
    public static final class C13076a {

        /* JADX INFO: renamed from: a */
        public static final LiveWatchCounter f52668a = new LiveWatchCounter();
    }

    public LiveWatchCounter() {
        this.f52665g = pzi0.m174453n();
        this.f52666h = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m77509a(Long l2) {
        return l2;
    }

    /* JADX INFO: renamed from: h */
    public static LiveWatchCounter m77513h() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (strM207631D0 == null) {
            strM207631D0 = "LiveWatchCounter_unknownUserID";
        }
        LiveWatchCounter liveWatchCounter = C13076a.f52668a;
        if (!liveWatchCounter.f52666h.equals(strM207631D0)) {
            liveWatchCounter.f52660b = new pxd0<>(ValidWatchedAnchorData.class, "live_watch_counter_".concat(strM207631D0), new ValidWatchedAnchorData(new TreeMap()), true, hxd0.DEFAULT_FILE_NAME);
            liveWatchCounter.f52659a = new byd0("live_watch_counter_last_watch_time".concat(strM207631D0), 0L, true);
            liveWatchCounter.f52664f = new byd0("live_watch_total_time".concat(strM207631D0), 0L);
            liveWatchCounter.f52662d = new vxd0("live_watch_total_count".concat(strM207631D0), 0);
            liveWatchCounter.f52663e = new wyd0("live_watch_total_each_day_count_new".concat(strM207631D0), "");
            liveWatchCounter.f52661c = new pxd0<>(WatchedDurationData.class, "live_watch_duration".concat(strM207631D0), new WatchedDurationData(new TreeMap()), true, hxd0.DEFAULT_FILE_NAME);
            liveWatchCounter.f52667i = new jxd0("live_new_user".concat(strM207631D0), Boolean.TRUE);
            liveWatchCounter.f52666h = strM207631D0;
        }
        return liveWatchCounter;
    }

    /* JADX INFO: renamed from: e */
    public void m77514e(long j, long j2) {
        if (j > j2) {
            m77514e(j2, j);
            return;
        }
        long j3 = j2 - j;
        this.f52664f.put(Long.valueOf(this.f52664f.get().longValue() + j3));
        WatchedDurationData watchedDurationData = (WatchedDurationData) this.f52661c.m174216a();
        TreeMap treeMap = watchedDurationData.treeMap;
        String strM214945m = yau.m214945m();
        long jM174453n = pzi0.m174453n();
        if (j >= jM174453n) {
            d3t.m113899b(treeMap, strM214945m, Long.valueOf(j3), new rcj() { // from class: l.sdv
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
                }
            });
            this.f52661c.m174217b(watchedDurationData);
            return;
        }
        d3t.m113899b(treeMap, strM214945m, Long.valueOf(j2 - jM174453n), new rcj() { // from class: l.tdv
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
            }
        });
        int i = 1;
        while (true) {
            long j4 = jM174453n - j;
            if (j4 < 86400000) {
                d3t.m113899b(treeMap, yau.m214944l(i), Long.valueOf(j4), new rcj() { // from class: l.udv
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
                    }
                });
                this.f52661c.m174217b(watchedDurationData);
                return;
            } else {
                treeMap.put(yau.m214944l(i), 86400000L);
                jM174453n -= 86400000;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77515f(int i) {
        this.f52662d.put(Integer.valueOf(this.f52662d.get().intValue() + i));
    }

    /* JADX INFO: renamed from: g */
    public void m77516g(int i) {
        JSONObject jSONObject;
        String str = this.f52663e.get();
        long jM174453n = pzi0.m174453n();
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
                jSONObject.put("dayTimeMillis", jM174453n);
                jSONObject.put("dayCount", i);
            } else {
                JSONObject jSONObject2 = new JSONObject(str);
                long jOptLong = jSONObject2.optLong("dayTimeMillis");
                int iOptInt = jSONObject2.optInt("dayCount");
                if (jOptLong != jM174453n) {
                    jSONObject2.put("dayTimeMillis", jM174453n);
                    jSONObject2.put("dayCount", i);
                } else {
                    jSONObject2.put("dayCount", iOptInt + i);
                }
                jSONObject = jSONObject2;
            }
            this.f52663e.put(jSONObject.toString());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public int m77517i() {
        try {
            return new JSONObject(this.f52663e.get()).optInt("dayCount");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public int m77518j(int i) {
        if (i <= 0) {
            return 0;
        }
        TreeMap treeMapM113900c = d3t.m113900c(((ValidWatchedAnchorData) this.f52660b.m174216a()).treeMap, yau.m214944l(i - 1), yau.m214945m());
        HashSet hashSet = new HashSet();
        Iterator it = treeMapM113900c.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((HashSet) it.next());
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: k */
    public long m77519k(int i) {
        return jyb.m147515j0(d3t.m113900c(((WatchedDurationData) this.f52661c.m174216a()).treeMap, yau.m214944l(i - 1), yau.m214945m()).values(), new qcj() { // from class: l.vdv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveWatchCounter.m77509a((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public int m77520l() {
        return !m77521m() ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) ((pzi0.m174454o() - this.f52659a.get().longValue()) / 86400000);
    }

    /* JADX INFO: renamed from: m */
    public boolean m77521m() {
        byd0 byd0Var = this.f52659a;
        return byd0Var != null && byd0Var.get().longValue() > 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m77522n() {
        jxd0 jxd0Var = this.f52667i;
        return jxd0Var != null && jxd0Var.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public void m77523o() {
        jxd0 jxd0Var = this.f52667i;
        if (jxd0Var != null) {
            jxd0Var.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m77524p(String str) {
        String strM214945m = yau.m214945m();
        ValidWatchedAnchorData validWatchedAnchorData = (ValidWatchedAnchorData) this.f52660b.m174216a();
        HashSet hashSet = validWatchedAnchorData.treeMap.containsKey(strM214945m) ? (HashSet) validWatchedAnchorData.treeMap.get(strM214945m) : new HashSet();
        hashSet.add(str);
        validWatchedAnchorData.treeMap.put(strM214945m, hashSet);
        this.f52660b.m174217b(validWatchedAnchorData);
        this.f52659a.put(Long.valueOf(pzi0.m174454o()));
    }
}
