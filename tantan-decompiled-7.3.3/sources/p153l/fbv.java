package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class fbv extends cyr<kbv> {

    /* JADX INFO: renamed from: a */
    public hk4 f98158a;

    /* JADX INFO: renamed from: b */
    public PaginationBean f98159b;

    /* JADX INFO: renamed from: c */
    public List<r6s> f98160c;

    /* JADX INFO: renamed from: d */
    public boolean f98161d;

    public fbv(LiveBaseFrag liveBaseFrag, hk4 hk4Var) {
        super(liveBaseFrag);
        this.f98160c = new ArrayList();
        this.f98158a = hk4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m124938B2(C4470c c4470c) {
        m124939H2();
    }

    /* JADX INFO: renamed from: H2 */
    private void m124939H2() {
        duringCreated(LiveVoiceInternalSquareApi.getTabDetail(this.f98158a.m135615a(), "")).subscribe(dhw.m115826e(new y20() { // from class: l.bbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75998a.m124946y2((LiveVoiceInternalSquareBean) obj);
            }
        }, new y20() { // from class: l.cbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80857a.m124950D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public void m124946y2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f98159b = liveVoiceInternalSquareBean.getPagination();
        liveVoiceInternalSquareBean.hasNextPage();
        if (liveVoiceInternalSquareBean.getCardList() == null) {
            liveVoiceInternalSquareBean.setCardList(new ArrayList());
        }
        this.f98160c.clear();
        this.f98160c.addAll(liveVoiceInternalSquareBean.getCardList());
        ((kbv) this.viewModel).m149090p(e4s.m119474b(this.f98158a, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public void m124947z2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f98161d = false;
        if (jyb.m147479J(liveVoiceInternalSquareBean.getCardList())) {
            return;
        }
        this.f98159b = liveVoiceInternalSquareBean.getPagination();
        ((kbv) this.viewModel).m149085e(e4s.m119474b(this.f98158a, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: A2 */
    public void m124948A2() {
        tbs.f172993f.m143720v(false);
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.zav
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.abv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69657a.m124938B2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m124949C2(Throwable th) {
        this.f98161d = false;
        th.toString();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m124950D2(Throwable th) {
        th.toString();
        ((kbv) this.viewModel).m149091q();
    }

    /* JADX INFO: renamed from: E2 */
    public void m124951E2() {
        if (!BaseLiveBean.hasNextPage(this.f98159b) || this.f98161d) {
            return;
        }
        this.f98161d = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageTabDetail(this.f98158a.m135615a(), this.f98159b.getProcessedNext(), "")).subscribe(dhw.m115826e(new y20() { // from class: l.dbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87712a.m124947z2((LiveVoiceInternalSquareBean) obj);
            }
        }, new y20() { // from class: l.ebv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92989a.m124949C2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public void m124952F2() {
        m124939H2();
    }
}
