package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;

/* JADX INFO: loaded from: classes4.dex */
public class yiy extends jic0<nsv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f200252c;

    /* JADX INFO: renamed from: d */
    public final Act f200253d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f200254e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public cm0 f200255f;

    /* JADX INFO: renamed from: g */
    public boolean f200256g;

    public yiy(Act act, boolean z, y20<String> y20Var) {
        this.f200256g = z;
        this.f200253d = act;
        this.f200252c = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f200254e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f200253d.inflater().inflate(yec0.f198851N3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveMember> nsvVar, int i, int i2) {
        ((LiveMemberItem) view).m74257t(this.f200252c, nsvVar, this.f200255f, this.f200256g);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveMember> getItem(int i) {
        return (nsv) this.f200254e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m216353G(LivingUsers<BLiveMember> livingUsers, @Nullable cm0 cm0Var) {
        this.f200255f = cm0Var;
        this.f200254e.clear();
        this.f200254e.addAll(livingUsers);
        notifyDataSetChanged();
    }
}
