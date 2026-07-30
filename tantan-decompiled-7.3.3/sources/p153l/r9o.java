package p153l;

import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.IntlLiveSquareSuggestedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class r9o extends k4o<IntlLiveSquareSuggestedFrag> {

    /* JADX INFO: renamed from: n */
    public boolean f161841n;

    public r9o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f161841n = false;
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m180603q3(Throwable th) {
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ Boolean m180607u3(Map map) {
        return (Boolean) map.get("guide");
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m180609w3(Throwable th) {
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m180611B3() {
        return NullChecker.m82486a(this.f123631k) && "square-suggested".equals(this.f123631k.name);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m180612C3(Integer num) {
        ((IntlLiveSquareSuggestedFrag) this.viewModel).f46478P = true;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m180613D3(Integer num) {
        if (this.f123907l.getInfo() == null || jyb.m147479J(this.f123907l.getInfo().f178357a)) {
            o1j0.m165649w(R$string.f45058u0);
        } else {
            m147983S2(true);
            mo147982R2(this.f123907l.getInfo().f178357a.get(0), "sign-in-suggested", this.f123907l.getInfo().f178357a.get(0).recommendInfo.category, null);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Unit m180614E3(IntlModelData intlModelData) {
        if (!intlModelData.isSuccess() || this.f123907l.getInfo() == null) {
            return null;
        }
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m71355Y5(this.f123907l.getInfo());
        intlModelData.getMessage();
        if (!m148277a3(intlModelData)) {
            return null;
        }
        m180619J3();
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m180615F3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f161841n = zBooleanValue;
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m71354X5(zBooleanValue);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m180616G3(final Boolean bool) {
        l51.m152887G(new Runnable() { // from class: l.e9o
            @Override // java.lang.Runnable
            public final void run() {
                this.f92663a.m180615F3(bool);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m180617H3(Integer num) {
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m71247I5();
    }

    @Override // p153l.k4o, p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        super.mo70284I2();
        duringCreated(t4u.m189316e(3)).subscribe(dhw.m115826e(new y20() { // from class: l.c9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80509a.m180612C3((Integer) obj);
            }
        }, new y20() { // from class: l.j9o
            @Override // p153l.y20
            public final void call(Object obj) {
                r9o.m180603q3((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.k9o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return t4u.m189316e(2);
            }
        }, false).subscribe(dhw.m115826e(new y20() { // from class: l.l9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130618a.m180613D3((Integer) obj);
            }
        }, new y20() { // from class: l.m9o
            @Override // p153l.y20
            public final void call(Object obj) {
                r9o.m180609w3((Throwable) obj);
            }
        }));
        this.f123907l.setLiveSquareTab(this.f123631k);
        this.f123907l.observe(new Function1() { // from class: l.n9o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f140927a.m180614E3((IntlModelData) obj);
            }
        });
        duringCreated(t4u.m189317f()).map(new qcj() { // from class: l.o9o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return r9o.m180607u3((Map) obj);
            }
        }).filter(new qcj() { // from class: l.p9o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.q9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156249a.m180616G3((Boolean) obj);
            }
        }));
        mbs.m157849e().signedIn().takeFirst(new qcj() { // from class: l.d9o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.i9o
            @Override // p153l.y20
            public final void call(Object obj) {
                t4u.m189313b();
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m180618I3(Pair pair) {
        if (NullChecker.m82486a(pair.first) || NullChecker.m82486a(pair.second)) {
            if (NullChecker.m82486a(this.f123907l.getInfo())) {
                this.f123907l.getInfo().m219014H(pair);
            }
            ((IntlLiveSquareSuggestedFrag) this.viewModel).m71355Y5(this.f123907l.getInfo());
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m180619J3() {
        if (m180611B3()) {
            duringCreated(C22421c.combineLatest(m180621z3(), m180620y3(), new rcj() { // from class: l.f9o
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new Pair((View) obj, (View) obj2);
                }
            })).subscribe(dhw.m115825d(new y20() { // from class: l.g9o
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102868a.m180618I3((Pair) obj);
                }
            }));
        }
    }

    @Override // p153l.k2o
    /* JADX INFO: renamed from: R2 */
    public void mo147982R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2, String str3) {
        super.mo147982R2(bLiveSuggestLive, str, str2, str3);
        ((IntlLiveSquareSuggestedFrag) this.viewModel).f46478P = true;
        psd0.m173633z(this.f123908m);
        this.f123908m = duringCreated(t4u.m189316e(1)).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.h9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108420a.m180617H3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y3 */
    public final C22421c<View> m180620y3() {
        z8o info = this.f123907l.getInfo();
        return (!NullChecker.m82486a(info) || jyb.m147479J(info.f203405c)) ? mbs.m157853g().mo31773i0(getAct()) : C22421c.just(null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C22421c<View> m180621z3() {
        return mbs.m157853g().mo31686E5(getAct());
    }
}
