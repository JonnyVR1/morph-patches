package p002l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import l.hxs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l3k extends if2 {

    /* JADX INFO: renamed from: c */
    public kfw f14665c;

    public l3k(kfw kfwVar) {
        this.f14665c = kfwVar;
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo15118i() {
        return this.f14665c.m16613c();
    }

    @Override // p002l.if2
    /* JADX INFO: renamed from: o */
    public void mo15124o() {
        this.f13191b.m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m15116g().mo14591o0()).m6552r(m15116g().m17235k()).m6553s(m15116g().m17234j().room.id).m6551q(m15116g().m14582l0().name).m6556v(this.f14665c.m16612b()).m6557w(this.f14665c.m16611a()).m6555u("live-lucky-gift").m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView] */
    @Override // p002l.if2
    /* JADX INFO: renamed from: r */
    public void mo15127r(ViewGroup viewGroup, ei3 ei3Var) {
        ?? M12547a = ei3Var.m12547a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
        viewGroup.addView(M12547a);
        hxs.s("context_livingAct", M12547a.f5501e, this.f14665c.m16614d());
        M12547a.f5500d.setBackground(m15119j());
        m15113d(M12547a);
    }
}
