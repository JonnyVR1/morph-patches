package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.member.online.adapter.VoiceMemberOnlineItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import l.dac0;
import l.e30;
import l.gm0;
import l.mqv;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yyn0 extends dac0<mqv<BLiveMember>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f23288c;

    /* JADX INFO: renamed from: d */
    public final Act f23289d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveMember> f23290e;

    /* JADX INFO: renamed from: f */
    public gm0 f23291f;

    /* JADX INFO: renamed from: g */
    public boolean f23292g;

    /* JADX INFO: renamed from: h */
    public String f23293h;

    public yyn0(Act act, boolean z, e30<String> e30Var) {
        this.f23290e = new LivingUsers<>();
        this.f23293h = "";
        this.f23292g = z;
        this.f23289d = act;
        this.f23288c = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m25560C() {
        return this.f23290e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m25561D(ViewGroup viewGroup, int i) {
        return this.f23289d.inflater().inflate(t6c0.G9, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m25559A(View view, mqv<BLiveMember> mqvVar, int i, int i2) {
        ((VoiceMemberOnlineItem) view).m8823g(this.f23288c, mqvVar, this.f23291f, this.f23292g, this.f23293h);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveMember> getItem(int i) {
        return (mqv) this.f23290e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m25564G(LivingUsers<BLiveMember> livingUsers, @Nullable gm0 gm0Var) {
        this.f23291f = gm0Var;
        this.f23290e.clear();
        this.f23290e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    public yyn0(Act act, boolean z, e30<String> e30Var, String str) {
        this.f23290e = new LivingUsers<>();
        this.f23292g = z;
        this.f23289d = act;
        this.f23288c = e30Var;
        this.f23293h = str;
    }
}
