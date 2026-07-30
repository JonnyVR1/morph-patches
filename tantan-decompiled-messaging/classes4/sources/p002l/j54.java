package p002l;

import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j54 extends if2 {

    /* JADX INFO: renamed from: c */
    public String f13578c;

    public j54(String str) {
        this.f13578c = str;
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo15118i() {
        return this.f13578c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView] */
    @Override // p002l.if2
    /* JADX INFO: renamed from: r */
    public void mo15127r(ViewGroup viewGroup, ei3 ei3Var) {
        ?? M12547a = ei3Var.m12547a(BulletType.CALL_BULLET, viewGroup);
        M12547a.setBackgroundResource(i3c0.f13030z7);
        viewGroup.addView(M12547a);
        M12547a.findViewById(g5c0.f11049c6).setImageResource(i3c0.f12741b6);
        ((TextView) M12547a.findViewById(g5c0.f10816D0)).setText(this.f13578c);
        m15113d(M12547a);
        zh3.m27376d("client_liveCall", zh3.m27373a("client_liveCall"), m15116g(), this.f13191b.mo21430R2(), "", "");
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: o */
    public void mo15124o() {
    }
}
