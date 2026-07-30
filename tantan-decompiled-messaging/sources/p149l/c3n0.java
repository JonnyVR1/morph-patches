package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceCpItemView;

/* JADX INFO: loaded from: classes5.dex */
public class c3n0 extends d1q<VoiceCpItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceGrabHatCP f79019a;

    /* JADX INFO: renamed from: b */
    public final int f79020b;

    /* JADX INFO: renamed from: c */
    public e30<String> f79021c;

    public c3n0(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, int i, e30<String> e30Var) {
        this.f79019a = bLiveVoiceGrabHatCP;
        this.f79020b = i;
        this.f79021c = e30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceCpItemView voiceCpItemView) {
        super.mo70566u(voiceCpItemView);
        voiceCpItemView.m78086k0(this.f79019a, this.f79020b, this.f79021c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168256Y8;
    }
}
