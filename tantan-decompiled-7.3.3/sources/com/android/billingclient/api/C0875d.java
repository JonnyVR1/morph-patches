package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.hht0;

/* JADX INFO: renamed from: com.android.billingclient.api.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0875d {

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

        public /* synthetic */ a(hht0 hht0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0875d m4977a() {
            C0875d c0875d = new C0875d();
            c0875d.f3971a = this.f3973a;
            c0875d.f3972b = this.f3974b;
            return c0875d;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4978b(@NonNull String str) {
            this.f3974b = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4979c(int i) {
            this.f3973a = i;
            return this;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m4972c() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m4975a() {
        return this.f3972b;
    }

    /* JADX INFO: renamed from: b */
    public int m4976b() {
        return this.f3971a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + C2426p.m14971h(this.f3971a) + ", Debug Message: " + this.f3972b;
    }
}
