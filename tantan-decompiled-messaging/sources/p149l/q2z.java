package p149l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatGameInfo;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatTips;
import com.p046p1.mobile.putong.core.data.CommonTipBox;
import com.p046p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationGame;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import com.p046p1.mobile.putong.core.data.HarassAlertInfo;
import com.p046p1.mobile.putong.core.data.HeartbeatMatch;
import com.p046p1.mobile.putong.core.data.IceBreakingQA;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterContent;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageChatHeat;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireScene;
import com.p046p1.mobile.putong.core.data.StateData;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class q2z {

    /* JADX INFO: renamed from: a */
    public static boolean f152330a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f152331b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f152332c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f152333d = false;

    /* JADX INFO: renamed from: e */
    public static hpd0 f152334e = new hpd0("fake_debug_conv", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static int f152335f;

    /* JADX INFO: renamed from: l.q2z$a */
    public class C19401a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152336a;

        public C19401a(fcz fczVar) {
            this.f152336a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172719a(fcz fczVar) {
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query(fczVar.f96911c);
            conversationQuery.additional.heartbeatMatch.guideFakeToGood = true;
            CoreModule.f17553k.f91950m.upsert(conversationQuery);
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152336a;
            e51.m114774y(new Runnable() { // from class: l.o2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.p2z
                        @Override // p149l.d30
                        public final void call() {
                            q2z.C19401a.m172719a(fczVar);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$b */
    public class C19402b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152337a;

        public C19402b(fcz fczVar) {
            this.f152337a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172721a(fcz fczVar, Message message) {
            message.owner = fczVar.f96911c;
            message.value = "哈哈哈哈哈啊哈哈哈哈哈哈哈啊";
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152337a;
            e51.m114774y(new Runnable() { // from class: l.r2z
                @Override // java.lang.Runnable
                public final void run() {
                    fcz fczVar2 = fczVar;
                    CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.hide_for_fake_user), new e30() { // from class: l.s2z
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            q2z.C19402b.m172721a(fczVar2, (Message) obj);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$c */
    public class C19403c implements d30 {
        @Override // p149l.d30
        public void call() {
            hpd0 hpd0Var = q2z.f152334e;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: l.q2z$d */
    public class C19404d implements e30<Message> {
        @Override // p149l.e30
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
    public class C19405e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152338a;

        public C19405e(fcz fczVar) {
            this.f152338a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            List<Message> list = this.f152338a.f96928r.f153135a;
            q2z.m172682q2(true, this.f152338a.mo120828r3(), list.get(list.size() - 1).mo223809clone());
        }
    }

    /* JADX INFO: renamed from: l.q2z$f */
    public class C19406f implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152339a;

        public C19406f(fcz fczVar) {
            this.f152339a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            List<Message> list = this.f152339a.f96928r.f153135a;
            q2z.m172682q2(false, this.f152339a.mo120828r3(), list.get(list.size() - 1).mo223809clone());
        }
    }

    /* JADX INFO: renamed from: l.q2z$g */
    public class C19407g implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152340a;

        public C19407g(fcz fczVar) {
            this.f152340a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            q2z.m172666m2(true, this.f152340a.mo120828r3());
        }
    }

    /* JADX INFO: renamed from: l.q2z$h */
    public class C19408h implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152341a;

        public C19408h(fcz fczVar) {
            this.f152341a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            q2z.m172666m2(false, this.f152341a.mo120828r3());
        }
    }

    /* JADX INFO: renamed from: l.q2z$i */
    public class C19409i implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152342a;

        public C19409i(fcz fczVar) {
            this.f152342a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f152342a.mo120828r3();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
            messageNew_.createdTime = mqi0.m155944o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = CoreModule.f17545c.f19639e0.m169520na().f56011id;
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = CoreModule.m29932K().me_().m60124fp().url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            e51.m114774y(new Runnable() { // from class: l.m2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.n2z
                        @Override // p149l.d30
                        public final void call() {
                            CoreModule.f17553k.f91940c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$j */
    public class C19410j implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152343a;

        public C19410j(fcz fczVar) {
            this.f152343a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f152343a.mo120828r3();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
            messageNew_.createdTime = mqi0.m155944o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = this.f152343a.mo120828r3();
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = CoreModule.m29932K().me_().m60124fp().url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            e51.m114774y(new Runnable() { // from class: l.t2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.u2z
                        @Override // p149l.d30
                        public final void call() {
                            CoreModule.f17553k.f91940c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$k */
    public class C19411k implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152344a;

        public C19411k(fcz fczVar) {
            this.f152344a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172728a(fcz fczVar) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                ChatAssistantQuestion chatAssistantQuestionNew_ = ChatAssistantQuestion.new_();
                chatAssistantQuestionNew_.question = "如果可以用一半智商换10cm的身高，你愿意吗？";
                chatAssistantQuestionNew_.questionId = 123;
                arrayList.add(chatAssistantQuestionNew_);
            }
            CoreModule.f17545c.f19642f0.m32870Yg(fczVar.f96911c, arrayList);
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152344a;
            e51.m114774y(new Runnable() { // from class: l.v2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C19411k.m172728a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$l */
    public class C19412l implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152345a;

        public C19412l(fcz fczVar) {
            this.f152345a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
            messageNew_.cid = this.f152345a.f96911c;
            messageNew_.value = "她上次活跃在12小时前，可能不会立即回复，请稍候";
            messageNew_.localInConversation = true;
            long jM155944o = mqi0.m155944o();
            messageNew_.owner = CoreModule.m29931H().userId();
            messageNew_.createdTime = jM155944o;
            messageNew_.localCreatedTime = jM155944o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m29931H().userId();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
        }
    }

    /* JADX INFO: renamed from: l.q2z$m */
    public class C19413m implements d30 {
        @Override // p149l.d30
        public void call() {
            CoreModule.f17545c.f19639e0.f149194I5.clear();
            CoreModule.f17545c.f19639e0.f149201J5.clear();
            CoreModule.f17545c.f19639e0.f149208K5.clear();
        }
    }

    /* JADX INFO: renamed from: l.q2z$n */
    public class C19414n implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152346a;

        public C19414n(fcz fczVar) {
            this.f152346a = fczVar;
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152346a;
            e51.m114774y(new Runnable() { // from class: l.w2z
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19642f0.m32602Cf(fczVar.f96911c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$o */
    public class C19415o implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152347a;

        public C19415o(fcz fczVar) {
            this.f152347a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172730a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = fczVar.f96911c;
            messageNew_.localInConversation = true;
            long jM155944o = mqi0.m155944o();
            messageNew_.owner = CoreModule.m29931H().userId();
            messageNew_.createdTime = jM155944o;
            messageNew_.localCreatedTime = jM155944o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m29931H().userId();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "system";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152347a;
            e51.m114774y(new Runnable() { // from class: l.x2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C19415o.m172730a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$p */
    public class C19416p implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152348a;

        public C19416p(fcz fczVar) {
            this.f152348a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172731a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = fczVar.f96911c;
            messageNew_.localInConversation = true;
            long jM155944o = mqi0.m155944o();
            messageNew_.owner = CoreModule.m29931H().userId();
            messageNew_.createdTime = jM155944o;
            messageNew_.localCreatedTime = jM155944o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m29931H().userId();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "user";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152348a;
            e51.m114774y(new Runnable() { // from class: l.y2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C19416p.m172731a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.q2z$q */
    public class C19417q implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f152349a;

        public C19417q(fcz fczVar) {
            this.f152349a = fczVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m172732a(fcz fczVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = fczVar.f96911c;
            messageNew_.localInConversation = true;
            long jM155944o = mqi0.m155944o();
            messageNew_.owner = fczVar.mo120858x6().f56011id;
            messageNew_.createdTime = jM155944o;
            messageNew_.localCreatedTime = jM155944o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = fczVar.mo120858x6().f56011id;
            tpd0 tpd0Var = App.f15373i;
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
        }

        @Override // p149l.d30
        public void call() {
            final fcz fczVar = this.f152349a;
            e51.m114774y(new Runnable() { // from class: l.z2z
                @Override // java.lang.Runnable
                public final void run() {
                    q2z.C19417q.m172732a(fczVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m172534A0(fcz fczVar, Message message) {
        message.owner = fczVar.f96911c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: A2 */
    public static void m172536A2(final String str, final int i) {
        e51.m114774y(new Runnable() { // from class: l.kyy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.qyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172668n0(str, i);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m172539B1(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.love_letter));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.love_letter), new e30() { // from class: l.qwy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172602V1(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public static void m172540B2(final String str, final boolean z) {
        e51.m114774y(new Runnable() { // from class: l.zxy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.jyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172671o(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public static void m172544C2(final Conversation conversation, final boolean z, final boolean z2, final long j) {
        e51.m114774y(new Runnable() { // from class: l.ayy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.uyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172688s0(conversation, z, z, j);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m172545D(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入聊天助手新问题引导消息", new C19411k(fczVar)));
        arrayList.add(vwb.m200311Y("插入聊天-不能立即回复", new C19412l(fczVar)));
        arrayList.add(vwb.m200311Y("插入聊天-不能立即回复 清理数据", new C19413m()));
        arrayList.add(vwb.m200311Y("删除聊天助手新问题引导消息", new C19414n(fczVar)));
        arrayList.add(vwb.m200311Y("插入聊天助手问题消息-主态-代发", new C19415o(fczVar)));
        arrayList.add(vwb.m200311Y("插入聊天助手问题消息-主态", new C19416p(fczVar)));
        arrayList.add(vwb.m200311Y("插入聊天助手问题消息-客态", new C19417q(fczVar)));
        arrayList.add(vwb.m200311Y("成为阻塞配对", new C19401a(fczVar)));
        arrayList.add(vwb.m200311Y("插入阻塞消息", new C19402b(fczVar)));
        arrayList.add(vwb.m200311Y("fake conv Debug" + f152334e.get(), new C19403c()));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m172546D0() {
        ChatGameInfo chatGameInfoNew_ = ChatGameInfo.new_();
        chatGameInfoNew_.enable = true;
        chatGameInfoNew_.name = "wooden-fish";
        chatGameInfoNew_.icon = "https://static.tancdn.com/pe-webplatform/VKRa4WNsZMi1ArZrPBt_xziW.webp";
        chatGameInfoNew_.link = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/knockWoodenFish/index.html?speed=true&_bid=1003873&hideNavigationBar=1&hideNotch=1&unread=1&otherUserId";
        CoreModule.f17545c.f19642f0.m33076oq(chatGameInfoNew_);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m172548D2(final Conversation conversation) {
        e51.m114774y(new Runnable() { // from class: l.dyy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.tyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172652j0(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m172552F(fcz fczVar, Message message) {
        message.owner = fczVar.m120726W5().f56011id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m172555G() {
        CoreModule.f17545c.f19642f0.f19869J1.clear();
        CoreModule.f17545c.f19642f0.f19866I1.clear();
        CoreModule.f17545c.f19642f0.f19863H1.clear();
        CoreModule.f17545c.f19642f0.f19881N1.clear();
        CoreModule.f17545c.f19642f0.f19878M1.clear();
        CoreModule.f17545c.f19642f0.f19875L1.clear();
        CoreModule.f17545c.f19642f0.f19860G1.clear();
        CoreModule.f17545c.f19642f0.f19872K1.clear();
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.clear();
        ConversationCounterTypeSp.ProloguesEnterChatCount.clear();
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m172556G0(fcz fczVar, View view) {
        int iAbs = Math.abs(new Random().nextInt(30)) + 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iAbs; i++) {
            sb.append(m172702v2());
        }
        fczVar.m120708S6(sb.toString());
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m172557G1(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入引导", new d30() { // from class: l.o1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33002jh(fczVar.mo120828r3());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m172565J0() {
        CoreModule.f17545c.f19682s1.f20085V.put("");
        CoreModule.f17545c.f19682s1.f20084U.put(0);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m172566J1(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM120788j3.additional.loveLetter.owner = fczVar.m120726W5().f56011id;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m172571L0(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationM120788j3.additional.loveLetter.owner = fczVar.f96911c;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m172573M(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM120788j3.additional.loveLetter.owner = fczVar.f96911c;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m172574M0() {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m172579O(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入聊天页引导", new d30() { // from class: l.l1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33028lh(fczVar.mo120828r3());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m172581O1(fcz fczVar, Message message) {
        message.owner = fczVar.m120726W5().f56011id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = LoveLetterMessageState.replied;
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m172586Q0(int i, fcz fczVar, Object obj) {
        int i2 = f152335f % i;
        if (i2 == 0) {
            fczVar.m156455e0().mo48954A0().m156457g0().m128198n0();
        } else if (i2 == i - 1) {
            fczVar.m156455e0().mo48954A0().m156457g0().m128200o0();
        }
        f152335f++;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m172589R0() {
        ConversationCounterTypeSp.LoveLetterGuideShowTime.clear();
        ConversationCounterTypeSp.LoveLetterGuideShowCount.clear();
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m172593S1(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.local_ideal_enquiry));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.local_ideal_enquiry), new e30() { // from class: l.gxy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172679q(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m172598U0(fcz fczVar) {
        lsi0.m151580j("刷新一次");
        fczVar.m120842t7().m190310j0().m162104y();
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m172600V(fcz fczVar) {
        Prologue prologueNew_ = Prologue.new_();
        prologueNew_.value = "哈喽，我在互联网工作，喜欢运动，你平时习惯干些什么呢？";
        ((bpz) fczVar.m120842t7()).m103246l5(vwb.m200324f0(prologueNew_), "");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m172601V0() {
        f152330a = false;
        f152331b = false;
        f152332c = true;
        f152333d = false;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m172602V1(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = fczVar.f96911c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get(LoveLetterMessageState.replied);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m172607X0(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.love_letter));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.love_letter), new e30() { // from class: l.vwy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172695u(fczVar, (Message) obj);
            }
        });
        e51.m114774y(new Runnable() { // from class: l.wwy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.fyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172644h0(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m172608X1(fcz fczVar, Message message) {
        message.owner = fczVar.f96911c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = LoveLetterMessageState.replied;
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m172616a0(fcz fczVar) {
        CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
        coreGiftInfo.dynamicGift = true;
        coreGiftInfo.f56011id = "love_letter_guide";
        coreGiftInfo.dynamicURL = "https://auto.tancdn.com/v1/raw/b85c8506-c4f2-4c1e-b58a-d190831361e514.zip";
        coreGiftInfo.dynamicMD5 = "75e0a50d8f7865f421315e24a56d0573";
        coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
        coreGiftInfo.url = "https://auto.tancdn.com/v1/raw/905dfc67-da0a-4ec5-8ade-1192b8efd6ef12.svga";
        qhe.m174529b().m174534f(coreGiftInfo);
        fczVar.m120842t7().f171739k1.m45455w(coreGiftInfo, new d30() { // from class: l.ixy
            @Override // p149l.d30
            public final void call() {
                q2z.m172574M0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m172617a1(fcz fczVar) {
        MessageInputBaseEditView bar_center_text = fczVar.m156455e0().mo48954A0().m156457g0().m128210t0().getBar_center_text();
        bar_center_text.clearFocus();
        bar_center_text.setFocusableInTouchMode(false);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m172618a2(fcz fczVar) {
        hpd0 hpd0VarM204415Ug;
        if (!(fczVar instanceof wmz) || (hpd0VarM204415Ug = ((wmz) fczVar).m204415Ug()) == null) {
            return;
        }
        hpd0VarM204415Ug.clear();
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m172622b2(String str, e30 e30Var) {
        ChatHeat chatHeatQuery = CoreModule.f17553k.f91956s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56011id = str;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(chatHeatQuery);
        }
        CoreModule.f17553k.f91956s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m172623c(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入自己的风险提示", new C19405e(fczVar)));
        arrayList.add(vwb.m200311Y("插入别人的风险提醒", new C19406f(fczVar)));
        arrayList.add(vwb.m200311Y("插入自己的侵犯提示", new C19407g(fczVar)));
        arrayList.add(vwb.m200311Y("插入别人的侵犯提醒", new C19408h(fczVar)));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m172626c2(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("设置或者还原心动类型：" + fczVar.m120788j3().isHeartbeatConv(), new d30() { // from class: l.i1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.jwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m172544C2(fczVar3.m120788j3(), !fczVar3.m120788j3().isHeartbeatConv(), false, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("设置成男性或者女性:" + fczVar.m120788j3().additional.heartbeatMatch.isPassive, new d30() { // from class: l.j1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.vxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m172544C2(fczVar3.m120788j3(), fczVar3.m120788j3().isHeartbeatConv(), !fczVar3.m120788j3().additional.heartbeatMatch.isPassive, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("设置成2分钟有效期 :" + fczVar.m120788j3().additional.heartbeatMatch.isPassive, new d30() { // from class: l.k1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.bxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m172544C2(fczVar3.m120788j3(), fczVar3.m120788j3().isHeartbeatConv(), fczVar3.m120788j3().additional.heartbeatMatch.isPassive, 0L);
                    }
                }, 1000L);
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m172627d() {
        f152330a = true;
        f152331b = false;
        f152332c = false;
        f152333d = false;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m172632e0() {
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        loveLetterEntryInfoM221515e.count = 0;
        CoreModule.f17545c.f19639e0.f149279U1.m132487l(loveLetterEntryInfoM221515e);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m172633e1(fcz fczVar, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        CoreModule.f17545c.f19689u2.f175589V.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19689u2.f175590W.m189988a(1);
        CoreModule.f17545c.f19642f0.m33054nh(fczVar.f96911c, questionnaire);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m172636f0(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.love_letter));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.love_letter), new e30() { // from class: l.gwy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172667n(fczVar, (Message) obj);
            }
        });
        e51.m114774y(new Runnable() { // from class: l.hwy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.nyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172661l1(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m172637f1(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = fczVar.m120726W5().f56011id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m172638f2(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m172641g1(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.love_letter));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.love_letter), new e30() { // from class: l.cxy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172683r(fczVar, (Message) obj);
            }
        });
        e51.m114774y(new Runnable() { // from class: l.dxy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.gyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172571L0(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m172642g2(fcz fczVar) {
        Conversation conversationM32735Mo = CoreModule.f17545c.f19642f0.m32735Mo(fczVar.m120783i3());
        conversationM32735Mo.additional.game = ConversationGame.new_();
        ConversationGame conversationGame = conversationM32735Mo.additional.game;
        conversationGame.gameText = "新游戏";
        conversationGame.gameUnread = 10;
        conversationGame.gameTextColor = "#33b5e5";
        conversationGame.gameName = "wooden-fish";
        conversationM32735Mo.localEverHasMessage = true;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM32735Mo);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m172644h0(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM120788j3.additional.loveLetter.owner = fczVar.f96911c;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m172645h1() {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m172648i0(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.love_letter));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.love_letter), new e30() { // from class: l.exy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172637f1(fczVar, (Message) obj);
            }
        });
        e51.m114774y(new Runnable() { // from class: l.fxy
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.cyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172657k1(fczVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m172651j(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入体验问卷消息", new d30() { // from class: l.lwy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.f17545c.f19689u2.m192750c3(QuestionnaireScene.get(QuestionnaireScene.messageDetail), null)).subscribe(mkd0.m154956H(new e30() { // from class: l.lyy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172633e1(fczVar2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.myy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172638f2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("删除体验问卷消息", new d30() { // from class: l.mwy
            @Override // p149l.d30
            public final void call() {
                q2z.m172711y(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("清除体验问卷该会话显示记录", new d30() { // from class: l.nwy
            @Override // p149l.d30
            public final void call() {
                q2z.m172618a2(fczVar);
            }
        }));
        StringBuilder sb = new StringBuilder("体验问卷轮数=");
        sb.append(fczVar instanceof wmz ? ((wmz) fczVar).m204411Tg() : 0);
        arrayList.add(vwb.m200311Y(sb.toString(), new d30() { // from class: l.owy
            @Override // p149l.d30
            public final void call() {
                q2z.m172645h1();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m172652j0(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.unreadMessages = 1;
        conversationMo223809clone.convType = "heartbeatMatch";
        HeartbeatMatch heartbeatMatch = conversationMo223809clone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = true;
        heartbeatMatch.expireTime = mqi0.m155944o() + Constants.ONE_MIN_IN_MILLIS;
        conversationMo223809clone.additional.heartbeatMatch.acceptTime = mqi0.m155944o() - 3600000;
        HeartbeatMatch heartbeatMatch2 = conversationMo223809clone.additional.heartbeatMatch;
        heartbeatMatch2.matchType = 1;
        heartbeatMatch2.greetEmoji = "[嘿哈]";
        heartbeatMatch2.greetText = "你好";
        CoreModule.f17553k.f91950m.upsert(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m172655k(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("不良信息弹框", new d30() { // from class: l.r1z
            @Override // p149l.d30
            public final void call() {
                fczVar.m156455e0().mo48954A0().m210935q2(new SpannableStringBuilder("约吗"), null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog1", new d30() { // from class: l.c2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201407M(fczVar.act());
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog2", new d30() { // from class: l.d2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201406L(fczVar.act(), "哈哈哈哈");
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog3", new d30() { // from class: l.e2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201405K(fczVar.act(), false, "大咕咕咕鸡", null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog4", new d30() { // from class: l.f2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201397C(fczVar.act(), "大大咕咕鸡", null, null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog5", new d30() { // from class: l.g2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201399E(fczVar.act(), "移出群成员", null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog6", new d30() { // from class: l.h2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201434z(fczVar.act(), null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog7", new d30() { // from class: l.i2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201401G(fczVar.act(), "闪聊提示", null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog8", new d30() { // from class: l.j2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201408N(fczVar.act());
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog9", new d30() { // from class: l.k2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201432x(fczVar.act(), null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog10", new d30() { // from class: l.s1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201403I(fczVar.act());
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog11", new d30() { // from class: l.t1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201402H(fczVar.act(), null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog12", new d30() { // from class: l.u1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201396B(fczVar.act(), null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog13", new d30() { // from class: l.v1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201404J(fczVar.act());
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog14", new d30() { // from class: l.w1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.f17545c.f19624Z.f20143T.m121230k()).subscribe(mkd0.m154955G(new e30() { // from class: l.kwy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172716z0(fczVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog15", new d30() { // from class: l.x1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().duringCreated(CoreModule.f17545c.f19624Z.f20143T.m121230k()).subscribe(mkd0.m154955G(new e30() { // from class: l.fwy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172715z(fczVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog16", new d30() { // from class: l.y1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201398D(fczVar.act(), null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog17", new d30() { // from class: l.z1z
            @Override // p149l.d30
            public final void call() {
                w3z.m201400F(fczVar.act(), CoreModule.f17545c.f19639e0.m169527p9());
            }
        }));
        arrayList.add(vwb.m200311Y("Dialog18", new d30() { // from class: l.b2z
            @Override // p149l.d30
            public final void call() {
                w3z.m201433y(fczVar.act());
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m172657k1(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM120788j3.additional.loveLetter.owner = fczVar.m120726W5().f56011id;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m172658k2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("插入Ai权限邀请", new d30() { // from class: l.nzy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.ai_picture_query_auth), new e30() { // from class: l.iwy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((Message) obj).owner = fczVar2.f96911c;
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m172660l0(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入标签引导", new d30() { // from class: l.h0z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32930dh(fczVar.mo120828r3(), MessageType.get(MessageType.local_add_tags_guide));
            }
        }));
        arrayList.add(vwb.m200311Y("插入书影剧引导", new d30() { // from class: l.j0z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32930dh(fczVar.mo120828r3(), MessageType.get(MessageType.local_add_artwork_guide));
            }
        }));
        arrayList.add(vwb.m200311Y("插入发送标签文案后的提示", new d30() { // from class: l.k0z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32930dh(fczVar.mo120828r3(), MessageType.get(MessageType.local_send_tags_text));
            }
        }));
        arrayList.add(vwb.m200311Y("插入发送书影剧文案后的提示", new d30() { // from class: l.l0z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32930dh(fczVar.mo120828r3(), MessageType.get(MessageType.local_send_artwork_text));
            }
        }));
        arrayList.add(vwb.m200311Y("书影剧引导一天限制重置", new d30() { // from class: l.m0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172565J0();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m172661l1(fcz fczVar) {
        Conversation conversationM120788j3 = fczVar.m120788j3();
        conversationM120788j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM120788j3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationM120788j3.additional.loveLetter.owner = fczVar.m120726W5().f56011id;
        CoreModule.f17545c.f19642f0.m33050mq(conversationM120788j3);
    }

    /* JADX INFO: renamed from: l2 */
    public static void m172662l2(Act act, final fcz fczVar) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewInflate = o7r.m163037a(act).inflate(l6c0.f126573u1, viewGroup, false);
        viewGroup.addView(viewInflate);
        Button button = (Button) viewInflate.findViewById(y4c0.f196031Q3);
        Button button2 = (Button) viewInflate.findViewById(y4c0.f196262z);
        Button button3 = (Button) viewInflate.findViewById(y4c0.f196106c4);
        Button button4 = (Button) viewInflate.findViewById(y4c0.f196267z4);
        Button button5 = (Button) viewInflate.findViewById(y4c0.f196073X3);
        Button button6 = (Button) viewInflate.findViewById(y4c0.f196085Z3);
        Button button7 = (Button) viewInflate.findViewById(y4c0.f196092a4);
        Button button8 = (Button) viewInflate.findViewById(y4c0.f196079Y3);
        xdl0.m208329E0(button7, new View.OnClickListener() { // from class: l.kxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49612d();
            }
        });
        xdl0.m208329E0(button8, new View.OnClickListener() { // from class: l.mxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49621v();
            }
        });
        xdl0.m208329E0(button5, new View.OnClickListener() { // from class: l.nxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49609A();
            }
        });
        xdl0.m208329E0(button6, new View.OnClickListener() { // from class: l.oxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49619s();
            }
        });
        xdl0.m208329E0(button, new View.OnClickListener() { // from class: l.pxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().m190310j0().m162104y();
            }
        });
        xdl0.m208329E0(button2, new View.OnClickListener() { // from class: l.qxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49613e();
            }
        });
        xdl0.m208329E0(button3, new View.OnClickListener() { // from class: l.rxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q2z.m172556G0(fczVar, view);
            }
        });
        xdl0.m208329E0(button4, new View.OnClickListener() { // from class: l.sxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fczVar.m120842t7().f171745n1.mo49615l();
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m172664m0() {
    }

    /* JADX INFO: renamed from: m2 */
    public static void m172666m2(boolean z, String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.harass_alert);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = z ? CoreModule.m29931H().userId() : str;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.harassAlertInfo = HarassAlertInfo.new_();
        HarassAlertInfo harassAlertInfo = messageNew_.additionalData.harassAlertInfo;
        harassAlertInfo.status = "default";
        harassAlertInfo.triggeredMsgID = "111111";
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = str;
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.value = "您发送的内容涉嫌违反<a href = \"tantan://webview?url=http://lp.tantanapp.com/rule_zh_cn/ \">《探探行为规范》。 </a>请协助遵守平台规定和社交礼仪，感谢您的理解和支持\n";
        CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m172667n(fcz fczVar, Message message) {
        message.owner = fczVar.m120726W5().f56011id;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m172668n0(String str, int i) {
        ChatHeat chatHeatQuery = CoreModule.f17553k.f91956s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56011id = str;
        }
        chatHeatQuery.exclusiveChatInviteTime = mqi0.m155944o() - AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        chatHeatQuery.exclusiveChatInviteExpireTime = mqi0.m155944o();
        chatHeatQuery.exclusiveChatStartTime = mqi0.m155944o();
        chatHeatQuery.exclusiveChatEndTime = mqi0.m155944o() + (((long) i) * Constants.ONE_MIN_IN_MILLIS);
        CoreModule.f17553k.f91956s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: n2 */
    public static void m172670n2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("查询理想型问询", new d30() { // from class: l.n0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172593S1(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("清空理想型数据", new d30() { // from class: l.o0z
            @Override // p149l.d30
            public final void call() {
                ConversationCounterTypeSp.IdealGuideMsg.clear();
            }
        }));
        arrayList.add(vwb.m200311Y("开场白", new d30() { // from class: l.p0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172600V(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("清除开场白展示次数", new d30() { // from class: l.q0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172555G();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m172671o(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.f17553k.f91956s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56011id = str;
        }
        chatHeatQuery.levelUp = z;
        CoreModule.f17553k.f91956s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m172673o1(ArrayList arrayList, final fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入我发起的邀请已经接受", new d30() { // from class: l.r0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172690s2(fczVar, true, true);
            }
        }));
        arrayList.add(vwb.m200311Y("插入对方发起的邀请已经接受", new d30() { // from class: l.s0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172690s2(fczVar, false, true);
            }
        }));
        arrayList.add(vwb.m200311Y("插入我发起的邀请未接受", new d30() { // from class: l.u0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172690s2(fczVar, true, false);
            }
        }));
        arrayList.add(vwb.m200311Y("插入对方发起的邀请未接受", new d30() { // from class: l.v0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172690s2(fczVar, false, false);
            }
        }));
        arrayList.add(vwb.m200311Y("开启专属提醒", new d30() { // from class: l.w0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172706w2(fczVar.mo120828r3(), true);
            }
        }));
        arrayList.add(vwb.m200311Y("关闭专属提醒", new d30() { // from class: l.x0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172706w2(fczVar.mo120828r3(), false);
            }
        }));
        arrayList.add(vwb.m200311Y("开始专属聊天", new d30() { // from class: l.y0z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                i0e.m133795d(fczVar2.act()).m133814D(10).m133825r("输入时间").m133816F(new e30() { // from class: l.uxy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172536A2(fczVar2.mo120828r3(), Integer.parseInt((String) obj));
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("开始升温动画", new d30() { // from class: l.z0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172540B2(fczVar.mo120828r3(), true);
            }
        }));
        arrayList.add(vwb.m200311Y("关闭升温动画", new d30() { // from class: l.a1z
            @Override // p149l.d30
            public final void call() {
                q2z.m172540B2(fczVar.mo120828r3(), false);
            }
        }));
        arrayList.add(vwb.m200311Y("设置深度", new d30() { // from class: l.b1z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                i0e.m133795d(fczVar2.act()).m133814D(10).m133825r("输入深度").m133816F(new e30() { // from class: l.ywy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172718z2(fczVar2.mo120828r3(), new e30() { // from class: l.iyy
                            @Override // p149l.e30
                            public final void call(Object obj2) {
                                ((ChatHeat) obj2).degree = Double.parseDouble(str);
                            }
                        });
                    }
                }).m133821n().show();
            }
        }));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o2 */
    public static void m172674o2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("引导认证-邀请-插入", new d30() { // from class: l.d1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32930dh(fczVar.f96911c, MessageType.get(MessageType.local_invitation_for_authentication));
            }
        }));
        arrayList.add(vwb.m200311Y("引导认证-邀请-删除", new d30() { // from class: l.f1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.local_invitation_for_authentication));
            }
        }));
        arrayList.add(vwb.m200311Y("引导认证-去认证-插入", new d30() { // from class: l.g1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.common_tip_box_v2), new q2z.C19404d());
            }
        }));
        arrayList.add(vwb.m200311Y("引导认证-去认证-删除", new d30() { // from class: l.h1z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.common_tip_box_v2));
            }
        }));
    }

    /* JADX INFO: renamed from: p2 */
    public static void m172678p2(ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("情书引导", new d30() { // from class: l.ozy
            @Override // p149l.d30
            public final void call() {
                q2z.m172689s1(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("插入情书消息_对方-未拆", new d30() { // from class: l.vzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172641g1(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("插入情书消息_我方-未拆", new d30() { // from class: l.wzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172636f0(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("插入情书消息_对方-已拆", new d30() { // from class: l.yzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172607X0(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("插入情书消息_我方-已拆", new d30() { // from class: l.zzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172648i0(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("情书更新Conversation_我方-已拆", new d30() { // from class: l.a0z
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new Runnable() { // from class: l.zwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.byy
                            @Override // p149l.d30
                            public final void call() {
                                q2z.m172566J1(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("情书更新Conversation_对方-已拆", new d30() { // from class: l.b0z
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new Runnable() { // from class: l.yxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.pyy
                            @Override // p149l.d30
                            public final void call() {
                                q2z.m172573M(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("插入情书消息_已回复", new d30() { // from class: l.c0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172539B1(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("情书引导动画", new d30() { // from class: l.d0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172616a0(fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("情书认证", new d30() { // from class: l.e0z
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29935P().m94651a().mo158253J5(fczVar.act(), new d30() { // from class: l.rwy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172664m0();
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("情书模拟刷新入口", new d30() { // from class: l.pzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172632e0();
            }
        }));
        arrayList.add(vwb.m200311Y("清空情书数据", new d30() { // from class: l.qzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172589R0();
            }
        }));
        arrayList.add(vwb.m200311Y("插入交换答案-自己-对方未回复", new d30() { // from class: l.rzy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.icebreak_qa), new e30() { // from class: l.hxy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172552F(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("插入交换答案-自己-对方已回复", new d30() { // from class: l.szy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.icebreak_qa), new e30() { // from class: l.txy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172581O1(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("插入交换答案-对方-自己未回答", new d30() { // from class: l.tzy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.icebreak_qa), new e30() { // from class: l.swy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172534A0(fczVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("插入交换答案-对方-自己已回答", new d30() { // from class: l.uzy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                CoreModule.f17545c.f19642f0.m32918ch(fczVar2.f96911c, MessageType.get(MessageType.icebreak_qa), new e30() { // from class: l.xxy
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        q2z.m172608X1(fczVar2, (Message) obj);
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m172679q(fcz fczVar, Message message) {
        message.owner = fczVar.f96911c;
        try {
            message.localExtraInfo = IdealInfo.JSON_ADAPTER.parse("{\"fitIdeals\":[{\"id\":1,\"name\":\"性格好\"},{\"id\":2,\"name\":\"哈哈哈\"},{\"id\":3,\"name\":\"爱粘人\"},{\"id\":4,\"name\":\"身材好\"},{\"id\":5,\"name\":\"爱睡觉\"},{\"id\":6,\"name\":\"大胃王\"}],\"fitIdealDetails\":[{\"id\":1,\"name\":\"180cm\"},{\"id\":1,\"name\":\"人间温柔\"}],\"highlightProfiles\":{\"profile\":[\"height\",\"university\"],\"tags\":[{\"id\":1,\"name\":\"人间温柔\"},{\"id\":1,\"name\":\"人间温柔\"}]},\"highlightIdeals\":[{\"id\":1,\"name\":\"性格好\"}],\"targetFitIdeals\":[{\"id\":1,\"name\":\"性格好\"}]}").toJson();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m172681q1(ArrayList arrayList, fcz fczVar) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入发送方消息提醒", new C19409i(fczVar)));
        arrayList.add(vwb.m200311Y("插入接受方消息提醒", new C19410j(fczVar)));
        fczVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m172682q2(boolean z, String str, Message message) {
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
        CoreModule.f17545c.f19642f0.m32882Zg(message);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m172683r(fcz fczVar, Message message) {
        message.owner = fczVar.f96911c;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m172685r1() {
        f152330a = false;
        f152331b = false;
        f152332c = false;
        f152333d = false;
    }

    /* JADX INFO: renamed from: r2 */
    public static void m172686r2(final ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("风险提醒消息", new d30() { // from class: l.kzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172623c(arrayList, fczVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m172688s0(Conversation conversation, boolean z, boolean z2, long j) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.convType = z ? "heartbeatMatch" : "default";
        HeartbeatMatch heartbeatMatch = conversationMo223809clone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = z2;
        if (j == -1) {
            heartbeatMatch.expireTime = mqi0.m155944o() + 86400000;
        } else {
            heartbeatMatch.expireTime = mqi0.m155944o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }
        conversationMo223809clone.additional.heartbeatMatch.acceptTime = mqi0.m155944o() - 3600000;
        CoreModule.f17553k.f91950m.upsert(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m172689s1(final fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32774Qf(fczVar.f96911c, vwb.m200324f0(MessageType.local_love_letter_guide));
        CoreModule.f17545c.f19642f0.m32918ch(fczVar.f96911c, MessageType.get(MessageType.local_love_letter_guide), new e30() { // from class: l.xwy
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172700v0(fczVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public static void m172690s2(final fcz fczVar, final boolean z, final boolean z2) {
        e51.m114743H(fczVar.act(), new Runnable() { // from class: l.uwy
            @Override // java.lang.Runnable
            public final void run() {
                e51.m114774y(new Runnable() { // from class: l.oyy
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.vyy
                            @Override // p149l.d30
                            public final void call() {
                                q2z.m172704w0(fczVar, z, z);
                            }
                        });
                    }
                });
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m172691t() {
        f152330a = false;
        f152331b = true;
        f152332c = false;
        f152333d = false;
    }

    /* JADX INFO: renamed from: t2 */
    public static void m172694t2(final ArrayList<j760<String, d30>> arrayList, final fcz fczVar) {
        arrayList.add(vwb.m200311Y("体验问卷", new d30() { // from class: l.q1z
            @Override // p149l.d30
            public final void call() {
                q2z.m172651j(arrayList, fczVar);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m172695u(fcz fczVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong \n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n";
        message.owner = fczVar.f96911c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: u2 */
    public static ArrayList<j760<String, d30>> m172698u2(final fcz fczVar) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.m200311Y("list layout", new d30() { // from class: l.ewy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.m1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        fczVar2.m120842t7().f171745n1.mo49620u();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("清空焦点", new d30() { // from class: l.axy
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.c1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2z.m172617a1(fczVar2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("强制开始关闭语音气泡：" + guy.f104485w, new d30() { // from class: l.czy
            @Override // p149l.d30
            public final void call() {
                guy.f104485w = !guy.f104485w;
            }
        }));
        arrayList.add(vwb.m200311Y("展示认证气泡：", new d30() { // from class: l.dzy
            @Override // p149l.d30
            public final void call() {
                ((bpz) fczVar.m120842t7()).m103254p5(CoreModule.f17545c.f19639e0.m169527p9());
            }
        }));
        arrayList.add(vwb.m200311Y("清除通知提示：", new d30() { // from class: l.ezy
            @Override // p149l.d30
            public final void call() {
                q2z.m172685r1();
            }
        }));
        arrayList.add(vwb.m200311Y("打开通知提示1：", new d30() { // from class: l.fzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172627d();
            }
        }));
        arrayList.add(vwb.m200311Y("打开通知提示2：", new d30() { // from class: l.gzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172691t();
            }
        }));
        arrayList.add(vwb.m200311Y("打开通知提示3：", new d30() { // from class: l.hzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172601V0();
            }
        }));
        arrayList.add(vwb.m200311Y("打开通知提示4：", new d30() { // from class: l.izy
            @Override // p149l.d30
            public final void call() {
                q2z.m172712y0();
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音20X1500", new d30() { // from class: l.jzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172710x2(fczVar, 20, 1500L);
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音40X1000", new d30() { // from class: l.bzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172710x2(fczVar, 40, 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音40X800", new d30() { // from class: l.mzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172710x2(fczVar, 40, 800L);
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音40X800，快速放开", new d30() { // from class: l.xzy
            @Override // p149l.d30
            public final void call() {
                q2z.m172714y2(fczVar, 40, 200L, 5);
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音1X200，快速放开", new d30() { // from class: l.i0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172714y2(fczVar, 1, 200L, 5);
            }
        }));
        arrayList.add(vwb.m200311Y("连续发送语音2X200，快速放开", new d30() { // from class: l.t0z
            @Override // p149l.d30
            public final void call() {
                q2z.m172714y2(fczVar, 2, 200L, 5);
            }
        }));
        arrayList.add(vwb.m200311Y("消息相关弹框", new d30() { // from class: l.e1z
            @Override // p149l.d30
            public final void call() {
                q2z.m172655k(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("心动信号相关", new d30() { // from class: l.p1z
            @Override // p149l.d30
            public final void call() {
                q2z.m172626c2(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("notify delay 5s", new d30() { // from class: l.a2z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.n1z
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2z.m172598U0(fczVar2);
                    }
                }, 2500L);
            }
        }));
        arrayList.add(vwb.m200311Y("打开TantanList测试任务", new d30() { // from class: l.l2z
            @Override // p149l.d30
            public final void call() {
                fcz fczVar2 = fczVar;
                fczVar2.act().postDelayed(new Runnable() { // from class: l.lzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcz fczVar3 = fczVar2;
                        q2z.m172662l2(fczVar3.act(), fczVar3);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("打开游戏入口", new d30() { // from class: l.pwy
            @Override // p149l.d30
            public final void call() {
                q2z.m172546D0();
            }
        }));
        arrayList.add(vwb.m200311Y("修改游戏信息", new d30() { // from class: l.lxy
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new Runnable() { // from class: l.f0z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.jxy
                            @Override // p149l.d30
                            public final void call() {
                                q2z.m172642g2(fczVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("清除游戏红点", new d30() { // from class: l.wxy
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149424m3.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.m200311Y("心动信号引导标签", new d30() { // from class: l.hyy
            @Override // p149l.d30
            public final void call() {
                q2z.m172579O(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("配对引导对话", new d30() { // from class: l.syy
            @Override // p149l.d30
            public final void call() {
                q2z.m172557G1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("升温", new d30() { // from class: l.xyy
            @Override // p149l.d30
            public final void call() {
                q2z.m172673o1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("引导添加标签及书影剧", new d30() { // from class: l.yyy
            @Override // p149l.d30
            public final void call() {
                q2z.m172660l0(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("状态代发", new d30() { // from class: l.zyy
            @Override // p149l.d30
            public final void call() {
                q2z.m172681q1(arrayList, fczVar);
            }
        }));
        arrayList.add(vwb.m200311Y("聊天助手", new d30() { // from class: l.azy
            @Override // p149l.d30
            public final void call() {
                q2z.m172545D(arrayList, fczVar);
            }
        }));
        m172686r2(arrayList, fczVar);
        m172658k2(arrayList, fczVar);
        m172670n2(arrayList, fczVar);
        m172694t2(arrayList, fczVar);
        m172678p2(arrayList, fczVar);
        m172674o2(arrayList, fczVar);
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m172700v0(fcz fczVar, Message message) {
        message.owner = fczVar.f96911c;
        LoveLetterContent loveLetterContent = new LoveLetterContent();
        loveLetterContent.title = "写封情书给他吧";
        loveLetterContent.subTitle = "你们最近聊天频繁，写封情书表达你的心意";
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: v2 */
    public static String m172702v2() {
        Random random = new Random();
        try {
            return new String(new byte[]{Integer.valueOf(Math.abs(random.nextInt(39)) + 176).byteValue(), Integer.valueOf(Math.abs(random.nextInt(97)) + 161).byteValue()}, "GBK");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "a";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m172704w0(fcz fczVar, boolean z, boolean z2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = fczVar.mo120828r3();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.exclusive_chat_invite);
        messageNew_.createdTime = mqi0.m155944o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = z ? CoreModule.f17545c.f19639e0.m169520na().f56011id : fczVar.mo120828r3();
        messageNew_.recalled = Boolean.FALSE;
        MessageChatHeat messageChatHeatNew_ = MessageChatHeat.new_();
        messageNew_.additionalData = MessageAdditionalData.new_();
        messageChatHeatNew_.actorID = messageNew_.owner;
        messageChatHeatNew_.exclusiveChatInviteTime = mqi0.m155944o();
        messageChatHeatNew_.exclusiveChatInviteExpireTime = mqi0.m155944o() + 720000;
        messageChatHeatNew_.exclusiveChatDuration = 10;
        if (z2) {
            messageChatHeatNew_.exclusiveChatStartTime = mqi0.m155944o();
            messageChatHeatNew_.exclusiveChatEndTime = mqi0.m155944o() + 720000;
        }
        CoreModule.f17553k.f91940c.upsert(messageNew_);
    }

    /* JADX INFO: renamed from: w2 */
    public static void m172706w2(final String str, final boolean z) {
        e51.m114774y(new Runnable() { // from class: l.twy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.eyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172717z1(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public static void m172710x2(fcz fczVar, int i, long j) {
        m172714y2(fczVar, i, j, 2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m172711y(fcz fczVar) {
        CoreModule.f17545c.f19642f0.m32762Pf(fczVar.f96911c, MessageType.local_ux_questionnaire);
        CoreModule.f17545c.f19642f0.m32762Pf(fczVar.f96911c, MessageType.local_ux_questionnaire_tip);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m172712y0() {
        f152330a = false;
        f152331b = false;
        f152332c = false;
        f152333d = true;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m172714y2(final fcz fczVar, int i, long j, final int i2) {
        f152335f = 0;
        fczVar.duringCreated(C22306c.interval(j, TimeUnit.MILLISECONDS)).onBackpressureDrop().observeOn(jo0.m142408a()).take(i * i2).subscribe(mkd0.m154955G(new e30() { // from class: l.g0z
            @Override // p149l.e30
            public final void call(Object obj) {
                q2z.m172586Q0(i2, fczVar, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m172715z(fcz fczVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.m200296J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List<String> list = userStickerNew_.favoriteStickers;
        if (vwb.m200296J(list)) {
            return;
        }
        Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(list.get(0));
        if (stickerM34927s3 != null) {
            w3z.m201431w(fczVar.act(), stickerM34927s3, null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m172716z0(fcz fczVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.m200296J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List<String> list = userStickerNew_.favoriteStickers;
        if (vwb.m200296J(list)) {
            return;
        }
        Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(list.get(0));
        if (stickerM34927s3 != null) {
            w3z.m201395A(fczVar.act(), stickerM34927s3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m172717z1(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.f17553k.f91956s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56011id = str;
        }
        chatHeatQuery.specialRemind = z;
        CoreModule.f17553k.f91956s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: z2 */
    public static void m172718z2(final String str, final e30<ChatHeat> e30Var) {
        e51.m114774y(new Runnable() { // from class: l.ryy
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.wyy
                    @Override // p149l.d30
                    public final void call() {
                        q2z.m172622b2(str, e30Var);
                    }
                });
            }
        });
    }
}
