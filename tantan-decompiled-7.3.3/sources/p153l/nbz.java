package p153l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.ChatGameInfo;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatTips;
import com.p051p1.mobile.putong.core.data.CommonTipBox;
import com.p051p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationGame;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import com.p051p1.mobile.putong.core.data.HarassAlertInfo;
import com.p051p1.mobile.putong.core.data.HeartbeatMatch;
import com.p051p1.mobile.putong.core.data.IceBreakingQA;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterContent;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageChatHeat;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireScene;
import com.p051p1.mobile.putong.core.data.StateData;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class nbz {

    /* JADX INFO: renamed from: a */
    public static boolean f141279a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f141280b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f141281c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f141282d = false;

    /* JADX INFO: renamed from: e */
    public static jxd0 f141283e = new jxd0("fake_debug_conv", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public static int f141284f;

    /* JADX INFO: renamed from: l.nbz$a */
    public class C18833a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141285a;

        public C18833a(clz clzVar) {
            this.f141285a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162462a(clz clzVar) {
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query(clzVar.f82474c);
            conversationQuery.additional.heartbeatMatch.guideFakeToGood = true;
            CoreModule.f18272k.f115545m.upsert(conversationQuery);
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141285a;
            l51.m152919y(new Runnable() { // from class: l.lbz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.mbz
                        @Override // p153l.x20
                        public final void call() {
                            nbz.C18833a.m162462a(clzVar);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$b */
    public class C18834b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141286a;

        public C18834b(clz clzVar) {
            this.f141286a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162464a(clz clzVar, Message message) {
            message.owner = clzVar.f82474c;
            message.value = "哈哈哈哈哈啊哈哈哈哈哈哈哈啊";
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141286a;
            l51.m152919y(new Runnable() { // from class: l.obz
                @Override // java.lang.Runnable
                public final void run() {
                    clz clzVar2 = clzVar;
                    CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.hide_for_fake_user), new y20() { // from class: l.pbz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            nbz.C18834b.m162464a(clzVar2, (Message) obj);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$c */
    public class C18835c implements x20 {
        @Override // p153l.x20
        public void call() {
            jxd0 jxd0Var = nbz.f141283e;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: l.nbz$d */
    public class C18836d implements y20<Message> {
        @Override // p153l.y20
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

    /* JADX INFO: renamed from: l.nbz$e */
    public class C18837e implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141287a;

        public C18837e(clz clzVar) {
            this.f141287a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            List<Message> list = this.f141287a.f82491r.f184001a;
            nbz.m162425q2(true, this.f141287a.mo111034r3(), list.get(list.size() - 1).mo225055clone());
        }
    }

    /* JADX INFO: renamed from: l.nbz$f */
    public class C18838f implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141288a;

        public C18838f(clz clzVar) {
            this.f141288a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            List<Message> list = this.f141288a.f82491r.f184001a;
            nbz.m162425q2(false, this.f141288a.mo111034r3(), list.get(list.size() - 1).mo225055clone());
        }
    }

    /* JADX INFO: renamed from: l.nbz$g */
    public class C18839g implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141289a;

        public C18839g(clz clzVar) {
            this.f141289a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            nbz.m162409m2(true, this.f141289a.mo111034r3());
        }
    }

    /* JADX INFO: renamed from: l.nbz$h */
    public class C18840h implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141290a;

        public C18840h(clz clzVar) {
            this.f141290a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            nbz.m162409m2(false, this.f141290a.mo111034r3());
        }
    }

    /* JADX INFO: renamed from: l.nbz$i */
    public class C18841i implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141291a;

        public C18841i(clz clzVar) {
            this.f141291a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f141291a.mo111034r3();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
            messageNew_.createdTime = pzi0.m174454o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = CoreModule.f18264c.f20381e0.m116593na().f56859id;
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = CoreModule.m30930K().me_().m61308fp().url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            l51.m152919y(new Runnable() { // from class: l.jbz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.kbz
                        @Override // p153l.x20
                        public final void call() {
                            CoreModule.f18272k.f115535c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$j */
    public class C18842j implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141292a;

        public C18842j(clz clzVar) {
            this.f141292a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            final Message messageNew_ = Message.new_();
            messageNew_.cid = this.f141292a.mo111034r3();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
            messageNew_.createdTime = pzi0.m174454o();
            messageNew_.localCreatedTime = System.nanoTime();
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = this.f141292a.mo111034r3();
            messageNew_.recalled = Boolean.FALSE;
            StateData stateData = new StateData();
            stateData.emotionId = "1";
            stateData.emotionText = "等缘分";
            stateData.emotionUrl = CoreModule.m30930K().me_().m61308fp().url;
            stateData.value = "我正在等一个缘分，是你吗";
            MessageExtData messageExtData = new MessageExtData();
            messageExtData.extra = stateData.toJson();
            messageNew_.extData = messageExtData;
            l51.m152919y(new Runnable() { // from class: l.qbz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.rbz
                        @Override // p153l.x20
                        public final void call() {
                            CoreModule.f18272k.f115535c.upsert(message);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$k */
    public class C18843k implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141293a;

        public C18843k(clz clzVar) {
            this.f141293a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162471a(clz clzVar) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                ChatAssistantQuestion chatAssistantQuestionNew_ = ChatAssistantQuestion.new_();
                chatAssistantQuestionNew_.question = "如果可以用一半智商换10cm的身高，你愿意吗？";
                chatAssistantQuestionNew_.questionId = 123;
                arrayList.add(chatAssistantQuestionNew_);
            }
            CoreModule.f18264c.f20384f0.m33873Yg(clzVar.f82474c, arrayList);
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141293a;
            l51.m152919y(new Runnable() { // from class: l.sbz
                @Override // java.lang.Runnable
                public final void run() {
                    nbz.C18843k.m162471a(clzVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$l */
    public class C18844l implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141294a;

        public C18844l(clz clzVar) {
            this.f141294a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
            messageNew_.cid = this.f141294a.f82474c;
            messageNew_.value = "她上次活跃在12小时前，可能不会立即回复，请稍候";
            messageNew_.localInConversation = true;
            long jM174454o = pzi0.m174454o();
            messageNew_.owner = CoreModule.m30929H().userId();
            messageNew_.createdTime = jM174454o;
            messageNew_.localCreatedTime = jM174454o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m30929H().userId();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
        }
    }

    /* JADX INFO: renamed from: l.nbz$m */
    public class C18845m implements x20 {
        @Override // p153l.x20
        public void call() {
            CoreModule.f18264c.f20381e0.f89051I5.clear();
            CoreModule.f18264c.f20381e0.f89058J5.clear();
            CoreModule.f18264c.f20381e0.f89065K5.clear();
        }
    }

    /* JADX INFO: renamed from: l.nbz$n */
    public class C18846n implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141295a;

        public C18846n(clz clzVar) {
            this.f141295a = clzVar;
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141295a;
            l51.m152919y(new Runnable() { // from class: l.tbz
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20384f0.m33605Cf(clzVar.f82474c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$o */
    public class C18847o implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141296a;

        public C18847o(clz clzVar) {
            this.f141296a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162473a(clz clzVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = clzVar.f82474c;
            messageNew_.localInConversation = true;
            long jM174454o = pzi0.m174454o();
            messageNew_.owner = CoreModule.m30929H().userId();
            messageNew_.createdTime = jM174454o;
            messageNew_.localCreatedTime = jM174454o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m30929H().userId();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "system";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141296a;
            l51.m152919y(new Runnable() { // from class: l.ubz
                @Override // java.lang.Runnable
                public final void run() {
                    nbz.C18847o.m162473a(clzVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$p */
    public class C18848p implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141297a;

        public C18848p(clz clzVar) {
            this.f141297a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162474a(clz clzVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = clzVar.f82474c;
            messageNew_.localInConversation = true;
            long jM174454o = pzi0.m174454o();
            messageNew_.owner = CoreModule.m30929H().userId();
            messageNew_.createdTime = jM174454o;
            messageNew_.localCreatedTime = jM174454o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = CoreModule.m30929H().userId();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            MessageExtData messageExtDataNew_ = MessageExtData.new_();
            messageNew_.extData = messageExtDataNew_;
            messageExtDataNew_.extra = "user";
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141297a;
            l51.m152919y(new Runnable() { // from class: l.vbz
                @Override // java.lang.Runnable
                public final void run() {
                    nbz.C18848p.m162474a(clzVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.nbz$q */
    public class C18849q implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f141298a;

        public C18849q(clz clzVar) {
            this.f141298a = clzVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m162475a(clz clzVar) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.chat_assistant_question);
            messageNew_.cid = clzVar.f82474c;
            messageNew_.localInConversation = true;
            long jM174454o = pzi0.m174454o();
            messageNew_.owner = clzVar.mo111064x6().f56859id;
            messageNew_.createdTime = jM174454o;
            messageNew_.localCreatedTime = jM174454o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = clzVar.mo111064x6().f56859id;
            vxd0 vxd0Var = App.f16092i;
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            messageNew_.value = "如果可以用一半智商换10cm的身高，你愿意吗？";
            CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
        }

        @Override // p153l.x20
        public void call() {
            final clz clzVar = this.f141298a;
            l51.m152919y(new Runnable() { // from class: l.wbz
                @Override // java.lang.Runnable
                public final void run() {
                    nbz.C18849q.m162475a(clzVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m162277A0(clz clzVar, Message message) {
        message.owner = clzVar.f82474c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: A2 */
    public static void m162279A2(final String str, final int i) {
        l51.m152919y(new Runnable() { // from class: l.h7z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.n7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162411n0(str, i);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m162282B1(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.love_letter));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.love_letter), new y20() { // from class: l.n5z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162345V1(clzVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public static void m162283B2(final String str, final boolean z) {
        l51.m152919y(new Runnable() { // from class: l.w6z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.g7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162414o(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public static void m162287C2(final Conversation conversation, final boolean z, final boolean z2, final long j) {
        l51.m152919y(new Runnable() { // from class: l.x6z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.r7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162431s0(conversation, z, z, j);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m162288D(ArrayList arrayList, clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入聊天助手新问题引导消息", new C18843k(clzVar)));
        arrayList.add(jyb.m147494Y("插入聊天-不能立即回复", new C18844l(clzVar)));
        arrayList.add(jyb.m147494Y("插入聊天-不能立即回复 清理数据", new C18845m()));
        arrayList.add(jyb.m147494Y("删除聊天助手新问题引导消息", new C18846n(clzVar)));
        arrayList.add(jyb.m147494Y("插入聊天助手问题消息-主态-代发", new C18847o(clzVar)));
        arrayList.add(jyb.m147494Y("插入聊天助手问题消息-主态", new C18848p(clzVar)));
        arrayList.add(jyb.m147494Y("插入聊天助手问题消息-客态", new C18849q(clzVar)));
        arrayList.add(jyb.m147494Y("成为阻塞配对", new C18833a(clzVar)));
        arrayList.add(jyb.m147494Y("插入阻塞消息", new C18834b(clzVar)));
        arrayList.add(jyb.m147494Y("fake conv Debug" + f141283e.get(), new C18835c()));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m162289D0() {
        ChatGameInfo chatGameInfoNew_ = ChatGameInfo.new_();
        chatGameInfoNew_.enable = true;
        chatGameInfoNew_.name = "wooden-fish";
        chatGameInfoNew_.icon = "https://static.tancdn.com/pe-webplatform/VKRa4WNsZMi1ArZrPBt_xziW.webp";
        chatGameInfoNew_.link = "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/knockWoodenFish/index.html?speed=true&_bid=1003873&hideNavigationBar=1&hideNotch=1&unread=1&otherUserId";
        CoreModule.f18264c.f20384f0.m34079oq(chatGameInfoNew_);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m162291D2(final Conversation conversation) {
        l51.m152919y(new Runnable() { // from class: l.a7z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.q7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162395j0(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m162295F(clz clzVar, Message message) {
        message.owner = clzVar.m110932W5().f56859id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = "default";
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m162298G() {
        CoreModule.f18264c.f20384f0.f20611J1.clear();
        CoreModule.f18264c.f20384f0.f20608I1.clear();
        CoreModule.f18264c.f20384f0.f20605H1.clear();
        CoreModule.f18264c.f20384f0.f20623N1.clear();
        CoreModule.f18264c.f20384f0.f20620M1.clear();
        CoreModule.f18264c.f20384f0.f20617L1.clear();
        CoreModule.f18264c.f20384f0.f20602G1.clear();
        CoreModule.f18264c.f20384f0.f20614K1.clear();
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.clear();
        ConversationCounterTypeSp.ProloguesEnterChatCount.clear();
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ void m162299G0(clz clzVar, View view) {
        int iAbs = Math.abs(new Random().nextInt(30)) + 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iAbs; i++) {
            sb.append(m162445v2());
        }
        clzVar.m110914S6(sb.toString());
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m162300G1(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入引导", new x20() { // from class: l.laz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34005jh(clzVar.mo111034r3());
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m162308J0() {
        CoreModule.f18264c.f20424s1.f20827V.put("");
        CoreModule.f18264c.f20424s1.f20826U.put(0);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m162309J1(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM110994j3.additional.loveLetter.owner = clzVar.m110932W5().f56859id;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m162314L0(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationM110994j3.additional.loveLetter.owner = clzVar.f82474c;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m162316M(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM110994j3.additional.loveLetter.owner = clzVar.f82474c;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m162317M0() {
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m162322O(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入聊天页引导", new x20() { // from class: l.iaz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34031lh(clzVar.mo111034r3());
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m162324O1(clz clzVar, Message message) {
        message.owner = clzVar.m110932W5().f56859id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = LoveLetterMessageState.replied;
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m162329Q0(int i, clz clzVar, Object obj) {
        int i2 = f141284f % i;
        if (i2 == 0) {
            clzVar.m143372e0().mo50138B0().m143374g0().m114029n0();
        } else if (i2 == i - 1) {
            clzVar.m143372e0().mo50138B0().m143374g0().m114031o0();
        }
        f141284f++;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m162332R0() {
        ConversationCounterTypeSp.LoveLetterGuideShowTime.clear();
        ConversationCounterTypeSp.LoveLetterGuideShowCount.clear();
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m162336S1(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.local_ideal_enquiry));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.local_ideal_enquiry), new y20() { // from class: l.d6z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162422q(clzVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m162341U0(clz clzVar) {
        o1j0.m165636j("刷新一次");
        clzVar.m111048t7().m178953j0().m153307y();
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m162343V(clz clzVar) {
        Prologue prologueNew_ = Prologue.new_();
        prologueNew_.value = "哈喽，我在互联网工作，喜欢运动，你平时习惯干些什么呢？";
        ((yxz) clzVar.m111048t7()).m217886l5(jyb.m147507f0(prologueNew_), "");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m162344V0() {
        f141279a = false;
        f141280b = false;
        f141281c = true;
        f141282d = false;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m162345V1(clz clzVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = clzVar.f82474c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get(LoveLetterMessageState.replied);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m162350X0(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.love_letter));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.love_letter), new y20() { // from class: l.s5z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162438u(clzVar, (Message) obj);
            }
        });
        l51.m152919y(new Runnable() { // from class: l.t5z
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.c7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162387h0(clzVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m162351X1(clz clzVar, Message message) {
        message.owner = clzVar.f82474c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.iceBreakingQA = IceBreakingQA.new_();
        IceBreakingQA iceBreakingQA = message.additionalData.iceBreakingQA;
        iceBreakingQA.state = LoveLetterMessageState.replied;
        iceBreakingQA.title = "国庆假期你想去哪个城市旅行国庆假期你想去哪个城市旅行?";
        iceBreakingQA.answer = "我想去北京，之前去北京的时候没有去天安门看看，很可惜～";
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m162359a0(clz clzVar) {
        CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
        coreGiftInfo.dynamicGift = true;
        coreGiftInfo.f56859id = "love_letter_guide";
        coreGiftInfo.dynamicURL = "https://auto.tancdn.com/v1/raw/b85c8506-c4f2-4c1e-b58a-d190831361e514.zip";
        coreGiftInfo.dynamicMD5 = "75e0a50d8f7865f421315e24a56d0573";
        coreGiftInfo.priority = CoreGiftPriority.get("IMMEDIATE");
        coreGiftInfo.url = "https://auto.tancdn.com/v1/raw/905dfc67-da0a-4ec5-8ade-1192b8efd6ef12.svga";
        uie.m196154b().m196159f(coreGiftInfo);
        clzVar.m111048t7().f160402k1.m46638w(coreGiftInfo, new x20() { // from class: l.f6z
            @Override // p153l.x20
            public final void call() {
                nbz.m162317M0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m162360a1(clz clzVar) {
        MessageInputBaseEditView bar_center_text = clzVar.m143372e0().mo50138B0().m143374g0().m114041t0().getBar_center_text();
        bar_center_text.clearFocus();
        bar_center_text.setFocusableInTouchMode(false);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m162361a2(clz clzVar) {
        jxd0 jxd0VarM193203Ug;
        if (!(clzVar instanceof tvz) || (jxd0VarM193203Ug = ((tvz) clzVar).m193203Ug()) == null) {
            return;
        }
        jxd0VarM193203Ug.clear();
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m162365b2(String str, y20 y20Var) {
        ChatHeat chatHeatQuery = CoreModule.f18272k.f115551s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56859id = str;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(chatHeatQuery);
        }
        CoreModule.f18272k.f115551s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m162366c(ArrayList arrayList, clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入自己的风险提示", new C18837e(clzVar)));
        arrayList.add(jyb.m147494Y("插入别人的风险提醒", new C18838f(clzVar)));
        arrayList.add(jyb.m147494Y("插入自己的侵犯提示", new C18839g(clzVar)));
        arrayList.add(jyb.m147494Y("插入别人的侵犯提醒", new C18840h(clzVar)));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m162369c2(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("设置或者还原心动类型：" + clzVar.m110994j3().isHeartbeatConv(), new x20() { // from class: l.faz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.g5z
                    @Override // java.lang.Runnable
                    public final void run() {
                        clz clzVar3 = clzVar2;
                        nbz.m162287C2(clzVar3.m110994j3(), !clzVar3.m110994j3().isHeartbeatConv(), false, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("设置成男性或者女性:" + clzVar.m110994j3().additional.heartbeatMatch.isPassive, new x20() { // from class: l.gaz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.s6z
                    @Override // java.lang.Runnable
                    public final void run() {
                        clz clzVar3 = clzVar2;
                        nbz.m162287C2(clzVar3.m110994j3(), clzVar3.m110994j3().isHeartbeatConv(), !clzVar3.m110994j3().additional.heartbeatMatch.isPassive, -1L);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("设置成2分钟有效期 :" + clzVar.m110994j3().additional.heartbeatMatch.isPassive, new x20() { // from class: l.haz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.y5z
                    @Override // java.lang.Runnable
                    public final void run() {
                        clz clzVar3 = clzVar2;
                        nbz.m162287C2(clzVar3.m110994j3(), clzVar3.m110994j3().isHeartbeatConv(), clzVar3.m110994j3().additional.heartbeatMatch.isPassive, 0L);
                    }
                }, 1000L);
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m162370d() {
        f141279a = true;
        f141280b = false;
        f141281c = false;
        f141282d = false;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m162375e0() {
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        loveLetterEntryInfoM222761e.count = 0;
        CoreModule.f18264c.f20381e0.f89136U1.m137019l(loveLetterEntryInfoM222761e);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m162376e1(clz clzVar, Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        CoreModule.f18264c.f20431u2.f114298V.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20431u2.f114299W.m203841a(1);
        CoreModule.f18264c.f20384f0.m34057nh(clzVar.f82474c, questionnaire);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m162379f0(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.love_letter));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.love_letter), new y20() { // from class: l.d5z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162410n(clzVar, (Message) obj);
            }
        });
        l51.m152919y(new Runnable() { // from class: l.e5z
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.k7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162404l1(clzVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m162380f1(clz clzVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        message.owner = clzVar.m110932W5().f56859id;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m162381f2(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m162384g1(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.love_letter));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.love_letter), new y20() { // from class: l.z5z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162426r(clzVar, (Message) obj);
            }
        });
        l51.m152919y(new Runnable() { // from class: l.a6z
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.d7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162314L0(clzVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m162385g2(clz clzVar) {
        Conversation conversationM33738Mo = CoreModule.f18264c.f20384f0.m33738Mo(clzVar.m110989i3());
        conversationM33738Mo.additional.game = ConversationGame.new_();
        ConversationGame conversationGame = conversationM33738Mo.additional.game;
        conversationGame.gameText = "新游戏";
        conversationGame.gameUnread = 10;
        conversationGame.gameTextColor = "#33b5e5";
        conversationGame.gameName = "wooden-fish";
        conversationM33738Mo.localEverHasMessage = true;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM33738Mo);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m162387h0(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM110994j3.additional.loveLetter.owner = clzVar.f82474c;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m162388h1() {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m162391i0(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.love_letter));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.love_letter), new y20() { // from class: l.b6z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162380f1(clzVar, (Message) obj);
            }
        });
        l51.m152919y(new Runnable() { // from class: l.c6z
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.z6z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162400k1(clzVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m162394j(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入体验问卷消息", new x20() { // from class: l.i5z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().duringCreated(CoreModule.f18264c.f20431u2.m139433c3(QuestionnaireScene.get(QuestionnaireScene.messageDetail), null)).subscribe(psd0.m173597H(new y20() { // from class: l.i7z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162376e1(clzVar2, (Questionnaire) obj);
                    }
                }, new y20() { // from class: l.j7z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162381f2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("删除体验问卷消息", new x20() { // from class: l.j5z
            @Override // p153l.x20
            public final void call() {
                nbz.m162454y(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("清除体验问卷该会话显示记录", new x20() { // from class: l.k5z
            @Override // p153l.x20
            public final void call() {
                nbz.m162361a2(clzVar);
            }
        }));
        StringBuilder sb = new StringBuilder("体验问卷轮数=");
        sb.append(clzVar instanceof tvz ? ((tvz) clzVar).m193199Tg() : 0);
        arrayList.add(jyb.m147494Y(sb.toString(), new x20() { // from class: l.l5z
            @Override // p153l.x20
            public final void call() {
                nbz.m162388h1();
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m162395j0(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.unreadMessages = 1;
        conversationMo225055clone.convType = "heartbeatMatch";
        HeartbeatMatch heartbeatMatch = conversationMo225055clone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = true;
        heartbeatMatch.expireTime = pzi0.m174454o() + Constants.ONE_MIN_IN_MILLIS;
        conversationMo225055clone.additional.heartbeatMatch.acceptTime = pzi0.m174454o() - 3600000;
        HeartbeatMatch heartbeatMatch2 = conversationMo225055clone.additional.heartbeatMatch;
        heartbeatMatch2.matchType = 1;
        heartbeatMatch2.greetEmoji = "[嘿哈]";
        heartbeatMatch2.greetText = "你好";
        CoreModule.f18272k.f115545m.upsert(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m162398k(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("不良信息弹框", new x20() { // from class: l.oaz
            @Override // p153l.x20
            public final void call() {
                clzVar.m143372e0().mo50138B0().m194213q2(new SpannableStringBuilder("约吗"), null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog1", new x20() { // from class: l.zaz
            @Override // p153l.x20
            public final void call() {
                tcz.m190535M(clzVar.act());
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog2", new x20() { // from class: l.abz
            @Override // p153l.x20
            public final void call() {
                tcz.m190534L(clzVar.act(), "哈哈哈哈");
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog3", new x20() { // from class: l.bbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190533K(clzVar.act(), false, "大咕咕咕鸡", null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog4", new x20() { // from class: l.cbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190525C(clzVar.act(), "大大咕咕鸡", null, null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog5", new x20() { // from class: l.dbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190527E(clzVar.act(), "移出群成员", null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog6", new x20() { // from class: l.ebz
            @Override // p153l.x20
            public final void call() {
                tcz.m190562z(clzVar.act(), null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog7", new x20() { // from class: l.fbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190529G(clzVar.act(), "闪聊提示", null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog8", new x20() { // from class: l.gbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190536N(clzVar.act());
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog9", new x20() { // from class: l.hbz
            @Override // p153l.x20
            public final void call() {
                tcz.m190560x(clzVar.act(), null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog10", new x20() { // from class: l.paz
            @Override // p153l.x20
            public final void call() {
                tcz.m190531I(clzVar.act());
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog11", new x20() { // from class: l.qaz
            @Override // p153l.x20
            public final void call() {
                tcz.m190530H(clzVar.act(), null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog12", new x20() { // from class: l.raz
            @Override // p153l.x20
            public final void call() {
                tcz.m190524B(clzVar.act(), null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog13", new x20() { // from class: l.saz
            @Override // p153l.x20
            public final void call() {
                tcz.m190532J(clzVar.act());
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog14", new x20() { // from class: l.taz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().duringCreated(CoreModule.f18264c.f20366Z.f20885T.m159274k()).subscribe(psd0.m173596G(new y20() { // from class: l.h5z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162459z0(clzVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog15", new x20() { // from class: l.uaz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().duringCreated(CoreModule.f18264c.f20366Z.f20885T.m159274k()).subscribe(psd0.m173596G(new y20() { // from class: l.c5z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162458z(clzVar2, (CoreData) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog16", new x20() { // from class: l.vaz
            @Override // p153l.x20
            public final void call() {
                tcz.m190526D(clzVar.act(), null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog17", new x20() { // from class: l.waz
            @Override // p153l.x20
            public final void call() {
                tcz.m190528F(clzVar.act(), CoreModule.f18264c.f20381e0.m116600p9());
            }
        }));
        arrayList.add(jyb.m147494Y("Dialog18", new x20() { // from class: l.yaz
            @Override // p153l.x20
            public final void call() {
                tcz.m190561y(clzVar.act());
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m162400k1(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("opened");
        conversationM110994j3.additional.loveLetter.owner = clzVar.m110932W5().f56859id;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m162401k2(ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("插入Ai权限邀请", new x20() { // from class: l.k8z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.ai_picture_query_auth), new y20() { // from class: l.f5z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((Message) obj).owner = clzVar2.f82474c;
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m162403l0(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入标签引导", new x20() { // from class: l.e9z
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33933dh(clzVar.mo111034r3(), MessageType.get(MessageType.local_add_tags_guide));
            }
        }));
        arrayList.add(jyb.m147494Y("插入书影剧引导", new x20() { // from class: l.g9z
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33933dh(clzVar.mo111034r3(), MessageType.get(MessageType.local_add_artwork_guide));
            }
        }));
        arrayList.add(jyb.m147494Y("插入发送标签文案后的提示", new x20() { // from class: l.h9z
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33933dh(clzVar.mo111034r3(), MessageType.get(MessageType.local_send_tags_text));
            }
        }));
        arrayList.add(jyb.m147494Y("插入发送书影剧文案后的提示", new x20() { // from class: l.i9z
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33933dh(clzVar.mo111034r3(), MessageType.get(MessageType.local_send_artwork_text));
            }
        }));
        arrayList.add(jyb.m147494Y("书影剧引导一天限制重置", new x20() { // from class: l.j9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162308J0();
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m162404l1(clz clzVar) {
        Conversation conversationM110994j3 = clzVar.m110994j3();
        conversationM110994j3.additional.loveLetter = ConvAdditionalLoveLetter.new_();
        conversationM110994j3.additional.loveLetter.state = LoveLetterMessageState.get("default");
        conversationM110994j3.additional.loveLetter.owner = clzVar.m110932W5().f56859id;
        CoreModule.f18264c.f20384f0.m34053mq(conversationM110994j3);
    }

    /* JADX INFO: renamed from: l2 */
    public static void m162405l2(Act act, final clz clzVar) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewInflate = p9r.m171370a(act).inflate(qec0.f157129u1, viewGroup, false);
        viewGroup.addView(viewInflate);
        Button button = (Button) viewInflate.findViewById(edc0.f93266Q3);
        Button button2 = (Button) viewInflate.findViewById(edc0.f93497z);
        Button button3 = (Button) viewInflate.findViewById(edc0.f93341c4);
        Button button4 = (Button) viewInflate.findViewById(edc0.f93502z4);
        Button button5 = (Button) viewInflate.findViewById(edc0.f93308X3);
        Button button6 = (Button) viewInflate.findViewById(edc0.f93320Z3);
        Button button7 = (Button) viewInflate.findViewById(edc0.f93327a4);
        Button button8 = (Button) viewInflate.findViewById(edc0.f93314Y3);
        bnl0.m105509E0(button7, new View.OnClickListener() { // from class: l.h6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50795d();
            }
        });
        bnl0.m105509E0(button8, new View.OnClickListener() { // from class: l.j6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50804v();
            }
        });
        bnl0.m105509E0(button5, new View.OnClickListener() { // from class: l.k6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50792A();
            }
        });
        bnl0.m105509E0(button6, new View.OnClickListener() { // from class: l.l6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50802s();
            }
        });
        bnl0.m105509E0(button, new View.OnClickListener() { // from class: l.m6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().m178953j0().m153307y();
            }
        });
        bnl0.m105509E0(button2, new View.OnClickListener() { // from class: l.n6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50796e();
            }
        });
        bnl0.m105509E0(button3, new View.OnClickListener() { // from class: l.o6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nbz.m162299G0(clzVar, view);
            }
        });
        bnl0.m105509E0(button4, new View.OnClickListener() { // from class: l.p6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clzVar.m111048t7().f160408n1.mo50798l();
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m162407m0() {
    }

    /* JADX INFO: renamed from: m2 */
    public static void m162409m2(boolean z, String str) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.harass_alert);
        messageNew_.cid = str;
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = z ? CoreModule.m30929H().userId() : str;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.harassAlertInfo = HarassAlertInfo.new_();
        HarassAlertInfo harassAlertInfo = messageNew_.additionalData.harassAlertInfo;
        harassAlertInfo.status = "default";
        harassAlertInfo.triggeredMsgID = "111111";
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = str;
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.value = "您发送的内容涉嫌违反<a href = \"tantan://webview?url=http://lp.tantanapp.com/rule_zh_cn/ \">《探探行为规范》。 </a>请协助遵守平台规定和社交礼仪，感谢您的理解和支持\n";
        CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m162410n(clz clzVar, Message message) {
        message.owner = clzVar.m110932W5().f56859id;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m162411n0(String str, int i) {
        ChatHeat chatHeatQuery = CoreModule.f18272k.f115551s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56859id = str;
        }
        chatHeatQuery.exclusiveChatInviteTime = pzi0.m174454o() - AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        chatHeatQuery.exclusiveChatInviteExpireTime = pzi0.m174454o();
        chatHeatQuery.exclusiveChatStartTime = pzi0.m174454o();
        chatHeatQuery.exclusiveChatEndTime = pzi0.m174454o() + (((long) i) * Constants.ONE_MIN_IN_MILLIS);
        CoreModule.f18272k.f115551s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: n2 */
    public static void m162413n2(ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("查询理想型问询", new x20() { // from class: l.k9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162336S1(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("清空理想型数据", new x20() { // from class: l.l9z
            @Override // p153l.x20
            public final void call() {
                ConversationCounterTypeSp.IdealGuideMsg.clear();
            }
        }));
        arrayList.add(jyb.m147494Y("开场白", new x20() { // from class: l.m9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162343V(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("清除开场白展示次数", new x20() { // from class: l.n9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162298G();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m162414o(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.f18272k.f115551s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56859id = str;
        }
        chatHeatQuery.levelUp = z;
        CoreModule.f18272k.f115551s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m162416o1(ArrayList arrayList, final clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入我发起的邀请已经接受", new x20() { // from class: l.o9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162433s2(clzVar, true, true);
            }
        }));
        arrayList.add(jyb.m147494Y("插入对方发起的邀请已经接受", new x20() { // from class: l.p9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162433s2(clzVar, false, true);
            }
        }));
        arrayList.add(jyb.m147494Y("插入我发起的邀请未接受", new x20() { // from class: l.r9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162433s2(clzVar, true, false);
            }
        }));
        arrayList.add(jyb.m147494Y("插入对方发起的邀请未接受", new x20() { // from class: l.s9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162433s2(clzVar, false, false);
            }
        }));
        arrayList.add(jyb.m147494Y("开启专属提醒", new x20() { // from class: l.t9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162449w2(clzVar.mo111034r3(), true);
            }
        }));
        arrayList.add(jyb.m147494Y("关闭专属提醒", new x20() { // from class: l.u9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162449w2(clzVar.mo111034r3(), false);
            }
        }));
        arrayList.add(jyb.m147494Y("开始专属聊天", new x20() { // from class: l.v9z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                w1e.m204400d(clzVar2.act()).m204419D(10).m204430r("输入时间").m204421F(new y20() { // from class: l.r6z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162279A2(clzVar2.mo111034r3(), Integer.parseInt((String) obj));
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("开始升温动画", new x20() { // from class: l.w9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162283B2(clzVar.mo111034r3(), true);
            }
        }));
        arrayList.add(jyb.m147494Y("关闭升温动画", new x20() { // from class: l.x9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162283B2(clzVar.mo111034r3(), false);
            }
        }));
        arrayList.add(jyb.m147494Y("设置深度", new x20() { // from class: l.y9z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                w1e.m204400d(clzVar2.act()).m204419D(10).m204430r("输入深度").m204421F(new y20() { // from class: l.v5z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162461z2(clzVar2.mo111034r3(), new y20() { // from class: l.f7z
                            @Override // p153l.y20
                            public final void call(Object obj2) {
                                ((ChatHeat) obj2).degree = Double.parseDouble(str);
                            }
                        });
                    }
                }).m204426n().show();
            }
        }));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o2 */
    public static void m162417o2(ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("引导认证-邀请-插入", new x20() { // from class: l.aaz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33933dh(clzVar.f82474c, MessageType.get(MessageType.local_invitation_for_authentication));
            }
        }));
        arrayList.add(jyb.m147494Y("引导认证-邀请-删除", new x20() { // from class: l.caz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.local_invitation_for_authentication));
            }
        }));
        arrayList.add(jyb.m147494Y("引导认证-去认证-插入", new x20() { // from class: l.daz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.common_tip_box_v2), new nbz.C18836d());
            }
        }));
        arrayList.add(jyb.m147494Y("引导认证-去认证-删除", new x20() { // from class: l.eaz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.common_tip_box_v2));
            }
        }));
    }

    /* JADX INFO: renamed from: p2 */
    public static void m162421p2(ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("情书引导", new x20() { // from class: l.l8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162432s1(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("插入情书消息_对方-未拆", new x20() { // from class: l.s8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162384g1(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("插入情书消息_我方-未拆", new x20() { // from class: l.t8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162379f0(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("插入情书消息_对方-已拆", new x20() { // from class: l.v8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162350X0(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("插入情书消息_我方-已拆", new x20() { // from class: l.w8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162391i0(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("情书更新Conversation_我方-已拆", new x20() { // from class: l.x8z
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new Runnable() { // from class: l.w5z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.y6z
                            @Override // p153l.x20
                            public final void call() {
                                nbz.m162309J1(clzVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("情书更新Conversation_对方-已拆", new x20() { // from class: l.y8z
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new Runnable() { // from class: l.v6z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.m7z
                            @Override // p153l.x20
                            public final void call() {
                                nbz.m162316M(clzVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("插入情书消息_已回复", new x20() { // from class: l.z8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162282B1(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("情书引导动画", new x20() { // from class: l.a9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162359a0(clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("情书认证", new x20() { // from class: l.b9z
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30933P().m143405a().mo180345J5(clzVar.act(), new x20() { // from class: l.o5z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162407m0();
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("情书模拟刷新入口", new x20() { // from class: l.m8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162375e0();
            }
        }));
        arrayList.add(jyb.m147494Y("清空情书数据", new x20() { // from class: l.n8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162332R0();
            }
        }));
        arrayList.add(jyb.m147494Y("插入交换答案-自己-对方未回复", new x20() { // from class: l.o8z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.icebreak_qa), new y20() { // from class: l.e6z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162295F(clzVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("插入交换答案-自己-对方已回复", new x20() { // from class: l.p8z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.icebreak_qa), new y20() { // from class: l.q6z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162324O1(clzVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("插入交换答案-对方-自己未回答", new x20() { // from class: l.q8z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.icebreak_qa), new y20() { // from class: l.p5z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162277A0(clzVar2, (Message) obj);
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("插入交换答案-对方-自己已回答", new x20() { // from class: l.r8z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                CoreModule.f18264c.f20384f0.m33921ch(clzVar2.f82474c, MessageType.get(MessageType.icebreak_qa), new y20() { // from class: l.u6z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nbz.m162351X1(clzVar2, (Message) obj);
                    }
                });
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m162422q(clz clzVar, Message message) {
        message.owner = clzVar.f82474c;
        try {
            message.localExtraInfo = IdealInfo.JSON_ADAPTER.parse("{\"fitIdeals\":[{\"id\":1,\"name\":\"性格好\"},{\"id\":2,\"name\":\"哈哈哈\"},{\"id\":3,\"name\":\"爱粘人\"},{\"id\":4,\"name\":\"身材好\"},{\"id\":5,\"name\":\"爱睡觉\"},{\"id\":6,\"name\":\"大胃王\"}],\"fitIdealDetails\":[{\"id\":1,\"name\":\"180cm\"},{\"id\":1,\"name\":\"人间温柔\"}],\"highlightProfiles\":{\"profile\":[\"height\",\"university\"],\"tags\":[{\"id\":1,\"name\":\"人间温柔\"},{\"id\":1,\"name\":\"人间温柔\"}]},\"highlightIdeals\":[{\"id\":1,\"name\":\"性格好\"}],\"targetFitIdeals\":[{\"id\":1,\"name\":\"性格好\"}]}").toJson();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m162424q1(ArrayList arrayList, clz clzVar) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入发送方消息提醒", new C18841i(clzVar)));
        arrayList.add(jyb.m147494Y("插入接受方消息提醒", new C18842j(clzVar)));
        clzVar.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m162425q2(boolean z, String str, Message message) {
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
        CoreModule.f18264c.f20384f0.m33885Zg(message);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m162426r(clz clzVar, Message message) {
        message.owner = clzVar.f82474c;
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。";
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("default");
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m162428r1() {
        f141279a = false;
        f141280b = false;
        f141281c = false;
        f141282d = false;
    }

    /* JADX INFO: renamed from: r2 */
    public static void m162429r2(final ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("风险提醒消息", new x20() { // from class: l.h8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162366c(arrayList, clzVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m162431s0(Conversation conversation, boolean z, boolean z2, long j) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.convType = z ? "heartbeatMatch" : "default";
        HeartbeatMatch heartbeatMatch = conversationMo225055clone.additional.heartbeatMatch;
        heartbeatMatch.isPassive = z2;
        if (j == -1) {
            heartbeatMatch.expireTime = pzi0.m174454o() + 86400000;
        } else {
            heartbeatMatch.expireTime = pzi0.m174454o() + AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }
        conversationMo225055clone.additional.heartbeatMatch.acceptTime = pzi0.m174454o() - 3600000;
        CoreModule.f18272k.f115545m.upsert(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m162432s1(final clz clzVar) {
        CoreModule.f18264c.f20384f0.m33777Qf(clzVar.f82474c, jyb.m147507f0(MessageType.local_love_letter_guide));
        CoreModule.f18264c.f20384f0.m33921ch(clzVar.f82474c, MessageType.get(MessageType.local_love_letter_guide), new y20() { // from class: l.u5z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162443v0(clzVar, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public static void m162433s2(final clz clzVar, final boolean z, final boolean z2) {
        l51.m152888H(clzVar.act(), new Runnable() { // from class: l.r5z
            @Override // java.lang.Runnable
            public final void run() {
                l51.m152919y(new Runnable() { // from class: l.l7z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.s7z
                            @Override // p153l.x20
                            public final void call() {
                                nbz.m162447w0(clzVar, z, z);
                            }
                        });
                    }
                });
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m162434t() {
        f141279a = false;
        f141280b = true;
        f141281c = false;
        f141282d = false;
    }

    /* JADX INFO: renamed from: t2 */
    public static void m162437t2(final ArrayList<pf60<String, x20>> arrayList, final clz clzVar) {
        arrayList.add(jyb.m147494Y("体验问卷", new x20() { // from class: l.naz
            @Override // p153l.x20
            public final void call() {
                nbz.m162394j(arrayList, clzVar);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m162438u(clz clzVar, Message message) {
        message.value = "你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong。\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong \n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n 你 根本就不爱我，你跟本就不dong爱情，huo许我也不dong\n";
        message.owner = clzVar.f82474c;
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        message.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.loveLetterInfo = LoveLetterMessageInfo.new_();
        message.additionalData.loveLetterInfo.state = LoveLetterMessageState.get("opened");
    }

    /* JADX INFO: renamed from: u2 */
    public static ArrayList<pf60<String, x20>> m162441u2(final clz clzVar) {
        final ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(jyb.m147494Y("list layout", new x20() { // from class: l.b5z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.jaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        clzVar2.m111048t7().f160408n1.mo50803u();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("清空焦点", new x20() { // from class: l.x5z
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.z9z
                    @Override // java.lang.Runnable
                    public final void run() {
                        nbz.m162360a1(clzVar2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("强制开始关闭语音气泡：" + d3z.f84957w, new x20() { // from class: l.z7z
            @Override // p153l.x20
            public final void call() {
                d3z.f84957w = !d3z.f84957w;
            }
        }));
        arrayList.add(jyb.m147494Y("展示认证气泡：", new x20() { // from class: l.a8z
            @Override // p153l.x20
            public final void call() {
                ((yxz) clzVar.m111048t7()).m217894p5(CoreModule.f18264c.f20381e0.m116600p9());
            }
        }));
        arrayList.add(jyb.m147494Y("清除通知提示：", new x20() { // from class: l.b8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162428r1();
            }
        }));
        arrayList.add(jyb.m147494Y("打开通知提示1：", new x20() { // from class: l.c8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162370d();
            }
        }));
        arrayList.add(jyb.m147494Y("打开通知提示2：", new x20() { // from class: l.d8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162434t();
            }
        }));
        arrayList.add(jyb.m147494Y("打开通知提示3：", new x20() { // from class: l.e8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162344V0();
            }
        }));
        arrayList.add(jyb.m147494Y("打开通知提示4：", new x20() { // from class: l.f8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162455y0();
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音20X1500", new x20() { // from class: l.g8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162453x2(clzVar, 20, 1500L);
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音40X1000", new x20() { // from class: l.y7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162453x2(clzVar, 40, 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音40X800", new x20() { // from class: l.j8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162453x2(clzVar, 40, 800L);
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音40X800，快速放开", new x20() { // from class: l.u8z
            @Override // p153l.x20
            public final void call() {
                nbz.m162457y2(clzVar, 40, 200L, 5);
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音1X200，快速放开", new x20() { // from class: l.f9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162457y2(clzVar, 1, 200L, 5);
            }
        }));
        arrayList.add(jyb.m147494Y("连续发送语音2X200，快速放开", new x20() { // from class: l.q9z
            @Override // p153l.x20
            public final void call() {
                nbz.m162457y2(clzVar, 2, 200L, 5);
            }
        }));
        arrayList.add(jyb.m147494Y("消息相关弹框", new x20() { // from class: l.baz
            @Override // p153l.x20
            public final void call() {
                nbz.m162398k(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("心动信号相关", new x20() { // from class: l.maz
            @Override // p153l.x20
            public final void call() {
                nbz.m162369c2(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("notify delay 5s", new x20() { // from class: l.xaz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.kaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        nbz.m162341U0(clzVar2);
                    }
                }, 2500L);
            }
        }));
        arrayList.add(jyb.m147494Y("打开TantanList测试任务", new x20() { // from class: l.ibz
            @Override // p153l.x20
            public final void call() {
                clz clzVar2 = clzVar;
                clzVar2.act().postDelayed(new Runnable() { // from class: l.i8z
                    @Override // java.lang.Runnable
                    public final void run() {
                        clz clzVar3 = clzVar2;
                        nbz.m162405l2(clzVar3.act(), clzVar3);
                    }
                }, 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("打开游戏入口", new x20() { // from class: l.m5z
            @Override // p153l.x20
            public final void call() {
                nbz.m162289D0();
            }
        }));
        arrayList.add(jyb.m147494Y("修改游戏信息", new x20() { // from class: l.i6z
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new Runnable() { // from class: l.c9z
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.g6z
                            @Override // p153l.x20
                            public final void call() {
                                nbz.m162385g2(clzVar);
                            }
                        });
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("清除游戏红点", new x20() { // from class: l.t6z
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89281m3.put(Boolean.TRUE);
            }
        }));
        arrayList.add(jyb.m147494Y("心动信号引导标签", new x20() { // from class: l.e7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162322O(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("配对引导对话", new x20() { // from class: l.p7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162300G1(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("升温", new x20() { // from class: l.u7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162416o1(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("引导添加标签及书影剧", new x20() { // from class: l.v7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162403l0(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("状态代发", new x20() { // from class: l.w7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162424q1(arrayList, clzVar);
            }
        }));
        arrayList.add(jyb.m147494Y("聊天助手", new x20() { // from class: l.x7z
            @Override // p153l.x20
            public final void call() {
                nbz.m162288D(arrayList, clzVar);
            }
        }));
        m162429r2(arrayList, clzVar);
        m162401k2(arrayList, clzVar);
        m162413n2(arrayList, clzVar);
        m162437t2(arrayList, clzVar);
        m162421p2(arrayList, clzVar);
        m162417o2(arrayList, clzVar);
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m162443v0(clz clzVar, Message message) {
        message.owner = clzVar.f82474c;
        LoveLetterContent loveLetterContent = new LoveLetterContent();
        loveLetterContent.title = "写封情书给他吧";
        loveLetterContent.subTitle = "你们最近聊天频繁，写封情书表达你的心意";
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: v2 */
    public static String m162445v2() {
        Random random = new Random();
        try {
            return new String(new byte[]{Integer.valueOf(Math.abs(random.nextInt(39)) + 176).byteValue(), Integer.valueOf(Math.abs(random.nextInt(97)) + 161).byteValue()}, "GBK");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "a";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m162447w0(clz clzVar, boolean z, boolean z2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = clzVar.mo111034r3();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.exclusive_chat_invite);
        messageNew_.createdTime = pzi0.m174454o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = z ? CoreModule.f18264c.f20381e0.m116593na().f56859id : clzVar.mo111034r3();
        messageNew_.recalled = Boolean.FALSE;
        MessageChatHeat messageChatHeatNew_ = MessageChatHeat.new_();
        messageNew_.additionalData = MessageAdditionalData.new_();
        messageChatHeatNew_.actorID = messageNew_.owner;
        messageChatHeatNew_.exclusiveChatInviteTime = pzi0.m174454o();
        messageChatHeatNew_.exclusiveChatInviteExpireTime = pzi0.m174454o() + 720000;
        messageChatHeatNew_.exclusiveChatDuration = 10;
        if (z2) {
            messageChatHeatNew_.exclusiveChatStartTime = pzi0.m174454o();
            messageChatHeatNew_.exclusiveChatEndTime = pzi0.m174454o() + 720000;
        }
        CoreModule.f18272k.f115535c.upsert(messageNew_);
    }

    /* JADX INFO: renamed from: w2 */
    public static void m162449w2(final String str, final boolean z) {
        l51.m152919y(new Runnable() { // from class: l.q5z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.b7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162460z1(str, z);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public static void m162453x2(clz clzVar, int i, long j) {
        m162457y2(clzVar, i, j, 2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m162454y(clz clzVar) {
        CoreModule.f18264c.f20384f0.m33765Pf(clzVar.f82474c, MessageType.local_ux_questionnaire);
        CoreModule.f18264c.f20384f0.m33765Pf(clzVar.f82474c, MessageType.local_ux_questionnaire_tip);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m162455y0() {
        f141279a = false;
        f141280b = false;
        f141281c = false;
        f141282d = true;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m162457y2(final clz clzVar, int i, long j, final int i2) {
        f141284f = 0;
        clzVar.duringCreated(C22421c.interval(j, TimeUnit.MILLISECONDS)).onBackpressureDrop().observeOn(fo0.m126432a()).take(i * i2).subscribe(psd0.m173596G(new y20() { // from class: l.d9z
            @Override // p153l.y20
            public final void call(Object obj) {
                nbz.m162329Q0(i2, clzVar, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m162458z(clz clzVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || jyb.m147479J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List<String> list = userStickerNew_.favoriteStickers;
        if (jyb.m147479J(list)) {
            return;
        }
        Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(list.get(0));
        if (stickerM35930s3 != null) {
            tcz.m190559w(clzVar.act(), stickerM35930s3, null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m162459z0(clz clzVar, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || jyb.m147479J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        List<String> list = userStickerNew_.favoriteStickers;
        if (jyb.m147479J(list)) {
            return;
        }
        Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(list.get(0));
        if (stickerM35930s3 != null) {
            tcz.m190523A(clzVar.act(), stickerM35930s3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m162460z1(String str, boolean z) {
        ChatHeat chatHeatQuery = CoreModule.f18272k.f115551s.query(str);
        if (chatHeatQuery == null) {
            chatHeatQuery = ChatHeat.new_();
            chatHeatQuery.f56859id = str;
        }
        chatHeatQuery.specialRemind = z;
        CoreModule.f18272k.f115551s.upsert(chatHeatQuery);
    }

    /* JADX INFO: renamed from: z2 */
    public static void m162461z2(final String str, final y20<ChatHeat> y20Var) {
        l51.m152919y(new Runnable() { // from class: l.o7z
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.t7z
                    @Override // p153l.x20
                    public final void call() {
                        nbz.m162365b2(str, y20Var);
                    }
                });
            }
        });
    }
}
