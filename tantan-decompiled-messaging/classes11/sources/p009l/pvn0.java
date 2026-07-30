package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import java.util.List;
import l.bsm;
import l.e30;
import l.ffw;
import l.h4t;
import l.nnn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pvn0 extends h4t<nnn0, rvn0> {

    /* JADX INFO: renamed from: i */
    public VoiceBackgroundView f18934i;

    public pvn0(bsm<? extends nnn0> bsmVar, VoiceBackgroundView voiceBackgroundView) {
        super(bsmVar);
        this.f18934i = voiceBackgroundView;
    }

    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo12292K3() {
        return null;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m20730L3(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        String url = voiceRoomBgPicUpdateMessage.getUrl();
        sco0.m22054a(E2().X2(), voiceRoomBgPicUpdateMessage);
        if (!TextUtils.isEmpty(url)) {
            E2().X2().backgroundUrl = url;
            E2().X2().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
            this.f18934i.m8614c(E2().X2().bgPicType, url);
        }
        if (!TextUtils.isEmpty(url) || voiceRoomBgPicUpdateMessage.hasCallPlaceResource()) {
            F2().VoiceRoomBgEvent.onRoomBgChanged().p();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m20731n() {
        super.n();
        VoiceBackgroundView voiceBackgroundView = this.f18934i;
        if (voiceBackgroundView != null) {
            voiceBackgroundView.m8613b();
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo12297t() {
        super/*l.k4t*/.t();
        duringCreated(E2().q1().M0()).subscribe(ffw.d(new e30() { // from class: l.ovn0
            public final void call(Object obj) {
                this.f18261a.m20730L3((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M3 */
    public void mo12293M3(int i) {
    }
}
