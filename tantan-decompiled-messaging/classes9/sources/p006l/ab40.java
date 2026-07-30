package p006l;

import androidx.annotation.Nullable;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.api.WebSocketManager;
import com.p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import java.util.ArrayList;
import l.j760;
import l.ki60;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ab40 extends i0w<LongLinkLiveChatMessage.LiveChatRecall> {

    /* JADX INFO: renamed from: l.ab40$a */
    public class C0500a extends ab40 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j760 f8188a;

        public C0500a(j760 j760Var) {
            this.f8188a = j760Var;
        }

        @Override // p006l.ab40, p006l.o2w, p006l.n2w, p006l.sul
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo11744c() {
            return (String) this.f8188a.b;
        }

        @Override // p006l.ab40, p006l.rul
        /* JADX INFO: renamed from: e */
        public String mo11805e() {
            return (String) this.f8188a.a;
        }

        @Override // p006l.ab40, p006l.i0w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, q qVar) {
            super.populatePushMessage(pushMessage, ki60Var, (LongLinkLiveChatMessage.LiveChatRecall) qVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<j760<String, String>> m11803i() {
        return vwb.f0(new j760[]{vwb.Y("quickchat.bell", "quickchat.bell"), vwb.Y("quickchat.bell-greet", "quickchat.bell-greet"), vwb.Y("quickchat.speed-push", "quickchat.speed-push"), vwb.Y("quickchat.speed-match", "quickchat.speed-match"), vwb.Y("quickchat.speed-delete", "quickchat.speed-delete"), vwb.Y("quickchat_state.push", "quickchat_state.push"), vwb.Y("quickchat_state.match", "quickchat_state.match"), vwb.Y("quickchat.oneside", "quickchat.oneside"), vwb.Y("quickchat.oneside-delete", "quickchat.oneside-delete"), vwb.Y("quickchat.bubble.chatroom", "quickchat.bubble.chatroom"), vwb.Y("voicechat.broadcast", "voicechat.broadcast")});
    }

    /* JADX INFO: renamed from: j */
    public static void m11804j() {
        ArrayList<j760<String, String>> arrayListM11803i = m11803i();
        for (int i = 0; i < arrayListM11803i.size(); i++) {
            WebSocketManager.m1329Q().m1377e0(new C0500a(arrayListM11803i.get(i)));
        }
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveChatMessage.LiveChatRecall> mo11743b() {
        return LongLinkLiveChatMessage.LiveChatRecall.class;
    }

    @Override // p006l.o2w, p006l.n2w, p006l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "quickchat.broadcast";
    }

    @Override // p006l.rul
    /* JADX INFO: renamed from: e */
    public String mo11805e() {
        return "uss.quickchat.broadcast";
    }

    @Override // p006l.o2w, p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p006l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkLiveChatMessage.LiveChatRecall liveChatRecall) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.id = liveChatRecall.getOtherUserId();
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
        pushMessage.messageCustom.radioType = ki60Var.a.getPush().getMessageCustomOrDefault("radioType", "");
    }
}
