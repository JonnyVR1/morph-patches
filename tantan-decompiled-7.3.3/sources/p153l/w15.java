package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerScene;
import com.p051p1.mobile.putong.core.data.ChatPartnerText;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Meta;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class w15 extends ar2<b25> {

    /* JADX INFO: renamed from: a */
    public ChatPartners f186763a;

    /* JADX INFO: renamed from: b */
    public ChatPartnerText f186764b;

    /* JADX INFO: renamed from: c */
    public String f186765c;

    public w15(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m204383k0(Bundle bundle) {
        ((b25) this.viewModel).m102107i();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.t15
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171598a.m204383k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116582l7(ChatPartnerScene.ONLINE_SQUARE_ACTIVE)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.u15
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176968a.m204387l0((Envelope) obj);
            }
        }, new y20() { // from class: l.v15
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public ChatPartners m204384h0() {
        return this.f186763a;
    }

    /* JADX INFO: renamed from: i0 */
    public ChatPartnerText m204385i0() {
        return this.f186764b;
    }

    /* JADX INFO: renamed from: j0 */
    public String m204386j0() {
        return this.f186765c;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m204387l0(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData)) {
            ChatPartners chatPartners = coreData.chatPartners;
            this.f186763a = chatPartners;
            ((b25) this.viewModel).m102109m(chatPartners);
        }
        Meta meta = envelope.meta;
        int i = meta.code;
        if (i == 20001 || i == 20002 || i == 20003) {
            this.f186765c = meta.message;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m204388m0(ChatPartnerText chatPartnerText) {
        this.f186764b = chatPartnerText;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
