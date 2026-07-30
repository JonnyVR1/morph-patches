package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;

/* JADX INFO: loaded from: classes5.dex */
public class gzn0 extends i6t<oo2, VoiceLiveHourBoardEntryView> {
    public gzn0(dum<? extends oo2> dumVar, VoiceLiveHourBoardEntryView voiceLiveHourBoardEntryView) {
        super(dumVar);
        mo52715C(voiceLiveHourBoardEntryView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m133106K3(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem) {
        if (m213810E2().m202194o().equals(bLiveVoiceLeaderBoardItem.roomId)) {
            ((VoiceLiveHourBoardEntryView) this.viewModel).setNewRank(bLiveVoiceLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m133107L3() {
        String strM203371A4 = zrv.m221193k().m203371A4();
        if (!TextUtils.isEmpty(strM203371A4)) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(bae0.m103149b(1124, strM203371A4));
        }
        if (m213815L2()) {
            v1n0.m199033k();
        } else {
            v1n0.m199034l();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((VoiceLiveHourBoardEntryView) this.viewModel).init();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        boolean zM203719r7 = zrv.m221193k().m203719r7();
        V v2 = this.viewModel;
        if (!zM203719r7) {
            ((VoiceLiveHourBoardEntryView) v2).m79406B(false);
        } else {
            ((VoiceLiveHourBoardEntryView) v2).m79406B(true);
            duringCreated(m213810E2().m168545q1().m98227F0()).subscribe(dhw.m115829h(new y20() { // from class: l.fzn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101491a.m133106K3((BLiveVoiceLeaderBoardItem) obj);
                }
            }));
        }
    }
}
