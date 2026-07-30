package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageActionBarLeftLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class emy extends yly<dmy> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f92266b;

    /* JADX INFO: renamed from: c */
    public dmy f92267c;

    public emy(MessagesAct messagesAct) {
        this.f92266b = messagesAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92266b;
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: i */
    public void mo117244i() {
        super.mo117244i();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: p */
    public void mo117245p() {
        this.f92267c.m194282u0();
    }

    @Override // p149l.yly
    /* JADX INFO: renamed from: q */
    public void mo117246q() {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f92267c.m156455e0().mo48974l().m120783i3());
        if (NullChecker.m81303a(conversationM32856Xe)) {
            getAct().startActivity(GroupSetAct.m49125Z1(getAct(), conversationM32856Xe.f56011id, conversationM32856Xe.otherUser));
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dmy dmyVar) {
        this.f92267c = dmyVar;
    }

    /* JADX INFO: renamed from: w */
    public void m117248w(ChatGroup chatGroup, boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49503x(chatGroup, z);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
