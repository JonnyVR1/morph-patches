package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p153l.bph0;
import p153l.by3;
import p153l.cve0;
import p153l.d5e;
import p153l.dy2;
import p153l.dy3;
import p153l.e5e;
import p153l.huf;
import p153l.iii;
import p153l.pa5;
import p153l.rkq0;
import p153l.v2f;
import p153l.wn80;

/* JADX INFO: renamed from: com.facebook.cache.disk.c */
/* JADX INFO: loaded from: classes.dex */
public class C1610c implements iii, d5e {

    /* JADX INFO: renamed from: r */
    public static final Class<?> f6254r = C1610c.class;

    /* JADX INFO: renamed from: s */
    public static final long f6255s = 7200000;

    /* JADX INFO: renamed from: t */
    public static final long f6256t = 1800000;

    /* JADX INFO: renamed from: a */
    public final long f6257a;

    /* JADX INFO: renamed from: b */
    public final long f6258b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f6259c;

    /* JADX INFO: renamed from: d */
    public long f6260d;

    /* JADX INFO: renamed from: e */
    public final CacheEventListener f6261e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final Set<String> f6262f;

    /* JADX INFO: renamed from: g */
    public long f6263g;

    /* JADX INFO: renamed from: h */
    public final long f6264h;

    /* JADX INFO: renamed from: i */
    public final StatFsHelper f6265i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1609b f6266j;

    /* JADX INFO: renamed from: k */
    public final v2f f6267k;

    /* JADX INFO: renamed from: l */
    public final CacheErrorLogger f6268l;

    /* JADX INFO: renamed from: m */
    public final boolean f6269m;

    /* JADX INFO: renamed from: n */
    public final b f6270n;

    /* JADX INFO: renamed from: o */
    public final pa5 f6271o;

    /* JADX INFO: renamed from: p */
    public final Object f6272p = new Object();

