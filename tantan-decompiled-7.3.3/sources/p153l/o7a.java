package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.IntlOperationEnvelope;
import com.p051p1.mobile.putong.data.UrlParentData;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class o7a extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f145247R;

    /* JADX INFO: renamed from: S */
    public wyd0 f145248S;

    /* JADX INFO: renamed from: T */
    public wyd0 f145249T;

    /* JADX INFO: renamed from: U */
    public C22507a<List<IntlOperationBanner>> f145250U;

    /* JADX INFO: renamed from: V */
    public C22507a<Integer> f145251V;

    /* JADX INFO: renamed from: W */
    public C22507a<List<IntlOperationArticles>> f145252W;

    /* JADX INFO: renamed from: X */
    public C22507a<Integer> f145253X;

    public o7a(C4883c c4883c) {
        super(c4883c);
        List list = Collections.EMPTY_LIST;
        this.f145250U = C22507a.m222759c(list);
        this.f145251V = C22507a.m222759c(0);
        this.f145252W = C22507a.m222759c(list);
        this.f145253X = C22507a.m222759c(0);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ ovb0 m166305d3(List list, List list2, Integer num, Integer num2, String str) {
        return new ovb0(list, list2, num, num2);
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<uxj0> m166311A3() {
        return psd0.m173626s(this.f145250U, this.f145252W, m166322n3(false).obs(), new scj() { // from class: l.h7a
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public IntlOperationArticles m166312B3() {
        if (!NullChecker.m82486a(this.f145252W)) {
            return null;
        }
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) jyb.m147475F(this.f145252W.m222761e());
        if (!NullChecker.m82486a(intlOperationArticles) || TextUtils.equals(intlOperationArticles.f39610id, m166322n3(false).get())) {
            return null;
        }
        return intlOperationArticles;
    }

    /* JADX INFO: renamed from: C3 */
    public void m166313C3() {
        m166323o3(false).put(Long.valueOf(pzi0.m174454o()));
        m166317G3();
        this.f145251V.m137019l(0);
        this.f145253X.m137019l(0);
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<ovb0<Boolean, Integer, IntlOperationBanner, Boolean>> m166314D3() {
        return psd0.m173628u(this.f145250U, this.f145252W, this.f145251V, this.f145253X, m166324p3(false).obs(), new ucj() { // from class: l.e7a
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return o7a.m166305d3((List) obj, (List) obj2, (Integer) obj3, (Integer) obj4, (String) obj5);
            }
        }).map(new qcj() { // from class: l.f7a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97549a.m166326r3((ovb0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m166315E3() {
        this.f91137Q.scheduled("intl_operation_articles", 0, new pcj() { // from class: l.g7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102521a.m166329u3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m166316F3() {
        this.f91137Q.scheduled("intl_operation_banner", 0, new pcj() { // from class: l.i7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f113247a.m166332x3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m166317G3() {
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) jyb.m147475F(this.f145252W.m222761e());
        if (NullChecker.m82486a(intlOperationArticles)) {
            m166324p3(false).put(intlOperationArticles.f39610id);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m166318j3() {
        m166323o3(true);
        m166324p3(true);
        m166322n3(true);
        this.f145250U.m137019l(Collections.EMPTY_LIST);
        m166316F3();
    }

    /* JADX INFO: renamed from: k3 */
    public void m166319k3() {
        m166316F3();
        m166315E3();
    }

    /* JADX INFO: renamed from: l3 */
    public void m166320l3() {
        Random random = new Random();
        List<IntlOperationArticles> listM222761e = this.f145252W.m222761e();
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) jyb.m147475F(listM222761e);
        if (NullChecker.m82486a(intlOperationArticles)) {
            IntlOperationArticles intlOperationArticlesMo225055clone = intlOperationArticles.mo225055clone();
            intlOperationArticlesMo225055clone.f39610id = String.valueOf(random.nextInt());
            listM222761e.add(0, intlOperationArticlesMo225055clone);
        } else {
            IntlOperationArticles intlOperationArticles2 = new IntlOperationArticles();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationArticles2.title = "title:" + random.nextInt();
            intlOperationArticles2.cover = urlParentData;
            intlOperationArticles2.jumpUrl = m166325q3();
            intlOperationArticles2.f39610id = String.valueOf(random.nextInt());
            listM222761e = jyb.m147482M(intlOperationArticles2);
        }
        this.f145252W.m137019l(listM222761e);
        this.f145253X.m137019l(Integer.valueOf(this.f145253X.m222761e().intValue() + 1));
    }

    /* JADX INFO: renamed from: m3 */
    public void m166321m3() {
        Random random = new Random();
        List<IntlOperationBanner> listM222761e = this.f145250U.m222761e();
        IntlOperationBanner intlOperationBanner = (IntlOperationBanner) jyb.m147475F(listM222761e);
        if (NullChecker.m82486a(intlOperationBanner)) {
            IntlOperationBanner intlOperationBannerMo225055clone = intlOperationBanner.mo225055clone();
            intlOperationBannerMo225055clone.f39611id = String.valueOf(random.nextInt());
            listM222761e.add(0, intlOperationBannerMo225055clone);
        } else {
            IntlOperationBanner intlOperationBanner2 = new IntlOperationBanner();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.icon = urlParentData;
            UrlParentData urlParentData2 = new UrlParentData();
            urlParentData2.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.banner = urlParentData2;
            intlOperationBanner2.jumpUrl = m166325q3();
            intlOperationBanner2.f39611id = String.valueOf(random.nextInt());
            listM222761e.add(0, intlOperationBanner2);
        }
        this.f145250U.m137019l(listM222761e);
        this.f145251V.m137019l(Integer.valueOf(this.f145251V.m222761e().intValue() + 1));
    }

    /* JADX INFO: renamed from: n3 */
    public final wyd0 m166322n3(boolean z) {
        if (z || this.f145249T == null) {
            this.f145249T = new wyd0("last_feed_clicked_articleid_" + CoreModule.m30929H().userId(), "");
        }
        return this.f145249T;
    }

    /* JADX INFO: renamed from: o3 */
    public final byd0 m166323o3(boolean z) {
        if (z || this.f145247R == null) {
            this.f145247R = new byd0("last_request_timestamp_" + CoreModule.m30929H().userId(), 0L);
        }
        return this.f145247R;
    }

    /* JADX INFO: renamed from: p3 */
    public final wyd0 m166324p3(boolean z) {
        if (z || this.f145248S == null) {
            this.f145248S = new wyd0("last_shown_dynamic_articleid_" + CoreModule.m30929H().userId(), "");
        }
        return this.f145248S;
    }

    /* JADX INFO: renamed from: q3 */
    public final String m166325q3() {
        return qv5.f159692B + "/intl-operation/banners/1?lang=zh-CN";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ ovb0 m166326r3(ovb0 ovb0Var) {
        boolean z;
        List list = (List) ovb0Var.f149248a;
        List list2 = (List) ovb0Var.f149249b;
        Integer num = (Integer) ovb0Var.f149250c;
        Integer num2 = (Integer) ovb0Var.f149251d;
        boolean z2 = list.size() + list2.size() > 0;
        int iIntValue = num.intValue() + num2.intValue();
        IntlOperationBanner intlOperationBanner = (num.intValue() <= 0 || !NullChecker.m82486a(jyb.m147475F(list))) ? null : (IntlOperationBanner) jyb.m147475F(list);
        if (!NullChecker.m82486a(intlOperationBanner)) {
            IntlOperationArticles intlOperationArticles = (IntlOperationArticles) jyb.m147475F(list2);
            z = num2.intValue() > 0 && NullChecker.m82486a(intlOperationArticles) && !TextUtils.equals(m166324p3(false).get(), intlOperationArticles.f39610id);
        }
        Objects.toString(intlOperationBanner);
        return new ovb0(Boolean.valueOf(z2), Integer.valueOf(iIntValue), intlOperationBanner, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ x1d0 m166327s3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32323l0(CoreModule.m30929H().userId(), m166323o3(false).get().longValue())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ uxj0 m166328t3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f145252W.m137019l(intlOperationEnvelope.data.intlArticles);
        this.f145253X.m137019l(Integer.valueOf(intlOperationEnvelope.counters.intlArticles.unread));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22421c m166329u3() {
        return qi20.m176656c(new pcj() { // from class: l.m7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f135064a.m166327s3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new k7a()).map(new qcj() { // from class: l.n7a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140585a.m166328t3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ x1d0 m166330v3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32327m0(CoreModule.m30929H().userId(), m166323o3(false).get().longValue())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ uxj0 m166331w3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f145250U.m137019l(intlOperationEnvelope.data.intlBannerActivities);
        this.f145251V.m137019l(Integer.valueOf(intlOperationEnvelope.counters.intlBannerActivities.unread));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22421c m166332x3() {
        return qi20.m176656c(new pcj() { // from class: l.j7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118657a.m166330v3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new k7a()).map(new qcj() { // from class: l.l7a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130332a.m166331w3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m166333y3(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        if (i == 0) {
            m166313C3();
            context.startActivity(gta.m132210e().m132214d().mo34849hs(context));
        } else if (i == 1) {
            context.startActivity(AccessTokenWebViewAct.m81333a2(context, "", intlOperationBanner.jumpUrl));
        } else {
            if (i != 2) {
                return;
            }
            m166322n3(false).put(intlOperationArticles.f39610id);
            context.startActivity(AccessTokenWebViewAct.m81333a2(context, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public List<IntlOperationBanner> m166334z3() {
        return NullChecker.m82486a(this.f145250U) ? this.f145250U.m222761e() : Collections.EMPTY_LIST;
    }
}
