package com.android.billingclient.api;

import androidx.annotation.NonNull;
import p149l.ig3;

/* JADX INFO: renamed from: com.android.billingclient.api.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0873e {

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
        public C0873e m4973a() {
            if (this.f3978a) {
                return new C0873e(true, this.f3979b);
            }
            ig3.m135964a("Pending purchases for one-time products must be supported.");
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4974b() {
            this.f3978a = true;
            return this;
        }
    }

    private C0873e(boolean z, boolean z2) {
        this.f3976a = z;
        this.f3977b = z2;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m4970c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m4971a() {
        return this.f3976a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4972b() {
        return this.f3977b;
    }
}
