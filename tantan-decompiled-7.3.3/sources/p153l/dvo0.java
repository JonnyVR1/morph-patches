package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceSquareThemeBFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class dvo0 extends uxr<VoiceSquareThemeBFeedCardView> {
    private final bwp voiceFeedData;

    public dvo0(hk4 hk4Var, bwp bwpVar) {
        super(hk4Var);
        this.voiceFeedData = bwpVar;
    }

    /* JADX INFO: renamed from: O */
    public static dvo0 m118300O(hk4 hk4Var, bwp bwpVar) {
        if (bwpVar == null) {
            return null;
        }
        return new dvo0(hk4Var, bwpVar);
    }

    @Override // p153l.uxr
    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
        super.mo96606J(view);
        yrs.m217233a(view.getContext(), this.voiceFeedData.m106728a());
        boolean zM135616b = this.cardContext.m135616b();
        bwp bwpVar = this.voiceFeedData;
        if (zM135616b) {
            m198511L(bwpVar.m106733f());
        } else {
            m198511L(bwpVar.m106732e());
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSquareThemeBFeedCardView voiceSquareThemeBFeedCardView) {
        super.mo71749u(voiceSquareThemeBFeedCardView);
        voiceSquareThemeBFeedCardView.m68677r0(this.voiceFeedData);
        LiveCardTracker.trackMv(this.voiceFeedData.m106732e());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSquareThemeBFeedCardView voiceSquareThemeBFeedCardView) {
        super.mo72183w(voiceSquareThemeBFeedCardView);
        voiceSquareThemeBFeedCardView.m68676j0();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183746n;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
