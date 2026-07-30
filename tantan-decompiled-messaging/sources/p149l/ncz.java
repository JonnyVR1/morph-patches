package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class ncz extends wmz {

    /* JADX INFO: renamed from: p1 */
    public C22392a<Conversation> f138239p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f138240q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f138241r1;

    public ncz(mcr mcrVar, Conversation conversation, String str) {
        super(mcrVar, conversation);
        this.f138240q1 = false;
        this.f138241r1 = false;
        this.f96910b = str;
        this.f96911c = str;
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = str;
        conversationNew_.otherUser = str;
        this.f138239p1 = C22392a.m221513c(conversationNew_);
        this.f96919k = conversationNew_;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: T2 */
    public C22306c<Conversation> mo120709T2() {
        return this.f138239p1;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: U2 */
    public C22306c<Conversation> mo120714U2() {
        return this.f138239p1;
    }

    @Override // p149l.wmz, p149l.fcz, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        CoreModule.f17545c.f19642f0.m32614De(m120783i3());
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: a6 */
    public boolean mo120746a6() {
        return false;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: b7 */
    public void mo120752b7(boolean z) {
        this.f138241r1 = z;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: c6 */
    public boolean mo120756c6() {
        return this.f138241r1;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: g3 */
    public Intent mo120773g3(Intent intent) {
        if (!this.f138240q1) {
            CoreModule.m29935P().m94658i().mo158258K3(intent);
        }
        return super.mo120773g3(intent);
    }

    @Override // p149l.wmz
    /* JADX INFO: renamed from: wg */
    public boolean mo158961wg() {
        return false;
    }
}
