package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class h5o extends k0o<IntlLiveSquareNearbyFrag> {

    /* JADX INFO: renamed from: l */
    public final C22392a<z6o> f105959l;

    /* JADX INFO: renamed from: m */
    public final RxTaskQueue f105960m;

    public h5o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f105959l = C22392a.m221512b();
        this.f105960m = new RxTaskQueue("LiveSquareNearBy");
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m129421f3(Throwable th) {
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(this.f105959l.asObservable()).filter(new w9j() { // from class: l.a5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((z6o) obj) != null);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.b5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73684a.m129428n3((z6o) obj);
            }
        }));
        duringCreated(s2u.m182073e(3)).subscribe(ffw.m121194e(new e30() { // from class: l.c5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79406a.m129429o3((Integer) obj);
            }
        }, new e30() { // from class: l.d5o
            @Override // p149l.e30
            public final void call(Object obj) {
                h5o.m129421f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m129423h3(z6o z6oVar) {
        this.f105959l.m132487l(z6oVar);
    }

    /* JADX INFO: renamed from: i3 */
    public void m129424i3() {
        this.f120501f.m103657c();
        this.f120501f.m103655a(duringCreated(C22306c.interval(this.f120502g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.v4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f179963a.m129425j3((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.y4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196315a.m129426k3((Long) obj);
            }
        }, new e30() { // from class: l.z4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201623a.m129427m3((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ Boolean m129425j3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareNearbyFrag) v2).m70821Q4());
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m129426k3(Long l2) {
        z6o z6oVarM221515e = this.f105959l.m221515e();
        if (z6oVarM221515e == null || vwb.m200296J(z6oVarM221515e.f169071a)) {
            return;
        }
        m129434t3(z6oVarM221515e);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f105960m.m68615d();
        this.f120501f.m103657c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m129428n3(z6o z6oVar) {
        ((IntlLiveSquareNearbyFrag) this.viewModel).m70161M5(z6oVar);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m129429o3(Integer num) {
        ((IntlLiveSquareNearbyFrag) this.viewModel).f45683P = true;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m129430p3(List list, final z6o z6oVar) {
        final z6o z6oVarM221515e = this.f105959l.m221515e();
        int iM187670q = z6oVarM221515e.m187670q(z6oVarM221515e.f169071a, z6oVar.f169071a);
        if (iM187670q == 0) {
            return C22306c.just(roj0.f160388a);
        }
        z6oVarM221515e.m187667E(list, iM187670q);
        this.f105959l.m132487l(z6oVarM221515e);
        return C22306c.timer(3000L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.w4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184577a.m129431q3(z6oVarM221515e, z6oVar, (Long) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.x4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ roj0 m129431q3(z6o z6oVar, z6o z6oVar2, Long l2) {
        z6oVar.m187679z(z6oVar2);
        this.f105959l.m132487l(z6oVar);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22306c m129432r3(z6o z6oVar, List list) {
        BLiveSuggestLive bLiveSuggestLiveM187664B;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive() && (bLiveSuggestLiveM187664B = z6oVar.m187664B(bLiveSuggestLive.f44450id)) != null) {
                arrayList.add(bLiveSuggestLiveM187664B.f44450id);
                arrayList2.add(bLiveSuggestLiveM187664B.getRecommendCategory());
            }
            if (arrayList.size() >= 10) {
                break;
            }
        }
        return arrayList.isEmpty() ? C22306c.just(roj0.f160388a) : m129433s3(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: s3 */
    public final C22306c<roj0> m129433s3(List<String> list, List<String> list2, final List<BLiveSuggestLive> list3) {
        return IntlLiveSquareApi.refreshStoppedLivesV2(list, list2, this.f120506k.name, fbn.INSTANCE.m120382v()).flatMap(new w9j() { // from class: l.g5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101176a.m129430p3(list3, (z6o) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m129434t3(@NonNull final z6o z6oVar) {
        this.f105960m.m68617f("updateLives", IntlLiveSquareApi.queryCurrentLivesInfo(vwb.m200303Q(z6oVar.f169071a, new w9j() { // from class: l.e5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        }), false).flatMap(new w9j() { // from class: l.f5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f95191a.m129432r3(z6oVar, (List) obj);
            }
        }), -100);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m129427m3(Throwable th) {
    }
}
