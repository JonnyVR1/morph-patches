package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class a3l extends ar2<i3l> {

    /* JADX INFO: renamed from: a */
    public BLiveHideAvatarEnterConfig f68296a;

    public a3l(ner nerVar) {
        super(nerVar);
        this.f68296a = BLiveHideAvatarEnterConfig.new_();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m95809g0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m95814l0(Bundle bundle) {
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = (BLiveHideAvatarEnterConfig) bundle.getSerializable("enter_hide_avatar_config");
        if (bLiveHideAvatarEnterConfig != null) {
            this.f68296a = bLiveHideAvatarEnterConfig;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m95815m0(final q2l q2lVar) {
        act().dialog().m21506G0(tbs.f172988a.getString(R$string.f44979R)).m21503F(p2l.m170375a(q2lVar)).m21559v0(tbs.f172988a.getString(R$string.f45066x), new Runnable() { // from class: l.v2l
            @Override // java.lang.Runnable
            public final void run() {
                this.f182097a.m95818p0(q2lVar);
            }
        }).m21542m0(tbs.f172988a.getString(R$string.f44997a)).m21566z().show();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m95816n0(final q2l q2lVar) {
        duringCreated(LiveSquareApi.unEquipUserRight(q2lVar.m175048g().userRightId)).subscribe(dhw.m115826e(new y20() { // from class: l.w2l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186913a.m95819q0(q2lVar, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.x2l
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f45056t1);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m95817o0(q2l q2lVar, BLiveFakeUser bLiveFakeUser) {
        o1j0.m165649w(R$string.f44984T0);
        ((i3l) this.viewModel).m138308f(q2lVar, true);
        m95824x0(bLiveFakeUser);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m95818p0(final q2l q2lVar) {
        duringCreated(LiveSquareApi.equipUserRight(q2lVar.m175048g().userRightId)).subscribe(dhw.m115826e(new y20() { // from class: l.y2l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197265a.m95817o0(q2lVar, (BLiveFakeUser) obj);
            }
        }, new y20() { // from class: l.z2l
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f44982S0);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m95819q0(q2l q2lVar, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f45059u1);
        m95824x0(bLiveEnvelope.data.fakeUser);
        ((i3l) this.viewModel).m138308f(q2lVar, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m95820r0(List list) {
        ((i3l) this.viewModel).m138310j(list, this.f68296a);
    }

    /* JADX INFO: renamed from: s0 */
    public void m95821s0(q2l q2lVar) {
        if (q2lVar.m175050i()) {
            m95816n0(q2lVar);
        } else if (q2lVar.m175049h()) {
            m95815m0(q2lVar);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m95822t0(Bundle bundle) {
        m95814l0(bundle);
        m95823u0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m95823u0() {
        duringCreated(LiveSquareApi.getHideAvatarRight(this.f68296a)).subscribe(dhw.m115826e(new y20() { // from class: l.t2l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171772a.m95820r0((List) obj);
            }
        }, new y20() { // from class: l.u2l
            @Override // p153l.y20
            public final void call(Object obj) {
                a3l.m95809g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m95824x0(BLiveFakeUser bLiveFakeUser) {
        if (bLiveFakeUser.flush) {
            m95823u0();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
