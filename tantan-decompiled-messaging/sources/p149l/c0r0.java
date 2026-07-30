package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public class c0r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f78170a;

    /* JADX INFO: renamed from: b */
    public final String f78171b;

    public c0r0(IBinder iBinder, String str) {
        this.f78170a = iBinder;
        this.f78171b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f78170a;
    }
}
