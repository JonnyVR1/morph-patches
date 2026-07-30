package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class klz extends tvz {

    /* JADX INFO: renamed from: p1 */
    public C22507a<Conversation> f127420p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f127421q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f127422r1;

    public klz(ner nerVar, Conversation conversation, String str) {
        super(nerVar, conversation);
        this.f127421q1 = false;
        this.f127422r1 = false;
        this.f82473b = str;
        this.f82474c = str;
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = str;
        conversationNew_.otherUser = str;
        this.f127420p1 = C22507a.m222759c(conversationNew_);
        this.f82482k = conversationNew_;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: T2 */
    public C22421c<Conversation> mo110915T2() {
        return this.f127420p1;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: U2 */
    public C22421c<Conversation> mo110920U2() {
        return this.f127420p1;
    }

    @Override // p153l.tvz, p153l.clz, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        CoreModule.f18264c.f20384f0.m33617De(m110989i3());
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: a6 */
    public boolean mo110952a6() {
        return false;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: b7 */
    public void mo110958b7(boolean z) {
        this.f127422r1 = z;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: c6 */
    public boolean mo110962c6() {
        return this.f127422r1;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: g3 */
    public Intent mo110979g3(Intent intent) {
        if (!this.f127421q1) {
            CoreModule.m30933P().m143412i().mo180350K3(intent);
        }
        return super.mo110979g3(intent);
    }

    @Override // p153l.tvz
    /* JADX INFO: renamed from: wg */
    public boolean mo150404wg() {
        return false;
    }
}
