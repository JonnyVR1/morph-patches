package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lxr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f133992a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Uri f133993b;

    /* JADX INFO: renamed from: c */
    public final uzr0 f133994c = new uzr0();

    /* JADX INFO: renamed from: d */
    public final cas0 f133995d = new cas0(null);

    /* JADX INFO: renamed from: e */
    public final List f133996e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final zzgaa f133997f = zzgaa.zzl();

    /* JADX INFO: renamed from: g */
    public final ods0 f133998g = new ods0();

    /* JADX INFO: renamed from: h */
    public final xms0 f133999h = xms0.f195319c;

    /* JADX INFO: renamed from: a */
    public final lxr0 m156235a(String str) {
        this.f133992a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final lxr0 m156236b(@Nullable Uri uri) {
        this.f133993b = uri;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final trs0 m156237c() {
        zis0 zis0Var;
        Uri uri = this.f133993b;
        if (uri != null) {
            zis0Var = new zis0(uri, null, null, null, this.f133996e, null, this.f133997f, null, -9223372036854775807L, null);
        } else {
            zis0Var = null;
        }
        String str = this.f133992a;
        if (str == null) {
            str = "";
        }
        return new trs0(str, new t4s0(this.f133994c, null), zis0Var, new jfs0(this.f133998g), rzs0.f165600y, this.f133999h, null);
    }
}
