package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.gkh0;
import l.soj0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u6t extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public BLiveUserMask f20510i;

    public u6t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m23295R3(soj0 soj0Var) {
        m23296O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m23296O3() {
        ((ggv) ypv.l(fld0.c)).e();
        this.f20510i = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: P3 */
    public final void m23297P3(final String str) {
        duringCreated(LivingNormalApiProvider.m4949t7(str, m25547E2().m17235k(), str, str, "live", "live", m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id)).map(new w9j() { // from class: l.s6t
            public final Object call(Object obj) {
                return e1t.m12110d((BLiveEnvelope) obj, str);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.t6t
            public final void call(Object obj) {
                this.f20113a.m23300T3((BLiveUserMask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ BLiveUserMask m23298S3(v220 v220Var) {
        return this.f20510i;
    }

    /* JADX INFO: renamed from: T */
    public void m23299T() {
        super.T();
        duringCreated((c) m25548F2().RoomMysteryEventGroup.setRoomFakeId().g()).subscribe(ffw.h(new e30() { // from class: l.p6t
            public final void call(Object obj) {
                this.f17027a.m23301U3((String) obj);
            }
        }));
        duringCreated((c) m25548F2().RoomMysteryEventGroup.clearRoomFakeId().g()).subscribe(ffw.h(new e30() { // from class: l.q6t
            public final void call(Object obj) {
                this.f17828a.m23295R3((soj0) obj);
            }
        }));
        m14188d3(v220.class, new w9j() { // from class: l.r6t
            public final Object call(Object obj) {
                return this.f18399a.m23298S3((v220) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m23300T3(BLiveUserMask bLiveUserMask) {
        this.f20510i = bLiveUserMask;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m23301U3(String str) {
        if (m25552L2() || TextUtils.equals(m25547E2().mo14489A0(), "voice-live")) {
            m23296O3();
            return;
        }
        gkh0.j("[live]", "setFakeId:" + str);
        ((ggv) ypv.l(fld0.c)).J(str);
        m23297P3(str);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f20510i = null;
    }
}
