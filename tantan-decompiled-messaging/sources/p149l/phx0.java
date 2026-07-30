package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class phx0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC19219a f149064a;

    /* JADX INFO: renamed from: l.phx0$a */
    public interface InterfaceC19219a {
        void doStartService(Context context, Intent intent);
    }

    public phx0(InterfaceC19219a interfaceC19219a) {
        Preconditions.checkNotNull(interfaceC19219a);
        this.f149064a = interfaceC19219a;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public final void m169156a(Context context, Intent intent) {
        xww0 xww0VarZzj = ujx0.m194095a(context, null, null).zzj();
        if (intent == null) {
            xww0VarZzj.m211417F().m123936a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        xww0VarZzj.m211416E().m123937b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                xww0VarZzj.m211417F().m123936a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            xww0VarZzj.m211416E().m123936a("Starting wakeful intent.");
            this.f149064a.doStartService(context, className);
        }
    }
}
