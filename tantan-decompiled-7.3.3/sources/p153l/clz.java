package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.data.AudioText;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationMomentInfo;
import com.p051p1.mobile.putong.core.data.ConversationQuickChat;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.ExchangePicture;
import com.p051p1.mobile.putong.core.data.GiftSubBizType;
import com.p051p1.mobile.putong.core.data.IceBreakFriendData;
import com.p051p1.mobile.putong.core.data.IceBreakUserId;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageChannel;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageSentFrom;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Ref;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.Survey;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.SelectContactAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.DialogAct;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p137rx.subjects.ReplaySubject;
import p153l.qzz;

/* JADX INFO: loaded from: classes4.dex */
public abstract class clz<H, V extends qzz> extends j3z<V> {

    /* JADX INFO: renamed from: F0 */
    public static C22508b<uxj0> f82443F0 = C22508b.m222767b();

    /* JADX INFO: renamed from: G0 */
    public static final ArrayList<String> f82444G0 = jyb.m147507f0("OPPO R9m", "OPPO R9s", "OPPO R9tm", "OPPO R9 Plusm A", "OPPO A59m");

    /* JADX INFO: renamed from: H0 */
    public static boolean f82445H0 = false;

    /* JADX INFO: renamed from: A */
    public Set<String> f82446A;

    /* JADX INFO: renamed from: B */
    public String f82447B;

    /* JADX INFO: renamed from: C */
    public String f82448C;

    /* JADX INFO: renamed from: D */
    public long f82449D;

    /* JADX INFO: renamed from: E */
    public Map<String, kcg0> f82450E;

    /* JADX INFO: renamed from: E0 */
    public String f82451E0;

    /* JADX INFO: renamed from: F */
    public jxd0 f82452F;

    /* JADX INFO: renamed from: G */
    public zqe0<Object, Object> f82453G;

    /* JADX INFO: renamed from: H */
    public List<CoreGiftInfo> f82454H;

    /* JADX INFO: renamed from: I */
    public jxd0 f82455I;

    /* JADX INFO: renamed from: J */
    public jxd0 f82456J;

    /* JADX INFO: renamed from: K */
    public C22507a<uxj0> f82457K;

    /* JADX INFO: renamed from: L */
    public C22507a<uxj0> f82458L;

    /* JADX INFO: renamed from: M */
    public jxd0 f82459M;

    /* JADX INFO: renamed from: N */
    public final jxd0 f82460N;

    /* JADX INFO: renamed from: O */
    public boolean f82461O;

    /* JADX INFO: renamed from: P */
    public boolean f82462P;

    /* JADX INFO: renamed from: Q */
    public volatile MessageWarmingUpHelper.WarmingUpLevel f82463Q;

    /* JADX INFO: renamed from: R */
    public volatile double f82464R;

    /* JADX INFO: renamed from: S */
    public volatile double f82465S;

    /* JADX INFO: renamed from: T */
    public boolean f82466T;

    /* JADX INFO: renamed from: U */
    public boolean f82467U;

    /* JADX INFO: renamed from: V */
    public boolean f82468V;

    /* JADX INFO: renamed from: W */
    public int f82469W;

    /* JADX INFO: renamed from: X */
    public kcg0 f82470X;

    /* JADX INFO: renamed from: Y */
    public LocalStatus f82471Y;

    /* JADX INFO: renamed from: Z */
    public Message f82472Z;

    /* JADX INFO: renamed from: b */
    public String f82473b;

    /* JADX INFO: renamed from: c */
    public String f82474c;

    /* JADX INFO: renamed from: d */
    public int f82475d;

    /* JADX INFO: renamed from: e */
    public String f82476e;

    /* JADX INFO: renamed from: f */
    public String f82477f;

    /* JADX INFO: renamed from: g */
    public String f82478g;

    /* JADX INFO: renamed from: h */
    public int f82479h;

    /* JADX INFO: renamed from: i */
    public User f82480i;

    /* JADX INFO: renamed from: j */
    public H f82481j;

    /* JADX INFO: renamed from: k */
    public Conversation f82482k;

    /* JADX INFO: renamed from: k0 */
    public MessageMomentGuide f82483k0;

    /* JADX INFO: renamed from: l */
    public C22421c<vg60<Message>> f82484l;

    /* JADX INFO: renamed from: m */
    public Message f82485m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, String> f82486n;

    /* JADX INFO: renamed from: o */
    public String f82487o;

    /* JADX INFO: renamed from: p */
    public String f82488p;

    /* JADX INFO: renamed from: p0 */
    public qcj<Message, Boolean> f82489p0;

    /* JADX INFO: renamed from: q */
    public long f82490q;

    /* JADX INFO: renamed from: r */
    public vg60<Message> f82491r;

    /* JADX INFO: renamed from: s */
    public C22507a<Boolean> f82492s;

    /* JADX INFO: renamed from: t */
    public boolean f82493t;

    /* JADX INFO: renamed from: u */
    public boolean f82494u;

    /* JADX INFO: renamed from: v */
    public boolean f82495v;

    /* JADX INFO: renamed from: w */
    public String f82496w;

    /* JADX INFO: renamed from: x */
    public double f82497x;

    /* JADX INFO: renamed from: y */
    public boolean f82498y;

    /* JADX INFO: renamed from: z */
    public Set<String> f82499z;

    /* JADX INFO: renamed from: l.clz$a */
    public class RunnableC16304a implements Runnable {
        public RunnableC16304a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m111073a(Conversation conversation) {
            conversation.localBotherStatus = 0;
            CoreModule.f18264c.f20384f0.m34053mq(conversation);
        }

