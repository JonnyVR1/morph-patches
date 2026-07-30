package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p149l.fhi;
import p149l.ox2;
import p149l.rf80;
import p149l.syg0;
import p149l.tsf;

/* JADX INFO: renamed from: com.facebook.cache.disk.d */
/* JADX INFO: loaded from: classes.dex */
public class C1588d implements InterfaceC1586b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f6244f = C1588d.class;

    /* JADX INFO: renamed from: a */
    public final int f6245a;

    /* JADX INFO: renamed from: b */
    public final syg0<File> f6246b;

    /* JADX INFO: renamed from: c */
    public final String f6247c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f6248d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public volatile a f6249e = new a(null, null);

    /* JADX INFO: renamed from: com.facebook.cache.disk.d$a */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1586b f6250a;

        /* JADX INFO: renamed from: b */
        public final File f6251b;

        @VisibleForTesting
        public a(File file, InterfaceC1586b interfaceC1586b) {
            this.f6250a = interfaceC1586b;
            this.f6251b = file;
        }
    }

    public C1588d(int i, syg0<File> syg0Var, String str, CacheErrorLogger cacheErrorLogger) {
        this.f6245a = i;
        this.f6248d = cacheErrorLogger;
        this.f6246b = syg0Var;
        this.f6247c = str;
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: a */
    public long mo8085a(InterfaceC1586b.a aVar) throws IOException {
        return m8142k().mo8085a(aVar);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: b */
    public InterfaceC1586b.b mo8086b(String str, Object obj) throws IOException {
        return m8142k().mo8086b(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: c */
    public boolean mo8087c(String str, Object obj) throws IOException {
        return m8142k().mo8087c(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: d */
    public void mo8088d() {
        try {
            m8142k().mo8088d();
        } catch (IOException e) {
            tsf.m190539e(f6244f, "purgeUnexpectedResources", e);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: e */
    public boolean mo8089e(String str, Object obj) throws IOException {
        return m8142k().mo8089e(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: f */
    public ox2 mo8090f(String str, Object obj) throws IOException {
        return m8142k().mo8090f(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: g */
    public Collection<InterfaceC1586b.a> mo8091g() throws IOException {
        return m8142k().mo8091g();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public void m8139h(File file) throws IOException {
        try {
            FileUtils.m8144a(file);
            tsf.m190535a(f6244f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e) {
            this.f6248d.mo8065a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6244f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8140i() throws IOException {
        File file = new File(this.f6246b.get(), this.f6247c);
        m8139h(file);
        this.f6249e = new a(file, new DefaultDiskStorage(file, this.f6245a, this.f6248d));
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    public boolean isExternal() {
        try {
            return m8142k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m8141j() {
        if (this.f6249e.f6250a == null || this.f6249e.f6251b == null) {
            return;
        }
        fhi.m121358b(this.f6249e.f6251b);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public synchronized InterfaceC1586b m8142k() throws IOException {
        try {
            if (m8143l()) {
                m8141j();
                m8140i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1586b) rf80.m179116g(this.f6249e.f6250a);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8143l() {
        File file;
        a aVar = this.f6249e;
        return aVar.f6250a == null || (file = aVar.f6251b) == null || !file.exists();
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    public long remove(String str) throws IOException {
        return m8142k().remove(str);
    }
}
