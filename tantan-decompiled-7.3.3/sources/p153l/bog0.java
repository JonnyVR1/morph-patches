package p153l;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bog0 {

    /* JADX INFO: renamed from: a */
    public final int f77674a;

    /* JADX INFO: renamed from: b */
    public final String f77675b;

    /* JADX INFO: renamed from: c */
    public String f77676c;

    /* JADX INFO: renamed from: d */
    public final File f77677d;

    /* JADX INFO: renamed from: e */
    public File f77678e;

    /* JADX INFO: renamed from: f */
    public final mhg0 f77679f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f77680g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final boolean f77681h;

    /* JADX INFO: renamed from: i */
    public boolean f77682i;

    public bog0(int i, String str, File file, String str2) {
        this.f77674a = i;
        this.f77675b = str;
        this.f77677d = file;
        if (ytg0.m217312d(str2)) {
            this.f77679f = new mhg0();
            this.f77681h = true;
        } else {
            this.f77679f = new mhg0(str2);
            this.f77681h = false;
            this.f77678e = new File(file, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final bog0 m105677a() {
        bog0 bog0Var = new bog0(this.f77674a, this.f77675b, this.f77677d, this.f77679f.f136848a, this.f77681h);
        bog0Var.f77682i = this.f77682i;
        ArrayList arrayList = this.f77680g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            akg0 akg0Var = (akg0) obj;
            bog0Var.f77680g.add(new akg0(akg0Var.f72003a, akg0Var.f72004b, akg0Var.f72005c.get()));
        }
        return bog0Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m105678b(aug0 aug0Var) {
        if (!this.f77677d.equals(aug0Var.f73512u) || !this.f77675b.equals(aug0Var.f73494c)) {
            return false;
        }
        String str = aug0Var.f73510s.f136848a;
        if (str != null && str.equals(this.f77679f.f136848a)) {
            return true;
        }
        if (this.f77681h && aug0Var.f73509r) {
            return str == null || str.equals(this.f77679f.f136848a);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final long m105679c() {
        if (this.f77682i) {
            return m105681e();
        }
        Object[] array = this.f77680g.toArray();
        long j = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof akg0) {
                    j += ((akg0) obj).f72004b;
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final File m105680d() {
        String str = this.f77679f.f136848a;
        if (str == null) {
            return null;
        }
        if (this.f77678e == null) {
            this.f77678e = new File(this.f77677d, str);
        }
        return this.f77678e;
    }

    /* JADX INFO: renamed from: e */
    public final long m105681e() {
        Object[] array = this.f77680g.toArray();
        long j = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof akg0) {
                    j = ((akg0) obj).f72005c.get() + j;
                }
            }
        }
        return j;
    }

    public final String toString() {
        return "id[" + this.f77674a + "] url[" + this.f77675b + "] etag[" + this.f77676c + "] taskOnlyProvidedParentPath[" + this.f77681h + "] parent path[" + this.f77677d + "] filename[" + this.f77679f.f136848a + "] block(s):" + this.f77680g.toString();
    }

    public bog0(int i, String str, File file, String str2, boolean z) {
        this.f77674a = i;
        this.f77675b = str;
        this.f77677d = file;
        if (ytg0.m217312d(str2)) {
            this.f77679f = new mhg0();
        } else {
            this.f77679f = new mhg0(str2);
        }
        this.f77681h = z;
    }
}
