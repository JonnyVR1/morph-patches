package p153l;

import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class h6u extends a1u<LiveSquareTeenModeFrag> {

    /* JADX INFO: renamed from: l */
    public C22507a<v5u> f108049l;

    /* JADX INFO: renamed from: m */
    public final RxTaskQueue f108050m;

    /* JADX INFO: renamed from: n */
    public k6u f108051n;

    public h6u(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f108049l = C22507a.m222758b();
        this.f108050m = new RxTaskQueue("LiveSquareSuggest");
        this.f108051n = new k6u();
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(this.f108049l.asObservable()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.c6u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((v5u) obj) != null);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.d6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85410a.m133723e3((v5u) obj);
            }
        }, new y20() { // from class: l.e6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92359a.m133722f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m133723e3(v5u v5uVar) {
        ((LiveSquareTeenModeFrag) this.viewModel).m70317K5(v5uVar);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ C22421c m133724g3() {
        return this.f108050m.m69800f("TeenModeLoadSuggestInfo", this.f108051n.m148575c(y6u.f197714a), 100);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m133725h3() {
        ((LiveSquareTeenModeFrag) this.viewModel).m70315I5();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m133726i3(v5u v5uVar) {
        this.f108049l.m137019l(v5uVar);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m133727j3(Throwable th) {
        ((LiveSquareTeenModeFrag) this.viewModel).m70226v5();
        v5u v5uVarM222761e = this.f108049l.m222761e();
        if (v5uVarM222761e == null || v5uVarM222761e.m199920b()) {
            ((LiveSquareTeenModeFrag) this.viewModel).m70316J5(th);
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44998a0));
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m133728k3() {
        ((LiveSquareTeenModeFrag) this.viewModel).m70313G5();
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m133729m3(v5u v5uVar) {
        v5uVar.m199923e(true);
        this.f108049l.m137019l(v5uVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f108050m.m69798d();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m133730n3(Throwable th) {
        ((LiveSquareTeenModeFrag) this.viewModel).m70314H5();
    }

    /* JADX INFO: renamed from: o3 */
    public void m133731o3() {
        duringCreated(new pcj() { // from class: l.x5u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192527a.m133724g3();
            }
        }, false).doOnSubscribe(new x20() { // from class: l.y5u
            @Override // p153l.x20
            public final void call() {
                this.f197586a.m133725h3();
            }
        }).subscribe(dhw.m115827f(new y20() { // from class: l.z5u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203085a.m133726i3((v5u) obj);
            }
        }, new y20() { // from class: l.a6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68760a.m133727j3((Throwable) obj);
            }
        }, new x20() { // from class: l.b6u
            @Override // p153l.x20
            public final void call() {
                this.f75207a.m133728k3();
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public void m133732p3() {
        v5u v5uVarM222761e = this.f108049l.m222761e();
        if (v5uVarM222761e == null || !v5uVarM222761e.m199919a()) {
            return;
        }
        duringCreated(this.f108050m.m69799e("TeenModeLoadNextPage", this.f108051n.m148576d(v5uVarM222761e))).subscribe(dhw.m115826e(new y20() { // from class: l.f6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97447a.m133729m3((v5u) obj);
            }
        }, new y20() { // from class: l.g6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102481a.m133730n3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q3 */
    public void m133733q3(BLiveAbsData bLiveAbsData, String str, String str2) {
        getAct().startActivity(tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68775C(true).m68776D(bLiveAbsData).m68787O(str).m68788P(true).m68798y(str2).m68794u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m133722f3(Throwable th) {
    }
}
