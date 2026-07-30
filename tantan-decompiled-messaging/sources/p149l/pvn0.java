package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class pvn0 extends h4t<nnn0, rvn0> {

    /* JADX INFO: renamed from: i */
    public VoiceBackgroundView f151495i;

    public pvn0(bsm<? extends nnn0> bsmVar, VoiceBackgroundView voiceBackgroundView) {
        super(bsmVar);
        this.f151495i = voiceBackgroundView;
    }

    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo104068K3() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m171689L3(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        String url = voiceRoomBgPicUpdateMessage.getUrl();
        sco0.m183422a(((nnn0) m206027E2()).mo149817n(), voiceRoomBgPicUpdateMessage);
        if (!TextUtils.isEmpty(url)) {
            ((nnn0) m206027E2()).mo149817n().backgroundUrl = url;
            ((nnn0) m206027E2()).mo149817n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
            this.f151495i.m78413c(((nnn0) m206027E2()).mo149817n().bgPicType, url);
        }
        if (!TextUtils.isEmpty(url) || voiceRoomBgPicUpdateMessage.hasCallPlaceResource()) {
            m206028F2().VoiceRoomBgEvent.onRoomBgChanged().m172467p();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        VoiceBackgroundView voiceBackgroundView = this.f151495i;
        if (voiceBackgroundView != null) {
            voiceBackgroundView.m78412b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189059M0()).subscribe(ffw.m121193d(new e30() { // from class: l.ovn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145823a.m171689L3((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void mo104069M3(int i) {
    }
}
