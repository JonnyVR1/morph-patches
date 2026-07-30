package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cdo0 extends d3q<VoiceMemberItemView> {

    /* JADX INFO: renamed from: a */
    public nsv<h64> f81249a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCall f81250b;

    /* JADX INFO: renamed from: c */
    public int f81251c;

    /* JADX INFO: renamed from: d */
    public final usm0<?> f81252d;

    /* JADX INFO: renamed from: e */
    public final String f81253e;

    /* JADX INFO: renamed from: f */
    public final String f81254f;

    /* JADX INFO: renamed from: g */
    public String f81255g;

    public cdo0(String str, usm0<?> usm0Var) {
        final ado0 ado0VarM136879r = ((rwn0) usm0Var.m213810E2()).m183411P2().m136879r();
        this.f81253e = str;
        this.f81249a = ado0VarM136879r.m97116L(str);
        this.f81250b = ado0VarM136879r.m97107C(str);
        this.f81251c = ado0VarM136879r.m97115K(str);
        BLiveMember bLiveMemberM97111G = ado0VarM136879r.m97111G(str);
        this.f81252d = usm0Var;
        this.f81254f = i9o0.m139134e(bLiveMemberM97111G);
        BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) jyb.m147529r(bLiveMemberM97111G.callConnections, new qcj() { // from class: l.bdo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76279a.m109227I(ado0VarM136879r, (BLiveCallConnection) obj);
            }
        });
        this.f81255g = bLiveCallConnection != null ? bLiveCallConnection.verticalEffectSvga : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ Boolean m109227I(ado0 ado0Var, BLiveCallConnection bLiveCallConnection) {
        boolean z;
        if (!TextUtils.isEmpty(bLiveCallConnection.userId) && NullChecker.m82486a(this.f81250b) && guk0.m132329h(ado0Var.m97107C(bLiveCallConnection.userId))) {
            z = this.f81251c - ado0Var.m97115K(bLiveCallConnection.userId) == 1;
        }
        return Boolean.valueOf(z);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceMemberItemView voiceMemberItemView) {
        super.mo71749u(voiceMemberItemView);
        m109233P(voiceMemberItemView);
        m109231N(voiceMemberItemView);
        voiceMemberItemView.m78787o0(this.f81252d, this.f81254f, this.f81251c, this.f81249a.f143542a.f107997a);
        voiceMemberItemView.m78788r0(this.f81255g);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71942v(VoiceMemberItemView voiceMemberItemView, @NonNull List<Object> list) {
        super.mo71942v(voiceMemberItemView, list);
        if (jyb.m147479J(list)) {
            mo71749u(voiceMemberItemView);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof vkp0) {
                m109230L(((vkp0) obj).f184511a);
                m109231N(voiceMemberItemView);
                voiceMemberItemView.m78788r0(this.f81255g);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public cdo0 m109230L(BLiveVoiceCall bLiveVoiceCall) {
        this.f81250b = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final void m109231N(VoiceMemberItemView voiceMemberItemView) {
        voiceMemberItemView.setCallInfo(this.f81250b);
    }

    /* JADX INFO: renamed from: O */
    public cdo0 m109232O(nsv<h64> nsvVar) {
        this.f81249a = nsvVar;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m109233P(VoiceMemberItemView voiceMemberItemView) {
        nsv<h64> nsvVar = this.f81249a;
        if (nsvVar != null) {
            voiceMemberItemView.m78785m0(this.f81253e, nsvVar);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198785H9;
    }
}
