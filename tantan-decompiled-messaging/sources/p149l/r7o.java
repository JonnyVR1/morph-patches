package p149l;

import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.IntlLiveSquareSuggestedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class r7o extends k2o<IntlLiveSquareSuggestedFrag> {

    /* JADX INFO: renamed from: n */
    public boolean f158052n;

    public r7o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f158052n = false;
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m178153q3(Throwable th) {
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ Boolean m178157u3(Map map) {
        return (Boolean) map.get("guide");
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m178159w3(Throwable th) {
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m178161B3() {
        return NullChecker.m81303a(this.f120506k) && "square-suggested".equals(this.f120506k.name);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m178162C3(Integer num) {
        ((IntlLiveSquareSuggestedFrag) this.viewModel).f45630P = true;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m178163D3(Integer num) {
        if (this.f120752l.getInfo() == null || vwb.m200296J(this.f120752l.getInfo().f169071a)) {
            lsi0.m151593w(R$string.f44210u0);
        } else {
            m144087S2(true);
            mo144086R2(this.f120752l.getInfo().f169071a.get(0), "sign-in-suggested", this.f120752l.getInfo().f169071a.get(0).recommendInfo.category, null);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Unit m178164E3(IntlModelData intlModelData) {
        if (!intlModelData.isSuccess() || this.f120752l.getInfo() == null) {
            return null;
        }
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m70172Y5(this.f120752l.getInfo());
        intlModelData.getMessage();
        if (!m144329a3(intlModelData)) {
            return null;
        }
        m178169J3();
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m178165F3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f158052n = zBooleanValue;
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m70171X5(zBooleanValue);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m178166G3(final Boolean bool) {
        e51.m114742G(new Runnable() { // from class: l.e7o
            @Override // java.lang.Runnable
            public final void run() {
                this.f89734a.m178165F3(bool);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m178167H3(Integer num) {
        ((IntlLiveSquareSuggestedFrag) this.viewModel).m70064I5();
    }

    @Override // p149l.k2o, p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        super.mo69101I2();
        duringCreated(s2u.m182073e(3)).subscribe(ffw.m121194e(new e30() { // from class: l.c7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79638a.m178162C3((Integer) obj);
            }
        }, new e30() { // from class: l.j7o
            @Override // p149l.e30
            public final void call(Object obj) {
                r7o.m178153q3((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.k7o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s2u.m182073e(2);
            }
        }, false).subscribe(ffw.m121194e(new e30() { // from class: l.l7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126735a.m178163D3((Integer) obj);
            }
        }, new e30() { // from class: l.m7o
            @Override // p149l.e30
            public final void call(Object obj) {
                r7o.m178159w3((Throwable) obj);
            }
        }));
        this.f120752l.setLiveSquareTab(this.f120506k);
        this.f120752l.observe(new Function1() { // from class: l.n7o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f137540a.m178164E3((IntlModelData) obj);
            }
        });
        duringCreated(s2u.m182074f()).map(new w9j() { // from class: l.o7o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r7o.m178157u3((Map) obj);
            }
        }).filter(new w9j() { // from class: l.p7o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.q7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153060a.m178166G3((Boolean) obj);
            }
        }));
        l9s.m149072e().signedIn().takeFirst(new w9j() { // from class: l.d7o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.i7o
            @Override // p149l.e30
            public final void call(Object obj) {
                s2u.m182070b();
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m178168I3(Pair pair) {
        if (NullChecker.m81303a(pair.first) || NullChecker.m81303a(pair.second)) {
            if (NullChecker.m81303a(this.f120752l.getInfo())) {
                this.f120752l.getInfo().m217400H(pair);
            }
            ((IntlLiveSquareSuggestedFrag) this.viewModel).m70172Y5(this.f120752l.getInfo());
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m178169J3() {
        if (m178161B3()) {
            duringCreated(C22306c.combineLatest(m178171z3(), m178170y3(), new x9j() { // from class: l.f7o
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new Pair((View) obj, (View) obj2);
                }
            })).subscribe(ffw.m121193d(new e30() { // from class: l.g7o
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101421a.m178168I3((Pair) obj);
                }
            }));
        }
    }

    @Override // p149l.k0o
    /* JADX INFO: renamed from: R2 */
    public void mo144086R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2, String str3) {
        super.mo144086R2(bLiveSuggestLive, str, str2, str3);
        ((IntlLiveSquareSuggestedFrag) this.viewModel).f45630P = true;
        mkd0.m154992z(this.f120753m);
        this.f120753m = duringCreated(s2u.m182073e(1)).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.h7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106318a.m178167H3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y3 */
    public final C22306c<View> m178170y3() {
        z6o info = this.f120752l.getInfo();
        return (!NullChecker.m81303a(info) || vwb.m200296J(info.f201940c)) ? l9s.m149076g().mo30770i0(getAct()) : C22306c.just(null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C22306c<View> m178171z3() {
        return l9s.m149076g().mo30683E5(getAct());
    }
}
