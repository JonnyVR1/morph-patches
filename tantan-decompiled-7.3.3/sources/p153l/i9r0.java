package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public class i9r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f113499a;

    /* JADX INFO: renamed from: b */
    public final String f113500b;

    public i9r0(IBinder iBinder, String str) {
        this.f113499a = iBinder;
        this.f113500b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f113499a;
    }
}
