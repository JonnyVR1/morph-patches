package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import l.dac0;
import l.e30;
import l.mqv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bay extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f8051c;

    /* JADX INFO: renamed from: d */
    public final Act f8052d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f8053e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public gm0 f8054f;

    /* JADX INFO: renamed from: g */
    public boolean f8055g;

    public bay(Act act, boolean z, e30<String> e30Var) {
        this.f8055g = z;
        this.f8052d = act;
        this.f8051c = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m10213C() {
        return this.f8053e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m10214D(ViewGroup viewGroup, int i) {
        return this.f8052d.inflater().inflate(t6c0.f19615N3, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m10212A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        ((LiveMemberItem) view).m6600t(this.f8051c, mqvVar, this.f8054f, this.f8055g);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f8053e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m10217G(LivingUsers<BLiveMember> livingUsers, @Nullable gm0 gm0Var) {
        this.f8054f = gm0Var;
        this.f8053e.clear();
        this.f8053e.addAll(livingUsers);
        notifyDataSetChanged();
    }
}
