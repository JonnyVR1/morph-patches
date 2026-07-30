package p149l;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbb;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class v2s0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public l2s0 f179603a;

    /* JADX INFO: renamed from: b */
    public boolean f179604b;

    /* JADX INFO: renamed from: c */
    public final Context f179605c;

    /* JADX INFO: renamed from: d */
    public final Object f179606d = new Object();

    public v2s0(Context context) {
        this.f179605c = context;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m196819e(v2s0 v2s0Var) {
        synchronized (v2s0Var.f179606d) {
            try {
                l2s0 l2s0Var = v2s0Var.f179603a;
                if (l2s0Var == null) {
                    return;
                }
                l2s0Var.disconnect();
                v2s0Var.f179603a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Future m196821c(zzbbb zzbbbVar) {
        p2s0 p2s0Var = new p2s0(this);
        t2s0 t2s0Var = new t2s0(this, zzbbbVar, p2s0Var);
        u2s0 u2s0Var = new u2s0(this, p2s0Var);
        synchronized (this.f179606d) {
            l2s0 l2s0Var = new l2s0(this.f179605c, vny0.m199084v().m185773b(), t2s0Var, u2s0Var);
            this.f179603a = l2s0Var;
            l2s0Var.checkAvailabilityAndConnect();
        }
        return p2s0Var;
    }
}
