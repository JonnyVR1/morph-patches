package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;

/* JADX INFO: loaded from: classes10.dex */
public class c8o0 extends jic0<nsv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f80225c;

    /* JADX INFO: renamed from: d */
    public final Act f80226d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f80227e;

    /* JADX INFO: renamed from: f */
    public cm0 f80228f;

    /* JADX INFO: renamed from: g */
    public boolean f80229g;

    /* JADX INFO: renamed from: h */
    public String f80230h;

    public c8o0(Act act, boolean z, y20<String> y20Var) {
        this.f80227e = new LivingUsers<>();
        this.f80230h = "";
        this.f80229g = z;
        this.f80226d = act;
        this.f80225c = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f80227e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f80226d.inflater().inflate(yec0.f198773G9, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveMember> nsvVar, int i, int i2) {
        ((VoiceMemberOnlineItem) view).m79790g(this.f80225c, nsvVar, this.f80228f, this.f80229g, this.f80230h);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveMember> getItem(int i) {
        return (nsv) this.f80227e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m108379G(LivingUsers<BLiveMember> livingUsers, @Nullable cm0 cm0Var) {
        this.f80228f = cm0Var;
        this.f80227e.clear();
        this.f80227e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    public c8o0(Act act, boolean z, y20<String> y20Var, String str) {
        this.f80227e = new LivingUsers<>();
        this.f80229g = z;
        this.f80226d = act;
        this.f80225c = y20Var;
        this.f80230h = str;
    }
}
