package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p153l.a7h0;
import p153l.cki;
import p153l.dy2;
import p153l.huf;
import p153l.wn80;

/* JADX INFO: renamed from: com.facebook.cache.disk.d */
/* JADX INFO: loaded from: classes.dex */
public class C1611d implements InterfaceC1609b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f6281f = C1611d.class;

    /* JADX INFO: renamed from: a */
    public final int f6282a;

    /* JADX INFO: renamed from: b */
    public final a7h0<File> f6283b;

    /* JADX INFO: renamed from: c */
    public final String f6284c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f6285d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public volatile a f6286e = new a(null, null);

    /* JADX INFO: renamed from: com.facebook.cache.disk.d$a */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1609b f6287a;

        /* JADX INFO: renamed from: b */
        public final File f6288b;

        @VisibleForTesting
        public a(File file, InterfaceC1609b interfaceC1609b) {
            this.f6287a = interfaceC1609b;
            this.f6288b = file;
        }
    }

    public C1611d(int i, a7h0<File> a7h0Var, String str, CacheErrorLogger cacheErrorLogger) {
        this.f6282a = i;
        this.f6285d = cacheErrorLogger;
        this.f6283b = a7h0Var;
        this.f6284c = str;
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: a */
    public long mo8139a(InterfaceC1609b.a aVar) throws IOException {
        return m8196k().mo8139a(aVar);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: b */
    public InterfaceC1609b.b mo8140b(String str, Object obj) throws IOException {
        return m8196k().mo8140b(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: c */
    public boolean mo8141c(String str, Object obj) throws IOException {
        return m8196k().mo8141c(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: d */
    public void mo8142d() {
        try {
            m8196k().mo8142d();
        } catch (IOException e) {
            huf.m137177e(f6281f, "purgeUnexpectedResources", e);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: e */
    public boolean mo8143e(String str, Object obj) throws IOException {
        return m8196k().mo8143e(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: f */
    public dy2 mo8144f(String str, Object obj) throws IOException {
        return m8196k().mo8144f(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: g */
    public Collection<InterfaceC1609b.a> mo8145g() throws IOException {
        return m8196k().mo8145g();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public void m8193h(File file) throws IOException {
        try {
            FileUtils.m8198a(file);
            huf.m137173a(f6281f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e) {
            this.f6285d.mo8119a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6281f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8194i() throws IOException {
        File file = new File(this.f6283b.get(), this.f6284c);
        m8193h(file);
        this.f6286e = new a(file, new DefaultDiskStorage(file, this.f6282a, this.f6285d));
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    public boolean isExternal() {
        try {
            return m8196k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m8195j() {
        if (this.f6286e.f6287a == null || this.f6286e.f6288b == null) {
            return;
        }
        cki.m110339b(this.f6286e.f6288b);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public synchronized InterfaceC1609b m8196k() throws IOException {
        try {
            if (m8197l()) {
                m8195j();
                m8194i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1609b) wn80.m207182g(this.f6286e.f6287a);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8197l() {
        File file;
        a aVar = this.f6286e;
        return aVar.f6287a == null || (file = aVar.f6288b) == null || !file.exists();
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    public long remove(String str) throws IOException {
        return m8196k().remove(str);
    }
}
