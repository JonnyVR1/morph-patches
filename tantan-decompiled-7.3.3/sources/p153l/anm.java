package p153l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class anm implements qvb0 {

    /* JADX INFO: renamed from: d */
    public static final qvb0 f72363d = m99001d(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* JADX INFO: renamed from: a */
    public int f72364a;

    /* JADX INFO: renamed from: b */
    public boolean f72365b;

    /* JADX INFO: renamed from: c */
    public boolean f72366c;

    public anm(int i, boolean z, boolean z2) {
        this.f72364a = i;
        this.f72365b = z;
        this.f72366c = z2;
    }

    /* JADX INFO: renamed from: d */
    public static qvb0 m99001d(int i, boolean z, boolean z2) {
        return new anm(i, z, z2);
    }

    @Override // p153l.qvb0
    /* JADX INFO: renamed from: a */
    public boolean mo99002a() {
        return this.f72366c;
    }

    @Override // p153l.qvb0
    /* JADX INFO: renamed from: b */
    public boolean mo99003b() {
        return this.f72365b;
    }

    @Override // p153l.qvb0
    /* JADX INFO: renamed from: c */
    public int mo99004c() {
        return this.f72364a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anm)) {
            return false;
        }
        anm anmVar = (anm) obj;
        return this.f72364a == anmVar.f72364a && this.f72365b == anmVar.f72365b && this.f72366c == anmVar.f72366c;
    }

    public int hashCode() {
        return (this.f72364a ^ (this.f72365b ? 4194304 : 0)) ^ (this.f72366c ? 8388608 : 0);
    }
}
