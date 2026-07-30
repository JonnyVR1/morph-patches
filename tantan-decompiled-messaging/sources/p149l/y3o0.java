package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class y3o0 extends d1q<VoiceMemberItemView> {

    /* JADX INFO: renamed from: a */
    public mqv<i54> f195832a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f195833b;

    /* JADX INFO: renamed from: c */
    public int f195834c;

    /* JADX INFO: renamed from: d */
    public final qjm0<?> f195835d;

    /* JADX INFO: renamed from: e */
    public final String f195836e;

    /* JADX INFO: renamed from: f */
    public final String f195837f;

    /* JADX INFO: renamed from: g */
    public String f195838g;

    public y3o0(String str, qjm0<?> qjm0Var) {
        final w3o0 w3o0VarM102069r = ((nnn0) qjm0Var.m206027E2()).m160249P2().m102069r();
        this.f195836e = str;
        this.f195832a = w3o0VarM102069r.m201359L(str);
        this.f195833b = w3o0VarM102069r.m201350C(str);
        this.f195834c = w3o0VarM102069r.m201358K(str);
        BLiveMember bLiveMemberM201354G = w3o0VarM102069r.m201354G(str);
        this.f195835d = qjm0Var;
        this.f195837f = e0o0.m114319e(bLiveMemberM201354G);
        BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) vwb.m200346r(bLiveMemberM201354G.callConnections, new w9j() { // from class: l.x3o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f190910a.m212848I(w3o0VarM102069r, (BLiveCallConnection) obj);
            }
        });
        this.f195838g = bLiveCallConnection != null ? bLiveCallConnection.verticalEffectSvga : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ Boolean m212848I(w3o0 w3o0Var, BLiveCallConnection bLiveCallConnection) {
        boolean z;
        if (!TextUtils.isEmpty(bLiveCallConnection.userId) && NullChecker.m81303a(this.f195833b) && alk0.m97309h(w3o0Var.m201350C(bLiveCallConnection.userId))) {
            z = this.f195834c - w3o0Var.m201358K(bLiveCallConnection.userId) == 1;
        }
        return Boolean.valueOf(z);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceMemberItemView voiceMemberItemView) {
        super.mo70566u(voiceMemberItemView);
        m212854P(voiceMemberItemView);
        m212852N(voiceMemberItemView);
        voiceMemberItemView.m77604o0(this.f195835d, this.f195837f, this.f195834c, this.f195832a.f135304a.f111520a);
        voiceMemberItemView.m77605r0(this.f195838g);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70759v(VoiceMemberItemView voiceMemberItemView, @NonNull List<Object> list) {
        super.mo70759v(voiceMemberItemView, list);
        if (vwb.m200296J(list)) {
            mo70566u(voiceMemberItemView);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof rbp0) {
                m212851L(((rbp0) obj).f158671a);
                m212852N(voiceMemberItemView);
                voiceMemberItemView.m77605r0(this.f195838g);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public y3o0 m212851L(BLiveVoiceCall bLiveVoiceCall) {
        this.f195833b = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final void m212852N(VoiceMemberItemView voiceMemberItemView) {
        voiceMemberItemView.setCallInfo(this.f195833b);
    }

    /* JADX INFO: renamed from: O */
    public y3o0 m212853O(mqv<i54> mqvVar) {
        this.f195832a = mqvVar;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m212854P(VoiceMemberItemView voiceMemberItemView) {
        mqv<i54> mqvVar = this.f195832a;
        if (mqvVar != null) {
            voiceMemberItemView.m77602m0(this.f195836e, mqvVar);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168053H9;
    }
}
