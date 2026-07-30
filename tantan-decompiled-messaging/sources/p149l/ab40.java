package p149l;

import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.connector.LongLinkLiveChatMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.api.WebSocketManager;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ab40 extends i0w<LongLinkLiveChatMessage.LiveChatRecall> {

    /* JADX INFO: renamed from: l.ab40$a */
    public class C15566a extends ab40 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j760 f68625a;

        public C15566a(j760 j760Var) {
            this.f68625a = j760Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.ab40, p149l.o2w, p149l.n2w, p149l.sul
        @Nullable
        /* JADX INFO: renamed from: c */
        public String mo94754c() {
            return (String) this.f68625a.f116565b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.ab40, p149l.rul
        /* JADX INFO: renamed from: e */
        public String mo95580e() {
            return (String) this.f68625a.f116564a;
        }

        @Override // p149l.ab40, p149l.i0w
        public /* bridge */ /* synthetic */ void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, InterfaceC3419q interfaceC3419q) {
            super.populatePushMessage(pushMessage, ki60Var, (LongLinkLiveChatMessage.LiveChatRecall) interfaceC3419q);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<j760<String, String>> m95578i() {
        return vwb.m200324f0(vwb.m200311Y("quickchat.bell", "quickchat.bell"), vwb.m200311Y("quickchat.bell-greet", "quickchat.bell-greet"), vwb.m200311Y("quickchat.speed-push", "quickchat.speed-push"), vwb.m200311Y("quickchat.speed-match", "quickchat.speed-match"), vwb.m200311Y("quickchat.speed-delete", "quickchat.speed-delete"), vwb.m200311Y("quickchat_state.push", "quickchat_state.push"), vwb.m200311Y("quickchat_state.match", "quickchat_state.match"), vwb.m200311Y("quickchat.oneside", "quickchat.oneside"), vwb.m200311Y("quickchat.oneside-delete", "quickchat.oneside-delete"), vwb.m200311Y("quickchat.bubble.chatroom", "quickchat.bubble.chatroom"), vwb.m200311Y("voicechat.broadcast", "voicechat.broadcast"));
    }

    /* JADX INFO: renamed from: j */
    public static void m95579j() {
        ArrayList<j760<String, String>> arrayListM95578i = m95578i();
        for (int i = 0; i < arrayListM95578i.size(); i++) {
            WebSocketManager.m29423Q().m29471e0(new C15566a(arrayListM95578i.get(i)));
        }
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveChatMessage.LiveChatRecall> mo94398b() {
        return LongLinkLiveChatMessage.LiveChatRecall.class;
    }

    @Override // p149l.o2w, p149l.n2w, p149l.sul
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.quickchat_broadcast;
    }

    @Override // p149l.rul
    /* JADX INFO: renamed from: e */
    public String mo95580e() {
        return "uss.quickchat.broadcast";
    }

    @Override // p149l.o2w, p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    @Override // p149l.i0w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkLiveChatMessage.LiveChatRecall liveChatRecall) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.f38804id = liveChatRecall.getOtherUserId();
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
        pushMessage.messageCustom.radioType = ki60Var.f123271a.getPush().getMessageCustomOrDefault("radioType", "");
    }
}
