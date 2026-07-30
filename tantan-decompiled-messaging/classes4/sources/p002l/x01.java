package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveClarity;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.soj0;
import l.uqd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x01 extends h4t<ho2, r01> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public uqd0 f22057i;

    public x01(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f22057i = new uqd0("ARTICULATION_SELECT_LIVE_ID", "");
        C(new r01());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m25567L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m25569P3(soj0 soj0Var) {
        m25573S3();
    }

    /* JADX INFO: renamed from: N3 */
    public ViewGroup m25570N3() {
        return m25556Q2();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m25571O3(List list) {
        ((r01) ((bwr) this).viewModel).m21661n(list);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public void m25572R3(BLiveClarity bLiveClarity) {
        if (!TextUtils.isEmpty(bLiveClarity.url) && !bLiveClarity.selected) {
            duringCreated(LivingNormalApiProvider.m4994y7(m25547E2().m17235k(), bLiveClarity.idx)).subscribe(ffw.h(new e30() { // from class: l.w01
                public final void call(Object obj) {
                    lsi0.y("清晰度切换成功");
                }
            }));
            BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsDataM17234j.streamUrl;
            bLiveStreamUrl.pullFlv = bLiveClarity.url;
            bLiveStreamUrl.useCurrentPullStream = true;
            m25547E2().m17232g(bLiveAbsDataM17234j);
            this.f22057i.put(bLiveAbsDataM17234j.id);
            m25548F2().PlayerEvent.restartPlay().p();
        }
        ((r01) ((bwr) this).viewModel).m21657f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public void m25573S3() {
        duringCreated(LivingNormalApiProvider.m4982x4(m25547E2().m17235k())).subscribe(ffw.e(new e30() { // from class: l.u01
            public final void call(Object obj) {
                this.f20442a.m25571O3((List) obj);
            }
        }, new e30() { // from class: l.v01
            public final void call(Object obj) {
                x01.m25567L3((Throwable) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((r01) ((bwr) this).viewModel).m21657f();
    }

    /* JADX INFO: renamed from: t */
    public void m25574t() {
        super.t();
        duringCreated((c) m25548F2().ArticulationSelectEvent.showArticulationSelectDialog().g()).subscribe(ffw.d(new e30() { // from class: l.t01
            public final void call(Object obj) {
                this.f19348a.m25569P3((soj0) obj);
            }
        }));
    }
}
