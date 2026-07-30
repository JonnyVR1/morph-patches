package p153l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.api.WebSocketManager;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class oj40 extends g2w<LongLinkLiveChatMessage.LiveChatRecall> {

    /* JADX INFO: renamed from: l.oj40$a */
    public class C19151a extends oj40 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pf60 f147635a;

        public C19151a(pf60 pf60Var) {
            this.f147635a = pf60Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.oj40, p153l.m4w, p153l.l4w, p153l.fxl
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo96253c() {
            return (String) this.f147635a.f152157b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.oj40, p153l.exl
        /* JADX INFO: renamed from: e */
        public String mo96254e() {
            return (String) this.f147635a.f152156a;
        }

        @Override // p153l.oj40, p153l.g2w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, InterfaceC3442q interfaceC3442q) {
            super.populatePushMessage(pushMessage, pq60Var, (LongLinkLiveChatMessage.LiveChatRecall) interfaceC3442q);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<pf60<String, String>> m167841i() {
        return jyb.m147507f0(jyb.m147494Y("quickchat.bell", "quickchat.bell"), jyb.m147494Y("quickchat.bell-greet", "quickchat.bell-greet"), jyb.m147494Y("quickchat.speed-push", "quickchat.speed-push"), jyb.m147494Y("quickchat.speed-match", "quickchat.speed-match"), jyb.m147494Y("quickchat.speed-delete", "quickchat.speed-delete"), jyb.m147494Y("quickchat_state.push", "quickchat_state.push"), jyb.m147494Y("quickchat_state.match", "quickchat_state.match"), jyb.m147494Y("quickchat.oneside", "quickchat.oneside"), jyb.m147494Y("quickchat.oneside-delete", "quickchat.oneside-delete"), jyb.m147494Y("quickchat.bubble.chatroom", "quickchat.bubble.chatroom"), jyb.m147494Y("voicechat.broadcast", "voicechat.broadcast"));
    }

    /* JADX INFO: renamed from: j */
    public static void m167842j() {
        ArrayList<pf60<String, String>> arrayListM167841i = m167841i();
        for (int i = 0; i < arrayListM167841i.size(); i++) {
            WebSocketManager.m30421Q().m30469e0(new C19151a(arrayListM167841i.get(i)));
        }
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveChatMessage.LiveChatRecall> mo95510b() {
        return LongLinkLiveChatMessage.LiveChatRecall.class;
    }

    @Override // p153l.m4w, p153l.l4w, p153l.fxl
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.quickchat_broadcast;
    }

    /* JADX INFO: renamed from: e */
    public String mo96254e() {
        return "uss.quickchat.broadcast";
    }

    @Override // p153l.m4w, p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p153l.g2w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkLiveChatMessage.LiveChatRecall liveChatRecall) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f39652id = liveChatRecall.getOtherUserId();
        pushMessage.messageCustom.action = liveChatRecall.getAuth();
        pushMessage.messageCustom.url = liveChatRecall.getUrl();
        pushMessage.messageCustom.gender = liveChatRecall.getGender();
        pushMessage.messageCustom.age = liveChatRecall.getAge();
        pushMessage.messageCustom.name = liveChatRecall.getName();
        pushMessage.messageCustom.tag1 = liveChatRecall.getTag1();
        pushMessage.messageCustom.tag2 = liveChatRecall.getTag2();
        pushMessage.messageCustom.tag3 = liveChatRecall.getTag3();
        pushMessage.messageCustom.queryToken = liveChatRecall.getQueryToken();
        pushMessage.silent = true;
        pushMessage.messageCustom.matchTopic = liveChatRecall.getTopic();
        pushMessage.messageCustom.openingRemark = liveChatRecall.getOpeningRemark();
        pushMessage.messageCustom.poolID = liveChatRecall.getPoolID();
        pushMessage.messageCustom.birthday = liveChatRecall.getBirthday();
        pushMessage.messageCustom.broadcastID = liveChatRecall.getBroadcastID();
        pushMessage.messageCustom.radioType = pq60Var.f153643a.getPush().getMessageCustomOrDefault("radioType", "");
    }
}
