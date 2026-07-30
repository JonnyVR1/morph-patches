package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.core.data.RealPicturesBanner;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IdealTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class mk8 extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f137249R;

    /* JADX INFO: renamed from: S */
    public byd0 f137250S;

    /* JADX INFO: renamed from: T */
    public byd0 f137251T;

    /* JADX INFO: renamed from: U */
    public vxd0 f137252U;

    /* JADX INFO: renamed from: V */
    public vxd0 f137253V;

    /* JADX INFO: renamed from: W */
    public byd0 f137254W;

    /* JADX INFO: renamed from: X */
    public vxd0 f137255X;

    /* JADX INFO: renamed from: Y */
    public byd0 f137256Y;

    /* JADX INFO: renamed from: Z */
    public vxd0 f137257Z;

    /* JADX INFO: renamed from: a0 */
    public byd0 f137258a0;

    /* JADX INFO: renamed from: b0 */
    public vxd0 f137259b0;

    /* JADX INFO: renamed from: c0 */
    public byd0 f137260c0;

    /* JADX INFO: renamed from: d0 */
    public vxd0 f137261d0;

    /* JADX INFO: renamed from: e0 */
    public vxd0 f137262e0;

    /* JADX INFO: renamed from: f0 */
    public byd0 f137263f0;

    /* JADX INFO: renamed from: g0 */
    public vxd0 f137264g0;

    /* JADX INFO: renamed from: h0 */
    public byd0 f137265h0;

    /* JADX INFO: renamed from: i0 */
    public final C22507a<pf60<DatingGuideData, Boolean>> f137266i0;

    /* JADX INFO: renamed from: j0 */
    public final C22507a<RealPicturesBanner> f137267j0;

    /* JADX INFO: renamed from: k0 */
    public List<String> f137268k0;

    /* JADX INFO: renamed from: l0 */
    public int f137269l0;

    /* JADX INFO: renamed from: m0 */
    public long f137270m0;

    public mk8(C4883c c4883c) {
        super(c4883c);
        this.f137249R = new byd0("last_show_dating_guide_time" + CoreModule.m30929H().userId(), 0L);
        this.f137250S = new byd0("last_fetch_dating_guide_time" + CoreModule.m30929H().userId(), 0L);
        this.f137251T = new byd0("last_show_swipe_guide_time" + CoreModule.m30929H().userId(), 0L);
        this.f137252U = new vxd0("leftSwipeGuideShowTimes" + CoreModule.m30929H().userId(), 0);
        this.f137253V = new vxd0("rightSwipeGuideShowTimes" + CoreModule.m30929H().userId(), 0);
        this.f137254W = new byd0("ideal_guide_last_show_time_from_swipe" + CoreModule.m30929H().userId(), 0L);
        this.f137255X = new vxd0("ideal_guide_from_swipe_show_count" + CoreModule.m30929H().userId(), 0);
        this.f137256Y = new byd0("ideal_dlg_guide_from_conv_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f137257Z = new vxd0("ideal_dlg_guide_from_conv_show_count" + CoreModule.m30929H().userId(), 0);
        this.f137258a0 = new byd0("last_like_ideal_user_time" + CoreModule.m30929H().userId(), 0L);
        this.f137259b0 = new vxd0("like_ideal_user_count_today" + CoreModule.m30929H().userId(), 0);
        this.f137260c0 = new byd0("ideal_dlg_guide_from_like_ideal_last_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f137261d0 = new vxd0("ideal_dlg_guide_from_like_ideal_show_count" + CoreModule.m30929H().userId(), 0);
        this.f137262e0 = new vxd0("ideal_fb_show_count" + CoreModule.m30929H().userId(), 0);
        this.f137263f0 = new byd0("ideal_fb_show_time" + CoreModule.m30929H().userId(), 0L);
        this.f137264g0 = new vxd0("realPictureGuideShowCount" + CoreModule.m30929H().userId(), 0);
        this.f137265h0 = new byd0("lastRealPictureGuideShowTime" + CoreModule.m30929H().userId(), 0L);
        this.f137266i0 = C22507a.m222758b();
        this.f137267j0 = C22507a.m222758b();
        this.f137268k0 = jyb.m147507f0(new String[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public void m158738m3() {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("茉莉花茶");
        datingGuideDataNew_.subTitles.add("可以闻得到春天的茶，上品饮茶，极品饮花");
        datingGuideDataNew_.button = "大佬喝茶";
        datingGuideDataNew_.deeplink = "tantan://profileEdit";
        datingGuideDataNew_.pictures.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlM2T08yRjI0UkxWWUo3WEdIVEhYWUtBVUdKMkFXNDE0IiwidyI6NTcxLCJoIjo1NzEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODI5NDkwMjQ3MDMwNjA3ODczfQ.png");
        this.f137266i0.m137019l(jyb.m147494Y(datingGuideDataNew_, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: n3 */
    public void m158739n3() {
        scheduled("fetch_my_tab_guide", 0, new pcj() { // from class: l.dk8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88983a.m158745t3();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public RealPicturesBanner m158740o3() {
        return this.f137267j0.m222761e();
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<List<IdealTag>> m158741p3(final String str) {
        return scheduled("ideal_guide_" + str, 0, new pcj() { // from class: l.lk8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.bk8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/dating/query/ideal-guide?scene=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ck8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).idealDetails;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<RealPicturesBanner> m158742q3() {
        return scheduled("getRealPicturesBannerInfo", 0, new pcj() { // from class: l.ek8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94347a.m158747v3();
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m158743r3(int i) {
        switch (i) {
            case 1:
                return pzi0.m174439D(this.f137251T.get().longValue()) || this.f137252U.get().intValue() >= CoreModule.m30933P().m143405a().mo180401T4();
            case 2:
                return pzi0.m174439D(this.f137251T.get().longValue()) || this.f137253V.get().intValue() >= CoreModule.m30933P().m143405a().mo180329H();
            case 3:
                return this.f137255X.get().intValue() >= CoreModule.m30933P().m143405a().mo180301B4() || pzi0.m174439D(this.f137254W.get().longValue());
            case 4:
                return this.f137257Z.get().intValue() >= CoreModule.m30933P().m143405a().mo180392S1() || pzi0.m174439D(this.f137256Y.get().longValue());
            case 5:
                return pzi0.m174439D(this.f137260c0.get().longValue()) || this.f137261d0.get().intValue() >= 3;
            case 6:
                return pzi0.m174439D(this.f137265h0.get().longValue()) || this.f137264g0.get().intValue() >= CoreModule.m30933P().m143405a().mo180403U0();
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ uxj0 m158744s3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData.myTabGuide)) {
            this.f137266i0.m137019l(jyb.m147494Y(coreData.myTabGuide, Boolean.FALSE));
        }
        this.f137250S.put(Long.valueOf(pzi0.m174454o()));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22421c m158745t3() {
        return qi20.m176654a(new pcj() { // from class: l.jk8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/dating/my-tab-guide")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.kk8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f127174a.m158744s3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ RealPicturesBanner m158746u3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        RealPicturesBanner realPicturesBanner = coreData.realPicturesBanner;
        if (realPicturesBanner != null) {
            this.f137267j0.m137019l(realPicturesBanner);
        }
        return coreData.realPicturesBanner;
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ C22421c m158747v3() {
        return qi20.m176654a(new pcj() { // from class: l.hk8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/real_pictures/banner")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.ik8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115344a.m158746u3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m158748w3() {
        if (NullChecker.m82486a(this.f137266i0.m222761e())) {
            C22507a<pf60<DatingGuideData, Boolean>> c22507a = this.f137266i0;
            c22507a.m137019l(jyb.m147494Y(c22507a.m222761e().f152156a, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: x3 */
    public void m158749x3() {
        scheduled("mark_profile_guide_shown", -1, new pcj() { // from class: l.ak8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.fk8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/dating/profile-guide")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.gk8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22421c<pf60<DatingGuideData, Boolean>> m158750y3() {
        return this.f137266i0.asObservable();
    }

    /* JADX INFO: renamed from: z3 */
    public C22421c<RealPicturesBanner> m158751z3() {
        return this.f137267j0.asObservable();
    }
}
