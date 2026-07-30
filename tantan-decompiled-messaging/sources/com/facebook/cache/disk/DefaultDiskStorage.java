package com.facebook.cache.disk;

import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.fhi;
import p149l.ghi;
import p149l.lfi;
import p149l.mbq0;
import p149l.o95;
import p149l.ox2;
import p149l.rf80;
import p149l.ugh0;
import p149l.uqb;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDiskStorage implements InterfaceC1586b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f6196f = DefaultDiskStorage.class;

    /* JADX INFO: renamed from: g */
    public static final long f6197g = 1800000;

    /* JADX INFO: renamed from: a */
    public final File f6198a;

    /* JADX INFO: renamed from: b */
    public final boolean f6199b;

    /* JADX INFO: renamed from: c */
    public final File f6200c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f6201d;

    /* JADX INFO: renamed from: e */
    public final o95 f6202e;

    public static class IncompleteFileException extends IOException {
        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$a */
    public class C1580a implements ghi {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC1586b.a> f6203a;

        public C1580a() {
            this.f6203a = new ArrayList();
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: a */
        public void mo8101a(File file) {
            C1582c c1582cM8096t = DefaultDiskStorage.this.m8096t(file);
            if (c1582cM8096t == null || c1582cM8096t.f6209a != ".cnt") {
                return;
            }
            this.f6203a.add(new C1581b(c1582cM8096t.f6210b, file));
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: b */
        public void mo8102b(File file) {
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: c */
        public void mo8103c(File file) {
        }

        /* JADX INFO: renamed from: d */
        public List<InterfaceC1586b.a> m8104d() {
            return Collections.unmodifiableList(this.f6203a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$b */
    @VisibleForTesting
    public static class C1581b implements InterfaceC1586b.a {

        /* JADX INFO: renamed from: a */
        public final String f6205a;

        /* JADX INFO: renamed from: b */
        public final lfi f6206b;

        /* JADX INFO: renamed from: c */
        public long f6207c;

        /* JADX INFO: renamed from: d */
        public long f6208d;

        public C1581b(String str, File file) {
            rf80.m179116g(file);
            this.f6205a = (String) rf80.m179116g(str);
            this.f6206b = lfi.m149698b(file);
            this.f6207c = -1L;
            this.f6208d = -1L;
        }

        /* JADX INFO: renamed from: a */
        public lfi m8105a() {
            return this.f6206b;
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.a
        public String getId() {
            return this.f6205a;
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.a
        public long getSize() {
            if (this.f6207c < 0) {
                this.f6207c = this.f6206b.size();
            }
            return this.f6207c;
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.a
        public long getTimestamp() {
            if (this.f6208d < 0) {
                this.f6208d = this.f6206b.getFile().lastModified();
            }
            return this.f6208d;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$c */
    public static class C1582c {

        /* JADX INFO: renamed from: a */
        public final String f6209a;

        /* JADX INFO: renamed from: b */
        public final String f6210b;

        public C1582c(String str, String str2) {
            this.f6209a = str;
            this.f6210b = str2;
        }

        /* JADX INFO: renamed from: b */
        public static C1582c m8106b(File file) {
            String strM8081r;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strM8081r = DefaultDiskStorage.m8081r(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strM8081r.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new C1582c(strM8081r, strSubstring);
        }

        /* JADX INFO: renamed from: a */
        public File m8107a(File file) throws IOException {
            return File.createTempFile(this.f6210b + ".", ".tmp", file);
        }

        /* JADX INFO: renamed from: c */
        public String m8108c(String str) {
            return str + File.separator + this.f6210b + this.f6209a;
        }

        public String toString() {
            return this.f6209a + "(" + this.f6210b + ")";
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$d */
    @VisibleForTesting
    public class C1583d implements InterfaceC1586b.b {

        /* JADX INFO: renamed from: a */
        public final String f6211a;

        /* JADX INFO: renamed from: b */
        @VisibleForTesting
        public final File f6212b;

        public C1583d(String str, File file) {
            this.f6211a = str;
            this.f6212b = file;
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.b
        /* JADX INFO: renamed from: a */
        public void mo8109a(mbq0 mbq0Var, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f6212b);
                try {
                    uqb uqbVar = new uqb(fileOutputStream);
                    mbq0Var.mo153972a(uqbVar);
                    uqbVar.flush();
                    long jM194987k = uqbVar.m194987k();
                    fileOutputStream.close();
                    if (this.f6212b.length() != jM194987k) {
                        throw new IncompleteFileException(jM194987k, this.f6212b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.this.f6201d.mo8065a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f6196f, "updateResource", e);
                throw e;
            }
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.b
        /* JADX INFO: renamed from: b */
        public ox2 mo8110b(Object obj) throws IOException {
            return m8111c(obj, DefaultDiskStorage.this.f6202e.now());
        }

        /* JADX INFO: renamed from: c */
        public ox2 m8111c(Object obj, long j) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File fileM8093p = DefaultDiskStorage.this.m8093p(this.f6211a);
            try {
                FileUtils.m8145b(this.f6212b, fileM8093p);
                if (fileM8093p.exists()) {
                    fileM8093p.setLastModified(j);
                }
                return lfi.m149698b(fileM8093p);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    cacheErrorCategory = cause instanceof FileNotFoundException ? CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.f6201d.mo8065a(cacheErrorCategory, DefaultDiskStorage.f6196f, "commit", e);
                throw e;
            }
        }

        @Override // com.facebook.cache.disk.InterfaceC1586b.b
        public boolean cleanUp() {
            return !this.f6212b.exists() || this.f6212b.delete();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$e */
    public class C1584e implements ghi {

        /* JADX INFO: renamed from: a */
        public boolean f6214a;

        public C1584e() {
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: a */
        public void mo8101a(File file) {
            if (this.f6214a && m8112d(file)) {
                return;
            }
            file.delete();
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: b */
        public void mo8102b(File file) {
            if (!DefaultDiskStorage.this.f6198a.equals(file) && !this.f6214a) {
                file.delete();
            }
            if (this.f6214a && file.equals(DefaultDiskStorage.this.f6200c)) {
                this.f6214a = false;
            }
        }

        @Override // p149l.ghi
        /* JADX INFO: renamed from: c */
        public void mo8103c(File file) {
            if (this.f6214a || !file.equals(DefaultDiskStorage.this.f6200c)) {
                return;
            }
            this.f6214a = true;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m8112d(File file) {
            C1582c c1582cM8096t = DefaultDiskStorage.this.m8096t(file);
            if (c1582cM8096t == null) {
                return false;
            }
            String str = c1582cM8096t.f6209a;
            if (str == ".tmp") {
                return m8113e(file);
            }
            rf80.m179118i(str == ".cnt");
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m8113e(File file) {
            return file.lastModified() > DefaultDiskStorage.this.f6202e.now() - DefaultDiskStorage.f6197g;
        }
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        rf80.m179116g(file);
        this.f6198a = file;
        this.f6199b = m8083x(file, cacheErrorLogger);
        this.f6200c = new File(file, m8082w(i));
        this.f6201d = cacheErrorLogger;
        m8084A();
        this.f6202e = ugh0.m193563a();
    }

    /* JADX INFO: renamed from: r */
    public static String m8081r(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public static String m8082w(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m8083x(File file, CacheErrorLogger cacheErrorLogger) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e) {
                    e = e;
                    cacheErrorLogger.mo8065a(CacheErrorLogger.CacheErrorCategory.OTHER, f6196f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                canonicalPath = null;
            }
        } catch (Exception e3) {
            cacheErrorLogger.mo8065a(CacheErrorLogger.CacheErrorCategory.OTHER, f6196f, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m8084A() {
        if (this.f6198a.exists()) {
            if (this.f6200c.exists()) {
                return;
            } else {
                fhi.m121358b(this.f6198a);
            }
        }
        try {
            FileUtils.m8144a(this.f6200c);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.f6201d.mo8065a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6196f, "version directory could not be created: " + this.f6200c, null);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: a */
    public long mo8085a(InterfaceC1586b.a aVar) {
        return m8092o(((C1581b) aVar).m8105a().getFile());
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: b */
    public InterfaceC1586b.b mo8086b(String str, Object obj) throws IOException {
        C1582c c1582c = new C1582c(".tmp", str);
        File fileM8097u = m8097u(c1582c.f6210b);
        if (!fileM8097u.exists()) {
            m8099y(fileM8097u, "insert");
        }
        try {
            return new C1583d(str, c1582c.m8107a(fileM8097u));
        } catch (IOException e) {
            this.f6201d.mo8065a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f6196f, "insert", e);
            throw e;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: c */
    public boolean mo8087c(String str, Object obj) {
        return m8100z(str, false);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: d */
    public void mo8088d() {
        fhi.m121359c(this.f6198a, new C1584e());
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: e */
    public boolean mo8089e(String str, Object obj) {
        return m8100z(str, true);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: f */
    public ox2 mo8090f(String str, Object obj) {
        File fileM8093p = m8093p(str);
        if (!fileM8093p.exists()) {
            return null;
        }
        fileM8093p.setLastModified(this.f6202e.now());
        return lfi.m149699c(fileM8093p);
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    public boolean isExternal() {
        return this.f6199b;
    }

    /* JADX INFO: renamed from: o */
    public final long m8092o(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public File m8093p(String str) {
        return new File(m8095s(str));
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1586b.a> mo8091g() throws IOException {
        C1580a c1580a = new C1580a();
        fhi.m121359c(this.f6200c, c1580a);
        return c1580a.m8104d();
    }

    @Override // com.facebook.cache.disk.InterfaceC1586b
    public long remove(String str) {
        return m8092o(m8093p(str));
    }

    /* JADX INFO: renamed from: s */
    public final String m8095s(String str) {
        C1582c c1582c = new C1582c(".cnt", str);
        return c1582c.m8108c(m8098v(c1582c.f6210b));
    }

    /* JADX INFO: renamed from: t */
    public final C1582c m8096t(File file) {
        C1582c c1582cM8106b = C1582c.m8106b(file);
        if (c1582cM8106b != null && m8097u(c1582cM8106b.f6210b).equals(file.getParentFile())) {
            return c1582cM8106b;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final File m8097u(String str) {
        return new File(m8098v(str));
    }

    /* JADX INFO: renamed from: v */
    public final String m8098v(String str) {
        return this.f6200c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    /* JADX INFO: renamed from: y */
    public final void m8099y(File file, String str) throws IOException {
        try {
            FileUtils.m8144a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.f6201d.mo8065a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6196f, str, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8100z(String str, boolean z) {
        File fileM8093p = m8093p(str);
        boolean zExists = fileM8093p.exists();
        if (z && zExists) {
            fileM8093p.setLastModified(this.f6202e.now());
        }
        return zExists;
    }
}
