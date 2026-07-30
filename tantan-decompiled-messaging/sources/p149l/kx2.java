package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubBigWigsUserItemView;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class kx2 extends d1q<LiveFansClubBigWigsUserItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveLeaderboardRecord f125047a;

    /* JADX INFO: renamed from: b */
    public final mcr f125048b;

    /* JADX INFO: renamed from: c */
    public final BLiveLeaderboardMedal f125049c;

    /* JADX INFO: renamed from: d */
    public c4g0 f125050d;

    /* JADX INFO: renamed from: e */
    public final gm0 f125051e;

    /* JADX INFO: renamed from: f */
    public final BLiveLeaderboardUser f125052f;

    /* JADX INFO: renamed from: g */
    public final String f125053g;

    public kx2(mcr mcrVar, BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardMedal bLiveLeaderboardMedal, BLiveLeaderboardUser bLiveLeaderboardUser, gm0 gm0Var, String str) {
        this.f125047a = bLiveLeaderboardRecord;
        this.f125048b = mcrVar;
        this.f125052f = bLiveLeaderboardUser;
        this.f125049c = bLiveLeaderboardMedal;
        this.f125051e = gm0Var;
        this.f125053g = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m147670H(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView, imf0 imf0Var) {
        xdl0.m208345M0(liveFansClubBigWigsUserItemView.f49086d, true);
        liveFansClubBigWigsUserItemView.f49086d.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m147671I(Throwable th) {
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(final LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        gm0 gm0Var;
        super.mo70566u(liveFansClubBigWigsUserItemView);
        liveFansClubBigWigsUserItemView.m72909c(this.f125047a, this.f125052f, this.f125053g);
        mkd0.m154992z(this.f125050d);
        BLiveLeaderboardMedal bLiveLeaderboardMedal = this.f125049c;
        if (bLiveLeaderboardMedal == null || (gm0Var = this.f125051e) == null) {
            xdl0.m208345M0(liveFansClubBigWigsUserItemView.f49086d, false);
            return;
        }
        C22306c<imf0> c22306cM129999h = h9g.m129999h(bLiveLeaderboardMedal.grade, gm0Var.f103418b);
        if (c22306cM129999h != null) {
            this.f125050d = this.f125048b.duringCreated(c22306cM129999h).subscribe(ffw.m121194e(new e30() { // from class: l.ix2
                @Override // p149l.e30
                public final void call(Object obj) {
                    kx2.m147670H(liveFansClubBigWigsUserItemView, (imf0) obj);
                }
            }, new e30() { // from class: l.jx2
                @Override // p149l.e30
                public final void call(Object obj) {
                    kx2.m147671I((Throwable) obj);
                }
            }));
        } else {
            xdl0.m208345M0(liveFansClubBigWigsUserItemView.f49086d, false);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        super.mo71000w(liveFansClubBigWigsUserItemView);
        mkd0.m154992z(this.f125050d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kx2 kx2Var = (kx2) obj;
            if (v050.m196470a(this.f125047a, kx2Var.f125047a) && v050.m196470a(this.f125049c, kx2Var.f125049c) && v050.m196470a(this.f125051e, kx2Var.f125051e) && v050.m196470a(this.f125052f, kx2Var.f125052f) && v050.m196470a(this.f125053g, kx2Var.f125053g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f125047a, this.f125049c, this.f125051e, this.f125052f, this.f125053g);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168353g3;
    }
}
