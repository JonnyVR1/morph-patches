package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4743i;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p046p1.mobile.putong.core.data.CoreFeedStateEnvelop;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.hpd0;
import p149l.ia20;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.i */
/* JADX INFO: loaded from: classes9.dex */
public class C4743i extends ax6 {

    /* JADX INFO: renamed from: R */
    public static hpd0 f20008R = new hpd0("has_in_user_state", Boolean.FALSE);

    /* JADX INFO: renamed from: S */
    public static C22392a<roj0> f20009S = C22392a.m221513c(roj0.f160388a);

    public C4743i(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ Envelope m33252d3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ BubbleInfo m33255g3(Envelope envelope) {
        return (NullChecker.m81303a(envelope) && NullChecker.m81303a(envelope.getModuleData(CoreData.class)) && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).states)) ? ((CoreData) envelope.getModuleData(CoreData.class)).states.get(0) : new BubbleInfo();
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m33259k3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m33262n3(Throwable th) {
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m33263o3(CoreFeedStateCounter coreFeedStateCounter) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query("conversation_feed_state");
        if (NullChecker.m81303a(conversationQuery)) {
            if (NullChecker.m81303a(coreFeedStateCounter)) {
                conversationQuery.latestTime = coreFeedStateCounter.latestStateCreatedTime;
            } else {
                conversationQuery.latestTime = mqi0.m155944o();
                conversationQuery.createdTime = mqi0.m155944o();
            }
            if (!NullChecker.m81303a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
                conversationQuery.read = Boolean.TRUE;
            } else {
                conversationQuery.read = Boolean.FALSE;
            }
            conversationQuery.localEverHasMessage = true;
            conversationQuery.additional.feedStateCounter = coreFeedStateCounter;
            CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
            return;
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = "conversation_feed_state";
        conversationNew_.latestTime = NullChecker.m81303a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : mqi0.m155944o();
        conversationNew_.createdTime = NullChecker.m81303a(coreFeedStateCounter) ? coreFeedStateCounter.latestStateCreatedTime : mqi0.m155944o();
        if (!NullChecker.m81303a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) {
            conversationNew_.read = Boolean.TRUE;
        } else {
            conversationNew_.read = Boolean.FALSE;
        }
        conversationNew_.localEverHasMessage = true;
        conversationNew_.convType = ConversationType.feedstate;
        conversationNew_.additional.feedStateCounter = coreFeedStateCounter;
        CoreModule.f17545c.f19642f0.m33050mq(conversationNew_);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22306c m33268A3() {
        return ia20.m135122f(new v9j() { // from class: l.sq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/state-counters")).m185887f().m185883b();
            }
        }, CoreFeedStateEnvelop.JSON_ADAPTER).map(new w9j() { // from class: l.uq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177715a.m33278z3((CoreFeedStateEnvelop) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m33269B3(final CoreFeedStateCounter coreFeedStateCounter) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.iq8
            @Override // p149l.d30
            public final void call() {
                C4743i.m33263o3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<roj0> m33270C3() {
        return scheduled("patch-state-counters", -1, new v9j() { // from class: l.qq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.eq8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/state-counters")).m185892k(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.gq8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m33271D3(String str, String str2, String str3, boolean z) {
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
        messageReferenceNew_.f20447id = str2;
        messageNew_.api_only_reference = messageReferenceNew_;
        CoreModule.f17545c.f19642f0.m32636En(str, messageNew_, null, false).flatMap(new w9j() { // from class: l.mq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.nq8
            @Override // p149l.e30
            public final void call(Object obj) {
                C4743i.m33259k3((roj0) obj);
            }
        }, new e30() { // from class: l.oq8
            @Override // p149l.e30
            public final void call(Object obj) {
                C4743i.m33262n3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<Boolean> m33272t3() {
        du2.m113670a("DbCheck", "deleteStateCounter step 1");
        return C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.er8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92889a.m33277y3((roj0) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<Envelope> m33273u3() {
        final String strM31200G = C4728a.m31200G("/voice-distribution/emotions");
        return scheduled("getSquareChatRoomData", 0, new v9j() { // from class: l.wq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.gr8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.aq8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4743i.m33252d3((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<BubbleInfo> m33274v3(final String str, final String str2) {
        return scheduled("getState" + str + str2, 0, new v9j() { // from class: l.yq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.ar8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(String.format("/users/%s/states/%s", str, str))).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.cr8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4743i.m33255g3((Envelope) obj);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<roj0> m33275w3() {
        return scheduled("state-counters", 0, new v9j() { // from class: l.yp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199401a.m33268A3();
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m33276x3(final CoreFeedStateCounter coreFeedStateCounter) {
        if (CoreModule.m29934N().mo60341cd() || !CoreModule.m29934N().mo60353fs()) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.cq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f82045a.m33269B3(coreFeedStateCounter);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ Boolean m33277y3(roj0 roj0Var) {
        du2.m113670a("DbCheck", "deleteStateCounter step 2");
        if (!NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32735Mo("conversation_feed_state"))) {
            return Boolean.FALSE;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.kq8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32728Mh("conversation_feed_state");
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m33278z3(CoreFeedStateEnvelop coreFeedStateEnvelop) {
        if (!NullChecker.m81303a(coreFeedStateEnvelop) || !NullChecker.m81303a(coreFeedStateEnvelop.counters)) {
            m33276x3(null);
        }
        m33276x3(coreFeedStateEnvelop.counters.states);
        return roj0.f160388a;
    }
}
