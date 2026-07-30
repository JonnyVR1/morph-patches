package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;

/* JADX INFO: loaded from: classes10.dex */
public class wwn0 extends d3q<VoiceLiveEndHeartBeatItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceUserRecord f191309a;

    /* JADX INFO: renamed from: b */
    public final nsv<User> f191310b;

    /* JADX INFO: renamed from: c */
    public ayn0 f191311c;

    public wwn0(ayn0 ayn0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, nsv<User> nsvVar) {
        this.f191309a = bLiveVoiceUserRecord;
        this.f191310b = nsvVar;
        this.f191311c = ayn0Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView) {
        super.mo71749u(voiceLiveEndHeartBeatItemView);
        voiceLiveEndHeartBeatItemView.m79444f(this.f191311c, this.f191309a, this.f191310b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199324y8;
    }
}
