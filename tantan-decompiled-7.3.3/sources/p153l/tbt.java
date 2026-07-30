package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.people.LivePeopleCardView;

/* JADX INFO: loaded from: classes13.dex */
public class tbt extends uxr<LivePeopleCardView> {
    private ubt cardData;

    public tbt(hk4 hk4Var, ubt ubtVar) {
        super(hk4Var);
        this.cardData = ubtVar;
    }

    /* JADX INFO: renamed from: O */
    public static uxr<?> m190093O(hk4 hk4Var, ubt ubtVar) {
        return new tbt(hk4Var, ubtVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.cardData.m195302h());
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.m195298d());
        LiveCardTracker.trackMc(this.cardData.m195302h());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LivePeopleCardView livePeopleCardView) {
        super.mo71749u(livePeopleCardView);
        livePeopleCardView.m68694h0(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183742j;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
