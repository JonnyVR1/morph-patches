package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class v8t extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public BLiveUserMask f182893i;

    public v8t(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m200316R3(vxj0 vxj0Var) {
        m200317O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m200317O3() {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135153e();
        this.f182893i = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: P3 */
    public final void m200318P3(final String str) {
        duringCreated(LivingNormalApiProvider.m72766t7(str, m213810E2().m202191k(), str, str, "live", "live", m213810E2().m202194o(), m213810E2().m168532l0().f56859id)).map(new qcj() { // from class: l.t8t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f3t.m123803d((BLiveEnvelope) obj, str);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.u8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178068a.m200320T3((BLiveUserMask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ BLiveUserMask m200319S3(db20 db20Var) {
        return this.f182893i;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().RoomMysteryEventGroup.setRoomFakeId().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.q8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156161a.m200321U3((String) obj);
            }
        }));
        duringCreated(m213811F2().RoomMysteryEventGroup.clearRoomFakeId().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.r8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161765a.m200316R3((vxj0) obj);
            }
        }));
        m138860d3(db20.class, new qcj() { // from class: l.s8t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166848a.m200319S3((db20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m200320T3(BLiveUserMask bLiveUserMask) {
        this.f182893i = bLiveUserMask;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    public final void m200321U3(String str) {
        if (m213815L2() || TextUtils.equals(m213810E2().mo118362A0(), BLiveAbsData.VOICE_LIVE)) {
            m200317O3();
            return;
        }
        nsh0.m164608j("[live]", "setFakeId:" + str);
        ((hiv) zrv.m221194l(htd0.f111521c)).m135150J(str);
        m200318P3(str);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f182893i = null;
    }
}
