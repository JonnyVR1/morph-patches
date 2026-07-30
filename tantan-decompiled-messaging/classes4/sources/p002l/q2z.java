package p002l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.ChatGameInfo;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatTips;
import com.p1.mobile.putong.core.data.CommonTipBox;
import com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationGame;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreGiftPriority;
import com.p1.mobile.putong.core.data.HarassAlertInfo;
import com.p1.mobile.putong.core.data.HeartbeatMatch;
import com.p1.mobile.putong.core.data.IceBreakingQA;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.LoveLetterContent;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageChatHeat;
import com.p1.mobile.putong.core.data.MessageExtData;
import com.p1.mobile.putong.core.data.MessageTipsContent;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.core.data.Questionnaire;
import com.p1.mobile.putong.core.data.QuestionnaireScene;
import com.p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p1.mobile.putong.core.data.StateData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.f8c;
import l.fcz;
import l.guy;
import l.hpd0;
import l.i0e;
import l.j760;
import l.jo0;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.qhe;
import l.tpd0;
import l.vwb;
import l.w3z;
import l.xdl0;
import l.y4c0;
import rx.c;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q2z {

    /* JADX INFO: renamed from: a */
    public static boolean f17770a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f17771b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f17772c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f17773d = false;

    /* JADX INFO: renamed from: e */
    public static hpd0 f17774e = new hpd0("fake_debug_conv", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static int f17775f;

    /* JADX INFO: renamed from: l.q2z$a */
    public class C0763a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17776a;

        public C0763a(fcz fczVar) {
            this.f17776a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21004a(fcz fczVar) {
            Conversation conversationQuery = CoreModule.k.m.query(fczVar.c);
            conversationQuery.additional.heartbeatMatch.guideFakeToGood = true;
            CoreModule.k.m.upsert(conversationQuery);
        }

        public void call() {
            final fcz fczVar = this.f17776a;
            e51.y(new Runnable() { // from class: l.o2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.p2z
                        public final void call() {
                            q2z.C0763a.m21004a(fczVar);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$b */
    public class C0764b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17777a;

        public C0764b(fcz fczVar) {
            this.f17777a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21006a(fcz fczVar, Message message) {
            message.owner = fczVar.c;
            message.value = "哈哈哈哈哈啊哈哈哈哈哈哈哈啊";
        }

        public void call() {
            final fcz fczVar = this.f17777a;
            e51.y(new Runnable() { // from class: l.r2z
                @Override // java.lang.Runnable
                public final void run() {
                    fcz fczVar2 = fczVar;
                    CoreModule.c.f0.ch(fczVar2.c, MessageType.get("hide_for_fake_user"), new e30() { // from class: l.s2z
                        public final void call(Object obj) {
                            q2z.C0764b.m21006a(fczVar2, (Message) obj);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$c */
    public class C0765c implements d30 {
        public void call() {
            hpd0 hpd0Var = q2z.f17774e;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }
    }

    /* JADX INFO: renamed from: l.q2z$d */
    public class C0766d implements e30<Message> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Message message) {
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            message.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.commonTipBox = CommonTipBox.new_();
            CommonTipBox commonTipBox = message.additionalData.commonTipBox;
            commonTipBox.type = "verify";
            commonTipBox.title = "让关系更近一步";
            commonTipBox.subtitle = "他诚心希望你完成真人认证，体现你的交友诚意，让彼此关系更紧密";
            commonTipBox.iconUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6IldaQ09KQUdJUDUyREJXUzZESE9aWUszWkpPVVFERjE0IiwidyI6MTI2LCJoIjoxMjYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI2NTIwNTE3MjczMjI2MDc1MH0.png";
            commonTipBox.button = "去认证";
            commonTipBox.schema = "tantanapp://verificationcenter";
        }
    }

    /* JADX INFO: renamed from: l.q2z$e */
    public class C0767e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17778a;

        public C0767e(fcz fczVar) {
            this.f17778a = fczVar;
        }

        public void call() {
            List list = this.f17778a.r.a;
            q2z.m20967q2(true, this.f17778a.r3(), ((Message) list.get(list.size() - 1)).clone());
        }
    }

    /* JADX INFO: renamed from: l.q2z$f */
    public class C0768f implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17779a;

        public C0768f(fcz fczVar) {
            this.f17779a = fczVar;
        }

        public void call() {
            List list = this.f17779a.r.a;
            q2z.m20967q2(false, this.f17779a.r3(), ((Message) list.get(list.size() - 1)).clone());
        }
    }

    /* JADX INFO: renamed from: l.q2z$g */
    public class C0769g implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17780a;

        public C0769g(fcz fczVar) {
            this.f17780a = fczVar;
        }

        public void call() {
            q2z.m20951m2(true, this.f17780a.r3());
        }
    }

    /* JADX INFO: renamed from: l.q2z$h */
    public class C0770h implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17781a;

        public C0770h(fcz fczVar) {
            this.f17781a = fczVar;
        }

        public void call() {
            q2z.m20951m2(false, this.f17781a.r3());
        }
    }

    /* JADX INFO: renamed from: l.q2z$i */
    public class C0771i implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17782a;

        public C0771i(fcz fczVar) {
            this.f17782a = fczVar;
        }

        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f17782a.r3();
            tpd0 tpd0Var = App.i;
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            messageNew_.messageType = MessageType.get("moment_user_state");
            messageNew_.createdTime = mqi0.o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = ((DbObject) CoreModule.c.e0.na()).id;
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = ((Media) CoreModule.K().me_().fp()).url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            e51.y(new Runnable() { // from class: l.m2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.n2z
                        public final void call() {
                            CoreModule.k.c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$j */
    public class C0772j implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17783a;

        public C0772j(fcz fczVar) {
            this.f17783a = fczVar;
        }

        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f17783a.r3();
            tpd0 tpd0Var = App.i;
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            messageNew_.messageType = MessageType.get("moment_user_state");
            messageNew_.createdTime = mqi0.o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = this.f17783a.r3();
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = ((Media) CoreModule.K().me_().fp()).url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            e51.y(new Runnable() { // from class: l.t2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.u2z
                        public final void call() {
                            CoreModule.k.c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$k */
    public class C0773k implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17784a;

        public C0773k(fcz fczVar) {
            this.f17784a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21013a(fcz fczVar) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                ChatAssistantQuestion chatAssistantQuestionNew_ = ChatAssistantQuestion.new_();
                chatAssistantQuestionNew_.question = "如果可以用一半智商换10cm的身高，你愿意吗？";
                chatAssistantQuestionNew_.questionId = 123;
                arrayList.add(chatAssistantQuestionNew_);
            }
            CoreModule.c.f0.Yg(fczVar.c, arrayList);
        }

        public void call() {
            final fcz fczVar = this.f17784a;
            e51.y(new Runnable() { // from class: l.v2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C0773k.m21013a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$l */
    public class C0774l implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17785a;

        public C0774l(fcz fczVar) {
            this.f17785a = fczVar;
        }

        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("local_normal_tips");
            messageNew_.cid = this.f17785a.c;
            messageNew_.value = "她上次活跃在12小时前，可能不会立即回复，请稍候";
            messageNew_.localInConversation = true;
            long jO = mqi0.o();
            messageNew_.owner = CoreModule.H().userId();
            messageNew_.createdTime = jO;
            messageNew_.localCreatedTime = jO;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.H().userId();
            tpd0 tpd0Var = App.i;
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            CoreModule.c.f0.Zg(messageNew_);
        }
    }

    /* JADX INFO: renamed from: l.q2z$m */
    public class C0775m implements d30 {
        public void call() {
            CoreModule.c.e0.I5.clear();
            CoreModule.c.e0.J5.clear();
            CoreModule.c.e0.K5.clear();
        }
    }

    /* JADX INFO: renamed from: l.q2z$n */
    public class C0776n implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17786a;

        public C0776n(fcz fczVar) {
            this.f17786a = fczVar;
        }

        public void call() {
            final fcz fczVar = this.f17786a;
            e51.y(new Runnable() { // from class: l.w2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.f0.Cf(fczVar.c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$o */
    public class C0777o implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17787a;

        public C0777o(fcz fczVar) {
            this.f17787a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21015a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("chat_assistant_question");
            messageNew_.cid = fczVar.c;
            messageNew_.localInConversation = true;
            long jO = mqi0.o();
            messageNew_.owner = CoreModule.H().userId();
            messageNew_.createdTime = jO;
            messageNew_.localCreatedTime = jO;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.H().userId();
            tpd0 tpd0Var = App.i;
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "system";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.c.f0.Zg(messageNew_);
        }

        public void call() {
            final fcz fczVar = this.f17787a;
            e51.y(new Runnable() { // from class: l.x2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C0777o.m21015a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$p */
    public class C0778p implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17788a;

        public C0778p(fcz fczVar) {
            this.f17788a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21016a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("chat_assistant_question");
            messageNew_.cid = fczVar.c;
            messageNew_.localInConversation = true;
            long jO = mqi0.o();
            messageNew_.owner = CoreModule.H().userId();
            messageNew_.createdTime = jO;
            messageNew_.localCreatedTime = jO;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.H().userId();
            tpd0 tpd0Var = App.i;
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "user";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.c.f0.Zg(messageNew_);
        }

        public void call() {
            final fcz fczVar = this.f17788a;
            e51.y(new Runnable() { // from class: l.y2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C0778p.m21016a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$q */
    public class C0779q implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f17789a;

        public C0779q(fcz fczVar) {
            this.f17789a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21017a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("chat_assistant_question");
            messageNew_.cid = fczVar.c;
            messageNew_.localInConversation = true;
            long jO = mqi0.o();
            messageNew_.owner = ((DbObject) fczVar.x6()).id;
            messageNew_.createdTime = jO;
            messageNew_.localCreatedTime = jO;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = ((DbObject) fczVar.x6()).id;
            tpd0 tpd0Var = App.i;
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.c.f0.Zg(messageNew_);
        }

        public void call() {
            final fcz fczVar = this.f17789a;
            e51.y(new Runnable() { // from class: l.z2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C0779q.m21017a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m20819A0(fcz fczVar, Message message) {
        message.owner = fczVar.c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: A2 */
    public static void m20821A2(final String str, final int i) {
        e51.y(new Runnable() { // from class: l.kyy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.qyy
                    public final void call() {
                        q2z.m20953n0(str, i);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m20824B1(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"love_letter"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("love_letter"), new e30() { // from class: l.qwy
            public final void call(Object obj) {
                q2z.m20887V1(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public static void m20825B2(final String str, final boolean z) {
        e51.y(new Runnable() { // from class: l.zxy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.jyy
                    public final void call() {
                        q2z.m20956o(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public static void m20829C2(final Conversation conversation, final boolean z, final boolean z2, final long j) {
        e51.y(new Runnable() { // from class: l.ayy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.uyy
                    public final void call() {
                        q2z.m20973s0(conversation, z, z, j);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m20830D(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入聊天助手新问题引导消息", new C0773k(fczVar)));
        arrayList.add(vwb.Y("插入聊天-不能立即回复", new C0774l(fczVar)));
        arrayList.add(vwb.Y("插入聊天-不能立即回复 清理数据", new C0775m()));
        arrayList.add(vwb.Y("删除聊天助手新问题引导消息", new C0776n(fczVar)));
        arrayList.add(vwb.Y("插入聊天助手问题消息-主态-代发", new C0777o(fczVar)));
        arrayList.add(vwb.Y("插入聊天助手问题消息-主态", new C0778p(fczVar)));
        arrayList.add(vwb.Y("插入聊天助手问题消息-客态", new C0779q(fczVar)));
        arrayList.add(vwb.Y("成为阻塞配对", new C0763a(fczVar)));
        arrayList.add(vwb.Y("插入阻塞消息", new C0764b(fczVar)));
        arrayList.add(vwb.Y("fake conv Debug" + f17774e.get(), new C0765c()));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m20831D0() {
        ChatGameInfo chatGameInfoNew_ = ChatGameInfo.new_();
        chatGameInfoNew_.enable = true;
        chatGameInfoNew_.name = "wooden-fish";
        chatGameInfoNew_.icon = "https://static.tancdn.com/pe-webplatform/VKRa4WNsZMi1ArZrPBt_xziW.webp";
        chatGameInfoNew_.link = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/knockWoodenFish/index.html?speed=true&_bid=1003873&hideNavigationBar=1&hideNotch=1&unread=1&otherUserId";
        CoreModule.c.f0.oq(chatGameInfoNew_);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m20833D2(final Conversation conversation) {
        e51.y(new Runnable() { // from class: l.dyy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.tyy
                    public final void call() {
                        q2z.m20937j0(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m20837F(fcz fczVar, Message message) {
        message.owner = ((DbObject) fczVar.W5()).id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m20840G() {
        CoreModule.c.f0.J1.clear();
        CoreModule.c.f0.I1.clear();
        CoreModule.c.f0.H1.clear();
        CoreModule.c.f0.N1.clear();
        CoreModule.c.f0.M1.clear();
        CoreModule.c.f0.L1.clear();
        CoreModule.c.f0.G1.clear();
        CoreModule.c.f0.K1.clear();
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.clear();
        ConversationCounterTypeSp.ProloguesEnterChatCount.clear();
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m20841G0(fcz fczVar, View view) {
        int iAbs = Math.abs(new Random().nextInt(30)) + 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iAbs; i++) {
            sb.append(m20987v2());
        }
        fczVar.S6(sb.toString());
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m20842G1(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入引导", new d30() { // from class: l.o1z
            public final void call() {
                CoreModule.c.f0.jh(fczVar.r3());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m20850J0() {
        CoreModule.c.s1.V.put("");
        CoreModule.c.s1.U.put(0);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m20851J1(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationJ3.additional.loveLetter.owner = ((DbObject) fczVar.W5()).id;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m20856L0(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationJ3.additional.loveLetter.owner = fczVar.c;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m20858M(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationJ3.additional.loveLetter.owner = fczVar.c;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m20859M0() {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m20864O(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入聊天页引导", new d30() { // from class: l.l1z
            public final void call() {
                CoreModule.c.f0.lh(fczVar.r3());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m20866O1(fcz fczVar, Message message) {
        message.owner = ((DbObject) fczVar.W5()).id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "replied";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m20871Q0(int i, fcz fczVar, Object obj) {
        int i2 = f17775f % i;
        if (i2 == 0) {
            fczVar.e0().A0().g0().n0();
        } else if (i2 == i - 1) {
            fczVar.e0().A0().g0().o0();
        }
        f17775f++;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m20874R0() {
        ConversationCounterTypeSp.LoveLetterGuideShowTime.clear();
        ConversationCounterTypeSp.LoveLetterGuideShowCount.clear();
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m20878S1(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"local_ideal_enquiry"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("local_ideal_enquiry"), new e30() { // from class: l.gxy
            public final void call(Object obj) {
                q2z.m20964q(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m20883U0(fcz fczVar) {
        lsi0.j("刷新一次");
        fczVar.t7().j0().m19181y();
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m20885V(fcz fczVar) {
        Prologue prologueNew_ = Prologue.new_();
        prologueNew_.value = "哈喽，我在互联网工作，喜欢运动，你平时习惯干些什么呢？";
        fczVar.t7().l5(vwb.f0(new Prologue[]{prologueNew_}), "");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m20886V0() {
        f17770a = false;
        f17771b = false;
        f17772c = true;
        f17773d = false;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m20887V1(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = fczVar.c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("replied");
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m20892X0(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"love_letter"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("love_letter"), new e30() { // from class: l.vwy
            public final void call(Object obj) {
                q2z.m20980u(fczVar, (Message) obj);
            }
        });
        e51.y(new Runnable() { // from class: l.wwy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.fyy
                    public final void call() {
                        q2z.m20929h0(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m20893X1(fcz fczVar, Message message) {
        message.owner = fczVar.c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "replied";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m20901a0(fcz fczVar) {
        CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
        coreGiftInfo.dynamicGift = true;
        ((DbObject) coreGiftInfo).id = "love_letter_guide";
        coreGiftInfo.dynamicURL = "https://auto.tancdn.com/v1/raw/b85c8506-c4f2-4c1e-b58a-d190831361e514.zip";
        coreGiftInfo.dynamicMD5 = "75e0a50d8f7865f421315e24a56d0573";
        coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
        coreGiftInfo.url = "https://auto.tancdn.com/v1/raw/905dfc67-da0a-4ec5-8ade-1192b8efd6ef12.svga";
        qhe.b().f(coreGiftInfo);
        fczVar.t7().k1.w(coreGiftInfo, new d30() { // from class: l.ixy
            public final void call() {
                q2z.m20859M0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m20902a1(fcz fczVar) {
        VEditText bar_center_text = fczVar.e0().A0().g0().t0().getBar_center_text();
        bar_center_text.clearFocus();
        bar_center_text.setFocusableInTouchMode(false);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m20903a2(fcz fczVar) {
        hpd0 hpd0VarM25083Ug;
        if (!(fczVar instanceof wmz) || (hpd0VarM25083Ug = ((wmz) fczVar).m25083Ug()) == null) {
            return;
        }
        hpd0VarM25083Ug.clear();
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m20907b2(String str, e30 e30Var) {
        ChatHeat chatHeatQuery = CoreModule.k.s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            ((DbObject) chatHeatQuery).id = str;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(chatHeatQuery);
        }
        CoreModule.k.s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20908c(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入自己的风险提示", new C0767e(fczVar)));
        arrayList.add(vwb.Y("插入别人的风险提醒", new C0768f(fczVar)));
        arrayList.add(vwb.Y("插入自己的侵犯提示", new C0769g(fczVar)));
        arrayList.add(vwb.Y("插入别人的侵犯提醒", new C0770h(fczVar)));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m20911c2(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("设置或者还原心动类型：" + fczVar.j3().isHeartbeatConv(), new d30() { // from class: l.i1z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.jwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m20829C2(fczVar3.j3(), !fczVar3.j3().isHeartbeatConv(), false, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.Y("设置成男性或者女性:" + fczVar.j3().additional.heartbeatMatch.isPassive, new d30() { // from class: l.j1z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.vxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m20829C2(fczVar3.j3(), fczVar3.j3().isHeartbeatConv(), !fczVar3.j3().additional.heartbeatMatch.isPassive, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.Y("设置成2分钟有效期 :" + fczVar.j3().additional.heartbeatMatch.isPassive, new d30() { // from class: l.k1z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.bxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m20829C2(fczVar3.j3(), fczVar3.j3().isHeartbeatConv(), fczVar3.j3().additional.heartbeatMatch.isPassive, 0L);
                    }
                }, 1000L);
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20912d() {
        f17770a = true;
        f17771b = false;
        f17772c = false;
        f17773d = false;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m20917e0() {
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.e();
        loveLetterEntryInfo.count = 0;
        CoreModule.c.e0.U1.onNext(loveLetterEntryInfo);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m20918e1(fcz fczVar, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        CoreModule.c.u2.V.put(Long.valueOf(mqi0.o()));
        CoreModule.c.u2.W.a(1);
        CoreModule.c.f0.nh(fczVar.c, questionnaire);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m20921f0(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"love_letter"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("love_letter"), new e30() { // from class: l.gwy
            public final void call(Object obj) {
                q2z.m20952n(fczVar, (Message) obj);
            }
        });
        e51.y(new Runnable() { // from class: l.hwy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.nyy
                    public final void call() {
                        q2z.m20946l1(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m20922f1(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = ((DbObject) fczVar.W5()).id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m20923f2(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m20926g1(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"love_letter"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("love_letter"), new e30() { // from class: l.cxy
            public final void call(Object obj) {
                q2z.m20968r(fczVar, (Message) obj);
            }
        });
        e51.y(new Runnable() { // from class: l.dxy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.gyy
                    public final void call() {
                        q2z.m20856L0(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m20927g2(fcz fczVar) {
        Conversation conversationMo = CoreModule.c.f0.Mo(fczVar.i3());
        conversationMo.additional.game = ConversationGame.new_();
        ConversationGame conversationGame = conversationMo.additional.game;
        conversationGame.gameText = "新游戏";
        conversationGame.gameUnread = 10;
        conversationGame.gameTextColor = "#33b5e5";
        conversationGame.gameName = "wooden-fish";
        conversationMo.localEverHasMessage = true;
        CoreModule.c.f0.mq(conversationMo);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m20929h0(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationJ3.additional.loveLetter.owner = fczVar.c;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m20930h1() {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m20933i0(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"love_letter"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("love_letter"), new e30() { // from class: l.exy
            public final void call(Object obj) {
                q2z.m20922f1(fczVar, (Message) obj);
            }
        });
        e51.y(new Runnable() { // from class: l.fxy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.cyy
                    public final void call() {
                        q2z.m20942k1(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m20936j(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入体验问卷消息", new d30() { // from class: l.lwy
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.c.u2.c3(QuestionnaireScene.get("messageDetail"), (QuestionnaireStrategy) null)).subscribe(mkd0.H(new e30() { // from class: l.lyy
                    public final void call(Object obj) {
                        q2z.m20918e1(fczVar2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.myy
                    public final void call(Object obj) {
                        q2z.m20923f2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("删除体验问卷消息", new d30() { // from class: l.mwy
            public final void call() {
                q2z.m20996y(fczVar);
            }
        }));
        arrayList.add(vwb.Y("清除体验问卷该会话显示记录", new d30() { // from class: l.nwy
            public final void call() {
                q2z.m20903a2(fczVar);
            }
        }));
        StringBuilder sb = new StringBuilder("体验问卷轮数=");
        sb.append(fczVar instanceof wmz ? ((wmz) fczVar).m25079Tg() : 0);
        arrayList.add(vwb.Y(sb.toString(), new d30() { // from class: l.owy
            public final void call() {
                q2z.m20930h1();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m20937j0(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.unreadMessages = 1;
        conversationClone.convType = "heartbeatMatch";
        HeartbeatMatch heartbeatMatch = conversationClone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = true;
        heartbeatMatch.expireTime = mqi0.o() + 60000;
        conversationClone.additional.heartbeatMatch.acceptTime = mqi0.o() - 3600000;
        HeartbeatMatch heartbeatMatch2 = conversationClone.additional.heartbeatMatch;
        heartbeatMatch2.matchType = 1;
        heartbeatMatch2.greetEmoji = "[嘿哈]";
        heartbeatMatch2.greetText = "你好";
        CoreModule.k.m.upsert(conversationClone);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m20940k(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("不良信息弹框", new d30() { // from class: l.r1z
            public final void call() {
                fczVar.e0().A0().q2(new SpannableStringBuilder("约吗"), (List) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog1", new d30() { // from class: l.c2z
            public final void call() {
                w3z.M(fczVar.act());
            }
        }));
        arrayList.add(vwb.Y("Dialog2", new d30() { // from class: l.d2z
            public final void call() {
                w3z.L(fczVar.act(), "哈哈哈哈");
            }
        }));
        arrayList.add(vwb.Y("Dialog3", new d30() { // from class: l.e2z
            public final void call() {
                w3z.K(fczVar.act(), false, "大咕咕咕鸡", (Runnable) null, (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog4", new d30() { // from class: l.f2z
            public final void call() {
                w3z.C(fczVar.act(), "大大咕咕鸡", (Runnable) null, (Runnable) null, (cwf0) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog5", new d30() { // from class: l.g2z
            public final void call() {
                w3z.E(fczVar.act(), "移出群成员", (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog6", new d30() { // from class: l.h2z
            public final void call() {
                w3z.z(fczVar.act(), (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog7", new d30() { // from class: l.i2z
            public final void call() {
                w3z.G(fczVar.act(), "闪聊提示", (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog8", new d30() { // from class: l.j2z
            public final void call() {
                w3z.N(fczVar.act());
            }
        }));
        arrayList.add(vwb.Y("Dialog9", new d30() { // from class: l.k2z
            public final void call() {
                w3z.x(fczVar.act(), (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog10", new d30() { // from class: l.s1z
            public final void call() {
                w3z.I(fczVar.act());
            }
        }));
        arrayList.add(vwb.Y("Dialog11", new d30() { // from class: l.t1z
            public final void call() {
                w3z.H(fczVar.act(), (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog12", new d30() { // from class: l.u1z
            public final void call() {
                w3z.B(fczVar.act(), (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog13", new d30() { // from class: l.v1z
            public final void call() {
                w3z.J(fczVar.act());
            }
        }));
        arrayList.add(vwb.Y("Dialog14", new d30() { // from class: l.w1z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.c.Z.T.k()).subscribe(mkd0.G(new e30() { // from class: l.kwy
                    public final void call(Object obj) {
                        q2z.m21001z0(fczVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("Dialog15", new d30() { // from class: l.x1z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.c.Z.T.k()).subscribe(mkd0.G(new e30() { // from class: l.fwy
                    public final void call(Object obj) {
                        q2z.m21000z(fczVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("Dialog16", new d30() { // from class: l.y1z
            public final void call() {
                w3z.D(fczVar.act(), (Runnable) null, (Runnable) null);
            }
        }));
        arrayList.add(vwb.Y("Dialog17", new d30() { // from class: l.z1z
            public final void call() {
                w3z.F(fczVar.act(), CoreModule.c.e0.p9());
            }
        }));
        arrayList.add(vwb.Y("Dialog18", new d30() { // from class: l.b2z
            public final void call() {
                w3z.y(fczVar.act());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m20942k1(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationJ3.additional.loveLetter.owner = ((DbObject) fczVar.W5()).id;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m20943k2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("插入Ai权限邀请", new d30() { // from class: l.nzy
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.c.f0.ch(fczVar2.c, MessageType.get("ai_picture_query_auth"), new e30() { // from class: l.iwy
                    public final void call(Object obj) {
                        ((Message) obj).owner = fczVar2.c;
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m20945l0(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入标签引导", new d30() { // from class: l.h0z
            public final void call() {
                CoreModule.c.f0.dh(fczVar.r3(), MessageType.get("local_add_tags_guide"));
            }
        }));
        arrayList.add(vwb.Y("插入书影剧引导", new d30() { // from class: l.j0z
            public final void call() {
                CoreModule.c.f0.dh(fczVar.r3(), MessageType.get("local_add_artwork_guide"));
            }
        }));
        arrayList.add(vwb.Y("插入发送标签文案后的提示", new d30() { // from class: l.k0z
            public final void call() {
                CoreModule.c.f0.dh(fczVar.r3(), MessageType.get("local_send_tags_text"));
            }
        }));
        arrayList.add(vwb.Y("插入发送书影剧文案后的提示", new d30() { // from class: l.l0z
            public final void call() {
                CoreModule.c.f0.dh(fczVar.r3(), MessageType.get("local_send_artwork_text"));
            }
        }));
        arrayList.add(vwb.Y("书影剧引导一天限制重置", new d30() { // from class: l.m0z
            public final void call() {
                q2z.m20850J0();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m20946l1(fcz fczVar) {
        Conversation conversationJ3 = fczVar.j3();
        conversationJ3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationJ3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationJ3.additional.loveLetter.owner = ((DbObject) fczVar.W5()).id;
        CoreModule.c.f0.mq(conversationJ3);
    }

    /* JADX INFO: renamed from: l2 */
    public static void m20947l2(Act act, final fcz fczVar) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewInflate = o7r.a(act).inflate(l6c0.u1, viewGroup, false);
        viewGroup.addView(viewInflate);
        Button button = (Button) viewInflate.findViewById(y4c0.Q3);
        Button button2 = (Button) viewInflate.findViewById(y4c0.z);
        Button button3 = (Button) viewInflate.findViewById(y4c0.c4);
        Button button4 = (Button) viewInflate.findViewById(y4c0.z4);
        Button button5 = (Button) viewInflate.findViewById(y4c0.X3);
        Button button6 = (Button) viewInflate.findViewById(y4c0.Z3);
        Button button7 = (Button) viewInflate.findViewById(y4c0.a4);
        Button button8 = (Button) viewInflate.findViewById(y4c0.Y3);
        xdl0.E0(button7, new View.OnClickListener() { // from class: l.kxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo26d();
            }
        });
        xdl0.E0(button8, new View.OnClickListener() { // from class: l.mxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo35v();
            }
        });
        xdl0.E0(button5, new View.OnClickListener() { // from class: l.nxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo23A();
            }
        });
        xdl0.E0(button6, new View.OnClickListener() { // from class: l.oxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo33s();
            }
        });
        xdl0.E0(button, new View.OnClickListener() { // from class: l.pxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().j0().m19181y();
            }
        });
        xdl0.E0(button2, new View.OnClickListener() { // from class: l.qxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo27e();
            }
        });
        xdl0.E0(button3, new View.OnClickListener() { // from class: l.rxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q2z.m20841G0(fczVar, view);
            }
        });
        xdl0.E0(button4, new View.OnClickListener() { // from class: l.sxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.t7().n1.mo29l();
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m20949m0() {
    }

    /* JADX INFO: renamed from: m2 */
    public static void m20951m2(boolean z, String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("harass_alert");
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = z ? CoreModule.H().userId() : str;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.harassAlertInfo = HarassAlertInfo.new_();
        HarassAlertInfo harassAlertInfo = messageNew_.additionalData.harassAlertInfo;
        harassAlertInfo.status = "default";
        harassAlertInfo.triggeredMsgID = "111111";
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = str;
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.value = "您发送的内容涉嫌违反<a href = \"tantan://webview?url=http://lp.tantanapp.com/rule_zh_cn/ \">《探探行为规范》。 </a>请协助遵守平台规定和社交礼仪，感谢您的理解和支持\n";
        CoreModule.c.f0.Zg(messageNew_);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m20952n(fcz fczVar, Message message) {
        message.owner = ((DbObject) fczVar.W5()).id;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m20953n0(String str, int i) {
        ChatHeat chatHeatQuery = CoreModule.k.s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            ((DbObject) chatHeatQuery).id = str;
        }
        chatHeatQuery.exclusiveChatInviteTime = mqi0.o() - 600000;
        chatHeatQuery.exclusiveChatInviteExpireTime = mqi0.o();
        chatHeatQuery.exclusiveChatStartTime = mqi0.o();
        chatHeatQuery.exclusiveChatEndTime = mqi0.o() + (((long) i) * 60000);
        CoreModule.k.s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: n2 */
    public static void m20955n2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("查询理想型问询", new d30() { // from class: l.n0z
            public final void call() {
                q2z.m20878S1(fczVar);
            }
        }));
        arrayList.add(vwb.Y("清空理想型数据", new d30() { // from class: l.o0z
            public final void call() {
                ConversationCounterTypeSp.IdealGuideMsg.clear();
            }
        }));
        arrayList.add(vwb.Y("开场白", new d30() { // from class: l.p0z
            public final void call() {
                q2z.m20885V(fczVar);
            }
        }));
        arrayList.add(vwb.Y("清除开场白展示次数", new d30() { // from class: l.q0z
            public final void call() {
                q2z.m20840G();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m20956o(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.k.s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            ((DbObject) chatHeatQuery).id = str;
        }
        chatHeatQuery.levelUp = z;
        CoreModule.k.s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m20958o1(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入我发起的邀请已经接受", new d30() { // from class: l.r0z
            public final void call() {
                q2z.m20975s2(fczVar, true, true);
            }
        }));
        arrayList.add(vwb.Y("插入对方发起的邀请已经接受", new d30() { // from class: l.s0z
            public final void call() {
                q2z.m20975s2(fczVar, false, true);
            }
        }));
        arrayList.add(vwb.Y("插入我发起的邀请未接受", new d30() { // from class: l.u0z
            public final void call() {
                q2z.m20975s2(fczVar, true, false);
            }
        }));
        arrayList.add(vwb.Y("插入对方发起的邀请未接受", new d30() { // from class: l.v0z
            public final void call() {
                q2z.m20975s2(fczVar, false, false);
            }
        }));
        arrayList.add(vwb.Y("开启专属提醒", new d30() { // from class: l.w0z
            public final void call() {
                q2z.m20991w2(fczVar.r3(), true);
            }
        }));
        arrayList.add(vwb.Y("关闭专属提醒", new d30() { // from class: l.x0z
            public final void call() {
                q2z.m20991w2(fczVar.r3(), false);
            }
        }));
        arrayList.add(vwb.Y("开始专属聊天", new d30() { // from class: l.y0z
            public final void call() {
                fcz fczVar2 = fczVar;
                i0e.d(fczVar2.act()).D(10).r("输入时间").F(new e30() { // from class: l.uxy
                    public final void call(Object obj) {
                        q2z.m20821A2(fczVar2.r3(), Integer.parseInt((String) obj));
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("开始升温动画", new d30() { // from class: l.z0z
            public final void call() {
                q2z.m20825B2(fczVar.r3(), true);
            }
        }));
        arrayList.add(vwb.Y("关闭升温动画", new d30() { // from class: l.a1z
            public final void call() {
                q2z.m20825B2(fczVar.r3(), false);
            }
        }));
        arrayList.add(vwb.Y("设置深度", new d30() { // from class: l.b1z
            public final void call() {
                fcz fczVar2 = fczVar;
                i0e.d(fczVar2.act()).D(10).r("输入深度").F(new e30() { // from class: l.ywy
                    public final void call(Object obj) {
                        q2z.m21003z2(fczVar2.r3(), new e30() { // from class: l.iyy
                            public final void call(Object obj2) {
                                ((ChatHeat) obj2).degree = Double.parseDouble(str);
                            }
                        });
                    }
                }).n().show();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o2 */
    public static void m20959o2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("引导认证-邀请-插入", new d30() { // from class: l.d1z
            public final void call() {
                CoreModule.c.f0.dh(fczVar.c, MessageType.get("local_invitation_for_authentication"));
            }
        }));
        arrayList.add(vwb.Y("引导认证-邀请-删除", new d30() { // from class: l.f1z
            public final void call() {
                CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"local_invitation_for_authentication"}));
            }
        }));
        arrayList.add(vwb.Y("引导认证-去认证-插入", new d30() { // from class: l.g1z
            public final void call() {
                CoreModule.c.f0.ch(fczVar.c, MessageType.get("common_tip_box_v2"), new q2z.C0766d());
            }
        }));
        arrayList.add(vwb.Y("引导认证-去认证-删除", new d30() { // from class: l.h1z
            public final void call() {
                CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"common_tip_box_v2"}));
            }
        }));
    }

    /* JADX INFO: renamed from: p2 */
    public static void m20963p2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("情书引导", new d30() { // from class: l.ozy
            public final void call() {
                q2z.m20974s1(fczVar);
            }
        }));
        arrayList.add(vwb.Y("插入情书消息_对方-未拆", new d30() { // from class: l.vzy
            public final void call() {
                q2z.m20926g1(fczVar);
            }
        }));
        arrayList.add(vwb.Y("插入情书消息_我方-未拆", new d30() { // from class: l.wzy
            public final void call() {
                q2z.m20921f0(fczVar);
            }
        }));
        arrayList.add(vwb.Y("插入情书消息_对方-已拆", new d30() { // from class: l.yzy
            public final void call() {
                q2z.m20892X0(fczVar);
            }
        }));
        arrayList.add(vwb.Y("插入情书消息_我方-已拆", new d30() { // from class: l.zzy
            public final void call() {
                q2z.m20933i0(fczVar);
            }
        }));
        arrayList.add(vwb.Y("情书更新Conversation_我方-已拆", new d30() { // from class: l.a0z
            public final void call() {
                e51.y(new Runnable() { // from class: l.zwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.U.a(new d30() { // from class: l.byy
                            public final void call() {
                                q2z.m20851J1(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("情书更新Conversation_对方-已拆", new d30() { // from class: l.b0z
            public final void call() {
                e51.y(new Runnable() { // from class: l.yxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.U.a(new d30() { // from class: l.pyy
                            public final void call() {
                                q2z.m20858M(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("插入情书消息_已回复", new d30() { // from class: l.c0z
            public final void call() {
                q2z.m20824B1(fczVar);
            }
        }));
        arrayList.add(vwb.Y("情书引导动画", new d30() { // from class: l.d0z
            public final void call() {
                q2z.m20901a0(fczVar);
            }
        }));
        arrayList.add(vwb.Y("情书认证", new d30() { // from class: l.e0z
            public final void call() {
                CoreModule.P().a().J5(fczVar.act(), new d30() { // from class: l.rwy
                    public final void call() {
                        q2z.m20949m0();
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("情书模拟刷新入口", new d30() { // from class: l.pzy
            public final void call() {
                q2z.m20917e0();
            }
        }));
        arrayList.add(vwb.Y("清空情书数据", new d30() { // from class: l.qzy
            public final void call() {
                q2z.m20874R0();
            }
        }));
        arrayList.add(vwb.Y("插入交换答案-自己-对方未回复", new d30() { // from class: l.rzy
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.c.f0.ch(fczVar2.c, MessageType.get("icebreak_qa"), new e30() { // from class: l.hxy
                    public final void call(Object obj) {
                        q2z.m20837F(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("插入交换答案-自己-对方已回复", new d30() { // from class: l.szy
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.c.f0.ch(fczVar2.c, MessageType.get("icebreak_qa"), new e30() { // from class: l.txy
                    public final void call(Object obj) {
                        q2z.m20866O1(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("插入交换答案-对方-自己未回答", new d30() { // from class: l.tzy
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.c.f0.ch(fczVar2.c, MessageType.get("icebreak_qa"), new e30() { // from class: l.swy
                    public final void call(Object obj) {
                        q2z.m20819A0(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("插入交换答案-对方-自己已回答", new d30() { // from class: l.uzy
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.c.f0.ch(fczVar2.c, MessageType.get("icebreak_qa"), new e30() { // from class: l.xxy
                    public final void call(Object obj) {
                        q2z.m20893X1(fczVar2, (Message) obj);
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m20964q(fcz fczVar, Message message) {
        message.owner = fczVar.c;
        try {
            message.localExtraInfo = ((IdealInfo) IdealInfo.JSON_ADAPTER.parse("{\"fitIdeals\":[{\"id\":1,\"name\":\"性格好\"},{\"id\":2,\"name\":\"哈哈哈\"},{\"id\":3,\"name\":\"爱粘人\"},{\"id\":4,\"name\":\"身材好\"},{\"id\":5,\"name\":\"爱睡觉\"},{\"id\":6,\"name\":\"大胃王\"}],\"fitIdealDetails\":[{\"id\":1,\"name\":\"180cm\"},{\"id\":1,\"name\":\"人间温柔\"}],\"highlightProfiles\":{\"profile\":[\"height\",\"university\"],\"tags\":[{\"id\":1,\"name\":\"人间温柔\"},{\"id\":1,\"name\":\"人间温柔\"}]},\"highlightIdeals\":[{\"id\":1,\"name\":\"性格好\"}],\"targetFitIdeals\":[{\"id\":1,\"name\":\"性格好\"}]}")).toJson();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m20966q1(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入发送方消息提醒", new C0771i(fczVar)));
        arrayList.add(vwb.Y("插入接受方消息提醒", new C0772j(fczVar)));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m20967q2(boolean z, String str, Message message) {
        if (message.extData == null) {
            message.extData = MessageExtData.new_();
        }
        ChatTips chatTipsNew_ = ChatTips.new_();
        message.extData.chatTips = chatTipsNew_;
        if (z) {
            MessageTipsContent messageTipsContentNew_ = MessageTipsContent.new_();
            chatTipsNew_.selfShown = messageTipsContentNew_;
            messageTipsContentNew_.value = "注意：检测到对方可能使用其他渠道诈骗，广告等不良行为，请勿轻信。你可在右上角解除配对并<a href = \"tantan://msgReport?uid=" + str + "&conType=hitModelMessage&value=severeAd\">匿名举报</a>。";
        } else {
            MessageTipsContent messageTipsContentNew_2 = MessageTipsContent.new_();
            chatTipsNew_.otherShown = messageTipsContentNew_2;
            messageTipsContentNew_2.value = "您发送的内容涉嫌违反<a href = \"tantan://webview?url=http://lp.tantanapp.com/rule_zh_cn/\">《探探行为规范》。 </a>请协助遵守平台规定和社交礼仪，感谢您的理解和支持\n";
        }
        CoreModule.c.f0.Zg(message);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m20968r(fcz fczVar, Message message) {
        message.owner = fczVar.c;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m20970r1() {
        f17770a = false;
        f17771b = false;
        f17772c = false;
        f17773d = false;
    }

    /* JADX INFO: renamed from: r2 */
    public static void m20971r2(final ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("风险提醒消息", new d30() { // from class: l.kzy
            public final void call() {
                q2z.m20908c(arrayList, fczVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m20973s0(Conversation conversation, boolean z, boolean z2, long j) {
        Conversation conversationClone = conversation.clone();
        conversationClone.convType = z ? "heartbeatMatch" : "default";
        HeartbeatMatch heartbeatMatch = conversationClone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = z2;
        if (j == -1) {
            heartbeatMatch.expireTime = mqi0.o() + 86400000;
        } else {
            heartbeatMatch.expireTime = mqi0.o() + 600000;
        }
        conversationClone.additional.heartbeatMatch.acceptTime = mqi0.o() - 3600000;
        CoreModule.k.m.upsert(conversationClone);
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m20974s1(final fcz fczVar) {
        CoreModule.c.f0.Qf(fczVar.c, vwb.f0(new String[]{"local_love_letter_guide"}));
        CoreModule.c.f0.ch(fczVar.c, MessageType.get("local_love_letter_guide"), new e30() { // from class: l.xwy
            public final void call(Object obj) {
                q2z.m20985v0(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public static void m20975s2(final fcz fczVar, final boolean z, final boolean z2) {
        e51.H(fczVar.act(), new Runnable() { // from class: l.uwy
            @Override // java.lang.Runnable
            public final void run() {
                e51.y(new Runnable() { // from class: l.oyy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.U.a(new d30() { // from class: l.vyy
                            public final void call() {
                                q2z.m20989w0(fczVar, z, z);
                            }
                        });
                    }
                });
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m20976t() {
        f17770a = false;
        f17771b = true;
        f17772c = false;
        f17773d = false;
    }

    /* JADX INFO: renamed from: t2 */
    public static void m20979t2(final ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.Y("体验问卷", new d30() { // from class: l.q1z
            public final void call() {
                q2z.m20936j(arrayList, fczVar);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m20980u(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong \n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n";
        message.owner = fczVar.c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: u2 */
    public static ArrayList<j760<String, d30>> m20983u2(final fcz fczVar) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.Y("list layout", new d30() { // from class: l.ewy
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.m1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        fczVar2.t7().n1.mo34u();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("清空焦点", new d30() { // from class: l.axy
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.c1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2z.m20902a1(fczVar2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("强制开始关闭语音气泡：" + guy.w, new d30() { // from class: l.czy
            public final void call() {
                guy.w = !guy.w;
            }
        }));
        arrayList.add(vwb.Y("展示认证气泡：", new d30() { // from class: l.dzy
            public final void call() {
                fczVar.t7().p5(CoreModule.c.e0.p9());
            }
        }));
        arrayList.add(vwb.Y("清除通知提示：", new d30() { // from class: l.ezy
            public final void call() {
                q2z.m20970r1();
            }
        }));
        arrayList.add(vwb.Y("打开通知提示1：", new d30() { // from class: l.fzy
            public final void call() {
                q2z.m20912d();
            }
        }));
        arrayList.add(vwb.Y("打开通知提示2：", new d30() { // from class: l.gzy
            public final void call() {
                q2z.m20976t();
            }
        }));
        arrayList.add(vwb.Y("打开通知提示3：", new d30() { // from class: l.hzy
            public final void call() {
                q2z.m20886V0();
            }
        }));
        arrayList.add(vwb.Y("打开通知提示4：", new d30() { // from class: l.izy
            public final void call() {
                q2z.m20997y0();
            }
        }));
        arrayList.add(vwb.Y("连续发送语音20X1500", new d30() { // from class: l.jzy
            public final void call() {
                q2z.m20995x2(fczVar, 20, 1500L);
            }
        }));
        arrayList.add(vwb.Y("连续发送语音40X1000", new d30() { // from class: l.bzy
            public final void call() {
                q2z.m20995x2(fczVar, 40, 1000L);
            }
        }));
        arrayList.add(vwb.Y("连续发送语音40X800", new d30() { // from class: l.mzy
            public final void call() {
                q2z.m20995x2(fczVar, 40, 800L);
            }
        }));
        arrayList.add(vwb.Y("连续发送语音40X800，快速放开", new d30() { // from class: l.xzy
            public final void call() {
                q2z.m20999y2(fczVar, 40, 200L, 5);
            }
        }));
        arrayList.add(vwb.Y("连续发送语音1X200，快速放开", new d30() { // from class: l.i0z
            public final void call() {
                q2z.m20999y2(fczVar, 1, 200L, 5);
            }
        }));
        arrayList.add(vwb.Y("连续发送语音2X200，快速放开", new d30() { // from class: l.t0z
            public final void call() {
                q2z.m20999y2(fczVar, 2, 200L, 5);
            }
        }));
        arrayList.add(vwb.Y("消息相关弹框", new d30() { // from class: l.e1z
            public final void call() {
                q2z.m20940k(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("心动信号相关", new d30() { // from class: l.p1z
            public final void call() {
                q2z.m20911c2(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("notify delay 5s", new d30() { // from class: l.a2z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.n1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2z.m20883U0(fczVar2);
                    }
                }, 2500L);
            }
        }));
        arrayList.add(vwb.Y("打开TantanList测试任务", new d30() { // from class: l.l2z
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.lzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m20947l2(fczVar3.act(), fczVar3);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.Y("打开游戏入口", new d30() { // from class: l.pwy
            public final void call() {
                q2z.m20831D0();
            }
        }));
        arrayList.add(vwb.Y("修改游戏信息", new d30() { // from class: l.lxy
            public final void call() {
                e51.y(new Runnable() { // from class: l.f0z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.U.a(new d30() { // from class: l.jxy
                            public final void call() {
                                q2z.m20927g2(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("清除游戏红点", new d30() { // from class: l.wxy
            public final void call() {
                CoreModule.c.e0.m3.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.Y("心动信号引导标签", new d30() { // from class: l.hyy
            public final void call() {
                q2z.m20864O(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("配对引导对话", new d30() { // from class: l.syy
            public final void call() {
                q2z.m20842G1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("升温", new d30() { // from class: l.xyy
            public final void call() {
                q2z.m20958o1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("引导添加标签及书影剧", new d30() { // from class: l.yyy
            public final void call() {
                q2z.m20945l0(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("状态代发", new d30() { // from class: l.zyy
            public final void call() {
                q2z.m20966q1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.Y("聊天助手", new d30() { // from class: l.azy
            public final void call() {
                q2z.m20830D(arrayList, fczVar);
            }
        }));
        m20971r2(arrayList, fczVar);
        m20943k2(arrayList, fczVar);
        m20955n2(arrayList, fczVar);
        m20979t2(arrayList, fczVar);
        m20963p2(arrayList, fczVar);
        m20959o2(arrayList, fczVar);
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m20985v0(fcz fczVar, Message message) {
        message.owner = fczVar.c;
        LoveLetterContent loveLetterContent = new LoveLetterContent();
        loveLetterContent.title = "写封情书给他吧";
        loveLetterContent.subTitle = "你们最近聊天频繁，写封情书表达你的心意";
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: v2 */
    public static String m20987v2() {
        Random random = new Random();
        try {
            return new String(new byte[]{Integer.valueOf(Math.abs(random.nextInt(39)) + 176).byteValue(), Integer.valueOf(Math.abs(random.nextInt(97)) + 161).byteValue()}, "GBK");
        } catch (Exception e) {
            CrashHelper.c(e);
            return "a";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m20989w0(fcz fczVar, boolean z, boolean z2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = fczVar.r3();
        tpd0 tpd0Var = App.i;
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.messageType = MessageType.get("exclusive_chat_invite");
        messageNew_.createdTime = mqi0.o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = z ? ((DbObject) CoreModule.c.e0.na()).id : fczVar.r3();
        messageNew_.recalled = Boolean.FALSE;
        MessageChatHeat messageChatHeatNew_ = MessageChatHeat.new_();
        messageNew_.additionalData = MessageAdditionalData.new_();
        messageChatHeatNew_.actorID = messageNew_.owner;
        messageChatHeatNew_.exclusiveChatInviteTime = mqi0.o();
        messageChatHeatNew_.exclusiveChatInviteExpireTime = mqi0.o() + 720000;
        messageChatHeatNew_.exclusiveChatDuration = 10;
        if (z2) {
            messageChatHeatNew_.exclusiveChatStartTime = mqi0.o();
            messageChatHeatNew_.exclusiveChatEndTime = mqi0.o() + 720000;
        }
        CoreModule.k.c.upsert(messageNew_);
    }

    /* JADX INFO: renamed from: w2 */
    public static void m20991w2(final String str, final boolean z) {
        e51.y(new Runnable() { // from class: l.twy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.eyy
                    public final void call() {
                        q2z.m21002z1(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public static void m20995x2(fcz fczVar, int i, long j) {
        m20999y2(fczVar, i, j, 2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m20996y(fcz fczVar) {
        CoreModule.c.f0.Pf(fczVar.c, "local_ux_questionnaire");
        CoreModule.c.f0.Pf(fczVar.c, "local_ux_questionnaire_tip");
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m20997y0() {
        f17770a = false;
        f17771b = false;
        f17772c = false;
        f17773d = true;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m20999y2(final fcz fczVar, int i, long j, final int i2) {
        f17775f = 0;
        fczVar.duringCreated(c.interval(j, TimeUnit.MILLISECONDS)).onBackpressureDrop().observeOn(jo0.a()).take(i * i2).subscribe(mkd0.G(new e30() { // from class: l.g0z
            public final void call(Object obj) {
                q2z.m20871Q0(i2, fczVar, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m21000z(fcz fczVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.J(coreData.userStickers)) ? UserSticker.new_() : (UserSticker) coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List list = userStickerNew_.favoriteStickers;
        if (vwb.J(list)) {
            return;
        }
        Sticker stickerS3 = CoreModule.c.Z.s3((String) list.get(0));
        if (stickerS3 != null) {
            w3z.w(fczVar.act(), stickerS3, (Runnable) null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m21001z0(fcz fczVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.J(coreData.userStickers)) ? UserSticker.new_() : (UserSticker) coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List list = userStickerNew_.favoriteStickers;
        if (vwb.J(list)) {
            return;
        }
        Sticker stickerS3 = CoreModule.c.Z.s3((String) list.get(0));
        if (stickerS3 != null) {
            w3z.A(fczVar.act(), stickerS3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m21002z1(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.k.s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            ((DbObject) chatHeatQuery).id = str;
        }
        chatHeatQuery.specialRemind = z;
        CoreModule.k.s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: z2 */
    public static void m21003z2(final String str, final e30<ChatHeat> e30Var) {
        e51.y(new Runnable() { // from class: l.ryy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.wyy
                    public final void call() {
                        q2z.m20907b2(str, e30Var);
                    }
                });
            }
        });
    }
}
