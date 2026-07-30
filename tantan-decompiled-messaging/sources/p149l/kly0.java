package p149l;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kly0 {

    /* JADX INFO: renamed from: a */
    public final int f123723a;

    /* JADX INFO: renamed from: b */
    public final sei0 f123724b = new sei0();

    /* JADX INFO: renamed from: c */
    public final int f123725c;

    /* JADX INFO: renamed from: d */
    public final Bundle f123726d;

    public kly0(int i, int i2, Bundle bundle) {
        this.f123723a = i;
        this.f123725c = i2;
        this.f123726d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo127502a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo127503b();

    /* JADX INFO: renamed from: c */
    public final void m146438c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f123724b.m183658b(zztVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m146439d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f123724b.m183659c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f123725c + " id=" + this.f123723a + " oneWay=" + mo127503b() + "}";
    }
}
