package com.immomo.moment.mediautils;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.n */
/* JADX INFO: loaded from: classes7.dex */
public class C4000n {

    /* JADX INFO: renamed from: c */
    Object f14250c = new Object();

    /* JADX INFO: renamed from: b */
    private List<a> f14249b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private Map<String, AbstractC3999m> f14248a = new HashMap();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.n$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public long f14251a;

        /* JADX INFO: renamed from: b */
        public long f14252b;

        /* JADX INFO: renamed from: c */
        public String f14253c;

        /* JADX INFO: renamed from: d */
        public Boolean f14254d;

        public a(String str, long j, long j2, boolean z) {
            this.f14253c = str;
            this.f14251a = j;
            this.f14252b = j2;
            this.f14254d = Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19930a(String str, long j, long j2) {
        synchronized (this.f14250c) {
            this.f14249b.add(new a(str, j, j2, false));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19931b(String str, long j, long j2, boolean z) {
        synchronized (this.f14250c) {
            this.f14249b.add(new a(str, j, j2, z));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19932c(String str, AbstractC3999m abstractC3999m) {
        synchronized (this.f14250c) {
            this.f14248a.put(str, abstractC3999m);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19933d() {
        synchronized (this.f14250c) {
            try {
                List<a> list = this.f14249b;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public List<a> m19934e() {
        List<a> list;
        synchronized (this.f14250c) {
            list = this.f14249b;
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, AbstractC3999m> m19935f() {
        Map<String, AbstractC3999m> map;
        synchronized (this.f14250c) {
            map = this.f14248a;
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public void m19936g() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "MediaSourceConfig released !!!");
        synchronized (this.f14250c) {
            try {
                Map<String, AbstractC3999m> map = this.f14248a;
                if (map != null && this.f14249b != null) {
                    Iterator<AbstractC3999m> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().mo19771q();
                    }
                    this.f14248a.clear();
                }
                List<a> list = this.f14249b;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
