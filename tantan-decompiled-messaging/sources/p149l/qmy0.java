package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class qmy0 implements cly0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Provider f155366a;

    /* JADX INFO: renamed from: b */
    public final Provider f155367b;

    /* JADX INFO: renamed from: c */
    public final uly0 f155368c;

    public qmy0(Context context, uly0 uly0Var) {
        this.f155368c = uly0Var;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m9292of("json"))) {
            this.f155366a = new Lazy(new Provider() { // from class: l.kmy0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9292of("json"), new Transformer() { // from class: l.omy0
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f155367b = new Lazy(new Provider() { // from class: l.mmy0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9292of("proto"), new Transformer() { // from class: l.imy0
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
