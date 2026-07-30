package p153l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class ovs0 {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public static final nds0 f149306b = new mvs0();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public static final nds0 f149307c = new nvs0();

    /* JADX INFO: renamed from: a */
    public final bvs0 f149308a;

    public ovs0(Context context, zzcei zzceiVar, String str, hew0 hew0Var) {
        this.f149308a = new bvs0(context, zzceiVar, str, f149306b, f149307c, hew0Var);
    }

    /* JADX INFO: renamed from: a */
    public final evs0 m169486a(String str, hvs0 hvs0Var, gvs0 gvs0Var) {
        return new aws0(this.f149308a, str, hvs0Var, gvs0Var);
    }

    /* JADX INFO: renamed from: b */
    public final fws0 m169487b() {
        return new fws0(this.f149308a);
    }
}
