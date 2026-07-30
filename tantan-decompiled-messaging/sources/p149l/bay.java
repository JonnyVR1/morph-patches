package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;

/* JADX INFO: loaded from: classes4.dex */
public class bay extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f74744c;

    /* JADX INFO: renamed from: d */
    public final Act f74745d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f74746e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public gm0 f74747f;

    /* JADX INFO: renamed from: g */
    public boolean f74748g;

    public bay(Act act, boolean z, e30<String> e30Var) {
        this.f74748g = z;
        this.f74745d = act;
        this.f74744c = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f74746e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f74745d.inflater().inflate(t6c0.f168119N3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        ((LiveMemberItem) view).m73074t(this.f74744c, mqvVar, this.f74747f, this.f74748g);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f74746e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m100936G(LivingUsers<BLiveMember> livingUsers, @Nullable gm0 gm0Var) {
        this.f74747f = gm0Var;
        this.f74746e.clear();
        this.f74746e.addAll(livingUsers);
        notifyDataSetChanged();
    }
}
