package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.HashSet;
import java.util.List;
import p149l.ig3;
import p149l.ttt0;

/* JADX INFO: renamed from: com.android.billingclient.api.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0877g {

    /* JADX INFO: renamed from: a */
    private final zzco f4018a;

    /* JADX INFO: renamed from: com.android.billingclient.api.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private zzco f4019a;

        public /* synthetic */ a(ttt0 ttt0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0877g m5030a() {
            if (this.f4019a != null) {
                return new C0877g(this, null);
            }
            ig3.m135964a("Product list must be set to a non empty list.");
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m5031b(@NonNull List<b> list) {
            if (list == null || list.isEmpty()) {
                ig3.m135964a("Product list cannot be empty.");
                return null;
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.m5034c())) {
                    hashSet.add(bVar.m5034c());
                }
            }
            if (hashSet.size() <= 1) {
                this.f4019a = zzco.zzk(list);
                return this;
            }
            ig3.m135964a("All products should be of the same product type.");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final String f4020a;

        /* JADX INFO: renamed from: b */
        private final String f4021b;

        /* JADX INFO: renamed from: com.android.billingclient.api.g$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private String f4022a;

            /* JADX INFO: renamed from: b */
            private String f4023b;

            public /* synthetic */ a(ttt0 ttt0Var) {
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public b m5037a() {
                if ("first_party".equals(this.f4023b)) {
                    ig3.m135964a("Serialized doc id must be provided for first party products.");
                    return null;
                }
                if (this.f4022a == null) {
                    ig3.m135964a("Product id must be provided.");
                    return null;
                }
                if (this.f4023b != null) {
                    return new b(this, null);
                }
                ig3.m135964a("Product type must be provided.");
                return null;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m5038b(@NonNull String str) {
                this.f4022a = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m5039c(@NonNull String str) {
                this.f4023b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, ttt0 ttt0Var) {
            this.f4020a = aVar.f4022a;
            this.f4021b = aVar.f4023b;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m5032a() {
            return new a(null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public final String m5033b() {
            return this.f4020a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final String m5034c() {
            return this.f4021b;
        }
    }

    public /* synthetic */ C0877g(a aVar, ttt0 ttt0Var) {
        this.f4018a = aVar.f4019a;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m5026a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final zzco m5027b() {
        return this.f4018a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final String m5028c() {
        return ((b) this.f4018a.get(0)).m5034c();
    }
}
