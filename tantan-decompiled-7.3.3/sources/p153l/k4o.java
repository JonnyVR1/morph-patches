package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlLiveSquareSuggestApiPlug;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class k4o<V extends IntlLiveSquareFeedBaseFrag> extends k2o<V> {

    /* JADX INFO: renamed from: l */
    public final IntlLiveSquareSuggestApiPlug f123907l;

    /* JADX INFO: renamed from: m */
    public kcg0 f123908m;

    public k4o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f123907l = new IntlLiveSquareSuggestApiPlug(this);
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        this.f123907l.observe(new Function1() { // from class: l.g4o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f102185a.m148279c3((IntlModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public void m148276Z2(String str, y20<String> y20Var) {
        duringCreated(x8o.m209747b(str)).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: a3 */
    public boolean m148277a3(IntlModelData intlModelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", intlModelData == null ? "" : intlModelData.getMessage());
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m148278b3(IntlModelData intlModelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", intlModelData == null ? "" : intlModelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ Unit m148279c3(IntlModelData intlModelData) {
        if (intlModelData.isLoading()) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m71250L5();
        }
        if (intlModelData.isComplete()) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m71248J5();
        }
        if (!intlModelData.isError()) {
            return null;
        }
        m147985U2();
        intlModelData.getThrowable();
        ((IntlLiveSquareFeedBaseFrag) this.viewModel).m71190v5();
        if (m148277a3(intlModelData)) {
            if (this.f123907l.getInfo() == null || this.f123907l.getInfo().m219013G()) {
                ((IntlLiveSquareFeedBaseFrag) this.viewModel).m71251M5(intlModelData.getThrowable());
            }
        } else if (m148278b3(intlModelData)) {
            ((IntlLiveSquareFeedBaseFrag) this.viewModel).m71249K5();
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44998a0));
        return null;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m148280d3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareFeedBaseFrag) v2).m72004Q4());
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m148281e3(Long l2) {
        this.f123907l.updateCurrentLiveInfo();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m148282f3(Throwable th) {
        m147985U2();
    }

    /* JADX INFO: renamed from: g3 */
    public void m148283g3() {
        this.f123907l.getData();
    }

    /* JADX INFO: renamed from: h3 */
    public void m148284h3(boolean z) {
        this.f123907l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: i3 */
    public void m148285i3() {
        this.f123626f.m127299c();
        this.f123626f.m127297a(duringCreated(C22421c.interval(this.f123627g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.h4o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107819a.m148280d3((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.i4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112929a.m148281e3((Long) obj);
            }
        }, new y20() { // from class: l.j4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118312a.m148282f3((Throwable) obj);
            }
        })));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f123626f.m127299c();
        psd0.m173633z(this.f123908m);
    }
}
