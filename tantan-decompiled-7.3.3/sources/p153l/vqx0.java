package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class vqx0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20907a f185409a;

    /* JADX INFO: renamed from: l.vqx0$a */
    public interface InterfaceC20907a {
        void doStartService(Context context, Intent intent);
    }

    public vqx0(InterfaceC20907a interfaceC20907a) {
        Preconditions.checkNotNull(interfaceC20907a);
        this.f185409a = interfaceC20907a;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public final void m202459a(Context context, Intent intent) {
        d6x0 d6x0VarZzj = atx0.m100275a(context, null, null).zzj();
        if (intent == null) {
            d6x0VarZzj.m114563F().m153300a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        d6x0VarZzj.m114562E().m153301b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                d6x0VarZzj.m114563F().m153300a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            d6x0VarZzj.m114562E().m153300a("Starting wakeful intent.");
            this.f185409a.doStartService(context, className);
        }
    }
}
