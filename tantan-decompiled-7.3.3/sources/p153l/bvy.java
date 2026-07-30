package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageActionBarLeftLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bvy extends vuy<avy> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f78669b;

    /* JADX INFO: renamed from: c */
    public avy f78670c;

    public bvy(MessagesAct messagesAct) {
        this.f78669b = messagesAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78669b;
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: i */
    public void mo106630i() {
        super.mo106630i();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: p */
    public void mo106631p() {
        this.f78670c.m183231u0();
    }

    @Override // p153l.vuy
    /* JADX INFO: renamed from: q */
    public void mo106632q() {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f78670c.m143372e0().mo50158l().m110989i3());
        if (NullChecker.m82486a(conversationM33859Xe)) {
            getAct().startActivity(GroupSetAct.m50308a2(getAct(), conversationM33859Xe.f56859id, conversationM33859Xe.otherUser));
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(avy avyVar) {
        this.f78670c = avyVar;
    }

    /* JADX INFO: renamed from: w */
    public void m106634w(ChatGroup chatGroup, boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50686x(chatGroup, z);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
