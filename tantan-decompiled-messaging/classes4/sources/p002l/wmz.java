package p002l;

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
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.AgeVerificationInfo;
import com.p1.mobile.putong.core.data.AnalysisGuide;
import com.p1.mobile.putong.core.data.ChatBlockStatus;
import com.p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.ExchangePicture;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageExtData;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p1.mobile.putong.core.data.PlatinumPinChat;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.Questionnaire;
import com.p1.mobile.putong.core.data.QuestionnaireScene;
import com.p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p1.mobile.putong.core.data.RiskOtherData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.filter.FilterVerificationUserMsgDlg;
import com.p1.mobile.putong.core.ui.messages.Keyboard;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.core.ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.GPMemo;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.ODiamondVisitorInfo;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.Visitor;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.remote_config.RemoteConfig;
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
import l.a9m;
import l.au2;
import l.axa0;
import l.bh0;
import l.bpz;
import l.c3c0;
import l.cj90;
import l.d30;
import l.d36;
import l.dd80;
import l.dqy;
import l.dxa0;
import l.e30;
import l.e51;
import l.faj;
import l.fcz;
import l.fmp0;
import l.g30;
import l.gm20;
import l.gq5;
import l.hap;
import l.hpd0;
import l.i0g0;
import l.i36;
import l.i86;
import l.ij8;
import l.j760;
import l.jjb0;
import l.jo0;
import l.jq2;
import l.knb0;
import l.kxe;
import l.kyb0;
import l.lsi0;
import l.lz4;
import l.m5f;
import l.m8m;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.ml6;
import l.mqi0;
import l.mtm;
import l.nlm0;
import l.oa8;
import l.oxe;
import l.q5k0;
import l.q860;
import l.qqi0;
import l.qsz;
import l.qvy;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.ruy;
import l.rw6;
import l.tpd0;
import l.tqm0;
import l.tqz;
import l.trq;
import l.ua20;
import l.ura;
import l.v9j;
import l.vwb;
import l.w3z;
import l.w9j;
import l.wl20;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xh0;
import l.xma;
import l.y19;
import l.y4c0;
import l.y9j;
import l.yaf0;
import l.yd;
import l.z19;
import l.z9j;
import l.zii0;
import l.zpd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wmz extends fcz<User, bpz> {

    /* JADX INFO: renamed from: I0 */
    public boolean f21838I0;

    /* JADX INFO: renamed from: J0 */
    public qvy f21839J0;

    /* JADX INFO: renamed from: K0 */
    public a<ChatBlockStatus> f21840K0;

    /* JADX INFO: renamed from: L0 */
    public a<Boolean> f21841L0;

    /* JADX INFO: renamed from: M0 */
    public a<roj0> f21842M0;

    /* JADX INFO: renamed from: N0 */
    public final a<roj0> f21843N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f21844O0;

    /* JADX INFO: renamed from: P0 */
    public volatile boolean f21845P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f21846Q0;

    /* JADX INFO: renamed from: R0 */
    public ChatHeat f21847R0;

    /* JADX INFO: renamed from: S0 */
    @Nullable
    public ChatHeat f21848S0;

    /* JADX INFO: renamed from: T0 */
    public qsz f21849T0;

    /* JADX INFO: renamed from: U0 */
    public gq5 f21850U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f21851V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f21852W0;

    /* JADX INFO: renamed from: X0 */
    public int f21853X0;

    /* JADX INFO: renamed from: Y0 */
    public Runnable f21854Y0;

    /* JADX INFO: renamed from: Z0 */
    public boolean f21855Z0;

    /* JADX INFO: renamed from: a1 */
    public zpd0 f21856a1;

    /* JADX INFO: renamed from: b1 */
    public String f21857b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f21858c1;

    /* JADX INFO: renamed from: d1 */
    public int f21859d1;

    /* JADX INFO: renamed from: e1 */
    public hpd0 f21860e1;

    /* JADX INFO: renamed from: f1 */
    public List<a9m> f21861f1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f21862g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f21863h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f21864i1;

    /* JADX INFO: renamed from: j1 */
    public UserLiveLabel f21865j1;

    /* JADX INFO: renamed from: k1 */
    public String f21866k1;

    /* JADX INFO: renamed from: l1 */
    public Runnable f21867l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f21868m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f21869n1;

    /* JADX INFO: renamed from: o1 */
    public Runnable f21870o1;

    /* JADX INFO: renamed from: l.wmz$a */
    public class C0883a implements e30<String> {
        public C0883a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (TextUtils.equals(str, wmz.this.i3()) && d36.c().d(str)) {
                ((jq2) wmz.this).viewModel.A5(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmz$b */
    public class C0884b implements e30<Message> {
        public C0884b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Message message) {
            wmz wmzVar = wmz.this;
            int i = wmzVar.f21853X0 + 1;
            wmzVar.f21853X0 = i;
            if (i >= CoreModule.P().a().Ja().exp_dismiss_count) {
                ((jq2) wmz.this).viewModel.A5(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmz$c */
    public class C0885c implements d30 {
        public C0885c() {
        }

        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = wmz.this.m25196r3();
            tpd0 tpd0Var = App.i;
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            messageNew_.messageType = MessageType.get("picture_text_deeplink");
            messageNew_.localCreatedTime = mqi0.o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = ((DbObject) CoreModule.c.e0.p9()).id;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.c.f0.ah(messageNew_, false);
        }
    }

    /* JADX INFO: renamed from: l.wmz$d */
    public class C0886d implements d30 {
        public C0886d() {
        }

        public void call() {
            Message messageNew_ = Message.new_();
            messageNew_.cid = wmz.this.m25196r3();
            tpd0 tpd0Var = App.i;
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            messageNew_.messageType = MessageType.get("picture_text_deeplink");
            messageNew_.localCreatedTime = mqi0.o();
            messageNew_.createdTime = System.currentTimeMillis();
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            messageNew_.localInConversation = true;
            messageNew_.owner = wmz.this.m25196r3();
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.value = "";
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgDataNew_ = PictureTxtDeeplinkMsgData.new_();
            pictureTxtDeeplinkMsgDataNew_.type = 3;
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageViewNew_ = PictureTxtDeeplinkMessageView.new_();
            pictureTxtDeeplinkMsgDataNew_.view = pictureTxtDeeplinkMessageViewNew_;
            pictureTxtDeeplinkMessageViewNew_.title = "1234";
            pictureTxtDeeplinkMessageViewNew_.subTitle = "12314";
            messageNew_.msgData = pictureTxtDeeplinkMsgDataNew_.toJson();
            CoreModule.c.f0.ah(messageNew_, false);
        }
    }

    public wmz(mcr mcrVar, Conversation conversation) {
        super(mcrVar);
        this.f21838I0 = false;
        this.f21840K0 = a.b();
        this.f21841L0 = a.b();
        this.f21842M0 = a.b();
        this.f21843N0 = a.b();
        this.f21844O0 = false;
        this.f21845P0 = false;
        this.f21846Q0 = false;
        this.f21848S0 = null;
        this.f21849T0 = new qsz();
        this.f21851V0 = false;
        this.f21852W0 = false;
        this.f21854Y0 = null;
        this.f21855Z0 = false;
        this.f21857b1 = "";
        this.f21858c1 = false;
        this.f21861f1 = new ArrayList();
        this.f21862g1 = new Runnable() { // from class: l.dgz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9256a.m25095Xf();
            }
        };
        this.f21863h1 = false;
        this.f21864i1 = false;
        this.f21865j1 = null;
        this.f21867l1 = new Runnable() { // from class: l.egz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9771a.m25106Zf();
            }
        };
        this.f21868m1 = false;
        this.f21870o1 = new Runnable() { // from class: l.fgz
            @Override // java.lang.Runnable
            public final void run() {
                this.f10339a.m25110ag();
            }
        };
        if (NullChecker.a(conversation)) {
            ((fcz) this).c = ((DbObject) conversation).id;
            ((fcz) this).b = conversation.otherUser;
            ((fcz) this).k = conversation;
            if (ura.e().d().mj()) {
                this.f21855Z0 = i36.g().o(((fcz) this).c);
            }
            this.f21857b1 = conversation.localDraft;
        }
        this.f21856a1 = new zpd0("chat_assistant_question_message_show_time_" + CoreModule.H().userId() + "_" + ((fcz) this).c, 0L);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m24721B7(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.unreadMessages = 0;
        CoreModule.c.f0.mq(conversationClone);
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m24724Ba(Throwable th) {
    }

    /* JADX INFO: renamed from: C9 */
    public static /* synthetic */ void m24728C9() {
    }

    /* JADX INFO: renamed from: D8 */
    public static /* synthetic */ void m24732D8(c cVar) {
        if (cVar == c.m) {
            CoreModule.c.f1.I3();
        }
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m24740Eb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ed */
    private void m24741Ed(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.v("initWarmingUpView = " + this.f21844O0 + " level = " + warmingUpLevel);
        if (this.f21844O0) {
            return;
        }
        this.f21844O0 = true;
        ((jq2) this).viewModel.S3(warmingUpLevel);
        e0().A0().g0().H0(warmingUpLevel);
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m24757I7(Optional optional) {
        if (optional.isPresent()) {
            ((a9m) optional.get()).handle();
        }
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m24758I8(Throwable th) {
    }

    /* JADX INFO: renamed from: Ia */
    public static /* synthetic */ void m24760Ia(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: J7 */
    public static /* synthetic */ void m24762J7(int i, boolean z, Message message) {
        message.localMyVisitorCount = i;
        message.localMyVisitorHidden = z;
    }

    /* JADX INFO: renamed from: J9 */
    public static /* synthetic */ void m24764J9(Throwable th) {
    }

    /* JADX INFO: renamed from: Ja */
    public static /* synthetic */ Boolean m24765Ja(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m24774L9(Throwable th) {
    }

    /* JADX INFO: renamed from: La */
    public static /* synthetic */ Boolean m24775La(Conversation conversation) {
        if (CoreModule.P().i().E()) {
            return Boolean.valueOf(TEnum.equals(conversation.status, "default") && !ml6.a(conversation));
        }
        return Boolean.valueOf(TEnum.equals(conversation.status, "default"));
    }

    /* JADX INFO: renamed from: Lb */
    public static /* synthetic */ void m24776Lb(Throwable th) {
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ Optional m24780Ma(ArrayList arrayList, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        vwb.o0(listAsList, new w9j() { // from class: l.cjz
            public final Object call(Object obj) {
                return obj.toString();
            }
        }, ", ");
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                ((a9m) arrayList.get(i)).getClass();
                return Optional.of((a9m) arrayList.get(i));
            }
        }
        return Optional.absent();
    }

    /* JADX INFO: renamed from: Mc */
    private void m24782Mc() {
        if (y19.K()) {
            duringCreated(rx.c.combineLatest(CoreModule.c.e0.o9(), T2(), new gm20())).subscribe(mkd0.G(new e30() { // from class: l.tjz
                public final void call(Object obj) {
                    this.f20280a.m25199re((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N9 */
    public static /* synthetic */ PurchaseType m24785N9(PurchaseType purchaseType, List list) {
        return purchaseType;
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m24786Na(Throwable th) {
    }

    /* JADX INFO: renamed from: O9 */
    public static /* synthetic */ void m24790O9(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ void m24797Pb(Throwable th) {
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m24801Qa(Throwable th) {
    }

    /* JADX INFO: renamed from: Rb */
    public static /* synthetic */ void m24807Rb(Throwable th) {
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m24808S7(Throwable th) {
    }

    /* JADX INFO: renamed from: Sc */
    private void m24813Sc() {
        if (TextUtils.isEmpty(((fcz) this).c)) {
            return;
        }
        final Conversation conversationXe = CoreModule.c.f0.Xe(((fcz) this).c);
        final User userPa = CoreModule.c.e0.Pa(((fcz) this).c);
        if (conversationXe == null || !conversationXe.isHeartbeatConv() || conversationXe.additional.heartbeatMatch == null) {
            return;
        }
        duringCreated(CoreModule.c.H1.D3()).subscribe(mkd0.G(new e30() { // from class: l.plz
            public final void call(Object obj) {
                this.f17534a.m25012He((Message) obj);
            }
        }));
        final a aVarB = a.b();
        creates(new e30() { // from class: l.amz
            public final void call(Object obj) {
                Conversation conversation = conversationXe;
                CoreModule.c.H1.z3(conversation.additional.heartbeatMatch.isPassive, ((DbObject) conversation).id, aVarB);
            }
        });
        if (conversationXe.additional.heartbeatMatch.isPassive) {
            duringCreated(rx.c.combineLatest(CoreModule.c.f0.Mg(m25196r3()).filter(new w9j() { // from class: l.gmz
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), aVarB, new x9j() { // from class: l.tlz
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.hmz
                public final void call(Object obj) {
                    this.f12114a.m24981Be(userPa, (j760) obj);
                }
            }, new e30() { // from class: l.imz
                public final void call(Object obj) {
                    wmz.m24931ra((Throwable) obj);
                }
            }));
            duringCreated(rx.c.combineLatest(CoreModule.c.f0.Mg(m25196r3()).filter(new w9j() { // from class: l.jmz
                public final Object call(Object obj) {
                    return wmz.m24841Y7((Boolean) obj);
                }
            }).take(1), aVarB, new x9j() { // from class: l.tlz
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.lmz
                public final void call(Object obj) {
                    this.f14957a.m24986Ce(userPa, (j760) obj);
                }
            }, new e30() { // from class: l.mmz
                public final void call(Object obj) {
                    wmz.m24912mb((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.c.f0.Jo().take(1)).subscribe(mkd0.H(new e30() { // from class: l.qlz
                public final void call(Object obj) {
                    CoreModule.c.f0.Fo();
                }
            }, new e30() { // from class: l.rlz
                public final void call(Object obj) {
                    wmz.m24940tb((Throwable) obj);
                }
            }));
        } else {
            duringCreated(rx.c.combineLatest(CoreModule.c.f0.Jg(m25196r3()).filter(new w9j() { // from class: l.slz
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }).take(1), aVarB, new x9j() { // from class: l.tlz
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.ulz
                public final void call(Object obj) {
                    this.f20707a.m24991De(userPa, (j760) obj);
                }
            }, new e30() { // from class: l.vlz
                public final void call(Object obj) {
                    wmz.m24858ba((Throwable) obj);
                }
            }));
            duringCreated(rx.c.combineLatest(CoreModule.c.f0.Jg(m25196r3()).filter(new w9j() { // from class: l.wlz
                public final Object call(Object obj) {
                    return wmz.m24765Ja((Boolean) obj);
                }
            }).take(1), aVarB, new x9j() { // from class: l.tlz
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (roj0) obj2);
                }
            }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.xlz
                public final void call(Object obj) {
                    this.f22349a.m24995Ee(userPa, (j760) obj);
                }
            }, new e30() { // from class: l.ylz
                public final void call(Object obj) {
                    wmz.m24801Qa((Throwable) obj);
                }
            }));
        }
        final boolean z = conversationXe.additional.heartbeatMatch.isPassive;
        duringCreated(rx.c.combineLatest(U2().map(new w9j() { // from class: l.bmz
            public final Object call(Object obj) {
                return ((Conversation) obj).convType;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.cmz
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, "default"));
            }
        }).take(1), aVarB, new dmz()).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.emz
            public final void call(Object obj) {
                this.f9877a.m25000Fe(z, (j760) obj);
            }
        }, new e30() { // from class: l.fmz
            public final void call(Object obj) {
                wmz.m24950v9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Uc */
    private void m24824Uc() {
        CoreModule.c.f0.Mf(i3());
        duringCreated(mkd0.r(CoreModule.c.f0.Ue(m25196r3()).filter(new oa8()).first(), CoreModule.c.e0.Ma(m25196r3()).filter(new yd()).first(), new x9j() { // from class: l.rmz
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Conversation) obj, (User) obj2);
            }
        }).switchMap(new w9j() { // from class: l.smz
            public final Object call(Object obj) {
                return this.f19130a.m25019Ie((j760) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.tmz
            public final void call(Object obj) {
                wmz.m24757I7((Optional) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m24828Va(Throwable th) {
    }

    /* JADX INFO: renamed from: W9 */
    public static /* synthetic */ void m24832W9(Throwable th) {
    }

    /* JADX INFO: renamed from: Wb */
    public static /* synthetic */ Boolean m24834Wb(xaj0 xaj0Var) {
        User user = (User) xaj0Var.a;
        boolean zBooleanValue = ((Boolean) xaj0Var.b).booleanValue();
        Message message = (Message) xaj0Var.c;
        return Boolean.valueOf(NullChecker.a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.c.e0.na().isPicVerificationVerified() && !zBooleanValue && NullChecker.a(message) && (message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人")));
    }

    /* JADX INFO: renamed from: Wc */
    private void m24835Wc() {
        duringCreated(CoreModule.c.C0.x3().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.sjz
            public final void call(Object obj) {
                this.f19058a.m25035Le((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Xb */
    public static /* synthetic */ void m24840Xb(dd80 dd80Var) {
        if (dd80Var == null || !dd80Var.isShowing()) {
            return;
        }
        CoreModule.c.e0.d3.put(mqi0.t());
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: Y7 */
    public static /* synthetic */ Boolean m24841Y7(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b9 */
    public static /* synthetic */ void m24857b9(Boolean bool) {
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ void m24858ba(Throwable th) {
    }

    /* JADX INFO: renamed from: bc */
    public static /* synthetic */ void m24860bc(Throwable th) {
    }

    /* JADX INFO: renamed from: da */
    public static /* synthetic */ Boolean m24868da(j760 j760Var, a9m a9mVar) {
        try {
            return Boolean.valueOf(a9mVar.a((Conversation) j760Var.a, (User) j760Var.b));
        } catch (Exception e) {
            CrashHelper.c(e);
            au2.w(e);
            e.toString();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ Boolean m24873ea(xaj0 xaj0Var) {
        User user = (User) xaj0Var.a;
        return Boolean.valueOf(NullChecker.a(user) && !user.isTeamAccount() && user.isPicVerificationVerified() && !CoreModule.c.e0.na().isPicVerificationVerified() && !((Boolean) xaj0Var.b).booleanValue() && vwb.m(vwb.k0((List) xaj0Var.c, 5), new w9j() { // from class: l.miz
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(message.value.contains("头像") || message.value.contains("认证") || message.value.contains("本人"));
            }
        }));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m24874eb(Throwable th) {
    }

    /* JADX INFO: renamed from: fc */
    public static /* synthetic */ void m24880fc(Throwable th) {
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ Boolean m24888ha(Conversation conversation, Boolean bool, Boolean bool2) {
        if (TextUtils.isEmpty(conversation.clearedUntil) || TextUtils.equals(conversation.clearedUntil, "0")) {
            return Boolean.valueOf((NullChecker.a(bool) && bool.booleanValue() && NullChecker.a(bool2) && bool2.booleanValue()) ? false : true);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: hb */
    public static /* synthetic */ void m24889hb(Throwable th) {
    }

    /* JADX INFO: renamed from: j9 */
    public static /* synthetic */ void m24896j9(Throwable th) {
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m24898jb(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k8 */
    public static /* synthetic */ Boolean m24900k8(ChatHeat chatHeat, ChatHeat chatHeat2) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelE = NullChecker.a(chatHeat) ? MessageWarmingUpHelper.e(chatHeat) : null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelE2 = NullChecker.a(chatHeat2) ? MessageWarmingUpHelper.e(chatHeat2) : null;
        return Boolean.valueOf(NullChecker.a(warmingUpLevelE2) && warmingUpLevelE2 == warmingUpLevelE);
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m24902ka(Throwable th) {
    }

    /* JADX INFO: renamed from: kb */
    public static /* synthetic */ void m24903kb() {
        if (((Boolean) CoreModule.c.e0.h1.get()).booleanValue()) {
            CoreModule.c.e0.h1.put(Boolean.FALSE);
            CoreModule.c.e0.i1.clear();
        }
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ void m24912mb(Throwable th) {
    }

    /* JADX INFO: renamed from: n9 */
    public static /* synthetic */ Boolean m24914n9(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: o8 */
    public static /* synthetic */ void m24917o8(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q8 */
    public static /* synthetic */ void m24925q8() {
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m24930r9(Message message) {
        ij8 ij8Var = CoreModule.c.r2;
        ij8Var.l0 = 0;
        ij8Var.k0.clear();
    }

    /* JADX INFO: renamed from: ra */
    public static /* synthetic */ void m24931ra(Throwable th) {
    }

    /* JADX INFO: renamed from: tb */
    public static /* synthetic */ void m24940tb(Throwable th) {
    }

    /* JADX INFO: renamed from: td */
    private void m24941td() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.zjz
            public final void call(Object obj) {
                this.f23469a.m24996Ef((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: tg */
    private void m24942tg(boolean z) {
        e0().A0().g0().t1(z);
    }

    /* JADX INFO: renamed from: v9 */
    public static /* synthetic */ void m24950v9(Throwable th) {
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m24951va(PutongAct putongAct) {
        MessagesAct messagesAct = (MessagesAct) putongAct;
        if (NullChecker.a(messagesAct.l().t7().n1)) {
            messagesAct.l().t7().n1.setSelectionHook(messagesAct.l().t7().n1.getCountHook());
        }
    }

    /* JADX INFO: renamed from: vb */
    public static /* synthetic */ void m24952vb(Throwable th) {
    }

    /* JADX INFO: renamed from: vd */
    private void m24953vd() {
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().filter(new w9j() { // from class: l.uiz
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.F3());
            }
        }).flatMap(new w9j() { // from class: l.viz
            public final Object call(Object obj) {
                return this.f21184a.m25007Gf((UserPrivilege) obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.wiz
            public final void call(Object obj) {
                this.f21797a.m25020If((ODiamondVisitorInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m24956w9(Throwable th) {
    }

    /* JADX INFO: renamed from: wa */
    public static /* synthetic */ void m24957wa(ChatHeat chatHeat) {
        final ChatHeat chatHeatClone = chatHeat.clone();
        chatHeatClone.levelUp = false;
        CoreModule.c.U.a(new d30() { // from class: l.pjz
            public final void call() {
                CoreModule.k.s.upsert(chatHeatClone);
            }
        });
    }

    /* JADX INFO: renamed from: wb */
    public static /* synthetic */ ChatHeat m24958wb(ChatHeat chatHeat) {
        if (chatHeat == null) {
            return null;
        }
        return chatHeat.clone();
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ void m24964y7(Bundle bundle) {
    }

    /* JADX INFO: renamed from: yb */
    public static /* synthetic */ Integer m24968yb(j760 j760Var) {
        return (Integer) j760Var.a;
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m24970z8(Throwable th) {
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m24971z9(Location location) {
    }

    /* JADX INFO: renamed from: Ac */
    public final void m24974Ac() {
        String strR3 = e0().l().r3();
        duringCreated(mkd0.r(CoreModule.c.e0.Ka(strR3), CoreModule.c.e0.La(strR3), new x9j() { // from class: l.xjz
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (GPMemo) obj2);
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.yjz
            public final void call(Object obj) {
                this.f22947a.m25098Yd((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ad */
    public final void m24975Ad() {
        if (CoreModule.P().a().Xn()) {
            CoreModule.c.f0.Pf(((fcz) this).c, "local_ux_questionnaire");
            CoreModule.c.f0.Pf(((fcz) this).c, "local_ux_questionnaire_tip");
            int iHn = CoreModule.P().a().hn();
            int iTm = CoreModule.P().a().Tm();
            Random random = new Random();
            if (iHn == iTm) {
                this.f21859d1 = iHn;
            } else if (iHn < iTm) {
                this.f21859d1 = random.nextInt(iTm - iHn) + iHn;
            } else {
                this.f21859d1 = random.nextInt(iHn - iTm) + iTm;
            }
            User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
            Conversation conversationXe = CoreModule.c.f0.Xe(i3());
            if (NullChecker.a(userPa) && !userPa.isTeamAccount()) {
                CoreModule.c.u2.X.put(Long.valueOf(mqi0.o()));
            }
            this.f21860e1 = new hpd0("ux_questionnaire_showed" + CoreModule.H().userId() + "/" + m25196r3(), Boolean.FALSE);
            if (e4() || !NullChecker.a(userPa) || userPa.isTeamAccount() || userPa.unilateralBlock() || userPa.isAccountCancellation() || userPa.isFakeUser() || userPa.isBannedNew() || !NullChecker.a(conversationXe) || conversationXe.isQuickChatConv() || ((Boolean) this.f21860e1.get()).booleanValue()) {
                return;
            }
            duringCreated(U2().distinctUntilChanged().filter(new w9j() { // from class: l.kmz
                public final Object call(Object obj) {
                    return this.f14424a.m25046Nf((Conversation) obj);
                }
            }).flatMap(new w9j() { // from class: l.vmz
                public final Object call(Object obj) {
                    return CoreModule.c.u2.c3(QuestionnaireScene.get("messageDetail"), (QuestionnaireStrategy) null);
                }
            }).take(1)).subscribe(mkd0.H(new e30() { // from class: l.zcz
                public final void call(Object obj) {
                    this.f23347a.m25051Of((Questionnaire) obj);
                }
            }, new e30() { // from class: l.kdz
                public final void call(Object obj) {
                    wmz.m24889hb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ae */
    public final /* synthetic */ void m24976Ae(c cVar) {
        final dd80 dd80VarO = act().newDialog().S(c3c0.C0).y0("功能全新升级").t0("本次聊天需要消耗一次闪聊次数").P(false).M(false).b0("同意并聊天").W("不同意").O();
        dd80VarO.V(new Runnable() { // from class: l.yhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f22893a.m25243ze(dd80VarO);
            }
        });
        dd80VarO.W(new Runnable() { // from class: l.zhz
            @Override // java.lang.Runnable
            public final void run() {
                wmz.m24840Xb(dd80VarO);
            }
        });
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: Af */
    public final /* synthetic */ void m24977Af(PurchaseType purchaseType) {
        boolean z = !xma.e4();
        if (NullChecker.a(((jq2) this).viewModel.Q1)) {
            ((jq2) this).viewModel.Q1.t(z);
        }
    }

    /* JADX INFO: renamed from: Ag */
    public final void m24978Ag(String str, String str2) {
        r5l0 r5l0Var = new r5l0(str);
        if (!NullChecker.a(r5l0Var.a)) {
            lsi0.h(R.string.C2);
            return;
        }
        if (r5l0Var.b > 60000) {
            lsi0.h(R.string.T4);
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.media = new ArrayList();
        Video video = new Video();
        ((Media) video).url = rhi.B(r5l0Var.a);
        ((Media) video).status = MediaLocalStatus.get("raw");
        messageNew_.media.add(video);
        messageNew_.messageType = MessageType.get("real_shot");
        messageNew_.value = str2;
        S5(messageNew_);
    }

    /* JADX INFO: renamed from: Bc */
    public final void m24979Bc() {
        CoreModule.c.f0.Lf(i3());
        if (TextUtils.isEmpty(this.f21866k1) && y19.I()) {
            duringCreated(m25202s3(((fcz) this).b).take(1)).subscribe(mkd0.H(new e30() { // from class: l.lkz
                public final void call(Object obj) {
                    this.f14919a.m25104Zd((User) obj);
                }
            }, new e30() { // from class: l.mkz
                public final void call(Object obj) {
                    wmz.m24740Eb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Bd */
    public final void m24980Bd() {
        if (CoreModule.l.g().d4()) {
            CoreModule.c.f0.Pf(((fcz) this).c, "local_visitor_hide_footprint");
            duringCreated(mkd0.s(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_visitor_hide_footprint")), CoreModule.c.n2.H3(m25196r3()), new y9j() { // from class: l.adz
                /* JADX INFO: renamed from: a */
                public final Object m9603a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((User) obj, (Boolean) obj2, (Optional) obj3);
                }
            }).filter(new w9j() { // from class: l.bdz
                public final Object call(Object obj) {
                    return this.f8092a.m25056Pf((xaj0) obj);
                }
            }).first()).subscribe(mkd0.G(new e30() { // from class: l.cdz
                public final void call(Object obj) {
                    this.f8609a.m25062Qf((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Be */
    public final /* synthetic */ void m24981Be(User user, j760 j760Var) {
        Conversation conversationXe = CoreModule.c.f0.Xe(m25196r3());
        if (NullChecker.a(conversationXe) && conversationXe.isHeartbeatConv() && CoreModule.P().i().uh() && !user.unilateralBlock()) {
            ((jq2) this).viewModel.H0();
            ((jq2) this).viewModel.c2("后消失，快去打个招呼吧");
        }
    }

    /* JADX INFO: renamed from: Bf */
    public final /* synthetic */ rx.c m24982Bf() {
        return k4(m25196r3()) ? CoreModule.c.f0.Pp() : rx.c.just("");
    }

    /* JADX INFO: renamed from: Bg */
    public final void m24983Bg() {
        FrameLayout frameLayout;
        View viewJ;
        Conversation conversationJ3 = j3();
        if (conversationJ3 == null || act() == null || act().getWindow() == null || m25218vc() == null) {
            return;
        }
        m24997Eg();
        gq5 gq5Var = new gq5(act(), conversationJ3);
        this.f21850U0 = gq5Var;
        if (!gq5Var.t() || (viewJ = this.f21850U0.j((frameLayout = (FrameLayout) act().getWindow().getDecorView().findViewById(y4c0.Z)), m25218vc())) == null) {
            return;
        }
        frameLayout.addView(viewJ);
        if (this.f21852W0) {
            return;
        }
        this.f21850U0.s(false);
        this.f21852W0 = true;
    }

    /* JADX INFO: renamed from: Cc */
    public final void m24984Cc() {
        creates(new e30() { // from class: l.pez
            public final void call(Object obj) {
                this.f17233a.m25108ae((Bundle) obj);
            }
        }, new d30() { // from class: l.qez
            public final void call() {
                wmz.m24728C9();
            }
        });
    }

    /* JADX INFO: renamed from: Cd */
    public final void m24985Cd() {
        if (nlm0.c()) {
            ((jq2) this).viewModel.W3(true);
        }
    }

    /* JADX INFO: renamed from: Ce */
    public final /* synthetic */ void m24986Ce(User user, j760 j760Var) {
        Conversation conversationXe = CoreModule.c.f0.Xe(m25196r3());
        if (NullChecker.a(conversationXe) && conversationXe.isHeartbeatConv()) {
            if (CoreModule.P().i().uh() && !user.unilateralBlock()) {
                ((jq2) this).viewModel.H0();
                boolean zIsLimitMatch = conversationXe.isLimitMatch();
                bpz bpzVar = ((jq2) this).viewModel;
                if (zIsLimitMatch) {
                    bpzVar.c2("内发送消息即可解锁限时");
                } else {
                    bpzVar.c2("内可以回应他，即可解除限时");
                }
            }
            if (conversationXe.isLimitMatch()) {
                return;
            }
            CoreModule.c.H1.f4(m25196r3());
        }
    }

    /* JADX INFO: renamed from: Cf */
    public final /* synthetic */ void m24987Cf(String str) {
        e0().E().m23531s0();
        e0().A0().p2(true);
        if (lifecycle_() == c.i) {
            lsi0.w(R.string.O5);
        }
    }

    /* JADX INFO: renamed from: Cg */
    public final void m24988Cg() {
        if (!CoreModule.P().i().b() || TextUtils.isEmpty(m25196r3())) {
            return;
        }
        duringCreated(CoreModule.c.e0.Ka(m25196r3())).take(1).filter(new w9j() { // from class: l.qhz
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).isTeamAccount());
            }
        }).flatMap(new w9j() { // from class: l.shz
            public final Object call(Object obj) {
                return this.f19037a.m25127dg((User) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.thz
            public final Object call(Object obj) {
                return wmz.m24775La((Conversation) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.uhz
            public final Object call(Object obj) {
                return this.f20661a.m25133eg((Conversation) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.vhz
            public final void call(Object obj) {
                this.f21134a.m25137fg((List) obj);
            }
        }, new e30() { // from class: l.whz
            public final void call(Object obj) {
                wmz.m24786Na((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Dc */
    public final void m24989Dc() {
        if (User.isBusinessAI1V1(m25196r3())) {
            CoreModule.c.C0.x4();
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m24990Dd() {
        if (mo18687wg()) {
            duringCreated(rx.c.combineLatest(tqm0.p().i().distinctUntilChanged().observeOn(jo0.a()), this.f21842M0, new x9j() { // from class: l.hkz
                public final Object call(Object obj, Object obj2) {
                    return new j760((Integer) obj, (roj0) obj2);
                }
            }).map(new w9j() { // from class: l.skz
                public final Object call(Object obj) {
                    return wmz.m24968yb((j760) obj);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.dlz
                public final void call(Object obj) {
                    this.f9328a.m25068Rf((Integer) obj);
                }
            }));
            duringCreated(tqm0.p().A().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.olz
                public final void call(Object obj) {
                    this.f16695a.m25073Sf((Integer) obj);
                }
            }));
            e51.H(act(), new Runnable() { // from class: l.zlz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23505a.m25078Tf();
                }
            }, 700L);
        }
    }

    /* JADX INFO: renamed from: De */
    public final /* synthetic */ void m24991De(User user, j760 j760Var) {
        Conversation conversationXe = CoreModule.c.f0.Xe(m25196r3());
        if (NullChecker.a(conversationXe) && conversationXe.isHeartbeatConv() && CoreModule.P().i().uh() && !user.unilateralBlock()) {
            ((jq2) this).viewModel.H0();
            ((jq2) this).viewModel.c2(String.format("未和%s发送消息，将解除匹配", (NullChecker.a(user) && user.isFemale()) ? "她" : "他"));
        }
    }

    /* JADX INFO: renamed from: Df */
    public final /* synthetic */ void m24992Df(Throwable th) {
        e0().A0().p2(false);
        if (lifecycle_() == c.i) {
            lsi0.w(R.string.N5);
        }
    }

    /* JADX INFO: renamed from: Dg */
    public void m24993Dg() {
        this.f21843N0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Ec */
    public final void m24994Ec() {
        CoreModule.c.f0.Cf(i3());
        if (TextUtils.isEmpty(this.f21866k1) && m25221vg()) {
            duringCreated(CoreModule.c.U1.h3("icebreak")).subscribe(mkd0.H(new e30() { // from class: l.vgz
                public final void call(Object obj) {
                    this.f21123a.m25114be((List) obj);
                }
            }, new e30() { // from class: l.wjz
                public final void call(Object obj) {
                    wmz.m24896j9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ee */
    public final /* synthetic */ void m24995Ee(User user, j760 j760Var) {
        Conversation conversationXe = CoreModule.c.f0.Xe(i3());
        if (NullChecker.a(conversationXe) && conversationXe.isHeartbeatConv()) {
            if (CoreModule.P().i().uh() && !user.unilateralBlock()) {
                ((jq2) this).viewModel.H0();
                ((jq2) this).viewModel.c2("内对方回复即可匹配");
            }
            if (conversationXe.isLimitMatch()) {
                return;
            }
            CoreModule.c.H1.f4(m25196r3());
        }
    }

    /* JADX INFO: renamed from: Ef */
    public final /* synthetic */ void m24996Ef(c cVar) {
        if (cVar == c.i && m25162l4()) {
            CoreModule.P().i().N5(m25196r3());
        } else if (cVar == c.m) {
            CoreModule.P().i().z2();
        }
    }

    /* JADX INFO: renamed from: Eg */
    public final void m24997Eg() {
        gq5 gq5Var = this.f21850U0;
        if (gq5Var != null) {
            gq5Var.r();
            this.f21850U0 = null;
        }
    }

    /* JADX INFO: renamed from: Fc */
    public final void m24998Fc() {
        duringCreated(CoreModule.c.B0.j4()).filter(new w9j() { // from class: l.fdz
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new w9j() { // from class: l.gdz
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).ageVerificationInfo;
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.hdz
            public final void call(Object obj) {
                this.f12002a.m25119ce((AgeVerificationInfo) obj);
            }
        }));
        if (IntlCountryCodeController.n()) {
            duringCreated(mkd0.r(CoreModule.c.e0.o9(), mkd0.s(CoreModule.c.f0.Ne(m25196r3()), CoreModule.c.f0.Ig(m25196r3()), CoreModule.c.f0.Mg(m25196r3()), new y9j() { // from class: l.idz
                /* JADX INFO: renamed from: a */
                public final Object m15098a(Object obj, Object obj2, Object obj3) {
                    return wmz.m24888ha((Conversation) obj, (Boolean) obj2, (Boolean) obj3);
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.jdz
                public final Object call(Object obj, Object obj2) {
                    return j760.a((User) obj, (Boolean) obj2);
                }
            })).map(new w9j() { // from class: l.ldz
                public final Object call(Object obj) {
                    return this.f14789a.m25125de((j760) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.mdz
                public final void call(Object obj) {
                    this.f15353a.m25131ee((Boolean) obj);
                }
            }));
            duringCreated(this.f21841L0).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ndz
                public final void call(Object obj) {
                    this.f15964a.m25135fe((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fd */
    public final void m24999Fd() {
        if (CoreModule.P().a().o0()) {
            CoreModule.c.f0.Pf(((fcz) this).c, "local_wechat_notify_guide");
            duringCreated(mkd0.t(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_wechat_notify_guide")), CoreModule.c.f0.wn(), CoreModule.c.e0.K1, new z9j() { // from class: l.qcz
                /* JADX INFO: renamed from: b */
                public final Object m21166b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return xaj0.a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new w9j() { // from class: l.rcz
                public final Object call(Object obj) {
                    return this.f18478a.m25082Uf((xaj0) obj);
                }
            }).first()).subscribe(mkd0.G(new e30() { // from class: l.scz
                public final void call(Object obj) {
                    this.f18929a.m25088Vf((xaj0) obj);
                }
            }));
            duringCreated(rx.c.combineLatest(Act.foreground().map(new ua20()).distinctUntilChanged().filter(new w9j() { // from class: l.tcz
                public final Object call(Object obj) {
                    return wmz.m24914n9((Boolean) obj);
                }
            }).switchMap(new w9j() { // from class: l.ucz
                public final Object call(Object obj) {
                    return CoreModule.c.e0.Ra();
                }
            }), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_wechat_notify_guide")), new x9j() { // from class: l.vcz
                public final Object call(Object obj, Object obj2) {
                    return vwb.Y((WechatNotifySetting) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.wcz
                public final void call(Object obj) {
                    this.f21643a.m25091Wf((j760) obj);
                }
            }, new e30() { // from class: l.xcz
                public final void call(Object obj) {
                    wmz.m24764J9((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Fe */
    public final /* synthetic */ void m25000Fe(boolean z, j760 j760Var) {
        if (CoreModule.P().i().uh()) {
            ((jq2) this).viewModel.w0();
        }
        CoreModule.c.H1.A3(((fcz) this).c, z);
    }

    /* JADX INFO: renamed from: Ff */
    public final /* synthetic */ void m25001Ff(c cVar) {
        if (NullChecker.a(((jq2) this).viewModel.Q1) && NullChecker.a(((jq2) this).viewModel.Q1.v()) && xdl0.O0(((jq2) this).viewModel.Q1.v()) && TextUtils.equals(((fcz) this).b, g.Y2)) {
            CoreModule.P().i().Lf(act(), "p_messages,knowbetter", Privilege.unlock_learn_about_him_module, (e30) null, (e30) null);
            zvf0.r("e_know_him_better_guide", "p_messages_view");
        }
    }

    /* JADX INFO: renamed from: Fg */
    public final void m25002Fg() {
        if (ura.e().d().mj()) {
            duringCreated(U2().first()).subscribe(mkd0.G(new e30() { // from class: l.qmz
                public final void call(Object obj) {
                    i36.g().f(((DbObject) ((Conversation) obj)).id);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public void m25003G6() {
        super.G6();
        CoreModule.c.f0.Pf(((fcz) this).c, "local_o_diamond_visitor_guide");
    }

    /* JADX INFO: renamed from: Gc */
    public final void m25004Gc() {
        User userPa;
        if (!CoreModule.P().i().O2() || (userPa = CoreModule.c.e0.Pa(((fcz) this).b)) == null || userPa.isTeamAccount() || userPa.isBanned() || userPa.isBannedNew() || userPa.isAccountCancellation()) {
            return;
        }
        Keyboard keyboardA = e0().c0().g0().a();
        if (NullChecker.a(keyboardA)) {
            keyboardA.C();
        }
        duringCreated(e0().c0().x0()).subscribe(mkd0.G(new e30() { // from class: l.glz
            public final void call(Object obj) {
                this.f11508a.m25140ge((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Gd */
    public boolean m25005Gd() {
        User userPa = CoreModule.c.e0.Pa(m25196r3());
        if (CoreModule.l.i().De()) {
            return !NullChecker.a(userPa) || userPa.inactivated || userPa.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"));
        }
        return false;
    }

    /* JADX INFO: renamed from: Ge */
    public final /* synthetic */ void m25006Ge(View view) {
        m25175nc();
    }

    /* JADX INFO: renamed from: Gf */
    public final /* synthetic */ rx.c m25007Gf(UserPrivilege userPrivilege) {
        return CoreModule.c.n2.G3(m25196r3());
    }

    /* JADX INFO: renamed from: Gg */
    public final void m25008Gg(List<Message> list) {
        if (!ruy.g().e(m25196r3()) || this.f21868m1) {
            return;
        }
        this.f21868m1 = true;
        ruy.g().a.put(m25196r3());
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
            zvf0.A("e_secret_message", pageId(), new j760[]{vwb.Y("other_user_id", m25196r3()), vwb.Y("message_type", str)});
        }
    }

    /* JADX INFO: renamed from: H6 */
    public void m25009H6() {
        super.H6();
        CoreModule.c.f0.Pf(((fcz) this).c, "local_platinum_pin_guide");
    }

    /* JADX INFO: renamed from: Hc */
    public final void m25010Hc() {
        User userPa;
        if (!CoreModule.P().i().U3() || (userPa = CoreModule.c.e0.Pa(((fcz) this).b)) == null || userPa.isTeamAccount() || userPa.isBanned() || userPa.isBannedNew() || userPa.isAccountCancellation()) {
            return;
        }
        duringCreated(U2().map(new w9j() { // from class: l.qgz
            public final Object call(Object obj) {
                return MessageWarmingUpHelper.f(((Conversation) obj).mm);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.rgz
            public final void call(Object obj) {
                this.f18516a.m25144he((MessageWarmingUpHelper.WarmingUpLevel) obj);
            }
        }));
        duringCreated(CoreModule.c.M1.s3(m25196r3()).filter(new w9j() { // from class: l.sgz
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((ChatHeat) obj));
            }
        }).distinctUntilChanged(new x9j() { // from class: l.tgz
            public final Object call(Object obj, Object obj2) {
                return wmz.m24900k8((ChatHeat) obj, (ChatHeat) obj2);
            }
        }).observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.wgz
            public final void call(Object obj) {
                this.f21763a.m25150ie((ChatHeat) obj);
            }
        }));
        duringCreated(mkd0.t(CoreModule.c.M1.s3(((fcz) this).b).distinctUntilChanged().map(new w9j() { // from class: l.xgz
            public final Object call(Object obj) {
                return wmz.m24958wb((ChatHeat) obj);
            }
        }), CoreModule.c.f0.Ne(((fcz) this).b), CoreModule.c.e0.Ka(((fcz) this).b), CoreModule.k.c.r0(((fcz) this).b, "chat_gift").m(), new z9j() { // from class: l.ygz
            /* JADX INFO: renamed from: b */
            public final Object m26716b(Object obj, Object obj2, Object obj3, Object obj4) {
                return vwb.Z((ChatHeat) obj, (Conversation) obj2, (User) obj3, (List) obj4);
            }
        }).observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.zgz
            public final void call(Object obj) {
                this.f23419a.m25154je((knb0) obj);
            }
        }));
        duringCreated(e0().c0().x0()).subscribe(mkd0.G(new e30() { // from class: l.ahz
            public final void call(Object obj) {
                this.f7639a.m25159ke((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Hd */
    public final boolean m25011Hd() {
        User userPa = CoreModule.c.e0.Pa(m25196r3());
        if (NullChecker.a(userPa)) {
            return userPa.onlineMatchLocked();
        }
        return false;
    }

    /* JADX INFO: renamed from: He */
    public final /* synthetic */ void m25012He(Message message) {
        if (CoreModule.P().i().uh()) {
            ((jq2) this).viewModel.w0();
        }
        if (TextUtils.equals(message.cid, m25196r3())) {
            new xh0.a(act()).j("对方已离开，是否要删除配对？").r("是").o(new View.OnClickListener() { // from class: l.piz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17412a.m25006Ge(view);
                }
            }).f("否").a().g();
        }
    }

    /* JADX INFO: renamed from: Hf */
    public final /* synthetic */ void m25013Hf(ODiamondVisitorInfo oDiamondVisitorInfo) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((tqz) ((jq2) this).viewModel).t1)) {
            VText vTextD = ((tqz) ((jq2) this).viewModel).t1.d();
            if (NullChecker.a(vTextD)) {
                xdl0.M(vTextD, true);
                vTextD.setText(i0g0.b0(String.format("%s\n%s", oDiamondVisitorInfo.visitCountStr, oDiamondVisitorInfo.visitTimeStr), vwb.f0(new String[]{oDiamondVisitorInfo.visitCount, oDiamondVisitorInfo.visitTime}), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: Hg */
    public final boolean m25014Hg() {
        if (CoreModule.P().a().o0() && NotificationCheckerCommon.a() != NotificationCheckerCommon.State.opened && fmp0.g(App.e).isWXAppInstalled()) {
            boolean z = (CoreModule.c.e0.K1.e() == null || !((Optional) CoreModule.c.e0.K1.e()).isPresent() || ((WechatNotifySetting) ((Optional) CoreModule.c.e0.K1.e()).get()).wechatLaunch == null) ? false : true;
            WechatNotifyConfig wechatNotifyConfigX3 = CoreModule.P().a().X3();
            boolean z2 = ConversationCounterTypeSp.wechatNotifyGuideShowCount.get(((fcz) this).c) > 0;
            boolean z3 = wechatNotifyConfigX3 != null && mqi0.D(((Long) CoreModule.c.e0.n5.get()).longValue()) && ((Integer) CoreModule.c.e0.p5.get()).intValue() >= wechatNotifyConfigX3.message_daily_count;
            boolean z4 = wechatNotifyConfigX3 != null && ((Integer) CoreModule.c.e0.o5.get()).intValue() >= wechatNotifyConfigX3.message_total_count;
            if (z && !z2 && !z3 && !z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I2 */
    public void m25015I2(CoreGiftInfo coreGiftInfo) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || ((fcz) this).H.contains(coreGiftInfo)) {
            return;
        }
        ((fcz) this).H.add(coreGiftInfo);
        e51.F(act(), new Runnable() { // from class: l.ljz
            @Override // java.lang.Runnable
            public final void run() {
                this.f14910a.m25029Kd();
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public void m25016I6() {
        super.I6();
        CoreModule.c.f0.Pf(((fcz) this).c, "local_visitor_hide_footprint");
    }

    /* JADX INFO: renamed from: Ic */
    public final void m25017Ic() {
        if (CoreModule.P().a().kb() && b4()) {
            duringCreated(lz4.h().i().filter(new w9j() { // from class: l.odz
                public final Object call(Object obj) {
                    xaj0 xaj0Var = (xaj0) obj;
                    return Boolean.valueOf(((Boolean) xaj0Var.a).booleanValue() || ((Boolean) xaj0Var.b).booleanValue() || !vwb.J((Collection) ((j760) xaj0Var.c).b));
                }
            }).distinctUntilChanged(new x9j() { // from class: l.pdz
                public final Object call(Object obj, Object obj2) {
                    xaj0 xaj0Var = (xaj0) obj;
                    return Boolean.valueOf(NullChecker.a(xaj0Var) && ((j760) xaj0Var.c).a != ((j760) ((xaj0) obj2).c).a);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.qdz
                public final void call(Object obj) {
                    this.f17958a.m25167le((xaj0) obj);
                }
            }));
            duringCreated(CoreModule.c.f0.We(((fcz) this).b).filter(new w9j() { // from class: l.rdz
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.sdz
                public final void call(Object obj) {
                    this.f18947a.m25172me((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Id */
    public final int m25018Id() {
        String strF = RemoteConfig.x().F("ai_chat_advice_guide");
        if (TextUtils.isEmpty(strF)) {
            return 3;
        }
        try {
            int iOptInt = new JSONObject(strF).optInt("keyboardHangThreshold", 3);
            if (iOptInt != 0) {
                return iOptInt;
            }
            return 3;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Ie */
    public final /* synthetic */ rx.c m25019Ie(final j760 j760Var) {
        final ArrayList arrayListN = vwb.n(this.f21861f1, new w9j() { // from class: l.biz
            public final Object call(Object obj) {
                return wmz.m24868da(j760Var, (a9m) obj);
            }
        });
        if (vwb.J(arrayListN)) {
            return rx.c.just(Optional.absent());
        }
        vwb.o0(arrayListN, new w9j() { // from class: l.diz
            public final Object call(Object obj) {
                return ((a9m) obj).getClass().getSimpleName();
            }
        }, " ,");
        return mkd0.p(vwb.Q(arrayListN, new w9j() { // from class: l.eiz
            public final Object call(Object obj) {
                return ((a9m) obj).b().onErrorReturn(new w9j() { // from class: l.ajz
                    public final Object call(Object obj2) {
                        return Boolean.FALSE;
                    }
                }).first();
            }
        }), new faj() { // from class: l.fiz
            public final Object call(Object[] objArr) {
                return wmz.m24780Ma(arrayListN, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: If */
    public final /* synthetic */ void m25020If(final ODiamondVisitorInfo oDiamondVisitorInfo) {
        CoreModule.c.f0.Pf(((fcz) this).c, "local_o_diamond_visitor_guide");
        if (TextUtils.isEmpty(oDiamondVisitorInfo.visitCountStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTimeStr) || TextUtils.isEmpty(oDiamondVisitorInfo.visitCount) || TextUtils.isEmpty(oDiamondVisitorInfo.visitTime)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.hjz
            @Override // java.lang.Runnable
            public final void run() {
                this.f12081a.m25013Hf(oDiamondVisitorInfo);
            }
        });
    }

    /* JADX INFO: renamed from: Ig */
    public final void m25021Ig() {
        CoreModule.c.f0.Ug(i3(), "guide_type_answer");
        CoreModule.c.x2.r3(i3());
    }

    /* JADX INFO: renamed from: Jc */
    public final void m25022Jc() {
        if (CoreModule.l.i().l()) {
            duringCreated(mkd0.r(CoreModule.c.e0.Ka(m25196r3()).filter(new yd()), CoreModule.c.f0.Ne(m25196r3()), new gm20())).subscribe(mkd0.G(new e30() { // from class: l.flz
                public final void call(Object obj) {
                    this.f10463a.m25177ne((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Jd */
    public final /* synthetic */ Boolean m25023Jd(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var.a) && TextUtils.isEmpty(this.f21857b1) && TEnum.equals(((Conversation) j760Var.a).status, "default") && TextUtils.isEmpty(((Conversation) j760Var.a).localDraft) && TextUtils.equals(((Conversation) j760Var.a).convType, "default") && NullChecker.a(j760Var.b) && !((User) j760Var.b).isTeamAccount() && !((User) j760Var.b).isBannedNew() && !((User) j760Var.b).isAccountCancellation());
    }

    /* JADX INFO: renamed from: Je */
    public final /* synthetic */ rx.c m25024Je(User user) {
        return CoreModule.c.f0.Ne(((fcz) this).b);
    }

    /* JADX INFO: renamed from: Jf */
    public final /* synthetic */ void m25025Jf() {
        ((jq2) this).viewModel.o5();
    }

    /* JADX INFO: renamed from: Jg */
    public final void m25026Jg() {
        duringCreated(CoreModule.c.x2.v3(i3())).subscribe(mkd0.H(new e30() { // from class: l.ujz
            public final void call(Object obj) {
                this.f20680a.m25142gg((AnalysisGuide) obj);
            }
        }, new e30() { // from class: l.vjz
            public final void call(Object obj) {
                wmz.m24956w9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K6 */
    public void m25027K6(IceBreakingQuestion iceBreakingQuestion) {
        if (NullChecker.a(this.f21839J0)) {
            this.f21839J0.D0(iceBreakingQuestion);
        }
    }

    /* JADX INFO: renamed from: Kc */
    public final void m25028Kc() {
        m24983Bg();
        if (this.f21851V0) {
            return;
        }
        this.f21851V0 = true;
        lifecycle().filter(new w9j() { // from class: l.okz
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.m);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.pkz
            public final void call(Object obj) {
                this.f17464a.m25182oe((c) obj);
            }
        }, new e30() { // from class: l.qkz
            public final void call(Object obj) {
                wmz.m24880fc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.x3().skip(1)).subscribe(mkd0.H(new e30() { // from class: l.rkz
            public final void call(Object obj) {
                this.f18589a.m25187pe((List) obj);
            }
        }, new e30() { // from class: l.tkz
            public final void call(Object obj) {
                wmz.m24970z8((Throwable) obj);
            }
        }));
        duringCreated(T2().skip(1)).subscribe(mkd0.H(new e30() { // from class: l.ukz
            public final void call(Object obj) {
                this.f20692a.m25193qe((Conversation) obj);
            }
        }, new e30() { // from class: l.vkz
            public final void call(Object obj) {
                wmz.m24808S7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Kd */
    public final /* synthetic */ void m25029Kd() {
        if (((jq2) this).viewModel.Z3()) {
            return;
        }
        ((fcz) this).G.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Ke */
    public final /* synthetic */ void m25030Ke(Conversation conversation) {
        if (!mqi0.D(CoreModule.c.r2.m0)) {
            ij8 ij8Var = CoreModule.c.r2;
            ij8Var.l0 = 0;
            ij8Var.k0.clear();
        }
        if (CoreModule.c.r2.k0.contains(m25196r3())) {
            return;
        }
        CoreModule.c.r2.k0.add(m25196r3());
        ij8 ij8Var2 = CoreModule.c.r2;
        ij8Var2.l0++;
        ij8Var2.m0 = mqi0.o();
    }

    /* JADX INFO: renamed from: Kf */
    public final /* synthetic */ void m25031Kf(Bundle bundle) {
        e51.H(((jq2) this).viewModel.a0(), new Runnable() { // from class: l.hhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f12042a.m25025Jf();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: Kg */
    public void m25032Kg() {
        ArrayList arrayList = new ArrayList();
        if (this.f21855Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        duringCreated(CoreModule.c.e0.j7(i3(), "", arrayList).take(1)).subscribe(mkd0.H(new e30() { // from class: l.qjz
            public final void call(Object obj) {
                this.f18016a.m25146hg((List) obj);
            }
        }, new e30() { // from class: l.rjz
            public final void call(Object obj) {
                this.f18569a.m25151ig((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Lc */
    public final void m25033Lc() {
        if (CoreModule.P().i().O8()) {
            duringCreated(CoreModule.c.e0.Oa(((fcz) this).b)).subscribe(mkd0.H(new e30() { // from class: l.wkz
                public final void call(Object obj) {
                    wmz.m24898jb((roj0) obj);
                }
            }, new e30() { // from class: l.xkz
                public final void call(Object obj) {
                    wmz.m24902ka((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ld */
    public final /* synthetic */ void m25034Ld(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Le */
    public final /* synthetic */ void m25035Le(List list) {
        mtm.n().k(((fcz) this).k, (Message) null, m25218vc());
    }

    /* JADX INFO: renamed from: Lf */
    public final /* synthetic */ void m25036Lf(roj0 roj0Var) {
        ((tqz) ((jq2) this).viewModel).t1.k();
    }

    /* JADX INFO: renamed from: Lg */
    public final void m25037Lg(final boolean z) {
        if (CoreModule.P().i().P0()) {
            CoreModule.P().i().e5(act(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.jiz
                public final void call() {
                    this.f13802a.m25161kg(z);
                }
            }, new d30() { // from class: l.kiz
                public final void call() {
                    this.f14353a.m25169lg();
                }
            });
        } else {
            m25148ic(z, new e30() { // from class: l.liz
                public final void call(Object obj) {
                    this.f14885a.m25174mg((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m25038M2(final PutongAct putongAct) {
        super.M2(putongAct);
        if (this.f21864i1) {
            putongAct.postDelayed(new Runnable() { // from class: l.khz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m24951va(putongAct);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: Md */
    public final /* synthetic */ void m25039Md(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Me */
    public final /* synthetic */ void m25040Me(roj0 roj0Var) {
        ((jq2) this).viewModel.j5("test", "他近期發佈過疑似廣告信息，聊天請謹慎");
    }

    /* JADX INFO: renamed from: Mf */
    public final /* synthetic */ void m25041Mf(Message message) {
        if (message.isMe()) {
            m25191qc(message);
        }
    }

    /* JADX INFO: renamed from: Mg */
    public void m25042Mg(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.v("warming up start");
        this.f21845P0 = true;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelR = MessageWarmingUpHelper.r(chatHeat.degree);
        if (warmingUpLevelR == null || warmingUpLevelR == MessageWarmingUpHelper.WarmingUpLevel.not) {
            this.f21845P0 = false;
            return;
        }
        if (chatHeat.levelUp) {
            warmingUpLevelR = warmingUpLevelR.pre();
        }
        Z6(warmingUpLevelR);
        a7(chatHeat.degree);
        m24741Ed(warmingUpLevelR);
        e51.H(act(), new Runnable() { // from class: l.jhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f13779a.m25179ng(chatHeat);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Nc */
    public final void m25043Nc() {
        if (y19.T()) {
            creates(new e30() { // from class: l.xdz
                public final void call(Object obj) {
                    wmz.m24964y7((Bundle) obj);
                }
            }, new d30() { // from class: l.ydz
                public final void call() {
                    this.f22817a.m25210te();
                }
            });
            duringCreated(rx.c.combineLatest(m25202s3(m25196r3()), U2(), new gm20()).first().filter(new w9j() { // from class: l.zdz
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(!((User) j760Var.a).isTeamAccount() && TextUtils.equals("default", ((Conversation) j760Var.b).convType));
                }
            })).observeOn(Schedulers.io()).subscribe(mkd0.H(new e30() { // from class: l.aez
                public final void call(Object obj) {
                    j760 j760Var = (j760) obj;
                    CoreModule.c.f0.Be((User) j760Var.a, (Conversation) j760Var.b);
                }
            }, new e30() { // from class: l.bez
                public final void call(Object obj) {
                    wmz.m24807Rb((Throwable) obj);
                }
            }));
            final dd80[] dd80VarArr = new dd80[1];
            duringCreated(rx.c.combineLatest(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.B0.j4().distinctUntilChanged(), U2(), CoreModule.c.e0.o9().distinctUntilChanged(), new z9j() { // from class: l.cez
                /* JADX INFO: renamed from: b */
                public final Object m10958b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new knb0((User) obj, (VerificationCenter) obj2, (Conversation) obj3, (User) obj4);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.dez
                public final void call(Object obj) {
                    this.f9191a.m25219ve(dd80VarArr, (knb0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Nd */
    public final /* synthetic */ void m25044Nd() {
        if (this.f21865j1 != null) {
            this.f21865j1 = null;
            ((jq2) this).viewModel.g2();
            return;
        }
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        this.f21865j1 = userLiveLabel;
        userLiveLabel.buttonTitle = "进入直播间";
        userLiveLabel.userId = m25196r3();
        this.f21865j1.mainTitle = CoreModule.c.e0.Pa(m25196r3()).isFemale() ? "她正在视频直播" : "他正在视频直播";
        this.f21865j1.subTitle = "多人连线已开启，等你加入";
        ((jq2) this).viewModel.g2();
    }

    /* JADX INFO: renamed from: Ne */
    public final /* synthetic */ void m25045Ne(CoreData coreData) {
        if (NullChecker.a(coreData) && NullChecker.a(coreData.userRisk) && !TextUtils.isEmpty(coreData.userRisk.text)) {
            bpz bpzVar = ((jq2) this).viewModel;
            RiskOtherData riskOtherData = coreData.userRisk;
            bpzVar.j5(riskOtherData.type, riskOtherData.text);
        }
    }

    /* JADX INFO: renamed from: Nf */
    public final /* synthetic */ Boolean m25046Nf(Conversation conversation) {
        return Boolean.valueOf(conversation.mm >= this.f21859d1 && CoreModule.P().a().un());
    }

    /* JADX INFO: renamed from: Ng */
    public final void m25047Ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.v("tempDownAnim = " + chatHeat.toJson());
        e51.y(new Runnable() { // from class: l.ijz
            @Override // java.lang.Runnable
            public final void run() {
                this.f13281a.m25189pg(chatHeat);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m25048Oc() {
        duringCreated(((fcz) this).G).subscribe(mkd0.G(new e30() { // from class: l.ddz
            public final void call(Object obj) {
                this.f9181a.m25230xe(obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.edz
            public final void call(Object obj) {
                this.f9688a.m25236ye((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Od */
    public final /* synthetic */ void m25049Od() {
        ((jq2) this).viewModel.p5(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: Oe */
    public final /* synthetic */ void m25050Oe(xaj0 xaj0Var) {
        CoreModule.c.f0.hh(m25196r3());
    }

    /* JADX INFO: renamed from: Of */
    public final /* synthetic */ void m25051Of(Questionnaire questionnaire) {
        if (questionnaire != null && CoreModule.P().a().un()) {
            this.f21860e1.put(Boolean.TRUE);
            CoreModule.c.u2.V.put(Long.valueOf(mqi0.o()));
            CoreModule.c.u2.W.a(1);
            CoreModule.c.f0.nh(((fcz) this).c, questionnaire);
        }
    }

    /* JADX INFO: renamed from: Og */
    public final void m25052Og(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final ChatHeat chatHeat) {
        MessageWarmingUpHelper.v("tempUpAnim start fromLevel = " + warmingUpLevel + " nextLevel = " + warmingUpLevel2 + " chatHeat = " + chatHeat.toJson());
        duringCreated(CoreModule.c.M1.A3(((fcz) this).b).take(1)).subscribe(mkd0.H(new e30() { // from class: l.fjz
            public final void call(Object obj) {
                this.f10429a.m25195qg(chatHeat, warmingUpLevel, warmingUpLevel2, (roj0) obj);
            }
        }, new e30() { // from class: l.gjz
            public final void call(Object obj) {
                this.f11480a.m25201rg((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Pc */
    public final void m25053Pc() {
        if (CoreModule.P().i().k5()) {
            duringCreated(CoreModule.c.e0.Na(((fcz) this).b)).subscribe(mkd0.H(new e30() { // from class: l.hlz
                public final void call(Object obj) {
                    wmz.m24760Ia((roj0) obj);
                }
            }, new e30() { // from class: l.ilz
                public final void call(Object obj) {
                    wmz.m24724Ba((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Pd */
    public final /* synthetic */ void m25054Pd() {
        CoreModule.c.b1.S.put(Boolean.FALSE);
        ((jq2) this).viewModel.r5();
    }

    /* JADX INFO: renamed from: Pe */
    public final /* synthetic */ void m25055Pe(xaj0 xaj0Var) {
        CoreModule.c.f0.hh(m25196r3());
    }

    /* JADX INFO: renamed from: Pf */
    public final /* synthetic */ Boolean m25056Pf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.e((User) xaj0Var.a) && bh0.d(((fcz) this).k) && !((Boolean) xaj0Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: Pg */
    public final void m25057Pg() {
        if (TextUtils.isEmpty(m25196r3()) || !TextUtils.equals(m25196r3(), CoreModule.l.i().h())) {
            return;
        }
        CoreModule.l.i().I3(i3());
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean m25058Q2(Message message, boolean z, Sticker sticker) {
        return super.Q2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Qc */
    public final void m25059Qc() {
        CoreModule.c.f0.Pf(((fcz) this).c, "local_heart_beat_lock_tip");
        if (y19.O()) {
            hpd0 hpd0Var = new hpd0("heart_beat_lock_message_showed_" + CoreModule.H().userId() + "/" + m25196r3(), Boolean.FALSE);
            if (NullChecker.a(((fcz) this).k) && ((fcz) this).k.isHeartbeatConv() && !((fcz) this).k.isLimitMatch() && ((fcz) this).k.isHeartBeatLock() && !((Boolean) hpd0Var.get()).booleanValue()) {
                hpd0Var.put(Boolean.TRUE);
                CoreModule.c.f0.bh(((fcz) this).c, MessageType.get("local_heart_beat_lock_tip"), "本次聊天需要消耗1次心动次数", (e30) null);
            }
        }
    }

    /* JADX INFO: renamed from: Qd */
    public final /* synthetic */ void m25060Qd() {
        CoreModule.c.f0.hh(m25196r3());
    }

    /* JADX INFO: renamed from: Qe */
    public final /* synthetic */ void m25061Qe(Integer num, Boolean bool, Message message) {
        if (num.intValue() == 100 && bool.booleanValue()) {
            ((jq2) this).viewModel.d2();
        }
        if (bool.booleanValue()) {
            ((jq2) this).viewModel.B1();
        }
        if (NullChecker.a(message) && NullChecker.a(((fcz) this).k) && ((fcz) this).k.hasLocalBreakIce) {
            CoreModule.c.J1.g5(((fcz) this).c);
        }
    }

    /* JADX INFO: renamed from: Qf */
    public final /* synthetic */ void m25062Qf(xaj0 xaj0Var) {
        final boolean z;
        final int i;
        Optional optional = (Optional) xaj0Var.c;
        boolean z2 = false;
        if (optional.isPresent()) {
            Visitor visitor = (Visitor) optional.get();
            i = visitor.visitCount;
            z = visitor.hidden;
        } else {
            z = false;
            i = 0;
        }
        int iHs = CoreModule.P().e().Hs();
        int iSe = CoreModule.P().e().Se();
        boolean z3 = i >= CoreModule.P().e().Fj();
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills;
        boolean z4 = mqi0.D(((long) conversationCounterTypeSp.get(((fcz) this).c)) * 1000) && ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(((fcz) this).c) >= iSe;
        if (mqi0.D(((Long) CoreModule.c.n2.a0.get()).longValue()) && ((Integer) CoreModule.c.n2.b0.get()).intValue() >= iHs) {
            z2 = true;
        }
        if (xma.F3() || z || !z3 || z2 || z4) {
            return;
        }
        CoreModule.c.f0.bh(((fcz) this).c, MessageType.get("local_visitor_hide_footprint"), "local_visitor_hide_footprint", new e30() { // from class: l.qiz
            public final void call(Object obj) {
                wmz.m24762J7(i, z, (Message) obj);
            }
        });
        if (mqi0.D(((Long) CoreModule.c.n2.a0.get()).longValue())) {
            CoreModule.c.n2.b0.a(1);
        } else {
            CoreModule.c.n2.b0.put(1);
        }
        CoreModule.c.n2.a0.put(Long.valueOf(mqi0.o()));
        if (mqi0.D(((long) conversationCounterTypeSp.get(m25196r3())) * 1000)) {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(m25196r3());
        } else {
            ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(m25196r3(), 1);
        }
        conversationCounterTypeSp.set(m25196r3(), (int) (mqi0.o() / 1000));
    }

    /* JADX INFO: renamed from: Qg */
    public final void m25063Qg(Conversation conversation, q860<Message> q860Var) {
        if (vwb.J(q860Var.a)) {
            return;
        }
        Message message = (Message) q860Var.a.get(0);
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) && q860Var.a.size() >= 2 && TEnum.equals(((Message) q860Var.a.get(1)).messageType, MessageType.get("sticker"))) {
            message = (Message) q860Var.a.get(1);
        }
        if (!TEnum.equals(message.messageType, MessageType.get("sticker")) || this.f21849T0.a(((DbObject) message).id)) {
            return;
        }
        if ((TextUtils.isEmpty(conversation.readUntil) || conversation.readUntil.compareTo(((DbObject) message).id) >= 0 || message.isMe()) && (!message.isMe() || ((DbObject) message).id.contains("fake_id_") || mqi0.o() - message.createdTime >= 4000.0d)) {
            return;
        }
        this.f21849T0.b(((DbObject) message).id);
        Sticker stickerS3 = CoreModule.c.Z.s3(message.sticker);
        if (NullChecker.a(stickerS3) && TEnum.equals(stickerS3.source, "poke")) {
            String strO = MessageWarmingUpHelper.o(stickerS3);
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            t7().b5(message, strO, stickerS3);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m25064R2(Message message, boolean z, Sticker sticker) {
        if (NullChecker.a(m25218vc()) && m25218vc().unilateralBlock() && !Network.isConnected(act())) {
            lsi0.n(R.string.B2);
        }
        return super.R2(message, z, sticker);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m25065Rc() {
        if (y19.O() && NullChecker.a(((fcz) this).k) && ((fcz) this).k.isHeartbeatConv() && ((fcz) this).k.isHeartBeatLock()) {
            return;
        }
        if ((NullChecker.a(((fcz) this).k) && ((fcz) this).k.isLimitMatch()) || !TextUtils.equals(act().getIntent().getStringExtra("heartbeat_consume_type"), "quickchat") || TextUtils.equals((CharSequence) CoreModule.c.e0.d3.get(), mqi0.t())) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.mgz
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.ngz
            public final void call(Object obj) {
                this.f16031a.m24976Ae((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Rd */
    public final /* synthetic */ void m25066Rd() {
        CoreModule.c.f0.Wg(m25196r3(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: Re */
    public final /* synthetic */ void m25067Re(Boolean bool) {
        e0().A0().o2();
        if (bool.booleanValue()) {
            ((jq2) this).viewModel.z0();
            ((jq2) this).viewModel.R3();
        }
    }

    /* JADX INFO: renamed from: Rf */
    public final /* synthetic */ void m25068Rf(Integer num) {
        if (!tqm0.p().q()) {
            dqy dqyVarU0 = e0().A0().g0().u0();
            if (NullChecker.a(dqyVarU0) && dqyVarU0.d0()) {
                dqyVarU0.I(true);
            }
        }
        if (TextUtils.equals(tqm0.p().m(), m25196r3())) {
            ((jq2) this).viewModel.y5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: Rg */
    public void m25069Rg(boolean z) {
        e51.J(this.f21870o1);
        if (z && m25180oc()) {
            e51.H(act(), this.f21870o1, ((long) m25018Id()) * 1000);
        }
    }

    /* JADX INFO: renamed from: S2 */
    public boolean m25070S2(Message message, boolean z, Sticker sticker) {
        Message message2;
        User userM25218vc = m25218vc();
        String strM20755c = pxz.m20755c();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (NullChecker.a(userM25218vc) && userM25218vc.unilateralBlock()) {
            if (Network.isConnected(act())) {
                if (NullChecker.a(userM25218vc) && userM25218vc.onlineMatch() && userM25218vc.onlineMatchLocked()) {
                    lsi0.h(userM25218vc.isFemale() ? R.string.K5 : R.string.L5);
                } else {
                    lsi0.h(R.string.p5);
                }
                if (NullChecker.a(userM25218vc)) {
                    message2 = message;
                    pxz.m20759g(message2, strM20755c, "lift_match", ((DbObject) userM25218vc).id, 0, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            } else {
                lsi0.n(R.string.B2);
            }
            message2 = message;
        } else {
            message2 = message;
        }
        return super.S2(message2, z, sticker);
    }

    /* JADX INFO: renamed from: Sd */
    public final /* synthetic */ void m25071Sd() {
        int iHs = CoreModule.P().e().Hs();
        int iSe = CoreModule.P().e().Se();
        int iFj = CoreModule.P().e().Fj();
        long j = ((long) ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.get(((fcz) this).c)) * 1000;
        long j2 = ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.get(((fcz) this).c);
        if (!mqi0.D(j)) {
            j2 = 0;
        }
        lsi0.y("每天最多展示总次数（可配置）：" + iHs + "\n同一会话每天最多展示次数（可配置）：" + iSe + "\n同一会话最少访问次数（可配置）：" + iFj + "\n当前会话上次访问时间：" + mqi0.f.format(new Date(j)) + "\n当前会话已经访问次数：" + j2 + "\n每天已经展示过的总次数：" + (mqi0.D(((Long) CoreModule.c.n2.a0.get()).longValue()) ? ((Integer) CoreModule.c.n2.b0.get()).intValue() : 0L));
    }

    /* JADX INFO: renamed from: Se */
    public final /* synthetic */ void m25072Se(User user) {
        boolean zUnilateralBlock = user.unilateralBlock();
        bpz bpzVar = ((jq2) this).viewModel;
        if (zUnilateralBlock) {
            bpzVar.w0();
        } else {
            bpzVar.R3();
        }
    }

    /* JADX INFO: renamed from: Sf */
    public final /* synthetic */ void m25073Sf(Integer num) {
        if (TextUtils.equals(tqm0.p().m(), m25196r3()) || tqm0.p().q()) {
            ((jq2) this).viewModel.e5(tqm0.p().l(), num.intValue());
        }
    }

    /* JADX INFO: renamed from: Sg */
    public final void m25074Sg(Message message) {
        if (TEnum.equals(message.messageType, "exchange_picture") && NullChecker.a(message.additionalData)) {
            ExchangePicture exchangePicture = message.additionalData.exchangePicture;
            if (NullChecker.a(exchangePicture) && exchangePicture.exchangeType == ExchangePicture.BACK_MESSAGE && !TextUtils.isEmpty(exchangePicture.launchMessageId) && TextUtils.equals(exchangePicture.status, ExchangePicture.finished)) {
                CoreModule.c.f0.xq(exchangePicture.launchMessageId);
            }
        }
    }

    /* JADX INFO: renamed from: Tc */
    public final void m25075Tc() {
        this.f21861f1.add(new axa0(((jq2) this).viewModel, this));
        this.f21861f1.add(new dxa0(((jq2) this).viewModel, this));
        this.f21861f1.add(new m5f(((jq2) this).viewModel));
        this.f21861f1.add(new zii0(((jq2) this).viewModel, this));
        this.f21861f1.add(new oxe(((jq2) this).viewModel, this));
        this.f21861f1.add(new kxe(((jq2) this).viewModel, this));
        this.f21861f1.add(new kyb0(((jq2) this).viewModel, this));
    }

    /* JADX INFO: renamed from: Td */
    public final /* synthetic */ void m25076Td() {
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintShowCount.set(m25196r3(), 0);
        ConversationCounterTypeSp.oDiamondVisitorHideFootPrintLastCloseMills.set(((fcz) this).c, 0);
        CoreModule.c.n2.a0.put(0L);
        CoreModule.c.n2.b0.put(0);
        lsi0.y("已重置");
    }

    /* JADX INFO: renamed from: Te */
    public final /* synthetic */ void m25077Te(dd80 dd80Var, Boolean bool) {
        dd80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: Tf */
    public final /* synthetic */ void m25078Tf() {
        this.f21842M0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Tg */
    public int m25079Tg() {
        return this.f21859d1;
    }

    /* JADX INFO: renamed from: Ud */
    public final /* synthetic */ void m25080Ud(xaj0 xaj0Var) {
        if (((Boolean) xaj0Var.a).booleanValue()) {
            Conversation conversation = (Conversation) xaj0Var.b;
            if (conversation.mm == 0 && TextUtils.equals("default", conversation.convType) && TEnum.equals(conversation.status, "default")) {
                User userW5 = W5();
                User user = (User) xaj0Var.c;
                if (userW5.isFemale() || a4(user) || a4(userW5) || user.isTeamAccount()) {
                    return;
                }
                CoreModule.c.f0.w1.put(Long.valueOf(mqi0.o()));
                CoreModule.c.f0.dh(m25196r3(), MessageType.get("local_friend_active_remind_female"));
            }
        }
    }

    /* JADX INFO: renamed from: Ue */
    public final /* synthetic */ void m25081Ue(boolean z, final dd80 dd80Var) {
        m25148ic(z, new e30() { // from class: l.aiz
            public final void call(Object obj) {
                this.f7654a.m25077Te(dd80Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Uf */
    public final /* synthetic */ Boolean m25082Uf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.e((User) xaj0Var.a) && bh0.d(((fcz) this).k) && !((Boolean) xaj0Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: Ug */
    public hpd0 m25083Ug() {
        return this.f21860e1;
    }

    /* JADX INFO: renamed from: V2 */
    public boolean m25084V2() {
        if (CoreModule.P().i().u() && NullChecker.a(((fcz) this).k) && (((fcz) this).k.isHeartbeatConv() || ((fcz) this).k.isSeeUpgradedConv())) {
            return false;
        }
        if (NullChecker.a(((fcz) this).k) && ((((fcz) this).k.isFakeHeartbeatConv() || ((fcz) this).k.isFakeQuickChatConv()) && (CoreModule.c.e0.Z7() || CoreModule.c.e0.p9().isRiskAuditAvatar()))) {
            return false;
        }
        return !User.isTeamAccount(m25196r3());
    }

    /* JADX INFO: renamed from: Vc */
    public final void m25085Vc() {
        if (!CoreModule.P().a().f4() || User.isTeamAccount(((fcz) this).b)) {
            return;
        }
        q5k0.g().k(m25196r3());
        duringCreated(CoreModule.c.e0.Ka(((fcz) this).b).filter(new w9j() { // from class: l.vdz
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).onlineMatchLocked());
            }
        }).switchMap(new w9j() { // from class: l.gez
            public final Object call(Object obj) {
                return this.f11392a.m25024Je((User) obj);
            }
        }).filter(new w9j() { // from class: l.rez
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).take(1)).subscribe(mkd0.H(new e30() { // from class: l.cfz
            public final void call(Object obj) {
                this.f8656a.m25030Ke((Conversation) obj);
            }
        }, new e30() { // from class: l.nfz
            public final void call(Object obj) {
                wmz.m24860bc((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.b0).subscribe(mkd0.G(new e30() { // from class: l.yfz
            public final void call(Object obj) {
                wmz.m24930r9((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Vd */
    public final /* synthetic */ void m25086Vd(User user) {
        String strO3 = CoreModule.c.t0.o3();
        Settings settings = user.settings;
        String str = (settings == null || settings.getSettingGroup() == null || user.settings.getSettingGroup().tttribe == null) ? "" : user.settings.getSettingGroup().tttribe.transLang;
        if (TextUtils.isEmpty(strO3) || TextUtils.equals(strO3, str)) {
            return;
        }
        zvf0.x("e_intl_ai_translate_bubble", "p_chat_view");
        ((jq2) this).viewModel.e2();
        CoreModule.c.t0.q3();
    }

    /* JADX INFO: renamed from: Ve */
    public final /* synthetic */ void m25087Ve(boolean[] zArr, PurchaseType purchaseType, Act act, String str) {
        zArr[0] = true;
        m25037Lg(false);
    }

    /* JADX INFO: renamed from: Vf */
    public final /* synthetic */ void m25088Vf(xaj0 xaj0Var) {
        if (m25014Hg()) {
            CoreModule.c.f0.bh(((fcz) this).c, MessageType.get("local_wechat_notify_guide"), "wechat_notify_guide", (e30) null);
            this.f21869n1 = true;
            if (mqi0.D(((Long) CoreModule.c.e0.n5.get()).longValue())) {
                CoreModule.c.e0.p5.a(1);
            } else {
                CoreModule.c.e0.p5.put(1);
            }
            CoreModule.c.e0.n5.put(Long.valueOf(mqi0.o()));
            CoreModule.c.e0.o5.a(1);
            ConversationCounterTypeSp.wechatNotifyGuideShowCount.set(((fcz) this).c, 1);
            zvf0.x("e_open_wechat_notification", pageId());
        }
    }

    /* JADX INFO: renamed from: Wd */
    public final /* synthetic */ void m25089Wd(c cVar) {
        if (cVar == c.i) {
            e51.H(act(), this.f21867l1, 10L);
            if (!User.isLiveServiceAccount(m25196r3())) {
                m24988Cg();
                ((jq2) this).viewModel.g2();
            }
        } else if (cVar == c.j) {
            e51.J(this.f21867l1);
        }
        if ((cVar == c.f || cVar == c.k) && NullChecker.a(m25196r3()) && !k4(m25196r3())) {
            s7(true);
        }
    }

    /* JADX INFO: renamed from: We */
    public final /* synthetic */ void m25090We(boolean[] zArr) {
        if (zArr[0]) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: Wf */
    public final /* synthetic */ void m25091Wf(j760 j760Var) {
        WechatNotifySetting wechatNotifySetting = (WechatNotifySetting) j760Var.a;
        if (Boolean.TRUE.equals(j760Var.b) && wechatNotifySetting == null) {
            CoreModule.c.f0.Pf(((fcz) this).c, "local_wechat_notify_guide");
        }
    }

    /* JADX INFO: renamed from: Xc */
    public final void m25092Xc() {
        if (y19.e()) {
            if (NullChecker.a(CoreModule.c.t2.R) && ((Boolean) CoreModule.c.t2.R.get()).booleanValue()) {
                duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.nmz
                    public final void call(Object obj) {
                        this.f16110a.m25040Me((roj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.c.t2.k3(m25196r3(), "messageDetail", "user")).subscribe(mkd0.H(new e30() { // from class: l.omz
                    public final void call(Object obj) {
                        this.f16723a.m25045Ne((CoreData) obj);
                    }
                }, new e30() { // from class: l.pmz
                    public final void call(Object obj) {
                        wmz.m24874eb((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Xd */
    public final /* synthetic */ void m25093Xd(User user) {
        ((jq2) this).viewModel.c5(user);
    }

    /* JADX INFO: renamed from: Xe */
    public final /* synthetic */ void m25094Xe(boolean[] zArr, dd80 dd80Var, Boolean bool) {
        zArr[0] = true;
        dd80Var.dismiss();
        if (bool.booleanValue()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: Xf */
    public final /* synthetic */ void m25095Xf() {
        ((jq2) this).viewModel.C1();
    }

    /* JADX INFO: renamed from: Y2 */
    public boolean m25096Y2() {
        return ruy.g().i(m25218vc(), ((fcz) this).i) && NullChecker.a(((fcz) this).k) && TEnum.equals(((fcz) this).k.property.chatInterrupt.stage, "locked");
    }

    /* JADX INFO: renamed from: Yc */
    public void m25097Yc() {
        if (NullChecker.a(((fcz) this).k) && ((fcz) this).k.isLimitMatch()) {
            ((jq2) this).viewModel.a0().duringCreated(U2().filter(new w9j() { // from class: l.ogz
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(NullChecker.a(conversation) && conversation.isLimitMatch() && conversation.unreadMessages > 0);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.pgz
                public final void call(Object obj) {
                    e51.y(new Runnable() { // from class: l.ihz
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.c.U.a(new d30() { // from class: l.ejz
                                public final void call() {
                                    wmz.m24721B7(conversation);
                                }
                            });
                        }
                    });
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Yd */
    public final /* synthetic */ void m25098Yd(j760 j760Var) {
        ((jq2) this).viewModel.U1();
        ((jq2) this).viewModel.M1();
        m25111b3((User) ((fcz) this).j);
        ((tqz) ((jq2) this).viewModel).t1.j();
        ((jq2) this).viewModel.D0();
        CoreModule.P().i().C0();
        CoreModule.P().i().p2();
    }

    /* JADX INFO: renamed from: Ye */
    public final /* synthetic */ void m25099Ye(boolean z, final boolean[] zArr, final dd80 dd80Var) {
        m25148ic(z, new e30() { // from class: l.bjz
            public final void call(Object obj) {
                this.f8189a.m25094Xe(zArr, dd80Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Yf */
    public final /* synthetic */ void m25100Yf(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.c.e0.Pa(m25196r3()).unilateralBlock()) {
            CoreModule.c.e0.Ba(m25196r3());
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m25101Z() {
        super.Z();
        this.f21866k1 = act().getIntent().getStringExtra("autoSendMessage");
        if (!TextUtils.isEmpty(m25196r3())) {
            CoreModule.c.b1.f3(m25196r3());
        }
        if (!TextUtils.isEmpty(this.f21866k1)) {
            N6(this.f21866k1);
        }
        qvy qvyVar = new qvy(this);
        this.f21839J0 = qvyVar;
        qvyVar.Z();
        m25075Tc();
        if (y19.J()) {
            ConversationCounterTypeSp.ProloguesEnterChatCount.set(m25196r3());
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public ArrayList<j760<String, d30>> m25102Z2() {
        ArrayList<j760<String, d30>> arrayListZ2 = super.Z2();
        if (CoreModule.l.i().b()) {
            arrayListZ2.add(vwb.Y("zb直播状态DEBUG", new d30() { // from class: l.pfz
                public final void call() {
                    this.f17258a.m25044Nd();
                }
            }));
        }
        arrayListZ2.add(vwb.Y("探探认证气泡", new d30() { // from class: l.qfz
            public final void call() {
                this.f17973a.m25049Od();
            }
        }));
        if (CoreModule.l.i().D()) {
            arrayListZ2.add(vwb.Y("拍一拍蒙层引导", new d30() { // from class: l.rfz
                public final void call() {
                    this.f18500a.m25054Pd();
                }
            }));
            arrayListZ2.add(vwb.Y("功能引导“拍一拍”", new d30() { // from class: l.sfz
                public final void call() {
                    wmz.m24903kb();
                }
            }));
        }
        arrayListZ2.add(vwb.Y("插入认证引导消息", new d30() { // from class: l.tfz
            public final void call() {
                this.f20223a.m25060Qd();
            }
        }));
        arrayListZ2.add(vwb.Y("插入盲盒引导消息", new d30() { // from class: l.ufz
            public final void call() {
                this.f20627a.m25066Rd();
            }
        }));
        arrayListZ2.add(vwb.Y("访客'隐藏访问足迹'统计次数", new d30() { // from class: l.vfz
            public final void call() {
                this.f21114a.m25071Sd();
            }
        }));
        arrayListZ2.add(vwb.Y("访客'隐藏访问足迹'重置", new d30() { // from class: l.wfz
            public final void call() {
                this.f21723a.m25076Td();
            }
        }));
        arrayListZ2.add(vwb.Y("插入游戏CP消息 自己", new C0885c()));
        arrayListZ2.add(vwb.Y("插入游戏CP消息 对方", new C0886d()));
        return arrayListZ2;
    }

    /* JADX INFO: renamed from: Zc */
    public final void m25103Zc() {
        if (jjb0.b() && NullChecker.a(((fcz) this).k) && TextUtils.equals(((fcz) this).k.convType, "default") && !CertificationUtil.l()) {
            duringCreated(mkd0.s(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_pic_cert_guide")), CoreModule.c.f0.iq(m25196r3()), new y9j() { // from class: l.sez
                /* JADX INFO: renamed from: a */
                public final Object m22411a(Object obj, Object obj2, Object obj3) {
                    return xaj0.a((User) obj, (Boolean) obj2, (List) obj3);
                }
            }).first().filter(new w9j() { // from class: l.tez
                public final Object call(Object obj) {
                    return wmz.m24873ea((xaj0) obj);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.uez
                public final void call(Object obj) {
                    this.f20605a.m25050Oe((xaj0) obj);
                }
            }));
            duringCreated(mkd0.s(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_pic_cert_guide")), CoreModule.c.f0.oo(), new y9j() { // from class: l.vez
                /* JADX INFO: renamed from: a */
                public final Object m23932a(Object obj, Object obj2, Object obj3) {
                    return xaj0.a((User) obj, (Boolean) obj2, (Message) obj3);
                }
            }).filter(new w9j() { // from class: l.wez
                public final Object call(Object obj) {
                    return wmz.m24834Wb((xaj0) obj);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.xez
                public final void call(Object obj) {
                    this.f22251a.m25055Pe((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final /* synthetic */ void m25104Zd(User user) {
        if (CoreModule.c.f0.co(m25227x6(), ((fcz) this).k)) {
            CoreModule.c.f0.Vg(i3());
        }
    }

    /* JADX INFO: renamed from: Ze */
    public final /* synthetic */ void m25105Ze(final boolean z, final boolean[] zArr, PurchaseType purchaseType) {
        ((jq2) this).viewModel.m5(new e30() { // from class: l.giz
            public final void call(Object obj) {
                this.f11459a.m25099Ye(z, zArr, (dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zf */
    public final /* synthetic */ void m25106Zf() {
        CoreModule.l.i().s1(m25196r3());
        CoreModule.c.e0.W9(m25196r3()).subscribe(mkd0.H(new e30() { // from class: l.ohz
            public final void call(Object obj) {
                wmz.m24790O9((roj0) obj);
            }
        }, new e30() { // from class: l.phz
            public final void call(Object obj) {
                this.f17380a.m25100Yf((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void mo17829a0() {
        super.a0();
        m25028Kc();
        m25171md();
        m25143hd();
        m25134fd();
        U3();
        m24984Cc();
        m25176nd();
        m25234yc();
        m25124dd();
        m24985Cd();
        m25204sd();
        m25235yd();
        m25130ed();
        m25198rd();
        CoreModule.P().i().F3(act());
        m25057Pg();
        this.f21839J0.a0();
        m24998Fc();
        m25048Oc();
        m25022Jc();
        if (CoreModule.P().i().B()) {
            m24941td();
        }
        if (CoreModule.P().i().De()) {
            m24974Ac();
        }
        if (CoreModule.P().i().b5()) {
            m25139gd();
        }
        m24990Dd();
        m25170mc();
        m24813Sc();
        m25053Pc();
        m24979Bc();
        m24824Uc();
        m25241zc();
        m25107ad();
        m25229xd();
        m25004Gc();
        m25010Hc();
        m25113bd();
        m25033Lc();
        m25118cd();
        m25181od();
        m25065Rc();
        m25017Ic();
        m25149id();
        m25223wd();
        m24994Ec();
        m24782Mc();
        m25209tc();
        m25059Qc();
        m25103Zc();
        m25043Nc();
        m25158kd();
        m25153jd();
        m25097Yc();
        m25002Fg();
        m24980Bd();
        m24999Fd();
        m25092Xc();
        m24975Ad();
        m25085Vc();
        m25166ld();
        if (CoreModule.P().g().d9() && !xma.L3()) {
            m25214ud();
        }
        m25192qd();
        m24989Dc();
        m25222wc();
        m25228xc();
        if (IntlCountryCodeController.k()) {
            return;
        }
        m24835Wc();
    }

    /* JADX INFO: renamed from: ad */
    public void m25107ad() {
        if (CoreModule.P().b().Yg() && CoreModule.P().b().v6(((fcz) this).k)) {
            boolean zNl = CoreModule.P().b().nl(((fcz) this).k);
            if (zNl && CoreModule.P().b().xk()) {
                CoreModule.P().b().io(((fcz) this).k.mm, ((fcz) this).c);
            }
            CoreModule.P().b().Zf(this, ((fcz) this).b, ((fcz) this).c, zNl, CoreModule.P().b().Wr(((fcz) this).k), new g30() { // from class: l.jez
                /* JADX INFO: renamed from: a */
                public final void m15877a(Object obj, Object obj2, Object obj3) {
                    this.f13719a.m25061Qe((Integer) obj, (Boolean) obj2, (Message) obj3);
                }
            });
            duringCreated(CoreModule.c.J1.u5()).subscribe(mkd0.H(new e30() { // from class: l.kez
                public final void call(Object obj) {
                    this.f14305a.m25067Re((Boolean) obj);
                }
            }, new e30() { // from class: l.lez
                public final void call(Object obj) {
                    wmz.m24758I8((Throwable) obj);
                }
            }));
            if (CoreModule.P().b().Pe(((fcz) this).k)) {
                duringCreated(CoreModule.c.e0.Ka(((fcz) this).b)).filter(new w9j() { // from class: l.mez
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).isLoveBuzz());
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.nez
                    public final void call(Object obj) {
                        this.f15976a.m25072Se((User) obj);
                    }
                }, new e30() { // from class: l.oez
                    public final void call(Object obj) {
                        wmz.m24828Va((Throwable) obj);
                    }
                }));
            }
            if (NullChecker.a(((fcz) this).k)) {
                if (((fcz) this).k.hasLocalBreakIce) {
                    CoreModule.c.J1.g5(i3());
                }
                Conversation conversation = ((fcz) this).k;
                if (conversation.localHasMessage || conversation.userMessageCount != 0) {
                    return;
                }
                User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
                if (NullChecker.a(userPa)) {
                    CoreModule.c.J1.v5(i3(), CoreModule.P().b().Ls(2, userPa.gender));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ae */
    public final /* synthetic */ void m25108ae(Bundle bundle) {
        this.f21864i1 = mgh0.i(act().getIntent());
        e51.H(act(), new Runnable() { // from class: l.lhz
            @Override // java.lang.Runnable
            public final void run() {
                this.f14880a.m25242zd();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: af */
    public final /* synthetic */ void m25109af(boolean[] zArr, Boolean bool) {
        if (zArr[0]) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: ag */
    public final /* synthetic */ void m25110ag() {
        if (m25180oc()) {
            CoreModule.c.f0.Kf(i3());
            m25021Ig();
        }
    }

    /* JADX INFO: renamed from: b6 */
    public boolean m25112b6() {
        if (!CoreModule.P().i().U3()) {
            return false;
        }
        boolean z = NullChecker.a(this.f21848S0) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r(this.f21848S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
        if (z) {
            return z;
        }
        return NullChecker.a(((fcz) this).k) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r((double) ((fcz) this).k.mm).value >= MessageWarmingUpHelper.WarmingUpLevel.five.value;
    }

    /* JADX INFO: renamed from: bd */
    public final void m25113bd() {
        User userNa = CoreModule.c.e0.na();
        final boolean z = false;
        boolean z2 = NullChecker.a(userNa) && userNa.isFemale();
        boolean z3 = NullChecker.a(userNa) && userNa.isSVIP();
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        if (!z2 && NullChecker.a(((fcz) this).k) && TextUtils.equals(((fcz) this).k.convType, "quickchat") && CoreModule.P().i().c4(((fcz) this).k)) {
            CoreModule.c.C0.u4();
            if (CoreModule.P().i().F5() && CoreModule.P().i().d3()) {
                z = true;
            }
            if (CoreModule.P().i().C2()) {
                m25148ic(z, new e30() { // from class: l.yez
                    public final void call(Object obj) {
                        wmz.m24857b9((Boolean) obj);
                    }
                });
                return;
            }
            if (CoreModule.P().i().J2()) {
                if (CoreModule.P().i().b3() > 0) {
                    ((jq2) this).viewModel.m5(new e30() { // from class: l.zez
                        public final void call(Object obj) {
                            this.f23365a.m25081Ue(z, (dd80) obj);
                        }
                    });
                    return;
                }
                if (!z3) {
                    CoreModule.P().i().Lf(act(), "p_chat_view,e_quickchatbell_search,click", Privilege.online_match_tickets, new e30() { // from class: l.dfz
                        public final void call(Object obj) {
                            this.f9205a.m25105Ze(z, zArr2, (PurchaseType) obj);
                        }
                    }, new e30() { // from class: l.efz
                        public final void call(Object obj) {
                            this.f9738a.m25109af(zArr2, (Boolean) obj);
                        }
                    });
                } else if (z) {
                    m25037Lg(true);
                } else {
                    CoreModule.P().i().O3(act(), "p_chat_view,e_quickchatbell_search,click", new g30() { // from class: l.afz
                        /* JADX INFO: renamed from: a */
                        public final void m9613a(Object obj, Object obj2, Object obj3) {
                            this.f7542a.m25087Ve(zArr, (PurchaseType) obj, (Act) obj2, (String) obj3);
                        }
                    }, new d30() { // from class: l.bfz
                        public final void call() {
                            this.f8110a.m25090We(zArr);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: be */
    public final /* synthetic */ void m25114be(List list) {
        if (vwb.J(list) || list.size() < 2) {
            return;
        }
        this.f21856a1.put(Long.valueOf(mqi0.n()));
        CoreModule.c.f0.Yg(i3(), list);
    }

    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ Boolean m25115bf(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var.a) && ((Boolean) j760Var.a).booleanValue() && NullChecker.a(j760Var.b) && !((Boolean) j760Var.b).booleanValue() && !CoreModule.c.f0.Fg(((fcz) this).b));
    }

    /* JADX INFO: renamed from: bg */
    public final /* synthetic */ void m25116bg(Message message, roj0 roj0Var) {
        E6(((DbObject) message).id);
    }

    /* JADX INFO: renamed from: cd */
    public final void m25118cd() {
        User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
        if (!CoreModule.P().i().s5() || !NullChecker.a(userPa) || !userPa.isFemale() || !TEnum.equals(CoreModule.c.e0.p9().gender, "male") || ((Integer) CoreModule.c.e0.L2.get()).intValue() >= CoreModule.P().i().K5() || z19.a(((Long) CoreModule.c.e0.M2.get()).longValue()) < CoreModule.P().i().V4() || User.isTeamAccount(m25196r3()) || e4()) {
            return;
        }
        duringCreated(mkd0.r(CoreModule.c.f0.Mg(((fcz) this).b), CoreModule.c.f0.Ig(((fcz) this).b), new x9j() { // from class: l.ciz
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Boolean) obj, (Boolean) obj2);
            }
        })).distinctUntilChanged().observeOn(Schedulers.io()).filter(new w9j() { // from class: l.niz
            public final Object call(Object obj) {
                return this.f16069a.m25115bf((j760) obj);
            }
        }).first().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.yiz
            public final void call(Object obj) {
                this.f22913a.m25120cf((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ce */
    public final /* synthetic */ void m25119ce(AgeVerificationInfo ageVerificationInfo) {
        ((jq2) this).viewModel.B1();
    }

    /* JADX INFO: renamed from: cf */
    public final /* synthetic */ void m25120cf(j760 j760Var) {
        CoreModule.c.f0.jh(((fcz) this).b);
        CoreModule.c.e0.M2.put(Long.valueOf(mqi0.o()));
        CoreModule.c.e0.L2.a(1);
    }

    /* JADX INFO: renamed from: cg */
    public final /* synthetic */ void m25121cg(ChatHeat chatHeat, roj0 roj0Var) {
        MessageWarmingUpHelper.v("pokeAnimObs back");
        if (!chatHeat.levelUp) {
            m25047Ng(chatHeat);
            return;
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelL3 = l3();
        MessageWarmingUpHelper.WarmingUpLevel next = warmingUpLevelL3.next();
        if (NullChecker.a(next)) {
            m25052Og(warmingUpLevelL3, next, chatHeat);
        } else {
            this.f21845P0 = false;
        }
    }

    /* JADX INFO: renamed from: d3 */
    public void m25122d3() {
        super.d3();
        if (NullChecker.a(((fcz) this).k) && ((fcz) this).k.hasLocalBreakIce) {
            CoreModule.c.J1.g5(i3());
        }
        CoreModule.c.f0.Qf(i3(), m25217ug());
    }

    /* JADX INFO: renamed from: d6 */
    public boolean m25123d6() {
        if (CoreModule.P().i().O2()) {
            return (TextUtils.isEmpty(m25196r3()) || User.isTeamAccount(m25196r3()) || m25011Hd()) ? false : true;
        }
        if (!CoreModule.P().i().U3()) {
            return false;
        }
        boolean z = NullChecker.a(this.f21848S0) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r(this.f21848S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
        if (z) {
            return z;
        }
        return NullChecker.a(((fcz) this).k) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r((double) ((fcz) this).k.mm).value >= MessageWarmingUpHelper.WarmingUpLevel.four.value;
    }

    /* JADX INFO: renamed from: dd */
    public final void m25124dd() {
        if (!CoreModule.P().i().s4() || k4(m25196r3()) || User.isBusinessAI1V1(m25196r3())) {
            return;
        }
        CoreModule.c.C0.u4();
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("intlReadMessage"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.iez
            public final void call(Object obj) {
                this.f13189a.m25126df((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: de */
    public final /* synthetic */ Boolean m25125de(j760 j760Var) {
        if (User.isTeamAccount(m25196r3())) {
            return Boolean.FALSE;
        }
        User user = (User) j760Var.a;
        return (NullChecker.a(user) && !user.isFemale() && user.isVIP()) ? (Boolean) j760Var.b : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: df */
    public final /* synthetic */ void m25126df(UserPrivilege userPrivilege) {
        ((jq2) this).viewModel.B1();
    }

    /* JADX INFO: renamed from: dg */
    public final /* synthetic */ rx.c m25127dg(User user) {
        return CoreModule.c.f0.Ne(m25196r3());
    }

    /* JADX INFO: renamed from: e3 */
    public void m25128e3(Throwable th) {
        super.e3(th);
        User userW3 = w3(((fcz) this).c);
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.a(userW3) && userW3.onlineMatch()) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (CoreModule.P().i().i2(tantanForbidden)) {
                w3z.F(act(), m25227x6());
                return;
            }
            int i = tantanForbidden.subCode;
            if (i == 103 || i == 104 || i == 105) {
                lsi0.j(String.format("%s已经提前退出闪聊", userW3.isFemale() ? "她" : "他"));
                act().finish();
            } else if (i == 404) {
                lsi0.j(String.format("你已经对%s发出过喜欢了，请静待他的回应吧~", userW3.isFemale() ? "她" : "他"));
                act().finish();
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public boolean m25129e6() {
        if (CoreModule.P().i().O2()) {
            return (TextUtils.isEmpty(m25196r3()) || User.isTeamAccount(m25196r3())) ? false : true;
        }
        if (!CoreModule.P().i().U3()) {
            return false;
        }
        boolean z = NullChecker.a(this.f21848S0) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r(this.f21848S0.degree).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
        if (z) {
            return z;
        }
        return NullChecker.a(((fcz) this).k) && !TextUtils.isEmpty(m25196r3()) && !User.isTeamAccount(m25196r3()) && MessageWarmingUpHelper.r((double) ((fcz) this).k.mm).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value;
    }

    /* JADX INFO: renamed from: ed */
    public final void m25130ed() {
        duringCreated(new v9j() { // from class: l.ggz
            public final Object call() {
                return this.f11409a.m25132ef();
            }
        }).filter(new w9j() { // from class: l.hgz
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((User) obj).location));
            }
        }).map(new w9j() { // from class: l.igz
            public final Object call(Object obj) {
                return ((User) obj).location;
            }
        }).distinctUntilChanged().observeOn(Schedulers.io()).map(new w9j() { // from class: l.kgz
            public final Object call(Object obj) {
                return this.f14325a.m25141gf((Location) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.lgz
            public final void call(Object obj) {
                wmz.m24971z9((Location) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ee */
    public final /* synthetic */ void m25131ee(Boolean bool) {
        this.f21841L0.onNext(bool);
    }

    /* JADX INFO: renamed from: ef */
    public final /* synthetic */ rx.c m25132ef() {
        return CoreModule.c.e0.Ka(m25196r3());
    }

    /* JADX INFO: renamed from: eg */
    public final /* synthetic */ rx.c m25133eg(Conversation conversation) {
        return CoreModule.c.f0.Xf("message", "conversation", new String[]{m25196r3()});
    }

    /* JADX INFO: renamed from: fd */
    public final void m25134fd() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ykz
            public final void call(Object obj) {
                this.f22960a.m25145hf((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: fe */
    public final /* synthetic */ void m25135fe(Boolean bool) {
        ((fcz) this).K.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: ff */
    public final /* synthetic */ void m25136ff(Location location) {
        CoreModule.c.f0.Aq(m25196r3(), location.updatedTime, location.distance);
    }

    /* JADX INFO: renamed from: fg */
    public final /* synthetic */ void m25137fg(List list) {
        if (vwb.J(list)) {
            this.f21865j1 = null;
            ((jq2) this).viewModel.g2();
            return;
        }
        UserLiveLabel userLiveLabel = (UserLiveLabel) list.get(0);
        if (TextUtils.equals(m25196r3(), userLiveLabel.userId)) {
            this.f21865j1 = userLiveLabel;
            ((jq2) this).viewModel.g2();
        } else if (this.f21865j1 != null) {
            this.f21865j1 = null;
            ((jq2) this).viewModel.g2();
        }
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m25138g6() {
        User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
        if (userPa == null || userPa.isTeamAccount() || userPa.isBanned() || userPa.isBannedNew() || userPa.isAccountCancellation()) {
            return false;
        }
        return super.g6();
    }

    /* JADX INFO: renamed from: gd */
    public final void m25139gd() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.jjz
            public final void call(Object obj) {
                wmz.m24732D8((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ge */
    public final /* synthetic */ void m25140ge(Integer num) {
        ((jq2) this).viewModel.d4(num.intValue());
    }

    /* JADX INFO: renamed from: gf */
    public final /* synthetic */ Location m25141gf(final Location location) {
        CoreModule.c.U.a(new d30() { // from class: l.mhz
            public final void call() {
                this.f15389a.m25136ff(location);
            }
        });
        return location;
    }

    /* JADX INFO: renamed from: gg */
    public final /* synthetic */ void m25142gg(AnalysisGuide analysisGuide) {
        if (NullChecker.a(analysisGuide)) {
            if (analysisGuide.used) {
                CoreModule.c.x2.t3(i3());
            } else if (analysisGuide.isShow) {
                CoreModule.c.f0.Ug(i3(), "guide_type_analyze");
                CoreModule.c.x2.s3(i3());
            }
        }
    }

    /* JADX INFO: renamed from: hd */
    public final void m25143hd() {
        if (!CoreModule.P().i().D() || User.isTeamAccount(m25196r3())) {
            return;
        }
        duringCreated(mkd0.r(CoreModule.c.f0.Ne(m25196r3()), CoreModule.c.f0.Tn(m25196r3()), new wl20())).subscribe(mkd0.G(new e30() { // from class: l.ffz
            public final void call(Object obj) {
                this.f10325a.m25155jf((j760) obj);
            }
        }));
        creates(new e30() { // from class: l.gfz
            public final void call(Object obj) {
                wmz.m24917o8((Bundle) obj);
            }
        }, new hfz());
    }

    /* JADX INFO: renamed from: he */
    public final /* synthetic */ void m25144he(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (this.f21848S0 != null || warmingUpLevel.value < MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            return;
        }
        Keyboard keyboardA = e0().c0().g0().a();
        if (NullChecker.a(keyboardA)) {
            keyboardA.C();
        }
    }

    /* JADX INFO: renamed from: hf */
    public final /* synthetic */ void m25145hf(c cVar) {
        if (cVar == c.j) {
            this.f21863h1 = true;
            return;
        }
        if (cVar == c.i) {
            boolean z = this.f21863h1;
            bpz bpzVar = ((jq2) this).viewModel;
            if (z) {
                bpzVar.X4();
                this.f21863h1 = false;
            } else if (bpzVar.O3()) {
                ((jq2) this).viewModel.K3();
            }
        }
    }

    /* JADX INFO: renamed from: hg */
    public final /* synthetic */ void m25146hg(List list) {
        if (vwb.J(list) || !y19.c()) {
            return;
        }
        ((jq2) this).viewModel.h5(list);
    }

    /* JADX INFO: renamed from: i7 */
    public boolean m25147i7() {
        return m25162l4() && CoreModule.l.i().Q4(m25196r3());
    }

    /* JADX INFO: renamed from: ic */
    public final void m25148ic(boolean z, e30<Boolean> e30Var) {
        User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
        if (!NullChecker.a(userPa)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.transDataFromUser(userPa);
        onlineMatchPushUser.isBell = true;
        onlineMatchPushUser.isMaleQuickChatRing = true;
        onlineMatchPushUser.isGreet = true;
        CoreModule.P().i().W0(act(), onlineMatchPushUser, z, (d30) null, false, "", false, e30Var);
    }

    /* JADX INFO: renamed from: id */
    public final void m25149id() {
        if (CoreModule.P().a().Hd() && ((fcz) this).d == 29) {
            duringCreated(d36.c().a.filter(new w9j() { // from class: l.ckz
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            })).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new C0883a()));
            duringCreated(CoreModule.c.f0.b0).subscribe(mkd0.G(new C0884b()));
        }
    }

    /* JADX INFO: renamed from: ie */
    public final /* synthetic */ void m25150ie(ChatHeat chatHeat) {
        this.f21848S0 = chatHeat;
        if (MessageWarmingUpHelper.e(chatHeat).value >= MessageWarmingUpHelper.WarmingUpLevel.second.value) {
            Keyboard keyboardA = e0().c0().g0().a();
            if (NullChecker.a(keyboardA)) {
                keyboardA.C();
            }
        }
    }

    /* JADX INFO: renamed from: ig */
    public final /* synthetic */ void m25151ig(Throwable th) {
        m24993Dg();
    }

    /* JADX INFO: renamed from: j7 */
    public a<Boolean> m25152j7() {
        return this.f21841L0;
    }

    /* JADX INFO: renamed from: jd */
    public final void m25153jd() {
        if (CoreModule.l.a().dd()) {
            User userPa = CoreModule.c.e0.Pa(((fcz) this).b);
            if (NullChecker.a(userPa) && userPa.isTeamAccount()) {
                return;
            }
            CoreModule.c.f0.Pf(((fcz) this).c, "local_o_diamond_visitor_guide");
            e51.G(new Runnable() { // from class: l.zkz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23480a.m25160kf();
                }
            });
            Conversation conversation = ((fcz) this).k;
            if (conversation == null) {
                CrashHelper.d(new NullPointerException(String.format("initODiamondVisitorGuide,me:%s,other:%s,convId:%s", CoreModule.H().userId(), ((fcz) this).b, ((fcz) this).c)), 10);
                return;
            }
            if (conversation.isQuickChatConv()) {
                return;
            }
            if (NullChecker.a(userPa) && userPa.onlineMatch()) {
                return;
            }
            if (CoreModule.P().a().a2() || !(TEnum.equals(((fcz) this).k.status, "dismissed") || TEnum.equals(((fcz) this).k.status, "blocked"))) {
                duringCreated(mkd0.s(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_o_diamond_visitor_guide")), CoreModule.c.n2.G3(m25196r3()), new y9j() { // from class: l.alz
                    /* JADX INFO: renamed from: a */
                    public final Object m9877a(Object obj, Object obj2, Object obj3) {
                        return xaj0.a((User) obj, (Boolean) obj2, (ODiamondVisitorInfo) obj3);
                    }
                })).take(1).filter(new w9j() { // from class: l.blz
                    public final Object call(Object obj) {
                        xaj0 xaj0Var = (xaj0) obj;
                        return Boolean.valueOf((((Boolean) xaj0Var.b).booleanValue() || ((User) xaj0Var.a).onlineMatch()) ? false : true);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.clz
                    public final void call(Object obj) {
                        this.f8740a.m25173mf((xaj0) obj);
                    }
                }, new e30() { // from class: l.elz
                    public final void call(Object obj) {
                        wmz.m24832W9((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: je */
    public final /* synthetic */ void m25154je(knb0 knb0Var) {
        Object obj;
        MessageWarmingUpHelper.v("来自数据库订阅反馈");
        Object obj2 = knb0Var.b;
        if (obj2 == null || !TEnum.equals(((Conversation) obj2).status, "default") || TextUtils.equals(((fcz) this).k.convType, "quickchat") || (obj = knb0Var.c) == null || ((User) obj).isBanned() || ((User) knb0Var.c).isBannedNew() || ((User) knb0Var.c).isAccountCancellation()) {
            MessageWarmingUpHelper.v("status exception");
            this.f21844O0 = false;
            e0().A0().g0().y0();
            return;
        }
        if (knb0Var.a == null) {
            MessageWarmingUpHelper.v("chatHeat == null");
            Object obj3 = knb0Var.b;
            double dMin = ((Conversation) obj3).mm + (Math.min(((Conversation) obj3).mm, NullChecker.a(knb0Var.d) ? ((List) knb0Var.d).size() : 0) * 0.2f);
            MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelF = MessageWarmingUpHelper.f(dMin);
            double dP = MessageWarmingUpHelper.p(warmingUpLevelF, dMin);
            Z6(warmingUpLevelF);
            a7(dP);
            m24741Ed(warmingUpLevelF);
            return;
        }
        MessageWarmingUpHelper.v("warmingUpAnimRunning = " + this.f21845P0 + "  triple.first = " + ((ChatHeat) knb0Var.a).toJson());
        boolean z = this.f21845P0;
        Object obj4 = knb0Var.a;
        if (!z) {
            m25042Mg((ChatHeat) obj4);
        } else {
            if (!((ChatHeat) obj4).levelUp || ((ChatHeat) obj4).degree <= m3()) {
                return;
            }
            Object obj5 = knb0Var.a;
            this.f21847R0 = obj5 == null ? null : ((ChatHeat) obj5).clone();
        }
    }

    /* JADX INFO: renamed from: jf */
    public final /* synthetic */ void m25155jf(j760 j760Var) {
        if (b.l((Conversation) j760Var.a, ((q860) j760Var.b).a, 100, ((fcz) this).n)) {
            e51.H(act(), this.f21862g1, 500L);
        }
    }

    /* JADX INFO: renamed from: jg */
    public final /* synthetic */ void m25156jg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: k6 */
    public void m25157k6(int i, Menu menu) {
        super.k6(i, menu);
        if (NullChecker.a(menu)) {
            zvf0.x("e_message_page_set_nickname", "p_chat_view");
        }
    }

    /* JADX INFO: renamed from: kd */
    public final void m25158kd() {
        if (CoreModule.l.g().cf()) {
            if (!m25014Hg() || ((fcz) this).k.localHasMessage) {
                CoreModule.c.f0.Pf(((fcz) this).c, "local_platinum_pin_guide");
                duringCreated(mkd0.s(CoreModule.c.e0.Ka(m25196r3()), CoreModule.c.f0.Gg(m25196r3(), MessageType.get("local_platinum_pin_guide")), CoreModule.c.f0.Lg(m25196r3()), new y9j() { // from class: l.ifz
                    /* JADX INFO: renamed from: a */
                    public final Object m15147a(Object obj, Object obj2, Object obj3) {
                        return xaj0.a((User) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                }).filter(new w9j() { // from class: l.jfz
                    public final Object call(Object obj) {
                        return this.f13730a.m25178nf((xaj0) obj);
                    }
                }).first()).subscribe(mkd0.G(new e30() { // from class: l.kfz
                    public final void call(Object obj) {
                        this.f14316a.m25183of((xaj0) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: ke */
    public final /* synthetic */ void m25159ke(Integer num) {
        ((jq2) this).viewModel.d4(num.intValue());
    }

    /* JADX INFO: renamed from: kf */
    public final /* synthetic */ void m25160kf() {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((tqz) ((jq2) this).viewModel).t1)) {
            VText vTextD = ((tqz) ((jq2) this).viewModel).t1.d();
            if (NullChecker.a(vTextD)) {
                xdl0.M(vTextD, false);
            }
        }
    }

    /* JADX INFO: renamed from: kg */
    public final /* synthetic */ void m25161kg(boolean z) {
        CoreModule.P().i().P();
        m25148ic(z, new e30() { // from class: l.tiz
            public final void call(Object obj) {
                this.f20251a.m25156jg((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m25162l4() {
        if (CoreModule.l.i().B()) {
            return hap.c(((fcz) this).b);
        }
        return false;
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m25163l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.l6(menuItem);
        }
        act().finish();
        return true;
    }

    /* JADX INFO: renamed from: l7 */
    public boolean m25164l7() {
        return ura.e().d().t9() && NullChecker.a(((fcz) this).k) && !((!"default".equals(((fcz) this).k.convType) && !TextUtils.isEmpty(((fcz) this).k.convType)) || (NullChecker.a(((fcz) this).k) && NullChecker.a(((fcz) this).k.additional.blindbox) && !vwb.J(((fcz) this).k.additional.blindbox.tags)) || User.isTeamAccount(((fcz) this).k.otherUser) || a4(CoreModule.c.e0.Pa(((fcz) this).k.otherUser)));
    }

    /* JADX INFO: renamed from: lc */
    public final rx.c<Boolean> m25165lc() {
        return mkd0.r(CoreModule.c.f0.Ue(m25196r3()), CoreModule.c.e0.Ma(m25196r3()), new i86()).map(new w9j() { // from class: l.xiz
            public final Object call(Object obj) {
                return this.f22309a.m25023Jd((j760) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: ld */
    public final void m25166ld() {
        if ((ura.e().d().Gi() || ura.e().d().p0()) && ((jq2) this).viewModel.s0()) {
            duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.jkz
                public final Object call(Object obj) {
                    return Integer.valueOf(Math.min(3, ((User) obj).pictures.size()));
                }
            }).distinctUntilChanged().onBackpressureLatest()).subscribe(mkd0.G(new e30() { // from class: l.kkz
                public final void call(Object obj) {
                    this.f14369a.m25188pf((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: le */
    public final /* synthetic */ void m25167le(xaj0 xaj0Var) {
        t7().d5(((Boolean) xaj0Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: lf */
    public final /* synthetic */ void m25168lf(xaj0 xaj0Var) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((tqz) ((jq2) this).viewModel).t1)) {
            VText vTextD = ((tqz) ((jq2) this).viewModel).t1.d();
            if (NullChecker.a(vTextD)) {
                xdl0.M(vTextD, true);
                Object obj = xaj0Var.c;
                String str = String.format("%s\n%s", ((ODiamondVisitorInfo) obj).visitCountStr, ((ODiamondVisitorInfo) obj).visitTimeStr);
                Object obj2 = xaj0Var.c;
                vTextD.setText(i0g0.b0(str, vwb.f0(new String[]{((ODiamondVisitorInfo) obj2).visitCount, ((ODiamondVisitorInfo) obj2).visitTime}), Color.parseColor("#4c000000"), Typeface.create("sans-serif", 1)));
            }
        }
    }

    /* JADX INFO: renamed from: lg */
    public final /* synthetic */ void m25169lg() {
        act().finish();
    }

    /* JADX INFO: renamed from: md */
    public final void m25171md() {
        duringCreated(cj90.a()).filter(new w9j() { // from class: l.eez
            public final Object call(Object obj) {
                return this.f9727a.m25194qf((String) obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.fez
            public final void call(Object obj) {
                this.f10306a.m25200rf((String) obj);
            }
        }, new e30() { // from class: l.hez
            public final void call(Object obj) {
                wmz.m24952vb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: me */
    public final /* synthetic */ void m25172me(List list) {
        lz4.h().e().add(((fcz) this).b);
        if (lz4.h().o()) {
            lsi0.y(lz4.h().g());
        }
    }

    /* JADX INFO: renamed from: mf */
    public final /* synthetic */ void m25173mf(final xaj0 xaj0Var) {
        User userM25227x6 = m25227x6();
        if (NullChecker.a(userM25227x6)) {
            if (CoreModule.P().a().a2()) {
                if (TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitCountStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitTimeStr) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitCount) || TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitTime)) {
                    return;
                }
                e51.G(new Runnable() { // from class: l.fhz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10400a.m25168lf(xaj0Var);
                    }
                });
                return;
            }
            if (NullChecker.a(((fcz) this).k) && bh0.e(userM25227x6) && bh0.d(((fcz) this).k) && !TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitCountStr) && !TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitTimeStr) && TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitTime) && TextUtils.isEmpty(((ODiamondVisitorInfo) xaj0Var.c).visitCount)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", ((ODiamondVisitorInfo) xaj0Var.c).visitCountStr);
                    jSONObject.put("sub_title", ((ODiamondVisitorInfo) xaj0Var.c).visitTimeStr);
                    if (CoreModule.P().e().fn(((DbObject) userM25227x6).id)) {
                        CoreModule.c.f0.bh(((fcz) this).c, MessageType.get("local_o_diamond_visitor_guide"), jSONObject.toString(), (e30) null);
                        m24953vd();
                        zvf0.x("e_visit_times_decrypt", "p_chat_view");
                    }
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: mg */
    public final /* synthetic */ void m25174mg(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: nc */
    public final void m25175nc() {
        act().progress(R.string.I2, true);
        duringCreated(CoreModule.c.f0.qe(m25196r3(), act())).subscribe(mkd0.H(new e30() { // from class: l.riz
            public final void call(Object obj) {
                this.f18540a.m25034Ld((roj0) obj);
            }
        }, new e30() { // from class: l.siz
            public final void call(Object obj) {
                this.f19047a.m25039Md((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nd */
    public void m25176nd() {
        final String strR3 = e0().l().r3();
        duringCreated(new v9j() { // from class: l.tdz
            public final Object call() {
                return CoreModule.c.e0.Ka(strR3);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.udz
            public final Object call(Object obj) {
                return rw6.a((User) obj).profileSmall();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wdz
            public final void call(Object obj) {
                this.f21665a.m25206sf((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ne */
    public final /* synthetic */ void m25177ne(j760 j760Var) {
        boolean zJ = vwb.J(((fcz) this).k.localChatBg);
        bpz bpzVar = ((jq2) this).viewModel;
        if (zJ) {
            bpzVar.f5((Picture) null);
        } else {
            bpzVar.f5((Picture) ((fcz) this).k.localChatBg.get(0));
        }
    }

    /* JADX INFO: renamed from: nf */
    public final /* synthetic */ Boolean m25178nf(xaj0 xaj0Var) {
        return Boolean.valueOf(bh0.e((User) xaj0Var.a) && bh0.d(((fcz) this).k) && !((Boolean) xaj0Var.b).booleanValue() && ((Boolean) xaj0Var.c).booleanValue());
    }

    /* JADX INFO: renamed from: oc */
    public final boolean m25180oc() {
        User userPa = CoreModule.c.e0.Pa(m25196r3());
        return (userPa == null || userPa.isTeamAccount() || e4() || k4(m25196r3()) || !CoreModule.P().i().hm() || CoreModule.c.x2.p3(i3()) || xma.l3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: od */
    public final void m25181od() {
        if (CoreModule.P().i().V0()) {
            lifecycle().filter(new w9j() { // from class: l.jlz
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.klz
                public final void call(Object obj) {
                    this.f14376a.m25211tf((c) obj);
                }
            }));
            if (User.isTeamAccount(((fcz) this).c)) {
                return;
            }
            duringCreated(CoreModule.c.f0.Ne(((fcz) this).c)).map(new w9j() { // from class: l.llz
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).mm);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.mlz
                public final void call(Object obj) {
                    this.f15450a.m25216uf((Integer) obj);
                }
            }, new e30() { // from class: l.nlz
                public final void call(Object obj) {
                    wmz.m24776Lb((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: oe */
    public final /* synthetic */ void m25182oe(c cVar) {
        m24997Eg();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX INFO: renamed from: of */
    public final /* synthetic */ void m25183of(xaj0 xaj0Var) {
        boolean z;
        boolean z2 = false;
        if (NullChecker.a(((fcz) this).k) && NullChecker.a(((fcz) this).k.additional) && NullChecker.a(((fcz) this).k.additional.pinChat)) {
            PlatinumPinChat platinumPinChat = ((fcz) this).k.additional.pinChat;
            if (!platinumPinChat.pin || platinumPinChat.expireTime <= mqi0.o()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z3 = mqi0.D(((long) ConversationCounterTypeSp.platinumChatPinGuideLastCloseTime.get(((fcz) this).c)) * 1000) && ConversationCounterTypeSp.platinumChatPinGuideCloseCount.get(((fcz) this).c) >= y19.w();
        if (mqi0.D(((Long) CoreModule.c.e2.Z.get()).longValue()) && ((Integer) CoreModule.c.e2.a0.get()).intValue() >= y19.x()) {
            z2 = true;
        }
        if (z) {
            return;
        }
        if (xma.H3() || !(!((fcz) this).k.localEverHasMessage || z2 || z3)) {
            CoreModule.c.f0.bh(((fcz) this).c, MessageType.get("local_platinum_pin_guide"), "platinum pin guide", (e30) null);
            if (mqi0.D(((Long) CoreModule.c.e2.Z.get()).longValue())) {
                CoreModule.c.e2.a0.a(1);
            } else {
                CoreModule.c.e2.a0.put(1);
            }
            CoreModule.c.e2.Z.put(Long.valueOf(mqi0.o()));
            zvf0.x("e_platinum_top_chat", pageId());
        }
    }

    /* JADX INFO: renamed from: og */
    public final /* synthetic */ void m25184og() {
        ((jq2) this).viewModel.B5();
    }

    /* JADX INFO: renamed from: pc */
    public final boolean m25185pc() {
        User userPa = CoreModule.c.e0.Pa(m25196r3());
        return (userPa == null || userPa.isTeamAccount() || e4() || k4(m25196r3()) || !CoreModule.P().i().hm() || CoreModule.c.x2.q3(i3()) || CoreModule.c.x2.w3(i3()) || xma.k3() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: pd */
    public final void m25186pd() {
        User userPa = CoreModule.c.e0.Pa(m25196r3());
        if (!NullChecker.a(userPa) || userPa.onlineMatch()) {
            return;
        }
        duringCreated(mkd0.r(CoreModule.c.f0.Jo(), CoreModule.c.f0.Kg(((fcz) this).c).take(1), new x9j() { // from class: l.bhz
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Message) obj, (Boolean) obj2);
            }
        })).take(1).filter(new w9j() { // from class: l.chz
            public final Object call(Object obj) {
                return this.f8683a.m25220vf((j760) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.dhz
            public final void call(Object obj) {
                this.f9284a.m25225wf((j760) obj);
            }
        }, new e30() { // from class: l.ehz
            public final void call(Object obj) {
                wmz.m24774L9((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pe */
    public final /* synthetic */ void m25187pe(List list) {
        m24983Bg();
    }

    /* JADX INFO: renamed from: pf */
    public final /* synthetic */ void m25188pf(Integer num) {
        ((jq2) this).viewModel.P1();
    }

    /* JADX INFO: renamed from: pg */
    public final /* synthetic */ void m25189pg(ChatHeat chatHeat) {
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelL3 = l3();
        if (((Boolean) CoreModule.c.e0.s2.get()).booleanValue()) {
            Y6(MessageWarmingUpHelper.h(warmingUpLevelL3));
            ((jq2) this).viewModel.u5(warmingUpLevelL3);
            return;
        }
        List listU = CoreModule.k.c.U(((fcz) this).b);
        if (vwb.J(listU)) {
            this.f21845P0 = false;
        } else {
            double dO = (mqi0.o() - ((Message) listU.get(0)).createdTime) / 8.64E7d;
            double dH = MessageWarmingUpHelper.h(warmingUpLevelL3);
            MessageWarmingUpHelper.v("tempDownAnim day = " + dO);
            if (dO <= 7.0d && dO >= 5.0d && chatHeat.degree > dH && chatHeat.tempDownDegree < dH) {
                final ChatHeat chatHeatClone = chatHeat.clone();
                chatHeatClone.tempDownDegree = dH;
                CoreModule.c.U.a(new d30() { // from class: l.njz
                    public final void call() {
                        CoreModule.k.s.upsert(chatHeatClone);
                    }
                });
                Y6(dH);
                ((jq2) this).viewModel.u5(warmingUpLevelL3);
                return;
            }
            this.f21845P0 = false;
        }
        e51.F(act(), new Runnable() { // from class: l.ojz
            @Override // java.lang.Runnable
            public final void run() {
                this.f16673a.m25184og();
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public boolean m25190q4() {
        return ((jq2) this).viewModel.c4();
    }

    /* JADX INFO: renamed from: qc */
    public final void m25191qc(Message message) {
        int iIntValue;
        boolean zH;
        if (!CoreModule.P().i().O() || !NullChecker.a(m25218vc()) || m25218vc().isTeamAccount() || !NullChecker.a(((fcz) this).i) || ((fcz) this).i.isPicVerificationVerified() || (iIntValue = ((Integer) CoreModule.c.e0.H0.get()).intValue()) >= 3) {
            return;
        }
        long jO = mqi0.o();
        long jLongValue = ((Long) CoreModule.c.e0.I0.get()).longValue();
        if (iIntValue == 0) {
            zH = qqi0.h(jO, (long) ((fcz) this).i.createdTime, 4);
        } else if (iIntValue == 1) {
            zH = qqi0.h(jO, jLongValue, 1);
        } else {
            zH = iIntValue == 2 ? qqi0.h(jO, jLongValue, 2) : false;
        }
        HashSet hashSet = (HashSet) CoreModule.c.e0.J0.get();
        if (!zH || hashSet.contains(m25196r3())) {
            return;
        }
        CoreModule.c.e0.I0.put(Long.valueOf(jO));
        CoreModule.c.e0.H0.put(Integer.valueOf(iIntValue + 1));
        Message messageClone = message.clone();
        ((DbObject) messageClone).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        messageClone.messageType = MessageType.get("tantan_verify_toast");
        messageClone.createdTime = jO;
        messageClone.localCreatedTime = jO;
        messageClone.extData = MessageExtData.new_();
        CoreModule.c.f0.Zg(messageClone);
        hashSet.add(m25196r3());
        CoreModule.c.e0.J0.put(hashSet);
    }

    /* JADX INFO: renamed from: qd */
    public final void m25192qd() {
        if (!y19.X() || User.isTeamAccount(m25196r3())) {
            return;
        }
        duringCreated(this.f21843N0.switchMap(new w9j() { // from class: l.jgz
            public final Object call(Object obj) {
                return this.f13770a.m25231xf((roj0) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ugz
            public final void call(Object obj) {
                this.f20653a.m25237yf((j760) obj);
            }
        }));
        if (y19.J()) {
            duringCreated(CoreModule.c.f0.Ue(m25196r3()).filter(new oa8()).map(new w9j() { // from class: l.ghz
                public final Object call(Object obj) {
                    return Integer.valueOf(((Conversation) obj).userMessageCount);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.rhz
                public final void call(Object obj) {
                    this.f18525a.m25244zf((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: qe */
    public final /* synthetic */ void m25193qe(Conversation conversation) {
        m24983Bg();
    }

    /* JADX INFO: renamed from: qf */
    public final /* synthetic */ Boolean m25194qf(String str) {
        return Boolean.valueOf(TextUtils.equals(str, m25196r3()));
    }

    /* JADX INFO: renamed from: qg */
    public final /* synthetic */ void m25195qg(final ChatHeat chatHeat, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, roj0 roj0Var) {
        if (!((Boolean) CoreModule.c.e0.s2.get()).booleanValue()) {
            e51.y(new Runnable() { // from class: l.mjz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m24957wa(chatHeat);
                }
            });
        }
        ((jq2) this).viewModel.w5(warmingUpLevel, warmingUpLevel2);
    }

    /* JADX INFO: renamed from: r3 */
    public String m25196r3() {
        return ((fcz) this).c;
    }

    /* JADX INFO: renamed from: rc, reason: merged with bridge method [inline-methods] */
    public void m25111b3(User user) {
        super.b3(user);
        if (user.isCustomerServiceAccount() || User.isBusinessAI1V1(((DbObject) user).id)) {
            ((jq2) this).viewModel.U1();
        }
    }

    /* JADX INFO: renamed from: rd */
    public final void m25198rd() {
        if (!CoreModule.P().i().s4() || k4(m25196r3())) {
            return;
        }
        duringCreated(CoreModule.P().i().U2()).filter(new w9j() { // from class: l.xfz
            public final Object call(Object obj) {
                return Boolean.valueOf(((PurchaseType) obj) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.zfz
            public final Object call(Object obj) {
                return CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.nhz
                    public final Object call(Object obj2) {
                        return wmz.m24785N9(purchaseType, (List) obj2);
                    }
                });
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.agz
            public final void call(Object obj) {
                this.f7604a.m24977Af((PurchaseType) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: re */
    public final /* synthetic */ void m25199re(j760 j760Var) {
        e0().A0().g0().F1((Conversation) j760Var.b, (User) j760Var.a);
    }

    /* JADX INFO: renamed from: rf */
    public final /* synthetic */ void m25200rf(String str) {
        act().finish();
    }

    /* JADX INFO: renamed from: rg */
    public final /* synthetic */ void m25201rg(Throwable th) {
        this.f21845P0 = false;
    }

    /* JADX INFO: renamed from: s3 */
    public rx.c<User> m25202s3(String str) {
        return CoreModule.c.e0.Ka(str);
    }

    /* JADX INFO: renamed from: sc, reason: merged with bridge method [inline-methods] */
    public void m25117c3(Conversation conversation, q860<Message> q860Var, User user) {
        super.c3(conversation, q860Var, user);
        if (this.f21858c1) {
            this.f21858c1 = true;
            mtm.n().v(conversation, vwb.J(q860Var.a) ? null : (Message) q860Var.a.get(0), user);
        }
        mtm.n().k(conversation, vwb.J(q860Var.a) ? null : (Message) q860Var.a.get(0), user);
        m25063Qg(conversation, q860Var);
        if (ruy.g().i(user, ((fcz) this).i)) {
            m25008Gg(q860Var.a);
        }
        if (CoreModule.P().i().D() && !User.isTeamAccount(m25196r3()) && NullChecker.a(user) && CoreModule.c.b1.e3(m25196r3()) && !TEnum.equals(conversation.status, "dismissed") && !user.unilateralBlock() && !CoreModule.P().i().N3() && !this.f21838I0) {
            ((jq2) this).viewModel.r5();
            this.f21838I0 = true;
        }
        m25207sg(m25196r3(), q860Var.a);
    }

    /* JADX INFO: renamed from: sd */
    public final void m25204sd() {
        if (CoreModule.P().i().x()) {
            rx.c cVarDuringCreated = duringCreated(new v9j() { // from class: l.ekz
                public final Object call() {
                    return this.f9842a.m24982Bf();
                }
            });
            String strM25196r3 = m25196r3();
            Objects.requireNonNull(strM25196r3);
            cVarDuringCreated.filter(new fkz(strM25196r3)).subscribe(mkd0.H(new e30() { // from class: l.gkz
                public final void call(Object obj) {
                    this.f11489a.m24987Cf((String) obj);
                }
            }, new e30() { // from class: l.ikz
                public final void call(Object obj) {
                    this.f13293a.m24992Df((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: se */
    public final /* synthetic */ void m25205se() {
        CoreModule.c.f0.Hf(m25196r3());
    }

    /* JADX INFO: renamed from: sf */
    public final /* synthetic */ void m25206sf(User user) {
        ((jq2) this).viewModel.V3(user);
    }

    /* JADX INFO: renamed from: sg */
    public final void m25207sg(String str, List<Message> list) {
        if (CoreModule.P().i().H4()) {
            if (User.isTeamAccount(str) || TextUtils.equals(str, "-11004") || CoreModule.P().i().I1(CoreModule.c.e0.Pa(str))) {
                m24942tg(false);
                return;
            }
            Iterator<Message> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().owner.equals(((DbObject) m25218vc()).id)) {
                    m24942tg(true);
                    return;
                }
                i++;
                if (i >= 10) {
                    m24942tg(true);
                    return;
                }
            }
            m24942tg(false);
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m25208t6(final Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraK2 = CoreModule.P().i().K2(message);
        if (!NullChecker.a(chatGiftInfoExtraK2) || TextUtils.isEmpty(chatGiftInfoExtraK2.giftRecordId)) {
            return;
        }
        CoreModule.c.f1.j4(chatGiftInfoExtraK2.giftRecordId).subscribe(mkd0.H(new e30() { // from class: l.kjz
            public final void call(Object obj) {
                this.f14360a.m25116bg(message, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: tc */
    public final void m25209tc() {
        if (!y19.f() || mqi0.o() - ((Long) CoreModule.c.f0.w1.get()).longValue() < 604800000) {
            return;
        }
        SettingGroups settingGroups = (SettingGroups) CoreModule.c.e0.R.get();
        if (!NullChecker.a(settingGroups) || settingGroups.privacy.unrepliedReminder.booleanValue()) {
            duringCreated(mkd0.s(CoreModule.c.f0.Jg(((fcz) this).b), CoreModule.c.f0.Ne(((fcz) this).b), CoreModule.c.e0.Ka(m25196r3()), new y9j() { // from class: l.umz
                /* JADX INFO: renamed from: a */
                public final Object m23564a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((Boolean) obj, (Conversation) obj2, (User) obj3);
                }
            }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.pcz
                public final void call(Object obj) {
                    this.f17202a.m25080Ud((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: te */
    public final /* synthetic */ void m25210te() {
        e51.y(new Runnable() { // from class: l.oiz
            @Override // java.lang.Runnable
            public final void run() {
                this.f16643a.m25205se();
            }
        });
    }

    /* JADX INFO: renamed from: tf */
    public final /* synthetic */ void m25211tf(c cVar) {
        if (!User.isTeamAccount(((fcz) this).c) && CoreModule.P().i().E3()) {
            ((jq2) this).viewModel.r0();
        }
    }

    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel m25212u3() {
        return this.f21865j1;
    }

    @Nullable
    /* JADX INFO: renamed from: uc */
    public <T extends m8m> T m25213uc(final Class<T> cls) {
        T t = (a9m) vwb.r(this.f21861f1, new w9j() { // from class: l.djz
            public final Object call(Object obj) {
                return Boolean.valueOf(((a9m) obj).getClass() == cls);
            }
        });
        if (t != null) {
            return t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ud */
    public final void m25214ud() {
        lifecycle().filter(new w9j() { // from class: l.akz
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.bkz
            public final void call(Object obj) {
                this.f8246a.m25001Ff((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ue */
    public final /* synthetic */ void m25215ue(dd80[] dd80VarArr) {
        dd80VarArr[0] = null;
        act().finish();
    }

    /* JADX INFO: renamed from: uf */
    public final /* synthetic */ void m25216uf(Integer num) {
        if (num.intValue() < 20) {
            this.f21846Q0 = true;
        }
        if (!this.f21846Q0 || num.intValue() != 20 || CoreModule.P().i().E3() || ((jq2) this).viewModel.N0()) {
            return;
        }
        ((jq2) this).viewModel.i2();
    }

    /* JADX INFO: renamed from: ug */
    public final List<String> m25217ug() {
        ArrayList arrayList = new ArrayList();
        if (y19.I()) {
            arrayList.add("local_birthday_tip");
        }
        if (CoreModule.P().i().v5()) {
            arrayList.add("local_chat_assistant_question_new");
        }
        if (y19.O()) {
            arrayList.add("local_heart_beat_lock_tip");
        }
        if (CoreModule.P().g().cf()) {
            arrayList.add("local_platinum_pin_guide");
        }
        if (CoreModule.P().a().dd()) {
            arrayList.add("local_o_diamond_visitor_guide");
        }
        if (CoreModule.P().g().d4()) {
            arrayList.add("local_visitor_hide_footprint");
        }
        if (CoreModule.P().a().o0()) {
            arrayList.add("local_wechat_notify_guide");
        }
        if (CoreModule.P().a().Xn()) {
            arrayList.add("local_ux_questionnaire");
            arrayList.add("local_ux_questionnaire_tip");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: vc */
    public User m25218vc() {
        return (User) ((fcz) this).j;
    }

    /* JADX INFO: renamed from: ve */
    public final /* synthetic */ void m25219ve(final dd80[] dd80VarArr, knb0 knb0Var) {
        if (!TextUtils.equals("default", ((Conversation) knb0Var.c).convType) || ((User) knb0Var.a).isTeamAccount() || TEnum.equals(((Conversation) knb0Var.c).status, "deleted") || TEnum.equals(((Conversation) knb0Var.c).status, "dismissed") || ((User) knb0Var.a).isBanedOrInactivated()) {
            return;
        }
        boolean zIsPicVerificationVerified = ((User) knb0Var.a).isPicVerificationVerified();
        boolean zIsOpenFilterVeriMsg = ((User) knb0Var.a).isOpenFilterVeriMsg();
        if (!(NullChecker.a(knb0Var.b) && NullChecker.a(((VerificationCenter) knb0Var.b).picVerificationInfo) && TEnum.equals(((VerificationCenter) knb0Var.b).picVerificationInfo.status, "verified")) && zIsPicVerificationVerified && zIsOpenFilterVeriMsg) {
            if (dd80VarArr[0] == null) {
                dd80VarArr[0] = FilterVerificationUserMsgDlg.M(act(), FilterVerificationUserMsgDlg.FilterFrom.MSG_PAGE, (User) knb0Var.a, new d30() { // from class: l.iiz
                    public final void call() {
                        this.f13265a.m25215ue(dd80VarArr);
                    }
                });
            }
        } else if (NullChecker.a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: vf */
    public final /* synthetic */ Boolean m25220vf(j760 j760Var) {
        return Boolean.valueOf((CoreModule.c.e0.Y7() || !TextUtils.equals(((Message) j760Var.a).owner, CoreModule.H().userId()) || !NullChecker.a(((fcz) this).k) || !TEnum.equals(((fcz) this).k.status, "default") || ((Boolean) CoreModule.c.e0.e2.get()).booleanValue() || m25014Hg() || this.f21869n1) ? false : true);
    }

    /* JADX INFO: renamed from: vg */
    public boolean m25221vg() {
        return (!CoreModule.P().i().v5() || !NullChecker.a(CoreModule.c.e0.Pa(m25196r3())) || CoreModule.c.e0.Pa(m25196r3()).isTeamAccount() || CoreModule.c.e0.Pa(m25196r3()).unilateralBlock() || CoreModule.c.e0.Pa(m25196r3()).isBannedNew() || CoreModule.c.e0.Pa(m25196r3()).isJailed() || CoreModule.c.e0.Pa(m25196r3()).inactivated || CoreModule.c.e0.p9().isBannedNew() || CoreModule.c.e0.p9().isJailed() || e4() || !NullChecker.a(((fcz) this).k) || ((fcz) this).k.isQuickChatConv() || ((fcz) this).k.isHeartbeatConv() || TEnum.equals(((fcz) this).k.status, "dismissed") || ((fcz) this).k.mm >= 1 || mqi0.o() < ((Long) this.f21856a1.get()).longValue() + 86400000) ? false : true;
    }

    /* JADX INFO: renamed from: wc */
    public final void m25222wc() {
        CoreModule.c.f0.Kf(i3());
        if (m25185pc()) {
            m25026Jg();
        }
    }

    /* JADX INFO: renamed from: wd */
    public final void m25223wd() {
        duringCreated(CoreModule.c.f0.oo().filter(new w9j() { // from class: l.lfz
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Message) obj));
            }
        })).subscribe(new e30() { // from class: l.mfz
            public final void call(Object obj) {
                this.f15376a.m25074Sg((Message) obj);
            }
        });
        duringCreated(CoreModule.c.f0.wn().filter(new w9j() { // from class: l.lfz
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Message) obj));
            }
        })).subscribe(new e30() { // from class: l.mfz
            public final void call(Object obj) {
                this.f15376a.m25074Sg((Message) obj);
            }
        });
        if (y19.S()) {
            User userById = CoreModule.K().getUserById(m25196r3());
            if (NullChecker.a(userById) && userById.isBannedNew()) {
                return;
            }
            creates(new e30() { // from class: l.ofz
                public final void call(Object obj) {
                    this.f16559a.m25031Kf((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: we */
    public final /* synthetic */ void m25224we() {
        ((fcz) this).G.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: wf */
    public final /* synthetic */ void m25225wf(j760 j760Var) {
        CoreModule.c.f0.dh(((fcz) this).b, MessageType.get("local_push_switch"));
        CoreModule.c.e0.e2.put(Boolean.TRUE);
        CoreModule.c.e0.b2.put(Long.valueOf(mqi0.o()));
        CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: wg */
    public boolean mo18687wg() {
        return tqm0.p().s();
    }

    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion m25226x3() {
        qvy qvyVar = this.f21839J0;
        if (qvyVar == null) {
            return null;
        }
        return qvyVar.r0();
    }

    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User m25227x6() {
        return (User) ((fcz) this).j;
    }

    /* JADX INFO: renamed from: xc */
    public final void m25228xc() {
        if (CoreModule.c.t0.p3() || User.isTeamAccount(((fcz) this).b)) {
            return;
        }
        duringCreated(CoreModule.c.e0.Ka(((fcz) this).b).take(1)).subscribe(mkd0.H(new e30() { // from class: l.bgz
            public final void call(Object obj) {
                this.f8123a.m25086Vd((User) obj);
            }
        }, new e30() { // from class: l.cgz
            public final void call(Object obj) {
                wmz.m24797Pb((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: xd */
    public final void m25229xd() {
        if (CoreModule.P().i().w4() && NullChecker.a(m25227x6()) && !vwb.J(m25227x6().profile.extensions.interest.tags) && CoreModule.P().i().b0(m25227x6())) {
            duringCreated(CoreModule.P().i().g2().take(2)).subscribe(mkd0.G(new e30() { // from class: l.dkz
                public final void call(Object obj) {
                    this.f9315a.m25036Lf((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: xe */
    public final /* synthetic */ void m25230xe(Object obj) {
        if (((fcz) this).H.isEmpty()) {
            return;
        }
        ((jq2) this).viewModel.Z4((CoreGiftInfo) ((fcz) this).H.remove(0), new d30() { // from class: l.hiz
            public final void call() {
                this.f12059a.m25224we();
            }
        });
    }

    /* JADX INFO: renamed from: xf */
    public final /* synthetic */ rx.c m25231xf(roj0 roj0Var) {
        return mkd0.r(m25165lc(), ((fcz) this).s.distinctUntilChanged(), new trq());
    }

    /* JADX INFO: renamed from: xg */
    public void m25232xg(String str, String str2, boolean z) {
        if (z) {
            m25245zg(str, str2);
        } else {
            m24978Ag(str, str2);
        }
    }

    /* JADX INFO: renamed from: y6 */
    public void m25233y6() {
        super.y6();
        if (NullChecker.a(((fcz) this).k)) {
            mtm.n().u(((fcz) this).k);
        }
    }

    /* JADX INFO: renamed from: yc */
    public final void m25234yc() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ocz
            public final void call(Object obj) {
                this.f16533a.m25089Wd((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: yd */
    public final void m25235yd() {
        duringCreated(CoreModule.c.f0.Jo()).subscribe(mkd0.G(new e30() { // from class: l.nkz
            public final void call(Object obj) {
                this.f16092a.m25041Mf((Message) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ye */
    public final /* synthetic */ void m25236ye(c cVar) {
        if (cVar == c.j) {
            ((fcz) this).H.clear();
            ((jq2) this).viewModel.t5();
        }
    }

    /* JADX INFO: renamed from: yf */
    public final /* synthetic */ void m25237yf(j760 j760Var) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(j760Var.a) && Boolean.FALSE.equals(j760Var.b) && NullChecker.a(((tqz) ((jq2) this).viewModel).G0)) {
            ((jq2) this).viewModel.n5();
        } else if (NullChecker.a(((tqz) ((jq2) this).viewModel).r1) && ((tqz) ((jq2) this).viewModel).r1.m() == 10) {
            ((jq2) this).viewModel.Q1(false, new Runnable() { // from class: l.xhz
                @Override // java.lang.Runnable
                public final void run() {
                    wmz.m24925q8();
                }
            });
        }
        if (!bool.equals(j760Var.b) || TextUtils.isEmpty(((fcz) this).k.localDraft)) {
            return;
        }
        this.f21857b1 = "";
        m24993Dg();
    }

    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public final void m25179ng(final ChatHeat chatHeat) {
        MessageWarmingUpHelper.v("playTempAnim level = " + l3() + "   chatHeat = " + chatHeat.toJson());
        duringCreated(((jq2) this).viewModel.a4() ? ((jq2) this).viewModel.N3() : rx.c.just(roj0.a)).take(1).subscribe(mkd0.G(new e30() { // from class: l.ziz
            public final void call(Object obj) {
                this.f23446a.m25121cg(chatHeat, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z3 */
    public String m25239z3() {
        if (!CoreModule.P().i().U3()) {
            return super.z3();
        }
        ChatHeat chatHeatM3 = CoreModule.c.M1.m3(((fcz) this).b);
        if (!NullChecker.a(chatHeatM3)) {
            return "-1";
        }
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelR = MessageWarmingUpHelper.r(chatHeatM3.degree);
        if (warmingUpLevelR.value <= 0) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder("level_");
        sb.append(warmingUpLevelR.value - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: z6 */
    public void m25240z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
        if (coreGiftInfo == null || !coreGiftInfo.dynamicGift || ((fcz) this).H.contains(coreGiftInfo) || ((jq2) this).viewModel.Z3()) {
            return;
        }
        ((jq2) this).viewModel.a5(message, coreGiftInfo, (d30) null, true, str, z);
        zvf0.A("e_chat_gift_view", act().pageId(), new j760[]{vwb.Y("is_chat_gift_sender", Boolean.valueOf(!TextUtils.isEmpty(str))), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
    }

    /* JADX INFO: renamed from: zc */
    public final void m25241zc() {
        duringCreated(CoreModule.c.e0.Ka(((fcz) this).b)).subscribe(mkd0.G(new e30() { // from class: l.ycz
            public final void call(Object obj) {
                this.f22809a.m25093Xd((User) obj);
            }
        }));
        if (CoreModule.P().i().h3() && NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed) {
            m25186pd();
        }
    }

    /* JADX INFO: renamed from: zd */
    public final void m25242zd() {
        if (CoreModule.P().i().O()) {
            User userPa = CoreModule.c.e0.Pa(m25196r3());
            User userP9 = CoreModule.c.e0.p9();
            if (!NullChecker.a(userPa) || userPa.isTeamAccount() || !userPa.isIdAndPicBothVerified() || !NullChecker.a(userP9) || userP9.isIdAndPicBothVerified() || ((Boolean) CoreModule.c.e0.K0.get()).booleanValue()) {
                return;
            }
            CoreModule.c.e0.K0.put(Boolean.TRUE);
            ((jq2) this).viewModel.p5(userPa);
        }
    }

    /* JADX INFO: renamed from: ze */
    public final /* synthetic */ void m25243ze(dd80 dd80Var) {
        if (dd80Var != null && dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        act().finish();
    }

    /* JADX INFO: renamed from: zf */
    public final /* synthetic */ void m25244zf(Integer num) {
        if (num.intValue() > 0) {
            ((jq2) this).viewModel.W4(true);
        }
    }

    /* JADX INFO: renamed from: zg */
    public final void m25245zg(String str, String str2) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = rhi.B(str);
        ((Media) pictureNew_).mediaType = "image/*";
        ((Media) pictureNew_).status = MediaLocalStatus.get("raw");
        Message message = new Message();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureNew_);
        message.media = arrayList;
        message.messageType = MessageType.get("real_shot");
        message.value = str2;
        A6(message);
    }

    /* JADX INFO: renamed from: mc */
    public final void m25170mc() {
    }
}
