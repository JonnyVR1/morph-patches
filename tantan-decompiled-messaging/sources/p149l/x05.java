package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerScene;
import com.p046p1.mobile.putong.core.data.ChatPartnerText;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Meta;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class x05 extends jq2<c15> {

    /* JADX INFO: renamed from: a */
    public ChatPartners f188926a;

    /* JADX INFO: renamed from: b */
    public ChatPartnerText f188927b;

    /* JADX INFO: renamed from: c */
    public String f188928c;

    public x05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m206574k0(Bundle bundle) {
        ((c15) this.viewModel).m104817i();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.u05
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172845a.m206574k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169509l7(ChatPartnerScene.ONLINE_SQUARE_ACTIVE)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.v05
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179070a.m206578l0((Envelope) obj);
            }
        }, new e30() { // from class: l.w05
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public ChatPartners m206575h0() {
        return this.f188926a;
    }

    /* JADX INFO: renamed from: i0 */
    public ChatPartnerText m206576i0() {
        return this.f188927b;
    }

    /* JADX INFO: renamed from: j0 */
    public String m206577j0() {
        return this.f188928c;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m206578l0(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData)) {
            ChatPartners chatPartners = coreData.chatPartners;
            this.f188926a = chatPartners;
            ((c15) this.viewModel).m104819m(chatPartners);
        }
        Meta meta = envelope.meta;
        int i = meta.code;
        if (i == 20001 || i == 20002 || i == 20003) {
            this.f188928c = meta.message;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m206579m0(ChatPartnerText chatPartnerText) {
        this.f188927b = chatPartnerText;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
