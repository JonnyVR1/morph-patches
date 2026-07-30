package p002l;

import android.content.Intent;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.data.DbObject;
import l.fcz;
import l.mcr;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ncz extends wmz {

    /* JADX INFO: renamed from: p1 */
    public a<Conversation> f15952p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f15953q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f15954r1;

    public ncz(mcr mcrVar, Conversation conversation, String str) {
        super(mcrVar, conversation);
        this.f15953q1 = false;
        this.f15954r1 = false;
        ((fcz) this).b = str;
        ((fcz) this).c = str;
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = str;
        conversationNew_.otherUser = str;
        this.f15952p1 = a.c(conversationNew_);
        ((fcz) this).k = conversationNew_;
    }

    /* JADX INFO: renamed from: T2 */
    public c<Conversation> m18681T2() {
        return this.f15952p1;
    }

    /* JADX INFO: renamed from: U2 */
    public c<Conversation> m18682U2() {
        return this.f15952p1;
    }

    @Override // p002l.wmz
    /* JADX INFO: renamed from: a0 */
    public void mo17829a0() {
        super.mo17829a0();
        CoreModule.c.f0.De(i3());
    }

    /* JADX INFO: renamed from: a6 */
    public boolean m18683a6() {
        return false;
    }

    /* JADX INFO: renamed from: b7 */
    public void m18684b7(boolean z) {
        this.f15954r1 = z;
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m18685c6() {
        return this.f15954r1;
    }

    /* JADX INFO: renamed from: g3 */
    public Intent m18686g3(Intent intent) {
        if (!this.f15953q1) {
            CoreModule.P().i().K3(intent);
        }
        return super.g3(intent);
    }

    @Override // p002l.wmz
    /* JADX INFO: renamed from: wg */
    public boolean mo18687wg() {
        return false;
    }
}
