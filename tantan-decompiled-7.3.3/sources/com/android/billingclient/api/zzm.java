package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2426p;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.List;
import java.util.Objects;
import p153l.dex0;
import p153l.jj5;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
final class zzm extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private boolean f4131a;

    /* JADX INFO: renamed from: b */
    private final boolean f4132b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0896n0 f4133c;

    public zzm(C0896n0 c0896n0, boolean z) {
        this.f4133c = c0896n0;
        this.f4132b = z;
    }

    /* JADX INFO: renamed from: d */
    private final void m5082d(Bundle bundle, C0875d c0875d, int i) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            C0896n0 c0896n0 = this.f4133c;
            if (byteArray != null) {
                c0896n0.f4089c.mo5053d(C2421m0.m14926z(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), dex0.m115486a()));
            } else {
                c0896n0.f4089c.mo5053d(C0880f0.m5033b(23, i, c0875d));
            }
        } catch (Throwable unused) {
            C2426p.m14974k("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5083a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f4131a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f4132b ? 4 : 2);
            } else {
                jj5.m145018l(context, this, intentFilter);
            }
            this.f4131a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5084b(Context context, IntentFilter intentFilter, String str) {
        zzm zzmVar;
        try {
            try {
                if (this.f4131a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f4132b ? 4 : 2);
                } else {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzmVar.f4131a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5085c(Context context) {
        if (!this.f4131a) {
            C2426p.m14974k("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f4131a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C2426p.m14974k("BillingBroadcastManager", "Bundle is null.");
            InterfaceC0882g0 interfaceC0882g0 = this.f4133c.f4089c;
            C0875d c0875d = C0884h0.f4044k;
            interfaceC0882g0.mo5053d(C0880f0.m5033b(11, 1, c0875d));
            C0896n0 c0896n0 = this.f4133c;
            if (c0896n0.f4088b != null) {
                c0896n0.f4088b.mo5079d(c0875d, null);
                return;
            }
            return;
        }
        C0875d c0875dM14968e = C2426p.m14968e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listM14972i = C2426p.m14972i(extras);
            if (c0875dM14968e.m4976b() == 0) {
                this.f4133c.f4089c.mo5056g(C0880f0.m5035d(i));
            } else {
                m5082d(extras, c0875dM14968e, i);
            }
            this.f4133c.f4088b.mo5079d(c0875dM14968e, listM14972i);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c0875dM14968e.m4976b() != 0) {
                m5082d(extras, c0875dM14968e, i);
                this.f4133c.f4088b.mo5079d(c0875dM14968e, zzco.zzl());
                return;
            }
            C0896n0 c0896n1 = this.f4133c;
            C0896n0.m5062a(c0896n1);
            C0896n0.m5065e(c0896n1);
            C2426p.m14974k("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            InterfaceC0882g0 interfaceC0882g1 = this.f4133c.f4089c;
            C0875d c0875d2 = C0884h0.f4044k;
            interfaceC0882g1.mo5053d(C0880f0.m5033b(77, i, c0875d2));
            this.f4133c.f4088b.mo5079d(c0875d2, zzco.zzl());
        }
    }
}
