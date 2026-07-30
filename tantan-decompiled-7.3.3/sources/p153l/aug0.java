package p153l;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class aug0 extends tjg0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public final int f73493b;

    /* JADX INFO: renamed from: c */
    public final String f73494c;

    /* JADX INFO: renamed from: d */
    public final Uri f73495d;

    /* JADX INFO: renamed from: e */
    public final Map f73496e;

    /* JADX INFO: renamed from: f */
    public bog0 f73497f;

    /* JADX INFO: renamed from: g */
    public final int f73498g;

    /* JADX INFO: renamed from: h */
    public final int f73499h;

    /* JADX INFO: renamed from: i */
    public final int f73500i;

    /* JADX INFO: renamed from: j */
    public final int f73501j;

    /* JADX INFO: renamed from: k */
    public final int f73502k;

    /* JADX INFO: renamed from: l */
    public final Integer f73503l;

    /* JADX INFO: renamed from: m */
    public final boolean f73504m;

    /* JADX INFO: renamed from: n */
    public final boolean f73505n;

    /* JADX INFO: renamed from: o */
    public final int f73506o;

    /* JADX INFO: renamed from: p */
    public volatile eog0 f73507p;

    /* JADX INFO: renamed from: q */
    public final AtomicLong f73508q = new AtomicLong();

    /* JADX INFO: renamed from: r */
    public final boolean f73509r;

    /* JADX INFO: renamed from: s */
    public final mhg0 f73510s;

    /* JADX INFO: renamed from: t */
    public final File f73511t;

    /* JADX INFO: renamed from: u */
    public final File f73512u;

    /* JADX INFO: renamed from: v */
    public File f73513v;

    /* JADX INFO: renamed from: w */
    public String f73514w;

    /* JADX INFO: renamed from: x */
    public final Map f73515x;

    public aug0(String str, Uri uri, int i, int i2, int i3, int i4, int i5, boolean z, int i6, HashMap map, String str2, boolean z2, Boolean bool, Integer num, HashMap map2) {
        String name;
        int iM142802i;
        Boolean bool2;
        String name2;
        this.f73494c = str;
        this.f73495d = uri;
        this.f73498g = i;
        this.f73499h = i2;
        this.f73500i = i3;
        this.f73501j = i4;
        this.f73502k = i5;
        this.f73505n = z;
        this.f73506o = i6;
        this.f73496e = map;
        this.f73504m = z2;
        this.f73503l = num;
        this.f73515x = map2;
        if (uri.getScheme().equals("file")) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        yg3.m215829a("If you want filename from response please make sure you provide path is directory ", file.getPath());
                        throw null;
                    }
                    name2 = !ytg0.m217312d(str2) ? null : str2;
                    this.f73512u = file;
                } else {
                    if (file.exists() && file.isDirectory() && ytg0.m217312d(str2)) {
                        yg3.m215829a("If you don't want filename from response please make sure you have already provided valid filename or not directory path ", file.getPath());
                        throw null;
                    }
                    if (ytg0.m217312d(str2)) {
                        name2 = file.getName();
                        File parentFile = file.getParentFile();
                        this.f73512u = parentFile == null ? new File("/") : parentFile;
                    } else {
                        this.f73512u = file;
                        name = str2;
                    }
                    bool2 = bool;
                }
                name = name2;
                bool2 = bool;
            } else {
                if (file.exists() && file.isDirectory()) {
                    bool2 = Boolean.TRUE;
                    this.f73512u = file;
                } else {
                    bool2 = Boolean.FALSE;
                    if (file.exists()) {
                        if (!ytg0.m217312d(str2) && !file.getName().equals(str2)) {
                            wg3.m206174a("Uri already provided filename!");
                            throw null;
                        }
                        name = file.getName();
                        File parentFile2 = file.getParentFile();
                        this.f73512u = parentFile2 == null ? new File("/") : parentFile2;
                    } else if (ytg0.m217312d(str2)) {
                        name = file.getName();
                        File parentFile3 = file.getParentFile();
                        this.f73512u = parentFile3 == null ? new File("/") : parentFile3;
                    } else {
                        this.f73512u = file;
                    }
                }
                name = str2;
            }
            this.f73509r = bool2.booleanValue();
        } else {
            this.f73509r = false;
            this.f73512u = new File(uri.getPath());
            name = str2;
        }
        if (ytg0.m217312d(name)) {
            this.f73510s = new mhg0();
            this.f73511t = this.f73512u;
        } else {
            this.f73510s = new mhg0(name);
            File file2 = new File(this.f73512u, name);
            this.f73513v = file2;
            this.f73511t = file2;
        }
        izg0 izg0Var = jwg0.m147162a().f122921c.f71160b;
        synchronized (izg0Var) {
            try {
                Integer num2 = (Integer) izg0Var.f117698c.f99778a.get(str + uri + this.f73510s.f136848a);
                Integer num3 = num2 != null ? num2 : null;
                if (num3 != null) {
                    iM142802i = num3.intValue();
                } else {
                    int size = izg0Var.f117696a.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        bog0 bog0Var = (bog0) izg0Var.f117696a.valueAt(i7);
                        if (bog0Var != null && bog0Var.m105678b(this)) {
                            iM142802i = bog0Var.f77674a;
                        }
                    }
                    int size2 = izg0Var.f117699d.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        tjg0 tjg0Var = (tjg0) izg0Var.f117699d.valueAt(i8);
                        if (tjg0Var != null && tjg0Var.m191442b(this)) {
                            iM142802i = tjg0Var.mo100394g();
                        }
                    }
                    iM142802i = izg0Var.m142802i();
                    izg0Var.f117699d.put(iM142802i, new xng0(iM142802i, this));
                    fmg0 fmg0Var = izg0Var.f117698c;
                    fmg0Var.getClass();
                    String str3 = this.f73494c + this.f73495d + this.f73510s.f136848a;
                    fmg0Var.f99778a.put(str3, Integer.valueOf(iM142802i));
                    fmg0Var.f99779b.put(iM142802i, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f73493b = iM142802i;
    }

    @Override // p153l.tjg0
    /* JADX INFO: renamed from: a */
    public final String mo100392a() {
        return this.f73510s.f136848a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((aug0) obj).f73498g - this.f73498g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aug0)) {
            return false;
        }
        aug0 aug0Var = (aug0) obj;
        if (aug0Var.f73493b == this.f73493b) {
            return true;
        }
        return m191442b(aug0Var);
    }

    @Override // p153l.tjg0
    /* JADX INFO: renamed from: f */
    public final File mo100393f() {
        return this.f73512u;
    }

    @Override // p153l.tjg0
    /* JADX INFO: renamed from: g */
    public final int mo100394g() {
        return this.f73493b;
    }

    @Override // p153l.tjg0
    /* JADX INFO: renamed from: h */
    public final File mo100395h() {
        return this.f73511t;
    }

    public final int hashCode() {
        return (this.f73494c + this.f73511t.toString() + this.f73510s.f136848a).hashCode();
    }

    @Override // p153l.tjg0
    /* JADX INFO: renamed from: i */
    public final String mo100396i() {
        return this.f73494c;
    }

    /* JADX INFO: renamed from: j */
    public final File m100397j() {
        String str = this.f73510s.f136848a;
        if (str == null) {
            return null;
        }
        if (this.f73513v == null) {
            this.f73513v = new File(this.f73512u, str);
        }
        return this.f73513v;
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
    public final void m100398m(eog0 eog0Var) {
        File fileM100397j;
        long length;
        String str;
        this.f73507p = eog0Var;
        ieg0 ieg0Var = jwg0.m147162a().f122919a;
        ieg0Var.f114585h.incrementAndGet();
        synchronized (ieg0Var) {
            try {
                Objects.toString(this);
                if (this.f73504m) {
                    agg0 agg0Var = jwg0.m147162a().f122921c;
                    bog0 bog0Var = (bog0) agg0Var.f71160b.f117696a.get(this.f73493b);
                    String str2 = this.f73510s.f136848a;
                    File file = this.f73512u;
                    File fileM100397j2 = m100397j();
                    long j = 0;
                    if (bog0Var == null) {
                        if (!agg0Var.f71160b.f117701f.contains(Integer.valueOf(this.f73493b))) {
                            if (fileM100397j2 == null || !fileM100397j2.exists()) {
                                String str3 = (String) agg0Var.f71160b.f117697b.get(this.f73494c);
                                if (str3 == null || !new File(file, str3).exists()) {
                                }
                            }
                            if (this.f73510s.f136848a == null) {
                                nmg0 nmg0Var = jwg0.m147162a().f122925g;
                                agg0 agg0Var2 = jwg0.m147162a().f122921c;
                                str = (String) agg0Var2.f71160b.f117697b.get(this.f73494c);
                                if (str == null) {
                                    this.f73510s.f136848a = str;
                                }
                            }
                            nmg0 nmg0Var2 = jwg0.m147162a().f122925g;
                            ieg0Var.f114586i.getClass();
                            bog0 bog0Var2 = new bog0(this.f73493b, this.f73494c, this.f73512u, this.f73510s.f136848a);
                            if (this.f73495d.getScheme().equals("content")) {
                                length = ytg0.m217309a(this.f73495d);
                            } else {
                                fileM100397j = m100397j();
                                if (fileM100397j == null) {
                                    toString();
                                } else {
                                    length = fileM100397j.length();
                                }
                                long j2 = j;
                                bog0Var2.f77680g.add(new akg0(0L, j2, j2));
                                this.f73497f = bog0Var2;
                                jwg0.m147162a().f122920b.f84561a.m169861d(this, 1, null);
                            }
                            j = length;
                            long j3 = j;
                            bog0Var2.f77680g.add(new akg0(0L, j3, j3));
                            this.f73497f = bog0Var2;
                            jwg0.m147162a().f122920b.f84561a.m169861d(this, 1, null);
                        }
                    } else if (bog0Var.f77682i || bog0Var.m105679c() > 0) {
                        if (fileM100397j2 != null && fileM100397j2.equals(bog0Var.m105680d()) && fileM100397j2.exists() && bog0Var.m105681e() == bog0Var.m105679c()) {
                            if (this.f73510s.f136848a == null) {
                                nmg0 nmg0Var3 = jwg0.m147162a().f122925g;
                                agg0 agg0Var3 = jwg0.m147162a().f122921c;
                                str = (String) agg0Var3.f71160b.f117697b.get(this.f73494c);
                                if (str == null) {
                                    this.f73510s.f136848a = str;
                                }
                            }
                            nmg0 nmg0Var4 = jwg0.m147162a().f122925g;
                            ieg0Var.f114586i.getClass();
                            bog0 bog0Var3 = new bog0(this.f73493b, this.f73494c, this.f73512u, this.f73510s.f136848a);
                            if (this.f73495d.getScheme().equals("content")) {
                                length = ytg0.m217309a(this.f73495d);
                            } else {
                                fileM100397j = m100397j();
                                if (fileM100397j == null) {
                                    toString();
                                } else {
                                    length = fileM100397j.length();
                                }
                                long j4 = j;
                                bog0Var3.f77680g.add(new akg0(0L, j4, j4));
                                this.f73497f = bog0Var3;
                                jwg0.m147162a().f122920b.f84561a.m169861d(this, 1, null);
                            }
                            j = length;
                            long j5 = j;
                            bog0Var3.f77680g.add(new akg0(0L, j5, j5));
                            this.f73497f = bog0Var3;
                            jwg0.m147162a().f122920b.f84561a.m169861d(this, 1, null);
                        } else if ((str2 != null || bog0Var.m105680d() == null || !bog0Var.m105680d().exists()) && fileM100397j2 != null && fileM100397j2.equals(bog0Var.m105680d())) {
                            fileM100397j2.exists();
                        }
                    }
                    if (ieg0Var.m139608g(this, ieg0Var.f114579b) && !ieg0Var.m139608g(this, ieg0Var.f114580c) && !ieg0Var.m139608g(this, ieg0Var.f114581d)) {
                        int size = ieg0Var.f114579b.size();
                        ieg0Var.m139604c(this);
                        if (size != ieg0Var.f114579b.size()) {
                            Collections.sort(ieg0Var.f114579b);
                        }
                    }
                } else if (ieg0Var.m139608g(this, ieg0Var.f114579b)) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ieg0Var.f114585h.decrementAndGet();
    }

    /* JADX INFO: renamed from: n */
    public final void m100399n() {
        ieg0 ieg0Var = jwg0.m147162a().f122919a;
        ieg0Var.f114585h.incrementAndGet();
        synchronized (ieg0Var) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                ieg0Var.m139605d(this, arrayList, arrayList2);
                ieg0Var.m139603b(arrayList, arrayList2);
                if (arrayList.size() <= 0) {
                    arrayList2.size();
                }
            } catch (Throwable th) {
                ieg0Var.m139603b(arrayList, arrayList2);
                throw th;
            }
        }
        ieg0Var.f114585h.decrementAndGet();
        ieg0Var.m139609h();
    }

    public final String toString() {
        return super.toString() + "@" + this.f73493b + "@" + this.f73494c + "@" + this.f73512u.toString() + "/" + this.f73510s.f136848a;
    }
}
