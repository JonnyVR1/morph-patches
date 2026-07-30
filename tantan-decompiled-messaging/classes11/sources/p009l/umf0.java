package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.w0c0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class umf0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f21245b = new umf0();

    /* JADX INFO: renamed from: d */
    public static j4m m23070d() {
        return f21245b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
        if (chatRoundsDisplayedExternallyConfigP == null || !chatRoundsDisplayedExternallyConfigP.enabled || (conversation = pi6Var.f18622a) == null || (conversationAdditional = conversation.additional) == null || conversationAdditional.chatMM == null || !conversation.doubleDefault()) {
            return false;
        }
        ChatMM chatMM = pi6Var.f18622a.additional.chatMM;
        if (chatMM.partnerSwitch && chatMM.level >= 3) {
            CoreModule.c.e0.z6.put(Boolean.TRUE);
        }
        ChatMM chatMM2 = pi6Var.f18622a.additional.chatMM;
        return chatMM2.sparkSwitch && chatMM2.level >= 2;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return (NullChecker.a(pi6Var) && NullChecker.a(pi6Var.f18622a) && NullChecker.a(pi6Var.f18622a.additional) && NullChecker.a(pi6Var.f18622a.additional.chatMM)) ? zz6.s0(String.valueOf(pi6Var.f18622a.additional.chatMM.mmCnt), pi6Var.f18645x.getResources().getColor(w0c0.h0)) : "";
    }
}
