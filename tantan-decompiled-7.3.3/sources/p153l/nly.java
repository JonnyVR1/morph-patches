package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;

/* JADX INFO: loaded from: classes10.dex */
public class nly extends d3q<MemberManagerSettleItemView> {

    /* JADX INFO: renamed from: a */
    public final String f142600a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f142601b;

    /* JADX INFO: renamed from: c */
    public final nsv<User> f142602c;

    /* JADX INFO: renamed from: d */
    public x20 f142603d;

    /* JADX INFO: renamed from: e */
    public x20 f142604e;

    /* JADX INFO: renamed from: f */
    public y20<String> f142605f;

    /* JADX INFO: renamed from: g */
    public String f142606g;

    public nly(BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar) {
        this.f142600a = bLiveVoiceCall.f45333id;
        this.f142601b = bLiveVoiceCall;
        this.f142602c = nsvVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(MemberManagerSettleItemView memberManagerSettleItemView) {
        super.mo71749u(memberManagerSettleItemView);
        memberManagerSettleItemView.m79855s0(this.f142602c, this.f142601b, this.f142603d, this.f142604e, this.f142605f, this.f142606g);
    }

    /* JADX INFO: renamed from: I */
    public nly m163786I(x20 x20Var) {
        this.f142603d = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public nly m163787J(y20<String> y20Var) {
        this.f142605f = y20Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public nly m163788K(x20 x20Var) {
        this.f142604e = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public nly m163789L(String str) {
        this.f142606g = str;
        return this;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199144ka;
    }
}
