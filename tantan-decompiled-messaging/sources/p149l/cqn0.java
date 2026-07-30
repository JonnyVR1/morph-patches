package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;

/* JADX INFO: loaded from: classes5.dex */
public class cqn0 extends h4t<ho2, VoiceLiveHourBoardEntryView> {
    public cqn0(bsm<? extends ho2> bsmVar, VoiceLiveHourBoardEntryView voiceLiveHourBoardEntryView) {
        super(bsmVar);
        mo51532C(voiceLiveHourBoardEntryView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m108286K3(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        if (m206027E2().m149818o().equals(bLiveVoiceLeaderBoardItem.roomId)) {
            ((VoiceLiveHourBoardEntryView) this.viewModel).setNewRank(bLiveVoiceLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m108287L3() {
        String strM195584A4 = ypv.m215672k().m195584A4();
        if (!TextUtils.isEmpty(strM195584A4)) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(x1e0.m206696b(1124, strM195584A4));
        }
        if (m206032L2()) {
            rsm0.m180703k();
        } else {
            rsm0.m180704l();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((VoiceLiveHourBoardEntryView) this.viewModel).init();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        boolean zM195932r7 = ypv.m215672k().m195932r7();
        V v2 = this.viewModel;
        if (!zM195932r7) {
            ((VoiceLiveHourBoardEntryView) v2).m78223B(false);
        } else {
            ((VoiceLiveHourBoardEntryView) v2).m78223B(true);
            duringCreated(m206027E2().m132160q1().m189045F0()).subscribe(ffw.m121197h(new e30() { // from class: l.bqn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f76794a.m108286K3((BLiveVoiceLeaderBoardItem) obj);
                }
            }));
        }
    }
}
