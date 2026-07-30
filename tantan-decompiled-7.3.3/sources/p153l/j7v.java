package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class j7v extends cyr<o7v> {

    /* JADX INFO: renamed from: a */
    public final String f118728a;

    /* JADX INFO: renamed from: b */
    public final nus f118729b;

    /* JADX INFO: renamed from: c */
    public final LiveVPagerBaseFrag f118730c;

    /* JADX INFO: renamed from: d */
    public final String f118731d;

    /* JADX INFO: renamed from: e */
    public hk4 f118732e;

    /* JADX INFO: renamed from: f */
    public PaginationBean f118733f;

    /* JADX INFO: renamed from: g */
    public List<r6s> f118734g;

    /* JADX INFO: renamed from: h */
    public boolean f118735h;

    /* JADX INFO: renamed from: i */
    public boolean f118736i;

    public j7v(LiveVPagerBaseFrag liveVPagerBaseFrag, nus nusVar, String str, String str2) {
        super(liveVPagerBaseFrag);
        this.f118734g = new ArrayList();
        this.f118728a = str;
        this.f118729b = nusVar;
        this.f118730c = liveVPagerBaseFrag;
        this.f118731d = str2;
        hk4 hk4Var = new hk4(liveVPagerBaseFrag);
        this.f118732e = hk4Var;
        hk4Var.m135618d(str);
    }

    /* JADX INFO: renamed from: C2 */
    private void m143791C2(boolean z, long j) {
        if (z) {
            if (((o7v) this.viewModel).m166379m()) {
                m143796T2();
            } else if (j < 0 || j > ((long) tbs.f172989b.m203732sb()) * 1000) {
                m143796T2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ Boolean m143792H2(C4470c c4470c) {
        return Boolean.valueOf(this.f118730c.m72004Q4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ Boolean m143793I2(C4470c c4470c) {
        return Boolean.valueOf(this.f118735h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m143794K2(C4470c c4470c) {
        m143796T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m143795N2(Throwable th) {
        th.toString();
        ((o7v) this.viewModel).m166382q();
    }

    /* JADX INFO: renamed from: T2 */
    private void m143796T2() {
        duringCreated(LiveVoiceInternalSquareApi.getTabDetail(this.f118728a, this.f118731d)).subscribe(dhw.m115826e(new y20() { // from class: l.f7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97597a.m143806D2((LiveVoiceInternalSquareBean) obj);
            }
        }, new y20() { // from class: l.g7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102624a.m143795N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public void m143797U2(xys xysVar) {
        ((o7v) this.viewModel).m166384s(xysVar);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m143806D2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f118735h = liveVoiceInternalSquareBean.isRefreshWhenVisible();
        this.f118733f = liveVoiceInternalSquareBean.getPagination();
        liveVoiceInternalSquareBean.hasNextPage();
        this.f118729b.f143737a.LiveVoiceInternalWidgetEvent.bottomWidget().mo199273j(liveVoiceInternalSquareBean);
        if (liveVoiceInternalSquareBean.getCardList() == null) {
            liveVoiceInternalSquareBean.setCardList(new ArrayList());
        }
        this.f118734g.clear();
        this.f118734g.addAll(liveVoiceInternalSquareBean.getCardList());
        ((o7v) this.viewModel).m166381p(e4s.m119474b(this.f118732e, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: E2 */
    public final void m143807E2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f118736i = false;
        if (jyb.m147479J(liveVoiceInternalSquareBean.getCardList())) {
            return;
        }
        this.f118733f = liveVoiceInternalSquareBean.getPagination();
        ((o7v) this.viewModel).m166374e(e4s.m119474b(this.f118732e, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: F2 */
    public void m143808F2() {
        tbs.f172993f.m143720v(false);
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.z6v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).filter(new qcj() { // from class: l.a7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68843a.m143792H2((C4470c) obj);
            }
        }).filter(new qcj() { // from class: l.b7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75339a.m143793I2((C4470c) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.c7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80146a.m143794K2((C4470c) obj);
            }
        }));
        m113231o2(((gm3) tbs.m190077m(itd0.f116821c)).m130726a(), false).filter(new qcj() { // from class: l.d7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85550a.m143809L2((xys) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.e7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92469a.m143797U2((xys) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ Boolean m143809L2(xys xysVar) {
        return Boolean.valueOf(TextUtils.equals(xysVar.m213644g(), this.f118728a));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m143810M2(Throwable th) {
        this.f118736i = false;
        th.toString();
    }

    /* JADX INFO: renamed from: P2 */
    public void m143811P2() {
        if (!BaseLiveBean.hasNextPage(this.f118733f) || this.f118736i) {
            return;
        }
        this.f118736i = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageTabDetail(this.f118728a, this.f118733f.getProcessedNext(), this.f118731d)).subscribe(dhw.m115826e(new y20() { // from class: l.h7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108164a.m143807E2((LiveVoiceInternalSquareBean) obj);
            }
        }, new y20() { // from class: l.i7v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113299a.m143810M2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m143812Q2(boolean z) {
        this.f118729b.f143737a.LiveVoiceInternalWidgetEvent.scrollDirectionForWidget().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R2 */
    public void m143813R2(boolean z, int i, long j) {
        m143791C2(z, j);
    }

    /* JADX INFO: renamed from: S2 */
    public void m143814S2() {
        m143796T2();
    }
}
