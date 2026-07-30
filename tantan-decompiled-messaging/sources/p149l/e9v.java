package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e9v extends bwr<j9v> {

    /* JADX INFO: renamed from: a */
    public ij4 f90137a;

    /* JADX INFO: renamed from: b */
    public PaginationBean f90138b;

    /* JADX INFO: renamed from: c */
    public List<q4s> f90139c;

    /* JADX INFO: renamed from: d */
    public boolean f90140d;

    public e9v(LiveBaseFrag liveBaseFrag, ij4 ij4Var) {
        super(liveBaseFrag);
        this.f90139c = new ArrayList();
        this.f90137a = ij4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m115384B2(C4319c c4319c) {
        m115385H2();
    }

    /* JADX INFO: renamed from: H2 */
    private void m115385H2() {
        duringCreated(LiveVoiceInternalSquareApi.getTabDetail(this.f90137a.m136504a(), "")).subscribe(ffw.m121194e(new e30() { // from class: l.a9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68212a.m115392y2((LiveVoiceInternalSquareBean) obj);
            }
        }, new e30() { // from class: l.b9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74628a.m115396D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public void m115392y2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f90138b = liveVoiceInternalSquareBean.getPagination();
        liveVoiceInternalSquareBean.hasNextPage();
        if (liveVoiceInternalSquareBean.getCardList() == null) {
            liveVoiceInternalSquareBean.setCardList(new ArrayList());
        }
        this.f90139c.clear();
        this.f90139c.addAll(liveVoiceInternalSquareBean.getCardList());
        ((j9v) this.viewModel).m140599p(d2s.m109829b(this.f90137a, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public void m115393z2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f90140d = false;
        if (vwb.m200296J(liveVoiceInternalSquareBean.getCardList())) {
            return;
        }
        this.f90138b = liveVoiceInternalSquareBean.getPagination();
        ((j9v) this.viewModel).m140594e(d2s.m109829b(this.f90137a, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: A2 */
    public void m115394A2() {
        s9s.f163232f.m134389v(false);
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.y8v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.z8v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202239a.m115384B2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m115395C2(Throwable th) {
        this.f90140d = false;
        th.toString();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m115396D2(Throwable th) {
        th.toString();
        ((j9v) this.viewModel).m140600q();
    }

    /* JADX INFO: renamed from: E2 */
    public void m115397E2() {
        if (!BaseLiveBean.hasNextPage(this.f90138b) || this.f90140d) {
            return;
        }
        this.f90140d = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageTabDetail(this.f90137a.m136504a(), this.f90138b.getProcessedNext(), "")).subscribe(ffw.m121194e(new e30() { // from class: l.c9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79974a.m115393z2((LiveVoiceInternalSquareBean) obj);
            }
        }, new e30() { // from class: l.d9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85158a.m115395C2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public void m115398F2() {
        m115385H2();
    }
}
