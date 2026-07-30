package com.p046p1.mobile.putong.live.livingroom.util.pref;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.c1t;
import p149l.fpd0;
import p149l.hpd0;
import p149l.mqi0;
import p149l.npd0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.vwb;
import p149l.w9j;
import p149l.x8u;
import p149l.x9j;
import p149l.ypv;
import p149l.zpd0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveWatchCounter {

    /* JADX INFO: renamed from: a */
    public zpd0 f51811a;

    /* JADX INFO: renamed from: b */
    public npd0<ValidWatchedAnchorData> f51812b;

    /* JADX INFO: renamed from: c */
    public npd0<WatchedDurationData> f51813c;

    /* JADX INFO: renamed from: d */
    public tpd0 f51814d;

    /* JADX INFO: renamed from: e */
    public uqd0 f51815e;

    /* JADX INFO: renamed from: f */
    public zpd0 f51816f;

    /* JADX INFO: renamed from: g */
    public long f51817g;

    /* JADX INFO: renamed from: h */
    public String f51818h;

    /* JADX INFO: renamed from: i */
    public hpd0 f51819i;

    public static final class ValidWatchedAnchorData implements npd0.InterfaceC18745a<ValidWatchedAnchorData>, Serializable {
        private TreeMap<String, HashSet<String>> treeMap;

        private ValidWatchedAnchorData(TreeMap<String, HashSet<String>> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p149l.npd0.InterfaceC18745a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.npd0.InterfaceC18745a
        public ValidWatchedAnchorData trimAndCopy() {
            c1t.m104879d(this.treeMap, 15, false);
            return new ValidWatchedAnchorData(this.treeMap);
        }
    }

    public static final class WatchedDurationData implements npd0.InterfaceC18745a<WatchedDurationData>, Serializable {
        private TreeMap<String, Long> treeMap;

        private WatchedDurationData(TreeMap<String, Long> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p149l.npd0.InterfaceC18745a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.npd0.InterfaceC18745a
        public WatchedDurationData trimAndCopy() {
            c1t.m104879d(this.treeMap, 15, false);
            return new WatchedDurationData(this.treeMap);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter$a */
    public static final class C12913a {

        /* JADX INFO: renamed from: a */
        public static final LiveWatchCounter f51820a = new LiveWatchCounter();
    }

    public LiveWatchCounter() {
        this.f51817g = mqi0.m155943n();
        this.f51818h = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m76326a(Long l2) {
        return l2;
    }

    /* JADX INFO: renamed from: h */
    public static LiveWatchCounter m76330h() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (strM199309D0 == null) {
            strM199309D0 = "LiveWatchCounter_unknownUserID";
        }
        LiveWatchCounter liveWatchCounter = C12913a.f51820a;
        if (!liveWatchCounter.f51818h.equals(strM199309D0)) {
            liveWatchCounter.f51812b = new npd0<>(ValidWatchedAnchorData.class, "live_watch_counter_".concat(strM199309D0), new ValidWatchedAnchorData(new TreeMap()), true, fpd0.DEFAULT_FILE_NAME);
            liveWatchCounter.f51811a = new zpd0("live_watch_counter_last_watch_time".concat(strM199309D0), 0L, true);
            liveWatchCounter.f51816f = new zpd0("live_watch_total_time".concat(strM199309D0), 0L);
            liveWatchCounter.f51814d = new tpd0("live_watch_total_count".concat(strM199309D0), 0);
            liveWatchCounter.f51815e = new uqd0("live_watch_total_each_day_count_new".concat(strM199309D0), "");
            liveWatchCounter.f51813c = new npd0<>(WatchedDurationData.class, "live_watch_duration".concat(strM199309D0), new WatchedDurationData(new TreeMap()), true, fpd0.DEFAULT_FILE_NAME);
            liveWatchCounter.f51819i = new hpd0("live_new_user".concat(strM199309D0), Boolean.TRUE);
            liveWatchCounter.f51818h = strM199309D0;
        }
        return liveWatchCounter;
    }

    /* JADX INFO: renamed from: e */
    public void m76331e(long j, long j2) {
        if (j > j2) {
            m76331e(j2, j);
            return;
        }
        long j3 = j2 - j;
        this.f51816f.put(Long.valueOf(this.f51816f.get().longValue() + j3));
        WatchedDurationData watchedDurationData = (WatchedDurationData) this.f51813c.m160473a();
        TreeMap treeMap = watchedDurationData.treeMap;
        String strM207443m = x8u.m207443m();
        long jM155943n = mqi0.m155943n();
        if (j >= jM155943n) {
            c1t.m104877b(treeMap, strM207443m, Long.valueOf(j3), new x9j() { // from class: l.rbv
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
                }
            });
            this.f51813c.m160474b(watchedDurationData);
            return;
        }
        c1t.m104877b(treeMap, strM207443m, Long.valueOf(j2 - jM155943n), new x9j() { // from class: l.sbv
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
            }
        });
        int i = 1;
        while (true) {
            long j4 = jM155943n - j;
            if (j4 < 86400000) {
                c1t.m104877b(treeMap, x8u.m207442l(i), Long.valueOf(j4), new x9j() { // from class: l.tbv
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return Long.valueOf(((Long) obj).longValue() + ((Long) obj2).longValue());
                    }
                });
                this.f51813c.m160474b(watchedDurationData);
                return;
            } else {
                treeMap.put(x8u.m207442l(i), 86400000L);
                jM155943n -= 86400000;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m76332f(int i) {
        this.f51814d.put(Integer.valueOf(this.f51814d.get().intValue() + i));
    }

    /* JADX INFO: renamed from: g */
    public void m76333g(int i) {
        JSONObject jSONObject;
        String str = this.f51815e.get();
        long jM155943n = mqi0.m155943n();
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
                jSONObject.put("dayTimeMillis", jM155943n);
                jSONObject.put("dayCount", i);
            } else {
                JSONObject jSONObject2 = new JSONObject(str);
                long jOptLong = jSONObject2.optLong("dayTimeMillis");
                int iOptInt = jSONObject2.optInt("dayCount");
                if (jOptLong != jM155943n) {
                    jSONObject2.put("dayTimeMillis", jM155943n);
                    jSONObject2.put("dayCount", i);
                } else {
                    jSONObject2.put("dayCount", iOptInt + i);
                }
                jSONObject = jSONObject2;
            }
            this.f51815e.put(jSONObject.toString());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public int m76334i() {
        try {
            return new JSONObject(this.f51815e.get()).optInt("dayCount");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public int m76335j(int i) {
        if (i <= 0) {
            return 0;
        }
        TreeMap treeMapM104878c = c1t.m104878c(((ValidWatchedAnchorData) this.f51812b.m160473a()).treeMap, x8u.m207442l(i - 1), x8u.m207443m());
        HashSet hashSet = new HashSet();
        Iterator it = treeMapM104878c.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((HashSet) it.next());
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: k */
    public long m76336k(int i) {
        return vwb.m200332j0(c1t.m104878c(((WatchedDurationData) this.f51813c.m160473a()).treeMap, x8u.m207442l(i - 1), x8u.m207443m()).values(), new w9j() { // from class: l.ubv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveWatchCounter.m76326a((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public int m76337l() {
        return !m76338m() ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) ((mqi0.m155944o() - this.f51811a.get().longValue()) / 86400000);
    }

    /* JADX INFO: renamed from: m */
    public boolean m76338m() {
        zpd0 zpd0Var = this.f51811a;
        return zpd0Var != null && zpd0Var.get().longValue() > 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m76339n() {
        hpd0 hpd0Var = this.f51819i;
        return hpd0Var != null && hpd0Var.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public void m76340o() {
        hpd0 hpd0Var = this.f51819i;
        if (hpd0Var != null) {
            hpd0Var.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m76341p(String str) {
        String strM207443m = x8u.m207443m();
        ValidWatchedAnchorData validWatchedAnchorData = (ValidWatchedAnchorData) this.f51812b.m160473a();
        HashSet hashSet = validWatchedAnchorData.treeMap.containsKey(strM207443m) ? (HashSet) validWatchedAnchorData.treeMap.get(strM207443m) : new HashSet();
        hashSet.add(str);
        validWatchedAnchorData.treeMap.put(strM207443m, hashSet);
        this.f51812b.m160474b(validWatchedAnchorData);
        this.f51811a.put(Long.valueOf(mqi0.m155944o()));
    }
}
