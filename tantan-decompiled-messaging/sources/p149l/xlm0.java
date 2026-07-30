package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.apply.VoiceCallApplyListItemView;

/* JADX INFO: loaded from: classes5.dex */
public class xlm0 extends d1q<VoiceCallApplyListItemView> {

    /* JADX INFO: renamed from: a */
    public final String f193431a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f193432b;

    /* JADX INFO: renamed from: c */
    public mqv<User> f193433c;

    /* JADX INFO: renamed from: d */
    public d30 f193434d;

    /* JADX INFO: renamed from: e */
    public e30<String> f193435e;

    /* JADX INFO: renamed from: f */
    public String f193436f;

    public xlm0(BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar, String str) {
        this.f193431a = bLiveVoiceCall.f44485id;
        this.f193432b = bLiveVoiceCall;
        this.f193433c = mqvVar;
        this.f193436f = str;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceCallApplyListItemView voiceCallApplyListItemView) {
        super.mo70566u(voiceCallApplyListItemView);
        voiceCallApplyListItemView.m77689e(this.f193433c, this.f193432b, this.f193434d, this.f193435e, this.f193436f);
    }

    /* JADX INFO: renamed from: I */
    public xlm0 m209896I(d30 d30Var) {
        this.f193434d = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public xlm0 m209897J(e30<String> e30Var) {
        this.f193435e = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public void m209898K(BLiveVoiceCall bLiveVoiceCall) {
        this.f193432b = bLiveVoiceCall;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168195T7;
    }
}
