package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class y3o extends a1u<IntlLiveSquareCommonFeedFrag> {

    /* JADX INFO: renamed from: l */
    public final h3o f197381l;

    public y3o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f197381l = new h3o(getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ Unit m214160d3(ModelData modelData) {
        if (modelData.isLoading()) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71207E5();
        }
        if (modelData.isComplete()) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71205C5();
        }
        if (!modelData.isError()) {
            return null;
        }
        m95557T2();
        modelData.getThrowable();
        ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71213K5();
        if (m214165b3(modelData)) {
            if (this.f197381l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String() == null || this.f197381l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().m170682F()) {
                ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71208F5(modelData.getThrowable());
            }
        } else if (m214166c3(modelData)) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71206D5();
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44998a0));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ Unit m214161e3(ModelData modelData) {
        if (!modelData.isSuccess() || this.f197381l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String() == null) {
            return null;
        }
        ((IntlLiveSquareCommonFeedFrag) this.viewModel).m71210H5(this.f197381l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ Boolean m214162f3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareCommonFeedFrag) v2).m72004Q4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m214163g3(Long l2) {
        this.f197381l.updateCurrentLiveInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m214164h3(Throwable th) {
        m95557T2();
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        this.f197381l.observe(new Function1() { // from class: l.u3o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f177357a.m214160d3((ModelData) obj);
            }
        });
        this.f197381l.setLiveSquareTab(this.f67852k);
        this.f197381l.observe(new Function1() { // from class: l.v3o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f182225a.m214161e3((ModelData) obj);
            }
        });
        mbs.m157849e().signedIn().takeFirst(new qcj() { // from class: l.w3o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.x3o
            @Override // p153l.y20
            public final void call(Object obj) {
                t4u.m189313b();
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m214165b3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m214166c3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: i3 */
    public void m214167i3() {
        this.f197381l.getData();
    }

    /* JADX INFO: renamed from: j3 */
    public void m214168j3(boolean z) {
        this.f197381l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m214169k3() {
        this.f67847f.m127299c();
        this.f67847f.m127297a(duringCreated(C22421c.interval(this.f67848g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.r3o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161060a.m214162f3((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.s3o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166024a.m214163g3((Long) obj);
            }
        }, new y20() { // from class: l.t3o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171938a.m214164h3((Throwable) obj);
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
