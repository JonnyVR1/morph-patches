package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4744j;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.GiftSubBizType;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.data.SendGiftExtra;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.C21368yd;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ftj;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.osi0;
import p149l.q860;
import p149l.r07;
import p149l.roj0;
import p149l.szb0;
import p149l.vwb;
import p149l.w9j;
import p149l.wh5;
import p149l.x19;
import p149l.x9j;
import p149l.yaf0;
import p149l.yz9;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.a */
/* JADX INFO: loaded from: classes10.dex */
public class C8357a extends AbstractC8359c<GreetActViewModel> {

    /* JADX INFO: renamed from: g */
    public String f29443g;

    /* JADX INFO: renamed from: h */
    public boolean f29444h;

    /* JADX INFO: renamed from: i */
    public double f29445i;

    /* JADX INFO: renamed from: j */
    public boolean f29446j;

    public C8357a(mcr mcrVar, GreetingParam greetingParam) {
        super(mcrVar, greetingParam);
        this.f29444h = true;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m45818D0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m45826N0(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f17545c.f19642f0.m32902ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (x19.m206695e(tantanForbidden)) {
                lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.m206694d(tantanForbidden)) {
                lsi0.m151595y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m45827W0() {
        if (m45883t1()) {
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.b8k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74134a.m45869d1((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m45828i1(Bundle bundle) {
        ((GreetActViewModel) this.viewModel).m45699r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m45829j1() {
        ((GreetActViewModel) this.viewModel).m45662X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m45831k1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (!this.f29444h) {
                ((GreetActViewModel) this.viewModel).m45678g0();
            }
            this.f29444h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m45833l1(User user) {
        ((GreetActViewModel) this.viewModel).m45667Z0(user);
        ((GreetActViewModel) this.viewModel).m45698q1(user, CoreGiftPanelName.get("greet"));
        ((GreetActViewModel) this.viewModel).m45702t1(user, m45889g0().moment.f38759id);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m45838q0(CoreSendGiftBody coreSendGiftBody, Throwable th) {
        ftj.m123060e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, false);
        x19.m206693c(th);
    }

    /* JADX INFO: renamed from: B1 */
    public void m45846B1(String str, String str2) {
        act().startActivity(CoreModule.m29935P().m94658i().mo158203A5(act(), str2, str, false, false, false));
        act().overridePendingTransition(szb0.f167030e, 0);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m45847C1() {
        if (CoreModule.m29934N().mo60281Hj() && TextUtils.equals(getFrom(), "p_interested_user")) {
            CoreModule.f17545c.f19678r0.f20029j0.m132487l(m45889g0().f20401id);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final void m45848D1() {
        if (m45866a1()) {
            String str = m45889g0().f20401id;
            C4744j c4744j = CoreModule.f17545c.f19678r0;
            c4744j.f20030k0 = str;
            c4744j.f20028i0.m132487l(str);
        }
        m45847C1();
    }

    /* JADX INFO: renamed from: E1 */
    public void m45849E1(CoreGiftInfo coreGiftInfo) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = m45889g0().otherUser;
        coreSendGiftBodyNew_.giftID = coreGiftInfo.f56011id;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get("chat").toString();
        SendGiftExtra sendGiftExtraNew_ = SendGiftExtra.new_();
        sendGiftExtraNew_.momentId = m45889g0().moment.f38759id;
        sendGiftExtraNew_.greetingChannel = m45889g0().channel.toString();
        coreSendGiftBodyNew_.extra = sendGiftExtraNew_;
        coreSendGiftBodyNew_.subBizType = GiftSubBizType.get("greet");
        String str = coreGiftInfo.consumeType;
        if (!"privilege".equals(str)) {
            coreSendGiftBodyNew_.coinSign = coreGiftInfo.coinSign;
        }
        coreSendGiftBodyNew_.consumeType = str;
        m45864X0(m45889g0().otherUser);
        m45850F1(coreSendGiftBodyNew_);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m45850F1(final CoreSendGiftBody coreSendGiftBody) {
        CoreModule.f17545c.f19643f1.m118073k4(coreSendGiftBody).subscribe(mkd0.m154956H(new e30() { // from class: l.i7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111924a.m45879p1(coreSendGiftBody, (roj0) obj);
            }
        }, new e30() { // from class: l.j7k
            @Override // p149l.e30
            public final void call(Object obj) {
                C8357a.m45838q0(coreSendGiftBody, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public void m45851H1() {
        if (TextUtils.isEmpty(CoreModule.f17545c.f19658k1.m184474t3(m45889g0().f20401id))) {
            return;
        }
        boolean z = ((GreetAct) act()).m45583c2().isStartHomeCard;
        if (TextUtils.equals(getFrom(), "home_card") || TextUtils.equals(getFrom(), "home_moment_theme_card")) {
            z = true;
        }
        yz9.m216632z(act(), m45861S0(), z, m45889g0().f20401id, LikeFrom.get("greet"), null, null, null, false, false);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m45852I1(final Greeting greeting, final Message message, String str) {
        act().duringCreated(CoreModule.f17545c.f19678r0.m34149u6(greeting.f20401id, greeting.channel, message, str, null).take(1).doOnNext(new e30() { // from class: l.r7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158043a.m45880q1(message, greeting, (Message) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.s7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162918a.m45881r1(message, greeting, (Message) obj);
            }
        }, new e30() { // from class: l.t7k
            @Override // p149l.e30
            public final void call(Object obj) {
                C8357a.m45826N0(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    public void m45853J1(Message message) {
        String str;
        ((GreetActViewModel) this.viewModel).f29358x.f29316f = false;
        CoreModule.f17554l.m94658i().mo158388h4(((GreetActViewModel) this.viewModel).f29358x, "", "p_kankan_chat_popup", getFrom(), m45889g0().otherUser);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            } else if (userM169527p9.isNameFake()) {
                CoreModule.m29935P().m94658i().mo158199A(act());
                return;
            }
        }
        if (TextUtils.isEmpty(m45889g0().moment.f38759id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.f29443g)) {
                if (TextUtils.equals(m45889g0().actorUserId, CoreModule.m29931H().userId())) {
                    this.f29443g = m45889g0().otherUser;
                } else {
                    this.f29443g = CoreModule.m29931H().userId();
                }
            }
            str = "?source=moment&moment_id=" + m45889g0().moment.f38759id + "&moment_owner_id=" + this.f29443g;
        }
        m45852I1(m45889g0(), message, str);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m45854L1() {
        duringCreated(CoreModule.f17545c.f19678r0.m34074A6(m45889g0().f20401id, m45889g0().readUntil)).subscribe(mkd0.m154956H(new e30() { // from class: l.h7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106305a.m45882s1((Greeting) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m45855N1() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.m81303a(m45889g0()) && TEnum.equals(m45889g0().channel, "anonymous");
    }

    /* JADX INFO: renamed from: O0 */
    public final List<Message> m45856O0(List<Message> list) {
        return (vwb.m200296J(list) || !vwb.m200337m(list, new w9j() { // from class: l.k7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.m81303a(message) && !message.f56011id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m45857O1() {
        CoreModule.f17545c.f19678r0.m34100N6(NotificationStatus.get("pending"), NotificationStatus.get("removed"), m45889g0().f20401id);
        CoreModule.f17545c.f19678r0.m34100N6(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), m45889g0().f20401id);
        Iterator<Integer> it = CoreModule.m29935P().m94658i().mo158448t3().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (r07.m177357v(iIntValue) && TextUtils.equals(String.valueOf(iIntValue + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL), m45889g0().f20401id)) {
                CoreModule.m29935P().m94658i().mo158357c3(iIntValue);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m45858P0() {
        if (NullChecker.m81303a(m45889g0())) {
            try {
                return Long.valueOf(m45889g0().clearedUntil).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q0 */
    public double m45859Q0() {
        return this.f29445i;
    }

    /* JADX INFO: renamed from: R0 */
    public String m45860R0() {
        return NullChecker.m81303a(m45889g0()) ? m45889g0().f20401id : "";
    }

    /* JADX INFO: renamed from: S0 */
    public User m45861S0() {
        return CoreModule.f17545c.f19639e0.m169430Pa(m45889g0().otherUser);
    }

    /* JADX INFO: renamed from: U0 */
    public final String m45862U0(List<Message> list, final User user) {
        Message message;
        if (user == null || (message = (Message) vwb.m200346r(list, new w9j() { // from class: l.n7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf(TextUtils.equals(message2.owner, user.f56011id) && TEnum.equals(message2.messageType, MessageType.moment_reference) && !TextUtils.isEmpty(message2.moment));
            }
        })) == null) {
            return null;
        }
        return message.moment;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m45863V0() {
        duringCreated(CoreModule.f17545c.f19678r0.f20035p0).subscribe(mkd0.m154955G(new e30() { // from class: l.a8k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68050a.m45868c1((Greeting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m45864X0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (m45890h0().hasCreatedGreeting) {
            CoreModule.f17545c.f19678r0.m34082E6(str);
        }
        C22306c<q860<Message>> c22306cFlatMap = C22306c.just(0).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.c7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f79621a.m45874h1(str, (Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.d7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84747a.m45870e1(str, (List) obj);
            }
        });
        if (CoreModule.f17545c.f19642f0.m33145uh(str)) {
            c22306cFlatMap = CoreModule.f17545c.f19642f0.m32829Un(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        duringCreated(c22306cFlatMap.observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.e7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89721a.m45872f1(str, (q860) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32737Ne(str).filter(new w9j() { // from class: l.f7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((CoreModule.f17545c.f19642f0.m33145uh(conversation.f56011id) || TextUtils.equals(conversation.convType, ConversationType.fakeReceiveLikeGuideSVip) || TextUtils.equals(conversation.convType, ConversationType.local_instant_chat_guide)) ? false : true);
            }
        })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.g7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101391a.m45873g1((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m45865Y0() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.m81303a(m45889g0()) && TEnum.equals(m45889g0().channel, "anonymous");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.greet.AbstractC8359c, p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.greet.AbstractC8359c, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.b7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73997a.m45828i1((Bundle) obj);
            }
        }, new d30() { // from class: l.m7k
            @Override // p149l.d30
            public final void call() {
                this.f131832a.m45829j1();
            }
        });
        m45827W0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.u7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175021a.m45831k1((C4319c) obj);
            }
        }));
        m45864X0(m45889g0().f20401id);
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(m45889g0().otherUser)).filter(new C21368yd()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.v7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180394a.m45833l1((User) obj);
            }
        }, new e30() { // from class: l.w7k
            @Override // p149l.e30
            public final void call(Object obj) {
                C8357a.m45818D0((Throwable) obj);
            }
        }));
        if (!TextUtils.isEmpty(((GreetActViewModel) this.viewModel).f29358x.m45583c2().stateId)) {
            duringCreated(mkd0.m154984r(CoreModule.m29934N().mo60367l8(((GreetActViewModel) this.viewModel).f29358x.m45583c2().stateId, m45889g0().otherUser), CoreModule.f17545c.f19639e0.m169410Ka(m45889g0().otherUser), new x9j() { // from class: l.x7k
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return vwb.m200311Y((Envelope) obj, (User) obj2);
                }
            })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.y7k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196712a.m45876m1((j760) obj);
                }
            }, new e30() { // from class: l.z7k
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g("状态已结束");
                }
            }));
        }
        m45857O1();
        m45863V0();
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m45866a1() {
        return "card".equals(getFrom()) || TextUtils.equals("from_city_centre_card", getFrom()) || TextUtils.equals("home_card", getFrom()) || TextUtils.equals("home_moment_theme_card", getFrom()) || TextUtils.equals("p_poi_nearby_card", getFrom());
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m45867b1(List<Message> list) {
        return (this.f29446j || !NullChecker.m81303a(m45889g0()) || TextUtils.equals(m45889g0().actorUserId, CoreModule.m29931H().userId()) || vwb.m200296J(list) || ((Message) vwb.m200346r(list, new w9j() { // from class: l.l7k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).messageType, MessageType.local_dynamic_greeting_agree_match));
            }
        })) != null) ? false : true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m45868c1(Greeting greeting) {
        if (TextUtils.equals(greeting.f20401id, m45889g0().f20401id)) {
            this.f29448a.m132487l(greeting);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m45869d1(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            ((GreetActViewModel) this.viewModel).m45666Z();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ C22306c m45870e1(String str, List list) {
        long jLongValue;
        this.f29445i = vwb.m200296J(list) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Message) list.get(0)).createdTime;
        try {
            jLongValue = Long.valueOf(m45889g0().clearedUntil).longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.f17545c.f19678r0.m34073A5(str, this.f29445i, jLongValue, m45865Y0(), m45890h0().hasCreatedGreeting);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.greet.AbstractC8359c
    /* JADX INFO: renamed from: f0 */
    public String mo45871f0() {
        Act act = act();
        Objects.requireNonNull(act);
        if (!TextUtils.isEmpty(((GreetAct) act).m45583c2().stateId)) {
            return "state";
        }
        if (TextUtils.equals(getFrom(), "from_h5_suggest_user")) {
            return Channel.specialguest;
        }
        return m45865Y0() ? "anonymous" : "moment";
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m45872f1(String str, q860 q860Var) {
        List<Message> listM45856O0 = m45856O0(q860Var.f153135a);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        ((GreetActViewModel) this.viewModel).f29319A.setMomentId(m45862U0(listM45856O0, userM169527p9));
        if (CoreModule.m29935P().m94658i().mo33383O8() && NullChecker.m81303a(userM169527p9) && userM169527p9.isFemale() && m45867b1(listM45856O0)) {
            CoreModule.f17545c.f19678r0.m34085G5(str, MessageType.get(MessageType.local_dynamic_greeting_agree_match));
            this.f29446j = true;
        }
        if (!vwb.m200296J(listM45856O0) && TextUtils.equals(listM45856O0.get(0).owner, m45889g0().otherUser) && !TextUtils.equals(m45889g0().readUntil, listM45856O0.get(0).f56011id)) {
            m45854L1();
        }
        if (!vwb.m200296J(listM45856O0) && listM45856O0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((GreetActViewModel) this.viewModel).m45655T0();
        }
        ((GreetActViewModel) this.viewModel).m45665Y0(Lists.m15930q(listM45856O0));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m45873g1(Conversation conversation) {
        if (wh5.m203106d().m203108e()) {
            m45848D1();
        } else {
            m45847C1();
        }
        CoreModule.f17545c.f19678r0.m34092J6();
        act().startActivity(MessagesAct.m48943i2(act(), conversation.f56011id, false, false));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ List m45874h1(String str, Integer num) {
        return CoreModule.f17553k.f91940c.m206057O(str, m45889g0().clearedUntil).m165617j();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.greet.AbstractC8359c
    /* JADX INFO: renamed from: i0 */
    public void mo45875i0() {
        super.mo45875i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m45876m1(j760 j760Var) {
        List<BubbleInfo> list = ((CoreData) ((Envelope) j760Var.f116564a).data.getModuleData(CoreData.class)).states;
        if (vwb.m200296J(list) || !NullChecker.m81303a(list.get(0))) {
            osi0.m165783g("状态已结束");
        } else {
            ((GreetActViewModel) this.viewModel).m45703u1(m45889g0().otherUser, list.get(0));
        }
        V v2 = this.viewModel;
        ((GreetActViewModel) v2).m45705v1(this, (User) j760Var.f116565b, ((GreetActViewModel) v2).f29358x.m45583c2().recommendReason);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m45877n1(roj0 roj0Var) {
        CoreModule.f17545c.f19678r0.m34084F6(m45889g0().f20401id, true, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m45878o1() {
        ((GreetActViewModel) this.viewModel).m45673d1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m45879p1(CoreSendGiftBody coreSendGiftBody, roj0 roj0Var) {
        ftj.m123060e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, true);
        if (TextUtils.equals(getFrom(), "from_meet_liked")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.m200311Y("chat_gift_id", coreSendGiftBody.giftID));
        } else if (TextUtils.equals(getFrom(), "from_meet_picks")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.m200311Y("chat_gift_id", coreSendGiftBody.giftID));
        }
        if (NullChecker.m81303a(act()) && NullChecker.m81303a(this.viewModel)) {
            CoreModule.f17545c.f19678r0.m34082E6(m45889g0().f20401id);
            e51.m114743H(act(), new Runnable() { // from class: l.q7k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153054a.m45878o1();
                }
            }, 100L);
        }
        m45848D1();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m45880q1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
        if (CoreModule.m29934N().mo60389so()) {
            CoreModule.m29934N().mo60278Gm().add(greeting.f20401id);
        }
        m45851H1();
        m45848D1();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m45881r1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
        if (CoreModule.m29934N().mo60389so()) {
            CoreModule.m29934N().mo60278Gm().add(greeting.f20401id);
        }
        m45851H1();
        m45848D1();
        CoreModule.f17545c.f19678r0.m34092J6();
        CoreModule.f17545c.f19650h2.m142353T3();
        if (TextUtils.equals(getFrom(), "from_surprise_box")) {
            CoreModule.m29935P().m94658i().mo33405Sh();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m45882s1(Greeting greeting) {
        if (m45865Y0()) {
            CoreModule.f17545c.f19678r0.f20034o0.m132487l(greeting);
        } else {
            CoreModule.f17545c.f19678r0.f20033n0.m132487l(greeting);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m45883t1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m45884u1(int i, int i2, Intent intent) {
        if (i != 16) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        act().m66873d2();
        act().overridePendingTransition(0, 0);
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public void m45885v1(Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraMo158257K2 = CoreModule.m29935P().m94658i().mo158257K2(message);
        if (!NullChecker.m81303a(chatGiftInfoExtraMo158257K2) || TextUtils.isEmpty(chatGiftInfoExtraMo158257K2.giftRecordId)) {
            return;
        }
        CoreModule.f17545c.f19643f1.m118072j4(chatGiftInfoExtraMo158257K2.giftRecordId).subscribe(mkd0.m154956H(new e30() { // from class: l.o7k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142511a.m45877n1((roj0) obj);
            }
        }, new e30() { // from class: l.p7k
            @Override // p149l.e30
            public final void call(Object obj) {
                x19.m206693c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    public void m45886x1() {
        if ((!TextUtils.isEmpty(m45889g0().moment.f38759id) || CoreModule.m29934N().mo60267Co()) && !((GreetActViewModel) this.viewModel).f29358x.m45587h2()) {
            act().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(act(), CoreModule.m29931H().userId(), "from_greet_act", -1, "", 2));
        } else {
            act().startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act(), CoreModule.m29931H().userId(), "messages_thumbnail_right", false), 16);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m45887z1(String str, String str2) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str2);
        if (NullChecker.m81303a(userM169430Pa)) {
            if (vwb.m200296J(userM169430Pa.pictures)) {
                return;
            }
            if (userM169430Pa.pictures.size() == 1 && TextUtils.isEmpty(userM169430Pa.picture(0).url) && (userM169430Pa.picture(0).size.width == 0 || userM169430Pa.picture(0).size.height == 0)) {
                return;
            }
        }
        act().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(act(), str2, str, -1, "", 2));
        act().overridePendingTransition(szb0.f167030e, 0);
    }
}
