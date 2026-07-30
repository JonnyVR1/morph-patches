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
import p153l.bph0;
import p153l.cki;
import p153l.dki;
import p153l.dy2;
import p153l.hii;
import p153l.isb;
import p153l.pa5;
import p153l.rkq0;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDiskStorage implements InterfaceC1609b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f6233f = DefaultDiskStorage.class;

    /* JADX INFO: renamed from: g */
    public static final long f6234g = 1800000;

    /* JADX INFO: renamed from: a */
    public final File f6235a;

    /* JADX INFO: renamed from: b */
    public final boolean f6236b;

    /* JADX INFO: renamed from: c */
    public final File f6237c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f6238d;

    /* JADX INFO: renamed from: e */
    public final pa5 f6239e;

    public static class IncompleteFileException extends IOException {
        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$a */
    public class C1603a implements dki {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC1609b.a> f6240a;

        public C1603a() {
            this.f6240a = new ArrayList();
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: a */
        public void mo8155a(File file) {
            C1605c c1605cM8150t = DefaultDiskStorage.this.m8150t(file);
            if (c1605cM8150t == null || c1605cM8150t.f6246a != ".cnt") {
                return;
            }
            this.f6240a.add(new C1604b(c1605cM8150t.f6247b, file));
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: b */
        public void mo8156b(File file) {
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: c */
        public void mo8157c(File file) {
        }

        /* JADX INFO: renamed from: d */
        public List<InterfaceC1609b.a> m8158d() {
            return Collections.unmodifiableList(this.f6240a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$b */
    @VisibleForTesting
    public static class C1604b implements InterfaceC1609b.a {

        /* JADX INFO: renamed from: a */
        public final String f6242a;

        /* JADX INFO: renamed from: b */
        public final hii f6243b;

        /* JADX INFO: renamed from: c */
        public long f6244c;

        /* JADX INFO: renamed from: d */
        public long f6245d;

        public C1604b(String str, File file) {
            wn80.m207182g(file);
            this.f6242a = (String) wn80.m207182g(str);
            this.f6243b = hii.m135123b(file);
            this.f6244c = -1L;
            this.f6245d = -1L;
        }

        /* JADX INFO: renamed from: a */
        public hii m8159a() {
            return this.f6243b;
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.a
        public String getId() {
            return this.f6242a;
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.a
        public long getSize() {
            if (this.f6244c < 0) {
                this.f6244c = this.f6243b.size();
            }
            return this.f6244c;
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.a
        public long getTimestamp() {
            if (this.f6245d < 0) {
                this.f6245d = this.f6243b.getFile().lastModified();
            }
            return this.f6245d;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$c */
    public static class C1605c {

        /* JADX INFO: renamed from: a */
        public final String f6246a;

        /* JADX INFO: renamed from: b */
        public final String f6247b;

        public C1605c(String str, String str2) {
            this.f6246a = str;
            this.f6247b = str2;
        }

        /* JADX INFO: renamed from: b */
        public static C1605c m8160b(File file) {
            String strM8135r;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strM8135r = DefaultDiskStorage.m8135r(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strM8135r.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new C1605c(strM8135r, strSubstring);
        }

        /* JADX INFO: renamed from: a */
        public File m8161a(File file) throws IOException {
            return File.createTempFile(this.f6247b + ".", ".tmp", file);
        }

        /* JADX INFO: renamed from: c */
        public String m8162c(String str) {
            return str + File.separator + this.f6247b + this.f6246a;
        }

        public String toString() {
            return this.f6246a + "(" + this.f6247b + ")";
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$d */
    @VisibleForTesting
    public class C1606d implements InterfaceC1609b.b {

        /* JADX INFO: renamed from: a */
        public final String f6248a;

        /* JADX INFO: renamed from: b */
        @VisibleForTesting
        public final File f6249b;

        public C1606d(String str, File file) {
            this.f6248a = str;
            this.f6249b = file;
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.b
        /* JADX INFO: renamed from: a */
        public void mo8163a(rkq0 rkq0Var, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f6249b);
                try {
                    isb isbVar = new isb(fileOutputStream);
                    rkq0Var.mo154201a(isbVar);
                    isbVar.flush();
                    long jM141870k = isbVar.m141870k();
                    fileOutputStream.close();
                    if (this.f6249b.length() != jM141870k) {
                        throw new IncompleteFileException(jM141870k, this.f6249b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.this.f6238d.mo8119a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f6233f, "updateResource", e);
                throw e;
            }
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.b
        /* JADX INFO: renamed from: b */
        public dy2 mo8164b(Object obj) throws IOException {
            return m8165c(obj, DefaultDiskStorage.this.f6239e.now());
        }

        /* JADX INFO: renamed from: c */
        public dy2 m8165c(Object obj, long j) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File fileM8147p = DefaultDiskStorage.this.m8147p(this.f6248a);
            try {
                FileUtils.m8199b(this.f6249b, fileM8147p);
                if (fileM8147p.exists()) {
                    fileM8147p.setLastModified(j);
                }
                return hii.m135123b(fileM8147p);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    cacheErrorCategory = cause instanceof FileNotFoundException ? CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.f6238d.mo8119a(cacheErrorCategory, DefaultDiskStorage.f6233f, "commit", e);
                throw e;
            }
        }

        @Override // com.facebook.cache.disk.InterfaceC1609b.b
        public boolean cleanUp() {
            return !this.f6249b.exists() || this.f6249b.delete();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$e */
    public class C1607e implements dki {

        /* JADX INFO: renamed from: a */
        public boolean f6251a;

        public C1607e() {
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: a */
        public void mo8155a(File file) {
            if (this.f6251a && m8166d(file)) {
                return;
            }
            file.delete();
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: b */
        public void mo8156b(File file) {
            if (!DefaultDiskStorage.this.f6235a.equals(file) && !this.f6251a) {
                file.delete();
            }
            if (this.f6251a && file.equals(DefaultDiskStorage.this.f6237c)) {
                this.f6251a = false;
            }
        }

        @Override // p153l.dki
        /* JADX INFO: renamed from: c */
        public void mo8157c(File file) {
            if (this.f6251a || !file.equals(DefaultDiskStorage.this.f6237c)) {
                return;
            }
            this.f6251a = true;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m8166d(File file) {
            C1605c c1605cM8150t = DefaultDiskStorage.this.m8150t(file);
            if (c1605cM8150t == null) {
                return false;
            }
            String str = c1605cM8150t.f6246a;
            if (str == ".tmp") {
                return m8167e(file);
            }
            wn80.m207184i(str == ".cnt");
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m8167e(File file) {
            return file.lastModified() > DefaultDiskStorage.this.f6239e.now() - DefaultDiskStorage.f6234g;
        }
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        wn80.m207182g(file);
        this.f6235a = file;
        this.f6236b = m8137x(file, cacheErrorLogger);
        this.f6237c = new File(file, m8136w(i));
        this.f6238d = cacheErrorLogger;
        m8138A();
        this.f6239e = bph0.m105843a();
    }

    /* JADX INFO: renamed from: r */
    public static String m8135r(String str) {
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
    public static String m8136w(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m8137x(File file, CacheErrorLogger cacheErrorLogger) {
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
                    cacheErrorLogger.mo8119a(CacheErrorLogger.CacheErrorCategory.OTHER, f6233f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                canonicalPath = null;
            }
        } catch (Exception e3) {
            cacheErrorLogger.mo8119a(CacheErrorLogger.CacheErrorCategory.OTHER, f6233f, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m8138A() {
        if (this.f6235a.exists()) {
            if (this.f6237c.exists()) {
                return;
            } else {
                cki.m110339b(this.f6235a);
            }
        }
        try {
            FileUtils.m8198a(this.f6237c);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.f6238d.mo8119a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6233f, "version directory could not be created: " + this.f6237c, null);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: a */
    public long mo8139a(InterfaceC1609b.a aVar) {
        return m8146o(((C1604b) aVar).m8159a().getFile());
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: b */
    public InterfaceC1609b.b mo8140b(String str, Object obj) throws IOException {
        C1605c c1605c = new C1605c(".tmp", str);
        File fileM8151u = m8151u(c1605c.f6247b);
        if (!fileM8151u.exists()) {
            m8153y(fileM8151u, "insert");
        }
        try {
            return new C1606d(str, c1605c.m8161a(fileM8151u));
        } catch (IOException e) {
            this.f6238d.mo8119a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f6233f, "insert", e);
            throw e;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: c */
    public boolean mo8141c(String str, Object obj) {
        return m8154z(str, false);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: d */
    public void mo8142d() {
        cki.m110340c(this.f6235a, new C1607e());
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: e */
    public boolean mo8143e(String str, Object obj) {
        return m8154z(str, true);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: f */
    public dy2 mo8144f(String str, Object obj) {
        File fileM8147p = m8147p(str);
        if (!fileM8147p.exists()) {
            return null;
        }
        fileM8147p.setLastModified(this.f6239e.now());
        return hii.m135124c(fileM8147p);
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    public boolean isExternal() {
        return this.f6236b;
    }

    /* JADX INFO: renamed from: o */
    public final long m8146o(File file) {
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
    public File m8147p(String str) {
        return new File(m8149s(str));
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1609b.a> mo8145g() throws IOException {
        C1603a c1603a = new C1603a();
        cki.m110340c(this.f6237c, c1603a);
        return c1603a.m8158d();
    }

    @Override // com.facebook.cache.disk.InterfaceC1609b
    public long remove(String str) {
        return m8146o(m8147p(str));
    }

    /* JADX INFO: renamed from: s */
    public final String m8149s(String str) {
        C1605c c1605c = new C1605c(".cnt", str);
        return c1605c.m8162c(m8152v(c1605c.f6247b));
    }

    /* JADX INFO: renamed from: t */
    public final C1605c m8150t(File file) {
        C1605c c1605cM8160b = C1605c.m8160b(file);
        if (c1605cM8160b != null && m8151u(c1605cM8160b.f6247b).equals(file.getParentFile())) {
            return c1605cM8160b;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final File m8151u(String str) {
        return new File(m8152v(str));
    }

    /* JADX INFO: renamed from: v */
    public final String m8152v(String str) {
        return this.f6237c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    /* JADX INFO: renamed from: y */
    public final void m8153y(File file, String str) throws IOException {
        try {
            FileUtils.m8198a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.f6238d.mo8119a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f6233f, str, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8154z(String str, boolean z) {
        File fileM8147p = m8147p(str);
        boolean zExists = fileM8147p.exists();
        if (z && zExists) {
            fileM8147p.setLastModified(this.f6239e.now());
        }
        return zExists;
    }
}
