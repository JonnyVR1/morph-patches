package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class u6t extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public BLiveUserMask f174881i;

    public u6t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m192023R3(soj0 soj0Var) {
        m192024O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m192024O3() {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126019e();
        this.f174881i = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: P3 */
    public final void m192025P3(final String str) {
        duringCreated(LivingNormalApiProvider.m71583t7(str, m206027E2().m149814k(), str, str, "live", "live", m206027E2().m149818o(), m206027E2().m132146l0().f56011id)).map(new w9j() { // from class: l.s6t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e1t.m114442d((BLiveEnvelope) obj, str);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.t6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168640a.m192027T3((BLiveUserMask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ BLiveUserMask m192026S3(v220 v220Var) {
        return this.f174881i;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().RoomMysteryEventGroup.setRoomFakeId().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.p6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147438a.m192028U3((String) obj);
            }
        }));
        duringCreated(m206028F2().RoomMysteryEventGroup.clearRoomFakeId().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.q6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152956a.m192023R3((soj0) obj);
            }
        }));
        m129301d3(v220.class, new w9j() { // from class: l.r6t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157979a.m192026S3((v220) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m192027T3(BLiveUserMask bLiveUserMask) {
        this.f174881i = bLiveUserMask;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m192028U3(String str) {
        if (m206032L2() || TextUtils.equals(m206027E2().mo132054A0(), BLiveAbsData.VOICE_LIVE)) {
            m192024O3();
            return;
        }
        gkh0.m126627j("[live]", "setFakeId:" + str);
        ((ggv) ypv.m215673l(fld0.f98148c)).m126016J(str);
        m192025P3(str);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f174881i = null;
    }
}
