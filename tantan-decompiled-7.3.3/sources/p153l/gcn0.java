package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceCpItemView;

/* JADX INFO: loaded from: classes5.dex */
public class gcn0 extends d3q<VoiceCpItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceGrabHatCP f103592a;

    /* JADX INFO: renamed from: b */
    public final int f103593b;

    /* JADX INFO: renamed from: c */
    public y20<String> f103594c;

    public gcn0(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, int i, y20<String> y20Var) {
        this.f103592a = bLiveVoiceGrabHatCP;
        this.f103593b = i;
        this.f103594c = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceCpItemView voiceCpItemView) {
        super.mo71749u(voiceCpItemView);
        voiceCpItemView.m79269k0(this.f103592a, this.f103593b, this.f103594c);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198988Y8;
    }
}
