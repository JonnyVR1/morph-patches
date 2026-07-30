package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r8m0 extends d3q<VirtualVoiceMemberItemView> {

    /* JADX INFO: renamed from: a */
    public final String f161719a;

    /* JADX INFO: renamed from: b */
    public final s7m0<?> f161720b;

    /* JADX INFO: renamed from: c */
    public String f161721c;

    /* JADX INFO: renamed from: d */
    public nsv<h64> f161722d;

    /* JADX INFO: renamed from: e */
    public BLiveVoiceCall f161723e;

    /* JADX INFO: renamed from: f */
    public int f161724f;

    /* JADX INFO: renamed from: g */
    public String f161725g;

    public r8m0(s7m0<?> s7m0Var, String str, final ado0 ado0Var) {
        this.f161719a = str;
        this.f161720b = s7m0Var;
        this.f161722d = ado0Var.m97116L(str);
        this.f161723e = ado0Var.m97107C(str);
        this.f161724f = ado0Var.m97115K(str);
        BLiveMember bLiveMemberM97111G = ado0Var.m97111G(str);
        this.f161725g = i9o0.m139134e(bLiveMemberM97111G);
        BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) jyb.m147529r(bLiveMemberM97111G.callConnections, new qcj() { // from class: l.q8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156143a.m180211I(ado0Var, (BLiveCallConnection) obj);
            }
        });
        this.f161721c = bLiveCallConnection != null ? bLiveCallConnection.horizontalEffectSvga : "";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m180211I(ado0 ado0Var, BLiveCallConnection bLiveCallConnection) {
        boolean z;
        if (!TextUtils.isEmpty(bLiveCallConnection.userId) && NullChecker.m82486a(this.f161723e) && guk0.m132329h(ado0Var.m97107C(bLiveCallConnection.userId))) {
            z = this.f161724f - ado0Var.m97115K(bLiveCallConnection.userId) == 1;
        }
        return Boolean.valueOf(z);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        super.mo71749u(virtualVoiceMemberItemView);
        m180215N(virtualVoiceMemberItemView);
        virtualVoiceMemberItemView.m78206n0(this.f161720b, this.f161725g, this.f161724f, this.f161722d.f143542a.f107997a);
        m180217P(virtualVoiceMemberItemView);
        virtualVoiceMemberItemView.m78208q0(this.f161721c);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71942v(VirtualVoiceMemberItemView virtualVoiceMemberItemView, @NonNull List<Object> list) {
        super.mo71942v(virtualVoiceMemberItemView, list);
        if (jyb.m147479J(list)) {
            mo71749u(virtualVoiceMemberItemView);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof vkp0) {
                m180214L(((vkp0) obj).f184511a);
                m180215N(virtualVoiceMemberItemView);
                virtualVoiceMemberItemView.m78206n0(this.f161720b, this.f161725g, this.f161724f, this.f161722d.f143542a.f107997a);
                virtualVoiceMemberItemView.m78208q0(this.f161721c);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public r8m0 m180214L(BLiveVoiceCall bLiveVoiceCall) {
        this.f161723e = bLiveVoiceCall;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final void m180215N(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        virtualVoiceMemberItemView.setCallInfo(this.f161723e);
    }

    /* JADX INFO: renamed from: O */
    public r8m0 m180216O(nsv<h64> nsvVar) {
        this.f161722d = nsvVar;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m180217P(VirtualVoiceMemberItemView virtualVoiceMemberItemView) {
        nsv<h64> nsvVar = this.f161722d;
        if (nsvVar != null) {
            virtualVoiceMemberItemView.m78204l0(this.f161719a, nsvVar);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199076f7;
    }
}
