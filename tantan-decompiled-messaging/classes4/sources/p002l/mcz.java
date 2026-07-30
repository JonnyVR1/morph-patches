package p002l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.MessageType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.dwy;
import l.e30;
import l.fcz;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.oa8;
import l.q860;
import l.w9j;
import l.xdl0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mcz extends ncz {

    /* JADX INFO: renamed from: s1 */
    public long f15344s1;

    public mcz(mcr mcrVar, Conversation conversation, String str) {
        super(mcrVar, conversation, str);
        this.f15344s1 = 0L;
        this.f15344s1 = ((Long) CoreModule.c.f0.I0.get()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dh */
    public /* synthetic */ void m17827dh(Bundle bundle) {
        xdl0.M(((jq2) this).viewModel.q0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fh */
    public /* synthetic */ void m17828fh(List list) {
        CoreModule.c.f0.ah(dwy.a(list, i3(), this.f15344s1, (String) null), false);
    }

    @Override // p002l.ncz, p002l.wmz
    /* JADX INFO: renamed from: a0 */
    public void mo17829a0() {
        super.mo17829a0();
        CoreModule.c.f0.Ce("messageAct");
        duringCreated(CoreModule.c.f0.Un(i3(), t3()).first()).subscribe(mkd0.G(new e30() { // from class: l.gcz
            public final void call(Object obj) {
                this.f11370a.m17830bh((q860) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Ne(i3())).subscribe(mkd0.G(new e30() { // from class: l.hcz
            public final void call(Object obj) {
                this.f11988a.m17831ch((Conversation) obj);
            }
        }));
        creates(new e30() { // from class: l.icz
            public final void call(Object obj) {
                this.f13153a.m17827dh((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.f0.Ne(((fcz) this).c).filter(new oa8()).flatMap(new w9j() { // from class: l.jcz
            public final Object call(Object obj) {
                return this.f13696a.m17832eh((Conversation) obj);
            }
        })).first().observeOn(Schedulers.io()).subscribe(mkd0.G(new e30() { // from class: l.kcz
            public final void call(Object obj) {
                this.f14284a.m17828fh((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: bh */
    public final /* synthetic */ void m17830bh(q860 q860Var) {
        if (q860Var.a.size() == 0) {
            CoreModule.c.f0.dh(i3(), MessageType.get("local_countdown_like_notify"));
        }
    }

    /* JADX INFO: renamed from: ch */
    public final /* synthetic */ void m17831ch(Conversation conversation) {
        this.f15953q1 = true;
        this.f15952p1.onNext(conversation);
        if (NullChecker.a(((jq2) this).viewModel.q0())) {
            xdl0.M(((jq2) this).viewModel.q0(), true);
        }
    }

    /* JADX INFO: renamed from: eh */
    public final /* synthetic */ c m17832eh(Conversation conversation) {
        return CoreModule.k.c.m0(i3()).m().filter(new w9j() { // from class: l.lcz
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        });
    }
}
