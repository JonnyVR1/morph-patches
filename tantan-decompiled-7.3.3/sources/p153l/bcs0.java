package p153l;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbb;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class bcs0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public rbs0 f76195a;

    /* JADX INFO: renamed from: b */
    public boolean f76196b;

    /* JADX INFO: renamed from: c */
    public final Context f76197c;

    /* JADX INFO: renamed from: d */
    public final Object f76198d = new Object();

    public bcs0(Context context) {
        this.f76197c = context;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m103548e(bcs0 bcs0Var) {
        synchronized (bcs0Var.f76198d) {
            try {
                rbs0 rbs0Var = bcs0Var.f76195a;
                if (rbs0Var == null) {
                    return;
                }
                rbs0Var.disconnect();
                bcs0Var.f76195a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Future m103550c(zzbbb zzbbbVar) {
        vbs0 vbs0Var = new vbs0(this);
        zbs0 zbs0Var = new zbs0(this, zzbbbVar, vbs0Var);
        acs0 acs0Var = new acs0(this, vbs0Var);
        synchronized (this.f76198d) {
            rbs0 rbs0Var = new rbs0(this.f76197c, bxy0.m106938v().m213967b(), zbs0Var, acs0Var);
            this.f76195a = rbs0Var;
            rbs0Var.checkAvailabilityAndConnect();
        }
        return vbs0Var;
    }
}
