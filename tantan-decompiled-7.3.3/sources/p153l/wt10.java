package p153l;

import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class wt10 extends qct<oo2> {
    public wt10(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m207814M3(final LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        if (multiPkInviteNotify.getFromUser().getUserId().equals(zrv.f205799a.m207631D0())) {
            return;
        }
        new th0.C20312a(this.f196919f).m191151j(multiPkInviteNotify.getFromUser().getUserName() + "邀请你再来一局").m191159r("接受").m191156o(new View.OnClickListener() { // from class: l.ut10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivingNormalApiProvider.m72789w3(multiPkInviteNotify.getMultiPkInviteId(), true);
            }
        }).m191157p(n9c0.f140818d).m191147f("拒绝").m191149h(false).m191144c(new View.OnClickListener() { // from class: l.vt10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivingNormalApiProvider.m72789w3(multiPkInviteNotify.getMultiPkInviteId(), false);
            }
        }).m191142a().m191141g();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnRestartRequest().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.tt10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176049a.m207814M3((LongLinkLiveMultiPk.MultiPkInviteNotify) obj);
            }
        }));
    }
}
