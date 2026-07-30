package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2403p;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.List;
import java.util.Objects;
import p149l.ii5;
import p149l.x4x0;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
final class zzm extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private boolean f4131a;

    /* JADX INFO: renamed from: b */
    private final boolean f4132b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0892n0 f4133c;

    public zzm(C0892n0 c0892n0, boolean z) {
        this.f4133c = c0892n0;
        this.f4132b = z;
    }

    /* JADX INFO: renamed from: d */
    private final void m5072d(Bundle bundle, C0871d c0871d, int i) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            C0892n0 c0892n0 = this.f4133c;
            if (byteArray != null) {
                c0892n0.f4089c.mo5043d(C2398m0.m14872z(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), x4x0.m207040a()));
            } else {
                c0892n0.f4089c.mo5043d(C0876f0.m5023b(23, i, c0871d));
            }
        } catch (Throwable unused) {
            C2403p.m14920k("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5073a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f4131a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f4132b ? 4 : 2);
            } else {
                ii5.m136342l(context, this, intentFilter);
            }
            this.f4131a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5074b(Context context, IntentFilter intentFilter, String str) {
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
    public final synchronized void m5075c(Context context) {
        if (!this.f4131a) {
            C2403p.m14920k("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f4131a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C2403p.m14920k("BillingBroadcastManager", "Bundle is null.");
            InterfaceC0878g0 interfaceC0878g0 = this.f4133c.f4089c;
            C0871d c0871d = C0880h0.f4044k;
            interfaceC0878g0.mo5043d(C0876f0.m5023b(11, 1, c0871d));
            C0892n0 c0892n0 = this.f4133c;
            if (c0892n0.f4088b != null) {
                c0892n0.f4088b.mo5069d(c0871d, null);
                return;
            }
            return;
        }
        C0871d c0871dM14914e = C2403p.m14914e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listM14918i = C2403p.m14918i(extras);
            if (c0871dM14914e.m4966b() == 0) {
                this.f4133c.f4089c.mo5046g(C0876f0.m5025d(i));
            } else {
                m5072d(extras, c0871dM14914e, i);
            }
            this.f4133c.f4088b.mo5069d(c0871dM14914e, listM14918i);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c0871dM14914e.m4966b() != 0) {
                m5072d(extras, c0871dM14914e, i);
                this.f4133c.f4088b.mo5069d(c0871dM14914e, zzco.zzl());
                return;
            }
            C0892n0 c0892n1 = this.f4133c;
            C0892n0.m5052a(c0892n1);
            C0892n0.m5055e(c0892n1);
            C2403p.m14920k("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            InterfaceC0878g0 interfaceC0878g1 = this.f4133c.f4089c;
            C0871d c0871d2 = C0880h0.f4044k;
            interfaceC0878g1.mo5043d(C0876f0.m5023b(77, i, c0871d2));
            this.f4133c.f4088b.mo5069d(c0871d2, zzco.zzl());
        }
    }
}
