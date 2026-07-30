package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.play_billing.C2426p;
import com.google.android.gms.internal.play_billing.C2441w0;

/* JADX INFO: renamed from: com.android.billingclient.api.j0 */
/* JADX INFO: loaded from: classes.dex */
final class C0888j0 {

    /* JADX INFO: renamed from: a */
    private boolean f4068a;

    /* JADX INFO: renamed from: b */
    private Transport f4069b;

    public C0888j0(Context context) {
        try {
            TransportRuntime.initialize(context);
            this.f4069b = TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE).getTransport("PLAY_BILLING_LIBRARY", C2441w0.class, Encoding.m9346of("proto"), new Transformer() { // from class: l.emt0
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((C2441w0) obj).m15019d();
                }
            });
        } catch (Throwable unused) {
            this.f4068a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5058a(C2441w0 c2441w0) {
        if (this.f4068a) {
            C2426p.m14974k("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f4069b.send(Event.ofData(c2441w0));
        } catch (Throwable unused) {
            C2426p.m14974k("BillingLogger", "logging failed.");
        }
    }
}
