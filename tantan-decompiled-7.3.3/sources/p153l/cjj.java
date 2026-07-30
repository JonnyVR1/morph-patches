package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AbstractC0869a;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.C0879f;
import com.android.billingclient.api.C0881g;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.data.GPSkuDetails;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public final class cjj {

    /* JADX INFO: renamed from: a */
    public static C16285c<List<GPSkuDetails>> f82166a = new C16285c<>("google_play_sku_details", null, null, ProtobufAdapter.ARRAY_ADAPTER(GPSkuDetails.PROTOBUF_ADAPTER));

    /* JADX INFO: renamed from: b */
    public static C22507a<List<Merchandise>> f82167b = C22507a.m222758b();

    /* JADX INFO: renamed from: l.cjj$a */
    public class C16283a implements ay2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f82168a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0869a f82169b;

        public C16283a(gcg0 gcg0Var, AbstractC0869a abstractC0869a) {
            this.f82168a = gcg0Var;
            this.f82169b = abstractC0869a;
        }

        @Override // p153l.ay2
        /* JADX INFO: renamed from: a */
        public void mo5076a(C0875d c0875d) {
            int iM4976b = c0875d.m4976b();
            gcg0 gcg0Var = this.f82168a;
            if (iM4976b == 0) {
                gcg0Var.m137019l(this.f82169b);
            } else {
                gcg0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0875d.m4976b()), "_", c0875d.m4975a()).toString()));
            }
        }

        @Override // p153l.ay2
        /* JADX INFO: renamed from: c */
        public void mo5078c() {
            this.f82168a.onError(new RuntimeException(TextUtils.concat("-5", "_", "onBillingServiceDisconnected").toString()));
        }
    }

    /* JADX INFO: renamed from: l.cjj$b */
    public class C16284b implements am90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f82170a;

        public C16284b(WeakReference weakReference) {
            this.f82170a = weakReference;
        }

        @Override // p153l.am90
        /* JADX INFO: renamed from: a */
        public void mo98817a(@NonNull C0875d c0875d, @NonNull List<C0879f> list) {
            gcg0 gcg0Var = (gcg0) this.f82170a.get();
            if (NullChecker.m82486a(gcg0Var)) {
                if (c0875d.m4976b() != 0 || jyb.m147479J(list)) {
                    gcg0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0875d.m4976b()), "_", c0875d.m4975a()).toString()));
                    return;
                }
                try {
                    if (TextUtils.isEmpty(CoreModule.f18264c.f20317I2)) {
                        String strM5026c = TextUtils.equals(list.get(0).m5011d(), SubSampleInformationBox.TYPE) ? list.get(0).m5012e().get(0).m5031d().m5027a().get(0).m5026c() : list.get(0).m5009b().m5020c();
                        C4883c c4883c = CoreModule.f18264c;
                        c4883c.f20317I2 = strM5026c;
                        c4883c.f20396j0.m31604O5(strM5026c);
                    }
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                for (C0879f c0879f : list) {
                    if (TextUtils.equals(list.get(0).m5011d(), SubSampleInformationBox.TYPE)) {
                        for (C0879f.e eVar : c0879f.m5012e()) {
                            C0879f.c cVar = eVar.m5031d().m5027a().get(0);
                            if (cVar != null) {
                                GPSkuDetails gPSkuDetailsNew_ = GPSkuDetails.new_();
                                gPSkuDetailsNew_.productId = c0879f.m5010c() + ":" + eVar.m5028a();
                                if (!TextUtils.isEmpty(eVar.m5029b())) {
                                    gPSkuDetailsNew_.productId += ":" + eVar.m5029b();
                                }
                                gPSkuDetailsNew_.type = c0879f.m5011d();
                                gPSkuDetailsNew_.price = cVar.m5024a();
                                gPSkuDetailsNew_.priceAmountMicros = cVar.m5025b();
                                gPSkuDetailsNew_.priceCurrencyCode = cVar.m5026c();
                                gPSkuDetailsNew_.title = c0879f.m5013f();
                                gPSkuDetailsNew_.description = c0879f.m5008a();
                                gPSkuDetailsNew_.introductoryPriceAmountMicros = cVar.m5025b();
                                arrayList.add(gPSkuDetailsNew_);
                            }
                        }
                    } else {
                        GPSkuDetails gPSkuDetailsNew_2 = GPSkuDetails.new_();
                        C0879f.b bVarM5009b = c0879f.m5009b();
                        gPSkuDetailsNew_2.productId = c0879f.m5010c();
                        gPSkuDetailsNew_2.type = c0879f.m5011d();
                        gPSkuDetailsNew_2.price = bVarM5009b.m5018a();
                        gPSkuDetailsNew_2.priceAmountMicros = bVarM5009b.m5019b();
                        gPSkuDetailsNew_2.priceCurrencyCode = bVarM5009b.m5020c();
                        gPSkuDetailsNew_2.title = c0879f.m5013f();
                        gPSkuDetailsNew_2.description = c0879f.m5008a();
                        gPSkuDetailsNew_2.introductoryPriceAmountMicros = bVarM5009b.m5019b();
                        arrayList.add(gPSkuDetailsNew_2);
                    }
                }
                gcg0Var.m137019l(arrayList);
                gcg0Var.onCompleted();
                cjj.m110209Q(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Optional m110194B(Notification notification) {
        if (notification.m222546k()) {
            return (Optional) notification.m222541f();
        }
        if (notification.m222545j()) {
            CrashHelper.m82479c(notification.m222540e());
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Optional m110195C(ArrayList arrayList, Optional optional) {
        if (!optional.isPresent()) {
            sfj0.m185607n("e_price_lookup_store_cache", "p_purchase_page", sfj0.C20032a.m185615h("price_cache_status", "miss"));
            return Optional.absent();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            GPSkuDetails gPSkuDetails = (GPSkuDetails) jyb.m147529r((Collection) optional.get(), new qcj() { // from class: l.dij
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((GPSkuDetails) obj).productId));
                }
            });
            if (gPSkuDetails == null) {
                sfj0.m185607n("e_price_lookup_store_cache", "p_purchase_page", sfj0.C20032a.m185615h("price_cache_status", "miss"));
                return Optional.absent();
            }
            arrayList2.add(gPSkuDetails);
        }
        sfj0.m185607n("e_price_lookup_store_cache", "p_purchase_page", sfj0.C20032a.m185615h("price_cache_status", "hit"));
        sfj0.m185607n("e_purchase_products_request_success", "p_purchase_page", new sfj0.C20032a[0]);
        return Optional.m15467of(arrayList2);
    }

    /* JADX INFO: renamed from: F */
    public static void m110198F() {
        ConnectivityReceiver.m82473m().filter(new qcj() { // from class: l.eij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).flatMap(new qcj() { // from class: l.fij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110204L();
            }
        }).materialize().map(new qcj() { // from class: l.gij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110230u((Notification) obj);
            }
        }).takeFirst(new qcj() { // from class: l.hij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110234y((Boolean) obj);
            }
        }).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: G */
    public static String m110199G(String str) {
        return str.replaceAll("[0-9,\\.]", "").trim();
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public static String m110200H(@Nullable final String str) {
        GPSkuDetails gPSkuDetails;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<GPSkuDetails> listM110239d = f82166a.m110239d();
        if (jyb.m147479J(listM110239d) || (gPSkuDetails = (GPSkuDetails) jyb.m147529r(listM110239d, new qcj() { // from class: l.zij
            @Override // p153l.qcj
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
    public static String m110201I(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        String strM110200H = m110200H(strTrim);
        if (!TextUtils.isEmpty(strM110200H)) {
            return strM110200H;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return m110200H(strTrim + ":" + str2.trim());
    }

    /* JADX INFO: renamed from: J */
    public static C22421c<List<GPSkuDetails>> m110202J(final AbstractC0869a abstractC0869a, final String str, final ArrayList<String> arrayList) {
        return C22421c.create(new C22421c.a() { // from class: l.lij
            @Override // p153l.y20
            public final void call(Object obj) {
                cjj.m110211b(arrayList, str, abstractC0869a, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<AbstractC0869a> m110203K(final Context context) {
        return C22421c.create(new C22421c.a() { // from class: l.mij
            @Override // p153l.y20
            public final void call(Object obj) {
                cjj.m110215f(context, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static C22421c<uxj0> m110204L() {
        return CoreModule.f18264c.f20396j0.m31594J5().observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.xij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return psd0.m173623p(jyb.m147486Q(jyb.m147472C(jyb.m147522n(CoreModule.f18264c.f20396j0.m31583E4().m222761e(), new qcj() { // from class: l.zhj
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!TextUtils.isEmpty(((Merchandise) obj2).defaultStockKeepUnit.affiliateProducts.googleplay));
                    }
                }), new qcj() { // from class: l.aij
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return String.valueOf(((Merchandise) obj2).autoRenewable());
                    }
                }).values(), new qcj() { // from class: l.bij
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        ArrayList arrayList = (ArrayList) obj2;
                        return cjj.m110208P(CoreModule.f18263b, jyb.m147486Q(arrayList, new qcj() { // from class: l.kij
                            @Override // p153l.qcj
                            public final Object call(Object obj3) {
                                return ((Merchandise) obj3).defaultStockKeepUnit.affiliateProducts.googleplay;
                            }
                        }), ((Merchandise) arrayList.get(0)).autoRenewable(), 0L);
                    }
                }), new zcj() { // from class: l.cij
                    @Override // p153l.zcj
                    public final Object call(Object[] objArr) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22421c<List<Merchandise>> m110205M(@NonNull Context context, @NonNull final List<Merchandise> list) {
        return m110207O(context, jyb.m147486Q(list, new qcj() { // from class: l.yhj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.googleplay;
            }
        }), list.get(0).autoRenewable(), 500L).map(new qcj() { // from class: l.jij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110221l(list, (Optional) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static Merchandise m110206N(Merchandise merchandise, GPSkuDetails gPSkuDetails, List<GPSkuDetails> list, List<Merchandise> list2) {
        if (gPSkuDetails == null) {
            return merchandise;
        }
        Merchandise merchandiseMo225055clone = merchandise.mo225055clone();
        Prices prices = merchandiseMo225055clone.defaultStockKeepUnit.prices;
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
        prices.currencySymbol = m110199G(gPSkuDetails.price);
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
        return merchandiseMo225055clone;
    }

    /* JADX INFO: renamed from: O */
    public static C22421c<Optional<List<GPSkuDetails>>> m110207O(final Context context, final ArrayList<String> arrayList, final boolean z, final long j) {
        return f82166a.m110243h().materialize().take(1).map(new qcj() { // from class: l.uij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110194B((Notification) obj);
            }
        }).map(new qcj() { // from class: l.vij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110195C(arrayList, (Optional) obj);
            }
        }).flatMap(new qcj() { // from class: l.wij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110216g(context, arrayList, z, j, (Optional) obj);
            }
        }).take(1).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: P */
    public static C22421c<List<GPSkuDetails>> m110208P(Context context, final ArrayList<String> arrayList, final boolean z, long j) {
        C22421c c22421cFlatMap = (context instanceof PutongAct ? ((PutongAct) context).iap().m103294h() : m110203K(context)).flatMap(new qcj() { // from class: l.iij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110202J((AbstractC0869a) obj, z ? SubSampleInformationBox.TYPE : "inapp", arrayList);
            }
        });
        return j > 0 ? c22421cFlatMap.take(j, TimeUnit.MILLISECONDS) : c22421cFlatMap;
    }

    /* JADX INFO: renamed from: Q */
    public static synchronized void m110209Q(final List<GPSkuDetails> list) {
        f82166a.m110243h().take(1).subscribe(psd0.m173597H(new y20() { // from class: l.qij
            @Override // p153l.y20
            public final void call(Object obj) {
                cjj.m110225p(list, (Optional) obj);
            }
        }, new y20() { // from class: l.rij
            @Override // p153l.y20
            public final void call(Object obj) {
                cjj.m110231v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m110211b(ArrayList arrayList, String str, AbstractC0869a abstractC0869a, gcg0 gcg0Var) {
        WeakReference weakReference = new WeakReference(gcg0Var);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Triple<String, String, String> tripleM209506a = x6k.INSTANCE.m209506a((String) it.next());
            if (tripleM209506a.getFirst() != null) {
                hashSet.add(tripleM209506a.getFirst());
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C0881g.b.m5042a().m5048b((String) it2.next()).m5049c(str).m5047a());
        }
        abstractC0869a.mo4839h(C0881g.m5036a().m5041b(arrayList2).m5040a(), new C16284b(weakReference));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m110212c(AbstractC0869a abstractC0869a, C4470c c4470c) {
        if (NullChecker.m82486a(abstractC0869a)) {
            abstractC0869a.mo4835c();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m110215f(Context context, gcg0 gcg0Var) {
        final AbstractC0869a abstractC0869aM4844a = AbstractC0869a.m4832g(context).m4845b().m4847d(new vkb0() { // from class: l.nij
            @Override // p153l.vkb0
            /* JADX INFO: renamed from: d */
            public final void mo5079d(C0875d c0875d, List list) {
                cjj.m110235z(c0875d, list);
            }
        }).m4844a();
        abstractC0869aM4844a.mo4842k(new C16283a(gcg0Var, abstractC0869aM4844a));
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new qcj() { // from class: l.oij
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.pij
                @Override // p153l.y20
                public final void call(Object obj) {
                    cjj.m110212c(abstractC0869aM4844a, (C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22421c m110216g(Context context, ArrayList arrayList, boolean z, long j, Optional optional) {
        return optional.isPresent() ? C22421c.just(optional) : m110208P(context, arrayList, z, j).materialize().take(1).map(new qcj() { // from class: l.bjj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110219j((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Optional m110219j(Notification notification) {
        String simpleName;
        if (notification.m222543h()) {
            sfj0.m185607n("e_purchase_products_request_success", "p_purchase_page", new sfj0.C20032a[0]);
            return Optional.m15467of((List) notification.m222541f());
        }
        String str = "unknown";
        if (notification.m222542g()) {
            String message = notification.m222540e().getMessage();
            if (NullChecker.m82486a(message)) {
                String[] strArrSplit = TextUtils.split(message, "_");
                if (strArrSplit.length == 2) {
                    str = strArrSplit[0];
                    message = strArrSplit[1];
                }
                simpleName = message;
            } else {
                simpleName = notification.m222540e().getClass().getSimpleName();
            }
        } else if (notification.m222544i()) {
            str = "-4";
            simpleName = "timeout 500ms";
        } else {
            simpleName = "unknown";
        }
        sfj0.m185607n("e_purchase_products_request_failed", "p_purchase_page", sfj0.C20032a.m185615h(StateEvent.Name.ERROR_CODE, str), sfj0.C20032a.m185615h("error_message", simpleName));
        return Optional.absent();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ List m110221l(final List list, Optional optional) {
        if (!optional.isPresent()) {
            return list;
        }
        final List list2 = (List) optional.get();
        return jyb.m147486Q(list, new qcj() { // from class: l.yij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                List list3 = list2;
                Merchandise merchandise = (Merchandise) obj;
                return cjj.m110206N(merchandise, (GPSkuDetails) jyb.m147529r(list3, new qcj() { // from class: l.ajj
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay.equals(((GPSkuDetails) obj2).productId));
                    }
                }), list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GPSkuDetails m110222m(GPSkuDetails gPSkuDetails) {
        return gPSkuDetails;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m110225p(List list, Optional optional) {
        if (!optional.isPresent()) {
            f82166a.m110244i(list);
            return;
        }
        HashMap mapM147502d = jyb.m147502d((Collection) optional.get(), new qcj() { // from class: l.sij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GPSkuDetails) obj).productId;
            }
        }, new qcj() { // from class: l.tij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjj.m110222m((GPSkuDetails) obj);
            }
        });
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            GPSkuDetails gPSkuDetails = (GPSkuDetails) it.next();
            if (!mapM147502d.containsKey(gPSkuDetails.productId) || !gPSkuDetails.equals(mapM147502d.get(gPSkuDetails.productId))) {
                mapM147502d.put(gPSkuDetails.productId, gPSkuDetails);
                z = true;
            }
        }
        if (z) {
            f82166a.m110244i(new ArrayList(mapM147502d.values()));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m110230u(Notification notification) {
        if (notification.m222546k()) {
            sfj0.m185607n("e_price_store_cache_all", "p_purchase_page", sfj0.C20032a.m185615h("price_cache_all_status", "success"));
            return Boolean.TRUE;
        }
        sfj0.m185607n("e_price_store_cache_all", "p_purchase_page", sfj0.C20032a.m185615h("price_cache_all_status", "failed"), sfj0.C20032a.m185615h("error_message", (!notification.m222545j() || notification.m222540e() == null) ? "unknown" : notification.m222540e().getMessage()));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m110231v(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Boolean m110234y(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m110235z(C0875d c0875d, List list) {
    }

    /* JADX INFO: renamed from: l.cjj$c */
    public static class C16285c<T> {

        /* JADX INFO: renamed from: a */
        public final dji<T> f82171a;

        /* JADX INFO: renamed from: b */
        public final C22507a<Optional<T>> f82172b = C22507a.m222758b();

        public C16285c(String str, String str2, String str3, ProtobufAdapter<T> protobufAdapter) {
            this.f82171a = new dji<>(new vod(str, str2, str3), -1, protobufAdapter);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public T m110239d() {
            Optional<T> optionalM222761e;
            if (this.f82172b.m222765i() && (optionalM222761e = this.f82172b.m222761e()) != null && optionalM222761e.isPresent()) {
                return optionalM222761e.get();
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m110240e(dji.C16549a c16549a) {
            boolean zM82486a = NullChecker.m82486a(c16549a);
            C22507a<Optional<T>> c22507a = this.f82172b;
            if (zM82486a) {
                c22507a.m137019l(Optional.m15467of(c16549a.f88861a));
            } else {
                c22507a.m137019l(Optional.absent());
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m110242g(Object obj) {
            this.f82171a.m116099c();
            this.f82171a.m116110p(obj);
        }

        /* JADX INFO: renamed from: h */
        public C22421c<Optional<T>> m110243h() {
            if (!this.f82172b.m222765i()) {
                synchronized (this.f82172b) {
                    try {
                        if (!this.f82172b.m222765i()) {
                            this.f82171a.m116105k().compose(psd0.m173606Q()).subscribe(psd0.m173597H(new y20() { // from class: l.ejj
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    this.f94307a.m110240e((dji.C16549a) obj);
                                }
                            }, new y20() { // from class: l.fjj
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    this.f99338a.m110241f((Throwable) obj);
                                }
                            }));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f82172b;
        }

        /* JADX INFO: renamed from: i */
        public void m110244i(final T t) {
            this.f82172b.m137019l(Optional.m15467of(t));
            l51.m152919y(new Runnable() { // from class: l.djj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88866a.m110242g(t);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m110241f(Throwable th) {
        }
    }
}
