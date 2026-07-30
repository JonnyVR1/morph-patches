package p149l;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h1v0 extends l1v0 {

    /* JADX INFO: renamed from: a */
    public final String f105467a;

    /* JADX INFO: renamed from: b */
    public final String f105468b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Drawable f105469c;

    public h1v0(String str, String str2, @Nullable Drawable drawable) {
        if (str == null) {
            jfd0.m141176a("Null advertiserName");
            throw null;
        }
        this.f105467a = str;
        if (str2 == null) {
            jfd0.m141176a("Null imageUrl");
            throw null;
        }
        this.f105468b = str2;
        this.f105469c = drawable;
    }

    @Override // p149l.l1v0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Drawable mo129079a() {
        return this.f105469c;
    }

    @Override // p149l.l1v0
    /* JADX INFO: renamed from: b */
    public final String mo129080b() {
        return this.f105467a;
    }

    @Override // p149l.l1v0
    /* JADX INFO: renamed from: c */
    public final String mo129081c() {
        return this.f105468b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1v0) {
            l1v0 l1v0Var = (l1v0) obj;
            if (this.f105467a.equals(l1v0Var.mo129080b()) && this.f105468b.equals(l1v0Var.mo129081c()) && ((drawable = this.f105469c) != null ? drawable.equals(l1v0Var.mo129079a()) : l1v0Var.mo129079a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f105467a.hashCode() ^ 1000003) * 1000003) ^ this.f105468b.hashCode();
        Drawable drawable = this.f105469c;
        return (drawable == null ? 0 : drawable.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f105467a + ", imageUrl=" + this.f105468b + ", icon=" + String.valueOf(this.f105469c) + "}";
    }
}
