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
import com.android.billingclient.api.C0869c;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.C2373a1;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2400n0;
import com.google.android.gms.internal.play_billing.C2402o0;
import com.google.android.gms.internal.play_billing.C2403p;
import com.google.android.gms.internal.play_billing.C2408r0;
import com.google.android.gms.internal.play_billing.C2412t0;
import com.google.android.gms.internal.play_billing.C2415v;
import com.google.android.gms.internal.play_billing.C2417w;
import com.google.android.gms.internal.play_billing.C2419x;
import com.google.android.gms.internal.play_billing.zzco;
import com.p046p1.mobile.putong.data.SchemeKey;
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
import p149l.bh3;
import p149l.bpm;
import p149l.brt0;
import p149l.cpm;
import p149l.djr0;
import p149l.i10;
import p149l.ii3;
import p149l.j10;
import p149l.liv0;
import p149l.lvx0;
import p149l.lx2;
import p149l.m5s0;
import p149l.n3y0;
import p149l.nft0;
import p149l.ntx0;
import p149l.qcb0;
import p149l.qot0;
import p149l.rcb0;
import p149l.sz5;
import p149l.tz5;
import p149l.u3w0;
import p149l.v0s0;
import p149l.vnb0;
import p149l.vvx0;
import p149l.wd90;
import p149l.xqv0;
import p149l.yxx0;
import p149l.zux0;
import p149l.zyx0;

/* JADX INFO: renamed from: com.android.billingclient.api.b */
/* JADX INFO: loaded from: classes.dex */
class C0867b extends AbstractC0865a {

    /* JADX INFO: renamed from: A */
    private boolean f3910A;

    /* JADX INFO: renamed from: B */
    @Nullable
    private C0873e f3911B;

    /* JADX INFO: renamed from: C */
    private boolean f3912C;

    /* JADX INFO: renamed from: D */
    private ExecutorService f3913D;

    /* JADX INFO: renamed from: E */
    private volatile liv0 f3914E;

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
    private volatile C0892n0 f3920e;

    /* JADX INFO: renamed from: f */
    private Context f3921f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0878g0 f3922g;

    /* JADX INFO: renamed from: h */
    private volatile djr0 f3923h;

