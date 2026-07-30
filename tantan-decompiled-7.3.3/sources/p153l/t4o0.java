package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class t4o0 extends i6t<rwn0, v4o0> {

    /* JADX INFO: renamed from: i */
    public VoiceBackgroundView f172093i;

    public t4o0(dum<? extends rwn0> dumVar, VoiceBackgroundView voiceBackgroundView) {
        super(dumVar);
        this.f172093i = voiceBackgroundView;
    }

    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo124020K3() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m189295L3(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        String url = voiceRoomBgPicUpdateMessage.getUrl();
        wlo0.m207067a(((rwn0) m213810E2()).mo183440n(), voiceRoomBgPicUpdateMessage);
        if (!TextUtils.isEmpty(url)) {
            ((rwn0) m213810E2()).mo183440n().backgroundUrl = url;
            ((rwn0) m213810E2()).mo183440n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
            this.f172093i.m79596c(((rwn0) m213810E2()).mo183440n().bgPicType, url);
        }
        if (!TextUtils.isEmpty(url) || voiceRoomBgPicUpdateMessage.hasCallPlaceResource()) {
            m213811F2().VoiceRoomBgEvent.onRoomBgChanged().m199277p();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        VoiceBackgroundView voiceBackgroundView = this.f172093i;
        if (voiceBackgroundView != null) {
            voiceBackgroundView.m79595b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98241M0()).subscribe(dhw.m115825d(new y20() { // from class: l.s4o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166257a.m189295L3((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void mo124021M3(int i) {
    }
}
