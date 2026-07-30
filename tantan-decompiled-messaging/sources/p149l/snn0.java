package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;

/* JADX INFO: loaded from: classes11.dex */
public class snn0 extends d1q<VoiceLiveEndHeartBeatItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceUserRecord f165485a;

    /* JADX INFO: renamed from: b */
    public final mqv<User> f165486b;

    /* JADX INFO: renamed from: c */
    public won0 f165487c;

    public snn0(won0 won0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, mqv<User> mqvVar) {
        this.f165485a = bLiveVoiceUserRecord;
        this.f165486b = mqvVar;
        this.f165487c = won0Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView) {
        super.mo70566u(voiceLiveEndHeartBeatItemView);
        voiceLiveEndHeartBeatItemView.m78261f(this.f165487c, this.f165485a, this.f165486b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168592y8;
    }
}
