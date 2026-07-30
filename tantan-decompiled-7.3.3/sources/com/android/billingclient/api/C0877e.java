package com.android.billingclient.api;

import androidx.annotation.NonNull;
import p153l.wg3;

/* JADX INFO: renamed from: com.android.billingclient.api.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0877e {

    /* JADX INFO: renamed from: a */
    private final boolean f3976a;

    /* JADX INFO: renamed from: b */
    private final boolean f3977b;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f3978a;

        /* JADX INFO: renamed from: b */
        private boolean f3979b;

        private a() {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0877e m4983a() {
            if (this.f3978a) {
                return new C0877e(true, this.f3979b);
            }
            wg3.m206174a("Pending purchases for one-time products must be supported.");
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4984b() {
            this.f3978a = true;
            return this;
        }
    }

    private C0877e(boolean z, boolean z2) {
        this.f3976a = z;
        this.f3977b = z2;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m4980c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m4981a() {
        return this.f3976a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4982b() {
        return this.f3977b;
    }
}
