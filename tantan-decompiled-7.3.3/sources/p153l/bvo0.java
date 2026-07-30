package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceSquareThemeAFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class bvo0 extends uxr<VoiceSquareThemeAFeedCardView> {
    private final bwp voiceFeedData;

    public bvo0(hk4 hk4Var, bwp bwpVar) {
        super(hk4Var);
        this.voiceFeedData = bwpVar;
    }

    /* JADX INFO: renamed from: O */
    public static bvo0 m106584O(hk4 hk4Var, bwp bwpVar) {
        if (bwpVar == null) {
            return null;
        }
        return new bvo0(hk4Var, bwpVar);
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
    public void mo71749u(VoiceSquareThemeAFeedCardView voiceSquareThemeAFeedCardView) {
        super.mo71749u(voiceSquareThemeAFeedCardView);
        voiceSquareThemeAFeedCardView.m68665u0(this.voiceFeedData, 0);
        LiveCardTracker.trackMv(this.voiceFeedData.m106732e());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSquareThemeAFeedCardView voiceSquareThemeAFeedCardView) {
        super.mo72183w(voiceSquareThemeAFeedCardView);
        voiceSquareThemeAFeedCardView.m68656k0();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183745m;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 3;
    }
}
