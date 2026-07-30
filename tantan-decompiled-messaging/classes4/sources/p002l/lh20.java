package p002l;

import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import l.w9j;
import l.z3g0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class lh20 {

    /* JADX INFO: renamed from: a */
    public xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> f14865a;

    /* JADX INFO: renamed from: b */
    public a<iqv> f14866b = a.c(pdu.f17211b);

    /* JADX INFO: renamed from: c */
    public String f14867c;

    public lh20(xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> xmlVar) {
        this.f14865a = xmlVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17230e(z3g0 z3g0Var) {
    }

    /* JADX INFO: renamed from: g */
    public void m17232g(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            CrashHelper.c(new Throwable("live is null"));
        } else {
            this.f14865a.mo19691n(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo17233h(iqv iqvVar) {
        this.f14866b.onNext(iqvVar);
    }

    /* JADX INFO: renamed from: i */
    public void mo14572i(BLiveAbsRoom bLiveAbsRoom) {
        if (bLiveAbsRoom == null) {
            return;
        }
        this.f14865a.mo19692o(bLiveAbsRoom);
    }

    /* JADX INFO: renamed from: j */
    public BLiveAbsData m17234j() {
        return this.f14865a.mo19690l();
    }

    /* JADX INFO: renamed from: k */
    public String m17235k() {
        return this.f14865a.getLiveId();
    }

    /* JADX INFO: renamed from: l */
    public c<iqv> m17236l() {
        return this.f14866b.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public iqv m17237m() {
        return (iqv) this.f14866b.e();
    }

    /* JADX INFO: renamed from: n */
    public BLiveAbsRoom m17238n() {
        return this.f14865a.mo19689j();
    }

    /* JADX INFO: renamed from: o */
    public String m17239o() {
        return this.f14865a.getRoomId();
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo9893p();

    /* JADX INFO: renamed from: q */
    public boolean m17240q() {
        return mo9893p();
    }

    /* JADX INFO: renamed from: r */
    public boolean m17241r() {
        return m17237m().m15301d();
    }

    /* JADX INFO: renamed from: s */
    public boolean m17242s() {
        return m17237m().m15300c();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m17243t(iqv iqvVar) {
        return Boolean.valueOf(iqvVar.m15306i(m17240q()));
    }

    /* JADX INFO: renamed from: u */
    public c<iqv> m17244u() {
        return mo9893p() ? c.create(new c.a() { // from class: l.hh20
            public final void call(Object obj) {
                lh20.m17230e((z3g0) obj);
            }
        }) : this.f14866b.filter(new w9j() { // from class: l.ih20
            public final Object call(Object obj) {
                iqv iqvVar = (iqv) obj;
                return Boolean.valueOf(iqvVar.m15298a() == 2 && ((i0t) iqvVar).m14973l());
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public c<iqv> m17245v() {
        return this.f14866b.filter(new w9j() { // from class: l.kh20
            public final Object call(Object obj) {
                iqv iqvVar = (iqv) obj;
                return Boolean.valueOf(iqvVar.m15298a() == 2 && ((i0t) iqvVar).m14974m());
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m17246w(String str) {
        this.f14867c = str;
    }

    /* JADX INFO: renamed from: x */
    public String m17247x() {
        if (this.f14867c == null) {
            this.f14867c = UUID.randomUUID().toString();
        }
        return this.f14867c;
    }

    /* JADX INFO: renamed from: y */
    public c<iqv> m17248y() {
        return this.f14866b.filter(new w9j() { // from class: l.jh20
            public final Object call(Object obj) {
                return this.f13772a.m17243t((iqv) obj);
            }
        }).take(1);
    }
}
