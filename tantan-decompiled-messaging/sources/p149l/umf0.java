package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class umf0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f177224b = new umf0();

    /* JADX INFO: renamed from: d */
    public static j4m m194347d() {
        return f177224b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        Conversation conversation;
        ConversationAdditional conversationAdditional;
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
        if (chatRoundsDisplayedExternallyConfigM194680P == null || !chatRoundsDisplayedExternallyConfigM194680P.enabled || (conversation = pi6Var.f149101a) == null || (conversationAdditional = conversation.additional) == null || conversationAdditional.chatMM == null || !conversation.doubleDefault()) {
            return false;
        }
        ChatMM chatMM = pi6Var.f149101a.additional.chatMM;
        if (chatMM.partnerSwitch && chatMM.level >= 3) {
            CoreModule.f17545c.f19639e0.f149520z6.put(Boolean.TRUE);
        }
        ChatMM chatMM2 = pi6Var.f149101a.additional.chatMM;
        return chatMM2.sparkSwitch && chatMM2.level >= 2;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return (NullChecker.m81303a(pi6Var) && NullChecker.m81303a(pi6Var.f149101a) && NullChecker.m81303a(pi6Var.f149101a.additional) && NullChecker.m81303a(pi6Var.f149101a.additional.chatMM)) ? zz6.m221002s0(String.valueOf(pi6Var.f149101a.additional.chatMM.mmCnt), pi6Var.f149124x.getResources().getColor(w0c0.f183852h0)) : "";
    }
}
