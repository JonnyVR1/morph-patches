package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.d1s0;
import p149l.i3t0;
import p149l.kpv0;
import p149l.m7s0;
import p149l.mnu0;
import p149l.vny0;
import p149l.wnu0;

/* JADX INFO: renamed from: com.google.android.gms.ads.nonagon.signalgeneration.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2076a {

    /* JADX INFO: renamed from: h */
    public final wnu0 f9748h;

    /* JADX INFO: renamed from: i */
    public Map f9749i;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f9746f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f9747g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final int f9741a = ((Integer) d1s0.m109677c().m144697a(m7s0.f132139Y6)).intValue();

    /* JADX INFO: renamed from: b */
    public final long f9742b = ((Long) d1s0.m109677c().m144697a(m7s0.f132151Z6)).longValue();

    /* JADX INFO: renamed from: c */
    public final boolean f9743c = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132216e7)).booleanValue();

    /* JADX INFO: renamed from: d */
    public final boolean f9744d = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132190c7)).booleanValue();

    /* JADX INFO: renamed from: e */
    public final Map f9745e = Collections.synchronizedMap(new zzb(this));

    public C2076a(wnu0 wnu0Var) {
        this.f9748h = wnu0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final void m12357j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized String m12358b(String str, mnu0 mnu0Var) {
        Pair pair = (Pair) this.f9745e.get(str);
        mnu0Var.m155566a().put("rid", str);
        if (pair == null) {
            mnu0Var.m155566a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f9745e.remove(str);
        mnu0Var.m155566a().put("mhit", "true");
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m12359d(String str, String str2, mnu0 mnu0Var) {
        this.f9745e.put(str, new Pair(Long.valueOf(vny0.m199064b().currentTimeMillis()), str2));
        m12364i();
        m12362g(mnu0Var);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m12360e(mnu0 mnu0Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m12363h(mnu0Var, arrayDeque, "to");
        m12363h(mnu0Var, arrayDeque2, "of");
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m12361f(String str) {
        this.f9745e.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m12362g(final mnu0 mnu0Var) {
        if (this.f9743c) {
            ArrayDeque arrayDeque = this.f9747g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f9746f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            i3t0.f111372a.execute(new Runnable() { // from class: l.uzq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179013a.m12360e(mnu0Var, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12363h(mnu0 mnu0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(mnu0Var.m155566a());
            this.f9749i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f9749i.put("e_r", str);
            this.f9749i.put("e_id", (String) pair2.first);
            if (this.f9744d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(kpv0.m146887a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m12357j(this.f9749i, "e_type", (String) pair.first);
                m12357j(this.f9749i, "e_agent", (String) pair.second);
            }
            this.f9748h.m219493f(this.f9749i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m12364i() {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        try {
            Iterator it = this.f9745e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f9742b) {
                    break;
                }
                this.f9747g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            vny0.m199079q().m212290w(e, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
