package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class h7o extends k2o<IntlLiveSquareNearbyFrag> {

    /* JADX INFO: renamed from: l */
    public final C22507a<z8o> f108142l;

    /* JADX INFO: renamed from: m */
    public final RxTaskQueue f108143m;

    public h7o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f108142l = C22507a.m222758b();
        this.f108143m = new RxTaskQueue("LiveSquareNearBy");
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m133817f3(Throwable th) {
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(this.f108142l.asObservable()).filter(new qcj() { // from class: l.a7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((z8o) obj) != null);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.b7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75314a.m133824n3((z8o) obj);
            }
        }));
        duringCreated(t4u.m189316e(3)).subscribe(dhw.m115826e(new y20() { // from class: l.c7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80126a.m133825o3((Integer) obj);
            }
        }, new y20() { // from class: l.d7o
            @Override // p153l.y20
            public final void call(Object obj) {
                h7o.m133817f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public void m133819h3(z8o z8oVar) {
        this.f108142l.m137019l(z8oVar);
    }

    /* JADX INFO: renamed from: i3 */
    public void m133820i3() {
        this.f123626f.m127299c();
        this.f123626f.m127297a(duringCreated(C22421c.interval(this.f123627g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.v6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182673a.m133821j3((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.y6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197699a.m133822k3((Long) obj);
            }
        }, new y20() { // from class: l.z6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203173a.m133823m3((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ Boolean m133821j3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareNearbyFrag) v2).m72004Q4());
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m133822k3(Long l2) {
        z8o z8oVarM222761e = this.f108142l.m222761e();
        if (z8oVarM222761e == null || jyb.m147479J(z8oVarM222761e.f178357a)) {
            return;
        }
        m133830t3(z8oVarM222761e);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f108143m.m69798d();
        this.f123626f.m127299c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m133824n3(z8o z8oVar) {
        ((IntlLiveSquareNearbyFrag) this.viewModel).m71344M5(z8oVar);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m133825o3(Integer num) {
        ((IntlLiveSquareNearbyFrag) this.viewModel).f46531P = true;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m133826p3(List list, final z8o z8oVar) {
        final z8o z8oVarM222761e = this.f108142l.m222761e();
        int iM195324q = z8oVarM222761e.m195324q(z8oVarM222761e.f178357a, z8oVar.f178357a);
        if (iM195324q == 0) {
            return C22421c.just(uxj0.f181467a);
        }
        z8oVarM222761e.m195321E(list, iM195324q);
        this.f108142l.m137019l(z8oVarM222761e);
        return C22421c.timer(3000L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.w6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187638a.m133827q3(z8oVarM222761e, z8oVar, (Long) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.x6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ uxj0 m133827q3(z8o z8oVar, z8o z8oVar2, Long l2) {
        z8oVar.m195333z(z8oVar2);
        this.f108142l.m137019l(z8oVar);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ C22421c m133828r3(z8o z8oVar, List list) {
        BLiveSuggestLive bLiveSuggestLiveM195318B;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive() && (bLiveSuggestLiveM195318B = z8oVar.m195318B(bLiveSuggestLive.f45298id)) != null) {
                arrayList.add(bLiveSuggestLiveM195318B.f45298id);
                arrayList2.add(bLiveSuggestLiveM195318B.getRecommendCategory());
            }
            if (arrayList.size() >= 10) {
                break;
            }
        }
        return arrayList.isEmpty() ? C22421c.just(uxj0.f181467a) : m133829s3(arrayList, arrayList2, list);
    }

    /* JADX INFO: renamed from: s3 */
    public final C22421c<uxj0> m133829s3(List<String> list, List<String> list2, final List<BLiveSuggestLive> list3) {
        return IntlLiveSquareApi.refreshStoppedLivesV2(list, list2, this.f123631k.name, fdn.INSTANCE.m125126v()).flatMap(new qcj() { // from class: l.g7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102610a.m133826p3(list3, (z8o) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m133830t3(@NonNull final z8o z8oVar) {
        this.f108143m.m69800f("updateLives", IntlLiveSquareApi.queryCurrentLivesInfo(jyb.m147486Q(z8oVar.f178357a, new qcj() { // from class: l.e7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        }), false).flatMap(new qcj() { // from class: l.f7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97577a.m133828r3(z8oVar, (List) obj);
            }
        }), -100);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m133823m3(Throwable th) {
    }
}
