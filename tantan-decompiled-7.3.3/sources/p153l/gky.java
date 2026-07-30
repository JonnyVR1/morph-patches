package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;

/* JADX INFO: loaded from: classes10.dex */
public class gky extends jic0<nsv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f104778c;

    /* JADX INFO: renamed from: d */
    public final bly f104779d;

    /* JADX INFO: renamed from: f */
    public final y20<nsv<BLiveMember>> f104781f;

    /* JADX INFO: renamed from: i */
    public p7o0 f104784i;

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveMember> f104780e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final int f104782g = 0;

    /* JADX INFO: renamed from: h */
    public final int f104783h = 1;

    public gky(bly blyVar, y20<String> y20Var, y20<nsv<BLiveMember>> y20Var2) {
        this.f104779d = blyVar;
        this.f104778c = y20Var;
        this.f104781f = y20Var2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f104780e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        bly blyVar = this.f104779d;
        return i == 0 ? blyVar.act().inflater().inflate(yec0.f199131ja, viewGroup, false) : blyVar.act().inflater().inflate(yec0.f198845M9, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r8v4, types: [l.oo2, l.vp20] */
    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveMember> nsvVar, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m79843l(0, this.f104780e.size() > 0 ? this.f104780e.size() - 1 : 0);
        } else {
            ((MemberOnLineItemView) view).m79810l0(Boolean.valueOf(i9o0.m139137h(this.f104779d)), this.f104779d.m213810E2().mo183435j() != null ? this.f104779d.m213810E2().mo183435j().liveMode : null, this.f104778c, this.f104781f, nsvVar, this.f104784i.f150953b.get(nsvVar.f143542a.reference));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveMember> getItem(int i) {
        return (nsv) this.f104780e.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final boolean m130607H(LivingUsers<BLiveMember> livingUsers) {
        return !jyb.m147479J(livingUsers) && livingUsers.size() > 1 && ((BLiveMember) livingUsers.get(0).f143542a).f45246id.equals(((BLiveMember) livingUsers.get(1).f143542a).f45246id);
    }

    /* JADX INFO: renamed from: I */
    public void m130608I(p7o0 p7o0Var) {
        LivingUsers<BLiveMember> livingUsers = p7o0Var.f150952a;
        this.f104784i = p7o0Var;
        this.f104780e.clear();
        if (jyb.m147479J(livingUsers)) {
            return;
        }
        if (!m130607H(livingUsers)) {
            livingUsers.add(0, livingUsers.get(0));
        }
        this.f104780e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m130609J(final String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (jyb.m147479J(this.f104780e)) {
            return;
        }
        nsv nsvVar = (nsv) jyb.m147529r(this.f104780e, new qcj() { // from class: l.fky
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveMember) ((nsv) obj).f143542a).reference));
            }
        });
        ((BLiveMember) nsvVar.f143542a).inviteStatus = TEnum.equals(bLiveVoiceCallInvite.state, "not-invited") ? BLiveMember.STATUS_INVITE_CAN_INVITE : "invited";
        int iIndexOf = this.f104780e.indexOf(nsvVar);
        if (iIndexOf <= 0 || iIndexOf >= this.f104780e.size()) {
            return;
        }
        notifyItemChanged(iIndexOf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
