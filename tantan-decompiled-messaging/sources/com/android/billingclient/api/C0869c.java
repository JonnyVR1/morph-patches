package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0869c;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p149l.c4t0;
import p149l.ig3;
import p149l.m5s0;

/* JADX INFO: renamed from: com.android.billingclient.api.c */
/* JADX INFO: loaded from: classes.dex */
public class C0869c {

    /* JADX INFO: renamed from: a */
    private boolean f3946a;

    /* JADX INFO: renamed from: b */
    private String f3947b;

    /* JADX INFO: renamed from: c */
    private String f3948c;

    /* JADX INFO: renamed from: d */
    private c f3949d;

    /* JADX INFO: renamed from: e */
    private zzco f3950e;

    /* JADX INFO: renamed from: f */
    private ArrayList f3951f;

    /* JADX INFO: renamed from: g */
    private boolean f3952g;

    /* JADX INFO: renamed from: com.android.billingclient.api.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f3953a;

        /* JADX INFO: renamed from: b */
        private String f3954b;

        /* JADX INFO: renamed from: c */
        private List f3955c;

        /* JADX INFO: renamed from: d */
        private ArrayList f3956d;

        /* JADX INFO: renamed from: e */
        private boolean f3957e;

        /* JADX INFO: renamed from: f */
        private c.a f3958f;

