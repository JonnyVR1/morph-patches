package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0873c;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p153l.idt0;
import p153l.ses0;
import p153l.wg3;

/* JADX INFO: renamed from: com.android.billingclient.api.c */
/* JADX INFO: loaded from: classes.dex */
public class C0873c {

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

        public /* synthetic */ a(idt0 idt0Var) {
            c.a aVarM4958a = c.m4958a();
            c.a.m4966e(aVarM4958a);
            this.f3958f = aVarM4958a;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0873c m4946a() {
            ArrayList arrayList = this.f3956d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f3955c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            idt0 idt0Var = null;
            if (!z2 && !z3) {
                wg3.m206174a("Details of the products must be provided.");
                return null;
            }
            if (z2 && z3) {
                wg3.m206174a("Set SkuDetails or ProductDetailsParams, not both.");
                return null;
            }
            if (!z2) {
                this.f3955c.forEach(new Consumer() { // from class: l.act0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((C0873c.b) obj) != null) {
                            return;
                        }
                        wg3.m206174a("ProductDetailsParams cannot be null.");
                    }
                });
            } else {
                if (this.f3956d.contains(null)) {
                    wg3.m206174a("SKU cannot be null.");
                    return null;
                }
                if (this.f3956d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f3956d.get(0);
                    String strM4825b = skuDetails.m4825b();
                    ArrayList arrayList2 = this.f3956d;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                        if (!strM4825b.equals("play_pass_subs") && !skuDetails2.m4825b().equals("play_pass_subs") && !strM4825b.equals(skuDetails2.m4825b())) {
                            wg3.m206174a("SKUs should have the same type.");
                            return null;
                        }
                    }
                    String strM4829f = skuDetails.m4829f();
                    ArrayList arrayList3 = this.f3956d;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                        if (!strM4825b.equals("play_pass_subs") && !skuDetails3.m4825b().equals("play_pass_subs") && !strM4829f.equals(skuDetails3.m4829f())) {
                            wg3.m206174a("All SKUs must have the same package name.");
                            return null;
                        }
                    }
                }
            }
            C0873c c0873c = new C0873c(idt0Var);
            if ((!z2 || ((SkuDetails) this.f3956d.get(0)).m4829f().isEmpty()) && (!z3 || ((b) this.f3955c.get(0)).m4951b().m5014g().isEmpty())) {
                z = false;
            }
            c0873c.f3946a = z;
            c0873c.f3947b = this.f3953a;
            c0873c.f3948c = this.f3954b;
            c0873c.f3949d = this.f3958f.m4967a();
            ArrayList arrayList4 = this.f3956d;
            c0873c.f3951f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            c0873c.f3952g = this.f3957e;
            List list2 = this.f3955c;
            c0873c.f3950e = list2 != null ? zzco.zzk(list2) : zzco.zzl();
            return c0873c;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m4947b(@NonNull String str) {
            this.f3953a = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m4948c(@NonNull List<b> list) {
            this.f3955c = new ArrayList(list);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m4949d(@NonNull c cVar) {
            this.f3958f = c.m4959c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C0879f f3959a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final String f3960b;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private C0879f f3961a;

            /* JADX INFO: renamed from: b */
            @Nullable
            private String f3962b;

            public /* synthetic */ a(idt0 idt0Var) {
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public b m4955a() {
                ses0.m185568c(this.f3961a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f3961a.m5012e() != null) {
                    ses0.m185568c(this.f3962b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m4956b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    wg3.m206174a("offerToken can not be empty");
                    return null;
                }
                this.f3962b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m4957c(@NonNull C0879f c0879f) {
                this.f3961a = c0879f;
                if (c0879f.m5009b() != null) {
                    c0879f.m5009b().getClass();
                    C0879f.b bVarM5009b = c0879f.m5009b();
                    if (bVarM5009b.m5022e() != null) {
                        this.f3962b = bVarM5009b.m5022e();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, idt0 idt0Var) {
            this.f3959a = aVar.f3961a;
            this.f3960b = aVar.f3962b;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m4950a() {
            return new a(null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public final C0879f m4951b() {
            return this.f3959a;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m4952c() {
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

            public /* synthetic */ a(idt0 idt0Var) {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ a m4966e(a aVar) {
                aVar.f3968c = true;
                return aVar;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public c m4967a() {
                boolean z = true;
                idt0 idt0Var = null;
                if (TextUtils.isEmpty(this.f3966a) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f3967b);
                if (z && !zIsEmpty) {
                    wg3.m206174a("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    return null;
                }
                if (!this.f3968c && !z && zIsEmpty) {
                    wg3.m206174a("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    return null;
                }
                c cVar = new c(idt0Var);
                cVar.f3963a = this.f3966a;
                cVar.f3965c = this.f3969d;
                cVar.f3964b = this.f3967b;
                return cVar;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m4968b(@NonNull String str) {
                this.f3966a = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m4969c(@NonNull String str) {
                this.f3967b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: d */
            public a m4970d(int i) {
                this.f3969d = i;
                return this;
            }

            @NonNull
            @Deprecated
            /* JADX INFO: renamed from: f */
            public final a m4971f(@NonNull String str) {
                this.f3966a = str;
                return this;
            }
        }

        public /* synthetic */ c(idt0 idt0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m4958a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: c */
        public static /* bridge */ /* synthetic */ a m4959c(c cVar) {
            a aVarM4958a = m4958a();
            aVarM4958a.m4971f(cVar.f3963a);
            aVarM4958a.m4970d(cVar.f3965c);
            aVarM4958a.m4969c(cVar.f3964b);
            return aVarM4958a;
        }

        /* JADX INFO: renamed from: b */
        public final int m4963b() {
            return this.f3965c;
        }

        /* JADX INFO: renamed from: d */
        public final String m4964d() {
            return this.f3963a;
        }

        /* JADX INFO: renamed from: e */
        public final String m4965e() {
            return this.f3964b;
        }
    }

    public /* synthetic */ C0873c(idt0 idt0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m4928a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final int m4936b() {
        return this.f3949d.m4963b();
    }

    /* JADX INFO: renamed from: c */
    public final C0875d m4937c() {
        if (this.f3950e.isEmpty()) {
            return C0884h0.f4045l;
        }
        b bVar = (b) this.f3950e.get(0);
        for (int i = 1; i < this.f3950e.size(); i++) {
            b bVar2 = (b) this.f3950e.get(i);
            if (!bVar2.m4951b().m5011d().equals(bVar.m4951b().m5011d()) && !bVar2.m4951b().m5011d().equals("play_pass_subs")) {
                return C0884h0.m5057a(5, "All products should have same ProductType.");
            }
        }
        String strM5014g = bVar.m4951b().m5014g();
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        zzco zzcoVar = this.f3950e;
        int size = zzcoVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar3 = (b) zzcoVar.get(i2);
            bVar3.m4951b().m5011d().equals(SubSampleInformationBox.TYPE);
            if (hashSet.contains(bVar3.m4951b().m5010c())) {
                return C0884h0.m5057a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.m4951b().m5010c()));
            }
            hashSet.add(bVar3.m4951b().m5010c());
            if (!bVar.m4951b().m5011d().equals("play_pass_subs") && !bVar3.m4951b().m5011d().equals("play_pass_subs") && !strM5014g.equals(bVar3.m4951b().m5014g())) {
                return C0884h0.m5057a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet2) {
            if (hashSet.contains(str)) {
                return C0884h0.m5057a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        C0879f.b bVarM5009b = bVar.m4951b().m5009b();
        return (bVarM5009b == null || bVarM5009b.m5021d() == null) ? C0884h0.f4045l : C0884h0.m5057a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m4938d() {
        return this.f3947b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m4939e() {
        return this.f3948c;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m4940f() {
        return this.f3949d.m4964d();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m4941g() {
        return this.f3949d.m4965e();
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final ArrayList m4942h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3951f);
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public final List m4943i() {
        return this.f3950e;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4944q() {
        return this.f3952g;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4945r() {
        return (this.f3947b == null && this.f3948c == null && this.f3949d.m4965e() == null && this.f3949d.m4963b() == 0 && !this.f3950e.stream().anyMatch(new Predicate() { // from class: l.sat0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f3946a && !this.f3952g) ? false : true;
    }
}
