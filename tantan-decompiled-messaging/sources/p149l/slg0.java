package p149l;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class slg0 extends lbg0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public final int f165190b;

    /* JADX INFO: renamed from: c */
    public final String f165191c;

    /* JADX INFO: renamed from: d */
    public final Uri f165192d;

    /* JADX INFO: renamed from: e */
    public final Map f165193e;

    /* JADX INFO: renamed from: f */
    public tfg0 f165194f;

    /* JADX INFO: renamed from: g */
    public final int f165195g;

    /* JADX INFO: renamed from: h */
    public final int f165196h;

    /* JADX INFO: renamed from: i */
    public final int f165197i;

    /* JADX INFO: renamed from: j */
    public final int f165198j;

    /* JADX INFO: renamed from: k */
    public final int f165199k;

    /* JADX INFO: renamed from: l */
    public final Integer f165200l;

    /* JADX INFO: renamed from: m */
    public final boolean f165201m;

    /* JADX INFO: renamed from: n */
    public final boolean f165202n;

    /* JADX INFO: renamed from: o */
    public final int f165203o;

    /* JADX INFO: renamed from: p */
    public volatile wfg0 f165204p;

    /* JADX INFO: renamed from: q */
    public final AtomicLong f165205q = new AtomicLong();

    /* JADX INFO: renamed from: r */
    public final boolean f165206r;

    /* JADX INFO: renamed from: s */
    public final e9g0 f165207s;

    /* JADX INFO: renamed from: t */
    public final File f165208t;

    /* JADX INFO: renamed from: u */
    public final File f165209u;

    /* JADX INFO: renamed from: v */
    public File f165210v;

    /* JADX INFO: renamed from: w */
    public String f165211w;

    /* JADX INFO: renamed from: x */
    public final Map f165212x;

    public slg0(String str, Uri uri, int i, int i2, int i3, int i4, int i5, boolean z, int i6, HashMap map, String str2, boolean z2, Boolean bool, Integer num, HashMap map2) {
        String name;
        int iM98398i;
        Boolean bool2;
        String name2;
        this.f165191c = str;
        this.f165192d = uri;
        this.f165195g = i;
        this.f165196h = i2;
        this.f165197i = i3;
        this.f165198j = i4;
        this.f165199k = i5;
        this.f165202n = z;
        this.f165203o = i6;
        this.f165193e = map;
        this.f165201m = z2;
        this.f165200l = num;
        this.f165212x = map2;
        if (uri.getScheme().equals("file")) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        kg3.m145878a("If you want filename from response please make sure you provide path is directory ", file.getPath());
                        throw null;
                    }
                    name2 = !qlg0.m175481d(str2) ? null : str2;
                    this.f165209u = file;
                } else {
                    if (file.exists() && file.isDirectory() && qlg0.m175481d(str2)) {
                        kg3.m145878a("If you don't want filename from response please make sure you have already provided valid filename or not directory path ", file.getPath());
                        throw null;
                    }
                    if (qlg0.m175481d(str2)) {
                        name2 = file.getName();
                        File parentFile = file.getParentFile();
                        this.f165209u = parentFile == null ? new File("/") : parentFile;
                    } else {
                        this.f165209u = file;
                        name = str2;
                    }
                    bool2 = bool;
                }
                name = name2;
                bool2 = bool;
            } else {
                if (file.exists() && file.isDirectory()) {
                    bool2 = Boolean.TRUE;
                    this.f165209u = file;
                } else {
                    bool2 = Boolean.FALSE;
                    if (file.exists()) {
                        if (!qlg0.m175481d(str2) && !file.getName().equals(str2)) {
                            ig3.m135964a("Uri already provided filename!");
                            throw null;
                        }
                        name = file.getName();
                        File parentFile2 = file.getParentFile();
                        this.f165209u = parentFile2 == null ? new File("/") : parentFile2;
                    } else if (qlg0.m175481d(str2)) {
                        name = file.getName();
                        File parentFile3 = file.getParentFile();
                        this.f165209u = parentFile3 == null ? new File("/") : parentFile3;
                    } else {
                        this.f165209u = file;
                    }
                }
                name = str2;
            }
            this.f165206r = bool2.booleanValue();
        } else {
            this.f165206r = false;
            this.f165209u = new File(uri.getPath());
            name = str2;
        }
        if (qlg0.m175481d(name)) {
            this.f165207s = new e9g0();
            this.f165208t = this.f165209u;
        } else {
            this.f165207s = new e9g0(name);
            File file2 = new File(this.f165209u, name);
            this.f165210v = file2;
            this.f165208t = file2;
        }
        arg0 arg0Var = bog0.m102944a().f76517c.f162913b;
        synchronized (arg0Var) {
            try {
                Integer num2 = (Integer) arg0Var.f71267c.f192384a.get(str + uri + this.f165207s.f90099a);
                Integer num3 = num2 != null ? num2 : null;
                if (num3 != null) {
                    iM98398i = num3.intValue();
                } else {
                    int size = arg0Var.f71265a.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        tfg0 tfg0Var = (tfg0) arg0Var.f71265a.valueAt(i7);
                        if (tfg0Var != null && tfg0Var.m188706b(this)) {
                            iM98398i = tfg0Var.f169975a;
                        }
                    }
                    int size2 = arg0Var.f71268d.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        lbg0 lbg0Var = (lbg0) arg0Var.f71268d.valueAt(i8);
                        if (lbg0Var != null && lbg0Var.m149224b(this)) {
                            iM98398i = lbg0Var.mo149226g();
                        }
                    }
                    iM98398i = arg0Var.m98398i();
                    arg0Var.f71268d.put(iM98398i, new pfg0(iM98398i, this));
                    xdg0 xdg0Var = arg0Var.f71267c;
                    xdg0Var.getClass();
                    String str3 = this.f165191c + this.f165192d + this.f165207s.f90099a;
                    xdg0Var.f192384a.put(str3, Integer.valueOf(iM98398i));
                    xdg0Var.f192385b.put(iM98398i, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f165190b = iM98398i;
    }

    @Override // p149l.lbg0
    /* JADX INFO: renamed from: a */
    public final String mo149223a() {
        return this.f165207s.f90099a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((slg0) obj).f165195g - this.f165195g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slg0)) {
            return false;
        }
        slg0 slg0Var = (slg0) obj;
        if (slg0Var.f165190b == this.f165190b) {
            return true;
        }
        return m149224b(slg0Var);
    }

    @Override // p149l.lbg0
    /* JADX INFO: renamed from: f */
    public final File mo149225f() {
        return this.f165209u;
    }

    @Override // p149l.lbg0
    /* JADX INFO: renamed from: g */
    public final int mo149226g() {
        return this.f165190b;
    }

    @Override // p149l.lbg0
    /* JADX INFO: renamed from: h */
    public final File mo149227h() {
        return this.f165208t;
    }

    public final int hashCode() {
        return (this.f165191c + this.f165208t.toString() + this.f165207s.f90099a).hashCode();
    }

    @Override // p149l.lbg0
    /* JADX INFO: renamed from: i */
    public final String mo149228i() {
        return this.f165191c;
    }

    /* JADX INFO: renamed from: j */
    public final File m184802j() {
        String str = this.f165207s.f90099a;
        if (str == null) {
            return null;
        }
        if (this.f165210v == null) {
            this.f165210v = new File(this.f165209u, str);
        }
        return this.f165210v;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0114 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011f A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x000e, B:6:0x0015, B:8:0x0035, B:10:0x0039, B:16:0x0049, B:18:0x0053, B:20:0x0059, B:44:0x00bf, B:46:0x00c5, B:49:0x00e0, B:50:0x00e4, B:52:0x010c, B:59:0x0124, B:60:0x0140, B:54:0x0114, B:56:0x011a, B:58:0x011f, B:24:0x0068, B:26:0x006e, B:30:0x007c, B:32:0x0086, B:33:0x008b, B:37:0x009f, B:40:0x00a6, B:42:0x00b4, B:62:0x0142, B:64:0x014a, B:66:0x0152, B:69:0x015b, B:71:0x016c, B:72:0x0171), top: B:81:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0175 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: m */
    public final void m184803m(wfg0 wfg0Var) {
        File fileM184802j;
        long length;
        String str;
        this.f165204p = wfg0Var;
        a6g0 a6g0Var = bog0.m102944a().f76515a;
        a6g0Var.f67766h.incrementAndGet();
        synchronized (a6g0Var) {
            try {
                Objects.toString(this);
                if (this.f165201m) {
                    s7g0 s7g0Var = bog0.m102944a().f76517c;
                    tfg0 tfg0Var = (tfg0) s7g0Var.f162913b.f71265a.get(this.f165190b);
                    String str2 = this.f165207s.f90099a;
                    File file = this.f165209u;
                    File fileM184802j2 = m184802j();
                    long j = 0;
                    if (tfg0Var == null) {
                        if (!s7g0Var.f162913b.f71270f.contains(Integer.valueOf(this.f165190b))) {
                            if (fileM184802j2 == null || !fileM184802j2.exists()) {
                                String str3 = (String) s7g0Var.f162913b.f71266b.get(this.f165191c);
                                if (str3 == null || !new File(file, str3).exists()) {
                                }
                            }
                            if (this.f165207s.f90099a == null) {
                                feg0 feg0Var = bog0.m102944a().f76521g;
                                s7g0 s7g0Var2 = bog0.m102944a().f76517c;
                                str = (String) s7g0Var2.f162913b.f71266b.get(this.f165191c);
                                if (str == null) {
                                    this.f165207s.f90099a = str;
                                }
                            }
                            feg0 feg0Var2 = bog0.m102944a().f76521g;
                            a6g0Var.f67767i.getClass();
                            tfg0 tfg0Var2 = new tfg0(this.f165190b, this.f165191c, this.f165209u, this.f165207s.f90099a);
                            if (this.f165192d.getScheme().equals("content")) {
                                length = qlg0.m175478a(this.f165192d);
                            } else {
                                fileM184802j = m184802j();
                                if (fileM184802j == null) {
                                    toString();
                                } else {
                                    length = fileM184802j.length();
                                }
                                long j2 = j;
                                tfg0Var2.f169981g.add(new sbg0(0L, j2, j2));
                                this.f165194f = tfg0Var2;
                                bog0.m102944a().f76516b.f182721a.m127589d(this, 1, null);
                            }
                            j = length;
                            long j3 = j;
                            tfg0Var2.f169981g.add(new sbg0(0L, j3, j3));
                            this.f165194f = tfg0Var2;
                            bog0.m102944a().f76516b.f182721a.m127589d(this, 1, null);
                        }
                    } else if (tfg0Var.f169983i || tfg0Var.m188707c() > 0) {
                        if (fileM184802j2 != null && fileM184802j2.equals(tfg0Var.m188708d()) && fileM184802j2.exists() && tfg0Var.m188709e() == tfg0Var.m188707c()) {
                            if (this.f165207s.f90099a == null) {
                                feg0 feg0Var3 = bog0.m102944a().f76521g;
                                s7g0 s7g0Var3 = bog0.m102944a().f76517c;
                                str = (String) s7g0Var3.f162913b.f71266b.get(this.f165191c);
                                if (str == null) {
                                    this.f165207s.f90099a = str;
                                }
                            }
                            feg0 feg0Var4 = bog0.m102944a().f76521g;
                            a6g0Var.f67767i.getClass();
                            tfg0 tfg0Var3 = new tfg0(this.f165190b, this.f165191c, this.f165209u, this.f165207s.f90099a);
                            if (this.f165192d.getScheme().equals("content")) {
                                length = qlg0.m175478a(this.f165192d);
                            } else {
                                fileM184802j = m184802j();
                                if (fileM184802j == null) {
                                    toString();
                                } else {
                                    length = fileM184802j.length();
                                }
                                long j4 = j;
                                tfg0Var3.f169981g.add(new sbg0(0L, j4, j4));
                                this.f165194f = tfg0Var3;
                                bog0.m102944a().f76516b.f182721a.m127589d(this, 1, null);
                            }
                            j = length;
                            long j5 = j;
                            tfg0Var3.f169981g.add(new sbg0(0L, j5, j5));
                            this.f165194f = tfg0Var3;
                            bog0.m102944a().f76516b.f182721a.m127589d(this, 1, null);
                        } else if ((str2 != null || tfg0Var.m188708d() == null || !tfg0Var.m188708d().exists()) && fileM184802j2 != null && fileM184802j2.equals(tfg0Var.m188708d())) {
                            fileM184802j2.exists();
                        }
                    }
                    if (a6g0Var.m95133g(this, a6g0Var.f67760b) && !a6g0Var.m95133g(this, a6g0Var.f67761c) && !a6g0Var.m95133g(this, a6g0Var.f67762d)) {
                        int size = a6g0Var.f67760b.size();
                        a6g0Var.m95129c(this);
                        if (size != a6g0Var.f67760b.size()) {
                            Collections.sort(a6g0Var.f67760b);
                        }
                    }
                } else if (a6g0Var.m95133g(this, a6g0Var.f67760b)) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a6g0Var.f67766h.decrementAndGet();
    }

    /* JADX INFO: renamed from: n */
    public final void m184804n() {
        a6g0 a6g0Var = bog0.m102944a().f76515a;
        a6g0Var.f67766h.incrementAndGet();
        synchronized (a6g0Var) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                a6g0Var.m95130d(this, arrayList, arrayList2);
                a6g0Var.m95128b(arrayList, arrayList2);
                if (arrayList.size() <= 0) {
                    arrayList2.size();
                }
            } catch (Throwable th) {
                a6g0Var.m95128b(arrayList, arrayList2);
                throw th;
            }
        }
        a6g0Var.f67766h.decrementAndGet();
        a6g0Var.m95134h();
    }

    public final String toString() {
        return super.toString() + "@" + this.f165190b + "@" + this.f165191c + "@" + this.f165209u.toString() + "/" + this.f165207s.f90099a;
    }
}