        public /* synthetic */ a(c4t0 c4t0Var) {
            c.a aVarM4948a = c.m4948a();
            c.a.m4956e(aVarM4948a);
            this.f3958f = aVarM4948a;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0869c m4936a() {
            ArrayList arrayList = this.f3956d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f3955c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            c4t0 c4t0Var = null;
            if (!z2 && !z3) {
                ig3.m135964a("Details of the products must be provided.");
                return null;
            }
            if (z2 && z3) {
                ig3.m135964a("Set SkuDetails or ProductDetailsParams, not both.");
                return null;
            }
            if (!z2) {
                this.f3955c.forEach(new Consumer() { // from class: l.u2t0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((C0869c.b) obj) != null) {
                            return;
                        }
                        ig3.m135964a("ProductDetailsParams cannot be null.");
                    }
                });
            } else {
                if (this.f3956d.contains(null)) {
                    ig3.m135964a("SKU cannot be null.");
                    return null;
                }
                if (this.f3956d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f3956d.get(0);
                    String strM4815b = skuDetails.m4815b();
                    ArrayList arrayList2 = this.f3956d;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                        if (!strM4815b.equals("play_pass_subs") && !skuDetails2.m4815b().equals("play_pass_subs") && !strM4815b.equals(skuDetails2.m4815b())) {
                            ig3.m135964a("SKUs should have the same type.");
                            return null;
                        }
                    }
                    String strM4819f = skuDetails.m4819f();
                    ArrayList arrayList3 = this.f3956d;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                        if (!strM4815b.equals("play_pass_subs") && !skuDetails3.m4815b().equals("play_pass_subs") && !strM4819f.equals(skuDetails3.m4819f())) {
                            ig3.m135964a("All SKUs must have the same package name.");
                            return null;
                        }
                    }
                }
            }
            C0869c c0869c = new C0869c(c4t0Var);
            if ((!z2 || ((SkuDetails) this.f3956d.get(0)).m4819f().isEmpty()) && (!z3 || ((b) this.f3955c.get(0)).m4941b().m5004g().isEmpty())) {
                z = false;
            }
            c0869c.f3946a = z;
            c0869c.f3947b = this.f3953a;
            c0869c.f3948c = this.f3954b;
            c0869c.f3949d = this.f3958f.m4957a();
            ArrayList arrayList4 = this.f3956d;
            c0869c.f3951f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            c0869c.f3952g = this.f3957e;
            List list2 = this.f3955c;
            c0869c.f3950e = list2 != null ? zzco.zzk(list2) : zzco.zzl();
            return c0869c;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4937b(@NonNull String str) {
            this.f3953a = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4938c(@NonNull List<b> list) {
            this.f3955c = new ArrayList(list);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m4939d(@NonNull c cVar) {
            this.f3958f = c.m4949c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C0875f f3959a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final String f3960b;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private C0875f f3961a;

            /* JADX INFO: renamed from: b */
            @Nullable
            private String f3962b;

            public /* synthetic */ a(c4t0 c4t0Var) {
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public b m4945a() {
                m5s0.m153144c(this.f3961a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f3961a.m5002e() != null) {
                    m5s0.m153144c(this.f3962b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m4946b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    ig3.m135964a("offerToken can not be empty");
                    return null;
                }
                this.f3962b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m4947c(@NonNull C0875f c0875f) {
                this.f3961a = c0875f;
                if (c0875f.m4999b() != null) {
                    c0875f.m4999b().getClass();
                    C0875f.b bVarM4999b = c0875f.m4999b();
                    if (bVarM4999b.m5012e() != null) {
                        this.f3962b = bVarM4999b.m5012e();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, c4t0 c4t0Var) {
            this.f3959a = aVar.f3961a;
            this.f3960b = aVar.f3962b;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m4940a() {
            return new a(null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public final C0875f m4941b() {
            return this.f3959a;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m4942c() {
            return this.f3960b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private String f3963a;

        /* JADX INFO: renamed from: b */
        private String f3964b;

        /* JADX INFO: renamed from: c */
        private int f3965c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private String f3966a;

            /* JADX INFO: renamed from: b */
            private String f3967b;

            /* JADX INFO: renamed from: c */
            private boolean f3968c;

            /* JADX INFO: renamed from: d */
            private int f3969d = 0;

            public /* synthetic */ a(c4t0 c4t0Var) {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ a m4956e(a aVar) {
                aVar.f3968c = true;
                return aVar;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public c m4957a() {
                boolean z = true;
                c4t0 c4t0Var = null;
                if (TextUtils.isEmpty(this.f3966a) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f3967b);
                if (z && !zIsEmpty) {
                    ig3.m135964a("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    return null;
                }
                if (!this.f3968c && !z && zIsEmpty) {
                    ig3.m135964a("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    return null;
                }
                c cVar = new c(c4t0Var);
                cVar.f3963a = this.f3966a;
                cVar.f3965c = this.f3969d;
                cVar.f3964b = this.f3967b;
                return cVar;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m4958b(@NonNull String str) {
                this.f3966a = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m4959c(@NonNull String str) {
                this.f3967b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: d */
            public a m4960d(int i) {
                this.f3969d = i;
                return this;
            }

            @NonNull
            @Deprecated
            /* JADX INFO: renamed from: f */
            public final a m4961f(@NonNull String str) {
                this.f3966a = str;
                return this;
            }
        }

        public /* synthetic */ c(c4t0 c4t0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m4948a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: c */
        public static /* bridge */ /* synthetic */ a m4949c(c cVar) {
            a aVarM4948a = m4948a();
            aVarM4948a.m4961f(cVar.f3963a);
            aVarM4948a.m4960d(cVar.f3965c);
            aVarM4948a.m4959c(cVar.f3964b);
            return aVarM4948a;
        }

        /* JADX INFO: renamed from: b */
        public final int m4953b() {
            return this.f3965c;
        }

        /* JADX INFO: renamed from: d */
        public final String m4954d() {
            return this.f3963a;
        }

        /* JADX INFO: renamed from: e */
        public final String m4955e() {
            return this.f3964b;
        }
    }

    public /* synthetic */ C0869c(c4t0 c4t0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m4918a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final int m4926b() {
        return this.f3949d.m4953b();
    }

    /* JADX INFO: renamed from: c */
    public final C0871d m4927c() {
        if (this.f3950e.isEmpty()) {
            return C0880h0.f4045l;
        }
        b bVar = (b) this.f3950e.get(0);
        for (int i = 1; i < this.f3950e.size(); i++) {
            b bVar2 = (b) this.f3950e.get(i);
            if (!bVar2.m4941b().m5001d().equals(bVar.m4941b().m5001d()) && !bVar2.m4941b().m5001d().equals("play_pass_subs")) {
                return C0880h0.m5047a(5, "All products should have same ProductType.");
            }
        }
        String strM5004g = bVar.m4941b().m5004g();
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        zzco zzcoVar = this.f3950e;
        int size = zzcoVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar3 = (b) zzcoVar.get(i2);
            bVar3.m4941b().m5001d().equals(SubSampleInformationBox.TYPE);
            if (hashSet.contains(bVar3.m4941b().m5000c())) {
                return C0880h0.m5047a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.m4941b().m5000c()));
            }
            hashSet.add(bVar3.m4941b().m5000c());
            if (!bVar.m4941b().m5001d().equals("play_pass_subs") && !bVar3.m4941b().m5001d().equals("play_pass_subs") && !strM5004g.equals(bVar3.m4941b().m5004g())) {
                return C0880h0.m5047a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet2) {
            if (hashSet.contains(str)) {
                return C0880h0.m5047a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        C0875f.b bVarM4999b = bVar.m4941b().m4999b();
        return (bVarM4999b == null || bVarM4999b.m5011d() == null) ? C0880h0.f4045l : C0880h0.m5047a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m4928d() {
        return this.f3947b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m4929e() {
        return this.f3948c;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m4930f() {
        return this.f3949d.m4954d();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m4931g() {
        return this.f3949d.m4955e();
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final ArrayList m4932h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3951f);
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public final List m4933i() {
        return this.f3950e;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4934q() {
        return this.f3952g;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4935r() {
        return (this.f3947b == null && this.f3948c == null && this.f3949d.m4955e() == null && this.f3949d.m4953b() == 0 && !this.f3950e.stream().anyMatch(new Predicate() { // from class: l.m1t0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f3946a && !this.f3952g) ? false : true;
    }
}
