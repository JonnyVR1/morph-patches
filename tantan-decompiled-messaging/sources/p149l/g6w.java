package p149l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class g6w extends i0w<LongLinkConversationMessage.CreateConversation> {

    /* JADX INFO: renamed from: l.g6w$a */
    public class C17014a extends g6w {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j760 f101316a;

        public C17014a(j760 j760Var) {
            this.f101316a = j760Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.g6w, p149l.o2w, p149l.n2w, p149l.sul
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo94754c() {
            return (String) this.f101316a.f116565b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.g6w, p149l.rul
        /* JADX INFO: renamed from: e */
        public String mo95580e() {
            return (String) this.f101316a.f116564a;
        }

        @Override // p149l.g6w, p149l.i0w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, InterfaceC3419q interfaceC3419q) {
            super.populatePushMessage(pushMessage, ki60Var, (LongLinkConversationMessage.CreateConversation) interfaceC3419q);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<j760<String, String>> m124666i() {
        return vwb.m200324f0(vwb.m200311Y("intl.lovebuzz.match", "intl.lovebuzz.match"), vwb.m200311Y("intl.lovebuzz.like", "intl.lovebuzz.like"), vwb.m200311Y("intl.lovebuzz.prolong", "intl.lovebuzz.prolong"), vwb.m200311Y("intl.lovebuzz.report", "intl.lovebuzz.report"), vwb.m200311Y("intl.lovebuzz.react", "intl.lovebuzz.react"), vwb.m200311Y("intl.lovebuzz.warn", "intl.lovebuzz.warn"));
    }

    /* JADX INFO: renamed from: j */
    public static void m124667j() {
        ArrayList<j760<String, String>> arrayListM124666i = m124666i();
        for (int i = 0; i < arrayListM124666i.size(); i++) {
            WebSocketManager.m29423Q().m29471e0(new C17014a(arrayListM124666i.get(i)));
        }
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo94398b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p149l.o2w, p149l.n2w, p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return "intl.lovebuzz.invite";
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return "intl.lovebuzz.invite";
    }

    @Override // p149l.o2w, p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        String str = pushMessage.content.f38804id;
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f38804id = str;
        pushMessage.silent = true;
    }
}
