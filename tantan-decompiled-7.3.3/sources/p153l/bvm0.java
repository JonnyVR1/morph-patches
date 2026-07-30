package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.apply.VoiceCallApplyListItemView;

/* JADX INFO: loaded from: classes5.dex */
public class bvm0 extends d3q<VoiceCallApplyListItemView> {

    /* JADX INFO: renamed from: a */
    public final String f78606a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f78607b;

    /* JADX INFO: renamed from: c */
    public nsv<User> f78608c;

    /* JADX INFO: renamed from: d */
    public x20 f78609d;

    /* JADX INFO: renamed from: e */
    public y20<String> f78610e;

    /* JADX INFO: renamed from: f */
    public String f78611f;

    public bvm0(BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar, String str) {
        this.f78606a = bLiveVoiceCall.f45333id;
        this.f78607b = bLiveVoiceCall;
        this.f78608c = nsvVar;
        this.f78611f = str;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceCallApplyListItemView voiceCallApplyListItemView) {
        super.mo71749u(voiceCallApplyListItemView);
        voiceCallApplyListItemView.m78872e(this.f78608c, this.f78607b, this.f78609d, this.f78610e, this.f78611f);
    }

    /* JADX INFO: renamed from: I */
    public bvm0 m106581I(x20 x20Var) {
        this.f78609d = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public bvm0 m106582J(y20<String> y20Var) {
        this.f78610e = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public void m106583K(BLiveVoiceCall bLiveVoiceCall) {
        this.f78607b = bLiveVoiceCall;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198927T7;
    }
}
