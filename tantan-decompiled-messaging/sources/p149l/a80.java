package p149l;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class a80 {

    /* JADX INFO: renamed from: a */
    public final int f67979a;

    /* JADX INFO: renamed from: b */
    public final int f67980b;

    /* JADX INFO: renamed from: c */
    public final String f67981c;

    /* JADX INFO: renamed from: d */
    public boolean f67982d;

    /* JADX INFO: renamed from: e */
    public boolean f67983e;

    /* JADX INFO: renamed from: f */
    public int f67984f;

    /* JADX INFO: renamed from: g */
    public boolean f67985g;

    /* JADX INFO: renamed from: h */
    public int f67986h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public static final a80 f67968i = new a80(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j */
    @NonNull
    public static final a80 f67969j = new a80(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k */
    @NonNull
    public static final a80 f67970k = new a80(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l */
    @NonNull
    public static final a80 f67971l = new a80(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m */
    @NonNull
    public static final a80 f67972m = new a80(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n */
    @NonNull
    public static final a80 f67973n = new a80(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o */
    @NonNull
    @Deprecated
    public static final a80 f67974o = new a80(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final a80 f67975p = new a80(-3, -4, "fluid");

    /* JADX INFO: renamed from: q */
    @NonNull
    public static final a80 f67976q = new a80(0, 0, "invalid");

    /* JADX INFO: renamed from: s */
    @NonNull
    public static final a80 f67978s = new a80(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: r */
    @NonNull
    public static final a80 f67977r = new a80(-3, 0, "search_v2");

    public a80(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + BaseSei.f13930X + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a80 m95309c(int i, int i2) {
        a80 a80Var = new a80(i, 0);
        a80Var.f67984f = i2;
        a80Var.f67983e = true;
        if (i2 < 32) {
            x2t0.m206869g("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return a80Var;
    }

    /* JADX INFO: renamed from: a */
    public int m95310a() {
        return this.f67980b;
    }

    /* JADX INFO: renamed from: b */
    public int m95311b(@NonNull Context context) {
        int i = this.f67980b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzq.m12256g(context.getResources().getDisplayMetrics());
        }
        exr0.m118703b();
        return i2t0.m134096z(context, i);
    }

    /* JADX INFO: renamed from: d */
    public int m95312d() {
        return this.f67979a;
    }

    /* JADX INFO: renamed from: e */
    public int m95313e(@NonNull Context context) {
        int i = this.f67979a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            exr0.m118703b();
            return i2t0.m134096z(context, i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        return this.f67979a == a80Var.f67979a && this.f67980b == a80Var.f67980b && this.f67981c.equals(a80Var.f67981c);
    }

    /* JADX INFO: renamed from: f */
    public boolean m95314f() {
        return this.f67979a == -3 && this.f67980b == -4;
    }

    /* JADX INFO: renamed from: g */
    public final int m95315g() {
        return this.f67986h;
    }

    /* JADX INFO: renamed from: h */
    public final int m95316h() {
        return this.f67984f;
    }

    public int hashCode() {
        return this.f67981c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m95317i(int i) {
        this.f67984f = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m95318j(int i) {
        this.f67986h = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m95319k(boolean z) {
        this.f67983e = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m95320l(boolean z) {
        this.f67985g = true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m95321m() {
        return this.f67982d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m95322n() {
        return this.f67983e;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m95323o() {
        return this.f67985g;
    }

    @NonNull
    public String toString() {
        return this.f67981c;
    }

    public a80(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            k250.m144273a("Invalid width for AdSize: ", i);
            throw null;
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            k250.m144273a("Invalid height for AdSize: ", i2);
            throw null;
        }
        this.f67979a = i;
        this.f67980b = i2;
        this.f67981c = str;
    }
}
