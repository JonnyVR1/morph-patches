package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.C0873c;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.C2396a1;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2423n0;
import com.google.android.gms.internal.play_billing.C2425o0;
import com.google.android.gms.internal.play_billing.C2426p;
import com.google.android.gms.internal.play_billing.C2431r0;
import com.google.android.gms.internal.play_billing.C2435t0;
import com.google.android.gms.internal.play_billing.C2438v;
import com.google.android.gms.internal.play_billing.C2440w;
import com.google.android.gms.internal.play_billing.C2442x;
import com.google.android.gms.internal.play_billing.zzco;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONException;
import p153l.adw0;
import p153l.am90;
import p153l.ay2;
import p153l.b5y0;
import p153l.bas0;
import p153l.c10;
import p153l.d0w0;
import p153l.d10;
import p153l.drm;
import p153l.e7y0;
import p153l.erm;
import p153l.f4y0;
import p153l.f8y0;
import p153l.h0u0;
import p153l.jsr0;
import p153l.ph3;
import p153l.r4y0;
import p153l.rrv0;
import p153l.ses0;
import p153l.t2y0;
import p153l.tcy0;
import p153l.tot0;
import p153l.ukb0;
import p153l.vkb0;
import p153l.wi3;
import p153l.wxt0;
import p153l.x06;
import p153l.y06;
import p153l.zvb0;

/* JADX INFO: renamed from: com.android.billingclient.api.b */
/* JADX INFO: loaded from: classes.dex */
class C0871b extends AbstractC0869a {

    /* JADX INFO: renamed from: A */
    private boolean f3910A;

    /* JADX INFO: renamed from: B */
    @Nullable
    private C0877e f3911B;

    /* JADX INFO: renamed from: C */
    private boolean f3912C;

    /* JADX INFO: renamed from: D */
    private ExecutorService f3913D;

    /* JADX INFO: renamed from: E */
    private volatile rrv0 f3914E;

    /* JADX INFO: renamed from: F */
    private final Long f3915F;

    /* JADX INFO: renamed from: a */
    private final Object f3916a;

    /* JADX INFO: renamed from: b */
    private volatile int f3917b;

    /* JADX INFO: renamed from: c */
    private final String f3918c;

    /* JADX INFO: renamed from: d */
    private final Handler f3919d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private volatile C0896n0 f3920e;

    /* JADX INFO: renamed from: f */
    private Context f3921f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0882g0 f3922g;

    /* JADX INFO: renamed from: h */
    private volatile jsr0 f3923h;

    /* JADX INFO: renamed from: i */
    private volatile ServiceConnectionC0905s f3924i;

    /* JADX INFO: renamed from: j */
    private boolean f3925j;

    /* JADX INFO: renamed from: k */
    private boolean f3926k;

    /* JADX INFO: renamed from: l */
    private int f3927l;

    /* JADX INFO: renamed from: m */
    private boolean f3928m;

    /* JADX INFO: renamed from: n */
    private boolean f3929n;

    /* JADX INFO: renamed from: o */
    private boolean f3930o;

    /* JADX INFO: renamed from: p */
    private boolean f3931p;

    /* JADX INFO: renamed from: q */
    private boolean f3932q;

    /* JADX INFO: renamed from: r */
    private boolean f3933r;

    /* JADX INFO: renamed from: s */
    private boolean f3934s;

    /* JADX INFO: renamed from: t */
    private boolean f3935t;

    /* JADX INFO: renamed from: u */
    private boolean f3936u;

    /* JADX INFO: renamed from: v */
    private boolean f3937v;

    /* JADX INFO: renamed from: w */
    private boolean f3938w;

    /* JADX INFO: renamed from: x */
    private boolean f3939x;

    /* JADX INFO: renamed from: y */
    private boolean f3940y;

    /* JADX INFO: renamed from: z */
    private boolean f3941z;

