package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4894i;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p051p1.mobile.putong.core.data.CoreFeedStateEnvelop;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.dy6;
import p153l.fo0;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.tu2;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.i */
/* JADX INFO: loaded from: classes9.dex */
public class C4894i extends dy6 {

    /* JADX INFO: renamed from: R */
    public static jxd0 f20750R = new jxd0("has_in_user_state", Boolean.FALSE);

    /* JADX INFO: renamed from: S */
    public static C22507a<uxj0> f20751S = C22507a.m222759c(uxj0.f181467a);

    public C4894i(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ Envelope m34255d3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ BubbleInfo m34258g3(Envelope envelope) {
        return (NullChecker.m82486a(envelope) && NullChecker.m82486a(envelope.getModuleData(CoreData.class)) && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).states)) ? ((CoreData) envelope.getModuleData(CoreData.class)).states.get(0) : new BubbleInfo();
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m34262k3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m34265n3(Throwable th) {
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m34266o3(CoreFeedStateCounter coreFeedStateCounter) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query("conversation_feed_state");
        if (NullChecker.m82486a(conversationQuery)) {
            if (NullChecker.m82486a(coreFeedStateCounter)) {
                conversationQuery.latestTime = coreFeedStateCounter.latestStateCreatedTime;
            } else {
                conversationQuery.latestTime = pzi0.m174454o();
                conversationQuery.createdTime = pzi0.m174454o();
            }
            if (!NullChecker.m82486a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
                conversationQuery.read = Boolean.TRUE;
            } else {
                conversationQuery.read = Boolean.FALSE;
            }
            conversationQuery.localEverHasMessage = true;
            conversationQuery.additional.feedStateCounter = coreFeedStateCounter;
            CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = "conversation_feed_state";
        conversationNew_.latestTime = NullChecker.m82486a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : pzi0.m174454o();
        conversationNew_.createdTime = NullChecker.m82486a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : pzi0.m174454o();
        if (!NullChecker.m82486a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
            conversationNew_.read = Boolean.TRUE;
        } else {
            conversationNew_.read = Boolean.FALSE;
        }
        conversationNew_.localEverHasMessage = true;
        conversationNew_.convType = ConversationType.feedstate;
        conversationNew_.additional.feedStateCounter = coreFeedStateCounter;
        CoreModule.f18264c.f20384f0.m34053mq(conversationNew_);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22421c m34271A3() {
        return qi20.m176659f(new pcj() { // from class: l.xr8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/state-counters")).m209032f().m209028b();
            }
        }, CoreFeedStateEnvelop.JSON_ADAPTER).map(new qcj() { // from class: l.zr8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205744a.m34281z3((CoreFeedStateEnvelop) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m34272B3(final CoreFeedStateCounter coreFeedStateCounter) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.nr8
            @Override // p153l.x20
            public final void call() {
                C4894i.m34266o3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<uxj0> m34273C3() {
        return scheduled("patch-state-counters", -1, new pcj() { // from class: l.vr8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.jr8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/state-counters")).m209037k(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.lr8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m34274D3(String str, String str2, String str3, boolean z) {
        Message messageNew_ = Message.new_();
        if (z) {
            messageNew_.messageType = MessageType.get(MessageType.state_like);
            messageNew_.value = "赞了你的状态";
        } else {
            messageNew_.messageType = MessageType.get(MessageType.state_comment);
            messageNew_.value = str3;
        }
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.f21189id = str2;
        messageNew_.api_only_reference = messageReferenceNew_;
        CoreModule.f18264c.f20384f0.m33639En(str, messageNew_, null, false).flatMap(new qcj() { // from class: l.rr8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.sr8
            @Override // p153l.y20
            public final void call(Object obj) {
                C4894i.m34262k3((uxj0) obj);
            }
        }, new y20() { // from class: l.tr8
            @Override // p153l.y20
            public final void call(Object obj) {
                C4894i.m34265n3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<Boolean> m34275t3() {
        tu2.m192703a("DbCheck", "deleteStateCounter step 1");
        return C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.js8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122433a.m34280y3((uxj0) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<Envelope> m34276u3() {
        final String strM32203G = C4879a.m32203G("/voice-distribution/emotions");
        return scheduled("getSquareChatRoomData", 0, new pcj() { // from class: l.bs8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ls8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.fr8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4894i.m34255d3((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<BubbleInfo> m34277v3(final String str, final String str2) {
        return scheduled("getState" + str + str2, 0, new pcj() { // from class: l.ds8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.fs8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(String.format("/users/%s/states/%s", str, str))).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.hs8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4894i.m34258g3((Envelope) obj);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<uxj0> m34278w3() {
        return scheduled("state-counters", 0, new pcj() { // from class: l.dr8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90363a.m34271A3();
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m34279x3(final CoreFeedStateCounter coreFeedStateCounter) {
        if (CoreModule.m30932N().mo61525cd() || !CoreModule.m30932N().mo61537fs()) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.hr8
            @Override // java.lang.Runnable
            public final void run() {
                this.f111293a.m34272B3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Boolean m34280y3(uxj0 uxj0Var) {
        tu2.m192703a("DbCheck", "deleteStateCounter step 2");
        if (!NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33738Mo("conversation_feed_state"))) {
            return Boolean.FALSE;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.pr8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33731Mh("conversation_feed_state");
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ uxj0 m34281z3(CoreFeedStateEnvelop coreFeedStateEnvelop) {
        if (!NullChecker.m82486a(coreFeedStateEnvelop) || !NullChecker.m82486a(coreFeedStateEnvelop.counters)) {
            m34279x3(null);
        }
        m34279x3(coreFeedStateEnvelop.counters.states);
        return uxj0.f181467a;
    }
}
