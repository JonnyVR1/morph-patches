package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnerScene;
import com.p1.mobile.putong.core.data.ChatPartnerText;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Meta;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x05 extends jq2<c15> {

    /* JADX INFO: renamed from: a */
    public ChatPartners f22387a;

    /* JADX INFO: renamed from: b */
    public ChatPartnerText f22388b;

    /* JADX INFO: renamed from: c */
    public String f22389c;

    public x05(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m24638k0(Bundle bundle) {
        ((c15) ((jq2) this).viewModel).m12341i();
    }

    /* JADX INFO: renamed from: Z */
    public void m24639Z() {
        super.Z();
        creates(new e30() { // from class: l.u05
            public final void call(Object obj) {
                this.f20943a.m24638k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.l7(ChatPartnerScene.ONLINE_SQUARE_ACTIVE)).take(1).subscribe(mkd0.H(new e30() { // from class: l.v05
            public final void call(Object obj) {
                this.f21405a.m24643l0((Envelope) obj);
            }
        }, new e30() { // from class: l.w05
            public final void call(Object obj) {
                lsi0.y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public ChatPartners m24640h0() {
        return this.f22387a;
    }

    /* JADX INFO: renamed from: i0 */
    public ChatPartnerText m24641i0() {
        return this.f22388b;
    }

    /* JADX INFO: renamed from: j0 */
    public String m24642j0() {
        return this.f22389c;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m24643l0(Envelope envelope) {
        CoreData moduleData = envelope.data.getModuleData(CoreData.class);
        if (NullChecker.a(moduleData)) {
            ChatPartners chatPartners = moduleData.chatPartners;
            this.f22387a = chatPartners;
            ((c15) ((jq2) this).viewModel).m12344m(chatPartners);
        }
        Meta meta = envelope.meta;
        int i = meta.code;
        if (i == 20001 || i == 20002 || i == 20003) {
            this.f22389c = meta.message;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m24644m0(ChatPartnerText chatPartnerText) {
        this.f22388b = chatPartnerText;
    }

    public void destroy() {
    }
}
