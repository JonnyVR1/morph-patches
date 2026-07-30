package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.b8t0;

/* JADX INFO: renamed from: com.android.billingclient.api.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0871d {

    /* JADX INFO: renamed from: a */
    private int f3971a;

    /* JADX INFO: renamed from: b */
    private String f3972b;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f3973a;

        /* JADX INFO: renamed from: b */
        private String f3974b = "";

        public /* synthetic */ a(b8t0 b8t0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0871d m4967a() {
            C0871d c0871d = new C0871d();
            c0871d.f3971a = this.f3973a;
            c0871d.f3972b = this.f3974b;
            return c0871d;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4968b(@NonNull String str) {
            this.f3974b = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4969c(int i) {
            this.f3973a = i;
            return this;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m4962c() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m4965a() {
        return this.f3972b;
    }

    /* JADX INFO: renamed from: b */
    public int m4966b() {
        return this.f3971a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + C2403p.m14917h(this.f3971a) + ", Debug Message: " + this.f3972b;
    }
}
