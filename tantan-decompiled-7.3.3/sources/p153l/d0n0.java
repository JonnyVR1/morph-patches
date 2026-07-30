package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;

/* JADX INFO: loaded from: classes5.dex */
public class d0n0 extends jic0<nsv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f84581c;

    /* JADX INFO: renamed from: d */
    public final Act f84582d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f84583e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public final y20<nsv<BLiveMember>> f84584f;

    /* JADX INFO: renamed from: g */
    public cm0 f84585g;

    /* JADX INFO: renamed from: h */
    public String f84586h;

    public d0n0(Act act, y20<String> y20Var, y20<nsv<BLiveMember>> y20Var2) {
        this.f84582d = act;
        this.f84581c = y20Var;
        this.f84584f = y20Var2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f84583e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f84582d.inflater().inflate(yec0.f199025b8, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveMember> nsvVar, int i, int i2) {
        ((VoiceCallMemberManagerItemView) view).m78880h(this.f84581c, this.f84584f, nsvVar, this.f84585g, this.f84586h);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveMember> getItem(int i) {
        return (nsv) this.f84583e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m113417H(LivingUsers<BLiveMember> livingUsers, @Nullable cm0 cm0Var, String str) {
        this.f84585g = cm0Var;
        this.f84583e.clear();
        this.f84583e.addAll(livingUsers);
        this.f84586h = str;
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public void m113418I(final String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (jyb.m147479J(this.f84583e)) {
            return;
        }
        nsv nsvVar = (nsv) jyb.m147529r(this.f84583e, new qcj() { // from class: l.c0n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveMember) ((nsv) obj).f143542a).reference));
            }
        });
        ((BLiveMember) nsvVar.f143542a).inviteStatus = TEnum.equals(bLiveVoiceCallInvite.state, "not-invited") ? BLiveMember.STATUS_INVITE_CAN_INVITE : "invited";
        int iIndexOf = this.f84583e.indexOf(nsvVar);
        if (iIndexOf < 0 || iIndexOf >= this.f84583e.size()) {
            return;
        }
        notifyItemChanged(iIndexOf);
    }
}
