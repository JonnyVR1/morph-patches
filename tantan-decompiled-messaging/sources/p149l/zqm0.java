package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.manager.VoiceCallMemberManagerItemView;

/* JADX INFO: loaded from: classes5.dex */
public class zqm0 extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f204397c;

    /* JADX INFO: renamed from: d */
    public final Act f204398d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f204399e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public final e30<mqv<BLiveMember>> f204400f;

    /* JADX INFO: renamed from: g */
    public gm0 f204401g;

    /* JADX INFO: renamed from: h */
    public String f204402h;

    public zqm0(Act act, e30<String> e30Var, e30<mqv<BLiveMember>> e30Var2) {
        this.f204398d = act;
        this.f204397c = e30Var;
        this.f204400f = e30Var2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f204399e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f204398d.inflater().inflate(t6c0.f168293b8, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        ((VoiceCallMemberManagerItemView) view).m77697h(this.f204397c, this.f204400f, mqvVar, this.f204401g, this.f204402h);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f204399e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m219860H(LivingUsers<BLiveMember> livingUsers, @Nullable gm0 gm0Var, String str) {
        this.f204401g = gm0Var;
        this.f204399e.clear();
        this.f204399e.addAll(livingUsers);
        this.f204402h = str;
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public void m219861I(final String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (vwb.m200296J(this.f204399e)) {
            return;
        }
        mqv mqvVar = (mqv) vwb.m200346r(this.f204399e, new w9j() { // from class: l.yqm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveMember) ((mqv) obj).f135304a).reference));
            }
        });
        ((BLiveMember) mqvVar.f135304a).inviteStatus = TEnum.equals(bLiveVoiceCallInvite.state, "not-invited") ? BLiveMember.STATUS_INVITE_CAN_INVITE : "invited";
        int iIndexOf = this.f204399e.indexOf(mqvVar);
        if (iIndexOf < 0 || iIndexOf >= this.f204399e.size()) {
            return;
        }
        notifyItemChanged(iIndexOf);
    }
}
