package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.core.data.RealPicturesBanner;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class ij8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f113511R;

    /* JADX INFO: renamed from: S */
    public zpd0 f113512S;

    /* JADX INFO: renamed from: T */
    public zpd0 f113513T;

    /* JADX INFO: renamed from: U */
    public tpd0 f113514U;

    /* JADX INFO: renamed from: V */
    public tpd0 f113515V;

    /* JADX INFO: renamed from: W */
    public zpd0 f113516W;

    /* JADX INFO: renamed from: X */
    public tpd0 f113517X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f113518Y;

    /* JADX INFO: renamed from: Z */
    public tpd0 f113519Z;

    /* JADX INFO: renamed from: a0 */
    public zpd0 f113520a0;

    /* JADX INFO: renamed from: b0 */
    public tpd0 f113521b0;

    /* JADX INFO: renamed from: c0 */
    public zpd0 f113522c0;

    /* JADX INFO: renamed from: d0 */
    public tpd0 f113523d0;

    /* JADX INFO: renamed from: e0 */
    public tpd0 f113524e0;

    /* JADX INFO: renamed from: f0 */
    public zpd0 f113525f0;

    /* JADX INFO: renamed from: g0 */
    public tpd0 f113526g0;

    /* JADX INFO: renamed from: h0 */
    public zpd0 f113527h0;

    /* JADX INFO: renamed from: i0 */
    public final C22392a<j760<DatingGuideData, Boolean>> f113528i0;

    /* JADX INFO: renamed from: j0 */
    public final C22392a<RealPicturesBanner> f113529j0;

    /* JADX INFO: renamed from: k0 */
    public List<String> f113530k0;

    /* JADX INFO: renamed from: l0 */
    public int f113531l0;

    /* JADX INFO: renamed from: m0 */
    public long f113532m0;

    public ij8(C4732c c4732c) {
        super(c4732c);
        this.f113511R = new zpd0("last_show_dating_guide_time" + CoreModule.m29931H().userId(), 0L);
        this.f113512S = new zpd0("last_fetch_dating_guide_time" + CoreModule.m29931H().userId(), 0L);
        this.f113513T = new zpd0("last_show_swipe_guide_time" + CoreModule.m29931H().userId(), 0L);
        this.f113514U = new tpd0("leftSwipeGuideShowTimes" + CoreModule.m29931H().userId(), 0);
        this.f113515V = new tpd0("rightSwipeGuideShowTimes" + CoreModule.m29931H().userId(), 0);
        this.f113516W = new zpd0("ideal_guide_last_show_time_from_swipe" + CoreModule.m29931H().userId(), 0L);
        this.f113517X = new tpd0("ideal_guide_from_swipe_show_count" + CoreModule.m29931H().userId(), 0);
        this.f113518Y = new zpd0("ideal_dlg_guide_from_conv_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f113519Z = new tpd0("ideal_dlg_guide_from_conv_show_count" + CoreModule.m29931H().userId(), 0);
        this.f113520a0 = new zpd0("last_like_ideal_user_time" + CoreModule.m29931H().userId(), 0L);
        this.f113521b0 = new tpd0("like_ideal_user_count_today" + CoreModule.m29931H().userId(), 0);
        this.f113522c0 = new zpd0("ideal_dlg_guide_from_like_ideal_last_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f113523d0 = new tpd0("ideal_dlg_guide_from_like_ideal_show_count" + CoreModule.m29931H().userId(), 0);
        this.f113524e0 = new tpd0("ideal_fb_show_count" + CoreModule.m29931H().userId(), 0);
        this.f113525f0 = new zpd0("ideal_fb_show_time" + CoreModule.m29931H().userId(), 0L);
        this.f113526g0 = new tpd0("realPictureGuideShowCount" + CoreModule.m29931H().userId(), 0);
        this.f113527h0 = new zpd0("lastRealPictureGuideShowTime" + CoreModule.m29931H().userId(), 0L);
        this.f113528i0 = C22392a.m221512b();
        this.f113529j0 = C22392a.m221512b();
        this.f113530k0 = vwb.m200324f0(new String[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public void m136523m3() {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("茉莉花茶");
        datingGuideDataNew_.subTitles.add("可以闻得到春天的茶，上品饮茶，极品饮花");
        datingGuideDataNew_.button = "大佬喝茶";
        datingGuideDataNew_.deeplink = "tantan://profileEdit";
        datingGuideDataNew_.pictures.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlM2T08yRjI0UkxWWUo3WEdIVEhYWUtBVUdKMkFXNDE0IiwidyI6NTcxLCJoIjo1NzEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODI5NDkwMjQ3MDMwNjA3ODczfQ.png");
        this.f113528i0.m132487l(vwb.m200311Y(datingGuideDataNew_, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: n3 */
    public void m136524n3() {
        scheduled("fetch_my_tab_guide", 0, new v9j() { // from class: l.zi8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203307a.m136530t3();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public RealPicturesBanner m136525o3() {
        return this.f113529j0.m221515e();
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<List<IdealTag>> m136526p3(final String str) {
        return scheduled("ideal_guide_" + str, 0, new v9j() { // from class: l.hj8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.xi8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/dating/query/ideal-guide?scene=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.yi8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).idealDetails;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<RealPicturesBanner> m136527q3() {
        return scheduled("getRealPicturesBannerInfo", 0, new v9j() { // from class: l.aj8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f70093a.m136532v3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m136528r3(int i) {
        switch (i) {
            case 1:
                return mqi0.m155929D(this.f113513T.get().longValue()) || this.f113514U.get().intValue() >= CoreModule.m29935P().m94651a().mo158309T4();
            case 2:
                return mqi0.m155929D(this.f113513T.get().longValue()) || this.f113515V.get().intValue() >= CoreModule.m29935P().m94651a().mo158237H();
            case 3:
                return this.f113517X.get().intValue() >= CoreModule.m29935P().m94651a().mo158209B4() || mqi0.m155929D(this.f113516W.get().longValue());
            case 4:
                return this.f113519Z.get().intValue() >= CoreModule.m29935P().m94651a().mo158300S1() || mqi0.m155929D(this.f113518Y.get().longValue());
            case 5:
                return mqi0.m155929D(this.f113522c0.get().longValue()) || this.f113523d0.get().intValue() >= 3;
            case 6:
                return mqi0.m155929D(this.f113527h0.get().longValue()) || this.f113526g0.get().intValue() >= CoreModule.m29935P().m94651a().mo158311U0();
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ roj0 m136529s3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData.myTabGuide)) {
            this.f113528i0.m132487l(vwb.m200311Y(coreData.myTabGuide, Boolean.FALSE));
        }
        this.f113512S.put(Long.valueOf(mqi0.m155944o()));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22306c m136530t3() {
        return ia20.m135117a(new v9j() { // from class: l.fj8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/dating/my-tab-guide")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.gj8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103016a.m136529s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ RealPicturesBanner m136531u3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        RealPicturesBanner realPicturesBanner = coreData.realPicturesBanner;
        if (realPicturesBanner != null) {
            this.f113529j0.m132487l(realPicturesBanner);
        }
        return coreData.realPicturesBanner;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22306c m136532v3() {
        return ia20.m135117a(new v9j() { // from class: l.dj8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/real_pictures/banner")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.ej8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91676a.m136531u3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m136533w3() {
        if (NullChecker.m81303a(this.f113528i0.m221515e())) {
            C22392a<j760<DatingGuideData, Boolean>> c22392a = this.f113528i0;
            c22392a.m132487l(vwb.m200311Y(c22392a.m221515e().f116564a, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: x3 */
    public void m136534x3() {
        scheduled("mark_profile_guide_shown", -1, new v9j() { // from class: l.wi8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.bj8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/dating/profile-guide")).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.cj8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22306c<j760<DatingGuideData, Boolean>> m136535y3() {
        return this.f113528i0.asObservable();
    }

    /* JADX INFO: renamed from: z3 */
    public C22306c<RealPicturesBanner> m136536z3() {
        return this.f113529j0.asObservable();
    }
}
