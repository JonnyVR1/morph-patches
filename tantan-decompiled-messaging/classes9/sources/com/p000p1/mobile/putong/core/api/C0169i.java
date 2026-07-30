package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0169i;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p1.mobile.putong.core.data.CoreFeedStateEnvelop;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.hpd0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import p006l.ax6;
import p006l.ia20;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.i */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0169i extends ax6 {

    /* JADX INFO: renamed from: R */
    public static hpd0 f3997R = new hpd0("has_in_user_state", Boolean.FALSE);

    /* JADX INFO: renamed from: S */
    public static a<roj0> f3998S = a.c(roj0.a);

    public C0169i(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ Envelope m5182d3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ BubbleInfo m5185g3(Envelope envelope) {
        return (NullChecker.a(envelope) && NullChecker.a(envelope.getModuleData(CoreData.class)) && !vwb.J(envelope.getModuleData(CoreData.class).states)) ? (BubbleInfo) envelope.getModuleData(CoreData.class).states.get(0) : new BubbleInfo();
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m5189k3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m5192n3(Throwable th) {
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m5193o3(CoreFeedStateCounter coreFeedStateCounter) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query("conversation_feed_state");
        if (NullChecker.a(conversationQuery)) {
            if (NullChecker.a(coreFeedStateCounter)) {
                conversationQuery.latestTime = coreFeedStateCounter.latestStateCreatedTime;
            } else {
                conversationQuery.latestTime = mqi0.o();
                conversationQuery.createdTime = mqi0.o();
            }
            if (!NullChecker.a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
                conversationQuery.read = Boolean.TRUE;
            } else {
                conversationQuery.read = Boolean.FALSE;
            }
            conversationQuery.localEverHasMessage = true;
            conversationQuery.additional.feedStateCounter = coreFeedStateCounter;
            CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = "conversation_feed_state";
        conversationNew_.latestTime = NullChecker.a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : mqi0.o();
        conversationNew_.createdTime = NullChecker.a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : mqi0.o();
        if (!NullChecker.a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
            conversationNew_.read = Boolean.TRUE;
        } else {
            conversationNew_.read = Boolean.FALSE;
        }
        conversationNew_.localEverHasMessage = true;
        conversationNew_.convType = "feedstate";
        conversationNew_.additional.feedStateCounter = coreFeedStateCounter;
        CoreModule.f1534c.f3631f0.m4980mq(conversationNew_);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ c m5198A3() {
        return ia20.m16572f(new v9j() { // from class: l.sq8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/state-counters")).f().b();
            }
        }, CoreFeedStateEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.uq8
            public final Object call(Object obj) {
                return this.f23705a.m5208z3((CoreFeedStateEnvelop) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m5199B3(final CoreFeedStateCounter coreFeedStateCounter) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.iq8
            public final void call() {
                C0169i.m5193o3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public c<roj0> m5200C3() {
        return scheduled("patch-state-counters", -1, new v9j() { // from class: l.qq8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.eq8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/state-counters")).k(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.gq8
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m5201D3(String str, String str2, String str3, boolean z) {
        Message messageNew_ = Message.new_();
        if (z) {
            messageNew_.messageType = MessageType.get("state_like");
            messageNew_.value = "赞了你的状态";
        } else {
            messageNew_.messageType = MessageType.get("state_comment");
            messageNew_.value = str3;
        }
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.id = str2;
        messageNew_.api_only_reference = messageReferenceNew_;
        CoreModule.f1534c.f3631f0.m4566En(str, messageNew_, null, false).flatMap(new w9j() { // from class: l.mq8
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3631f0.m4580Fo();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.nq8
            public final void call(Object obj) {
                C0169i.m5189k3((roj0) obj);
            }
        }, new e30() { // from class: l.oq8
            public final void call(Object obj) {
                C0169i.m5192n3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t3 */
    public c<Boolean> m5202t3() {
        du2.a("DbCheck", "deleteStateCounter step 1");
        return c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.er8
            public final Object call(Object obj) {
                return this.f11411a.m5207y3((roj0) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: u3 */
    public c<Envelope> m5203u3() {
        final String strM3130G = C0154a.m3130G("/voice-distribution/emotions");
        return scheduled("getSquareChatRoomData", 0, new v9j() { // from class: l.wq8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.gr8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.aq8
                    public final Object call(Object obj) {
                        return C0169i.m5182d3((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: v3 */
    public c<BubbleInfo> m5204v3(final String str, final String str2) {
        return scheduled("getState" + str + str2, 0, new v9j() { // from class: l.yq8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.ar8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G(String.format("/users/%s/states/%s", str, str))).f().b();
                    }
                }).map(new w9j() { // from class: l.cr8
                    public final Object call(Object obj) {
                        return C0169i.m5185g3((Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public c<roj0> m5205w3() {
        return scheduled("state-counters", 0, new v9j() { // from class: l.yp8
            public final Object call() {
                return this.f28333a.m5198A3();
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m5206x3(final CoreFeedStateCounter coreFeedStateCounter) {
        if (CoreModule.m1853N().cd() || !CoreModule.m1853N().fs()) {
            return;
        }
        e51.y(new Runnable() { // from class: l.cq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f9787a.m5199B3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Boolean m5207y3(roj0 roj0Var) {
        du2.a("DbCheck", "deleteStateCounter step 2");
        if (!NullChecker.a(CoreModule.f1534c.f3631f0.m4665Mo("conversation_feed_state"))) {
            return Boolean.FALSE;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.kq8
            public final void call() {
                CoreModule.f1534c.f3631f0.m4658Mh("conversation_feed_state");
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m5208z3(CoreFeedStateEnvelop coreFeedStateEnvelop) {
        if (!NullChecker.a(coreFeedStateEnvelop) || !NullChecker.a(coreFeedStateEnvelop.counters)) {
            m5206x3(null);
        }
        m5206x3(coreFeedStateEnvelop.counters.states);
        return roj0.a;
    }
}
