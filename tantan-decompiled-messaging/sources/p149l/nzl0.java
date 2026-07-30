package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class nzl0 extends d1q<VirtualVoiceMemberItemView> {

    /* JADX INFO: renamed from: a */
    public final String f141237a;

    /* JADX INFO: renamed from: b */
    public final oyl0<?> f141238b;

    /* JADX INFO: renamed from: c */
    public String f141239c;

    /* JADX INFO: renamed from: d */
    public mqv<i54> f141240d;

    /* JADX INFO: renamed from: e */
    public BLiveVoiceCall f141241e;

    /* JADX INFO: renamed from: f */
    public int f141242f;

    /* JADX INFO: renamed from: g */
    public String f141243g;

    public nzl0(oyl0<?> oyl0Var, String str, final w3o0 w3o0Var) {
        this.f141237a = str;
        this.f141238b = oyl0Var;
        this.f141240d = w3o0Var.m201359L(str);
        this.f141241e = w3o0Var.m201350C(str);
        this.f141242f = w3o0Var.m201358K(str);
        BLiveMember bLiveMemberM201354G = w3o0Var.m201354G(str);
        this.f141243g = e0o0.m114319e(bLiveMemberM201354G);
        BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) vwb.m200346r(bLiveMemberM201354G.callConnections, new w9j() { // from class: l.mzl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136402a.m162072I(w3o0Var, (BLiveCallConnection) obj);
            }
        });
        this.f141239c = bLiveCallConnection != null ? bLiveCallConnection.horizontalEffectSvga : "";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m162072I(w3o0 w3o0Var, BLiveCallConnection bLiveCallConnection) {
        boolean z;
        if (!TextUtils.isEmpty(bLiveCallConnection.userId) && NullChecker.m81303a(this.f141241e) && alk0.m97309h(w3o0Var.m201350C(bLiveCallConnection.userId))) {
            z = this.f141242f - w3o0Var.m201358K(bLiveCallConnection.userId) == 1;
        }
        return Boolean.valueOf(z);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        super.mo70566u(virtualVoiceMemberItemView);
        m162076N(virtualVoiceMemberItemView);
        virtualVoiceMemberItemView.m77023n0(this.f141238b, this.f141243g, this.f141242f, this.f141240d.f135304a.f111520a);
        m162078P(virtualVoiceMemberItemView);
        virtualVoiceMemberItemView.m77025q0(this.f141239c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70759v(VirtualVoiceMemberItemView virtualVoiceMemberItemView, @NonNull List<Object> list) {
        super.mo70759v(virtualVoiceMemberItemView, list);
        if (vwb.m200296J(list)) {
            mo70566u(virtualVoiceMemberItemView);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof rbp0) {
                m162075L(((rbp0) obj).f158671a);
                m162076N(virtualVoiceMemberItemView);
                virtualVoiceMemberItemView.m77023n0(this.f141238b, this.f141243g, this.f141242f, this.f141240d.f135304a.f111520a);
                virtualVoiceMemberItemView.m77025q0(this.f141239c);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public nzl0 m162075L(BLiveVoiceCall bLiveVoiceCall) {
        this.f141241e = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final void m162076N(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        virtualVoiceMemberItemView.setCallInfo(this.f141241e);
    }

    /* JADX INFO: renamed from: O */
    public nzl0 m162077O(mqv<i54> mqvVar) {
        this.f141240d = mqvVar;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m162078P(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        mqv<i54> mqvVar = this.f141240d;
        if (mqvVar != null) {
            virtualVoiceMemberItemView.m77021l0(this.f141237a, mqvVar);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168344f7;
    }
}
