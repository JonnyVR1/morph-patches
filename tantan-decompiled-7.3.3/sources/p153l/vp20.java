package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vp20 {

    /* JADX INFO: renamed from: a */
    public ipl<? extends BLiveAbsData, ? extends BLiveAbsRoom> f185207a;

    /* JADX INFO: renamed from: b */
    public C22507a<jsv> f185208b = C22507a.m222759c(qfu.f157341b);

    /* JADX INFO: renamed from: c */
    public String f185209c;

    public vp20(ipl<? extends BLiveAbsData, ? extends BLiveAbsRoom> iplVar) {
        this.f185207a = iplVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m202189e(gcg0 gcg0Var) {
    }

    /* JADX INFO: renamed from: g */
    public void mo183431g(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            CrashHelper.m82479c(new Throwable("live is null"));
        } else {
            this.f185207a.mo122893n(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo160116h(jsv jsvVar) {
        this.f185208b.onNext(jsvVar);
    }

    /* JADX INFO: renamed from: i */
    public void mo168522i(BLiveAbsRoom bLiveAbsRoom) {
        if (bLiveAbsRoom == null) {
            return;
        }
        this.f185207a.mo122894o(bLiveAbsRoom);
    }

    /* JADX INFO: renamed from: j */
    public BLiveAbsData mo183435j() {
        return this.f185207a.mo122892l();
    }

    /* JADX INFO: renamed from: k */
    public String m202191k() {
        return this.f185207a.getLiveId();
    }

    /* JADX INFO: renamed from: l */
    public C22421c<jsv> m202192l() {
        return this.f185208b.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public jsv m202193m() {
        return this.f185208b.m222761e();
    }

    /* JADX INFO: renamed from: n */
    public BLiveAbsRoom mo183440n() {
        return this.f185207a.mo122891j();
    }

    /* JADX INFO: renamed from: o */
    public String m202194o() {
        return this.f185207a.getRoomId();
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo118373p();

    /* JADX INFO: renamed from: q */
    public boolean mo183444q() {
        return mo118373p();
    }

    /* JADX INFO: renamed from: r */
    public boolean m202195r() {
        return m202193m().m146878d();
    }

    /* JADX INFO: renamed from: s */
    public boolean m202196s() {
        return m202193m().m146877c();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m202197t(jsv jsvVar) {
        return Boolean.valueOf(jsvVar.m146883i(mo183444q()));
    }

    /* JADX INFO: renamed from: u */
    public C22421c<jsv> mo183449u() {
        return mo118373p() ? C22421c.create(new C22421c.a() { // from class: l.rp20
            @Override // p153l.y20
            public final void call(Object obj) {
                vp20.m202189e((gcg0) obj);
            }
        }) : this.f185208b.filter(new qcj() { // from class: l.sp20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jsv jsvVar = (jsv) obj;
                return Boolean.valueOf(jsvVar.m146875a() == 2 && ((j2t) jsvVar).m143263l());
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22421c<jsv> m202198v() {
        return this.f185208b.filter(new qcj() { // from class: l.up20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jsv jsvVar = (jsv) obj;
                return Boolean.valueOf(jsvVar.m146875a() == 2 && ((j2t) jsvVar).m143264m());
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m202199w(String str) {
        this.f185209c = str;
    }

    /* JADX INFO: renamed from: x */
    public String m202200x() {
        if (this.f185209c == null) {
            this.f185209c = UUID.randomUUID().toString();
        }
        return this.f185209c;
    }

    /* JADX INFO: renamed from: y */
    public C22421c<jsv> mo183454y() {
        return this.f185208b.filter(new qcj() { // from class: l.tp20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175552a.m202197t((jsv) obj);
            }
        }).take(1);
    }
}
