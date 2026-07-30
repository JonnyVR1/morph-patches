package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class i5v extends bwr<n5v> {

    /* JADX INFO: renamed from: a */
    public final String f111643a;

    /* JADX INFO: renamed from: b */
    public final mss f111644b;

    /* JADX INFO: renamed from: c */
    public final LiveVPagerBaseFrag f111645c;

    /* JADX INFO: renamed from: d */
    public final String f111646d;

    /* JADX INFO: renamed from: e */
    public ij4 f111647e;

    /* JADX INFO: renamed from: f */
    public PaginationBean f111648f;

    /* JADX INFO: renamed from: g */
    public List<q4s> f111649g;

    /* JADX INFO: renamed from: h */
    public boolean f111650h;

    /* JADX INFO: renamed from: i */
    public boolean f111651i;

    public i5v(LiveVPagerBaseFrag liveVPagerBaseFrag, mss mssVar, String str, String str2) {
        super(liveVPagerBaseFrag);
        this.f111649g = new ArrayList();
        this.f111643a = str;
        this.f111644b = mssVar;
        this.f111645c = liveVPagerBaseFrag;
        this.f111646d = str2;
        ij4 ij4Var = new ij4(liveVPagerBaseFrag);
        this.f111647e = ij4Var;
        ij4Var.m136507d(str);
    }

    /* JADX INFO: renamed from: C2 */
    private void m134537C2(boolean z, long j) {
        if (z) {
            if (((n5v) this.viewModel).m158010m()) {
                m134542T2();
            } else if (j < 0 || j > ((long) s9s.f163228b.m195945sb()) * 1000) {
                m134542T2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public /* synthetic */ Boolean m134538H2(C4319c c4319c) {
        return Boolean.valueOf(this.f111645c.m70821Q4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public /* synthetic */ Boolean m134539I2(C4319c c4319c) {
        return Boolean.valueOf(this.f111650h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m134540K2(C4319c c4319c) {
        m134542T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m134541N2(Throwable th) {
        th.toString();
        ((n5v) this.viewModel).m158013q();
    }

    /* JADX INFO: renamed from: T2 */
    private void m134542T2() {
        duringCreated(LiveVoiceInternalSquareApi.getTabDetail(this.f111643a, this.f111646d)).subscribe(ffw.m121194e(new e30() { // from class: l.e5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89472a.m134552D2((LiveVoiceInternalSquareBean) obj);
            }
        }, new e30() { // from class: l.f5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95203a.m134541N2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public void m134543U2(wws wwsVar) {
        ((n5v) this.viewModel).m158015s(wwsVar);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m134552D2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f111650h = liveVoiceInternalSquareBean.isRefreshWhenVisible();
        this.f111648f = liveVoiceInternalSquareBean.getPagination();
        liveVoiceInternalSquareBean.hasNextPage();
        this.f111644b.f135530a.LiveVoiceInternalWidgetEvent.bottomWidget().mo172463j(liveVoiceInternalSquareBean);
        if (liveVoiceInternalSquareBean.getCardList() == null) {
            liveVoiceInternalSquareBean.setCardList(new ArrayList());
        }
        this.f111649g.clear();
        this.f111649g.addAll(liveVoiceInternalSquareBean.getCardList());
        ((n5v) this.viewModel).m158012p(d2s.m109829b(this.f111647e, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: E2 */
    public final void m134553E2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f111651i = false;
        if (vwb.m200296J(liveVoiceInternalSquareBean.getCardList())) {
            return;
        }
        this.f111648f = liveVoiceInternalSquareBean.getPagination();
        ((n5v) this.viewModel).m158005e(d2s.m109829b(this.f111647e, liveVoiceInternalSquareBean.getCardList()), liveVoiceInternalSquareBean.hasNextPage(), liveVoiceInternalSquareBean.isNoMoreDataTip());
    }

    /* JADX INFO: renamed from: F2 */
    public void m134554F2() {
        s9s.f163232f.m134389v(false);
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.y4v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).filter(new w9j() { // from class: l.z4v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201638a.m134538H2((C4319c) obj);
            }
        }).filter(new w9j() { // from class: l.a5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67725a.m134539I2((C4319c) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.b5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73701a.m134540K2((C4319c) obj);
            }
        }));
        m104250o2(((hl3) s9s.m182763m(gld0.f103313c)).m131627a(), false).filter(new w9j() { // from class: l.c5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79421a.m134555L2((wws) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.d5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84559a.m134543U2((wws) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ Boolean m134555L2(wws wwsVar) {
        return Boolean.valueOf(TextUtils.equals(wwsVar.m205881g(), this.f111643a));
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m134556M2(Throwable th) {
        this.f111651i = false;
        th.toString();
    }

    /* JADX INFO: renamed from: P2 */
    public void m134557P2() {
        if (!BaseLiveBean.hasNextPage(this.f111648f) || this.f111651i) {
            return;
        }
        this.f111651i = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageTabDetail(this.f111643a, this.f111648f.getProcessedNext(), this.f111646d)).subscribe(ffw.m121194e(new e30() { // from class: l.g5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101202a.m134553E2((LiveVoiceInternalSquareBean) obj);
            }
        }, new e30() { // from class: l.h5v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105992a.m134556M2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m134558Q2(boolean z) {
        this.f111644b.f135530a.LiveVoiceInternalWidgetEvent.scrollDirectionForWidget().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: R2 */
    public void m134559R2(boolean z, int i, long j) {
        m134537C2(z, j);
    }

    /* JADX INFO: renamed from: S2 */
    public void m134560S2() {
        m134542T2();
    }
}
