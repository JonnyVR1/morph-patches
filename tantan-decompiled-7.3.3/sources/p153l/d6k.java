package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;

/* JADX INFO: loaded from: classes4.dex */
public class d6k extends pf2 {

    /* JADX INFO: renamed from: c */
    public ihw f85382c;

    public d6k(ihw ihwVar) {
        this.f85382c = ihwVar;
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: i */
    public CharSequence mo114496i() {
        return this.f85382c.m140039c();
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: o */
    public void mo114497o() {
        this.f152150b.m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m172073g().mo160117o0()).m74212r(m172073g().m202191k()).m74213s(m172073g().mo183435j().room.f45267id).m74211q(m172073g().m168532l0().name).m74216v(this.f85382c.m140038b()).m74217w(this.f85382c.m140037a()).m74215u("live-lucky-gift").m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: r */
    public void mo114498r(ViewGroup viewGroup, si3 si3Var) {
        DefaultBulletView defaultBulletViewM186000a = si3Var.m186000a(BulletType.DEFAULT_BULLET_STYLE, viewGroup);
        viewGroup.addView(defaultBulletViewM186000a);
        izs.m142868s("context_livingAct", defaultBulletViewM186000a.f50307e, this.f85382c.m140040d());
        defaultBulletViewM186000a.f50306d.setBackground(m172075j());
        m172070d(defaultBulletViewM186000a);
    }
}
