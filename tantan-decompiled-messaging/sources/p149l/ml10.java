package p149l;

import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class ml10 extends pat<ho2> {
    public ml10(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m155113M3(final LongLinkLiveMultiPk.MultiPkInviteNotify multiPkInviteNotify) {
        if (multiPkInviteNotify.getFromUser().getUserId().equals(ypv.f199493a.m199309D0())) {
            return;
        }
        new xh0.C21150a(this.f188513f).m208731j(multiPkInviteNotify.getFromUser().getUserName() + "邀请你再来一局").m208739r("接受").m208736o(new View.OnClickListener() { // from class: l.kl10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivingNormalApiProvider.m71606w3(multiPkInviteNotify.getMultiPkInviteId(), true);
            }
        }).m208737p(h1c0.f105357d).m208727f("拒绝").m208729h(false).m208724c(new View.OnClickListener() { // from class: l.ll10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivingNormalApiProvider.m71606w3(multiPkInviteNotify.getMultiPkInviteId(), false);
            }
        }).m208722a().m208721g();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnRestartRequest().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jl10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118444a.m155113M3((LongLinkLiveMultiPk.MultiPkInviteNotify) obj);
            }
        }));
    }
}
