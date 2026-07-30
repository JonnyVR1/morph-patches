package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.people.LivePeopleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class s9t extends tvr<LivePeopleCardView> {
    private t9t cardData;

    public s9t(ij4 ij4Var, t9t t9tVar) {
        super(ij4Var);
        this.cardData = t9tVar;
    }

    /* JADX INFO: renamed from: O */
    public static tvr<?> m182776O(ij4 ij4Var, t9t t9tVar) {
        return new s9t(ij4Var, t9tVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LiveCardTracker.trackMv(this.cardData.m187648h());
        return true;
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.cardData.m187644d());
        LiveCardTracker.trackMc(this.cardData.m187648h());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LivePeopleCardView livePeopleCardView) {
        super.mo70566u(livePeopleCardView);
        livePeopleCardView.m67511h0(this.cardData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152885j;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
