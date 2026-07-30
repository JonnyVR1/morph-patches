package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class jlz extends klz {

    /* JADX INFO: renamed from: s1 */
    public long f121629s1;

    public jlz(ner nerVar, Conversation conversation, String str) {
        super(nerVar, conversation, str);
        this.f121629s1 = 0L;
        this.f121629s1 = CoreModule.f18264c.f20384f0.f20607I0.get().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dh */
    public /* synthetic */ void m146137dh(Bundle bundle) {
        bnl0.m105524M(((yxz) this.viewModel).m178968q0(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fh */
    public /* synthetic */ void m146138fh(List list) {
        CoreModule.f18264c.f20384f0.m33897ah(a5z.m96255a(list, m110989i3(), this.f121629s1, null), false);
    }

    @Override // p153l.klz, p153l.tvz, p153l.clz, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        CoreModule.f18264c.f20384f0.m33604Ce("messageAct");
        duringCreated(CoreModule.f18264c.f20384f0.m33832Un(m110989i3(), mo111044t3()).first()).subscribe(psd0.m173596G(new y20() { // from class: l.dlz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89592a.m146139bh((vg60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33740Ne(m110989i3())).subscribe(psd0.m173596G(new y20() { // from class: l.elz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94598a.m146140ch((Conversation) obj);
            }
        }));
        creates(new y20() { // from class: l.flz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99704a.m146137dh((Bundle) obj);
            }
        });
        duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33740Ne(this.f82474c).filter(new sb8()).flatMap(new qcj() { // from class: l.glz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104901a.m146141eh((Conversation) obj);
            }
        })).first().observeOn(Schedulers.m222739io()).subscribe(psd0.m173596G(new y20() { // from class: l.hlz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110563a.m146138fh((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: bh */
    public final /* synthetic */ void m146139bh(vg60 vg60Var) {
        if (vg60Var.f184001a.size() == 0) {
            CoreModule.f18264c.f20384f0.m33933dh(m110989i3(), MessageType.get(MessageType.local_countdown_like_notify));
        }
    }

    /* JADX INFO: renamed from: ch */
    public final /* synthetic */ void m146140ch(Conversation conversation) {
        this.f127421q1 = true;
        this.f127420p1.m137019l(conversation);
        if (NullChecker.m82486a(((yxz) this.viewModel).m178968q0())) {
            bnl0.m105524M(((yxz) this.viewModel).m178968q0(), true);
        }
    }

    /* JADX INFO: renamed from: eh */
    public final /* synthetic */ C22421c m146141eh(Conversation conversation) {
        return CoreModule.f18272k.f115535c.m189477m0(m110989i3()).m208677m().filter(new qcj() { // from class: l.ilz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((List) obj).size() > 0);
            }
        });
    }
}
