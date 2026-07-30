package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.s0r0;
import p153l.t0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.at */
/* JADX INFO: loaded from: classes2.dex */
public class C14997at {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, c> f63827a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private static final C14997at f63828a = new C14997at();
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        long f63829a;

        /* JADX INFO: renamed from: b */
        long f63830b;

        /* JADX INFO: renamed from: c */
        long f63831c;

        /* JADX INFO: renamed from: d */
        long f63832d;

        private c() {
        }

        /* JADX INFO: renamed from: a */
        public long m87737a() {
            long j = this.f63831c;
            long j2 = this.f63830b;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }

        /* JADX INFO: renamed from: b */
        public long m87738b() {
            long j = this.f63832d;
            long j2 = this.f63831c;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87732a() {
        if (this.f63827a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, c>> it = this.f63827a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            if (next == null || next.getValue() == null) {
                it.remove();
            } else {
                c value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.f63830b) > 10000) {
                    m87731a(next.getKey(), value);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m87735b(String str, long j) {
        c cVarRemove = this.f63827a.remove(str);
        if (cVarRemove != null) {
            cVarRemove.f63832d = j;
            m87731a(str, cVarRemove);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.at$a */
    public static class a extends XMPushService.AbstractC14966j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            C14997at.m87730a().m87732a();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "RecordTimeManager clear";
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14997at m87730a() {
        return b.f63828a;
    }

    /* JADX INFO: renamed from: a */
    public void m87734a(String str, long j, long j2) {
        c cVar = new c();
        cVar.f63829a = j2;
        cVar.f63830b = j;
        this.f63827a.put(str, cVar);
    }

    /* JADX INFO: renamed from: a */
    public void m87733a(String str, long j) {
        c cVar = this.f63827a.get(str);
        if (cVar != null) {
            cVar.f63831c = j;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87731a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("xmsfVC", Long.valueOf(cVar.f63829a));
        map.put("packetId", str);
        map.put("pTime", Long.valueOf(cVar.m87737a()));
        map.put("bTime", Long.valueOf(cVar.m87738b()));
        t0r0.m188825b().mo179242a(new s0r0("msg_process_time", map));
    }
}
