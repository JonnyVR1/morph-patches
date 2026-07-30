package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.mrq0;
import p149l.nrq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.at */
/* JADX INFO: loaded from: classes2.dex */
public class C14849at {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, c> f62980a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private static final C14849at f62981a = new C14849at();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        long f62982a;

        /* JADX INFO: renamed from: b */
        long f62983b;

        /* JADX INFO: renamed from: c */
        long f62984c;

        /* JADX INFO: renamed from: d */
        long f62985d;

        private c() {
        }

        /* JADX INFO: renamed from: a */
        public long m86566a() {
            long j = this.f62984c;
            long j2 = this.f62983b;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: b */
        public long m86567b() {
            long j = this.f62985d;
            long j2 = this.f62984c;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86561a() {
        if (this.f62980a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, c>> it = this.f62980a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            if (next == null || next.getValue() == null) {
                it.remove();
            } else {
                c value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.f62983b) > 10000) {
                    m86560a(next.getKey(), value);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86564b(String str, long j) {
        c cVarRemove = this.f62980a.remove(str);
        if (cVarRemove != null) {
            cVarRemove.f62985d = j;
            m86560a(str, cVarRemove);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$a */
    public static class a extends XMPushService.AbstractC14818j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            C14849at.m86559a().m86561a();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "RecordTimeManager clear";
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14849at m86559a() {
        return b.f62981a;
    }

    /* JADX INFO: renamed from: a */
    public void m86563a(String str, long j, long j2) {
        c cVar = new c();
        cVar.f62982a = j2;
        cVar.f62983b = j;
        this.f62980a.put(str, cVar);
    }

    /* JADX INFO: renamed from: a */
    public void m86562a(String str, long j) {
        c cVar = this.f62980a.get(str);
        if (cVar != null) {
            cVar.f62984c = j;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86560a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("xmsfVC", Long.valueOf(cVar.f62982a));
        map.put("packetId", str);
        map.put("pTime", Long.valueOf(cVar.m86566a()));
        map.put("bTime", Long.valueOf(cVar.m86567b()));
        nrq0.m160745b().mo151504a(new mrq0("msg_process_time", map));
    }
}
