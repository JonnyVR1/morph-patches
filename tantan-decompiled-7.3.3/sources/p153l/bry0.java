package p153l;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class bry0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Messenger f78077a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzd f78078b;

    public bry0(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f78077a = new Messenger(iBinder);
            this.f78078b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f78078b = new zzd(iBinder);
            this.f78077a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            pqy0.m173422a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m106192a(Message message) throws RemoteException {
        Messenger messenger = this.f78077a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f78078b;
        if (zzdVar != null) {
            zzdVar.m12505b(message);
        } else {
            wtq0.m207906a("Both messengers are null");
        }
    }
}
