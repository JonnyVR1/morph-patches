package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class lgf0 implements cx3 {

    /* JADX INFO: renamed from: a */
    public final String f127980a;

    /* JADX INFO: renamed from: b */
    public final boolean f127981b;

    public lgf0(String str, boolean z) {
        this.f127980a = (String) rf80.m179116g(str);
        this.f127981b = z;
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: a */
    public String mo103429a() {
        return this.f127980a;
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: b */
    public boolean mo103430b() {
        return this.f127981b;
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: c */
    public boolean mo103431c(Uri uri) {
        return this.f127980a.contains(uri.toString());
    }

    @Override // p149l.cx3
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lgf0) {
            return this.f127980a.equals(((lgf0) obj).f127980a);
        }
        return false;
    }

    @Override // p149l.cx3
    public int hashCode() {
        return this.f127980a.hashCode();
    }

    @Override // p149l.cx3
    public String toString() {
        return this.f127980a;
    }

    public lgf0(String str) {
        this(str, false);
    }
}
