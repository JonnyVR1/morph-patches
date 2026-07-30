package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.d1q;
import l.e30;
import l.ffw;
import l.mqv;
import l.u4n0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n26 extends h4t<ho2, a26> {
    public n26(bsm bsmVar) {
        super(bsmVar);
        C(new a26());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m18428L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    private void m18432P3() {
        ((a26) ((bwr) this).viewModel).m9280d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public final void m18433R3(String str, String str2, int i, int i2, String str3) {
        duringCreated(LivingNormalApiProvider.m4974w5(str, str2, i, i2, m25547E2().m14539W0(), str3)).map(new w9j() { // from class: l.i26
            public final Object call(Object obj) {
                return this.f12403a.m18434S3((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.j26
            public final void call(Object obj) {
                this.f13530a.m18435T3((y16) obj);
            }
        }, new e30() { // from class: l.k26
            public final void call(Object obj) {
                n26.m18428L3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ y16 m18434S3(BLiveEnvelope bLiveEnvelope) {
        return new y16.C0903a().m26299d(bLiveEnvelope).m26300e(m25547E2().m14539W0()).m26298c();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ d1q m18436U3(mqv mqvVar) {
        return new e26(mqvVar).m12153P(new e30() { // from class: l.m26
            public final void call(Object obj) {
                this.f15217a.m18439X3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m18437V3(k980 k980Var) {
        m18441Z3(k980Var.f14256b, k980Var.f14255a, k980Var.f14258d);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m18438W3(Integer num) {
        m18432P3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    public void m18439X3(String str) {
        if ("voice-live".equals(m25547E2().mo14489A0())) {
            u4n0.k(this, ((DbObject) m25547E2().m14582l0()).id, str);
        } else {
            m25548F2().OpenUserCardDialogEvent.show().j(new UserCardData.Builder(4402).userId(str).setSource("contribution").setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, str, 4402)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, str, 4402)).setScene("call").build());
        }
    }

    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public final void m18435T3(y16 y16Var) {
        ((a26) ((bwr) this).viewModel).m9281f(vwb.Q(y16Var.m26294e(), new w9j() { // from class: l.l26
            public final Object call(Object obj) {
                return this.f14656a.m18436U3((mqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m18441Z3(String str, String str2, String str3) {
        m18433R3(str, str2, 0, 20, str3);
        ((a26) ((bwr) this).viewModel).m9282i();
    }

    /* JADX INFO: renamed from: t */
    public void m18442t() {
        super.t();
        duringCreated((c) m25548F2().PlugPubEvent.openContributeDialog().g()).subscribe(ffw.d(new e30() { // from class: l.g26
            public final void call(Object obj) {
                this.f10731a.m18437V3((k980) obj);
            }
        }));
        duringCreated((c) m25548F2().PlugPubEvent.dismissContributeDialog().g()).subscribe(ffw.d(new e30() { // from class: l.h26
            public final void call(Object obj) {
                this.f11849a.m18438W3((Integer) obj);
            }
        }));
    }
}
