package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import l.d1q;
import l.d30;
import l.e30;
import l.mqv;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qcy extends d1q<MemberManagerSettleItemView> {

    /* JADX INFO: renamed from: a */
    public final String f19145a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f19146b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f19147c;

    /* JADX INFO: renamed from: d */
    public d30 f19148d;

    /* JADX INFO: renamed from: e */
    public d30 f19149e;

    /* JADX INFO: renamed from: f */
    public e30<String> f19150f;

    /* JADX INFO: renamed from: g */
    public String f19151g;

    public qcy(BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar) {
        this.f19145a = bLiveVoiceCall.id;
        this.f19146b = bLiveVoiceCall;
        this.f19147c = mqvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m20859u(MemberManagerSettleItemView memberManagerSettleItemView) {
        super.u(memberManagerSettleItemView);
        memberManagerSettleItemView.m8888s0(this.f19147c, this.f19146b, this.f19148d, this.f19149e, this.f19150f, this.f19151g);
    }

    /* JADX INFO: renamed from: I */
    public qcy m20854I(d30 d30Var) {
        this.f19148d = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public qcy m20855J(e30<String> e30Var) {
        this.f19150f = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public qcy m20856K(d30 d30Var) {
        this.f19149e = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public qcy m20857L(String str) {
        this.f19151g = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public int m20858o() {
        return t6c0.ka;
    }
}
