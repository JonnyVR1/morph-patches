package p153l;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
class w350 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f187083a;

    /* JADX INFO: renamed from: b */
    private final pul f187084b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC21004a f187085c;

    /* JADX INFO: renamed from: l.w350$a */
    @FunctionalInterface
    public interface InterfaceC21004a {
        /* JADX INFO: renamed from: a */
        String mo106876a(IBinder iBinder) throws RemoteException, OAIDException;
    }

    private w350(Context context, pul pulVar, InterfaceC21004a interfaceC21004a) {
        if (context instanceof Application) {
            this.f187083a = context;
        } else {
            this.f187083a = context.getApplicationContext();
        }
        this.f187084b = pulVar;
        this.f187085c = interfaceC21004a;
    }

    /* JADX INFO: renamed from: a */
    public static void m204736a(Context context, Intent intent, pul pulVar, InterfaceC21004a interfaceC21004a) {
        new w350(context, pulVar, interfaceC21004a).m204737b(intent);
    }

    /* JADX INFO: renamed from: b */
    private void m204737b(Intent intent) {
        try {
            if (!this.f187083a.bindService(intent, this, 1)) {
                throw new OAIDException(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 83, 94, 15, 2, 89, 8, 86, 23, 7, 7, 89, 10, 84, 83}));
            }
            jmw.m146176a(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 4, 95, 19, 95, 83, 91, 70}) + intent);
        } catch (Exception e) {
            this.f187084b.mo173889b(e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jmw.m146176a(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 5, 95, 8, 95, 82, 2, 18, 85, 2, 11, 23}) + componentName.getClassName());
        try {
            try {
                String strMo106876a = this.f187085c.mo106876a(iBinder);
                if (strMo106876a == null || strMo106876a.length() == 0) {
                    throw new OAIDException(qmw.m177151a(new byte[]{127, 39, 120, 115, 78, 39, 113, 47, 117, 23, 0, 5, 65, 19, 88, 69, 4, 70, 86, 7, 88, 91, 4, 2}));
                }
                this.f187084b.mo173888a(strMo106876a);
                this.f187083a.unbindService(this);
            } catch (Throwable th) {
                try {
                    this.f187083a.unbindService(this);
                    jmw.m146176a(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 19, 94, 4, 94, 66, 15, 2, 10, 70}) + componentName.getClassName());
                } catch (Exception unused) {
                }
                try {
                    throw th;
                } catch (Exception e) {
                    this.f187084b.mo173889b(e);
                    this.f187083a.unbindService(this);
                    jmw.m146176a(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 19, 94, 4, 94, 66, 15, 2, 10, 70}) + componentName.getClassName());
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        jmw.m146176a(qmw.m177151a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 2, 89, 21, 82, 88, 15, 8, 85, 5, 69, 82, 5, 92, Tnaf.POW_2_WIDTH}) + componentName.getClassName());
    }
}