        @Override // java.lang.Runnable
        public void run() {
            final Conversation conversationM110994j3 = clz.this.m110994j3();
            if (NullChecker.m82486a(conversationM110994j3)) {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.blz
                    @Override // p153l.x20
                    public final void call() {
                        clz.RunnableC16304a.m111073a(conversationM110994j3);
                    }
                });
            }
        }
    }

    public clz(ner nerVar) {
        super(nerVar);
        this.f82473b = "";
        this.f82474c = "";
        this.f82475d = -1;
        this.f82477f = "";
        this.f82478g = "";
        this.f82479h = -1;
        this.f82486n = new HashMap<>();
        this.f82487o = null;
        this.f82491r = vg60.m201219a();
        Boolean bool = Boolean.FALSE;
        this.f82492s = C22507a.m222759c(bool);
        this.f82493t = false;
        this.f82495v = false;
        this.f82498y = true;
        this.f82499z = new HashSet();
        this.f82446A = new HashSet();
        this.f82450E = new HashMap(1);
        this.f82453G = ReplaySubject.m222745b().m205717a();
        this.f82454H = new CopyOnWriteArrayList();
        this.f82455I = new jxd0("gift_guide_bubble_shown_" + CoreModule.m30929H().userId(), bool);
        this.f82456J = new jxd0("camera_guide_bubble_shown_" + CoreModule.m30929H().userId(), bool);
        uxj0 uxj0Var = uxj0.f181467a;
        this.f82457K = C22507a.m222759c(uxj0Var);
        this.f82458L = C22507a.m222759c(uxj0Var);
        this.f82459M = new jxd0("gift_guide_bubble_opt_shown_" + CoreModule.m30929H().userId(), bool);
        this.f82460N = new jxd0("message_read_state_text_guide_shown_" + CoreModule.m30929H().userId(), bool);
        this.f82461O = false;
        this.f82462P = false;
        this.f82463Q = MessageWarmingUpHelper.WarmingUpLevel.not;
        this.f82464R = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f82465S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f82466T = false;
        this.f82467U = false;
        this.f82468V = false;
        this.f82471Y = LocalStatus.get("normal");
        this.f82489p0 = new qcj() { // from class: l.gkz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104786a.m110859G5((Message) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m110714A2(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m110734J0() {
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m110735J1() {
        h900.f108292c -= 100000000;
        o1j0.m165636j("duration:" + (h900.f108292c / 1000000));
    }

    /* JADX INFO: renamed from: M3 */
    private void m110738M3() {
        if (m110947Z5()) {
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xjz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194658a.m111021o5((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N3 */
    private void m110741N3() {
        duringCreated(new pcj() { // from class: l.ljz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Act.globalLifecycle();
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.mjz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137185a.m111026p5((HashMap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m110743O1(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: O3 */
    private void m110744O3() {
        creates(new y20() { // from class: l.ihz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115039a.m111031q5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m110749R0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R3 */
    private void m110751R3() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.wjz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189515a.m111051u5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m110752S0(Throwable th) {
    }

    /* JADX INFO: renamed from: V3 */
    private void m110759V3() {
        if (((qzz) this.viewModel).m178973s0()) {
            duringCreated(m143372e0().mo50155d0().m201110x0()).subscribe(psd0.m173596G(new y20() { // from class: l.vjz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f184448a.m110836A5((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m110772c2() {
        long j = h900.f108292c;
        if (j == 400000000) {
            h900.f108292c = j * 30;
        } else {
            h900.f108292c = 400000000L;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ bkj0 m110776e2(Conversation conversation, vg60 vg60Var, Object obj, uxj0 uxj0Var) {
        return new bkj0(conversation, vg60Var, obj);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m110791k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ bkj0 m110793l0(Object obj, User user, Conversation conversation, uxj0 uxj0Var) {
        return new bkj0(obj, user, conversation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m110795l2(bkj0 bkj0Var) {
        if (((Integer) ((pf60) bkj0Var.f77082b).f152156a).intValue() < 100) {
            hcm.m134472r().m134475C(true);
        } else {
            hcm.m134472r().m134475C(false);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m110804o2() {
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m110807p2() {
        h900.f108292c += 100000000;
        o1j0.m165636j("duration:" + (h900.f108292c / 1000000));
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m110816s2(IceBreakFriendData iceBreakFriendData) {
        ArrayList arrayList = new ArrayList();
        Iterator<IceBreakUserId> it = iceBreakFriendData.friends.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().userId);
        }
        hcm.m134472r().m134474B(arrayList);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m110829y0(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public String mo110834A3() {
        return "messages_thumbnail_right";
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m110835A4(String str) {
        m143372e0().mo50138B0().m143374g0().m114041t0().getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m110836A5(Integer num) {
        if (num.intValue() != 0) {
            ((qzz) this.viewModel).m178940e0();
        }
    }

    /* JADX INFO: renamed from: A6 */
    public void m110837A6(final Message message) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        new i1y(message.media, false, TEnum.equals(message.messageType, MessageType.real_shot)).compose(psd0.m173592C()).last().subscribe(psd0.m173597H(new y20() { // from class: l.vhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184201a.m110879K5(message, jUptimeMillis, (List) obj);
            }
        }, new y20() { // from class: l.whz
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f21469C2);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m110838B3() {
        return this.f82494u;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m110839B4() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "star";
        C4891g.m33543wf(this.f82473b, messageNew_).materialize().subscribe();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m110840B5(Message message) {
        ((qzz) this.viewModel).m178987z1(message, true, null);
    }

    /* JADX INFO: renamed from: B6 */
    public final void m110841B6(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Picture picture = new Picture();
            picture.url = oki.m168011B(str);
            picture.mediaType = "image/*";
            picture.status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        m110845C6(arrayList, 0);
    }

    /* JADX INFO: renamed from: C3 */
    public void m110842C3(String str) {
        this.f82499z.remove(str);
        ((qzz) this.viewModel).m178953j0().m153307y();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m110843C4() {
        List<Message> list = this.f82491r.f184001a;
        C4891g.m33555xf(list.get(list.size() - 1)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m110844C5(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = l2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(0, gkc0.m130573a(0, str.length() - 1));
        C4891g.m33543wf(this.f82473b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C6 */
    public final void m110845C6(List<Media> list, int i) {
        m143372e0().mo50155d0().m143374g0().mo125465k(0, -1);
        u11.m193894h(list.size() > 0);
        for (Media media : list) {
            Message message = new Message();
            ArrayList arrayList = new ArrayList();
            message.media = arrayList;
            arrayList.add(media);
            if (i == 10 || i == 11) {
                message.messageType = MessageType.get(MessageType.exchange_picture);
                ExchangePicture exchangePictureNew_ = ExchangePicture.new_();
                if (TextUtils.isEmpty(r600.f161422j)) {
                    exchangePictureNew_.exchangeType = ExchangePicture.SEND_MESSAGE;
                } else {
                    exchangePictureNew_.exchangeType = ExchangePicture.BACK_MESSAGE;
                    exchangePictureNew_.launchMessageId = r600.f161422j;
                }
                message.msgData = exchangePictureNew_.toJson();
            } else if (i == 13) {
                message.messageType = MessageType.get(MessageType.limit_time_picture);
            } else {
                message.messageType = MessageType.get("picture");
            }
            m110837A6(message);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m110846D3() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.sjz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169203a.m110926V4((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m110847D4(Message message) {
        C4891g.m33543wf(this.f82473b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m110848D5(int i, final String str) {
        C22421c.interval(100L, TimeUnit.MILLISECONDS).take(i).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.sgz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168570a.m110844C5(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D6 */
    public void m110849D6() {
        ((qzz) this.viewModel).m178953j0().m153308z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m110850E3() {
        duringCreated(CoreModule.f18264c.f20384f0.f20669c2).distinctUntilChanged().filter(new qcj() { // from class: l.ojz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147726a.m110931W4((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.pjz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152763a.m110936X4((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m110851E4() {
        final Message messageNew_ = Message.new_();
        messageNew_.value = "flower";
        act().postDelayed(new Runnable() { // from class: l.skz
            @Override // java.lang.Runnable
            public final void run() {
                this.f169342a.m110847D4(messageNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m110852E5(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(((Message) list.get(i)).f56859id, str)) {
                ((qzz) this.viewModel).m178886A1(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m110853E6(String str) {
        CoreModule.f18264c.f20384f0.m33713Kn(this.f82474c, str);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m110854F3() {
        if (IntlCountryCodeController.m29110g() && NullChecker.m82486a(this.f82482k) && TEnum.equals(this.f82482k.property.chatInterrupt.stage, "locked") && this.f82480i.isVIP()) {
            duringCreated(o3z.m165898g().m165906k(this.f82473b)).subscribe(psd0.m173591B());
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m110855F4() {
        this.f82493t = !this.f82493t;
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m110856F5(Message message) {
        return Boolean.valueOf(m143372e0().mo50160u0().m128942N0(message._id));
    }

    /* JADX INFO: renamed from: F6 */
    public void m110857F6() {
        if (this.f82473b.isEmpty() || Integer.parseInt(this.f82473b) <= 0) {
            return;
        }
        ((qzz) this.viewModel).m178915S1();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m110858G4() {
        String str = this.f82473b;
        C4891g.m33543wf(str, CoreModule.f18264c.f20384f0.m33820Tn(str).toBlocking().m165963b().f184001a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m110859G5(Message message) {
        return Boolean.valueOf((message.isLocal() || !message.isOtherUser() || !NullChecker.m82486a(message.audio()) || message.audio().audioRead || m111025p4(message.f56859id) || m110945Z3(message) || m143372e0().mo50160u0().m128942N0(message._id)) ? false : true);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m110861H2(final String str) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = mo111034r3();
        coreSendGiftBodyNew_.giftID = str;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get("chat").toString();
        if (CoreModule.f18264c.f20381e0.m116503Pa(mo111034r3()).onlineMatch()) {
            coreSendGiftBodyNew_.subBizType = GiftSubBizType.get("quickchat");
        } else {
            coreSendGiftBodyNew_.subBizType = null;
        }
        CoreModule.m30933P().m143412i().mo180526q3((PutongAct) act(), coreSendGiftBodyNew_, new y20() { // from class: l.chz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81886a.m111040s4(str, (Boolean) obj);
            }
        }, new qcj() { // from class: l.dhz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88572a.m111045t4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m110862H3() {
        if (CoreModule.m30933P().m143412i().mo180406U3() && mo110982g6()) {
            duringCreated(CoreModule.f18264c.f20328M1.m111476u3()).subscribe(psd0.m173596G(new y20() { // from class: l.qjz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158067a.m110941Y4((ChatHeatActionData) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m110863H4() {
        String str = this.f82473b;
        C4891g.m33543wf(str, CoreModule.f18264c.f20384f0.m33820Tn(str).toBlocking().m165963b().f184001a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m110864H5(AudioText audioText) {
        if (TEnum.equals(audioText.status, "default") && !TextUtils.isEmpty(audioText.translationResult)) {
            m111038r7(audioText.msgId);
        } else {
            if (TEnum.equals(audioText.status, "pending")) {
                return;
            }
            m111033q7(audioText.msgId, false);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m110867I3() {
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33730Mg(this.f82473b), CoreModule.f18264c.f20384f0.m33682Ig(this.f82473b), new rcj() { // from class: l.fjz
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return Boolean.valueOf(NullChecker.m82486a(bool) && bool.booleanValue() && NullChecker.m82486a(bool2) && bool2.booleanValue());
            }
        })).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.gjz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104695a.m110946Z4((Boolean) obj);
            }
        }, new y20() { // from class: l.hjz
            @Override // p153l.y20
            public final void call(Object obj) {
                clz.m110752S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m110868I4() {
        act().postDelayed(new Runnable() { // from class: l.ckz
            @Override // java.lang.Runnable
            public final void run() {
                this.f82331a.m110863H4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m110869I5(String str, Throwable th) {
        m111033q7(str, true);
    }

    /* JADX INFO: renamed from: J2 */
    public void m110871J2(String str, String str2) {
        Survey survey;
        for (int iMo129499d = ((qzz) this.viewModel).m178953j0().mo129499d() - 1; iMo129499d >= 0; iMo129499d--) {
            Message messageMo129506m = ((qzz) this.viewModel).m178953j0().mo129506m(iMo129499d);
            if (TEnum.equals(messageMo129506m.messageType(), MessageType.new_survey) && !TextUtils.isEmpty(messageMo129506m.msgData) && (survey = Survey.parse(messageMo129506m.msgData)) != null && str.equals(survey.f21253id)) {
                survey.f21253id = str;
                survey.status = "submitted";
                messageMo129506m.msgData = survey.toJson();
                messageMo129506m.value = str2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m110872J3() {
        duringCreated(new pcj() { // from class: l.alz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72174a.m110951a5();
            }
        }, false).filter(new qcj() { // from class: l.xgz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194262a.m110956b5((uxj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109954a.m110961c5((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m110873J4(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get("text");
        message.value = l2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str.substring(0, gkc0.m130573a(0, str.length() - 1));
        CoreModule.f18264c.f20384f0.m33626Dn(m110989i3(), message, null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m110874J5(Message message) {
        ((qzz) this.viewModel).m178987z1(message, true, null);
    }

    /* JADX INFO: renamed from: J6 */
    public void m110875J6() {
        this.f82496w = null;
    }

    /* JADX INFO: renamed from: K2 */
    public final long m110876K2() {
        long jM174454o = pzi0.m174454o() - this.f82449D;
        if (jM174454o >= 500) {
            return 0L;
        }
        return 500 - jM174454o;
    }

    /* JADX INFO: renamed from: K3 */
    public void m110877K3() {
        creates(new y20() { // from class: l.lhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132162a.m110966d5((Bundle) obj);
            }
        }, new x20() { // from class: l.mhz
            @Override // p153l.x20
            public final void call() {
                clz.m110804o2();
            }
        });
        duringCreated(new pcj() { // from class: l.nhz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f142079a.m110971e5();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ohz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147501a.m110976f5((bkj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33881Yo(m110989i3())).subscribe(psd0.m173596G(new y20() { // from class: l.phz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152502a.m110981g5((Message) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(m110989i3());
            if (!NullChecker.m82486a(conversationM33859Xe) || TextUtils.isEmpty(conversationM33859Xe.clearedUntil)) {
                this.f82484l = CoreModule.f18264c.f20384f0.m33832Un(m110989i3(), mo111044t3());
            } else {
                this.f82484l = CoreModule.f18264c.f20384f0.m33740Ne(m110989i3()).distinctUntilChanged(new qcj() { // from class: l.rhz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Conversation) obj).clearedUntil;
                    }
                }).flatMap(new qcj() { // from class: l.shz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f168773a.m110986h5((Conversation) obj);
                    }
                });
            }
        } else {
            this.f82484l = CoreModule.f18264c.f20384f0.m33832Un(m110989i3(), mo111044t3());
        }
        duringCreated(new pcj() { // from class: l.thz
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f174435a.m110991i5();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.uhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179068a.m111011m5((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m110878K4(final String str) {
        C22421c.interval(100L, TimeUnit.MILLISECONDS).take(1000).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.rkz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163660a.m110873J4(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m110879K5(final Message message, long j, List list) {
        message.media = list;
        act().postDelayed(new Runnable() { // from class: l.ikz
            @Override // java.lang.Runnable
            public final void run() {
                this.f115473a.m110874J5(message);
            }
        }, (j + 500) - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: L2 */
    public void m110881L2(final Message message, boolean z, Sticker sticker) {
        m110938X6(message);
        mo110901Q2(message, z, sticker);
        if (this.f82493t) {
            message.sentFrom = MessageSentFrom.get(MessageSentFrom.apple_watch);
        }
        if (message.question == null && message.answerOfMessage == null && TextUtils.isEmpty(message.referenceMsgId)) {
            for (int size = this.f82491r.f184001a.size() - 1; size >= Math.max(0, this.f82491r.f184001a.size() - 20); size--) {
                Message message2 = this.f82491r.f184001a.get(size);
                if (NullChecker.m82486a(message2.question)) {
                    message.answerOfMessage = message2.f56859id;
                    break;
                } else {
                    if (message2.isMe()) {
                        break;
                    }
                }
            }
        }
        m600.m157130c();
        SystemClock.elapsedRealtime();
        if (z) {
            mo110906R2(message, z, sticker);
            duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(m110989i3(), message, sticker)).subscribe(psd0.m173597H(new y20() { // from class: l.xkz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194830a.m111050u4(message, (Message) obj);
                }
            }, new y20() { // from class: l.ykz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200506a.m111054v4(message, (Throwable) obj);
                }
            }));
        } else if (!mo110910S2(message, z, sticker)) {
            act().progress(R$string.f21517I2, true);
            CoreModule.f18264c.f20384f0.m33665Gn(this.f82473b, message).subscribe(psd0.m173597H(new y20() { // from class: l.zkz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204866a.m111058w4((uxj0) obj);
                }
            }, new y20() { // from class: l.ngz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141871a.m111062x4((Throwable) obj);
                }
            }));
        }
        if (User.ID_TEAM_ACCOUNT.equals(this.f82473b)) {
            return;
        }
        CoreModule.m30933P().m143412i().mo180315E0();
        if (message.moment == null && CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            CoreModule.m30933P().m143412i().mo180331H2();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m110882L4() {
        for (int i = 0; i < 10; i++) {
            m110914S6(i + "");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m110883L5(String str) {
        m143372e0().mo50138B0().m194215r2(new SpannableStringBuilder(str), null, false);
    }

    /* JADX INFO: renamed from: L6 */
    public void m110884L6(String str, String str2, String str3) {
        Message message = new Message();
        message.answerOfMessage = str2;
        message.answerIdOfAnswer = str3;
        message.value = str;
        message.messageType = MessageType.get("text");
        if (m110975f4(mo111034r3())) {
            return;
        }
        ((qzz) this.viewModel).m178987z1(message, true, null);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m110886M4() {
        Message message = new Message();
        message.messageType = MessageType.get(MessageType.chatroom_share);
        message.msgData = "{\n  \"title\": \"这个是title\",\n  \"desc\": \"这个是desc\",\n  \"liveId\": \"3000012314\",\n  \"roomId\": \"roomId\",\n  \"schemaSearch\": \"SCHEMA_SEARCH\"\n}";
        CoreModule.f18264c.f20384f0.m33626Dn(m110989i3(), message, null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ C22421c m110887M5(uxj0 uxj0Var) {
        return CoreModule.f18264c.f20384f0.m33905ap(this.f82474c);
    }

    /* JADX INFO: renamed from: M6 */
    public void m110888M6(File file, String str, float f) {
        sfj0.m185596c("e_message_voice_send", pageId(), new sfj0.C20032a[0]);
        File file2 = new File(file.getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        file.renameTo(file2);
        Message message = new Message();
        Audio audio = new Audio();
        audio.url = oki.m168011B(file2.getAbsolutePath());
        audio.mediaType = str;
        audio.duration = f;
        audio.status = MediaLocalStatus.get("raw");
        ArrayList arrayList = new ArrayList();
        message.media = arrayList;
        arrayList.add(audio);
        message.messageType = MessageType.get("audio");
        ((qzz) this.viewModel).m178987z1(message, true, null);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m110889N2(String str) {
        if (TextUtils.equals(this.f82447B, str)) {
            int iM147476G = jyb.m147476G(this.f82491r.f184001a, new qcj() { // from class: l.wgz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f189077a.m111066y4((Message) obj);
                }
            }) + 1;
            if (iM147476G > 0 && iM147476G < this.f82491r.f184001a.size()) {
                Message message = this.f82491r.f184001a.get(iM147476G);
                if (message.isOtherUser() && !jyb.m147479J(message.media) && (message.media.get(0) instanceof Audio) && !message.audio().audioRead && !m111025p4(message.f56859id) && !m110945Z3(message) && !m143372e0().mo50160u0().m128942N0(message._id)) {
                    m111028p7(message, true);
                    return;
                }
            }
            this.f82447B = null;
            this.f82498y = true;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m110890N4() {
        act().postDelayed(new Runnable() { // from class: l.mkz
            @Override // java.lang.Runnable
            public final void run() {
                this.f137347a.m110886M4();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C22421c m110891N5(uxj0 uxj0Var) {
        return CoreModule.f18264c.f20384f0.m33905ap(this.f82474c);
    }

    /* JADX INFO: renamed from: N6 */
    public void m110892N6(final String str) {
        act().postDelayed(new Runnable() { // from class: l.ujz
            @Override // java.lang.Runnable
            public final void run() {
                this.f179347a.m110883L5(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m110893O4() {
        C4910y.m35902g3(this.f82473b).materialize().subscribe();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ C22421c m110894O5(uxj0 uxj0Var) {
        return CoreModule.f18264c.f20384f0.m33905ap(this.f82474c);
    }

    /* JADX INFO: renamed from: O6 */
    public void m110895O6(String str) {
        if (CoreModule.m30933P().m143412i().mo180481i()) {
            CoreModule.f18264c.f20384f0.m33729Mf(m110989i3());
        }
        if (CoreModule.m30933P().m143412i().mo180550v5()) {
            CoreModule.f18264c.f20384f0.m33605Cf(m110989i3());
        }
        if (this.f82482k.userMessageCount == 0 && !TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180348K1(this.f82474c))) {
            ConversationQuickChat conversationQuickChat = this.f82482k.property.quickchat;
            if (conversationQuickChat.bell) {
                CoreModule.f18264c.f20300D0.m35865y4(CoreModule.m30933P().m143412i().mo180348K1(this.f82474c)).switchMap(new qcj() { // from class: l.ygz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f199893a.m110887M5((uxj0) obj);
                    }
                }).subscribe((gcg0<? super R>) psd0.m173591B());
            } else if (conversationQuickChat.speed) {
                CoreModule.f18264c.f20300D0.m35830C4(CoreModule.m30933P().m143412i().mo180348K1(this.f82474c)).switchMap(new qcj() { // from class: l.zgz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f204367a.m110891N5((uxj0) obj);
                    }
                }).subscribe((gcg0<? super R>) psd0.m173591B());
            } else if (conversationQuickChat.oneside) {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p9) && !userM116600p9.isFemale()) {
                    CoreModule.f18264c.f20300D0.m35829B4(CoreModule.m30933P().m143412i().mo180348K1(this.f82474c), "").switchMap(new qcj() { // from class: l.ahz
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f71437a.m110894O5((uxj0) obj);
                        }
                    }).subscribe((gcg0<? super R>) psd0.m173591B());
                }
            }
        }
        m110861H2(str);
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m110896P2() {
        if (!CoreModule.m30933P().m143412i().mo180557x()) {
            return false;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f82473b);
        if (NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "dismissed") && NullChecker.m82486a(conversationM33859Xe.additional) && NullChecker.m82486a(conversationM33859Xe.additional.quickChat)) {
            return conversationM33859Xe.additional.quickChat.avatarBlurred;
        }
        return false;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m110897P3() {
        if (h39.m133424M()) {
            hcm.m134472r().m134475C(false);
            if (!mo110970e4()) {
                duringCreated(new pcj() { // from class: l.mgz
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f136812a.m111036r5();
                    }
                }).filter(new qcj() { // from class: l.qhz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) ((bkj0) obj).f77081a).onlineMatch());
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.biz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        clz.m110795l2((bkj0) obj);
                    }
                }));
            }
            if (pzi0.m174454o() > CoreModule.f18264c.f20381e0.f89249i3.get().longValue()) {
                duringCreated(C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.miz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Integer.valueOf(CoreModule.f18264c.f20384f0.m34029lf());
                    }
                }).filter(new qcj() { // from class: l.xiz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > h39.m133416E());
                    }
                }).flatMap(new qcj() { // from class: l.ijz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f115311a.m111041s5((Integer) obj);
                    }
                }).filter(new qcj() { // from class: l.tjz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        IceBreakFriendData iceBreakFriendData = (IceBreakFriendData) obj;
                        return Boolean.valueOf(NullChecker.m82486a(iceBreakFriendData) && !jyb.m147479J(iceBreakFriendData.friends) && iceBreakFriendData.friends.size() >= 3);
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.ekz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        clz.m110816s2((IceBreakFriendData) obj);
                    }
                }, new y20() { // from class: l.pkz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        clz.m110791k1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m110898P4() {
        act().postDelayed(new Runnable() { // from class: l.hkz
            @Override // java.lang.Runnable
            public final void run() {
                this.f110466a.m110893O4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m110899P5(Message message, uxj0 uxj0Var) {
        m110853E6(message.f56859id);
    }

    /* JADX INFO: renamed from: P6 */
    public void m110900P6() {
        try {
            if (this.f82482k == null) {
                return;
            }
            CoreModule.m30933P().m143412i().mo180453d0(this.f82482k.f56859id);
        } catch (NullPointerException e) {
            CrashHelper.m82480d(new Exception("MessageAct sendInputtingMsg:" + e.getMessage(), e), 100);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean mo110901Q2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: Q3 */
    public void m110902Q3() {
        lifecycle().filter(new qcj() { // from class: l.jhz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.khz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126951a.m111046t5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m110903Q4() {
        act().dialog().m21503F(this.f82473b).m21567z0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m110904Q5(Message message, Throwable th) {
        m111033q7(message.f56859id, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m110905Q6(final String str) {
        CoreAssetsSettings coreAssetsSettingsM144645g = CoreModule.f18265d.m144645g();
        if (NullChecker.m82486a(coreAssetsSettingsM144645g) && coreAssetsSettingsM144645g.autoReadConversation) {
            duringCreated(CoreModule.f18264c.f20384f0.m34129so(str).switchMap(new qcj() { // from class: l.qgz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20384f0.m33740Ne(str).filter(new qcj() { // from class: l.bhz
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(!((Conversation) obj2).read.booleanValue());
                        }
                    });
                }
            })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.rgz
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                }
            }, new fjf0()));
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean mo110906R2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m110907R4() {
        ((qzz) this.viewModel).f160375X0.m82101d("animations/singleDog/config.xml", "animations/singleDog/pic");
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m110908R5(Message message, Long l2) {
        if (m110945Z3(message)) {
            return;
        }
        m111033q7(message.f56859id, false);
    }

    /* JADX INFO: renamed from: R6 */
    public void m110909R6(Sticker sticker, boolean z) {
        Message message = new Message();
        message.sticker = sticker.f56859id;
        message.messageType = MessageType.get("sticker");
        ((qzz) this.viewModel).m178987z1(message, true, z ? sticker.mo225055clone() : null);
    }

    /* JADX INFO: renamed from: S2 */
    public boolean mo110910S2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m110911S3() {
        duringCreated(f82443F0).subscribe(psd0.m173596G(new y20() { // from class: l.xhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194422a.m111055v5((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m110912S4() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        if (NullChecker.m82486a(userM116503Pa)) {
            StringBuilder sb = new StringBuilder();
            for (String str : userM116503Pa.abGroups) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
            o1j0.m165636j(sb.toString());
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m110913S5(final Message message) {
        act().postDelayed(new Runnable() { // from class: l.njz
            @Override // java.lang.Runnable
            public final void run() {
                this.f142368a.m110840B5(message);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S6 */
    public void m110914S6(String str) {
        m110919T6(str, null);
    }

    /* JADX INFO: renamed from: T2 */
    public C22421c<Conversation> mo110915T2() {
        return CoreModule.f18264c.f20384f0.m33823Ue(m110989i3());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m110916T3() {
        creates(new y20() { // from class: l.jjz
            @Override // p153l.y20
            public final void call(Object obj) {
                clz.m110749R0((Bundle) obj);
            }
        }, new x20() { // from class: l.kjz
            @Override // p153l.x20
            public final void call() {
                this.f127155a.m111059w5();
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m110917T4() {
        l51.m152919y(new RunnableC16304a());
    }

    /* JADX INFO: renamed from: T5 */
    public String m110918T5() {
        return (mo111049u3() == null || TextUtils.isEmpty(mo111049u3().buttonTitle)) ? "进入直播间" : mo111049u3().buttonTitle;
    }

    /* JADX INFO: renamed from: T6 */
    public void m110919T6(String str, List<String> list) {
        m143372e0().mo50138B0().m143374g0().m114041t0();
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            messageNew_.channel = MessageChannel.get(mo110970e4() ? "group" : "default");
            messageNew_.notifiedUsers = list;
        }
        IceBreakingQuestion iceBreakingQuestionMo111061x3 = mo111061x3();
        if (NullChecker.m82486a(iceBreakingQuestionMo111061x3)) {
            messageNew_.messageType = MessageType.get(MessageType.ice_breaking);
            if (messageNew_.additionalData == null) {
                messageNew_.additionalData = MessageAdditionalData.new_();
            }
            messageNew_.additionalData.iceBreakingQuestion = iceBreakingQuestionMo111061x3;
            m143372e0().mo50138B0().m143374g0().m114020i0();
        } else if (NullChecker.m82486a(this.f82472Z)) {
            messageNew_.messageType = MessageType.get("text");
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_;
            messageReferenceNew_.type = Ref.TYPE;
            String str2 = this.f82472Z.f56859id;
            messageReferenceNew_.f21189id = str2;
            messageNew_.referenceMsgId = str2;
            m143372e0().mo50138B0().m143374g0().m114023k0();
        } else if (NullChecker.m82486a(this.f82483k0)) {
            messageNew_.messageType = MessageType.get(MessageType.moment_reference);
            MessageReference messageReferenceNew_2 = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_2;
            messageReferenceNew_2.type = "moment";
            messageReferenceNew_2.f21189id = this.f82483k0.f21188id;
            m143372e0().mo50138B0().m143374g0().m114023k0();
        } else {
            messageNew_.messageType = MessageType.get("text");
        }
        ((qzz) this.viewModel).m178987z1(messageNew_, true, null);
    }

    /* JADX INFO: renamed from: U2 */
    public C22421c<Conversation> mo110920U2() {
        return CoreModule.f18264c.f20384f0.m33740Ne(m110989i3());
    }

    /* JADX INFO: renamed from: U3 */
    public void m110921U3() {
        if (CoreModule.m30933P().m143412i().mo180446c() && !m111000k4(this.f82473b) && m110995j4()) {
            if (TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180381Q1(this.f82473b))) {
                duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b), CoreModule.f18264c.f20384f0.m34025ko(this.f82473b, this.f82474c).distinctUntilChanged(), new mie0())).filter(new qcj() { // from class: l.wiz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        pf60 pf60Var = (pf60) obj;
                        return Boolean.valueOf(((User) pf60Var.f152156a).onlineMatch() && (NullChecker.m82486a(((pf60) pf60Var.f152157b).f152156a) || NullChecker.m82486a(((pf60) pf60Var.f152157b).f152157b)));
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.yiz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f200258a.m111071z5((pf60) obj);
                    }
                }));
            }
            duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b)).distinctUntilChanged(new rcj() { // from class: l.ziz
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                }
            }).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.ajz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71923a.m111063x5((User) obj);
                }
            }));
            if (CoreModule.m30933P().m143412i().mo180444b4()) {
                duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b)).filter(new qcj() { // from class: l.bjz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).onlineMatch());
                    }
                }).distinctUntilChanged(new rcj() { // from class: l.cjz
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.djz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f88957a.m111067y5((User) obj);
                    }
                }, new y20() { // from class: l.ejz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        clz.m110714A2((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ Boolean m110922U4(Message message) {
        boolean zEquals;
        if (m110940Y3()) {
            zEquals = TEnum.equals(message.channel, "anonymous");
        } else {
            zEquals = !TEnum.equals(message.channel, "anonymous");
        }
        return Boolean.valueOf(zEquals);
    }

    /* JADX INFO: renamed from: U5 */
    public String m110923U5() {
        return (mo111049u3() == null || TextUtils.isEmpty(mo111049u3().subTitle)) ? "多人连线已开启，等你加入" : mo111049u3().subTitle;
    }

    /* JADX INFO: renamed from: U6 */
    public void m110924U6(final Message message) {
        Message message2 = new Message();
        message2.sticker = CoreModule.f18273l.m143412i().mo180306C4() ? "9619" : "12602718";
        message2.messageType = MessageType.get("sticker");
        ((qzz) this.viewModel).m178987z1(message2, true, null);
        ChatGiftInfoExtra chatGiftInfoExtraMo180349K2 = CoreModule.m30933P().m143412i().mo180349K2(message);
        if (!NullChecker.m82486a(chatGiftInfoExtraMo180349K2) || TextUtils.isEmpty(chatGiftInfoExtraMo180349K2.giftRecordId)) {
            return;
        }
        CoreModule.f18264c.f20385f1.m155916p4(chatGiftInfoExtraMo180349K2.giftRecordId).subscribe(psd0.m173597H(new y20() { // from class: l.fhz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99132a.m110899P5(message, (uxj0) obj);
            }
        }, new y20() { // from class: l.ghz
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106246D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public boolean mo110925V2() {
        return true;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m110926V4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && Act.isFromBackground) {
            CoreModule.m30933P().m143412i().mo180394S3(act());
        }
    }

    /* JADX INFO: renamed from: V5 */
    public String m110927V5() {
        return (mo111049u3() == null || TextUtils.isEmpty(mo111049u3().mainTitle)) ? "正在视频直播" : mo111049u3().mainTitle;
    }

    /* JADX INFO: renamed from: V6 */
    public void m110928V6(vel0 vel0Var) {
        m143372e0().mo50155d0().m143374g0().mo125465k(0, -1);
        Message message = new Message();
        message.media = new ArrayList();
        Video video = new Video();
        video.url = oki.m168011B(vel0Var.f183805a);
        video.status = MediaLocalStatus.get("raw");
        message.media.add(video);
        message.messageType = MessageType.get("video");
        m110913S5(message);
    }

    /* JADX INFO: renamed from: W2 */
    public String m110929W2() {
        if (!(act() instanceof MessagesAct)) {
            return "0";
        }
        Conversation conversationM50161v2 = ((MessagesAct) act()).m50161v2();
        return NullChecker.m82486a(conversationM50161v2) ? conversationM50161v2.readUntil : "0";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX INFO: renamed from: W3 */
    public final void m110930W3() {
        String str;
        if (this.f82468V) {
            return;
        }
        this.f82468V = true;
        if (CoreModule.m30933P().m143412i().mo180362M4()) {
            Conversation conversation = this.f82482k;
            if (conversation.unreadMessages > 0 || !NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(this.f82482k.additional.localMomentInfo) || TextUtils.isEmpty(this.f82482k.additional.localMomentInfo.newMomentId)) {
                str = null;
            } else {
                ConversationMomentInfo conversationMomentInfo = this.f82482k.additional.localMomentInfo;
                if (TextUtils.equals(conversationMomentInfo.newMomentId, conversationMomentInfo.lastShowedMomentId)) {
                    str = null;
                } else {
                    Conversation conversation2 = this.f82482k;
                    ConversationMomentInfo conversationMomentInfo2 = conversation2.additional.localMomentInfo;
                    str = conversationMomentInfo2.newMomentId;
                    conversationMomentInfo2.lastShowedMomentId = str;
                    j000.m142895n(conversation2.mo225055clone()).subscribe(psd0.m173597H(new y20() { // from class: l.kkz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            clz.m110743O1((uxj0) obj);
                        }
                    }, new y20() { // from class: l.lkz
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            clz.m110829y0((Throwable) obj);
                        }
                    }));
                    m143372e0().mo50157k0().m183872l0(true);
                }
            }
            if ((this.f82481j instanceof User) && !CoreModule.f18264c.f20384f0.f20610J0.get().equals(this.f82474c)) {
                if ((CoreModule.m30933P().m143412i().mo180446c() && ((User) this.f82481j).onlineMatchLocked()) || ((User) this.f82481j).unilateralBlock() || m111000k4(this.f82474c) || this.f82482k.isAnonymous() || mo110970e4() || User.isTeamAccount(this.f82474c)) {
                    return;
                }
                CoreModule.m30933P().m143412i().mo180300B3(this.f82474c);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                CoreModule.m30932N().mo61582va(act(), this.f82474c, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ Boolean m110931W4(pf60 pf60Var) {
        return Boolean.valueOf(m111025p4((String) pf60Var.f152157b));
    }

    /* JADX INFO: renamed from: W5 */
    public User m110932W5() {
        return this.f82480i;
    }

    /* JADX INFO: renamed from: W6 */
    public void m110933W6(String str) {
        this.f82499z.add(str);
    }

    /* JADX INFO: renamed from: X2 */
    public void m110934X2() {
        boolean z;
        if (NullChecker.m82486a(CoreModule.f18265d.m144645g()) && NullChecker.m82486a(CoreModule.f18265d.m144645g().keepConnection)) {
            this.f82469W = CoreModule.f18265d.m144645g().keepConnection.chatTypingInterval;
            z = CoreModule.f18265d.m144645g().keepConnection.chatTypingOpen;
        } else {
            z = false;
        }
        psd0.m173633z(this.f82470X);
        if (this.f82469W < 0 || !z) {
            this.f82470X = null;
            return;
        }
        m110900P6();
        int i = this.f82469W;
        this.f82470X = C22421c.interval(i == 0 ? 10L : i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ukz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179467a.m111070z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m110935X3(String str) {
        String str2;
        Conversation conversationM110994j3 = m110994j3();
        if (conversationM110994j3 == null) {
            return false;
        }
        if ("messages_title".equals(str)) {
            str2 = "navbar_avatar";
        } else if ("profile_bubble".equals(str)) {
            str2 = "user_card";
        } else {
            str2 = ("messages_thumbnail_left".equals(str) || "from_greet_act".equals(str)) ? "user_avatar" : null;
        }
        return br5.m106031b(act(), conversationM110994j3, pageId(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m110936X4(pf60 pf60Var) {
        m111027p6((String) pf60Var.f152156a, (String) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m110937X5(ArrayList<pf60<String, x20>> arrayList, final String str, final int i) {
        arrayList.add(jyb.m147494Y("send me messages 1 - " + i, new x20() { // from class: l.okz
            @Override // p153l.x20
            public final void call() {
                this.f147800a.m110848D5(i, str);
            }
        }));
    }

    /* JADX INFO: renamed from: X6 */
    public void m110938X6(Message message) {
        if (NullChecker.m82486a(message)) {
            message.fromConvType = "";
            int i = this.f82475d;
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
    public boolean mo110939Y2() {
        return false;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m110940Y3() {
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m110941Y4(ChatHeatActionData chatHeatActionData) {
        if (TextUtils.equals(chatHeatActionData.userId, m110989i3())) {
            rv4.m183254d(m111048t7().act(), chatHeatActionData);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m110942Y5() {
        Intent intent;
        Act act = act();
        if (act == null || (intent = act.getIntent()) == null || !intent.hasExtra("move_by_message_id")) {
            return;
        }
        final String stringExtra = intent.getStringExtra("move_by_message_id");
        if (TextUtils.isEmpty(stringExtra) || ((qzz) this.viewModel).m178953j0() == null) {
            return;
        }
        final List<Message> listM129496a0 = ((qzz) this.viewModel).m178953j0().m129496a0();
        if (jyb.m147479J(listM129496a0)) {
            return;
        }
        l51.m152888H(act, new Runnable() { // from class: l.qkz
            @Override // java.lang.Runnable
            public final void run() {
                this.f158186a.m110852E5(listM129496a0, stringExtra);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m110943Y6(double d) {
        MessageWarmingUpHelper.m50375v("currentTempDownDegree = " + d);
        this.f82465S = d;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        final Intent intent = act().getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        this.f82474c = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f82474c = intent.getStringExtra("userId");
        }
        this.f82475d = intent.getIntExtra("FROM", -1);
        this.f82476e = intent.getStringExtra("sub_from");
        this.f82477f = intent.getStringExtra("theme_type");
        this.f82478g = intent.getStringExtra("greet_from");
        this.f82452F = new jxd0("send_message_tip_" + this.f82473b, Boolean.FALSE);
        String strMo111034r3 = mo111034r3();
        this.f82473b = strMo111034r3;
        if (TextUtils.isEmpty(strMo111034r3)) {
            StringBuilder sb = new StringBuilder("MessagesAct error: userId is null, from = ");
            sb.append(this.f82475d);
            sb.append(Constants.SEPARATOR_COMMA);
            Bundle extras = intent.getExtras();
            if (NullChecker.m82486a(extras)) {
                Set<String> setKeySet = extras.keySet();
                sb.append("extras: ");
                for (String str : setKeySet) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(extras.get(str));
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            CrashHelper.m82479c(new Exception(sb.toString()));
        }
        if (CoreModule.m30933P().m143412i().mo180546v() && this.f82475d == 31) {
            l51.m152887G(new Runnable() { // from class: l.rjz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163526a.m111016n5(intent);
                }
            });
        }
        if (CoreModule.m30933P().m143412i().mo180446c()) {
            CoreModule.m30933P().m143412i().mo180562x5(false);
        }
        this.f82461O = this.f82460N.get().booleanValue();
    }

    @SuppressLint({"SV_USE_DUP_ID"})
    /* JADX INFO: renamed from: Z2 */
    public ArrayList<pf60<String, x20>> mo110944Z2() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        final String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        arrayList.add(jyb.m147494Y("English long text", new x20() { // from class: l.yhz
            @Override // p153l.x20
            public final void call() {
                this.f200000a.m110835A4(str);
            }
        }));
        arrayList.add(jyb.m147494Y("send me a text message", new x20() { // from class: l.kiz
            @Override // p153l.x20
            public final void call() {
                this.f127056a.m110839B4();
            }
        }));
        arrayList.add(jyb.m147494Y("recall the last message from me", new x20() { // from class: l.oiz
            @Override // p153l.x20
            public final void call() {
                this.f147596a.m110843C4();
            }
        }));
        arrayList.add(jyb.m147494Y("send me a text message with 3 sec delay", new x20() { // from class: l.piz
            @Override // p153l.x20
            public final void call() {
                this.f152631a.m110851E4();
            }
        }));
        arrayList.add(jyb.m147494Y("toggle apple watch mode", new x20() { // from class: l.qiz
            @Override // p153l.x20
            public final void call() {
                this.f157898a.m110855F4();
            }
        }));
        arrayList.add(jyb.m147494Y("send me a message with same content as last", new x20() { // from class: l.riz
            @Override // p153l.x20
            public final void call() {
                this.f163404a.m110858G4();
            }
        }));
        arrayList.add(jyb.m147494Y("send me a message with same content as last with 3 sec delay", new x20() { // from class: l.siz
            @Override // p153l.x20
            public final void call() {
                this.f168887a.m110868I4();
            }
        }));
        arrayList.add(jyb.m147494Y("send messages 1 - 1000", new x20() { // from class: l.tiz
            @Override // p153l.x20
            public final void call() {
                this.f174518a.m110878K4(str);
            }
        }));
        arrayList.add(jyb.m147494Y("send messages 1 - 10", new x20() { // from class: l.uiz
            @Override // p153l.x20
            public final void call() {
                this.f179165a.m110882L4();
            }
        }));
        arrayList.add(jyb.m147494Y("send message delayed 5 sec", new x20() { // from class: l.viz
            @Override // p153l.x20
            public final void call() {
                this.f184333a.m110890N4();
            }
        }));
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 5);
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 25);
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 50);
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 100);
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 200);
        m110937X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 1000);
        arrayList.add(jyb.m147494Y("make the other user block me delay 3 sec", new x20() { // from class: l.zhz
            @Override // p153l.x20
            public final void call() {
                this.f204473a.m110898P4();
            }
        }));
        arrayList.add(jyb.m147494Y("toggle slow motion anim adapter", new x20() { // from class: l.aiz
            @Override // p153l.x20
            public final void call() {
                clz.m110772c2();
            }
        }));
        arrayList.add(jyb.m147494Y("unlock stickers now", new x20() { // from class: l.ciz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20366Z.f20884S.m35935E();
            }
        }));
        arrayList.add(jyb.m147494Y("animation duration -100 miliseconds", new x20() { // from class: l.diz
            @Override // p153l.x20
            public final void call() {
                clz.m110735J1();
            }
        }));
        arrayList.add(jyb.m147494Y("animation duration +100 miliseconds", new x20() { // from class: l.eiz
            @Override // p153l.x20
            public final void call() {
                clz.m110807p2();
            }
        }));
        arrayList.add(jyb.m147494Y("show user id", new x20() { // from class: l.fiz
            @Override // p153l.x20
            public final void call() {
                this.f99281a.m110903Q4();
            }
        }));
        arrayList.add(jyb.m147494Y("animate particles", new x20() { // from class: l.giz
            @Override // p153l.x20
            public final void call() {
                this.f104541a.m110907R4();
            }
        }));
        arrayList.add(jyb.m147494Y("show current user abGroups", new x20() { // from class: l.hiz
            @Override // p153l.x20
            public final void call() {
                this.f110104a.m110912S4();
            }
        }));
        arrayList.add(jyb.m147494Y("直播小助手展示欢迎", new x20() { // from class: l.iiz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33813Tg(null);
            }
        }));
        arrayList.add(jyb.m147494Y("清空直播小助手", new x20() { // from class: l.jiz
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33693Jf();
            }
        }));
        arrayList.add(jyb.m147494Y("当前聊天的ID:" + mo111034r3(), new x20() { // from class: l.liz
            @Override // p153l.x20
            public final void call() {
                clz.m110734J0();
            }
        }));
        arrayList.add(jyb.m147494Y("reset cleanbot status", new x20() { // from class: l.niz
            @Override // p153l.x20
            public final void call() {
                this.f142235a.m110917T4();
            }
        }));
        arrayList.addAll(nbz.m162441u2(this));
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m110945Z3(Message message) {
        return NullChecker.m82486a(message.localAudioText) && TEnum.equals(message.localAudioText.status, "default") && !TextUtils.isEmpty(message.localAudioText.translationResult);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m110946Z4(Boolean bool) {
        if (bool.booleanValue()) {
            ((qzz) this.viewModel).m178917T1();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m110947Z5() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: Z6 */
    public void m110948Z6(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m50375v("setCurrentTempLevel = " + warmingUpLevel);
        this.f82463Q = warmingUpLevel;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m110877K3();
        m110741N3();
        m110751R3();
        m110872J3();
        m110911S3();
        m110738M3();
        m110916T3();
        m110744O3();
        m110867I3();
        m110846D3();
        m110850E3();
        m110902Q3();
        m110862H3();
        m110897P3();
        m110759V3();
    }

    /* JADX INFO: renamed from: a3 */
    public void m110949a3() {
        psd0.m173633z(this.f82470X);
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m110950a4(User user) {
        return false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ C22421c m110951a5() {
        return CoreModule.f18264c.f20384f0.m34119se(m110989i3());
    }

    /* JADX INFO: renamed from: a6 */
    public boolean mo110952a6() {
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public void m110953a7(double d) {
        MessageWarmingUpHelper.m50375v("setCurrentTempUpDegree = " + d);
        this.f82464R = d;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m110955b4() {
        return TextUtils.equals(m111065y3(), "all_match_new_match") || TextUtils.equals(m111065y3(), "one_new_match") || TextUtils.equals(m111065y3(), "all_new_match") || TextUtils.equals(m111065y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ Boolean m110956b5(uxj0 uxj0Var) {
        return Boolean.valueOf(mo110952a6());
    }

    /* JADX INFO: renamed from: b6 */
    public boolean mo110957b6() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m110960c4(String str) {
        return false;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m110961c5(uxj0 uxj0Var) {
        if (m110960c4(mo111034r3()) || m111000k4(m110989i3()) || m110965d4()) {
            return;
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: c6 */
    public boolean mo110962c6() {
        return false;
    }

    /* JADX INFO: renamed from: c7 */
    public void m110963c7(Message message) {
        this.f82472Z = message;
        this.f82483k0 = null;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m110965d4() {
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m110966d5(Bundle bundle) {
        CoreModule.f18264c.f20384f0.m34092pq(this.f82473b);
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public boolean mo110967d6() {
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public void m110968d7(MessageMomentGuide messageMomentGuide) {
        this.f82483k0 = messageMomentGuide;
        this.f82472Z = null;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean mo110970e4() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22421c m110971e5() {
        return psd0.m173627t(mo111039s3(this.f82473b), CoreModule.f18264c.f20381e0.m116596o9(), mo110915T2(), this.f82457K, new tcj() { // from class: l.tkz
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return clz.m110793l0(obj, (User) obj2, (Conversation) obj3, (uxj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public boolean mo110972e6() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public boolean m110973e7(String str) {
        boolean zEquals = TextUtils.equals(this.f82451E0, str);
        boolean z = !zEquals;
        if (!zEquals) {
            this.f82451E0 = str;
        }
        return z;
    }

    /* JADX INFO: renamed from: f3 */
    public C22421c<Boolean> m110974f3(String str, String str2, String str3, final String str4, Message message) {
        return duringCreated(CoreModule.f18264c.f20384f0.m33848Wf(str, str2, str3, str4, message)).map(new qcj() { // from class: l.tgz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str4));
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m110975f4(String str) {
        if (CoreModule.m30933P().m143412i().mo180570z(str)) {
            o1j0.m165649w(R$string.f21495F4);
            return true;
        }
        if (!o3z.m165898g().m165901e(str)) {
            return false;
        }
        o1j0.m165649w(R$string.f21503G4);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m110976f5(bkj0 bkj0Var) {
        this.f82482k = (Conversation) bkj0Var.f77083c;
        if (!mo110970e4()) {
            this.f82494u = !TextUtils.isEmpty(m110989i3()) && CoreModule.m30930K().mo31822sg(m110989i3());
        }
        if (this.f82482k == null) {
            return;
        }
        this.f82480i = (User) bkj0Var.f77082b;
        H h = (H) bkj0Var.f77081a;
        this.f82481j = h;
        mo110954b3(h);
        if (xzm0.m213760p().m213775s() && !(this instanceof ggz) && !(this instanceof jlz) && (this.f82481j instanceof User)) {
            m143372e0().mo50143F().m183232y0().mo137537n((User) this.f82481j, this.f82482k);
        }
        ((qzz) this.viewModel).f160421t1.mo169752j();
        ((qzz) this.viewModel).mo154145D0();
        m110930W3();
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m110977f6() {
        List listM15984q;
        int iM147476G;
        if (m143372e0().mo50160u0().m128943O0() && (iM147476G = jyb.m147476G((listM15984q = Lists.m15984q(this.f82491r.f184001a)), new qcj() { // from class: l.vgz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184070a.m110856F5((Message) obj);
            }
        })) > 0) {
            for (int i = iM147476G - 1; i >= 0; i--) {
                Message message = (Message) listM15984q.get(i);
                if (message.isOtherUser() && NullChecker.m82486a(message.audio()) && !message.audio().audioRead) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public boolean m110978f7(Message message) {
        m110984h3();
        return this.f82498y && TextUtils.equals(this.f82496w, message.f56859id);
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m110980g4() {
        if (!mo111005l4() || !CoreModule.m30933P().m143412i().mo180335I0() || CoreModule.m30930K().me_().isFemale() || CoreModule.m30933P().m143412i().mo34626ws() > 0) {
            return false;
        }
        CoreModule.m30933P().m143405a().mo34537l1(act(), "message");
        return true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m110981g5(Message message) {
        this.f82485m = message;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean mo110982g6() {
        return true;
    }

    /* JADX INFO: renamed from: g7 */
    public boolean m110983g7(Message message) {
        return m110945Z3(message) && this.f82499z.contains(message.f56859id);
    }

    /* JADX INFO: renamed from: h3 */
    public void m110984h3() {
        if (!TextUtils.isEmpty(this.f82496w)) {
            Message messageQuery = CoreModule.f18272k.f115535c.query(this.f82496w);
            if (NullChecker.m82486a(messageQuery) && NullChecker.m82486a(messageQuery.recalled) && !messageQuery.recalled.booleanValue()) {
                return;
            }
        }
        Message message = this.f82497x > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (Message) jyb.m147529r(CoreModule.f18264c.f20384f0.m34095qg(m110989i3(), this.f82497x), this.f82489p0) : (Message) jyb.m147529r(CoreModule.f18264c.f20384f0.m34134tg(m110989i3()), this.f82489p0);
        if (!NullChecker.m82486a(message)) {
            m110875J6();
        } else {
            this.f82496w = message.f56859id;
            this.f82497x = message.createdTime;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo110985h4() {
        return false;
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ C22421c m110986h5(Conversation conversation) {
        return CoreModule.f18264c.f20384f0.m33856Wn(m110989i3(), conversation.clearedUntil);
    }

    /* JADX INFO: renamed from: h6 */
    public boolean m110987h6(int i, int i2, Intent intent) {
        if (i == 16) {
            if (i2 == -1) {
                act().m68056e2();
                act().overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i != 48) {
            if (i == 64 && i2 == -1) {
                act().setResult(-1, intent);
                act().m68056e2();
                return true;
            }
            if (i != 10111 || i2 != -1) {
                return false;
            }
            ((qzz) this.viewModel).m178933a2();
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
            m110913S5(message);
        }
        return true;
    }

    /* JADX INFO: renamed from: h7 */
    public boolean m110988h7() {
        return CoreModule.m30933P().m143412i().mo180440b() && mo111049u3() != null;
    }

    /* JADX INFO: renamed from: i3 */
    public String m110989i3() {
        return this.f82474c;
    }

    /* JADX INFO: renamed from: i4 */
    public boolean m110990i4() {
        return TextUtils.equals(m111065y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ C22421c m110991i5() {
        return psd0.m173627t(mo110920U2(), this.f82484l, mo111039s3(this.f82473b), this.f82458L, new tcj() { // from class: l.nkz
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return clz.m110776e2((Conversation) obj, (vg60) obj2, obj3, (uxj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public final void m110992i6(final AudioText audioText) {
        l51.m152888H(act(), new Runnable() { // from class: l.wkz
            @Override // java.lang.Runnable
            public final void run() {
                this.f189610a.m110864H5(audioText);
            }
        }, m110876K2());
    }

    /* JADX INFO: renamed from: i7 */
    public boolean mo110993i7() {
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public Conversation m110994j3() {
        return this.f82482k;
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m110995j4() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        return NullChecker.m82486a(userM116503Pa) && userM116503Pa.onlineMatchLocked();
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m110996j5() {
        Conversation conversation = this.f82482k;
        conversation.localDraft = "";
        CoreModule.f18264c.f20384f0.m34053mq(conversation);
    }

    /* JADX INFO: renamed from: j6 */
    public final boolean m110997j6() {
        if (h39.m133424M() && hcm.m134472r().m134479q(pzi0.m174454o())) {
            hcm.m134472r().m134478F(act());
            return true;
        }
        if (CoreModule.m30933P().m143405a().mo34534kb() && k05.m147755h().m147767n() && m143372e0().mo50158l().m110955b4() && !m110950a4(m143372e0().mo50158l().m111057w3(m143372e0().mo50158l().mo111034r3()))) {
            k05.m147757v(act(), k05.m147755h().m147760f());
            return true;
        }
        if (m143372e0().mo50155d0().m143374g0().mo125460d()) {
            return true;
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && !CoreModule.m30933P().m143412i().mo180492k1() && CoreModule.m30933P().m143412i().mo180571z0() && NullChecker.m82486a(this.f82482k) && !this.f82482k.localEverHasMessage && NullChecker.m82486a(mo111064x6()) && mo111064x6().onlineMatchLocked() && !m111000k4(mo111034r3())) {
            CoreModule.m30933P().m143412i().mo180390S();
            CoreModule.m30933P().m143412i().mo180454d1(act());
            return true;
        }
        if (!CoreModule.m30933P().m143406b().mo36110Yg() || !NullChecker.m82486a(this.f82482k) || !CoreModule.m30933P().m143406b().mo36121lo(this.f82482k)) {
            return false;
        }
        CoreModule.m30933P().m143406b().mo36107Wl(act());
        return true;
    }

    /* JADX INFO: renamed from: j7 */
    public C22507a<Boolean> mo110998j7() {
        return C22507a.m222758b();
    }

    /* JADX INFO: renamed from: k3 */
    public double m110999k3() {
        return this.f82465S;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m111000k4(String str) {
        if (!CoreModule.m30933P().m143412i().mo180557x()) {
            return false;
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        return NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "dismissed");
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m111001k5() {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.vkz
            @Override // p153l.x20
            public final void call() {
                this.f184530a.m110996j5();
            }
        });
    }

    /* JADX INFO: renamed from: k7 */
    public boolean m111003k7() {
        if (!mo111008l7() || !NullChecker.m82486a(this.f82482k.additional) || !NullChecker.m82486a(this.f82482k.additional.matchInfo)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f82482k.additional.matchInfo.source) && this.f82482k.additional.matchInfo.matchTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        ConvAdditionalMatchInfo convAdditionalMatchInfo = this.f82482k.additional.matchInfo;
        return convAdditionalMatchInfo.likeTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && convAdditionalMatchInfo.likedByTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: l3 */
    public MessageWarmingUpHelper.WarmingUpLevel m111004l3() {
        return this.f82463Q;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean mo111005l4() {
        return false;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Boolean m111006l5(Message message) {
        Boolean bool;
        return Boolean.valueOf(m143372e0().mo50160u0().m128942N0(message._id) && ((bool = message.recalled) == null || !bool.booleanValue()) && NullChecker.m82486a(message.audio()));
    }

    /* JADX INFO: renamed from: l6 */
    public boolean mo111007l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        act().m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: l7 */
    public boolean mo111008l7() {
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public double m111009m3() {
        return this.f82464R;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m111010m4(Message message) {
        return NullChecker.m82486a(message) && TextUtils.equals(message.f56859id, this.f82496w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [B, l.vg60] */
    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m111011m5(bkj0 bkj0Var) {
        this.f82482k = (Conversation) bkj0Var.f77081a;
        this.f82481j = (H) bkj0Var.f77083c;
        if (mo110962c6()) {
            bkj0Var.f77082b = m111014n3(bkj0Var);
        }
        if (CoreModule.m30933P().m143412i().mo180495l() && !TextUtils.isEmpty(this.f82482k.localDraft)) {
            m143372e0().mo50138B0().m143374g0().m113969K1(this.f82482k.localDraft);
            l51.m152919y(new Runnable() { // from class: l.dkz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89479a.m111001k5();
                }
            });
        }
        vg60<Message> vg60Var = (vg60) bkj0Var.f77082b;
        if (!mo110970e4()) {
            this.f82494u = !TextUtils.isEmpty(this.f82473b) && CoreModule.m30930K().mo31822sg(this.f82473b);
            if (!jyb.m147479J(vg60Var.f184001a)) {
                ((qzz) this.viewModel).mo178895H1(vg60Var.f184001a.get(0));
            }
        }
        if (CoreModule.m30933P().m143412i().mo180308D() && !jyb.m147479J(vg60Var.f184001a)) {
            C8687b.m50248q(vg60Var.f184001a.get(0));
        }
        if (m143372e0().mo50160u0().m128943O0() && !jyb.m147520m(vg60Var.f184001a, new qcj() { // from class: l.fkz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99575a.m111006l5((Message) obj);
            }
        })) {
            m143372e0().mo50160u0().m128939H0().stop();
        }
        ((qzz) this.viewModel).m178953j0().m129498c0(vg60Var, ((Conversation) bkj0Var.f77081a).reminder, this.f82485m);
        if (NullChecker.m82486a(m143372e0().mo50160u0().m128939H0())) {
            m143372e0().mo50160u0().m128939H0().setNeedToPlayNext(m110977f6());
        }
        ((qzz) this.viewModel).m178901K1();
        ((qzz) this.viewModel).f160421t1.mo169751h(vg60Var);
        if (vg60Var.f184001a.size() == 0 && vg60Var.m201221c()) {
            ((qzz) this.viewModel).m178953j0().mo129501e(0);
        }
        if (vg60Var.f184001a.size() > 0) {
            if (((CoreModule.m30933P().m143412i().mo180314E() && mo110970e4()) ? false : vg60Var.f184001a.get(0).owner.equals(this.f82473b)) && !TextUtils.equals(this.f82482k.readUntil, vg60Var.f184001a.get(0).f56859id)) {
                m110905Q6(m110989i3());
            }
            Message message = vg60Var.f184001a.get(0);
            String str = this.f82487o;
            if (str == null) {
                this.f82487o = message.f56859id;
            } else if (!str.equals(message.f56859id) && !TextUtils.isEmpty(message.f56859id) && !message.f56859id.startsWith("fake_id_")) {
                this.f82487o = message.f56859id;
                if (message.isMe()) {
                    CoreModule.f18264c.f20384f0.f20664b0.m137019l(message);
                } else {
                    CoreModule.f18264c.f20384f0.f20667c0.m137019l(message);
                }
            }
        } else {
            this.f82487o = "";
        }
        if (!mo110970e4()) {
            m143372e0().mo50138B0().m143374g0().m113957E0();
        }
        if (!mo110970e4()) {
            m143372e0().mo50138B0().m143374g0().m113951A0();
        }
        if (!mo110970e4() && o3z.m165898g().m165909o(this.f82482k)) {
            if (vg60Var.f184001a.isEmpty()) {
                boolean z = this.f82482k.localEverHasMessage;
                V v2 = this.viewModel;
                if (z) {
                    ((qzz) v2).m178934b2();
                } else {
                    ((qzz) v2).m178915S1();
                }
                Conversation conversation = this.f82482k;
                if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                    m143372e0().mo50138B0().m143374g0().m113984S1(mo111034r3());
                }
            } else {
                ((qzz) this.viewModel).m178915S1();
                m143372e0().mo50138B0().m143374g0().m113984S1(mo111034r3());
            }
        }
        if (!mo110970e4()) {
            m110854F3();
        }
        mo110959c3(this.f82482k, vg60Var, this.f82481j);
    }

    /* JADX INFO: renamed from: m6 */
    public void m111012m6(List<Media> list) {
        m111017n6(list, 0);
    }

    /* JADX INFO: renamed from: m7 */
    public void m111013m7() {
        if (mo111049u3() == null) {
            return;
        }
        if (!TextUtils.isEmpty(mo111049u3().schema)) {
            nae0.m162083m(act(), Uri.parse(mo111049u3().schema));
        } else {
            i4g0.m138523u("e_live_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("liveId", mo111049u3().liveId), jyb.m147494Y("anchorId", mo111049u3().userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("show_label", "连线"), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "NA"));
            CoreModule.m30934Q().startAudienceLive(act(), mo111049u3().liveId, "chat", null);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final vg60 m111014n3(bkj0<Conversation, vg60<Message>, H> bkj0Var) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(bkj0Var.f77082b) && !jyb.m147479J(bkj0Var.f77082b.f184001a)) {
            arrayList = jyb.m147522n(bkj0Var.f77082b.f184001a, new qcj() { // from class: l.ogz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f147327a.m110922U4((Message) obj);
                }
            });
            if (!jyb.m147479J(arrayList) && !jyb.m147520m(arrayList, new qcj() { // from class: l.pgz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(NullChecker.m82486a(message) && !message.f56859id.startsWith("fake_id_"));
                }
            })) {
                arrayList = new ArrayList();
            }
        }
        return new vg60(arrayList, bkj0Var.f77082b.f184002b);
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m111015n4(String str) {
        return this.f82499z.contains(str);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m111016n5(Intent intent) {
        if (TextUtils.equals(intent.getStringExtra("ISCALLEER"), "1")) {
            xzm0.m213760p().m213765h(act(), this.f82474c, "voiceQuickChat");
        } else {
            xzm0.m213760p().m213762e();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m111017n6(List<Media> list, int i) {
        if (list.size() <= 0 || !(list.get(0) instanceof Video)) {
            m110845C6(list, i);
        } else {
            m111042s6(oki.m168038z(((Video) list.get(0)).url));
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m111018n7() {
        i4g0.m138492A("e_live_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("liveId", mo111049u3().liveId), jyb.m147494Y("anchorId", mo111049u3().userId), jyb.m147494Y("live_status", "on"), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("show_label", "连线"), jyb.m147494Y("liveRecommendCategory", "NA"));
    }

    /* JADX INFO: renamed from: o3 */
    public int m111019o3() {
        return this.f82475d;
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m111020o4(String str) {
        if (!TextUtils.equals(this.f82448C, str)) {
            return false;
        }
        this.f82448C = null;
        return true;
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m111021o5(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            ((qzz) this.viewModel).m178945g0();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m111022o6(Menu menu) {
        Menu menu2;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        if (!CoreModule.m30933P().m143412i().mo180446c() || !NullChecker.m82486a(userM116503Pa) || !userM116503Pa.onlineMatch() || m111000k4(this.f82473b) || CoreModule.m30933P().m143412i().mo180325G1()) {
            return false;
        }
        if (userM116503Pa.onlineMatchLocked()) {
            menu.removeItem(2);
        } else if (menu.findItem(2) == null) {
            CoreModule.m30933P().m143412i().mo180420W5(true, menu, this.f82473b, act());
        }
        if (menu.findItem(3) != null || userM116503Pa.isTeamAccount()) {
            menu2 = menu;
        } else {
            menu2 = menu;
            CoreModule.m30933P().m143412i().mo180343J3(true, true, null, act(), menu2, this.f82473b, null, OMSDialogPositon.p_chat_view);
        }
        if (!CoreModule.m30933P().m143412i().mo180308D() || menu2.findItem(4) != null || !NullChecker.m82486a(userM116503Pa) || userM116503Pa.isTeamAccount()) {
            return false;
        }
        CoreModule.m30933P().m143412i().mo180448c1(act(), menu2, userM116503Pa.f56859id);
        return false;
    }

    /* JADX INFO: renamed from: o7 */
    public List<Object> m111023o7() {
        return jyb.m147507f0("other user id", this.f82473b, og3.f147188c);
    }

    /* JADX INFO: renamed from: p3 */
    public LocalStatus m111024p3() {
        return this.f82471Y;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m111025p4(String str) {
        return this.f82446A.contains(str);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m111026p5(HashMap map) {
        try {
            for (List list : map.values()) {
                Act.C4450r c4450r = list.size() >= 1 ? (Act.C4450r) list.get(list.size() - 1) : null;
                Act.C4450r c4450r2 = list.size() >= 2 ? (Act.C4450r) list.get(list.size() - 2) : null;
                if (NullChecker.m82486a(c4450r2) && (c4450r2.f16062a.get() instanceof SelectContactAct)) {
                    c4450r2 = list.size() >= 3 ? (Act.C4450r) list.get(list.size() - 3) : null;
                }
                if (NullChecker.m82486a(c4450r2) && !c4450r2.f16065d && NullChecker.m82486a(c4450r) && c4450r.f16062a.get() == act()) {
                    Activity activity = c4450r2.f16062a.get();
                    if ((activity instanceof MessagesAct) && ((MessagesAct) activity).mo50158l().mo111034r3().equals(this.f82473b) && activity != act()) {
                        mo110885M2((MessagesAct) activity);
                        act().m68056e2();
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("MessagesAct Exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m111027p6(String str, final String str2) {
        duringCreated(CoreModule.f18264c.f20384f0.m33896ag(str, str2).observeOn(fo0.m126432a())).filter(new yjz()).take(1).subscribe(psd0.m173597H(new zjz(this), new y20() { // from class: l.jkz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121458a.m110869I5(str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p7 */
    public void m111028p7(final Message message, boolean z) {
        if (m111010m4(message)) {
            m110875J6();
        }
        if (m111025p4(message.f56859id)) {
            return;
        }
        if (NullChecker.m82486a(message.localAudioText) && TEnum.equals(message.localAudioText.status, "failed") && !message.localAudioText.failRetry) {
            m111033q7(message.f56859id, false);
            return;
        }
        if (m110945Z3(message)) {
            m110933W6(message.f56859id);
            m111048t7().m178953j0().m153307y();
            return;
        }
        if (z) {
            this.f82447B = message.f56859id;
            this.f82498y = false;
        }
        this.f82449D = pzi0.m174454o();
        this.f82446A.add(message.f56859id);
        duringCreated(CoreModule.f18264c.f20384f0.m33930cq(m110989i3(), message.f56859id)).filter(new yjz()).take(1).subscribe(psd0.m173597H(new zjz(this), new y20() { // from class: l.akz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72060a.m110904Q5(message, (Throwable) obj);
            }
        }));
        kcg0 kcg0VarSubscribe = duringCreated(C22421c.timer(10L, TimeUnit.SECONDS).compose(psd0.m173592C())).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.bkz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77134a.m110908R5(message, (Long) obj);
            }
        }));
        if (message.isOtherUser() && !message.audio().audioRead) {
            CoreModule.f18264c.f20384f0.m33587An(message.f56859id);
        }
        this.f82450E.put(message.f56859id, kcg0VarSubscribe);
        m111048t7().m178953j0().m153307y();
    }

    public String pageId() {
        if (mo110970e4()) {
            return "p_group_chat_view";
        }
        if (m110965d4()) {
            return "p_greet_chat";
        }
        return (TextUtils.isEmpty(this.f82473b) || !m111000k4(this.f82473b)) ? OMSDialogPositon.p_chat_view : "p_unmatch_details";
    }

    /* JADX INFO: renamed from: q3 */
    public H m111029q3() {
        return this.f82481j;
    }

    /* JADX INFO: renamed from: q4 */
    public boolean mo111030q4() {
        return false;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m111031q5(Bundle bundle) {
        ((qzz) this.viewModel).mo178970r();
    }

    /* JADX INFO: renamed from: q6 */
    public void m111032q6(String str) {
        V v2 = this.viewModel;
        ((qzz) v2).f160408n1.setSelectionHook(((qzz) v2).f160408n1.getCountHook() - 1);
        m111042s6(str);
    }

    /* JADX INFO: renamed from: q7 */
    public void m111033q7(String str, boolean z) {
        psd0.m173633z(this.f82450E.remove(str));
        if (TextUtils.equals(this.f82447B, str)) {
            this.f82447B = null;
            this.f82498y = true;
        }
        this.f82446A.remove(str);
        m111048t7().m178953j0().m153307y();
        if (z) {
            tcz.m190561y(act());
        } else {
            sfj0.m185601h("e_chat_message_convert_to_text_failed", pageId(), new sfj0.C20032a[0]);
            o1j0.m165649w(R$string.f21652Z1);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public abstract String mo111034r3();

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m111035r4() {
        ((qzz) this.viewModel).m178930Z1();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ C22421c m111036r5() {
        return psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(this.f82473b), CoreModule.f18264c.f20384f0.m34051mo(this.f82473b), CoreModule.f18264c.f20384f0.m33823Ue(this.f82473b), new qvy());
    }

    /* JADX INFO: renamed from: r6 */
    public void m111037r6(String str) {
        V v2 = this.viewModel;
        ((qzz) v2).f160408n1.setSelectionHook(((qzz) v2).f160408n1.getCountHook() - 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m110841B6(arrayList);
    }

    /* JADX INFO: renamed from: r7 */
    public void m111038r7(String str) {
        psd0.m173633z(this.f82450E.remove(str));
        sfj0.m185601h("e_chat_message_convert_to_text", pageId(), new sfj0.C20032a[0]);
        m110933W6(str);
        this.f82446A.remove(str);
        this.f82448C = str;
        m110889N2(str);
        m111048t7().m178953j0().m153307y();
    }

    /* JADX INFO: renamed from: s3 */
    public abstract C22421c<H> mo111039s3(String str);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m111040s4(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20385f1.m155892R3(str);
            if (CoreModule.m30933P().m143412i().mo180445b5()) {
                CoreModule.f18264c.f20385f1.m155889O3(mo111064x6().f56859id);
                i4g0.m138519q("e_chat_gift_bar_gift_send", act().pageId(), jyb.m147494Y("chat_gift_id", str));
            }
            l51.m152888H(act(), new Runnable() { // from class: l.ehz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94095a.m111035r4();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ C22421c m111041s5(Integer num) {
        return CoreModule.f18264c.f20330N0.m32974o3(mo110970e4() ? "" : this.f82473b);
    }

    /* JADX INFO: renamed from: s6 */
    public void m111042s6(String str) {
        vel0 vel0Var = new vel0(str);
        if (!NullChecker.m82486a(vel0Var.f183805a)) {
            o1j0.m165634h(R$string.f21469C2);
        } else if (vel0Var.f183806b > Constants.ONE_MIN_IN_MILLIS) {
            o1j0.m165634h(R$string.f21607T4);
        } else {
            m110928V6(vel0Var);
        }
    }

    /* JADX INFO: renamed from: s7 */
    public void m111043s7(boolean z) {
        CoreModule.f18264c.f20384f0.m33601Bo(m110989i3());
    }

    /* JADX INFO: renamed from: t3 */
    public double mo111044t3() {
        return -1.0d;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m111045t4(Throwable th) {
        if (!(th instanceof TantanException.Client.TantanForbidden) || !gta.m132210e().m132214d().mo34672Ct((TantanException.Client.TantanForbidden) th)) {
            return Boolean.FALSE;
        }
        tcz.m190528F(act(), mo111064x6());
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m111046t5(C4470c c4470c) {
        m110942Y5();
    }

    /* JADX INFO: renamed from: t7 */
    public V m111048t7() {
        return (V) super.m143374g0();
    }

    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel mo111049u3() {
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m111050u4(Message message, Message message2) {
        x95.INSTANCE.m209793m("Send Message", null);
        if (TEnum.equals(message2.messageType(), MessageType.chat_gift) && NullChecker.m82486a(message2.additionalData) && NullChecker.m82486a(message2.additionalData.chatGiftInfo) && !mo110970e4()) {
            CoreGiftInfo coreGiftInfoM155892R3 = CoreModule.f18264c.f20385f1.m155892R3(message2.additionalData.chatGiftInfo.f21103id);
            if (NullChecker.m82486a(coreGiftInfoM155892R3) && coreGiftInfoM155892R3.dynamicGift && !CoreModule.m30933P().m143412i().mo180491k0()) {
                mo110866I2(coreGiftInfoM155892R3);
            }
            CoreModule.m30933P().m143412i().mo180551w0(pageId(), mo111034r3(), true);
            CoreModule.f18264c.f20384f0.f20664b0.m137019l(message);
        }
        if (TEnum.equals(message2.messageType, MessageType.real_shot) && CoreModule.f18264c.f20384f0.f20660Z1) {
            sfj0.m185601h("e_chat_topic_rec_photo_text", act().pageId(), sfj0.C20032a.m185615h("send_user_id", message2.owner));
        }
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m111051u5(C4470c c4470c) {
        if (c4470c == C4470c.f16269k && CoreModule.m30933P().m143412i().mo180472g1()) {
            this.f82451E0 = null;
        }
        if (c4470c == C4470c.f16271m) {
            k900.m148794f();
            k900.m148795g();
            mo110964d3();
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m111052u6() {
        String strMo110834A3 = mo110834A3();
        CoreModule.f18264c.f20384f0.m33859Xe(this.f82473b);
        act().startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act(), m110932W5().f56859id, strMo110834A3, false), 16);
    }

    /* JADX INFO: renamed from: v3 */
    public Message m111053v3(final long j) {
        List listM15984q = Lists.m15984q(this.f82491r.f184001a);
        int iM147476G = jyb.m147476G(listM15984q, new qcj() { // from class: l.ugz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Message) obj)._id == j);
            }
        });
        if (iM147476G <= 0) {
            return null;
        }
        for (int i = iM147476G - 1; i >= 0; i--) {
            Message message = (Message) listM15984q.get(i);
            if (message.isOtherUser() && NullChecker.m82486a(message.audio()) && !message.audio().audioRead) {
                return message;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m111054v4(Message message, Throwable th) {
        if (TEnum.equals(message.messageType(), MessageType.chat_gift)) {
            CoreModule.m30933P().m143412i().mo180551w0(pageId(), mo111034r3(), false);
        }
        mo110969e3(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && CoreModule.m30933P().m143412i().mo180483i2((TantanException.Client.TantanForbidden) th)) {
            o1j0.m165634h(R$string.f21527J4);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m111055v5(uxj0 uxj0Var) {
        ((qzz) this.viewModel).m178950h2();
    }

    /* JADX INFO: renamed from: v6 */
    public void m111056v6(String str) {
        m111060w6(str, this.f82473b);
    }

    /* JADX INFO: renamed from: w3 */
    public User m111057w3(String str) {
        return CoreModule.f18264c.f20381e0.m116488M7(str);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m111058w4(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m111059w5() {
        if (f82445H0 || !NullChecker.m82486a(this.f82473b) || User.isTeamAccount(this.f82473b) || !f82444G0.contains(Build.MODEL) || DialogAct.f55119f.get().intValue() >= 2 || !Network.language().equals(Network.LANGUAGE_ZH_HANS)) {
            return;
        }
        f82445H0 = true;
        act().startActivity(DialogAct.m80560P0(act(), 3, null));
    }

    /* JADX INFO: renamed from: w6 */
    public void m111060w6(String str, String str2) {
        if (TextUtils.equals(str2, this.f82473b) && m110935X3(str)) {
            return;
        }
        CoreModule.f18264c.f20381e0.m116503Pa(str2);
        Intent intentMo180360M1 = CoreModule.m30933P().m143412i().mo180360M1(act(), str2, str, false);
        mo110979g3(intentMo180360M1);
        act().startActivityForResult(intentMo180360M1, 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion mo111061x3() {
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m111062x4(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b).unilateralBlock()) {
            CoreModule.f18264c.f20381e0.m116447Ba(this.f82473b);
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m111063x5(User user) {
        boolean zM110995j4 = m110995j4();
        V v2 = this.viewModel;
        if (zM110995j4) {
            ((qzz) v2).m178947g2();
        } else {
            ((qzz) v2).m178979v0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User mo111064x6() {
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            return CoreModule.f18264c.f20381e0.m116503Pa(this.f82473b);
        }
        return null;
    }

    /* JADX INFO: renamed from: y3 */
    public String m111065y3() {
        return this.f82476e;
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m111066y4(Message message) {
        return Boolean.valueOf(TextUtils.equals(message.f56859id, this.f82447B));
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m111067y5(User user) {
        if (!user.onlineMatchLocked() || user.unilateralBlock()) {
            ((qzz) this.viewModel).m178981w0();
        } else {
            ((qzz) this.viewModel).m178898J0();
        }
    }

    /* JADX INFO: renamed from: z3 */
    public String mo111069z3() {
        return "";
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m111070z4(Long l2) {
        m110900P6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m111071z5(pf60 pf60Var) {
        if (((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue() == 25 && TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180418W3(this.f82473b)) && NullChecker.m82486a(((pf60) pf60Var.f152157b).f152157b)) {
            CoreModule.m30933P().m143412i().mo180558x0(this.f82473b, ((Message) ((pf60) pf60Var.f152157b).f152157b).f56859id);
        } else if (((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue() == 50 && TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180474g3(this.f82473b)) && NullChecker.m82486a(((pf60) pf60Var.f152157b).f152157b)) {
            CoreModule.m30933P().m143412i().mo180309D0(this.f82473b, ((Message) ((pf60) pf60Var.f152157b).f152157b).f56859id);
        } else if (((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue() == 75 && TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180451c5(this.f82473b)) && NullChecker.m82486a(((pf60) pf60Var.f152157b).f152157b)) {
            CoreModule.m30933P().m143412i().mo180312D3(this.f82473b, ((Message) ((pf60) pf60Var.f152157b).f152157b).f56859id);
        } else {
            if (((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue() != 100 || !TextUtils.isEmpty(CoreModule.m30933P().m143412i().mo180381Q1(this.f82473b)) || !NullChecker.m82486a(((pf60) pf60Var.f152157b).f152157b)) {
                return;
            }
            ((qzz) this.viewModel).m178939d2();
            CoreModule.m30933P().m143412i().mo180530r2(this.f82473b, ((Message) ((pf60) pf60Var.f152157b).f152157b).f56859id);
            if (CoreModule.m30933P().m143412i().mo180371O2()) {
                Keyboard keyboardMo125457a = m143372e0().mo50155d0().m143374g0().mo125457a();
                if (NullChecker.m82486a(keyboardMo125457a)) {
                    keyboardMo125457a.m49982C();
                }
            }
        }
        ((qzz) this.viewModel).m178888B1();
    }

    /* JADX INFO: renamed from: G6 */
    public void mo110860G6() {
    }

    /* JADX INFO: renamed from: H6 */
    public void mo110865H6() {
    }

    /* JADX INFO: renamed from: I6 */
    public void mo110870I6() {
    }

    /* JADX INFO: renamed from: d3 */
    public void mo110964d3() {
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: y6 */
    public void mo111068y6() {
    }

    /* JADX INFO: renamed from: I2 */
    public void mo110866I2(CoreGiftInfo coreGiftInfo) {
    }

    /* JADX INFO: renamed from: K6 */
    public void mo110880K6(IceBreakingQuestion iceBreakingQuestion) {
    }

    /* JADX INFO: renamed from: M2 */
    public void mo110885M2(PutongAct putongAct) {
    }

    /* JADX INFO: renamed from: b3 */
    public void mo110954b3(H h) {
    }

    /* JADX INFO: renamed from: b7 */
    public void mo110958b7(boolean z) {
    }

    /* JADX INFO: renamed from: e3 */
    public void mo110969e3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public Intent mo110979g3(Intent intent) {
        return intent;
    }

    /* JADX INFO: renamed from: t6 */
    public void mo111047t6(Message message) {
    }

    /* JADX INFO: renamed from: k6 */
    public void mo111002k6(int i, Menu menu) {
    }

    /* JADX INFO: renamed from: c3 */
    public void mo110959c3(Conversation conversation, vg60<Message> vg60Var, H h) {
    }

    /* JADX INFO: renamed from: z6 */
    public void mo111072z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
    }
}
