package p149l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class ims0 {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public static final h4s0 f113963b = new gms0();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public static final h4s0 f113964c = new hms0();

    /* JADX INFO: renamed from: a */
    public final vls0 f113965a;

    public ims0(Context context, zzcei zzceiVar, String str, b5w0 b5w0Var) {
        this.f113965a = new vls0(context, zzceiVar, str, f113963b, f113964c, b5w0Var);
    }

    /* JADX INFO: renamed from: a */
    public final yls0 m137088a(String str, bms0 bms0Var, ams0 ams0Var) {
        return new ums0(this.f113965a, str, bms0Var, ams0Var);
    }

    /* JADX INFO: renamed from: b */
    public final zms0 m137089b() {
        return new zms0(this.f113965a);
    }
}
