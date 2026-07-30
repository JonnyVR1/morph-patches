package p006l;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.IntlOperationArticles;
import com.p1.mobile.putong.data.IntlOperationBanner;
import com.p1.mobile.putong.data.IntlOperationEnvelope;
import com.p1.mobile.putong.data.UrlParentData;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import l.aaj;
import l.knb0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.stc0;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.y9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c6a extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f9381R;

    /* JADX INFO: renamed from: S */
    public uqd0 f9382S;

    /* JADX INFO: renamed from: T */
    public uqd0 f9383T;

    /* JADX INFO: renamed from: U */
    public a<List<IntlOperationBanner>> f9384U;

    /* JADX INFO: renamed from: V */
    public a<Integer> f9385V;

    /* JADX INFO: renamed from: W */
    public a<List<IntlOperationArticles>> f9386W;

    /* JADX INFO: renamed from: X */
    public a<Integer> f9387X;

    public c6a(C0158c c0158c) {
        super(c0158c);
        List list = Collections.EMPTY_LIST;
        this.f9384U = a.c(list);
        this.f9385V = a.c(0);
        this.f9386W = a.c(list);
        this.f9387X = a.c(0);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ knb0 m13210d3(List list, List list2, Integer num, Integer num2, String str) {
        return new knb0(list, list2, num, num2);
    }

    /* JADX INFO: renamed from: A3 */
    public c<roj0> m13216A3() {
        return mkd0.s(this.f9384U, this.f9386W, m13227n3(false).obs(), new y9j() { // from class: l.v5a
            /* JADX INFO: renamed from: a */
            public final Object m25764a(Object obj, Object obj2, Object obj3) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public IntlOperationArticles m13217B3() {
        if (!NullChecker.a(this.f9386W)) {
            return null;
        }
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.F((List) this.f9386W.e());
        if (!NullChecker.a(intlOperationArticles) || TextUtils.equals(intlOperationArticles.id, (CharSequence) m13227n3(false).get())) {
            return null;
        }
        return intlOperationArticles;
    }

    /* JADX INFO: renamed from: C3 */
    public void m13218C3() {
        m13228o3(false).put(Long.valueOf(mqi0.o()));
        m13222G3();
        this.f9385V.onNext(0);
        this.f9387X.onNext(0);
    }

    /* JADX INFO: renamed from: D3 */
    public c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> m13219D3() {
        return mkd0.u(this.f9384U, this.f9386W, this.f9385V, this.f9387X, m13229p3(false).obs(), new aaj() { // from class: l.s5a
            /* JADX INFO: renamed from: a */
            public final Object m23493a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return c6a.m13210d3((List) obj, (List) obj2, (Integer) obj3, (Integer) obj4, (String) obj5);
            }
        }).map(new w9j() { // from class: l.t5a
            public final Object call(Object obj) {
                return this.f21879a.m13231r3((knb0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m13220E3() {
        this.f8580Q.scheduled("intl_operation_articles", 0, new v9j() { // from class: l.u5a
            public final Object call() {
                return this.f23371a.m13234u3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m13221F3() {
        this.f8580Q.scheduled("intl_operation_banner", 0, new v9j() { // from class: l.w5a
            public final Object call() {
                return this.f24981a.m13237x3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m13222G3() {
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.F((List) this.f9386W.e());
        if (NullChecker.a(intlOperationArticles)) {
            m13229p3(false).put(intlOperationArticles.id);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m13223j3() {
        m13228o3(true);
        m13229p3(true);
        m13227n3(true);
        this.f9384U.onNext(Collections.EMPTY_LIST);
        m13221F3();
    }

    /* JADX INFO: renamed from: k3 */
    public void m13224k3() {
        m13221F3();
        m13220E3();
    }

    /* JADX INFO: renamed from: l3 */
    public void m13225l3() {
        Random random = new Random();
        List listM = (List) this.f9386W.e();
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.F(listM);
        if (NullChecker.a(intlOperationArticles)) {
            IntlOperationArticles intlOperationArticlesClone = intlOperationArticles.clone();
            intlOperationArticlesClone.id = String.valueOf(random.nextInt());
            listM.add(0, intlOperationArticlesClone);
        } else {
            IntlOperationArticles intlOperationArticles2 = new IntlOperationArticles();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationArticles2.title = "title:" + random.nextInt();
            intlOperationArticles2.cover = urlParentData;
            intlOperationArticles2.jumpUrl = m13230q3();
            intlOperationArticles2.id = String.valueOf(random.nextInt());
            listM = vwb.M(intlOperationArticles2);
        }
        this.f9386W.onNext(listM);
        this.f9387X.onNext(Integer.valueOf(((Integer) this.f9387X.e()).intValue() + 1));
    }

    /* JADX INFO: renamed from: m3 */
    public void m13226m3() {
        Random random = new Random();
        List list = (List) this.f9384U.e();
        IntlOperationBanner intlOperationBanner = (IntlOperationBanner) vwb.F(list);
        if (NullChecker.a(intlOperationBanner)) {
            IntlOperationBanner intlOperationBannerClone = intlOperationBanner.clone();
            intlOperationBannerClone.id = String.valueOf(random.nextInt());
            list.add(0, intlOperationBannerClone);
        } else {
            IntlOperationBanner intlOperationBanner2 = new IntlOperationBanner();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.icon = urlParentData;
            UrlParentData urlParentData2 = new UrlParentData();
            urlParentData2.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.banner = urlParentData2;
            intlOperationBanner2.jumpUrl = m13230q3();
            intlOperationBanner2.id = String.valueOf(random.nextInt());
            list.add(0, intlOperationBanner2);
        }
        this.f9384U.onNext(list);
        this.f9385V.onNext(Integer.valueOf(((Integer) this.f9385V.e()).intValue() + 1));
    }

    /* JADX INFO: renamed from: n3 */
    public final uqd0 m13227n3(boolean z) {
        if (z || this.f9383T == null) {
            this.f9383T = new uqd0("last_feed_clicked_articleid_" + CoreModule.m1850H().userId(), "");
        }
        return this.f9383T;
    }

    /* JADX INFO: renamed from: o3 */
    public final zpd0 m13228o3(boolean z) {
        if (z || this.f9381R == null) {
            this.f9381R = new zpd0("last_request_timestamp_" + CoreModule.m1850H().userId(), 0L);
        }
        return this.f9381R;
    }

    /* JADX INFO: renamed from: p3 */
    public final uqd0 m13229p3(boolean z) {
        if (z || this.f9382S == null) {
            this.f9382S = new uqd0("last_shown_dynamic_articleid_" + CoreModule.m1850H().userId(), "");
        }
        return this.f9382S;
    }

    /* JADX INFO: renamed from: q3 */
    public final String m13230q3() {
        return mu5.f17247B + "/intl-operation/banners/1?lang=zh-CN";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ knb0 m13231r3(knb0 knb0Var) {
        boolean z;
        List list = (List) knb0Var.a;
        List list2 = (List) knb0Var.b;
        Integer num = (Integer) knb0Var.c;
        Integer num2 = (Integer) knb0Var.d;
        boolean z2 = list.size() + list2.size() > 0;
        int iIntValue = num.intValue() + num2.intValue();
        IntlOperationBanner intlOperationBanner = (num.intValue() <= 0 || !NullChecker.a(vwb.F(list))) ? null : (IntlOperationBanner) vwb.F(list);
        if (!NullChecker.a(intlOperationBanner)) {
            IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.F(list2);
            z = num2.intValue() > 0 && NullChecker.a(intlOperationArticles) && !TextUtils.equals((CharSequence) m13229p3(false).get(), intlOperationArticles.id);
        }
        Objects.toString(intlOperationBanner);
        return new knb0(Boolean.valueOf(z2), Integer.valueOf(iIntValue), intlOperationBanner, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ stc0 m13232s3() {
        return C0154a.f3483P.auth().q(C0154a.m3250l0(CoreModule.m1850H().userId(), ((Long) m13228o3(false).get()).longValue())).f().b();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ roj0 m13233t3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f9386W.onNext(intlOperationEnvelope.data.intlArticles);
        this.f9387X.onNext(Integer.valueOf(intlOperationEnvelope.counters.intlArticles.unread));
        return roj0.a;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ c m13234u3() {
        return ia20.m16569c(new v9j() { // from class: l.a6a
            public final Object call() {
                return this.f8118a.m13232s3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new y5a()).map(new w9j() { // from class: l.b6a
            public final Object call(Object obj) {
                return this.f8744a.m13233t3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ stc0 m13235v3() {
        return C0154a.f3483P.auth().q(C0154a.m3254m0(CoreModule.m1850H().userId(), ((Long) m13228o3(false).get()).longValue())).f().b();
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m13236w3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f9384U.onNext(intlOperationEnvelope.data.intlBannerActivities);
        this.f9385V.onNext(Integer.valueOf(intlOperationEnvelope.counters.intlBannerActivities.unread));
        return roj0.a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ c m13237x3() {
        return ia20.m16569c(new v9j() { // from class: l.x5a
            public final Object call() {
                return this.f27354a.m13235v3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new y5a()).map(new w9j() { // from class: l.z5a
            public final Object call(Object obj) {
                return this.f28637a.m13236w3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m13238y3(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        if (i == 0) {
            m13218C3();
            context.startActivity(ura.m25555e().m25559d().m5783hs(context));
        } else if (i == 1) {
            context.startActivity(AccessTokenWebViewAct.Z1(context, "", intlOperationBanner.jumpUrl));
        } else {
            if (i != 2) {
                return;
            }
            m13227n3(false).put(intlOperationArticles.id);
            context.startActivity(AccessTokenWebViewAct.Z1(context, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public List<IntlOperationBanner> m13239z3() {
        return NullChecker.a(this.f9384U) ? (List) this.f9384U.e() : Collections.EMPTY_LIST;
    }
}
