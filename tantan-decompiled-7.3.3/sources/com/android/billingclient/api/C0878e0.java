package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0875d;
import com.google.android.gms.internal.play_billing.C2399b1;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2423n0;
import com.google.android.gms.internal.play_billing.C2426p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p153l.am90;
import p153l.ay2;
import p153l.bas0;
import p153l.c10;
import p153l.d0w0;
import p153l.d10;
import p153l.g8t0;
import p153l.k2s0;
import p153l.lqv0;
import p153l.pfv0;
import p153l.tot0;
import p153l.vkb0;
import p153l.x06;
import p153l.xsv0;
import p153l.y06;
import p153l.yzy0;

/* JADX INFO: renamed from: com.android.billingclient.api.e0 */
/* JADX INFO: loaded from: classes.dex */
final class C0878e0 extends C0871b {

    /* JADX INFO: renamed from: G */
    private final Context f3980G;

    /* JADX INFO: renamed from: H */
    private volatile int f3981H;

    /* JADX INFO: renamed from: I */
    @Nullable
    private volatile k2s0 f3982I;

    /* JADX INFO: renamed from: J */
    private volatile ServiceConnectionC0876d0 f3983J;

    /* JADX INFO: renamed from: K */
    @Nullable
    private volatile xsv0 f3984K;

