package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class k0l extends jq2<s0l> {

    /* JADX INFO: renamed from: a */
    public BLiveHideAvatarEnterConfig f120496a;

    public k0l(mcr mcrVar) {
        super(mcrVar);
        this.f120496a = BLiveHideAvatarEnterConfig.new_();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m144054g0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m144059l0(Bundle bundle) {
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = (BLiveHideAvatarEnterConfig) bundle.getSerializable("enter_hide_avatar_config");
        if (bLiveHideAvatarEnterConfig != null) {
            this.f120496a = bLiveHideAvatarEnterConfig;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m144060m0(final a0l a0lVar) {
        act().dialog().m20507G0(s9s.f163227a.getString(R$string.f44131R)).m20504F(zzk.m221019a(a0lVar)).m20560v0(s9s.f163227a.getString(R$string.f44218x), new Runnable() { // from class: l.f0l
            @Override // java.lang.Runnable
            public final void run() {
                this.f93987a.m144063p0(a0lVar);
            }
        }).m20543m0(s9s.f163227a.getString(R$string.f44149a)).m20567z().show();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m144061n0(final a0l a0lVar) {
        duringCreated(LiveSquareApi.unEquipUserRight(a0lVar.m94438g().userRightId)).subscribe(ffw.m121194e(new e30() { // from class: l.g0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100061a.m144064q0(a0lVar, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.h0l
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f44208t1);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m144062o0(a0l a0lVar, BLiveFakeUser bLiveFakeUser) {
        lsi0.m151593w(R$string.f44136T0);
        ((s0l) this.viewModel).m181868f(a0lVar, true);
        m144069x0(bLiveFakeUser);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m144063p0(final a0l a0lVar) {
        duringCreated(LiveSquareApi.equipUserRight(a0lVar.m94438g().userRightId)).subscribe(ffw.m121194e(new e30() { // from class: l.i0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110351a.m144062o0(a0lVar, (BLiveFakeUser) obj);
            }
        }, new e30() { // from class: l.j0l
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f44134S0);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m144064q0(a0l a0lVar, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f44211u1);
        m144069x0(bLiveEnvelope.data.fakeUser);
        ((s0l) this.viewModel).m181868f(a0lVar, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m144065r0(List list) {
        ((s0l) this.viewModel).m181870j(list, this.f120496a);
    }

    /* JADX INFO: renamed from: s0 */
    public void m144066s0(a0l a0lVar) {
        if (a0lVar.m94440i()) {
            m144061n0(a0lVar);
        } else if (a0lVar.m94439h()) {
            m144060m0(a0lVar);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m144067t0(Bundle bundle) {
        m144059l0(bundle);
        m144068u0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m144068u0() {
        duringCreated(LiveSquareApi.getHideAvatarRight(this.f120496a)).subscribe(ffw.m121194e(new e30() { // from class: l.d0l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83192a.m144065r0((List) obj);
            }
        }, new e30() { // from class: l.e0l
            @Override // p149l.e30
            public final void call(Object obj) {
                k0l.m144054g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m144069x0(BLiveFakeUser bLiveFakeUser) {
        if (bLiveFakeUser.flush) {
            m144068u0();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
