package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubBigWigsUserItemView;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import l.c4g0;
import l.d1q;
import l.e30;
import l.ffw;
import l.imf0;
import l.mcr;
import l.mkd0;
import l.v050;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kx2 extends d1q<LiveFansClubBigWigsUserItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveLeaderboardRecord f14565a;

    /* JADX INFO: renamed from: b */
    public final mcr f14566b;

    /* JADX INFO: renamed from: c */
    public final BLiveLeaderboardMedal f14567c;

    /* JADX INFO: renamed from: d */
    public c4g0 f14568d;

    /* JADX INFO: renamed from: e */
    public final gm0 f14569e;

    /* JADX INFO: renamed from: f */
    public final BLiveLeaderboardUser f14570f;

    /* JADX INFO: renamed from: g */
    public final String f14571g;

    public kx2(mcr mcrVar, BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardMedal bLiveLeaderboardMedal, BLiveLeaderboardUser bLiveLeaderboardUser, gm0 gm0Var, String str) {
        this.f14565a = bLiveLeaderboardRecord;
        this.f14566b = mcrVar;
        this.f14570f = bLiveLeaderboardUser;
        this.f14567c = bLiveLeaderboardMedal;
        this.f14569e = gm0Var;
        this.f14571g = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m16859H(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView, imf0 imf0Var) {
        xdl0.M0(liveFansClubBigWigsUserItemView.f5128d, true);
        liveFansClubBigWigsUserItemView.f5128d.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m16860I(Throwable th) {
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m16864u(final LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        gm0 gm0Var;
        super.u(liveFansClubBigWigsUserItemView);
        liveFansClubBigWigsUserItemView.m6428c(this.f14565a, this.f14570f, this.f14571g);
        mkd0.z(this.f14568d);
        BLiveLeaderboardMedal bLiveLeaderboardMedal = this.f14567c;
        if (bLiveLeaderboardMedal == null || (gm0Var = this.f14569e) == null) {
            xdl0.M0(liveFansClubBigWigsUserItemView.f5128d, false);
            return;
        }
        c<imf0> cVarM14298h = h9g.m14298h(bLiveLeaderboardMedal.grade, gm0Var.f11510b);
        if (cVarM14298h != null) {
            this.f14568d = this.f14566b.duringCreated(cVarM14298h).subscribe(ffw.e(new e30() { // from class: l.ix2
                public final void call(Object obj) {
                    kx2.m16859H(liveFansClubBigWigsUserItemView, (imf0) obj);
                }
            }, new e30() { // from class: l.jx2
                public final void call(Object obj) {
                    kx2.m16860I((Throwable) obj);
                }
            }));
        } else {
            xdl0.M0(liveFansClubBigWigsUserItemView.f5128d, false);
        }
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m16865w(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        super.w(liveFansClubBigWigsUserItemView);
        mkd0.z(this.f14568d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kx2 kx2Var = (kx2) obj;
            if (v050.a(this.f14565a, kx2Var.f14565a) && v050.a(this.f14567c, kx2Var.f14567c) && v050.a(this.f14569e, kx2Var.f14569e) && v050.a(this.f14570f, kx2Var.f14570f) && v050.a(this.f14571g, kx2Var.f14571g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f14565a, this.f14567c, this.f14569e, this.f14570f, this.f14571g});
    }

    /* JADX INFO: renamed from: o */
    public int m16863o() {
        return t6c0.f19849g3;
    }
}