    /* JADX INFO: renamed from: i */
    private volatile ServiceConnectionC0901s f3924i;

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
    public C0867b(@Nullable String str, C0873e c0873e, Context context, nft0 nft0Var, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f3915F = lValueOf;
        this.f3918c = m4854L();
        this.f3921f = context.getApplicationContext();
        yxx0 yxx0VarM14932D = C2408r0.m14932D();
        yxx0VarM14932D.m216492s(m4854L());
        yxx0VarM14932D.m216491r(this.f3921f.getPackageName());
        yxx0VarM14932D.m216490q(lValueOf.longValue());
        this.f3922g = new C0882i0(this.f3921f, (C2408r0) yxx0VarM14932D.m135959k());
        C2403p.m14920k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3920e = new C0892n0(this.f3921f, null, null, null, null, this.f3922g);
        this.f3911B = c0873e;
        this.f3921f.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final C0871d m4852J() {
        int[] iArr = {0, 3};
        synchronized (this.f3916a) {
            for (int i = 0; i < 2; i++) {
                if (this.f3917b == iArr[i]) {
                    return C0880h0.f4046m;
                }
            }
            return C0880h0.f4044k;
        }
    }

    /* JADX INFO: renamed from: K */
    private final String m4853K(C0877g c0877g) {
        if (TextUtils.isEmpty(null)) {
            return this.f3921f.getPackageName();
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: L */
    private static String m4854L() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return bh3.f75553a;
        }
    }

    /* JADX INFO: renamed from: M */
    private final synchronized ExecutorService m4855M() {
        try {
            if (this.f3913D == null) {
                this.f3913D = Executors.newFixedThreadPool(C2403p.f10369a, new ThreadFactoryC0893o(this));
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
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m4857N(p149l.sz5 r10, p149l.tz5 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "Error consuming purchase with token. Response code: "
            java.lang.String r1 = "Consuming purchase with token: "
            java.lang.String r4 = r10.m186744a()
            java.lang.String r10 = "BillingClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            r2.<init>(r1)     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            r2.append(r4)     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            com.google.android.gms.internal.play_billing.C2403p.m14919j(r10, r1)     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            java.lang.Object r10 = r9.f3916a     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            monitor-enter(r10)     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            l.djr0 r1 = r9.f3923h     // Catch: java.lang.Throwable -> La2
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L40
            com.android.billingclient.api.d r5 = com.android.billingclient.api.C0880h0.f4046m     // Catch: java.lang.Exception -> L38 android.os.DeadObjectException -> L3c
            java.lang.String r7 = "Service has been reset to null."
            r8 = 0
            r6 = 119(0x77, float:1.67E-43)
            r2 = r9
            r3 = r11
            r2.m4871b0(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            return
        L2e:
            r0 = move-exception
        L2f:
            r9 = r0
            r8 = r9
            goto Laa
        L33:
            r0 = move-exception
        L34:
            r9 = r0
            r8 = r9
            goto Lb4
        L38:
            r0 = move-exception
            r2 = r9
            r3 = r11
            goto L2f
        L3c:
            r0 = move-exception
            r2 = r9
            r3 = r11
            goto L34
        L40:
            r2 = r9
            r3 = r11
            boolean r9 = r2.f3930o     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            android.content.Context r10 = r2.f3921f
            if (r9 == 0) goto L73
            java.lang.String r9 = r10.getPackageName()     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            boolean r10 = r2.f3930o     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.String r11 = r2.f3918c     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.Long r5 = r2.f3915F     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            long r5 = r5.longValue()     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r7.<init>()     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            if (r10 == 0) goto L60
            com.google.android.gms.internal.play_billing.C2403p.m14912c(r7, r11, r5)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
        L60:
            r10 = 9
            android.os.Bundle r9 = r1.mo112103K2(r10, r9, r4, r7)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.String r10 = "RESPONSE_CODE"
            int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.String r11 = "BillingClient"
            java.lang.String r9 = com.google.android.gms.internal.play_billing.C2403p.m14916g(r9, r11)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            goto L7e
        L73:
            java.lang.String r9 = r10.getPackageName()     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r10 = 3
            int r10 = r1.mo112099D4(r10, r9, r4)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.String r9 = ""
        L7e:
            com.android.billingclient.api.d r5 = com.android.billingclient.api.C0880h0.m5047a(r10, r9)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            if (r10 != 0) goto L8f
            java.lang.String r9 = "BillingClient"
            java.lang.String r10 = "Successfully consumed purchase."
            com.google.android.gms.internal.play_billing.C2403p.m14919j(r9, r10)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r3.mo5071f(r5, r4)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            return
        L8f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r9.append(r10)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            r8 = 0
            r6 = 23
            r2.m4871b0(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
            return
        La2:
            r0 = move-exception
            r2 = r9
            r3 = r11
        La5:
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La8
            throw r9     // Catch: java.lang.Exception -> L2e android.os.DeadObjectException -> L33
        La8:
            r0 = move-exception
            goto La5
        Laa:
            java.lang.String r7 = "Error consuming purchase!"
            com.android.billingclient.api.d r5 = com.android.billingclient.api.C0880h0.f4044k
            r6 = 29
            r2.m4871b0(r3, r4, r5, r6, r7, r8)
            return
        Lb4:
            java.lang.String r7 = "Error consuming purchase!"
            com.android.billingclient.api.d r5 = com.android.billingclient.api.C0880h0.f4046m
            r6 = 29
            r2.m4871b0(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C0867b.m4857N(l.sz5, l.tz5):void");
    }

    /* JADX INFO: renamed from: O */
    private final void m4858O(C2398m0 c2398m0) {
        try {
            this.f3922g.mo5045f(c2398m0, this.f3927l);
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m4859P(C2400n0 c2400n0) {
        try {
            this.f3922g.mo5044e(c2400n0, this.f3927l);
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m4860Q(String str, final qcb0 qcb0Var) {
        if (!mo4827e()) {
            C0871d c0871d = C0880h0.f4046m;
            m4891s0(2, 9, c0871d);
            qcb0Var.mo5067b(c0871d, zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                C2403p.m14920k("BillingClient", "Please provide a valid product type.");
                C0871d c0871d2 = C0880h0.f4041h;
                m4891s0(50, 9, c0871d2);
                qcb0Var.mo5067b(c0871d2, zzco.zzl());
                return;
            }
            if (m4880n(new CallableC0895p(this, str, qcb0Var), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4025a.m4915h0(qcb0Var);
                }
            }, m4883o0(), m4855M()) == null) {
                C0871d c0871dM4852J = m4852J();
                m4891s0(25, 9, c0871dM4852J);
                qcb0Var.mo5067b(c0871dM4852J, zzco.zzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m4861R(int i) {
        synchronized (this.f3916a) {
            try {
                if (this.f3917b == 3) {
                    return;
                }
                C2403p.m14919j("BillingClient", "Setting clientState from " + m4865V(this.f3917b) + " to " + m4865V(i));
                this.f3917b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    private final synchronized void m4862S() {
        ExecutorService executorService = this.f3913D;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f3913D = null;
            this.f3914E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final void m4863T() {
        synchronized (this.f3916a) {
            if (this.f3924i != null) {
                try {
                    this.f3921f.unbindService(this.f3924i);
                    this.f3923h = null;
                    this.f3924i = null;
                } catch (Throwable th) {
                    try {
                        C2403p.m14921l("BillingClient", "There was an exception while unbinding service!", th);
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
    private final boolean m4864U() {
        return this.f3938w && this.f3911B.m4972b();
    }

    /* JADX INFO: renamed from: V */
    private static final String m4865V(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i != 1) {
            return i != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    /* JADX INFO: renamed from: W */
    private final C0903u m4866W(C0871d c0871d, int i, String str, @Nullable Exception exc) {
        C2403p.m14921l("BillingClient", str, exc);
        m4893t0(i, 7, c0871d, C0876f0.m5022a(exc));
        return new C0903u(c0871d.m4966b(), c0871d.m4965a(), new ArrayList());
    }

    /* JADX INFO: renamed from: X */
    private final qot0 m4867X(int i, C0871d c0871d, int i2, String str, @Nullable Exception exc) {
        m4893t0(i2, 9, c0871d, C0876f0.m5022a(exc));
        C2403p.m14921l("BillingClient", str, exc);
        return new qot0(c0871d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final qot0 m4868Y(String str, int i) {
        djr0 djr0Var;
        C0867b c0867b = this;
        C2403p.m14919j("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleM14913d = C2403p.m14913d(c0867b.f3930o, c0867b.f3938w, c0867b.f3911B.m4971a(), c0867b.f3911B.m4972b(), c0867b.f3918c, c0867b.f3915F.longValue());
        String string = null;
        do {
            try {
                synchronized (c0867b.f3916a) {
                    djr0Var = c0867b.f3923h;
                }
                if (djr0Var == null) {
                    return c0867b.m4867X(9, C0880h0.f4046m, 119, "Service has been reset to null", null);
                }
                Bundle bundleMo112105a2 = c0867b.f3930o ? djr0Var.mo112105a2(true != c0867b.f3938w ? 9 : 19, c0867b.f3921f.getPackageName(), str, string, bundleM14913d) : djr0Var.mo112106e1(3, c0867b.f3921f.getPackageName(), str, string);
                C0888l0 c0888l0M5051a = C0890m0.m5051a(bundleMo112105a2, "BillingClient", "getPurchase()");
                C0871d c0871dM5049a = c0888l0M5051a.m5049a();
                if (c0871dM5049a != C0880h0.f4045l) {
                    return c0867b.m4867X(9, c0871dM5049a, c0888l0M5051a.m5050b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = bundleMo112105a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleMo112105a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleMo112105a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    C2403p.m14919j("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.m4812e())) {
                            C2403p.m14920k("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        return m4867X(9, C0880h0.f4044k, 51, "Got an exception trying to decode the purchase!", e);
                    }
                }
                c0867b = this;
                if (z) {
                    c0867b.m4891s0(26, 9, C0880h0.f4044k);
                }
                string = bundleMo112105a2.getString("INAPP_CONTINUATION_TOKEN");
                C2403p.m14919j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e2) {
                return m4867X(9, C0880h0.f4046m, 52, "Got exception trying to get purchases try to reconnect", e2);
            } catch (Exception e3) {
                return c0867b.m4867X(9, C0880h0.f4044k, 52, "Got exception trying to get purchases try to reconnect", e3);
            }
        } while (!TextUtils.isEmpty(string));
        return new qot0(C0880h0.f4045l, arrayList);
    }

    /* JADX INFO: renamed from: Z */
    private final void m4869Z(C0871d c0871d, int i, int i2) {
        C2400n0 c2400n0 = null;
        C2398m0 c2398m0 = null;
        if (c0871d.m4966b() == 0) {
            int i3 = C0876f0.f4017a;
            try {
                zux0 zux0VarM14875C = C2400n0.m14875C();
                zux0VarM14875C.m220274r(5);
                zyx0 zyx0VarM14940A = C2412t0.m14940A();
                zyx0VarM14940A.m220982o(i2);
                zux0VarM14875C.m220272o((C2412t0) zyx0VarM14940A.m135959k());
                c2400n0 = (C2400n0) zux0VarM14875C.m135959k();
            } catch (Exception e) {
                C2403p.m14921l("BillingLogger", "Unable to create logging payload", e);
            }
            m4859P(c2400n0);
            return;
        }
        int i4 = C0876f0.f4017a;
        try {
            ntx0 ntx0VarM14870D = C2398m0.m14870D();
            lvx0 lvx0VarM14907D = C2402o0.m14907D();
            lvx0VarM14907D.m151924r(c0871d.m4966b());
            lvx0VarM14907D.m151923q(c0871d.m4965a());
            lvx0VarM14907D.m151925s(i);
            ntx0VarM14870D.m161418o(lvx0VarM14907D);
            ntx0VarM14870D.m161420r(5);
            zyx0 zyx0VarM14940A2 = C2412t0.m14940A();
            zyx0VarM14940A2.m220982o(i2);
            ntx0VarM14870D.m161419q((C2412t0) zyx0VarM14940A2.m135959k());
            c2398m0 = (C2398m0) ntx0VarM14870D.m135959k();
        } catch (Exception e2) {
            C2403p.m14921l("BillingLogger", "Unable to create logging payload", e2);
        }
        m4858O(c2398m0);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m4870a0(j10 j10Var, C0871d c0871d, int i, @Nullable Exception exc) {
        C2403p.m14921l("BillingClient", "Error in acknowledge purchase!", exc);
        m4893t0(i, 3, c0871d, C0876f0.m5022a(exc));
        j10Var.mo5070e(c0871d);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m4871b0(tz5 tz5Var, String str, C0871d c0871d, int i, String str2, @Nullable Exception exc) {
        C2403p.m14921l("BillingClient", str2, exc);
        m4893t0(i, 4, c0871d, C0876f0.m5022a(exc));
        tz5Var.mo5071f(c0871d, str);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* bridge */ /* synthetic */ boolean m4874j0(C0867b c0867b) {
        boolean z;
        synchronized (c0867b.f3916a) {
            z = true;
            if (c0867b.f3917b != 1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    private void m4876l(Context context, rcb0 rcb0Var, C0873e c0873e, @Nullable v0s0 v0s0Var, String str, @Nullable InterfaceC0878g0 interfaceC0878g0) {
        this.f3921f = context.getApplicationContext();
        yxx0 yxx0VarM14932D = C2408r0.m14932D();
        yxx0VarM14932D.m216492s(str);
        yxx0VarM14932D.m216491r(this.f3921f.getPackageName());
        yxx0VarM14932D.m216490q(this.f3915F.longValue());
        if (interfaceC0878g0 != null) {
            this.f3922g = interfaceC0878g0;
        } else {
            this.f3922g = new C0882i0(this.f3921f, (C2408r0) yxx0VarM14932D.m135959k());
        }
        if (rcb0Var == null) {
            C2403p.m14920k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3920e = new C0892n0(this.f3921f, rcb0Var, null, v0s0Var, null, this.f3922g);
        this.f3911B = c0873e;
        this.f3912C = v0s0Var != null;
        this.f3921f.getPackageName();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static Future m4880n(Callable callable, long j, @Nullable final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: l.x8r0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    C2403p.m14920k("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            C2403p.m14921l("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final Handler m4883o0() {
        return Looper.myLooper() == null ? this.f3919d : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: p0 */
    private final C0871d m4885p0() {
        C2403p.m14919j("BillingClient", "Service connection is valid. No need to re-initialize.");
        zux0 zux0VarM14875C = C2400n0.m14875C();
        zux0VarM14875C.m220274r(6);
        n3y0 n3y0VarM14744A = C2373a1.m14744A();
        n3y0VarM14744A.m157791o(true);
        zux0VarM14875C.m220273q(n3y0VarM14744A);
        m4859P((C2400n0) zux0VarM14875C.m135959k());
        return C0880h0.f4045l;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m4889r0(int i, int i2, @Nullable Exception exc) {
        C2398m0 c2398m0;
        C2403p.m14921l("BillingClient", "showInAppMessages error.", exc);
        InterfaceC0878g0 interfaceC0878g0 = this.f3922g;
        String strM5022a = C0876f0.m5022a(exc);
        try {
            lvx0 lvx0VarM14907D = C2402o0.m14907D();
            lvx0VarM14907D.m151924r(i);
            lvx0VarM14907D.m151925s(i2);
            if (strM5022a != null) {
                lvx0VarM14907D.m151922o(strM5022a);
            }
            ntx0 ntx0VarM14870D = C2398m0.m14870D();
            ntx0VarM14870D.m161418o(lvx0VarM14907D);
            ntx0VarM14870D.m161420r(30);
            c2398m0 = (C2398m0) ntx0VarM14870D.m135959k();
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to create logging payload", th);
            c2398m0 = null;
        }
        interfaceC0878g0.mo5043d(c2398m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m4891s0(int i, int i2, C0871d c0871d) {
        try {
            m4858O(C0876f0.m5023b(i, i2, c0871d));
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m4893t0(int i, int i2, C0871d c0871d, @Nullable String str) {
        try {
            m4858O(C0876f0.m5024c(i, i2, c0871d, str));
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m4895u0(int i) {
        try {
            m4859P(C0876f0.m5025d(i));
        } catch (Throwable th) {
            C2403p.m14921l("BillingClient", "Unable to log.", th);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A0 */
    public final C0903u m4904A0(C0877g c0877g) {
        djr0 djr0Var;
        ArrayList arrayList = new ArrayList();
        String strM5028c = c0877g.m5028c();
        zzco zzcoVarM5027b = c0877g.m5027b();
        int size = zzcoVarM5027b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(zzcoVarM5027b.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((C0877g.b) arrayList2.get(i3)).m5033b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f3918c);
            try {
                synchronized (this.f3916a) {
                    djr0Var = this.f3923h;
                }
                if (djr0Var == null) {
                    return m4866W(C0880h0.f4046m, 119, "Service has been reset to null.", null);
                }
                boolean z = true;
                int i4 = true != this.f3939x ? 17 : 20;
                String packageName = this.f3921f.getPackageName();
                boolean zM4864U = m4864U();
                String str = this.f3918c;
                m4853K(c0877g);
                m4853K(c0877g);
                m4853K(c0877g);
                m4853K(c0877g);
                long jLongValue = this.f3915F.longValue();
                Bundle bundle2 = new Bundle();
                C2403p.m14912c(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zM4864U) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (i5 < size3) {
                    C0877g.b bVar = (C0877g.b) arrayList2.get(i5);
                    boolean z4 = z;
                    arrayList4.add(null);
                    z2 |= !TextUtils.isEmpty(null);
                    String strM5034c = bVar.m5034c();
                    djr0 djr0Var2 = djr0Var;
                    if (strM5034c.equals("first_party")) {
                        m5s0.m153144c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z3 = z4;
                    }
                    i5++;
                    djr0Var = djr0Var2;
                    z = z4;
                }
                djr0 djr0Var3 = djr0Var;
                if (z2) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z3 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleMo112100F2 = djr0Var3.mo112100F2(i4, packageName, strM5028c, bundle, bundle2);
                if (bundleMo112100F2 == null) {
                    return m4866W(C0880h0.f4029C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleMo112100F2.containsKey("DETAILS_LIST")) {
                    int iM14911b = C2403p.m14911b(bundleMo112100F2, "BillingClient");
                    String strM14916g = C2403p.m14916g(bundleMo112100F2, "BillingClient");
                    if (iM14911b == 0) {
                        return m4866W(C0880h0.m5047a(6, strM14916g), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return m4866W(C0880h0.m5047a(iM14911b, strM14916g), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iM14911b, null);
                }
                ArrayList<String> stringArrayList = bundleMo112100F2.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return m4866W(C0880h0.f4029C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                    try {
                        C0875f c0875f = new C0875f(stringArrayList.get(i6));
                        C2403p.m14919j("BillingClient", "Got product details: ".concat(c0875f.toString()));
                        arrayList.add(c0875f);
                    } catch (JSONException e) {
                        return m4866W(C0880h0.m5047a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                i = i2;
            } catch (DeadObjectException e2) {
                return m4866W(C0880h0.f4046m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
            } catch (Exception e3) {
                return m4866W(C0880h0.f4044k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            }
        }
        return new C0903u(0, "", arrayList);
    }

    /* JADX INFO: renamed from: C0 */
    public final InterfaceC0878g0 m4905C0() {
        return this.f3922g;
    }

    /* JADX INFO: renamed from: E0 */
    public final C0871d m4906E0(final C0871d c0871d) {
        if (Thread.interrupted()) {
            return c0871d;
        }
        this.f3919d.post(new Runnable() { // from class: com.android.billingclient.api.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4095a.m4912e0(c0871d);
            }
        });
        return c0871d;
    }

    /* JADX INFO: renamed from: G0 */
    public final synchronized liv0 m4907G0() {
        try {
            if (this.f3914E == null) {
                this.f3914E = xqv0.m210616a(m4855M());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3914E;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ Object m4908J0(j10 j10Var, i10 i10Var) throws Exception {
        djr0 djr0Var;
        try {
            synchronized (this.f3916a) {
                djr0Var = this.f3923h;
            }
            if (djr0Var == null) {
                m4870a0(j10Var, C0880h0.f4046m, 119, null);
                return null;
            }
            String packageName = this.f3921f.getPackageName();
            String strM133940a = i10Var.m133940a();
            String str = this.f3918c;
            long jLongValue = this.f3915F.longValue();
            Bundle bundle = new Bundle();
            C2403p.m14912c(bundle, str, jLongValue);
            Bundle bundleMo112109p4 = djr0Var.mo112109p4(9, packageName, strM133940a, bundle);
            j10Var.mo5070e(C0880h0.m5047a(C2403p.m14911b(bundleMo112109p4, "BillingClient"), C2403p.m14916g(bundleMo112109p4, "BillingClient")));
            return null;
        } catch (DeadObjectException e) {
            m4870a0(j10Var, C0880h0.f4046m, 28, e);
            return null;
        } catch (Exception e2) {
            m4870a0(j10Var, C0880h0.f4044k, 28, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ Object m4909K0(sz5 sz5Var, tz5 tz5Var) throws Exception {
        m4857N(sz5Var, tz5Var);
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ Object m4910L0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        djr0 djr0Var;
        try {
            synchronized (this.f3916a) {
                djr0Var = this.f3923h;
            }
            if (djr0Var == null) {
                m4889r0(-1, 119, null);
            } else {
                djr0Var.mo112104V5(12, this.f3921f.getPackageName(), bundle, new BinderC0902t(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            m4889r0(-1, 118, e);
        } catch (Exception e2) {
            m4889r0(6, 118, e2);
        }
        return null;
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: a */
    public void mo4823a(final i10 i10Var, final j10 j10Var) {
        if (!mo4827e()) {
            C0871d c0871d = C0880h0.f4046m;
            m4891s0(2, 3, c0871d);
            j10Var.mo5070e(c0871d);
            return;
        }
        if (TextUtils.isEmpty(i10Var.m133940a())) {
            C2403p.m14920k("BillingClient", "Please provide a valid purchase token.");
            C0871d c0871d2 = C0880h0.f4043j;
            m4891s0(26, 3, c0871d2);
            j10Var.mo5070e(c0871d2);
            return;
        }
        if (!this.f3930o) {
            C0871d c0871d3 = C0880h0.f4035b;
            m4891s0(27, 3, c0871d3);
            j10Var.mo5070e(c0871d3);
        } else if (m4880n(new Callable() { // from class: com.android.billingclient.api.q0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4104a.m4908J0(j10Var, i10Var);
                return null;
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4108a.m4911d0(j10Var);
            }
        }, m4883o0(), m4855M()) == null) {
            C0871d c0871dM4852J = m4852J();
            m4891s0(25, 3, c0871dM4852J);
            j10Var.mo5070e(c0871dM4852J);
        }
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: b */
    public void mo4824b(final sz5 sz5Var, final tz5 tz5Var) {
        if (!mo4827e()) {
            C0871d c0871d = C0880h0.f4046m;
            m4891s0(2, 4, c0871d);
            tz5Var.mo5071f(c0871d, sz5Var.m186744a());
        } else if (m4880n(new Callable() { // from class: com.android.billingclient.api.i
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4060a.m4909K0(sz5Var, tz5Var);
                return null;
            }
        }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f4065a.m4913f0(tz5Var, sz5Var);
            }
        }, m4883o0(), m4855M()) == null) {
            C0871d c0871dM4852J = m4852J();
            m4891s0(25, 4, c0871dM4852J);
            tz5Var.mo5071f(c0871dM4852J, sz5Var.m186744a());
        }
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: c */
    public void mo4825c() {
        m4895u0(12);
        synchronized (this.f3916a) {
            try {
                if (this.f3920e != null) {
                    this.f3920e.m5057f();
                    try {
                        C2403p.m14919j("BillingClient", "Unbinding from service.");
                        m4863T();
                    } catch (Throwable th) {
                        C2403p.m14921l("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                    }
                    try {
                        m4862S();
                    } catch (Throwable th2) {
                        try {
                            C2403p.m14921l("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                        } catch (Throwable th3) {
                            m4861R(3);
                            throw th3;
                        }
                    }
                    m4861R(3);
                } else {
                    C2403p.m14919j("BillingClient", "Unbinding from service.");
                    m4863T();
                    m4862S();
                    m4861R(3);
                }
            } catch (Throwable th4) {
                C2403p.m14921l("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: d */
    public final C0871d mo4826d(String str) {
        if (!mo4827e()) {
            C0871d c0871d = C0880h0.f4046m;
            if (c0871d.m4966b() != 0) {
                m4891s0(2, 5, c0871d);
                return c0871d;
            }
            m4895u0(5);
            return c0871d;
        }
        C0871d c0871d2 = C0880h0.f4034a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    C0871d c0871d3 = this.f3926k ? C0880h0.f4045l : C0880h0.f4049p;
                    m4869Z(c0871d3, 10, 3);
                    return c0871d3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    C0871d c0871d4 = this.f3934s ? C0880h0.f4045l : C0880h0.f4052s;
                    m4869Z(c0871d4, 31, 6);
                    return c0871d4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    C0871d c0871d5 = this.f3932q ? C0880h0.f4045l : C0880h0.f4056w;
                    m4869Z(c0871d5, 30, 5);
                    return c0871d5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    C0871d c0871d6 = this.f3935t ? C0880h0.f4045l : C0880h0.f4053t;
                    m4869Z(c0871d6, 19, 8);
                    return c0871d6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    C0871d c0871d7 = this.f3933r ? C0880h0.f4045l : C0880h0.f4054u;
                    m4869Z(c0871d7, 21, 7);
                    return c0871d7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    C0871d c0871d8 = this.f3935t ? C0880h0.f4045l : C0880h0.f4053t;
                    m4869Z(c0871d8, 61, 9);
                    return c0871d8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    C0871d c0871d9 = this.f3936u ? C0880h0.f4045l : C0880h0.f4055v;
                    m4869Z(c0871d9, 20, 10);
                    return c0871d9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    C0871d c0871d10 = this.f3937v ? C0880h0.f4045l : C0880h0.f4027A;
                    m4869Z(c0871d10, 32, 11);
                    return c0871d10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    C0871d c0871d11 = this.f3937v ? C0880h0.f4045l : C0880h0.f4028B;
                    m4869Z(c0871d11, 33, 12);
                    return c0871d11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    C0871d c0871d12 = this.f3939x ? C0880h0.f4045l : C0880h0.f4030D;
                    m4869Z(c0871d12, 60, 13);
                    return c0871d12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    C0871d c0871d13 = this.f3940y ? C0880h0.f4045l : C0880h0.f4031E;
                    m4869Z(c0871d13, 66, 14);
                    return c0871d13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    C0871d c0871d14 = this.f3941z ? C0880h0.f4045l : C0880h0.f4057x;
                    m4869Z(c0871d14, 103, 18);
                    return c0871d14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    C0871d c0871d15 = this.f3910A ? C0880h0.f4045l : C0880h0.f4058y;
                    m4869Z(c0871d15, 116, 19);
                    return c0871d15;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    C0871d c0871d16 = this.f3929n ? C0880h0.f4045l : C0880h0.f4051r;
                    m4869Z(c0871d16, 35, 4);
                    return c0871d16;
                }
                break;
            case 1987365622:
                if (str.equals(SchemeKey.subscriptions)) {
                    C0871d c0871d17 = this.f3925j ? C0880h0.f4045l : C0880h0.f4048o;
                    m4869Z(c0871d17, 9, 2);
                    return c0871d17;
                }
                break;
        }
        C2403p.m14920k("BillingClient", "Unsupported feature: ".concat(str));
        C0871d c0871d18 = C0880h0.f4059z;
        m4869Z(c0871d18, 34, 1);
        return c0871d18;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m4911d0(j10 j10Var) {
        C0871d c0871d = C0880h0.f4047n;
        m4891s0(24, 3, c0871d);
        j10Var.mo5070e(c0871d);
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: e */
    public final boolean mo4827e() {
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
    public final /* synthetic */ void m4912e0(C0871d c0871d) {
        rcb0 rcb0VarM5056d = this.f3920e.m5056d();
        C0892n0 c0892n0 = this.f3920e;
        if (rcb0VarM5056d != null) {
            c0892n0.m5056d().mo5069d(c0871d, null);
        } else {
            C2403p.m14920k("BillingClient", "No valid listener is set in BroadcastManager");
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
    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: f */
    public C0871d mo4828f(Activity activity, final C0869c c0869c) {
        String strM5000c;
        String strM5001d;
        String str;
        String str2;
        String str3;
        Future futureM4880n;
        int iM200221a;
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
        final C0867b c0867b = this;
        String str9 = "proxyPackageVersion";
        if (c0867b.f3920e == null || c0867b.f3920e.m5056d() == null) {
            C0871d c0871d = C0880h0.f4032F;
            c0867b.m4891s0(12, 2, c0871d);
            return c0871d;
        }
        if (!c0867b.mo4827e()) {
            C0871d c0871d2 = C0880h0.f4046m;
            c0867b.m4891s0(2, 2, c0871d2);
            c0867b.m4906E0(c0871d2);
            return c0871d2;
        }
        ArrayList<SkuDetails> arrayListM4932h = c0869c.m4932h();
        List listM4933i = c0869c.m4933i();
        SkuDetails skuDetails = (SkuDetails) brt0.m103599a(arrayListM4932h, null);
        C0869c.b bVar = (C0869c.b) brt0.m103599a(listM4933i, null);
        if (skuDetails != null) {
            strM5000c = skuDetails.m4814a();
            strM5001d = skuDetails.m4815b();
        } else {
            strM5000c = bVar.m4941b().m5000c();
            strM5001d = bVar.m4941b().m5001d();
        }
        String str10 = "BillingClient";
        if (strM5001d.equals(SubSampleInformationBox.TYPE) && !c0867b.f3925j) {
            C2403p.m14920k("BillingClient", "Current client doesn't support subscriptions.");
            C0871d c0871d3 = C0880h0.f4048o;
            c0867b.m4891s0(9, 2, c0871d3);
            c0867b.m4906E0(c0871d3);
            return c0871d3;
        }
        if (c0869c.m4935r() && !c0867b.f3928m) {
            C2403p.m14920k("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0871d c0871d4 = C0880h0.f4042i;
            c0867b.m4891s0(18, 2, c0871d4);
            c0867b.m4906E0(c0871d4);
            return c0871d4;
        }
        if (arrayListM4932h.size() > 1 && !c0867b.f3935t) {
            C2403p.m14920k("BillingClient", "Current client doesn't support multi-item purchases.");
            C0871d c0871d5 = C0880h0.f4053t;
            c0867b.m4891s0(19, 2, c0871d5);
            c0867b.m4906E0(c0871d5);
            return c0871d5;
        }
        if (!listM4933i.isEmpty() && !c0867b.f3936u) {
            C2403p.m14920k("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C0871d c0871d6 = C0880h0.f4055v;
            c0867b.m4891s0(20, 2, c0871d6);
            c0867b.m4906E0(c0871d6);
            return c0871d6;
        }
        C0871d c0871dM4927c = c0869c.m4927c();
        if (c0871dM4927c != C0880h0.f4045l) {
            c0867b.m4891s0(120, 2, c0871dM4927c);
            c0867b.m4906E0(c0871dM4927c);
            return c0871dM4927c;
        }
        if (c0867b.f3928m) {
            boolean z3 = c0867b.f3930o;
            boolean z4 = c0867b.f3938w;
            boolean zM4971a = c0867b.f3911B.m4971a();
            boolean zM4972b = c0867b.f3911B.m4972b();
            boolean z5 = c0867b.f3912C;
            String str11 = c0867b.f3918c;
            final String str12 = strM5000c;
            long jLongValue = c0867b.f3915F.longValue();
            final String packageName = c0867b.f3921f.getPackageName();
            final Bundle bundle = new Bundle();
            C2403p.m14912c(bundle, str11, jLongValue);
            if (c0869c.m4926b() != 0) {
                bundle.putInt("prorationMode", c0869c.m4926b());
            }
            if (!TextUtils.isEmpty(c0869c.m4928d())) {
                bundle.putString("accountId", c0869c.m4928d());
            }
            if (!TextUtils.isEmpty(c0869c.m4929e())) {
                bundle.putString("obfuscatedProfileId", c0869c.m4929e());
            }
            if (c0869c.m4934q()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c0869c.m4930f())) {
                bundle.putString("oldSkuPurchaseToken", c0869c.m4930f());
            }
            if (TextUtils.isEmpty(null)) {
                str4 = null;
            } else {
                str4 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c0869c.m4931g())) {
                bundle.putString("originalExternalTransactionId", c0869c.m4931g());
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("paymentsPurchaseParams", str4);
            }
            if (z3 && zM4971a) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && zM4972b) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (c0869c.m4933i().stream().anyMatch(new Predicate() { // from class: l.m0r0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i4 = C2403p.f10369a;
                    return false;
                }
            })) {
                u3w0 u3w0VarM14950y = C2417w.m14950y();
                u3w0VarM14950y.m191644o((Iterable) c0869c.m4933i().stream().filter(new Predicate() { // from class: l.c0s0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i4 = C2403p.f10369a;
                        return false;
                    }
                }).map(new Function() { // from class: l.uws0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i4 = C2403p.f10369a;
                        String strM5000c2 = ((C0869c.b) obj).m4941b().m5000c();
                        m1w0 m1w0VarM14946y = C2415v.m14946y();
                        t6w0 t6w0VarM14961y = C2419x.m14961y();
                        t6w0VarM14961y.m187392o("subs:" + packageName + ":" + strM5000c2);
                        m1w0VarM14946y.m152624o(t6w0VarM14961y);
                        C2419x.m14961y();
                        throw null;
                    }
                }).collect(zzco.zzo()));
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((C2417w) u3w0VarM14950y.m135959k()).m14965d());
            }
            if (arrayListM4932h.isEmpty()) {
                str5 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str6 = strM5001d;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listM4933i.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listM4933i.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i4 = 0; i4 < listM4933i.size(); i4++) {
                    C0869c.b bVar2 = (C0869c.b) listM4933i.get(i4);
                    C0875f c0875fM4941b = bVar2.m4941b();
                    if (!c0875fM4941b.m5005h().isEmpty()) {
                        arrayList3.add(c0875fM4941b.m5005h());
                    }
                    arrayList4.add(bVar2.m4942c());
                    String strM5006i = c0875fM4941b.m5006i();
                    if (c0875fM4941b.m5007j() != null && !c0875fM4941b.m5007j().isEmpty()) {
                        for (C0875f.b bVar3 : c0875fM4941b.m5007j()) {
                            if (!TextUtils.isEmpty(bVar3.m5013f())) {
                                strM5006i = bVar3.m5013f();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strM5006i)) {
                        arrayList5.add(strM5006i);
                    }
                    if (i4 > 0) {
                        arrayList.add(((C0869c.b) listM4933i.get(i4)).m4941b().m5000c());
                        arrayList2.add(((C0869c.b) listM4933i.get(i4)).m4941b().m5001d());
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
                str6 = strM5001d;
                ArrayList<String> arrayList9 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails2 : arrayListM4932h) {
                    if (!skuDetails2.m4821h().isEmpty()) {
                        arrayList7.add(skuDetails2.m4821h());
                    }
                    String strM4818e = skuDetails2.m4818e();
                    String str13 = str10;
                    String strM4817d = skuDetails2.m4817d();
                    int iM4816c = skuDetails2.m4816c();
                    String strM4820g = skuDetails2.m4820g();
                    arrayList8.add(strM4818e);
                    z6 |= !TextUtils.isEmpty(strM4818e);
                    arrayList9.add(strM4817d);
                    z7 |= !TextUtils.isEmpty(strM4817d);
                    arrayList10.add(Integer.valueOf(iM4816c));
                    z8 |= iM4816c != 0;
                    z9 |= !TextUtils.isEmpty(strM4820g);
                    arrayList11.add(strM4820g);
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
                if (arrayListM4932h.size() > 1) {
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListM4932h.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayListM4932h.size() - 1);
                    for (int i5 = 1; i5 < arrayListM4932h.size(); i5++) {
                        arrayList12.add(((SkuDetails) arrayListM4932h.get(i5)).m4814a());
                        arrayList13.add(((SkuDetails) arrayListM4932h.get(i5)).m4815b());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList12);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            c0867b = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c0867b.f3933r) {
                C0871d c0871d7 = C0880h0.f4054u;
                c0867b.m4891s0(21, 2, c0871d7);
                c0867b.m4906E0(c0871d7);
                return c0871d7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.m4819f())) {
                if (bVar == null || TextUtils.isEmpty(bVar.m4941b().m5004g())) {
                    z2 = false;
                } else {
                    bundle.putString("skuPackageName", bVar.m4941b().m5004g());
                }
                str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str3 = str7;
                    C2403p.m14920k(str3, "Activity's intent is null.");
                } else {
                    str3 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str8 = str5;
                            try {
                                bundle.putString(str8, c0867b.f3921f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str8, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str8 = str5;
                        }
                    }
                }
                if (!c0867b.f3936u && !listM4933i.isEmpty()) {
                    i2 = 17;
                } else if (c0867b.f3934s || !z2) {
                    if (c0867b.f3930o) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                    }
                    final String str14 = str6;
                    futureM4880n = m4880n(new Callable() { // from class: com.android.billingclient.api.n
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f4081a.m4916w0(i3, str12, str14, c0869c, bundle);
                        }
                    }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0867b.f3919d, c0867b.m4855M());
                } else {
                    i2 = 15;
                }
                i3 = i2;
                final String str15 = str6;
                futureM4880n = m4880n(new Callable() { // from class: com.android.billingclient.api.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f4081a.m4916w0(i3, str12, str15, c0869c, bundle);
                    }
                }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0867b.f3919d, c0867b.m4855M());
            } else {
                bundle.putString("skuPackageName", skuDetails.m4819f());
            }
            z2 = true;
            str2 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str3 = str7;
                C2403p.m14920k(str3, "Activity's intent is null.");
            } else {
                str3 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str8 = str5;
                    bundle.putString(str8, c0867b.f3921f.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!c0867b.f3936u) {
                if (c0867b.f3934s) {
                    if (c0867b.f3930o) {
                        i3 = 9;
                    } else {
                        i2 = 6;
                        i3 = i2;
                    }
                } else if (c0867b.f3930o) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (c0867b.f3934s) {
                if (c0867b.f3930o) {
                    i3 = 9;
                } else {
                    i2 = 6;
                    i3 = i2;
                }
            } else if (c0867b.f3930o) {
                i3 = 9;
            } else {
                i2 = 6;
                i3 = i2;
            }
            final String str16 = str6;
            futureM4880n = m4880n(new Callable() { // from class: com.android.billingclient.api.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4081a.m4916w0(i3, str12, str16, c0869c, bundle);
                }
            }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0867b.f3919d, c0867b.m4855M());
        } else {
            final String str17 = strM5000c;
            str = "BUY_INTENT";
            str2 = null;
            final String str18 = strM5001d;
            str3 = "BillingClient";
            futureM4880n = m4880n(new Callable() { // from class: com.android.billingclient.api.p0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4100a.m4917x0(str17, str18);
                }
            }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, c0867b.f3919d, c0867b.m4855M());
        }
        try {
            if (futureM4880n == null) {
                C0871d c0871d8 = C0880h0.f4037d;
                c0867b.m4891s0(25, 2, c0871d8);
                c0867b.m4906E0(c0871d8);
                return c0871d8;
            }
            Bundle bundle2 = (Bundle) futureM4880n.get(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
            int iM14911b = C2403p.m14911b(bundle2, str3);
            String strM14916g = C2403p.m14916g(bundle2, str3);
            if (iM14911b == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str19 = str;
                intent2.putExtra(str19, (PendingIntent) bundle2.getParcelable(str19));
                activity.startActivity(intent2);
                return C0880h0.f4045l;
            }
            C2403p.m14920k(str3, "Unable to buy item, Error response code: " + iM14911b);
            C0871d c0871dM5047a = C0880h0.m5047a(iM14911b, strM14916g);
            if (bundle2 == null) {
                i = 1;
                iM200221a = 1;
            } else {
                try {
                    Object obj = bundle2.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            iM200221a = vvx0.m200221a(((Integer) obj).intValue());
                            i = 1;
                        } else {
                            C2403p.m14920k(str3, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (Throwable th) {
                    C2403p.m14920k(str3, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                i = 1;
                iM200221a = 1;
            }
            if (iM200221a == i) {
                iM200221a = 23;
            }
            if (bundle2 == null) {
                string = str2;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    C2403p.m14920k(str3, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                    string = str2;
                }
            }
            c0867b.m4893t0(iM200221a, 2, c0871dM5047a, string);
            c0867b.m4906E0(c0871dM5047a);
            return c0871dM5047a;
        } catch (CancellationException e) {
            e = e;
            C2403p.m14921l(str3, "Time out while launching billing flow. Try to reconnect", e);
            C0871d c0871d9 = C0880h0.f4047n;
            c0867b.m4893t0(4, 2, c0871d9, C0876f0.m5022a(e));
            c0867b.m4906E0(c0871d9);
            return c0871d9;
        } catch (TimeoutException e2) {
            e = e2;
            C2403p.m14921l(str3, "Time out while launching billing flow. Try to reconnect", e);
            C0871d c0871d10 = C0880h0.f4047n;
            c0867b.m4893t0(4, 2, c0871d10, C0876f0.m5022a(e));
            c0867b.m4906E0(c0871d10);
            return c0871d10;
        } catch (Exception e3) {
            C2403p.m14921l(str3, "Exception while launching billing flow. Try to reconnect", e3);
            C0871d c0871d11 = C0880h0.f4046m;
            c0867b.m4893t0(5, 2, c0871d11, C0876f0.m5022a(e3));
            c0867b.m4906E0(c0871d11);
            return c0871d11;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4913f0(tz5 tz5Var, sz5 sz5Var) {
        C0871d c0871d = C0880h0.f4047n;
        m4891s0(24, 4, c0871d);
        tz5Var.mo5071f(c0871d, sz5Var.m186744a());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4914g0(wd90 wd90Var) {
        C0871d c0871d = C0880h0.f4047n;
        m4891s0(24, 7, c0871d);
        wd90Var.mo136040a(c0871d, new ArrayList());
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: h */
    public void mo4829h(final C0877g c0877g, final wd90 wd90Var) {
        if (!mo4827e()) {
            C0871d c0871d = C0880h0.f4046m;
            m4891s0(2, 7, c0871d);
            wd90Var.mo136040a(c0871d, new ArrayList());
        } else {
            if (!this.f3936u) {
                C2403p.m14920k("BillingClient", "Querying product details is not supported.");
                C0871d c0871d2 = C0880h0.f4055v;
                m4891s0(20, 7, c0871d2);
                wd90Var.mo136040a(c0871d2, new ArrayList());
                return;
            }
            if (m4880n(new Callable() { // from class: com.android.billingclient.api.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C0903u c0903uM4904A0 = this.f4070a.m4904A0(c0877g);
                    wd90Var.mo136040a(C0880h0.m5047a(c0903uM4904A0.m5062a(), c0903uM4904A0.m5063b()), c0903uM4904A0.m5064c());
                    return null;
                }
            }, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, new Runnable() { // from class: com.android.billingclient.api.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4073a.m4914g0(wd90Var);
                }
            }, m4883o0(), m4855M()) == null) {
                C0871d c0871dM4852J = m4852J();
                m4891s0(25, 7, c0871dM4852J);
                wd90Var.mo136040a(c0871dM4852J, new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4915h0(qcb0 qcb0Var) {
        C0871d c0871d = C0880h0.f4047n;
        m4891s0(24, 9, c0871d);
        qcb0Var.mo5067b(c0871d, zzco.zzl());
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: i */
    public final void mo4830i(vnb0 vnb0Var, qcb0 qcb0Var) {
        m4860Q(vnb0Var.m199000b(), qcb0Var);
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: j */
    public final C0871d mo4831j(final Activity activity, bpm bpmVar, cpm cpmVar) {
        if (!mo4827e()) {
            C2403p.m14920k("BillingClient", "Service disconnected.");
            return C0880h0.f4046m;
        }
        if (!this.f3932q) {
            C2403p.m14920k("BillingClient", "Current client doesn't support showing in-app messages.");
            return C0880h0.f4056w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        ii3.m136330b(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f3918c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", bpmVar.m103081b());
        final zzav zzavVar = new zzav(this, this.f3919d, cpmVar);
        m4880n(new Callable() { // from class: com.android.billingclient.api.m
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f4077a.m4910L0(bundle, activity, zzavVar);
                return null;
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, null, this.f3919d, m4855M());
        return C0880h0.f4045l;
    }

    @Override // com.android.billingclient.api.AbstractC0865a
    /* JADX INFO: renamed from: k */
    public void mo4832k(lx2 lx2Var) {
        C0871d c0871dM4885p0;
        C0871d c0871d;
        synchronized (this.f3916a) {
            try {
                if (mo4827e()) {
                    c0871dM4885p0 = m4885p0();
                } else {
                    if (this.f3917b == 1) {
                        C2403p.m14920k("BillingClient", "Client is already in the process of connecting to billing service.");
                        c0871d = C0880h0.f4038e;
                        m4891s0(37, 6, c0871d);
                    } else if (this.f3917b == 3) {
                        C2403p.m14920k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        c0871d = C0880h0.f4046m;
                        m4891s0(38, 6, c0871d);
                    } else {
                        m4861R(1);
                        m4863T();
                        C2403p.m14919j("BillingClient", "Starting in-app billing setup.");
                        this.f3924i = new ServiceConnectionC0901s(this, lx2Var, null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f3921f.getPackageManager().queryIntentServices(intent, 0);
                        int i = 41;
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            m4861R(0);
                            C2403p.m14919j("BillingClient", "Billing service unavailable on device.");
                            C0871d c0871d2 = C0880h0.f4036c;
                            m4891s0(i, 6, c0871d2);
                            c0871dM4885p0 = c0871d2;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    C2403p.m14920k("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f3918c);
                                    synchronized (this.f3916a) {
                                        try {
                                            if (this.f3917b == 2) {
                                                c0871dM4885p0 = m4885p0();
                                            } else if (this.f3917b != 1) {
                                                C2403p.m14920k("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                c0871d = C0880h0.f4046m;
                                                m4891s0(117, 6, c0871d);
                                            } else {
                                                ServiceConnectionC0901s serviceConnectionC0901s = this.f3924i;
                                                if (this.f3921f.bindService(intent2, serviceConnectionC0901s, 1)) {
                                                    C2403p.m14919j("BillingClient", "Service was bonded successfully.");
                                                    c0871dM4885p0 = null;
                                                } else {
                                                    C2403p.m14920k("BillingClient", "Connection to Billing service is blocked.");
                                                    i = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                C2403p.m14920k("BillingClient", "The device doesn't have valid Play Store.");
                            }
                            m4861R(0);
                            C2403p.m14919j("BillingClient", "Billing service unavailable on device.");
                            C0871d c0871d3 = C0880h0.f4036c;
                            m4891s0(i, 6, c0871d3);
                            c0871dM4885p0 = c0871d3;
                        }
                    }
                    c0871dM4885p0 = c0871d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0871dM4885p0 != null) {
            lx2Var.mo5066a(c0871dM4885p0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ Bundle m4916w0(int i, String str, String str2, C0869c c0869c, Bundle bundle) throws Exception {
        djr0 djr0Var;
        try {
            synchronized (this.f3916a) {
                djr0Var = this.f3923h;
            }
            return djr0Var == null ? C2403p.m14922m(C0880h0.f4046m, 119) : djr0Var.mo112102G5(i, this.f3921f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e) {
            return C2403p.m14923n(C0880h0.f4046m, 5, C0876f0.m5022a(e));
        } catch (Exception e2) {
            return C2403p.m14923n(C0880h0.f4044k, 5, C0876f0.m5022a(e2));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Bundle m4917x0(String str, String str2) throws Exception {
        djr0 djr0Var;
        try {
            synchronized (this.f3916a) {
                djr0Var = this.f3923h;
            }
            return djr0Var == null ? C2403p.m14922m(C0880h0.f4046m, 119) : djr0Var.mo112108n3(3, this.f3921f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            return C2403p.m14923n(C0880h0.f4046m, 5, C0876f0.m5022a(e));
        } catch (Exception e2) {
            return C2403p.m14923n(C0880h0.f4044k, 5, C0876f0.m5022a(e2));
        }
    }

    @AnyThread
    public C0867b(@Nullable String str, Context context, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f3915F = lValueOf;
        String strM4854L = m4854L();
        this.f3918c = strM4854L;
        this.f3921f = context.getApplicationContext();
        yxx0 yxx0VarM14932D = C2408r0.m14932D();
        yxx0VarM14932D.m216492s(strM4854L);
        yxx0VarM14932D.m216491r(this.f3921f.getPackageName());
        yxx0VarM14932D.m216490q(lValueOf.longValue());
        this.f3922g = new C0882i0(this.f3921f, (C2408r0) yxx0VarM14932D.m135959k());
        this.f3921f.getPackageName();
    }

    @AnyThread
    public C0867b(@Nullable String str, C0873e c0873e, Context context, rcb0 rcb0Var, @Nullable v0s0 v0s0Var, @Nullable InterfaceC0878g0 interfaceC0878g0, @Nullable ExecutorService executorService) {
        String strM4854L = m4854L();
        this.f3916a = new Object();
        this.f3917b = 0;
        this.f3919d = new Handler(Looper.getMainLooper());
        this.f3927l = 0;
        this.f3915F = Long.valueOf(new Random().nextLong());
        this.f3918c = strM4854L;
        m4876l(context, rcb0Var, c0873e, null, strM4854L, null);
    }
}
