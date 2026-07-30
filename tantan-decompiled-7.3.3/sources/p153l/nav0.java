package p153l;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class nav0 extends rav0 {

    /* JADX INFO: renamed from: a */
    public final String f141049a;

    /* JADX INFO: renamed from: b */
    public final String f141050b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Drawable f141051c;

    public nav0(String str, String str2, @Nullable Drawable drawable) {
        if (str == null) {
            mnd0.m159157a("Null advertiserName");
            throw null;
        }
        this.f141049a = str;
        if (str2 == null) {
            mnd0.m159157a("Null imageUrl");
            throw null;
        }
        this.f141050b = str2;
        this.f141051c = drawable;
    }

    @Override // p153l.rav0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Drawable mo162098a() {
        return this.f141051c;
    }

    @Override // p153l.rav0
    /* JADX INFO: renamed from: b */
    public final String mo162099b() {
        return this.f141049a;
    }

    @Override // p153l.rav0
    /* JADX INFO: renamed from: c */
    public final String mo162100c() {
        return this.f141050b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rav0) {
            rav0 rav0Var = (rav0) obj;
            if (this.f141049a.equals(rav0Var.mo162099b()) && this.f141050b.equals(rav0Var.mo162100c()) && ((drawable = this.f141051c) != null ? drawable.equals(rav0Var.mo162098a()) : rav0Var.mo162098a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f141049a.hashCode() ^ 1000003) * 1000003) ^ this.f141050b.hashCode();
        Drawable drawable = this.f141051c;
        return (drawable == null ? 0 : drawable.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f141049a + ", imageUrl=" + this.f141050b + ", icon=" + String.valueOf(this.f141051c) + "}";
    }
}
