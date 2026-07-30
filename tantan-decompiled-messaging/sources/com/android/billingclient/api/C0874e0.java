package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0871d;
import com.google.android.gms.internal.play_billing.C2376b1;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2400n0;
import com.google.android.gms.internal.play_billing.C2403p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p149l.azs0;
import p149l.etr0;
import p149l.fhv0;
import p149l.i10;
import p149l.j10;
import p149l.j6v0;
import p149l.lx2;
import p149l.nft0;
import p149l.rcb0;
import p149l.rjv0;
import p149l.sqy0;
import p149l.sz5;
import p149l.tz5;
import p149l.v0s0;
import p149l.wd90;
import p149l.xqv0;

/* JADX INFO: renamed from: com.android.billingclient.api.e0 */
/* JADX INFO: loaded from: classes.dex */
final class C0874e0 extends C0867b {

    /* JADX INFO: renamed from: G */
    private final Context f3980G;

    /* JADX INFO: renamed from: H */
    private volatile int f3981H;

    /* JADX INFO: renamed from: I */
    @Nullable
    private volatile etr0 f3982I;

    /* JADX INFO: renamed from: J */
    private volatile ServiceConnectionC0872d0 f3983J;

    /* JADX INFO: renamed from: K */
    @Nullable
    private volatile rjv0 f3984K;

