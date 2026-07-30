package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class ykm implements mnb0 {

    /* JADX INFO: renamed from: d */
    public static final mnb0 f198776d = m215143d(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* JADX INFO: renamed from: a */
    public int f198777a;

    /* JADX INFO: renamed from: b */
    public boolean f198778b;

    /* JADX INFO: renamed from: c */
    public boolean f198779c;

    public ykm(int i, boolean z, boolean z2) {
        this.f198777a = i;
        this.f198778b = z;
        this.f198779c = z2;
    }

    /* JADX INFO: renamed from: d */
    public static mnb0 m215143d(int i, boolean z, boolean z2) {
        return new ykm(i, z, z2);
    }

    @Override // p149l.mnb0
    /* JADX INFO: renamed from: a */
    public boolean mo155503a() {
        return this.f198779c;
    }

    @Override // p149l.mnb0
    /* JADX INFO: renamed from: b */
    public boolean mo155504b() {
        return this.f198778b;
    }

    @Override // p149l.mnb0
    /* JADX INFO: renamed from: c */
    public int mo155505c() {
        return this.f198777a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ykm)) {
            return false;
        }
        ykm ykmVar = (ykm) obj;
        return this.f198777a == ykmVar.f198777a && this.f198778b == ykmVar.f198778b && this.f198779c == ykmVar.f198779c;
    }

    public int hashCode() {
        return (this.f198777a ^ (this.f198778b ? 4194304 : 0)) ^ (this.f198779c ? 8388608 : 0);
    }
}
