package p003l;

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
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.SelectContactAct;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.data.AudioText;
import com.p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationMomentInfo;
import com.p1.mobile.putong.core.data.ConversationQuickChat;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p1.mobile.putong.core.data.ExchangePicture;
import com.p1.mobile.putong.core.data.GiftSubBizType;
import com.p1.mobile.putong.core.data.IceBreakFriendData;
import com.p1.mobile.putong.core.data.IceBreakUserId;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageChannel;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageSentFrom;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.Survey;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.LocalStatus;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.DialogAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.Serializable;
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
import l.ag3;
import l.e51;
import l.hae0;
import l.hpd0;
import l.j2e0;
import l.j760;
import l.j7z;
import l.jq2;
import l.lsi0;
import l.lsx;
import l.lz4;
import l.mcr;
import l.mcz;
import l.mkd0;
import l.mqi0;
import l.n11;
import l.o6j0;
import l.pxz;
import l.q2z;
import l.q860;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s7m;
import l.szb0;
import l.tqm0;
import l.ura;
import l.vwb;
import l.w85;
import l.xaj0;
import l.xp5;
import l.y19;
import l.yaf0;
import l.yij0;
import l.zbc0;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import org.spongycastle.i18n.TextBundle;
import p003l.tqz;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1185a;
import p014rx.subjects.C1186b;
import p014rx.subjects.ReplaySubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class fcz<H, V extends tqz> extends muy<V> {

    /* JADX INFO: renamed from: F0 */
    public static C1186b<roj0> f3512F0 = C1186b.m9978b();

    /* JADX INFO: renamed from: G0 */
    public static final ArrayList<String> f3513G0 = vwb.f0(new String[]{"OPPO R9m", "OPPO R9s", "OPPO R9tm", "OPPO R9 Plusm A", "OPPO A59m"});

    /* JADX INFO: renamed from: H0 */
    public static boolean f3514H0 = false;

    /* JADX INFO: renamed from: A */
    public Set<String> f3515A;

    /* JADX INFO: renamed from: B */
    public String f3516B;

    /* JADX INFO: renamed from: C */
    public String f3517C;

    /* JADX INFO: renamed from: D */
    public long f3518D;

    /* JADX INFO: renamed from: E */
    public Map<String, c4g0> f3519E;

    /* JADX INFO: renamed from: E0 */
    public String f3520E0;

    /* JADX INFO: renamed from: F */
    public hpd0 f3521F;

    /* JADX INFO: renamed from: G */
    public uie0<Object, Object> f3522G;

    /* JADX INFO: renamed from: H */
    public List<CoreGiftInfo> f3523H;

    /* JADX INFO: renamed from: I */
    public hpd0 f3524I;

    /* JADX INFO: renamed from: J */
    public hpd0 f3525J;

    /* JADX INFO: renamed from: K */
    public C1185a<roj0> f3526K;

    /* JADX INFO: renamed from: L */
    public C1185a<roj0> f3527L;

    /* JADX INFO: renamed from: M */
    public hpd0 f3528M;

    /* JADX INFO: renamed from: N */
    public final hpd0 f3529N;

    /* JADX INFO: renamed from: O */
    public boolean f3530O;

    /* JADX INFO: renamed from: P */
    public boolean f3531P;

    /* JADX INFO: renamed from: Q */
    public volatile MessageWarmingUpHelper.WarmingUpLevel f3532Q;

    /* JADX INFO: renamed from: R */
    public volatile double f3533R;

    /* JADX INFO: renamed from: S */
    public volatile double f3534S;

    /* JADX INFO: renamed from: T */
    public boolean f3535T;

    /* JADX INFO: renamed from: U */
    public boolean f3536U;

    /* JADX INFO: renamed from: V */
    public boolean f3537V;

    /* JADX INFO: renamed from: W */
    public int f3538W;

    /* JADX INFO: renamed from: X */
    public c4g0 f3539X;

    /* JADX INFO: renamed from: Y */
    public LocalStatus f3540Y;

    /* JADX INFO: renamed from: Z */
    public Message f3541Z;

    /* JADX INFO: renamed from: b */
    public String f3542b;

    /* JADX INFO: renamed from: c */
    public String f3543c;

    /* JADX INFO: renamed from: d */
    public int f3544d;

    /* JADX INFO: renamed from: e */
    public String f3545e;

    /* JADX INFO: renamed from: f */
    public String f3546f;

    /* JADX INFO: renamed from: g */
    public String f3547g;

    /* JADX INFO: renamed from: h */
    public int f3548h;

    /* JADX INFO: renamed from: i */
    public User f3549i;

    /* JADX INFO: renamed from: j */
    public H f3550j;

    /* JADX INFO: renamed from: k */
    public Conversation f3551k;

    /* JADX INFO: renamed from: k0 */
    public MessageMomentGuide f3552k0;

    /* JADX INFO: renamed from: l */
    public C1099c<q860<Message>> f3553l;

    /* JADX INFO: renamed from: m */
    public Message f3554m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, String> f3555n;

    /* JADX INFO: renamed from: o */
    public String f3556o;

    /* JADX INFO: renamed from: p */
    public String f3557p;

    /* JADX INFO: renamed from: p0 */
    public w9j<Message, Boolean> f3558p0;

    /* JADX INFO: renamed from: q */
    public long f3559q;

    /* JADX INFO: renamed from: r */
    public q860<Message> f3560r;

    /* JADX INFO: renamed from: s */
    public C1185a<Boolean> f3561s;

    /* JADX INFO: renamed from: t */
    public boolean f3562t;

    /* JADX INFO: renamed from: u */
    public boolean f3563u;

    /* JADX INFO: renamed from: v */
    public boolean f3564v;

    /* JADX INFO: renamed from: w */
    public String f3565w;

    /* JADX INFO: renamed from: x */
    public double f3566x;

    /* JADX INFO: renamed from: y */
    public boolean f3567y;

    /* JADX INFO: renamed from: z */
    public Set<String> f3568z;

    /* JADX INFO: renamed from: l.fcz$a */
    public class RunnableC0288a implements Runnable {
        public RunnableC0288a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4334a(Conversation conversation) {
            conversation.localBotherStatus = 0;
            CoreModule.c.f0.mq(conversation);
        }

        @Override // java.lang.Runnable
        public void run() {
            final Conversation conversationM4255j3 = fcz.this.m4255j3();
            if (NullChecker.a(conversationM4255j3)) {
                CoreModule.c.U.a(new d30() { // from class: l.ecz
                    @Override // p003l.d30
                    public final void call() {
                        fcz.RunnableC0288a.m4334a(conversationM4255j3);
                    }
                });
            }
        }
    }

    public fcz(mcr mcrVar) {
        super(mcrVar);
        this.f3542b = "";
        this.f3543c = "";
        this.f3544d = -1;
        this.f3546f = "";
        this.f3547g = "";
        this.f3548h = -1;
        this.f3555n = new HashMap<>();
        this.f3556o = null;
        this.f3560r = q860.a();
        Boolean bool = Boolean.FALSE;
        this.f3561s = C1185a.m9970c(bool);
        this.f3562t = false;
        this.f3564v = false;
        this.f3567y = true;
        this.f3568z = new HashSet();
        this.f3515A = new HashSet();
        this.f3519E = new HashMap(1);
        this.f3522G = ReplaySubject.m9956b().m6791a();
        this.f3523H = new CopyOnWriteArrayList();
        this.f3524I = new hpd0("gift_guide_bubble_shown_" + CoreModule.H().userId(), bool);
        this.f3525J = new hpd0("camera_guide_bubble_shown_" + CoreModule.H().userId(), bool);
        roj0 roj0Var = roj0.a;
        this.f3526K = C1185a.m9970c(roj0Var);
        this.f3527L = C1185a.m9970c(roj0Var);
        this.f3528M = new hpd0("gift_guide_bubble_opt_shown_" + CoreModule.H().userId(), bool);
        this.f3529N = new hpd0("message_read_state_text_guide_shown_" + CoreModule.H().userId(), bool);
        this.f3530O = false;
        this.f3531P = false;
        this.f3532Q = MessageWarmingUpHelper.WarmingUpLevel.not;
        this.f3533R = 0.0d;
        this.f3534S = 0.0d;
        this.f3535T = false;
        this.f3536U = false;
        this.f3537V = false;
        this.f3540Y = LocalStatus.get("normal");
        this.f3558p0 = new w9j() { // from class: l.jbz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4615a.m4118G5((Message) obj);
            }
        };
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m3973A2(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m3993J0() {
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m3994J1() {
        k000.f4772c -= 100000000;
        lsi0.j("duration:" + (k000.f4772c / 1000000));
    }

    /* JADX INFO: renamed from: M3 */
    private void m3997M3() {
        if (m4207Z5()) {
            lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.abz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2106a.m4282o5((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N3 */
    private void m4000N3() {
        duringCreated(new v9j() { // from class: l.oaz
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Act.globalLifecycle();
            }
        }, false).subscribe((m250) mkd0.G(new e30() { // from class: l.paz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6345a.m4287p5((HashMap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m4002O1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: O3 */
    private void m4003O3() {
        creates(new e30() { // from class: l.l8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5232a.m4292q5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m4008R0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R3 */
    private void m4010R3() {
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.zaz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9286a.m4312u5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m4011S0(Throwable th) {
    }

    /* JADX INFO: renamed from: V3 */
    private void m4018V3() {
        if (((tqz) ((jq2) this).viewModel).m7954s0()) {
            duringCreated(m6497e0().mo2063c0().m8921x0()).subscribe((m250) mkd0.G(new e30() { // from class: l.yaz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9040a.m4095A5((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m4031c2() {
        long j = k000.f4772c;
        if (j == 400000000) {
            k000.f4772c = j * 30;
        } else {
            k000.f4772c = 400000000L;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ xaj0 m4035e2(Conversation conversation, q860 q860Var, Object obj, roj0 roj0Var) {
        return new xaj0(conversation, q860Var, obj);
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m4050k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ xaj0 m4052l0(Object obj, User user, Conversation conversation, roj0 roj0Var) {
        return new xaj0(obj, user, conversation);
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m4054l2(xaj0 xaj0Var) {
        if (((Integer) ((j760) xaj0Var.b).a).intValue() < 100) {
            r9m.m7149r().m7152C(true);
        } else {
            r9m.m7149r().m7152C(false);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m4063o2() {
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m4066p2() {
        k000.f4772c += 100000000;
        lsi0.j("duration:" + (k000.f4772c / 1000000));
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m4075s2(IceBreakFriendData iceBreakFriendData) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iceBreakFriendData.friends.iterator();
        while (it.hasNext()) {
            arrayList.add(((IceBreakUserId) it.next()).userId);
        }
        r9m.m7149r().m7151B(arrayList);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m4088y0(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public String m4093A3() {
        return "messages_thumbnail_right";
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m4094A4(String str) {
        m6497e0().mo2046A0().m6499g0().m4844t0().getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m4095A5(Integer num) {
        if (num.intValue() != 0) {
            ((tqz) ((jq2) this).viewModel).m7922e0();
        }
    }

    /* JADX INFO: renamed from: A6 */
    public void m4096A6(final Message message) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        new lsx(message.media, false, TEnum.equals(message.messageType, "real_shot")).compose(mkd0.C()).last().subscribe((m250) mkd0.H(new e30() { // from class: l.y8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8946a.m4138K5(message, jUptimeMillis, (List) obj);
            }
        }, new e30() { // from class: l.z8z
            @Override // p003l.e30
            public final void call(Object obj) {
                lsi0.h(R.string.C2);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m4097B3() {
        return this.f3563u;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m4098B4() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "star";
        g.wf(this.f3542b, messageNew_).materialize().subscribe();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m4099B5(Message message) {
        ((tqz) ((jq2) this).viewModel).m7968z1(message, true, null);
    }

    /* JADX INFO: renamed from: B6 */
    public final void m4100B6(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Picture picture = new Picture();
            ((Media) picture).url = rhi.B(str);
            ((Media) picture).mediaType = "image/*";
            ((Media) picture).status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        m4104C6(arrayList, 0);
    }

    /* JADX INFO: renamed from: C3 */
    public void m4101C3(String str) {
        this.f3568z.remove(str);
        ((tqz) ((jq2) this).viewModel).m7936j0().y();
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m4102C4() {
        List list = this.f3560r.a;
        g.xf((Message) list.get(list.size() - 1)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m4103C5(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        message.value = l2 + " " + str.substring(0, zbc0.a(0, str.length() - 1));
        g.wf(this.f3542b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C6 */
    public final void m4104C6(List<Media> list, int i) {
        m6497e0().mo2063c0().m6499g0().mo5108k(0, -1);
        n11.h(list.size() > 0);
        for (Media media : list) {
            Message message = new Message();
            ArrayList arrayList = new ArrayList();
            message.media = arrayList;
            arrayList.add(media);
            if (i == 10 || i == 11) {
                message.messageType = MessageType.get("exchange_picture");
                ExchangePicture exchangePictureNew_ = ExchangePicture.new_();
                if (TextUtils.isEmpty(uxz.f8124j)) {
                    exchangePictureNew_.exchangeType = ExchangePicture.SEND_MESSAGE;
                } else {
                    exchangePictureNew_.exchangeType = ExchangePicture.BACK_MESSAGE;
                    exchangePictureNew_.launchMessageId = uxz.f8124j;
                }
                message.msgData = exchangePictureNew_.toJson();
            } else if (i == 13) {
                message.messageType = MessageType.get("limit_time_picture");
            } else {
                message.messageType = MessageType.get("picture");
            }
            m4096A6(message);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m4105D3() {
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.vaz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8267a.m4185V4((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m4106D4(Message message) {
        g.wf(this.f3542b, message).materialize().subscribe();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m4107D5(int i, final String str) {
        C1099c.interval(100L, TimeUnit.MILLISECONDS).take(i).observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.G(new e30() { // from class: l.v7z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8234a.m4103C5(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D6 */
    public void m4108D6() {
        ((tqz) ((jq2) this).viewModel).m7936j0().z();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m4109E3() {
        duringCreated(CoreModule.c.f0.c2).distinctUntilChanged().filter(new w9j() { // from class: l.raz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f6827a.m4190W4((j760) obj);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.saz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7167a.m4195X4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m4110E4() {
        final Message messageNew_ = Message.new_();
        messageNew_.value = "flower";
        act().postDelayed(new Runnable() { // from class: l.vbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f8278a.m4106D4(messageNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m4111E5(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(((DbObject) ((Message) list.get(i))).id, str)) {
                ((tqz) ((jq2) this).viewModel).m7870A1(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m4112E6(String str) {
        CoreModule.c.f0.Kn(this.f3543c, str);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m4113F3() {
        if (IntlCountryCodeController.g() && NullChecker.a(this.f3551k) && TEnum.equals(this.f3551k.property.chatInterrupt.stage, "locked") && this.f3549i.isVIP()) {
            duringCreated(ruy.m7381g().m7389k(this.f3542b)).subscribe(mkd0.B());
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m4114F4() {
        this.f3562t = !this.f3562t;
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m4115F5(Message message) {
        return Boolean.valueOf(m6497e0().mo2068t0().N0(((DbObject) message)._id));
    }

    /* JADX INFO: renamed from: F6 */
    public void m4116F6() {
        if (this.f3542b.isEmpty() || Integer.parseInt(this.f3542b) <= 0) {
            return;
        }
        ((tqz) ((jq2) this).viewModel).m7897S1();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m4117G4() {
        String str = this.f3542b;
        g.wf(str, (Message) ((q860) CoreModule.c.f0.Tn(str).toBlocking().m8883b()).a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m4118G5(Message message) {
        return Boolean.valueOf((message.isLocal() || !message.isOtherUser() || !NullChecker.a(message.audio()) || message.audio().audioRead || m4286p4(((DbObject) message).id) || m4205Z3(message) || m6497e0().mo2068t0().N0(((DbObject) message)._id)) ? false : true);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m4120H2(final String str) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = m4295r3();
        coreSendGiftBodyNew_.giftID = str;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get("chat").toString();
        if (CoreModule.c.e0.Pa(m4295r3()).onlineMatch()) {
            coreSendGiftBodyNew_.subBizType = GiftSubBizType.get("quickchat");
        } else {
            coreSendGiftBodyNew_.subBizType = null;
        }
        CoreModule.P().i().q3(act(), coreSendGiftBodyNew_, new e30() { // from class: l.f8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3467a.m4301s4(str, (Boolean) obj);
            }
        }, new w9j() { // from class: l.g8z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3819a.m4306t4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m4121H3() {
        if (CoreModule.P().i().U3() && m4243g6()) {
            duringCreated(CoreModule.c.M1.u3()).subscribe((m250) mkd0.G(new e30() { // from class: l.taz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7428a.m4200Y4((ChatHeatActionData) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m4122H4() {
        String str = this.f3542b;
        g.wf(str, (Message) ((q860) CoreModule.c.f0.Tn(str).toBlocking().m8883b()).a.get(0)).materialize().subscribe();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m4123H5(AudioText audioText) {
        if (TEnum.equals(audioText.status, ServletHandler.__DEFAULT_SERVLET) && !TextUtils.isEmpty(audioText.translationResult)) {
            m4299r7(audioText.msgId);
        } else {
            if (TEnum.equals(audioText.status, "pending")) {
                return;
            }
            m4294q7(audioText.msgId, false);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m4126I3() {
        duringCreated(mkd0.r(CoreModule.c.f0.Mg(this.f3542b), CoreModule.c.f0.Ig(this.f3542b), new x9j() { // from class: l.iaz
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return Boolean.valueOf(NullChecker.a(bool) && bool.booleanValue() && NullChecker.a(bool2) && bool2.booleanValue());
            }
        })).distinctUntilChanged().subscribe((m250) mkd0.H(new e30() { // from class: l.jaz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4607a.m4206Z4((Boolean) obj);
            }
        }, new e30() { // from class: l.kaz
            @Override // p003l.e30
            public final void call(Object obj) {
                fcz.m4011S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m4127I4() {
        act().postDelayed(new Runnable() { // from class: l.fbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3490a.m4122H4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m4128I5(String str, Throwable th) {
        m4294q7(str, true);
    }

    /* JADX INFO: renamed from: J2 */
    public void m4130J2(String str, String str2) {
        Survey survey;
        for (int iM5287d = ((tqz) ((jq2) this).viewModel).m7936j0().m5287d() - 1; iM5287d >= 0; iM5287d--) {
            Message messageM5294m = ((tqz) ((jq2) this).viewModel).m7936j0().m5294m(iM5287d);
            if (TEnum.equals(messageM5294m.messageType(), "new_survey") && !TextUtils.isEmpty(messageM5294m.msgData) && (survey = Survey.parse(messageM5294m.msgData)) != null && str.equals(survey.id)) {
                survey.id = str;
                survey.status = "submitted";
                messageM5294m.msgData = survey.toJson();
                messageM5294m.value = str2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m4131J3() {
        duringCreated(new v9j() { // from class: l.dcz
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f2941a.m4212a5();
            }
        }, false).filter(new w9j() { // from class: l.a8z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f2093a.m4217b5((roj0) obj);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.k8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4866a.m4222c5((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m4132J4(String str, Long l2) {
        Message message = new Message();
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        message.value = l2 + " " + str.substring(0, zbc0.a(0, str.length() - 1));
        CoreModule.c.f0.Dn(m4250i3(), message, (Sticker) null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m4133J5(Message message) {
        ((tqz) ((jq2) this).viewModel).m7968z1(message, true, null);
    }

    /* JADX INFO: renamed from: J6 */
    public void m4134J6() {
        this.f3565w = null;
    }

    /* JADX INFO: renamed from: K2 */
    public final long m4135K2() {
        long jO = mqi0.o() - this.f3518D;
        if (jO >= 500) {
            return 0L;
        }
        return 500 - jO;
    }

    /* JADX INFO: renamed from: K3 */
    public void m4136K3() {
        creates(new e30() { // from class: l.o8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6064a.m4227d5((Bundle) obj);
            }
        }, new d30() { // from class: l.p8z
            @Override // p003l.d30
            public final void call() {
                fcz.m4063o2();
            }
        });
        duringCreated(new v9j() { // from class: l.q8z
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f6606a.m4232e5();
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.r8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6805a.m4237f5((xaj0) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Yo(m4250i3())).subscribe((m250) mkd0.G(new e30() { // from class: l.s8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7155a.m4242g5((Message) obj);
            }
        }));
        if (CoreModule.P().i().De()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(m4250i3());
            if (!NullChecker.a(conversationXe) || TextUtils.isEmpty(conversationXe.clearedUntil)) {
                this.f3553l = CoreModule.c.f0.Un(m4250i3(), m4305t3());
            } else {
                this.f3553l = CoreModule.c.f0.Ne(m4250i3()).distinctUntilChanged(new w9j() { // from class: l.u8z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return ((Conversation) obj).clearedUntil;
                    }
                }).flatMap(new w9j() { // from class: l.v8z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return this.f8248a.m4247h5((Conversation) obj);
                    }
                });
            }
        } else {
            this.f3553l = CoreModule.c.f0.Un(m4250i3(), m4305t3());
        }
        duringCreated(new v9j() { // from class: l.w8z
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f8518a.m4252i5();
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.x8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8746a.m4272m5((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m4137K4(final String str) {
        C1099c.interval(100L, TimeUnit.MILLISECONDS).take(1000).observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.G(new e30() { // from class: l.ubz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7962a.m4132J4(str, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m4138K5(final Message message, long j, List list) {
        message.media = list;
        act().postDelayed(new Runnable() { // from class: l.lbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f5253a.m4133J5(message);
            }
        }, (j + 500) - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: L2 */
    public void m4140L2(final Message message, boolean z, Sticker sticker) {
        m4197X6(message);
        m4160Q2(message, z, sticker);
        if (this.f3562t) {
            message.sentFrom = MessageSentFrom.get("apple_watch");
        }
        if (message.question == null && message.answerOfMessage == null && TextUtils.isEmpty(message.referenceMsgId)) {
            for (int size = this.f3560r.a.size() - 1; size >= Math.max(0, this.f3560r.a.size() - 20); size--) {
                Message message2 = (Message) this.f3560r.a.get(size);
                if (NullChecker.a(message2.question)) {
                    message.answerOfMessage = ((DbObject) message2).id;
                    break;
                } else {
                    if (message2.isMe()) {
                        break;
                    }
                }
            }
        }
        pxz.c();
        SystemClock.elapsedRealtime();
        if (z) {
            m4165R2(message, z, sticker);
            duringCreated(CoreModule.c.f0.Dn(m4250i3(), message, sticker)).subscribe((m250) mkd0.H(new e30() { // from class: l.acz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2139a.m4311u4(message, (Message) obj);
                }
            }, new e30() { // from class: l.bcz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2372a.m4315v4(message, (Throwable) obj);
                }
            }));
        } else if (!m4169S2(message, z, sticker)) {
            act().progress(R.string.I2, true);
            CoreModule.c.f0.Gn(this.f3542b, message).subscribe((m250) mkd0.H(new e30() { // from class: l.ccz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2620a.m4319w4((roj0) obj);
                }
            }, new e30() { // from class: l.q7z
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6603a.m4323x4((Throwable) obj);
                }
            }));
        }
        if ("-1".equals(this.f3542b)) {
            return;
        }
        CoreModule.P().i().E0();
        if (message.moment == null && CoreModule.c.e0.p9().isFemale()) {
            CoreModule.P().i().H2();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m4141L4() {
        for (int i = 0; i < 10; i++) {
            m4173S6(i + "");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m4142L5(String str) {
        m6497e0().mo2046A0().m8836r2(new SpannableStringBuilder(str), null, false);
    }

    /* JADX INFO: renamed from: L6 */
    public void m4143L6(String str, String str2, String str3) {
        Message message = new Message();
        message.answerOfMessage = str2;
        message.answerIdOfAnswer = str3;
        message.value = str;
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        if (m4236f4(m4295r3())) {
            return;
        }
        ((tqz) ((jq2) this).viewModel).m7968z1(message, true, null);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m4145M4() {
        Message message = new Message();
        message.messageType = MessageType.get("chatroom_share");
        message.msgData = "{\n  \"title\": \"这个是title\",\n  \"desc\": \"这个是desc\",\n  \"liveId\": \"3000012314\",\n  \"roomId\": \"roomId\",\n  \"schemaSearch\": \"SCHEMA_SEARCH\"\n}";
        CoreModule.c.f0.Dn(m4250i3(), message, (Sticker) null).materialize().subscribe();
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ C1099c m4146M5(roj0 roj0Var) {
        return CoreModule.c.f0.ap(this.f3543c);
    }

    /* JADX INFO: renamed from: M6 */
    public void m4147M6(File file, String str, float f) {
        o6j0.c("e_message_voice_send", pageId(), new o6j0.a[0]);
        File file2 = new File(file.getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        file.renameTo(file2);
        Message message = new Message();
        Audio audio = new Audio();
        ((Media) audio).url = rhi.B(file2.getAbsolutePath());
        ((Media) audio).mediaType = str;
        audio.duration = f;
        ((Media) audio).status = MediaLocalStatus.get("raw");
        ArrayList arrayList = new ArrayList();
        message.media = arrayList;
        arrayList.add(audio);
        message.messageType = MessageType.get("audio");
        ((tqz) ((jq2) this).viewModel).m7968z1(message, true, null);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m4148N2(String str) {
        if (TextUtils.equals(this.f3516B, str)) {
            int iG = vwb.G(this.f3560r.a, new w9j() { // from class: l.z7z
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f9269a.m4327y4((Message) obj);
                }
            }) + 1;
            if (iG > 0 && iG < this.f3560r.a.size()) {
                Message message = (Message) this.f3560r.a.get(iG);
                if (message.isOtherUser() && !vwb.J(message.media) && (message.media.get(0) instanceof Audio) && !message.audio().audioRead && !m4286p4(((DbObject) message).id) && !m4205Z3(message) && !m6497e0().mo2068t0().N0(((DbObject) message)._id)) {
                    m4289p7(message, true);
                    return;
                }
            }
            this.f3516B = null;
            this.f3567y = true;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m4149N4() {
        act().postDelayed(new Runnable() { // from class: l.pbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f6358a.m4145M4();
            }
        }, 5000L);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C1099c m4150N5(roj0 roj0Var) {
        return CoreModule.c.f0.ap(this.f3543c);
    }

    /* JADX INFO: renamed from: N6 */
    public void m4151N6(final String str) {
        act().postDelayed(new Runnable() { // from class: l.xaz
            @Override // java.lang.Runnable
            public final void run() {
                this.f8759a.m4142L5(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m4152O4() {
        y.g3(this.f3542b).materialize().subscribe();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ C1099c m4153O5(roj0 roj0Var) {
        return CoreModule.c.f0.ap(this.f3543c);
    }

    /* JADX INFO: renamed from: O6 */
    public void m4154O6(String str) {
        if (CoreModule.P().i().i()) {
            CoreModule.c.f0.Mf(m4250i3());
        }
        if (CoreModule.P().i().v5()) {
            CoreModule.c.f0.Cf(m4250i3());
        }
        if (this.f3551k.userMessageCount == 0 && !TextUtils.isEmpty(CoreModule.P().i().K1(this.f3543c))) {
            ConversationQuickChat conversationQuickChat = this.f3551k.property.quickchat;
            if (conversationQuickChat.bell) {
                CoreModule.c.D0.y4(CoreModule.P().i().K1(this.f3543c)).switchMap(new w9j() { // from class: l.b8z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return this.f2355a.m4146M5((roj0) obj);
                    }
                }).subscribe(mkd0.B());
            } else if (conversationQuickChat.speed) {
                CoreModule.c.D0.C4(CoreModule.P().i().K1(this.f3543c)).switchMap(new w9j() { // from class: l.c8z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return this.f2591a.m4150N5((roj0) obj);
                    }
                }).subscribe(mkd0.B());
            } else if (conversationQuickChat.oneside) {
                User userP9 = CoreModule.c.e0.p9();
                if (NullChecker.a(userP9) && !userP9.isFemale()) {
                    CoreModule.c.D0.B4(CoreModule.P().i().K1(this.f3543c), "").switchMap(new w9j() { // from class: l.d8z
                        @Override // p003l.w9j
                        public final Object call(Object obj) {
                            return this.f2914a.m4153O5((roj0) obj);
                        }
                    }).subscribe(mkd0.B());
                }
            }
        }
        m4120H2(str);
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m4155P2() {
        if (!CoreModule.P().i().x()) {
            return false;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(this.f3542b);
        if (NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "dismissed") && NullChecker.a(conversationXe.additional) && NullChecker.a(conversationXe.additional.quickChat)) {
            return conversationXe.additional.quickChat.avatarBlurred;
        }
        return false;
    }

    /* JADX INFO: renamed from: P3 */
    public final void m4156P3() {
        if (y19.M()) {
            r9m.m7149r().m7152C(false);
            if (!m4231e4()) {
                duringCreated(new v9j() { // from class: l.p7z
                    @Override // p003l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f6329a.m4297r5();
                    }
                }).filter(new w9j() { // from class: l.t8z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) ((xaj0) obj).a).onlineMatch());
                    }
                }).subscribe((m250) mkd0.G(new e30() { // from class: l.e9z
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        fcz.m4054l2((xaj0) obj);
                    }
                }));
            }
            if (mqi0.o() > ((Long) CoreModule.c.e0.i3.get()).longValue()) {
                duringCreated(C1099c.just(roj0.a).observeOn(Schedulers.m9950io()).map(new w9j() { // from class: l.p9z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Integer.valueOf(CoreModule.c.f0.lf());
                    }
                }).filter(new w9j() { // from class: l.aaz
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > y19.E());
                    }
                }).flatMap(new w9j() { // from class: l.laz
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return this.f5238a.m4302s5((Integer) obj);
                    }
                }).filter(new w9j() { // from class: l.waz
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        IceBreakFriendData iceBreakFriendData = (IceBreakFriendData) obj;
                        return Boolean.valueOf(NullChecker.a(iceBreakFriendData) && !vwb.J(iceBreakFriendData.friends) && iceBreakFriendData.friends.size() >= 3);
                    }
                })).subscribe((m250) mkd0.H(new e30() { // from class: l.hbz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        fcz.m4075s2((IceBreakFriendData) obj);
                    }
                }, new e30() { // from class: l.sbz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        fcz.m4050k1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m4157P4() {
        act().postDelayed(new Runnable() { // from class: l.kbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f4896a.m4152O4();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ void m4158P5(Message message, roj0 roj0Var) {
        m4112E6(((DbObject) message).id);
    }

    /* JADX INFO: renamed from: P6 */
    public void m4159P6() {
        try {
            if (this.f3551k == null) {
                return;
            }
            CoreModule.P().i().d0(((DbObject) this.f3551k).id);
        } catch (NullPointerException e) {
            CrashHelper.d(new Exception("MessageAct sendInputtingMsg:" + e.getMessage(), e), 100);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean m4160Q2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: Q3 */
    public void m4161Q3() {
        lifecycle().filter(new w9j() { // from class: l.m8z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.n8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5849a.m4307t5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m4162Q4() {
        act().dialog().F(this.f3542b).z0();
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m4163Q5(Message message, Throwable th) {
        m4294q7(((DbObject) message).id, true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m4164Q6(final String str) {
        CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) CoreModule.d.g();
        if (NullChecker.a(coreAssetsSettings) && coreAssetsSettings.autoReadConversation) {
            duringCreated(CoreModule.c.f0.so(str).switchMap(new w9j() { // from class: l.t7z
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.c.f0.Ne(str).filter(new w9j() { // from class: l.e8z
                        @Override // p003l.w9j
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(!((Conversation) obj2).read.booleanValue());
                        }
                    });
                }
            })).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.u7z
                @Override // p003l.e30
                public final void call(Object obj) {
                    CoreModule.c.f0.Fo();
                }
            }, new yaf0()));
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m4165R2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m4166R4() {
        ((tqz) ((jq2) this).viewModel).f7644X0.d(new String[]{"animations/singleDog/config.xml", "animations/singleDog/pic"});
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m4167R5(Message message, Long l2) {
        if (m4205Z3(message)) {
            return;
        }
        m4294q7(((DbObject) message).id, false);
    }

    /* JADX INFO: renamed from: R6 */
    public void m4168R6(Sticker sticker, boolean z) {
        Message message = new Message();
        message.sticker = ((DbObject) sticker).id;
        message.messageType = MessageType.get("sticker");
        ((tqz) ((jq2) this).viewModel).m7968z1(message, true, z ? sticker.clone() : null);
    }

    /* JADX INFO: renamed from: S2 */
    public boolean m4169S2(Message message, boolean z, Sticker sticker) {
        return false;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m4170S3() {
        duringCreated(f3512F0).subscribe((m250) mkd0.G(new e30() { // from class: l.a9z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2098a.m4316v5((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m4171S4() {
        User userPa = CoreModule.c.e0.Pa(this.f3542b);
        if (NullChecker.a(userPa)) {
            StringBuilder sb = new StringBuilder();
            for (String str : userPa.abGroups) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(" ");
                }
            }
            lsi0.j(sb.toString());
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m4172S5(final Message message) {
        act().postDelayed(new Runnable() { // from class: l.qaz
            @Override // java.lang.Runnable
            public final void run() {
                this.f6617a.m4099B5(message);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S6 */
    public void m4173S6(String str) {
        m4178T6(str, null);
    }

    /* JADX INFO: renamed from: T2 */
    public C1099c<Conversation> m4174T2() {
        return CoreModule.c.f0.Ue(m4250i3());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m4175T3() {
        creates(new e30() { // from class: l.maz
            @Override // p003l.e30
            public final void call(Object obj) {
                fcz.m4008R0((Bundle) obj);
            }
        }, new d30() { // from class: l.naz
            @Override // p003l.d30
            public final void call() {
                this.f5856a.m4320w5();
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m4176T4() {
        e51.y(new RunnableC0288a());
    }

    /* JADX INFO: renamed from: T5 */
    public String m4177T5() {
        return (m4310u3() == null || TextUtils.isEmpty(m4310u3().buttonTitle)) ? "进入直播间" : m4310u3().buttonTitle;
    }

    /* JADX INFO: renamed from: T6 */
    public void m4178T6(String str, List<String> list) {
        m6497e0().mo2046A0().m6499g0().m4844t0();
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        if (CoreModule.P().i().E()) {
            messageNew_.channel = MessageChannel.get(m4231e4() ? "group" : ServletHandler.__DEFAULT_SERVLET);
            messageNew_.notifiedUsers = list;
        }
        IceBreakingQuestion iceBreakingQuestionM4322x3 = m4322x3();
        if (NullChecker.a(iceBreakingQuestionM4322x3)) {
            messageNew_.messageType = MessageType.get("ice_breaking");
            if (messageNew_.additionalData == null) {
                messageNew_.additionalData = MessageAdditionalData.new_();
            }
            messageNew_.additionalData.iceBreakingQuestion = iceBreakingQuestionM4322x3;
            m6497e0().mo2046A0().m6499g0().m4822i0();
        } else if (NullChecker.a(this.f3541Z)) {
            messageNew_.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_;
            messageReferenceNew_.type = "ref";
            String str2 = ((DbObject) this.f3541Z).id;
            messageReferenceNew_.id = str2;
            messageNew_.referenceMsgId = str2;
            m6497e0().mo2046A0().m6499g0().m4826k0();
        } else if (NullChecker.a(this.f3552k0)) {
            messageNew_.messageType = MessageType.get("moment_reference");
            MessageReference messageReferenceNew_2 = MessageReference.new_();
            messageNew_.api_only_reference = messageReferenceNew_2;
            messageReferenceNew_2.type = "moment";
            messageReferenceNew_2.id = this.f3552k0.id;
            m6497e0().mo2046A0().m6499g0().m4826k0();
        } else {
            messageNew_.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        }
        ((tqz) ((jq2) this).viewModel).m7968z1(messageNew_, true, null);
    }

    /* JADX INFO: renamed from: U2 */
    public C1099c<Conversation> m4179U2() {
        return CoreModule.c.f0.Ne(m4250i3());
    }

    /* JADX INFO: renamed from: U3 */
    public void m4180U3() {
        if (CoreModule.P().i().c() && !m4261k4(this.f3542b) && m4256j4()) {
            if (TextUtils.isEmpty(CoreModule.P().i().Q1(this.f3542b))) {
                duringCreated(mkd0.r(CoreModule.c.e0.Ka(this.f3542b), CoreModule.c.f0.ko(this.f3542b, this.f3543c).distinctUntilChanged(), new hae0())).filter(new w9j() { // from class: l.z9z
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        j760 j760Var = (j760) obj;
                        return Boolean.valueOf(((User) j760Var.a).onlineMatch() && (NullChecker.a(((j760) j760Var.b).a) || NullChecker.a(((j760) j760Var.b).b)));
                    }
                }).subscribe((m250) mkd0.G(new e30() { // from class: l.baz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f2366a.m4332z5((j760) obj);
                    }
                }));
            }
            duringCreated(CoreModule.c.e0.Ka(this.f3542b)).distinctUntilChanged(new x9j() { // from class: l.caz
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                }
            }).skip(1).subscribe((m250) mkd0.G(new e30() { // from class: l.daz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2927a.m4324x5((User) obj);
                }
            }));
            if (CoreModule.P().i().b4()) {
                duringCreated(CoreModule.c.e0.Ka(this.f3542b)).filter(new w9j() { // from class: l.eaz
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((User) obj).onlineMatch());
                    }
                }).distinctUntilChanged(new x9j() { // from class: l.faz
                    @Override // p003l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return Boolean.valueOf(Objects.equals(((User) obj).localRelationship, ((User) obj2).localRelationship));
                    }
                }).subscribe((m250) mkd0.H(new e30() { // from class: l.gaz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f3827a.m4328y5((User) obj);
                    }
                }, new e30() { // from class: l.haz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        fcz.m3973A2((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ Boolean m4181U4(Message message) {
        boolean zEquals;
        if (m4199Y3()) {
            zEquals = TEnum.equals(message.channel, "anonymous");
        } else {
            zEquals = !TEnum.equals(message.channel, "anonymous");
        }
        return Boolean.valueOf(zEquals);
    }

    /* JADX INFO: renamed from: U5 */
    public String m4182U5() {
        return (m4310u3() == null || TextUtils.isEmpty(m4310u3().subTitle)) ? "多人连线已开启，等你加入" : m4310u3().subTitle;
    }

    /* JADX INFO: renamed from: U6 */
    public void m4183U6(final Message message) {
        Message message2 = new Message();
        message2.sticker = CoreModule.l.i().C4() ? "9619" : "12602718";
        message2.messageType = MessageType.get("sticker");
        ((tqz) ((jq2) this).viewModel).m7968z1(message2, true, null);
        ChatGiftInfoExtra chatGiftInfoExtraK2 = CoreModule.P().i().K2(message);
        if (!NullChecker.a(chatGiftInfoExtraK2) || TextUtils.isEmpty(chatGiftInfoExtraK2.giftRecordId)) {
            return;
        }
        CoreModule.c.f1.p4(chatGiftInfoExtraK2.giftRecordId).subscribe((m250) mkd0.H(new e30() { // from class: l.i8z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4381a.m4158P5(message, (roj0) obj);
            }
        }, new e30() { // from class: l.j8z
            @Override // p003l.e30
            public final void call(Object obj) {
                yij0.D((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public boolean m4184V2() {
        return true;
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m4185V4(c cVar) {
        if (cVar == c.i && Act.isFromBackground) {
            CoreModule.P().i().S3(act());
        }
    }

    /* JADX INFO: renamed from: V5 */
    public String m4186V5() {
        return (m4310u3() == null || TextUtils.isEmpty(m4310u3().mainTitle)) ? "正在视频直播" : m4310u3().mainTitle;
    }

    /* JADX INFO: renamed from: V6 */
    public void m4187V6(r5l0 r5l0Var) {
        m6497e0().mo2063c0().m6499g0().mo5108k(0, -1);
        Message message = new Message();
        message.media = new ArrayList();
        Video video = new Video();
        ((Media) video).url = rhi.B(r5l0Var.a);
        ((Media) video).status = MediaLocalStatus.get("raw");
        message.media.add(video);
        message.messageType = MessageType.get("video");
        m4172S5(message);
    }

    /* JADX INFO: renamed from: W2 */
    public String m4188W2() {
        if (!(act() instanceof MessagesAct)) {
            return "0";
        }
        Conversation conversationM2069u2 = act().m2069u2();
        return NullChecker.a(conversationM2069u2) ? conversationM2069u2.readUntil : "0";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX INFO: renamed from: W3 */
    public final void m4189W3() {
        String str;
        if (this.f3537V) {
            return;
        }
        this.f3537V = true;
        if (CoreModule.P().i().M4()) {
            Conversation conversation = this.f3551k;
            if (conversation.unreadMessages > 0 || !NullChecker.a(conversation.additional) || !NullChecker.a(this.f3551k.additional.localMomentInfo) || TextUtils.isEmpty(this.f3551k.additional.localMomentInfo.newMomentId)) {
                str = null;
            } else {
                ConversationMomentInfo conversationMomentInfo = this.f3551k.additional.localMomentInfo;
                if (TextUtils.equals(conversationMomentInfo.newMomentId, conversationMomentInfo.lastShowedMomentId)) {
                    str = null;
                } else {
                    Conversation conversation2 = this.f3551k;
                    ConversationMomentInfo conversationMomentInfo2 = conversation2.additional.localMomentInfo;
                    str = conversationMomentInfo2.newMomentId;
                    conversationMomentInfo2.lastShowedMomentId = str;
                    mrz.m6463n(conversation2.clone()).subscribe((m250<? super roj0>) mkd0.H(new e30() { // from class: l.nbz
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            fcz.m4002O1((roj0) obj);
                        }
                    }, new e30() { // from class: l.obz
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            fcz.m4088y0((Throwable) obj);
                        }
                    }));
                    m6497e0().mo2065j0().l0(true);
                }
            }
            if ((this.f3550j instanceof User) && !((String) CoreModule.c.f0.J0.get()).equals(this.f3543c)) {
                if ((CoreModule.P().i().c() && ((User) this.f3550j).onlineMatchLocked()) || ((User) this.f3550j).unilateralBlock() || m4261k4(this.f3543c) || this.f3551k.isAnonymous() || m4231e4() || User.isTeamAccount(this.f3543c)) {
                    return;
                }
                CoreModule.P().i().B3(this.f3543c);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                CoreModule.N().va(act(), this.f3543c, str);
            }
        }
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ Boolean m4190W4(j760 j760Var) {
        return Boolean.valueOf(m4286p4((String) j760Var.b));
    }

    /* JADX INFO: renamed from: W5 */
    public User m4191W5() {
        return this.f3549i;
    }

    /* JADX INFO: renamed from: W6 */
    public void m4192W6(String str) {
        this.f3568z.add(str);
    }

    /* JADX INFO: renamed from: X2 */
    public void m4193X2() {
        boolean z;
        if (NullChecker.a(CoreModule.d.g()) && NullChecker.a(((CoreAssetsSettings) CoreModule.d.g()).keepConnection)) {
            this.f3538W = ((CoreAssetsSettings) CoreModule.d.g()).keepConnection.chatTypingInterval;
            z = ((CoreAssetsSettings) CoreModule.d.g()).keepConnection.chatTypingOpen;
        } else {
            z = false;
        }
        mkd0.z(this.f3539X);
        if (this.f3538W < 0 || !z) {
            this.f3539X = null;
            return;
        }
        m4159P6();
        int i = this.f3538W;
        this.f3539X = C1099c.interval(i == 0 ? 10L : i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.G(new e30() { // from class: l.xbz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8764a.m4331z4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m4194X3(String str) {
        String str2;
        Conversation conversationM4255j3 = m4255j3();
        if (conversationM4255j3 == null) {
            return false;
        }
        if ("messages_title".equals(str)) {
            str2 = "navbar_avatar";
        } else if ("profile_bubble".equals(str)) {
            str2 = "user_card";
        } else {
            str2 = ("messages_thumbnail_left".equals(str) || "from_greet_act".equals(str)) ? "user_avatar" : null;
        }
        return xp5.b(act(), conversationM4255j3, pageId(), str2);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m4195X4(j760 j760Var) {
        m4288p6((String) j760Var.a, (String) j760Var.b);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m4196X5(ArrayList<j760<String, d30>> arrayList, final String str, final int i) {
        arrayList.add(vwb.Y("send me messages 1 - " + i, new d30() { // from class: l.rbz
            @Override // p003l.d30
            public final void call() {
                this.f6885a.m4107D5(i, str);
            }
        }));
    }

    /* JADX INFO: renamed from: X6 */
    public void m4197X6(Message message) {
        if (NullChecker.a(message)) {
            message.fromConvType = "";
            int i = this.f3544d;
            if (i == 26) {
                message.fromConvType = "new_match";
                return;
            }
            if (i == 27) {
                message.fromConvType = "recommendation";
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
    public boolean m4198Y2() {
        return false;
    }

    /* JADX INFO: renamed from: Y3 */
    public boolean m4199Y3() {
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m4200Y4(ChatHeatActionData chatHeatActionData) {
        if (TextUtils.equals(chatHeatActionData.userId, m4250i3())) {
            su4.m7635d(m4309t7().act(), chatHeatActionData);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m4201Y5() {
        Intent intent;
        Act act = act();
        if (act == null || (intent = act.getIntent()) == null || !intent.hasExtra("move_by_message_id")) {
            return;
        }
        final String stringExtra = intent.getStringExtra("move_by_message_id");
        if (TextUtils.isEmpty(stringExtra) || ((tqz) ((jq2) this).viewModel).m7936j0() == null) {
            return;
        }
        final List<Message> listM5284a0 = ((tqz) ((jq2) this).viewModel).m7936j0().m5284a0();
        if (vwb.J(listM5284a0)) {
            return;
        }
        e51.H(act, new Runnable() { // from class: l.tbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f7440a.m4111E5(listM5284a0, stringExtra);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Y6 */
    public void m4202Y6(double d) {
        MessageWarmingUpHelper.m2311v("currentTempDownDegree = " + d);
        this.f3534S = d;
    }

    /* JADX INFO: renamed from: Z */
    public void m4203Z() {
        super.Z();
        final Intent intent = act().getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        this.f3543c = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f3543c = intent.getStringExtra("userId");
        }
        this.f3544d = intent.getIntExtra("FROM", -1);
        this.f3545e = intent.getStringExtra("sub_from");
        this.f3546f = intent.getStringExtra("theme_type");
        this.f3547g = intent.getStringExtra("greet_from");
        this.f3521F = new hpd0("send_message_tip_" + this.f3542b, Boolean.FALSE);
        String strM4295r3 = m4295r3();
        this.f3542b = strM4295r3;
        if (TextUtils.isEmpty(strM4295r3)) {
            StringBuilder sb = new StringBuilder("MessagesAct error: userId is null, from = ");
            sb.append(this.f3544d);
            sb.append(",");
            Bundle extras = intent.getExtras();
            if (NullChecker.a(extras)) {
                Set<String> setKeySet = extras.keySet();
                sb.append("extras: ");
                for (String str : setKeySet) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(extras.get(str));
                    sb.append(",");
                }
            }
            CrashHelper.c(new Exception(sb.toString()));
        }
        if (CoreModule.P().i().v() && this.f3544d == 31) {
            e51.G(new Runnable() { // from class: l.uaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7945a.m4277n5(intent);
                }
            });
        }
        if (CoreModule.P().i().c()) {
            CoreModule.P().i().x5(false);
        }
        this.f3530O = ((Boolean) this.f3529N.get()).booleanValue();
    }

    @SuppressLint({"SV_USE_DUP_ID"})
    /* JADX INFO: renamed from: Z2 */
    public ArrayList<j760<String, d30>> m4204Z2() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        final String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        arrayList.add(vwb.Y("English long text", new d30() { // from class: l.b9z
            @Override // p003l.d30
            public final void call() {
                this.f2362a.m4094A4(str);
            }
        }));
        arrayList.add(vwb.Y("send me a text message", new d30() { // from class: l.n9z
            @Override // p003l.d30
            public final void call() {
                this.f5853a.m4098B4();
            }
        }));
        arrayList.add(vwb.Y("recall the last message from me", new d30() { // from class: l.r9z
            @Override // p003l.d30
            public final void call() {
                this.f6822a.m4102C4();
            }
        }));
        arrayList.add(vwb.Y("send me a text message with 3 sec delay", new d30() { // from class: l.s9z
            @Override // p003l.d30
            public final void call() {
                this.f7165a.m4110E4();
            }
        }));
        arrayList.add(vwb.Y("toggle apple watch mode", new d30() { // from class: l.t9z
            @Override // p003l.d30
            public final void call() {
                this.f7426a.m4114F4();
            }
        }));
        arrayList.add(vwb.Y("send me a message with same content as last", new d30() { // from class: l.u9z
            @Override // p003l.d30
            public final void call() {
                this.f7943a.m4117G4();
            }
        }));
        arrayList.add(vwb.Y("send me a message with same content as last with 3 sec delay", new d30() { // from class: l.v9z
            @Override // p003l.d30
            public final void call() {
                this.f8252a.m4127I4();
            }
        }));
        arrayList.add(vwb.Y("send messages 1 - 1000", new d30() { // from class: l.w9z
            @Override // p003l.d30
            public final void call() {
                this.f8523a.m4137K4(str);
            }
        }));
        arrayList.add(vwb.Y("send messages 1 - 10", new d30() { // from class: l.x9z
            @Override // p003l.d30
            public final void call() {
                this.f8749a.m4141L4();
            }
        }));
        arrayList.add(vwb.Y("send message delayed 5 sec", new d30() { // from class: l.y9z
            @Override // p003l.d30
            public final void call() {
                this.f9037a.m4149N4();
            }
        }));
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 5);
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 25);
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 50);
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 100);
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 200);
        m4196X5(arrayList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 1000);
        arrayList.add(vwb.Y("make the other user block me delay 3 sec", new d30() { // from class: l.c9z
            @Override // p003l.d30
            public final void call() {
                this.f2598a.m4157P4();
            }
        }));
        arrayList.add(vwb.Y("toggle slow motion anim adapter", new d30() { // from class: l.d9z
            @Override // p003l.d30
            public final void call() {
                fcz.m4031c2();
            }
        }));
        arrayList.add(vwb.Y("unlock stickers now", new d30() { // from class: l.f9z
            @Override // p003l.d30
            public final void call() {
                CoreModule.c.Z.S.E();
            }
        }));
        arrayList.add(vwb.Y("animation duration -100 miliseconds", new d30() { // from class: l.g9z
            @Override // p003l.d30
            public final void call() {
                fcz.m3994J1();
            }
        }));
        arrayList.add(vwb.Y("animation duration +100 miliseconds", new d30() { // from class: l.h9z
            @Override // p003l.d30
            public final void call() {
                fcz.m4066p2();
            }
        }));
        arrayList.add(vwb.Y("show user id", new d30() { // from class: l.i9z
            @Override // p003l.d30
            public final void call() {
                this.f4384a.m4162Q4();
            }
        }));
        arrayList.add(vwb.Y("animate particles", new d30() { // from class: l.j9z
            @Override // p003l.d30
            public final void call() {
                this.f4599a.m4166R4();
            }
        }));
        arrayList.add(vwb.Y("show current user abGroups", new d30() { // from class: l.k9z
            @Override // p003l.d30
            public final void call() {
                this.f4878a.m4171S4();
            }
        }));
        arrayList.add(vwb.Y("直播小助手展示欢迎", new d30() { // from class: l.l9z
            @Override // p003l.d30
            public final void call() {
                CoreModule.c.f0.Tg((User) null);
            }
        }));
        arrayList.add(vwb.Y("清空直播小助手", new d30() { // from class: l.m9z
            @Override // p003l.d30
            public final void call() {
                CoreModule.c.f0.Jf();
            }
        }));
        arrayList.add(vwb.Y("当前聊天的ID:" + m4295r3(), new d30() { // from class: l.o9z
            @Override // p003l.d30
            public final void call() {
                fcz.m3993J0();
            }
        }));
        arrayList.add(vwb.Y("reset cleanbot status", new d30() { // from class: l.q9z
            @Override // p003l.d30
            public final void call() {
                this.f6614a.m4176T4();
            }
        }));
        arrayList.addAll(q2z.u2(this));
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m4205Z3(Message message) {
        return NullChecker.a(message.localAudioText) && TEnum.equals(message.localAudioText.status, ServletHandler.__DEFAULT_SERVLET) && !TextUtils.isEmpty(message.localAudioText.translationResult);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m4206Z4(Boolean bool) {
        if (bool.booleanValue()) {
            ((tqz) ((jq2) this).viewModel).m7899T1();
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m4207Z5() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: Z6 */
    public void m4208Z6(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m2311v("setCurrentTempLevel = " + warmingUpLevel);
        this.f3532Q = warmingUpLevel;
    }

    /* JADX INFO: renamed from: a0 */
    public void m4209a0() {
        super.a0();
        m4136K3();
        m4000N3();
        m4010R3();
        m4131J3();
        m4170S3();
        m3997M3();
        m4175T3();
        m4003O3();
        m4126I3();
        m4105D3();
        m4109E3();
        m4161Q3();
        m4121H3();
        m4156P3();
        m4018V3();
    }

    /* JADX INFO: renamed from: a3 */
    public void m4210a3() {
        mkd0.z(this.f3539X);
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m4211a4(User user) {
        return false;
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ C1099c m4212a5() {
        return CoreModule.c.f0.se(m4250i3());
    }

    /* JADX INFO: renamed from: a6 */
    public boolean m4213a6() {
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public void m4214a7(double d) {
        MessageWarmingUpHelper.m2311v("setCurrentTempUpDegree = " + d);
        this.f3533R = d;
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m4216b4() {
        return TextUtils.equals(m4326y3(), "all_match_new_match") || TextUtils.equals(m4326y3(), "one_new_match") || TextUtils.equals(m4326y3(), "all_new_match") || TextUtils.equals(m4326y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ Boolean m4217b5(roj0 roj0Var) {
        return Boolean.valueOf(m4213a6());
    }

    /* JADX INFO: renamed from: b6 */
    public boolean m4218b6() {
        return false;
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m4221c4(String str) {
        return false;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m4222c5(roj0 roj0Var) {
        if (m4221c4(m4295r3()) || m4261k4(m4250i3()) || m4226d4()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m4223c6() {
        return false;
    }

    /* JADX INFO: renamed from: c7 */
    public void m4224c7(Message message) {
        this.f3541Z = message;
        this.f3552k0 = null;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m4226d4() {
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m4227d5(Bundle bundle) {
        CoreModule.c.f0.pq(this.f3542b);
        if (CoreModule.P().i().De()) {
            CoreModule.c.f0.Fo();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public boolean m4228d6() {
        return false;
    }

    /* JADX INFO: renamed from: d7 */
    public void m4229d7(MessageMomentGuide messageMomentGuide) {
        this.f3552k0 = messageMomentGuide;
        this.f3541Z = null;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m4231e4() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C1099c m4232e5() {
        return mkd0.t(m4300s3(this.f3542b), CoreModule.c.e0.o9(), m4174T2(), this.f3526K, new z9j() { // from class: l.wbz
            @Override // p003l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo6904b(Object obj, Object obj2, Object obj3, Object obj4) {
                return fcz.m4052l0(obj, (User) obj2, (Conversation) obj3, (roj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public boolean m4233e6() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public boolean m4234e7(String str) {
        boolean zEquals = TextUtils.equals(this.f3520E0, str);
        boolean z = !zEquals;
        if (!zEquals) {
            this.f3520E0 = str;
        }
        return z;
    }

    /* JADX INFO: renamed from: f3 */
    public C1099c<Boolean> m4235f3(String str, String str2, String str3, final String str4, Message message) {
        return duringCreated(CoreModule.c.f0.Wf(str, str2, str3, str4, message)).map(new w9j() { // from class: l.w7z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, str4));
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m4236f4(String str) {
        if (CoreModule.P().i().z(str)) {
            lsi0.w(R.string.F4);
            return true;
        }
        if (!ruy.m7381g().m7384e(str)) {
            return false;
        }
        lsi0.w(R.string.G4);
        return true;
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m4237f5(xaj0 xaj0Var) {
        this.f3551k = (Conversation) xaj0Var.c;
        if (!m4231e4()) {
            this.f3563u = !TextUtils.isEmpty(m4250i3()) && CoreModule.K().sg(m4250i3());
        }
        if (this.f3551k == null) {
            return;
        }
        this.f3549i = (User) xaj0Var.b;
        H h = (H) xaj0Var.a;
        this.f3550j = h;
        m4215b3(h);
        if (tqm0.p().s() && !(this instanceof j7z) && !(this instanceof mcz) && (this.f3550j instanceof User)) {
            m6497e0().mo2051E().y0().mo5717n((User) this.f3550j, this.f3551k);
        }
        ((tqz) ((jq2) this).viewModel).f7690t1.mo7354j();
        ((tqz) ((jq2) this).viewModel).mo3057D0();
        m4189W3();
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m4238f6() {
        List listQ;
        int iG;
        if (m6497e0().mo2068t0().O0() && (iG = vwb.G((listQ = Lists.q(this.f3560r.a)), new w9j() { // from class: l.y7z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8930a.m4115F5((Message) obj);
            }
        })) > 0) {
            for (int i = iG - 1; i >= 0; i--) {
                Message message = (Message) listQ.get(i);
                if (message.isOtherUser() && NullChecker.a(message.audio()) && !message.audio().audioRead) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public boolean m4239f7(Message message) {
        m4245h3();
        return this.f3567y && TextUtils.equals(this.f3565w, ((DbObject) message).id);
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m4241g4() {
        if (!m4266l4() || !CoreModule.P().i().I0() || CoreModule.K().me_().isFemale() || CoreModule.P().i().ws() > 0) {
            return false;
        }
        CoreModule.P().a().l1(act(), "message");
        return true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m4242g5(Message message) {
        this.f3554m = message;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m4243g6() {
        return true;
    }

    /* JADX INFO: renamed from: g7 */
    public boolean m4244g7(Message message) {
        return m4205Z3(message) && this.f3568z.contains(((DbObject) message).id);
    }

    /* JADX INFO: renamed from: h3 */
    public void m4245h3() {
        if (!TextUtils.isEmpty(this.f3565w)) {
            Message messageQuery = CoreModule.k.c.query(this.f3565w);
            if (NullChecker.a(messageQuery) && NullChecker.a(messageQuery.recalled) && !messageQuery.recalled.booleanValue()) {
                return;
            }
        }
        Message message = this.f3566x > 0.0d ? (Message) vwb.r(CoreModule.c.f0.qg(m4250i3(), this.f3566x), this.f3558p0) : (Message) vwb.r(CoreModule.c.f0.tg(m4250i3()), this.f3558p0);
        if (!NullChecker.a(message)) {
            m4134J6();
        } else {
            this.f3565w = ((DbObject) message).id;
            this.f3566x = message.createdTime;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m4246h4() {
        return false;
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ C1099c m4247h5(Conversation conversation) {
        return CoreModule.c.f0.Wn(m4250i3(), conversation.clearedUntil);
    }

    /* JADX INFO: renamed from: h6 */
    public boolean m4248h6(int i, int i2, Intent intent) {
        if (i == 16) {
            if (i2 == -1) {
                act().finish();
                act().overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i != 48) {
            if (i == 64 && i2 == -1) {
                act().setResult(-1, intent);
                act().finish();
                return true;
            }
            if (i != 10111 || i2 != -1) {
                return false;
            }
            ((tqz) ((jq2) this).viewModel).m7915a2();
            return true;
        }
        if (i2 == -1) {
            DoublePair serializableExtra = intent.getSerializableExtra("map_location");
            Message message = new Message();
            MessageLocation messageLocation = new MessageLocation();
            message.location = messageLocation;
            messageLocation.coordinates = serializableExtra;
            messageLocation.name = intent.getStringExtra("map_name");
            message.location.address = intent.getStringExtra("map_address");
            message.messageType = MessageType.get("location");
            m4172S5(message);
        }
        return true;
    }

    /* JADX INFO: renamed from: h7 */
    public boolean m4249h7() {
        return CoreModule.P().i().b() && m4310u3() != null;
    }

    /* JADX INFO: renamed from: i3 */
    public String m4250i3() {
        return this.f3543c;
    }

    /* JADX INFO: renamed from: i4 */
    public boolean m4251i4() {
        return TextUtils.equals(m4326y3(), "newmatch_next");
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ C1099c m4252i5() {
        return mkd0.t(m4179U2(), this.f3553l, m4300s3(this.f3542b), this.f3527L, new z9j() { // from class: l.qbz
            @Override // p003l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo6904b(Object obj, Object obj2, Object obj3, Object obj4) {
                return fcz.m4035e2((Conversation) obj, (q860) obj2, obj3, (roj0) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public final void m4253i6(final AudioText audioText) {
        e51.H(act(), new Runnable() { // from class: l.zbz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9303a.m4123H5(audioText);
            }
        }, m4135K2());
    }

    /* JADX INFO: renamed from: i7 */
    public boolean m4254i7() {
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public Conversation m4255j3() {
        return this.f3551k;
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m4256j4() {
        User userPa = CoreModule.c.e0.Pa(this.f3542b);
        return NullChecker.a(userPa) && userPa.onlineMatchLocked();
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m4257j5() {
        Conversation conversation = this.f3551k;
        conversation.localDraft = "";
        CoreModule.c.f0.mq(conversation);
    }

    /* JADX INFO: renamed from: j6 */
    public final boolean m4258j6() {
        if (y19.M() && r9m.m7149r().m7156q(mqi0.o())) {
            r9m.m7149r().m7155F(act());
            return true;
        }
        if (CoreModule.P().a().kb() && lz4.h().n() && m6497e0().mo2066l().m4216b4() && !m4211a4(m6497e0().mo2066l().m4318w3(m6497e0().mo2066l().m4295r3()))) {
            lz4.v(act(), lz4.h().f());
            return true;
        }
        if (m6497e0().mo2063c0().m6499g0().mo5102d()) {
            return true;
        }
        if (CoreModule.P().i().c() && !CoreModule.P().i().k1() && CoreModule.P().i().z0() && NullChecker.a(this.f3551k) && !this.f3551k.localEverHasMessage && NullChecker.a(m4325x6()) && m4325x6().onlineMatchLocked() && !m4261k4(m4295r3())) {
            CoreModule.P().i().S();
            CoreModule.P().i().d1(act());
            return true;
        }
        if (!CoreModule.P().b().Yg() || !NullChecker.a(this.f3551k) || !CoreModule.P().b().lo(this.f3551k)) {
            return false;
        }
        CoreModule.P().b().Wl(act());
        return true;
    }

    /* JADX INFO: renamed from: j7 */
    public C1185a<Boolean> m4259j7() {
        return C1185a.m9969b();
    }

    /* JADX INFO: renamed from: k3 */
    public double m4260k3() {
        return this.f3534S;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m4261k4(String str) {
        if (!CoreModule.P().i().x()) {
            return false;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        return NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "dismissed");
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m4262k5() {
        CoreModule.c.U.a(new d30() { // from class: l.ybz
            @Override // p003l.d30
            public final void call() {
                this.f9055a.m4257j5();
            }
        });
    }

    /* JADX INFO: renamed from: k7 */
    public boolean m4264k7() {
        if (!m4269l7() || !NullChecker.a(this.f3551k.additional) || !NullChecker.a(this.f3551k.additional.matchInfo)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f3551k.additional.matchInfo.source) && this.f3551k.additional.matchInfo.matchTime > 0.0d) {
            return true;
        }
        ConvAdditionalMatchInfo convAdditionalMatchInfo = this.f3551k.additional.matchInfo;
        return convAdditionalMatchInfo.likeTime > 0.0d && convAdditionalMatchInfo.likedByTime > 0.0d;
    }

    /* JADX INFO: renamed from: l3 */
    public MessageWarmingUpHelper.WarmingUpLevel m4265l3() {
        return this.f3532Q;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m4266l4() {
        return false;
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ Boolean m4267l5(Message message) {
        Boolean bool;
        return Boolean.valueOf(m6497e0().mo2068t0().N0(((DbObject) message)._id) && ((bool = message.recalled) == null || !bool.booleanValue()) && NullChecker.a(message.audio()));
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m4268l6(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        act().finish();
        return true;
    }

    /* JADX INFO: renamed from: l7 */
    public boolean m4269l7() {
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public double m4270m3() {
        return this.f3533R;
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m4271m4(Message message) {
        return NullChecker.a(message) && TextUtils.equals(((DbObject) message).id, this.f3565w);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m4272m5(xaj0 xaj0Var) {
        this.f3551k = (Conversation) xaj0Var.a;
        this.f3550j = (H) xaj0Var.c;
        if (m4223c6()) {
            xaj0Var.b = m4275n3(xaj0Var);
        }
        if (CoreModule.P().i().l() && !TextUtils.isEmpty(this.f3551k.localDraft)) {
            m6497e0().mo2046A0().m6499g0().m4774K1(this.f3551k.localDraft);
            e51.y(new Runnable() { // from class: l.gbz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3845a.m4262k5();
                }
            });
        }
        q860<Message> q860Var = (q860) xaj0Var.b;
        if (!m4231e4()) {
            this.f3563u = !TextUtils.isEmpty(this.f3542b) && CoreModule.K().sg(this.f3542b);
            if (!vwb.J(q860Var.a)) {
                ((tqz) ((jq2) this).viewModel).mo3063H1((Message) q860Var.a.get(0));
            }
        }
        if (CoreModule.P().i().D() && !vwb.J(q860Var.a)) {
            C0107b.m2163q((Message) q860Var.a.get(0));
        }
        if (m6497e0().mo2068t0().O0() && !vwb.m(q860Var.a, new w9j() { // from class: l.ibz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4388a.m4267l5((Message) obj);
            }
        })) {
            m6497e0().mo2068t0().H0().stop();
        }
        ((tqz) ((jq2) this).viewModel).m7936j0().m5286c0(q860Var, ((Conversation) xaj0Var.a).reminder, this.f3554m);
        if (NullChecker.a(m6497e0().mo2068t0().H0())) {
            m6497e0().mo2068t0().H0().setNeedToPlayNext(m4238f6());
        }
        ((tqz) ((jq2) this).viewModel).m7885K1();
        ((tqz) ((jq2) this).viewModel).f7690t1.mo7353h(q860Var);
        if (q860Var.a.size() == 0 && q860Var.c()) {
            ((tqz) ((jq2) this).viewModel).m7936j0().m5289e(0);
        }
        if (q860Var.a.size() > 0) {
            if (((CoreModule.P().i().E() && m4231e4()) ? false : ((Message) q860Var.a.get(0)).owner.equals(this.f3542b)) && !TextUtils.equals(this.f3551k.readUntil, ((DbObject) ((Message) q860Var.a.get(0))).id)) {
                m4164Q6(m4250i3());
            }
            Message message = (Message) q860Var.a.get(0);
            String str = this.f3556o;
            if (str == null) {
                this.f3556o = ((DbObject) message).id;
            } else if (!str.equals(((DbObject) message).id) && !TextUtils.isEmpty(((DbObject) message).id) && !((DbObject) message).id.startsWith("fake_id_")) {
                this.f3556o = ((DbObject) message).id;
                if (message.isMe()) {
                    CoreModule.c.f0.b0.onNext(message);
                } else {
                    CoreModule.c.f0.c0.onNext(message);
                }
            }
        } else {
            this.f3556o = "";
        }
        if (!m4231e4()) {
            m6497e0().mo2046A0().m6499g0().m4762E0();
        }
        if (!m4231e4()) {
            m6497e0().mo2046A0().m6499g0().m4755A0();
        }
        if (!m4231e4() && ruy.m7381g().m7392o(this.f3551k)) {
            if (q860Var.a.isEmpty()) {
                boolean z = this.f3551k.localEverHasMessage;
                s7m s7mVar = ((jq2) this).viewModel;
                if (z) {
                    ((tqz) s7mVar).m7916b2();
                } else {
                    ((tqz) s7mVar).m7897S1();
                }
                Conversation conversation = this.f3551k;
                if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                    m6497e0().mo2046A0().m6499g0().m4789S1(m4295r3());
                }
            } else {
                ((tqz) ((jq2) this).viewModel).m7897S1();
                m6497e0().mo2046A0().m6499g0().m4789S1(m4295r3());
            }
        }
        if (!m4231e4()) {
            m4113F3();
        }
        m4220c3(this.f3551k, q860Var, this.f3550j);
    }

    /* JADX INFO: renamed from: m6 */
    public void m4273m6(List<Media> list) {
        m4278n6(list, 0);
    }

    /* JADX INFO: renamed from: m7 */
    public void m4274m7() {
        if (m4310u3() == null) {
            return;
        }
        if (!TextUtils.isEmpty(m4310u3().schema)) {
            j2e0.m(act(), Uri.parse(m4310u3().schema));
        } else {
            zvf0.u("e_live_room_enter", "p_chat_view", new j760[]{vwb.Y("liveId", m4310u3().liveId), vwb.Y("anchorId", m4310u3().userId), vwb.Y("index", "NA"), vwb.Y("module", "page"), vwb.Y("show_label", "连线"), vwb.Y("live_status", "on"), vwb.Y("liveRecommendCategory", "NA")});
            CoreModule.Q().startAudienceLive(act(), m4310u3().liveId, "chat", (String) null);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final q860 m4275n3(xaj0<Conversation, q860<Message>, H> xaj0Var) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(xaj0Var.b) && !vwb.J(((q860) xaj0Var.b).a)) {
            arrayList = vwb.n(((q860) xaj0Var.b).a, new w9j() { // from class: l.r7z
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f6802a.m4181U4((Message) obj);
                }
            });
            if (!vwb.J(arrayList) && !vwb.m(arrayList, new w9j() { // from class: l.s7z
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    Message message = (Message) obj;
                    return Boolean.valueOf(NullChecker.a(message) && !((DbObject) message).id.startsWith("fake_id_"));
                }
            })) {
                arrayList = new ArrayList();
            }
        }
        return new q860(arrayList, ((q860) xaj0Var.b).b);
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m4276n4(String str) {
        return this.f3568z.contains(str);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m4277n5(Intent intent) {
        if (TextUtils.equals(intent.getStringExtra("ISCALLEER"), "1")) {
            tqm0.p().h(act(), this.f3543c, "voiceQuickChat");
        } else {
            tqm0.p().e();
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m4278n6(List<Media> list, int i) {
        if (list.size() <= 0 || !(list.get(0) instanceof Video)) {
            m4104C6(list, i);
        } else {
            m4303s6(rhi.z(((Media) list.get(0)).url));
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m4279n7() {
        zvf0.A("e_live_room_enter", "p_chat_view", new j760[]{vwb.Y("liveId", m4310u3().liveId), vwb.Y("anchorId", m4310u3().userId), vwb.Y("live_status", "on"), vwb.Y("index", "NA"), vwb.Y("module", "page"), vwb.Y("show_label", "连线"), vwb.Y("liveRecommendCategory", "NA")});
    }

    /* JADX INFO: renamed from: o3 */
    public int m4280o3() {
        return this.f3544d;
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m4281o4(String str) {
        if (!TextUtils.equals(this.f3517C, str)) {
            return false;
        }
        this.f3517C = null;
        return true;
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m4282o5(c cVar) {
        if (cVar == c.m) {
            ((tqz) ((jq2) this).viewModel).m7927g0();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m4283o6(Menu menu) {
        Menu menu2;
        User userPa = CoreModule.c.e0.Pa(this.f3542b);
        if (!CoreModule.P().i().c() || !NullChecker.a(userPa) || !userPa.onlineMatch() || m4261k4(this.f3542b) || CoreModule.P().i().G1()) {
            return false;
        }
        if (userPa.onlineMatchLocked()) {
            menu.removeItem(2);
        } else if (menu.findItem(2) == null) {
            CoreModule.P().i().W5(true, menu, this.f3542b, act());
        }
        if (menu.findItem(3) != null || userPa.isTeamAccount()) {
            menu2 = menu;
        } else {
            menu2 = menu;
            CoreModule.P().i().J3(true, true, (User) null, act(), menu2, this.f3542b, (d30) null, "p_chat_view");
        }
        if (!CoreModule.P().i().D() || menu2.findItem(4) != null || !NullChecker.a(userPa) || userPa.isTeamAccount()) {
            return false;
        }
        CoreModule.P().i().c1(act(), menu2, ((DbObject) userPa).id);
        return false;
    }

    /* JADX INFO: renamed from: o7 */
    public List<Object> m4284o7() {
        return vwb.f0(new Object[]{"other user id", this.f3542b, ag3.c});
    }

    /* JADX INFO: renamed from: p3 */
    public LocalStatus m4285p3() {
        return this.f3540Y;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m4286p4(String str) {
        return this.f3515A.contains(str);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m4287p5(HashMap map) {
        try {
            for (List list : map.values()) {
                Act.r rVar = list.size() >= 1 ? (Act.r) list.get(list.size() - 1) : null;
                Act.r rVar2 = list.size() >= 2 ? (Act.r) list.get(list.size() - 2) : null;
                if (NullChecker.a(rVar2) && (rVar2.a.get() instanceof SelectContactAct)) {
                    rVar2 = list.size() >= 3 ? (Act.r) list.get(list.size() - 3) : null;
                }
                if (NullChecker.a(rVar2) && !rVar2.d && NullChecker.a(rVar) && rVar.a.get() == act()) {
                    Act act = (Activity) rVar2.a.get();
                    if ((act instanceof MessagesAct) && ((MessagesAct) act).mo2066l().m4295r3().equals(this.f3542b) && act != act()) {
                        m4144M2((MessagesAct) act);
                        act().finish();
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("MessagesAct Exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m4288p6(String str, final String str2) {
        duringCreated(CoreModule.c.f0.ag(str, str2).observeOn(jo0.m5414a())).filter(new bbz()).take(1).subscribe((m250) mkd0.H(new cbz(this), new e30() { // from class: l.mbz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5578a.m4128I5(str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p7 */
    public void m4289p7(final Message message, boolean z) {
        if (m4271m4(message)) {
            m4134J6();
        }
        if (m4286p4(((DbObject) message).id)) {
            return;
        }
        if (NullChecker.a(message.localAudioText) && TEnum.equals(message.localAudioText.status, "failed") && !message.localAudioText.failRetry) {
            m4294q7(((DbObject) message).id, false);
            return;
        }
        if (m4205Z3(message)) {
            m4192W6(((DbObject) message).id);
            m4309t7().m7936j0().y();
            return;
        }
        if (z) {
            this.f3516B = ((DbObject) message).id;
            this.f3567y = false;
        }
        this.f3518D = mqi0.o();
        this.f3515A.add(((DbObject) message).id);
        duringCreated(CoreModule.c.f0.cq(m4250i3(), ((DbObject) message).id)).filter(new bbz()).take(1).subscribe((m250) mkd0.H(new cbz(this), new e30() { // from class: l.dbz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2937a.m4163Q5(message, (Throwable) obj);
            }
        }));
        c4g0 c4g0VarSubscribe = duringCreated(C1099c.timer(10L, TimeUnit.SECONDS).compose(mkd0.C())).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.ebz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3248a.m4167R5(message, (Long) obj);
            }
        }));
        if (message.isOtherUser() && !message.audio().audioRead) {
            CoreModule.c.f0.An(((DbObject) message).id);
        }
        this.f3519E.put(((DbObject) message).id, c4g0VarSubscribe);
        m4309t7().m7936j0().y();
    }

    public String pageId() {
        if (m4231e4()) {
            return "p_group_chat_view";
        }
        if (m4226d4()) {
            return "p_greet_chat";
        }
        return (TextUtils.isEmpty(this.f3542b) || !m4261k4(this.f3542b)) ? "p_chat_view" : "p_unmatch_details";
    }

    /* JADX INFO: renamed from: q3 */
    public H m4290q3() {
        return this.f3550j;
    }

    /* JADX INFO: renamed from: q4 */
    public boolean m4291q4() {
        return false;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m4292q5(Bundle bundle) {
        ((tqz) ((jq2) this).viewModel).mo3137r();
    }

    /* JADX INFO: renamed from: q6 */
    public void m4293q6(String str) {
        s7m s7mVar = ((jq2) this).viewModel;
        ((tqz) s7mVar).f7677n1.setSelectionHook(((tqz) s7mVar).f7677n1.getCountHook() - 1);
        m4303s6(str);
    }

    /* JADX INFO: renamed from: q7 */
    public void m4294q7(String str, boolean z) {
        mkd0.z(this.f3519E.remove(str));
        if (TextUtils.equals(this.f3516B, str)) {
            this.f3516B = null;
            this.f3567y = true;
        }
        this.f3515A.remove(str);
        m4309t7().m7936j0().y();
        if (z) {
            w3z.m8467y(act());
        } else {
            o6j0.h("e_chat_message_convert_to_text_failed", pageId(), new o6j0.a[0]);
            lsi0.w(R.string.Z1);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public abstract String m4295r3();

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m4296r4() {
        ((tqz) ((jq2) this).viewModel).m7912Z1();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ C1099c m4297r5() {
        return mkd0.s(CoreModule.c.e0.Ka(this.f3542b), CoreModule.c.f0.mo(this.f3542b), CoreModule.c.f0.Ue(this.f3542b), new tmy());
    }

    /* JADX INFO: renamed from: r6 */
    public void m4298r6(String str) {
        s7m s7mVar = ((jq2) this).viewModel;
        ((tqz) s7mVar).f7677n1.setSelectionHook(((tqz) s7mVar).f7677n1.getCountHook() - 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m4100B6(arrayList);
    }

    /* JADX INFO: renamed from: r7 */
    public void m4299r7(String str) {
        mkd0.z(this.f3519E.remove(str));
        o6j0.h("e_chat_message_convert_to_text", pageId(), new o6j0.a[0]);
        m4192W6(str);
        this.f3515A.remove(str);
        this.f3517C = str;
        m4148N2(str);
        m4309t7().m7936j0().y();
    }

    /* JADX INFO: renamed from: s3 */
    public abstract C1099c<H> m4300s3(String str);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m4301s4(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.c.f1.R3(str);
            if (CoreModule.P().i().b5()) {
                CoreModule.c.f1.O3(((DbObject) m4325x6()).id);
                zvf0.q("e_chat_gift_bar_gift_send", act().pageId(), new j760[]{vwb.Y("chat_gift_id", str)});
            }
            e51.H(act(), new Runnable() { // from class: l.h8z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4156a.m4296r4();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ C1099c m4302s5(Integer num) {
        return CoreModule.c.N0.o3(m4231e4() ? "" : this.f3542b);
    }

    /* JADX INFO: renamed from: s6 */
    public void m4303s6(String str) {
        r5l0 r5l0Var = new r5l0(str);
        if (!NullChecker.a(r5l0Var.a)) {
            lsi0.h(R.string.C2);
        } else if (r5l0Var.b > 60000) {
            lsi0.h(R.string.T4);
        } else {
            m4187V6(r5l0Var);
        }
    }

    /* JADX INFO: renamed from: s7 */
    public void m4304s7(boolean z) {
        CoreModule.c.f0.Bo(m4250i3());
    }

    /* JADX INFO: renamed from: t3 */
    public double m4305t3() {
        return -1.0d;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m4306t4(Throwable th) {
        if (!(th instanceof TantanException.Client.TantanForbidden) || !ura.e().d().Ct((TantanException.Client.TantanForbidden) th)) {
            return Boolean.FALSE;
        }
        w3z.m8434F(act(), m4325x6());
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m4307t5(c cVar) {
        m4201Y5();
    }

    /* JADX INFO: renamed from: t7 */
    public V m4309t7() {
        return (V) super.m6499g0();
    }

    /* JADX INFO: renamed from: u3 */
    public UserLiveLabel m4310u3() {
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m4311u4(Message message, Message message2) {
        w85.INSTANCE.m("Send Message", (Map) null);
        if (TEnum.equals(message2.messageType(), "chat_gift") && NullChecker.a(message2.additionalData) && NullChecker.a(message2.additionalData.chatGiftInfo) && !m4231e4()) {
            CoreGiftInfo coreGiftInfoR3 = CoreModule.c.f1.R3(message2.additionalData.chatGiftInfo.id);
            if (NullChecker.a(coreGiftInfoR3) && coreGiftInfoR3.dynamicGift && !CoreModule.P().i().k0()) {
                m4125I2(coreGiftInfoR3);
            }
            CoreModule.P().i().w0(pageId(), m4295r3(), true);
            CoreModule.c.f0.b0.onNext(message);
        }
        if (TEnum.equals(message2.messageType, "real_shot") && CoreModule.c.f0.Z1) {
            o6j0.h("e_chat_topic_rec_photo_text", act().pageId(), new o6j0.a[]{o6j0.a.h("send_user_id", message2.owner)});
        }
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m4312u5(c cVar) {
        if (cVar == c.k && CoreModule.P().i().g1()) {
            this.f3520E0 = null;
        }
        if (cVar == c.m) {
            n000.m6521f();
            n000.m6522g();
            m4225d3();
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m4313u6() {
        String strM4093A3 = m4093A3();
        CoreModule.c.f0.Xe(this.f3542b);
        act().startActivityForResult(CoreModule.P().i().M1(act(), ((DbObject) m4191W5()).id, strM4093A3, false), 16);
    }

    /* JADX INFO: renamed from: v3 */
    public Message m4314v3(final long j) {
        List listQ = Lists.q(this.f3560r.a);
        int iG = vwb.G(listQ, new w9j() { // from class: l.x7z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) ((Message) obj))._id == j);
            }
        });
        if (iG <= 0) {
            return null;
        }
        for (int i = iG - 1; i >= 0; i--) {
            Message message = (Message) listQ.get(i);
            if (message.isOtherUser() && NullChecker.a(message.audio()) && !message.audio().audioRead) {
                return message;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m4315v4(Message message, Throwable th) {
        if (TEnum.equals(message.messageType(), "chat_gift")) {
            CoreModule.P().i().w0(pageId(), m4295r3(), false);
        }
        m4230e3(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && CoreModule.P().i().i2((TantanException.Client.TantanForbidden) th)) {
            lsi0.h(R.string.J4);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m4316v5(roj0 roj0Var) {
        ((tqz) ((jq2) this).viewModel).m7932h2();
    }

    /* JADX INFO: renamed from: v6 */
    public void m4317v6(String str) {
        m4321w6(str, this.f3542b);
    }

    /* JADX INFO: renamed from: w3 */
    public User m4318w3(String str) {
        return CoreModule.c.e0.M7(str);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m4319w4(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m4320w5() {
        if (f3514H0 || !NullChecker.a(this.f3542b) || User.isTeamAccount(this.f3542b) || !f3513G0.contains(Build.MODEL) || ((Integer) DialogAct.f.get()).intValue() >= 2 || !Network.language().equals("zh-Hans")) {
            return;
        }
        f3514H0 = true;
        act().startActivity(DialogAct.O0(act(), 3, (Serializable) null));
    }

    /* JADX INFO: renamed from: w6 */
    public void m4321w6(String str, String str2) {
        if (TextUtils.equals(str2, this.f3542b) && m4194X3(str)) {
            return;
        }
        CoreModule.c.e0.Pa(str2);
        Intent intentM1 = CoreModule.P().i().M1(act(), str2, str, false);
        m4240g3(intentM1);
        act().startActivityForResult(intentM1, 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(szb0.e, szb0.a);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public IceBreakingQuestion m4322x3() {
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m4323x4(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && !CoreModule.c.e0.Pa(this.f3542b).unilateralBlock()) {
            CoreModule.c.e0.Ba(this.f3542b);
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m4324x5(User user) {
        boolean zM4256j4 = m4256j4();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zM4256j4) {
            ((tqz) s7mVar).m7929g2();
        } else {
            ((tqz) s7mVar).m7960v0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x6 */
    public User m4325x6() {
        if (CoreModule.P().i().De()) {
            return CoreModule.c.e0.Pa(this.f3542b);
        }
        return null;
    }

    /* JADX INFO: renamed from: y3 */
    public String m4326y3() {
        return this.f3545e;
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m4327y4(Message message) {
        return Boolean.valueOf(TextUtils.equals(((DbObject) message).id, this.f3516B));
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m4328y5(User user) {
        if (!user.onlineMatchLocked() || user.unilateralBlock()) {
            ((tqz) ((jq2) this).viewModel).m7962w0();
        } else {
            ((tqz) ((jq2) this).viewModel).m7882J0();
        }
    }

    /* JADX INFO: renamed from: z3 */
    public String m4330z3() {
        return "";
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m4331z4(Long l2) {
        m4159P6();
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m4332z5(j760 j760Var) {
        if (((Integer) ((j760) j760Var.b).a).intValue() == 25 && TextUtils.isEmpty(CoreModule.P().i().W3(this.f3542b)) && NullChecker.a(((j760) j760Var.b).b)) {
            CoreModule.P().i().x0(this.f3542b, ((DbObject) ((Message) ((j760) j760Var.b).b)).id);
        } else if (((Integer) ((j760) j760Var.b).a).intValue() == 50 && TextUtils.isEmpty(CoreModule.P().i().g3(this.f3542b)) && NullChecker.a(((j760) j760Var.b).b)) {
            CoreModule.P().i().D0(this.f3542b, ((DbObject) ((Message) ((j760) j760Var.b).b)).id);
        } else if (((Integer) ((j760) j760Var.b).a).intValue() == 75 && TextUtils.isEmpty(CoreModule.P().i().c5(this.f3542b)) && NullChecker.a(((j760) j760Var.b).b)) {
            CoreModule.P().i().D3(this.f3542b, ((DbObject) ((Message) ((j760) j760Var.b).b)).id);
        } else {
            if (((Integer) ((j760) j760Var.b).a).intValue() != 100 || !TextUtils.isEmpty(CoreModule.P().i().Q1(this.f3542b)) || !NullChecker.a(((j760) j760Var.b).b)) {
                return;
            }
            ((tqz) ((jq2) this).viewModel).m7921d2();
            CoreModule.P().i().r2(this.f3542b, ((DbObject) ((Message) ((j760) j760Var.b).b)).id);
            if (CoreModule.P().i().O2()) {
                Keyboard keyboardMo5099a = m6497e0().mo2063c0().m6499g0().mo5099a();
                if (NullChecker.a(keyboardMo5099a)) {
                    keyboardMo5099a.m1883C();
                }
            }
        }
        ((tqz) ((jq2) this).viewModel).m7872B1();
    }

    /* JADX INFO: renamed from: G6 */
    public void m4119G6() {
    }

    /* JADX INFO: renamed from: H6 */
    public void m4124H6() {
    }

    /* JADX INFO: renamed from: I6 */
    public void m4129I6() {
    }

    /* JADX INFO: renamed from: d3 */
    public void m4225d3() {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: y6 */
    public void m4329y6() {
    }

    /* JADX INFO: renamed from: I2 */
    public void m4125I2(CoreGiftInfo coreGiftInfo) {
    }

    /* JADX INFO: renamed from: K6 */
    public void m4139K6(IceBreakingQuestion iceBreakingQuestion) {
    }

    /* JADX INFO: renamed from: M2 */
    public void m4144M2(PutongAct putongAct) {
    }

    /* JADX INFO: renamed from: b3 */
    public void m4215b3(H h) {
    }

    /* JADX INFO: renamed from: b7 */
    public void m4219b7(boolean z) {
    }

    /* JADX INFO: renamed from: e3 */
    public void m4230e3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public Intent m4240g3(Intent intent) {
        return intent;
    }

    /* JADX INFO: renamed from: t6 */
    public void m4308t6(Message message) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m4263k6(int i, Menu menu) {
    }

    /* JADX INFO: renamed from: c3 */
    public void m4220c3(Conversation conversation, q860<Message> q860Var, H h) {
    }

    /* JADX INFO: renamed from: z6 */
    public void m4333z6(Message message, CoreGiftInfo coreGiftInfo, String str, boolean z) {
    }
}
