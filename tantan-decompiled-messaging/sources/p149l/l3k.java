package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;

/* JADX INFO: loaded from: classes4.dex */
public class l3k extends if2 {

    /* JADX INFO: renamed from: c */
    public kfw f125923c;

    public l3k(kfw kfwVar) {
        this.f125923c = kfwVar;
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: i */
    public CharSequence mo135870i() {
        return this.f125923c.m145875c();
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: o */
    public void mo135876o() {
        this.f112955b.m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m135868g().mo132155o0()).m73029r(m135868g().m149814k()).m73030s(m135868g().mo149813j().room.f44419id).m73028q(m135868g().m132146l0().name).m73033v(this.f125923c.m145874b()).m73034w(this.f125923c.m145873a()).m73032u("live-lucky-gift").m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
    }

    @Override // p149l.if2
    /* JADX INFO: renamed from: r */
    public void mo135879r(ViewGroup viewGroup, ei3 ei3Var) {
        DefaultBulletView defaultBulletViewM116621a = ei3Var.m116621a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
        viewGroup.addView(defaultBulletViewM116621a);
        hxs.m133406s("context_livingAct", defaultBulletViewM116621a.f49459e, this.f125923c.m145876d());
        defaultBulletViewM116621a.f49458d.setBackground(m135871j());
        m135865d(defaultBulletViewM116621a);
    }
}
