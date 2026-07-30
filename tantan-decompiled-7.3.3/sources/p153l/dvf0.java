package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dvf0 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f90926b = new dvf0();

    /* JADX INFO: renamed from: d */
    public static z6m m118282d() {
        return f90926b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
        if (chatRoundsDisplayedExternallyConfigM131611P == null || !chatRoundsDisplayedExternallyConfigM131611P.enabled || (conversation = sj6Var.f168926a) == null || (conversationAdditional = conversation.additional) == null || conversationAdditional.chatMM == null || !conversation.doubleDefault()) {
            return false;
        }
        ChatMM chatMM = sj6Var.f168926a.additional.chatMM;
        if (chatMM.partnerSwitch && chatMM.level >= 3) {
            CoreModule.f18264c.f20381e0.f89377z6.put(Boolean.TRUE);
        }
        ChatMM chatMM2 = sj6Var.f168926a.additional.chatMM;
        return chatMM2.sparkSwitch && chatMM2.level >= 2;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return (NullChecker.m82486a(sj6Var) && NullChecker.m82486a(sj6Var.f168926a) && NullChecker.m82486a(sj6Var.f168926a.additional) && NullChecker.m82486a(sj6Var.f168926a.additional.chatMM)) ? c17.m107526s0(String.valueOf(sj6Var.f168926a.additional.chatMM.mmCnt), sj6Var.f168949x.getResources().getColor(c9c0.f80425i0)) : "";
    }
}
