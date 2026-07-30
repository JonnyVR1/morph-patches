package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleInHeaderItemIView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import l.dac0;
import l.e30;
import l.mqv;
import l.t6c0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jby extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f15045c;

    /* JADX INFO: renamed from: d */
    public final ecy f15046d;

    /* JADX INFO: renamed from: f */
    public final e30<mqv<BLiveMember>> f15048f;

    /* JADX INFO: renamed from: i */
    public lyn0 f15051i;

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveMember> f15047e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final int f15049g = 0;

    /* JADX INFO: renamed from: h */
    public final int f15050h = 1;

    public jby(ecy ecyVar, e30<String> e30Var, e30<mqv<BLiveMember>> e30Var2) {
        this.f15046d = ecyVar;
        this.f15045c = e30Var;
        this.f15048f = e30Var2;
    }

    /* JADX INFO: renamed from: C */
    public int m16936C() {
        return this.f15047e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16937D(ViewGroup viewGroup, int i) {
        ecy ecyVar = this.f15046d;
        return i == 0 ? ecyVar.act().inflater().inflate(t6c0.ja, viewGroup, false) : ecyVar.act().inflater().inflate(t6c0.M9, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m16935A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        if (i == 0) {
            ((MemberManagerSettleInHeaderItemIView) view).m8876l(0, this.f15047e.size() > 0 ? this.f15047e.size() - 1 : 0);
        } else {
            ((MemberOnLineItemView) view).m8843l0(Boolean.valueOf(e0o0.m13619h(this.f15046d)), this.f15046d.E2().j() != null ? this.f15046d.E2().j().liveMode : null, this.f15045c, this.f15048f, mqvVar, this.f15051i.f16448b.get(((BLiveMember) mqvVar.a).reference));
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f15047e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m16940H(LivingUsers<BLiveMember> livingUsers) {
        return !vwb.J(livingUsers) && livingUsers.size() > 1 && ((BLiveMember) ((mqv) livingUsers.get(0)).a).id.equals(((BLiveMember) ((mqv) livingUsers.get(1)).a).id);
    }

    /* JADX INFO: renamed from: I */
    public void m16941I(lyn0 lyn0Var) {
        LivingUsers<BLiveMember> livingUsers = lyn0Var.f16447a;
        this.f15051i = lyn0Var;
        this.f15047e.clear();
        if (vwb.J(livingUsers)) {
            return;
        }
        if (!m16940H(livingUsers)) {
            livingUsers.add(0, (mqv) livingUsers.get(0));
        }
        this.f15047e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m16942J(final String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (vwb.J(this.f15047e)) {
            return;
        }
        mqv mqvVar = (mqv) vwb.r(this.f15047e, new w9j() { // from class: l.iby
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveMember) ((mqv) obj).a).reference));
            }
        });
        ((BLiveMember) mqvVar.a).inviteStatus = TEnum.equals(bLiveVoiceCallInvite.state, "not-invited") ? "canInvite" : "invited";
        int iIndexOf = this.f15047e.indexOf(mqvVar);
        if (iIndexOf <= 0 || iIndexOf >= this.f15047e.size()) {
            return;
        }
        notifyItemChanged(iIndexOf);
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
