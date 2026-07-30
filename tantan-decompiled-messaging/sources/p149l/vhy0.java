package p149l;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class vhy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Messenger f181541a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzd f181542b;

    public vhy0(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f181541a = new Messenger(iBinder);
            this.f181542b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f181542b = new zzd(iBinder);
            this.f181541a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            jhy0.m141614a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m198486a(Message message) throws RemoteException {
        Messenger messenger = this.f181541a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f181542b;
        if (zzdVar != null) {
            zzdVar.m12451b(message);
        } else {
            qkq0.m175383a("Both messengers are null");
        }
    }
}
