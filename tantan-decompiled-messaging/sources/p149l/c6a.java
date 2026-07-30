package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.IntlOperationEnvelope;
import com.p046p1.mobile.putong.data.UrlParentData;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class c6a extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f79448R;

    /* JADX INFO: renamed from: S */
    public uqd0 f79449S;

    /* JADX INFO: renamed from: T */
    public uqd0 f79450T;

    /* JADX INFO: renamed from: U */
    public C22392a<List<IntlOperationBanner>> f79451U;

    /* JADX INFO: renamed from: V */
    public C22392a<Integer> f79452V;

    /* JADX INFO: renamed from: W */
    public C22392a<List<IntlOperationArticles>> f79453W;

    /* JADX INFO: renamed from: X */
    public C22392a<Integer> f79454X;

    public c6a(C4732c c4732c) {
        super(c4732c);
        List list = Collections.EMPTY_LIST;
        this.f79451U = C22392a.m221513c(list);
        this.f79452V = C22392a.m221513c(0);
        this.f79453W = C22392a.m221513c(list);
        this.f79454X = C22392a.m221513c(0);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ knb0 m105381d3(List list, List list2, Integer num, Integer num2, String str) {
        return new knb0(list, list2, num, num2);
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<roj0> m105387A3() {
        return mkd0.m154985s(this.f79451U, this.f79453W, m105398n3(false).obs(), new y9j() { // from class: l.v5a
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public IntlOperationArticles m105388B3() {
        if (!NullChecker.m81303a(this.f79453W)) {
            return null;
        }
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.m200292F(this.f79453W.m221515e());
        if (!NullChecker.m81303a(intlOperationArticles) || TextUtils.equals(intlOperationArticles.f38762id, m105398n3(false).get())) {
            return null;
        }
        return intlOperationArticles;
    }

    /* JADX INFO: renamed from: C3 */
    public void m105389C3() {
        m105399o3(false).put(Long.valueOf(mqi0.m155944o()));
        m105393G3();
        this.f79452V.m132487l(0);
        this.f79454X.m132487l(0);
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> m105390D3() {
        return mkd0.m154987u(this.f79451U, this.f79453W, this.f79452V, this.f79454X, m105400p3(false).obs(), new aaj() { // from class: l.s5a
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return c6a.m105381d3((List) obj, (List) obj2, (Integer) obj3, (Integer) obj4, (String) obj5);
            }
        }).map(new w9j() { // from class: l.t5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167795a.m105402r3((knb0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m105391E3() {
        this.f72126Q.scheduled("intl_operation_articles", 0, new v9j() { // from class: l.u5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f174689a.m105405u3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m105392F3() {
        this.f72126Q.scheduled("intl_operation_banner", 0, new v9j() { // from class: l.w5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f184654a.m105408x3();
            }
        }, false);
    }

    /* JADX INFO: renamed from: G3 */
    public void m105393G3() {
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.m200292F(this.f79453W.m221515e());
        if (NullChecker.m81303a(intlOperationArticles)) {
            m105400p3(false).put(intlOperationArticles.f38762id);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m105394j3() {
        m105399o3(true);
        m105400p3(true);
        m105398n3(true);
        this.f79451U.m132487l(Collections.EMPTY_LIST);
        m105392F3();
    }

    /* JADX INFO: renamed from: k3 */
    public void m105395k3() {
        m105392F3();
        m105391E3();
    }

    /* JADX INFO: renamed from: l3 */
    public void m105396l3() {
        Random random = new Random();
        List<IntlOperationArticles> listM221515e = this.f79453W.m221515e();
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.m200292F(listM221515e);
        if (NullChecker.m81303a(intlOperationArticles)) {
            IntlOperationArticles intlOperationArticlesMo223809clone = intlOperationArticles.mo223809clone();
            intlOperationArticlesMo223809clone.f38762id = String.valueOf(random.nextInt());
            listM221515e.add(0, intlOperationArticlesMo223809clone);
        } else {
            IntlOperationArticles intlOperationArticles2 = new IntlOperationArticles();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationArticles2.title = "title:" + random.nextInt();
            intlOperationArticles2.cover = urlParentData;
            intlOperationArticles2.jumpUrl = m105401q3();
            intlOperationArticles2.f38762id = String.valueOf(random.nextInt());
            listM221515e = vwb.m200299M(intlOperationArticles2);
        }
        this.f79453W.m132487l(listM221515e);
        this.f79454X.m132487l(Integer.valueOf(this.f79454X.m221515e().intValue() + 1));
    }

    /* JADX INFO: renamed from: m3 */
    public void m105397m3() {
        Random random = new Random();
        List<IntlOperationBanner> listM221515e = this.f79451U.m221515e();
        IntlOperationBanner intlOperationBanner = (IntlOperationBanner) vwb.m200292F(listM221515e);
        if (NullChecker.m81303a(intlOperationBanner)) {
            IntlOperationBanner intlOperationBannerMo223809clone = intlOperationBanner.mo223809clone();
            intlOperationBannerMo223809clone.f38763id = String.valueOf(random.nextInt());
            listM221515e.add(0, intlOperationBannerMo223809clone);
        } else {
            IntlOperationBanner intlOperationBanner2 = new IntlOperationBanner();
            UrlParentData urlParentData = new UrlParentData();
            urlParentData.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.icon = urlParentData;
            UrlParentData urlParentData2 = new UrlParentData();
            urlParentData2.url = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFCM1hOM041QlJCMjJHWkpQUEVJS1pJUzRQUlpUNjA3IiwidyI6NzE4LCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5NDA2OTA4ODE3MjMzODU2OTI4fQ";
            intlOperationBanner2.banner = urlParentData2;
            intlOperationBanner2.jumpUrl = m105401q3();
            intlOperationBanner2.f38763id = String.valueOf(random.nextInt());
            listM221515e.add(0, intlOperationBanner2);
        }
        this.f79451U.m132487l(listM221515e);
        this.f79452V.m132487l(Integer.valueOf(this.f79452V.m221515e().intValue() + 1));
    }

    /* JADX INFO: renamed from: n3 */
    public final uqd0 m105398n3(boolean z) {
        if (z || this.f79450T == null) {
            this.f79450T = new uqd0("last_feed_clicked_articleid_" + CoreModule.m29931H().userId(), "");
        }
        return this.f79450T;
    }

    /* JADX INFO: renamed from: o3 */
    public final zpd0 m105399o3(boolean z) {
        if (z || this.f79448R == null) {
            this.f79448R = new zpd0("last_request_timestamp_" + CoreModule.m29931H().userId(), 0L);
        }
        return this.f79448R;
    }

    /* JADX INFO: renamed from: p3 */
    public final uqd0 m105400p3(boolean z) {
        if (z || this.f79449S == null) {
            this.f79449S = new uqd0("last_shown_dynamic_articleid_" + CoreModule.m29931H().userId(), "");
        }
        return this.f79449S;
    }

    /* JADX INFO: renamed from: q3 */
    public final String m105401q3() {
        return mu5.f135728B + "/intl-operation/banners/1?lang=zh-CN";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ knb0 m105402r3(knb0 knb0Var) {
        boolean z;
        List list = (List) knb0Var.f123873a;
        List list2 = (List) knb0Var.f123874b;
        Integer num = (Integer) knb0Var.f123875c;
        Integer num2 = (Integer) knb0Var.f123876d;
        boolean z2 = list.size() + list2.size() > 0;
        int iIntValue = num.intValue() + num2.intValue();
        IntlOperationBanner intlOperationBanner = (num.intValue() <= 0 || !NullChecker.m81303a(vwb.m200292F(list))) ? null : (IntlOperationBanner) vwb.m200292F(list);
        if (!NullChecker.m81303a(intlOperationBanner)) {
            IntlOperationArticles intlOperationArticles = (IntlOperationArticles) vwb.m200292F(list2);
            z = num2.intValue() > 0 && NullChecker.m81303a(intlOperationArticles) && !TextUtils.equals(m105400p3(false).get(), intlOperationArticles.f38762id);
        }
        Objects.toString(intlOperationBanner);
        return new knb0(Boolean.valueOf(z2), Integer.valueOf(iIntValue), intlOperationBanner, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ stc0 m105403s3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31320l0(CoreModule.m29931H().userId(), m105399o3(false).get().longValue())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ roj0 m105404t3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f79453W.m132487l(intlOperationEnvelope.data.intlArticles);
        this.f79454X.m132487l(Integer.valueOf(intlOperationEnvelope.counters.intlArticles.unread));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22306c m105405u3() {
        return ia20.m135119c(new v9j() { // from class: l.a6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67750a.m105403s3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new y5a()).map(new w9j() { // from class: l.b6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73761a.m105404t3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ stc0 m105406v3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31324m0(CoreModule.m29931H().userId(), m105399o3(false).get().longValue())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m105407w3(IntlOperationEnvelope intlOperationEnvelope) {
        this.f79451U.m132487l(intlOperationEnvelope.data.intlBannerActivities);
        this.f79452V.m132487l(Integer.valueOf(intlOperationEnvelope.counters.intlBannerActivities.unread));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22306c m105408x3() {
        return ia20.m135119c(new v9j() { // from class: l.x5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f191101a.m105406v3();
            }
        }, IntlOperationEnvelope.JSON_ADAPTER).filter(new y5a()).map(new w9j() { // from class: l.z5a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201788a.m105407w3((IntlOperationEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public void m105409y3(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        if (i == 0) {
            m105389C3();
            context.startActivity(ura.m195053e().m195057d().mo33846hs(context));
        } else if (i == 1) {
            context.startActivity(AccessTokenWebViewAct.m80150Z1(context, "", intlOperationBanner.jumpUrl));
        } else {
            if (i != 2) {
                return;
            }
            m105398n3(false).put(intlOperationArticles.f38762id);
            context.startActivity(AccessTokenWebViewAct.m80150Z1(context, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public List<IntlOperationBanner> m105410z3() {
        return NullChecker.m81303a(this.f79451U) ? this.f79451U.m221515e() : Collections.EMPTY_LIST;
    }
}
