package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceSquareThemeAFeedCardView;

/* JADX INFO: loaded from: classes13.dex */
public class xlo0 extends tvr<VoiceSquareThemeAFeedCardView> {
    private final bup voiceFeedData;

    public xlo0(ij4 ij4Var, bup bupVar) {
        super(ij4Var);
        this.voiceFeedData = bupVar;
    }

    /* JADX INFO: renamed from: O */
    public static xlo0 m209955O(ij4 ij4Var, bup bupVar) {
        if (bupVar == null) {
            return null;
        }
        return new xlo0(ij4Var, bupVar);
    }

    @Override // p149l.tvr
    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
        super.mo101240J(view);
        xps.m210534a(view.getContext(), this.voiceFeedData.m103977a());
        boolean zM136505b = this.cardContext.m136505b();
        bup bupVar = this.voiceFeedData;
        if (zM136505b) {
            m190778L(bupVar.m103982f());
        } else {
            m190778L(bupVar.m103981e());
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSquareThemeAFeedCardView voiceSquareThemeAFeedCardView) {
        super.mo70566u(voiceSquareThemeAFeedCardView);
        voiceSquareThemeAFeedCardView.m67482u0(this.voiceFeedData, 0);
        LiveCardTracker.trackMv(this.voiceFeedData.m103981e());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSquareThemeAFeedCardView voiceSquareThemeAFeedCardView) {
        super.mo71000w(voiceSquareThemeAFeedCardView);
        voiceSquareThemeAFeedCardView.m67473k0();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152888m;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 3;
    }
}
