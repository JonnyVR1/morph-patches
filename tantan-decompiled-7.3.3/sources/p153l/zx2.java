package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubBigWigsUserItemView;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class zx2 extends d3q<LiveFansClubBigWigsUserItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveLeaderboardRecord f206418a;

    /* JADX INFO: renamed from: b */
    public final ner f206419b;

    /* JADX INFO: renamed from: c */
    public final BLiveLeaderboardMedal f206420c;

    /* JADX INFO: renamed from: d */
    public kcg0 f206421d;

    /* JADX INFO: renamed from: e */
    public final cm0 f206422e;

    /* JADX INFO: renamed from: f */
    public final BLiveLeaderboardUser f206423f;

    /* JADX INFO: renamed from: g */
    public final String f206424g;

    public zx2(ner nerVar, BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardMedal bLiveLeaderboardMedal, BLiveLeaderboardUser bLiveLeaderboardUser, cm0 cm0Var, String str) {
        this.f206418a = bLiveLeaderboardRecord;
        this.f206419b = nerVar;
        this.f206423f = bLiveLeaderboardUser;
        this.f206420c = bLiveLeaderboardMedal;
        this.f206422e = cm0Var;
        this.f206424g = str;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m221967H(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView, ruf0 ruf0Var) {
        bnl0.m105525M0(liveFansClubBigWigsUserItemView.f49934d, true);
        liveFansClubBigWigsUserItemView.f49934d.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m221968I(Throwable th) {
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(final LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        cm0 cm0Var;
        super.mo71749u(liveFansClubBigWigsUserItemView);
        liveFansClubBigWigsUserItemView.m74092c(this.f206418a, this.f206423f, this.f206424g);
        psd0.m173633z(this.f206421d);
        BLiveLeaderboardMedal bLiveLeaderboardMedal = this.f206420c;
        if (bLiveLeaderboardMedal == null || (cm0Var = this.f206422e) == null) {
            bnl0.m105525M0(liveFansClubBigWigsUserItemView.f49934d, false);
            return;
        }
        C22421c<ruf0> c22421cM200514h = vag.m200514h(bLiveLeaderboardMedal.grade, cm0Var.f82502b);
        if (c22421cM200514h != null) {
            this.f206421d = this.f206419b.duringCreated(c22421cM200514h).subscribe(dhw.m115826e(new y20() { // from class: l.xx2
                @Override // p153l.y20
                public final void call(Object obj) {
                    zx2.m221967H(liveFansClubBigWigsUserItemView, (ruf0) obj);
                }
            }, new y20() { // from class: l.yx2
                @Override // p153l.y20
                public final void call(Object obj) {
                    zx2.m221968I((Throwable) obj);
                }
            }));
        } else {
            bnl0.m105525M0(liveFansClubBigWigsUserItemView.f49934d, false);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFansClubBigWigsUserItemView liveFansClubBigWigsUserItemView) {
        super.mo72183w(liveFansClubBigWigsUserItemView);
        psd0.m173633z(this.f206421d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zx2 zx2Var = (zx2) obj;
            if (k950.m148863a(this.f206418a, zx2Var.f206418a) && k950.m148863a(this.f206420c, zx2Var.f206420c) && k950.m148863a(this.f206422e, zx2Var.f206422e) && k950.m148863a(this.f206423f, zx2Var.f206423f) && k950.m148863a(this.f206424g, zx2Var.f206424g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f206418a, this.f206420c, this.f206422e, this.f206423f, this.f206424g);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199085g3;
    }
}
