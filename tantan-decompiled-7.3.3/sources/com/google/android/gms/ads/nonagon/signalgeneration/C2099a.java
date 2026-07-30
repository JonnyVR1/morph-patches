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
import p153l.bxy0;
import p153l.cxu0;
import p153l.jas0;
import p153l.oct0;
import p153l.qyv0;
import p153l.sgs0;
import p153l.swu0;

/* JADX INFO: renamed from: com.google.android.gms.ads.nonagon.signalgeneration.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2099a {

    /* JADX INFO: renamed from: h */
    public final cxu0 f9785h;

    /* JADX INFO: renamed from: i */
    public Map f9786i;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f9783f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f9784g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final int f9778a = ((Integer) jas0.m144075c().m176505a(sgs0.f168210Y6)).intValue();

    /* JADX INFO: renamed from: b */
    public final long f9779b = ((Long) jas0.m144075c().m176505a(sgs0.f168222Z6)).longValue();

    /* JADX INFO: renamed from: c */
    public final boolean f9780c = ((Boolean) jas0.m144075c().m176505a(sgs0.f168287e7)).booleanValue();

    /* JADX INFO: renamed from: d */
    public final boolean f9781d = ((Boolean) jas0.m144075c().m176505a(sgs0.f168261c7)).booleanValue();

    /* JADX INFO: renamed from: e */
    public final Map f9782e = Collections.synchronizedMap(new zzb(this));

    public C2099a(cxu0 cxu0Var) {
        this.f9785h = cxu0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final void m12411j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized String m12412b(String str, swu0 swu0Var) {
        Pair pair = (Pair) this.f9782e.get(str);
        swu0Var.m188363a().put("rid", str);
        if (pair == null) {
            swu0Var.m188363a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f9782e.remove(str);
        swu0Var.m188363a().put("mhit", "true");
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m12413d(String str, String str2, swu0 swu0Var) {
        this.f9782e.put(str, new Pair(Long.valueOf(bxy0.m106918b().currentTimeMillis()), str2));
        m12418i();
        m12416g(swu0Var);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m12414e(swu0 swu0Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m12417h(swu0Var, arrayDeque, "to");
        m12417h(swu0Var, arrayDeque2, "of");
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m12415f(String str) {
        this.f9782e.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m12416g(final swu0 swu0Var) {
        if (this.f9780c) {
            ArrayDeque arrayDeque = this.f9784g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f9783f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            oct0.f146733a.execute(new Runnable() { // from class: l.a9r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69068a.m12414e(swu0Var, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12417h(swu0 swu0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(swu0Var.m188363a());
            this.f9786i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f9786i.put("e_r", str);
            this.f9786i.put("e_id", (String) pair2.first);
            if (this.f9781d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(qyv0.m178750a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m12411j(this.f9786i, "e_type", (String) pair.first);
                m12411j(this.f9786i, "e_agent", (String) pair.second);
            }
            this.f9785h.m128028f(this.f9786i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m12418i() {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        try {
            Iterator it = this.f9782e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f9779b) {
                    break;
                }
                this.f9784g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            bxy0.m106933q().m120275w(e, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
