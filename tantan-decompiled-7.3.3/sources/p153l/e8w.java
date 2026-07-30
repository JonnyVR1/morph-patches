package p153l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class e8w extends g2w<LongLinkConversationMessage.CreateConversation> {

    /* JADX INFO: renamed from: l.e8w$a */
    public class C16733a extends e8w {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pf60 f92576a;

        public C16733a(pf60 pf60Var) {
            this.f92576a = pf60Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.e8w, p153l.m4w, p153l.l4w, p153l.fxl
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo96253c() {
            return (String) this.f92576a.f152157b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.e8w, p153l.exl
        /* JADX INFO: renamed from: e */
        public String mo96254e() {
            return (String) this.f92576a.f152156a;
        }

        @Override // p153l.e8w, p153l.g2w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, InterfaceC3442q interfaceC3442q) {
            super.populatePushMessage(pushMessage, pq60Var, (LongLinkConversationMessage.CreateConversation) interfaceC3442q);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<pf60<String, String>> m119837i() {
        return jyb.m147507f0(jyb.m147494Y("intl.lovebuzz.match", "intl.lovebuzz.match"), jyb.m147494Y("intl.lovebuzz.like", "intl.lovebuzz.like"), jyb.m147494Y("intl.lovebuzz.prolong", "intl.lovebuzz.prolong"), jyb.m147494Y("intl.lovebuzz.report", "intl.lovebuzz.report"), jyb.m147494Y("intl.lovebuzz.react", "intl.lovebuzz.react"), jyb.m147494Y("intl.lovebuzz.warn", "intl.lovebuzz.warn"));
    }

    /* JADX INFO: renamed from: j */
    public static void m119838j() {
        ArrayList<pf60<String, String>> arrayListM119837i = m119837i();
        for (int i = 0; i < arrayListM119837i.size(); i++) {
            WebSocketManager.m30421Q().m30469e0(new C16733a(arrayListM119837i.get(i)));
        }
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo95510b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p153l.m4w, p153l.l4w, p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return "intl.lovebuzz.invite";
    }

    @Override // p153l.exl
    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return "intl.lovebuzz.invite";
    }

    @Override // p153l.m4w, p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        String str = pushMessage.content.f39652id;
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f39652id = str;
        pushMessage.silent = true;
    }
}
