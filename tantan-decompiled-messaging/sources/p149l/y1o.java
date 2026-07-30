package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class y1o extends zyt<IntlLiveSquareCommonFeedFrag> {

    /* JADX INFO: renamed from: l */
    public final h1o f195432l;

    public y1o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f195432l = new h1o(getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ Unit m212250d3(ModelData modelData) {
        if (modelData.isLoading()) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70024E5();
        }
        if (modelData.isComplete()) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70022C5();
        }
        if (!modelData.isError()) {
            return null;
        }
        m220949T2();
        modelData.getThrowable();
        ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70030K5();
        if (m212255b3(modelData)) {
            if (this.f195432l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String() == null || this.f195432l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().m162488F()) {
                ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70025F5(modelData.getThrowable());
            }
        } else if (m212256c3(modelData)) {
            ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70023D5();
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44150a0));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ Unit m212251e3(ModelData modelData) {
        if (!modelData.isSuccess() || this.f195432l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String() == null) {
            return null;
        }
        ((IntlLiveSquareCommonFeedFrag) this.viewModel).m70027H5(this.f195432l.getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ Boolean m212252f3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((IntlLiveSquareCommonFeedFrag) v2).m70821Q4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m212253g3(Long l2) {
        this.f195432l.updateCurrentLiveInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m212254h3(Throwable th) {
        m220949T2();
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        this.f195432l.observe(new Function1() { // from class: l.u1o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f173036a.m212250d3((ModelData) obj);
            }
        });
        this.f195432l.setLiveSquareTab(this.f205730k);
        this.f195432l.observe(new Function1() { // from class: l.v1o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f179267a.m212251e3((ModelData) obj);
            }
        });
        l9s.m149072e().signedIn().takeFirst(new w9j() { // from class: l.w1o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.x1o
            @Override // p149l.e30
            public final void call(Object obj) {
                s2u.m182070b();
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m212255b3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m212256c3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: i3 */
    public void m212257i3() {
        this.f195432l.getData();
    }

    /* JADX INFO: renamed from: j3 */
    public void m212258j3(boolean z) {
        this.f195432l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m212259k3() {
        this.f205725f.m103657c();
        this.f205725f.m103655a(duringCreated(C22306c.interval(this.f205726g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.r1o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157300a.m212252f3((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.s1o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161918a.m212253g3((Long) obj);
            }
        }, new e30() { // from class: l.t1o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167359a.m212254h3((Throwable) obj);
            }
        })));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f205725f.m103657c();
    }
}
