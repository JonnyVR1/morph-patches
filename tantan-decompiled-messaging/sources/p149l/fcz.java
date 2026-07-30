package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.collect.Lists;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.data.AudioText;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationMomentInfo;
import com.p046p1.mobile.putong.core.data.ConversationQuickChat;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.ExchangePicture;
import com.p046p1.mobile.putong.core.data.GiftSubBizType;
import com.p046p1.mobile.putong.core.data.IceBreakFriendData;
import com.p046p1.mobile.putong.core.data.IceBreakUserId;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageChannel;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageSentFrom;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Ref;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.Survey;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.SelectContactAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p133rx.subjects.ReplaySubject;
import p149l.tqz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fcz<H, V extends tqz> extends muy<V> {

    /* JADX INFO: renamed from: F0 */
    public static C22393b<roj0> f96880F0 = C22393b.m221521b();

    /* JADX INFO: renamed from: G0 */
    public static final ArrayList<String> f96881G0 = vwb.m200324f0("OPPO R9m", "OPPO R9s", "OPPO R9tm", "OPPO R9 Plusm A", "OPPO A59m");

    /* JADX INFO: renamed from: H0 */
    public static boolean f96882H0 = false;

    /* JADX INFO: renamed from: A */
    public Set<String> f96883A;

    /* JADX INFO: renamed from: B */
    public String f96884B;

    /* JADX INFO: renamed from: C */
    public String f96885C;

    /* JADX INFO: renamed from: D */
    public long f96886D;

    /* JADX INFO: renamed from: E */
    public Map<String, c4g0> f96887E;

    /* JADX INFO: renamed from: E0 */
    public String f96888E0;

    /* JADX INFO: renamed from: F */
    public hpd0 f96889F;

    /* JADX INFO: renamed from: G */
    public uie0<Object, Object> f96890G;

    /* JADX INFO: renamed from: H */
    public List<CoreGiftInfo> f96891H;

    /* JADX INFO: renamed from: I */
    public hpd0 f96892I;

    /* JADX INFO: renamed from: J */
    public hpd0 f96893J;

    /* JADX INFO: renamed from: K */
    public C22392a<roj0> f96894K;

    /* JADX INFO: renamed from: L */
    public C22392a<roj0> f96895L;

    /* JADX INFO: renamed from: M */
    public hpd0 f96896M;

    /* JADX INFO: renamed from: N */
    public final hpd0 f96897N;

    /* JADX INFO: renamed from: O */
    public boolean f96898O;

    /* JADX INFO: renamed from: P */
    public boolean f96899P;

    /* JADX INFO: renamed from: Q */
    public volatile MessageWarmingUpHelper.WarmingUpLevel f96900Q;

    /* JADX INFO: renamed from: R */
    public volatile double f96901R;

    /* JADX INFO: renamed from: S */
    public volatile double f96902S;

    /* JADX INFO: renamed from: T */
    public boolean f96903T;

    /* JADX INFO: renamed from: U */
    public boolean f96904U;

    /* JADX INFO: renamed from: V */
    public boolean f96905V;

    /* JADX INFO: renamed from: W */
    public int f96906W;

    /* JADX INFO: renamed from: X */
    public c4g0 f96907X;

    /* JADX INFO: renamed from: Y */
    public LocalStatus f96908Y;

    /* JADX INFO: renamed from: Z */
    public Message f96909Z;

    /* JADX INFO: renamed from: b */
    public String f96910b;

    /* JADX INFO: renamed from: c */
    public String f96911c;

    /* JADX INFO: renamed from: d */
    public int f96912d;

    /* JADX INFO: renamed from: e */
    public String f96913e;

    /* JADX INFO: renamed from: f */
    public String f96914f;

    /* JADX INFO: renamed from: g */
    public String f96915g;

    /* JADX INFO: renamed from: h */
    public int f96916h;

    /* JADX INFO: renamed from: i */
    public User f96917i;

    /* JADX INFO: renamed from: j */
    public H f96918j;

    /* JADX INFO: renamed from: k */
    public Conversation f96919k;

    /* JADX INFO: renamed from: k0 */
    public MessageMomentGuide f96920k0;

    /* JADX INFO: renamed from: l */
    public C22306c<q860<Message>> f96921l;

    /* JADX INFO: renamed from: m */
    public Message f96922m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, String> f96923n;

    /* JADX INFO: renamed from: o */
    public String f96924o;

    /* JADX INFO: renamed from: p */
    public String f96925p;

    /* JADX INFO: renamed from: p0 */
    public w9j<Message, Boolean> f96926p0;

    /* JADX INFO: renamed from: q */
    public long f96927q;

    /* JADX INFO: renamed from: r */
    public q860<Message> f96928r;

    /* JADX INFO: renamed from: s */
    public C22392a<Boolean> f96929s;

    /* JADX INFO: renamed from: t */
    public boolean f96930t;

    /* JADX INFO: renamed from: u */
    public boolean f96931u;

    /* JADX INFO: renamed from: v */
    public boolean f96932v;

    /* JADX INFO: renamed from: w */
    public String f96933w;

    /* JADX INFO: renamed from: x */
    public double f96934x;

    /* JADX INFO: renamed from: y */
    public boolean f96935y;

    /* JADX INFO: renamed from: z */
    public Set<String> f96936z;

    /* JADX INFO: renamed from: l.fcz$a */
    public class RunnableC16801a implements Runnable {
        public RunnableC16801a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m120867a(Conversation conversation) {
            conversation.localBotherStatus = 0;
            CoreModule.f17545c.f19642f0.m33050mq(conversation);
        }

        @Override // java.lang.Runnable
        public void run() {
            final Conversation conversationM120788j3 = fcz.this.m120788j3();
            if (NullChecker.m81303a(conversationM120788j3)) {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.ecz
                    @Override // p149l.d30
                    public final void call() {
                        fcz.RunnableC16801a.m120867a(conversationM120788j3);
                    }
                });
            }
        }
    }

    public fcz(mcr mcrVar) {
        super(mcrVar);
        this.f96910b = "";
        this.f96911c = "";
        this.f96912d = -1;
        this.f96914f = "";
        this.f96915g = "";
        this.f96916h = -1;
        this.f96923n = new HashMap<>();
        this.f96924o = null;
        this.f96928r = q860.m173341a();
        Boolean bool = Boolean.FALSE;
        this.f96929s = C22392a.m221513c(bool);
        this.f96930t = false;
        this.f96932v = false;
        this.f96935y = true;
        this.f96936z = new HashSet();
        this.f96883A = new HashSet();
        this.f96887E = new HashMap(1);
        this.f96890G = ReplaySubject.m221499b().m167245a();
        this.f96891H = new CopyOnWriteArrayList();
        this.f96892I = new hpd0("gift_guide_bubble_shown_" + CoreModule.m29931H().userId(), bool);
        this.f96893J = new hpd0("camera_guide_bubble_shown_" + CoreModule.m29931H().userId(), bool);
        roj0 roj0Var = roj0.f160388a;
        this.f96894K = C22392a.m221513c(roj0Var);
        this.f96895L = C22392a.m221513c(roj0Var);
        this.f96896M = new hpd0("gift_guide_bubble_opt_shown_" + CoreModule.m29931H().userId(), bool);
        this.f96897N = new hpd0("message_read_state_text_guide_shown_" + CoreModule.m29931H().userId(), bool);
        this.f96898O = false;
        this.f96899P = false;
        this.f96900Q = MessageWarmingUpHelper.WarmingUpLevel.not;
        this.f96901R = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f96902S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f96903T = false;
        this.f96904U = false;
        this.f96905V = false;
        this.f96908Y = LocalStatus.get("normal");
        this.f96926p0 = new w9j() { // from class: l.jbz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117239a.m120653G5((Message) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m120508A2(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m120528J0() {
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m120529J1() {
        k000.f120436c -= 100000000;
        lsi0.m151580j("duration:" + (k000.f120436c / 1000000));
    }

    /* JADX INFO: renamed from: M3 */
    private void m120532M3() {
        if (m120741Z5()) {
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.abz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68758a.m120815o5((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N3 */
    private void m120535N3() {
        duringCreated(new v9j() { // from class: l.oaz
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Act.globalLifecycle();
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.paz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148018a.m120820p5((HashMap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m120537O1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: O3 */
    private void m120538O3() {
        creates(new e30() { // from class: l.l8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126873a.m120825q5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m120543R0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R3 */
    private void m120545R3() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zaz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202414a.m120845u5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m120546S0(Throwable th) {
    }

    /* JADX INFO: renamed from: V3 */
    private void m120553V3() {
        if (((tqz) this.viewModel).m190328s0()) {
            duringCreated(m156455e0().mo48971c0().m213065x0()).subscribe(mkd0.m154955G(new e30() { // from class: l.yaz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197271a.m120630A5((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m120566c2() {
        long j = k000.f120436c;
        if (j == 400000000) {
            k000.f120436c = j * 30;
        } else {
            k000.f120436c = 400000000L;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ xaj0 m120570e2(Conversation conversation, q860 q860Var, Object obj, roj0 roj0Var) {
        return new xaj0(conversation, q860Var, obj);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m120585k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ xaj0 m120587l0(Object obj, User user, Conversation conversation, roj0 roj0Var) {
        return new xaj0(obj, user, conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m120589l2(xaj0 xaj0Var) {
        if (((Integer) ((j760) xaj0Var.f191752b).f116564a).intValue() < 100) {
            r9m.m178395r().m178398C(true);
        } else {
            r9m.m178395r().m178398C(false);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m120598o2() {
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m120601p2() {
        k000.f120436c += 100000000;
        lsi0.m151580j("duration:" + (k000.f120436c / 1000000));
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m120610s2(IceBreakFriendData iceBreakFriendData) {
        ArrayList arrayList = new ArrayList();
        Iterator<IceBreakUserId> it = iceBreakFriendData.friends.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().userId);
        }
        r9m.m178395r().m178397B(arrayList);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m120623y0(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public String mo120628A3() {
        return "messages_thumbnail_right";
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m120629A4(String str) {
        m156455e0().mo48954A0().m156457g0().m128210t0().getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m120630A5(Integer num) {
        if (num.intValue() != 0) {
            ((tqz) this.viewModel).m190297e0();
        }
    }

    /* JADX INFO: renamed from: A6 */
    public void m120631A6(final Message message) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        new lsx(message.media, false, TEnum.equals(message.messageType, MessageType.real_shot)).compose(mkd0.m154951C()).last().subscribe(mkd0.m154956H(new e30() { // from class: l.y8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196902a.m120673K5(message, jUptimeMillis, (List) obj);
            }
        }, new e30() { // from class: l.z8z
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f20727C2);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m120632B3() {
        return this.f96931u;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m120633B4() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "star";
        C4740g.m32540wf(this.f96910b, messageNew_).materialize().subscribe();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m120634B5(Message message) {
        ((tqz) this.viewModel).m190342z1(message, true, null);
    }

    /* JADX INFO: renamed from: B6 */
    public final void m120635B6(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Picture picture = new Picture();
            picture.url = rhi.m179355B(str);
            picture.mediaType = "image/*";
            picture.status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        m120639C6(arrayList, 0);
    }

    /* JADX INFO: renamed from: C3 */
    public void m120636C3(String str) {
        this.f96936z.remove(str);
        ((tqz) this.viewModel).m190310j0().m162104y();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m120637C4() {
        List<Message> list = this.f96928r.f153135a;
        C4740g.m32552xf(list.get(list.size() - 1)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m120638C5(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = l2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(0, zbc0.m217835a(0, str.length() - 1));
        C4740g.m32540wf(this.f96910b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C6 */
    public final void m120639C6(List<Media> list, int i) {
        m156455e0().mo48971c0().m156457g0().mo134710k(0, -1);
        n11.m157335h(list.size() > 0);
        for (Media media : list) {
            Message message = new Message();
            ArrayList arrayList = new ArrayList();
            message.media = arrayList;
            arrayList.add(media);
            if (i == 10 || i == 11) {
                message.messageType = MessageType.get(MessageType.exchange_picture);
                ExchangePicture exchangePictureNew_ = ExchangePicture.new_();
                if (TextUtils.isEmpty(uxz.f178791j)) {
                    exchangePictureNew_.exchangeType = ExchangePicture.SEND_MESSAGE;
                } else {
                    exchangePictureNew_.exchangeType = ExchangePicture.BACK_MESSAGE;
                    exchangePictureNew_.launchMessageId = uxz.f178791j;
                }
                message.msgData = exchangePictureNew_.toJson();
            } else if (i == 13) {
                message.messageType = MessageType.get(MessageType.limit_time_picture);
            } else {
                message.messageType = MessageType.get("picture");
            }
            m120631A6(message);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m120640D3() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.vaz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180799a.m120720V4((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m120641D4(Message message) {
        C4740g.m32540wf(this.f96910b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m120642D5(int i, final String str) {
        C22306c.interval(100L, TimeUnit.MILLISECONDS).take(i).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.v7z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180433a.m120638C5(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D6 */
    public void m120643D6() {
        ((tqz) this.viewModel).m190310j0().m162105z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m120644E3() {
        duringCreated(CoreModule.f17545c.f19642f0.f19927c2).distinctUntilChanged().filter(new w9j() { // from class: l.raz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158571a.m120725W4((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.saz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163466a.m120730X4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m120645E4() {
        final Message messageNew_ = Message.new_();
        messageNew_.value = "flower";
        act().postDelayed(new Runnable() { // from class: l.vbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f180897a.m120641D4(messageNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m120646E5(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(((Message) list.get(i)).f56011id, str)) {
                ((tqz) this.viewModel).m190246A1(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m120647E6(String str) {
        CoreModule.f17545c.f19642f0.m32710Kn(this.f96911c, str);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m120648F3() {
        if (IntlCountryCodeController.m28111g() && NullChecker.m81303a(this.f96919k) && TEnum.equals(this.f96919k.property.chatInterrupt.stage, "locked") && this.f96917i.isVIP()) {
            duringCreated(ruy.m181215g().m181223k(this.f96910b)).subscribe(mkd0.m154950B());
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m120649F4() {
        this.f96930t = !this.f96930t;
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m120650F5(Message message) {
        return Boolean.valueOf(m156455e0().mo48976t0().m143727N0(message._id));
    }

    /* JADX INFO: renamed from: F6 */
    public void m120651F6() {
        if (this.f96910b.isEmpty() || Integer.parseInt(this.f96910b) <= 0) {
            return;
        }
        ((tqz) this.viewModel).m190272S1();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m120652G4() {
        String str = this.f96910b;
        C4740g.m32540wf(str, CoreModule.f17545c.f19642f0.m32817Tn(str).toBlocking().m212770b().f153135a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m120653G5(Message message) {
        return Boolean.valueOf((message.isLocal() || !message.isOtherUser() || !NullChecker.m81303a(message.audio()) || message.audio().audioRead || m120819p4(message.f56011id) || m120739Z3(message) || m156455e0().mo48976t0().m143727N0(message._id)) ? false : true);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m120655H2(final String str) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = mo120828r3();
        coreSendGiftBodyNew_.giftID = str;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get("chat").toString();
        if (CoreModule.f17545c.f19639e0.m169430Pa(mo120828r3()).onlineMatch()) {
            coreSendGiftBodyNew_.subBizType = GiftSubBizType.get("quickchat");
        } else {
            coreSendGiftBodyNew_.subBizType = null;
        }
        CoreModule.m29935P().m94658i().mo158434q3((PutongAct) act(), coreSendGiftBodyNew_, new e30() { // from class: l.f8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96436a.m120834s4(str, (Boolean) obj);
            }
        }, new w9j() { // from class: l.g8z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101532a.m120839t4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m120656H3() {
        if (CoreModule.m29935P().m94658i().mo158314U3() && mo120776g6()) {
            duringCreated(CoreModule.f17545c.f19586M1.m215251u3()).subscribe(mkd0.m154955G(new e30() { // from class: l.taz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169196a.m120735Y4((ChatHeatActionData) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m120657H4() {
        String str = this.f96910b;
        C4740g.m32540wf(str, CoreModule.f17545c.f19642f0.m32817Tn(str).toBlocking().m212770b().f153135a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m120658H5(AudioText audioText) {
        if (TEnum.equals(audioText.status, "default") && !TextUtils.isEmpty(audioText.translationResult)) {
            m120832r7(audioText.msgId);
        } else {
            if (TEnum.equals(audioText.status, "pending")) {
                return;
            }
            m120827q7(audioText.msgId, false);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m120661I3() {
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32727Mg(this.f96910b), CoreModule.f17545c.f19642f0.m32679Ig(this.f96910b), new x9j() { // from class: l.iaz
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return Boolean.valueOf(NullChecker.m81303a(bool) && bool.booleanValue() && NullChecker.m81303a(bool2) && bool2.booleanValue());
            }
        })).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.jaz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117144a.m120740Z4((Boolean) obj);
            }
        }, new e30() { // from class: l.kaz
            @Override // p149l.e30
            public final void call(Object obj) {
                fcz.m120546S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m120662I4() {
        act().postDelayed(new Runnable() { // from class: l.fbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f96760a.m120657H4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m120663I5(String str, Throwable th) {
        m120827q7(str, true);
    }

    /* JADX INFO: renamed from: J2 */
    public void m120665J2(String str, String str2) {
        Survey survey;
        for (int iMo139112d = ((tqz) this.viewModel).m190310j0().mo139112d() - 1; iMo139112d >= 0; iMo139112d--) {
            Message messageMo139119m = ((tqz) this.viewModel).m190310j0().mo139119m(iMo139112d);
            if (TEnum.equals(messageMo139119m.messageType(), MessageType.new_survey) && !TextUtils.isEmpty(messageMo139119m.msgData) && (survey = Survey.parse(messageMo139119m.msgData)) != null && str.equals(survey.f20511id)) {
                survey.f20511id = str;
                survey.status = "submitted";
                messageMo139119m.msgData = survey.toJson();
                messageMo139119m.value = str2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m120666J3() {
        duringCreated(new v9j() { // from class: l.dcz
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f85522a.m120745a5();
            }
        }, false).filter(new w9j() { // from class: l.a8z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f68103a.m120750b5((roj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.k8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121888a.m120755c5((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m120667J4(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = l2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(0, zbc0.m217835a(0, str.length() - 1));
        CoreModule.f17545c.f19642f0.m32623Dn(m120783i3(), message, null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m120668J5(Message message) {
        ((tqz) this.viewModel).m190342z1(message, true, null);
    }

    /* JADX INFO: renamed from: J6 */
    public void m120669J6() {
        this.f96933w = null;
    }

    /* JADX INFO: renamed from: K2 */
    public final long m120670K2() {
        long jM155944o = mqi0.m155944o() - this.f96886D;
        if (jM155944o >= 500) {
            return 0L;
        }
        return 500 - jM155944o;
    }

    /* JADX INFO: renamed from: K3 */
    public void m120671K3() {
        creates(new e30() { // from class: l.o8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142686a.m120760d5((Bundle) obj);
            }
        }, new d30() { // from class: l.p8z
            @Override // p149l.d30
            public final void call() {
                fcz.m120598o2();
            }
        });
        duringCreated(new v9j() { // from class: l.q8z
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f153345a.m120765e5();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.r8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158266a.m120770f5((xaj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32878Yo(m120783i3())).subscribe(mkd0.m154955G(new e30() { // from class: l.s8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163121a.m120775g5((Message) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(m120783i3());
            if (!NullChecker.m81303a(conversationM32856Xe) || TextUtils.isEmpty(conversationM32856Xe.clearedUntil)) {
                this.f96921l = CoreModule.f17545c.f19642f0.m32829Un(m120783i3(), mo120838t3());
            } else {
                this.f96921l = CoreModule.f17545c.f19642f0.m32737Ne(m120783i3()).distinctUntilChanged(new w9j() { // from class: l.u8z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Conversation) obj).clearedUntil;
                    }
                }).flatMap(new w9j() { // from class: l.v8z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f180600a.m120780h5((Conversation) obj);
                    }
                });
            }
        } else {
            this.f96921l = CoreModule.f17545c.f19642f0.m32829Un(m120783i3(), mo120838t3());
        }
        duringCreated(new v9j() { // from class: l.w8z
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f185285a.m120785i5();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.x8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191566a.m120805m5((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m120672K4(final String str) {
        C22306c.interval(100L, TimeUnit.MILLISECONDS).take(1000).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ubz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175776a.m120667J4(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m120673K5(final Message message, long j, List list) {
        message.media = list;
        act().postDelayed(new Runnable() { // from class: l.lbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f127356a.m120668J5(message);
            }
        }, (j + 500) - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: L2 */
    public void m120675L2(final Message message, boolean z, Sticker sticker) {
        m120732X6(message);
        mo120695Q2(message, z, sticker);
        if (this.f96930t) {
            message.sentFrom = MessageSentFrom.get(MessageSentFrom.apple_watch);
        }
        if (message.question == null && message.answerOfMessage == null && TextUtils.isEmpty(message.referenceMsgId)) {
            for (int size = this.f96928r.f153135a.size() - 1; size >= Math.max(0, this.f96928r.f153135a.size() - 20); size--) {
                Message message2 = this.f96928r.f153135a.get(size);
                if (NullChecker.m81303a(message2.question)) {
                    message.answerOfMessage = message2.f56011id;
                    break;
                } else {
                    if (message2.isMe()) {
                        break;
                    }
                }
            }
        }
        pxz.m171966c();
        SystemClock.elapsedRealtime();
        if (z) {
            mo120700R2(message, z, sticker);
            duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(m120783i3(), message, sticker)).subscribe(mkd0.m154956H(new e30() { // from class: l.acz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68889a.m120844u4(message, (Message) obj);
                }
            }, new e30() { // from class: l.bcz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74985a.m120848v4(message, (Throwable) obj);
                }
            }));
        } else if (!mo120704S2(message, z, sticker)) {
            act().progress(R$string.f20775I2, true);
            CoreModule.f17545c.f19642f0.m32662Gn(this.f96910b, message).subscribe(mkd0.m154956H(new e30() { // from class: l.ccz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80336a.m120852w4((roj0) obj);
                }
            }, new e30() { // from class: l.q7z
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153101a.m120856x4((Throwable) obj);
                }
            }));
        }
        if (User.ID_TEAM_ACCOUNT.equals(this.f96910b)) {
            return;
        }
        CoreModule.m29935P().m94658i().mo158223E0();
        if (message.moment == null && CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            CoreModule.m29935P().m94658i().mo158239H2();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m120676L4() {
        for (int i = 0; i < 10; i++) {
            m120708S6(i + "");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m120677L5(String str) {
        m156455e0().mo48954A0().m210937r2(new SpannableStringBuilder(str), null, false);
    }

    /* JADX INFO: renamed from: L6 */
    public void m120678L6(String str, String str2, String str3) {
        Message message = new Message();
        message.answerOfMessage = str2;
        message.answerIdOfAnswer = str3;
        message.value = str;
        message.messageType = MessageType.get("text");
        if (m120769f4(mo120828r3())) {
            return;
        }
        ((tqz) this.viewModel).m190342z1(message, true, null);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m120680M4() {
        Message message = new Message();
        message.messageType = MessageType.get(MessageType.chatroom_share);
        message.msgData = "{\n  \"title\": \"这个是title\",\n  \"desc\": \"这个是desc\",\n  \"liveId\": \"3000012314\",\n  \"roomId\": \"roomId\",\n  \"schemaSearch\": \"SCHEMA_SEARCH\"\n}";
        CoreModule.f17545c.f19642f0.m32623Dn(m120783i3(), message, null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ C22306c m120681M5(roj0 roj0Var) {
        return CoreModule.f17545c.f19642f0.m32902ap(this.f96911c);
    }

    /* JADX INFO: renamed from: M6 */
    public void m120682M6(File file, String str, float f) {
        o6j0.m162859c("e_message_voice_send", pageId(), new o6j0.C18854a[0]);
        File file2 = new File(file.getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        file.renameTo(file2);
        Message message = new Message();
        Audio audio = new Audio();
        audio.url = rhi.m179355B(file2.getAbsolutePath());
        audio.mediaType = str;
        audio.duration = f;
        audio.status = MediaLocalStatus.get("raw");
        ArrayList arrayList = new ArrayList();
        message.media = arrayList;
        arrayList.add(audio);
        message.messageType = MessageType.get("audio");
        ((tqz) this.viewModel).m190342z1(message, true, null);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m120683N2(String str) {
        if (TextUtils.equals(this.f96884B, str)) {
            int iM200293G = vwb.m200293G(this.f96928r.f153135a, new w9j() { // from class: l.z7z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f202089a.m120860y4((Message) obj);
                }
            }) + 1;
            if (iM200293G > 0 && iM200293G < this.f96928r.f153135a.size()) {
                Message message = this.f96928r.f153135a.get(iM200293G);
                if (message.isOtherUser() && !vwb.m200296J(message.media) && (message.media.get(0) instanceof Audio) && !message.audio().audioRead && !m120819p4(message.f56011id) && !m120739Z3(message) && !m156455e0().mo48976t0().m143727N0(message._id)) {
                    m120822p7(message, true);
                    return;
                }
            }
            this.f96884B = null;
            this.f96935y = true;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m120684N4() {
        act().postDelayed(new Runnable() { // from class: l.pbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f148123a.m120680M4();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C22306c m120685N5(roj0 roj0Var) {
        return CoreModule.f17545c.f19642f0.m32902ap(this.f96911c);
    }

    /* JADX INFO: renamed from: N6 */
    public void m120686N6(final String str) {
        act().postDelayed(new Runnable() { // from class: l.xaz
            @Override // java.lang.Runnable
            public final void run() {
                this.f191855a.m120677L5(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m120687O4() {
        C4759y.m34899g3(this.f96910b).materialize().subscribe();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ C22306c m120688O5(roj0 roj0Var) {
        return CoreModule.f17545c.f19642f0.m32902ap(this.f96911c);
    }

    /* JADX INFO: renamed from: O6 */
    public void m120689O6(String str) {
        if (CoreModule.m29935P().m94658i().mo158389i()) {
            CoreModule.f17545c.f19642f0.m32726Mf(m120783i3());
        }
        if (CoreModule.m29935P().m94658i().mo158458v5()) {
            CoreModule.f17545c.f19642f0.m32602Cf(m120783i3());
        }
        if (this.f96919k.userMessageCount == 0 && !TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158256K1(this.f96911c))) {
            ConversationQuickChat conversationQuickChat = this.f96919k.property.quickchat;
            if (conversationQuickChat.bell) {
                CoreModule.f17545c.f19558D0.m34862y4(CoreModule.m29935P().m94658i().mo158256K1(this.f96911c)).switchMap(new w9j() { // from class: l.b8z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f74188a.m120681M5((roj0) obj);
                    }
                }).subscribe((z3g0<? super R>) mkd0.m154950B());
            } else if (conversationQuickChat.speed) {
                CoreModule.f17545c.f19558D0.m34827C4(CoreModule.m29935P().m94658i().mo158256K1(this.f96911c)).switchMap(new w9j() { // from class: l.c8z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f79832a.m120685N5((roj0) obj);
                    }
                }).subscribe((z3g0<? super R>) mkd0.m154950B());
            } else if (conversationQuickChat.oneside) {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p9) && !userM169527p9.isFemale()) {
                    CoreModule.f17545c.f19558D0.m34826B4(CoreModule.m29935P().m94658i().mo158256K1(this.f96911c), "").switchMap(new w9j() { // from class: l.d8z
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f84916a.m120688O5((roj0) obj);
                        }
                    }).subscribe((z3g0<? super R>) mkd0.m154950B());
                }
            }
        }
        m120655H2(str);
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m120690P2() {
        if (!CoreModule.m29935P().m94658i().mo158465x()) {
            return false;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f96910b);
        if (NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "dismissed") && NullChecker.m81303a(conversationM32856Xe.additional) && NullChecker.m81303a(conversationM32856Xe.additional.quickChat)) {
            return conversationM32856Xe.additional.quickChat.avatarBlurred;
        }
        return false;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m120691P3() {
        if (y19.m212153M()) {
            r9m.m178395r().m178398C(false);
            if (!mo120764e4()) {
                duringCreated(new v9j() { // from class: l.p7z
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f147551a.m120830r5();
                    }
                }).filter(new w9j() { // from class: l.t8z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) ((xaj0) obj).f191751a).onlineMatch());
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.e9z
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        fcz.m120589l2((xaj0) obj);
                    }
                }));
            }
            if (mqi0.m155944o() > CoreModule.f17545c.f19639e0.f149392i3.get().longValue()) {
                duringCreated(C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.p9z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Integer.valueOf(CoreModule.f17545c.f19642f0.m33026lf());
                    }
                }).filter(new w9j() { // from class: l.aaz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > y19.m212145E());
                    }
                }).flatMap(new w9j() { // from class: l.laz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f127254a.m120835s5((Integer) obj);
                    }
                }).filter(new w9j() { // from class: l.waz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        IceBreakFriendData iceBreakFriendData = (IceBreakFriendData) obj;
                        return Boolean.valueOf(NullChecker.m81303a(iceBreakFriendData) && !vwb.m200296J(iceBreakFriendData.friends) && iceBreakFriendData.friends.size() >= 3);
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.hbz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        fcz.m120610s2((IceBreakFriendData) obj);
                    }
                }, new e30() { // from class: l.sbz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        fcz.m120585k1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m120692P4() {
        act().postDelayed(new Runnable() { // from class: l.kbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f122278a.m120687O4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m120693P5(Message message, roj0 roj0Var) {
        m120647E6(message.f56011id);
    }

    /* JADX INFO: renamed from: P6 */
    public void m120694P6() {
        try {
            if (this.f96919k == null) {
                return;
            }
            CoreModule.m29935P().m94658i().mo158361d0(this.f96919k.f56011id);
        } catch (NullPointerException e) {
            CrashHelper.m81297d(new Exception("MessageAct sendInputtingMsg:" + e.getMessage(), e), 100);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean mo120695Q2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: Q3 */
    public void m120696Q3() {
        lifecycle().filter(new w9j() { // from class: l.m8z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.n8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137711a.m120840t5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m120697Q4() {
        act().dialog().m20504F(this.f96910b).m20568z0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m120698Q5(Message message, Throwable th) {
        m120827q7(message.f56011id, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m120699Q6(final String str) {
        CoreAssetsSettings coreAssetsSettingsM95177g = CoreModule.f17546d.m95177g();
        if (NullChecker.m81303a(coreAssetsSettingsM95177g) && coreAssetsSettingsM95177g.autoReadConversation) {
            duringCreated(CoreModule.f17545c.f19642f0.m33126so(str).switchMap(new w9j() { // from class: l.t7z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19642f0.m32737Ne(str).filter(new w9j() { // from class: l.e8z
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(!((Conversation) obj2).read.booleanValue());
                        }
                    });
                }
            })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.u7z
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                }
            }, new yaf0()));
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean mo120700R2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m120701R4() {
        ((tqz) this.viewModel).f171712X0.m80918d("animations/singleDog/config.xml", "animations/singleDog/pic");
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m120702R5(Message message, Long l2) {
        if (m120739Z3(message)) {
            return;
        }
        m120827q7(message.f56011id, false);
    }

    /* JADX INFO: renamed from: R6 */
    public void m120703R6(Sticker sticker, boolean z) {
        Message message = new Message();
        message.sticker = sticker.f56011id;
        message.messageType = MessageType.get("sticker");
        ((tqz) this.viewModel).m190342z1(message, true, z ? sticker.mo223809clone() : null);
    }

    /* JADX INFO: renamed from: S2 */
    public boolean mo120704S2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m120705S3() {
        duringCreated(f96880F0).subscribe(mkd0.m154955G(new e30() { // from class: l.a9z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68230a.m120849v5((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m120706S4() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        if (NullChecker.m81303a(userM169430Pa)) {
            StringBuilder sb = new StringBuilder();
            for (String str : userM169430Pa.abGroups) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
            lsi0.m151580j(sb.toString());
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m120707S5(final Message message) {
        act().postDelayed(new Runnable() { // from class: l.qaz
            @Override // java.lang.Runnable
            public final void run() {
                this.f153588a.m120634B5(message);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S6 */
    public void m120708S6(String str) {
        m120713T6(str, null);
    }

    /* JADX INFO: renamed from: T2 */
    public C22306c<Conversation> mo120709T2() {
        return CoreModule.f17545c.f19642f0.m32820Ue(m120783i3());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m120710T3() {
        creates(new e30() { // from class: l.maz
            @Override // p149l.e30
            public final void call(Object obj) {
                fcz.m120543R0((Bundle) obj);
            }
        }, new d30() { // from class: l.naz
            @Override // p149l.d30
            public final void call() {
                this.f137989a.m120853w5();
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m120711T4() {
        e51.m114774y(new RunnableC16801a());
    }

    /* JADX INFO: renamed from: T5 */
    public String m120712T5() {
        return (mo120843u3() == null || TextUtils.isEmpty(mo120843u3().buttonTitle)) ? "进入直播间" : mo120843u3().buttonTitle;
    }

    /* JADX INFO: renamed from: T6 */
    public void m120713T6(String str, List<String> list) {
        m156455e0().mo48954A0().m156457g0().m128210t0();
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            messageNew_.channel = MessageChannel.get(mo120764e4() ? "group" : "default");
            messageNew_.notifiedUsers = list;
        }
        IceBreakingQuestion iceBreakingQuestionMo120855x3 = mo120855x3();
        if (NullChecker.m81303a(iceBreakingQuestionMo120855x3)) {
            messageNew_.messageType = MessageType.get(MessageType.ice_breaking);
            if (messageNew_.additionalData == null) {
                messageNew_.additionalData = MessageAdditionalData.new_();
            }
            messageNew_.additionalData.iceBreakingQuestion = iceBreakingQuestionMo120855x3;
            m156455e0().mo48954A0().m156457g0().m128189i0();
        } else if (NullChecker.m81303a(this.f96909Z)) {
            messageNew_.messageType = MessageType.get("text");
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_;
            messageReferenceNew_.type = Ref.TYPE;
            String str2 = this.f96909Z.f56011id;
            messageReferenceNew_.f20447id = str2;
            messageNew_.referenceMsgId = str2;
            m156455e0().mo48954A0().m156457g0().m128192k0();
        } else if (NullChecker.m81303a(this.f96920k0)) {
            messageNew_.messageType = MessageType.get(MessageType.moment_reference);
            MessageReference messageReferenceNew_2 = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_2;
            messageReferenceNew_2.type = "moment";
            messageReferenceNew_2.f20447id = this.f96920k0.f20446id;
            m156455e0().mo48954A0().m156457g0().m128192k0();
        } else {
            messageNew_.messageType = MessageType.get("text");
        }
        ((tqz) this.viewModel).m190342z1(messageNew_, true, null);
    }

    /* JADX INFO: renamed from: U2 */
    public C22306c<Conversation> mo120714U2() {
        return CoreModule.f17545c.f19642f0.m32737Ne(m120783i3());
    }

    /* JADX INFO: renamed from: U3 */
    public void m120715U3() {
        if (CoreModule.m29935P().m94658i().mo158354c() && !m120794k4(this.f96910b) && m120789j4()) {
            if (TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158289Q1(this.f96910b))) {
                duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b), CoreModule.f17545c.f19642f0.m33022ko(this.f96910b, this.f96911c).distinctUntilChanged(), new hae0())).filter(new w9j() { // from class: l.z9z
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        j760 j760Var = (j760) obj;
                        return Boolean.valueOf(((User) j760Var.f116564a).onlineMatch() && (NullChecker.m81303a(((j760) j760Var.f116565b).f116564a) || NullChecker.m81303a(((j760) j760Var.f116565b).f116565b)));
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.baz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f74750a.m120865z5((j760) obj);
                    }
                }));
            }
            duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b)).distinctUntilChanged(new x9j() { // from class: l.caz
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                }
            }).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.daz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85275a.m120857x5((User) obj);
                }
            }));
            if (CoreModule.m29935P().m94658i().mo158352b4()) {
                duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b)).filter(new w9j() { // from class: l.eaz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).onlineMatch());
                    }
                }).distinctUntilChanged(new x9j() { // from class: l.faz
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.gaz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f101724a.m120861y5((User) obj);
                    }
                }, new e30() { // from class: l.haz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        fcz.m120508A2((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ Boolean m120716U4(Message message) {
        boolean zEquals;
        if (m120734Y3()) {
            zEquals = TEnum.equals(message.channel, "anonymous");
        } else {
            zEquals = !TEnum.equals(message.channel, "anonymous");
        }
        return Boolean.valueOf(zEquals);
    }

    /* JADX INFO: renamed from: U5 */
    public String m120717U5() {
        return (mo120843u3() == null || TextUtils.isEmpty(mo120843u3().subTitle)) ? "多人连线已开启，等你加入" : mo120843u3().subTitle;
    }

    /* JADX INFO: renamed from: U6 */
    public void m120718U6(final Message message) {
        Message message2 = new Message();
        message2.sticker = CoreModule.f17554l.m94658i().mo158214C4() ? "9619" : "12602718";
        message2.messageType = MessageType.get("sticker");
        ((tqz) this.viewModel).m190342z1(message2, true, null);
        ChatGiftInfoExtra chatGiftInfoExtraMo158257K2 = CoreModule.m29935P().m94658i().mo158257K2(message);
        if (!NullChecker.m81303a(chatGiftInfoExtraMo158257K2) || TextUtils.isEmpty(chatGiftInfoExtraMo158257K2.giftRecordId)) {
            return;
        }
        CoreModule.f17545c.f19643f1.m118078p4(chatGiftInfoExtraMo158257K2.giftRecordId).subscribe(mkd0.m154956H(new e30() { // from class: l.i8z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112084a.m120693P5(message, (roj0) obj);
            }
        }, new e30() { // from class: l.j8z
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214926D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public boolean mo120719V2() {
        return true;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m120720V4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && Act.isFromBackground) {
            CoreModule.m29935P().m94658i().mo158302S3(act());
        }
    }

    /* JADX INFO: renamed from: V5 */
    public String m120721V5() {
        return (mo120843u3() == null || TextUtils.isEmpty(mo120843u3().mainTitle)) ? "正在视频直播" : mo120843u3().mainTitle;
    }

    /* JADX INFO: renamed from: V6 */
    public void m120722V6(r5l0 r5l0Var) {
        m156455e0().mo48971c0().m156457g0().mo134710k(0, -1);
        Message message = new Message();
        message.media = new ArrayList();
        Video video = new Video();
        video.url = rhi.m179355B(r5l0Var.f157830a);
        video.status = MediaLocalStatus.get("raw");
        message.media.add(video);
        message.messageType = MessageType.get("video");
        m120707S5(message);
    }

    /* JADX INFO: renamed from: W2 */
    public String m120723W2() {
        if (!(act() instanceof MessagesAct)) {
            return "0";
        }
        Conversation conversationM48977u2 = ((MessagesAct) act()).m48977u2();
        return NullChecker.m81303a(conversationM48977u2) ? conversationM48977u2.readUntil : "0";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX INFO: renamed from: W3 */
    public final void m120724W3() {
        String str;
        if (this.f96905V) {
            return;
        }
        this.f96905V = true;
        if (CoreModule.m29935P().m94658i().mo158270M4()) {
            Conversation conversation = this.f96919k;
            if (conversation.unreadMessages > 0 || !NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(this.f96919k.additional.localMomentInfo) || TextUtils.isEmpty(this.f96919k.additional.localMomentInfo.newMomentId)) {
                str = null;
            } else {
                ConversationMomentInfo conversationMomentInfo = this.f96919k.additional.localMomentInfo;
                if (TextUtils.equals(conversationMomentInfo.newMomentId, conversationMomentInfo.lastShowedMomentId)) {
                    str = null;
                } else {
                    Conversation conversation2 = this.f96919k;
                    ConversationMomentInfo conversationMomentInfo2 = conversation2.additional.localMomentInfo;
                    str = conversationMomentInfo2.newMomentId;
                    conversationMomentInfo2.lastShowedMomentId = str;
                    mrz.m156105n(conversation2.mo223809clone()).subscribe(mkd0.m154956H(new e30() { // from class: l.nbz
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            fcz.m120537O1((roj0) obj);
                        }
                    }, new e30() { // from class: l.obz
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            fcz.m120623y0((Throwable) obj);
                        }
                    }));
                    m156455e0().mo48973j0().m199794l0(true);
                }
            }
            if ((this.f96918j instanceof User) && !CoreModule.f17545c.f19642f0.f19868J0.get().equals(this.f96911c)) {
                if ((CoreModule.m29935P().m94658i().mo158354c() && ((User) this.f96918j).onlineMatchLocked()) || ((User) this.f96918j).unilateralBlock() || m120794k4(this.f96911c) || this.f96919k.isAnonymous() || mo120764e4() || User.isTeamAccount(this.f96911c)) {
                    return;
                }
                CoreModule.m29935P().m94658i().mo158208B3(this.f96911c);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                CoreModule.m29934N().mo60398va(act(), this.f96911c, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ Boolean m120725W4(j760 j760Var) {
        return Boolean.valueOf(m120819p4((String) j760Var.f116565b));
    }

    /* JADX INFO: renamed from: W5 */
    public User m120726W5() {
        return this.f96917i;
    }

    /* JADX INFO: renamed from: W6 */
    public void m120727W6(String str) {
        this.f96936z.add(str);
    }

    /* JADX INFO: renamed from: X2 */
    public void m120728X2() {
        boolean z;
        if (NullChecker.m81303a(CoreModule.f17546d.m95177g()) && NullChecker.m81303a(CoreModule.f17546d.m95177g().keepConnection)) {
            this.f96906W = CoreModule.f17546d.m95177g().keepConnection.chatTypingInterval;
            z = CoreModule.f17546d.m95177g().keepConnection.chatTypingOpen;
        } else {
            z = false;
        }
        mkd0.m154992z(this.f96907X);
        if (this.f96906W < 0 || !z) {
            this.f96907X = null;
            return;
        }
        m120694P6();
        int i = this.f96906W;
        this.f96907X = C22306c.interval(i == 0 ? 10L : i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.xbz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191974a.m120864z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m120729X3(String str) {
        String str2;
        Conversation conversationM120788j3 = m120788j3();
        if (conversationM120788j3 == null) {
            return false;
        }
        if ("messages_title".equals(str)) {
            str2 = "navbar_avatar";
        } else if ("profile_bubble".equals(str)) {
            str2 = "user_card";
        } else {
            str2 = ("messages_thumbnail_left".equals(str) || "from_greet_act".equals(str)) ? "user_avatar" : null;
        }
        return xp5.m210462b(act(), conversationM120788j3, pageId(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m120730X4(j760 j760Var) {
        m120821p6((String) j760Var.f116564a, (String) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m120731X5(ArrayList<j760<String, d30>> arrayList, final String str, final int i) {
        arrayList.add(vwb.m200311Y("send me messages 1 - " + i, new d30() { // from class: l.rbz
            @Override // p149l.d30
            public final void call() {
                this.f158697a.m120642D5(i, str);
            }
        }));
    }

    /* JADX INFO: renamed from: X6 */
    public void m120732X6(Message message) {
        if (NullChecker.m81303a(message)) {
            message.fromConvType = "";
            int i = this.f96912d;
            if (i == 26) {
                message.fromConvType = "new_match";
                return;
            }
            if (i == 27) {
                message.fromConvType = NotificationCompat.CATEGORY_RECOMMENDATION;
                return;
            }
            if (i == 28) {
                message.fromConvType = "all_matches";
            } else if (i == 29) {
                message.fromConvType = "chat_list";
            } else if (i == 30) {
                message.fromConvType = "quickchat_again";
            }
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public boolean mo120733Y2() {
        return false;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m120734Y3() {
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m120735Y4(ChatHeatActionData chatHeatActionData) {
        if (TextUtils.equals(chatHeatActionData.userId, m120783i3())) {
            su4.m185994d(m120842t7().act(), chatHeatActionData);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m120736Y5() {
        Intent intent;
        Act act = act();
        if (act == null || (intent = act.getIntent()) == null || !intent.hasExtra("move_by_message_id")) {
            return;
        }
        final String stringExtra = intent.getStringExtra("move_by_message_id");
        if (TextUtils.isEmpty(stringExtra) || ((tqz) this.viewModel).m190310j0() == null) {
            return;
        }
        final List<Message> listM139109a0 = ((tqz) this.viewModel).m190310j0().m139109a0();
        if (vwb.m200296J(listM139109a0)) {
            return;
        }
        e51.m114743H(act, new Runnable() { // from class: l.tbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f169369a.m120646E5(listM139109a0, stringExtra);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m120737Y6(double d) {
        MessageWarmingUpHelper.m49192v("currentTempDownDegree = " + d);
        this.f96902S = d;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        final Intent intent = act().getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        this.f96911c = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f96911c = intent.getStringExtra("userId");
        }
        this.f96912d = intent.getIntExtra("FROM", -1);
        this.f96913e = intent.getStringExtra("sub_from");
        this.f96914f = intent.getStringExtra("theme_type");
        this.f96915g = intent.getStringExtra("greet_from");
        this.f96889F = new hpd0("send_message_tip_" + this.f96910b, Boolean.FALSE);
        String strMo120828r3 = mo120828r3();
        this.f96910b = strMo120828r3;
        if (TextUtils.isEmpty(strMo120828r3)) {
            StringBuilder sb = new StringBuilder("MessagesAct error: userId is null, from = ");
            sb.append(this.f96912d);
            sb.append(Constants.SEPARATOR_COMMA);
            Bundle extras = intent.getExtras();
            if (NullChecker.m81303a(extras)) {
                Set<String> setKeySet = extras.keySet();
                sb.append("extras: ");
                for (String str : setKeySet) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(extras.get(str));
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            CrashHelper.m81296c(new Exception(sb.toString()));
        }
        if (CoreModule.m29935P().m94658i().mo158454v() && this.f96912d == 31) {
            e51.m114742G(new Runnable() { // from class: l.uaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175661a.m120810n5(intent);
                }
            });
        }
        if (CoreModule.m29935P().m94658i().mo158354c()) {
            CoreModule.m29935P().m94658i().mo158470x5(false);
        }
        this.f96898O = this.f96897N.get().booleanValue();
    }

    @SuppressLint({"SV_USE_DUP_ID"})
    /* JADX INFO: renamed from: Z2 */
    public ArrayList<j760<String, d30>> mo120738Z2() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        final String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        arrayList.add(vwb.m200311Y("English long text", new d30() { // from class: l.b9z
            @Override // p149l.d30
            public final void call() {
                this.f74640a.m120629A4(str);
            }
        }));
        arrayList.add(vwb.m200311Y("send me a text message", new d30() { // from class: l.n9z
            @Override // p149l.d30
            public final void call() {
                this.f137846a.m120633B4();
            }
        }));
        arrayList.add(vwb.m200311Y("recall the last message from me", new d30() { // from class: l.r9z
            @Override // p149l.d30
            public final void call() {
                this.f158462a.m120637C4();
            }
        }));
        arrayList.add(vwb.m200311Y("send me a text message with 3 sec delay", new d30() { // from class: l.s9z
            @Override // p149l.d30
            public final void call() {
                this.f163248a.m120645E4();
            }
        }));
        arrayList.add(vwb.m200311Y("toggle apple watch mode", new d30() { // from class: l.t9z
            @Override // p149l.d30
            public final void call() {
                this.f169083a.m120649F4();
            }
        }));
        arrayList.add(vwb.m200311Y("send me a message with same content as last", new d30() { // from class: l.u9z
            @Override // p149l.d30
            public final void call() {
                this.f175541a.m120652G4();
            }
        }));
        arrayList.add(vwb.m200311Y("send me a message with same content as last with 3 sec delay", new d30() { // from class: l.v9z
            @Override // p149l.d30
            public final void call() {
                this.f180684a.m120662I4();
            }
        }));
        arrayList.add(vwb.m200311Y("send messages 1 - 1000", new d30() { // from class: l.w9z
            @Override // p149l.d30
            public final void call() {
                this.f185413a.m120672K4(str);
            }
        }));
        arrayList.add(vwb.m200311Y("send messages 1 - 10", new d30() { // from class: l.x9z
            @Override // p149l.d30
            public final void call() {
                this.f191671a.m120676L4();
            }
        }));
        arrayList.add(vwb.m200311Y("send message delayed 5 sec", new d30() { // from class: l.y9z
            @Override // p149l.d30
            public final void call() {
                this.f197095a.m120684N4();
            }
        }));
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 5);
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 25);
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 50);
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 100);
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 200);
        m120731X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 1000);
        arrayList.add(vwb.m200311Y("make the other user block me delay 3 sec", new d30() { // from class: l.c9z
            @Override // p149l.d30
            public final void call() {
                this.f79994a.m120692P4();
            }
        }));
        arrayList.add(vwb.m200311Y("toggle slow motion anim adapter", new d30() { // from class: l.d9z
            @Override // p149l.d30
            public final void call() {
                fcz.m120566c2();
            }
        }));
        arrayList.add(vwb.m200311Y("unlock stickers now", new d30() { // from class: l.f9z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19624Z.f20142S.m34932E();
            }
        }));
        arrayList.add(vwb.m200311Y("animation duration -100 miliseconds", new d30() { // from class: l.g9z
            @Override // p149l.d30
            public final void call() {
                fcz.m120529J1();
            }
        }));
        arrayList.add(vwb.m200311Y("animation duration +100 miliseconds", new d30() { // from class: l.h9z
            @Override // p149l.d30
            public final void call() {
                fcz.m120601p2();
            }
        }));
        arrayList.add(vwb.m200311Y("show user id", new d30() { // from class: l.i9z
            @Override // p149l.d30
            public final void call() {
                this.f112271a.m120697Q4();
            }
        }));
        arrayList.add(vwb.m200311Y("animate particles", new d30() { // from class: l.j9z
            @Override // p149l.d30
            public final void call() {
                this.f116989a.m120701R4();
            }
        }));
        arrayList.add(vwb.m200311Y("show current user abGroups", new d30() { // from class: l.k9z
            @Override // p149l.d30
            public final void call() {
                this.f122080a.m120706S4();
            }
        }));
        arrayList.add(vwb.m200311Y("直播小助手展示欢迎", new d30() { // from class: l.l9z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32810Tg(null);
            }
        }));
        arrayList.add(vwb.m200311Y("清空直播小助手", new d30() { // from class: l.m9z
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32690Jf();
            }
        }));
        arrayList.add(vwb.m200311Y("当前聊天的ID:" + mo120828r3(), new d30() { // from class: l.o9z
            @Override // p149l.d30
            public final void call() {
                fcz.m120528J0();
            }
        }));
        arrayList.add(vwb.m200311Y("reset cleanbot status", new d30() { // from class: l.q9z
            @Override // p149l.d30
            public final void call() {
                this.f153490a.m120711T4();
            }
        }));
        arrayList.addAll(q2z.m172698u2(this));
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m120739Z3(Message message) {
        return NullChecker.m81303a(message.localAudioText) && TEnum.equals(message.localAudioText.status, "default") && !TextUtils.isEmpty(message.localAudioText.translationResult);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m120740Z4(Boolean bool) {
        if (bool.booleanValue()) {
            ((tqz) this.viewModel).m190274T1();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m120741Z5() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: Z6 */
    public void m120742Z6(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m49192v("setCurrentTempLevel = " + warmingUpLevel);
        this.f96900Q = warmingUpLevel;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m120671K3();
        m120535N3();
        m120545R3();
        m120666J3();
        m120705S3();
        m120532M3();
        m120710T3();
        m120538O3();
        m120661I3();
        m120640D3();
        m120644E3();
        m120696Q3();
        m120656H3();
        m120691P3();
        m120553V3();
    }

    /* JADX INFO: renamed from: a3 */
    public void m120743a3() {
        mkd0.m154992z(this.f96907X);
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m120744a4(User user) {
        return false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ C22306c m120745a5() {
        return CoreModule.f17545c.f19642f0.m33116se(m120783i3());
    }

    /* JADX INFO: renamed from: a6 */
    public boolean mo120746a6() {
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public void m120747a7(double d) {
        MessageWarmingUpHelper.m49192v("setCurrentTempUpDegree = " + d);
        this.f96901R = d;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m120749b4() {
        return TextUtils.equals(m120859y3(), "all_match_new_match") || TextUtils.equals(m120859y3(), "one_new_match") || TextUtils.equals(m120859y3(), "all_new_match") || TextUtils.equals(m120859y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ Boolean m120750b5(roj0 roj0Var) {
        return Boolean.valueOf(mo120746a6());
    }

    /* JADX INFO: renamed from: b6 */
    public boolean mo120751b6() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m120754c4(String str) {
        return false;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m120755c5(roj0 roj0Var) {
        if (m120754c4(mo120828r3()) || m120794k4(m120783i3()) || m120759d4()) {
            return;
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: c6 */
    public boolean mo120756c6() {
        return false;
    }

    /* JADX INFO: renamed from: c7 */
    public void m120757c7(Message message) {
        this.f96909Z = message;
        this.f96920k0 = null;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m120759d4() {
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m120760d5(Bundle bundle) {
        CoreModule.f17545c.f19642f0.m33089pq(this.f96910b);
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public boolean mo120761d6() {
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public void m120762d7(MessageMomentGuide messageMomentGuide) {
        this.f96920k0 = messageMomentGuide;
        this.f96909Z = null;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean mo120764e4() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22306c m120765e5() {
        return mkd0.m154986t(mo120833s3(this.f96910b), CoreModule.f17545c.f19639e0.m169523o9(), mo120709T2(), this.f96894K, new z9j() { // from class: l.wbz
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return fcz.m120587l0(obj, (User) obj2, (Conversation) obj3, (roj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public boolean mo120766e6() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public boolean m120767e7(String str) {
        boolean zEquals = TextUtils.equals(this.f96888E0, str);
        boolean z = !zEquals;
        if (!zEquals) {
            this.f96888E0 = str;
        }
        return z;
    }

    /* JADX INFO: renamed from: f3 */
    public C22306c<Boolean> m120768f3(String str, String str2, String str3, final String str4, Message message) {
        return duringCreated(CoreModule.f17545c.f19642f0.m32845Wf(str, str2, str3, str4, message)).map(new w9j() { // from class: l.w7z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str4));
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m120769f4(String str) {
        if (CoreModule.m29935P().m94658i().mo158478z(str)) {
            lsi0.m151593w(R$string.f20753F4);
            return true;
        }
        if (!ruy.m181215g().m181218e(str)) {
            return false;
        }
        lsi0.m151593w(R$string.f20761G4);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m120770f5(xaj0 xaj0Var) {
        this.f96919k = (Conversation) xaj0Var.f191753c;
        if (!mo120764e4()) {
            this.f96931u = !TextUtils.isEmpty(m120783i3()) && CoreModule.m29932K().mo30819sg(m120783i3());
        }
        if (this.f96919k == null) {
            return;
        }
        this.f96917i = (User) xaj0Var.f191752b;
        H h = (H) xaj0Var.f191751a;
        this.f96918j = h;
        mo120748b3(h);
        if (tqm0.m190131p().m190146s() && !(this instanceof j7z) && !(this instanceof mcz) && (this.f96918j instanceof User)) {
            m156455e0().mo48959E().m194283y0().mo146634n((User) this.f96918j, this.f96919k);
        }
        ((tqz) this.viewModel).f171758t1.mo180269j();
        ((tqz) this.viewModel).mo103177D0();
        m120724W3();
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m120771f6() {
        List listM15930q;
        int iM200293G;
        if (m156455e0().mo48976t0().m143728O0() && (iM200293G = vwb.m200293G((listM15930q = Lists.m15930q(this.f96928r.f153135a)), new w9j() { // from class: l.y7z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196753a.m120650F5((Message) obj);
            }
        })) > 0) {
            for (int i = iM200293G - 1; i >= 0; i--) {
                Message message = (Message) listM15930q.get(i);
                if (message.isOtherUser() && NullChecker.m81303a(message.audio()) && !message.audio().audioRead) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public boolean m120772f7(Message message) {
        m120778h3();
        return this.f96935y && TextUtils.equals(this.f96933w, message.f56011id);
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m120774g4() {
        if (!mo120799l4() || !CoreModule.m29935P().m94658i().mo158243I0() || CoreModule.m29932K().me_().isFemale() || CoreModule.m29935P().m94658i().mo33623ws() > 0) {
            return false;
        }
        CoreModule.m29935P().m94651a().mo33534l1(act(), "message");
        return true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m120775g5(Message message) {
        this.f96922m = message;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean mo120776g6() {
        return true;
    }

    /* JADX INFO: renamed from: g7 */
    public boolean m120777g7(Message message) {
        return m120739Z3(message) && this.f96936z.contains(message.f56011id);
    }

    /* JADX INFO: renamed from: h3 */
    public void m120778h3() {
        if (!TextUtils.isEmpty(this.f96933w)) {
            Message messageQuery = CoreModule.f17553k.f91940c.query(this.f96933w);
            if (NullChecker.m81303a(messageQuery) && NullChecker.m81303a(messageQuery.recalled) && !messageQuery.recalled.booleanValue()) {
                return;
            }
        }
        Message message = this.f96934x > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (Message) vwb.m200346r(CoreModule.f17545c.f19642f0.m33092qg(m120783i3(), this.f96934x), this.f96926p0) : (Message) vwb.m200346r(CoreModule.f17545c.f19642f0.m33131tg(m120783i3()), this.f96926p0);
        if (!NullChecker.m81303a(message)) {
            m120669J6();
        } else {
            this.f96933w = message.f56011id;
            this.f96934x = message.createdTime;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo120779h4() {
        return false;
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ C22306c m120780h5(Conversation conversation) {
        return CoreModule.f17545c.f19642f0.m32853Wn(m120783i3(), conversation.clearedUntil);
    }

    /* JADX INFO: renamed from: h6 */
    public boolean m120781h6(int i, int i2, Intent intent) {
        if (i == 16) {
            if (i2 == -1) {
                act().m66873d2();
                act().overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i != 48) {
            if (i == 64 && i2 == -1) {
                act().setResult(-1, intent);
                act().m66873d2();
                return true;
            }
            if (i != 10111 || i2 != -1) {
                return false;
            }
            ((tqz) this.viewModel).m190290a2();
            return true;
        }
        if (i2 == -1) {
            DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
            Message message = new Message();
            MessageLocation messageLocation = new MessageLocation();
            message.location = messageLocation;
            messageLocation.coordinates = doublePair;
            messageLocation.name = intent.getStringExtra("map_name");
            message.location.address = intent.getStringExtra("map_address");
            message.messageType = MessageType.get("location");
            m120707S5(message);
        }
        return true;
    }

    /* JADX INFO: renamed from: h7 */
    public boolean m120782h7() {
        return CoreModule.m29935P().m94658i().mo158348b() && mo120843u3() != null;
    }

    /* JADX INFO: renamed from: i3 */
    public String m120783i3() {
        return this.f96911c;
    }

    /* JADX INFO: renamed from: i4 */
    public boolean m120784i4() {
        return TextUtils.equals(m120859y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ C22306c m120785i5() {
        return mkd0.m154986t(mo120714U2(), this.f96921l, mo120833s3(this.f96910b), this.f96895L, new z9j() { // from class: l.qbz
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return fcz.m120570e2((Conversation) obj, (q860) obj2, obj3, (roj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public final void m120786i6(final AudioText audioText) {
        e51.m114743H(act(), new Runnable() { // from class: l.zbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f202503a.m120658H5(audioText);
            }
        }, m120670K2());
    }

    /* JADX INFO: renamed from: i7 */
    public boolean mo120787i7() {
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public Conversation m120788j3() {
        return this.f96919k;
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m120789j4() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        return NullChecker.m81303a(userM169430Pa) && userM169430Pa.onlineMatchLocked();
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m120790j5() {
        Conversation conversation = this.f96919k;
        conversation.localDraft = "";
        CoreModule.f17545c.f19642f0.m33050mq(conversation);
    }

    /* JADX INFO: renamed from: j6 */
    public final boolean m120791j6() {
        if (y19.m212153M() && r9m.m178395r().m178402q(mqi0.m155944o())) {
            r9m.m178395r().m178401F(act());
            return true;
        }
        if (CoreModule.m29935P().m94651a().mo33531kb() && lz4.m152319h().m152331n() && m156455e0().mo48974l().m120749b4() && !m120744a4(m156455e0().mo48974l().m120851w3(m156455e0().mo48974l().mo120828r3()))) {
            lz4.m152321v(act(), lz4.m152319h().m152324f());
            return true;
        }
        if (m156455e0().mo48971c0().m156457g0().mo134705d()) {
            return true;
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && !CoreModule.m29935P().m94658i().mo158400k1() && CoreModule.m29935P().m94658i().mo158479z0() && NullChecker.m81303a(this.f96919k) && !this.f96919k.localEverHasMessage && NullChecker.m81303a(mo120858x6()) && mo120858x6().onlineMatchLocked() && !m120794k4(mo120828r3())) {
            CoreModule.m29935P().m94658i().mo158298S();
            CoreModule.m29935P().m94658i().mo158362d1(act());
            return true;
        }
        if (!CoreModule.m29935P().m94652b().mo35107Yg() || !NullChecker.m81303a(this.f96919k) || !CoreModule.m29935P().m94652b().mo35118lo(this.f96919k)) {
            return false;
        }
        CoreModule.m29935P().m94652b().mo35104Wl(act());
        return true;
    }

    /* JADX INFO: renamed from: j7 */
    public C22392a<Boolean> mo120792j7() {
        return C22392a.m221512b();
    }

    /* JADX INFO: renamed from: k3 */
    public double m120793k3() {
        return this.f96902S;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m120794k4(String str) {
        if (!CoreModule.m29935P().m94658i().mo158465x()) {
            return false;
        }
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        return NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "dismissed");
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m120795k5() {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.ybz
            @Override // p149l.d30
            public final void call() {
                this.f197378a.m120790j5();
            }
        });
    }

    /* JADX INFO: renamed from: k7 */
    public boolean m120797k7() {
        if (!mo120802l7() || !NullChecker.m81303a(this.f96919k.additional) || !NullChecker.m81303a(this.f96919k.additional.matchInfo)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f96919k.additional.matchInfo.source) && this.f96919k.additional.matchInfo.matchTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        ConvAdditionalMatchInfo convAdditionalMatchInfo = this.f96919k.additional.matchInfo;
        return convAdditionalMatchInfo.likeTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && convAdditionalMatchInfo.likedByTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: l3 */
    public MessageWarmingUpHelper.WarmingUpLevel m120798l3() {
        return this.f96900Q;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean mo120799l4() {
        return false;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Boolean m120800l5(Message message) {
        Boolean bool;
        return Boolean.valueOf(m156455e0().mo48976t0().m143727N0(message._id) && ((bool = message.recalled) == null || !bool.booleanValue()) && NullChecker.m81303a(message.audio()));
    }

    /* JADX INFO: renamed from: l6 */
    public boolean mo120801l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        act().m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: l7 */
    public boolean mo120802l7() {
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public double m120803m3() {
        return this.f96901R;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m120804m4(Message message) {
        return NullChecker.m81303a(message) && TextUtils.equals(message.f56011id, this.f96933w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [B, l.q860] */
    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m120805m5(xaj0 xaj0Var) {
        this.f96919k = (Conversation) xaj0Var.f191751a;
        this.f96918j = (H) xaj0Var.f191753c;
        if (mo120756c6()) {
            xaj0Var.f191752b = m120808n3(xaj0Var);
        }
        if (CoreModule.m29935P().m94658i().mo158403l() && !TextUtils.isEmpty(this.f96919k.localDraft)) {
            m156455e0().mo48954A0().m156457g0().m128141K1(this.f96919k.localDraft);
            e51.m114774y(new Runnable() { // from class: l.gbz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101923a.m120795k5();
                }
            });
        }
        q860<Message> q860Var = (q860) xaj0Var.f191752b;
        if (!mo120764e4()) {
            this.f96931u = !TextUtils.isEmpty(this.f96910b) && CoreModule.m29932K().mo30819sg(this.f96910b);
            if (!vwb.m200296J(q860Var.f153135a)) {
                ((tqz) this.viewModel).mo103183H1(q860Var.f153135a.get(0));
            }
        }
        if (CoreModule.m29935P().m94658i().mo158216D() && !vwb.m200296J(q860Var.f153135a)) {
            C8524b.m49065q(q860Var.f153135a.get(0));
        }
        if (m156455e0().mo48976t0().m143728O0() && !vwb.m200337m(q860Var.f153135a, new w9j() { // from class: l.ibz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112395a.m120800l5((Message) obj);
            }
        })) {
            m156455e0().mo48976t0().m143724H0().stop();
        }
        ((tqz) this.viewModel).m190310j0().m139111c0(q860Var, ((Conversation) xaj0Var.f191751a).reminder, this.f96922m);
        if (NullChecker.m81303a(m156455e0().mo48976t0().m143724H0())) {
            m156455e0().mo48976t0().m143724H0().setNeedToPlayNext(m120771f6());
        }
        ((tqz) this.viewModel).m190260K1();
        ((tqz) this.viewModel).f171758t1.mo180268h(q860Var);
        if (q860Var.f153135a.size() == 0 && q860Var.m173343c()) {
            ((tqz) this.viewModel).m190310j0().mo139114e(0);
        }
        if (q860Var.f153135a.size() > 0) {
            if (((CoreModule.m29935P().m94658i().mo158222E() && mo120764e4()) ? false : q860Var.f153135a.get(0).owner.equals(this.f96910b)) && !TextUtils.equals(this.f96919k.readUntil, q860Var.f153135a.get(0).f56011id)) {
                m120699Q6(m120783i3());
            }
            Message message = q860Var.f153135a.get(0);
            String str = this.f96924o;
            if (str == null) {
                this.f96924o = message.f56011id;
            } else if (!str.equals(message.f56011id) && !TextUtils.isEmpty(message.f56011id) && !message.f56011id.startsWith("fake_id_")) {
                this.f96924o = message.f56011id;
                if (message.isMe()) {
                    CoreModule.f17545c.f19642f0.f19922b0.m132487l(message);
                } else {
                    CoreModule.f17545c.f19642f0.f19925c0.m132487l(message);
                }
            }
        } else {
            this.f96924o = "";
        }
        if (!mo120764e4()) {
            m156455e0().mo48954A0().m156457g0().m128129E0();
        }
        if (!mo120764e4()) {
            m156455e0().mo48954A0().m156457g0().m128123A0();
        }
        if (!mo120764e4() && ruy.m181215g().m181226o(this.f96919k)) {
            if (q860Var.f153135a.isEmpty()) {
                boolean z = this.f96919k.localEverHasMessage;
                V v2 = this.viewModel;
                if (z) {
                    ((tqz) v2).m190291b2();
                } else {
                    ((tqz) v2).m190272S1();
                }
                Conversation conversation = this.f96919k;
                if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                    m156455e0().mo48954A0().m156457g0().m128156S1(mo120828r3());
                }
            } else {
                ((tqz) this.viewModel).m190272S1();
                m156455e0().mo48954A0().m156457g0().m128156S1(mo120828r3());
            }
        }
        if (!mo120764e4()) {
            m120648F3();
        }
        mo120753c3(this.f96919k, q860Var, this.f96918j);
    }

    /* JADX INFO: renamed from: m6 */
    public void m120806m6(List<Media> list) {
        m120811n6(list, 0);
    }

    /* JADX INFO: renamed from: m7 */
    public void m120807m7() {
        if (mo120843u3() == null) {
            return;
        }
        if (!TextUtils.isEmpty(mo120843u3().schema)) {
            j2e0.m139446m(act(), Uri.parse(mo120843u3().schema));
        } else {
            zvf0.m220399u("e_live_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("liveId", mo120843u3().liveId), vwb.m200311Y("anchorId", mo120843u3().userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("show_label", "连线"), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "NA"));
            CoreModule.m29936Q().startAudienceLive(act(), mo120843u3().liveId, "chat", null);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final q860 m120808n3(xaj0<Conversation, q860<Message>, H> xaj0Var) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(xaj0Var.f191752b) && !vwb.m200296J(xaj0Var.f191752b.f153135a)) {
            arrayList = vwb.m200339n(xaj0Var.f191752b.f153135a, new w9j() { // from class: l.r7z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f158110a.m120716U4((Message) obj);
                }
            });
            if (!vwb.m200296J(arrayList) && !vwb.m200337m(arrayList, new w9j() { // from class: l.s7z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(NullChecker.m81303a(message) && !message.f56011id.startsWith("fake_id_"));
                }
            })) {
                arrayList = new ArrayList();
            }
        }
        return new q860(arrayList, xaj0Var.f191752b.f153136b);
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m120809n4(String str) {
        return this.f96936z.contains(str);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m120810n5(Intent intent) {
        if (TextUtils.equals(intent.getStringExtra("ISCALLEER"), "1")) {
            tqm0.m190131p().m190136h(act(), this.f96911c, "voiceQuickChat");
        } else {
            tqm0.m190131p().m190133e();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m120811n6(List<Media> list, int i) {
        if (list.size() <= 0 || !(list.get(0) instanceof Video)) {
            m120639C6(list, i);
        } else {
            m120836s6(rhi.m179382z(((Video) list.get(0)).url));
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m120812n7() {
        zvf0.m220368A("e_live_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("liveId", mo120843u3().liveId), vwb.m200311Y("anchorId", mo120843u3().userId), vwb.m200311Y("live_status", "on"), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("show_label", "连线"), vwb.m200311Y("liveRecommendCategory", "NA"));
    }

    /* JADX INFO: renamed from: o3 */
    public int m120813o3() {
        return this.f96912d;
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m120814o4(String str) {
        if (!TextUtils.equals(this.f96885C, str)) {
            return false;
        }
        this.f96885C = null;
        return true;
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m120815o5(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            ((tqz) this.viewModel).m190302g0();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m120816o6(Menu menu) {
        Menu menu2;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        if (!CoreModule.m29935P().m94658i().mo158354c() || !NullChecker.m81303a(userM169430Pa) || !userM169430Pa.onlineMatch() || m120794k4(this.f96910b) || CoreModule.m29935P().m94658i().mo158233G1()) {
            return false;
        }
        if (userM169430Pa.onlineMatchLocked()) {
            menu.removeItem(2);
        } else if (menu.findItem(2) == null) {
            CoreModule.m29935P().m94658i().mo158328W5(true, menu, this.f96910b, act());
        }
        if (menu.findItem(3) != null || userM169430Pa.isTeamAccount()) {
            menu2 = menu;
        } else {
            menu2 = menu;
            CoreModule.m29935P().m94658i().mo158251J3(true, true, null, act(), menu2, this.f96910b, null, OMSDialogPositon.p_chat_view);
        }
        if (!CoreModule.m29935P().m94658i().mo158216D() || menu2.findItem(4) != null || !NullChecker.m81303a(userM169430Pa) || userM169430Pa.isTeamAccount()) {
            return false;
        }
        CoreModule.m29935P().m94658i().mo158356c1(act(), menu2, userM169430Pa.f56011id);
        return false;
    }

    /* JADX INFO: renamed from: o7 */
    public List<Object> m120817o7() {
        return vwb.m200324f0("other user id", this.f96910b, ag3.f69254c);
    }

    /* JADX INFO: renamed from: p3 */
    public LocalStatus m120818p3() {
        return this.f96908Y;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m120819p4(String str) {
        return this.f96883A.contains(str);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m120820p5(HashMap map) {
        try {
            for (List list : map.values()) {
                Act.C4299r c4299r = list.size() >= 1 ? (Act.C4299r) list.get(list.size() - 1) : null;
                Act.C4299r c4299r2 = list.size() >= 2 ? (Act.C4299r) list.get(list.size() - 2) : null;
                if (NullChecker.m81303a(c4299r2) && (c4299r2.f15343a.get() instanceof SelectContactAct)) {
                    c4299r2 = list.size() >= 3 ? (Act.C4299r) list.get(list.size() - 3) : null;
                }
                if (NullChecker.m81303a(c4299r2) && !c4299r2.f15346d && NullChecker.m81303a(c4299r) && c4299r.f15343a.get() == act()) {
                    Activity activity = c4299r2.f15343a.get();
                    if ((activity instanceof MessagesAct) && ((MessagesAct) activity).mo48974l().mo120828r3().equals(this.f96910b) && activity != act()) {
                        mo120679M2((MessagesAct) activity);
                        act().m66873d2();
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("MessagesAct Exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m120821p6(String str, final String str2) {
        duringCreated(CoreModule.f17545c.f19642f0.m32893ag(str, str2).observeOn(jo0.m142408a())).filter(new bbz()).take(1).subscribe(mkd0.m154956H(new cbz(this), new e30() { // from class: l.mbz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133071a.m120663I5(str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p7 */
    public void m120822p7(final Message message, boolean z) {
        if (m120804m4(message)) {
            m120669J6();
        }
        if (m120819p4(message.f56011id)) {
            return;
        }
        if (NullChecker.m81303a(message.localAudioText) && TEnum.equals(message.localAudioText.status, "failed") && !message.localAudioText.failRetry) {
            m120827q7(message.f56011id, false);
            return;
        }
        if (m120739Z3(message)) {
            m120727W6(message.f56011id);
            m120842t7().m190310j0().m162104y();
            return;
        }
        if (z) {
            this.f96884B = message.f56011id;
            this.f96935y = false;
        }
        this.f96886D = mqi0.m155944o();
        this.f96883A.add(message.f56011id);
        duringCreated(CoreModule.f17545c.f19642f0.m32927cq(m120783i3(), message.f56011id)).filter(new bbz()).take(1).subscribe(mkd0.m154956H(new cbz(this), new e30() { // from class: l.dbz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85352a.m120698Q5(message, (Throwable) obj);
            }
        }));
        c4g0 c4g0VarSubscribe = duringCreated(C22306c.timer(10L, TimeUnit.SECONDS).compose(mkd0.m154951C())).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ebz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90399a.m120702R5(message, (Long) obj);
            }
        }));
        if (message.isOtherUser() && !message.audio().audioRead) {
            CoreModule.f17545c.f19642f0.m32584An(message.f56011id);
        }
        this.f96887E.put(message.f56011id, c4g0VarSubscribe);
        m120842t7().m190310j0().m162104y();
    }

    public String pageId() {
        if (mo120764e4()) {
            return "p_group_chat_view";
        }
        if (m120759d4()) {
            return "p_greet_chat";
        }
        return (TextUtils.isEmpty(this.f96910b) || !m120794k4(this.f96910b)) ? OMSDialogPositon.p_chat_view : "p_unmatch_details";
    }

    /* JADX INFO: renamed from: q3 */
    public H m120823q3() {
        return this.f96918j;
    }

    /* JADX INFO: renamed from: q4 */
    public boolean mo120824q4() {
        return false;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m120825q5(Bundle bundle) {
        ((tqz) this.viewModel).mo103257r();
    }

    /* JADX INFO: renamed from: q6 */
    public void m120826q6(String str) {
        V v2 = this.viewModel;
        ((tqz) v2).f171745n1.setSelectionHook(((tqz) v2).f171745n1.getCountHook() - 1);
        m120836s6(str);
    }

    /* JADX INFO: renamed from: q7 */
    public void m120827q7(String str, boolean z) {
        mkd0.m154992z(this.f96887E.remove(str));
        if (TextUtils.equals(this.f96884B, str)) {
            this.f96884B = null;
            this.f96935y = true;
        }
        this.f96883A.remove(str);
        m120842t7().m190310j0().m162104y();
        if (z) {
            w3z.m201433y(act());
        } else {
            o6j0.m162864h("e_chat_message_convert_to_text_failed", pageId(), new o6j0.C18854a[0]);
            lsi0.m151593w(R$string.f20910Z1);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public abstract String mo120828r3();

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m120829r4() {
        ((tqz) this.viewModel).m190287Z1();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ C22306c m120830r5() {
        return mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(this.f96910b), CoreModule.f17545c.f19642f0.m33048mo(this.f96910b), CoreModule.f17545c.f19642f0.m32820Ue(this.f96910b), new tmy());
    }

    /* JADX INFO: renamed from: r6 */
    public void m120831r6(String str) {
        V v2 = this.viewModel;
        ((tqz) v2).f171745n1.setSelectionHook(((tqz) v2).f171745n1.getCountHook() - 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m120635B6(arrayList);
    }

    /* JADX INFO: renamed from: r7 */
    public void m120832r7(String str) {
        mkd0.m154992z(this.f96887E.remove(str));
        o6j0.m162864h("e_chat_message_convert_to_text", pageId(), new o6j0.C18854a[0]);
        m120727W6(str);
        this.f96883A.remove(str);
        this.f96885C = str;
        m120683N2(str);
        m120842t7().m190310j0().m162104y();
    }

    /* JADX INFO: renamed from: s3 */
    public abstract C22306c<H> mo120833s3(String str);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m120834s4(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19643f1.m118054R3(str);
            if (CoreModule.m29935P().m94658i().mo158353b5()) {
                CoreModule.f17545c.f19643f1.m118051O3(mo120858x6().f56011id);
                zvf0.m220395q("e_chat_gift_bar_gift_send", act().pageId(), vwb.m200311Y("chat_gift_id", str));
            }
            e51.m114743H(act(), new Runnable() { // from class: l.h8z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106486a.m120829r4();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ C22306c m120835s5(Integer num) {
        return CoreModule.f17545c.f19588N0.m31971o3(mo120764e4() ? "" : this.f96910b);
    }

    /* JADX INFO: renamed from: s6 */
    public void m120836s6(String str) {
        r5l0 r5l0Var = new r5l0(str);
        if (!NullChecker.m81303a(r5l0Var.f157830a)) {
            lsi0.m151578h(R$string.f20727C2);
        } else if (r5l0Var.f157831b > Constants.ONE_MIN_IN_MILLIS) {
            lsi0.m151578h(R$string.f20865T4);
        } else {
            m120722V6(r5l0Var);
        }
    }

    /* JADX INFO: renamed from: s7 */
    public void m120837s7(boolean z) {
        CoreModule.f17545c.f19642f0.m32598Bo(m120783i3());
    }

    /* JADX INFO: renamed from: t3 */
    public double mo120838t3() {
        return -1.0d;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m120839t4(Throwable th) {
        if (!(th instanceof TantanException.Client.TantanForbidden) || !ura.m195053e().m195057d().mo33669Ct((TantanException.Client.TantanForbidden) th)) {
            return Boolean.FALSE;
        }
        w3z.m201400F(act(), mo120858x6());
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m120840t5(C4319c c4319c) {
        m120736Y5();
    }

    /* JADX INFO: renamed from: t7 */
    public V m120842t7() {
        return (V) super.m156457g0();
    }

    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel mo120843u3() {
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m120844u4(Message message, Message message2) {
        w85.INSTANCE.m202145m("Send Message", null);
        if (TEnum.equals(message2.messageType(), MessageType.chat_gift) && NullChecker.m81303a(message2.additionalData) && NullChecker.m81303a(message2.additionalData.chatGiftInfo) && !mo120764e4()) {
            CoreGiftInfo coreGiftInfoM118054R3 = CoreModule.f17545c.f19643f1.m118054R3(message2.additionalData.chatGiftInfo.f20361id);
            if (NullChecker.m81303a(coreGiftInfoM118054R3) && coreGiftInfoM118054R3.dynamicGift && !CoreModule.m29935P().m94658i().mo158399k0()) {
                mo120660I2(coreGiftInfoM118054R3);
            }
            CoreModule.m29935P().m94658i().mo158459w0(pageId(), mo120828r3(), true);
            CoreModule.f17545c.f19642f0.f19922b0.m132487l(message);
        }
        if (TEnum.equals(message2.messageType, MessageType.real_shot) && CoreModule.f17545c.f19642f0.f19918Z1) {
            o6j0.m162864h("e_chat_topic_rec_photo_text", act().pageId(), o6j0.C18854a.m162878h("send_user_id", message2.owner));
        }
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m120845u5(C4319c c4319c) {
        if (c4319c == C4319c.f15550k && CoreModule.m29935P().m94658i().mo158380g1()) {
            this.f96888E0 = null;
        }
        if (c4319c == C4319c.f15552m) {
            n000.m157187f();
            n000.m157188g();
            mo120758d3();
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m120846u6() {
        String strMo120628A3 = mo120628A3();
        CoreModule.f17545c.f19642f0.m32856Xe(this.f96910b);
        act().startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act(), m120726W5().f56011id, strMo120628A3, false), 16);
    }

    /* JADX INFO: renamed from: v3 */
    public Message m120847v3(final long j) {
        List listM15930q = Lists.m15930q(this.f96928r.f153135a);
        int iM200293G = vwb.m200293G(listM15930q, new w9j() { // from class: l.x7z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Message) obj)._id == j);
            }
        });
        if (iM200293G <= 0) {
            return null;
        }
        for (int i = iM200293G - 1; i >= 0; i--) {
            Message message = (Message) listM15930q.get(i);
            if (message.isOtherUser() && NullChecker.m81303a(message.audio()) && !message.audio().audioRead) {
                return message;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m120848v4(Message message, Throwable th) {
        if (TEnum.equals(message.messageType(), MessageType.chat_gift)) {
            CoreModule.m29935P().m94658i().mo158459w0(pageId(), mo120828r3(), false);
        }
        mo120763e3(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && CoreModule.m29935P().m94658i().mo158391i2((TantanException.Client.TantanForbidden) th)) {
            lsi0.m151578h(R$string.f20785J4);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m120849v5(roj0 roj0Var) {
        ((tqz) this.viewModel).m190307h2();
    }

    /* JADX INFO: renamed from: v6 */
    public void m120850v6(String str) {
        m120854w6(str, this.f96910b);
    }

    /* JADX INFO: renamed from: w3 */
    public User m120851w3(String str) {
        return CoreModule.f17545c.f19639e0.m169415M7(str);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m120852w4(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m120853w5() {
        if (f96882H0 || !NullChecker.m81303a(this.f96910b) || User.isTeamAccount(this.f96910b) || !f96881G0.contains(Build.MODEL) || DialogAct.f54271f.get().intValue() >= 2 || !Network.language().equals(Network.LANGUAGE_ZH_HANS)) {
            return;
        }
        f96882H0 = true;
        act().startActivity(DialogAct.m79377O0(act(), 3, null));
    }

    /* JADX INFO: renamed from: w6 */
    public void m120854w6(String str, String str2) {
        if (TextUtils.equals(str2, this.f96910b) && m120729X3(str)) {
            return;
        }
        CoreModule.f17545c.f19639e0.m169430Pa(str2);
        Intent intentMo158268M1 = CoreModule.m29935P().m94658i().mo158268M1(act(), str2, str, false);
        mo120773g3(intentMo158268M1);
        act().startActivityForResult(intentMo158268M1, 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion mo120855x3() {
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m120856x4(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b).unilateralBlock()) {
            CoreModule.f17545c.f19639e0.m169374Ba(this.f96910b);
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m120857x5(User user) {
        boolean zM120789j4 = m120789j4();
        V v2 = this.viewModel;
        if (zM120789j4) {
            ((tqz) v2).m190304g2();
        } else {
            ((tqz) v2).m190334v0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User mo120858x6() {
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            return CoreModule.f17545c.f19639e0.m169430Pa(this.f96910b);
        }
        return null;
    }

    /* JADX INFO: renamed from: y3 */
    public String m120859y3() {
        return this.f96913e;
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m120860y4(Message message) {
        return Boolean.valueOf(TextUtils.equals(message.f56011id, this.f96884B));
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m120861y5(User user) {
        if (!user.onlineMatchLocked() || user.unilateralBlock()) {
            ((tqz) this.viewModel).m190336w0();
        } else {
            ((tqz) this.viewModel).m190257J0();
        }
    }

    /* JADX INFO: renamed from: z3 */
    public String mo120863z3() {
        return "";
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m120864z4(Long l2) {
        m120694P6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m120865z5(j760 j760Var) {
        if (((Integer) ((j760) j760Var.f116565b).f116564a).intValue() == 25 && TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158326W3(this.f96910b)) && NullChecker.m81303a(((j760) j760Var.f116565b).f116565b)) {
            CoreModule.m29935P().m94658i().mo158466x0(this.f96910b, ((Message) ((j760) j760Var.f116565b).f116565b).f56011id);
        } else if (((Integer) ((j760) j760Var.f116565b).f116564a).intValue() == 50 && TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158382g3(this.f96910b)) && NullChecker.m81303a(((j760) j760Var.f116565b).f116565b)) {
            CoreModule.m29935P().m94658i().mo158217D0(this.f96910b, ((Message) ((j760) j760Var.f116565b).f116565b).f56011id);
        } else if (((Integer) ((j760) j760Var.f116565b).f116564a).intValue() == 75 && TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158359c5(this.f96910b)) && NullChecker.m81303a(((j760) j760Var.f116565b).f116565b)) {
            CoreModule.m29935P().m94658i().mo158220D3(this.f96910b, ((Message) ((j760) j760Var.f116565b).f116565b).f56011id);
        } else {
            if (((Integer) ((j760) j760Var.f116565b).f116564a).intValue() != 100 || !TextUtils.isEmpty(CoreModule.m29935P().m94658i().mo158289Q1(this.f96910b)) || !NullChecker.m81303a(((j760) j760Var.f116565b).f116565b)) {
                return;
            }
            ((tqz) this.viewModel).m190296d2();
            CoreModule.m29935P().m94658i().mo158438r2(this.f96910b, ((Message) ((j760) j760Var.f116565b).f116565b).f56011id);
            if (CoreModule.m29935P().m94658i().mo158279O2()) {
                Keyboard keyboardMo134702a = m156455e0().mo48971c0().m156457g0().mo134702a();
                if (NullChecker.m81303a(keyboardMo134702a)) {
                    keyboardMo134702a.m48799C();
                }
            }
        }
        ((tqz) this.viewModel).m190248B1();
    }

    /* JADX INFO: renamed from: G6 */
    public void mo120654G6() {
    }

    /* JADX INFO: renamed from: H6 */
    public void mo120659H6() {
    }

    /* JADX INFO: renamed from: I6 */
    public void mo120664I6() {
    }

    /* JADX INFO: renamed from: d3 */
    public void mo120758d3() {
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: y6 */
    public void mo120862y6() {
    }

    /* JADX INFO: renamed from: I2 */
    public void mo120660I2(CoreGiftInfo coreGiftInfo) {
    }

    /* JADX INFO: renamed from: K6 */
    public void mo120674K6(IceBreakingQuestion iceBreakingQuestion) {
    }

    /* JADX INFO: renamed from: M2 */
    public void mo120679M2(PutongAct putongAct) {
    }

    /* JADX INFO: renamed from: b3 */
    public void mo120748b3(H h) {
    }

    /* JADX INFO: renamed from: b7 */
    public void mo120752b7(boolean z) {
    }

    /* JADX INFO: renamed from: e3 */
    public void mo120763e3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public Intent mo120773g3(Intent intent) {
        return intent;
    }

    /* JADX INFO: renamed from: t6 */
    public void mo120841t6(Message message) {
    }

    /* JADX INFO: renamed from: k6 */
    public void mo120796k6(int i, Menu menu) {
    }

    /* JADX INFO: renamed from: c3 */
    public void mo120753c3(Conversation conversation, q860<Message> q860Var, H h) {
    }

    /* JADX INFO: renamed from: z6 */
    public void mo120866z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
    }
}
