package p149l;

import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class g4u extends zyt<LiveSquareTeenModeFrag> {

    /* JADX INFO: renamed from: l */
    public C22392a<u3u> f100589l;

    /* JADX INFO: renamed from: m */
    public final RxTaskQueue f100590m;

    /* JADX INFO: renamed from: n */
    public j4u f100591n;

    public g4u(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f100589l = C22392a.m221512b();
        this.f100590m = new RxTaskQueue("LiveSquareSuggest");
        this.f100591n = new j4u();
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(this.f100589l.asObservable()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.b4u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((u3u) obj) != null);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.c4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79295a.m124413e3((u3u) obj);
            }
        }, new e30() { // from class: l.d4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84353a.m124412f3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m124413e3(u3u u3uVar) {
        ((LiveSquareTeenModeFrag) this.viewModel).m69134K5(u3uVar);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ C22306c m124414g3() {
        return this.f100590m.m68617f("TeenModeLoadSuggestInfo", this.f100591n.m139780c(x4u.f191061a), 100);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m124415h3() {
        ((LiveSquareTeenModeFrag) this.viewModel).m69132I5();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m124416i3(u3u u3uVar) {
        this.f100589l.m132487l(u3uVar);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m124417j3(Throwable th) {
        ((LiveSquareTeenModeFrag) this.viewModel).m69043v5();
        u3u u3uVarM221515e = this.f100589l.m221515e();
        if (u3uVarM221515e == null || u3uVarM221515e.m191620b()) {
            ((LiveSquareTeenModeFrag) this.viewModel).m69133J5(th);
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44150a0));
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m124418k3() {
        ((LiveSquareTeenModeFrag) this.viewModel).m69130G5();
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m124419m3(u3u u3uVar) {
        u3uVar.m191623e(true);
        this.f100589l.m132487l(u3uVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f100590m.m68615d();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m124420n3(Throwable th) {
        ((LiveSquareTeenModeFrag) this.viewModel).m69131H5();
    }

    /* JADX INFO: renamed from: o3 */
    public void m124421o3() {
        duringCreated(new v9j() { // from class: l.w3u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f184444a.m124414g3();
            }
        }, false).doOnSubscribe(new d30() { // from class: l.x3u
            @Override // p149l.d30
            public final void call() {
                this.f190918a.m124415h3();
            }
        }).subscribe(ffw.m121195f(new e30() { // from class: l.y3u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195854a.m124416i3((u3u) obj);
            }
        }, new e30() { // from class: l.z3u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201411a.m124417j3((Throwable) obj);
            }
        }, new d30() { // from class: l.a4u
            @Override // p149l.d30
            public final void call() {
                this.f67558a.m124418k3();
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public void m124422p3() {
        u3u u3uVarM221515e = this.f100589l.m221515e();
        if (u3uVarM221515e == null || !u3uVarM221515e.m191619a()) {
            return;
        }
        duringCreated(this.f100590m.m68616e("TeenModeLoadNextPage", this.f100591n.m139781d(u3uVarM221515e))).subscribe(ffw.m121194e(new e30() { // from class: l.e4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89321a.m124419m3((u3u) obj);
            }
        }, new e30() { // from class: l.f4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94925a.m124420n3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q3 */
    public void m124423q3(BLiveAbsData bLiveAbsData, String str, String str2) {
        getAct().startActivity(s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67592C(true).m67593D(bLiveAbsData).m67604O(str).m67605P(true).m67615y(str2).m67611u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m124412f3(Throwable th) {
    }
}
