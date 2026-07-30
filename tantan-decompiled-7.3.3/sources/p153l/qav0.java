package p153l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;

/* JADX INFO: loaded from: classes6.dex */
public final class qav0 extends sbv0 {

    /* JADX INFO: renamed from: a */
    public final Activity f156429a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BinderC2096b f156430b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f156431c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f156432d;

    public /* synthetic */ qav0(Activity activity, BinderC2096b binderC2096b, String str, String str2, pav0 pav0Var) {
        this.f156429a = activity;
        this.f156430b = binderC2096b;
        this.f156431c = str;
        this.f156432d = str2;
    }

    @Override // p153l.sbv0
    /* JADX INFO: renamed from: a */
    public final Activity mo175995a() {
        return this.f156429a;
    }

    @Override // p153l.sbv0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final BinderC2096b mo175996b() {
        return this.f156430b;
    }

    @Override // p153l.sbv0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final String mo175997c() {
        return this.f156431c;
    }

    @Override // p153l.sbv0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final String mo175998d() {
        return this.f156432d;
    }

    public final boolean equals(Object obj) {
        BinderC2096b binderC2096b;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbv0) {
            sbv0 sbv0Var = (sbv0) obj;
            if (this.f156429a.equals(sbv0Var.mo175995a()) && ((binderC2096b = this.f156430b) != null ? binderC2096b.equals(sbv0Var.mo175996b()) : sbv0Var.mo175996b() == null) && ((str = this.f156431c) != null ? str.equals(sbv0Var.mo175997c()) : sbv0Var.mo175997c() == null) && ((str2 = this.f156432d) != null ? str2.equals(sbv0Var.mo175998d()) : sbv0Var.mo175998d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f156429a.hashCode() ^ 1000003;
        BinderC2096b binderC2096b = this.f156430b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (binderC2096b == null ? 0 : binderC2096b.hashCode())) * 1000003;
        String str = this.f156431c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f156432d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        BinderC2096b binderC2096b = this.f156430b;
        return "OfflineUtilsParams{activity=" + this.f156429a.toString() + ", adOverlay=" + String.valueOf(binderC2096b) + ", gwsQueryId=" + this.f156431c + ", uri=" + this.f156432d + "}";
    }
}
