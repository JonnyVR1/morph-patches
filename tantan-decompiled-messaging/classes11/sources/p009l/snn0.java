package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndHeartBeatItemView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import l.d1q;
import l.mqv;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class snn0 extends d1q<VoiceLiveEndHeartBeatItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceUserRecord f20386a;

    /* JADX INFO: renamed from: b */
    public final mqv<User> f20387b;

    /* JADX INFO: renamed from: c */
    public won0 f20388c;

    public snn0(won0 won0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, mqv<User> mqvVar) {
        this.f20386a = bLiveVoiceUserRecord;
        this.f20387b = mqvVar;
        this.f20388c = won0Var;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m22317u(VoiceLiveEndHeartBeatItemView voiceLiveEndHeartBeatItemView) {
        super.u(voiceLiveEndHeartBeatItemView);
        voiceLiveEndHeartBeatItemView.m8450f(this.f20388c, this.f20386a, this.f20387b);
    }

    /* JADX INFO: renamed from: o */
    public int m22316o() {
        return t6c0.y8;
    }
}
