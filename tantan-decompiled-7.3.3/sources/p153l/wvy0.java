package p153l;

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
public final class wvy0 implements iuy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Provider f191121a;

    /* JADX INFO: renamed from: b */
    public final Provider f191122b;

    /* JADX INFO: renamed from: c */
    public final avy0 f191123c;

    public wvy0(Context context, avy0 avy0Var) {
        this.f191123c = avy0Var;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m9346of("json"))) {
            this.f191121a = new Lazy(new Provider() { // from class: l.qvy0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9346of("json"), new Transformer() { // from class: l.uvy0
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f191122b = new Lazy(new Provider() { // from class: l.svy0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return transportFactoryNewFactory.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m9346of("proto"), new Transformer() { // from class: l.ovy0
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
