package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class mcz extends ncz {

    /* JADX INFO: renamed from: s1 */
    public long f133197s1;

    public mcz(mcr mcrVar, Conversation conversation, String str) {
        super(mcrVar, conversation, str);
        this.f133197s1 = 0L;
        this.f133197s1 = CoreModule.f17545c.f19642f0.f19865I0.get().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dh */
    public /* synthetic */ void m154029dh(Bundle bundle) {
        xdl0.m208344M(((bpz) this.viewModel).m190324q0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fh */
    public /* synthetic */ void m154030fh(List list) {
        CoreModule.f17545c.f19642f0.m32894ah(dwy.m113964a(list, m120783i3(), this.f133197s1, null), false);
    }

    @Override // p149l.ncz, p149l.wmz, p149l.fcz, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        CoreModule.f17545c.f19642f0.m32601Ce("messageAct");
        duringCreated(CoreModule.f17545c.f19642f0.m32829Un(m120783i3(), mo120838t3()).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.gcz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102063a.m154031bh((q860) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32737Ne(m120783i3())).subscribe(mkd0.m154955G(new e30() { // from class: l.hcz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107117a.m154032ch((Conversation) obj);
            }
        }));
        creates(new e30() { // from class: l.icz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112496a.m154029dh((Bundle) obj);
            }
        });
        duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32737Ne(this.f96911c).filter(new oa8()).flatMap(new w9j() { // from class: l.jcz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117359a.m154033eh((Conversation) obj);
            }
        })).first().observeOn(Schedulers.m221493io()).subscribe(mkd0.m154955G(new e30() { // from class: l.kcz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122523a.m154030fh((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: bh */
    public final /* synthetic */ void m154031bh(q860 q860Var) {
        if (q860Var.f153135a.size() == 0) {
            CoreModule.f17545c.f19642f0.m32930dh(m120783i3(), MessageType.get(MessageType.local_countdown_like_notify));
        }
    }

    /* JADX INFO: renamed from: ch */
    public final /* synthetic */ void m154032ch(Conversation conversation) {
        this.f138240q1 = true;
        this.f138239p1.m132487l(conversation);
        if (NullChecker.m81303a(((bpz) this.viewModel).m190324q0())) {
            xdl0.m208344M(((bpz) this.viewModel).m190324q0(), true);
        }
    }

    /* JADX INFO: renamed from: eh */
    public final /* synthetic */ C22306c m154033eh(Conversation conversation) {
        return CoreModule.f17553k.f91940c.m206081m0(m120783i3()).m165620m().filter(new w9j() { // from class: l.lcz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        });
    }
}
