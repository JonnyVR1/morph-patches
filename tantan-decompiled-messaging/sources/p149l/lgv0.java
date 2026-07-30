package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class lgv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f128019a;

    /* JADX INFO: renamed from: b */
    public final Context f128020b;

    public lgv0(rmw0 rmw0Var, Context context) {
        this.f128019a = rmw0Var;
        this.f128020b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mgv0 m149786a() throws Exception {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentM136342l = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132449wa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? ii5.m136342l(this.f128020b, null, intentFilter) : this.f128020b.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (intentM136342l != null) {
            int intExtra = intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = intentM136342l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = intentM136342l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            z = intExtra == 2 || intExtra == 5;
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new mgv0(d, z);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 14;
    }

    @Override // p149l.qlv0
    @SuppressLint({"UnprotectedReceiver"})
    public final gnr zzb() {
        return this.f128019a.mo122102R(new Callable() { // from class: l.kgv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f123100a.m149786a();
            }
        });
    }
}