    @AnyThread
    public C0871b(@Nullable String str, C0877e c0877e, Context context, tot0 tot0Var, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f3915F = lValueOf;
        this.f3918c = m4864L();
        this.f3921f = context.getApplicationContext();
        e7y0 e7y0VarM14986D = C2431r0.m14986D();
        e7y0VarM14986D.m119780s(m4864L());
        e7y0VarM14986D.m119779r(this.f3921f.getPackageName());
        e7y0VarM14986D.m119778q(lValueOf.longValue());
        this.f3922g = new C0886i0(this.f3921f, (C2431r0) e7y0VarM14986D.m168605k());
        C2426p.m14974k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3920e = new C0896n0(this.f3921f, null, null, null, null, this.f3922g);
        this.f3911B = c0877e;
        this.f3921f.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final C0875d m4862J() {
        int[] iArr = {0, 3};
        synchronized (this.f3916a) {
            for (int i = 0; i < 2; i++) {
                if (this.f3917b == iArr[i]) {
                    return C0884h0.f4046m;
                }
            }
            return C0884h0.f4044k;
        }
    }

    /* JADX INFO: renamed from: K */
    private final String m4863K(C0881g c0881g) {
        if (TextUtils.isEmpty(null)) {
            return this.f3921f.getPackageName();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: L */
    private static String m4864L() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return ph3.f152392a;
        }
    }

    /* JADX INFO: renamed from: M */
    private final synchronized ExecutorService m4865M() {
        try {
            if (this.f3913D == null) {
                this.f3913D = Executors.newFixedThreadPool(C2426p.f10406a, new ThreadFactoryC0897o(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3913D;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.android.billingclient.api.b] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.android.billingclient.api.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m4867N(x06 x06Var, y06 y06Var) throws Throwable {
        ?? sb;
        jsr0 jsr0Var;
        int iMo146863D4;
        String strM14970g;
        String strM208815a = x06Var.m208815a();
        try {
            sb = new StringBuilder("Consuming purchase with token: ");
            sb.append(strM208815a);
            C2426p.m14973j("BillingClient", sb.toString());
            synchronized (this.f3916a) {
                try {
                    try {
                        jsr0Var = this.f3923h;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            throw th;
                        }
                    }
                } catch (DeadObjectException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                    sb.m4881b0(y06Var, strM208815a, C0884h0.f4044k, 29, "Error consuming purchase!", e);
                    return;
                }
            }
            if (jsr0Var == null) {
                m4881b0(y06Var, strM208815a, C0884h0.f4046m, 119, "Service has been reset to null.", null);
                return;
            }
            boolean z = this.f3930o;
            Context context = this.f3921f;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = this.f3930o;
                String str = this.f3918c;
                long jLongValue = this.f3915F.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    C2426p.m14966c(bundle, str, jLongValue);
                }
                Bundle bundleMo146867K2 = jsr0Var.mo146867K2(9, packageName, strM208815a, bundle);
                iMo146863D4 = bundleMo146867K2.getInt("RESPONSE_CODE");
                strM14970g = C2426p.m14970g(bundleMo146867K2, "BillingClient");
            } else {
                iMo146863D4 = jsr0Var.mo146863D4(3, context.getPackageName(), strM208815a);
                strM14970g = "";
            }
            C0875d c0875dM5057a = C0884h0.m5057a(iMo146863D4, strM14970g);
            if (iMo146863D4 == 0) {
                C2426p.m14973j("BillingClient", "Successfully consumed purchase.");
                y06Var.mo5081f(c0875dM5057a, strM208815a);
                return;
            } else {
                m4881b0(y06Var, strM208815a, c0875dM5057a, 23, "Error consuming purchase with token. Response code: " + iMo146863D4, null);
                return;
            }
        } catch (DeadObjectException e3) {
            e = e3;
            sb = this;
        } catch (Exception e4) {
            e = e4;
            sb = this;
        }
        sb.m4881b0(y06Var, strM208815a, C0884h0.f4046m, 29, "Error consuming purchase!", e);
    }

    /* JADX INFO: renamed from: O */
    private final void m4868O(C2421m0 c2421m0) {
        try {
            this.f3922g.mo5055f(c2421m0, this.f3927l);
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m4869P(C2423n0 c2423n0) {
        try {
            this.f3922g.mo5054e(c2423n0, this.f3927l);
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m4870Q(String str, final ukb0 ukb0Var) {
        if (!mo4837e()) {
            C0875d c0875d = C0884h0.f4046m;
            m4901s0(2, 9, c0875d);
            ukb0Var.mo5077b(c0875d, zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                C2426p.m14974k("BillingClient", "Please provide a valid product type.");
                C0875d c0875d2 = C0884h0.f4041h;
                m4901s0(50, 9, c0875d2);
                ukb0Var.mo5077b(c0875d2, zzco.zzl());
                return;
            }
            if (m4890n(new CallableC0899p(this, str, ukb0Var), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4025a.m4925h0(ukb0Var);
                }
            }, m4893o0(), m4865M()) == null) {
                C0875d c0875dM4862J = m4862J();
                m4901s0(25, 9, c0875dM4862J);
                ukb0Var.mo5077b(c0875dM4862J, zzco.zzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m4871R(int i) {
        synchronized (this.f3916a) {
            try {
                if (this.f3917b == 3) {
                    return;
                }
                C2426p.m14973j("BillingClient", "Setting clientState from " + m4875V(this.f3917b) + " to " + m4875V(i));
                this.f3917b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    private final synchronized void m4872S() {
        ExecutorService executorService = this.f3913D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f3913D = null;
            this.f3914E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final void m4873T() {
        synchronized (this.f3916a) {
            if (this.f3924i != null) {
                try {
                    this.f3921f.unbindService(this.f3924i);
                    this.f3923h = null;
                    this.f3924i = null;
                } catch (Throwable th) {
                    try {
                        C2426p.m14975l("BillingClient", "There was an exception while unbinding service!", th);
                        this.f3923h = null;
                        this.f3924i = null;
                    } catch (Throwable th2) {
                        this.f3923h = null;
                        this.f3924i = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    private final boolean m4874U() {
        return this.f3938w && this.f3911B.m4982b();
    }

    /* JADX INFO: renamed from: V */
    private static final String m4875V(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i != 1) {
            return i != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    /* JADX INFO: renamed from: W */
    private final C0907u m4876W(C0875d c0875d, int i, String str, @Nullable Exception exc) {
        C2426p.m14975l("BillingClient", str, exc);
        m4903t0(i, 7, c0875d, C0880f0.m5032a(exc));
        return new C0907u(c0875d.m4976b(), c0875d.m4975a(), new ArrayList());
    }

    /* JADX INFO: renamed from: X */
    private final wxt0 m4877X(int i, C0875d c0875d, int i2, String str, @Nullable Exception exc) {
        m4903t0(i2, 9, c0875d, C0880f0.m5032a(exc));
        C2426p.m14975l("BillingClient", str, exc);
        return new wxt0(c0875d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final wxt0 m4878Y(String str, int i) {
        jsr0 jsr0Var;
        C0871b c0871b = this;
        C2426p.m14973j("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleM14967d = C2426p.m14967d(c0871b.f3930o, c0871b.f3938w, c0871b.f3911B.m4981a(), c0871b.f3911B.m4982b(), c0871b.f3918c, c0871b.f3915F.longValue());
        String string = null;
        do {
            try {
                synchronized (c0871b.f3916a) {
                    jsr0Var = c0871b.f3923h;
                }
                if (jsr0Var == null) {
                    return c0871b.m4877X(9, C0884h0.f4046m, 119, "Service has been reset to null", null);
                }
                Bundle bundleMo146869a2 = c0871b.f3930o ? jsr0Var.mo146869a2(true != c0871b.f3938w ? 9 : 19, c0871b.f3921f.getPackageName(), str, string, bundleM14967d) : jsr0Var.mo146870e1(3, c0871b.f3921f.getPackageName(), str, string);
                C0892l0 c0892l0M5061a = C0894m0.m5061a(bundleMo146869a2, "BillingClient", "getPurchase()");
                C0875d c0875dM5059a = c0892l0M5061a.m5059a();
                if (c0875dM5059a != C0884h0.f4045l) {
                    return c0871b.m4877X(9, c0875dM5059a, c0892l0M5061a.m5060b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleMo146869a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleMo146869a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleMo146869a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    C2426p.m14973j("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.m4822e())) {
                            C2426p.m14974k("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        return m4877X(9, C0884h0.f4044k, 51, "Got an exception trying to decode the purchase!", e);
                    }
                }
                c0871b = this;
                if (z) {
                    c0871b.m4901s0(26, 9, C0884h0.f4044k);
                }
                string = bundleMo146869a2.getString("INAPP_CONTINUATION_TOKEN");
                C2426p.m14973j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e2) {
                return m4877X(9, C0884h0.f4046m, 52, "Got exception trying to get purchases try to reconnect", e2);
            } catch (Exception e3) {
                return c0871b.m4877X(9, C0884h0.f4044k, 52, "Got exception trying to get purchases try to reconnect", e3);
            }
        } while (!TextUtils.isEmpty(string));
        return new wxt0(C0884h0.f4045l, arrayList);
    }

    /* JADX INFO: renamed from: Z */
    private final void m4879Z(C0875d c0875d, int i, int i2) {
        C2423n0 c2423n0 = null;
        C2421m0 c2421m0 = null;
        if (c0875d.m4976b() == 0) {
            int i3 = C0880f0.f4017a;
            try {
                f4y0 f4y0VarM14929C = C2423n0.m14929C();
                f4y0VarM14929C.m124093r(5);
                f8y0 f8y0VarM14994A = C2435t0.m14994A();
                f8y0VarM14994A.m124577o(i2);
                f4y0VarM14929C.m124091o((C2435t0) f8y0VarM14994A.m168605k());
                c2423n0 = (C2423n0) f4y0VarM14929C.m168605k();
            } catch (Exception e) {
                C2426p.m14975l("BillingLogger", "Unable to create logging payload", e);
            }
            m4869P(c2423n0);
            return;
        }
        int i4 = C0880f0.f4017a;
        try {
            t2y0 t2y0VarM14924D = C2421m0.m14924D();
            r4y0 r4y0VarM14961D = C2425o0.m14961D();
            r4y0VarM14961D.m179835r(c0875d.m4976b());
            r4y0VarM14961D.m179834q(c0875d.m4975a());
            r4y0VarM14961D.m179836s(i);
            t2y0VarM14924D.m189007o(r4y0VarM14961D);
            t2y0VarM14924D.m189009r(5);
            f8y0 f8y0VarM14994A2 = C2435t0.m14994A();
            f8y0VarM14994A2.m124577o(i2);
            t2y0VarM14924D.m189008q((C2435t0) f8y0VarM14994A2.m168605k());
            c2421m0 = (C2421m0) t2y0VarM14924D.m168605k();
        } catch (Exception e2) {
            C2426p.m14975l("BillingLogger", "Unable to create logging payload", e2);
        }
        m4868O(c2421m0);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m4880a0(d10 d10Var, C0875d c0875d, int i, @Nullable Exception exc) {
        C2426p.m14975l("BillingClient", "Error in acknowledge purchase!", exc);
        m4903t0(i, 3, c0875d, C0880f0.m5032a(exc));
        d10Var.mo5080e(c0875d);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m4881b0(y06 y06Var, String str, C0875d c0875d, int i, String str2, @Nullable Exception exc) {
        C2426p.m14975l("BillingClient", str2, exc);
        m4903t0(i, 4, c0875d, C0880f0.m5032a(exc));
        y06Var.mo5081f(c0875d, str);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* bridge */ /* synthetic */ boolean m4884j0(C0871b c0871b) {
        boolean z;
        synchronized (c0871b.f3916a) {
            z = true;
            if (c0871b.f3917b != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    private void m4886l(Context context, vkb0 vkb0Var, C0877e c0877e, @Nullable bas0 bas0Var, String str, @Nullable InterfaceC0882g0 interfaceC0882g0) {
        this.f3921f = context.getApplicationContext();
        e7y0 e7y0VarM14986D = C2431r0.m14986D();
        e7y0VarM14986D.m119780s(str);
        e7y0VarM14986D.m119779r(this.f3921f.getPackageName());
        e7y0VarM14986D.m119778q(this.f3915F.longValue());
        if (interfaceC0882g0 != null) {
            this.f3922g = interfaceC0882g0;
        } else {
            this.f3922g = new C0886i0(this.f3921f, (C2431r0) e7y0VarM14986D.m168605k());
        }
        if (vkb0Var == null) {
            C2426p.m14974k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3920e = new C0896n0(this.f3921f, vkb0Var, null, bas0Var, null, this.f3922g);
        this.f3911B = c0877e;
        this.f3912C = bas0Var != null;
        this.f3921f.getPackageName();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static Future m4890n(Callable callable, long j, @Nullable final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: l.dir0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    C2426p.m14974k("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            C2426p.m14975l("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final Handler m4893o0() {
        return Looper.myLooper() == null ? this.f3919d : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: p0 */
    private final C0875d m4895p0() {
        C2426p.m14973j("BillingClient", "Service connection is valid. No need to re-initialize.");
        f4y0 f4y0VarM14929C = C2423n0.m14929C();
        f4y0VarM14929C.m124093r(6);
        tcy0 tcy0VarM14798A = C2396a1.m14798A();
        tcy0VarM14798A.m190522o(true);
        f4y0VarM14929C.m124092q(tcy0VarM14798A);
        m4869P((C2423n0) f4y0VarM14929C.m168605k());
        return C0884h0.f4045l;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m4899r0(int i, int i2, @Nullable Exception exc) {
        C2421m0 c2421m0;
        C2426p.m14975l("BillingClient", "showInAppMessages error.", exc);
        InterfaceC0882g0 interfaceC0882g0 = this.f3922g;
        String strM5032a = C0880f0.m5032a(exc);
        try {
            r4y0 r4y0VarM14961D = C2425o0.m14961D();
            r4y0VarM14961D.m179835r(i);
            r4y0VarM14961D.m179836s(i2);
            if (strM5032a != null) {
                r4y0VarM14961D.m179833o(strM5032a);
            }
            t2y0 t2y0VarM14924D = C2421m0.m14924D();
            t2y0VarM14924D.m189007o(r4y0VarM14961D);
            t2y0VarM14924D.m189009r(30);
            c2421m0 = (C2421m0) t2y0VarM14924D.m168605k();
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to create logging payload", th);
            c2421m0 = null;
        }
        interfaceC0882g0.mo5053d(c2421m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m4901s0(int i, int i2, C0875d c0875d) {
        try {
            m4868O(C0880f0.m5033b(i, i2, c0875d));
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m4903t0(int i, int i2, C0875d c0875d, @Nullable String str) {
        try {
            m4868O(C0880f0.m5034c(i, i2, c0875d, str));
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m4905u0(int i) {
        try {
            m4869P(C0880f0.m5035d(i));
        } catch (Throwable th) {
            C2426p.m14975l("BillingClient", "Unable to log.", th);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A0 */
    public final C0907u m4914A0(C0881g c0881g) {
        jsr0 jsr0Var;
        ArrayList arrayList = new ArrayList();
        String strM5038c = c0881g.m5038c();
        zzco zzcoVarM5037b = c0881g.m5037b();
        int size = zzcoVarM5037b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(zzcoVarM5037b.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((C0881g.b) arrayList2.get(i3)).m5043b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f3918c);
            try {
                synchronized (this.f3916a) {
                    jsr0Var = this.f3923h;
                }
                if (jsr0Var == null) {
                    return m4876W(C0884h0.f4046m, 119, "Service has been reset to null.", null);
                }
                boolean z = true;
                int i4 = true != this.f3939x ? 17 : 20;
                String packageName = this.f3921f.getPackageName();
                boolean zM4874U = m4874U();
                String str = this.f3918c;
                m4863K(c0881g);
                m4863K(c0881g);
                m4863K(c0881g);
                m4863K(c0881g);
                long jLongValue = this.f3915F.longValue();
                Bundle bundle2 = new Bundle();
                C2426p.m14966c(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zM4874U) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i5 < size3) {
                    C0881g.b bVar = (C0881g.b) arrayList2.get(i5);
                    boolean z4 = z;
                    arrayList4.add(null);
                    z2 |= !TextUtils.isEmpty(null);
                    String strM5044c = bVar.m5044c();
                    jsr0 jsr0Var2 = jsr0Var;
                    if (strM5044c.equals("first_party")) {
                        ses0.m185568c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z3 = z4;
                    }
                    i5++;
                    jsr0Var = jsr0Var2;
                    z = z4;
                }
                jsr0 jsr0Var3 = jsr0Var;
                if (z2) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z3 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleMo146864F2 = jsr0Var3.mo146864F2(i4, packageName, strM5038c, bundle, bundle2);
                if (bundleMo146864F2 == null) {
                    return m4876W(C0884h0.f4029C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleMo146864F2.containsKey("DETAILS_LIST")) {
                    int iM14965b = C2426p.m14965b(bundleMo146864F2, "BillingClient");
                    String strM14970g = C2426p.m14970g(bundleMo146864F2, "BillingClient");
                    if (iM14965b == 0) {
                        return m4876W(C0884h0.m5057a(6, strM14970g), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return m4876W(C0884h0.m5057a(iM14965b, strM14970g), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iM14965b, null);
                }
                ArrayList<String> stringArrayList = bundleMo146864F2.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return m4876W(C0884h0.f4029C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                    try {
                        C0879f c0879f = new C0879f(stringArrayList.get(i6));
                        C2426p.m14973j("BillingClient", "Got product details: ".concat(c0879f.toString()));
                        arrayList.add(c0879f);
                    } catch (JSONException e) {
                        return m4876W(C0884h0.m5057a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                i = i2;
            } catch (DeadObjectException e2) {
                return m4876W(C0884h0.f4046m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
            } catch (Exception e3) {
                return m4876W(C0884h0.f4044k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            }
        }
        return new C0907u(0, "", arrayList);
    }

    /* JADX INFO: renamed from: C0 */
    public final InterfaceC0882g0 m4915C0() {
        return this.f3922g;
    }

    /* JADX INFO: renamed from: E0 */
    public final C0875d m4916E0(final C0875d c0875d) {
        if (Thread.interrupted()) {
            return c0875d;
        }
        this.f3919d.post(new Runnable() { // from class: com.android.billingclient.api.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4095a.m4922e0(c0875d);
            }
        });
        return c0875d;
    }

    /* JADX INFO: renamed from: G0 */
    public final synchronized rrv0 m4917G0() {
        try {
            if (this.f3914E == null) {
                this.f3914E = d0w0.m113472a(m4865M());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3914E;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ Object m4918J0(d10 d10Var, c10 c10Var) throws Exception {
        jsr0 jsr0Var;
        try {
            synchronized (this.f3916a) {
                jsr0Var = this.f3923h;
            }
            if (jsr0Var == null) {
                m4880a0(d10Var, C0884h0.f4046m, 119, null);
                return null;
            }
            String packageName = this.f3921f.getPackageName();
            String strM107482a = c10Var.m107482a();
            String str = this.f3918c;
            long jLongValue = this.f3915F.longValue();
            Bundle bundle = new Bundle();
            C2426p.m14966c(bundle, str, jLongValue);
            Bundle bundleMo146873p4 = jsr0Var.mo146873p4(9, packageName, strM107482a, bundle);
            d10Var.mo5080e(C0884h0.m5057a(C2426p.m14965b(bundleMo146873p4, "BillingClient"), C2426p.m14970g(bundleMo146873p4, "BillingClient")));
            return null;
        } catch (DeadObjectException e) {
            m4880a0(d10Var, C0884h0.f4046m, 28, e);
            return null;
        } catch (Exception e2) {
            m4880a0(d10Var, C0884h0.f4044k, 28, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ Object m4919K0(x06 x06Var, y06 y06Var) throws Exception {
        m4867N(x06Var, y06Var);
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ Object m4920L0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        jsr0 jsr0Var;
        try {
            synchronized (this.f3916a) {
                jsr0Var = this.f3923h;
            }
            if (jsr0Var == null) {
                m4899r0(-1, 119, null);
            } else {
                jsr0Var.mo146868V5(12, this.f3921f.getPackageName(), bundle, new BinderC0906t(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            m4899r0(-1, 118, e);
        } catch (Exception e2) {
            m4899r0(6, 118, e2);
        }
        return null;
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: a */
    public void mo4833a(final c10 c10Var, final d10 d10Var) {
        if (!mo4837e()) {
            C0875d c0875d = C0884h0.f4046m;
            m4901s0(2, 3, c0875d);
            d10Var.mo5080e(c0875d);
            return;
        }
        if (TextUtils.isEmpty(c10Var.m107482a())) {
            C2426p.m14974k("BillingClient", "Please provide a valid purchase token.");
            C0875d c0875d2 = C0884h0.f4043j;
            m4901s0(26, 3, c0875d2);
            d10Var.mo5080e(c0875d2);
            return;
        }
        if (!this.f3930o) {
            C0875d c0875d3 = C0884h0.f4035b;
            m4901s0(27, 3, c0875d3);
            d10Var.mo5080e(c0875d3);
        } else if (m4890n(new Callable() { // from class: com.android.billingclient.api.q0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4104a.m4918J0(d10Var, c10Var);
                return null;
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4108a.m4921d0(d10Var);
            }
        }, m4893o0(), m4865M()) == null) {
            C0875d c0875dM4862J = m4862J();
            m4901s0(25, 3, c0875dM4862J);
            d10Var.mo5080e(c0875dM4862J);
        }
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: b */
    public void mo4834b(final x06 x06Var, final y06 y06Var) {
        if (!mo4837e()) {
            C0875d c0875d = C0884h0.f4046m;
            m4901s0(2, 4, c0875d);
            y06Var.mo5081f(c0875d, x06Var.m208815a());
        } else if (m4890n(new Callable() { // from class: com.android.billingclient.api.i
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4060a.m4919K0(x06Var, y06Var);
                return null;
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f4065a.m4923f0(y06Var, x06Var);
            }
        }, m4893o0(), m4865M()) == null) {
            C0875d c0875dM4862J = m4862J();
            m4901s0(25, 4, c0875dM4862J);
            y06Var.mo5081f(c0875dM4862J, x06Var.m208815a());
        }
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: c */
    public void mo4835c() {
        m4905u0(12);
        synchronized (this.f3916a) {
            try {
                if (this.f3920e != null) {
                    this.f3920e.m5067f();
                    try {
                        C2426p.m14973j("BillingClient", "Unbinding from service.");
                        m4873T();
                    } catch (Throwable th) {
                        C2426p.m14975l("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                    }
                    try {
                        m4872S();
                    } catch (Throwable th2) {
                        try {
                            C2426p.m14975l("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                        } catch (Throwable th3) {
                            m4871R(3);
                            throw th3;
                        }
                    }
                    m4871R(3);
                } else {
                    C2426p.m14973j("BillingClient", "Unbinding from service.");
                    m4873T();
                    m4872S();
                    m4871R(3);
                }
            } catch (Throwable th4) {
                C2426p.m14975l("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: d */
    public final C0875d mo4836d(String str) {
        if (!mo4837e()) {
            C0875d c0875d = C0884h0.f4046m;
            if (c0875d.m4976b() != 0) {
                m4901s0(2, 5, c0875d);
                return c0875d;
            }
            m4905u0(5);
            return c0875d;
        }
        C0875d c0875d2 = C0884h0.f4034a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    C0875d c0875d3 = this.f3926k ? C0884h0.f4045l : C0884h0.f4049p;
                    m4879Z(c0875d3, 10, 3);
                    return c0875d3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    C0875d c0875d4 = this.f3934s ? C0884h0.f4045l : C0884h0.f4052s;
                    m4879Z(c0875d4, 31, 6);
                    return c0875d4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    C0875d c0875d5 = this.f3932q ? C0884h0.f4045l : C0884h0.f4056w;
                    m4879Z(c0875d5, 30, 5);
                    return c0875d5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    C0875d c0875d6 = this.f3935t ? C0884h0.f4045l : C0884h0.f4053t;
                    m4879Z(c0875d6, 19, 8);
                    return c0875d6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    C0875d c0875d7 = this.f3933r ? C0884h0.f4045l : C0884h0.f4054u;
                    m4879Z(c0875d7, 21, 7);
                    return c0875d7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    C0875d c0875d8 = this.f3935t ? C0884h0.f4045l : C0884h0.f4053t;
                    m4879Z(c0875d8, 61, 9);
                    return c0875d8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    C0875d c0875d9 = this.f3936u ? C0884h0.f4045l : C0884h0.f4055v;
                    m4879Z(c0875d9, 20, 10);
                    return c0875d9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    C0875d c0875d10 = this.f3937v ? C0884h0.f4045l : C0884h0.f4027A;
                    m4879Z(c0875d10, 32, 11);
                    return c0875d10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    C0875d c0875d11 = this.f3937v ? C0884h0.f4045l : C0884h0.f4028B;
                    m4879Z(c0875d11, 33, 12);
                    return c0875d11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    C0875d c0875d12 = this.f3939x ? C0884h0.f4045l : C0884h0.f4030D;
                    m4879Z(c0875d12, 60, 13);
                    return c0875d12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    C0875d c0875d13 = this.f3940y ? C0884h0.f4045l : C0884h0.f4031E;
                    m4879Z(c0875d13, 66, 14);
                    return c0875d13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    C0875d c0875d14 = this.f3941z ? C0884h0.f4045l : C0884h0.f4057x;
                    m4879Z(c0875d14, 103, 18);
                    return c0875d14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    C0875d c0875d15 = this.f3910A ? C0884h0.f4045l : C0884h0.f4058y;
                    m4879Z(c0875d15, 116, 19);
                    return c0875d15;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    C0875d c0875d16 = this.f3929n ? C0884h0.f4045l : C0884h0.f4051r;
                    m4879Z(c0875d16, 35, 4);
                    return c0875d16;
                }
                break;
            case 1987365622:
                if (str.equals(SchemeKey.subscriptions)) {
                    C0875d c0875d17 = this.f3925j ? C0884h0.f4045l : C0884h0.f4048o;
                    m4879Z(c0875d17, 9, 2);
                    return c0875d17;
                }
                break;
        }
        C2426p.m14974k("BillingClient", "Unsupported feature: ".concat(str));
        C0875d c0875d18 = C0884h0.f4059z;
        m4879Z(c0875d18, 34, 1);
        return c0875d18;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m4921d0(d10 d10Var) {
        C0875d c0875d = C0884h0.f4047n;
        m4901s0(24, 3, c0875d);
        d10Var.mo5080e(c0875d);
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: e */
    public final boolean mo4837e() {
        boolean z;
        synchronized (this.f3916a) {
            try {
                z = false;
                if (this.f3917b == 2 && this.f3923h != null && this.f3924i != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m4922e0(C0875d c0875d) {
        vkb0 vkb0VarM5066d = this.f3920e.m5066d();
        C0896n0 c0896n0 = this.f3920e;
        if (vkb0VarM5066d != null) {
            c0896n0.m5066d().mo5079d(c0875d, null);
        } else {
            C2426p.m14974k("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0465  */
    /* JADX WARN: Code duplicated, block: B:176:0x0470  */
    /* JADX WARN: Code duplicated, block: B:177:0x0478  */
    /* JADX WARN: Code duplicated, block: B:179:0x0486  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:194:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c7  */
    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: f */
    public C0875d mo4838f(Activity activity, final C0873c c0873c) {
        String strM5010c;
        String strM5011d;
        String str;
        String str2;
        String str3;
        Future futureM4890n;
        int iM102676a;
        int i;
        String string;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        boolean z2;
        Intent intent;
        String str8;
        int i2;
        final int i3;
        final C0871b c0871b = this;
        String str9 = "proxyPackageVersion";
        if (c0871b.f3920e == null || c0871b.f3920e.m5066d() == null) {
            C0875d c0875d = C0884h0.f4032F;
            c0871b.m4901s0(12, 2, c0875d);
            return c0875d;
        }
        if (!c0871b.mo4837e()) {
            C0875d c0875d2 = C0884h0.f4046m;
            c0871b.m4901s0(2, 2, c0875d2);
            c0871b.m4916E0(c0875d2);
            return c0875d2;
        }
        ArrayList<SkuDetails> arrayListM4942h = c0873c.m4942h();
        List listM4943i = c0873c.m4943i();
        SkuDetails skuDetails = (SkuDetails) h0u0.m133196a(arrayListM4942h, null);
        C0873c.b bVar = (C0873c.b) h0u0.m133196a(listM4943i, null);
        if (skuDetails != null) {
            strM5010c = skuDetails.m4824a();
            strM5011d = skuDetails.m4825b();
        } else {
            strM5010c = bVar.m4951b().m5010c();
            strM5011d = bVar.m4951b().m5011d();
        }
        String str10 = "BillingClient";
        if (strM5011d.equals(SubSampleInformationBox.TYPE) && !c0871b.f3925j) {
            C2426p.m14974k("BillingClient", "Current client doesn't support subscriptions.");
            C0875d c0875d3 = C0884h0.f4048o;
            c0871b.m4901s0(9, 2, c0875d3);
            c0871b.m4916E0(c0875d3);
            return c0875d3;
        }
        if (c0873c.m4945r() && !c0871b.f3928m) {
            C2426p.m14974k("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0875d c0875d4 = C0884h0.f4042i;
            c0871b.m4901s0(18, 2, c0875d4);
            c0871b.m4916E0(c0875d4);
            return c0875d4;
        }
        if (arrayListM4942h.size() > 1 && !c0871b.f3935t) {
            C2426p.m14974k("BillingClient", "Current client doesn't support multi-item purchases.");
            C0875d c0875d5 = C0884h0.f4053t;
            c0871b.m4901s0(19, 2, c0875d5);
            c0871b.m4916E0(c0875d5);
            return c0875d5;
        }
        if (!listM4943i.isEmpty() && !c0871b.f3936u) {
            C2426p.m14974k("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C0875d c0875d6 = C0884h0.f4055v;
            c0871b.m4901s0(20, 2, c0875d6);
            c0871b.m4916E0(c0875d6);
            return c0875d6;
        }
        C0875d c0875dM4937c = c0873c.m4937c();
        if (c0875dM4937c != C0884h0.f4045l) {
            c0871b.m4901s0(120, 2, c0875dM4937c);
            c0871b.m4916E0(c0875dM4937c);
            return c0875dM4937c;
        }
        if (c0871b.f3928m) {
            boolean z3 = c0871b.f3930o;
            boolean z4 = c0871b.f3938w;
            boolean zM4981a = c0871b.f3911B.m4981a();
            boolean zM4982b = c0871b.f3911B.m4982b();
            boolean z5 = c0871b.f3912C;
            String str11 = c0871b.f3918c;
            final String str12 = strM5010c;
            long jLongValue = c0871b.f3915F.longValue();
            final String packageName = c0871b.f3921f.getPackageName();
            final Bundle bundle = new Bundle();
            C2426p.m14966c(bundle, str11, jLongValue);
            if (c0873c.m4936b() != 0) {
                bundle.putInt("prorationMode", c0873c.m4936b());
            }
            if (!TextUtils.isEmpty(c0873c.m4938d())) {
                bundle.putString("accountId", c0873c.m4938d());
            }
            if (!TextUtils.isEmpty(c0873c.m4939e())) {
                bundle.putString("obfuscatedProfileId", c0873c.m4939e());
            }
            if (c0873c.m4944q()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c0873c.m4940f())) {
                bundle.putString("oldSkuPurchaseToken", c0873c.m4940f());
            }
            if (TextUtils.isEmpty(null)) {
                str4 = null;
            } else {
                str4 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c0873c.m4941g())) {
                bundle.putString("originalExternalTransactionId", c0873c.m4941g());
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("paymentsPurchaseParams", str4);
            }
            if (z3 && zM4981a) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && zM4982b) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (c0873c.m4943i().stream().anyMatch(new Predicate() { // from class: l.s9r0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i4 = C2426p.f10406a;
                    return false;
                }
            })) {
                adw0 adw0VarM15004y = C2440w.m15004y();
                adw0VarM15004y.m97144o((Iterable) c0873c.m4943i().stream().filter(new Predicate() { // from class: l.i9s0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i4 = C2426p.f10406a;
                        return false;
                    }
                }).map(new Function() { // from class: l.a6t0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i4 = C2426p.f10406a;
                        String strM5010c2 = ((C0873c.b) obj).m4951b().m5010c();
                        saw0 saw0VarM15000y = C2438v.m15000y();
                        zfw0 zfw0VarM15015y = C2442x.m15015y();
                        zfw0VarM15015y.m219587o("subs:" + packageName + ":" + strM5010c2);
                        saw0VarM15000y.m185273o(zfw0VarM15015y);
                        C2442x.m15015y();
                        throw null;
                    }
                }).collect(zzco.zzo()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((C2440w) adw0VarM15004y.m168605k()).m15019d());
            }
            if (arrayListM4942h.isEmpty()) {
                str5 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str6 = strM5011d;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listM4943i.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listM4943i.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i4 = 0; i4 < listM4943i.size(); i4++) {
                    C0873c.b bVar2 = (C0873c.b) listM4943i.get(i4);
                    C0879f c0879fM4951b = bVar2.m4951b();
                    if (!c0879fM4951b.m5015h().isEmpty()) {
                        arrayList3.add(c0879fM4951b.m5015h());
                    }
                    arrayList4.add(bVar2.m4952c());
                    String strM5016i = c0879fM4951b.m5016i();
                    if (c0879fM4951b.m5017j() != null && !c0879fM4951b.m5017j().isEmpty()) {
                        for (C0879f.b bVar3 : c0879fM4951b.m5017j()) {
                            if (!TextUtils.isEmpty(bVar3.m5023f())) {
                                strM5016i = bVar3.m5023f();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strM5016i)) {
                        arrayList5.add(strM5016i);
                    }
                    if (i4 > 0) {
                        arrayList.add(((C0873c.b) listM4943i.get(i4)).m4951b().m5010c());
                        arrayList2.add(((C0873c.b) listM4943i.get(i4)).m4951b().m5011d());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList6);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                str6 = strM5011d;
                ArrayList<String> arrayList9 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails2 : arrayListM4942h) {
                    if (!skuDetails2.m4831h().isEmpty()) {
                        arrayList7.add(skuDetails2.m4831h());
                    }
                    String strM4828e = skuDetails2.m4828e();
                    String str13 = str10;
                    String strM4827d = skuDetails2.m4827d();
                    int iM4826c = skuDetails2.m4826c();
                    String strM4830g = skuDetails2.m4830g();
                    arrayList8.add(strM4828e);
                    z6 |= !TextUtils.isEmpty(strM4828e);
                    arrayList9.add(strM4827d);
                    z7 |= !TextUtils.isEmpty(strM4827d);
                    arrayList10.add(Integer.valueOf(iM4826c));
                    z8 |= iM4826c != 0;
                    z9 |= !TextUtils.isEmpty(strM4830g);
                    arrayList11.add(strM4830g);
                    str9 = str9;
                    str10 = str13;
                }
                str5 = str9;
                str7 = str10;
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                if (arrayListM4942h.size() > 1) {
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListM4942h.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayListM4942h.size() - 1);
                    for (int i5 = 1; i5 < arrayListM4942h.size(); i5++) {
                        arrayList12.add(((SkuDetails) arrayListM4942h.get(i5)).m4824a());
                        arrayList13.add(((SkuDetails) arrayListM4942h.get(i5)).m4825b());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            c0871b = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c0871b.f3933r) {
                C0875d c0875d7 = C0884h0.f4054u;
                c0871b.m4901s0(21, 2, c0875d7);
                c0871b.m4916E0(c0875d7);
                return c0875d7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.m4829f())) {
                if (bVar == null || TextUtils.isEmpty(bVar.m4951b().m5014g())) {
                    z2 = false;
                } else {
                    bundle.putString("skuPackageName", bVar.m4951b().m5014g());
                }
                str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str3 = str7;
                    C2426p.m14974k(str3, "Activity's intent is null.");
                } else {
                    str3 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str8 = str5;
                            try {
                                bundle.putString(str8, c0871b.f3921f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str8, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str8 = str5;
                        }
                    }
                }
                if (!c0871b.f3936u && !listM4943i.isEmpty()) {
                    i2 = 17;
                } else if (c0871b.f3934s || !z2) {
                    if (c0871b.f3930o) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                    }
                    final String str14 = str6;
                    futureM4890n = m4890n(new Callable() { // from class: com.android.billingclient.api.n
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f4081a.m4926w0(i3, str12, str14, c0873c, bundle);
                        }
                    }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0871b.f3919d, c0871b.m4865M());
                } else {
                    i2 = 15;
                }
                i3 = i2;
                final String str15 = str6;
                futureM4890n = m4890n(new Callable() { // from class: com.android.billingclient.api.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f4081a.m4926w0(i3, str12, str15, c0873c, bundle);
                    }
                }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0871b.f3919d, c0871b.m4865M());
            } else {
                bundle.putString("skuPackageName", skuDetails.m4829f());
            }
            z2 = true;
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str3 = str7;
                C2426p.m14974k(str3, "Activity's intent is null.");
            } else {
                str3 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str8 = str5;
                    bundle.putString(str8, c0871b.f3921f.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!c0871b.f3936u) {
                if (c0871b.f3934s) {
                    if (c0871b.f3930o) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                        i3 = i2;
                    }
                } else if (c0871b.f3930o) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (c0871b.f3934s) {
                if (c0871b.f3930o) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (c0871b.f3930o) {
                i3 = 9;
            } else {
                i2 = 6;
                i3 = i2;
            }
            final String str16 = str6;
            futureM4890n = m4890n(new Callable() { // from class: com.android.billingclient.api.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4081a.m4926w0(i3, str12, str16, c0873c, bundle);
                }
            }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0871b.f3919d, c0871b.m4865M());
        } else {
            final String str17 = strM5010c;
            str = "BUY_INTENT";
            str2 = null;
            final String str18 = strM5011d;
            str3 = "BillingClient";
            futureM4890n = m4890n(new Callable() { // from class: com.android.billingclient.api.p0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4100a.m4927x0(str17, str18);
                }
            }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0871b.f3919d, c0871b.m4865M());
        }
        try {
            if (futureM4890n == null) {
                C0875d c0875d8 = C0884h0.f4037d;
                c0871b.m4901s0(25, 2, c0875d8);
                c0871b.m4916E0(c0875d8);
                return c0875d8;
            }
            Bundle bundle2 = (Bundle) futureM4890n.get(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
            int iM14965b = C2426p.m14965b(bundle2, str3);
            String strM14970g = C2426p.m14970g(bundle2, str3);
            if (iM14965b == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str19 = str;
                intent2.putExtra(str19, (PendingIntent) bundle2.getParcelable(str19));
                activity.startActivity(intent2);
                return C0884h0.f4045l;
            }
            C2426p.m14974k(str3, "Unable to buy item, Error response code: " + iM14965b);
            C0875d c0875dM5057a = C0884h0.m5057a(iM14965b, strM14970g);
            if (bundle2 == null) {
                i = 1;
                iM102676a = 1;
            } else {
                try {
                    Object obj = bundle2.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iM102676a = b5y0.m102676a(((Integer) obj).intValue());
                            i = 1;
                        } else {
                            C2426p.m14974k(str3, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th) {
                    C2426p.m14974k(str3, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                i = 1;
                iM102676a = 1;
            }
            if (iM102676a == i) {
                iM102676a = 23;
            }
            if (bundle2 == null) {
                string = str2;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    C2426p.m14974k(str3, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                    string = str2;
                }
            }
            c0871b.m4903t0(iM102676a, 2, c0875dM5057a, string);
            c0871b.m4916E0(c0875dM5057a);
            return c0875dM5057a;
        } catch (CancellationException e) {
            e = e;
            C2426p.m14975l(str3, "Time out while launching billing flow. Try to reconnect", e);
            C0875d c0875d9 = C0884h0.f4047n;
            c0871b.m4903t0(4, 2, c0875d9, C0880f0.m5032a(e));
            c0871b.m4916E0(c0875d9);
            return c0875d9;
        } catch (TimeoutException e2) {
            e = e2;
            C2426p.m14975l(str3, "Time out while launching billing flow. Try to reconnect", e);
            C0875d c0875d10 = C0884h0.f4047n;
            c0871b.m4903t0(4, 2, c0875d10, C0880f0.m5032a(e));
            c0871b.m4916E0(c0875d10);
            return c0875d10;
        } catch (Exception e3) {
            C2426p.m14975l(str3, "Exception while launching billing flow. Try to reconnect", e3);
            C0875d c0875d11 = C0884h0.f4046m;
            c0871b.m4903t0(5, 2, c0875d11, C0880f0.m5032a(e3));
            c0871b.m4916E0(c0875d11);
            return c0875d11;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4923f0(y06 y06Var, x06 x06Var) {
        C0875d c0875d = C0884h0.f4047n;
        m4901s0(24, 4, c0875d);
        y06Var.mo5081f(c0875d, x06Var.m208815a());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4924g0(am90 am90Var) {
        C0875d c0875d = C0884h0.f4047n;
        m4901s0(24, 7, c0875d);
        am90Var.mo98817a(c0875d, new ArrayList());
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: h */
    public void mo4839h(final C0881g c0881g, final am90 am90Var) {
        if (!mo4837e()) {
            C0875d c0875d = C0884h0.f4046m;
            m4901s0(2, 7, c0875d);
            am90Var.mo98817a(c0875d, new ArrayList());
        } else {
            if (!this.f3936u) {
                C2426p.m14974k("BillingClient", "Querying product details is not supported.");
                C0875d c0875d2 = C0884h0.f4055v;
                m4901s0(20, 7, c0875d2);
                am90Var.mo98817a(c0875d2, new ArrayList());
                return;
            }
            if (m4890n(new Callable() { // from class: com.android.billingclient.api.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C0907u c0907uM4914A0 = this.f4070a.m4914A0(c0881g);
                    am90Var.mo98817a(C0884h0.m5057a(c0907uM4914A0.m5072a(), c0907uM4914A0.m5073b()), c0907uM4914A0.m5074c());
                    return null;
                }
            }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4073a.m4924g0(am90Var);
                }
            }, m4893o0(), m4865M()) == null) {
                C0875d c0875dM4862J = m4862J();
                m4901s0(25, 7, c0875dM4862J);
                am90Var.mo98817a(c0875dM4862J, new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4925h0(ukb0 ukb0Var) {
        C0875d c0875d = C0884h0.f4047n;
        m4901s0(24, 9, c0875d);
        ukb0Var.mo5077b(c0875d, zzco.zzl());
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: i */
    public final void mo4840i(zvb0 zvb0Var, ukb0 ukb0Var) {
        m4870Q(zvb0Var.m221751b(), ukb0Var);
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: j */
    public final C0875d mo4841j(final Activity activity, drm drmVar, erm ermVar) {
        if (!mo4837e()) {
            C2426p.m14974k("BillingClient", "Service disconnected.");
            return C0884h0.f4046m;
        }
        if (!this.f3932q) {
            C2426p.m14974k("BillingClient", "Current client doesn't support showing in-app messages.");
            return C0884h0.f4056w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        wi3.m206547b(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f3918c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", drmVar.m117690b());
        final zzav zzavVar = new zzav(this, this.f3919d, ermVar);
        m4890n(new Callable() { // from class: com.android.billingclient.api.m
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4077a.m4920L0(bundle, activity, zzavVar);
                return null;
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, this.f3919d, m4865M());
        return C0884h0.f4045l;
    }

    @Override // com.android.billingclient.api.AbstractC0869a
    /* JADX INFO: renamed from: k */
    public void mo4842k(ay2 ay2Var) {
        C0875d c0875dM4895p0;
        C0875d c0875d;
        synchronized (this.f3916a) {
            try {
                if (mo4837e()) {
                    c0875dM4895p0 = m4895p0();
                } else {
                    if (this.f3917b == 1) {
                        C2426p.m14974k("BillingClient", "Client is already in the process of connecting to billing service.");
                        c0875d = C0884h0.f4038e;
                        m4901s0(37, 6, c0875d);
                    } else if (this.f3917b == 3) {
                        C2426p.m14974k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        c0875d = C0884h0.f4046m;
                        m4901s0(38, 6, c0875d);
                    } else {
                        m4871R(1);
                        m4873T();
                        C2426p.m14973j("BillingClient", "Starting in-app billing setup.");
                        this.f3924i = new ServiceConnectionC0905s(this, ay2Var, null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f3921f.getPackageManager().queryIntentServices(intent, 0);
                        int i = 41;
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            m4871R(0);
                            C2426p.m14973j("BillingClient", "Billing service unavailable on device.");
                            C0875d c0875d2 = C0884h0.f4036c;
                            m4901s0(i, 6, c0875d2);
                            c0875dM4895p0 = c0875d2;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    C2426p.m14974k("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f3918c);
                                    synchronized (this.f3916a) {
                                        try {
                                            if (this.f3917b == 2) {
                                                c0875dM4895p0 = m4895p0();
                                            } else if (this.f3917b != 1) {
                                                C2426p.m14974k("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                c0875d = C0884h0.f4046m;
                                                m4901s0(117, 6, c0875d);
                                            } else {
                                                ServiceConnectionC0905s serviceConnectionC0905s = this.f3924i;
                                                if (this.f3921f.bindService(intent2, serviceConnectionC0905s, 1)) {
                                                    C2426p.m14973j("BillingClient", "Service was bonded successfully.");
                                                    c0875dM4895p0 = null;
                                                } else {
                                                    C2426p.m14974k("BillingClient", "Connection to Billing service is blocked.");
                                                    i = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                C2426p.m14974k("BillingClient", "The device doesn't have valid Play Store.");
                            }
                            m4871R(0);
                            C2426p.m14973j("BillingClient", "Billing service unavailable on device.");
                            C0875d c0875d3 = C0884h0.f4036c;
                            m4901s0(i, 6, c0875d3);
                            c0875dM4895p0 = c0875d3;
                        }
                    }
                    c0875dM4895p0 = c0875d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0875dM4895p0 != null) {
            ay2Var.mo5076a(c0875dM4895p0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ Bundle m4926w0(int i, String str, String str2, C0873c c0873c, Bundle bundle) throws Exception {
        jsr0 jsr0Var;
        try {
            synchronized (this.f3916a) {
                jsr0Var = this.f3923h;
            }
            return jsr0Var == null ? C2426p.m14976m(C0884h0.f4046m, 119) : jsr0Var.mo146866G5(i, this.f3921f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e) {
            return C2426p.m14977n(C0884h0.f4046m, 5, C0880f0.m5032a(e));
        } catch (Exception e2) {
            return C2426p.m14977n(C0884h0.f4044k, 5, C0880f0.m5032a(e2));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Bundle m4927x0(String str, String str2) throws Exception {
        jsr0 jsr0Var;
        try {
            synchronized (this.f3916a) {
                jsr0Var = this.f3923h;
            }
            return jsr0Var == null ? C2426p.m14976m(C0884h0.f4046m, 119) : jsr0Var.mo146872n3(3, this.f3921f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return C2426p.m14977n(C0884h0.f4046m, 5, C0880f0.m5032a(e));
        } catch (Exception e2) {
            return C2426p.m14977n(C0884h0.f4044k, 5, C0880f0.m5032a(e2));
        }
    }

    @AnyThread
    public C0871b(@Nullable String str, Context context, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f3915F = lValueOf;
        String strM4864L = m4864L();
        this.f3918c = strM4864L;
        this.f3921f = context.getApplicationContext();
        e7y0 e7y0VarM14986D = C2431r0.m14986D();
        e7y0VarM14986D.m119780s(strM4864L);
        e7y0VarM14986D.m119779r(this.f3921f.getPackageName());
        e7y0VarM14986D.m119778q(lValueOf.longValue());
        this.f3922g = new C0886i0(this.f3921f, (C2431r0) e7y0VarM14986D.m168605k());
        this.f3921f.getPackageName();
    }

    @AnyThread
    public C0871b(@Nullable String str, C0877e c0877e, Context context, vkb0 vkb0Var, @Nullable bas0 bas0Var, @Nullable InterfaceC0882g0 interfaceC0882g0, @Nullable ExecutorService executorService) {
        String strM4864L = m4864L();
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        this.f3915F = Long.valueOf(new Random().nextLong());
        this.f3918c = strM4864L;
        m4886l(context, vkb0Var, c0877e, null, strM4864L, null);
    }
}
