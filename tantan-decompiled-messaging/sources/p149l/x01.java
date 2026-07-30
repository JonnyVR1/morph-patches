package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveClarity;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x01 extends h4t<ho2, r01> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public uqd0 f188903i;

    public x01(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f188903i = new uqd0("ARTICULATION_SELECT_LIVE_ID", "");
        mo51532C(new r01());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m206527L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m206529P3(soj0 soj0Var) {
        m206533S3();
    }

    /* JADX INFO: renamed from: N3 */
    public ViewGroup m206530N3() {
        return m206036Q2();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m206531O3(List list) {
        ((r01) this.viewModel).m177326n(list);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public void m206532R3(BLiveClarity bLiveClarity) {
        if (!TextUtils.isEmpty(bLiveClarity.url) && !bLiveClarity.selected) {
            duringCreated(LivingNormalApiProvider.m71628y7(m206027E2().m149814k(), bLiveClarity.idx)).subscribe(ffw.m121197h(new e30() { // from class: l.w01
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y("清晰度切换成功");
                }
            }));
            BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsDataMo149813j.streamUrl;
            bLiveStreamUrl.pullFlv = bLiveClarity.url;
            bLiveStreamUrl.useCurrentPullStream = true;
            m206027E2().mo149811g(bLiveAbsDataMo149813j);
            this.f188903i.put(bLiveAbsDataMo149813j.f44323id);
            m206028F2().PlayerEvent.restartPlay().m172467p();
        }
        ((r01) this.viewModel).m177323f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public void m206533S3() {
        duringCreated(LivingNormalApiProvider.m71616x4(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.u01
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172821a.m206531O3((List) obj);
            }
        }, new e30() { // from class: l.v01
            @Override // p149l.e30
            public final void call(Object obj) {
                x01.m206527L3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((r01) this.viewModel).m177323f();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().ArticulationSelectEvent.showArticulationSelectDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t01
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167091a.m206529P3((soj0) obj);
            }
        }));
    }
}
