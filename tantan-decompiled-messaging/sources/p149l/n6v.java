package p149l;

import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n6v extends bwr<j7v> {

    /* JADX INFO: renamed from: a */
    public final mss f137447a;

    /* JADX INFO: renamed from: b */
    public p7v f137448b;

    /* JADX INFO: renamed from: c */
    public final e8v f137449c;

    /* JADX INFO: renamed from: d */
    public String f137450d;

    /* JADX INFO: renamed from: e */
    public List<q4s> f137451e;

    /* JADX INFO: renamed from: f */
    public String f137452f;

    /* JADX INFO: renamed from: g */
    public v6v f137453g;

    public n6v(mss mssVar) {
        super(mssVar.f135531b);
        this.f137451e = new ArrayList();
        this.f137447a = mssVar;
        this.f137448b = new p7v(mssVar);
        this.f137449c = new e8v();
    }

    /* JADX INFO: renamed from: A2 */
    private void m158071A2() {
        if (((j7v) this.viewModel).f116648d.m223750B()) {
            ((j7v) this.viewModel).f116648d.m223775t();
        }
    }

    /* JADX INFO: renamed from: C2 */
    private void m158072C2(List<q4s> list) {
        this.f137451e.clear();
        this.f137451e.addAll(list);
        ij4 ij4Var = new ij4(this);
        ij4Var.m136507d("0");
        ((j7v) this.viewModel).f116650f.m69888b0(d2s.m109829b(ij4Var, this.f137451e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m158073I2(Boolean bool) {
        this.f137449c.m115300h(((j7v) this.viewModel).f116646b, bool.booleanValue());
    }

    /* JADX INFO: renamed from: R2 */
    private void m158074R2() {
        duringCreated(LiveVoiceInternalSquareApi.requestTab()).subscribe(ffw.m121194e(new e30() { // from class: l.j6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116540a.m158089M2((BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.k6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121505a.m158090N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    private BaseLiveListBean<LiveVoiceInternalSquareTabBean> m158081z2() {
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = new BaseLiveListBean<>();
        ArrayList arrayList = new ArrayList();
        LiveVoiceInternalSquareTabBean liveVoiceInternalSquareTabBean = new LiveVoiceInternalSquareTabBean();
        liveVoiceInternalSquareTabBean.setTabId("0");
        liveVoiceInternalSquareTabBean.setName("推荐");
        arrayList.add(liveVoiceInternalSquareTabBean);
        baseLiveListBean.setList(arrayList);
        return baseLiveListBean;
    }

    /* JADX INFO: renamed from: B2 */
    public mss m158082B2() {
        return this.f137447a;
    }

    /* JADX INFO: renamed from: D2 */
    public void m158083D2() {
        if (this.f137453g == null) {
            this.f137453g = new v6v(this.f137447a, ((j7v) this.viewModel).f116647c, true);
        }
        this.f137453g.m197235z2();
    }

    /* JADX INFO: renamed from: E2 */
    public void m158084E2() {
        duringCreated(this.f137447a.f135530a.LiveVoiceInternalWidgetEvent.bottomWidget().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.h6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106120a.m158086H2((LiveVoiceInternalSquareBean) obj);
            }
        }));
        duringCreated(this.f137447a.f135530a.LiveVoiceInternalWidgetEvent.scrollDirectionForWidget().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.i6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111782a.m158073I2((Boolean) obj);
            }
        }));
        m158092Q2();
        m158074R2();
    }

    /* JADX INFO: renamed from: F2 */
    public void m158085F2(BLiveSquareTab bLiveSquareTab) {
        ((j7v) this.viewModel).m140119r();
        ((j7v) this.viewModel).m140118d(this.f137447a.m156171a());
        this.f137453g.m197230A2(bLiveSquareTab);
        this.f137449c.m115301i(((j7v) this.viewModel).f116646b, null);
        p7v p7vVar = this.f137448b;
        V v2 = this.viewModel;
        p7vVar.mo51532C(new w7v(((j7v) v2).f116651g, ((j7v) v2).f116652h));
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m158086H2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f137449c.m115301i(((j7v) this.viewModel).f116646b, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m158087K2(LiveVoiceInternalSquareHeaderBean liveVoiceInternalSquareHeaderBean) {
        xdl0.m208344M(((j7v) this.viewModel).f116650f, NullChecker.m81303a(liveVoiceInternalSquareHeaderBean));
        if (liveVoiceInternalSquareHeaderBean == null) {
            return;
        }
        ((j7v) this.viewModel).f116650f.m69889c0(this.f137447a.f135531b, liveVoiceInternalSquareHeaderBean.getEntrys());
        m158072C2(liveVoiceInternalSquareHeaderBean.getCards());
        m158071A2();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m158088L2(Throwable th) {
        xdl0.m208344M(((j7v) this.viewModel).f116650f, false);
        m158071A2();
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m158089M2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean != null && baseLiveListBean.getList() != null) {
            this.f137448b.m167776v2(baseLiveListBean, this.f137450d, this.f137452f);
        } else {
            this.f137448b.m167776v2(m158081z2(), this.f137450d, this.f137452f);
            CrashHelper.m81296c(new IllegalArgumentException("live virtual square tab list is null"));
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m158090N2(Throwable th) {
        this.f137448b.m167776v2(m158081z2(), this.f137450d, this.f137452f);
        CrashHelper.m81296c(new IllegalArgumentException("live virtual square tab request error", th));
    }

    /* JADX INFO: renamed from: P2 */
    public void m158091P2() {
        m158092Q2();
        v6v v6vVar = this.f137453g;
        if (v6vVar != null) {
            v6vVar.m197234E2();
        }
        p7v p7vVar = this.f137448b;
        if (p7vVar != null) {
            p7vVar.m167775u2();
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m158092Q2() {
        duringCreated(LiveVoiceInternalSquareApi.requestHeaders()).subscribe(ffw.m121194e(new e30() { // from class: l.l6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126671a.m158087K2((LiveVoiceInternalSquareHeaderBean) obj);
            }
        }, new e30() { // from class: l.m6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131770a.m158088L2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S2 */
    public void m158093S2(String str) {
        this.f137450d = str;
        p7v p7vVar = this.f137448b;
        if (p7vVar != null) {
            p7vVar.m167777w2(str);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m158094T2(String str) {
        this.f137452f = str;
    }

    /* JADX INFO: renamed from: y2 */
    public void m158095y2(j7v j7vVar) {
        super.mo51532C(j7vVar);
    }
}
