package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;

/* JADX INFO: loaded from: classes11.dex */
public class jby extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f117232c;

    /* JADX INFO: renamed from: d */
    public final ecy f117233d;

    /* JADX INFO: renamed from: f */
    public final e30<mqv<BLiveMember>> f117235f;

    /* JADX INFO: renamed from: i */
    public lyn0 f117238i;

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveMember> f117234e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final int f117236g = 0;

    /* JADX INFO: renamed from: h */
    public final int f117237h = 1;

    public jby(ecy ecyVar, e30<String> e30Var, e30<mqv<BLiveMember>> e30Var2) {
        this.f117233d = ecyVar;
        this.f117232c = e30Var;
        this.f117235f = e30Var2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f117234e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        ecy ecyVar = this.f117233d;
        return i == 0 ? ecyVar.act().inflater().inflate(t6c0.f168399ja, viewGroup, false) : ecyVar.act().inflater().inflate(t6c0.f168113M9, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v4, types: [l.ho2, l.lh20] */
    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m78660l(0, this.f117234e.size() > 0 ? this.f117234e.size() - 1 : 0);
        } else {
            ((MemberOnLineItemView) view).m78627l0(Boolean.valueOf(e0o0.m114322h(this.f117233d)), this.f117233d.m206027E2().mo149813j() != null ? this.f117233d.m206027E2().mo149813j().liveMode : null, this.f117232c, this.f117235f, mqvVar, this.f117238i.f130588b.get(mqvVar.f135304a.reference));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f117234e.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final boolean m140834H(LivingUsers<BLiveMember> livingUsers) {
        return !vwb.m200296J(livingUsers) && livingUsers.size() > 1 && ((BLiveMember) livingUsers.get(0).f135304a).f44398id.equals(((BLiveMember) livingUsers.get(1).f135304a).f44398id);
    }

    /* JADX INFO: renamed from: I */
    public void m140835I(lyn0 lyn0Var) {
        LivingUsers<BLiveMember> livingUsers = lyn0Var.f130587a;
        this.f117238i = lyn0Var;
        this.f117234e.clear();
        if (vwb.m200296J(livingUsers)) {
            return;
        }
        if (!m140834H(livingUsers)) {
            livingUsers.add(0, livingUsers.get(0));
        }
        this.f117234e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m140836J(final String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (vwb.m200296J(this.f117234e)) {
            return;
        }
        mqv mqvVar = (mqv) vwb.m200346r(this.f117234e, new w9j() { // from class: l.iby
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveMember) ((mqv) obj).f135304a).reference));
            }
        });
        ((BLiveMember) mqvVar.f135304a).inviteStatus = TEnum.equals(bLiveVoiceCallInvite.state, "not-invited") ? BLiveMember.STATUS_INVITE_CAN_INVITE : "invited";
        int iIndexOf = this.f117234e.indexOf(mqvVar);
        if (iIndexOf <= 0 || iIndexOf >= this.f117234e.size()) {
            return;
        }
        notifyItemChanged(iIndexOf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
