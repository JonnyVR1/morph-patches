package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.bpm;
import p149l.cpm;
import p149l.i10;
import p149l.ig3;
import p149l.j10;
import p149l.lx2;
import p149l.qcb0;
import p149l.rcb0;
import p149l.sz5;
import p149l.tz5;
import p149l.vnb0;
import p149l.wd90;
import p149l.yby0;

/* JADX INFO: renamed from: com.android.billingclient.api.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a */
    @AnyThread
    public static final class a {

        /* JADX INFO: renamed from: a */
        private volatile C0873e f3904a;

        /* JADX INFO: renamed from: b */
        private final Context f3905b;

        /* JADX INFO: renamed from: c */
        private volatile rcb0 f3906c;

        /* JADX INFO: renamed from: d */
        private volatile boolean f3907d;

        /* JADX INFO: renamed from: e */
        private volatile boolean f3908e;

        public /* synthetic */ a(Context context, yby0 yby0Var) {
            this.f3905b = context;
        }

        /* JADX INFO: renamed from: e */
        private final boolean m4833e() {
            try {
                return this.f3905b.getPackageManager().getApplicationInfo(this.f3905b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                C2403p.m14921l("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC0865a m4834a() {
            if (this.f3905b == null) {
                ig3.m135964a("Please provide a valid Context.");
                return null;
            }
            if (this.f3906c == null) {
                if (this.f3907d || this.f3908e) {
                    Context context = this.f3905b;
                    return m4833e() ? new C0874e0(null, context, null, null) : new C0867b(null, context, null, null);
                }
                ig3.m135964a("Please provide a valid listener for purchases updates.");
                return null;
            }
            if (this.f3904a == null || !this.f3904a.m4971a()) {
                ig3.m135964a("Pending purchases for one-time products must be supported.");
                return null;
            }
            if (this.f3906c == null) {
                C0873e c0873e = this.f3904a;
                Context context2 = this.f3905b;
                return m4833e() ? new C0874e0(null, c0873e, context2, null, null, null) : new C0867b(null, c0873e, context2, null, null, null);
            }
            C0873e c0873e2 = this.f3904a;
            Context context3 = this.f3905b;
            rcb0 rcb0Var = this.f3906c;
            return m4833e() ? new C0874e0(null, c0873e2, context3, rcb0Var, null, null, null) : new C0867b(null, c0873e2, context3, rcb0Var, null, null, null);
        }

        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: b */
        public a m4835b() {
            C0873e.a aVarM4970c = C0873e.m4970c();
            aVarM4970c.m4974b();
            m4836c(aVarM4970c.m4973a());
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4836c(@NonNull C0873e c0873e) {
            this.f3904a = c0873e;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m4837d(@NonNull rcb0 rcb0Var) {
            this.f3906c = rcb0Var;
            return this;
        }
    }

    @NonNull
    @AnyThread
    /* JADX INFO: renamed from: g */
    public static a m4822g(@NonNull Context context) {
        return new a(context, null);
    }

    @AnyThread
    /* JADX INFO: renamed from: a */
    public abstract void mo4823a(@NonNull i10 i10Var, @NonNull j10 j10Var);

    @AnyThread
    /* JADX INFO: renamed from: b */
    public abstract void mo4824b(@NonNull sz5 sz5Var, @NonNull tz5 tz5Var);

    @AnyThread
    /* JADX INFO: renamed from: c */
    public abstract void mo4825c();

    @NonNull
    @AnyThread
    /* JADX INFO: renamed from: d */
    public abstract C0871d mo4826d(@NonNull String str);

    @AnyThread
    /* JADX INFO: renamed from: e */
    public abstract boolean mo4827e();

    @NonNull
    @UiThread
    /* JADX INFO: renamed from: f */
    public abstract C0871d mo4828f(@NonNull Activity activity, @NonNull C0869c c0869c);

    @AnyThread
    /* JADX INFO: renamed from: h */
    public abstract void mo4829h(@NonNull C0877g c0877g, @NonNull wd90 wd90Var);

    @AnyThread
    /* JADX INFO: renamed from: i */
    public abstract void mo4830i(@NonNull vnb0 vnb0Var, @NonNull qcb0 qcb0Var);

    @NonNull
    @UiThread
    /* JADX INFO: renamed from: j */
    public abstract C0871d mo4831j(@NonNull Activity activity, @NonNull bpm bpmVar, @NonNull cpm cpmVar);

    @AnyThread
    /* JADX INFO: renamed from: k */
    public abstract void mo4832k(@NonNull lx2 lx2Var);
}
