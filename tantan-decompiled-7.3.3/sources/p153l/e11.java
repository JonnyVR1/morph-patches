package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveClarity;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e11 extends i6t<oo2, y01> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public wyd0 f91560i;

    public e11(dum<? extends oo2> dumVar) {
        super(dumVar);
        this.f91560i = new wyd0("ARTICULATION_SELECT_LIVE_ID", "");
        mo52715C(new y01());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m118931L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m118933P3(vxj0 vxj0Var) {
        m118937S3();
    }

    /* JADX INFO: renamed from: N3 */
    public ViewGroup m118934N3() {
        return m213819Q2();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m118935O3(List list) {
        ((y01) this.viewModel).m213838n(list);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: R3 */
    public void m118936R3(BLiveClarity bLiveClarity) {
        if (!TextUtils.isEmpty(bLiveClarity.url) && !bLiveClarity.selected) {
            duringCreated(LivingNormalApiProvider.m72811y7(m213810E2().m202191k(), bLiveClarity.idx)).subscribe(dhw.m115829h(new y20() { // from class: l.d11
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y("清晰度切换成功");
                }
            }));
            BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsDataMo183435j.streamUrl;
            bLiveStreamUrl.pullFlv = bLiveClarity.url;
            bLiveStreamUrl.useCurrentPullStream = true;
            m213810E2().mo183431g(bLiveAbsDataMo183435j);
            this.f91560i.put(bLiveAbsDataMo183435j.f45171id);
            m213811F2().PlayerEvent.restartPlay().m199277p();
        }
        ((y01) this.viewModel).m213835f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: S3 */
    public void m118937S3() {
        duringCreated(LivingNormalApiProvider.m72799x4(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.b11
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74314a.m118935O3((List) obj);
            }
        }, new y20() { // from class: l.c11
            @Override // p153l.y20
            public final void call(Object obj) {
                e11.m118931L3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((y01) this.viewModel).m213835f();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().ArticulationSelectEvent.showArticulationSelectDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a11
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67775a.m118933P3((vxj0) obj);
            }
        }));
    }
}
