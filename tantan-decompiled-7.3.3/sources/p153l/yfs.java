package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.LiveFullLineFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class yfs extends uxr<LiveFullLineFeedCardView> {
    private final zfs cardData;
    private final ft5 compositeSubscription;

    public yfs(hk4 hk4Var, zfs zfsVar) {
        super(hk4Var);
        this.compositeSubscription = new ft5();
        this.cardData = zfsVar;
    }

    /* JADX INFO: renamed from: O */
    public static yfs m215811O(hk4 hk4Var, zfs zfsVar) {
        return new yfs(hk4Var, zfsVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LiveCardTracker.trackMv(this.cardData.trackData);
        return true;
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.cardData.goAction);
        LiveCardTracker.trackMc(this.cardData.trackData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFullLineFeedCardView liveFullLineFeedCardView) {
        super.mo71749u(liveFullLineFeedCardView);
        liveFullLineFeedCardView.m68642k0(this.cardData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveFullLineFeedCardView liveFullLineFeedCardView) {
        super.mo72183w(liveFullLineFeedCardView);
        this.compositeSubscription.m127299c();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183743k;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }
}
