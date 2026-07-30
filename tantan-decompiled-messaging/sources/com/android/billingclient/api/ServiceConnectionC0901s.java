package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2402o0;
import com.google.android.gms.internal.play_billing.C2403p;
import com.google.android.gms.internal.play_billing.C2404p0;
import com.google.android.gms.internal.play_billing.C2422y0;
import com.google.android.gms.internal.play_billing.C2424z0;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.Callable;
import p149l.djr0;
import p149l.h2y0;
import p149l.lvx0;
import p149l.lx2;
import p149l.ntx0;
import p149l.rhr0;
import p149l.yds0;

/* JADX INFO: renamed from: com.android.billingclient.api.s */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0901s implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final lx2 f4110a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0867b f4111b;

    public /* synthetic */ ServiceConnectionC0901s(C0867b c0867b, lx2 lx2Var, yds0 yds0Var) {
        this.f4111b = c0867b;
        this.f4110a = lx2Var;
    }

    /* JADX INFO: renamed from: c */
    private final void m5059c(C0871d c0871d) {
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4110a.mo5066a(c0871d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0271  */
    /* JADX WARN: Code duplicated, block: B:164:0x0276  */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object m5060a() throws Exception {
        Bundle bundle;
        boolean z;
        int i;
        int i2;
        String strM5022a;
        int iMo112101F6;
        djr0 djr0Var;
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b != 3) {
                    int i3 = this.f4111b.f3917b;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        C0867b c0867b = this.f4111b;
                        C2403p.m14912c(bundle, c0867b.f3918c, c0867b.f3915F.longValue());
                    }
                    try {
                        synchronized (this.f4111b.f3916a) {
                            djr0Var = this.f4111b.f3923h;
                        }
                        C0867b c0867b2 = this.f4111b;
                        if (djr0Var == null) {
                            c0867b2.m4861R(0);
                            C0867b c0867b3 = this.f4111b;
                            C0871d c0871d = C0880h0.f4046m;
                            c0867b3.m4891s0(119, 6, c0871d);
                            m5059c(c0871d);
                        } else {
                            String packageName = c0867b2.f3921f.getPackageName();
                            iMo112101F6 = 3;
                            int i4 = 23;
                            while (true) {
                                if (i4 < 3) {
                                    i4 = 0;
                                    break;
                                }
                                iMo112101F6 = bundle == null ? djr0Var.mo112101F6(i4, packageName, SubSampleInformationBox.TYPE) : djr0Var.mo112107e4(i4, packageName, SubSampleInformationBox.TYPE, bundle);
                                if (iMo112101F6 == 0) {
                                    C2403p.m14919j("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                    break;
                                }
                                i4--;
                            }
                            this.f4111b.f3926k = i4 >= 5;
                            this.f4111b.f3925j = i4 >= 3;
                            if (i4 < 3) {
                                C2403p.m14919j("BillingClient", "In-app billing API does not support subscription on this device.");
                                i = 9;
                            } else {
                                i = 1;
                            }
                            for (int i5 = 23; i5 >= 3; i5--) {
                                iMo112101F6 = bundle == null ? djr0Var.mo112101F6(i5, packageName, "inapp") : djr0Var.mo112107e4(i5, packageName, "inapp", bundle);
                                if (iMo112101F6 == 0) {
                                    this.f4111b.f3927l = i5;
                                    C2403p.m14919j("BillingClient", "mHighestLevelSupportedForInApp: " + this.f4111b.f3927l);
                                    break;
                                }
                            }
                            C0867b c0867b4 = this.f4111b;
                            c0867b4.f3910A = c0867b4.f3927l >= 23;
                            C0867b c0867b5 = this.f4111b;
                            c0867b5.f3941z = c0867b5.f3927l >= 22;
                            C0867b c0867b6 = this.f4111b;
                            c0867b6.f3940y = c0867b6.f3927l >= 21;
                            C0867b c0867b7 = this.f4111b;
                            c0867b7.f3939x = c0867b7.f3927l >= 20;
                            C0867b c0867b8 = this.f4111b;
                            c0867b8.f3938w = c0867b8.f3927l >= 19;
                            C0867b c0867b9 = this.f4111b;
                            c0867b9.f3937v = c0867b9.f3927l >= 18;
                            C0867b c0867b10 = this.f4111b;
                            c0867b10.f3936u = c0867b10.f3927l >= 17;
                            C0867b c0867b11 = this.f4111b;
                            c0867b11.f3935t = c0867b11.f3927l >= 16;
                            C0867b c0867b12 = this.f4111b;
                            c0867b12.f3934s = c0867b12.f3927l >= 15;
                            C0867b c0867b13 = this.f4111b;
                            c0867b13.f3933r = c0867b13.f3927l >= 14;
                            C0867b c0867b14 = this.f4111b;
                            c0867b14.f3932q = c0867b14.f3927l >= 12;
                            C0867b c0867b15 = this.f4111b;
                            c0867b15.f3931p = c0867b15.f3927l >= 10;
                            C0867b c0867b16 = this.f4111b;
                            c0867b16.f3930o = c0867b16.f3927l >= 9;
                            C0867b c0867b17 = this.f4111b;
                            c0867b17.f3929n = c0867b17.f3927l >= 8;
                            C0867b c0867b18 = this.f4111b;
                            c0867b18.f3928m = c0867b18.f3927l >= 6;
                            if (this.f4111b.f3927l < 3) {
                                C2403p.m14920k("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i = 36;
                            }
                            if (iMo112101F6 == 0) {
                                synchronized (this.f4111b.f3916a) {
                                    try {
                                        if (this.f4111b.f3917b != 3) {
                                            z = i3 != 1;
                                            this.f4111b.m4861R(2);
                                            C0892n0 c0892n0 = this.f4111b.f3920e != null ? this.f4111b.f3920e : null;
                                            if (c0892n0 != null) {
                                                c0892n0.m5058g(this.f4111b.f3940y);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                z = i3 != 1;
                                this.f4111b.m4861R(0);
                            }
                            strM5022a = null;
                            if (iMo112101F6 == 0) {
                                C0867b c0867b19 = this.f4111b;
                                try {
                                    if (true != z) {
                                        c0867b19.m4895u0(6);
                                    } else {
                                        InterfaceC0878g0 interfaceC0878g0 = c0867b19.f3922g;
                                        h2y0 h2y0VarM14966A = C2422y0.m14966A();
                                        lvx0 lvx0VarM14907D = C2402o0.m14907D();
                                        lvx0VarM14907D.m151924r(0);
                                        h2y0VarM14966A.m129149o(lvx0VarM14907D);
                                        interfaceC0878g0.mo5041b((C2422y0) h2y0VarM14966A.m135959k());
                                    }
                                } catch (Throwable th2) {
                                    C2403p.m14921l("BillingClient", "Unable to log.", th2);
                                }
                                m5059c(C0880h0.f4045l);
                            } else {
                                C0871d c0871d2 = C0880h0.f4034a;
                                try {
                                    if (true != z) {
                                        this.f4111b.m4893t0(i, 6, c0871d2, strM5022a);
                                    } else {
                                        lvx0 lvx0VarM14907D2 = C2402o0.m14907D();
                                        lvx0VarM14907D2.m151924r(c0871d2.m4966b());
                                        lvx0VarM14907D2.m151923q(c0871d2.m4965a());
                                        lvx0VarM14907D2.m151925s(i);
                                        if (strM5022a != null) {
                                            lvx0VarM14907D2.m151922o(strM5022a);
                                        }
                                        InterfaceC0878g0 interfaceC0878g1 = this.f4111b.f3922g;
                                        h2y0 h2y0VarM14966A2 = C2422y0.m14966A();
                                        h2y0VarM14966A2.m129150q((C2402o0) lvx0VarM14907D2.m135959k());
                                        interfaceC0878g1.mo5041b((C2422y0) h2y0VarM14966A2.m135959k());
                                    }
                                } catch (Throwable th3) {
                                    C2403p.m14921l("BillingClient", "Unable to log.", th3);
                                }
                                m5059c(C0880h0.f4034a);
                            }
                        }
                    } catch (Exception e) {
                        z = i3 != 1;
                        C2403p.m14921l("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                        if (e instanceof DeadObjectException) {
                            i2 = 101;
                        } else if (e instanceof RemoteException) {
                            i2 = 100;
                        } else {
                            if (e instanceof SecurityException) {
                                i2 = 102;
                            } else {
                                i = 42;
                            }
                            if (i == 42) {
                                strM5022a = C0876f0.m5022a(e);
                            } else {
                                strM5022a = null;
                            }
                            this.f4111b.m4861R(0);
                            iMo112101F6 = 6;
                        }
                        i = i2;
                        if (i == 42) {
                            strM5022a = C0876f0.m5022a(e);
                        } else {
                            strM5022a = null;
                        }
                        this.f4111b.m4861R(0);
                        iMo112101F6 = 6;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m5061b() {
        this.f4111b.m4861R(0);
        C0871d c0871d = C0880h0.f4047n;
        this.f4111b.m4891s0(24, 6, c0871d);
        m5059c(c0871d);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C2403p.m14920k("BillingClient", "Billing service died.");
        try {
            boolean zM4874j0 = C0867b.m4874j0(this.f4111b);
            C0867b c0867b = this.f4111b;
            if (zM4874j0) {
                InterfaceC0878g0 interfaceC0878g0 = c0867b.f3922g;
                ntx0 ntx0VarM14870D = C2398m0.m14870D();
                ntx0VarM14870D.m161420r(6);
                lvx0 lvx0VarM14907D = C2402o0.m14907D();
                lvx0VarM14907D.m151925s(122);
                ntx0VarM14870D.m161418o(lvx0VarM14907D);
                interfaceC0878g0.mo5043d((C2398m0) ntx0VarM14870D.m135959k());
            } else {
                c0867b.f3922g.mo5040a(C2404p0.m14926y());
            }
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f4111b.f3916a) {
            if (this.f4111b.f3917b != 3 && this.f4111b.f3917b != 0) {
                this.f4111b.m4861R(0);
                this.f4111b.m4863T();
                this.f4110a.mo5068c();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2403p.m14919j("BillingClient", "Billing service connected.");
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4111b.f3923h = rhr0.m179461P2(iBinder);
                C0867b c0867b = this.f4111b;
                if (C0867b.m4880n(new Callable() { // from class: com.android.billingclient.api.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        this.f4103a.m5060a();
                        return null;
                    }
                }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4107a.m5061b();
                    }
                }, c0867b.m4883o0(), c0867b.m4855M()) == null) {
                    C0867b c0867b2 = this.f4111b;
                    C0871d c0871dM4852J = c0867b2.m4852J();
                    c0867b2.m4891s0(25, 6, c0871dM4852J);
                    m5059c(c0871dM4852J);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2403p.m14920k("BillingClient", "Billing service disconnected.");
        try {
            boolean zM4874j0 = C0867b.m4874j0(this.f4111b);
            C0867b c0867b = this.f4111b;
            if (zM4874j0) {
                InterfaceC0878g0 interfaceC0878g0 = c0867b.f3922g;
                ntx0 ntx0VarM14870D = C2398m0.m14870D();
                ntx0VarM14870D.m161420r(6);
                lvx0 lvx0VarM14907D = C2402o0.m14907D();
                lvx0VarM14907D.m151925s(121);
                ntx0VarM14870D.m161418o(lvx0VarM14907D);
                interfaceC0878g0.mo5043d((C2398m0) ntx0VarM14870D.m135959k());
            } else {
                c0867b.f3922g.mo5042c(C2424z0.m14971y());
            }
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4111b.m4861R(0);
                this.f4110a.mo5068c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
