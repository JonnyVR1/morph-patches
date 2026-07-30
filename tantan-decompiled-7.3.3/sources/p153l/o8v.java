package p153l;

import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class o8v extends cyr<k9v> {

    /* JADX INFO: renamed from: a */
    public final nus f145470a;

    /* JADX INFO: renamed from: b */
    public q9v f145471b;

    /* JADX INFO: renamed from: c */
    public final fav f145472c;

    /* JADX INFO: renamed from: d */
    public String f145473d;

    /* JADX INFO: renamed from: e */
    public List<r6s> f145474e;

    /* JADX INFO: renamed from: f */
    public String f145475f;

    /* JADX INFO: renamed from: g */
    public w8v f145476g;

    public o8v(nus nusVar) {
        super(nusVar.f143738b);
        this.f145474e = new ArrayList();
        this.f145470a = nusVar;
        this.f145471b = new q9v(nusVar);
        this.f145472c = new fav();
    }

    /* JADX INFO: renamed from: A2 */
    private void m166609A2() {
        if (((k9v) this.viewModel).f124581d.m224996B()) {
            ((k9v) this.viewModel).f124581d.m225021t();
        }
    }

    /* JADX INFO: renamed from: C2 */
    private void m166610C2(List<r6s> list) {
        this.f145474e.clear();
        this.f145474e.addAll(list);
        hk4 hk4Var = new hk4(this);
        hk4Var.m135618d("0");
        ((k9v) this.viewModel).f124583f.m71071b0(e4s.m119474b(hk4Var, this.f145474e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ void m166611I2(Boolean bool) {
        this.f145472c.m124778h(((k9v) this.viewModel).f124579b, bool.booleanValue());
    }

    /* JADX INFO: renamed from: R2 */
    private void m166612R2() {
        duringCreated(LiveVoiceInternalSquareApi.requestTab()).subscribe(dhw.m115826e(new y20() { // from class: l.k8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124419a.m166627M2((BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.l8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130516a.m166628N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    private BaseLiveListBean<LiveVoiceInternalSquareTabBean> m166619z2() {
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
    public nus m166620B2() {
        return this.f145470a;
    }

    /* JADX INFO: renamed from: D2 */
    public void m166621D2() {
        if (this.f145476g == null) {
            this.f145476g = new w8v(this.f145470a, ((k9v) this.viewModel).f124580c, true);
        }
        this.f145476g.m205536z2();
    }

    /* JADX INFO: renamed from: E2 */
    public void m166622E2() {
        duringCreated(this.f145470a.f143737a.LiveVoiceInternalWidgetEvent.bottomWidget().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.i8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113371a.m166624H2((LiveVoiceInternalSquareBean) obj);
            }
        }));
        duringCreated(this.f145470a.f143737a.LiveVoiceInternalWidgetEvent.scrollDirectionForWidget().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.j8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118819a.m166611I2((Boolean) obj);
            }
        }));
        m166630Q2();
        m166612R2();
    }

    /* JADX INFO: renamed from: F2 */
    public void m166623F2(BLiveSquareTab bLiveSquareTab) {
        ((k9v) this.viewModel).m148892r();
        ((k9v) this.viewModel).m148891d(this.f145470a.m164819a());
        this.f145476g.m205531A2(bLiveSquareTab);
        this.f145472c.m124779i(((k9v) this.viewModel).f124579b, null);
        q9v q9vVar = this.f145471b;
        V v2 = this.viewModel;
        q9vVar.mo52715C(new x9v(((k9v) v2).f124584g, ((k9v) v2).f124585h));
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m166624H2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f145472c.m124779i(((k9v) this.viewModel).f124579b, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m166625K2(LiveVoiceInternalSquareHeaderBean liveVoiceInternalSquareHeaderBean) {
        bnl0.m105524M(((k9v) this.viewModel).f124583f, NullChecker.m82486a(liveVoiceInternalSquareHeaderBean));
        if (liveVoiceInternalSquareHeaderBean == null) {
            return;
        }
        ((k9v) this.viewModel).f124583f.m71072c0(this.f145470a.f143738b, liveVoiceInternalSquareHeaderBean.getEntrys());
        m166610C2(liveVoiceInternalSquareHeaderBean.getCards());
        m166609A2();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m166626L2(Throwable th) {
        bnl0.m105524M(((k9v) this.viewModel).f124583f, false);
        m166609A2();
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m166627M2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean != null && baseLiveListBean.getList() != null) {
            this.f145471b.m175849v2(baseLiveListBean, this.f145473d, this.f145475f);
        } else {
            this.f145471b.m175849v2(m166619z2(), this.f145473d, this.f145475f);
            CrashHelper.m82479c(new IllegalArgumentException("live virtual square tab list is null"));
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m166628N2(Throwable th) {
        this.f145471b.m175849v2(m166619z2(), this.f145473d, this.f145475f);
        CrashHelper.m82479c(new IllegalArgumentException("live virtual square tab request error", th));
    }

    /* JADX INFO: renamed from: P2 */
    public void m166629P2() {
        m166630Q2();
        w8v w8vVar = this.f145476g;
        if (w8vVar != null) {
            w8vVar.m205535E2();
        }
        q9v q9vVar = this.f145471b;
        if (q9vVar != null) {
            q9vVar.m175848u2();
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m166630Q2() {
        duringCreated(LiveVoiceInternalSquareApi.requestHeaders()).subscribe(dhw.m115826e(new y20() { // from class: l.m8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135294a.m166625K2((LiveVoiceInternalSquareHeaderBean) obj);
            }
        }, new y20() { // from class: l.n8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140714a.m166626L2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S2 */
    public void m166631S2(String str) {
        this.f145473d = str;
        q9v q9vVar = this.f145471b;
        if (q9vVar != null) {
            q9vVar.m175850w2(str);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m166632T2(String str) {
        this.f145475f = str;
    }

    /* JADX INFO: renamed from: y2 */
    public void m166633y2(k9v k9vVar) {
        super.mo52715C(k9vVar);
    }
}
