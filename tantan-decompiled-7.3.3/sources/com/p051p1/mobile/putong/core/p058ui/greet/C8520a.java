package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4895j;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.GiftSubBizType;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.data.SendGiftExtra;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.C20291td;
import p153l.fjf0;
import p153l.fo0;
import p153l.g39;
import p153l.i4g0;
import p153l.j1a;
import p153l.jyb;
import p153l.l51;
import p153l.ner;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.rcj;
import p153l.u17;
import p153l.uxj0;
import p153l.vg60;
import p153l.vvj;
import p153l.wi5;
import p153l.x20;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8520a extends AbstractC8522c<GreetActViewModel> {

    /* JADX INFO: renamed from: g */
    public String f30291g;

    /* JADX INFO: renamed from: h */
    public boolean f30292h;

    /* JADX INFO: renamed from: i */
    public double f30293i;

    /* JADX INFO: renamed from: j */
    public boolean f30294j;

    public C8520a(ner nerVar, GreetingParam greetingParam) {
        super(nerVar, greetingParam);
        this.f30292h = true;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m47001D0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m47009N0(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f18264c.f20384f0.m33905ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (g39.m128719e(tantanForbidden)) {
                o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
            } else if (g39.m128718d(tantanForbidden)) {
                o1j0.m165651y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m47010W0() {
        if (m47066t1()) {
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.sak
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167052a.m47052d1((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m47011i1(Bundle bundle) {
        ((GreetActViewModel) this.viewModel).m46882r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m47012j1() {
        ((GreetActViewModel) this.viewModel).m46845X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m47014k1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (!this.f30292h) {
                ((GreetActViewModel) this.viewModel).m46861g0();
            }
            this.f30292h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m47016l1(User user) {
        ((GreetActViewModel) this.viewModel).m46850Z0(user);
        ((GreetActViewModel) this.viewModel).m46881q1(user, CoreGiftPanelName.get("greet"));
        ((GreetActViewModel) this.viewModel).m46885t1(user, m47072g0().moment.f39607id);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m47021q0(CoreSendGiftBody coreSendGiftBody, Throwable th) {
        vvj.m203017e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, false);
        g39.m128717c(th);
    }

    /* JADX INFO: renamed from: B1 */
    public void m47029B1(String str, String str2) {
        act().startActivity(CoreModule.m30933P().m143412i().mo180295A5(act(), str2, str, false, false, false));
        act().overridePendingTransition(y7c0.f197767e, 0);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m47030C1() {
        if (CoreModule.m30932N().mo61465Hj() && TextUtils.equals(getFrom(), "p_interested_user")) {
            CoreModule.f18264c.f20420r0.f20771j0.m137019l(m47072g0().f21143id);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final void m47031D1() {
        if (m47049a1()) {
            String str = m47072g0().f21143id;
            C4895j c4895j = CoreModule.f18264c.f20420r0;
            c4895j.f20772k0 = str;
            c4895j.f20770i0.m137019l(str);
        }
        m47030C1();
    }

    /* JADX INFO: renamed from: E1 */
    public void m47032E1(CoreGiftInfo coreGiftInfo) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = m47072g0().otherUser;
        coreSendGiftBodyNew_.giftID = coreGiftInfo.f56859id;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get("chat").toString();
        SendGiftExtra sendGiftExtraNew_ = SendGiftExtra.new_();
        sendGiftExtraNew_.momentId = m47072g0().moment.f39607id;
        sendGiftExtraNew_.greetingChannel = m47072g0().channel.toString();
        coreSendGiftBodyNew_.extra = sendGiftExtraNew_;
        coreSendGiftBodyNew_.subBizType = GiftSubBizType.get("greet");
        String str = coreGiftInfo.consumeType;
        if (!"privilege".equals(str)) {
            coreSendGiftBodyNew_.coinSign = coreGiftInfo.coinSign;
        }
        coreSendGiftBodyNew_.consumeType = str;
        m47047X0(m47072g0().otherUser);
        m47033F1(coreSendGiftBodyNew_);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m47033F1(final CoreSendGiftBody coreSendGiftBody) {
        CoreModule.f18264c.f20385f1.m155911k4(coreSendGiftBody).subscribe(psd0.m173597H(new y20() { // from class: l.z9k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203491a.m47062p1(coreSendGiftBody, (uxj0) obj);
            }
        }, new y20() { // from class: l.aak
            @Override // p153l.y20
            public final void call(Object obj) {
                C8520a.m47021q0(coreSendGiftBody, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public void m47034H1() {
        if (TextUtils.isEmpty(CoreModule.f18264c.f20400k1.m121135t3(m47072g0().f21143id))) {
            return;
        }
        boolean z = ((GreetAct) act()).m46766d2().isStartHomeCard;
        if (TextUtils.equals(getFrom(), "home_card") || TextUtils.equals(getFrom(), "home_moment_theme_card")) {
            z = true;
        }
        j1a.m143109z(act(), m47044S0(), z, m47072g0().f21143id, LikeFrom.get("greet"), null, null, null, false, false);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m47035I1(final Greeting greeting, final Message message, String str) {
        act().duringCreated(CoreModule.f18264c.f20420r0.m35152u6(greeting.f21143id, greeting.channel, message, str, null).take(1).doOnNext(new y20() { // from class: l.iak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113600a.m47063q1(message, greeting, (Message) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.jak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118990a.m47064r1(message, greeting, (Message) obj);
            }
        }, new y20() { // from class: l.kak
            @Override // p153l.y20
            public final void call(Object obj) {
                C8520a.m47009N0(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    public void m47036J1(Message message) {
        String str;
        ((GreetActViewModel) this.viewModel).f30206x.f30164f = false;
        CoreModule.f18273l.m143412i().mo180480h4(((GreetActViewModel) this.viewModel).f30206x, "", "p_kankan_chat_popup", getFrom(), m47072g0().otherUser);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            } else if (userM116600p9.isNameFake()) {
                CoreModule.m30933P().m143412i().mo180291A(act());
                return;
            }
        }
        if (TextUtils.isEmpty(m47072g0().moment.f39607id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.f30291g)) {
                if (TextUtils.equals(m47072g0().actorUserId, CoreModule.m30929H().userId())) {
                    this.f30291g = m47072g0().otherUser;
                } else {
                    this.f30291g = CoreModule.m30929H().userId();
                }
            }
            str = "?source=moment&moment_id=" + m47072g0().moment.f39607id + "&moment_owner_id=" + this.f30291g;
        }
        m47035I1(m47072g0(), message, str);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m47037L1() {
        duringCreated(CoreModule.f18264c.f20420r0.m35077A6(m47072g0().f21143id, m47072g0().readUntil)).subscribe(psd0.m173597H(new y20() { // from class: l.y9k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198100a.m47065s1((Greeting) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m47038N1() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.m82486a(m47072g0()) && TEnum.equals(m47072g0().channel, "anonymous");
    }

    /* JADX INFO: renamed from: O0 */
    public final List<Message> m47039O0(List<Message> list) {
        return (jyb.m147479J(list) || !jyb.m147520m(list, new qcj() { // from class: l.bak
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.m82486a(message) && !message.f56859id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m47040O1() {
        CoreModule.f18264c.f20420r0.m35103N6(NotificationStatus.get("pending"), NotificationStatus.get("removed"), m47072g0().f21143id);
        CoreModule.f18264c.f20420r0.m35103N6(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m47072g0().f21143id);
        Iterator<Integer> it = CoreModule.m30933P().m143412i().mo180540t3().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (u17.m193926v(iIntValue) && TextUtils.equals(String.valueOf(iIntValue + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL), m47072g0().f21143id)) {
                CoreModule.m30933P().m143412i().mo180449c3(iIntValue);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m47041P0() {
        if (NullChecker.m82486a(m47072g0())) {
            try {
                return Long.valueOf(m47072g0().clearedUntil).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q0 */
    public double m47042Q0() {
        return this.f30293i;
    }

    /* JADX INFO: renamed from: R0 */
    public String m47043R0() {
        return NullChecker.m82486a(m47072g0()) ? m47072g0().f21143id : "";
    }

    /* JADX INFO: renamed from: S0 */
    public User m47044S0() {
        return CoreModule.f18264c.f20381e0.m116503Pa(m47072g0().otherUser);
    }

    /* JADX INFO: renamed from: U0 */
    public final String m47045U0(List<Message> list, final User user) {
        Message message;
        if (user == null || (message = (Message) jyb.m147529r(list, new qcj() { // from class: l.eak
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf(TextUtils.equals(message2.owner, user.f56859id) && TEnum.equals(message2.messageType, MessageType.moment_reference) && !TextUtils.isEmpty(message2.moment));
            }
        })) == null) {
            return null;
        }
        return message.moment;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m47046V0() {
        duringCreated(CoreModule.f18264c.f20420r0.f20777p0).subscribe(psd0.m173596G(new y20() { // from class: l.rak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161936a.m47051c1((Greeting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m47047X0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (m47073h0().hasCreatedGreeting) {
            CoreModule.f18264c.f20420r0.m35085E6(str);
        }
        C22421c<vg60<Message>> c22421cFlatMap = C22421c.just(0).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.t9k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172645a.m47057h1(str, (Integer) obj);
            }
        }).flatMap(new qcj() { // from class: l.u9k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178121a.m47053e1(str, (List) obj);
            }
        });
        if (CoreModule.f18264c.f20384f0.m34148uh(str)) {
            c22421cFlatMap = CoreModule.f18264c.f20384f0.m33832Un(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        duringCreated(c22421cFlatMap.observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.v9k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183006a.m47055f1(str, (vg60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33740Ne(str).filter(new qcj() { // from class: l.w9k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((CoreModule.f18264c.f20384f0.m34148uh(conversation.f56859id) || TextUtils.equals(conversation.convType, ConversationType.fakeReceiveLikeGuideSVip) || TextUtils.equals(conversation.convType, ConversationType.local_instant_chat_guide)) ? false : true);
            }
        })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.x9k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192945a.m47056g1((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m47048Y0() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.m82486a(m47072g0()) && TEnum.equals(m47072g0().channel, "anonymous");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.greet.AbstractC8522c, p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.greet.AbstractC8522c, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.s9k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166939a.m47011i1((Bundle) obj);
            }
        }, new x20() { // from class: l.dak
            @Override // p153l.x20
            public final void call() {
                this.f85894a.m47012j1();
            }
        });
        m47010W0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.lak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130706a.m47014k1((C4470c) obj);
            }
        }));
        m47047X0(m47072g0().f21143id);
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(m47072g0().otherUser)).filter(new C20291td()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.mak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135557a.m47016l1((User) obj);
            }
        }, new y20() { // from class: l.nak
            @Override // p153l.y20
            public final void call(Object obj) {
                C8520a.m47001D0((Throwable) obj);
            }
        }));
        if (!TextUtils.isEmpty(((GreetActViewModel) this.viewModel).f30206x.m46766d2().stateId)) {
            duringCreated(psd0.m173625r(CoreModule.m30932N().mo61551l8(((GreetActViewModel) this.viewModel).f30206x.m46766d2().stateId, m47072g0().otherUser), CoreModule.f18264c.f20381e0.m116483Ka(m47072g0().otherUser), new rcj() { // from class: l.oak
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return jyb.m147494Y((Envelope) obj, (User) obj2);
                }
            })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.pak
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151288a.m47059m1((pf60) obj);
                }
            }, new y20() { // from class: l.qak
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g("状态已结束");
                }
            }));
        }
        m47040O1();
        m47046V0();
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m47049a1() {
        return "card".equals(getFrom()) || TextUtils.equals("from_city_centre_card", getFrom()) || TextUtils.equals("home_card", getFrom()) || TextUtils.equals("home_moment_theme_card", getFrom()) || TextUtils.equals("p_poi_nearby_card", getFrom());
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m47050b1(List<Message> list) {
        return (this.f30294j || !NullChecker.m82486a(m47072g0()) || TextUtils.equals(m47072g0().actorUserId, CoreModule.m30929H().userId()) || jyb.m147479J(list) || ((Message) jyb.m147529r(list, new qcj() { // from class: l.cak
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).messageType, MessageType.local_dynamic_greeting_agree_match));
            }
        })) != null) ? false : true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m47051c1(Greeting greeting) {
        if (TextUtils.equals(greeting.f21143id, m47072g0().f21143id)) {
            this.f30296a.m137019l(greeting);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m47052d1(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            ((GreetActViewModel) this.viewModel).m46849Z();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ C22421c m47053e1(String str, List list) {
        long jLongValue;
        this.f30293i = jyb.m147479J(list) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Message) list.get(0)).createdTime;
        try {
            jLongValue = Long.valueOf(m47072g0().clearedUntil).longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.f18264c.f20420r0.m35076A5(str, this.f30293i, jLongValue, m47048Y0(), m47073h0().hasCreatedGreeting);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.greet.AbstractC8522c
    /* JADX INFO: renamed from: f0 */
    public String mo47054f0() {
        Act act = act();
        Objects.requireNonNull(act);
        if (!TextUtils.isEmpty(((GreetAct) act).m46766d2().stateId)) {
            return "state";
        }
        if (TextUtils.equals(getFrom(), "from_h5_suggest_user")) {
            return Channel.specialguest;
        }
        return m47048Y0() ? "anonymous" : "moment";
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m47055f1(String str, vg60 vg60Var) {
        List<Message> listM47039O0 = m47039O0(vg60Var.f184001a);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        ((GreetActViewModel) this.viewModel).f30167A.setMomentId(m47045U0(listM47039O0, userM116600p9));
        if (CoreModule.m30933P().m143412i().mo34386O8() && NullChecker.m82486a(userM116600p9) && userM116600p9.isFemale() && m47050b1(listM47039O0)) {
            CoreModule.f18264c.f20420r0.m35088G5(str, MessageType.get(MessageType.local_dynamic_greeting_agree_match));
            this.f30294j = true;
        }
        if (!jyb.m147479J(listM47039O0) && TextUtils.equals(listM47039O0.get(0).owner, m47072g0().otherUser) && !TextUtils.equals(m47072g0().readUntil, listM47039O0.get(0).f56859id)) {
            m47037L1();
        }
        if (!jyb.m147479J(listM47039O0) && listM47039O0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((GreetActViewModel) this.viewModel).m46838T0();
        }
        ((GreetActViewModel) this.viewModel).m46848Y0(Lists.m15984q(listM47039O0));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m47056g1(Conversation conversation) {
        if (wi5.m206550d().m206552e()) {
            m47031D1();
        } else {
            m47030C1();
        }
        CoreModule.f18264c.f20420r0.m35095J6();
        act().startActivity(MessagesAct.m50126k2(act(), conversation.f56859id, false, false));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ List m47057h1(String str, Integer num) {
        return CoreModule.f18272k.f115535c.m189453O(str, m47072g0().clearedUntil).m208674j();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.greet.AbstractC8522c
    /* JADX INFO: renamed from: i0 */
    public void mo47058i0() {
        super.mo47058i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m47059m1(pf60 pf60Var) {
        List<BubbleInfo> list = ((CoreData) ((Envelope) pf60Var.f152156a).data.getModuleData(CoreData.class)).states;
        if (jyb.m147479J(list) || !NullChecker.m82486a(list.get(0))) {
            r1j0.m179420g("状态已结束");
        } else {
            ((GreetActViewModel) this.viewModel).m46886u1(m47072g0().otherUser, list.get(0));
        }
        V v2 = this.viewModel;
        ((GreetActViewModel) v2).m46888v1(this, (User) pf60Var.f152157b, ((GreetActViewModel) v2).f30206x.m46766d2().recommendReason);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m47060n1(uxj0 uxj0Var) {
        CoreModule.f18264c.f20420r0.m35087F6(m47072g0().f21143id, true, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m47061o1() {
        ((GreetActViewModel) this.viewModel).m46856d1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m47062p1(CoreSendGiftBody coreSendGiftBody, uxj0 uxj0Var) {
        vvj.m203017e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, true);
        if (TextUtils.equals(getFrom(), "from_meet_liked")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"), jyb.m147494Y("chat_gift_id", coreSendGiftBody.giftID));
        } else if (TextUtils.equals(getFrom(), "from_meet_picks")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"), jyb.m147494Y("chat_gift_id", coreSendGiftBody.giftID));
        }
        if (NullChecker.m82486a(act()) && NullChecker.m82486a(this.viewModel)) {
            CoreModule.f18264c.f20420r0.m35085E6(m47072g0().f21143id);
            l51.m152888H(act(), new Runnable() { // from class: l.hak
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108505a.m47061o1();
                }
            }, 100L);
        }
        m47031D1();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m47063q1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
        if (CoreModule.m30932N().mo61573so()) {
            CoreModule.m30932N().mo61462Gm().add(greeting.f21143id);
        }
        m47034H1();
        m47031D1();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m47064r1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
        if (CoreModule.m30932N().mo61573so()) {
            CoreModule.m30932N().mo61462Gm().add(greeting.f21143id);
        }
        m47034H1();
        m47031D1();
        CoreModule.f18264c.f20420r0.m35095J6();
        CoreModule.f18264c.f20392h2.m164089T3();
        if (TextUtils.equals(getFrom(), "from_surprise_box")) {
            CoreModule.m30933P().m143412i().mo34408Sh();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m47065s1(Greeting greeting) {
        if (m47048Y0()) {
            CoreModule.f18264c.f20420r0.f20776o0.m137019l(greeting);
        } else {
            CoreModule.f18264c.f20420r0.f20775n0.m137019l(greeting);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m47066t1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m47067u1(int i, int i2, Intent intent) {
        if (i != 16) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        act().m68056e2();
        act().overridePendingTransition(0, 0);
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public void m47068v1(Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraMo180349K2 = CoreModule.m30933P().m143412i().mo180349K2(message);
        if (!NullChecker.m82486a(chatGiftInfoExtraMo180349K2) || TextUtils.isEmpty(chatGiftInfoExtraMo180349K2.giftRecordId)) {
            return;
        }
        CoreModule.f18264c.f20385f1.m155910j4(chatGiftInfoExtraMo180349K2.giftRecordId).subscribe(psd0.m173597H(new y20() { // from class: l.fak
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97987a.m47060n1((uxj0) obj);
            }
        }, new y20() { // from class: l.gak
            @Override // p153l.y20
            public final void call(Object obj) {
                g39.m128717c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    public void m47069x1() {
        if ((!TextUtils.isEmpty(m47072g0().moment.f39607id) || CoreModule.m30932N().mo61451Co()) && !((GreetActViewModel) this.viewModel).f30206x.m46770i2()) {
            act().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(act(), CoreModule.m30929H().userId(), "from_greet_act", -1, "", 2));
        } else {
            act().startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act(), CoreModule.m30929H().userId(), "messages_thumbnail_right", false), 16);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m47070z1(String str, String str2) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str2);
        if (NullChecker.m82486a(userM116503Pa)) {
            if (jyb.m147479J(userM116503Pa.pictures)) {
                return;
            }
            if (userM116503Pa.pictures.size() == 1 && TextUtils.isEmpty(userM116503Pa.picture(0).url) && (userM116503Pa.picture(0).size.width == 0 || userM116503Pa.picture(0).size.height == 0)) {
                return;
            }
        }
        act().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(act(), str2, str, -1, "", 2));
        act().overridePendingTransition(y7c0.f197767e, 0);
    }
}
