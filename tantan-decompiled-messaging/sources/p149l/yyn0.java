package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;

/* JADX INFO: loaded from: classes11.dex */
public class yyn0 extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f200784c;

    /* JADX INFO: renamed from: d */
    public final Act f200785d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f200786e;

    /* JADX INFO: renamed from: f */
    public gm0 f200787f;

    /* JADX INFO: renamed from: g */
    public boolean f200788g;

    /* JADX INFO: renamed from: h */
    public String f200789h;

    public yyn0(Act act, boolean z, e30<String> e30Var) {
        this.f200786e = new LivingUsers<>();
        this.f200789h = "";
        this.f200788g = z;
        this.f200785d = act;
        this.f200784c = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f200786e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f200785d.inflater().inflate(t6c0.f168041G9, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        ((VoiceMemberOnlineItem) view).m78607g(this.f200784c, mqvVar, this.f200787f, this.f200788g, this.f200789h);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f200786e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m216547G(LivingUsers<BLiveMember> livingUsers, @Nullable gm0 gm0Var) {
        this.f200787f = gm0Var;
        this.f200786e.clear();
        this.f200786e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    public yyn0(Act act, boolean z, e30<String> e30Var, String str) {
        this.f200786e = new LivingUsers<>();
        this.f200788g = z;
        this.f200785d = act;
        this.f200784c = e30Var;
        this.f200789h = str;
    }
}
