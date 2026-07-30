package p153l;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class w70 {

    /* JADX INFO: renamed from: a */
    public final int f187692a;

    /* JADX INFO: renamed from: b */
    public final int f187693b;

    /* JADX INFO: renamed from: c */
    public final String f187694c;

    /* JADX INFO: renamed from: d */
    public boolean f187695d;

    /* JADX INFO: renamed from: e */
    public boolean f187696e;

    /* JADX INFO: renamed from: f */
    public int f187697f;

    /* JADX INFO: renamed from: g */
    public boolean f187698g;

    /* JADX INFO: renamed from: h */
    public int f187699h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public static final w70 f187681i = new w70(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j */
    @NonNull
    public static final w70 f187682j = new w70(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k */
    @NonNull
    public static final w70 f187683k = new w70(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l */
    @NonNull
    public static final w70 f187684l = new w70(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m */
    @NonNull
    public static final w70 f187685m = new w70(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n */
    @NonNull
    public static final w70 f187686n = new w70(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o */
    @NonNull
    @Deprecated
    public static final w70 f187687o = new w70(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final w70 f187688p = new w70(-3, -4, "fluid");

    /* JADX INFO: renamed from: q */
    @NonNull
    public static final w70 f187689q = new w70(0, 0, "invalid");

    /* JADX INFO: renamed from: s */
    @NonNull
    public static final w70 f187691s = new w70(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: r */
    @NonNull
    public static final w70 f187690r = new w70(-3, 0, "search_v2");

    public w70(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + BaseSei.f14624X + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static w70 m205212c(int i, int i2) {
        w70 w70Var = new w70(i, 0);
        w70Var.f187697f = i2;
        w70Var.f187696e = true;
        if (i2 < 32) {
            dct0.m115298g("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return w70Var;
    }

    /* JADX INFO: renamed from: a */
    public int m205213a() {
        return this.f187693b;
    }

    /* JADX INFO: renamed from: b */
    public int m205214b(@NonNull Context context) {
        int i = this.f187693b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzq.m12310g(context.getResources().getDisplayMetrics());
        }
        k6s0.m148569b();
        return obt0.m167049z(context, i);
    }

    /* JADX INFO: renamed from: d */
    public int m205215d() {
        return this.f187692a;
    }

    /* JADX INFO: renamed from: e */
    public int m205216e(@NonNull Context context) {
        int i = this.f187692a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            k6s0.m148569b();
            return obt0.m167049z(context, i);
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
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return this.f187692a == w70Var.f187692a && this.f187693b == w70Var.f187693b && this.f187694c.equals(w70Var.f187694c);
    }

    /* JADX INFO: renamed from: f */
    public boolean m205217f() {
        return this.f187692a == -3 && this.f187693b == -4;
    }

    /* JADX INFO: renamed from: g */
    public final int m205218g() {
        return this.f187699h;
    }

    /* JADX INFO: renamed from: h */
    public final int m205219h() {
        return this.f187697f;
    }

    public int hashCode() {
        return this.f187694c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m205220i(int i) {
        this.f187697f = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m205221j(int i) {
        this.f187699h = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m205222k(boolean z) {
        this.f187696e = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m205223l(boolean z) {
        this.f187698g = true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m205224m() {
        return this.f187695d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m205225n() {
        return this.f187696e;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m205226o() {
        return this.f187698g;
    }

    @NonNull
    public String toString() {
        return this.f187694c;
    }

    public w70(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            za50.m219101a("Invalid width for AdSize: ", i);
            throw null;
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            za50.m219101a("Invalid height for AdSize: ", i2);
            throw null;
        }
        this.f187692a = i;
        this.f187693b = i2;
        this.f187694c = str;
    }
}
