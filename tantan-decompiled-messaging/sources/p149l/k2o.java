package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlLiveSquareSuggestApiPlug;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class k2o<V extends IntlLiveSquareFeedBaseFrag> extends k0o<V> {

    /* JADX INFO: renamed from: l */
    public final IntlLiveSquareSuggestApiPlug f120752l;

    /* JADX INFO: renamed from: m */
    public c4g0 f120753m;

    public k2o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f120752l = new IntlLiveSquareSuggestApiPlug(this);
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        this.f120752l.observe(new Function1() { // from class: l.g2o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f100274a.m144331c3((IntlModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public void m144328Z2(String str, e30<String> e30Var) {
        duringCreated(x6o.m207190b(str)).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m144329a3(IntlModelData intlModelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", intlModelData == null ? "" : intlModelData.getMessage());
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m144330b3(IntlModelData intlModelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", intlModelData == null ? "" : intlModelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ Unit m144331c3(IntlModelData intlModelData) {
        if (intlModelData.isLoading()) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m70067L5();
        }
        if (intlModelData.isComplete()) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m70065J5();
        }
        if (!intlModelData.isError()) {
            return null;
        }
        m144089U2();
        intlModelData.getThrowable();
        ((IntlLiveSquareFeedBaseFrag) this.viewModel).m70007v5();
        if (m144329a3(intlModelData)) {
            if (this.f120752l.getInfo() == null || this.f120752l.getInfo().m217399G()) {
                ((IntlLiveSquareFeedBaseFrag) this.viewModel).m70068M5(intlModelData.getThrowable());
            }
        } else if (m144330b3(intlModelData)) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m70066K5();
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44150a0));
        return null;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m144332d3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareFeedBaseFrag) v2).m70821Q4());
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m144333e3(Long l2) {
        this.f120752l.updateCurrentLiveInfo();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m144334f3(Throwable th) {
        m144089U2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m144335g3() {
        this.f120752l.getData();
    }

    /* JADX INFO: renamed from: h3 */
    public void m144336h3(boolean z) {
        this.f120752l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: i3 */
    public void m144337i3() {
        this.f120501f.m103657c();
        this.f120501f.m103655a(duringCreated(C22306c.interval(this.f120502g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.h2o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105543a.m144332d3((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.i2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110569a.m144333e3((Long) obj);
            }
        }, new e30() { // from class: l.j2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115938a.m144334f3((Throwable) obj);
            }
        })));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f120501f.m103657c();
        mkd0.m154992z(this.f120753m);
    }
}
