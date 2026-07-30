package p149l;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
class hv40 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f109613a;

    /* JADX INFO: renamed from: b */
    private final bsl f109614b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC17408a f109615c;

    /* JADX INFO: renamed from: l.hv40$a */
    @FunctionalInterface
    public interface InterfaceC17408a {
        /* JADX INFO: renamed from: a */
        String mo99612a(IBinder iBinder) throws RemoteException, OAIDException;
    }

    private hv40(Context context, bsl bslVar, InterfaceC17408a interfaceC17408a) {
        if (context instanceof Application) {
            this.f109613a = context;
        } else {
            this.f109613a = context.getApplicationContext();
        }
        this.f109614b = bslVar;
        this.f109615c = interfaceC17408a;
    }

    /* JADX INFO: renamed from: a */
    public static void m133147a(Context context, Intent intent, bsl bslVar, InterfaceC17408a interfaceC17408a) {
        new hv40(context, bslVar, interfaceC17408a).m133148b(intent);
    }

    /* JADX INFO: renamed from: b */
    private void m133148b(Intent intent) {
        try {
            if (!this.f109613a.bindService(intent, this, 1)) {
                throw new OAIDException(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 83, 94, 15, 2, 89, 8, 86, 23, 7, 7, 89, 10, 84, 83}));
            }
            kjw.m146278a(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 4, 95, 19, 95, 83, 91, 70}) + intent);
        } catch (Exception e) {
            this.f109614b.mo103721b(e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kjw.m146278a(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 5, 95, 8, 95, 82, 2, 18, 85, 2, 11, 23}) + componentName.getClassName());
        try {
            try {
                String strMo99612a = this.f109615c.mo99612a(iBinder);
                if (strMo99612a == null || strMo99612a.length() == 0) {
                    throw new OAIDException(rjw.m179664a(new byte[]{127, 39, 120, 115, 78, 39, 113, 47, 117, 23, 0, 5, 65, 19, 88, 69, 4, 70, 86, 7, 88, 91, 4, 2}));
                }
                this.f109614b.mo103720a(strMo99612a);
                this.f109613a.unbindService(this);
            } catch (Throwable th) {
                try {
                    this.f109613a.unbindService(this);
                    kjw.m146278a(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 19, 94, 4, 94, 66, 15, 2, 10, 70}) + componentName.getClassName());
                } catch (Exception unused) {
                }
                try {
                    throw th;
                } catch (Exception e) {
                    this.f109614b.mo103721b(e);
                    this.f109613a.unbindService(this);
                    kjw.m146278a(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 19, 94, 4, 94, 66, 15, 2, 10, 70}) + componentName.getClassName());
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        kjw.m146278a(rjw.m179664a(new byte[]{99, 3, 67, 65, 8, 5, 85, 70, 89, 86, 18, 70, 82, 3, 84, 89, 65, 2, 89, 21, 82, 88, 15, 8, 85, 5, 69, 82, 5, 92, Tnaf.POW_2_WIDTH}) + componentName.getClassName());
    }
}
