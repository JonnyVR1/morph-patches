package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSetAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageActionBarLeftLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import l.dmy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class emy extends yly<dmy> {

    /* JADX INFO: renamed from: b */
    public MessagesAct f3338b;

    /* JADX INFO: renamed from: c */
    public dmy f3339c;

    public emy(MessagesAct messagesAct) {
        this.f3338b = messagesAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3904C0() {
        return this.f3338b;
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: i */
    public void mo3905i() {
        super.mo3905i();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: p */
    public void mo3907p() {
        this.f3339c.u0();
    }

    @Override // p003l.yly
    /* JADX INFO: renamed from: q */
    public void mo3908q() {
        Conversation conversationXe = CoreModule.c.f0.Xe(this.f3339c.m6497e0().mo2066l().m4250i3());
        if (NullChecker.a(conversationXe)) {
            act().startActivity(GroupSetAct.m2236Z1(act(), ((DbObject) conversationXe).id, conversationXe.otherUser));
        }
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m3906i1(dmy dmyVar) {
        this.f3339c = dmyVar;
    }

    /* JADX INFO: renamed from: w */
    public void m3910w(ChatGroup chatGroup, boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2650x(chatGroup, z);
        }
    }

    public void destroy() {
    }
}
