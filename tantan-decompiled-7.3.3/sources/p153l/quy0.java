package p153l;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class quy0 {

    /* JADX INFO: renamed from: a */
    public final int f159655a;

    /* JADX INFO: renamed from: b */
    public final sni0 f159656b = new sni0();

    /* JADX INFO: renamed from: c */
    public final int f159657c;

    /* JADX INFO: renamed from: d */
    public final Bundle f159658d;

    public quy0(int i, int i2, Bundle bundle) {
        this.f159655a = i;
        this.f159657c = i2;
        this.f159658d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo106414a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo106415b();

    /* JADX INFO: renamed from: c */
    public final void m178225c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f159656b.m186940b(zztVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m178226d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f159656b.m186941c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f159657c + " id=" + this.f159655a + " oneWay=" + mo106415b() + "}";
    }
}
