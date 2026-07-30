package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class wby0 implements iay0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Provider f188299a;

    /* JADX INFO: renamed from: b */
    public final Provider f188300b;

    /* JADX INFO: renamed from: c */
    public final n9y0 f188301c;

    public wby0(Context context, n9y0 n9y0Var) {
        this.f188301c = n9y0Var;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m9346of("json"))) {
            this.f188299a = new Lazy(new Provider() { // from class: l.iby0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9346of("json"), new Transformer() { // from class: l.rby0
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f188300b = new Lazy(new Provider() { // from class: l.mby0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9346of("proto"), new Transformer() { // from class: l.eby0
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static Event m205732b(n9y0 n9y0Var, e9y0 e9y0Var) {
        int iMo139040a = n9y0Var.mo139040a();
        return e9y0Var.zza() != 0 ? Event.ofData(e9y0Var.mo119968b(iMo139040a, false)) : Event.ofTelemetry(e9y0Var.mo119968b(iMo139040a, false));
    }

    @Override // p153l.iay0
    /* JADX INFO: renamed from: a */
    public final void mo139226a(e9y0 e9y0Var) {
        if (this.f188301c.mo139040a() != 0) {
            ((Transport) this.f188300b.get()).send(m205732b(this.f188301c, e9y0Var));
            return;
        }
        Provider provider = this.f188299a;
        if (provider != null) {
            ((Transport) provider.get()).send(m205732b(this.f188301c, e9y0Var));
        }
    }
}
