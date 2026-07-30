package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class for0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f98621a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Uri f98622b;

    /* JADX INFO: renamed from: c */
    public final oqr0 f98623c = new oqr0();

    /* JADX INFO: renamed from: d */
    public final w0s0 f98624d = new w0s0(null);

    /* JADX INFO: renamed from: e */
    public final List f98625e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final zzgaa f98626f = zzgaa.zzl();

    /* JADX INFO: renamed from: g */
    public final i4s0 f98627g = new i4s0();

    /* JADX INFO: renamed from: h */
    public final rds0 f98628h = rds0.f159001c;

    /* JADX INFO: renamed from: a */
    public final for0 m122516a(String str) {
        this.f98621a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final for0 m122517b(@Nullable Uri uri) {
        this.f98622b = uri;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final nis0 m122518c() {
        t9s0 t9s0Var;
        Uri uri = this.f98622b;
        if (uri != null) {
            t9s0Var = new t9s0(uri, null, null, null, this.f98625e, null, this.f98626f, null, -9223372036854775807L, null);
        } else {
            t9s0Var = null;
        }
        String str = this.f98621a;
        if (str == null) {
            str = "";
        }
        return new nis0(str, new nvr0(this.f98623c, null), t9s0Var, new d6s0(this.f98627g), lqs0.f129410y, this.f98628h, null);
    }
}
