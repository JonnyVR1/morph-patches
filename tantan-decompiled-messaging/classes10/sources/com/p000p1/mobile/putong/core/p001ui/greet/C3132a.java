package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.ConversationType;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageChannel;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.NotificationStatus;
import com.p000p1.mobile.putong.core.data.SendGiftExtra;
import com.p000p1.mobile.putong.core.p001ui.greet.C3132a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.j;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.q860;
import l.r07;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;
import l.yaf0;
import l.yd;
import l.yz9;
import l.zvf0;
import p003l.ftj;
import p003l.szb0;
import p003l.wh5;
import p003l.x19;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3132a extends AbstractC3134c<GreetActViewModel> {

    /* JADX INFO: renamed from: g */
    public String f1837g;

    /* JADX INFO: renamed from: h */
    public boolean f1838h;

    /* JADX INFO: renamed from: i */
    public double f1839i;

    /* JADX INFO: renamed from: j */
    public boolean f1840j;

    public C3132a(mcr mcrVar, GreetingParam greetingParam) {
        super(mcrVar, greetingParam);
        this.f1838h = true;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m3162D0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m3170N0(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.c.f0.ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (x19.m10619e(tantanForbidden)) {
                lsi0.y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.m10618d(tantanForbidden)) {
                lsi0.y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m3171W0() {
        if (m3229t1()) {
            lifecycle().subscribe(mkd0.G(new e30() { // from class: l.b8k
                public final void call(Object obj) {
                    this.f3339a.m3215d1((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public /* synthetic */ void m3172i1(Bundle bundle) {
        ((GreetActViewModel) ((jq2) this).viewModel).m3037r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m3173j1() {
        ((GreetActViewModel) ((jq2) this).viewModel).m2999X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m3175k1(c cVar) {
        if (cVar == c.i) {
            if (!this.f1838h) {
                ((GreetActViewModel) ((jq2) this).viewModel).m3015g0();
            }
            this.f1838h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m3177l1(User user) {
        ((GreetActViewModel) ((jq2) this).viewModel).m3004Z0(user);
        ((GreetActViewModel) ((jq2) this).viewModel).m3036q1(user, CoreGiftPanelName.get(GiftSubBizType.greet));
        ((GreetActViewModel) ((jq2) this).viewModel).m3040t1(user, m3235g0().moment.id);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m3182q0(CoreSendGiftBody coreSendGiftBody, Throwable th) {
        ftj.m6511e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, false);
        x19.m10617c(th);
    }

    /* JADX INFO: renamed from: B1 */
    public void m3190B1(String str, String str2) {
        act().startActivity(CoreModule.P().i().A5(act(), str2, str, false, false, false));
        act().overridePendingTransition(szb0.f7494e, 0);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m3191C1() {
        if (CoreModule.N().Hj() && TextUtils.equals(getFrom(), "p_interested_user")) {
            CoreModule.c.r0.j0.onNext(m3235g0().f63id);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final void m3192D1() {
        if (m3212a1()) {
            String str = m3235g0().f63id;
            j jVar = CoreModule.c.r0;
            jVar.k0 = str;
            jVar.i0.onNext(str);
        }
        m3191C1();
    }

    /* JADX INFO: renamed from: E1 */
    public void m3193E1(CoreGiftInfo coreGiftInfo) {
        CoreSendGiftBody coreSendGiftBodyNew_ = CoreSendGiftBody.new_();
        coreSendGiftBodyNew_.recvUserID = m3235g0().otherUser;
        coreSendGiftBodyNew_.giftID = ((DbObject) coreGiftInfo).id;
        coreSendGiftBodyNew_.giftAmount = 1;
        coreSendGiftBodyNew_.bizType = CoreGiftPanelName.get(com.p000p1.mobile.putong.core.data.CoreGiftPanelName.chat).toString();
        SendGiftExtra sendGiftExtraNew_ = SendGiftExtra.new_();
        sendGiftExtraNew_.momentId = m3235g0().moment.id;
        sendGiftExtraNew_.greetingChannel = m3235g0().channel.toString();
        coreSendGiftBodyNew_.extra = sendGiftExtraNew_;
        coreSendGiftBodyNew_.subBizType = GiftSubBizType.get(GiftSubBizType.greet);
        String str = coreGiftInfo.consumeType;
        if (!ConsumeType.privilege.equals(str)) {
            coreSendGiftBodyNew_.coinSign = coreGiftInfo.coinSign;
        }
        coreSendGiftBodyNew_.consumeType = str;
        m3208X0(m3235g0().otherUser);
        m3194F1(coreSendGiftBodyNew_);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m3194F1(final CoreSendGiftBody coreSendGiftBody) {
        CoreModule.c.f1.k4(coreSendGiftBody).subscribe(mkd0.H(new e30() { // from class: l.i7k
            public final void call(Object obj) {
                this.f5006a.m3225p1(coreSendGiftBody, (roj0) obj);
            }
        }, new e30() { // from class: l.j7k
            public final void call(Object obj) {
                C3132a.m3182q0(coreSendGiftBody, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H1 */
    public void m3195H1() {
        if (TextUtils.isEmpty(CoreModule.c.k1.t3(m3235g0().f63id))) {
            return;
        }
        boolean z = act().m2919c2().isStartHomeCard;
        if (TextUtils.equals(getFrom(), "home_card") || TextUtils.equals(getFrom(), "home_moment_theme_card")) {
            z = true;
        }
        yz9.z(act(), m3205S0(), z, m3235g0().f63id, LikeFrom.get(GiftSubBizType.greet), (e30) null, (e30) null, (String) null, new boolean[]{false, false});
    }

    /* JADX INFO: renamed from: I1 */
    public final void m3196I1(final Greeting greeting, final Message message, String str) {
        act().duringCreated(CoreModule.c.r0.u6(greeting.f63id, greeting.channel, message, str, (d30) null).take(1).doOnNext(new e30() { // from class: l.r7k
            public final void call(Object obj) {
                this.f7138a.m3226q1(message, greeting, (Message) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.s7k
            public final void call(Object obj) {
                this.f7292a.m3227r1(message, greeting, (Message) obj);
            }
        }, new e30() { // from class: l.t7k
            public final void call(Object obj) {
                C3132a.m3170N0(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    public void m3197J1(Message message) {
        String str;
        ((GreetActViewModel) ((jq2) this).viewModel).f1752x.f1710f = false;
        CoreModule.l.i().h4(((GreetActViewModel) ((jq2) this).viewModel).f1752x, "", "p_kankan_chat_popup", getFrom(), m3235g0().otherUser);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            } else if (userP9.isNameFake()) {
                CoreModule.P().i().A(act());
                return;
            }
        }
        if (TextUtils.isEmpty(m3235g0().moment.id)) {
            str = "";
        } else {
            if (TextUtils.isEmpty(this.f1837g)) {
                if (TextUtils.equals(m3235g0().actorUserId, CoreModule.H().userId())) {
                    this.f1837g = m3235g0().otherUser;
                } else {
                    this.f1837g = CoreModule.H().userId();
                }
            }
            str = "?source=moment&moment_id=" + m3235g0().moment.id + "&moment_owner_id=" + this.f1837g;
        }
        m3196I1(m3235g0(), message, str);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m3198L1() {
        duringCreated(CoreModule.c.r0.A6(m3235g0().f63id, m3235g0().readUntil)).subscribe(mkd0.H(new e30() { // from class: l.h7k
            public final void call(Object obj) {
                this.f4803a.m3228s1((Greeting) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m3199N1() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.a(m3235g0()) && TEnum.equals(m3235g0().channel, "anonymous");
    }

    /* JADX INFO: renamed from: O0 */
    public final List<Message> m3200O0(List<Message> list) {
        return (vwb.J(list) || !vwb.m(list, new w9j() { // from class: l.k7k
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf(NullChecker.a(message) && !((DbObject) message).id.startsWith("fake_id_"));
            }
        })) ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m3201O1() {
        CoreModule.c.r0.N6(NotificationStatus.get("pending"), NotificationStatus.get(NotificationStatus.removed), m3235g0().f63id);
        CoreModule.c.r0.N6(NotificationStatus.get(NotificationStatus.ongoing), NotificationStatus.get(NotificationStatus.removed), m3235g0().f63id);
        Iterator it = CoreModule.P().i().t3().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (r07.v(iIntValue) && TextUtils.equals(String.valueOf(iIntValue - 10000), m3235g0().f63id)) {
                CoreModule.P().i().c3(iIntValue);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public long m3202P0() {
        if (NullChecker.a(m3235g0())) {
            try {
                return Long.valueOf(m3235g0().clearedUntil).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q0 */
    public double m3203Q0() {
        return this.f1839i;
    }

    /* JADX INFO: renamed from: R0 */
    public String m3204R0() {
        return NullChecker.a(m3235g0()) ? m3235g0().f63id : "";
    }

    /* JADX INFO: renamed from: S0 */
    public User m3205S0() {
        return CoreModule.c.e0.Pa(m3235g0().otherUser);
    }

    /* JADX INFO: renamed from: U0 */
    public final String m3206U0(List<Message> list, final User user) {
        Message message;
        if (user == null || (message = (Message) vwb.r(list, new w9j() { // from class: l.n7k
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf(TextUtils.equals(message2.owner, ((DbObject) user).id) && TEnum.equals(message2.messageType, MessageType.moment_reference) && !TextUtils.isEmpty(message2.moment));
            }
        })) == null) {
            return null;
        }
        return message.moment;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m3207V0() {
        duringCreated(CoreModule.c.r0.p0).subscribe(mkd0.G(new e30() { // from class: l.a8k
            public final void call(Object obj) {
                this.f2741a.m3214c1((Greeting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m3208X0(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (m3236h0().hasCreatedGreeting) {
            CoreModule.c.r0.E6(str);
        }
        rx.c cVarFlatMap = rx.c.just(0).observeOn(Schedulers.io()).map(new w9j() { // from class: l.c7k
            public final Object call(Object obj) {
                return this.f3983a.m3220h1(str, (Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.d7k
            public final Object call(Object obj) {
                return this.f4130a.m3216e1(str, (List) obj);
            }
        });
        if (CoreModule.c.f0.uh(str)) {
            cVarFlatMap = CoreModule.c.f0.Un(str, 0.0d);
        }
        duringCreated(cVarFlatMap.observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.e7k
            public final void call(Object obj) {
                this.f4263a.m3218f1(str, (q860) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Ne(str).filter(new w9j() { // from class: l.f7k
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((CoreModule.c.f0.uh(((DbObject) conversation).id) || TextUtils.equals(conversation.convType, ConversationType.fakeReceiveLikeGuideSVip) || TextUtils.equals(conversation.convType, ConversationType.local_instant_chat_guide)) ? false : true);
            }
        })).take(1).subscribe(mkd0.G(new e30() { // from class: l.g7k
            public final void call(Object obj) {
                this.f4587a.m3219g1((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m3209Y0() {
        if (TextUtils.equals("from_anonymous_profile", getFrom())) {
            return true;
        }
        return NullChecker.a(m3235g0()) && TEnum.equals(m3235g0().channel, "anonymous");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.greet.AbstractC3134c
    /* JADX INFO: renamed from: Z */
    public void mo3210Z() {
        super.mo3210Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.greet.AbstractC3134c
    /* JADX INFO: renamed from: a0 */
    public void mo3211a0() {
        super.mo3211a0();
        creates(new e30() { // from class: l.b7k
            public final void call(Object obj) {
                this.f3337a.m3172i1((Bundle) obj);
            }
        }, new d30() { // from class: l.m7k
            public final void call() {
                this.f6281a.m3173j1();
            }
        });
        m3171W0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.u7k
            public final void call(Object obj) {
                this.f7698a.m3175k1((c) obj);
            }
        }));
        m3208X0(m3235g0().f63id);
        duringCreated(CoreModule.c.e0.Ka(m3235g0().otherUser)).filter(new yd()).take(1).subscribe(mkd0.H(new e30() { // from class: l.v7k
            public final void call(Object obj) {
                this.f7932a.m3177l1((User) obj);
            }
        }, new e30() { // from class: l.w7k
            public final void call(Object obj) {
                C3132a.m3162D0((Throwable) obj);
            }
        }));
        if (!TextUtils.isEmpty(((GreetActViewModel) ((jq2) this).viewModel).f1752x.m2919c2().stateId)) {
            duringCreated(mkd0.r(CoreModule.N().l8(((GreetActViewModel) ((jq2) this).viewModel).f1752x.m2919c2().stateId, m3235g0().otherUser), CoreModule.c.e0.Ka(m3235g0().otherUser), new x9j() { // from class: l.x7k
                public final Object call(Object obj, Object obj2) {
                    return vwb.Y((Envelope) obj, (User) obj2);
                }
            })).take(1).subscribe(mkd0.H(new e30() { // from class: l.y7k
                public final void call(Object obj) {
                    this.f9002a.m3222m1((j760) obj);
                }
            }, new e30() { // from class: l.z7k
                public final void call(Object obj) {
                    osi0.g("状态已结束");
                }
            }));
        }
        m3201O1();
        m3207V0();
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m3212a1() {
        return "card".equals(getFrom()) || TextUtils.equals("from_city_centre_card", getFrom()) || TextUtils.equals("home_card", getFrom()) || TextUtils.equals("home_moment_theme_card", getFrom()) || TextUtils.equals("p_poi_nearby_card", getFrom());
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m3213b1(List<Message> list) {
        return (this.f1840j || !NullChecker.a(m3235g0()) || TextUtils.equals(m3235g0().actorUserId, CoreModule.H().userId()) || vwb.J(list) || ((Message) vwb.r(list, new w9j() { // from class: l.l7k
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Message) obj).messageType, MessageType.local_dynamic_greeting_agree_match));
            }
        })) != null) ? false : true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m3214c1(Greeting greeting) {
        if (TextUtils.equals(greeting.f63id, m3235g0().f63id)) {
            this.f1842a.onNext(greeting);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m3215d1(c cVar) {
        if (cVar == c.m) {
            ((GreetActViewModel) ((jq2) this).viewModel).m3003Z();
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ rx.c m3216e1(String str, List list) {
        long jLongValue;
        this.f1839i = vwb.J(list) ? 0.0d : ((Message) list.get(0)).createdTime;
        try {
            jLongValue = Long.valueOf(m3235g0().clearedUntil).longValue();
        } catch (NumberFormatException unused) {
            jLongValue = 0;
        }
        return CoreModule.c.r0.A5(str, this.f1839i, jLongValue, m3209Y0(), m3236h0().hasCreatedGreeting);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.greet.AbstractC3134c
    /* JADX INFO: renamed from: f0 */
    public String mo3217f0() {
        GreetAct greetActAct = act();
        Objects.requireNonNull(greetActAct);
        if (!TextUtils.isEmpty(greetActAct.m2919c2().stateId)) {
            return MessageChannel.state;
        }
        if (TextUtils.equals(getFrom(), "from_h5_suggest_user")) {
            return "specialguest";
        }
        return m3209Y0() ? "anonymous" : "moment";
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m3218f1(String str, q860 q860Var) {
        List<Message> listM3200O0 = m3200O0(q860Var.a);
        User userP9 = CoreModule.c.e0.p9();
        ((GreetActViewModel) ((jq2) this).viewModel).f1713A.setMomentId(m3206U0(listM3200O0, userP9));
        if (CoreModule.P().i().O8() && NullChecker.a(userP9) && userP9.isFemale() && m3213b1(listM3200O0)) {
            CoreModule.c.r0.G5(str, MessageType.get(MessageType.local_dynamic_greeting_agree_match));
            this.f1840j = true;
        }
        if (!vwb.J(listM3200O0) && TextUtils.equals(listM3200O0.get(0).owner, m3235g0().otherUser) && !TextUtils.equals(m3235g0().readUntil, ((DbObject) listM3200O0.get(0)).id)) {
            m3198L1();
        }
        if (!vwb.J(listM3200O0) && listM3200O0.get(0).localCreatedTime - System.nanoTime() < 1000000000) {
            ((GreetActViewModel) ((jq2) this).viewModel).m2992T0();
        }
        ((GreetActViewModel) ((jq2) this).viewModel).m3002Y0(Lists.q(listM3200O0));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m3219g1(Conversation conversation) {
        if (wh5.m10500d().m10502e()) {
            m3192D1();
        } else {
            m3191C1();
        }
        CoreModule.c.r0.J6();
        act().startActivity(MessagesAct.i2(act(), ((DbObject) conversation).id, false, false));
        act().finish();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ List m3220h1(String str, Integer num) {
        return CoreModule.k.c.O(str, m3235g0().clearedUntil).j();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.greet.AbstractC3134c
    /* JADX INFO: renamed from: i0 */
    public void mo3221i0() {
        super.mo3221i0();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m3222m1(j760 j760Var) {
        List<BubbleInfo> list = ((CoreData) ((Envelope) j760Var.a).data.getModuleData(CoreData.class)).states;
        if (vwb.J(list) || !NullChecker.a(list.get(0))) {
            osi0.g("状态已结束");
        } else {
            ((GreetActViewModel) ((jq2) this).viewModel).m3041u1(m3235g0().otherUser, list.get(0));
        }
        s7m s7mVar = ((jq2) this).viewModel;
        ((GreetActViewModel) s7mVar).m3043v1(this, (User) j760Var.b, ((GreetActViewModel) s7mVar).f1752x.m2919c2().recommendReason);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m3223n1(roj0 roj0Var) {
        CoreModule.c.r0.F6(m3235g0().f63id, true, false);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m3224o1() {
        ((GreetActViewModel) ((jq2) this).viewModel).m3010d1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m3225p1(CoreSendGiftBody coreSendGiftBody, roj0 roj0Var) {
        ftj.m6511e("p_kankan_chat_popup", coreSendGiftBody.recvUserID, true);
        if (TextUtils.equals(getFrom(), "from_meet_liked")) {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.Y("chat_gift_id", coreSendGiftBody.giftID)});
        } else if (TextUtils.equals(getFrom(), "from_meet_picks")) {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.Y("chat_gift_id", coreSendGiftBody.giftID)});
        }
        if (NullChecker.a(act()) && NullChecker.a(((jq2) this).viewModel)) {
            CoreModule.c.r0.E6(m3235g0().f63id);
            e51.H(act(), new Runnable() { // from class: l.q7k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6980a.m3224o1();
                }
            }, 100L);
        }
        m3192D1();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m3226q1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.c.H0.k5();
        } else if (ConsumeType.privilege.equals(message.consumeType)) {
            CoreModule.c.C0.u4();
        }
        if (CoreModule.N().so()) {
            CoreModule.N().Gm().add(greeting.f63id);
        }
        m3195H1();
        m3192D1();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m3227r1(Message message, Greeting greeting, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.c.H0.k5();
        } else if (ConsumeType.privilege.equals(message.consumeType)) {
            CoreModule.c.C0.u4();
        }
        if (CoreModule.N().so()) {
            CoreModule.N().Gm().add(greeting.f63id);
        }
        m3195H1();
        m3192D1();
        CoreModule.c.r0.J6();
        CoreModule.c.h2.T3();
        if (TextUtils.equals(getFrom(), "from_surprise_box")) {
            CoreModule.P().i().Sh();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m3228s1(Greeting greeting) {
        if (m3209Y0()) {
            CoreModule.c.r0.o0.onNext(greeting);
        } else {
            CoreModule.c.r0.n0.onNext(greeting);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m3229t1() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 28) {
            return false;
        }
        String str = Build.BRAND;
        return "HONOR".equalsIgnoreCase(str) || "HUAWEI".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m3230u1(int i, int i2, Intent intent) {
        if (i != 16) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        act().finish();
        act().overridePendingTransition(0, 0);
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public void m3231v1(Message message) {
        ChatGiftInfoExtra chatGiftInfoExtraK2 = CoreModule.P().i().K2(message);
        if (!NullChecker.a(chatGiftInfoExtraK2) || TextUtils.isEmpty(chatGiftInfoExtraK2.giftRecordId)) {
            return;
        }
        CoreModule.c.f1.j4(chatGiftInfoExtraK2.giftRecordId).subscribe(mkd0.H(new e30() { // from class: l.o7k
            public final void call(Object obj) {
                this.f6622a.m3223n1((roj0) obj);
            }
        }, new e30() { // from class: l.p7k
            public final void call(Object obj) {
                x19.m10617c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    public void m3232x1() {
        if ((!TextUtils.isEmpty(m3235g0().moment.id) || CoreModule.N().Co()) && !((GreetActViewModel) ((jq2) this).viewModel).f1752x.m2923h2()) {
            act().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(act(), CoreModule.H().userId(), "from_greet_act", -1, "", 2));
        } else {
            act().startActivityForResult(CoreModule.P().i().M1(act(), CoreModule.H().userId(), "messages_thumbnail_right", false), 16);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m3233z1(String str, String str2) {
        User userPa = CoreModule.c.e0.Pa(str2);
        if (NullChecker.a(userPa)) {
            if (vwb.J(userPa.pictures)) {
                return;
            }
            if (userPa.pictures.size() == 1 && TextUtils.isEmpty(((Media) userPa.picture(0)).url) && (userPa.picture(0).size.width == 0 || userPa.picture(0).size.height == 0)) {
                return;
            }
        }
        act().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(act(), str2, str, -1, "", 2));
        act().overridePendingTransition(szb0.f7494e, 0);
    }
}
