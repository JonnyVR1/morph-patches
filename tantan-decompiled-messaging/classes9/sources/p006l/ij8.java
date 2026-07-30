package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.putong.core.data.RealPicturesBanner;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ij8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f14502R;

    /* JADX INFO: renamed from: S */
    public zpd0 f14503S;

    /* JADX INFO: renamed from: T */
    public zpd0 f14504T;

    /* JADX INFO: renamed from: U */
    public tpd0 f14505U;

    /* JADX INFO: renamed from: V */
    public tpd0 f14506V;

    /* JADX INFO: renamed from: W */
    public zpd0 f14507W;

    /* JADX INFO: renamed from: X */
    public tpd0 f14508X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f14509Y;

    /* JADX INFO: renamed from: Z */
    public tpd0 f14510Z;

    /* JADX INFO: renamed from: a0 */
    public zpd0 f14511a0;

    /* JADX INFO: renamed from: b0 */
    public tpd0 f14512b0;

    /* JADX INFO: renamed from: c0 */
    public zpd0 f14513c0;

    /* JADX INFO: renamed from: d0 */
    public tpd0 f14514d0;

    /* JADX INFO: renamed from: e0 */
    public tpd0 f14515e0;

    /* JADX INFO: renamed from: f0 */
    public zpd0 f14516f0;

    /* JADX INFO: renamed from: g0 */
    public tpd0 f14517g0;

    /* JADX INFO: renamed from: h0 */
    public zpd0 f14518h0;

    /* JADX INFO: renamed from: i0 */
    public final a<j760<DatingGuideData, Boolean>> f14519i0;

    /* JADX INFO: renamed from: j0 */
    public final a<RealPicturesBanner> f14520j0;

    /* JADX INFO: renamed from: k0 */
    public List<String> f14521k0;

    /* JADX INFO: renamed from: l0 */
    public int f14522l0;

    /* JADX INFO: renamed from: m0 */
    public long f14523m0;

    public ij8(C0158c c0158c) {
        super(c0158c);
        this.f14502R = new zpd0("last_show_dating_guide_time" + CoreModule.m1850H().userId(), 0L);
        this.f14503S = new zpd0("last_fetch_dating_guide_time" + CoreModule.m1850H().userId(), 0L);
        this.f14504T = new zpd0("last_show_swipe_guide_time" + CoreModule.m1850H().userId(), 0L);
        this.f14505U = new tpd0("leftSwipeGuideShowTimes" + CoreModule.m1850H().userId(), 0);
        this.f14506V = new tpd0("rightSwipeGuideShowTimes" + CoreModule.m1850H().userId(), 0);
        this.f14507W = new zpd0("ideal_guide_last_show_time_from_swipe" + CoreModule.m1850H().userId(), 0L);
        this.f14508X = new tpd0("ideal_guide_from_swipe_show_count" + CoreModule.m1850H().userId(), 0);
        this.f14509Y = new zpd0("ideal_dlg_guide_from_conv_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f14510Z = new tpd0("ideal_dlg_guide_from_conv_show_count" + CoreModule.m1850H().userId(), 0);
        this.f14511a0 = new zpd0("last_like_ideal_user_time" + CoreModule.m1850H().userId(), 0L);
        this.f14512b0 = new tpd0("like_ideal_user_count_today" + CoreModule.m1850H().userId(), 0);
        this.f14513c0 = new zpd0("ideal_dlg_guide_from_like_ideal_last_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f14514d0 = new tpd0("ideal_dlg_guide_from_like_ideal_show_count" + CoreModule.m1850H().userId(), 0);
        this.f14515e0 = new tpd0("ideal_fb_show_count" + CoreModule.m1850H().userId(), 0);
        this.f14516f0 = new zpd0("ideal_fb_show_time" + CoreModule.m1850H().userId(), 0L);
        this.f14517g0 = new tpd0("realPictureGuideShowCount" + CoreModule.m1850H().userId(), 0);
        this.f14518h0 = new zpd0("lastRealPictureGuideShowTime" + CoreModule.m1850H().userId(), 0L);
        this.f14519i0 = a.b();
        this.f14520j0 = a.b();
        this.f14521k0 = vwb.f0(new String[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public void m16705m3() {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("茉莉花茶");
        datingGuideDataNew_.subTitles.add("可以闻得到春天的茶，上品饮茶，极品饮花");
        datingGuideDataNew_.button = "大佬喝茶";
        datingGuideDataNew_.deeplink = "tantan://profileEdit";
        datingGuideDataNew_.pictures.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlM2T08yRjI0UkxWWUo3WEdIVEhYWUtBVUdKMkFXNDE0IiwidyI6NTcxLCJoIjo1NzEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODI5NDkwMjQ3MDMwNjA3ODczfQ.png");
        this.f14519i0.onNext(vwb.Y(datingGuideDataNew_, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: n3 */
    public void m16706n3() {
        scheduled("fetch_my_tab_guide", 0, new v9j() { // from class: l.zi8
            public final Object call() {
                return this.f28763a.m16712t3();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public RealPicturesBanner m16707o3() {
        return (RealPicturesBanner) this.f14520j0.e();
    }

    /* JADX INFO: renamed from: p3 */
    public c<List<IdealTag>> m16708p3(final String str) {
        return scheduled("ideal_guide_" + str, 0, new v9j() { // from class: l.hj8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.xi8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/dating/query/ideal-guide?scene=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.yi8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).idealDetails;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public c<RealPicturesBanner> m16709q3() {
        return scheduled("getRealPicturesBannerInfo", 0, new v9j() { // from class: l.aj8
            public final Object call() {
                return this.f8278a.m16714v3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m16710r3(int i) {
        switch (i) {
            case 1:
                return mqi0.D(((Long) this.f14504T.get()).longValue()) || ((Integer) this.f14505U.get()).intValue() >= CoreModule.m1854P().m11706a().m19817T4();
            case 2:
                return mqi0.D(((Long) this.f14504T.get()).longValue()) || ((Integer) this.f14506V.get()).intValue() >= CoreModule.m1854P().m11706a().m19743H();
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return ((Integer) this.f14508X.get()).intValue() >= CoreModule.m1854P().m11706a().m19715B4() || mqi0.D(((Long) this.f14507W.get()).longValue());
            case CameraSticker.STATE_ERROR /* 4 */:
                return ((Integer) this.f14510Z.get()).intValue() >= CoreModule.m1854P().m11706a().m19808S1() || mqi0.D(((Long) this.f14509Y.get()).longValue());
            case 5:
                return mqi0.D(((Long) this.f14513c0.get()).longValue()) || ((Integer) this.f14514d0.get()).intValue() >= 3;
            case 6:
                return mqi0.D(((Long) this.f14518h0.get()).longValue()) || ((Integer) this.f14517g0.get()).intValue() >= CoreModule.m1854P().m11706a().m19819U0();
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ roj0 m16711s3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (NullChecker.a(moduleData.myTabGuide)) {
            this.f14519i0.onNext(vwb.Y(moduleData.myTabGuide, Boolean.FALSE));
        }
        this.f14503S.put(Long.valueOf(mqi0.o()));
        return roj0.a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ c m16712t3() {
        return ia20.m16567a(new v9j() { // from class: l.fj8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/dating/my-tab-guide")).f().b();
            }
        }).map(new w9j() { // from class: l.gj8
            public final Object call(Object obj) {
                return this.f13336a.m16711s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ RealPicturesBanner m16713u3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        RealPicturesBanner realPicturesBanner = moduleData.realPicturesBanner;
        if (realPicturesBanner != null) {
            this.f14520j0.onNext(realPicturesBanner);
        }
        return moduleData.realPicturesBanner;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ c m16714v3() {
        return ia20.m16567a(new v9j() { // from class: l.dj8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/real_pictures/banner")).f().b();
            }
        }).map(new w9j() { // from class: l.ej8
            public final Object call(Object obj) {
                return this.f11180a.m16713u3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m16715w3() {
        if (NullChecker.a(this.f14519i0.e())) {
            a<j760<DatingGuideData, Boolean>> aVar = this.f14519i0;
            aVar.onNext(vwb.Y((DatingGuideData) ((j760) aVar.e()).a, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: x3 */
    public void m16716x3() {
        scheduled("mark_profile_guide_shown", -1, new v9j() { // from class: l.wi8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.bj8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/dating/profile-guide")).l(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.cj8
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public c<j760<DatingGuideData, Boolean>> m16717y3() {
        return this.f14519i0.asObservable();
    }

    /* JADX INFO: renamed from: z3 */
    public c<RealPicturesBanner> m16718z3() {
        return this.f14520j0.asObservable();
    }
}
