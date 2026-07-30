package p149l;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tfg0 {

    /* JADX INFO: renamed from: a */
    public final int f169975a;

    /* JADX INFO: renamed from: b */
    public final String f169976b;

    /* JADX INFO: renamed from: c */
    public String f169977c;

    /* JADX INFO: renamed from: d */
    public final File f169978d;

    /* JADX INFO: renamed from: e */
    public File f169979e;

    /* JADX INFO: renamed from: f */
    public final e9g0 f169980f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f169981g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final boolean f169982h;

    /* JADX INFO: renamed from: i */
    public boolean f169983i;

    public tfg0(int i, String str, File file, String str2) {
        this.f169975a = i;
        this.f169976b = str;
        this.f169978d = file;
        if (qlg0.m175481d(str2)) {
            this.f169980f = new e9g0();
            this.f169982h = true;
        } else {
            this.f169980f = new e9g0(str2);
            this.f169982h = false;
            this.f169979e = new File(file, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final tfg0 m188705a() {
        tfg0 tfg0Var = new tfg0(this.f169975a, this.f169976b, this.f169978d, this.f169980f.f90099a, this.f169982h);
        tfg0Var.f169983i = this.f169983i;
        ArrayList arrayList = this.f169981g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sbg0 sbg0Var = (sbg0) obj;
            tfg0Var.f169981g.add(new sbg0(sbg0Var.f163534a, sbg0Var.f163535b, sbg0Var.f163536c.get()));
        }
        return tfg0Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m188706b(slg0 slg0Var) {
        if (!this.f169978d.equals(slg0Var.f165209u) || !this.f169976b.equals(slg0Var.f165191c)) {
            return false;
        }
        String str = slg0Var.f165207s.f90099a;
        if (str != null && str.equals(this.f169980f.f90099a)) {
            return true;
        }
        if (this.f169982h && slg0Var.f165206r) {
            return str == null || str.equals(this.f169980f.f90099a);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final long m188707c() {
        if (this.f169983i) {
            return m188709e();
        }
        Object[] array = this.f169981g.toArray();
        long j = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof sbg0) {
                    j += ((sbg0) obj).f163535b;
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final File m188708d() {
        String str = this.f169980f.f90099a;
        if (str == null) {
            return null;
        }
        if (this.f169979e == null) {
            this.f169979e = new File(this.f169978d, str);
        }
        return this.f169979e;
    }

    /* JADX INFO: renamed from: e */
    public final long m188709e() {
        Object[] array = this.f169981g.toArray();
        long j = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof sbg0) {
                    j = ((sbg0) obj).f163536c.get() + j;
                }
            }
        }
        return j;
    }

    public final String toString() {
        return "id[" + this.f169975a + "] url[" + this.f169976b + "] etag[" + this.f169977c + "] taskOnlyProvidedParentPath[" + this.f169982h + "] parent path[" + this.f169978d + "] filename[" + this.f169980f.f90099a + "] block(s):" + this.f169981g.toString();
    }

    public tfg0(int i, String str, File file, String str2, boolean z) {
        this.f169975a = i;
        this.f169976b = str;
        this.f169978d = file;
        if (qlg0.m175481d(str2)) {
            this.f169980f = new e9g0();
        } else {
            this.f169980f = new e9g0(str2);
        }
        this.f169982h = z;
    }
}
