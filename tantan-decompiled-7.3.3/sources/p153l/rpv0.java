package p153l;

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
public final class rpv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f164398a;

    /* JADX INFO: renamed from: b */
    public final Context f164399b;

    public rpv0(xvw0 xvw0Var, Context context) {
        this.f164398a = xvw0Var;
        this.f164399b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spv0 m182547a() throws Exception {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentM145018l = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168520wa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? jj5.m145018l(this.f164399b, null, intentFilter) : this.f164399b.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (intentM145018l != null) {
            int intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = intentM145018l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = intentM145018l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            z = intExtra == 2 || intExtra == 5;
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new spv0(d, z);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 14;
    }

    @Override // p153l.wuv0
    @SuppressLint({"UnprotectedReceiver"})
    public final hpr zzb() {
        return this.f164398a.mo155969R(new Callable() { // from class: l.qpv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f158928a.m182547a();
            }
        });
    }
}
