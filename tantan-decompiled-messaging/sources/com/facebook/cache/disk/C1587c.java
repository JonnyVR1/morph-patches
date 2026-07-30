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
import p149l.cx3;
import p149l.ex3;
import p149l.mbq0;
import p149l.mfi;
import p149l.o95;
import p149l.ox2;
import p149l.p3e;
import p149l.q1f;
import p149l.q3e;
import p149l.rf80;
import p149l.tsf;
import p149l.ugh0;
import p149l.vme0;

/* JADX INFO: renamed from: com.facebook.cache.disk.c */
/* JADX INFO: loaded from: classes.dex */
public class C1587c implements mfi, p3e {

    /* JADX INFO: renamed from: r */
    public static final Class<?> f6217r = C1587c.class;

    /* JADX INFO: renamed from: s */
    public static final long f6218s = 7200000;

    /* JADX INFO: renamed from: t */
    public static final long f6219t = 1800000;

    /* JADX INFO: renamed from: a */
    public final long f6220a;

    /* JADX INFO: renamed from: b */
    public final long f6221b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f6222c;

    /* JADX INFO: renamed from: d */
    public long f6223d;

    /* JADX INFO: renamed from: e */
    public final CacheEventListener f6224e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final Set<String> f6225f;

    /* JADX INFO: renamed from: g */
    public long f6226g;

    /* JADX INFO: renamed from: h */
    public final long f6227h;

    /* JADX INFO: renamed from: i */
    public final StatFsHelper f6228i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1586b f6229j;

    /* JADX INFO: renamed from: k */
    public final q1f f6230k;

    /* JADX INFO: renamed from: l */
    public final CacheErrorLogger f6231l;

    /* JADX INFO: renamed from: m */
    public final boolean f6232m;

    /* JADX INFO: renamed from: n */
    public final b f6233n;

    /* JADX INFO: renamed from: o */
    public final o95 f6234o;

    /* JADX INFO: renamed from: p */
    public final Object f6235p = new Object();

