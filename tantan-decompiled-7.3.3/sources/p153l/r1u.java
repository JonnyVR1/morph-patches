package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareSuggestApiPlug;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class r1u extends a1u<LiveSquareCommonFeedFrag> {

    /* JADX INFO: renamed from: l */
    public final LiveSquareSuggestApiPlug f160854l;

    public r1u(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f160854l = new LiveSquareSuggestApiPlug(this);
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        this.f160854l.observe(new Function1() { // from class: l.n1u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f139793a.m179446d3((ModelData) obj);
            }
        });
        this.f160854l.setLiveSquareTab(this.f67852k);
        this.f160854l.observe(new Function1() { // from class: l.o1u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f144686a.m179447e3((ModelData) obj);
            }
        });
        mbs.m157849e().signedIn().takeFirst(new qcj() { // from class: l.p1u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.q1u
            @Override // p153l.y20
            public final void call(Object obj) {
                t4u.m189313b();
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m179444b3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m179445c3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Unit m179446d3(ModelData modelData) {
        if (modelData.isLoading()) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m70106E5();
        }
        if (modelData.isComplete()) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m70104C5();
        }
        if (!modelData.isError()) {
            return null;
        }
        m95557T2();
        modelData.getThrowable();
        ((LiveSquareCommonFeedFrag) this.viewModel).m70112K5();
        if (m179444b3(modelData)) {
            if (this.f160854l.getInfo() == null || this.f160854l.getInfo().m170682F()) {
                ((LiveSquareCommonFeedFrag) this.viewModel).m70107F5(modelData.getThrowable());
            }
        } else if (m179445c3(modelData)) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m70105D5();
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44998a0));
        return null;
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ Unit m179447e3(ModelData modelData) {
        if (!modelData.isSuccess() || this.f160854l.getInfo() == null) {
            return null;
        }
        ((LiveSquareCommonFeedFrag) this.viewModel).m70109H5(this.f160854l.getInfo());
        return null;
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m179448f3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((LiveSquareCommonFeedFrag) v2).m72004Q4());
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m179449g3(Long l2) {
        this.f160854l.updateCurrentLiveInfo();
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m179450h3(Throwable th) {
        m95557T2();
    }

    /* JADX INFO: renamed from: i3 */
    public void m179451i3() {
        this.f160854l.getData();
    }

    /* JADX INFO: renamed from: j3 */
    public void m179452j3(boolean z) {
        this.f160854l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m179453k3() {
        this.f67847f.m127299c();
        this.f67847f.m127297a(duringCreated(C22421c.interval(this.f67848g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.k1u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123541a.m179448f3((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.l1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129724a.m179449g3((Long) obj);
            }
        }, new y20() { // from class: l.m1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134465a.m179450h3((Throwable) obj);
            }
        })));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f67847f.m127299c();
    }
}
