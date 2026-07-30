package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AbstractC0865a;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.C0875f;
import com.android.billingclient.api.C0877g;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.data.GPSkuDetails;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public final class igj {

    /* JADX INFO: renamed from: a */
    public static C17545c<List<GPSkuDetails>> f113123a = new C17545c<>("google_play_sku_details", null, null, ProtobufAdapter.ARRAY_ADAPTER(GPSkuDetails.PROTOBUF_ADAPTER));

    /* JADX INFO: renamed from: b */
    public static C22392a<List<Merchandise>> f113124b = C22392a.m221512b();

    /* JADX INFO: renamed from: l.igj$a */
    public class C17543a implements lx2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f113125a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0865a f113126b;

        public C17543a(z3g0 z3g0Var, AbstractC0865a abstractC0865a) {
            this.f113125a = z3g0Var;
            this.f113126b = abstractC0865a;
        }

        @Override // p149l.lx2
        /* JADX INFO: renamed from: a */
        public void mo5066a(C0871d c0871d) {
            int iM4966b = c0871d.m4966b();
            z3g0 z3g0Var = this.f113125a;
            if (iM4966b == 0) {
                z3g0Var.m132487l(this.f113126b);
            } else {
                z3g0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0871d.m4966b()), "_", c0871d.m4965a()).toString()));
            }
        }

        @Override // p149l.lx2
        /* JADX INFO: renamed from: c */
        public void mo5068c() {
            this.f113125a.onError(new RuntimeException(TextUtils.concat("-5", "_", "onBillingServiceDisconnected").toString()));
        }
    }

    /* JADX INFO: renamed from: l.igj$b */
    public class C17544b implements wd90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WeakReference f113127a;

        public C17544b(WeakReference weakReference) {
            this.f113127a = weakReference;
        }

        @Override // p149l.wd90
        /* JADX INFO: renamed from: a */
        public void mo136040a(@NonNull C0871d c0871d, @NonNull List<C0875f> list) {
            z3g0 z3g0Var = (z3g0) this.f113127a.get();
            if (NullChecker.m81303a(z3g0Var)) {
                if (c0871d.m4966b() != 0 || vwb.m200296J(list)) {
                    z3g0Var.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0871d.m4966b()), "_", c0871d.m4965a()).toString()));
                    return;
                }
                try {
                    if (TextUtils.isEmpty(CoreModule.f17545c.f19575I2)) {
                        String strM5016c = TextUtils.equals(list.get(0).m5001d(), SubSampleInformationBox.TYPE) ? list.get(0).m5002e().get(0).m5021d().m5017a().get(0).m5016c() : list.get(0).m4999b().m5010c();
                        C4732c c4732c = CoreModule.f17545c;
                        c4732c.f19575I2 = strM5016c;
                        c4732c.f19654j0.m30601O5(strM5016c);
                    }
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                for (C0875f c0875f : list) {
                    if (TextUtils.equals(list.get(0).m5001d(), SubSampleInformationBox.TYPE)) {
                        for (C0875f.e eVar : c0875f.m5002e()) {
                            C0875f.c cVar = eVar.m5021d().m5017a().get(0);
                            if (cVar != null) {
                                GPSkuDetails gPSkuDetailsNew_ = GPSkuDetails.new_();
                                gPSkuDetailsNew_.productId = c0875f.m5000c() + ":" + eVar.m5018a();
                                if (!TextUtils.isEmpty(eVar.m5019b())) {
                                    gPSkuDetailsNew_.productId += ":" + eVar.m5019b();
                                }
                                gPSkuDetailsNew_.type = c0875f.m5001d();
                                gPSkuDetailsNew_.price = cVar.m5014a();
                                gPSkuDetailsNew_.priceAmountMicros = cVar.m5015b();
                                gPSkuDetailsNew_.priceCurrencyCode = cVar.m5016c();
                                gPSkuDetailsNew_.title = c0875f.m5003f();
                                gPSkuDetailsNew_.description = c0875f.m4998a();
                                gPSkuDetailsNew_.introductoryPriceAmountMicros = cVar.m5015b();
                                arrayList.add(gPSkuDetailsNew_);
                            }
                        }
                    } else {
                        GPSkuDetails gPSkuDetailsNew_2 = GPSkuDetails.new_();
                        C0875f.b bVarM4999b = c0875f.m4999b();
                        gPSkuDetailsNew_2.productId = c0875f.m5000c();
                        gPSkuDetailsNew_2.type = c0875f.m5001d();
                        gPSkuDetailsNew_2.price = bVarM4999b.m5008a();
                        gPSkuDetailsNew_2.priceAmountMicros = bVarM4999b.m5009b();
                        gPSkuDetailsNew_2.priceCurrencyCode = bVarM4999b.m5010c();
                        gPSkuDetailsNew_2.title = c0875f.m5003f();
                        gPSkuDetailsNew_2.description = c0875f.m4998a();
                        gPSkuDetailsNew_2.introductoryPriceAmountMicros = bVarM4999b.m5009b();
                        arrayList.add(gPSkuDetailsNew_2);
                    }
                }
                z3g0Var.m132487l(arrayList);
                z3g0Var.onCompleted();
                igj.m136013Q(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Optional m135998B(Notification notification) {
        if (notification.m221300k()) {
            return (Optional) notification.m221295f();
        }
        if (notification.m221299j()) {
            CrashHelper.m81296c(notification.m221294e());
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Optional m135999C(ArrayList arrayList, Optional optional) {
        if (!optional.isPresent()) {
            o6j0.m162870n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C18854a.m162878h("price_cache_status", "miss"));
            return Optional.absent();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            GPSkuDetails gPSkuDetails = (GPSkuDetails) vwb.m200346r((Collection) optional.get(), new w9j() { // from class: l.jfj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((GPSkuDetails) obj).productId));
                }
            });
            if (gPSkuDetails == null) {
                o6j0.m162870n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C18854a.m162878h("price_cache_status", "miss"));
                return Optional.absent();
            }
            arrayList2.add(gPSkuDetails);
        }
        o6j0.m162870n("e_price_lookup_store_cache", "p_purchase_page", o6j0.C18854a.m162878h("price_cache_status", "hit"));
        o6j0.m162870n("e_purchase_products_request_success", "p_purchase_page", new o6j0.C18854a[0]);
        return Optional.m15413of(arrayList2);
    }

    /* JADX INFO: renamed from: F */
    public static void m136002F() {
        ConnectivityReceiver.m81290m().filter(new w9j() { // from class: l.kfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).flatMap(new w9j() { // from class: l.lfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136008L();
            }
        }).materialize().map(new w9j() { // from class: l.mfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136034u((Notification) obj);
            }
        }).takeFirst(new w9j() { // from class: l.nfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136038y((Boolean) obj);
            }
        }).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: G */
    public static String m136003G(String str) {
        return str.replaceAll("[0-9,\\.]", "").trim();
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public static String m136004H(@Nullable final String str) {
        GPSkuDetails gPSkuDetails;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<GPSkuDetails> listM136044d = f113123a.m136044d();
        if (vwb.m200296J(listM136044d) || (gPSkuDetails = (GPSkuDetails) vwb.m200346r(listM136044d, new w9j() { // from class: l.fgj
            @Override // p149l.w9j
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
    public static String m136005I(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        String strM136004H = m136004H(strTrim);
        if (!TextUtils.isEmpty(strM136004H)) {
            return strM136004H;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return m136004H(strTrim + ":" + str2.trim());
    }

    /* JADX INFO: renamed from: J */
    public static C22306c<List<GPSkuDetails>> m136006J(final AbstractC0865a abstractC0865a, final String str, final ArrayList<String> arrayList) {
        return C22306c.create(new C22306c.a() { // from class: l.rfj
            @Override // p149l.e30
            public final void call(Object obj) {
                igj.m136015b(arrayList, str, abstractC0865a, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<AbstractC0865a> m136007K(final Context context) {
        return C22306c.create(new C22306c.a() { // from class: l.sfj
            @Override // p149l.e30
            public final void call(Object obj) {
                igj.m136019f(context, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static C22306c<roj0> m136008L() {
        return CoreModule.f17545c.f19654j0.m30591J5().observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.dgj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mkd0.m154982p(vwb.m200303Q(vwb.m200289C(vwb.m200339n(CoreModule.f17545c.f19654j0.m30580E4().m221515e(), new w9j() { // from class: l.ffj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!TextUtils.isEmpty(((Merchandise) obj2).defaultStockKeepUnit.affiliateProducts.googleplay));
                    }
                }), new w9j() { // from class: l.gfj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return String.valueOf(((Merchandise) obj2).autoRenewable());
                    }
                }).values(), new w9j() { // from class: l.hfj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        ArrayList arrayList = (ArrayList) obj2;
                        return igj.m136012P(CoreModule.f17544b, vwb.m200303Q(arrayList, new w9j() { // from class: l.qfj
                            @Override // p149l.w9j
                            public final Object call(Object obj3) {
                                return ((Merchandise) obj3).defaultStockKeepUnit.affiliateProducts.googleplay;
                            }
                        }), ((Merchandise) arrayList.get(0)).autoRenewable(), 0L);
                    }
                }), new faj() { // from class: l.ifj
                    @Override // p149l.faj
                    public final Object call(Object[] objArr) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22306c<List<Merchandise>> m136009M(@NonNull Context context, @NonNull final List<Merchandise> list) {
        return m136011O(context, vwb.m200303Q(list, new w9j() { // from class: l.efj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Merchandise) obj).defaultStockKeepUnit.affiliateProducts.googleplay;
            }
        }), list.get(0).autoRenewable(), 500L).map(new w9j() { // from class: l.pfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136025l(list, (Optional) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static Merchandise m136010N(Merchandise merchandise, GPSkuDetails gPSkuDetails, List<GPSkuDetails> list, List<Merchandise> list2) {
        if (gPSkuDetails == null) {
            return merchandise;
        }
        Merchandise merchandiseMo223809clone = merchandise.mo223809clone();
        Prices prices = merchandiseMo223809clone.defaultStockKeepUnit.prices;
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
        prices.currencySymbol = m136003G(gPSkuDetails.price);
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
        return merchandiseMo223809clone;
    }

    /* JADX INFO: renamed from: O */
    public static C22306c<Optional<List<GPSkuDetails>>> m136011O(final Context context, final ArrayList<String> arrayList, final boolean z, final long j) {
        return f113123a.m136048h().materialize().take(1).map(new w9j() { // from class: l.agj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m135998B((Notification) obj);
            }
        }).map(new w9j() { // from class: l.bgj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m135999C(arrayList, (Optional) obj);
            }
        }).flatMap(new w9j() { // from class: l.cgj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136020g(context, arrayList, z, j, (Optional) obj);
            }
        }).take(1).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: P */
    public static C22306c<List<GPSkuDetails>> m136012P(Context context, final ArrayList<String> arrayList, final boolean z, long j) {
        C22306c c22306cFlatMap = (context instanceof PutongAct ? ((PutongAct) context).iap().m148932h() : m136007K(context)).flatMap(new w9j() { // from class: l.ofj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136006J((AbstractC0865a) obj, z ? SubSampleInformationBox.TYPE : "inapp", arrayList);
            }
        });
        return j > 0 ? c22306cFlatMap.take(j, TimeUnit.MILLISECONDS) : c22306cFlatMap;
    }

    /* JADX INFO: renamed from: Q */
    public static synchronized void m136013Q(final List<GPSkuDetails> list) {
        f113123a.m136048h().take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.wfj
            @Override // p149l.e30
            public final void call(Object obj) {
                igj.m136029p(list, (Optional) obj);
            }
        }, new e30() { // from class: l.xfj
            @Override // p149l.e30
            public final void call(Object obj) {
                igj.m136035v((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m136015b(ArrayList arrayList, String str, AbstractC0865a abstractC0865a, z3g0 z3g0Var) {
        WeakReference weakReference = new WeakReference(z3g0Var);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Triple<String, String, String> tripleM119322a = f4k.INSTANCE.m119322a((String) it.next());
            if (tripleM119322a.getFirst() != null) {
                hashSet.add(tripleM119322a.getFirst());
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C0877g.b.m5032a().m5038b((String) it2.next()).m5039c(str).m5037a());
        }
        abstractC0865a.mo4829h(C0877g.m5026a().m5031b(arrayList2).m5030a(), new C17544b(weakReference));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m136016c(AbstractC0865a abstractC0865a, C4319c c4319c) {
        if (NullChecker.m81303a(abstractC0865a)) {
            abstractC0865a.mo4825c();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m136019f(Context context, z3g0 z3g0Var) {
        final AbstractC0865a abstractC0865aM4834a = AbstractC0865a.m4822g(context).m4835b().m4837d(new rcb0() { // from class: l.tfj
            @Override // p149l.rcb0
            /* JADX INFO: renamed from: d */
            public final void mo5069d(C0871d c0871d, List list) {
                igj.m136039z(c0871d, list);
            }
        }).m4834a();
        abstractC0865aM4834a.mo4832k(new C17543a(z3g0Var, abstractC0865aM4834a));
        if (context instanceof Act) {
            ((Act) context).lifecycle().filter(new w9j() { // from class: l.ufj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.vfj
                @Override // p149l.e30
                public final void call(Object obj) {
                    igj.m136016c(abstractC0865aM4834a, (C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22306c m136020g(Context context, ArrayList arrayList, boolean z, long j, Optional optional) {
        return optional.isPresent() ? C22306c.just(optional) : m136012P(context, arrayList, z, j).materialize().take(1).map(new w9j() { // from class: l.hgj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136023j((Notification) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Optional m136023j(Notification notification) {
        String simpleName;
        if (notification.m221297h()) {
            o6j0.m162870n("e_purchase_products_request_success", "p_purchase_page", new o6j0.C18854a[0]);
            return Optional.m15413of((List) notification.m221295f());
        }
        String str = "unknown";
        if (notification.m221296g()) {
            String message = notification.m221294e().getMessage();
            if (NullChecker.m81303a(message)) {
                String[] strArrSplit = TextUtils.split(message, "_");
                if (strArrSplit.length == 2) {
                    str = strArrSplit[0];
                    message = strArrSplit[1];
                }
                simpleName = message;
            } else {
                simpleName = notification.m221294e().getClass().getSimpleName();
            }
        } else if (notification.m221298i()) {
            str = "-4";
            simpleName = "timeout 500ms";
        } else {
            simpleName = "unknown";
        }
        o6j0.m162870n("e_purchase_products_request_failed", "p_purchase_page", o6j0.C18854a.m162878h(StateEvent.Name.ERROR_CODE, str), o6j0.C18854a.m162878h("error_message", simpleName));
        return Optional.absent();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ List m136025l(final List list, Optional optional) {
        if (!optional.isPresent()) {
            return list;
        }
        final List list2 = (List) optional.get();
        return vwb.m200303Q(list, new w9j() { // from class: l.egj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                List list3 = list2;
                Merchandise merchandise = (Merchandise) obj;
                return igj.m136010N(merchandise, (GPSkuDetails) vwb.m200346r(list3, new w9j() { // from class: l.ggj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay.equals(((GPSkuDetails) obj2).productId));
                    }
                }), list3, list);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GPSkuDetails m136026m(GPSkuDetails gPSkuDetails) {
        return gPSkuDetails;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m136029p(List list, Optional optional) {
        if (!optional.isPresent()) {
            f113123a.m136049i(list);
            return;
        }
        HashMap mapM200319d = vwb.m200319d((Collection) optional.get(), new w9j() { // from class: l.yfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GPSkuDetails) obj).productId;
            }
        }, new w9j() { // from class: l.zfj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return igj.m136026m((GPSkuDetails) obj);
            }
        });
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            GPSkuDetails gPSkuDetails = (GPSkuDetails) it.next();
            if (!mapM200319d.containsKey(gPSkuDetails.productId) || !gPSkuDetails.equals(mapM200319d.get(gPSkuDetails.productId))) {
                mapM200319d.put(gPSkuDetails.productId, gPSkuDetails);
                z = true;
            }
        }
        if (z) {
            f113123a.m136049i(new ArrayList(mapM200319d.values()));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m136034u(Notification notification) {
        if (notification.m221300k()) {
            o6j0.m162870n("e_price_store_cache_all", "p_purchase_page", o6j0.C18854a.m162878h("price_cache_all_status", "success"));
            return Boolean.TRUE;
        }
        o6j0.m162870n("e_price_store_cache_all", "p_purchase_page", o6j0.C18854a.m162878h("price_cache_all_status", "failed"), o6j0.C18854a.m162878h("error_message", (!notification.m221299j() || notification.m221294e() == null) ? "unknown" : notification.m221294e().getMessage()));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m136035v(Throwable th) {
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Boolean m136038y(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m136039z(C0871d c0871d, List list) {
    }

    /* JADX INFO: renamed from: l.igj$c */
    public static class C17545c<T> {

        /* JADX INFO: renamed from: a */
        public final ggi<T> f113128a;

        /* JADX INFO: renamed from: b */
        public final C22392a<Optional<T>> f113129b = C22392a.m221512b();

        public C17545c(String str, String str2, String str3, ProtobufAdapter<T> protobufAdapter) {
            this.f113128a = new ggi<>(new qnd(str, str2, str3), -1, protobufAdapter);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public T m136044d() {
            Optional<T> optionalM221515e;
            if (this.f113129b.m221519i() && (optionalM221515e = this.f113129b.m221515e()) != null && optionalM221515e.isPresent()) {
                return optionalM221515e.get();
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m136045e(ggi.C17074a c17074a) {
            boolean zM81303a = NullChecker.m81303a(c17074a);
            C22392a<Optional<T>> c22392a = this.f113129b;
            if (zM81303a) {
                c22392a.m132487l(Optional.m15413of(c17074a.f102512a));
            } else {
                c22392a.m132487l(Optional.absent());
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m136047g(Object obj) {
            this.f113128a.m125967c();
            this.f113128a.m125978p(obj);
        }

        /* JADX INFO: renamed from: h */
        public C22306c<Optional<T>> m136048h() {
            if (!this.f113129b.m221519i()) {
                synchronized (this.f113129b) {
                    try {
                        if (!this.f113129b.m221519i()) {
                            this.f113128a.m125973k().compose(mkd0.m154965Q()).subscribe(mkd0.m154956H(new e30() { // from class: l.kgj
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    this.f123038a.m136045e((ggi.C17074a) obj);
                                }
                            }, new e30() { // from class: l.lgj
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    this.f127995a.m136046f((Throwable) obj);
                                }
                            }));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f113129b;
        }

        /* JADX INFO: renamed from: i */
        public void m136049i(final T t) {
            this.f113129b.m132487l(Optional.m15413of(t));
            e51.m114774y(new Runnable() { // from class: l.jgj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117793a.m136047g(t);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m136046f(Throwable th) {
        }
    }
}