    /* JADX INFO: renamed from: q */
    public boolean f6273q;

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1610c.this.f6272p) {
                C1610c.this.m8183o();
            }
            C1610c.this.f6273q = true;
            C1610c.this.f6259c.countDown();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$b */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f6275a = false;

        /* JADX INFO: renamed from: b */
        public long f6276b = -1;

        /* JADX INFO: renamed from: c */
        public long f6277c = -1;

        /* JADX INFO: renamed from: a */
        public synchronized long m8187a() {
            return this.f6277c;
        }

        /* JADX INFO: renamed from: b */
        public synchronized long m8188b() {
            return this.f6276b;
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m8189c(long j, long j2) {
            if (this.f6275a) {
                this.f6276b += j;
                this.f6277c += j2;
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m8190d() {
            return this.f6275a;
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m8191e() {
            this.f6275a = false;
            this.f6277c = -1L;
            this.f6276b = -1L;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m8192f(long j, long j2) {
            this.f6277c = j2;
            this.f6276b = j;
            this.f6275a = true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final long f6278a;

        /* JADX INFO: renamed from: b */
        public final long f6279b;

        /* JADX INFO: renamed from: c */
        public final long f6280c;

        public c(long j, long j2, long j3) {
            this.f6278a = j;
            this.f6279b = j2;
            this.f6280c = j3;
        }
    }

    public C1610c(InterfaceC1609b interfaceC1609b, v2f v2fVar, c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, e5e e5eVar, Executor executor, boolean z) {
        this.f6257a = cVar.f6279b;
        long j = cVar.f6280c;
        this.f6258b = j;
        this.f6260d = j;
        this.f6265i = StatFsHelper.m8222d();
        this.f6266j = interfaceC1609b;
        this.f6267k = v2fVar;
        this.f6263g = -1L;
        this.f6261e = cacheEventListener;
        this.f6264h = cVar.f6278a;
        this.f6268l = cacheErrorLogger;
        this.f6270n = new b();
        this.f6271o = bph0.m105843a();
        this.f6269m = z;
        this.f6262f = new HashSet();
        if (e5eVar != null) {
            e5eVar.mo117800a(this);
        }
        if (!z) {
            this.f6259c = new CountDownLatch(0);
        } else {
            this.f6259c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    @Override // p153l.iii
    /* JADX INFO: renamed from: a */
    public dy2 mo8173a(by3 by3Var, rkq0 rkq0Var) throws IOException {
        String strM118583a;
        cve0 cve0VarM112799d = cve0.m112796a().m112799d(by3Var);
        CacheEventListener cacheEventListener = this.f6261e;
        if (cacheEventListener != null) {
            cacheEventListener.mo8121b(cve0VarM112799d);
        }
        synchronized (this.f6272p) {
            strM118583a = dy3.m118583a(by3Var);
        }
        cve0VarM112799d.m112805j(strM118583a);
        try {
            try {
                InterfaceC1609b.b bVarM8185q = m8185q(strM118583a, by3Var);
                try {
                    bVarM8185q.mo8163a(rkq0Var, by3Var);
                    dy2 dy2VarM8178j = m8178j(bVarM8185q, by3Var, strM118583a);
                    cve0VarM112799d.m112804i(dy2VarM8178j.size()).m112801f(this.f6270n.m8188b());
                    CacheEventListener cacheEventListener2 = this.f6261e;
                    if (cacheEventListener2 != null) {
                        cacheEventListener2.mo8124e(cve0VarM112799d);
                    }
                    if (!bVarM8185q.cleanUp()) {
                        huf.m137176d(f6254r, "Failed to delete temp file");
                    }
                    cve0VarM112799d.m112797b();
                    return dy2VarM8178j;
                } catch (Throwable th) {
                    if (!bVarM8185q.cleanUp()) {
                        huf.m137176d(f6254r, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e) {
                cve0VarM112799d.m112803h(e);
                CacheEventListener cacheEventListener3 = this.f6261e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8125f(cve0VarM112799d);
                }
                huf.m137177e(f6254r, "Failed inserting a file into the cache", e);
                throw e;
            }
        } catch (Throwable th2) {
            cve0VarM112799d.m112797b();
            throw th2;
        }
    }

    @Override // p153l.iii
    /* JADX INFO: renamed from: b */
    public boolean mo8174b(by3 by3Var) {
        synchronized (this.f6272p) {
            if (m8181m(by3Var)) {
                return true;
            }
            try {
                List<String> listM118584b = dy3.m118584b(by3Var);
                for (int i = 0; i < listM118584b.size(); i++) {
                    String str = listM118584b.get(i);
                    if (this.f6266j.mo8141c(str, by3Var)) {
                        this.f6262f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // p153l.iii
    /* JADX INFO: renamed from: c */
    public dy2 mo8175c(by3 by3Var) {
        dy2 dy2VarMo8144f;
        cve0 cve0VarM112799d = cve0.m112796a().m112799d(by3Var);
        try {
            try {
                synchronized (this.f6272p) {
                    try {
                        List<String> listM118584b = dy3.m118584b(by3Var);
                        String str = null;
                        dy2VarMo8144f = null;
                        for (int i = 0; i < listM118584b.size(); i++) {
                            str = listM118584b.get(i);
                            cve0VarM112799d.m112805j(str);
                            dy2VarMo8144f = this.f6266j.mo8144f(str, by3Var);
                            if (dy2VarMo8144f != null) {
                                break;
                            }
                        }
                        if (dy2VarMo8144f == null) {
                            CacheEventListener cacheEventListener = this.f6261e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8123d(cve0VarM112799d);
                            }
                            this.f6262f.remove(str);
                        } else {
                            wn80.m207182g(str);
                            CacheEventListener cacheEventListener2 = this.f6261e;
                            if (cacheEventListener2 != null) {
                                cacheEventListener2.mo8126g(cve0VarM112799d);
                            }
                            this.f6262f.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                cve0VarM112799d.m112797b();
                return dy2VarMo8144f;
            } catch (IOException e) {
                this.f6268l.mo8119a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f6254r, "getResource", e);
                cve0VarM112799d.m112803h(e);
                CacheEventListener cacheEventListener3 = this.f6261e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8120a(cve0VarM112799d);
                }
                cve0VarM112799d.m112797b();
                return null;
            }
        } catch (Throwable th2) {
            cve0VarM112799d.m112797b();
            throw th2;
        }
    }

    @Override // p153l.iii
    /* JADX INFO: renamed from: d */
    public boolean mo8176d(by3 by3Var) throws Throwable {
        String str;
        IOException e;
        String str2 = null;
        try {
            try {
                synchronized (this.f6272p) {
                    try {
                        List<String> listM118584b = dy3.m118584b(by3Var);
                        int i = 0;
                        while (i < listM118584b.size()) {
                            String str3 = listM118584b.get(i);
                            if (this.f6266j.mo8143e(str3, by3Var)) {
                                this.f6262f.add(str3);
                                return true;
                            }
                            i++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            cve0 cve0VarM112803h = cve0.m112796a().m112799d(by3Var).m112805j(str).m112803h(e);
                            CacheEventListener cacheEventListener = this.f6261e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8120a(cve0VarM112803h);
                            }
                            cve0VarM112803h.m112797b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            str = null;
            e = e3;
        }
    }

    @Override // p153l.iii
    /* JADX INFO: renamed from: e */
    public void mo8177e(by3 by3Var) {
        synchronized (this.f6272p) {
            try {
                List<String> listM118584b = dy3.m118584b(by3Var);
                for (int i = 0; i < listM118584b.size(); i++) {
                    String str = listM118584b.get(i);
                    this.f6266j.remove(str);
                    this.f6262f.remove(str);
                }
            } catch (IOException e) {
                this.f6268l.mo8119a(CacheErrorLogger.CacheErrorCategory.DELETE_FILE, f6254r, "delete: " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final dy2 m8178j(InterfaceC1609b.b bVar, by3 by3Var, String str) throws IOException {
        dy2 dy2VarMo8164b;
        synchronized (this.f6272p) {
            dy2VarMo8164b = bVar.mo8164b(by3Var);
            this.f6262f.add(str);
            this.f6270n.m8189c(dy2VarMo8164b.size(), 1L);
        }
        return dy2VarMo8164b;
    }

    /* JADX INFO: renamed from: k */
    public final void m8179k(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<InterfaceC1609b.a> collectionM8180l = m8180l(this.f6266j.mo8145g());
            long jM8188b = this.f6270n.m8188b();
            long j2 = jM8188b - j;
            int i = 0;
            long j3 = 0;
            for (InterfaceC1609b.a aVar : collectionM8180l) {
                if (j3 > j2) {
                    break;
                }
                long jMo8139a = this.f6266j.mo8139a(aVar);
                this.f6262f.remove(aVar.getId());
                if (jMo8139a > 0) {
                    i++;
                    j3 += jMo8139a;
                    cve0 cve0VarM112800e = cve0.m112796a().m112805j(aVar.getId()).m112802g(evictionReason).m112804i(jMo8139a).m112801f(jM8188b - j3).m112800e(j);
                    CacheEventListener cacheEventListener = this.f6261e;
                    if (cacheEventListener != null) {
                        cacheEventListener.mo8122c(cve0VarM112800e);
                    }
                    cve0VarM112800e.m112797b();
                }
            }
            this.f6270n.m8189c(-j3, -i);
            this.f6266j.mo8142d();
        } catch (IOException e) {
            this.f6268l.mo8119a(CacheErrorLogger.CacheErrorCategory.EVICTION, f6254r, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Collection<InterfaceC1609b.a> m8180l(Collection<InterfaceC1609b.a> collection) {
        long jNow = this.f6271o.now() + f6255s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC1609b.a aVar : collection) {
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f6267k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean m8181m(by3 by3Var) {
        synchronized (this.f6272p) {
            try {
                List<String> listM118584b = dy3.m118584b(by3Var);
                for (int i = 0; i < listM118584b.size(); i++) {
                    if (this.f6262f.contains(listM118584b.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8182n() throws IOException {
        synchronized (this.f6272p) {
            try {
                boolean zM8183o = m8183o();
                m8186r();
                long jM8188b = this.f6270n.m8188b();
                if (jM8188b > this.f6260d && !zM8183o) {
                    this.f6270n.m8191e();
                    m8183o();
                }
                long j = this.f6260d;
                if (jM8188b > j) {
                    m8179k((j * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8183o() {
        long jNow = this.f6271o.now();
        if (this.f6270n.m8190d()) {
            long j = this.f6263g;
            if (j != -1 && jNow - j <= f6256t) {
                return false;
            }
        }
        return m8184p();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8184p() {
        boolean z;
        long j;
        long jNow = this.f6271o.now();
        long j2 = f6255s + jNow;
        Set<String> hashSet = (this.f6269m && this.f6262f.isEmpty()) ? this.f6262f : this.f6269m ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            z = false;
            for (InterfaceC1609b.a aVar : this.f6266j.mo8145g()) {
                try {
                    i++;
                    size += aVar.getSize();
                    if (aVar.getTimestamp() > j2) {
                        i2++;
                        size2 = (int) (((long) size2) + aVar.getSize());
                        j = j2;
                        jMax = Math.max(aVar.getTimestamp() - jNow, jMax);
                        z2 = true;
                    } else {
                        j = j2;
                        if (this.f6269m) {
                            wn80.m207182g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j2 = j;
                } catch (IOException e) {
                    e = e;
                    this.f6268l.mo8119a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f6254r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z;
                }
            }
            if (z2) {
                this.f6268l.mo8119a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f6254r, "Future timestamp found in " + i2 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j3 = i;
            if (this.f6270n.m8187a() != j3 || this.f6270n.m8188b() != size) {
                if (this.f6269m && this.f6262f != hashSet) {
                    wn80.m207182g(hashSet);
                    this.f6262f.clear();
                    this.f6262f.addAll(hashSet);
                }
                this.f6270n.m8192f(size, j3);
            }
            this.f6263g = jNow;
            return true;
        } catch (IOException e2) {
            e = e2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC1609b.b m8185q(String str, by3 by3Var) throws IOException {
        m8182n();
        return this.f6266j.mo8140b(str, by3Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m8186r() {
        if (this.f6265i.m8226f(this.f6266j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f6258b - this.f6270n.m8188b())) {
            this.f6260d = this.f6257a;
        } else {
            this.f6260d = this.f6258b;
        }
    }
}
