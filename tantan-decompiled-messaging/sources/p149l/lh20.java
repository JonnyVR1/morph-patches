package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lh20 {

    /* JADX INFO: renamed from: a */
    public xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> f128032a;

    /* JADX INFO: renamed from: b */
    public C22392a<iqv> f128033b = C22392a.m221513c(pdu.f148371b);

    /* JADX INFO: renamed from: c */
    public String f128034c;

    public lh20(xml<? extends BLiveAbsData, ? extends BLiveAbsRoom> xmlVar) {
        this.f128032a = xmlVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m149809e(z3g0 z3g0Var) {
    }

    /* JADX INFO: renamed from: g */
    public void mo149811g(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData == null) {
            CrashHelper.m81296c(new Throwable("live is null"));
        } else {
            this.f128032a.mo165471n(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo149812h(iqv iqvVar) {
        this.f128033b.onNext(iqvVar);
    }

    /* JADX INFO: renamed from: i */
    public void mo132136i(BLiveAbsRoom bLiveAbsRoom) {
        if (bLiveAbsRoom == null) {
            return;
        }
        this.f128032a.mo165472o(bLiveAbsRoom);
    }

    /* JADX INFO: renamed from: j */
    public BLiveAbsData mo149813j() {
        return this.f128032a.mo165470l();
    }

    /* JADX INFO: renamed from: k */
    public String m149814k() {
        return this.f128032a.getLiveId();
    }

    /* JADX INFO: renamed from: l */
    public C22306c<iqv> m149815l() {
        return this.f128033b.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public iqv m149816m() {
        return this.f128033b.m221515e();
    }

    /* JADX INFO: renamed from: n */
    public BLiveAbsRoom mo149817n() {
        return this.f128032a.mo165469j();
    }

    /* JADX INFO: renamed from: o */
    public String m149818o() {
        return this.f128032a.getRoomId();
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo97490p();

    /* JADX INFO: renamed from: q */
    public boolean mo149819q() {
        return mo97490p();
    }

    /* JADX INFO: renamed from: r */
    public boolean m149820r() {
        return m149816m().m137797d();
    }

    /* JADX INFO: renamed from: s */
    public boolean m149821s() {
        return m149816m().m137796c();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m149822t(iqv iqvVar) {
        return Boolean.valueOf(iqvVar.m137802i(mo149819q()));
    }

    /* JADX INFO: renamed from: u */
    public C22306c<iqv> mo149823u() {
        return mo97490p() ? C22306c.create(new C22306c.a() { // from class: l.hh20
            @Override // p149l.e30
            public final void call(Object obj) {
                lh20.m149809e((z3g0) obj);
            }
        }) : this.f128033b.filter(new w9j() { // from class: l.ih20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                iqv iqvVar = (iqv) obj;
                return Boolean.valueOf(iqvVar.m137794a() == 2 && ((i0t) iqvVar).m133929l());
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22306c<iqv> m149824v() {
        return this.f128033b.filter(new w9j() { // from class: l.kh20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                iqv iqvVar = (iqv) obj;
                return Boolean.valueOf(iqvVar.m137794a() == 2 && ((i0t) iqvVar).m133930m());
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m149825w(String str) {
        this.f128034c = str;
    }

    /* JADX INFO: renamed from: x */
    public String m149826x() {
        if (this.f128034c == null) {
            this.f128034c = UUID.randomUUID().toString();
        }
        return this.f128034c;
    }

    /* JADX INFO: renamed from: y */
    public C22306c<iqv> mo149827y() {
        return this.f128033b.filter(new w9j() { // from class: l.jh20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117868a.m149822t((iqv) obj);
            }
        }).take(1);
    }
}
