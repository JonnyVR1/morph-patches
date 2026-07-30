package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareSuggestApiPlug;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class qzt extends zyt<LiveSquareCommonFeedFrag> {

    /* JADX INFO: renamed from: l */
    public final LiveSquareSuggestApiPlug f157095l;

    public qzt(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f157095l = new LiveSquareSuggestApiPlug(this);
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        this.f157095l.observe(new Function1() { // from class: l.mzt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f136433a.m177288d3((ModelData) obj);
            }
        });
        this.f157095l.setLiveSquareTab(this.f205730k);
        this.f157095l.observe(new Function1() { // from class: l.nzt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f141249a.m177289e3((ModelData) obj);
            }
        });
        l9s.m149072e().signedIn().takeFirst(new w9j() { // from class: l.ozt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.pzt
            @Override // p149l.e30
            public final void call(Object obj) {
                s2u.m182070b();
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m177286b3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_ALL", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m177287c3(ModelData modelData) {
        return TextUtils.equals("TYPE_LOAD_MORE", modelData == null ? "" : modelData.getMessage());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Unit m177288d3(ModelData modelData) {
        if (modelData.isLoading()) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m68923E5();
        }
        if (modelData.isComplete()) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m68921C5();
        }
        if (!modelData.isError()) {
            return null;
        }
        m220949T2();
        modelData.getThrowable();
        ((LiveSquareCommonFeedFrag) this.viewModel).m68929K5();
        if (m177286b3(modelData)) {
            if (this.f157095l.getInfo() == null || this.f157095l.getInfo().m162488F()) {
                ((LiveSquareCommonFeedFrag) this.viewModel).m68924F5(modelData.getThrowable());
            }
        } else if (m177287c3(modelData)) {
            ((LiveSquareCommonFeedFrag) this.viewModel).m68922D5();
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44150a0));
        return null;
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ Unit m177289e3(ModelData modelData) {
        if (!modelData.isSuccess() || this.f157095l.getInfo() == null) {
            return null;
        }
        ((LiveSquareCommonFeedFrag) this.viewModel).m68926H5(this.f157095l.getInfo());
        return null;
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m177290f3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((LiveSquareCommonFeedFrag) v2).m70821Q4());
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m177291g3(Long l2) {
        this.f157095l.updateCurrentLiveInfo();
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m177292h3(Throwable th) {
        m220949T2();
    }

    /* JADX INFO: renamed from: i3 */
    public void m177293i3() {
        this.f157095l.getData();
    }

    /* JADX INFO: renamed from: j3 */
    public void m177294j3(boolean z) {
        this.f157095l.loadNextPage(z);
    }

    /* JADX INFO: renamed from: k3 */
    public void m177295k3() {
        this.f205725f.m103657c();
        this.f205725f.m103655a(duringCreated(C22306c.interval(this.f205726g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.jzt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120415a.m177290f3((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125419a.m177291g3((Long) obj);
            }
        }, new e30() { // from class: l.lzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130676a.m177292h3((Throwable) obj);
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
