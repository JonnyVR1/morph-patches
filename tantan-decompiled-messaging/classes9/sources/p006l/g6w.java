package p006l;

import androidx.annotation.Nullable;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p1.mobile.longlink.msg.connector.LongLinkConversationMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import java.util.ArrayList;
import l.j760;
import l.ki60;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g6w extends i0w<LongLinkConversationMessage.CreateConversation> {

    /* JADX INFO: renamed from: l.g6w$a */
    public class C0751a extends g6w {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j760 f13097a;

        public C0751a(j760 j760Var) {
            this.f13097a = j760Var;
        }

        @Override // p006l.g6w, p006l.o2w, p006l.n2w, p006l.sul
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo11744c() {
            return (String) this.f13097a.b;
        }

        @Override // p006l.g6w, p006l.rul
        /* JADX INFO: renamed from: e */
        public String mo11805e() {
            return (String) this.f13097a.a;
        }

        @Override // p006l.g6w, p006l.i0w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, q qVar) {
            super.populatePushMessage(pushMessage, ki60Var, (LongLinkConversationMessage.CreateConversation) qVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<j760<String, String>> m15624i() {
        return vwb.f0(new j760[]{vwb.Y("intl.lovebuzz.match", "intl.lovebuzz.match"), vwb.Y("intl.lovebuzz.like", "intl.lovebuzz.like"), vwb.Y("intl.lovebuzz.prolong", "intl.lovebuzz.prolong"), vwb.Y("intl.lovebuzz.report", "intl.lovebuzz.report"), vwb.Y("intl.lovebuzz.react", "intl.lovebuzz.react"), vwb.Y("intl.lovebuzz.warn", "intl.lovebuzz.warn")});
    }

    /* JADX INFO: renamed from: j */
    public static void m15625j() {
        ArrayList<j760<String, String>> arrayListM15624i = m15624i();
        for (int i = 0; i < arrayListM15624i.size(); i++) {
            WebSocketManager.m1329Q().m1377e0(new C0751a(arrayListM15624i.get(i)));
        }
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkConversationMessage.CreateConversation> mo11743b() {
        return LongLinkConversationMessage.CreateConversation.class;
    }

    @Override // p006l.o2w, p006l.n2w, p006l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "intl.lovebuzz.invite";
    }

    @Override // p006l.rul
    /* JADX INFO: renamed from: e */
    public String mo11805e() {
        return "intl.lovebuzz.invite";
    }

    @Override // p006l.o2w, p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p006l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkConversationMessage.CreateConversation createConversation) {
        String str = pushMessage.content.id;
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.id = str;
        pushMessage.silent = true;
    }
}
