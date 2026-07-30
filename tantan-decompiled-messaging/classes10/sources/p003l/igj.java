package p003l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.d;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.Prices;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.data.GPSkuDetails;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import l.e30;
import l.e51;
import l.faj;
import l.ggi;
import l.jo0;
import l.lx2;
import l.mkd0;
import l.qnd;
import l.rcb0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.wd90;
import l.z3g0;
import rx.Notification;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class igj {

    /* JADX INFO: renamed from: a */
    public static C3349c<List<GPSkuDetails>> f5132a = new C3349c<>("google_play_sku_details", null, null, ProtobufAdapter.ARRAY_ADAPTER(GPSkuDetails.PROTOBUF_ADAPTER));

    /* JADX INFO: renamed from: b */
    public static a<List<Merchandise>> f5133b = a.b();

    /* JADX INFO: renamed from: l.igj$a */
    public class C3347a implements lx2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f5134a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.android.billingclient.api.a f5135b;

        public C3347a(z3g0 z3g0Var, com.android.billingclient.api.a aVar) {
            this.f5134a = z3g0Var;
            this.f5135b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m7225a(d dVar) {
            int iB = dVar.b();
            z3g0 z3g0Var = this.f5134a;
            if (iB == 0) {
                z3g0Var.onNext(this.f5135b);
            } else {
                z3g0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(dVar.b()), "_", dVar.a()).toString()));
            }
        }

        /* JADX INFO: renamed from: c */
        public void m7226c() {
            this.f5134a.onError(new RuntimeException(TextUtils.concat("-5", "_", "onBillingServiceDisconnected").toString()));
        }
    }

    /* JADX INFO: renamed from: l.igj$b */
    public class C3348b implements wd90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f5136a;

        public C3348b(WeakReference weakReference) {
            this.f5136a = weakReference;
        }

        /* JADX INFO: renamed from: a */
        public void m7227a(@NonNull d dVar, @NonNull List<f> list) {
            z3g0 z3g0Var = (z3g0) this.f5136a.get();
            if (NullChecker.a(z3g0Var)) {
                if (dVar.b() != 0 || vwb.J(list)) {
                    z3g0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(dVar.b()), "_", dVar.a()).toString()));
                    return;
                }
                try {
                    if (TextUtils.isEmpty(CoreModule.c.I2)) {
                        String strC = TextUtils.equals(list.get(0).d(), "subs") ? ((f.c) ((f.e) list.get(0).e().get(0)).d().a().get(0)).c() : list.get(0).b().c();
                        c cVar = CoreModule.c;
                        cVar.I2 = strC;
                        cVar.j0.O5(strC);
                    }
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                for (f fVar : list) {
                    if (TextUtils.equals(list.get(0).d(), "subs")) {
                        for (f.e eVar : fVar.e()) {
                            f.c cVar2 = (f.c) eVar.d().a().get(0);
                            if (cVar2 != null) {
                                GPSkuDetails gPSkuDetailsNew_ = GPSkuDetails.new_();
                                gPSkuDetailsNew_.productId = fVar.c() + ":" + eVar.a();
                                if (!TextUtils.isEmpty(eVar.b())) {
                                    gPSkuDetailsNew_.productId += ":" + eVar.b();
                                }
                                gPSkuDetailsNew_.type = fVar.d();
                                gPSkuDetailsNew_.price = cVar2.a();
                                gPSkuDetailsNew_.priceAmountMicros = cVar2.b();
                                gPSkuDetailsNew_.priceCurrencyCode = cVar2.c();
                                gPSkuDetailsNew_.title = fVar.f();
                                gPSkuDetailsNew_.description = fVar.a();
                                gPSkuDetailsNew_.introductoryPriceAmountMicros = cVar2.b();
                                arrayList.add(gPSkuDetailsNew_);
                            }
                        }
                    } else {
                        GPSkuDetails gPSkuDetailsNew_2 = GPSkuDetails.new_();
                        f.b bVarB = fVar.b();
                        gPSkuDetailsNew_2.productId = fVar.c();
                        gPSkuDetailsNew_2.type = fVar.d();
                        gPSkuDetailsNew_2.price = bVarB.a();
                        gPSkuDetailsNew_2.priceAmountMicros = bVarB.b();
                        gPSkuDetailsNew_2.priceCurrencyCode = bVarB.c();
                        gPSkuDetailsNew_2.title = fVar.f();
                        gPSkuDetailsNew_2.description = fVar.a();
                        gPSkuDetailsNew_2.introductoryPriceAmountMicros = bVarB.b();
                        arrayList.add(gPSkuDetailsNew_2);
                    }
                }
                z3g0Var.onNext(arrayList);
                z3g0Var.onCompleted();
                igj.m7198Q(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Optional m7183B(Notification notification) {
        if (notification.k()) {
            return (Optional) notification.f();
        }
        if (notification.j()) {
            CrashHelper.c(notification.e());
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Optional m7184C(ArrayList arrayList, Optional optional) {
        if (!optional.isPresent()) {
            o6j0.m8414n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C3390a.m8422h("price_cache_status", "miss"));
            return Optional.absent();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            GPSkuDetails gPSkuDetails = (GPSkuDetails) vwb.r((Collection) optional.get(), new w9j() { // from class: l.jfj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((GPSkuDetails) obj).productId));
                }
            });
            if (gPSkuDetails == null) {
                o6j0.m8414n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C3390a.m8422h("price_cache_status", "miss"));
                return Optional.absent();
            }
            arrayList2.add(gPSkuDetails);
        }
        o6j0.m8414n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C3390a.m8422h("price_cache_status", "hit"));
        o6j0.m8414n("e_purchase_products_request_success", "p_purchase_page", new o6j0.C3390a[0]);
        return Optional.of(arrayList2);
    }

    /* JADX INFO: renamed from: F */
    public static void m7187F() {
        ConnectivityReceiver.m().filter(new w9j() { // from class: l.kfj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).flatMap(new w9j() { // from class: l.lfj
            public final Object call(Object obj) {
                return igj.m7193L();
            }
        }).materialize().map(new w9j() { // from class: l.mfj
            public final Object call(Object obj) {
                return igj.m7219u((Notification) obj);
            }
        }).takeFirst(new w9j() { // from class: l.nfj
            public final Object call(Object obj) {
                return igj.m7223y((Boolean) obj);
            }
        }).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: G */
    public static String m7188G(String str) {
        return str.replaceAll("[0-9,\\.]", "").trim();
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public static String m7189H(@Nullable final String str) {
        GPSkuDetails gPSkuDetails;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<GPSkuDetails> listM7231d = f5132a.m7231d();
        if (vwb.J(listM7231d) || (gPSkuDetails = (GPSkuDetails) vwb.r(listM7231d, new w9j() { // from class: l.fgj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((GPSkuDetails) obj).productId));
            }
        })) == null || TextUtils.isEmpty(gPSkuDetails.price)) {
            return null;
        }
        return gPSkuDetails.price.trim();
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static String m7190I(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        String strM7189H = m7189H(strTrim);
        if (!TextUtils.isEmpty(strM7189H)) {
            return strM7189H;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return m7189H(strTrim + ":" + str2.trim());
    }

    /* JADX INFO: renamed from: J */
    public static rx.c<List<GPSkuDetails>> m7191J(final com.android.billingclient.api.a aVar, final String str, final ArrayList<String> arrayList) {
        return rx.c.create(new rx.c.a() { // from class: l.rfj
            public final void call(Object obj) {
                igj.m7200b(arrayList, str, aVar, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static rx.c<com.android.billingclient.api.a> m7192K(final Context context) {
        return rx.c.create(new rx.c.a() { // from class: l.sfj
            public final void call(Object obj) {
                igj.m7204f(context, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static rx.c<roj0> m7193L() {
        return CoreModule.c.j0.J5().observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.dgj
            public final Object call(Object obj) {
                return mkd0.p(vwb.Q(vwb.C(vwb.n((Collection) CoreModule.c.j0.E4().e(), new w9j() { // from class: l.ffj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!TextUtils.isEmpty(((Merchandise) obj2).defaultStockKeepUnit.affiliateProducts.googleplay));
                    }
                }), new w9j() { // from class: l.gfj
                    public final Object call(Object obj2) {
                        return String.valueOf(((Merchandise) obj2).autoRenewable());
                    }
                }).values(), new w9j() { // from class: l.hfj
                    public final Object call(Object obj2) {
                        ArrayList arrayList = (ArrayList) obj2;
                        return igj.m7197P(CoreModule.b, vwb.Q(arrayList, new w9j() { // from class: l.qfj
                            public final Object call(Object obj3) {
                                return ((Merchandise) obj3).defaultStockKeepUnit.affiliateProducts.googleplay;
                            }
                        }), ((Merchandise) arrayList.get(0)).autoRenewable(), 0L);
                    }
                }), new faj() { // from class: l.ifj
                    public final Object call(Object[] objArr) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static rx.c<List<Merchandise>> m7194M(@NonNull Context context, @NonNull final List<Merchandise> list) {
        return m7196O(context, vwb.Q(list, new w9j() { // from class: l.efj
            public final Object call(Object obj) {
                return ((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.googleplay;
            }
        }), list.get(0).autoRenewable(), 500L).map(new w9j() { // from class: l.pfj
            public final Object call(Object obj) {
                return igj.m7210l(list, (Optional) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static Merchandise m7195N(Merchandise merchandise, GPSkuDetails gPSkuDetails, List<GPSkuDetails> list, List<Merchandise> list2) {
        if (gPSkuDetails == null) {
            return merchandise;
        }
        Merchandise merchandiseM14136clone = merchandise.m14136clone();
        Prices prices = merchandiseM14136clone.defaultStockKeepUnit.prices;
        int i = list2.get(0).quantity;
        Iterator<Merchandise> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = it.next().quantity;
            if (i2 < i) {
                i = i2;
            }
        }
        long j = list.get(0).priceAmountMicros;
        Iterator<GPSkuDetails> it2 = list.iterator();
        while (it2.hasNext()) {
            long j2 = it2.next().priceAmountMicros;
            if (j2 < j) {
                j = j2;
            }
        }
        prices.originalUnitPrice = (j / 1000000.0d) / ((double) i);
        prices.currencySymbol = m7188G(gPSkuDetails.price);
        prices.currencyCode = gPSkuDetails.priceCurrencyCode;
        long j3 = gPSkuDetails.introductoryPriceAmountMicros;
        if (j3 <= 0 || j3 >= gPSkuDetails.priceAmountMicros) {
            j3 = gPSkuDetails.priceAmountMicros;
        }
        double d = j3 / 1000000.0d;
        double d2 = d / prices.price;
        prices.price = d;
        prices.unitPrice = d / ((double) merchandise.quantity);
        prices.originalPrice = Math.round((prices.originalPrice * d2) * 100.0d) / 100.0f;
        prices.noneRenewalPrice = d;
        prices.noneRenewalUnitPrice = d / ((double) merchandise.quantity);
        return merchandiseM14136clone;
    }

    /* JADX INFO: renamed from: O */
    public static rx.c<Optional<List<GPSkuDetails>>> m7196O(final Context context, final ArrayList<String> arrayList, final boolean z, final long j) {
        return f5132a.m7235h().materialize().take(1).map(new w9j() { // from class: l.agj
            public final Object call(Object obj) {
                return igj.m7183B((Notification) obj);
            }
        }).map(new w9j() { // from class: l.bgj
            public final Object call(Object obj) {
                return igj.m7184C(arrayList, (Optional) obj);
            }
        }).flatMap(new w9j() { // from class: l.cgj
            public final Object call(Object obj) {
                return igj.m7205g(context, arrayList, z, j, (Optional) obj);
            }
        }).take(1).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: P */
    public static rx.c<List<GPSkuDetails>> m7197P(Context context, final ArrayList<String> arrayList, final boolean z, long j) {
        rx.c<List<GPSkuDetails>> cVarFlatMap = (context instanceof PutongAct ? ((PutongAct) context).iap().h() : m7192K(context)).flatMap(new w9j() { // from class: l.ofj
            public final Object call(Object obj) {
                return igj.m7191J((com.android.billingclient.api.a) obj, z ? "subs" : "inapp", arrayList);
            }
        });
        return j > 0 ? cVarFlatMap.take(j, TimeUnit.MILLISECONDS) : cVarFlatMap;
    }

    /* JADX INFO: renamed from: Q */
    public static synchronized void m7198Q(final List<GPSkuDetails> list) {
        f5132a.m7235h().take(1).subscribe(mkd0.H(new e30() { // from class: l.wfj
            public final void call(Object obj) {
                igj.m7214p(list, (Optional) obj);
            }
        }, new e30() { // from class: l.xfj
            public final void call(Object obj) {
                igj.m7220v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7200b(ArrayList arrayList, String str, com.android.billingclient.api.a aVar, z3g0 z3g0Var) {
        WeakReference weakReference = new WeakReference(z3g0Var);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Triple<String, String, String> tripleM6388a = f4k.INSTANCE.m6388a((String) it.next());
            if (tripleM6388a.getFirst() != null) {
                hashSet.add((String) tripleM6388a.getFirst());
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(g.b.a().b((String) it2.next()).c(str).a());
        }
        aVar.h(g.a().b(arrayList2).a(), new C3348b(weakReference));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7201c(com.android.billingclient.api.a aVar, com.p1.mobile.android.app.c cVar) {
        if (NullChecker.a(aVar)) {
            aVar.c();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7204f(Context context, z3g0 z3g0Var) {
        final com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.g(context).b().d(new rcb0() { // from class: l.tfj
            /* JADX INFO: renamed from: d */
            public final void m9573d(d dVar, List list) {
                igj.m7224z(dVar, list);
            }
        }).a();
        aVarA.k(new C3347a(z3g0Var, aVarA));
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new w9j() { // from class: l.ufj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.m);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.vfj
                public final void call(Object obj) {
                    igj.m7201c(aVarA, (com.p1.mobile.android.app.c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ rx.c m7205g(Context context, ArrayList arrayList, boolean z, long j, Optional optional) {
        return optional.isPresent() ? rx.c.just(optional) : m7197P(context, arrayList, z, j).materialize().take(1).map(new w9j() { // from class: l.hgj
            public final Object call(Object obj) {
                return igj.m7208j((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Optional m7208j(Notification notification) {
        String simpleName;
        if (notification.h()) {
            o6j0.m8414n("e_purchase_products_request_success", "p_purchase_page", new o6j0.C3390a[0]);
            return Optional.of((List) notification.f());
        }
        String str = "unknown";
        if (notification.g()) {
            String message = notification.e().getMessage();
            if (NullChecker.a(message)) {
                String[] strArrSplit = TextUtils.split(message, "_");
                if (strArrSplit.length == 2) {
                    str = strArrSplit[0];
                    message = strArrSplit[1];
                }
                simpleName = message;
            } else {
                simpleName = notification.e().getClass().getSimpleName();
            }
        } else if (notification.i()) {
            str = "-4";
            simpleName = "timeout 500ms";
        } else {
            simpleName = "unknown";
        }
        o6j0.m8414n("e_purchase_products_request_failed", "p_purchase_page", o6j0.C3390a.m8422h("error_code", str), o6j0.C3390a.m8422h("error_message", simpleName));
        return Optional.absent();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ List m7210l(final List list, Optional optional) {
        if (!optional.isPresent()) {
            return list;
        }
        final List list2 = (List) optional.get();
        return vwb.Q(list, new w9j() { // from class: l.egj
            public final Object call(Object obj) {
                List list3 = list2;
                Merchandise merchandise = (Merchandise) obj;
                return igj.m7195N(merchandise, (GPSkuDetails) vwb.r(list3, new w9j() { // from class: l.ggj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay.equals(((GPSkuDetails) obj2).productId));
                    }
                }), list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GPSkuDetails m7211m(GPSkuDetails gPSkuDetails) {
        return gPSkuDetails;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m7214p(List list, Optional optional) {
        if (!optional.isPresent()) {
            f5132a.m7236i(list);
            return;
        }
        HashMap mapD = vwb.d((Collection) optional.get(), new w9j() { // from class: l.yfj
            public final Object call(Object obj) {
                return ((GPSkuDetails) obj).productId;
            }
        }, new w9j() { // from class: l.zfj
            public final Object call(Object obj) {
                return igj.m7211m((GPSkuDetails) obj);
            }
        });
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            GPSkuDetails gPSkuDetails = (GPSkuDetails) it.next();
            if (!mapD.containsKey(gPSkuDetails.productId) || !gPSkuDetails.equals(mapD.get(gPSkuDetails.productId))) {
                mapD.put(gPSkuDetails.productId, gPSkuDetails);
                z = true;
            }
        }
        if (z) {
            f5132a.m7236i(new ArrayList(mapD.values()));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m7219u(Notification notification) {
        if (notification.k()) {
            o6j0.m8414n("e_price_store_cache_all", "p_purchase_page", o6j0.C3390a.m8422h("price_cache_all_status", "success"));
            return Boolean.TRUE;
        }
        o6j0.m8414n("e_price_store_cache_all", "p_purchase_page", o6j0.C3390a.m8422h("price_cache_all_status", "failed"), o6j0.C3390a.m8422h("error_message", (!notification.j() || notification.e() == null) ? "unknown" : notification.e().getMessage()));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m7220v(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Boolean m7223y(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7224z(d dVar, List list) {
    }

    /* JADX INFO: renamed from: l.igj$c */
    public static class C3349c<T> {

        /* JADX INFO: renamed from: a */
        public final ggi<T> f5137a;

        /* JADX INFO: renamed from: b */
        public final a<Optional<T>> f5138b = a.b();

        public C3349c(String str, String str2, String str3, ProtobufAdapter<T> protobufAdapter) {
            this.f5137a = new ggi<>(new qnd(str, str2, str3), -1, protobufAdapter);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public T m7231d() {
            Optional optional;
            if (this.f5138b.i() && (optional = (Optional) this.f5138b.e()) != null && optional.isPresent()) {
                return (T) optional.get();
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m7232e(ggi.a aVar) {
            boolean zA = NullChecker.a(aVar);
            a<Optional<T>> aVar2 = this.f5138b;
            if (zA) {
                aVar2.onNext(Optional.of(aVar.a));
            } else {
                aVar2.onNext(Optional.absent());
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m7234g(Object obj) {
            this.f5137a.c();
            this.f5137a.p(obj);
        }

        /* JADX INFO: renamed from: h */
        public rx.c<Optional<T>> m7235h() {
            if (!this.f5138b.i()) {
                synchronized (this.f5138b) {
                    try {
                        if (!this.f5138b.i()) {
                            this.f5137a.k().compose(mkd0.Q()).subscribe(mkd0.H(new e30() { // from class: l.kgj
                                public final void call(Object obj) {
                                    this.f5653a.m7232e((ggi.a) obj);
                                }
                            }, new e30() { // from class: l.lgj
                                public final void call(Object obj) {
                                    this.f6151a.m7233f((Throwable) obj);
                                }
                            }));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f5138b;
        }

        /* JADX INFO: renamed from: i */
        public void m7236i(final T t) {
            this.f5138b.onNext(Optional.of(t));
            e51.y(new Runnable() { // from class: l.jgj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5323a.m7234g(t);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m7233f(Throwable th) {
        }
    }
}
