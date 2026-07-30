package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2425o0;
import com.google.android.gms.internal.play_billing.C2426p;
import com.google.android.gms.internal.play_billing.C2427p0;
import com.google.android.gms.internal.play_billing.C2445y0;
import com.google.android.gms.internal.play_billing.C2447z0;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.Callable;
import p153l.ay2;
import p153l.ens0;
import p153l.jsr0;
import p153l.nby0;
import p153l.r4y0;
import p153l.t2y0;
import p153l.xqr0;

/* JADX INFO: renamed from: com.android.billingclient.api.s */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0905s implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final ay2 f4110a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0871b f4111b;

    public /* synthetic */ ServiceConnectionC0905s(C0871b c0871b, ay2 ay2Var, ens0 ens0Var) {
        this.f4111b = c0871b;
        this.f4110a = ay2Var;
    }

    /* JADX INFO: renamed from: c */
    private final void m5069c(C0875d c0875d) {
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4110a.mo5076a(c0875d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0271  */
    /* JADX WARN: Code duplicated, block: B:164:0x0276  */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object m5070a() throws Exception {
        Bundle bundle;
        boolean z;
        int i;
        int i2;
        String strM5032a;
        int iMo146865F6;
        jsr0 jsr0Var;
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b != 3) {
                    int i3 = this.f4111b.f3917b;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        C0871b c0871b = this.f4111b;
                        C2426p.m14966c(bundle, c0871b.f3918c, c0871b.f3915F.longValue());
                    }
                    try {
                        synchronized (this.f4111b.f3916a) {
                            jsr0Var = this.f4111b.f3923h;
                        }
                        C0871b c0871b2 = this.f4111b;
                        if (jsr0Var == null) {
                            c0871b2.m4871R(0);
                            C0871b c0871b3 = this.f4111b;
                            C0875d c0875d = C0884h0.f4046m;
                            c0871b3.m4901s0(119, 6, c0875d);
                            m5069c(c0875d);
                        } else {
                            String packageName = c0871b2.f3921f.getPackageName();
                            iMo146865F6 = 3;
                            int i4 = 23;
                            while (true) {
                                if (i4 < 3) {
                                    i4 = 0;
                                    break;
                                }
                                iMo146865F6 = bundle == null ? jsr0Var.mo146865F6(i4, packageName, SubSampleInformationBox.TYPE) : jsr0Var.mo146871e4(i4, packageName, SubSampleInformationBox.TYPE, bundle);
                                if (iMo146865F6 == 0) {
                                    C2426p.m14973j("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                    break;
                                }
                                i4--;
                            }
                            this.f4111b.f3926k = i4 >= 5;
                            this.f4111b.f3925j = i4 >= 3;
                            if (i4 < 3) {
                                C2426p.m14973j("BillingClient", "In-app billing API does not support subscription on this device.");
                                i = 9;
                            } else {
                                i = 1;
                            }
                            for (int i5 = 23; i5 >= 3; i5--) {
                                iMo146865F6 = bundle == null ? jsr0Var.mo146865F6(i5, packageName, "inapp") : jsr0Var.mo146871e4(i5, packageName, "inapp", bundle);
                                if (iMo146865F6 == 0) {
                                    this.f4111b.f3927l = i5;
                                    C2426p.m14973j("BillingClient", "mHighestLevelSupportedForInApp: " + this.f4111b.f3927l);
                                    break;
                                }
                            }
                            C0871b c0871b4 = this.f4111b;
                            c0871b4.f3910A = c0871b4.f3927l >= 23;
                            C0871b c0871b5 = this.f4111b;
                            c0871b5.f3941z = c0871b5.f3927l >= 22;
                            C0871b c0871b6 = this.f4111b;
                            c0871b6.f3940y = c0871b6.f3927l >= 21;
                            C0871b c0871b7 = this.f4111b;
                            c0871b7.f3939x = c0871b7.f3927l >= 20;
                            C0871b c0871b8 = this.f4111b;
                            c0871b8.f3938w = c0871b8.f3927l >= 19;
                            C0871b c0871b9 = this.f4111b;
                            c0871b9.f3937v = c0871b9.f3927l >= 18;
                            C0871b c0871b10 = this.f4111b;
                            c0871b10.f3936u = c0871b10.f3927l >= 17;
                            C0871b c0871b11 = this.f4111b;
                            c0871b11.f3935t = c0871b11.f3927l >= 16;
                            C0871b c0871b12 = this.f4111b;
                            c0871b12.f3934s = c0871b12.f3927l >= 15;
                            C0871b c0871b13 = this.f4111b;
                            c0871b13.f3933r = c0871b13.f3927l >= 14;
                            C0871b c0871b14 = this.f4111b;
                            c0871b14.f3932q = c0871b14.f3927l >= 12;
                            C0871b c0871b15 = this.f4111b;
                            c0871b15.f3931p = c0871b15.f3927l >= 10;
                            C0871b c0871b16 = this.f4111b;
                            c0871b16.f3930o = c0871b16.f3927l >= 9;
                            C0871b c0871b17 = this.f4111b;
                            c0871b17.f3929n = c0871b17.f3927l >= 8;
                            C0871b c0871b18 = this.f4111b;
                            c0871b18.f3928m = c0871b18.f3927l >= 6;
                            if (this.f4111b.f3927l < 3) {
                                C2426p.m14974k("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i = 36;
                            }
                            if (iMo146865F6 == 0) {
                                synchronized (this.f4111b.f3916a) {
                                    try {
                                        if (this.f4111b.f3917b != 3) {
                                            z = i3 != 1;
                                            this.f4111b.m4871R(2);
                                            C0896n0 c0896n0 = this.f4111b.f3920e != null ? this.f4111b.f3920e : null;
                                            if (c0896n0 != null) {
                                                c0896n0.m5068g(this.f4111b.f3940y);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                z = i3 != 1;
                                this.f4111b.m4871R(0);
                            }
                            strM5032a = null;
                            if (iMo146865F6 == 0) {
                                C0871b c0871b19 = this.f4111b;
                                try {
                                    if (true != z) {
                                        c0871b19.m4905u0(6);
                                    } else {
                                        InterfaceC0882g0 interfaceC0882g0 = c0871b19.f3922g;
                                        nby0 nby0VarM15020A = C2445y0.m15020A();
                                        r4y0 r4y0VarM14961D = C2425o0.m14961D();
                                        r4y0VarM14961D.m179835r(0);
                                        nby0VarM15020A.m162274o(r4y0VarM14961D);
                                        interfaceC0882g0.mo5051b((C2445y0) nby0VarM15020A.m168605k());
                                    }
                                } catch (Throwable th2) {
                                    C2426p.m14975l("BillingClient", "Unable to log.", th2);
                                }
                                m5069c(C0884h0.f4045l);
                            } else {
                                C0875d c0875d2 = C0884h0.f4034a;
                                try {
                                    if (true != z) {
                                        this.f4111b.m4903t0(i, 6, c0875d2, strM5032a);
                                    } else {
                                        r4y0 r4y0VarM14961D2 = C2425o0.m14961D();
                                        r4y0VarM14961D2.m179835r(c0875d2.m4976b());
                                        r4y0VarM14961D2.m179834q(c0875d2.m4975a());
                                        r4y0VarM14961D2.m179836s(i);
                                        if (strM5032a != null) {
                                            r4y0VarM14961D2.m179833o(strM5032a);
                                        }
                                        InterfaceC0882g0 interfaceC0882g1 = this.f4111b.f3922g;
                                        nby0 nby0VarM15020A2 = C2445y0.m15020A();
                                        nby0VarM15020A2.m162275q((C2425o0) r4y0VarM14961D2.m168605k());
                                        interfaceC0882g1.mo5051b((C2445y0) nby0VarM15020A2.m168605k());
                                    }
                                } catch (Throwable th3) {
                                    C2426p.m14975l("BillingClient", "Unable to log.", th3);
                                }
                                m5069c(C0884h0.f4034a);
                            }
                        }
                    } catch (Exception e) {
                        z = i3 != 1;
                        C2426p.m14975l("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
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
                                strM5032a = C0880f0.m5032a(e);
                            } else {
                                strM5032a = null;
                            }
                            this.f4111b.m4871R(0);
                            iMo146865F6 = 6;
                        }
                        i = i2;
                        if (i == 42) {
                            strM5032a = C0880f0.m5032a(e);
                        } else {
                            strM5032a = null;
                        }
                        this.f4111b.m4871R(0);
                        iMo146865F6 = 6;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m5071b() {
        this.f4111b.m4871R(0);
        C0875d c0875d = C0884h0.f4047n;
        this.f4111b.m4901s0(24, 6, c0875d);
        m5069c(c0875d);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C2426p.m14974k("BillingClient", "Billing service died.");
        try {
            boolean zM4884j0 = C0871b.m4884j0(this.f4111b);
            C0871b c0871b = this.f4111b;
            if (zM4884j0) {
                InterfaceC0882g0 interfaceC0882g0 = c0871b.f3922g;
                t2y0 t2y0VarM14924D = C2421m0.m14924D();
                t2y0VarM14924D.m189009r(6);
                r4y0 r4y0VarM14961D = C2425o0.m14961D();
                r4y0VarM14961D.m179836s(122);
                t2y0VarM14924D.m189007o(r4y0VarM14961D);
                interfaceC0882g0.mo5053d((C2421m0) t2y0VarM14924D.m168605k());
            } else {
                c0871b.f3922g.mo5050a(C2427p0.m14980y());
            }
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f4111b.f3916a) {
            if (this.f4111b.f3917b != 3 && this.f4111b.f3917b != 0) {
                this.f4111b.m4871R(0);
                this.f4111b.m4873T();
                this.f4110a.mo5078c();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2426p.m14973j("BillingClient", "Billing service connected.");
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4111b.f3923h = xqr0.m212740P2(iBinder);
                C0871b c0871b = this.f4111b;
                if (C0871b.m4890n(new Callable() { // from class: com.android.billingclient.api.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        this.f4103a.m5070a();
                        return null;
                    }
                }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4107a.m5071b();
                    }
                }, c0871b.m4893o0(), c0871b.m4865M()) == null) {
                    C0871b c0871b2 = this.f4111b;
                    C0875d c0875dM4862J = c0871b2.m4862J();
                    c0871b2.m4901s0(25, 6, c0875dM4862J);
                    m5069c(c0875dM4862J);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2426p.m14974k("BillingClient", "Billing service disconnected.");
        try {
            boolean zM4884j0 = C0871b.m4884j0(this.f4111b);
            C0871b c0871b = this.f4111b;
            if (zM4884j0) {
                InterfaceC0882g0 interfaceC0882g0 = c0871b.f3922g;
                t2y0 t2y0VarM14924D = C2421m0.m14924D();
                t2y0VarM14924D.m189009r(6);
                r4y0 r4y0VarM14961D = C2425o0.m14961D();
                r4y0VarM14961D.m179836s(121);
                t2y0VarM14924D.m189007o(r4y0VarM14961D);
                interfaceC0882g0.mo5053d((C2421m0) t2y0VarM14924D.m168605k());
            } else {
                c0871b.f3922g.mo5052c(C2447z0.m15025y());
            }
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f4111b.f3916a) {
            try {
                if (this.f4111b.f3917b == 3) {
                    return;
                }
                this.f4111b.m4871R(0);
                this.f4110a.mo5078c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
