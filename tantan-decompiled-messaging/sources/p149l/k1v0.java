package p149l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;

/* JADX INFO: loaded from: classes6.dex */
public final class k1v0 extends m2v0 {

    /* JADX INFO: renamed from: a */
    public final Activity f120658a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BinderC2073b f120659b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f120660c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f120661d;

    public /* synthetic */ k1v0(Activity activity, BinderC2073b binderC2073b, String str, String str2, j1v0 j1v0Var) {
        this.f120658a = activity;
        this.f120659b = binderC2073b;
        this.f120660c = str;
        this.f120661d = str2;
    }

    @Override // p149l.m2v0
    /* JADX INFO: renamed from: a */
    public final Activity mo144232a() {
        return this.f120658a;
    }

    @Override // p149l.m2v0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final BinderC2073b mo144233b() {
        return this.f120659b;
    }

    @Override // p149l.m2v0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final String mo144234c() {
        return this.f120660c;
    }

    @Override // p149l.m2v0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final String mo144235d() {
        return this.f120661d;
    }

    public final boolean equals(Object obj) {
        BinderC2073b binderC2073b;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2v0) {
            m2v0 m2v0Var = (m2v0) obj;
            if (this.f120658a.equals(m2v0Var.mo144232a()) && ((binderC2073b = this.f120659b) != null ? binderC2073b.equals(m2v0Var.mo144233b()) : m2v0Var.mo144233b() == null) && ((str = this.f120660c) != null ? str.equals(m2v0Var.mo144234c()) : m2v0Var.mo144234c() == null) && ((str2 = this.f120661d) != null ? str2.equals(m2v0Var.mo144235d()) : m2v0Var.mo144235d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f120658a.hashCode() ^ 1000003;
        BinderC2073b binderC2073b = this.f120659b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (binderC2073b == null ? 0 : binderC2073b.hashCode())) * 1000003;
        String str = this.f120660c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f120661d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        BinderC2073b binderC2073b = this.f120659b;
        return "OfflineUtilsParams{activity=" + this.f120658a.toString() + ", adOverlay=" + String.valueOf(binderC2073b) + ", gwsQueryId=" + this.f120660c + ", uri=" + this.f120661d + "}";
    }
}
