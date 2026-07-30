package p149l;

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
public final class q2y0 implements c1y0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Provider f152327a;

    /* JADX INFO: renamed from: b */
    public final Provider f152328b;

    /* JADX INFO: renamed from: c */
    public final h0y0 f152329c;

    public q2y0(Context context, h0y0 h0y0Var) {
        this.f152329c = h0y0Var;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m9292of("json"))) {
            this.f152327a = new Lazy(new Provider() { // from class: l.c2y0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9292of("json"), new Transformer() { // from class: l.l2y0
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f152328b = new Lazy(new Provider() { // from class: l.g2y0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9292of("proto"), new Transformer() { // from class: l.y1y0
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
    public static Event m172532b(h0y0 h0y0Var, yzx0 yzx0Var) {
        int iMo109446a = h0y0Var.mo109446a();
        return yzx0Var.zza() != 0 ? Event.ofData(yzx0Var.mo186934b(iMo109446a, false)) : Event.ofTelemetry(yzx0Var.mo186934b(iMo109446a, false));
    }

    @Override // p149l.c1y0
    /* JADX INFO: renamed from: a */
    public final void mo104887a(yzx0 yzx0Var) {
        if (this.f152329c.mo109446a() != 0) {
            ((Transport) this.f152328b.get()).send(m172532b(this.f152329c, yzx0Var));
            return;
        }
        Provider provider = this.f152327a;
        if (provider != null) {
            ((Transport) provider.get()).send(m172532b(this.f152329c, yzx0Var));
        }
    }
}