    @AnyThread
    public C0878e0(@Nullable String str, C0877e c0877e, Context context, tot0 tot0Var, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        super(null, c0877e, context, null, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    private final int m4989X0(lqv0 lqv0Var) {
        try {
            return ((Integer) lqv0Var.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            m4996e1(114, 28, C0884h0.f4033G);
            C2426p.m14975l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m4996e1(107, 28, C0884h0.f4033G);
            C2426p.m14975l("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final synchronized xsv0 m4990Y0() {
        try {
            if (this.f3984K == null) {
                this.f3984K = d0w0.m113473b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3984K;
    }

    /* JADX INFO: renamed from: Z0 */
    private final synchronized void m4991Z0() {
        m4997f1(27);
        try {
            try {
                g8t0 g8t0Var = null;
                if (this.f3983J != null && this.f3982I != null) {
                    C2426p.m14973j("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f3980G.unbindService(this.f3983J);
                    this.f3983J = new ServiceConnectionC0876d0(this, g8t0Var);
                }
                this.f3982I = null;
                if (this.f3984K != null) {
                    this.f3984K.shutdownNow();
                    this.f3984K = null;
                }
            } catch (RuntimeException e) {
                C2426p.m14975l("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
            this.f3981H = 3;
        } catch (Throwable th) {
            this.f3981H = 3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final synchronized void m4992a1() {
        if (m5005S0()) {
            C2426p.m14973j("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            m4997f1(26);
            return;
        }
        int i = 1;
        if (this.f3981H == 1) {
            C2426p.m14974k("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f3981H == 3) {
            C2426p.m14974k("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            m4996e1(38, 26, C0884h0.m5057a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f3981H = 1;
        C2426p.m14973j("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f3983J = new ServiceConnectionC0876d0(this, null);
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
                    C2426p.m14974k("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f3980G.bindService(intent2, this.f3983J, 1)) {
                        C2426p.m14973j("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    C2426p.m14974k("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i = 39;
            }
        }
        this.f3981H = 0;
        C2426p.m14973j("BillingClientTesting", "Billing Override Service unavailable on device.");
        m4996e1(i, 26, C0884h0.m5057a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final boolean m4993b1(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final C0875d m4994c1(int i, int i2) {
        C0875d c0875dM5057a = C0884h0.m5057a(i2, "Billing override value was set by a license tester.");
        m4996e1(105, i, c0875dM5057a);
        return c0875dM5057a;
    }

    /* JADX INFO: renamed from: d1 */
    private final lqv0 m4995d1(int i) {
        if (m5005S0()) {
            return yzy0.m218091a(new C0911y(this, i));
        }
        C2426p.m14974k("BillingClientTesting", "Billing Override Service is not ready.");
        m4996e1(106, 28, C0884h0.m5057a(-1, "Billing Override Service connection is disconnected."));
        return pfv0.m172156a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final void m4996e1(int i, int i2, C0875d c0875d) {
        C2421m0 c2421m0M5033b = C0880f0.m5033b(i, i2, c0875d);
        Objects.requireNonNull(c2421m0M5033b, "ApiFailure should not be null");
        m4915C0().mo5053d(c2421m0M5033b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public final void m4997f1(int i) {
        C2423n0 c2423n0M5035d = C0880f0.m5035d(i);
        Objects.requireNonNull(c2423n0M5035d, "ApiSuccess should not be null");
        m4915C0().mo5056g(c2423n0M5035d);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m4998g1(int i, Consumer consumer, Runnable runnable) {
        pfv0.m172158c(pfv0.m172157b(m4995d1(i), 28500L, TimeUnit.MILLISECONDS, m4990Y0()), new C0872b0(this, i, consumer, runnable), m4917G0());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m5001N0(c10 c10Var, d10 d10Var) {
        super.mo4833a(c10Var, d10Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m5002O0(x06 x06Var, y06 y06Var) {
        super.mo4834b(x06Var, y06Var);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m5003P0(C0875d c0875d) {
        super.m4916E0(c0875d);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m5004Q0(C0881g c0881g, am90 am90Var) {
        super.mo4839h(c0881g, am90Var);
    }

    /* JADX INFO: renamed from: S0 */
    public final synchronized boolean m5005S0() {
        return (this.f3981H != 2 || this.f3982I == null || this.f3983J == null) ? false : true;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Object m5006U0(int i, C2399b1 c2399b1) throws Exception {
        String str;
        try {
            if (this.f3982I == null) {
                throw null;
            }
            k2s0 k2s0Var = this.f3982I;
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
            k2s0Var.mo95419G1(packageName, str, new BinderC0874c0(c2399b1));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            m4996e1(107, 28, C0884h0.f4033G);
            C2426p.m14975l("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            c2399b1.m14806b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: a */
    public final void mo4833a(final c10 c10Var, final d10 d10Var) {
        Objects.requireNonNull(d10Var);
        m4998g1(3, new Consumer() { // from class: l.yzs0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d10Var.mo5080e((C0875d) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f4128a.m5001N0(c10Var, d10Var);
            }
        });
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: b */
    public final void mo4834b(final x06 x06Var, final y06 y06Var) {
        m4998g1(4, new Consumer() { // from class: l.jts0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                y06Var.mo5081f((C0875d) obj, x06Var.m208815a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4123a.m5002O0(x06Var, y06Var);
            }
        });
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: c */
    public final void mo4835c() {
        m4991Z0();
        super.mo4835c();
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: f */
    public final C0875d mo4838f(final Activity activity, final C0873c c0873c) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f3909a.m5003P0((C0875d) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4117a.m5007h1(activity, c0873c);
            }
        };
        int iM4989X0 = m4989X0(m4995d1(2));
        if (m4993b1(iM4989X0)) {
            C0875d c0875dM4994c1 = m4994c1(2, iM4989X0);
            consumer.accept(c0875dM4994c1);
            return c0875dM4994c1;
        }
        try {
            return (C0875d) callable.call();
        } catch (Exception e) {
            C0875d c0875d = C0884h0.f4044k;
            m4996e1(115, 2, c0875d);
            C2426p.m14975l("BillingClientTesting", "An internal error occurred.", e);
            return c0875d;
        }
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: h */
    public final void mo4839h(final C0881g c0881g, final am90 am90Var) {
        m4998g1(7, new Consumer() { // from class: l.ups0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                am90Var.mo98817a((C0875d) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f4120a.m5004Q0(c0881g, am90Var);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ C0875d m5007h1(Activity activity, C0873c c0873c) throws Exception {
        return super.mo4838f(activity, c0873c);
    }

    @Override // com.android.billingclient.api.C0871b, com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: k */
    public final void mo4842k(ay2 ay2Var) {
        m4992a1();
        super.mo4842k(ay2Var);
    }

    @AnyThread
    public C0878e0(@Nullable String str, Context context, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        super(null, context, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }

    @AnyThread
    public C0878e0(@Nullable String str, C0877e c0877e, Context context, vkb0 vkb0Var, @Nullable bas0 bas0Var, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        super(null, c0877e, context, vkb0Var, null, null, null);
        this.f3981H = 0;
        this.f3980G = context;
    }
}