    /* JADX INFO: renamed from: q */
    public boolean f6236q;

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1587c.this.f6235p) {
                C1587c.this.m8129o();
            }
            C1587c.this.f6236q = true;
            C1587c.this.f6222c.countDown();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$b */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f6238a = false;

        /* JADX INFO: renamed from: b */
        public long f6239b = -1;

        /* JADX INFO: renamed from: c */
        public long f6240c = -1;

        /* JADX INFO: renamed from: a */
        public synchronized long m8133a() {
            return this.f6240c;
        }

        /* JADX INFO: renamed from: b */
        public synchronized long m8134b() {
            return this.f6239b;
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m8135c(long j, long j2) {
            if (this.f6238a) {
                this.f6239b += j;
                this.f6240c += j2;
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m8136d() {
            return this.f6238a;
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m8137e() {
            this.f6238a = false;
            this.f6240c = -1L;
            this.f6239b = -1L;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m8138f(long j, long j2) {
            this.f6240c = j2;
            this.f6239b = j;
            this.f6238a = true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final long f6241a;

        /* JADX INFO: renamed from: b */
        public final long f6242b;

        /* JADX INFO: renamed from: c */
        public final long f6243c;

        public c(long j, long j2, long j3) {
            this.f6241a = j;
            this.f6242b = j2;
            this.f6243c = j3;
        }
    }

    public C1587c(InterfaceC1586b interfaceC1586b, q1f q1fVar, c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, q3e q3eVar, Executor executor, boolean z) {
        this.f6220a = cVar.f6242b;
        long j = cVar.f6243c;
        this.f6221b = j;
        this.f6223d = j;
        this.f6228i = StatFsHelper.m8168d();
        this.f6229j = interfaceC1586b;
        this.f6230k = q1fVar;
        this.f6226g = -1L;
        this.f6224e = cacheEventListener;
        this.f6227h = cVar.f6241a;
        this.f6231l = cacheErrorLogger;
        this.f6233n = new b();
        this.f6234o = ugh0.m193563a();
        this.f6232m = z;
        this.f6225f = new HashSet();
        if (q3eVar != null) {
            q3eVar.mo169971a(this);
        }
        if (!z) {
            this.f6222c = new CountDownLatch(0);
        } else {
            this.f6222c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    @Override // p149l.mfi
    /* JADX INFO: renamed from: a */
    public ox2 mo8119a(cx3 cx3Var, mbq0 mbq0Var) throws IOException {
        String strM118542a;
        vme0 vme0VarM198941d = vme0.m198938a().m198941d(cx3Var);
        CacheEventListener cacheEventListener = this.f6224e;
        if (cacheEventListener != null) {
            cacheEventListener.mo8067b(vme0VarM198941d);
        }
        synchronized (this.f6235p) {
            strM118542a = ex3.m118542a(cx3Var);
        }
        vme0VarM198941d.m198947j(strM118542a);
        try {
            try {
                InterfaceC1586b.b bVarM8131q = m8131q(strM118542a, cx3Var);
                try {
                    bVarM8131q.mo8109a(mbq0Var, cx3Var);
                    ox2 ox2VarM8124j = m8124j(bVarM8131q, cx3Var, strM118542a);
                    vme0VarM198941d.m198946i(ox2VarM8124j.size()).m198943f(this.f6233n.m8134b());
                    CacheEventListener cacheEventListener2 = this.f6224e;
                    if (cacheEventListener2 != null) {
                        cacheEventListener2.mo8070e(vme0VarM198941d);
                    }
                    if (!bVarM8131q.cleanUp()) {
                        tsf.m190538d(f6217r, "Failed to delete temp file");
                    }
                    vme0VarM198941d.m198939b();
                    return ox2VarM8124j;
                } catch (Throwable th) {
                    if (!bVarM8131q.cleanUp()) {
                        tsf.m190538d(f6217r, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e) {
                vme0VarM198941d.m198945h(e);
                CacheEventListener cacheEventListener3 = this.f6224e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8071f(vme0VarM198941d);
                }
                tsf.m190539e(f6217r, "Failed inserting a file into the cache", e);
                throw e;
            }
        } catch (Throwable th2) {
            vme0VarM198941d.m198939b();
            throw th2;
        }
    }

    @Override // p149l.mfi
    /* JADX INFO: renamed from: b */
    public boolean mo8120b(cx3 cx3Var) {
        synchronized (this.f6235p) {
            if (m8127m(cx3Var)) {
                return true;
            }
            try {
                List<String> listM118543b = ex3.m118543b(cx3Var);
                for (int i = 0; i < listM118543b.size(); i++) {
                    String str = listM118543b.get(i);
                    if (this.f6229j.mo8087c(str, cx3Var)) {
                        this.f6225f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // p149l.mfi
    /* JADX INFO: renamed from: c */
    public ox2 mo8121c(cx3 cx3Var) {
        ox2 ox2VarMo8090f;
        vme0 vme0VarM198941d = vme0.m198938a().m198941d(cx3Var);
        try {
            try {
                synchronized (this.f6235p) {
                    try {
                        List<String> listM118543b = ex3.m118543b(cx3Var);
                        String str = null;
                        ox2VarMo8090f = null;
                        for (int i = 0; i < listM118543b.size(); i++) {
                            str = listM118543b.get(i);
                            vme0VarM198941d.m198947j(str);
                            ox2VarMo8090f = this.f6229j.mo8090f(str, cx3Var);
                            if (ox2VarMo8090f != null) {
                                break;
                            }
                        }
                        if (ox2VarMo8090f == null) {
                            CacheEventListener cacheEventListener = this.f6224e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8069d(vme0VarM198941d);
                            }
                            this.f6225f.remove(str);
                        } else {
                            rf80.m179116g(str);
                            CacheEventListener cacheEventListener2 = this.f6224e;
                            if (cacheEventListener2 != null) {
                                cacheEventListener2.mo8072g(vme0VarM198941d);
                            }
                            this.f6225f.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                vme0VarM198941d.m198939b();
                return ox2VarMo8090f;
            } catch (IOException e) {
                this.f6231l.mo8065a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f6217r, "getResource", e);
                vme0VarM198941d.m198945h(e);
                CacheEventListener cacheEventListener3 = this.f6224e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8066a(vme0VarM198941d);
                }
                vme0VarM198941d.m198939b();
                return null;
            }
        } catch (Throwable th2) {
            vme0VarM198941d.m198939b();
            throw th2;
        }
    }

    @Override // p149l.mfi
    /* JADX INFO: renamed from: d */
    public boolean mo8122d(cx3 cx3Var) throws Throwable {
        String str;
        IOException e;
        String str2 = null;
        try {
            try {
                synchronized (this.f6235p) {
                    try {
                        List<String> listM118543b = ex3.m118543b(cx3Var);
                        int i = 0;
                        while (i < listM118543b.size()) {
                            String str3 = listM118543b.get(i);
                            if (this.f6229j.mo8089e(str3, cx3Var)) {
                                this.f6225f.add(str3);
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
                            vme0 vme0VarM198945h = vme0.m198938a().m198941d(cx3Var).m198947j(str).m198945h(e);
                            CacheEventListener cacheEventListener = this.f6224e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8066a(vme0VarM198945h);
                            }
                            vme0VarM198945h.m198939b();
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

    @Override // p149l.mfi
    /* JADX INFO: renamed from: e */
    public void mo8123e(cx3 cx3Var) {
        synchronized (this.f6235p) {
            try {
                List<String> listM118543b = ex3.m118543b(cx3Var);
                for (int i = 0; i < listM118543b.size(); i++) {
                    String str = listM118543b.get(i);
                    this.f6229j.remove(str);
                    this.f6225f.remove(str);
                }
            } catch (IOException e) {
                this.f6231l.mo8065a(CacheErrorLogger.CacheErrorCategory.DELETE_FILE, f6217r, "delete: " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final ox2 m8124j(InterfaceC1586b.b bVar, cx3 cx3Var, String str) throws IOException {
        ox2 ox2VarMo8110b;
        synchronized (this.f6235p) {
            ox2VarMo8110b = bVar.mo8110b(cx3Var);
            this.f6225f.add(str);
            this.f6233n.m8135c(ox2VarMo8110b.size(), 1L);
        }
        return ox2VarMo8110b;
    }

    /* JADX INFO: renamed from: k */
    public final void m8125k(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<InterfaceC1586b.a> collectionM8126l = m8126l(this.f6229j.mo8091g());
            long jM8134b = this.f6233n.m8134b();
            long j2 = jM8134b - j;
            int i = 0;
            long j3 = 0;
            for (InterfaceC1586b.a aVar : collectionM8126l) {
                if (j3 > j2) {
                    break;
                }
                long jMo8085a = this.f6229j.mo8085a(aVar);
                this.f6225f.remove(aVar.getId());
                if (jMo8085a > 0) {
                    i++;
                    j3 += jMo8085a;
                    vme0 vme0VarM198942e = vme0.m198938a().m198947j(aVar.getId()).m198944g(evictionReason).m198946i(jMo8085a).m198943f(jM8134b - j3).m198942e(j);
                    CacheEventListener cacheEventListener = this.f6224e;
                    if (cacheEventListener != null) {
                        cacheEventListener.mo8068c(vme0VarM198942e);
                    }
                    vme0VarM198942e.m198939b();
                }
            }
            this.f6233n.m8135c(-j3, -i);
            this.f6229j.mo8088d();
        } catch (IOException e) {
            this.f6231l.mo8065a(CacheErrorLogger.CacheErrorCategory.EVICTION, f6217r, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Collection<InterfaceC1586b.a> m8126l(Collection<InterfaceC1586b.a> collection) {
        long jNow = this.f6234o.now() + f6218s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC1586b.a aVar : collection) {
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f6230k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean m8127m(cx3 cx3Var) {
        synchronized (this.f6235p) {
            try {
                List<String> listM118543b = ex3.m118543b(cx3Var);
                for (int i = 0; i < listM118543b.size(); i++) {
                    if (this.f6225f.contains(listM118543b.get(i))) {
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
    public final void m8128n() throws IOException {
        synchronized (this.f6235p) {
            try {
                boolean zM8129o = m8129o();
                m8132r();
                long jM8134b = this.f6233n.m8134b();
                if (jM8134b > this.f6223d && !zM8129o) {
                    this.f6233n.m8137e();
                    m8129o();
                }
                long j = this.f6223d;
                if (jM8134b > j) {
                    m8125k((j * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8129o() {
        long jNow = this.f6234o.now();
        if (this.f6233n.m8136d()) {
            long j = this.f6226g;
            if (j != -1 && jNow - j <= f6219t) {
                return false;
            }
        }
        return m8130p();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8130p() {
        boolean z;
        long j;
        long jNow = this.f6234o.now();
        long j2 = f6218s + jNow;
        Set<String> hashSet = (this.f6232m && this.f6225f.isEmpty()) ? this.f6225f : this.f6232m ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            z = false;
            for (InterfaceC1586b.a aVar : this.f6229j.mo8091g()) {
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
                        if (this.f6232m) {
                            rf80.m179116g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j2 = j;
                } catch (IOException e) {
                    e = e;
                    this.f6231l.mo8065a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f6217r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z;
                }
            }
            if (z2) {
                this.f6231l.mo8065a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f6217r, "Future timestamp found in " + i2 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j3 = i;
            if (this.f6233n.m8133a() != j3 || this.f6233n.m8134b() != size) {
                if (this.f6232m && this.f6225f != hashSet) {
                    rf80.m179116g(hashSet);
                    this.f6225f.clear();
                    this.f6225f.addAll(hashSet);
                }
                this.f6233n.m8138f(size, j3);
            }
            this.f6226g = jNow;
            return true;
        } catch (IOException e2) {
            e = e2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC1586b.b m8131q(String str, cx3 cx3Var) throws IOException {
        m8128n();
        return this.f6229j.mo8086b(str, cx3Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m8132r() {
        if (this.f6228i.m8172f(this.f6229j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f6221b - this.f6233n.m8134b())) {
            this.f6223d = this.f6220a;
        } else {
            this.f6223d = this.f6221b;
        }
    }
}
