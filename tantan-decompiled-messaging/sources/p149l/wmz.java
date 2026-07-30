package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p046p1.mobile.putong.core.data.AnalysisGuide;
import com.p046p1.mobile.putong.core.data.ChatBlockStatus;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.ExchangePicture;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p046p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p046p1.mobile.putong.core.data.PlatinumPinChat;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireScene;
import com.p046p1.mobile.putong.core.data.RiskOtherData;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.filter.FilterVerificationUserMsgDlg;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.GPMemo;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wmz extends fcz<User, bpz> {

    /* JADX INFO: renamed from: I0 */
    public boolean f187191I0;

    /* JADX INFO: renamed from: J0 */
    public qvy f187192J0;

    /* JADX INFO: renamed from: K0 */
    public C22392a<ChatBlockStatus> f187193K0;

    /* JADX INFO: renamed from: L0 */
    public C22392a<Boolean> f187194L0;

    /* JADX INFO: renamed from: M0 */
    public C22392a<roj0> f187195M0;

    /* JADX INFO: renamed from: N0 */
    public final C22392a<roj0> f187196N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f187197O0;

    /* JADX INFO: renamed from: P0 */
    public volatile boolean f187198P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f187199Q0;

    /* JADX INFO: renamed from: R0 */
    public ChatHeat f187200R0;

    /* JADX INFO: renamed from: S0 */
    @Nullable
    public ChatHeat f187201S0;

    /* JADX INFO: renamed from: T0 */
    public qsz f187202T0;

    /* JADX INFO: renamed from: U0 */
    public gq5 f187203U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f187204V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f187205W0;

    /* JADX INFO: renamed from: X0 */
    public int f187206X0;

    /* JADX INFO: renamed from: Y0 */
    public Runnable f187207Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f187208Z0;

    /* JADX INFO: renamed from: a1 */
    public zpd0 f187209a1;

    /* JADX INFO: renamed from: b1 */
    public String f187210b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f187211c1;

    /* JADX INFO: renamed from: d1 */
    public int f187212d1;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f187213e1;

    /* JADX INFO: renamed from: f1 */
    public List<a9m> f187214f1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f187215g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f187216h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f187217i1;

    /* JADX INFO: renamed from: j1 */
    public UserLiveLabel f187218j1;

    /* JADX INFO: renamed from: k1 */
    public String f187219k1;

    /* JADX INFO: renamed from: l1 */
    public Runnable f187220l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f187221m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f187222n1;

    /* JADX INFO: renamed from: o1 */
    public Runnable f187223o1;

    /* JADX INFO: renamed from: l.wmz$a */
    public class C20913a implements e30<String> {
        public C20913a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (TextUtils.equals(str, wmz.this.m120783i3()) && d36.m109868c().m109871d(str)) {
                ((bpz) wmz.this.viewModel).m103173A5(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmz$b */
    public class C20914b implements e30<Message> {
        public C20914b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Message message) {
            wmz wmzVar = wmz.this;
            int i = wmzVar.f187206X0 + 1;
            wmzVar.f187206X0 = i;
            if (i >= CoreModule.m29935P().m94651a().mo33346Ja().exp_dismiss_count) {
                ((bpz) wmz.this.viewModel).m103173A5(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmz$c */
    public class C20915c implements d30 {
        public C20915c() {
        }

        @Override // p149l.d30
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = wmz.this.mo120828r3();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.picture_text_deeplink);
            messageNew_.localCreatedTime = mqi0.m155944o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.f17545c.f19642f0.m32894ah(messageNew_, false);
        }
    }

    /* JADX INFO: renamed from: l.wmz$d */
    public class C20916d implements d30 {
        public C20916d() {
        }

        @Override // p149l.d30
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = wmz.this.mo120828r3();
            tpd0 tpd0Var = App.f15373i;
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.picture_text_deeplink);
            messageNew_.localCreatedTime = mqi0.m155944o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = wmz.this.mo120828r3();
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.f17545c.f19642f0.m32894ah(messageNew_, false);
        }
    }

    public wmz(mcr mcrVar, Conversation conversation) {
        super(mcrVar);
        this.f187191I0 = false;
        this.f187193K0 = C22392a.m221512b();
        this.f187194L0 = C22392a.m221512b();
        this.f187195M0 = C22392a.m221512b();
        this.f187196N0 = C22392a.m221512b();
        this.f187197O0 = false;
        this.f187198P0 = false;
        this.f187199Q0 = false;
        this.f187201S0 = null;
        this.f187202T0 = new qsz();
        this.f187204V0 = false;
        this.f187205W0 = false;
        this.f187207Y0 = null;
        this.f187208Z0 = false;
        this.f187210b1 = "";
        this.f187211c1 = false;
        this.f187214f1 = new ArrayList();
        this.f187215g1 = new Runnable() { // from class: l.dgz
            @Override // java.lang.Runnable
            public final void run() {
                this.f86224a.m204426Xf();
            }
        };
        this.f187216h1 = false;
        this.f187217i1 = false;
        this.f187218j1 = null;
        this.f187220l1 = new Runnable() { // from class: l.egz
            @Override // java.lang.Runnable
            public final void run() {
                this.f91272a.m204434Zf();
            }
        };
        this.f187221m1 = false;
        this.f187223o1 = new Runnable() { // from class: l.fgz
            @Override // java.lang.Runnable
            public final void run() {
                this.f97465a.m204438ag();
            }
        };
        if (NullChecker.m81303a(conversation)) {
            this.f96911c = conversation.f56011id;
            this.f96910b = conversation.otherUser;
            this.f96919k = conversation;
            if (ura.m195053e().m195057d().mo33884mj()) {
                this.f187208Z0 = i36.m134149g().m134160o(this.f96911c);
            }
            this.f187210b1 = conversation.localDraft;
        }
        this.f187209a1 = new zpd0("chat_assistant_question_message_show_time_" + CoreModule.m29931H().userId() + "_" + this.f96911c, 0L);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m204062B7(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.unreadMessages = 0;
        CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m204065Ba(Throwable th) {
    }

    /* JADX INFO: renamed from: C9 */
    public static /* synthetic */ void m204069C9() {
    }

    /* JADX INFO: renamed from: D8 */
    public static /* synthetic */ void m204073D8(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            CoreModule.f17545c.f19643f1.m118045I3();
        }
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m204081Eb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ed */
    private void m204082Ed(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m49192v("initWarmingUpView = " + this.f187197O0 + " level = " + warmingUpLevel);
        if (this.f187197O0) {
            return;
        }
        this.f187197O0 = true;
        ((bpz) this.viewModel).m103205S3(warmingUpLevel);
        m156455e0().mo48954A0().m156457g0().m128134H0(warmingUpLevel);
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m204098I7(Optional optional) {
        if (optional.isPresent()) {
            ((a9m) optional.get()).handle();
        }
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m204099I8(Throwable th) {
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ void m204101Ia(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ void m204103J7(int i, boolean z, Message message) {
        message.localMyVisitorCount = i;
        message.localMyVisitorHidden = z;
    }

    /* JADX INFO: renamed from: J9 */
    public static /* synthetic */ void m204105J9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ja */
    public static /* synthetic */ Boolean m204106Ja(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m204115L9(Throwable th) {
    }

    /* JADX INFO: renamed from: La */
    public static /* synthetic */ Boolean m204116La(Conversation conversation) {
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, "default") && !ml6.m155116a(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, "default"));
    }

    /* JADX INFO: renamed from: Lb */
    public static /* synthetic */ void m204117Lb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ Optional m204121Ma(ArrayList arrayList, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        vwb.m200342o0(listAsList, new cjz(), ", ");
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                ((a9m) arrayList.get(i)).getClass();
                return Optional.m15413of((a9m) arrayList.get(i));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: Mc */
    private void m204123Mc() {
        if (y19.m212151K()) {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9(), mo120709T2(), new gm20())).subscribe(mkd0.m154955G(new e30() { // from class: l.tjz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170807a.m204511re((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N9 */
    public static /* synthetic */ PurchaseType m204126N9(PurchaseType purchaseType, List list) {
        return purchaseType;
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m204127Na(Throwable th) {
    }

    /* JADX INFO: renamed from: O9 */
    public static /* synthetic */ void m204131O9(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ void m204138Pb(Throwable th) {
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m204142Qa(Throwable th) {
    }

    /* JADX INFO: renamed from: Rb */
    public static /* synthetic */ void m204148Rb(Throwable th) {
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m204149S7(Throwable th) {
    }

    /* JADX INFO: renamed from: Sc */
    private void m204154Sc() {
        if (TextUtils.isEmpty(this.f96911c)) {
            return;
        }
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f96911c);
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96911c);
        if (conversationM32856Xe == null || !conversationM32856Xe.isHeartbeatConv() || conversationM32856Xe.additional.heartbeatMatch == null) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19571H1.m201045D3()).subscribe(mkd0.m154955G(new e30() { // from class: l.plz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150184a.m204351He((Message) obj);
            }
        }));
        final C22392a c22392aM221512b = C22392a.m221512b();
        creates(new e30() { // from class: l.amz
            @Override // p149l.e30
            public final void call(Object obj) {
                Conversation conversation = conversationM32856Xe;
                CoreModule.f17545c.f19571H1.m201080z3(conversation.additional.heartbeatMatch.isPassive, conversation.f56011id, c22392aM221512b);
            }
        });
        if (conversationM32856Xe.additional.heartbeatMatch.isPassive) {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32727Mg(mo120828r3()).filter(new w9j() { // from class: l.gmz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), c22392aM221512b, new x9j() { // from class: l.tlz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.hmz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108518a.m204322Be(userM169430Pa, (j760) obj);
                }
            }, new e30() { // from class: l.imz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204272ra((Throwable) obj);
                }
            }));
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32727Mg(mo120828r3()).filter(new w9j() { // from class: l.jmz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204182Y7((Boolean) obj);
                }
            }).take(1), c22392aM221512b, new x9j() { // from class: l.tlz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.lmz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128948a.m204327Ce(userM169430Pa, (j760) obj);
                }
            }, new e30() { // from class: l.mmz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204253mb((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19642f0.m32699Jo().take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.qlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                }
            }, new e30() { // from class: l.rlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204281tb((Throwable) obj);
                }
            }));
        } else {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32691Jg(mo120828r3()).filter(new w9j() { // from class: l.slz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), c22392aM221512b, new x9j() { // from class: l.tlz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.ulz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177179a.m204332De(userM169430Pa, (j760) obj);
                }
            }, new e30() { // from class: l.vlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204199ba((Throwable) obj);
                }
            }));
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19642f0.m32691Jg(mo120828r3()).filter(new w9j() { // from class: l.wlz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204106Ja((Boolean) obj);
                }
            }).take(1), c22392aM221512b, new x9j() { // from class: l.tlz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.xlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193510a.m204336Ee(userM169430Pa, (j760) obj);
                }
            }, new e30() { // from class: l.ylz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204142Qa((Throwable) obj);
                }
            }));
        }
        final boolean z = conversationM32856Xe.additional.heartbeatMatch.isPassive;
        duringCreated(C22306c.combineLatest(mo120714U2().map(new w9j() { // from class: l.bmz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Conversation) obj).convType;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.cmz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, "default"));
            }
        }).take(1), c22392aM221512b, new dmz()).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.emz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92268a.m204341Fe(z, (j760) obj);
            }
        }, new e30() { // from class: l.fmz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204291v9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Uc */
    private void m204165Uc() {
        CoreModule.f17545c.f19642f0.m32726Mf(m120783i3());
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32820Ue(mo120828r3()).filter(new oa8()).first(), CoreModule.f17545c.f19639e0.m169418Ma(mo120828r3()).filter(new C21368yd()).first(), new x9j() { // from class: l.rmz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Conversation) obj, (User) obj2);
            }
        }).switchMap(new w9j() { // from class: l.smz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f165401a.m204356Ie((j760) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.tmz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204098I7((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m204169Va(Throwable th) {
    }

    /* JADX INFO: renamed from: W9 */
    public static /* synthetic */ void m204173W9(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wb */
    public static /* synthetic */ Boolean m204175Wb(xaj0 xaj0Var) {
        User user = (User) xaj0Var.f191751a;
        boolean zBooleanValue = ((Boolean) xaj0Var.f191752b).booleanValue();
        Message message = (Message) xaj0Var.f191753c;
        return Boolean.valueOf(NullChecker.m81303a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified() && !zBooleanValue && NullChecker.m81303a(message) && (message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人")));
    }

    /* JADX INFO: renamed from: Wc */
    private void m204176Wc() {
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.sjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164924a.m204371Le((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m204181Xb(dd80 dd80Var) {
        if (dd80Var == null || !dd80Var.isShowing()) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149352d3.put(mqi0.m155949t());
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: Y7 */
    public static /* synthetic */ Boolean m204182Y7(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b9 */
    public static /* synthetic */ void m204198b9(Boolean bool) {
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ void m204199ba(Throwable th) {
    }

    /* JADX INFO: renamed from: bc */
    public static /* synthetic */ void m204201bc(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: da */
    public static /* synthetic */ Boolean m204209da(j760 j760Var, a9m a9mVar) {
        try {
            return Boolean.valueOf(a9mVar.mo95447a((Conversation) j760Var.f116564a, (User) j760Var.f116565b));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            au2.m98935w(e);
            e.toString();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ Boolean m204214ea(xaj0 xaj0Var) {
        User user = (User) xaj0Var.f191751a;
        return Boolean.valueOf(NullChecker.m81303a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified() && !((Boolean) xaj0Var.f191752b).booleanValue() && vwb.m200337m(vwb.m200334k0((List) xaj0Var.f191753c, 5), new w9j() { // from class: l.miz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人"));
            }
        }));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m204215eb(Throwable th) {
    }

    /* JADX INFO: renamed from: fc */
    public static /* synthetic */ void m204221fc(Throwable th) {
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ Boolean m204229ha(Conversation conversation, Boolean bool, Boolean bool2) {
        if (TextUtils.isEmpty(conversation.clearedUntil) || TextUtils.equals(conversation.clearedUntil, "0")) {
            return Boolean.valueOf((NullChecker.m81303a(bool) && bool.booleanValue() && NullChecker.m81303a(bool2) && bool2.booleanValue()) ? false : true);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hb */
    public static /* synthetic */ void m204230hb(Throwable th) {
    }

    /* JADX INFO: renamed from: j9 */
    public static /* synthetic */ void m204237j9(Throwable th) {
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m204239jb(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k8 */
    public static /* synthetic */ Boolean m204241k8(ChatHeat chatHeat, ChatHeat chatHeat2) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49175e = NullChecker.m81303a(chatHeat) ? MessageWarmingUpHelper.m49175e(chatHeat) : null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49175e2 = NullChecker.m81303a(chatHeat2) ? MessageWarmingUpHelper.m49175e(chatHeat2) : null;
        return Boolean.valueOf(NullChecker.m81303a(warmingUpLevelM49175e2) && warmingUpLevelM49175e2 == warmingUpLevelM49175e);
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m204243ka(Throwable th) {
    }

    /* JADX INFO: renamed from: kb */
    public static /* synthetic */ void m204244kb() {
        if (CoreModule.f17545c.f19639e0.f149382h1.get().booleanValue()) {
            CoreModule.f17545c.f19639e0.f149382h1.put(Boolean.FALSE);
            CoreModule.f17545c.f19639e0.f149390i1.clear();
        }
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ void m204253mb(Throwable th) {
    }

    /* JADX INFO: renamed from: n9 */
    public static /* synthetic */ Boolean m204255n9(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: o8 */
    public static /* synthetic */ void m204258o8(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q8 */
    public static /* synthetic */ void m204266q8() {
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m204271r9(Message message) {
        ij8 ij8Var = CoreModule.f17545c.f19680r2;
        ij8Var.f113531l0 = 0;
        ij8Var.f113530k0.clear();
    }

    /* JADX INFO: renamed from: ra */
    public static /* synthetic */ void m204272ra(Throwable th) {
    }

    /* JADX INFO: renamed from: tb */
    public static /* synthetic */ void m204281tb(Throwable th) {
    }

    /* JADX INFO: renamed from: td */
    private void m204282td() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203492a.m204337Ef((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: tg */
    private void m204283tg(boolean z) {
        m156455e0().mo48954A0().m156457g0().m128211t1(z);
    }

    /* JADX INFO: renamed from: v9 */
    public static /* synthetic */ void m204291v9(Throwable th) {
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m204292va(PutongAct putongAct) {
        MessagesAct messagesAct = (MessagesAct) putongAct;
        if (NullChecker.m81303a(messagesAct.mo48974l().m120842t7().f171745n1)) {
            messagesAct.mo48974l().m120842t7().f171745n1.setSelectionHook(messagesAct.mo48974l().m120842t7().f171745n1.getCountHook());
        }
    }

    /* JADX INFO: renamed from: vb */
    public static /* synthetic */ void m204293vb(Throwable th) {
    }

    /* JADX INFO: renamed from: vd */
    private void m204294vd() {
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().filter(new w9j() { // from class: l.uiz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210043F3());
            }
        }).flatMap(new w9j() { // from class: l.viz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181647a.m204347Gf((UserPrivilege) obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.wiz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186586a.m204357If((ODiamondVisitorInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m204297w9(Throwable th) {
    }

    /* JADX INFO: renamed from: wa */
    public static /* synthetic */ void m204298wa(ChatHeat chatHeat) {
        final ChatHeat chatHeatMo223809clone = chatHeat.mo223809clone();
        chatHeatMo223809clone.levelUp = false;
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.pjz
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91956s.upsert(chatHeatMo223809clone);
            }
        });
    }

    /* JADX INFO: renamed from: wb */
    public static /* synthetic */ ChatHeat m204299wb(ChatHeat chatHeat) {
        if (chatHeat == null) {
            return null;
        }
        return chatHeat.mo223809clone();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ void m204305y7(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: yb */
    public static /* synthetic */ Integer m204309yb(j760 j760Var) {
        return (Integer) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m204311z8(Throwable th) {
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m204312z9(Location location) {
    }

    /* JADX INFO: renamed from: Ac */
    public final void m204315Ac() {
        String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(strMo120828r3), CoreModule.f17545c.f19639e0.m169414La(strMo120828r3), new x9j() { // from class: l.xjz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (GPMemo) obj2);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.yjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198699a.m204428Yd((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ad */
    public final void m204316Ad() {
        if (CoreModule.m29935P().m94651a().mo33443Xn()) {
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_ux_questionnaire);
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_ux_questionnaire_tip);
            int iMo33515hn = CoreModule.m29935P().m94651a().mo33515hn();
            int iMo33420Tm = CoreModule.m29935P().m94651a().mo33420Tm();
            Random random = new Random();
            if (iMo33515hn == iMo33420Tm) {
                this.f187212d1 = iMo33515hn;
            } else if (iMo33515hn < iMo33420Tm) {
                this.f187212d1 = random.nextInt(iMo33420Tm - iMo33515hn) + iMo33515hn;
            } else {
                this.f187212d1 = random.nextInt(iMo33515hn - iMo33420Tm) + iMo33420Tm;
            }
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(m120783i3());
            if (NullChecker.m81303a(userM169430Pa) && !userM169430Pa.isTeamAccount()) {
                CoreModule.f17545c.f19689u2.f175591X.put(Long.valueOf(mqi0.m155944o()));
            }
            this.f187213e1 = new hpd0("ux_questionnaire_showed" + CoreModule.m29931H().userId() + "/" + mo120828r3(), Boolean.FALSE);
            if (mo120764e4() || !NullChecker.m81303a(userM169430Pa) || userM169430Pa.isTeamAccount() || userM169430Pa.unilateralBlock() || userM169430Pa.isAccountCancellation() || userM169430Pa.isFakeUser() || userM169430Pa.isBannedNew() || !NullChecker.m81303a(conversationM32856Xe) || conversationM32856Xe.isQuickChatConv() || this.f187213e1.get().booleanValue()) {
                return;
            }
            duringCreated(mo120714U2().distinctUntilChanged().filter(new w9j() { // from class: l.kmz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f123849a.m204381Nf((Conversation) obj);
                }
            }).flatMap(new w9j() { // from class: l.vmz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19689u2.m192750c3(QuestionnaireScene.get(QuestionnaireScene.messageDetail), null);
                }
            }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.zcz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202606a.m204386Of((Questionnaire) obj);
                }
            }, new e30() { // from class: l.kdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204230hb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ae */
    public final /* synthetic */ void m204317Ae(C4319c c4319c) {
        final dd80 dd80VarM110960O = act().newDialog().m110964S(c3c0.f78486C0).m110996y0("功能全新升级").m110991t0("本次聊天需要消耗一次闪聊次数").m110961P(false).m110958M(false).m110973b0("同意并聊天").m110968W("不同意").m110960O();
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.yhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f198425a.m204547ze(dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.zhz
            @Override // java.lang.Runnable
            public final void run() {
                wmz.m204181Xb(dd80VarM110960O);
            }
        });
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: Af */
    public final /* synthetic */ void m204318Af(PurchaseType purchaseType) {
        boolean z = !xma.m210071e4();
        if (NullChecker.m81303a(((bpz) this.viewModel).f76696Q1)) {
            ((bpz) this.viewModel).f76696Q1.m191245t(z);
        }
    }

    /* JADX INFO: renamed from: Ag */
    public final void m204319Ag(String str, String str2) {
        r5l0 r5l0Var = new r5l0(str);
        if (!NullChecker.m81303a(r5l0Var.f157830a)) {
            lsi0.m151578h(R$string.f20727C2);
            return;
        }
        if (r5l0Var.f157831b > Constants.ONE_MIN_IN_MILLIS) {
            lsi0.m151578h(R$string.f20865T4);
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.media = new ArrayList();
        Video video = new Video();
        video.url = rhi.m179355B(r5l0Var.f157830a);
        video.status = MediaLocalStatus.get("raw");
        messageNew_.media.add(video);
        messageNew_.messageType = MessageType.get(MessageType.real_shot);
        messageNew_.value = str2;
        m120707S5(messageNew_);
    }

    /* JADX INFO: renamed from: Bc */
    public final void m204320Bc() {
        CoreModule.f17545c.f19642f0.m32714Lf(m120783i3());
        if (TextUtils.isEmpty(this.f187219k1) && y19.m212149I()) {
            duringCreated(mo120833s3(this.f96910b).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.lkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128627a.m204432Zd((User) obj);
                }
            }, new e30() { // from class: l.mkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204081Eb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Bd */
    public final void m204321Bd() {
        if (CoreModule.f17554l.m94656g().mo35052d4()) {
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_visitor_hide_footprint);
            duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_visitor_hide_footprint)), CoreModule.f17545c.f19668n2.m175431H3(mo120828r3()), new y9j() { // from class: l.adz
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((User) obj, (Boolean) obj2, (Optional) obj3);
                }
            }).filter(new w9j() { // from class: l.bdz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f75088a.m204391Pf((xaj0) obj);
                }
            }).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.cdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80423a.m204396Qf((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Be */
    public final /* synthetic */ void m204322Be(User user, j760 j760Var) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(mo120828r3());
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isHeartbeatConv() && CoreModule.m29935P().m94658i().mo33602uh() && !user.unilateralBlock()) {
            ((bpz) this.viewModel).m190254H0();
            ((bpz) this.viewModel).m190293c2("后消失，快去打个招呼吧");
        }
    }

    /* JADX INFO: renamed from: Bf */
    public final /* synthetic */ C22306c m204323Bf() {
        return m120794k4(mo120828r3()) ? CoreModule.f17545c.f19642f0.m32772Pp() : C22306c.just("");
    }

    /* JADX INFO: renamed from: Bg */
    public final void m204324Bg() {
        FrameLayout frameLayout;
        View viewM127524j;
        Conversation conversationM120788j3 = m120788j3();
        if (conversationM120788j3 == null || act() == null || act().getWindow() == null || m204527vc() == null) {
            return;
        }
        m204338Eg();
        gq5 gq5Var = new gq5(act(), conversationM120788j3);
        this.f187203U0 = gq5Var;
        if (!gq5Var.m127534t() || (viewM127524j = this.f187203U0.m127524j((frameLayout = (FrameLayout) act().getWindow().getDecorView().findViewById(y4c0.f196081Z)), m204527vc())) == null) {
            return;
        }
        frameLayout.addView(viewM127524j);
        if (this.f187205W0) {
            return;
        }
        this.f187203U0.m127533s(false);
        this.f187205W0 = true;
    }

    /* JADX INFO: renamed from: Cc */
    public final void m204325Cc() {
        creates(new e30() { // from class: l.pez
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148506a.m204436ae((Bundle) obj);
            }
        }, new d30() { // from class: l.qez
            @Override // p149l.d30
            public final void call() {
                wmz.m204069C9();
            }
        });
    }

    /* JADX INFO: renamed from: Cd */
    public final void m204326Cd() {
        if (nlm0.m160070c()) {
            ((bpz) this.viewModel).m103213W3(true);
        }
    }

    /* JADX INFO: renamed from: Ce */
    public final /* synthetic */ void m204327Ce(User user, j760 j760Var) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(mo120828r3());
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isHeartbeatConv()) {
            if (CoreModule.m29935P().m94658i().mo33602uh() && !user.unilateralBlock()) {
                ((bpz) this.viewModel).m190254H0();
                boolean zIsLimitMatch = conversationM32856Xe.isLimitMatch();
                V v2 = this.viewModel;
                if (zIsLimitMatch) {
                    ((bpz) v2).m190293c2("内发送消息即可解锁限时");
                } else {
                    ((bpz) v2).m190293c2("内可以回应他，即可解除限时");
                }
            }
            if (conversationM32856Xe.isLimitMatch()) {
                return;
            }
            CoreModule.f17545c.f19571H1.m201073f4(mo120828r3());
        }
    }

    /* JADX INFO: renamed from: Cf */
    public final /* synthetic */ void m204328Cf(String str) {
        m156455e0().mo48959E().mo137244s0();
        m156455e0().mo48954A0().m210933p2(true);
        if (lifecycle_() == C4319c.f15548i) {
            lsi0.m151593w(R$string.f20826O5);
        }
    }

    /* JADX INFO: renamed from: Cg */
    public final void m204329Cg() {
        if (!CoreModule.m29935P().m94658i().mo158348b() || TextUtils.isEmpty(mo120828r3())) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3())).take(1).filter(new w9j() { // from class: l.qhz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).isTeamAccount());
            }
        }).flatMap(new w9j() { // from class: l.shz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164662a.m204450dg((User) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.thz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wmz.m204116La((Conversation) obj);
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.uhz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176608a.m204454eg((Conversation) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.vhz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181543a.m204458fg((List) obj);
            }
        }, new e30() { // from class: l.whz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204127Na((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Dc */
    public final void m204330Dc() {
        if (User.isBusinessAI1V1(mo120828r3())) {
            CoreModule.f17545c.f19555C0.m210115x4();
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m204331Dd() {
        if (mo158961wg()) {
            duringCreated(C22306c.combineLatest(tqm0.m190131p().m190137i().distinctUntilChanged().observeOn(jo0.m142408a()), this.f187195M0, new x9j() { // from class: l.hkz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Integer) obj, (roj0) obj2);
                }
            }).map(new w9j() { // from class: l.skz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204309yb((j760) obj);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.dlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86885a.m204401Rf((Integer) obj);
                }
            }));
            duringCreated(tqm0.m190131p().m190132A().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.olz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144570a.m204405Sf((Integer) obj);
                }
            }));
            e51.m114743H(act(), new Runnable() { // from class: l.zlz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203680a.m204410Tf();
                }
            }, 700L);
        }
    }

    /* JADX INFO: renamed from: De */
    public final /* synthetic */ void m204332De(User user, j760 j760Var) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(mo120828r3());
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isHeartbeatConv() && CoreModule.m29935P().m94658i().mo33602uh() && !user.unilateralBlock()) {
            ((bpz) this.viewModel).m190254H0();
            ((bpz) this.viewModel).m190293c2(String.format("未和%s发送消息，将解除匹配", (NullChecker.m81303a(user) && user.isFemale()) ? "她" : "他"));
        }
    }

    /* JADX INFO: renamed from: Df */
    public final /* synthetic */ void m204333Df(Throwable th) {
        m156455e0().mo48954A0().m210933p2(false);
        if (lifecycle_() == C4319c.f15548i) {
            lsi0.m151593w(R$string.f20818N5);
        }
    }

    /* JADX INFO: renamed from: Dg */
    public void m204334Dg() {
        this.f187196N0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Ec */
    public final void m204335Ec() {
        CoreModule.f17545c.f19642f0.m32602Cf(m120783i3());
        if (TextUtils.isEmpty(this.f187219k1) && m204530vg()) {
            duringCreated(CoreModule.f17545c.f19611U1.m101522h3("icebreak")).subscribe(mkd0.m154956H(new e30() { // from class: l.vgz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181460a.m204440be((List) obj);
                }
            }, new e30() { // from class: l.wjz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204237j9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ee */
    public final /* synthetic */ void m204336Ee(User user, j760 j760Var) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(m120783i3());
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isHeartbeatConv()) {
            if (CoreModule.m29935P().m94658i().mo33602uh() && !user.unilateralBlock()) {
                ((bpz) this.viewModel).m190254H0();
                ((bpz) this.viewModel).m190293c2("内对方回复即可匹配");
            }
            if (conversationM32856Xe.isLimitMatch()) {
                return;
            }
            CoreModule.f17545c.f19571H1.m201073f4(mo120828r3());
        }
    }

    /* JADX INFO: renamed from: Ef */
    public final /* synthetic */ void m204337Ef(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && mo120799l4()) {
            CoreModule.m29935P().m94658i().mo158278N5(mo120828r3());
        } else if (c4319c == C4319c.f15552m) {
            CoreModule.m29935P().m94658i().mo158480z2();
        }
    }

    /* JADX INFO: renamed from: Eg */
    public final void m204338Eg() {
        gq5 gq5Var = this.f187203U0;
        if (gq5Var != null) {
            gq5Var.m127532r();
            this.f187203U0 = null;
        }
    }

    /* JADX INFO: renamed from: Fc */
    public final void m204339Fc() {
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).filter(new w9j() { // from class: l.fdz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new w9j() { // from class: l.gdz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).ageVerificationInfo;
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.hdz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107321a.m204444ce((AgeVerificationInfo) obj);
            }
        }));
        if (IntlCountryCodeController.m28118n()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), mkd0.m154985s(CoreModule.f17545c.f19642f0.m32737Ne(mo120828r3()), CoreModule.f17545c.f19642f0.m32679Ig(mo120828r3()), CoreModule.f17545c.f19642f0.m32727Mg(mo120828r3()), new y9j() { // from class: l.idz
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return wmz.m204229ha((Conversation) obj, (Boolean) obj2, (Boolean) obj3);
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.jdz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return j760.m140076a((User) obj, (Boolean) obj2);
                }
            })).map(new w9j() { // from class: l.ldz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f127626a.m204448de((j760) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.mdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133330a.m204452ee((Boolean) obj);
                }
            }));
            duringCreated(this.f187194L0).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ndz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138567a.m204456fe((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fd */
    public final void m204340Fd() {
        if (CoreModule.m29935P().m94651a().mo158419o0()) {
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_wechat_notify_guide);
            duringCreated(mkd0.m154986t(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_wechat_notify_guide)), CoreModule.f17545c.f19642f0.m33176wn(), CoreModule.f17545c.f19639e0.f149204K1, new z9j() { // from class: l.qcz
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return xaj0.m207578a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new w9j() { // from class: l.rcz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f158845a.m204414Uf((xaj0) obj);
                }
            }).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.scz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163794a.m204419Vf((xaj0) obj);
                }
            }));
            duringCreated(C22306c.combineLatest(Act.foreground().map(new ua20()).distinctUntilChanged().filter(new w9j() { // from class: l.tcz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204255n9((Boolean) obj);
                }
            }).switchMap(new w9j() { // from class: l.ucz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169438Ra();
                }
            }), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_wechat_notify_guide)), new x9j() { // from class: l.vcz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return vwb.m200311Y((WechatNotifySetting) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.wcz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185745a.m204422Wf((j760) obj);
                }
            }, new e30() { // from class: l.xcz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204105J9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fe */
    public final /* synthetic */ void m204341Fe(boolean z, j760 j760Var) {
        if (CoreModule.m29935P().m94658i().mo33602uh()) {
            ((bpz) this.viewModel).m190336w0();
        }
        CoreModule.f17545c.f19571H1.m201042A3(this.f96911c, z);
    }

    /* JADX INFO: renamed from: Ff */
    public final /* synthetic */ void m204342Ff(C4319c c4319c) {
        if (NullChecker.m81303a(((bpz) this.viewModel).f76696Q1) && NullChecker.m81303a(((bpz) this.viewModel).f76696Q1.m191247v()) && xdl0.m208349O0(((bpz) this.viewModel).f76696Q1.m191247v()) && TextUtils.equals(this.f96910b, C4740g.f19836Y2)) {
            CoreModule.m29935P().m94658i().mo33362Lf(act(), "p_messages,knowbetter", Privilege.unlock_learn_about_him_module, null, null);
            zvf0.m220396r("e_know_him_better_guide", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: Fg */
    public final void m204343Fg() {
        if (ura.m195053e().m195057d().mo33884mj()) {
            duringCreated(mo120714U2().first()).subscribe(mkd0.m154955G(new e30() { // from class: l.qmz
                @Override // p149l.e30
                public final void call(Object obj) {
                    i36.m134149g().m134152f(((Conversation) obj).f56011id);
                }
            }));
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: G6 */
    public void mo120654G6() {
        super.mo120654G6();
        CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_o_diamond_visitor_guide);
    }

    /* JADX INFO: renamed from: Gc */
    public final void m204344Gc() {
        User userM169430Pa;
        if (!CoreModule.m29935P().m94658i().mo158279O2() || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b)) == null || userM169430Pa.isTeamAccount() || userM169430Pa.isBanned() || userM169430Pa.isBannedNew() || userM169430Pa.isAccountCancellation()) {
            return;
        }
        Keyboard keyboardMo134702a = m156455e0().mo48971c0().m156457g0().mo134702a();
        if (NullChecker.m81303a(keyboardMo134702a)) {
            keyboardMo134702a.m48799C();
        }
        duringCreated(m156455e0().mo48971c0().m213065x0()).subscribe(mkd0.m154955G(new e30() { // from class: l.glz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103415a.m204460ge((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Gd */
    public boolean m204345Gd() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
        if (CoreModule.f17554l.m94658i().mo33304De()) {
            return !NullChecker.m81303a(userM169430Pa) || userM169430Pa.inactivated || userM169430Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN));
        }
        return false;
    }

    /* JADX INFO: renamed from: Ge */
    public final /* synthetic */ void m204346Ge(View view) {
        m204489nc();
    }

    /* JADX INFO: renamed from: Gf */
    public final /* synthetic */ C22306c m204347Gf(UserPrivilege userPrivilege) {
        return CoreModule.f17545c.f19668n2.m175430G3(mo120828r3());
    }

    /* JADX INFO: renamed from: Gg */
    public final void m204348Gg(List<Message> list) {
        if (!ruy.m181215g().m181218e(mo120828r3()) || this.f187221m1) {
            return;
        }
        this.f187221m1 = true;
        ruy.m181215g().f161150a.put(mo120828r3());
        Iterator<Message> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().messageType.toString();
            string.getClass();
            String str = "location";
            switch (string) {
                case "question":
                    str = "question";
                    break;
                case "tickle":
                    str = "tickle";
                    break;
                case "picture":
                    str = "picture";
                    break;
                case "voice_call_invitation":
                    str = "voice_call_invitation";
                    break;
                case "text":
                    str = "text";
                    break;
                case "audio":
                    str = "audio";
                    break;
                case "video":
                    str = "video";
                    break;
                case "location":
                    break;
                default:
                    str = "";
                    break;
            }
            zvf0.m220368A("e_secret_message", pageId(), vwb.m200311Y("other_user_id", mo120828r3()), vwb.m200311Y(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, str));
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: H6 */
    public void mo120659H6() {
        super.mo120659H6();
        CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_platinum_pin_guide);
    }

    /* JADX INFO: renamed from: Hc */
    public final void m204349Hc() {
        User userM169430Pa;
        if (!CoreModule.m29935P().m94658i().mo158314U3() || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b)) == null || userM169430Pa.isTeamAccount() || userM169430Pa.isBanned() || userM169430Pa.isBannedNew() || userM169430Pa.isAccountCancellation()) {
            return;
        }
        duringCreated(mo120714U2().map(new w9j() { // from class: l.qgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MessageWarmingUpHelper.m49176f(((Conversation) obj).f20374mm);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.rgz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159305a.m204464he((MessageWarmingUpHelper.WarmingUpLevel) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19586M1.m215249s3(mo120828r3()).filter(new w9j() { // from class: l.sgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((ChatHeat) obj));
            }
        }).distinctUntilChanged(new x9j() { // from class: l.tgz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return wmz.m204241k8((ChatHeat) obj, (ChatHeat) obj2);
            }
        }).observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.wgz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186349a.m204469ie((ChatHeat) obj);
            }
        }));
        duringCreated(mkd0.m154986t(CoreModule.f17545c.f19586M1.m215249s3(this.f96910b).distinctUntilChanged().map(new w9j() { // from class: l.xgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wmz.m204299wb((ChatHeat) obj);
            }
        }), CoreModule.f17545c.f19642f0.m32737Ne(this.f96910b), CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b), CoreModule.f17553k.f91940c.m206086r0(this.f96910b, MessageType.chat_gift).m165620m(), new z9j() { // from class: l.ygz
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return vwb.m200312Z((ChatHeat) obj, (Conversation) obj2, (User) obj3, (List) obj4);
            }
        }).observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.zgz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203110a.m204472je((knb0) obj);
            }
        }));
        duringCreated(m156455e0().mo48971c0().m213065x0()).subscribe(mkd0.m154955G(new e30() { // from class: l.ahz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69946a.m204476ke((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Hd */
    public final boolean m204350Hd() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
        if (NullChecker.m81303a(userM169430Pa)) {
            return userM169430Pa.onlineMatchLocked();
        }
        return false;
    }

    /* JADX INFO: renamed from: He */
    public final /* synthetic */ void m204351He(Message message) {
        if (CoreModule.m29935P().m94658i().mo33602uh()) {
            ((bpz) this.viewModel).m190336w0();
        }
        if (TextUtils.equals(message.cid, mo120828r3())) {
            new xh0.C21150a(act()).m208731j("对方已离开，是否要删除配对？").m208739r("是").m208736o(new View.OnClickListener() { // from class: l.piz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149694a.m204346Ge(view);
                }
            }).m208727f("否").m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: Hf */
    public final /* synthetic */ void m204352Hf(ODiamondVisitorInfo oDiamondVisitorInfo) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((bpz) this.viewModel).f171758t1)) {
            VText vTextMo191241d = ((bpz) this.viewModel).f171758t1.mo191241d();
            if (NullChecker.m81303a(vTextMo191241d)) {
                xdl0.m208344M(vTextMo191241d, true);
                vTextMo191241d.setText(i0g0.m133861b0(String.format("%s\n%s", oDiamondVisitorInfo.visitCountStr, oDiamondVisitorInfo.visitTimeStr), vwb.m200324f0(oDiamondVisitorInfo.visitCount, oDiamondVisitorInfo.visitTime), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: Hg */
    public final boolean m204353Hg() {
        if (CoreModule.m29935P().m94651a().mo158419o0() && NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.opened && fmp0.m122175g(App.f15369e).isWXAppInstalled()) {
            boolean z = (CoreModule.f17545c.f19639e0.f149204K1.m221515e() == null || !CoreModule.f17545c.f19639e0.f149204K1.m221515e().isPresent() || CoreModule.f17545c.f19639e0.f149204K1.m221515e().get().wechatLaunch == null) ? false : true;
            WechatNotifyConfig wechatNotifyConfigMo158333X3 = CoreModule.m29935P().m94651a().mo158333X3();
            boolean z2 = ConversationCounterTypeSp.wechatNotifyGuideShowCount.get(this.f96911c) > 0;
            boolean z3 = wechatNotifyConfigMo158333X3 != null && mqi0.m155929D(CoreModule.f17545c.f19639e0.f149434n5.get().longValue()) && CoreModule.f17545c.f19639e0.f149449p5.get().intValue() >= wechatNotifyConfigMo158333X3.message_daily_count;
            boolean z4 = wechatNotifyConfigMo158333X3 != null && CoreModule.f17545c.f19639e0.f149442o5.get().intValue() >= wechatNotifyConfigMo158333X3.message_total_count;
            if (z && !z2 && !z3 && !z4) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: I2 */
    public void mo120660I2(CoreGiftInfo coreGiftInfo) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || this.f96891H.contains(coreGiftInfo)) {
            return;
        }
        this.f96891H.add(coreGiftInfo);
        e51.m114741F(act(), new Runnable() { // from class: l.ljz
            @Override // java.lang.Runnable
            public final void run() {
                this.f128428a.m204365Kd();
            }
        });
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: I6 */
    public void mo120664I6() {
        super.mo120664I6();
        CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_visitor_hide_footprint);
    }

    /* JADX INFO: renamed from: Ic */
    public final void m204354Ic() {
        if (CoreModule.m29935P().m94651a().mo33531kb() && m120749b4()) {
            duringCreated(lz4.m152319h().m152326i().filter(new w9j() { // from class: l.odz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    xaj0 xaj0Var = (xaj0) obj;
                    return Boolean.valueOf(((Boolean) xaj0Var.f191751a).booleanValue() || ((Boolean) xaj0Var.f191752b).booleanValue() || !vwb.m200296J((Collection) ((j760) xaj0Var.f191753c).f116565b));
                }
            }).distinctUntilChanged(new x9j() { // from class: l.pdz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    xaj0 xaj0Var = (xaj0) obj;
                    return Boolean.valueOf(NullChecker.m81303a(xaj0Var) && ((j760) xaj0Var.f191753c).f116564a != ((j760) ((xaj0) obj2).f191753c).f116564a);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.qdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153981a.m204481le((xaj0) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19642f0.m32844We(this.f96910b).filter(new w9j() { // from class: l.rdz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.sdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163925a.m204486me((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Id */
    public final int m204355Id() {
        String strM79302F = RemoteConfig.m79298x().m79302F("ai_chat_advice_guide");
        if (TextUtils.isEmpty(strM79302F)) {
            return 3;
        }
        try {
            int iOptInt = new JSONObject(strM79302F).optInt("keyboardHangThreshold", 3);
            if (iOptInt != 0) {
                return iOptInt;
            }
            return 3;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Ie */
    public final /* synthetic */ C22306c m204356Ie(final j760 j760Var) {
        final ArrayList arrayListM200339n = vwb.m200339n(this.f187214f1, new w9j() { // from class: l.biz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wmz.m204209da(j760Var, (a9m) obj);
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return C22306c.just(Optional.absent());
        }
        vwb.m200342o0(arrayListM200339n, new w9j() { // from class: l.diz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((a9m) obj).getClass().getSimpleName();
            }
        }, " ,");
        return mkd0.m154982p(vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.eiz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((a9m) obj).mo95448b().onErrorReturn(new w9j() { // from class: l.ajz
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.FALSE;
                    }
                }).first();
            }
        }), new faj() { // from class: l.fiz
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return wmz.m204121Ma(arrayListM200339n, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: If */
    public final /* synthetic */ void m204357If(final ODiamondVisitorInfo oDiamondVisitorInfo) {
        CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_o_diamond_visitor_guide);
        if (TextUtils.isEmpty(oDiamondVisitorInfo.visitCountStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTimeStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitCount) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTime)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.hjz
            @Override // java.lang.Runnable
            public final void run() {
                this.f108137a.m204352Hf(oDiamondVisitorInfo);
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public final void m204358Ig() {
        CoreModule.f17545c.f19642f0.m32822Ug(m120783i3(), "guide_type_answer");
        CoreModule.f17545c.f19698x2.m220111r3(m120783i3());
    }

    /* JADX INFO: renamed from: Jc */
    public final void m204359Jc() {
        if (CoreModule.f17554l.m94658i().mo158403l()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()).filter(new C21368yd()), CoreModule.f17545c.f19642f0.m32737Ne(mo120828r3()), new gm20())).subscribe(mkd0.m154955G(new e30() { // from class: l.flz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98231a.m204491ne((j760) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Jd */
    public final /* synthetic */ Boolean m204360Jd(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var.f116564a) && TextUtils.isEmpty(this.f187210b1) && TEnum.equals(((Conversation) j760Var.f116564a).status, "default") && TextUtils.isEmpty(((Conversation) j760Var.f116564a).localDraft) && TextUtils.equals(((Conversation) j760Var.f116564a).convType, "default") && NullChecker.m81303a(j760Var.f116565b) && !((User) j760Var.f116565b).isTeamAccount() && !((User) j760Var.f116565b).isBannedNew() && !((User) j760Var.f116565b).isAccountCancellation());
    }

    /* JADX INFO: renamed from: Je */
    public final /* synthetic */ C22306c m204361Je(User user) {
        return CoreModule.f17545c.f19642f0.m32737Ne(this.f96910b);
    }

    /* JADX INFO: renamed from: Jf */
    public final /* synthetic */ void m204362Jf() {
        ((bpz) this.viewModel).m103252o5();
    }

    /* JADX INFO: renamed from: Jg */
    public final void m204363Jg() {
        duringCreated(CoreModule.f17545c.f19698x2.m220115v3(m120783i3())).subscribe(mkd0.m154956H(new e30() { // from class: l.ujz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176891a.m204462gg((AnalysisGuide) obj);
            }
        }, new e30() { // from class: l.vjz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204297w9((Throwable) obj);
            }
        }));
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: K6 */
    public void mo120674K6(IceBreakingQuestion iceBreakingQuestion) {
        if (NullChecker.m81303a(this.f187192J0)) {
            this.f187192J0.m176726D0(iceBreakingQuestion);
        }
    }

    /* JADX INFO: renamed from: Kc */
    public final void m204364Kc() {
        m204324Bg();
        if (this.f187204V0) {
            return;
        }
        this.f187204V0 = true;
        lifecycle().filter(new w9j() { // from class: l.okz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.pkz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150046a.m204496oe((C4319c) obj);
            }
        }, new e30() { // from class: l.qkz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204221fc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3().skip(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.rkz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159915a.m204501pe((List) obj);
            }
        }, new e30() { // from class: l.tkz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204311z8((Throwable) obj);
            }
        }));
        duringCreated(mo120709T2().skip(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.ukz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177001a.m204506qe((Conversation) obj);
            }
        }, new e30() { // from class: l.vkz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204149S7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Kd */
    public final /* synthetic */ void m204365Kd() {
        if (((bpz) this.viewModel).m103219Z3()) {
            return;
        }
        this.f96890G.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Ke */
    public final /* synthetic */ void m204366Ke(Conversation conversation) {
        if (!mqi0.m155929D(CoreModule.f17545c.f19680r2.f113532m0)) {
            ij8 ij8Var = CoreModule.f17545c.f19680r2;
            ij8Var.f113531l0 = 0;
            ij8Var.f113530k0.clear();
        }
        if (CoreModule.f17545c.f19680r2.f113530k0.contains(mo120828r3())) {
            return;
        }
        CoreModule.f17545c.f19680r2.f113530k0.add(mo120828r3());
        ij8 ij8Var2 = CoreModule.f17545c.f19680r2;
        ij8Var2.f113531l0++;
        ij8Var2.f113532m0 = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: Kf */
    public final /* synthetic */ void m204367Kf(Bundle bundle) {
        e51.m114743H(((bpz) this.viewModel).act(), new Runnable() { // from class: l.hhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f107863a.m204362Jf();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: Kg */
    public void m204368Kg() {
        ArrayList arrayList = new ArrayList();
        if (this.f187208Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169501j7(m120783i3(), "", arrayList).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.qjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155016a.m204466hg((List) obj);
            }
        }, new e30() { // from class: l.rjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159764a.m204470ig((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Lc */
    public final void m204369Lc() {
        if (CoreModule.m29935P().m94658i().mo33383O8()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169426Oa(this.f96910b)).subscribe(mkd0.m154956H(new e30() { // from class: l.wkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204239jb((roj0) obj);
                }
            }, new e30() { // from class: l.xkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204243ka((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ld */
    public final /* synthetic */ void m204370Ld(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Le */
    public final /* synthetic */ void m204371Le(List list) {
        mtm.m156263n().m156267k(this.f96919k, null, m204527vc());
    }

    /* JADX INFO: renamed from: Lf */
    public final /* synthetic */ void m204372Lf(roj0 roj0Var) {
        ((bpz) this.viewModel).f171758t1.mo129346k();
    }

    /* JADX INFO: renamed from: Lg */
    public final void m204373Lg(final boolean z) {
        if (CoreModule.m29935P().m94658i().mo158284P0()) {
            CoreModule.m29935P().m94658i().mo158370e5(act(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.jiz
                @Override // p149l.d30
                public final void call() {
                    this.f118209a.m204478kg(z);
                }
            }, new d30() { // from class: l.kiz
                @Override // p149l.d30
                public final void call() {
                    this.f123417a.m204483lg();
                }
            });
        } else {
            m204467ic(z, new e30() { // from class: l.liz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128270a.m204488mg((Boolean) obj);
                }
            });
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: M2 */
    public void mo120679M2(final PutongAct putongAct) {
        super.mo120679M2(putongAct);
        if (this.f187217i1) {
            putongAct.postDelayed(new Runnable() { // from class: l.khz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m204292va(putongAct);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: Md */
    public final /* synthetic */ void m204374Md(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Me */
    public final /* synthetic */ void m204375Me(roj0 roj0Var) {
        ((bpz) this.viewModel).m103241j5("test", "他近期發佈過疑似廣告信息，聊天請謹慎");
    }

    /* JADX INFO: renamed from: Mf */
    public final /* synthetic */ void m204376Mf(Message message) {
        if (message.isMe()) {
            m204504qc(message);
        }
    }

    /* JADX INFO: renamed from: Mg */
    public void m204377Mg(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m49192v("warming up start");
        this.f187198P0 = true;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49188r = MessageWarmingUpHelper.m49188r(chatHeat.degree);
        if (warmingUpLevelM49188r == null || warmingUpLevelM49188r == MessageWarmingUpHelper.WarmingUpLevel.not) {
            this.f187198P0 = false;
            return;
        }
        if (chatHeat.levelUp) {
            warmingUpLevelM49188r = warmingUpLevelM49188r.pre();
        }
        m120742Z6(warmingUpLevelM49188r);
        m120747a7(chatHeat.degree);
        m204082Ed(warmingUpLevelM49188r);
        e51.m114743H(act(), new Runnable() { // from class: l.jhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f118035a.m204493ng(chatHeat);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Nc */
    public final void m204378Nc() {
        if (y19.m212160T()) {
            creates(new e30() { // from class: l.xdz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204305y7((Bundle) obj);
                }
            }, new d30() { // from class: l.ydz
                @Override // p149l.d30
                public final void call() {
                    this.f197651a.m204520te();
                }
            });
            duringCreated(C22306c.combineLatest(mo120833s3(mo120828r3()), mo120714U2(), new gm20()).first().filter(new w9j() { // from class: l.zdz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(!((User) j760Var.f116564a).isTeamAccount() && TextUtils.equals("default", ((Conversation) j760Var.f116565b).convType));
                }
            })).observeOn(Schedulers.m221493io()).subscribe(mkd0.m154956H(new e30() { // from class: l.aez
                @Override // p149l.e30
                public final void call(Object obj) {
                    j760 j760Var = (j760) obj;
                    CoreModule.f17545c.f19642f0.m32588Be((User) j760Var.f116564a, (Conversation) j760Var.f116565b);
                }
            }, new e30() { // from class: l.bez
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204148Rb((Throwable) obj);
                }
            }));
            final dd80[] dd80VarArr = new dd80[1];
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged(), mo120714U2(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new z9j() { // from class: l.cez
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new knb0((User) obj, (VerificationCenter) obj2, (Conversation) obj3, (User) obj4);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.dez
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85869a.m204528ve(dd80VarArr, (knb0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Nd */
    public final /* synthetic */ void m204379Nd() {
        if (this.f187218j1 != null) {
            this.f187218j1 = null;
            ((bpz) this.viewModel).m190304g2();
            return;
        }
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        this.f187218j1 = userLiveLabel;
        userLiveLabel.buttonTitle = "进入直播间";
        userLiveLabel.userId = mo120828r3();
        this.f187218j1.mainTitle = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).isFemale() ? "她正在视频直播" : "他正在视频直播";
        this.f187218j1.subTitle = "多人连线已开启，等你加入";
        ((bpz) this.viewModel).m190304g2();
    }

    /* JADX INFO: renamed from: Ne */
    public final /* synthetic */ void m204380Ne(CoreData coreData) {
        if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.userRisk) && !TextUtils.isEmpty(coreData.userRisk.text)) {
            bpz bpzVar = (bpz) this.viewModel;
            RiskOtherData riskOtherData = coreData.userRisk;
            bpzVar.m103241j5(riskOtherData.type, riskOtherData.text);
        }
    }

    /* JADX INFO: renamed from: Nf */
    public final /* synthetic */ Boolean m204381Nf(Conversation conversation) {
        return Boolean.valueOf(conversation.f20374mm >= this.f187212d1 && CoreModule.m29935P().m94651a().mo33604un());
    }

    /* JADX INFO: renamed from: Ng */
    public final void m204382Ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m49192v("tempDownAnim = " + chatHeat.toJson());
        e51.m114774y(new Runnable() { // from class: l.ijz
            @Override // java.lang.Runnable
            public final void run() {
                this.f113617a.m204503pg(chatHeat);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m204383Oc() {
        duringCreated(this.f96890G).subscribe(mkd0.m154955G(new e30() { // from class: l.ddz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85688a.m204537xe(obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.edz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90654a.m204542ye((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Od */
    public final /* synthetic */ void m204384Od() {
        ((bpz) this.viewModel).m103254p5(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: Oe */
    public final /* synthetic */ void m204385Oe(xaj0 xaj0Var) {
        CoreModule.f17545c.f19642f0.m32977hh(mo120828r3());
    }

    /* JADX INFO: renamed from: Of */
    public final /* synthetic */ void m204386Of(Questionnaire questionnaire) {
        if (questionnaire != null && CoreModule.m29935P().m94651a().mo33604un()) {
            this.f187213e1.put(Boolean.TRUE);
            CoreModule.f17545c.f19689u2.f175589V.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19689u2.f175590W.m189988a(1);
            CoreModule.f17545c.f19642f0.m33054nh(this.f96911c, questionnaire);
        }
    }

    /* JADX INFO: renamed from: Og */
    public final void m204387Og(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m49192v("tempUpAnim start fromLevel = " + warmingUpLevel + " nextLevel = " + warmingUpLevel2 + " chatHeat = " + chatHeat.toJson());
        duringCreated(CoreModule.f17545c.f19586M1.m215238A3(this.f96910b).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.fjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98015a.m204508qg(chatHeat, warmingUpLevel, warmingUpLevel2, (roj0) obj);
            }
        }, new e30() { // from class: l.gjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103112a.m204513rg((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Pc */
    public final void m204388Pc() {
        if (CoreModule.m29935P().m94658i().mo158402k5()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169422Na(this.f96910b)).subscribe(mkd0.m154956H(new e30() { // from class: l.hlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204101Ia((roj0) obj);
                }
            }, new e30() { // from class: l.ilz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204065Ba((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Pd */
    public final /* synthetic */ void m204389Pd() {
        CoreModule.f17545c.f19631b1.f121927S.put(Boolean.FALSE);
        ((bpz) this.viewModel).m103259r5();
    }

    /* JADX INFO: renamed from: Pe */
    public final /* synthetic */ void m204390Pe(xaj0 xaj0Var) {
        CoreModule.f17545c.f19642f0.m32977hh(mo120828r3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Pf */
    public final /* synthetic */ Boolean m204391Pf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.m101755e((User) xaj0Var.f191751a) && bh0.m101754d(this.f96919k) && !((Boolean) xaj0Var.f191752b).booleanValue());
    }

    /* JADX INFO: renamed from: Pg */
    public final void m204392Pg() {
        if (TextUtils.isEmpty(mo120828r3()) || !TextUtils.equals(mo120828r3(), CoreModule.f17554l.m94658i().mo158383h())) {
            return;
        }
        CoreModule.f17554l.m94658i().mo158246I3(m120783i3());
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: Q2 */
    public boolean mo120695Q2(Message message, boolean z, Sticker sticker) {
        return super.mo120695Q2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Qc */
    public final void m204393Qc() {
        CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_heart_beat_lock_tip);
        if (y19.m212155O()) {
            hpd0 hpd0Var = new hpd0("heart_beat_lock_message_showed_" + CoreModule.m29931H().userId() + "/" + mo120828r3(), Boolean.FALSE);
            if (NullChecker.m81303a(this.f96919k) && this.f96919k.isHeartbeatConv() && !this.f96919k.isLimitMatch() && this.f96919k.isHeartBeatLock() && !hpd0Var.get().booleanValue()) {
                hpd0Var.put(Boolean.TRUE);
                CoreModule.f17545c.f19642f0.m32906bh(this.f96911c, MessageType.get(MessageType.local_heart_beat_lock_tip), "本次聊天需要消耗1次心动次数", null);
            }
        }
    }

    /* JADX INFO: renamed from: Qd */
    public final /* synthetic */ void m204394Qd() {
        CoreModule.f17545c.f19642f0.m32977hh(mo120828r3());
    }

    /* JADX INFO: renamed from: Qe */
    public final /* synthetic */ void m204395Qe(Integer num, Boolean bool, Message message) {
        if (num.intValue() == 100 && bool.booleanValue()) {
            ((bpz) this.viewModel).m190296d2();
        }
        if (bool.booleanValue()) {
            ((bpz) this.viewModel).m190248B1();
        }
        if (NullChecker.m81303a(message) && NullChecker.m81303a(this.f96919k) && this.f96919k.hasLocalBreakIce) {
            CoreModule.f17545c.f19577J1.m34569g5(this.f96911c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Qf */
    public final /* synthetic */ void m204396Qf(xaj0 xaj0Var) {
        final boolean z;
        final int i;
        Optional optional = (Optional) xaj0Var.f191753c;
        boolean z2 = false;
        if (optional.isPresent()) {
            Visitor visitor = (Visitor) optional.get();
            i = visitor.visitCount;
            z = visitor.hidden;
        } else {
            z = false;
            i = 0;
        }
        int iMo34969Hs = CoreModule.m29935P().m94654e().mo34969Hs();
        int iMo34973Se = CoreModule.m29935P().m94654e().mo34973Se();
        boolean z3 = i >= CoreModule.m29935P().m94654e().mo34966Fj();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills;
        boolean z4 = mqi0.m155929D(((long) conversationCounterTypeSp.get(this.f96911c)) * 1000) && ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(this.f96911c) >= iMo34973Se;
        if (mqi0.m155929D(CoreModule.f17545c.f19668n2.f155213a0.get().longValue()) && CoreModule.f17545c.f19668n2.f155214b0.get().intValue() >= iMo34969Hs) {
            z2 = true;
        }
        if (xma.m210043F3() || z || !z3 || z2 || z4) {
            return;
        }
        CoreModule.f17545c.f19642f0.m32906bh(this.f96911c, MessageType.get(MessageType.local_visitor_hide_footprint), MessageType.local_visitor_hide_footprint, new e30() { // from class: l.qiz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204103J7(i, z, (Message) obj);
            }
        });
        if (mqi0.m155929D(CoreModule.f17545c.f19668n2.f155213a0.get().longValue())) {
            CoreModule.f17545c.f19668n2.f155214b0.m189988a(1);
        } else {
            CoreModule.f17545c.f19668n2.f155214b0.put(1);
        }
        CoreModule.f17545c.f19668n2.f155213a0.put(Long.valueOf(mqi0.m155944o()));
        if (mqi0.m155929D(((long) conversationCounterTypeSp.get(mo120828r3())) * 1000)) {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo120828r3());
        } else {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo120828r3(), 1);
        }
        conversationCounterTypeSp.set(mo120828r3(), (int) (mqi0.m155944o() / 1000));
    }

    /* JADX INFO: renamed from: Qg */
    public final void m204397Qg(Conversation conversation, q860<Message> q860Var) {
        if (vwb.m200296J(q860Var.f153135a)) {
            return;
        }
        Message message = q860Var.f153135a.get(0);
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) && q860Var.f153135a.size() >= 2 && TEnum.equals(q860Var.f153135a.get(1).messageType, MessageType.get("sticker"))) {
            message = q860Var.f153135a.get(1);
        }
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) || this.f187202T0.m176377a(message.f56011id)) {
            return;
        }
        if ((TextUtils.isEmpty(conversation.readUntil) || conversation.readUntil.compareTo(message.f56011id) >= 0 || message.isMe()) && (!message.isMe() || message.f56011id.contains("fake_id_") || mqi0.m155944o() - message.createdTime >= 4000.0d)) {
            return;
        }
        this.f187202T0.m176378b(message.f56011id);
        Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(message.sticker);
        if (NullChecker.m81303a(stickerM34927s3) && TEnum.equals(stickerM34927s3.source, "poke")) {
            String strM49185o = MessageWarmingUpHelper.m49185o(stickerM34927s3);
            if (TextUtils.isEmpty(strM49185o)) {
                return;
            }
            m120842t7().m103224b5(message, strM49185o, stickerM34927s3);
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: R2 */
    public boolean mo120700R2(Message message, boolean z, Sticker sticker) {
        if (NullChecker.m81303a(m204527vc()) && m204527vc().unilateralBlock() && !Network.isConnected(act())) {
            lsi0.m151584n(R$string.f20719B2);
        }
        return super.mo120700R2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m204398Rc() {
        if (y19.m212155O() && NullChecker.m81303a(this.f96919k) && this.f96919k.isHeartbeatConv() && this.f96919k.isHeartBeatLock()) {
            return;
        }
        if ((NullChecker.m81303a(this.f96919k) && this.f96919k.isLimitMatch()) || !TextUtils.equals(act().getIntent().getStringExtra("heartbeat_consume_type"), "quickchat") || TextUtils.equals(CoreModule.f17545c.f19639e0.f149352d3.get(), mqi0.m155949t())) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.mgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ngz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138931a.m204317Ae((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Rd */
    public final /* synthetic */ void m204399Rd() {
        CoreModule.f17545c.f19642f0.m32846Wg(mo120828r3(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: Re */
    public final /* synthetic */ void m204400Re(Boolean bool) {
        m156455e0().mo48954A0().m210931o2();
        if (bool.booleanValue()) {
            ((bpz) this.viewModel).m190341z0();
            ((bpz) this.viewModel).m103203R3();
        }
    }

    /* JADX INFO: renamed from: Rf */
    public final /* synthetic */ void m204401Rf(Integer num) {
        if (!tqm0.m190131p().m190144q()) {
            dqy dqyVarM128212u0 = m156455e0().mo48954A0().m156457g0().m128212u0();
            if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                dqyVarM128212u0.m113198I(true);
            }
        }
        if (TextUtils.equals(tqm0.m190131p().m190141m(), mo120828r3())) {
            ((bpz) this.viewModel).m103273y5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: Rg */
    public void m204402Rg(boolean z) {
        e51.m114745J(this.f187223o1);
        if (z && m204494oc()) {
            e51.m114743H(act(), this.f187223o1, ((long) m204355Id()) * 1000);
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: S2 */
    public boolean mo120704S2(Message message, boolean z, Sticker sticker) {
        Message message2;
        User userM204527vc = m204527vc();
        String strM171966c = pxz.m171966c();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (NullChecker.m81303a(userM204527vc) && userM204527vc.unilateralBlock()) {
            if (Network.isConnected(act())) {
                if (NullChecker.m81303a(userM204527vc) && userM204527vc.onlineMatch() && userM204527vc.onlineMatchLocked()) {
                    lsi0.m151578h(userM204527vc.isFemale() ? R$string.f20794K5 : R$string.f20802L5);
                } else {
                    lsi0.m151578h(R$string.f21057p5);
                }
                if (NullChecker.m81303a(userM204527vc)) {
                    message2 = message;
                    pxz.m171970g(message2, strM171966c, "lift_match", userM204527vc.f56011id, 0, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            } else {
                lsi0.m151584n(R$string.f20719B2);
            }
            message2 = message;
        } else {
            message2 = message;
        }
        return super.mo120704S2(message2, z, sticker);
    }

    /* JADX INFO: renamed from: Sd */
    public final /* synthetic */ void m204403Sd() {
        int iMo34969Hs = CoreModule.m29935P().m94654e().mo34969Hs();
        int iMo34973Se = CoreModule.m29935P().m94654e().mo34973Se();
        int iMo34966Fj = CoreModule.m29935P().m94654e().mo34966Fj();
        long j = ((long) ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.get(this.f96911c)) * 1000;
        long j2 = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(this.f96911c);
        if (!mqi0.m155929D(j)) {
            j2 = 0;
        }
        lsi0.m151595y("每天最多展示总次数（可配置）：" + iMo34969Hs + "\n同一会话每天最多展示次数（可配置）：" + iMo34973Se + "\n同一会话最少访问次数（可配置）：" + iMo34966Fj + "\n当前会话上次访问时间：" + mqi0.f135254f.format(new Date(j)) + "\n当前会话已经访问次数：" + j2 + "\n每天已经展示过的总次数：" + (mqi0.m155929D(CoreModule.f17545c.f19668n2.f155213a0.get().longValue()) ? CoreModule.f17545c.f19668n2.f155214b0.get().intValue() : 0L));
    }

    /* JADX INFO: renamed from: Se */
    public final /* synthetic */ void m204404Se(User user) {
        boolean zUnilateralBlock = user.unilateralBlock();
        V v2 = this.viewModel;
        if (zUnilateralBlock) {
            ((bpz) v2).m190336w0();
        } else {
            ((bpz) v2).m103203R3();
        }
    }

    /* JADX INFO: renamed from: Sf */
    public final /* synthetic */ void m204405Sf(Integer num) {
        if (TextUtils.equals(tqm0.m190131p().m190141m(), mo120828r3()) || tqm0.m190131p().m190144q()) {
            ((bpz) this.viewModel).m103230e5(tqm0.m190131p().m190140l(), num.intValue());
        }
    }

    /* JADX INFO: renamed from: Sg */
    public final void m204406Sg(Message message) {
        if (TEnum.equals(message.messageType, MessageType.exchange_picture) && NullChecker.m81303a(message.additionalData)) {
            ExchangePicture exchangePicture = message.additionalData.exchangePicture;
            if (NullChecker.m81303a(exchangePicture) && exchangePicture.exchangeType == ExchangePicture.BACK_MESSAGE && !TextUtils.isEmpty(exchangePicture.launchMessageId) && TextUtils.equals(exchangePicture.status, ExchangePicture.finished)) {
                CoreModule.f17545c.f19642f0.m33191xq(exchangePicture.launchMessageId);
            }
        }
    }

    /* JADX INFO: renamed from: Tc */
    public final void m204407Tc() {
        this.f187214f1.add(new axa0((bpz) this.viewModel, this));
        this.f187214f1.add(new dxa0((bpz) this.viewModel, this));
        this.f187214f1.add(new m5f((bpz) this.viewModel));
        this.f187214f1.add(new zii0((bpz) this.viewModel, this));
        this.f187214f1.add(new oxe((bpz) this.viewModel, this));
        this.f187214f1.add(new kxe((bpz) this.viewModel, this));
        this.f187214f1.add(new kyb0((bpz) this.viewModel, this));
    }

    /* JADX INFO: renamed from: Td */
    public final /* synthetic */ void m204408Td() {
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo120828r3(), 0);
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(this.f96911c, 0);
        CoreModule.f17545c.f19668n2.f155213a0.put(0L);
        CoreModule.f17545c.f19668n2.f155214b0.put(0);
        lsi0.m151595y("已重置");
    }

    /* JADX INFO: renamed from: Te */
    public final /* synthetic */ void m204409Te(dd80 dd80Var, Boolean bool) {
        dd80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: Tf */
    public final /* synthetic */ void m204410Tf() {
        this.f187195M0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Tg */
    public int m204411Tg() {
        return this.f187212d1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ud */
    public final /* synthetic */ void m204412Ud(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            Conversation conversation = (Conversation) xaj0Var.f191752b;
            if (conversation.f20374mm == 0 && TextUtils.equals("default", conversation.convType) && TEnum.equals(conversation.status, "default")) {
                User userM120726W5 = m120726W5();
                User user = (User) xaj0Var.f191753c;
                if (userM120726W5.isFemale() || m120744a4(user) || m120744a4(userM120726W5) || user.isTeamAccount()) {
                    return;
                }
                CoreModule.f17545c.f19642f0.f19986w1.put(Long.valueOf(mqi0.m155944o()));
                CoreModule.f17545c.f19642f0.m32930dh(mo120828r3(), MessageType.get(MessageType.local_friend_active_remind_female));
            }
        }
    }

    /* JADX INFO: renamed from: Ue */
    public final /* synthetic */ void m204413Ue(boolean z, final dd80 dd80Var) {
        m204467ic(z, new e30() { // from class: l.aiz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70074a.m204409Te(dd80Var, (Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Uf */
    public final /* synthetic */ Boolean m204414Uf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.m101755e((User) xaj0Var.f191751a) && bh0.m101754d(this.f96919k) && !((Boolean) xaj0Var.f191752b).booleanValue());
    }

    /* JADX INFO: renamed from: Ug */
    public hpd0 m204415Ug() {
        return this.f187213e1;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: V2 */
    public boolean mo120719V2() {
        if (CoreModule.m29935P().m94658i().mo158450u() && NullChecker.m81303a(this.f96919k) && (this.f96919k.isHeartbeatConv() || this.f96919k.isSeeUpgradedConv())) {
            return false;
        }
        if (NullChecker.m81303a(this.f96919k) && ((this.f96919k.isFakeHeartbeatConv() || this.f96919k.isFakeQuickChatConv()) && (CoreModule.f17545c.f19639e0.m169464Z7() || CoreModule.f17545c.f19639e0.m169527p9().isRiskAuditAvatar()))) {
            return false;
        }
        return !User.isTeamAccount(mo120828r3());
    }

    /* JADX INFO: renamed from: Vc */
    public final void m204416Vc() {
        if (!CoreModule.m29935P().m94651a().mo158376f4() || User.isTeamAccount(this.f96910b)) {
            return;
        }
        q5k0.m173035g().m173041k(mo120828r3());
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b).filter(new w9j() { // from class: l.vdz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).onlineMatchLocked());
            }
        }).switchMap(new w9j() { // from class: l.gez
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102319a.m204361Je((User) obj);
            }
        }).filter(new w9j() { // from class: l.rez
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.cfz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80685a.m204366Ke((Conversation) obj);
            }
        }, new e30() { // from class: l.nfz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204201bc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.f19922b0).subscribe(mkd0.m154955G(new e30() { // from class: l.yfz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204271r9((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Vd */
    public final /* synthetic */ void m204417Vd(User user) {
        String strM30030o3 = CoreModule.f17545c.f19684t0.m30030o3();
        Settings settings = user.settings;
        String str = (settings == null || settings.getSettingGroup() == null || user.settings.getSettingGroup().tttribe == null) ? "" : user.settings.getSettingGroup().tttribe.transLang;
        if (TextUtils.isEmpty(strM30030o3) || TextUtils.equals(strM30030o3, str)) {
            return;
        }
        zvf0.m220402x("e_intl_ai_translate_bubble", OMSDialogPositon.p_chat_view);
        ((bpz) this.viewModel).m190299e2();
        CoreModule.f17545c.f19684t0.m30032q3();
    }

    /* JADX INFO: renamed from: Ve */
    public final /* synthetic */ void m204418Ve(boolean[] zArr, PurchaseType purchaseType, Act act, String str) {
        zArr[0] = true;
        m204373Lg(false);
    }

    /* JADX INFO: renamed from: Vf */
    public final /* synthetic */ void m204419Vf(xaj0 xaj0Var) {
        if (m204353Hg()) {
            CoreModule.f17545c.f19642f0.m32906bh(this.f96911c, MessageType.get(MessageType.local_wechat_notify_guide), "wechat_notify_guide", null);
            this.f187222n1 = true;
            if (mqi0.m155929D(CoreModule.f17545c.f19639e0.f149434n5.get().longValue())) {
                CoreModule.f17545c.f19639e0.f149449p5.m189988a(1);
            } else {
                CoreModule.f17545c.f19639e0.f149449p5.put(1);
            }
            CoreModule.f17545c.f19639e0.f149434n5.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149442o5.m189988a(1);
            ConversationCounterTypeSp.wechatNotifyGuideShowCount.set(this.f96911c, 1);
            zvf0.m220402x("e_open_wechat_notification", pageId());
        }
    }

    /* JADX INFO: renamed from: Wd */
    public final /* synthetic */ void m204420Wd(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            e51.m114743H(act(), this.f187220l1, 10L);
            if (!User.isLiveServiceAccount(mo120828r3())) {
                m204329Cg();
                ((bpz) this.viewModel).m190304g2();
            }
        } else if (c4319c == C4319c.f15549j) {
            e51.m114745J(this.f187220l1);
        }
        if ((c4319c == C4319c.f15545f || c4319c == C4319c.f15550k) && NullChecker.m81303a(mo120828r3()) && !m120794k4(mo120828r3())) {
            m120837s7(true);
        }
    }

    /* JADX INFO: renamed from: We */
    public final /* synthetic */ void m204421We(boolean[] zArr) {
        if (zArr[0]) {
            return;
        }
        act().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wf */
    public final /* synthetic */ void m204422Wf(j760 j760Var) {
        WechatNotifySetting wechatNotifySetting = (WechatNotifySetting) j760Var.f116564a;
        if (Boolean.TRUE.equals(j760Var.f116565b) && wechatNotifySetting == null) {
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_wechat_notify_guide);
        }
    }

    /* JADX INFO: renamed from: Xc */
    public final void m204423Xc() {
        if (y19.m212170e()) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19686t2.f148152R) && CoreModule.f17545c.f19686t2.f148152R.get().booleanValue()) {
                duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.nmz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f139688a.m204375Me((roj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.f17545c.f19686t2.m168331k3(mo120828r3(), QuestionnaireScene.messageDetail, "user")).subscribe(mkd0.m154956H(new e30() { // from class: l.omz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f144731a.m204380Ne((CoreData) obj);
                    }
                }, new e30() { // from class: l.pmz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        wmz.m204215eb((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Xd */
    public final /* synthetic */ void m204424Xd(User user) {
        ((bpz) this.viewModel).m103226c5(user);
    }

    /* JADX INFO: renamed from: Xe */
    public final /* synthetic */ void m204425Xe(boolean[] zArr, dd80 dd80Var, Boolean bool) {
        zArr[0] = true;
        dd80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: Xf */
    public final /* synthetic */ void m204426Xf() {
        ((bpz) this.viewModel).m190249C1();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: Y2 */
    public boolean mo120733Y2() {
        return ruy.m181215g().m181221i(m204527vc(), this.f96917i) && NullChecker.m81303a(this.f96919k) && TEnum.equals(this.f96919k.property.chatInterrupt.stage, "locked");
    }

    /* JADX INFO: renamed from: Yc */
    public void m204427Yc() {
        if (NullChecker.m81303a(this.f96919k) && this.f96919k.isLimitMatch()) {
            ((bpz) this.viewModel).act().duringCreated(mo120714U2().filter(new w9j() { // from class: l.ogz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(NullChecker.m81303a(conversation) && conversation.isLimitMatch() && conversation.unreadMessages > 0);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.pgz
                @Override // p149l.e30
                public final void call(Object obj) {
                    e51.m114774y(new Runnable() { // from class: l.ihz
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.ejz
                                @Override // p149l.d30
                                public final void call() {
                                    wmz.m204062B7(conversation);
                                }
                            });
                        }
                    });
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Yd */
    public final /* synthetic */ void m204428Yd(j760 j760Var) {
        ((bpz) this.viewModel).m190276U1();
        ((bpz) this.viewModel).m190263M1();
        mo120748b3((User) this.f96918j);
        ((bpz) this.viewModel).f171758t1.mo180269j();
        ((bpz) this.viewModel).mo103177D0();
        CoreModule.m29935P().m94658i().mo158211C0();
        CoreModule.m29935P().m94658i().mo158427p2();
    }

    /* JADX INFO: renamed from: Ye */
    public final /* synthetic */ void m204429Ye(boolean z, final boolean[] zArr, final dd80 dd80Var) {
        m204467ic(z, new e30() { // from class: l.bjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75954a.m204425Xe(zArr, dd80Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yf */
    public final /* synthetic */ void m204430Yf(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).unilateralBlock()) {
            CoreModule.f17545c.f19639e0.m169374Ba(mo120828r3());
        }
    }

    @Override // p149l.fcz, p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f187219k1 = act().getIntent().getStringExtra("autoSendMessage");
        if (!TextUtils.isEmpty(mo120828r3())) {
            CoreModule.f17545c.f19631b1.m145036f3(mo120828r3());
        }
        if (!TextUtils.isEmpty(this.f187219k1)) {
            m120686N6(this.f187219k1);
        }
        qvy qvyVar = new qvy(this);
        this.f187192J0 = qvyVar;
        qvyVar.mo39469Z();
        m204407Tc();
        if (y19.m212150J()) {
            ConversationCounterTypeSp.ProloguesEnterChatCount.set(mo120828r3());
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: Z2 */
    public ArrayList<j760<String, d30>> mo120738Z2() {
        ArrayList<j760<String, d30>> arrayListMo120738Z2 = super.mo120738Z2();
        if (CoreModule.f17554l.m94658i().mo158348b()) {
            arrayListMo120738Z2.add(vwb.m200311Y("zb直播状态DEBUG", new d30() { // from class: l.pfz
                @Override // p149l.d30
                public final void call() {
                    this.f148602a.m204379Nd();
                }
            }));
        }
        arrayListMo120738Z2.add(vwb.m200311Y("探探认证气泡", new d30() { // from class: l.qfz
            @Override // p149l.d30
            public final void call() {
                this.f154301a.m204384Od();
            }
        }));
        if (CoreModule.f17554l.m94658i().mo158216D()) {
            arrayListMo120738Z2.add(vwb.m200311Y("拍一拍蒙层引导", new d30() { // from class: l.rfz
                @Override // p149l.d30
                public final void call() {
                    this.f159219a.m204389Pd();
                }
            }));
            arrayListMo120738Z2.add(vwb.m200311Y("功能引导“拍一拍”", new d30() { // from class: l.sfz
                @Override // p149l.d30
                public final void call() {
                    wmz.m204244kb();
                }
            }));
        }
        arrayListMo120738Z2.add(vwb.m200311Y("插入认证引导消息", new d30() { // from class: l.tfz
            @Override // p149l.d30
            public final void call() {
                this.f170037a.m204394Qd();
            }
        }));
        arrayListMo120738Z2.add(vwb.m200311Y("插入盲盒引导消息", new d30() { // from class: l.ufz
            @Override // p149l.d30
            public final void call() {
                this.f176339a.m204399Rd();
            }
        }));
        arrayListMo120738Z2.add(vwb.m200311Y("访客'隐藏访问足迹'统计次数", new d30() { // from class: l.vfz
            @Override // p149l.d30
            public final void call() {
                this.f181339a.m204403Sd();
            }
        }));
        arrayListMo120738Z2.add(vwb.m200311Y("访客'隐藏访问足迹'重置", new d30() { // from class: l.wfz
            @Override // p149l.d30
            public final void call() {
                this.f186129a.m204408Td();
            }
        }));
        arrayListMo120738Z2.add(vwb.m200311Y("插入游戏CP消息 自己", new C20915c()));
        arrayListMo120738Z2.add(vwb.m200311Y("插入游戏CP消息 对方", new C20916d()));
        return arrayListMo120738Z2;
    }

    /* JADX INFO: renamed from: Zc */
    public final void m204431Zc() {
        if (jjb0.m141784b() && NullChecker.m81303a(this.f96919k) && TextUtils.equals(this.f96919k.convType, "default") && !CertificationUtil.m58153l()) {
            duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_pic_cert_guide)), CoreModule.f17545c.f19642f0.m32998iq(mo120828r3()), new y9j() { // from class: l.sez
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return xaj0.m207578a((User) obj, (Boolean) obj2, (List) obj3);
                }
            }).first().filter(new w9j() { // from class: l.tez
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204214ea((xaj0) obj);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.uez
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176218a.m204385Oe((xaj0) obj);
                }
            }));
            duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_pic_cert_guide)), CoreModule.f17545c.f19642f0.m33074oo(), new y9j() { // from class: l.vez
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return xaj0.m207578a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new w9j() { // from class: l.wez
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return wmz.m204175Wb((xaj0) obj);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.xez
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192642a.m204390Pe((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final /* synthetic */ void m204432Zd(User user) {
        if (CoreModule.f17545c.f19642f0.m32925co(mo120858x6(), this.f96919k)) {
            CoreModule.f17545c.f19642f0.m32834Vg(m120783i3());
        }
    }

    /* JADX INFO: renamed from: Ze */
    public final /* synthetic */ void m204433Ze(final boolean z, final boolean[] zArr, PurchaseType purchaseType) {
        ((bpz) this.viewModel).m103248m5(new e30() { // from class: l.giz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102986a.m204429Ye(z, zArr, (dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zf */
    public final /* synthetic */ void m204434Zf() {
        CoreModule.f17554l.m94658i().mo158442s1(mo120828r3());
        CoreModule.f17545c.f19639e0.m169454W9(mo120828r3()).subscribe(mkd0.m154956H(new e30() { // from class: l.ohz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204131O9((roj0) obj);
            }
        }, new e30() { // from class: l.phz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149066a.m204430Yf((Throwable) obj);
            }
        }));
    }

    @Override // p149l.fcz, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m204364Kc();
        m204485md();
        m204463hd();
        m204455fd();
        m120715U3();
        m204325Cc();
        m204490nd();
        m204540yc();
        m204447dd();
        m204326Cd();
        m204515sd();
        m204541yd();
        m204451ed();
        m204510rd();
        CoreModule.m29935P().m94658i().mo158230F3(act());
        m204392Pg();
        this.f187192J0.mo39470a0();
        m204339Fc();
        m204383Oc();
        m204359Jc();
        if (CoreModule.m29935P().m94658i().mo158204B()) {
            m204282td();
        }
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            m204315Ac();
        }
        if (CoreModule.m29935P().m94658i().mo158353b5()) {
            m204459gd();
        }
        m204331Dd();
        m204484mc();
        m204154Sc();
        m204388Pc();
        m204320Bc();
        m204165Uc();
        m204545zc();
        m204435ad();
        m204536xd();
        m204344Gc();
        m204349Hc();
        m204439bd();
        m204369Lc();
        m204443cd();
        m204495od();
        m204398Rc();
        m204354Ic();
        m204468id();
        m204532wd();
        m204335Ec();
        m204123Mc();
        m204519tc();
        m204393Qc();
        m204431Zc();
        m204378Nc();
        m204475kd();
        m204471jd();
        m204427Yc();
        m204343Fg();
        m204321Bd();
        m204340Fd();
        m204423Xc();
        m204316Ad();
        m204416Vc();
        m204480ld();
        if (CoreModule.m29935P().m94656g().mo35054d9() && !xma.m210047L3()) {
            m204523ud();
        }
        m204505qd();
        m204330Dc();
        m204531wc();
        m204535xc();
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        m204176Wc();
    }

    /* JADX INFO: renamed from: ad */
    public void m204435ad() {
        if (CoreModule.m29935P().m94652b().mo35107Yg() && CoreModule.m29935P().m94652b().mo35126v6(this.f96919k)) {
            boolean zMo35120nl = CoreModule.m29935P().m94652b().mo35120nl(this.f96919k);
            if (zMo35120nl && CoreModule.m29935P().m94652b().mo35131xk()) {
                CoreModule.m29935P().m94652b().mo35115io(this.f96919k.f20374mm, this.f96911c);
            }
            CoreModule.m29935P().m94652b().mo35108Zf(this, this.f96910b, this.f96911c, zMo35120nl, CoreModule.m29935P().m94652b().mo35105Wr(this.f96919k), new g30() { // from class: l.jez
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f117618a.m204395Qe((Integer) obj, (Boolean) obj2, (Message) obj3);
                }
            });
            duringCreated(CoreModule.f17545c.f19577J1.m34579u5()).subscribe(mkd0.m154956H(new e30() { // from class: l.kez
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122882a.m204400Re((Boolean) obj);
                }
            }, new e30() { // from class: l.lez
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204099I8((Throwable) obj);
                }
            }));
            if (CoreModule.m29935P().m94652b().mo35100Pe(this.f96919k)) {
                duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b)).filter(new w9j() { // from class: l.mez
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).isLoveBuzz());
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.nez
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f138672a.m204404Se((User) obj);
                    }
                }, new e30() { // from class: l.oez
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        wmz.m204169Va((Throwable) obj);
                    }
                }));
            }
            if (NullChecker.m81303a(this.f96919k)) {
                if (this.f96919k.hasLocalBreakIce) {
                    CoreModule.f17545c.f19577J1.m34569g5(m120783i3());
                }
                Conversation conversation = this.f96919k;
                if (conversation.localHasMessage || conversation.userMessageCount != 0) {
                    return;
                }
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
                if (NullChecker.m81303a(userM169430Pa)) {
                    CoreModule.f17545c.f19577J1.m34580v5(m120783i3(), CoreModule.m29935P().m94652b().mo35098Ls(2, userM169430Pa.gender));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ae */
    public final /* synthetic */ void m204436ae(Bundle bundle) {
        this.f187217i1 = mgh0.m154553i(act().getIntent());
        e51.m114743H(act(), new Runnable() { // from class: l.lhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f128148a.m204546zd();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: af */
    public final /* synthetic */ void m204437af(boolean[] zArr, Boolean bool) {
        if (zArr[0]) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: ag */
    public final /* synthetic */ void m204438ag() {
        if (m204494oc()) {
            CoreModule.f17545c.f19642f0.m32702Kf(m120783i3());
            m204358Ig();
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: b6 */
    public boolean mo120751b6() {
        if (!CoreModule.m29935P().m94658i().mo158314U3()) {
            return false;
        }
        boolean z = NullChecker.m81303a(this.f187201S0) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r(this.f187201S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
        if (z) {
            return z;
        }
        return NullChecker.m81303a(this.f96919k) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r((double) this.f96919k.f20374mm).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
    }

    /* JADX INFO: renamed from: bd */
    public final void m204439bd() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        final boolean z = false;
        boolean z2 = NullChecker.m81303a(userM169520na) && userM169520na.isFemale();
        boolean z3 = NullChecker.m81303a(userM169520na) && userM169520na.isSVIP();
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        if (!z2 && NullChecker.m81303a(this.f96919k) && TextUtils.equals(this.f96919k.convType, "quickchat") && CoreModule.m29935P().m94658i().mo158358c4(this.f96919k)) {
            CoreModule.f17545c.f19555C0.m210112u4();
            if (CoreModule.m29935P().m94658i().mo158231F5() && CoreModule.m29935P().m94658i().mo158363d3()) {
                z = true;
            }
            if (CoreModule.m29935P().m94658i().mo158213C2()) {
                m204467ic(z, new e30() { // from class: l.yez
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        wmz.m204198b9((Boolean) obj);
                    }
                });
                return;
            }
            if (CoreModule.m29935P().m94658i().mo158250J2()) {
                if (CoreModule.m29935P().m94658i().mo33468b3() > 0) {
                    ((bpz) this.viewModel).m103248m5(new e30() { // from class: l.zez
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f202872a.m204413Ue(z, (dd80) obj);
                        }
                    });
                    return;
                }
                if (!z3) {
                    CoreModule.m29935P().m94658i().mo33362Lf(act(), "p_chat_view,e_quickchatbell_search,click", Privilege.online_match_tickets, new e30() { // from class: l.dfz
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f85985a.m204433Ze(z, zArr2, (PurchaseType) obj);
                        }
                    }, new e30() { // from class: l.efz
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f90877a.m204437af(zArr2, (Boolean) obj);
                        }
                    });
                } else if (z) {
                    m204373Lg(true);
                } else {
                    CoreModule.m29935P().m94658i().mo158280O3(act(), "p_chat_view,e_quickchatbell_search,click", new g30() { // from class: l.afz
                        @Override // p149l.g30
                        /* JADX INFO: renamed from: a */
                        public final void mo36055a(Object obj, Object obj2, Object obj3) {
                            this.f69234a.m204418Ve(zArr, (PurchaseType) obj, (Act) obj2, (String) obj3);
                        }
                    }, new d30() { // from class: l.bfz
                        @Override // p149l.d30
                        public final void call() {
                            this.f75391a.m204421We(zArr);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: be */
    public final /* synthetic */ void m204440be(List list) {
        if (vwb.m200296J(list) || list.size() < 2) {
            return;
        }
        this.f187209a1.put(Long.valueOf(mqi0.m155943n()));
        CoreModule.f17545c.f19642f0.m32870Yg(m120783i3(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ Boolean m204441bf(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var.f116564a) && ((Boolean) j760Var.f116564a).booleanValue() && NullChecker.m81303a(j760Var.f116565b) && !((Boolean) j760Var.f116565b).booleanValue() && !CoreModule.f17545c.f19642f0.m32642Fg(this.f96910b));
    }

    /* JADX INFO: renamed from: bg */
    public final /* synthetic */ void m204442bg(Message message, roj0 roj0Var) {
        m120647E6(message.f56011id);
    }

    /* JADX INFO: renamed from: cd */
    public final void m204443cd() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        if (!CoreModule.m29935P().m94658i().mo158444s5() || !NullChecker.m81303a(userM169430Pa) || !userM169430Pa.isFemale() || !TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male") || CoreModule.f17545c.f19639e0.f149212L2.get().intValue() >= CoreModule.m29935P().m94658i().mo158259K5() || z19.m216788a(CoreModule.f17545c.f19639e0.f149219M2.get().longValue()) < CoreModule.m29935P().m94658i().mo158321V4() || User.isTeamAccount(mo120828r3()) || mo120764e4()) {
            return;
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32727Mg(this.f96910b), CoreModule.f17545c.f19642f0.m32679Ig(this.f96910b), new ciz())).distinctUntilChanged().observeOn(Schedulers.m221493io()).filter(new w9j() { // from class: l.niz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139167a.m204441bf((j760) obj);
            }
        }).first().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.yiz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198566a.m204445cf((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ce */
    public final /* synthetic */ void m204444ce(AgeVerificationInfo ageVerificationInfo) {
        ((bpz) this.viewModel).m190248B1();
    }

    /* JADX INFO: renamed from: cf */
    public final /* synthetic */ void m204445cf(j760 j760Var) {
        CoreModule.f17545c.f19642f0.m33002jh(this.f96910b);
        CoreModule.f17545c.f19639e0.f149219M2.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149212L2.m189988a(1);
    }

    /* JADX INFO: renamed from: cg */
    public final /* synthetic */ void m204446cg(ChatHeat chatHeat, roj0 roj0Var) {
        MessageWarmingUpHelper.m49192v("pokeAnimObs back");
        if (!chatHeat.levelUp) {
            m204382Ng(chatHeat);
            return;
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = m120798l3();
        MessageWarmingUpHelper.WarmingUpLevel next = warmingUpLevelM120798l3.next();
        if (NullChecker.m81303a(next)) {
            m204387Og(warmingUpLevelM120798l3, next, chatHeat);
        } else {
            this.f187198P0 = false;
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: d3 */
    public void mo120758d3() {
        super.mo120758d3();
        if (NullChecker.m81303a(this.f96919k) && this.f96919k.hasLocalBreakIce) {
            CoreModule.f17545c.f19577J1.m34569g5(m120783i3());
        }
        CoreModule.f17545c.f19642f0.m32774Qf(m120783i3(), m204526ug());
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: d6 */
    public boolean mo120761d6() {
        if (CoreModule.m29935P().m94658i().mo158279O2()) {
            return (TextUtils.isEmpty(mo120828r3()) || User.isTeamAccount(mo120828r3()) || m204350Hd()) ? false : true;
        }
        if (!CoreModule.m29935P().m94658i().mo158314U3()) {
            return false;
        }
        boolean z = NullChecker.m81303a(this.f187201S0) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r(this.f187201S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
        if (z) {
            return z;
        }
        return NullChecker.m81303a(this.f96919k) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r((double) this.f96919k.f20374mm).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
    }

    /* JADX INFO: renamed from: dd */
    public final void m204447dd() {
        if (!CoreModule.m29935P().m94658i().mo158443s4() || m120794k4(mo120828r3()) || User.isBusinessAI1V1(mo120828r3())) {
            return;
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("intlReadMessage"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.iez
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112945a.m204449df((UserPrivilege) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: de */
    public final /* synthetic */ Boolean m204448de(j760 j760Var) {
        if (User.isTeamAccount(mo120828r3())) {
            return Boolean.FALSE;
        }
        User user = (User) j760Var.f116564a;
        return (NullChecker.m81303a(user) && !user.isFemale() && user.isVIP()) ? (Boolean) j760Var.f116565b : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: df */
    public final /* synthetic */ void m204449df(UserPrivilege userPrivilege) {
        ((bpz) this.viewModel).m190248B1();
    }

    /* JADX INFO: renamed from: dg */
    public final /* synthetic */ C22306c m204450dg(User user) {
        return CoreModule.f17545c.f19642f0.m32737Ne(mo120828r3());
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: e3 */
    public void mo120763e3(Throwable th) {
        super.mo120763e3(th);
        User userM120851w3 = m120851w3(this.f96911c);
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.m81303a(userM120851w3) && userM120851w3.onlineMatch()) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (CoreModule.m29935P().m94658i().mo158391i2(tantanForbidden)) {
                w3z.m201400F(act(), mo120858x6());
                return;
            }
            int i = tantanForbidden.subCode;
            if (i == 103 || i == 104 || i == 105) {
                lsi0.m151580j(String.format("%s已经提前退出闪聊", userM120851w3.isFemale() ? "她" : "他"));
                act().m66873d2();
            } else if (i == 404) {
                lsi0.m151580j(String.format("你已经对%s发出过喜欢了，请静待他的回应吧~", userM120851w3.isFemale() ? "她" : "他"));
                act().m66873d2();
            }
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: e6 */
    public boolean mo120766e6() {
        if (CoreModule.m29935P().m94658i().mo158279O2()) {
            return (TextUtils.isEmpty(mo120828r3()) || User.isTeamAccount(mo120828r3())) ? false : true;
        }
        if (!CoreModule.m29935P().m94658i().mo158314U3()) {
            return false;
        }
        boolean z = NullChecker.m81303a(this.f187201S0) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r(this.f187201S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
        if (z) {
            return z;
        }
        return NullChecker.m81303a(this.f96919k) && !TextUtils.isEmpty(mo120828r3()) && !User.isTeamAccount(mo120828r3()) && MessageWarmingUpHelper.m49188r((double) this.f96919k.f20374mm).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
    }

    /* JADX INFO: renamed from: ed */
    public final void m204451ed() {
        duringCreated(new v9j() { // from class: l.ggz
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102588a.m204453ef();
            }
        }).filter(new w9j() { // from class: l.hgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((User) obj).location));
            }
        }).map(new w9j() { // from class: l.igz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).location;
            }
        }).distinctUntilChanged().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.kgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123108a.m204461gf((Location) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.lgz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204312z9((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ee */
    public final /* synthetic */ void m204452ee(Boolean bool) {
        this.f187194L0.m132487l(bool);
    }

    /* JADX INFO: renamed from: ef */
    public final /* synthetic */ C22306c m204453ef() {
        return CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3());
    }

    /* JADX INFO: renamed from: eg */
    public final /* synthetic */ C22306c m204454eg(Conversation conversation) {
        return CoreModule.f17545c.f19642f0.m32857Xf("message", "conversation", mo120828r3());
    }

    /* JADX INFO: renamed from: fd */
    public final void m204455fd() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ykz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198848a.m204465hf((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: fe */
    public final /* synthetic */ void m204456fe(Boolean bool) {
        this.f96894K.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: ff */
    public final /* synthetic */ void m204457ff(Location location) {
        CoreModule.f17545c.f19642f0.m32587Aq(mo120828r3(), location.updatedTime, location.distance);
    }

    /* JADX INFO: renamed from: fg */
    public final /* synthetic */ void m204458fg(List list) {
        if (vwb.m200296J(list)) {
            this.f187218j1 = null;
            ((bpz) this.viewModel).m190304g2();
            return;
        }
        UserLiveLabel userLiveLabel = (UserLiveLabel) list.get(0);
        if (TextUtils.equals(mo120828r3(), userLiveLabel.userId)) {
            this.f187218j1 = userLiveLabel;
            ((bpz) this.viewModel).m190304g2();
        } else if (this.f187218j1 != null) {
            this.f187218j1 = null;
            ((bpz) this.viewModel).m190304g2();
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: g6 */
    public boolean mo120776g6() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        if (userM169430Pa == null || userM169430Pa.isTeamAccount() || userM169430Pa.isBanned() || userM169430Pa.isBannedNew() || userM169430Pa.isAccountCancellation()) {
            return false;
        }
        return super.mo120776g6();
    }

    /* JADX INFO: renamed from: gd */
    public final void m204459gd() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.jjz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204073D8((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ge */
    public final /* synthetic */ void m204460ge(Integer num) {
        ((bpz) this.viewModel).m103227d4(num.intValue());
    }

    /* JADX INFO: renamed from: gf */
    public final /* synthetic */ Location m204461gf(final Location location) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.mhz
            @Override // p149l.d30
            public final void call() {
                this.f133925a.m204457ff(location);
            }
        });
        return location;
    }

    /* JADX INFO: renamed from: gg */
    public final /* synthetic */ void m204462gg(AnalysisGuide analysisGuide) {
        if (NullChecker.m81303a(analysisGuide)) {
            if (analysisGuide.used) {
                CoreModule.f17545c.f19698x2.m220113t3(m120783i3());
            } else if (analysisGuide.isShow) {
                CoreModule.f17545c.f19642f0.m32822Ug(m120783i3(), "guide_type_analyze");
                CoreModule.f17545c.f19698x2.m220112s3(m120783i3());
            }
        }
    }

    /* JADX INFO: renamed from: hd */
    public final void m204463hd() {
        if (!CoreModule.m29935P().m94658i().mo158216D() || User.isTeamAccount(mo120828r3())) {
            return;
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32737Ne(mo120828r3()), CoreModule.f17545c.f19642f0.m32817Tn(mo120828r3()), new wl20())).subscribe(mkd0.m154955G(new e30() { // from class: l.ffz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97322a.m204473jf((j760) obj);
            }
        }));
        creates(new e30() { // from class: l.gfz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204258o8((Bundle) obj);
            }
        }, new hfz());
    }

    /* JADX INFO: renamed from: he */
    public final /* synthetic */ void m204464he(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (this.f187201S0 != null || warmingUpLevel.value < MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            return;
        }
        Keyboard keyboardMo134702a = m156455e0().mo48971c0().m156457g0().mo134702a();
        if (NullChecker.m81303a(keyboardMo134702a)) {
            keyboardMo134702a.m48799C();
        }
    }

    /* JADX INFO: renamed from: hf */
    public final /* synthetic */ void m204465hf(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.f187216h1 = true;
            return;
        }
        if (c4319c == C4319c.f15548i) {
            boolean z = this.f187216h1;
            V v2 = this.viewModel;
            if (z) {
                ((bpz) v2).m103216X4();
                this.f187216h1 = false;
            } else if (((bpz) v2).m103197O3()) {
                ((bpz) this.viewModel).m103189K3();
            }
        }
    }

    /* JADX INFO: renamed from: hg */
    public final /* synthetic */ void m204466hg(List list) {
        if (vwb.m200296J(list) || !y19.m212168c()) {
            return;
        }
        ((bpz) this.viewModel).m103237h5(list);
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: i7 */
    public boolean mo120787i7() {
        return mo120799l4() && CoreModule.f17554l.m94658i().mo158291Q4(mo120828r3());
    }

    /* JADX INFO: renamed from: ic */
    public final void m204467ic(boolean z, e30<Boolean> e30Var) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        if (!NullChecker.m81303a(userM169430Pa)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.transDataFromUser(userM169430Pa);
        onlineMatchPushUser.isBell = true;
        onlineMatchPushUser.isMaleQuickChatRing = true;
        onlineMatchPushUser.isGreet = true;
        CoreModule.m29935P().m94658i().mo158324W0(act(), onlineMatchPushUser, z, null, false, "", false, e30Var);
    }

    /* JADX INFO: renamed from: id */
    public final void m204468id() {
        if (CoreModule.m29935P().m94651a().mo33332Hd() && this.f96912d == 29) {
            duringCreated(d36.m109868c().f83463a.filter(new w9j() { // from class: l.ckz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            })).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new C20913a()));
            duringCreated(CoreModule.f17545c.f19642f0.f19922b0).subscribe(mkd0.m154955G(new C20914b()));
        }
    }

    /* JADX INFO: renamed from: ie */
    public final /* synthetic */ void m204469ie(ChatHeat chatHeat) {
        this.f187201S0 = chatHeat;
        if (MessageWarmingUpHelper.m49175e(chatHeat).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            Keyboard keyboardMo134702a = m156455e0().mo48971c0().m156457g0().mo134702a();
            if (NullChecker.m81303a(keyboardMo134702a)) {
                keyboardMo134702a.m48799C();
            }
        }
    }

    /* JADX INFO: renamed from: ig */
    public final /* synthetic */ void m204470ig(Throwable th) {
        m204334Dg();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: j7 */
    public C22392a<Boolean> mo120792j7() {
        return this.f187194L0;
    }

    /* JADX INFO: renamed from: jd */
    public final void m204471jd() {
        if (CoreModule.f17554l.m94651a().mo33482dd()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
            if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isTeamAccount()) {
                return;
            }
            CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_o_diamond_visitor_guide);
            e51.m114742G(new Runnable() { // from class: l.zkz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203582a.m204477kf();
                }
            });
            Conversation conversation = this.f96919k;
            if (conversation == null) {
                CrashHelper.m81297d(new NullPointerException(String.format("initODiamondVisitorGuide,me:%s,other:%s,convId:%s", CoreModule.m29931H().userId(), this.f96910b, this.f96911c)), 10);
                return;
            }
            if (conversation.isQuickChatConv()) {
                return;
            }
            if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.onlineMatch()) {
                return;
            }
            if (CoreModule.m29935P().m94651a().mo158345a2() || !(TEnum.equals(this.f96919k.status, "dismissed") || TEnum.equals(this.f96919k.status, "blocked"))) {
                duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_o_diamond_visitor_guide)), CoreModule.f17545c.f19668n2.m175430G3(mo120828r3()), new y9j() { // from class: l.alz
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return xaj0.m207578a((User) obj, (Boolean) obj2, (ODiamondVisitorInfo) obj3);
                    }
                })).take(1).filter(new w9j() { // from class: l.blz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        xaj0 xaj0Var = (xaj0) obj;
                        return Boolean.valueOf((((Boolean) xaj0Var.f191752b).booleanValue() || ((User) xaj0Var.f191751a).onlineMatch()) ? false : true);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.clz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f81481a.m204487mf((xaj0) obj);
                    }
                }, new e30() { // from class: l.elz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        wmz.m204173W9((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: je */
    public final /* synthetic */ void m204472je(knb0 knb0Var) {
        C c;
        MessageWarmingUpHelper.m49192v("来自数据库订阅反馈");
        B b = knb0Var.f123874b;
        if (b == 0 || !TEnum.equals(((Conversation) b).status, "default") || TextUtils.equals(this.f96919k.convType, "quickchat") || (c = knb0Var.f123875c) == 0 || ((User) c).isBanned() || ((User) knb0Var.f123875c).isBannedNew() || ((User) knb0Var.f123875c).isAccountCancellation()) {
            MessageWarmingUpHelper.m49192v("status exception");
            this.f187197O0 = false;
            m156455e0().mo48954A0().m156457g0().m128219y0();
            return;
        }
        if (knb0Var.f123873a == 0) {
            MessageWarmingUpHelper.m49192v("chatHeat == null");
            B b2 = knb0Var.f123874b;
            double dMin = ((Conversation) b2).f20374mm + (Math.min(((Conversation) b2).f20374mm, NullChecker.m81303a(knb0Var.f123876d) ? ((List) knb0Var.f123876d).size() : 0) * 0.2f);
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49176f = MessageWarmingUpHelper.m49176f(dMin);
            double dM49186p = MessageWarmingUpHelper.m49186p(warmingUpLevelM49176f, dMin);
            m120742Z6(warmingUpLevelM49176f);
            m120747a7(dM49186p);
            m204082Ed(warmingUpLevelM49176f);
            return;
        }
        MessageWarmingUpHelper.m49192v("warmingUpAnimRunning = " + this.f187198P0 + "  triple.first = " + ((ChatHeat) knb0Var.f123873a).toJson());
        boolean z = this.f187198P0;
        A a = knb0Var.f123873a;
        if (!z) {
            m204377Mg((ChatHeat) a);
        } else {
            if (!((ChatHeat) a).levelUp || ((ChatHeat) a).degree <= m120803m3()) {
                return;
            }
            A a2 = knb0Var.f123873a;
            this.f187200R0 = a2 == 0 ? null : ((ChatHeat) a2).mo223809clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: jf */
    public final /* synthetic */ void m204473jf(j760 j760Var) {
        if (C8524b.m49060l((Conversation) j760Var.f116564a, ((q860) j760Var.f116565b).f153135a, 100, this.f96923n)) {
            e51.m114743H(act(), this.f187215g1, 500L);
        }
    }

    /* JADX INFO: renamed from: jg */
    public final /* synthetic */ void m204474jg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().m66873d2();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: k6 */
    public void mo120796k6(int i, Menu menu) {
        super.mo120796k6(i, menu);
        if (NullChecker.m81303a(menu)) {
            zvf0.m220402x("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: kd */
    public final void m204475kd() {
        if (CoreModule.f17554l.m94656g().mo35051cf()) {
            if (!m204353Hg() || this.f96919k.localHasMessage) {
                CoreModule.f17545c.f19642f0.m32762Pf(this.f96911c, MessageType.local_platinum_pin_guide);
                duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), CoreModule.f17545c.f19642f0.m32655Gg(mo120828r3(), MessageType.get(MessageType.local_platinum_pin_guide)), CoreModule.f17545c.f19642f0.m32715Lg(mo120828r3()), new y9j() { // from class: l.ifz
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return xaj0.m207578a((User) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                }).filter(new w9j() { // from class: l.jfz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f117702a.m204492nf((xaj0) obj);
                    }
                }).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.kfz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f122987a.m204497of((xaj0) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: ke */
    public final /* synthetic */ void m204476ke(Integer num) {
        ((bpz) this.viewModel).m103227d4(num.intValue());
    }

    /* JADX INFO: renamed from: kf */
    public final /* synthetic */ void m204477kf() {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((bpz) this.viewModel).f171758t1)) {
            VText vTextMo191241d = ((bpz) this.viewModel).f171758t1.mo191241d();
            if (NullChecker.m81303a(vTextMo191241d)) {
                xdl0.m208344M(vTextMo191241d, false);
            }
        }
    }

    /* JADX INFO: renamed from: kg */
    public final /* synthetic */ void m204478kg(boolean z) {
        CoreModule.m29935P().m94658i().mo158283P();
        m204467ic(z, new e30() { // from class: l.tiz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170620a.m204474jg((Boolean) obj);
            }
        });
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: l4 */
    public boolean mo120799l4() {
        if (CoreModule.f17554l.m94658i().mo158204B()) {
            return hap.m130154c(this.f96910b);
        }
        return false;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: l6 */
    public boolean mo120801l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.mo120801l6(menuItem);
        }
        act().m66873d2();
        return true;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: l7 */
    public boolean mo120802l7() {
        return ura.m195053e().m195057d().mo33924t9() && NullChecker.m81303a(this.f96919k) && !((!"default".equals(this.f96919k.convType) && !TextUtils.isEmpty(this.f96919k.convType)) || (NullChecker.m81303a(this.f96919k) && NullChecker.m81303a(this.f96919k.additional.blindbox) && !vwb.m200296J(this.f96919k.additional.blindbox.tags)) || User.isTeamAccount(this.f96919k.otherUser) || m120744a4(CoreModule.f17545c.f19639e0.m169430Pa(this.f96919k.otherUser)));
    }

    /* JADX INFO: renamed from: lc */
    public final C22306c<Boolean> m204479lc() {
        return mkd0.m154984r(CoreModule.f17545c.f19642f0.m32820Ue(mo120828r3()), CoreModule.f17545c.f19639e0.m169418Ma(mo120828r3()), new i86()).map(new w9j() { // from class: l.xiz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193166a.m204360Jd((j760) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: ld */
    public final void m204480ld() {
        if ((ura.m195053e().m195057d().mo33692Gi() || ura.m195053e().m195057d().mo33899p0()) && ((bpz) this.viewModel).m190328s0()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.jkz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(Math.min(3, ((User) obj).pictures.size()));
                }
            }).distinctUntilChanged().onBackpressureLatest()).subscribe(mkd0.m154955G(new e30() { // from class: l.kkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123613a.m204502pf((Integer) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: le */
    public final /* synthetic */ void m204481le(xaj0 xaj0Var) {
        m120842t7().m103228d5(((Boolean) xaj0Var.f191752b).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lf */
    public final /* synthetic */ void m204482lf(xaj0 xaj0Var) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((bpz) this.viewModel).f171758t1)) {
            VText vTextMo191241d = ((bpz) this.viewModel).f171758t1.mo191241d();
            if (NullChecker.m81303a(vTextMo191241d)) {
                xdl0.m208344M(vTextMo191241d, true);
                C c = xaj0Var.f191753c;
                String str = String.format("%s\n%s", ((ODiamondVisitorInfo) c).visitCountStr, ((ODiamondVisitorInfo) c).visitTimeStr);
                C c2 = xaj0Var.f191753c;
                vTextMo191241d.setText(i0g0.m133861b0(str, vwb.m200324f0(((ODiamondVisitorInfo) c2).visitCount, ((ODiamondVisitorInfo) c2).visitTime), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: lg */
    public final /* synthetic */ void m204483lg() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: md */
    public final void m204485md() {
        duringCreated(cj90.m107129a()).filter(new w9j() { // from class: l.eez
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90793a.m204507qf((String) obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.fez
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97164a.m204512rf((String) obj);
            }
        }, new e30() { // from class: l.hez
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204293vb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: me */
    public final /* synthetic */ void m204486me(List list) {
        lz4.m152319h().m152323e().add(this.f96910b);
        if (lz4.m152319h().m152332o()) {
            lsi0.m151595y(lz4.m152319h().m152325g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: mf */
    public final /* synthetic */ void m204487mf(final xaj0 xaj0Var) {
        User userMo120858x6 = mo120858x6();
        if (NullChecker.m81303a(userMo120858x6)) {
            if (CoreModule.m29935P().m94651a().mo158345a2()) {
                if (TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitCountStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitTimeStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitCount) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitTime)) {
                    return;
                }
                e51.m114742G(new Runnable() { // from class: l.fhz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97599a.m204482lf(xaj0Var);
                    }
                });
                return;
            }
            if (NullChecker.m81303a(this.f96919k) && bh0.m101755e(userMo120858x6) && bh0.m101754d(this.f96919k) && !TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitCountStr) && !TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitTimeStr) && TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitTime) && TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.f191753c).visitCount)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", ((ODiamondVisitorInfo) xaj0Var.f191753c).visitCountStr);
                    jSONObject.put("sub_title", ((ODiamondVisitorInfo) xaj0Var.f191753c).visitTimeStr);
                    if (CoreModule.m29935P().m94654e().mo34981fn(userMo120858x6.f56011id)) {
                        CoreModule.f17545c.f19642f0.m32906bh(this.f96911c, MessageType.get(MessageType.local_o_diamond_visitor_guide), jSONObject.toString(), null);
                        m204294vd();
                        zvf0.m220402x("e_visit_times_decrypt", OMSDialogPositon.p_chat_view);
                    }
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: mg */
    public final /* synthetic */ void m204488mg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: nc */
    public final void m204489nc() {
        act().progress(R$string.f20775I2, true);
        duringCreated(CoreModule.f17545c.f19642f0.m33090qe(mo120828r3(), act())).subscribe(mkd0.m154956H(new e30() { // from class: l.riz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159614a.m204370Ld((roj0) obj);
            }
        }, new e30() { // from class: l.siz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164752a.m204374Md((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nd */
    public void m204490nd() {
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        duringCreated(new v9j() { // from class: l.tdz
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19639e0.m169410Ka(strMo120828r3);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.udz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rw6.m181385a((User) obj).profileSmall();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wdz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185897a.m204517sf((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ne */
    public final /* synthetic */ void m204491ne(j760 j760Var) {
        boolean zM200296J = vwb.m200296J(this.f96919k.localChatBg);
        V v2 = this.viewModel;
        if (zM200296J) {
            ((bpz) v2).m103233f5(null);
        } else {
            ((bpz) v2).m103233f5(this.f96919k.localChatBg.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: nf */
    public final /* synthetic */ Boolean m204492nf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.m101755e((User) xaj0Var.f191751a) && bh0.m101754d(this.f96919k) && !((Boolean) xaj0Var.f191752b).booleanValue() && ((Boolean) xaj0Var.f191753c).booleanValue());
    }

    /* JADX INFO: renamed from: oc */
    public final boolean m204494oc() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
        return (userM169430Pa == null || userM169430Pa.isTeamAccount() || mo120764e4() || m120794k4(mo120828r3()) || !CoreModule.m29935P().m94658i().mo33514hm() || CoreModule.f17545c.f19698x2.m220109p3(m120783i3()) || xma.m210084l3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: od */
    public final void m204495od() {
        if (CoreModule.m29935P().m94658i().mo158317V0()) {
            lifecycle().filter(new w9j() { // from class: l.jlz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.klz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123727a.m204521tf((C4319c) obj);
                }
            }));
            if (User.isTeamAccount(this.f96911c)) {
                return;
            }
            duringCreated(CoreModule.f17545c.f19642f0.m32737Ne(this.f96911c)).map(new w9j() { // from class: l.llz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).f20374mm);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.mlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134541a.m204525uf((Integer) obj);
                }
            }, new e30() { // from class: l.nlz
                @Override // p149l.e30
                public final void call(Object obj) {
                    wmz.m204117Lb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: oe */
    public final /* synthetic */ void m204496oe(C4319c c4319c) {
        m204338Eg();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: of */
    public final /* synthetic */ void m204497of(xaj0 xaj0Var) {
        boolean z;
        boolean z2 = false;
        if (NullChecker.m81303a(this.f96919k) && NullChecker.m81303a(this.f96919k.additional) && NullChecker.m81303a(this.f96919k.additional.pinChat)) {
            PlatinumPinChat platinumPinChat = this.f96919k.additional.pinChat;
            if (!platinumPinChat.pin || platinumPinChat.expireTime <= mqi0.m155944o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z3 = mqi0.m155929D(((long) ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime.get(this.f96911c)) * 1000) && ConversationCounterTypeSp.platinumChatPinGuideCloseCount.get(this.f96911c) >= y19.m212188w();
        if (mqi0.m155929D(CoreModule.f17545c.f19641e2.f86637Z.get().longValue()) && CoreModule.f17545c.f19641e2.f86638a0.get().intValue() >= y19.m212189x()) {
            z2 = true;
        }
        if (z) {
            return;
        }
        if (xma.m210045H3() || !(!this.f96919k.localEverHasMessage || z2 || z3)) {
            CoreModule.f17545c.f19642f0.m32906bh(this.f96911c, MessageType.get(MessageType.local_platinum_pin_guide), "platinum pin guide", null);
            if (mqi0.m155929D(CoreModule.f17545c.f19641e2.f86637Z.get().longValue())) {
                CoreModule.f17545c.f19641e2.f86638a0.m189988a(1);
            } else {
                CoreModule.f17545c.f19641e2.f86638a0.put(1);
            }
            CoreModule.f17545c.f19641e2.f86637Z.put(Long.valueOf(mqi0.m155944o()));
            zvf0.m220402x("e_platinum_top_chat", pageId());
        }
    }

    /* JADX INFO: renamed from: og */
    public final /* synthetic */ void m204498og() {
        ((bpz) this.viewModel).m103175B5();
    }

    /* JADX INFO: renamed from: pc */
    public final boolean m204499pc() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
        return (userM169430Pa == null || userM169430Pa.isTeamAccount() || mo120764e4() || m120794k4(mo120828r3()) || !CoreModule.m29935P().m94658i().mo33514hm() || CoreModule.f17545c.f19698x2.m220110q3(m120783i3()) || CoreModule.f17545c.f19698x2.m220116w3(m120783i3()) || xma.m210082k3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: pd */
    public final void m204500pd() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
        if (!NullChecker.m81303a(userM169430Pa) || userM169430Pa.onlineMatch()) {
            return;
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32699Jo(), CoreModule.f17545c.f19642f0.m32703Kg(this.f96911c).take(1), new x9j() { // from class: l.bhz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Message) obj, (Boolean) obj2);
            }
        })).take(1).filter(new w9j() { // from class: l.chz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81025a.m204529vf((j760) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.dhz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86348a.m204534wf((j760) obj);
            }
        }, new e30() { // from class: l.ehz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204115L9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pe */
    public final /* synthetic */ void m204501pe(List list) {
        m204324Bg();
    }

    /* JADX INFO: renamed from: pf */
    public final /* synthetic */ void m204502pf(Integer num) {
        ((bpz) this.viewModel).m190267P1();
    }

    /* JADX INFO: renamed from: pg */
    public final /* synthetic */ void m204503pg(ChatHeat chatHeat) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = m120798l3();
        if (CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            m120737Y6(MessageWarmingUpHelper.m49178h(warmingUpLevelM120798l3));
            ((bpz) this.viewModel).m103265u5(warmingUpLevelM120798l3);
            return;
        }
        List<Message> listM206063U = CoreModule.f17553k.f91940c.m206063U(this.f96910b);
        if (vwb.m200296J(listM206063U)) {
            this.f187198P0 = false;
        } else {
            double dM155944o = (mqi0.m155944o() - listM206063U.get(0).createdTime) / 8.64E7d;
            double dM49178h = MessageWarmingUpHelper.m49178h(warmingUpLevelM120798l3);
            MessageWarmingUpHelper.m49192v("tempDownAnim day = " + dM155944o);
            if (dM155944o <= 7.0d && dM155944o >= 5.0d && chatHeat.degree > dM49178h && chatHeat.tempDownDegree < dM49178h) {
                final ChatHeat chatHeatMo223809clone = chatHeat.mo223809clone();
                chatHeatMo223809clone.tempDownDegree = dM49178h;
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.njz
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17553k.f91956s.upsert(chatHeatMo223809clone);
                    }
                });
                m120737Y6(dM49178h);
                ((bpz) this.viewModel).m103265u5(warmingUpLevelM120798l3);
                return;
            }
            this.f187198P0 = false;
        }
        e51.m114741F(act(), new Runnable() { // from class: l.ojz
            @Override // java.lang.Runnable
            public final void run() {
                this.f144388a.m204498og();
            }
        });
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: q4 */
    public boolean mo120824q4() {
        return ((bpz) this.viewModel).m103225c4();
    }

    /* JADX INFO: renamed from: qc */
    public final void m204504qc(Message message) {
        int iIntValue;
        boolean zM175940h;
        if (!CoreModule.m29935P().m94658i().mo33380O() || !NullChecker.m81303a(m204527vc()) || m204527vc().isTeamAccount() || !NullChecker.m81303a(this.f96917i) || this.f96917i.isPicVerificationVerified() || (iIntValue = CoreModule.f17545c.f19639e0.f149183H0.get().intValue()) >= 3) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        long jLongValue = CoreModule.f17545c.f19639e0.f149189I0.get().longValue();
        if (iIntValue == 0) {
            zM175940h = qqi0.m175940h(jM155944o, (long) this.f96917i.createdTime, 4);
        } else if (iIntValue == 1) {
            zM175940h = qqi0.m175940h(jM155944o, jLongValue, 1);
        } else {
            zM175940h = iIntValue == 2 ? qqi0.m175940h(jM155944o, jLongValue, 2) : false;
        }
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149196J0.get();
        if (!zM175940h || hashSet.contains(mo120828r3())) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149189I0.put(Long.valueOf(jM155944o));
        CoreModule.f17545c.f19639e0.f149183H0.put(Integer.valueOf(iIntValue + 1));
        Message messageMo223809clone = message.mo223809clone();
        messageMo223809clone.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        messageMo223809clone.messageType = MessageType.get("tantan_verify_toast");
        messageMo223809clone.createdTime = jM155944o;
        messageMo223809clone.localCreatedTime = jM155944o;
        messageMo223809clone.extData = MessageExtData.new_();
        CoreModule.f17545c.f19642f0.m32882Zg(messageMo223809clone);
        hashSet.add(mo120828r3());
        CoreModule.f17545c.f19639e0.f149196J0.put(hashSet);
    }

    /* JADX INFO: renamed from: qd */
    public final void m204505qd() {
        if (!y19.m212164X() || User.isTeamAccount(mo120828r3())) {
            return;
        }
        duringCreated((C22306c) this.f187196N0.switchMap(new w9j() { // from class: l.jgz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117862a.m204538xf((roj0) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ugz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176469a.m204543yf((j760) obj);
            }
        }));
        if (y19.m212150J()) {
            duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(mo120828r3()).filter(new oa8()).map(new w9j() { // from class: l.ghz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).userMessageCount);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.rhz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159502a.m204548zf((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: qe */
    public final /* synthetic */ void m204506qe(Conversation conversation) {
        m204324Bg();
    }

    /* JADX INFO: renamed from: qf */
    public final /* synthetic */ Boolean m204507qf(String str) {
        return Boolean.valueOf(TextUtils.equals(str, mo120828r3()));
    }

    /* JADX INFO: renamed from: qg */
    public final /* synthetic */ void m204508qg(final ChatHeat chatHeat, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, roj0 roj0Var) {
        if (!CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            e51.m114774y(new Runnable() { // from class: l.mjz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m204298wa(chatHeat);
                }
            });
        }
        ((bpz) this.viewModel).m103269w5(warmingUpLevel, warmingUpLevel2);
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: r3 */
    public String mo120828r3() {
        return this.f96911c;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: rc, reason: merged with bridge method [inline-methods] */
    public void mo120748b3(User user) {
        super.mo120748b3(user);
        if (user.isCustomerServiceAccount() || User.isBusinessAI1V1(user.f56011id)) {
            ((bpz) this.viewModel).m190276U1();
        }
    }

    /* JADX INFO: renamed from: rd */
    public final void m204510rd() {
        if (!CoreModule.m29935P().m94658i().mo158443s4() || m120794k4(mo120828r3())) {
            return;
        }
        duringCreated(CoreModule.m29935P().m94658i().mo158313U2()).filter(new w9j() { // from class: l.xfz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((PurchaseType) obj) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.zfz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.nhz
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return wmz.m204126N9(purchaseType, (List) obj2);
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.agz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69537a.m204318Af((PurchaseType) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: re */
    public final /* synthetic */ void m204511re(j760 j760Var) {
        m156455e0().mo48954A0().m156457g0().m128131F1((Conversation) j760Var.f116565b, (User) j760Var.f116564a);
    }

    /* JADX INFO: renamed from: rf */
    public final /* synthetic */ void m204512rf(String str) {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: rg */
    public final /* synthetic */ void m204513rg(Throwable th) {
        this.f187198P0 = false;
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: s3 */
    public C22306c<User> mo120833s3(String str) {
        return CoreModule.f17545c.f19639e0.m169410Ka(str);
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: sc, reason: merged with bridge method [inline-methods] */
    public void mo120753c3(Conversation conversation, q860<Message> q860Var, User user) {
        super.mo120753c3(conversation, q860Var, user);
        if (this.f187211c1) {
            this.f187211c1 = true;
            mtm.m156263n().m156277v(conversation, vwb.m200296J(q860Var.f153135a) ? null : q860Var.f153135a.get(0), user);
        }
        mtm.m156263n().m156267k(conversation, vwb.m200296J(q860Var.f153135a) ? null : q860Var.f153135a.get(0), user);
        m204397Qg(conversation, q860Var);
        if (ruy.m181215g().m181221i(user, this.f96917i)) {
            m204348Gg(q860Var.f153135a);
        }
        if (CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(mo120828r3()) && NullChecker.m81303a(user) && CoreModule.f17545c.f19631b1.m145035e3(mo120828r3()) && !TEnum.equals(conversation.status, "dismissed") && !user.unilateralBlock() && !CoreModule.m29935P().m94658i().mo158276N3() && !this.f187191I0) {
            ((bpz) this.viewModel).m103259r5();
            this.f187191I0 = true;
        }
        m204518sg(mo120828r3(), q860Var.f153135a);
    }

    /* JADX INFO: renamed from: sd */
    public final void m204515sd() {
        if (CoreModule.m29935P().m94658i().mo158465x()) {
            C22306c<T> c22306cDuringCreated = duringCreated(new v9j() { // from class: l.ekz
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f92040a.m204323Bf();
                }
            });
            String strMo120828r3 = mo120828r3();
            Objects.requireNonNull(strMo120828r3);
            c22306cDuringCreated.filter(new fkz(strMo120828r3)).subscribe(mkd0.m154956H(new e30() { // from class: l.gkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103272a.m204328Cf((String) obj);
                }
            }, new e30() { // from class: l.ikz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113755a.m204333Df((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: se */
    public final /* synthetic */ void m204516se() {
        CoreModule.f17545c.f19642f0.m32666Hf(mo120828r3());
    }

    /* JADX INFO: renamed from: sf */
    public final /* synthetic */ void m204517sf(User user) {
        ((bpz) this.viewModel).m103211V3(user);
    }

    /* JADX INFO: renamed from: sg */
    public final void m204518sg(String str, List<Message> list) {
        if (CoreModule.m29935P().m94658i().mo158241H4()) {
            if (User.isTeamAccount(str) || TextUtils.equals(str, User.ID_INTL_LIVE_VIP_SERVICE) || CoreModule.m29935P().m94658i().mo158244I1(CoreModule.f17545c.f19639e0.m169430Pa(str))) {
                m204283tg(false);
                return;
            }
            Iterator<Message> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().owner.equals(m204527vc().f56011id)) {
                    m204283tg(true);
                    return;
                }
                i++;
                if (i >= 10) {
                    m204283tg(true);
                    return;
                }
            }
            m204283tg(false);
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: t6 */
    public void mo120841t6(final Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraMo158257K2 = CoreModule.m29935P().m94658i().mo158257K2(message);
        if (!NullChecker.m81303a(chatGiftInfoExtraMo158257K2) || TextUtils.isEmpty(chatGiftInfoExtraMo158257K2.giftRecordId)) {
            return;
        }
        CoreModule.f17545c.f19643f1.m118072j4(chatGiftInfoExtraMo158257K2.giftRecordId).subscribe(mkd0.m154956H(new e30() { // from class: l.kjz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123517a.m204442bg(message, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: tc */
    public final void m204519tc() {
        if (!y19.m212171f() || mqi0.m155944o() - CoreModule.f17545c.f19642f0.f19986w1.get().longValue() < 604800000) {
            return;
        }
        SettingGroups settingGroups = CoreModule.f17545c.f19639e0.f149253R.get();
        if (!NullChecker.m81303a(settingGroups) || settingGroups.privacy.unrepliedReminder.booleanValue()) {
            duringCreated(mkd0.m154985s(CoreModule.f17545c.f19642f0.m32691Jg(this.f96910b), CoreModule.f17545c.f19642f0.m32737Ne(this.f96910b), CoreModule.f17545c.f19639e0.m169410Ka(mo120828r3()), new y9j() { // from class: l.umz
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((Boolean) obj, (Conversation) obj2, (User) obj3);
                }
            }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.pcz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f148244a.m204412Ud((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: te */
    public final /* synthetic */ void m204520te() {
        e51.m114774y(new Runnable() { // from class: l.oiz
            @Override // java.lang.Runnable
            public final void run() {
                this.f144209a.m204516se();
            }
        });
    }

    /* JADX INFO: renamed from: tf */
    public final /* synthetic */ void m204521tf(C4319c c4319c) {
        if (!User.isTeamAccount(this.f96911c) && CoreModule.m29935P().m94658i().mo158226E3()) {
            ((bpz) this.viewModel).m190326r0();
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel mo120843u3() {
        return this.f187218j1;
    }

    @Nullable
    /* JADX INFO: renamed from: uc */
    public <T extends m8m> T m204522uc(final Class<T> cls) {
        a9m a9mVar = (a9m) vwb.m200346r(this.f187214f1, new w9j() { // from class: l.djz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((a9m) obj).getClass() == cls);
            }
        });
        if (a9mVar != null) {
            return (T) a9mVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: ud */
    public final void m204523ud() {
        lifecycle().filter(new w9j() { // from class: l.akz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.bkz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76151a.m204342Ff((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ue */
    public final /* synthetic */ void m204524ue(dd80[] dd80VarArr) {
        dd80VarArr[0] = null;
        act().m66873d2();
    }

    /* JADX INFO: renamed from: uf */
    public final /* synthetic */ void m204525uf(Integer num) {
        if (num.intValue() < 20) {
            this.f187199Q0 = true;
        }
        if (!this.f187199Q0 || num.intValue() != 20 || CoreModule.m29935P().m94658i().mo158226E3() || ((bpz) this.viewModel).m190264N0()) {
            return;
        }
        ((bpz) this.viewModel).m190309i2();
    }

    /* JADX INFO: renamed from: ug */
    public final List<String> m204526ug() {
        ArrayList arrayList = new ArrayList();
        if (y19.m212149I()) {
            arrayList.add(MessageType.local_birthday_tip);
        }
        if (CoreModule.m29935P().m94658i().mo158458v5()) {
            arrayList.add(MessageType.local_chat_assistant_question_new);
        }
        if (y19.m212155O()) {
            arrayList.add(MessageType.local_heart_beat_lock_tip);
        }
        if (CoreModule.m29935P().m94656g().mo35051cf()) {
            arrayList.add(MessageType.local_platinum_pin_guide);
        }
        if (CoreModule.m29935P().m94651a().mo33482dd()) {
            arrayList.add(MessageType.local_o_diamond_visitor_guide);
        }
        if (CoreModule.m29935P().m94656g().mo35052d4()) {
            arrayList.add(MessageType.local_visitor_hide_footprint);
        }
        if (CoreModule.m29935P().m94651a().mo158419o0()) {
            arrayList.add(MessageType.local_wechat_notify_guide);
        }
        if (CoreModule.m29935P().m94651a().mo33443Xn()) {
            arrayList.add(MessageType.local_ux_questionnaire);
            arrayList.add(MessageType.local_ux_questionnaire_tip);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: vc */
    public User m204527vc() {
        return (User) this.f96918j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ve */
    public final /* synthetic */ void m204528ve(final dd80[] dd80VarArr, knb0 knb0Var) {
        if (!TextUtils.equals("default", ((Conversation) knb0Var.f123875c).convType) || ((User) knb0Var.f123873a).isTeamAccount() || TEnum.equals(((Conversation) knb0Var.f123875c).status, "deleted") || TEnum.equals(((Conversation) knb0Var.f123875c).status, "dismissed") || ((User) knb0Var.f123873a).isBanedOrInactivated()) {
            return;
        }
        boolean zIsPicVerificationVerified = ((User) knb0Var.f123873a).isPicVerificationVerified();
        boolean zIsOpenFilterVeriMsg = ((User) knb0Var.f123873a).isOpenFilterVeriMsg();
        if (!(NullChecker.m81303a(knb0Var.f123874b) && NullChecker.m81303a(((VerificationCenter) knb0Var.f123874b).picVerificationInfo) && TEnum.equals(((VerificationCenter) knb0Var.f123874b).picVerificationInfo.status, "verified")) && zIsPicVerificationVerified && zIsOpenFilterVeriMsg) {
            if (dd80VarArr[0] == null) {
                dd80VarArr[0] = FilterVerificationUserMsgDlg.m45399M(act(), FilterVerificationUserMsgDlg.FilterFrom.MSG_PAGE, (User) knb0Var.f123873a, new d30() { // from class: l.iiz
                    @Override // p149l.d30
                    public final void call() {
                        this.f113476a.m204524ue(dd80VarArr);
                    }
                });
            }
        } else if (NullChecker.m81303a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: vf */
    public final /* synthetic */ Boolean m204529vf(j760 j760Var) {
        return Boolean.valueOf((CoreModule.f17545c.f19639e0.m169460Y7() || !TextUtils.equals(((Message) j760Var.f116564a).owner, CoreModule.m29931H().userId()) || !NullChecker.m81303a(this.f96919k) || !TEnum.equals(this.f96919k.status, "default") || CoreModule.f17545c.f19639e0.f149359e2.get().booleanValue() || m204353Hg() || this.f187222n1) ? false : true);
    }

    /* JADX INFO: renamed from: vg */
    public boolean m204530vg() {
        return (!CoreModule.m29935P().m94658i().mo158458v5() || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3())) || CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).isTeamAccount() || CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).unilateralBlock() || CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).isBannedNew() || CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).isJailed() || CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).inactivated || CoreModule.f17545c.f19639e0.m169527p9().isBannedNew() || CoreModule.f17545c.f19639e0.m169527p9().isJailed() || mo120764e4() || !NullChecker.m81303a(this.f96919k) || this.f96919k.isQuickChatConv() || this.f96919k.isHeartbeatConv() || TEnum.equals(this.f96919k.status, "dismissed") || this.f96919k.f20374mm >= 1 || mqi0.m155944o() < this.f187209a1.get().longValue() + 86400000) ? false : true;
    }

    /* JADX INFO: renamed from: wc */
    public final void m204531wc() {
        CoreModule.f17545c.f19642f0.m32702Kf(m120783i3());
        if (m204499pc()) {
            m204363Jg();
        }
    }

    /* JADX INFO: renamed from: wd */
    public final void m204532wd() {
        duringCreated(CoreModule.f17545c.f19642f0.m33074oo().filter(new w9j() { // from class: l.lfz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Message) obj));
            }
        })).subscribe(new e30() { // from class: l.mfz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133631a.m204406Sg((Message) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19642f0.m33176wn().filter(new w9j() { // from class: l.lfz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Message) obj));
            }
        })).subscribe(new e30() { // from class: l.mfz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133631a.m204406Sg((Message) obj);
            }
        });
        if (y19.m212159S()) {
            User userById = CoreModule.m29932K().getUserById(mo120828r3());
            if (NullChecker.m81303a(userById) && userById.isBannedNew()) {
                return;
            }
            creates(new e30() { // from class: l.ofz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143793a.m204367Kf((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: we */
    public final /* synthetic */ void m204533we() {
        this.f96890G.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: wf */
    public final /* synthetic */ void m204534wf(j760 j760Var) {
        CoreModule.f17545c.f19642f0.m32930dh(this.f96910b, MessageType.get(MessageType.local_push_switch));
        CoreModule.f17545c.f19639e0.f149359e2.put(Boolean.TRUE);
        CoreModule.f17545c.f19639e0.f149335b2.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: wg */
    public boolean mo158961wg() {
        return tqm0.m190131p().m190146s();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion mo120855x3() {
        qvy qvyVar = this.f187192J0;
        if (qvyVar == null) {
            return null;
        }
        return qvyVar.m176729r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.fcz
    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User mo120858x6() {
        return (User) this.f96918j;
    }

    /* JADX INFO: renamed from: xc */
    public final void m204535xc() {
        if (CoreModule.f17545c.f19684t0.m30031p3() || User.isTeamAccount(this.f96910b)) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.bgz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75542a.m204417Vd((User) obj);
            }
        }, new e30() { // from class: l.cgz
            @Override // p149l.e30
            public final void call(Object obj) {
                wmz.m204138Pb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: xd */
    public final void m204536xd() {
        if (CoreModule.m29935P().m94658i().mo158463w4() && NullChecker.m81303a(mo120858x6()) && !vwb.m200296J(mo120858x6().profile.extensions.interest.tags) && CoreModule.m29935P().m94658i().mo158349b0(mo120858x6())) {
            duringCreated(CoreModule.m29935P().m94658i().mo158381g2().take(2)).subscribe(mkd0.m154955G(new e30() { // from class: l.dkz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86768a.m204372Lf((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: xe */
    public final /* synthetic */ void m204537xe(Object obj) {
        if (this.f96891H.isEmpty()) {
            return;
        }
        ((bpz) this.viewModel).m103220Z4(this.f96891H.remove(0), new d30() { // from class: l.hiz
            @Override // p149l.d30
            public final void call() {
                this.f107989a.m204533we();
            }
        });
    }

    /* JADX INFO: renamed from: xf */
    public final /* synthetic */ C22306c m204538xf(roj0 roj0Var) {
        return mkd0.m154984r(m204479lc(), this.f96929s.distinctUntilChanged(), new trq());
    }

    /* JADX INFO: renamed from: xg */
    public void m204539xg(String str, String str2, boolean z) {
        if (z) {
            m204549zg(str, str2);
        } else {
            m204319Ag(str, str2);
        }
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: y6 */
    public void mo120862y6() {
        super.mo120862y6();
        if (NullChecker.m81303a(this.f96919k)) {
            mtm.m156263n().m156276u(this.f96919k);
        }
    }

    /* JADX INFO: renamed from: yc */
    public final void m204540yc() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ocz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143135a.m204420Wd((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: yd */
    public final void m204541yd() {
        duringCreated(CoreModule.f17545c.f19642f0.m32699Jo()).subscribe(mkd0.m154955G(new e30() { // from class: l.nkz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139497a.m204376Mf((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ye */
    public final /* synthetic */ void m204542ye(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.f96891H.clear();
            ((bpz) this.viewModel).m103263t5();
        }
    }

    /* JADX INFO: renamed from: yf */
    public final /* synthetic */ void m204543yf(j760 j760Var) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(j760Var.f116564a) && Boolean.FALSE.equals(j760Var.f116565b) && NullChecker.m81303a(((bpz) this.viewModel).f171676G0)) {
            ((bpz) this.viewModel).m103250n5();
        } else if (NullChecker.m81303a(((bpz) this.viewModel).f171754r1) && ((bpz) this.viewModel).f171754r1.m146780m() == 10) {
            ((bpz) this.viewModel).mo103201Q1(false, new Runnable() { // from class: l.xhz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m204266q8();
                }
            });
        }
        if (!bool.equals(j760Var.f116565b) || TextUtils.isEmpty(this.f96919k.localDraft)) {
            return;
        }
        this.f187210b1 = "";
        m204334Dg();
    }

    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public final void m204493ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m49192v("playTempAnim level = " + m120798l3() + "   chatHeat = " + chatHeat.toJson());
        duringCreated(((bpz) this.viewModel).m103221a4() ? ((bpz) this.viewModel).m103194N3() : C22306c.just(roj0.f160388a)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ziz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203363a.m204446cg(chatHeat, (roj0) obj);
            }
        }));
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: z3 */
    public String mo120863z3() {
        if (!CoreModule.m29935P().m94658i().mo158314U3()) {
            return super.mo120863z3();
        }
        ChatHeat chatHeatM215243m3 = CoreModule.f17545c.f19586M1.m215243m3(this.f96910b);
        if (!NullChecker.m81303a(chatHeatM215243m3)) {
            return User.ID_TEAM_ACCOUNT;
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49188r = MessageWarmingUpHelper.m49188r(chatHeatM215243m3.degree);
        if (warmingUpLevelM49188r.value <= 0) {
            return User.ID_TEAM_ACCOUNT;
        }
        StringBuilder sb = new StringBuilder("level_");
        sb.append(warmingUpLevelM49188r.value - 1);
        return sb.toString();
    }

    @Override // p149l.fcz
    /* JADX INFO: renamed from: z6 */
    public void mo120866z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || this.f96891H.contains(coreGiftInfo) || ((bpz) this.viewModel).m103219Z3()) {
            return;
        }
        ((bpz) this.viewModel).m103222a5(message, coreGiftInfo, null, true, str, z);
        zvf0.m220368A("e_chat_gift_view", act().pageId(), vwb.m200311Y("is_chat_gift_sender", Boolean.valueOf(!TextUtils.isEmpty(str))), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
    }

    /* JADX INFO: renamed from: zc */
    public final void m204545zc() {
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b)).subscribe(mkd0.m154955G(new e30() { // from class: l.ycz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197509a.m204424Xd((User) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo158387h3() && NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
            m204500pd();
        }
    }

    /* JADX INFO: renamed from: zd */
    public final void m204546zd() {
        if (CoreModule.m29935P().m94658i().mo33380O()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3());
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (!NullChecker.m81303a(userM169430Pa) || userM169430Pa.isTeamAccount() || !userM169430Pa.isIdAndPicBothVerified() || !NullChecker.m81303a(userM169527p9) || userM169527p9.isIdAndPicBothVerified() || CoreModule.f17545c.f19639e0.f149203K0.get().booleanValue()) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149203K0.put(Boolean.TRUE);
            ((bpz) this.viewModel).m103254p5(userM169430Pa);
        }
    }

    /* JADX INFO: renamed from: ze */
    public final /* synthetic */ void m204547ze(dd80 dd80Var) {
        if (dd80Var != null && dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: zf */
    public final /* synthetic */ void m204548zf(Integer num) {
        if (num.intValue() > 0) {
            ((bpz) this.viewModel).m103214W4(true);
        }
    }

    /* JADX INFO: renamed from: zg */
    public final void m204549zg(String str, String str2) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = rhi.m179355B(str);
        pictureNew_.mediaType = "image/*";
        pictureNew_.status = MediaLocalStatus.get("raw");
        Message message = new Message();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureNew_);
        message.media = arrayList;
        message.messageType = MessageType.get(MessageType.real_shot);
        message.value = str2;
        m120631A6(message);
    }

    /* JADX INFO: renamed from: mc */
    public final void m204484mc() {
    }
}
