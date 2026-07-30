package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class sof0 implements by3 {

    /* JADX INFO: renamed from: a */
    public final String f169882a;

    /* JADX INFO: renamed from: b */
    public final boolean f169883b;

    public sof0(String str, boolean z) {
        this.f169882a = (String) wn80.m207182g(str);
        this.f169883b = z;
    }

    @Override // p153l.by3
    /* JADX INFO: renamed from: a */
    public String mo106961a() {
        return this.f169882a;
    }

    @Override // p153l.by3
    /* JADX INFO: renamed from: b */
    public boolean mo106962b() {
        return this.f169883b;
    }

    @Override // p153l.by3
    /* JADX INFO: renamed from: c */
    public boolean mo106963c(Uri uri) {
        return this.f169882a.contains(uri.toString());
    }

    @Override // p153l.by3
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sof0) {
            return this.f169882a.equals(((sof0) obj).f169882a);
        }
        return false;
    }

    @Override // p153l.by3
    public int hashCode() {
        return this.f169882a.hashCode();
    }

    @Override // p153l.by3
    public String toString() {
        return this.f169882a;
    }

    public sof0(String str) {
        this(str, false);
    }
}
