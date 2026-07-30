package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p051p1.mobile.putong.core.data.AnalysisGuide;
import com.p051p1.mobile.putong.core.data.ChatBlockStatus;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.ExchangePicture;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p051p1.mobile.putong.core.data.PlatinumPinChat;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireScene;
import com.p051p1.mobile.putong.core.data.RiskOtherData;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.filter.FilterVerificationUserMsgDlg;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.GPMemo;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tvz extends clz<User, yxz> {

    /* JADX INFO: renamed from: I0 */
    public boolean f176328I0;

    /* JADX INFO: renamed from: J0 */
    public n4z f176329J0;

    /* JADX INFO: renamed from: K0 */
    public C22507a<ChatBlockStatus> f176330K0;

    /* JADX INFO: renamed from: L0 */
    public C22507a<Boolean> f176331L0;

    /* JADX INFO: renamed from: M0 */
    public C22507a<uxj0> f176332M0;

    /* JADX INFO: renamed from: N0 */
    public final C22507a<uxj0> f176333N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f176334O0;

    /* JADX INFO: renamed from: P0 */
    public volatile boolean f176335P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f176336Q0;

    /* JADX INFO: renamed from: R0 */
    public ChatHeat f176337R0;

    /* JADX INFO: renamed from: S0 */
    @Nullable
    public ChatHeat f176338S0;

    /* JADX INFO: renamed from: T0 */
    public n100 f176339T0;

    /* JADX INFO: renamed from: U0 */
    public kr5 f176340U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f176341V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f176342W0;

    /* JADX INFO: renamed from: X0 */
    public int f176343X0;

    /* JADX INFO: renamed from: Y0 */
    public Runnable f176344Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f176345Z0;

    /* JADX INFO: renamed from: a1 */
    public byd0 f176346a1;

    /* JADX INFO: renamed from: b1 */
    public String f176347b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f176348c1;

    /* JADX INFO: renamed from: d1 */
    public int f176349d1;

    /* JADX INFO: renamed from: e1 */
    public jxd0 f176350e1;

    /* JADX INFO: renamed from: f1 */
    public List<qbm> f176351f1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f176352g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f176353h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f176354i1;

    /* JADX INFO: renamed from: j1 */
    public UserLiveLabel f176355j1;

    /* JADX INFO: renamed from: k1 */
    public String f176356k1;

    /* JADX INFO: renamed from: l1 */
    public Runnable f176357l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f176358m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f176359n1;

    /* JADX INFO: renamed from: o1 */
    public Runnable f176360o1;

    /* JADX INFO: renamed from: l.tvz$a */
    public class C20411a implements y20<String> {
        public C20411a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (TextUtils.equals(str, tvz.this.m110989i3()) && i46.m138395c().m138398d(str)) {
                ((yxz) tvz.this.viewModel).m217820A5(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.tvz$b */
    public class C20412b implements y20<Message> {
        public C20412b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Message message) {
            tvz tvzVar = tvz.this;
            int i = tvzVar.f176343X0 + 1;
            tvzVar.f176343X0 = i;
            if (i >= CoreModule.m30933P().m143405a().mo34349Ja().exp_dismiss_count) {
                ((yxz) tvz.this.viewModel).m217820A5(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.tvz$c */
    public class C20413c implements x20 {
        public C20413c() {
        }

        @Override // p153l.x20
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = tvz.this.mo111034r3();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.picture_text_deeplink);
            messageNew_.localCreatedTime = pzi0.m174454o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.f18264c.f20384f0.m33897ah(messageNew_, false);
        }
    }

    /* JADX INFO: renamed from: l.tvz$d */
    public class C20414d implements x20 {
        public C20414d() {
        }

        @Override // p153l.x20
        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = tvz.this.mo111034r3();
            vxd0 vxd0Var = App.f16092i;
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            messageNew_.messageType = MessageType.get(MessageType.picture_text_deeplink);
            messageNew_.localCreatedTime = pzi0.m174454o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = tvz.this.mo111034r3();
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.f18264c.f20384f0.m33897ah(messageNew_, false);
        }
    }

    public tvz(ner nerVar, Conversation conversation) {
        super(nerVar);
        this.f176328I0 = false;
        this.f176330K0 = C22507a.m222758b();
        this.f176331L0 = C22507a.m222758b();
        this.f176332M0 = C22507a.m222758b();
        this.f176333N0 = C22507a.m222758b();
        this.f176334O0 = false;
        this.f176335P0 = false;
        this.f176336Q0 = false;
        this.f176338S0 = null;
        this.f176339T0 = new n100();
        this.f176341V0 = false;
        this.f176342W0 = false;
        this.f176344Y0 = null;
        this.f176345Z0 = false;
        this.f176347b1 = "";
        this.f176348c1 = false;
        this.f176351f1 = new ArrayList();
        this.f176352g1 = new Runnable() { // from class: l.apz
            @Override // java.lang.Runnable
            public final void run() {
                this.f72765a.m193214Xf();
            }
        };
        this.f176353h1 = false;
        this.f176354i1 = false;
        this.f176355j1 = null;
        this.f176357l1 = new Runnable() { // from class: l.bpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f77841a.m193222Zf();
            }
        };
        this.f176358m1 = false;
        this.f176360o1 = new Runnable() { // from class: l.cpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f83049a.m193226ag();
            }
        };
        if (NullChecker.m82486a(conversation)) {
            this.f82474c = conversation.f56859id;
            this.f82473b = conversation.otherUser;
            this.f82482k = conversation;
            if (gta.m132210e().m132214d().mo34887mj()) {
                this.f176345Z0 = n46.m161541g().m161552o(this.f82474c);
            }
            this.f176347b1 = conversation.localDraft;
        }
        this.f176346a1 = new byd0("chat_assistant_question_message_show_time_" + CoreModule.m30929H().userId() + "_" + this.f82474c, 0L);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m192850B7(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.unreadMessages = 0;
        CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m192853Ba(Throwable th) {
    }

    /* JADX INFO: renamed from: C9 */
    public static /* synthetic */ void m192857C9() {
    }

    /* JADX INFO: renamed from: D8 */
    public static /* synthetic */ void m192861D8(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            CoreModule.f18264c.f20385f1.m155883I3();
        }
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m192869Eb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ed */
    private void m192870Ed(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m50375v("initWarmingUpView = " + this.f176334O0 + " level = " + warmingUpLevel);
        if (this.f176334O0) {
            return;
        }
        this.f176334O0 = true;
        ((yxz) this.viewModel).m217847S3(warmingUpLevel);
        m143372e0().mo50138B0().m143374g0().m113962H0(warmingUpLevel);
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m192886I7(Optional optional) {
        if (optional.isPresent()) {
            ((qbm) optional.get()).handle();
        }
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m192887I8(Throwable th) {
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ void m192889Ia(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ void m192891J7(int i, boolean z, Message message) {
        message.localMyVisitorCount = i;
        message.localMyVisitorHidden = z;
    }

    /* JADX INFO: renamed from: J9 */
    public static /* synthetic */ void m192893J9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ja */
    public static /* synthetic */ Boolean m192894Ja(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m192903L9(Throwable th) {
    }

    /* JADX INFO: renamed from: La */
    public static /* synthetic */ Boolean m192904La(Conversation conversation) {
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, "default") && !pm6.m172913a(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, "default"));
    }

    /* JADX INFO: renamed from: Lb */
    public static /* synthetic */ void m192905Lb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ Optional m192909Ma(ArrayList arrayList, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        jyb.m147525o0(listAsList, new zrz(), ", ");
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                ((qbm) arrayList.get(i)).getClass();
                return Optional.m15467of((qbm) arrayList.get(i));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: Mc */
    private void m192911Mc() {
        if (h39.m133422K()) {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9(), mo110915T2(), new qu20())).subscribe(psd0.m173596G(new y20() { // from class: l.qsz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159371a.m193299re((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N9 */
    public static /* synthetic */ PurchaseType m192914N9(PurchaseType purchaseType, List list) {
        return purchaseType;
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m192915Na(Throwable th) {
    }

    /* JADX INFO: renamed from: O9 */
    public static /* synthetic */ void m192919O9(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ void m192926Pb(Throwable th) {
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m192930Qa(Throwable th) {
    }

    /* JADX INFO: renamed from: Rb */
    public static /* synthetic */ void m192936Rb(Throwable th) {
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m192937S7(Throwable th) {
    }

    /* JADX INFO: renamed from: Sc */
    private void m192942Sc() {
        if (TextUtils.isEmpty(this.f82474c)) {
            return;
        }
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f82474c);
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82474c);
        if (conversationM33859Xe == null || !conversationM33859Xe.isHeartbeatConv() || conversationM33859Xe.additional.heartbeatMatch == null) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20313H1.m123898D3()).subscribe(psd0.m173596G(new y20() { // from class: l.muz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138864a.m193139He((Message) obj);
            }
        }));
        final C22507a c22507aM222758b = C22507a.m222758b();
        creates(new y20() { // from class: l.xuz
            @Override // p153l.y20
            public final void call(Object obj) {
                Conversation conversation = conversationM33859Xe;
                CoreModule.f18264c.f20313H1.m123933z3(conversation.additional.heartbeatMatch.isPassive, conversation.f56859id, c22507aM222758b);
            }
        });
        if (conversationM33859Xe.additional.heartbeatMatch.isPassive) {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33730Mg(mo111034r3()).filter(new qcj() { // from class: l.dvz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), c22507aM222758b, new rcj() { // from class: l.quz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (uxj0) obj2);
                }
            }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.evz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96063a.m193110Be(userM116503Pa, (pf60) obj);
                }
            }, new y20() { // from class: l.fvz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193060ra((Throwable) obj);
                }
            }));
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33730Mg(mo111034r3()).filter(new qcj() { // from class: l.gvz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m192970Y7((Boolean) obj);
                }
            }).take(1), c22507aM222758b, new rcj() { // from class: l.quz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (uxj0) obj2);
                }
            }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.ivz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117235a.m193115Ce(userM116503Pa, (pf60) obj);
                }
            }, new y20() { // from class: l.jvz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193041mb((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20384f0.m33702Jo().take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.nuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                }
            }, new y20() { // from class: l.ouz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193069tb((Throwable) obj);
                }
            }));
        } else {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33694Jg(mo111034r3()).filter(new qcj() { // from class: l.puz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), c22507aM222758b, new rcj() { // from class: l.quz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (uxj0) obj2);
                }
            }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.ruz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164952a.m193120De(userM116503Pa, (pf60) obj);
                }
            }, new y20() { // from class: l.suz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192987ba((Throwable) obj);
                }
            }));
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20384f0.m33694Jg(mo111034r3()).filter(new qcj() { // from class: l.tuz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m192894Ja((Boolean) obj);
                }
            }).take(1), c22507aM222758b, new rcj() { // from class: l.quz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (uxj0) obj2);
                }
            }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.uuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181102a.m193124Ee(userM116503Pa, (pf60) obj);
                }
            }, new y20() { // from class: l.vuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192930Qa((Throwable) obj);
                }
            }));
        }
        final boolean z = conversationM33859Xe.additional.heartbeatMatch.isPassive;
        duringCreated(C22421c.combineLatest(mo110920U2().map(new qcj() { // from class: l.yuz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Conversation) obj).convType;
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.zuz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, "default"));
            }
        }).take(1), c22507aM222758b, new avz()).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.bvz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78672a.m193129Fe(z, (pf60) obj);
            }
        }, new y20() { // from class: l.cvz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193079v9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Uc */
    private void m192953Uc() {
        CoreModule.f18264c.f20384f0.m33729Mf(m110989i3());
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33823Ue(mo111034r3()).filter(new sb8()).first(), CoreModule.f18264c.f20381e0.m116491Ma(mo111034r3()).filter(new C20291td()).first(), new rcj() { // from class: l.ovz
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Conversation) obj, (User) obj2);
            }
        }).switchMap(new qcj() { // from class: l.pvz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154350a.m193144Ie((pf60) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.qvz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192886I7((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m192957Va(Throwable th) {
    }

    /* JADX INFO: renamed from: W9 */
    public static /* synthetic */ void m192961W9(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wb */
    public static /* synthetic */ Boolean m192963Wb(bkj0 bkj0Var) {
        User user = (User) bkj0Var.f77081a;
        boolean zBooleanValue = ((Boolean) bkj0Var.f77082b).booleanValue();
        Message message = (Message) bkj0Var.f77083c;
        return Boolean.valueOf(NullChecker.m82486a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified() && !zBooleanValue && NullChecker.m82486a(message) && (message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人")));
    }

    /* JADX INFO: renamed from: Wc */
    private void m192964Wc() {
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.psz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153981a.m193159Le((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m192969Xb(jl80 jl80Var) {
        if (jl80Var == null || !jl80Var.isShowing()) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89209d3.put(pzi0.m174459t());
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: Y7 */
    public static /* synthetic */ Boolean m192970Y7(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b9 */
    public static /* synthetic */ void m192986b9(Boolean bool) {
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ void m192987ba(Throwable th) {
    }

    /* JADX INFO: renamed from: bc */
    public static /* synthetic */ void m192989bc(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: da */
    public static /* synthetic */ Boolean m192997da(pf60 pf60Var, qbm qbmVar) {
        try {
            return Boolean.valueOf(qbmVar.mo119523a((Conversation) pf60Var.f152156a, (User) pf60Var.f152157b));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            qu2.m178128w(e);
            e.toString();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ Boolean m193002ea(bkj0 bkj0Var) {
        User user = (User) bkj0Var.f77081a;
        return Boolean.valueOf(NullChecker.m82486a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified() && !((Boolean) bkj0Var.f77082b).booleanValue() && jyb.m147520m(jyb.m147517k0((List) bkj0Var.f77083c, 5), new qcj() { // from class: l.jrz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人"));
            }
        }));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m193003eb(Throwable th) {
    }

    /* JADX INFO: renamed from: fc */
    public static /* synthetic */ void m193009fc(Throwable th) {
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ Boolean m193017ha(Conversation conversation, Boolean bool, Boolean bool2) {
        if (TextUtils.isEmpty(conversation.clearedUntil) || TextUtils.equals(conversation.clearedUntil, "0")) {
            return Boolean.valueOf((NullChecker.m82486a(bool) && bool.booleanValue() && NullChecker.m82486a(bool2) && bool2.booleanValue()) ? false : true);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hb */
    public static /* synthetic */ void m193018hb(Throwable th) {
    }

    /* JADX INFO: renamed from: j9 */
    public static /* synthetic */ void m193025j9(Throwable th) {
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m193027jb(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: k8 */
    public static /* synthetic */ Boolean m193029k8(ChatHeat chatHeat, ChatHeat chatHeat2) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50358e = NullChecker.m82486a(chatHeat) ? MessageWarmingUpHelper.m50358e(chatHeat) : null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50358e2 = NullChecker.m82486a(chatHeat2) ? MessageWarmingUpHelper.m50358e(chatHeat2) : null;
        return Boolean.valueOf(NullChecker.m82486a(warmingUpLevelM50358e2) && warmingUpLevelM50358e2 == warmingUpLevelM50358e);
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m193031ka(Throwable th) {
    }

    /* JADX INFO: renamed from: kb */
    public static /* synthetic */ void m193032kb() {
        if (CoreModule.f18264c.f20381e0.f89239h1.get().booleanValue()) {
            CoreModule.f18264c.f20381e0.f89239h1.put(Boolean.FALSE);
            CoreModule.f18264c.f20381e0.f89247i1.clear();
        }
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ void m193041mb(Throwable th) {
    }

    /* JADX INFO: renamed from: n9 */
    public static /* synthetic */ Boolean m193043n9(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: o8 */
    public static /* synthetic */ void m193046o8(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q8 */
    public static /* synthetic */ void m193054q8() {
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m193059r9(Message message) {
        mk8 mk8Var = CoreModule.f18264c.f20422r2;
        mk8Var.f137269l0 = 0;
        mk8Var.f137268k0.clear();
    }

    /* JADX INFO: renamed from: ra */
    public static /* synthetic */ void m193060ra(Throwable th) {
    }

    /* JADX INFO: renamed from: tb */
    public static /* synthetic */ void m193069tb(Throwable th) {
    }

    /* JADX INFO: renamed from: td */
    private void m193070td() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.wsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190705a.m193125Ef((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: tg */
    private void m193071tg(boolean z) {
        m143372e0().mo50138B0().m143374g0().m114042t1(z);
    }

    /* JADX INFO: renamed from: v9 */
    public static /* synthetic */ void m193079v9(Throwable th) {
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m193080va(PutongAct putongAct) {
        MessagesAct messagesAct = (MessagesAct) putongAct;
        if (NullChecker.m82486a(messagesAct.mo50158l().m111048t7().f160408n1)) {
            messagesAct.mo50158l().m111048t7().f160408n1.setSelectionHook(messagesAct.mo50158l().m111048t7().f160408n1.getCountHook());
        }
    }

    /* JADX INFO: renamed from: vb */
    public static /* synthetic */ void m193081vb(Throwable th) {
    }

    /* JADX INFO: renamed from: vd */
    private void m193082vd() {
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().filter(new qcj() { // from class: l.rrz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146357G3());
            }
        }).flatMap(new qcj() { // from class: l.srz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170422a.m193135Gf((UserPrivilege) obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.trz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175953a.m193145If((ODiamondVisitorInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m193085w9(Throwable th) {
    }

    /* JADX INFO: renamed from: wa */
    public static /* synthetic */ void m193086wa(ChatHeat chatHeat) {
        final ChatHeat chatHeatMo225055clone = chatHeat.mo225055clone();
        chatHeatMo225055clone.levelUp = false;
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.msz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115551s.upsert(chatHeatMo225055clone);
            }
        });
    }

    /* JADX INFO: renamed from: wb */
    public static /* synthetic */ ChatHeat m193087wb(ChatHeat chatHeat) {
        if (chatHeat == null) {
            return null;
        }
        return chatHeat.mo225055clone();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ void m193093y7(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: yb */
    public static /* synthetic */ Integer m193097yb(pf60 pf60Var) {
        return (Integer) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m193099z8(Throwable th) {
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m193100z9(Location location) {
    }

    /* JADX INFO: renamed from: Ac */
    public final void m193103Ac() {
        String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(strMo111034r3), CoreModule.f18264c.f20381e0.m116487La(strMo111034r3), new rcj() { // from class: l.usz
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((User) obj, (GPMemo) obj2);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.vsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185675a.m193216Yd((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ad */
    public final void m193104Ad() {
        if (CoreModule.m30933P().m143405a().mo34446Xn()) {
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_ux_questionnaire);
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_ux_questionnaire_tip);
            int iMo34518hn = CoreModule.m30933P().m143405a().mo34518hn();
            int iMo34423Tm = CoreModule.m30933P().m143405a().mo34423Tm();
            Random random = new Random();
            if (iMo34518hn == iMo34423Tm) {
                this.f176349d1 = iMo34518hn;
            } else if (iMo34518hn < iMo34423Tm) {
                this.f176349d1 = random.nextInt(iMo34423Tm - iMo34518hn) + iMo34518hn;
            } else {
                this.f176349d1 = random.nextInt(iMo34518hn - iMo34423Tm) + iMo34423Tm;
            }
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(m110989i3());
            if (NullChecker.m82486a(userM116503Pa) && !userM116503Pa.isTeamAccount()) {
                CoreModule.f18264c.f20431u2.f114300X.put(Long.valueOf(pzi0.m174454o()));
            }
            this.f176350e1 = new jxd0("ux_questionnaire_showed" + CoreModule.m30929H().userId() + "/" + mo111034r3(), Boolean.FALSE);
            if (mo110970e4() || !NullChecker.m82486a(userM116503Pa) || userM116503Pa.isTeamAccount() || userM116503Pa.unilateralBlock() || userM116503Pa.isAccountCancellation() || userM116503Pa.isFakeUser() || userM116503Pa.isBannedNew() || !NullChecker.m82486a(conversationM33859Xe) || conversationM33859Xe.isQuickChatConv() || this.f176350e1.get().booleanValue()) {
                return;
            }
            duringCreated(mo110920U2().distinctUntilChanged().filter(new qcj() { // from class: l.hvz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f111858a.m193169Nf((Conversation) obj);
                }
            }).flatMap(new qcj() { // from class: l.svz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20431u2.m139433c3(QuestionnaireScene.get(QuestionnaireScene.messageDetail), null);
                }
            }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.wlz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f189750a.m193174Of((Questionnaire) obj);
                }
            }, new y20() { // from class: l.hmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193018hb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ae */
    public final /* synthetic */ void m193105Ae(C4470c c4470c) {
        final jl80 jl80VarM146020O = act().newDialog().m146024S(ibc0.f113761C0).m146056y0("功能全新升级").m146051t0("本次聊天需要消耗一次闪聊次数").m146021P(false).m146018M(false).m146033b0("同意并聊天").m146028W("不同意").m146020O();
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.vqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f185412a.m193335ze(jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.wqz
            @Override // java.lang.Runnable
            public final void run() {
                tvz.m192969Xb(jl80VarM146020O);
            }
        });
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: Af */
    public final /* synthetic */ void m193106Af(PurchaseType purchaseType) {
        boolean z = !joa.m146386f4();
        if (NullChecker.m82486a(((yxz) this.viewModel).f202029Q1)) {
            ((yxz) this.viewModel).f202029Q1.m175741t(z);
        }
    }

    /* JADX INFO: renamed from: Ag */
    public final void m193107Ag(String str, String str2) {
        vel0 vel0Var = new vel0(str);
        if (!NullChecker.m82486a(vel0Var.f183805a)) {
            o1j0.m165634h(R$string.f21469C2);
            return;
        }
        if (vel0Var.f183806b > Constants.ONE_MIN_IN_MILLIS) {
            o1j0.m165634h(R$string.f21607T4);
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.media = new ArrayList();
        Video video = new Video();
        video.url = oki.m168011B(vel0Var.f183805a);
        video.status = MediaLocalStatus.get("raw");
        messageNew_.media.add(video);
        messageNew_.messageType = MessageType.get(MessageType.real_shot);
        messageNew_.value = str2;
        m110913S5(messageNew_);
    }

    /* JADX INFO: renamed from: Bc */
    public final void m193108Bc() {
        CoreModule.f18264c.f20384f0.m33717Lf(m110989i3());
        if (TextUtils.isEmpty(this.f176356k1) && h39.m133420I()) {
            duringCreated(mo111039s3(this.f82473b).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.itz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116884a.m193220Zd((User) obj);
                }
            }, new y20() { // from class: l.jtz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192869Eb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Bd */
    public final void m193109Bd() {
        if (CoreModule.f18273l.m143410g().mo36055d4()) {
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_visitor_hide_footprint);
            duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_visitor_hide_footprint)), CoreModule.f18264c.f20410n2.m121462H3(mo111034r3()), new scj() { // from class: l.xlz
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return new bkj0((User) obj, (Boolean) obj2, (Optional) obj3);
                }
            }).filter(new qcj() { // from class: l.ylz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f200604a.m193179Pf((bkj0) obj);
                }
            }).first()).subscribe(psd0.m173596G(new y20() { // from class: l.zlz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205018a.m193184Qf((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Be */
    public final /* synthetic */ void m193110Be(User user, pf60 pf60Var) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(mo111034r3());
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isHeartbeatConv() && CoreModule.m30933P().m143412i().mo34605uh() && !user.unilateralBlock()) {
            ((yxz) this.viewModel).m178894H0();
            ((yxz) this.viewModel).m178936c2("后消失，快去打个招呼吧");
        }
    }

    /* JADX INFO: renamed from: Bf */
    public final /* synthetic */ C22421c m193111Bf() {
        return m111000k4(mo111034r3()) ? CoreModule.f18264c.f20384f0.m33775Pp() : C22421c.just("");
    }

    /* JADX INFO: renamed from: Bg */
    public final void m193112Bg() {
        FrameLayout frameLayout;
        View viewM150991j;
        Conversation conversationM110994j3 = m110994j3();
        if (conversationM110994j3 == null || act() == null || act().getWindow() == null || m193315vc() == null) {
            return;
        }
        m193126Eg();
        kr5 kr5Var = new kr5(act(), conversationM110994j3);
        this.f176340U0 = kr5Var;
        if (!kr5Var.m151001t() || (viewM150991j = this.f176340U0.m150991j((frameLayout = (FrameLayout) act().getWindow().getDecorView().findViewById(edc0.f93316Z)), m193315vc())) == null) {
            return;
        }
        frameLayout.addView(viewM150991j);
        if (this.f176342W0) {
            return;
        }
        this.f176340U0.m151000s(false);
        this.f176342W0 = true;
    }

    /* JADX INFO: renamed from: Cc */
    public final void m193113Cc() {
        creates(new y20() { // from class: l.mnz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137750a.m193224ae((Bundle) obj);
            }
        }, new x20() { // from class: l.nnz
            @Override // p153l.x20
            public final void call() {
                tvz.m192857C9();
            }
        });
    }

    /* JADX INFO: renamed from: Cd */
    public final void m193114Cd() {
        if (rum0.m183208c()) {
            ((yxz) this.viewModel).m217855W3(true);
        }
    }

    /* JADX INFO: renamed from: Ce */
    public final /* synthetic */ void m193115Ce(User user, pf60 pf60Var) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(mo111034r3());
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isHeartbeatConv()) {
            if (CoreModule.m30933P().m143412i().mo34605uh() && !user.unilateralBlock()) {
                ((yxz) this.viewModel).m178894H0();
                boolean zIsLimitMatch = conversationM33859Xe.isLimitMatch();
                V v2 = this.viewModel;
                if (zIsLimitMatch) {
                    ((yxz) v2).m178936c2("内发送消息即可解锁限时");
                } else {
                    ((yxz) v2).m178936c2("内可以回应他，即可解除限时");
                }
            }
            if (conversationM33859Xe.isLimitMatch()) {
                return;
            }
            CoreModule.f18264c.f20313H1.m123926f4(mo111034r3());
        }
    }

    /* JADX INFO: renamed from: Cf */
    public final /* synthetic */ void m193116Cf(String str) {
        m143372e0().mo50143F().mo127919s0();
        m143372e0().mo50138B0().m194211p2(true);
        if (lifecycle_() == C4470c.f16267i) {
            o1j0.m165649w(R$string.f21568O5);
        }
    }

    /* JADX INFO: renamed from: Cg */
    public final void m193117Cg() {
        if (!CoreModule.m30933P().m143412i().mo180440b() || TextUtils.isEmpty(mo111034r3())) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3())).take(1).filter(new qcj() { // from class: l.nqz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).isTeamAccount());
            }
        }).flatMap(new qcj() { // from class: l.pqz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153715a.m193238dg((User) obj);
            }
        }).take(1).filter(new qcj() { // from class: l.qqz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tvz.m192904La((Conversation) obj);
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.rqz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164532a.m193242eg((Conversation) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.sqz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170288a.m193246fg((List) obj);
            }
        }, new y20() { // from class: l.tqz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192915Na((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Dc */
    public final void m193118Dc() {
        if (User.isBusinessAI1V1(mo111034r3())) {
            CoreModule.f18264c.f20297C0.m146428y4();
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m193119Dd() {
        if (mo150404wg()) {
            duringCreated(C22421c.combineLatest(xzm0.m213760p().m213766i().distinctUntilChanged().observeOn(fo0.m126432a()), this.f176332M0, new rcj() { // from class: l.etz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Integer) obj, (uxj0) obj2);
                }
            }).map(new qcj() { // from class: l.ptz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m193097yb((pf60) obj);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.auz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73573a.m193189Rf((Integer) obj);
                }
            }));
            duringCreated(xzm0.m213760p().m213761A().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.luz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133668a.m193193Sf((Integer) obj);
                }
            }));
            l51.m152888H(act(), new Runnable() { // from class: l.wuz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190897a.m193198Tf();
                }
            }, 700L);
        }
    }

    /* JADX INFO: renamed from: De */
    public final /* synthetic */ void m193120De(User user, pf60 pf60Var) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(mo111034r3());
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isHeartbeatConv() && CoreModule.m30933P().m143412i().mo34605uh() && !user.unilateralBlock()) {
            ((yxz) this.viewModel).m178894H0();
            ((yxz) this.viewModel).m178936c2(String.format("未和%s发送消息，将解除匹配", (NullChecker.m82486a(user) && user.isFemale()) ? "她" : "他"));
        }
    }

    /* JADX INFO: renamed from: Df */
    public final /* synthetic */ void m193121Df(Throwable th) {
        m143372e0().mo50138B0().m194211p2(false);
        if (lifecycle_() == C4470c.f16267i) {
            o1j0.m165649w(R$string.f21560N5);
        }
    }

    /* JADX INFO: renamed from: Dg */
    public void m193122Dg() {
        this.f176333N0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Ec */
    public final void m193123Ec() {
        CoreModule.f18264c.f20384f0.m33605Cf(m110989i3());
        if (TextUtils.isEmpty(this.f176356k1) && m193318vg()) {
            duringCreated(CoreModule.f18264c.f20353U1.m125489h3("icebreak")).subscribe(psd0.m173597H(new y20() { // from class: l.spz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170121a.m193228be((List) obj);
                }
            }, new y20() { // from class: l.tsz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193025j9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ee */
    public final /* synthetic */ void m193124Ee(User user, pf60 pf60Var) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(m110989i3());
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isHeartbeatConv()) {
            if (CoreModule.m30933P().m143412i().mo34605uh() && !user.unilateralBlock()) {
                ((yxz) this.viewModel).m178894H0();
                ((yxz) this.viewModel).m178936c2("内对方回复即可匹配");
            }
            if (conversationM33859Xe.isLimitMatch()) {
                return;
            }
            CoreModule.f18264c.f20313H1.m123926f4(mo111034r3());
        }
    }

    /* JADX INFO: renamed from: Ef */
    public final /* synthetic */ void m193125Ef(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && mo111005l4()) {
            CoreModule.m30933P().m143412i().mo180370N5(mo111034r3());
        } else if (c4470c == C4470c.f16271m) {
            CoreModule.m30933P().m143412i().mo180572z2();
        }
    }

    /* JADX INFO: renamed from: Eg */
    public final void m193126Eg() {
        kr5 kr5Var = this.f176340U0;
        if (kr5Var != null) {
            kr5Var.m150999r();
            this.f176340U0 = null;
        }
    }

    /* JADX INFO: renamed from: Fc */
    public final void m193127Fc() {
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).filter(new qcj() { // from class: l.cmz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new qcj() { // from class: l.dmz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).ageVerificationInfo;
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.emz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94710a.m193232ce((AgeVerificationInfo) obj);
            }
        }));
        if (IntlCountryCodeController.m29117n()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), psd0.m173626s(CoreModule.f18264c.f20384f0.m33740Ne(mo111034r3()), CoreModule.f18264c.f20384f0.m33682Ig(mo111034r3()), CoreModule.f18264c.f20384f0.m33730Mg(mo111034r3()), new scj() { // from class: l.fmz
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return tvz.m193017ha((Conversation) obj, (Boolean) obj2, (Boolean) obj3);
                }
            }).distinctUntilChanged(), new rcj() { // from class: l.gmz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return pf60.m172085a((User) obj, (Boolean) obj2);
                }
            })).map(new qcj() { // from class: l.imz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f115848a.m193236de((pf60) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.jmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121720a.m193240ee((Boolean) obj);
                }
            }));
            duringCreated(this.f176331L0).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.kmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127544a.m193244fe((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fd */
    public final void m193128Fd() {
        if (CoreModule.m30933P().m143405a().mo180511o0()) {
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_wechat_notify_guide);
            duringCreated(psd0.m173627t(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_wechat_notify_guide)), CoreModule.f18264c.f20384f0.m34179wn(), CoreModule.f18264c.f20381e0.f89061K1, new tcj() { // from class: l.nlz
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return bkj0.m104818a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new qcj() { // from class: l.olz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f147884a.m193202Uf((bkj0) obj);
                }
            }).first()).subscribe(psd0.m173596G(new y20() { // from class: l.plz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153109a.m193207Vf((bkj0) obj);
                }
            }));
            duringCreated(C22421c.combineLatest(Act.foreground().map(new dj20()).distinctUntilChanged().filter(new qcj() { // from class: l.qlz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m193043n9((Boolean) obj);
                }
            }).switchMap(new qcj() { // from class: l.rlz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116511Ra();
                }
            }), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_wechat_notify_guide)), new rcj() { // from class: l.slz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return jyb.m147494Y((WechatNotifySetting) obj, (Boolean) obj2);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.tlz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174872a.m193210Wf((pf60) obj);
                }
            }, new y20() { // from class: l.ulz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192893J9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fe */
    public final /* synthetic */ void m193129Fe(boolean z, pf60 pf60Var) {
        if (CoreModule.m30933P().m143412i().mo34605uh()) {
            ((yxz) this.viewModel).m178981w0();
        }
        CoreModule.f18264c.f20313H1.m123895A3(this.f82474c, z);
    }

    /* JADX INFO: renamed from: Ff */
    public final /* synthetic */ void m193130Ff(C4470c c4470c) {
        if (NullChecker.m82486a(((yxz) this.viewModel).f202029Q1) && NullChecker.m82486a(((yxz) this.viewModel).f202029Q1.m175743v()) && bnl0.m105529O0(((yxz) this.viewModel).f202029Q1.m175743v()) && TextUtils.equals(this.f82473b, C4891g.f20578Y2)) {
            CoreModule.m30933P().m143412i().mo34365Lf(act(), "p_messages,knowbetter", Privilege.unlock_learn_about_him_module, null, null);
            i4g0.m138520r("e_know_him_better_guide", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: Fg */
    public final void m193131Fg() {
        if (gta.m132210e().m132214d().mo34887mj()) {
            duringCreated(mo110920U2().first()).subscribe(psd0.m173596G(new y20() { // from class: l.nvz
                @Override // p153l.y20
                public final void call(Object obj) {
                    n46.m161541g().m161544f(((Conversation) obj).f56859id);
                }
            }));
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: G6 */
    public void mo110860G6() {
        super.mo110860G6();
        CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_o_diamond_visitor_guide);
    }

    /* JADX INFO: renamed from: Gc */
    public final void m193132Gc() {
        User userM116503Pa;
        if (!CoreModule.m30933P().m143412i().mo180371O2() || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b)) == null || userM116503Pa.isTeamAccount() || userM116503Pa.isBanned() || userM116503Pa.isBannedNew() || userM116503Pa.isAccountCancellation()) {
            return;
        }
        Keyboard keyboardMo125457a = m143372e0().mo50155d0().m143374g0().mo125457a();
        if (NullChecker.m82486a(keyboardMo125457a)) {
            keyboardMo125457a.m49982C();
        }
        duringCreated(m143372e0().mo50155d0().m201110x0()).subscribe(psd0.m173596G(new y20() { // from class: l.duz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90887a.m193248ge((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Gd */
    public boolean m193133Gd() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
        if (CoreModule.f18273l.m143412i().mo34307De()) {
            return !NullChecker.m82486a(userM116503Pa) || userM116503Pa.inactivated || userM116503Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN));
        }
        return false;
    }

    /* JADX INFO: renamed from: Ge */
    public final /* synthetic */ void m193134Ge(View view) {
        m193277nc();
    }

    /* JADX INFO: renamed from: Gf */
    public final /* synthetic */ C22421c m193135Gf(UserPrivilege userPrivilege) {
        return CoreModule.f18264c.f20410n2.m121461G3(mo111034r3());
    }

    /* JADX INFO: renamed from: Gg */
    public final void m193136Gg(List<Message> list) {
        if (!o3z.m165898g().m165901e(mo111034r3()) || this.f176358m1) {
            return;
        }
        this.f176358m1 = true;
        o3z.m165898g().f144869a.put(mo111034r3());
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
            i4g0.m138492A("e_secret_message", pageId(), jyb.m147494Y("other_user_id", mo111034r3()), jyb.m147494Y(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, str));
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: H6 */
    public void mo110865H6() {
        super.mo110865H6();
        CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_platinum_pin_guide);
    }

    /* JADX INFO: renamed from: Hc */
    public final void m193137Hc() {
        User userM116503Pa;
        if (!CoreModule.m30933P().m143412i().mo180406U3() || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b)) == null || userM116503Pa.isTeamAccount() || userM116503Pa.isBanned() || userM116503Pa.isBannedNew() || userM116503Pa.isAccountCancellation()) {
            return;
        }
        duringCreated(mo110920U2().map(new qcj() { // from class: l.npz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MessageWarmingUpHelper.m50359f(((Conversation) obj).f21116mm);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.opz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148525a.m193252he((MessageWarmingUpHelper.WarmingUpLevel) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20328M1.m111474s3(mo111034r3()).filter(new qcj() { // from class: l.ppz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((ChatHeat) obj));
            }
        }).distinctUntilChanged(new rcj() { // from class: l.qpz
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return tvz.m193029k8((ChatHeat) obj, (ChatHeat) obj2);
            }
        }).observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.tpz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175667a.m193257ie((ChatHeat) obj);
            }
        }));
        duringCreated(psd0.m173627t(CoreModule.f18264c.f20328M1.m111474s3(this.f82473b).distinctUntilChanged().map(new qcj() { // from class: l.upz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tvz.m193087wb((ChatHeat) obj);
            }
        }), CoreModule.f18264c.f20384f0.m33740Ne(this.f82473b), CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b), CoreModule.f18272k.f115535c.m189482r0(this.f82473b, MessageType.chat_gift).m208677m(), new tcj() { // from class: l.vpz
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return jyb.m147495Z((ChatHeat) obj, (Conversation) obj2, (User) obj3, (List) obj4);
            }
        }).observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.wpz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190374a.m193260je((ovb0) obj);
            }
        }));
        duringCreated(m143372e0().mo50155d0().m201110x0()).subscribe(psd0.m173596G(new y20() { // from class: l.xpz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195763a.m193264ke((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Hd */
    public final boolean m193138Hd() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
        if (NullChecker.m82486a(userM116503Pa)) {
            return userM116503Pa.onlineMatchLocked();
        }
        return false;
    }

    /* JADX INFO: renamed from: He */
    public final /* synthetic */ void m193139He(Message message) {
        if (CoreModule.m30933P().m143412i().mo34605uh()) {
            ((yxz) this.viewModel).m178981w0();
        }
        if (TextUtils.equals(message.cid, mo111034r3())) {
            new th0.C20312a(act()).m191151j("对方已离开，是否要删除配对？").m191159r("是").m191156o(new View.OnClickListener() { // from class: l.mrz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138433a.m193134Ge(view);
                }
            }).m191147f("否").m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: Hf */
    public final /* synthetic */ void m193140Hf(ODiamondVisitorInfo oDiamondVisitorInfo) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((yxz) this.viewModel).f160421t1)) {
            VText vTextMo175737d = ((yxz) this.viewModel).f160421t1.mo175737d();
            if (NullChecker.m82486a(vTextMo175737d)) {
                bnl0.m105524M(vTextMo175737d, true);
                vTextMo175737d.setText(q8g0.m175796b0(String.format("%s\n%s", oDiamondVisitorInfo.visitCountStr, oDiamondVisitorInfo.visitTimeStr), jyb.m147507f0(oDiamondVisitorInfo.visitCount, oDiamondVisitorInfo.visitTime), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: Hg */
    public final boolean m193141Hg() {
        if (CoreModule.m30933P().m143405a().mo180511o0() && NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.opened && jvp0.m147081g(App.f16088e).isWXAppInstalled()) {
            boolean z = (CoreModule.f18264c.f20381e0.f89061K1.m222761e() == null || !CoreModule.f18264c.f20381e0.f89061K1.m222761e().isPresent() || CoreModule.f18264c.f20381e0.f89061K1.m222761e().get().wechatLaunch == null) ? false : true;
            WechatNotifyConfig wechatNotifyConfigMo180425X3 = CoreModule.m30933P().m143405a().mo180425X3();
            boolean z2 = ConversationCounterTypeSp.wechatNotifyGuideShowCount.get(this.f82474c) > 0;
            boolean z3 = wechatNotifyConfigMo180425X3 != null && pzi0.m174439D(CoreModule.f18264c.f20381e0.f89291n5.get().longValue()) && CoreModule.f18264c.f20381e0.f89306p5.get().intValue() >= wechatNotifyConfigMo180425X3.message_daily_count;
            boolean z4 = wechatNotifyConfigMo180425X3 != null && CoreModule.f18264c.f20381e0.f89299o5.get().intValue() >= wechatNotifyConfigMo180425X3.message_total_count;
            if (z && !z2 && !z3 && !z4) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: I2 */
    public void mo110866I2(CoreGiftInfo coreGiftInfo) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || this.f82454H.contains(coreGiftInfo)) {
            return;
        }
        this.f82454H.add(coreGiftInfo);
        l51.m152886F(act(), new Runnable() { // from class: l.isz
            @Override // java.lang.Runnable
            public final void run() {
                this.f116779a.m193153Kd();
            }
        });
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: I6 */
    public void mo110870I6() {
        super.mo110870I6();
        CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_visitor_hide_footprint);
    }

    /* JADX INFO: renamed from: Ic */
    public final void m193142Ic() {
        if (CoreModule.m30933P().m143405a().mo34534kb() && m110955b4()) {
            duringCreated(k05.m147755h().m147762i().filter(new qcj() { // from class: l.lmz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    bkj0 bkj0Var = (bkj0) obj;
                    return Boolean.valueOf(((Boolean) bkj0Var.f77081a).booleanValue() || ((Boolean) bkj0Var.f77082b).booleanValue() || !jyb.m147479J((Collection) ((pf60) bkj0Var.f77083c).f152157b));
                }
            }).distinctUntilChanged(new rcj() { // from class: l.mmz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    bkj0 bkj0Var = (bkj0) obj;
                    return Boolean.valueOf(NullChecker.m82486a(bkj0Var) && ((pf60) bkj0Var.f77083c).f152156a != ((pf60) ((bkj0) obj2).f77083c).f152156a);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.nmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142751a.m193269le((bkj0) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20384f0.m33847We(this.f82473b).filter(new qcj() { // from class: l.omz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.pmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153242a.m193274me((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Id */
    public final int m193143Id() {
        String strM80485F = RemoteConfig.m80481x().m80485F("ai_chat_advice_guide");
        if (TextUtils.isEmpty(strM80485F)) {
            return 3;
        }
        try {
            int iOptInt = new JSONObject(strM80485F).optInt("keyboardHangThreshold", 3);
            if (iOptInt != 0) {
                return iOptInt;
            }
            return 3;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Ie */
    public final /* synthetic */ C22421c m193144Ie(final pf60 pf60Var) {
        final ArrayList arrayListM147522n = jyb.m147522n(this.f176351f1, new qcj() { // from class: l.yqz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tvz.m192997da(pf60Var, (qbm) obj);
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return C22421c.just(Optional.absent());
        }
        jyb.m147525o0(arrayListM147522n, new qcj() { // from class: l.arz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((qbm) obj).getClass().getSimpleName();
            }
        }, " ,");
        return psd0.m173623p(jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.brz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((qbm) obj).mo119524b().onErrorReturn(new qcj() { // from class: l.xrz
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.FALSE;
                    }
                }).first();
            }
        }), new zcj() { // from class: l.crz
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return tvz.m192909Ma(arrayListM147522n, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: If */
    public final /* synthetic */ void m193145If(final ODiamondVisitorInfo oDiamondVisitorInfo) {
        CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_o_diamond_visitor_guide);
        if (TextUtils.isEmpty(oDiamondVisitorInfo.visitCountStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTimeStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitCount) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTime)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.esz
            @Override // java.lang.Runnable
            public final void run() {
                this.f95669a.m193140Hf(oDiamondVisitorInfo);
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public final void m193146Ig() {
        CoreModule.f18264c.f20384f0.m33825Ug(m110989i3(), "guide_type_answer");
        CoreModule.f18264c.f20440x2.m112776r3(m110989i3());
    }

    /* JADX INFO: renamed from: Jc */
    public final void m193147Jc() {
        if (CoreModule.f18273l.m143412i().mo180495l()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()).filter(new C20291td()), CoreModule.f18264c.f20384f0.m33740Ne(mo111034r3()), new qu20())).subscribe(psd0.m173596G(new y20() { // from class: l.cuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83925a.m193279ne((pf60) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Jd */
    public final /* synthetic */ Boolean m193148Jd(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var.f152156a) && TextUtils.isEmpty(this.f176347b1) && TEnum.equals(((Conversation) pf60Var.f152156a).status, "default") && TextUtils.isEmpty(((Conversation) pf60Var.f152156a).localDraft) && TextUtils.equals(((Conversation) pf60Var.f152156a).convType, "default") && NullChecker.m82486a(pf60Var.f152157b) && !((User) pf60Var.f152157b).isTeamAccount() && !((User) pf60Var.f152157b).isBannedNew() && !((User) pf60Var.f152157b).isAccountCancellation());
    }

    /* JADX INFO: renamed from: Je */
    public final /* synthetic */ C22421c m193149Je(User user) {
        return CoreModule.f18264c.f20384f0.m33740Ne(this.f82473b);
    }

    /* JADX INFO: renamed from: Jf */
    public final /* synthetic */ void m193150Jf() {
        ((yxz) this.viewModel).m217892o5();
    }

    /* JADX INFO: renamed from: Jg */
    public final void m193151Jg() {
        duringCreated(CoreModule.f18264c.f20440x2.m112780v3(m110989i3())).subscribe(psd0.m173597H(new y20() { // from class: l.rsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164760a.m193250gg((AnalysisGuide) obj);
            }
        }, new y20() { // from class: l.ssz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193085w9((Throwable) obj);
            }
        }));
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: K6 */
    public void mo110880K6(IceBreakingQuestion iceBreakingQuestion) {
        if (NullChecker.m82486a(this.f176329J0)) {
            this.f176329J0.m161621D0(iceBreakingQuestion);
        }
    }

    /* JADX INFO: renamed from: Kc */
    public final void m193152Kc() {
        m193112Bg();
        if (this.f176341V0) {
            return;
        }
        this.f176341V0 = true;
        lifecycle().filter(new qcj() { // from class: l.ltz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.mtz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138701a.m193284oe((C4470c) obj);
            }
        }, new y20() { // from class: l.ntz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193009fc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3().skip(1)).subscribe(psd0.m173597H(new y20() { // from class: l.otz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149035a.m193289pe((List) obj);
            }
        }, new y20() { // from class: l.qtz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193099z8((Throwable) obj);
            }
        }));
        duringCreated(mo110915T2().skip(1)).subscribe(psd0.m173597H(new y20() { // from class: l.rtz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164886a.m193294qe((Conversation) obj);
            }
        }, new y20() { // from class: l.stz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192937S7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Kd */
    public final /* synthetic */ void m193153Kd() {
        if (((yxz) this.viewModel).m217861Z3()) {
            return;
        }
        this.f82453G.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Ke */
    public final /* synthetic */ void m193154Ke(Conversation conversation) {
        if (!pzi0.m174439D(CoreModule.f18264c.f20422r2.f137270m0)) {
            mk8 mk8Var = CoreModule.f18264c.f20422r2;
            mk8Var.f137269l0 = 0;
            mk8Var.f137268k0.clear();
        }
        if (CoreModule.f18264c.f20422r2.f137268k0.contains(mo111034r3())) {
            return;
        }
        CoreModule.f18264c.f20422r2.f137268k0.add(mo111034r3());
        mk8 mk8Var2 = CoreModule.f18264c.f20422r2;
        mk8Var2.f137269l0++;
        mk8Var2.f137270m0 = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: Kf */
    public final /* synthetic */ void m193155Kf(Bundle bundle) {
        l51.m152888H(((yxz) this.viewModel).act(), new Runnable() { // from class: l.eqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f95432a.m193150Jf();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: Kg */
    public void m193156Kg() {
        ArrayList arrayList = new ArrayList();
        if (this.f176345Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116574j7(m110989i3(), "", arrayList).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.nsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143564a.m193254hg((List) obj);
            }
        }, new y20() { // from class: l.osz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148912a.m193258ig((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Lc */
    public final void m193157Lc() {
        if (CoreModule.m30933P().m143412i().mo34386O8()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116499Oa(this.f82473b)).subscribe(psd0.m173597H(new y20() { // from class: l.ttz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193027jb((uxj0) obj);
                }
            }, new y20() { // from class: l.utz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193031ka((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ld */
    public final /* synthetic */ void m193158Ld(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Le */
    public final /* synthetic */ void m193159Le(List list) {
        nvm.m164890n().m164894k(this.f82482k, null, m193315vc());
    }

    /* JADX INFO: renamed from: Lf */
    public final /* synthetic */ void m193160Lf(uxj0 uxj0Var) {
        ((yxz) this.viewModel).f160421t1.mo120539k();
    }

    /* JADX INFO: renamed from: Lg */
    public final void m193161Lg(final boolean z) {
        if (CoreModule.m30933P().m143412i().mo180376P0()) {
            CoreModule.m30933P().m143412i().mo180462e5(act(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.grz
                @Override // p153l.x20
                public final void call() {
                    this.f106213a.m193266kg(z);
                }
            }, new x20() { // from class: l.hrz
                @Override // p153l.x20
                public final void call() {
                    this.f111396a.m193271lg();
                }
            });
        } else {
            m193255ic(z, new y20() { // from class: l.irz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116614a.m193276mg((Boolean) obj);
                }
            });
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: M2 */
    public void mo110885M2(final PutongAct putongAct) {
        super.mo110885M2(putongAct);
        if (this.f176354i1) {
            putongAct.postDelayed(new Runnable() { // from class: l.hqz
                @Override // java.lang.Runnable
                public final void run() {
                    tvz.m193080va(putongAct);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: Md */
    public final /* synthetic */ void m193162Md(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Me */
    public final /* synthetic */ void m193163Me(uxj0 uxj0Var) {
        ((yxz) this.viewModel).m217882j5("test", "他近期發佈過疑似廣告信息，聊天請謹慎");
    }

    /* JADX INFO: renamed from: Mf */
    public final /* synthetic */ void m193164Mf(Message message) {
        if (message.isMe()) {
            m193292qc(message);
        }
    }

    /* JADX INFO: renamed from: Mg */
    public void m193165Mg(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m50375v("warming up start");
        this.f176335P0 = true;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50371r = MessageWarmingUpHelper.m50371r(chatHeat.degree);
        if (warmingUpLevelM50371r == null || warmingUpLevelM50371r == MessageWarmingUpHelper.WarmingUpLevel.not) {
            this.f176335P0 = false;
            return;
        }
        if (chatHeat.levelUp) {
            warmingUpLevelM50371r = warmingUpLevelM50371r.pre();
        }
        m110948Z6(warmingUpLevelM50371r);
        m110953a7(chatHeat.degree);
        m192870Ed(warmingUpLevelM50371r);
        l51.m152888H(act(), new Runnable() { // from class: l.gqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f105978a.m193281ng(chatHeat);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Nc */
    public final void m193166Nc() {
        if (h39.m133431T()) {
            creates(new y20() { // from class: l.umz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m193093y7((Bundle) obj);
                }
            }, new x20() { // from class: l.vmz
                @Override // p153l.x20
                public final void call() {
                    this.f184792a.m193308te();
                }
            });
            duringCreated(C22421c.combineLatest(mo111039s3(mo111034r3()), mo110920U2(), new qu20()).first().filter(new qcj() { // from class: l.wmz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(!((User) pf60Var.f152156a).isTeamAccount() && TextUtils.equals("default", ((Conversation) pf60Var.f152157b).convType));
                }
            })).observeOn(Schedulers.m222739io()).subscribe(psd0.m173597H(new y20() { // from class: l.xmz
                @Override // p153l.y20
                public final void call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    CoreModule.f18264c.f20384f0.m33591Be((User) pf60Var.f152156a, (Conversation) pf60Var.f152157b);
                }
            }, new y20() { // from class: l.ymz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192936Rb((Throwable) obj);
                }
            }));
            final jl80[] jl80VarArr = new jl80[1];
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged(), mo110920U2(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new tcj() { // from class: l.zmz
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new ovb0((User) obj, (VerificationCenter) obj2, (Conversation) obj3, (User) obj4);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.anz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72403a.m193316ve(jl80VarArr, (ovb0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Nd */
    public final /* synthetic */ void m193167Nd() {
        if (this.f176355j1 != null) {
            this.f176355j1 = null;
            ((yxz) this.viewModel).m178947g2();
            return;
        }
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        this.f176355j1 = userLiveLabel;
        userLiveLabel.buttonTitle = "进入直播间";
        userLiveLabel.userId = mo111034r3();
        this.f176355j1.mainTitle = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).isFemale() ? "她正在视频直播" : "他正在视频直播";
        this.f176355j1.subTitle = "多人连线已开启，等你加入";
        ((yxz) this.viewModel).m178947g2();
    }

    /* JADX INFO: renamed from: Ne */
    public final /* synthetic */ void m193168Ne(CoreData coreData) {
        if (NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.userRisk) && !TextUtils.isEmpty(coreData.userRisk.text)) {
            yxz yxzVar = (yxz) this.viewModel;
            RiskOtherData riskOtherData = coreData.userRisk;
            yxzVar.m217882j5(riskOtherData.type, riskOtherData.text);
        }
    }

    /* JADX INFO: renamed from: Nf */
    public final /* synthetic */ Boolean m193169Nf(Conversation conversation) {
        return Boolean.valueOf(conversation.f21116mm >= this.f176349d1 && CoreModule.m30933P().m143405a().mo34607un());
    }

    /* JADX INFO: renamed from: Ng */
    public final void m193170Ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m50375v("tempDownAnim = " + chatHeat.toJson());
        l51.m152919y(new Runnable() { // from class: l.fsz
            @Override // java.lang.Runnable
            public final void run() {
                this.f100702a.m193291pg(chatHeat);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m193171Oc() {
        duringCreated(this.f82453G).subscribe(psd0.m173596G(new y20() { // from class: l.amz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72295a.m193325xe(obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.bmz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77424a.m193330ye((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Od */
    public final /* synthetic */ void m193172Od() {
        ((yxz) this.viewModel).m217894p5(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: Oe */
    public final /* synthetic */ void m193173Oe(bkj0 bkj0Var) {
        CoreModule.f18264c.f20384f0.m33980hh(mo111034r3());
    }

    /* JADX INFO: renamed from: Of */
    public final /* synthetic */ void m193174Of(Questionnaire questionnaire) {
        if (questionnaire != null && CoreModule.m30933P().m143405a().mo34607un()) {
            this.f176350e1.put(Boolean.TRUE);
            CoreModule.f18264c.f20431u2.f114298V.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20431u2.f114299W.m203841a(1);
            CoreModule.f18264c.f20384f0.m34057nh(this.f82474c, questionnaire);
        }
    }

    /* JADX INFO: renamed from: Og */
    public final void m193175Og(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m50375v("tempUpAnim start fromLevel = " + warmingUpLevel + " nextLevel = " + warmingUpLevel2 + " chatHeat = " + chatHeat.toJson());
        duringCreated(CoreModule.f18264c.f20328M1.m111463A3(this.f82473b).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.csz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83648a.m193296qg(chatHeat, warmingUpLevel, warmingUpLevel2, (uxj0) obj);
            }
        }, new y20() { // from class: l.dsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90530a.m193301rg((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Pc */
    public final void m193176Pc() {
        if (CoreModule.m30933P().m143412i().mo180494k5()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116495Na(this.f82473b)).subscribe(psd0.m173597H(new y20() { // from class: l.euz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192889Ia((uxj0) obj);
                }
            }, new y20() { // from class: l.fuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192853Ba((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Pd */
    public final /* synthetic */ void m193177Pd() {
        CoreModule.f18264c.f20373b1.f193005S.put(Boolean.FALSE);
        ((yxz) this.viewModel).m217898r5();
    }

    /* JADX INFO: renamed from: Pe */
    public final /* synthetic */ void m193178Pe(bkj0 bkj0Var) {
        CoreModule.f18264c.f20384f0.m33980hh(mo111034r3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Pf */
    public final /* synthetic */ Boolean m193179Pf(bkj0 bkj0Var) {
        return Boolean.valueOf(xg0.m210874e((User) bkj0Var.f77081a) && xg0.m210873d(this.f82482k) && !((Boolean) bkj0Var.f77082b).booleanValue());
    }

    /* JADX INFO: renamed from: Pg */
    public final void m193180Pg() {
        if (TextUtils.isEmpty(mo111034r3()) || !TextUtils.equals(mo111034r3(), CoreModule.f18273l.m143412i().mo180475h())) {
            return;
        }
        CoreModule.f18273l.m143412i().mo180338I3(m110989i3());
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: Q2 */
    public boolean mo110901Q2(Message message, boolean z, Sticker sticker) {
        return super.mo110901Q2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Qc */
    public final void m193181Qc() {
        CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_heart_beat_lock_tip);
        if (h39.m133426O()) {
            jxd0 jxd0Var = new jxd0("heart_beat_lock_message_showed_" + CoreModule.m30929H().userId() + "/" + mo111034r3(), Boolean.FALSE);
            if (NullChecker.m82486a(this.f82482k) && this.f82482k.isHeartbeatConv() && !this.f82482k.isLimitMatch() && this.f82482k.isHeartBeatLock() && !jxd0Var.get().booleanValue()) {
                jxd0Var.put(Boolean.TRUE);
                CoreModule.f18264c.f20384f0.m33909bh(this.f82474c, MessageType.get(MessageType.local_heart_beat_lock_tip), "本次聊天需要消耗1次心动次数", null);
            }
        }
    }

    /* JADX INFO: renamed from: Qd */
    public final /* synthetic */ void m193182Qd() {
        CoreModule.f18264c.f20384f0.m33980hh(mo111034r3());
    }

    /* JADX INFO: renamed from: Qe */
    public final /* synthetic */ void m193183Qe(Integer num, Boolean bool, Message message) {
        if (num.intValue() == 100 && bool.booleanValue()) {
            ((yxz) this.viewModel).m178939d2();
        }
        if (bool.booleanValue()) {
            ((yxz) this.viewModel).m178888B1();
        }
        if (NullChecker.m82486a(message) && NullChecker.m82486a(this.f82482k) && this.f82482k.hasLocalBreakIce) {
            CoreModule.f18264c.f20319J1.m35572g5(this.f82474c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Qf */
    public final /* synthetic */ void m193184Qf(bkj0 bkj0Var) {
        final boolean z;
        final int i;
        Optional optional = (Optional) bkj0Var.f77083c;
        boolean z2 = false;
        if (optional.isPresent()) {
            Visitor visitor = (Visitor) optional.get();
            i = visitor.visitCount;
            z = visitor.hidden;
        } else {
            z = false;
            i = 0;
        }
        int iMo35972Hs = CoreModule.m30933P().m143408e().mo35972Hs();
        int iMo35976Se = CoreModule.m30933P().m143408e().mo35976Se();
        boolean z3 = i >= CoreModule.m30933P().m143408e().mo35969Fj();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills;
        boolean z4 = pzi0.m174439D(((long) conversationCounterTypeSp.get(this.f82474c)) * 1000) && ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(this.f82474c) >= iMo35976Se;
        if (pzi0.m174439D(CoreModule.f18264c.f20410n2.f94748a0.get().longValue()) && CoreModule.f18264c.f20410n2.f94749b0.get().intValue() >= iMo35972Hs) {
            z2 = true;
        }
        if (joa.m146357G3() || z || !z3 || z2 || z4) {
            return;
        }
        CoreModule.f18264c.f20384f0.m33909bh(this.f82474c, MessageType.get(MessageType.local_visitor_hide_footprint), MessageType.local_visitor_hide_footprint, new y20() { // from class: l.nrz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192891J7(i, z, (Message) obj);
            }
        });
        if (pzi0.m174439D(CoreModule.f18264c.f20410n2.f94748a0.get().longValue())) {
            CoreModule.f18264c.f20410n2.f94749b0.m203841a(1);
        } else {
            CoreModule.f18264c.f20410n2.f94749b0.put(1);
        }
        CoreModule.f18264c.f20410n2.f94748a0.put(Long.valueOf(pzi0.m174454o()));
        if (pzi0.m174439D(((long) conversationCounterTypeSp.get(mo111034r3())) * 1000)) {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo111034r3());
        } else {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo111034r3(), 1);
        }
        conversationCounterTypeSp.set(mo111034r3(), (int) (pzi0.m174454o() / 1000));
    }

    /* JADX INFO: renamed from: Qg */
    public final void m193185Qg(Conversation conversation, vg60<Message> vg60Var) {
        if (jyb.m147479J(vg60Var.f184001a)) {
            return;
        }
        Message message = vg60Var.f184001a.get(0);
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) && vg60Var.f184001a.size() >= 2 && TEnum.equals(vg60Var.f184001a.get(1).messageType, MessageType.get("sticker"))) {
            message = vg60Var.f184001a.get(1);
        }
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) || this.f176339T0.m161054a(message.f56859id)) {
            return;
        }
        if ((TextUtils.isEmpty(conversation.readUntil) || conversation.readUntil.compareTo(message.f56859id) >= 0 || message.isMe()) && (!message.isMe() || message.f56859id.contains("fake_id_") || pzi0.m174454o() - message.createdTime >= 4000.0d)) {
            return;
        }
        this.f176339T0.m161055b(message.f56859id);
        Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(message.sticker);
        if (NullChecker.m82486a(stickerM35930s3) && TEnum.equals(stickerM35930s3.source, "poke")) {
            String strM50368o = MessageWarmingUpHelper.m50368o(stickerM35930s3);
            if (TextUtils.isEmpty(strM50368o)) {
                return;
            }
            m111048t7().m217866b5(message, strM50368o, stickerM35930s3);
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: R2 */
    public boolean mo110906R2(Message message, boolean z, Sticker sticker) {
        if (NullChecker.m82486a(m193315vc()) && m193315vc().unilateralBlock() && !Network.isConnected(act())) {
            o1j0.m165640n(R$string.f21461B2);
        }
        return super.mo110906R2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m193186Rc() {
        if (h39.m133426O() && NullChecker.m82486a(this.f82482k) && this.f82482k.isHeartbeatConv() && this.f82482k.isHeartBeatLock()) {
            return;
        }
        if ((NullChecker.m82486a(this.f82482k) && this.f82482k.isLimitMatch()) || !TextUtils.equals(act().getIntent().getStringExtra("heartbeat_consume_type"), "quickchat") || TextUtils.equals(CoreModule.f18264c.f20381e0.f89209d3.get(), pzi0.m174459t())) {
            return;
        }
        lifecycle().filter(new qcj() { // from class: l.jpz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.kpz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128145a.m193105Ae((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Rd */
    public final /* synthetic */ void m193187Rd() {
        CoreModule.f18264c.f20384f0.m33849Wg(mo111034r3(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: Re */
    public final /* synthetic */ void m193188Re(Boolean bool) {
        m143372e0().mo50138B0().m194209o2();
        if (bool.booleanValue()) {
            ((yxz) this.viewModel).m178986z0();
            ((yxz) this.viewModel).m217845R3();
        }
    }

    /* JADX INFO: renamed from: Rf */
    public final /* synthetic */ void m193189Rf(Integer num) {
        if (!xzm0.m213760p().m213773q()) {
            azy azyVarM114043u0 = m143372e0().mo50138B0().m143374g0().m114043u0();
            if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                azyVarM114043u0.m101177I(true);
            }
        }
        if (TextUtils.equals(xzm0.m213760p().m213770m(), mo111034r3())) {
            ((yxz) this.viewModel).m217912y5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: Rg */
    public void m193190Rg(boolean z) {
        l51.m152890J(this.f176360o1);
        if (z && m193282oc()) {
            l51.m152888H(act(), this.f176360o1, ((long) m193143Id()) * 1000);
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: S2 */
    public boolean mo110910S2(Message message, boolean z, Sticker sticker) {
        Message message2;
        User userM193315vc = m193315vc();
        String strM157130c = m600.m157130c();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (NullChecker.m82486a(userM193315vc) && userM193315vc.unilateralBlock()) {
            if (Network.isConnected(act())) {
                if (NullChecker.m82486a(userM193315vc) && userM193315vc.onlineMatch() && userM193315vc.onlineMatchLocked()) {
                    o1j0.m165634h(userM193315vc.isFemale() ? R$string.f21536K5 : R$string.f21544L5);
                } else {
                    o1j0.m165634h(R$string.f21799p5);
                }
                if (NullChecker.m82486a(userM193315vc)) {
                    message2 = message;
                    m600.m157134g(message2, strM157130c, "lift_match", userM193315vc.f56859id, 0, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            } else {
                o1j0.m165640n(R$string.f21461B2);
            }
            message2 = message;
        } else {
            message2 = message;
        }
        return super.mo110910S2(message2, z, sticker);
    }

    /* JADX INFO: renamed from: Sd */
    public final /* synthetic */ void m193191Sd() {
        int iMo35972Hs = CoreModule.m30933P().m143408e().mo35972Hs();
        int iMo35976Se = CoreModule.m30933P().m143408e().mo35976Se();
        int iMo35969Fj = CoreModule.m30933P().m143408e().mo35969Fj();
        long j = ((long) ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.get(this.f82474c)) * 1000;
        long j2 = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(this.f82474c);
        if (!pzi0.m174439D(j)) {
            j2 = 0;
        }
        o1j0.m165651y("每天最多展示总次数（可配置）：" + iMo35972Hs + "\n同一会话每天最多展示次数（可配置）：" + iMo35976Se + "\n同一会话最少访问次数（可配置）：" + iMo35969Fj + "\n当前会话上次访问时间：" + pzi0.f154859f.format(new Date(j)) + "\n当前会话已经访问次数：" + j2 + "\n每天已经展示过的总次数：" + (pzi0.m174439D(CoreModule.f18264c.f20410n2.f94748a0.get().longValue()) ? CoreModule.f18264c.f20410n2.f94749b0.get().intValue() : 0L));
    }

    /* JADX INFO: renamed from: Se */
    public final /* synthetic */ void m193192Se(User user) {
        boolean zUnilateralBlock = user.unilateralBlock();
        V v2 = this.viewModel;
        if (zUnilateralBlock) {
            ((yxz) v2).m178981w0();
        } else {
            ((yxz) v2).m217845R3();
        }
    }

    /* JADX INFO: renamed from: Sf */
    public final /* synthetic */ void m193193Sf(Integer num) {
        if (TextUtils.equals(xzm0.m213760p().m213770m(), mo111034r3()) || xzm0.m213760p().m213773q()) {
            ((yxz) this.viewModel).m217872e5(xzm0.m213760p().m213769l(), num.intValue());
        }
    }

    /* JADX INFO: renamed from: Sg */
    public final void m193194Sg(Message message) {
        if (TEnum.equals(message.messageType, MessageType.exchange_picture) && NullChecker.m82486a(message.additionalData)) {
            ExchangePicture exchangePicture = message.additionalData.exchangePicture;
            if (NullChecker.m82486a(exchangePicture) && exchangePicture.exchangeType == ExchangePicture.BACK_MESSAGE && !TextUtils.isEmpty(exchangePicture.launchMessageId) && TextUtils.equals(exchangePicture.status, ExchangePicture.finished)) {
                CoreModule.f18264c.f20384f0.m34194xq(exchangePicture.launchMessageId);
            }
        }
    }

    /* JADX INFO: renamed from: Tc */
    public final void m193195Tc() {
        this.f176351f1.add(new e5b0((yxz) this.viewModel, this));
        this.f176351f1.add(new h5b0((yxz) this.viewModel, this));
        this.f176351f1.add(new q6f((yxz) this.viewModel));
        this.f176351f1.add(new zri0((yxz) this.viewModel, this));
        this.f176351f1.add(new sye((yxz) this.viewModel, this));
        this.f176351f1.add(new oye((yxz) this.viewModel, this));
        this.f176351f1.add(new o6c0((yxz) this.viewModel, this));
    }

    /* JADX INFO: renamed from: Td */
    public final /* synthetic */ void m193196Td() {
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(mo111034r3(), 0);
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(this.f82474c, 0);
        CoreModule.f18264c.f20410n2.f94748a0.put(0L);
        CoreModule.f18264c.f20410n2.f94749b0.put(0);
        o1j0.m165651y("已重置");
    }

    /* JADX INFO: renamed from: Te */
    public final /* synthetic */ void m193197Te(jl80 jl80Var, Boolean bool) {
        jl80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: Tf */
    public final /* synthetic */ void m193198Tf() {
        this.f176332M0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Tg */
    public int m193199Tg() {
        return this.f176349d1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ud */
    public final /* synthetic */ void m193200Ud(bkj0 bkj0Var) {
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            Conversation conversation = (Conversation) bkj0Var.f77082b;
            if (conversation.f21116mm == 0 && TextUtils.equals("default", conversation.convType) && TEnum.equals(conversation.status, "default")) {
                User userM110932W5 = m110932W5();
                User user = (User) bkj0Var.f77083c;
                if (userM110932W5.isFemale() || m110950a4(user) || m110950a4(userM110932W5) || user.isTeamAccount()) {
                    return;
                }
                CoreModule.f18264c.f20384f0.f20728w1.put(Long.valueOf(pzi0.m174454o()));
                CoreModule.f18264c.f20384f0.m33933dh(mo111034r3(), MessageType.get(MessageType.local_friend_active_remind_female));
            }
        }
    }

    /* JADX INFO: renamed from: Ue */
    public final /* synthetic */ void m193201Ue(boolean z, final jl80 jl80Var) {
        m193255ic(z, new y20() { // from class: l.xqz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195868a.m193197Te(jl80Var, (Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Uf */
    public final /* synthetic */ Boolean m193202Uf(bkj0 bkj0Var) {
        return Boolean.valueOf(xg0.m210874e((User) bkj0Var.f77081a) && xg0.m210873d(this.f82482k) && !((Boolean) bkj0Var.f77082b).booleanValue());
    }

    /* JADX INFO: renamed from: Ug */
    public jxd0 m193203Ug() {
        return this.f176350e1;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: V2 */
    public boolean mo110925V2() {
        if (CoreModule.m30933P().m143412i().mo180542u() && NullChecker.m82486a(this.f82482k) && (this.f82482k.isHeartbeatConv() || this.f82482k.isSeeUpgradedConv())) {
            return false;
        }
        if (NullChecker.m82486a(this.f82482k) && ((this.f82482k.isFakeHeartbeatConv() || this.f82482k.isFakeQuickChatConv()) && (CoreModule.f18264c.f20381e0.m116537Z7() || CoreModule.f18264c.f20381e0.m116600p9().isRiskAuditAvatar()))) {
            return false;
        }
        return !User.isTeamAccount(mo111034r3());
    }

    /* JADX INFO: renamed from: Vc */
    public final void m193204Vc() {
        if (!CoreModule.m30933P().m143405a().mo180468f4() || User.isTeamAccount(this.f82473b)) {
            return;
        }
        wek0.m206001g().m206007k(mo111034r3());
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b).filter(new qcj() { // from class: l.smz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).onlineMatchLocked());
            }
        }).switchMap(new qcj() { // from class: l.dnz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f89851a.m193149Je((User) obj);
            }
        }).filter(new qcj() { // from class: l.onz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.znz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205263a.m193154Ke((Conversation) obj);
            }
        }, new y20() { // from class: l.koz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192989bc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.f20664b0).subscribe(psd0.m173596G(new y20() { // from class: l.voz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193059r9((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Vd */
    public final /* synthetic */ void m193205Vd(User user) {
        String strM31028o3 = CoreModule.f18264c.f20426t0.m31028o3();
        Settings settings = user.settings;
        String str = (settings == null || settings.getSettingGroup() == null || user.settings.getSettingGroup().tttribe == null) ? "" : user.settings.getSettingGroup().tttribe.transLang;
        if (TextUtils.isEmpty(strM31028o3) || TextUtils.equals(strM31028o3, str)) {
            return;
        }
        i4g0.m138526x("e_intl_ai_translate_bubble", OMSDialogPositon.p_chat_view);
        ((yxz) this.viewModel).m178942e2();
        CoreModule.f18264c.f20426t0.m31030q3();
    }

    /* JADX INFO: renamed from: Ve */
    public final /* synthetic */ void m193206Ve(boolean[] zArr, PurchaseType purchaseType, Act act, String str) {
        zArr[0] = true;
        m193161Lg(false);
    }

    /* JADX INFO: renamed from: Vf */
    public final /* synthetic */ void m193207Vf(bkj0 bkj0Var) {
        if (m193141Hg()) {
            CoreModule.f18264c.f20384f0.m33909bh(this.f82474c, MessageType.get(MessageType.local_wechat_notify_guide), "wechat_notify_guide", null);
            this.f176359n1 = true;
            if (pzi0.m174439D(CoreModule.f18264c.f20381e0.f89291n5.get().longValue())) {
                CoreModule.f18264c.f20381e0.f89306p5.m203841a(1);
            } else {
                CoreModule.f18264c.f20381e0.f89306p5.put(1);
            }
            CoreModule.f18264c.f20381e0.f89291n5.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89299o5.m203841a(1);
            ConversationCounterTypeSp.wechatNotifyGuideShowCount.set(this.f82474c, 1);
            i4g0.m138526x("e_open_wechat_notification", pageId());
        }
    }

    /* JADX INFO: renamed from: Wd */
    public final /* synthetic */ void m193208Wd(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            l51.m152888H(act(), this.f176357l1, 10L);
            if (!User.isLiveServiceAccount(mo111034r3())) {
                m193117Cg();
                ((yxz) this.viewModel).m178947g2();
            }
        } else if (c4470c == C4470c.f16268j) {
            l51.m152890J(this.f176357l1);
        }
        if ((c4470c == C4470c.f16264f || c4470c == C4470c.f16269k) && NullChecker.m82486a(mo111034r3()) && !m111000k4(mo111034r3())) {
            m111043s7(true);
        }
    }

    /* JADX INFO: renamed from: We */
    public final /* synthetic */ void m193209We(boolean[] zArr) {
        if (zArr[0]) {
            return;
        }
        act().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Wf */
    public final /* synthetic */ void m193210Wf(pf60 pf60Var) {
        WechatNotifySetting wechatNotifySetting = (WechatNotifySetting) pf60Var.f152156a;
        if (Boolean.TRUE.equals(pf60Var.f152157b) && wechatNotifySetting == null) {
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_wechat_notify_guide);
        }
    }

    /* JADX INFO: renamed from: Xc */
    public final void m193211Xc() {
        if (h39.m133441e()) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20428t2.f198578R) && CoreModule.f18264c.f20428t2.f198578R.get().booleanValue()) {
                duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.kvz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f129020a.m193163Me((uxj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.f18264c.f20428t2.m215197k3(mo111034r3(), QuestionnaireScene.messageDetail, "user")).subscribe(psd0.m173597H(new y20() { // from class: l.lvz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f133766a.m193168Ne((CoreData) obj);
                    }
                }, new y20() { // from class: l.mvz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tvz.m193003eb((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Xd */
    public final /* synthetic */ void m193212Xd(User user) {
        ((yxz) this.viewModel).m217868c5(user);
    }

    /* JADX INFO: renamed from: Xe */
    public final /* synthetic */ void m193213Xe(boolean[] zArr, jl80 jl80Var, Boolean bool) {
        zArr[0] = true;
        jl80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: Xf */
    public final /* synthetic */ void m193214Xf() {
        ((yxz) this.viewModel).m178889C1();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: Y2 */
    public boolean mo110939Y2() {
        return o3z.m165898g().m165904i(m193315vc(), this.f82480i) && NullChecker.m82486a(this.f82482k) && TEnum.equals(this.f82482k.property.chatInterrupt.stage, "locked");
    }

    /* JADX INFO: renamed from: Yc */
    public void m193215Yc() {
        if (NullChecker.m82486a(this.f82482k) && this.f82482k.isLimitMatch()) {
            ((yxz) this.viewModel).act().duringCreated(mo110920U2().filter(new qcj() { // from class: l.lpz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(NullChecker.m82486a(conversation) && conversation.isLimitMatch() && conversation.unreadMessages > 0);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.mpz
                @Override // p153l.y20
                public final void call(Object obj) {
                    l51.m152919y(new Runnable() { // from class: l.fqz
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.bsz
                                @Override // p153l.x20
                                public final void call() {
                                    tvz.m192850B7(conversation);
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
    public final /* synthetic */ void m193216Yd(pf60 pf60Var) {
        ((yxz) this.viewModel).m178919U1();
        ((yxz) this.viewModel).m178904M1();
        mo110954b3((User) this.f82481j);
        ((yxz) this.viewModel).f160421t1.mo169752j();
        ((yxz) this.viewModel).mo154145D0();
        CoreModule.m30933P().m143412i().mo180303C0();
        CoreModule.m30933P().m143412i().mo180519p2();
    }

    /* JADX INFO: renamed from: Ye */
    public final /* synthetic */ void m193217Ye(boolean z, final boolean[] zArr, final jl80 jl80Var) {
        m193255ic(z, new y20() { // from class: l.yrz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201364a.m193213Xe(zArr, jl80Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yf */
    public final /* synthetic */ void m193218Yf(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).unilateralBlock()) {
            CoreModule.f18264c.f20381e0.m116447Ba(mo111034r3());
        }
    }

    @Override // p153l.clz, p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f176356k1 = act().getIntent().getStringExtra("autoSendMessage");
        if (!TextUtils.isEmpty(mo111034r3())) {
            CoreModule.f18264c.f20373b1.m209839f3(mo111034r3());
        }
        if (!TextUtils.isEmpty(this.f176356k1)) {
            m110892N6(this.f176356k1);
        }
        n4z n4zVar = new n4z(this);
        this.f176329J0 = n4zVar;
        n4zVar.mo40472Z();
        m193195Tc();
        if (h39.m133421J()) {
            ConversationCounterTypeSp.ProloguesEnterChatCount.set(mo111034r3());
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: Z2 */
    public ArrayList<pf60<String, x20>> mo110944Z2() {
        ArrayList<pf60<String, x20>> arrayListMo110944Z2 = super.mo110944Z2();
        if (CoreModule.f18273l.m143412i().mo180440b()) {
            arrayListMo110944Z2.add(jyb.m147494Y("zb直播状态DEBUG", new x20() { // from class: l.moz
                @Override // p153l.x20
                public final void call() {
                    this.f137859a.m193167Nd();
                }
            }));
        }
        arrayListMo110944Z2.add(jyb.m147494Y("探探认证气泡", new x20() { // from class: l.noz
            @Override // p153l.x20
            public final void call() {
                this.f143060a.m193172Od();
            }
        }));
        if (CoreModule.f18273l.m143412i().mo180308D()) {
            arrayListMo110944Z2.add(jyb.m147494Y("拍一拍蒙层引导", new x20() { // from class: l.ooz
                @Override // p153l.x20
                public final void call() {
                    this.f148402a.m193177Pd();
                }
            }));
            arrayListMo110944Z2.add(jyb.m147494Y("功能引导“拍一拍”", new x20() { // from class: l.poz
                @Override // p153l.x20
                public final void call() {
                    tvz.m193032kb();
                }
            }));
        }
        arrayListMo110944Z2.add(jyb.m147494Y("插入认证引导消息", new x20() { // from class: l.qoz
            @Override // p153l.x20
            public final void call() {
                this.f158798a.m193182Qd();
            }
        }));
        arrayListMo110944Z2.add(jyb.m147494Y("插入盲盒引导消息", new x20() { // from class: l.roz
            @Override // p153l.x20
            public final void call() {
                this.f164287a.m193187Rd();
            }
        }));
        arrayListMo110944Z2.add(jyb.m147494Y("访客'隐藏访问足迹'统计次数", new x20() { // from class: l.soz
            @Override // p153l.x20
            public final void call() {
                this.f169989a.m193191Sd();
            }
        }));
        arrayListMo110944Z2.add(jyb.m147494Y("访客'隐藏访问足迹'重置", new x20() { // from class: l.toz
            @Override // p153l.x20
            public final void call() {
                this.f175524a.m193196Td();
            }
        }));
        arrayListMo110944Z2.add(jyb.m147494Y("插入游戏CP消息 自己", new C20413c()));
        arrayListMo110944Z2.add(jyb.m147494Y("插入游戏CP消息 对方", new C20414d()));
        return arrayListMo110944Z2;
    }

    /* JADX INFO: renamed from: Zc */
    public final void m193219Zc() {
        if (nrb0.m164466b() && NullChecker.m82486a(this.f82482k) && TextUtils.equals(this.f82482k.convType, "default") && !CertificationUtil.m59336l()) {
            duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_pic_cert_guide)), CoreModule.f18264c.f20384f0.m34001iq(mo111034r3()), new scj() { // from class: l.pnz
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return bkj0.m104818a((User) obj, (Boolean) obj2, (List) obj3);
                }
            }).first().filter(new qcj() { // from class: l.qnz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m193002ea((bkj0) obj);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.rnz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164137a.m193173Oe((bkj0) obj);
                }
            }));
            duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_pic_cert_guide)), CoreModule.f18264c.f20384f0.m34077oo(), new scj() { // from class: l.snz
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return bkj0.m104818a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new qcj() { // from class: l.tnz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return tvz.m192963Wb((bkj0) obj);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.unz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180001a.m193178Pe((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final /* synthetic */ void m193220Zd(User user) {
        if (CoreModule.f18264c.f20384f0.m33928co(mo111064x6(), this.f82482k)) {
            CoreModule.f18264c.f20384f0.m33837Vg(m110989i3());
        }
    }

    /* JADX INFO: renamed from: Ze */
    public final /* synthetic */ void m193221Ze(final boolean z, final boolean[] zArr, PurchaseType purchaseType) {
        ((yxz) this.viewModel).m217888m5(new y20() { // from class: l.drz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90443a.m193217Ye(z, zArr, (jl80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zf */
    public final /* synthetic */ void m193222Zf() {
        CoreModule.f18273l.m143412i().mo180534s1(mo111034r3());
        CoreModule.f18264c.f20381e0.m116527W9(mo111034r3()).subscribe(psd0.m173597H(new y20() { // from class: l.lqz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192919O9((uxj0) obj);
            }
        }, new y20() { // from class: l.mqz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138284a.m193218Yf((Throwable) obj);
            }
        }));
    }

    @Override // p153l.clz, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m193152Kc();
        m193273md();
        m193251hd();
        m193243fd();
        m110921U3();
        m193113Cc();
        m193278nd();
        m193328yc();
        m193235dd();
        m193114Cd();
        m193303sd();
        m193329yd();
        m193239ed();
        m193298rd();
        CoreModule.m30933P().m143412i().mo180322F3(act());
        m193180Pg();
        this.f176329J0.mo40473a0();
        m193127Fc();
        m193171Oc();
        m193147Jc();
        if (CoreModule.m30933P().m143412i().mo180296B()) {
            m193070td();
        }
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            m193103Ac();
        }
        if (CoreModule.m30933P().m143412i().mo180445b5()) {
            m193247gd();
        }
        m193119Dd();
        m193272mc();
        m192942Sc();
        m193176Pc();
        m193108Bc();
        m192953Uc();
        m193333zc();
        m193223ad();
        m193324xd();
        m193132Gc();
        m193137Hc();
        m193227bd();
        m193157Lc();
        m193231cd();
        m193283od();
        m193186Rc();
        m193142Ic();
        m193256id();
        m193320wd();
        m193123Ec();
        m192911Mc();
        m193307tc();
        m193181Qc();
        m193219Zc();
        m193166Nc();
        m193263kd();
        m193259jd();
        m193215Yc();
        m193131Fg();
        m193109Bd();
        m193128Fd();
        m193211Xc();
        m193104Ad();
        m193204Vc();
        m193268ld();
        if (CoreModule.m30933P().m143410g().mo36057d9() && !joa.m146361M3()) {
            m193311ud();
        }
        m193293qd();
        m193118Dc();
        m193319wc();
        m193323xc();
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        m192964Wc();
    }

    /* JADX INFO: renamed from: ad */
    public void m193223ad() {
        if (CoreModule.m30933P().m143406b().mo36110Yg() && CoreModule.m30933P().m143406b().mo36129v6(this.f82482k)) {
            boolean zMo36123nl = CoreModule.m30933P().m143406b().mo36123nl(this.f82482k);
            if (zMo36123nl && CoreModule.m30933P().m143406b().mo36134xk()) {
                CoreModule.m30933P().m143406b().mo36118io(this.f82482k.f21116mm, this.f82474c);
            }
            CoreModule.m30933P().m143406b().mo36111Zf(this, this.f82473b, this.f82474c, zMo36123nl, CoreModule.m30933P().m143406b().mo36108Wr(this.f82482k), new a30() { // from class: l.gnz
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f105175a.m193183Qe((Integer) obj, (Boolean) obj2, (Message) obj3);
                }
            });
            duringCreated(CoreModule.f18264c.f20319J1.m35582u5()).subscribe(psd0.m173597H(new y20() { // from class: l.hnz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110851a.m193188Re((Boolean) obj);
                }
            }, new y20() { // from class: l.inz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192887I8((Throwable) obj);
                }
            }));
            if (CoreModule.m30933P().m143406b().mo36103Pe(this.f82482k)) {
                duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b)).filter(new qcj() { // from class: l.jnz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).isLoveBuzz());
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.knz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f127655a.m193192Se((User) obj);
                    }
                }, new y20() { // from class: l.lnz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tvz.m192957Va((Throwable) obj);
                    }
                }));
            }
            if (NullChecker.m82486a(this.f82482k)) {
                if (this.f82482k.hasLocalBreakIce) {
                    CoreModule.f18264c.f20319J1.m35572g5(m110989i3());
                }
                Conversation conversation = this.f82482k;
                if (conversation.localHasMessage || conversation.userMessageCount != 0) {
                    return;
                }
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
                if (NullChecker.m82486a(userM116503Pa)) {
                    CoreModule.f18264c.f20319J1.m35583v5(m110989i3(), CoreModule.m30933P().m143406b().mo36101Ls(2, userM116503Pa.gender));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ae */
    public final /* synthetic */ void m193224ae(Bundle bundle) {
        this.f176354i1 = toh0.m192049i(act().getIntent());
        l51.m152888H(act(), new Runnable() { // from class: l.iqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f116480a.m193334zd();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: af */
    public final /* synthetic */ void m193225af(boolean[] zArr, Boolean bool) {
        if (zArr[0]) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: ag */
    public final /* synthetic */ void m193226ag() {
        if (m193282oc()) {
            CoreModule.f18264c.f20384f0.m33705Kf(m110989i3());
            m193146Ig();
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: b6 */
    public boolean mo110957b6() {
        if (!CoreModule.m30933P().m143412i().mo180406U3()) {
            return false;
        }
        boolean z = NullChecker.m82486a(this.f176338S0) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r(this.f176338S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
        if (z) {
            return z;
        }
        return NullChecker.m82486a(this.f82482k) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r((double) this.f82482k.f21116mm).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
    }

    /* JADX INFO: renamed from: bd */
    public final void m193227bd() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        final boolean z = false;
        boolean z2 = NullChecker.m82486a(userM116593na) && userM116593na.isFemale();
        boolean z3 = NullChecker.m82486a(userM116593na) && userM116593na.isSVIP();
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        if (!z2 && NullChecker.m82486a(this.f82482k) && TextUtils.equals(this.f82482k.convType, "quickchat") && CoreModule.m30933P().m143412i().mo180450c4(this.f82482k)) {
            CoreModule.f18264c.f20297C0.m146425v4();
            if (CoreModule.m30933P().m143412i().mo180323F5() && CoreModule.m30933P().m143412i().mo180455d3()) {
                z = true;
            }
            if (CoreModule.m30933P().m143412i().mo180305C2()) {
                m193255ic(z, new y20() { // from class: l.vnz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tvz.m192986b9((Boolean) obj);
                    }
                });
                return;
            }
            if (CoreModule.m30933P().m143412i().mo180342J2()) {
                if (CoreModule.m30933P().m143412i().mo34471b3() > 0) {
                    ((yxz) this.viewModel).m217888m5(new y20() { // from class: l.wnz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f189989a.m193201Ue(z, (jl80) obj);
                        }
                    });
                    return;
                }
                if (!z3) {
                    CoreModule.m30933P().m143412i().mo34365Lf(act(), "p_chat_view,e_quickchatbell_search,click", Privilege.online_match_tickets, new y20() { // from class: l.aoz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f72660a.m193221Ze(z, zArr2, (PurchaseType) obj);
                        }
                    }, new y20() { // from class: l.boz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f77707a.m193225af(zArr2, (Boolean) obj);
                        }
                    });
                } else if (z) {
                    m193161Lg(true);
                } else {
                    CoreModule.m30933P().m143412i().mo180372O3(act(), "p_chat_view,e_quickchatbell_search,click", new a30() { // from class: l.xnz
                        @Override // p153l.a30
                        /* JADX INFO: renamed from: a */
                        public final void mo37058a(Object obj, Object obj2, Object obj3) {
                            this.f195544a.m193206Ve(zArr, (PurchaseType) obj, (Act) obj2, (String) obj3);
                        }
                    }, new x20() { // from class: l.ynz
                        @Override // p153l.x20
                        public final void call() {
                            this.f200933a.m193209We(zArr);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: be */
    public final /* synthetic */ void m193228be(List list) {
        if (jyb.m147479J(list) || list.size() < 2) {
            return;
        }
        this.f176346a1.put(Long.valueOf(pzi0.m174453n()));
        CoreModule.f18264c.f20384f0.m33873Yg(m110989i3(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ Boolean m193229bf(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var.f152156a) && ((Boolean) pf60Var.f152156a).booleanValue() && NullChecker.m82486a(pf60Var.f152157b) && !((Boolean) pf60Var.f152157b).booleanValue() && !CoreModule.f18264c.f20384f0.m33645Fg(this.f82473b));
    }

    /* JADX INFO: renamed from: bg */
    public final /* synthetic */ void m193230bg(Message message, uxj0 uxj0Var) {
        m110853E6(message.f56859id);
    }

    /* JADX INFO: renamed from: cd */
    public final void m193231cd() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        if (!CoreModule.m30933P().m143412i().mo180536s5() || !NullChecker.m82486a(userM116503Pa) || !userM116503Pa.isFemale() || !TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male") || CoreModule.f18264c.f20381e0.f89069L2.get().intValue() >= CoreModule.m30933P().m143412i().mo180351K5() || i39.m138279a(CoreModule.f18264c.f20381e0.f89076M2.get().longValue()) < CoreModule.m30933P().m143412i().mo180413V4() || User.isTeamAccount(mo111034r3()) || mo110970e4()) {
            return;
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33730Mg(this.f82473b), CoreModule.f18264c.f20384f0.m33682Ig(this.f82473b), new zqz())).distinctUntilChanged().observeOn(Schedulers.m222739io()).filter(new qcj() { // from class: l.krz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f128511a.m193229bf((pf60) obj);
            }
        }).first().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.vrz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185545a.m193233cf((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ce */
    public final /* synthetic */ void m193232ce(AgeVerificationInfo ageVerificationInfo) {
        ((yxz) this.viewModel).m178888B1();
    }

    /* JADX INFO: renamed from: cf */
    public final /* synthetic */ void m193233cf(pf60 pf60Var) {
        CoreModule.f18264c.f20384f0.m34005jh(this.f82473b);
        CoreModule.f18264c.f20381e0.f89076M2.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89069L2.m203841a(1);
    }

    /* JADX INFO: renamed from: cg */
    public final /* synthetic */ void m193234cg(ChatHeat chatHeat, uxj0 uxj0Var) {
        MessageWarmingUpHelper.m50375v("pokeAnimObs back");
        if (!chatHeat.levelUp) {
            m193170Ng(chatHeat);
            return;
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = m111004l3();
        MessageWarmingUpHelper.WarmingUpLevel next = warmingUpLevelM111004l3.next();
        if (NullChecker.m82486a(next)) {
            m193175Og(warmingUpLevelM111004l3, next, chatHeat);
        } else {
            this.f176335P0 = false;
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: d3 */
    public void mo110964d3() {
        super.mo110964d3();
        if (NullChecker.m82486a(this.f82482k) && this.f82482k.hasLocalBreakIce) {
            CoreModule.f18264c.f20319J1.m35572g5(m110989i3());
        }
        CoreModule.f18264c.f20384f0.m33777Qf(m110989i3(), m193314ug());
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: d6 */
    public boolean mo110967d6() {
        if (CoreModule.m30933P().m143412i().mo180371O2()) {
            return (TextUtils.isEmpty(mo111034r3()) || User.isTeamAccount(mo111034r3()) || m193138Hd()) ? false : true;
        }
        if (!CoreModule.m30933P().m143412i().mo180406U3()) {
            return false;
        }
        boolean z = NullChecker.m82486a(this.f176338S0) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r(this.f176338S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
        if (z) {
            return z;
        }
        return NullChecker.m82486a(this.f82482k) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r((double) this.f82482k.f21116mm).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
    }

    /* JADX INFO: renamed from: dd */
    public final void m193235dd() {
        if (!CoreModule.m30933P().m143412i().mo180535s4() || m111000k4(mo111034r3()) || User.isBusinessAI1V1(mo111034r3())) {
            return;
        }
        CoreModule.f18264c.f20297C0.m146425v4();
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("intlReadMessage"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.fnz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99991a.m193237df((UserPrivilege) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: de */
    public final /* synthetic */ Boolean m193236de(pf60 pf60Var) {
        if (User.isTeamAccount(mo111034r3())) {
            return Boolean.FALSE;
        }
        User user = (User) pf60Var.f152156a;
        return (NullChecker.m82486a(user) && !user.isFemale() && user.isVIP()) ? (Boolean) pf60Var.f152157b : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: df */
    public final /* synthetic */ void m193237df(UserPrivilege userPrivilege) {
        ((yxz) this.viewModel).m178888B1();
    }

    /* JADX INFO: renamed from: dg */
    public final /* synthetic */ C22421c m193238dg(User user) {
        return CoreModule.f18264c.f20384f0.m33740Ne(mo111034r3());
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: e3 */
    public void mo110969e3(Throwable th) {
        super.mo110969e3(th);
        User userM111057w3 = m111057w3(this.f82474c);
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.m82486a(userM111057w3) && userM111057w3.onlineMatch()) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (CoreModule.m30933P().m143412i().mo180483i2(tantanForbidden)) {
                tcz.m190528F(act(), mo111064x6());
                return;
            }
            int i = tantanForbidden.subCode;
            if (i == 103 || i == 104 || i == 105) {
                o1j0.m165636j(String.format("%s已经提前退出闪聊", userM111057w3.isFemale() ? "她" : "他"));
                act().m68056e2();
            } else if (i == 404) {
                o1j0.m165636j(String.format("你已经对%s发出过喜欢了，请静待他的回应吧~", userM111057w3.isFemale() ? "她" : "他"));
                act().m68056e2();
            }
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: e6 */
    public boolean mo110972e6() {
        if (CoreModule.m30933P().m143412i().mo180371O2()) {
            return (TextUtils.isEmpty(mo111034r3()) || User.isTeamAccount(mo111034r3())) ? false : true;
        }
        if (!CoreModule.m30933P().m143412i().mo180406U3()) {
            return false;
        }
        boolean z = NullChecker.m82486a(this.f176338S0) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r(this.f176338S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
        if (z) {
            return z;
        }
        return NullChecker.m82486a(this.f82482k) && !TextUtils.isEmpty(mo111034r3()) && !User.isTeamAccount(mo111034r3()) && MessageWarmingUpHelper.m50371r((double) this.f82482k.f21116mm).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
    }

    /* JADX INFO: renamed from: ed */
    public final void m193239ed() {
        duringCreated(new pcj() { // from class: l.dpz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90096a.m193241ef();
            }
        }).filter(new qcj() { // from class: l.epz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((User) obj).location));
            }
        }).map(new qcj() { // from class: l.fpz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).location;
            }
        }).distinctUntilChanged().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hpz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111062a.m193249gf((Location) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ipz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193100z9((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ee */
    public final /* synthetic */ void m193240ee(Boolean bool) {
        this.f176331L0.m137019l(bool);
    }

    /* JADX INFO: renamed from: ef */
    public final /* synthetic */ C22421c m193241ef() {
        return CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3());
    }

    /* JADX INFO: renamed from: eg */
    public final /* synthetic */ C22421c m193242eg(Conversation conversation) {
        return CoreModule.f18264c.f20384f0.m33860Xf("message", "conversation", mo111034r3());
    }

    /* JADX INFO: renamed from: fd */
    public final void m193243fd() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.vtz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185761a.m193253hf((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: fe */
    public final /* synthetic */ void m193244fe(Boolean bool) {
        this.f82457K.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: ff */
    public final /* synthetic */ void m193245ff(Location location) {
        CoreModule.f18264c.f20384f0.m33590Aq(mo111034r3(), location.updatedTime, location.distance);
    }

    /* JADX INFO: renamed from: fg */
    public final /* synthetic */ void m193246fg(List list) {
        if (jyb.m147479J(list)) {
            this.f176355j1 = null;
            ((yxz) this.viewModel).m178947g2();
            return;
        }
        UserLiveLabel userLiveLabel = (UserLiveLabel) list.get(0);
        if (TextUtils.equals(mo111034r3(), userLiveLabel.userId)) {
            this.f176355j1 = userLiveLabel;
            ((yxz) this.viewModel).m178947g2();
        } else if (this.f176355j1 != null) {
            this.f176355j1 = null;
            ((yxz) this.viewModel).m178947g2();
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: g6 */
    public boolean mo110982g6() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        if (userM116503Pa == null || userM116503Pa.isTeamAccount() || userM116503Pa.isBanned() || userM116503Pa.isBannedNew() || userM116503Pa.isAccountCancellation()) {
            return false;
        }
        return super.mo110982g6();
    }

    /* JADX INFO: renamed from: gd */
    public final void m193247gd() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gsz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192861D8((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ge */
    public final /* synthetic */ void m193248ge(Integer num) {
        ((yxz) this.viewModel).m217869d4(num.intValue());
    }

    /* JADX INFO: renamed from: gf */
    public final /* synthetic */ Location m193249gf(final Location location) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.jqz
            @Override // p153l.x20
            public final void call() {
                this.f122262a.m193245ff(location);
            }
        });
        return location;
    }

    /* JADX INFO: renamed from: gg */
    public final /* synthetic */ void m193250gg(AnalysisGuide analysisGuide) {
        if (NullChecker.m82486a(analysisGuide)) {
            if (analysisGuide.used) {
                CoreModule.f18264c.f20440x2.m112778t3(m110989i3());
            } else if (analysisGuide.isShow) {
                CoreModule.f18264c.f20384f0.m33825Ug(m110989i3(), "guide_type_analyze");
                CoreModule.f18264c.f20440x2.m112777s3(m110989i3());
            }
        }
    }

    /* JADX INFO: renamed from: hd */
    public final void m193251hd() {
        if (!CoreModule.m30933P().m143412i().mo180308D() || User.isTeamAccount(mo111034r3())) {
            return;
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33740Ne(mo111034r3()), CoreModule.f18264c.f20384f0.m33820Tn(mo111034r3()), new gu20())).subscribe(psd0.m173596G(new y20() { // from class: l.coz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82945a.m193261jf((pf60) obj);
            }
        }));
        creates(new y20() { // from class: l.doz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193046o8((Bundle) obj);
            }
        }, new eoz());
    }

    /* JADX INFO: renamed from: he */
    public final /* synthetic */ void m193252he(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (this.f176338S0 != null || warmingUpLevel.value < MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            return;
        }
        Keyboard keyboardMo125457a = m143372e0().mo50155d0().m143374g0().mo125457a();
        if (NullChecker.m82486a(keyboardMo125457a)) {
            keyboardMo125457a.m49982C();
        }
    }

    /* JADX INFO: renamed from: hf */
    public final /* synthetic */ void m193253hf(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.f176353h1 = true;
            return;
        }
        if (c4470c == C4470c.f16267i) {
            boolean z = this.f176353h1;
            V v2 = this.viewModel;
            if (z) {
                ((yxz) v2).m217858X4();
                this.f176353h1 = false;
            } else if (((yxz) v2).m217840O3()) {
                ((yxz) this.viewModel).m217833K3();
            }
        }
    }

    /* JADX INFO: renamed from: hg */
    public final /* synthetic */ void m193254hg(List list) {
        if (jyb.m147479J(list) || !h39.m133439c()) {
            return;
        }
        ((yxz) this.viewModel).m217878h5(list);
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: i7 */
    public boolean mo110993i7() {
        return mo111005l4() && CoreModule.f18273l.m143412i().mo180383Q4(mo111034r3());
    }

    /* JADX INFO: renamed from: ic */
    public final void m193255ic(boolean z, y20<Boolean> y20Var) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        if (!NullChecker.m82486a(userM116503Pa)) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.transDataFromUser(userM116503Pa);
        onlineMatchPushUser.isBell = true;
        onlineMatchPushUser.isMaleQuickChatRing = true;
        onlineMatchPushUser.isGreet = true;
        CoreModule.m30933P().m143412i().mo180416W0(act(), onlineMatchPushUser, z, null, false, "", false, y20Var);
    }

    /* JADX INFO: renamed from: id */
    public final void m193256id() {
        if (CoreModule.m30933P().m143405a().mo34335Hd() && this.f82475d == 29) {
            duringCreated(i46.m138395c().f112834a.filter(new qcj() { // from class: l.zsz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            })).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new C20411a()));
            duringCreated(CoreModule.f18264c.f20384f0.f20664b0).subscribe(psd0.m173596G(new C20412b()));
        }
    }

    /* JADX INFO: renamed from: ie */
    public final /* synthetic */ void m193257ie(ChatHeat chatHeat) {
        this.f176338S0 = chatHeat;
        if (MessageWarmingUpHelper.m50358e(chatHeat).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            Keyboard keyboardMo125457a = m143372e0().mo50155d0().m143374g0().mo125457a();
            if (NullChecker.m82486a(keyboardMo125457a)) {
                keyboardMo125457a.m49982C();
            }
        }
    }

    /* JADX INFO: renamed from: ig */
    public final /* synthetic */ void m193258ig(Throwable th) {
        m193122Dg();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: j7 */
    public C22507a<Boolean> mo110998j7() {
        return this.f176331L0;
    }

    /* JADX INFO: renamed from: jd */
    public final void m193259jd() {
        if (CoreModule.f18273l.m143405a().mo34485dd()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
            if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isTeamAccount()) {
                return;
            }
            CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_o_diamond_visitor_guide);
            l51.m152887G(new Runnable() { // from class: l.wtz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190824a.m193265kf();
                }
            });
            Conversation conversation = this.f82482k;
            if (conversation == null) {
                CrashHelper.m82480d(new NullPointerException(String.format("initODiamondVisitorGuide,me:%s,other:%s,convId:%s", CoreModule.m30929H().userId(), this.f82473b, this.f82474c)), 10);
                return;
            }
            if (conversation.isQuickChatConv()) {
                return;
            }
            if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.onlineMatch()) {
                return;
            }
            if (CoreModule.m30933P().m143405a().mo180437a2() || !(TEnum.equals(this.f82482k.status, "dismissed") || TEnum.equals(this.f82482k.status, "blocked"))) {
                duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_o_diamond_visitor_guide)), CoreModule.f18264c.f20410n2.m121461G3(mo111034r3()), new scj() { // from class: l.xtz
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return bkj0.m104818a((User) obj, (Boolean) obj2, (ODiamondVisitorInfo) obj3);
                    }
                })).take(1).filter(new qcj() { // from class: l.ytz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        bkj0 bkj0Var = (bkj0) obj;
                        return Boolean.valueOf((((Boolean) bkj0Var.f77082b).booleanValue() || ((User) bkj0Var.f77081a).onlineMatch()) ? false : true);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.ztz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f206073a.m193275mf((bkj0) obj);
                    }
                }, new y20() { // from class: l.buz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tvz.m192961W9((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: je */
    public final /* synthetic */ void m193260je(ovb0 ovb0Var) {
        C c;
        MessageWarmingUpHelper.m50375v("来自数据库订阅反馈");
        B b = ovb0Var.f149249b;
        if (b == 0 || !TEnum.equals(((Conversation) b).status, "default") || TextUtils.equals(this.f82482k.convType, "quickchat") || (c = ovb0Var.f149250c) == 0 || ((User) c).isBanned() || ((User) ovb0Var.f149250c).isBannedNew() || ((User) ovb0Var.f149250c).isAccountCancellation()) {
            MessageWarmingUpHelper.m50375v("status exception");
            this.f176334O0 = false;
            m143372e0().mo50138B0().m143374g0().m114050y0();
            return;
        }
        if (ovb0Var.f149248a == 0) {
            MessageWarmingUpHelper.m50375v("chatHeat == null");
            B b2 = ovb0Var.f149249b;
            double dMin = ((Conversation) b2).f21116mm + (Math.min(((Conversation) b2).f21116mm, NullChecker.m82486a(ovb0Var.f149251d) ? ((List) ovb0Var.f149251d).size() : 0) * 0.2f);
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50359f = MessageWarmingUpHelper.m50359f(dMin);
            double dM50369p = MessageWarmingUpHelper.m50369p(warmingUpLevelM50359f, dMin);
            m110948Z6(warmingUpLevelM50359f);
            m110953a7(dM50369p);
            m192870Ed(warmingUpLevelM50359f);
            return;
        }
        MessageWarmingUpHelper.m50375v("warmingUpAnimRunning = " + this.f176335P0 + "  triple.first = " + ((ChatHeat) ovb0Var.f149248a).toJson());
        boolean z = this.f176335P0;
        A a = ovb0Var.f149248a;
        if (!z) {
            m193165Mg((ChatHeat) a);
        } else {
            if (!((ChatHeat) a).levelUp || ((ChatHeat) a).degree <= m111009m3()) {
                return;
            }
            A a2 = ovb0Var.f149248a;
            this.f176337R0 = a2 == 0 ? null : ((ChatHeat) a2).mo225055clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: jf */
    public final /* synthetic */ void m193261jf(pf60 pf60Var) {
        if (C8687b.m50243l((Conversation) pf60Var.f152156a, ((vg60) pf60Var.f152157b).f184001a, 100, this.f82486n)) {
            l51.m152888H(act(), this.f176352g1, 500L);
        }
    }

    /* JADX INFO: renamed from: jg */
    public final /* synthetic */ void m193262jg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().m68056e2();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: k6 */
    public void mo111002k6(int i, Menu menu) {
        super.mo111002k6(i, menu);
        if (NullChecker.m82486a(menu)) {
            i4g0.m138526x("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        }
    }

    /* JADX INFO: renamed from: kd */
    public final void m193263kd() {
        if (CoreModule.f18273l.m143410g().mo36054cf()) {
            if (!m193141Hg() || this.f82482k.localHasMessage) {
                CoreModule.f18264c.f20384f0.m33765Pf(this.f82474c, MessageType.local_platinum_pin_guide);
                duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), CoreModule.f18264c.f20384f0.m33658Gg(mo111034r3(), MessageType.get(MessageType.local_platinum_pin_guide)), CoreModule.f18264c.f20384f0.m33718Lg(mo111034r3()), new scj() { // from class: l.foz
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return bkj0.m104818a((User) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                }).filter(new qcj() { // from class: l.goz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f105401a.m193280nf((bkj0) obj);
                    }
                }).first()).subscribe(psd0.m173596G(new y20() { // from class: l.hoz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f110970a.m193285of((bkj0) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: ke */
    public final /* synthetic */ void m193264ke(Integer num) {
        ((yxz) this.viewModel).m217869d4(num.intValue());
    }

    /* JADX INFO: renamed from: kf */
    public final /* synthetic */ void m193265kf() {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((yxz) this.viewModel).f160421t1)) {
            VText vTextMo175737d = ((yxz) this.viewModel).f160421t1.mo175737d();
            if (NullChecker.m82486a(vTextMo175737d)) {
                bnl0.m105524M(vTextMo175737d, false);
            }
        }
    }

    /* JADX INFO: renamed from: kg */
    public final /* synthetic */ void m193266kg(boolean z) {
        CoreModule.m30933P().m143412i().mo180375P();
        m193255ic(z, new y20() { // from class: l.qrz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159226a.m193262jg((Boolean) obj);
            }
        });
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: l4 */
    public boolean mo111005l4() {
        if (CoreModule.f18273l.m143412i().mo180296B()) {
            return hcp.m134490c(this.f82473b);
        }
        return false;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: l6 */
    public boolean mo111007l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.mo111007l6(menuItem);
        }
        act().m68056e2();
        return true;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: l7 */
    public boolean mo111008l7() {
        return gta.m132210e().m132214d().mo34927t9() && NullChecker.m82486a(this.f82482k) && !((!"default".equals(this.f82482k.convType) && !TextUtils.isEmpty(this.f82482k.convType)) || (NullChecker.m82486a(this.f82482k) && NullChecker.m82486a(this.f82482k.additional.blindbox) && !jyb.m147479J(this.f82482k.additional.blindbox.tags)) || User.isTeamAccount(this.f82482k.otherUser) || m110950a4(CoreModule.f18264c.f20381e0.m116503Pa(this.f82482k.otherUser)));
    }

    /* JADX INFO: renamed from: lc */
    public final C22421c<Boolean> m193267lc() {
        return psd0.m173625r(CoreModule.f18264c.f20384f0.m33823Ue(mo111034r3()), CoreModule.f18264c.f20381e0.m116491Ma(mo111034r3()), new n96()).map(new qcj() { // from class: l.urz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180719a.m193148Jd((pf60) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: ld */
    public final void m193268ld() {
        if ((gta.m132210e().m132214d().mo34695Gi() || gta.m132210e().m132214d().mo34902p0()) && ((yxz) this.viewModel).m178973s0()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.gtz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(Math.min(3, ((User) obj).pictures.size()));
                }
            }).distinctUntilChanged().onBackpressureLatest()).subscribe(psd0.m173596G(new y20() { // from class: l.htz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111611a.m193290pf((Integer) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: le */
    public final /* synthetic */ void m193269le(bkj0 bkj0Var) {
        m111048t7().m217870d5(((Boolean) bkj0Var.f77082b).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lf */
    public final /* synthetic */ void m193270lf(bkj0 bkj0Var) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((yxz) this.viewModel).f160421t1)) {
            VText vTextMo175737d = ((yxz) this.viewModel).f160421t1.mo175737d();
            if (NullChecker.m82486a(vTextMo175737d)) {
                bnl0.m105524M(vTextMo175737d, true);
                C c = bkj0Var.f77083c;
                String str = String.format("%s\n%s", ((ODiamondVisitorInfo) c).visitCountStr, ((ODiamondVisitorInfo) c).visitTimeStr);
                C c2 = bkj0Var.f77083c;
                vTextMo175737d.setText(q8g0.m175796b0(str, jyb.m147507f0(((ODiamondVisitorInfo) c2).visitCount, ((ODiamondVisitorInfo) c2).visitTime), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: lg */
    public final /* synthetic */ void m193271lg() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: md */
    public final void m193273md() {
        duringCreated(gr90.m131535a()).filter(new qcj() { // from class: l.bnz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77603a.m193295qf((String) obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.cnz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82798a.m193300rf((String) obj);
            }
        }, new y20() { // from class: l.enz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m193081vb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: me */
    public final /* synthetic */ void m193274me(List list) {
        k05.m147755h().m147759e().add(this.f82473b);
        if (k05.m147755h().m147768o()) {
            o1j0.m165651y(k05.m147755h().m147761g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: mf */
    public final /* synthetic */ void m193275mf(final bkj0 bkj0Var) {
        User userMo111064x6 = mo111064x6();
        if (NullChecker.m82486a(userMo111064x6)) {
            if (CoreModule.m30933P().m143405a().mo180437a2()) {
                if (TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitCountStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitTimeStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitCount) || TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitTime)) {
                    return;
                }
                l51.m152887G(new Runnable() { // from class: l.cqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f83262a.m193270lf(bkj0Var);
                    }
                });
                return;
            }
            if (NullChecker.m82486a(this.f82482k) && xg0.m210874e(userMo111064x6) && xg0.m210873d(this.f82482k) && !TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitCountStr) && !TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitTimeStr) && TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitTime) && TextUtils.isEmpty(((ODiamondVisitorInfo) bkj0Var.f77083c).visitCount)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", ((ODiamondVisitorInfo) bkj0Var.f77083c).visitCountStr);
                    jSONObject.put("sub_title", ((ODiamondVisitorInfo) bkj0Var.f77083c).visitTimeStr);
                    if (CoreModule.m30933P().m143408e().mo35984fn(userMo111064x6.f56859id)) {
                        CoreModule.f18264c.f20384f0.m33909bh(this.f82474c, MessageType.get(MessageType.local_o_diamond_visitor_guide), jSONObject.toString(), null);
                        m193082vd();
                        i4g0.m138526x("e_visit_times_decrypt", OMSDialogPositon.p_chat_view);
                    }
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: mg */
    public final /* synthetic */ void m193276mg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: nc */
    public final void m193277nc() {
        act().progress(R$string.f21517I2, true);
        duringCreated(CoreModule.f18264c.f20384f0.m34093qe(mo111034r3(), act())).subscribe(psd0.m173597H(new y20() { // from class: l.orz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148778a.m193158Ld((uxj0) obj);
            }
        }, new y20() { // from class: l.prz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153859a.m193162Md((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nd */
    public void m193278nd() {
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        duringCreated(new pcj() { // from class: l.qmz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20381e0.m116483Ka(strMo111034r3);
            }
        }).distinctUntilChanged(new qcj() { // from class: l.rmz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ux6.m198403a((User) obj).profileSmall();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tmz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175205a.m193305sf((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ne */
    public final /* synthetic */ void m193279ne(pf60 pf60Var) {
        boolean zM147479J = jyb.m147479J(this.f82482k.localChatBg);
        V v2 = this.viewModel;
        if (zM147479J) {
            ((yxz) v2).m217874f5(null);
        } else {
            ((yxz) v2).m217874f5(this.f82482k.localChatBg.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: nf */
    public final /* synthetic */ Boolean m193280nf(bkj0 bkj0Var) {
        return Boolean.valueOf(xg0.m210874e((User) bkj0Var.f77081a) && xg0.m210873d(this.f82482k) && !((Boolean) bkj0Var.f77082b).booleanValue() && ((Boolean) bkj0Var.f77083c).booleanValue());
    }

    /* JADX INFO: renamed from: oc */
    public final boolean m193282oc() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
        return (userM116503Pa == null || userM116503Pa.isTeamAccount() || mo110970e4() || m111000k4(mo111034r3()) || !CoreModule.m30933P().m143412i().mo34517hm() || CoreModule.f18264c.f20440x2.m112774p3(m110989i3()) || joa.m146397l3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: od */
    public final void m193283od() {
        if (CoreModule.m30933P().m143412i().mo180409V0()) {
            lifecycle().filter(new qcj() { // from class: l.guz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.huz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111720a.m193309tf((C4470c) obj);
                }
            }));
            if (User.isTeamAccount(this.f82474c)) {
                return;
            }
            duringCreated(CoreModule.f18264c.f20384f0.m33740Ne(this.f82474c)).map(new qcj() { // from class: l.iuz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).f21116mm);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.juz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122753a.m193313uf((Integer) obj);
                }
            }, new y20() { // from class: l.kuz
                @Override // p153l.y20
                public final void call(Object obj) {
                    tvz.m192905Lb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: oe */
    public final /* synthetic */ void m193284oe(C4470c c4470c) {
        m193126Eg();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: of */
    public final /* synthetic */ void m193285of(bkj0 bkj0Var) {
        boolean z;
        boolean z2 = false;
        if (NullChecker.m82486a(this.f82482k) && NullChecker.m82486a(this.f82482k.additional) && NullChecker.m82486a(this.f82482k.additional.pinChat)) {
            PlatinumPinChat platinumPinChat = this.f82482k.additional.pinChat;
            if (!platinumPinChat.pin || platinumPinChat.expireTime <= pzi0.m174454o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z3 = pzi0.m174439D(((long) ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime.get(this.f82474c)) * 1000) && ConversationCounterTypeSp.platinumChatPinGuideCloseCount.get(this.f82474c) >= h39.m133459w();
        if (pzi0.m174439D(CoreModule.f18264c.f20383e2.f153011Z.get().longValue()) && CoreModule.f18264c.f20383e2.f153012a0.get().intValue() >= h39.m133460x()) {
            z2 = true;
        }
        if (z) {
            return;
        }
        if (joa.m146359I3() || !(!this.f82482k.localEverHasMessage || z2 || z3)) {
            CoreModule.f18264c.f20384f0.m33909bh(this.f82474c, MessageType.get(MessageType.local_platinum_pin_guide), "platinum pin guide", null);
            if (pzi0.m174439D(CoreModule.f18264c.f20383e2.f153011Z.get().longValue())) {
                CoreModule.f18264c.f20383e2.f153012a0.m203841a(1);
            } else {
                CoreModule.f18264c.f20383e2.f153012a0.put(1);
            }
            CoreModule.f18264c.f20383e2.f153011Z.put(Long.valueOf(pzi0.m174454o()));
            i4g0.m138526x("e_platinum_top_chat", pageId());
        }
    }

    /* JADX INFO: renamed from: og */
    public final /* synthetic */ void m193286og() {
        ((yxz) this.viewModel).m217822B5();
    }

    /* JADX INFO: renamed from: pc */
    public final boolean m193287pc() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
        return (userM116503Pa == null || userM116503Pa.isTeamAccount() || mo110970e4() || m111000k4(mo111034r3()) || !CoreModule.m30933P().m143412i().mo34517hm() || CoreModule.f18264c.f20440x2.m112775q3(m110989i3()) || CoreModule.f18264c.f20440x2.m112781w3(m110989i3()) || joa.m146395k3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: pd */
    public final void m193288pd() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
        if (!NullChecker.m82486a(userM116503Pa) || userM116503Pa.onlineMatch()) {
            return;
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33702Jo(), CoreModule.f18264c.f20384f0.m33706Kg(this.f82474c).take(1), new rcj() { // from class: l.ypz
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Message) obj, (Boolean) obj2);
            }
        })).take(1).filter(new qcj() { // from class: l.zpz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205550a.m193317vf((pf60) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.aqz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72886a.m193322wf((pf60) obj);
            }
        }, new y20() { // from class: l.bqz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192903L9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pe */
    public final /* synthetic */ void m193289pe(List list) {
        m193112Bg();
    }

    /* JADX INFO: renamed from: pf */
    public final /* synthetic */ void m193290pf(Integer num) {
        ((yxz) this.viewModel).m178909P1();
    }

    /* JADX INFO: renamed from: pg */
    public final /* synthetic */ void m193291pg(ChatHeat chatHeat) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = m111004l3();
        if (CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            m110943Y6(MessageWarmingUpHelper.m50361h(warmingUpLevelM111004l3));
            ((yxz) this.viewModel).m217904u5(warmingUpLevelM111004l3);
            return;
        }
        List<Message> listM189459U = CoreModule.f18272k.f115535c.m189459U(this.f82473b);
        if (jyb.m147479J(listM189459U)) {
            this.f176335P0 = false;
        } else {
            double dM174454o = (pzi0.m174454o() - listM189459U.get(0).createdTime) / 8.64E7d;
            double dM50361h = MessageWarmingUpHelper.m50361h(warmingUpLevelM111004l3);
            MessageWarmingUpHelper.m50375v("tempDownAnim day = " + dM174454o);
            if (dM174454o <= 7.0d && dM174454o >= 5.0d && chatHeat.degree > dM50361h && chatHeat.tempDownDegree < dM50361h) {
                final ChatHeat chatHeatMo225055clone = chatHeat.mo225055clone();
                chatHeatMo225055clone.tempDownDegree = dM50361h;
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.ksz
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18272k.f115551s.upsert(chatHeatMo225055clone);
                    }
                });
                m110943Y6(dM50361h);
                ((yxz) this.viewModel).m217904u5(warmingUpLevelM111004l3);
                return;
            }
            this.f176335P0 = false;
        }
        l51.m152886F(act(), new Runnable() { // from class: l.lsz
            @Override // java.lang.Runnable
            public final void run() {
                this.f133508a.m193286og();
            }
        });
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: q4 */
    public boolean mo111030q4() {
        return ((yxz) this.viewModel).m217867c4();
    }

    /* JADX INFO: renamed from: qc */
    public final void m193292qc(Message message) {
        int iIntValue;
        boolean zM193670h;
        if (!CoreModule.m30933P().m143412i().mo34383O() || !NullChecker.m82486a(m193315vc()) || m193315vc().isTeamAccount() || !NullChecker.m82486a(this.f82480i) || this.f82480i.isPicVerificationVerified() || (iIntValue = CoreModule.f18264c.f20381e0.f89040H0.get().intValue()) >= 3) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        long jLongValue = CoreModule.f18264c.f20381e0.f89046I0.get().longValue();
        if (iIntValue == 0) {
            zM193670h = tzi0.m193670h(jM174454o, (long) this.f82480i.createdTime, 4);
        } else if (iIntValue == 1) {
            zM193670h = tzi0.m193670h(jM174454o, jLongValue, 1);
        } else {
            zM193670h = iIntValue == 2 ? tzi0.m193670h(jM174454o, jLongValue, 2) : false;
        }
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89053J0.get();
        if (!zM193670h || hashSet.contains(mo111034r3())) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89046I0.put(Long.valueOf(jM174454o));
        CoreModule.f18264c.f20381e0.f89040H0.put(Integer.valueOf(iIntValue + 1));
        Message messageMo225055clone = message.mo225055clone();
        messageMo225055clone.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        messageMo225055clone.messageType = MessageType.get("tantan_verify_toast");
        messageMo225055clone.createdTime = jM174454o;
        messageMo225055clone.localCreatedTime = jM174454o;
        messageMo225055clone.extData = MessageExtData.new_();
        CoreModule.f18264c.f20384f0.m33885Zg(messageMo225055clone);
        hashSet.add(mo111034r3());
        CoreModule.f18264c.f20381e0.f89053J0.put(hashSet);
    }

    /* JADX INFO: renamed from: qd */
    public final void m193293qd() {
        if (!h39.m133435X() || User.isTeamAccount(mo111034r3())) {
            return;
        }
        duringCreated((C22421c) this.f176333N0.switchMap(new qcj() { // from class: l.gpz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105636a.m193326xf((uxj0) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.rpz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164416a.m193331yf((pf60) obj);
            }
        }));
        if (h39.m133421J()) {
            duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(mo111034r3()).filter(new sb8()).map(new qcj() { // from class: l.dqz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).userMessageCount);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.oqz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148659a.m193336zf((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: qe */
    public final /* synthetic */ void m193294qe(Conversation conversation) {
        m193112Bg();
    }

    /* JADX INFO: renamed from: qf */
    public final /* synthetic */ Boolean m193295qf(String str) {
        return Boolean.valueOf(TextUtils.equals(str, mo111034r3()));
    }

    /* JADX INFO: renamed from: qg */
    public final /* synthetic */ void m193296qg(final ChatHeat chatHeat, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, uxj0 uxj0Var) {
        if (!CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            l51.m152919y(new Runnable() { // from class: l.jsz
                @Override // java.lang.Runnable
                public final void run() {
                    tvz.m193086wa(chatHeat);
                }
            });
        }
        ((yxz) this.viewModel).m217908w5(warmingUpLevel, warmingUpLevel2);
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: r3 */
    public String mo111034r3() {
        return this.f82474c;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: rc, reason: merged with bridge method [inline-methods] */
    public void mo110954b3(User user) {
        super.mo110954b3(user);
        if (user.isCustomerServiceAccount() || User.isBusinessAI1V1(user.f56859id)) {
            ((yxz) this.viewModel).m178919U1();
        }
    }

    /* JADX INFO: renamed from: rd */
    public final void m193298rd() {
        if (!CoreModule.m30933P().m143412i().mo180535s4() || m111000k4(mo111034r3())) {
            return;
        }
        duringCreated(CoreModule.m30933P().m143412i().mo180405U2()).filter(new qcj() { // from class: l.uoz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((PurchaseType) obj) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new qcj() { // from class: l.woz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.kqz
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return tvz.m192914N9(purchaseType, (List) obj2);
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.xoz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195622a.m193106Af((PurchaseType) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: re */
    public final /* synthetic */ void m193299re(pf60 pf60Var) {
        m143372e0().mo50138B0().m143374g0().m113959F1((Conversation) pf60Var.f152157b, (User) pf60Var.f152156a);
    }

    /* JADX INFO: renamed from: rf */
    public final /* synthetic */ void m193300rf(String str) {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: rg */
    public final /* synthetic */ void m193301rg(Throwable th) {
        this.f176335P0 = false;
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: s3 */
    public C22421c<User> mo111039s3(String str) {
        return CoreModule.f18264c.f20381e0.m116483Ka(str);
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: sc, reason: merged with bridge method [inline-methods] */
    public void mo110959c3(Conversation conversation, vg60<Message> vg60Var, User user) {
        super.mo110959c3(conversation, vg60Var, user);
        if (this.f176348c1) {
            this.f176348c1 = true;
            nvm.m164890n().m164904v(conversation, jyb.m147479J(vg60Var.f184001a) ? null : vg60Var.f184001a.get(0), user);
        }
        nvm.m164890n().m164894k(conversation, jyb.m147479J(vg60Var.f184001a) ? null : vg60Var.f184001a.get(0), user);
        m193185Qg(conversation, vg60Var);
        if (o3z.m165898g().m165904i(user, this.f82480i)) {
            m193136Gg(vg60Var.f184001a);
        }
        if (CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(mo111034r3()) && NullChecker.m82486a(user) && CoreModule.f18264c.f20373b1.m209838e3(mo111034r3()) && !TEnum.equals(conversation.status, "dismissed") && !user.unilateralBlock() && !CoreModule.m30933P().m143412i().mo180368N3() && !this.f176328I0) {
            ((yxz) this.viewModel).m217898r5();
            this.f176328I0 = true;
        }
        m193306sg(mo111034r3(), vg60Var.f184001a);
    }

    /* JADX INFO: renamed from: sd */
    public final void m193303sd() {
        if (CoreModule.m30933P().m143412i().mo180557x()) {
            C22421c<T> c22421cDuringCreated = duringCreated(new pcj() { // from class: l.btz
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f78416a.m193111Bf();
                }
            });
            String strMo111034r3 = mo111034r3();
            Objects.requireNonNull(strMo111034r3);
            c22421cDuringCreated.filter(new ctz(strMo111034r3)).subscribe(psd0.m173597H(new y20() { // from class: l.dtz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90638a.m193116Cf((String) obj);
                }
            }, new y20() { // from class: l.ftz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f100822a.m193121Df((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: se */
    public final /* synthetic */ void m193304se() {
        CoreModule.f18264c.f20384f0.m33669Hf(mo111034r3());
    }

    /* JADX INFO: renamed from: sf */
    public final /* synthetic */ void m193305sf(User user) {
        ((yxz) this.viewModel).m217853V3(user);
    }

    /* JADX INFO: renamed from: sg */
    public final void m193306sg(String str, List<Message> list) {
        if (CoreModule.m30933P().m143412i().mo180333H4()) {
            if (User.isTeamAccount(str) || TextUtils.equals(str, User.ID_INTL_LIVE_VIP_SERVICE) || CoreModule.m30933P().m143412i().mo180336I1(CoreModule.f18264c.f20381e0.m116503Pa(str))) {
                m193071tg(false);
                return;
            }
            Iterator<Message> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().owner.equals(m193315vc().f56859id)) {
                    m193071tg(true);
                    return;
                }
                i++;
                if (i >= 10) {
                    m193071tg(true);
                    return;
                }
            }
            m193071tg(false);
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: t6 */
    public void mo111047t6(final Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraMo180349K2 = CoreModule.m30933P().m143412i().mo180349K2(message);
        if (!NullChecker.m82486a(chatGiftInfoExtraMo180349K2) || TextUtils.isEmpty(chatGiftInfoExtraMo180349K2.giftRecordId)) {
            return;
        }
        CoreModule.f18264c.f20385f1.m155910j4(chatGiftInfoExtraMo180349K2.giftRecordId).subscribe(psd0.m173597H(new y20() { // from class: l.hsz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111494a.m193230bg(message, (uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: tc */
    public final void m193307tc() {
        if (!h39.m133442f() || pzi0.m174454o() - CoreModule.f18264c.f20384f0.f20728w1.get().longValue() < 604800000) {
            return;
        }
        SettingGroups settingGroups = CoreModule.f18264c.f20381e0.f89110R.get();
        if (!NullChecker.m82486a(settingGroups) || settingGroups.privacy.unrepliedReminder.booleanValue()) {
            duringCreated(psd0.m173626s(CoreModule.f18264c.f20384f0.m33694Jg(this.f82473b), CoreModule.f18264c.f20384f0.m33740Ne(this.f82473b), CoreModule.f18264c.f20381e0.m116483Ka(mo111034r3()), new scj() { // from class: l.rvz
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return new bkj0((Boolean) obj, (Conversation) obj2, (User) obj3);
                }
            }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.mlz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137459a.m193200Ud((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: te */
    public final /* synthetic */ void m193308te() {
        l51.m152919y(new Runnable() { // from class: l.lrz
            @Override // java.lang.Runnable
            public final void run() {
                this.f133378a.m193304se();
            }
        });
    }

    /* JADX INFO: renamed from: tf */
    public final /* synthetic */ void m193309tf(C4470c c4470c) {
        if (!User.isTeamAccount(this.f82474c) && CoreModule.m30933P().m143412i().mo180318E3()) {
            ((yxz) this.viewModel).m178971r0();
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel mo111049u3() {
        return this.f176355j1;
    }

    @Nullable
    /* JADX INFO: renamed from: uc */
    public <T extends cbm> T m193310uc(final Class<T> cls) {
        qbm qbmVar = (qbm) jyb.m147529r(this.f176351f1, new qcj() { // from class: l.asz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((qbm) obj).getClass() == cls);
            }
        });
        if (qbmVar != null) {
            return (T) qbmVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: ud */
    public final void m193311ud() {
        lifecycle().filter(new qcj() { // from class: l.xsz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ysz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201471a.m193130Ff((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ue */
    public final /* synthetic */ void m193312ue(jl80[] jl80VarArr) {
        jl80VarArr[0] = null;
        act().m68056e2();
    }

    /* JADX INFO: renamed from: uf */
    public final /* synthetic */ void m193313uf(Integer num) {
        if (num.intValue() < 20) {
            this.f176336Q0 = true;
        }
        if (!this.f176336Q0 || num.intValue() != 20 || CoreModule.m30933P().m143412i().mo180318E3() || ((yxz) this.viewModel).m178905N0()) {
            return;
        }
        ((yxz) this.viewModel).m178952i2();
    }

    /* JADX INFO: renamed from: ug */
    public final List<String> m193314ug() {
        ArrayList arrayList = new ArrayList();
        if (h39.m133420I()) {
            arrayList.add(MessageType.local_birthday_tip);
        }
        if (CoreModule.m30933P().m143412i().mo180550v5()) {
            arrayList.add(MessageType.local_chat_assistant_question_new);
        }
        if (h39.m133426O()) {
            arrayList.add(MessageType.local_heart_beat_lock_tip);
        }
        if (CoreModule.m30933P().m143410g().mo36054cf()) {
            arrayList.add(MessageType.local_platinum_pin_guide);
        }
        if (CoreModule.m30933P().m143405a().mo34485dd()) {
            arrayList.add(MessageType.local_o_diamond_visitor_guide);
        }
        if (CoreModule.m30933P().m143410g().mo36055d4()) {
            arrayList.add(MessageType.local_visitor_hide_footprint);
        }
        if (CoreModule.m30933P().m143405a().mo180511o0()) {
            arrayList.add(MessageType.local_wechat_notify_guide);
        }
        if (CoreModule.m30933P().m143405a().mo34446Xn()) {
            arrayList.add(MessageType.local_ux_questionnaire);
            arrayList.add(MessageType.local_ux_questionnaire_tip);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: vc */
    public User m193315vc() {
        return (User) this.f82481j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ve */
    public final /* synthetic */ void m193316ve(final jl80[] jl80VarArr, ovb0 ovb0Var) {
        if (!TextUtils.equals("default", ((Conversation) ovb0Var.f149250c).convType) || ((User) ovb0Var.f149248a).isTeamAccount() || TEnum.equals(((Conversation) ovb0Var.f149250c).status, "deleted") || TEnum.equals(((Conversation) ovb0Var.f149250c).status, "dismissed") || ((User) ovb0Var.f149248a).isBanedOrInactivated()) {
            return;
        }
        boolean zIsPicVerificationVerified = ((User) ovb0Var.f149248a).isPicVerificationVerified();
        boolean zIsOpenFilterVeriMsg = ((User) ovb0Var.f149248a).isOpenFilterVeriMsg();
        if (!(NullChecker.m82486a(ovb0Var.f149249b) && NullChecker.m82486a(((VerificationCenter) ovb0Var.f149249b).picVerificationInfo) && TEnum.equals(((VerificationCenter) ovb0Var.f149249b).picVerificationInfo.status, "verified")) && zIsPicVerificationVerified && zIsOpenFilterVeriMsg) {
            if (jl80VarArr[0] == null) {
                jl80VarArr[0] = FilterVerificationUserMsgDlg.m46582M(act(), FilterVerificationUserMsgDlg.FilterFrom.MSG_PAGE, (User) ovb0Var.f149248a, new x20() { // from class: l.frz
                    @Override // p153l.x20
                    public final void call() {
                        this.f100509a.m193312ue(jl80VarArr);
                    }
                });
            }
        } else if (NullChecker.m82486a(jl80VarArr[0]) && jl80VarArr[0].isShowing()) {
            jl80VarArr[0].dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: vf */
    public final /* synthetic */ Boolean m193317vf(pf60 pf60Var) {
        return Boolean.valueOf((CoreModule.f18264c.f20381e0.m116533Y7() || !TextUtils.equals(((Message) pf60Var.f152156a).owner, CoreModule.m30929H().userId()) || !NullChecker.m82486a(this.f82482k) || !TEnum.equals(this.f82482k.status, "default") || CoreModule.f18264c.f20381e0.f89216e2.get().booleanValue() || m193141Hg() || this.f176359n1) ? false : true);
    }

    /* JADX INFO: renamed from: vg */
    public boolean m193318vg() {
        return (!CoreModule.m30933P().m143412i().mo180550v5() || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3())) || CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).isTeamAccount() || CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).unilateralBlock() || CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).isBannedNew() || CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).isJailed() || CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).inactivated || CoreModule.f18264c.f20381e0.m116600p9().isBannedNew() || CoreModule.f18264c.f20381e0.m116600p9().isJailed() || mo110970e4() || !NullChecker.m82486a(this.f82482k) || this.f82482k.isQuickChatConv() || this.f82482k.isHeartbeatConv() || TEnum.equals(this.f82482k.status, "dismissed") || this.f82482k.f21116mm >= 1 || pzi0.m174454o() < this.f176346a1.get().longValue() + 86400000) ? false : true;
    }

    /* JADX INFO: renamed from: wc */
    public final void m193319wc() {
        CoreModule.f18264c.f20384f0.m33705Kf(m110989i3());
        if (m193287pc()) {
            m193151Jg();
        }
    }

    /* JADX INFO: renamed from: wd */
    public final void m193320wd() {
        duringCreated(CoreModule.f18264c.f20384f0.m34077oo().filter(new qcj() { // from class: l.ioz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Message) obj));
            }
        })).subscribe(new y20() { // from class: l.joz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122064a.m193194Sg((Message) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20384f0.m34179wn().filter(new qcj() { // from class: l.ioz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Message) obj));
            }
        })).subscribe(new y20() { // from class: l.joz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122064a.m193194Sg((Message) obj);
            }
        });
        if (h39.m133430S()) {
            User userById = CoreModule.m30930K().getUserById(mo111034r3());
            if (NullChecker.m82486a(userById) && userById.isBannedNew()) {
                return;
            }
            creates(new y20() { // from class: l.loz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132991a.m193155Kf((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: we */
    public final /* synthetic */ void m193321we() {
        this.f82453G.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: wf */
    public final /* synthetic */ void m193322wf(pf60 pf60Var) {
        CoreModule.f18264c.f20384f0.m33933dh(this.f82473b, MessageType.get(MessageType.local_push_switch));
        CoreModule.f18264c.f20381e0.f89216e2.put(Boolean.TRUE);
        CoreModule.f18264c.f20381e0.f89192b2.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: wg */
    public boolean mo150404wg() {
        return xzm0.m213760p().m213775s();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion mo111061x3() {
        n4z n4zVar = this.f176329J0;
        if (n4zVar == null) {
            return null;
        }
        return n4zVar.m161624r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.clz
    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User mo111064x6() {
        return (User) this.f82481j;
    }

    /* JADX INFO: renamed from: xc */
    public final void m193323xc() {
        if (CoreModule.f18264c.f20426t0.m31029p3() || User.isTeamAccount(this.f82473b)) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.yoz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201028a.m193205Vd((User) obj);
            }
        }, new y20() { // from class: l.zoz
            @Override // p153l.y20
            public final void call(Object obj) {
                tvz.m192926Pb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: xd */
    public final void m193324xd() {
        if (CoreModule.m30933P().m143412i().mo180555w4() && NullChecker.m82486a(mo111064x6()) && !jyb.m147479J(mo111064x6().profile.extensions.interest.tags) && CoreModule.m30933P().m143412i().mo180441b0(mo111064x6())) {
            duringCreated(CoreModule.m30933P().m143412i().mo180473g2().take(2)).subscribe(psd0.m173596G(new y20() { // from class: l.atz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73455a.m193160Lf((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: xe */
    public final /* synthetic */ void m193325xe(Object obj) {
        if (this.f82454H.isEmpty()) {
            return;
        }
        ((yxz) this.viewModel).m217862Z4(this.f82454H.remove(0), new x20() { // from class: l.erz
            @Override // p153l.x20
            public final void call() {
                this.f95549a.m193321we();
            }
        });
    }

    /* JADX INFO: renamed from: xf */
    public final /* synthetic */ C22421c m193326xf(uxj0 uxj0Var) {
        return psd0.m173625r(m193267lc(), this.f82492s.distinctUntilChanged(), new utq());
    }

    /* JADX INFO: renamed from: xg */
    public void m193327xg(String str, String str2, boolean z) {
        if (z) {
            m193337zg(str, str2);
        } else {
            m193107Ag(str, str2);
        }
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: y6 */
    public void mo111068y6() {
        super.mo111068y6();
        if (NullChecker.m82486a(this.f82482k)) {
            nvm.m164890n().m164903u(this.f82482k);
        }
    }

    /* JADX INFO: renamed from: yc */
    public final void m193328yc() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.llz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132618a.m193208Wd((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: yd */
    public final void m193329yd() {
        duringCreated(CoreModule.f18264c.f20384f0.m33702Jo()).subscribe(psd0.m173596G(new y20() { // from class: l.ktz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128774a.m193164Mf((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ye */
    public final /* synthetic */ void m193330ye(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.f82454H.clear();
            ((yxz) this.viewModel).m217902t5();
        }
    }

    /* JADX INFO: renamed from: yf */
    public final /* synthetic */ void m193331yf(pf60 pf60Var) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(pf60Var.f152156a) && Boolean.FALSE.equals(pf60Var.f152157b) && NullChecker.m82486a(((yxz) this.viewModel).f160339G0)) {
            ((yxz) this.viewModel).m217890n5();
        } else if (NullChecker.m82486a(((yxz) this.viewModel).f160417r1) && ((yxz) this.viewModel).f160417r1.m137691m() == 10) {
            ((yxz) this.viewModel).mo178911Q1(false, new Runnable() { // from class: l.uqz
                @Override // java.lang.Runnable
                public final void run() {
                    tvz.m193054q8();
                }
            });
        }
        if (!bool.equals(pf60Var.f152157b) || TextUtils.isEmpty(this.f82482k.localDraft)) {
            return;
        }
        this.f176347b1 = "";
        m193122Dg();
    }

    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public final void m193281ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.m50375v("playTempAnim level = " + m111004l3() + "   chatHeat = " + chatHeat.toJson());
        duringCreated(((yxz) this.viewModel).m217863a4() ? ((yxz) this.viewModel).m217838N3() : C22421c.just(uxj0.f181467a)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.wrz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190576a.m193234cg(chatHeat, (uxj0) obj);
            }
        }));
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: z3 */
    public String mo111069z3() {
        if (!CoreModule.m30933P().m143412i().mo180406U3()) {
            return super.mo111069z3();
        }
        ChatHeat chatHeatM111468m3 = CoreModule.f18264c.f20328M1.m111468m3(this.f82473b);
        if (!NullChecker.m82486a(chatHeatM111468m3)) {
            return User.ID_TEAM_ACCOUNT;
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50371r = MessageWarmingUpHelper.m50371r(chatHeatM111468m3.degree);
        if (warmingUpLevelM50371r.value <= 0) {
            return User.ID_TEAM_ACCOUNT;
        }
        StringBuilder sb = new StringBuilder("level_");
        sb.append(warmingUpLevelM50371r.value - 1);
        return sb.toString();
    }

    @Override // p153l.clz
    /* JADX INFO: renamed from: z6 */
    public void mo111072z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || this.f82454H.contains(coreGiftInfo) || ((yxz) this.viewModel).m217861Z3()) {
            return;
        }
        ((yxz) this.viewModel).m217864a5(message, coreGiftInfo, null, true, str, z);
        i4g0.m138492A("e_chat_gift_view", act().pageId(), jyb.m147494Y("is_chat_gift_sender", Boolean.valueOf(!TextUtils.isEmpty(str))), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
    }

    /* JADX INFO: renamed from: zc */
    public final void m193333zc() {
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b)).subscribe(psd0.m173596G(new y20() { // from class: l.vlz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184653a.m193212Xd((User) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo180479h3() && NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
            m193288pd();
        }
    }

    /* JADX INFO: renamed from: zd */
    public final void m193334zd() {
        if (CoreModule.m30933P().m143412i().mo34383O()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3());
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (!NullChecker.m82486a(userM116503Pa) || userM116503Pa.isTeamAccount() || !userM116503Pa.isIdAndPicBothVerified() || !NullChecker.m82486a(userM116600p9) || userM116600p9.isIdAndPicBothVerified() || CoreModule.f18264c.f20381e0.f89060K0.get().booleanValue()) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89060K0.put(Boolean.TRUE);
            ((yxz) this.viewModel).m217894p5(userM116503Pa);
        }
    }

    /* JADX INFO: renamed from: ze */
    public final /* synthetic */ void m193335ze(jl80 jl80Var) {
        if (jl80Var != null && jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: zf */
    public final /* synthetic */ void m193336zf(Integer num) {
        if (num.intValue() > 0) {
            ((yxz) this.viewModel).m217856W4(true);
        }
    }

    /* JADX INFO: renamed from: zg */
    public final void m193337zg(String str, String str2) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = oki.m168011B(str);
        pictureNew_.mediaType = "image/*";
        pictureNew_.status = MediaLocalStatus.get("raw");
        Message message = new Message();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureNew_);
        message.media = arrayList;
        message.messageType = MessageType.get(MessageType.real_shot);
        message.value = str2;
        m110837A6(message);
    }

    /* JADX INFO: renamed from: mc */
    public final void m193272mc() {
    }
}
