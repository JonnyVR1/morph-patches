package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;

/* JADX INFO: loaded from: classes11.dex */
public class qcy extends d1q<MemberManagerSettleItemView> {

    /* JADX INFO: renamed from: a */
    public final String f153847a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f153848b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f153849c;

    /* JADX INFO: renamed from: d */
    public d30 f153850d;

    /* JADX INFO: renamed from: e */
    public d30 f153851e;

    /* JADX INFO: renamed from: f */
    public e30<String> f153852f;

    /* JADX INFO: renamed from: g */
    public String f153853g;

    public qcy(BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar) {
        this.f153847a = bLiveVoiceCall.f44485id;
        this.f153848b = bLiveVoiceCall;
        this.f153849c = mqvVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(MemberManagerSettleItemView memberManagerSettleItemView) {
        super.mo70566u(memberManagerSettleItemView);
        memberManagerSettleItemView.m78672s0(this.f153849c, this.f153848b, this.f153850d, this.f153851e, this.f153852f, this.f153853g);
    }

    /* JADX INFO: renamed from: I */
    public qcy m173935I(d30 d30Var) {
        this.f153850d = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public qcy m173936J(e30<String> e30Var) {
        this.f153852f = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public qcy m173937K(d30 d30Var) {
        this.f153851e = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public qcy m173938L(String str) {
        this.f153853g = str;
        return this;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168412ka;
    }
}
