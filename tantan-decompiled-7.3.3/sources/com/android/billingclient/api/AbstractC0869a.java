package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.am90;
import p153l.ay2;
import p153l.c10;
import p153l.d10;
import p153l.drm;
import p153l.ely0;
import p153l.erm;
import p153l.ukb0;
import p153l.vkb0;
import p153l.wg3;
import p153l.x06;
import p153l.y06;
import p153l.zvb0;

/* JADX INFO: renamed from: com.android.billingclient.api.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a */
    @AnyThread
    public static final class a {

        /* JADX INFO: renamed from: a */
        private volatile C0877e f3904a;

        /* JADX INFO: renamed from: b */
        private final Context f3905b;

        /* JADX INFO: renamed from: c */
        private volatile vkb0 f3906c;

        /* JADX INFO: renamed from: d */
        private volatile boolean f3907d;

        /* JADX INFO: renamed from: e */
        private volatile boolean f3908e;

        public /* synthetic */ a(Context context, ely0 ely0Var) {
            this.f3905b = context;
        }

        /* JADX INFO: renamed from: e */
        private final boolean m4843e() {
            try {
                return this.f3905b.getPackageManager().getApplicationInfo(this.f3905b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                C2426p.m14975l("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC0869a m4844a() {
            if (this.f3905b == null) {
                wg3.m206174a("Please provide a valid Context.");
                return null;
            }
            if (this.f3906c == null) {
                if (this.f3907d || this.f3908e) {
                    Context context = this.f3905b;
                    return m4843e() ? new C0878e0(null, context, null, null) : new C0871b(null, context, null, null);
                }
                wg3.m206174a("Please provide a valid listener for purchases updates.");
                return null;
            }
            if (this.f3904a == null || !this.f3904a.m4981a()) {
                wg3.m206174a("Pending purchases for one-time products must be supported.");
                return null;
            }
            if (this.f3906c == null) {
                C0877e c0877e = this.f3904a;
                Context context2 = this.f3905b;
                return m4843e() ? new C0878e0(null, c0877e, context2, null, null, null) : new C0871b(null, c0877e, context2, null, null, null);
            }
            C0877e c0877e2 = this.f3904a;
            Context context3 = this.f3905b;
            vkb0 vkb0Var = this.f3906c;
            return m4843e() ? new C0878e0(null, c0877e2, context3, vkb0Var, null, null, null) : new C0871b(null, c0877e2, context3, vkb0Var, null, null, null);
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: b */
        public a m4845b() {
            C0877e.a aVarM4980c = C0877e.m4980c();
            aVarM4980c.m4984b();
            m4846c(aVarM4980c.m4983a());
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4846c(@NonNull C0877e c0877e) {
            this.f3904a = c0877e;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m4847d(@NonNull vkb0 vkb0Var) {
            this.f3906c = vkb0Var;
            return this;
        }
    }

    @NonNull
    @AnyThread
    /* JADX INFO: renamed from: g */
    public static a m4832g(@NonNull Context context) {
        return new a(context, null);
    }

    @AnyThread
    /* JADX INFO: renamed from: a */
    public abstract void mo4833a(@NonNull c10 c10Var, @NonNull d10 d10Var);

    @AnyThread
    /* JADX INFO: renamed from: b */
    public abstract void mo4834b(@NonNull x06 x06Var, @NonNull y06 y06Var);

    @AnyThread
    /* JADX INFO: renamed from: c */
    public abstract void mo4835c();

    @NonNull
    @AnyThread
    /* JADX INFO: renamed from: d */
    public abstract C0875d mo4836d(@NonNull String str);

    @AnyThread
    /* JADX INFO: renamed from: e */
    public abstract boolean mo4837e();

    @NonNull
    @UiThread
    /* JADX INFO: renamed from: f */
    public abstract C0875d mo4838f(@NonNull Activity activity, @NonNull C0873c c0873c);

    @AnyThread
    /* JADX INFO: renamed from: h */
    public abstract void mo4839h(@NonNull C0881g c0881g, @NonNull am90 am90Var);

    @AnyThread
    /* JADX INFO: renamed from: i */
    public abstract void mo4840i(@NonNull zvb0 zvb0Var, @NonNull ukb0 ukb0Var);

    @NonNull
    @UiThread
    /* JADX INFO: renamed from: j */
    public abstract C0875d mo4841j(@NonNull Activity activity, @NonNull drm drmVar, @NonNull erm ermVar);

    @AnyThread
    /* JADX INFO: renamed from: k */
    public abstract void mo4842k(@NonNull ay2 ay2Var);
}