    @AnyThread
    public C0874e0(@Nullable String str, C0873e c0873e, Context context, nft0 nft0Var, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        super(null, c0873e, context, null, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    private final int m4979X0(fhv0 fhv0Var) {
        try {
            return ((Integer) fhv0Var.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            m4986e1(114, 28, C0880h0.f4033G);
            C2403p.m14921l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m4986e1(107, 28, C0880h0.f4033G);
            C2403p.m14921l("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final synchronized rjv0 m4980Y0() {
        try {
            if (this.f3984K == null) {
                this.f3984K = xqv0.m210617b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3984K;
    }

    /* JADX INFO: renamed from: Z0 */
    private final synchronized void m4981Z0() {
        m4987f1(27);
        try {
            try {
                azs0 azs0Var = null;
                if (this.f3983J != null && this.f3982I != null) {
                    C2403p.m14919j("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f3980G.unbindService(this.f3983J);
                    this.f3983J = new ServiceConnectionC0872d0(this, azs0Var);
                }
                this.f3982I = null;
                if (this.f3984K != null) {
                    this.f3984K.shutdownNow();
                    this.f3984K = null;
                }
            } catch (RuntimeException e) {
                C2403p.m14921l("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
            this.f3981H = 3;
        } catch (Throwable th) {
            this.f3981H = 3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final synchronized void m4982a1() {
        if (m4995S0()) {
            C2403p.m14919j("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            m4987f1(26);
            return;
        }
        int i = 1;
        if (this.f3981H == 1) {
            C2403p.m14920k("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f3981H == 3) {
            C2403p.m14920k("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            m4986e1(38, 26, C0880h0.m5047a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f3981H = 1;
        C2403p.m14919j("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f3983J = new ServiceConnectionC0872d0(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> listQueryIntentServices = this.f3980G.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    C2403p.m14920k("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f3980G.bindService(intent2, this.f3983J, 1)) {
                        C2403p.m14919j("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    C2403p.m14920k("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i = 39;
            }
        }
        this.f3981H = 0;
        C2403p.m14919j("BillingClientTesting", "Billing Override Service unavailable on device.");
        m4986e1(i, 26, C0880h0.m5047a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final boolean m4983b1(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final C0871d m4984c1(int i, int i2) {
        C0871d c0871dM5047a = C0880h0.m5047a(i2, "Billing override value was set by a license tester.");
        m4986e1(105, i, c0871dM5047a);
        return c0871dM5047a;
    }

    /* JADX INFO: renamed from: d1 */
    private final fhv0 m4985d1(int i) {
        if (m4995S0()) {
            return sqy0.m185618a(new C0907y(this, i));
        }
        C2403p.m14920k("BillingClientTesting", "Billing Override Service is not ready.");
        m4986e1(106, 28, C0880h0.m5047a(-1, "Billing Override Service connection is disconnected."));
        return j6v0.m140056a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final void m4986e1(int i, int i2, C0871d c0871d) {
        C2398m0 c2398m0M5023b = C0876f0.m5023b(i, i2, c0871d);
        Objects.requireNonNull(c2398m0M5023b, "ApiFailure should not be null");
        m4905C0().mo5043d(c2398m0M5023b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m4987f1(int i) {
        C2400n0 c2400n0M5025d = C0876f0.m5025d(i);
        Objects.requireNonNull(c2400n0M5025d, "ApiSuccess should not be null");
        m4905C0().mo5046g(c2400n0M5025d);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m4988g1(int i, Consumer consumer, Runnable runnable) {
        j6v0.m140058c(j6v0.m140057b(m4985d1(i), 28500L, TimeUnit.MILLISECONDS, m4980Y0()), new C0868b0(this, i, consumer, runnable), m4907G0());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m4991N0(i10 i10Var, j10 j10Var) {
        super.mo4823a(i10Var, j10Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m4992O0(sz5 sz5Var, tz5 tz5Var) {
        super.mo4824b(sz5Var, tz5Var);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m4993P0(C0871d c0871d) {
        super.m4906E0(c0871d);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m4994Q0(C0877g c0877g, wd90 wd90Var) {
        super.mo4829h(c0877g, wd90Var);
    }

    /* JADX INFO: renamed from: S0 */
    public final synchronized boolean m4995S0() {
        return (this.f3981H != 2 || this.f3982I == null || this.f3983J == null) ? false : true;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Object m4996U0(int i, C2376b1 c2376b1) throws Exception {
        String str;
        try {
            if (this.f3982I == null) {
                throw null;
            }
            etr0 etr0Var = this.f3982I;
            String packageName = this.f3980G.getPackageName();
            switch (i) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            etr0Var.mo118130G1(packageName, str, new BinderC0870c0(c2376b1));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            m4986e1(107, 28, C0880h0.f4033G);
            C2403p.m14921l("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            c2376b1.m14752b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: a */
    public final void mo4823a(final i10 i10Var, final j10 j10Var) {
        Objects.requireNonNull(j10Var);
        m4988g1(3, new Consumer() { // from class: l.sqs0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j10Var.mo5070e((C0871d) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f4128a.m4991N0(i10Var, j10Var);
            }
        });
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: b */
    public final void mo4824b(final sz5 sz5Var, final tz5 tz5Var) {
        m4988g1(4, new Consumer() { // from class: l.dks0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                tz5Var.mo5071f((C0871d) obj, sz5Var.m186744a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4123a.m4992O0(sz5Var, tz5Var);
            }
        });
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: c */
    public final void mo4825c() {
        m4981Z0();
        super.mo4825c();
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: f */
    public final C0871d mo4828f(final Activity activity, final C0869c c0869c) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f3909a.m4993P0((C0871d) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4117a.m4997h1(activity, c0869c);
            }
        };
        int iM4979X0 = m4979X0(m4985d1(2));
        if (m4983b1(iM4979X0)) {
            C0871d c0871dM4984c1 = m4984c1(2, iM4979X0);
            consumer.accept(c0871dM4984c1);
            return c0871dM4984c1;
        }
        try {
            return (C0871d) callable.call();
        } catch (Exception e) {
            C0871d c0871d = C0880h0.f4044k;
            m4986e1(115, 2, c0871d);
            C2403p.m14921l("BillingClientTesting", "An internal error occurred.", e);
            return c0871d;
        }
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: h */
    public final void mo4829h(final C0877g c0877g, final wd90 wd90Var) {
        m4988g1(7, new Consumer() { // from class: l.ogs0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                wd90Var.mo136040a((C0871d) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f4120a.m4994Q0(c0877g, wd90Var);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ C0871d m4997h1(Activity activity, C0869c c0869c) throws Exception {
        return super.mo4828f(activity, c0869c);
    }

    @Override // com.android.billingclient.api.C0867b, com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: k */
    public final void mo4832k(lx2 lx2Var) {
        m4982a1();
        super.mo4832k(lx2Var);
    }

    @AnyThread
    public C0874e0(@Nullable String str, Context context, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        super(null, context, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }

    @AnyThread
    public C0874e0(@Nullable String str, C0873e c0873e, Context context, rcb0 rcb0Var, @Nullable v0s0 v0s0Var, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        super(null, c0873e, context, rcb0Var, null, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }
}
