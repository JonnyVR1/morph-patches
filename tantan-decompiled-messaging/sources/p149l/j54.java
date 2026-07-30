package p149l;

import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class j54 extends if2 {

    /* JADX INFO: renamed from: c */
    public String f116266c;

    public j54(String str) {
        this.f116266c = str;
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo135870i() {
        return this.f116266c;
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: r */
    public void mo135879r(ViewGroup viewGroup, ei3 ei3Var) {
        DefaultBulletView defaultBulletViewM116621a = ei3Var.m116621a(BulletType.CALL_BULLET, viewGroup);
        defaultBulletViewM116621a.setBackgroundResource(i3c0.f111245z7);
        viewGroup.addView(defaultBulletViewM116621a);
        ((VDraweeView) defaultBulletViewM116621a.findViewById(g5c0.f100899c6)).setImageResource(i3c0.f110956b6);
        ((TextView) defaultBulletViewM116621a.findViewById(g5c0.f100666D0)).setText(this.f116266c);
        m135865d(defaultBulletViewM116621a);
        zh3.m218761d("client_liveCall", zh3.m218758a("client_liveCall"), m135868g(), this.f112955b.mo77274R2(), "", "");
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: o */
    public void mo135876o() {
    }
}
