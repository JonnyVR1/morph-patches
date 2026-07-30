package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4893h;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.C22421c;
import p153l.byd0;
import p153l.dy6;
import p153l.fo0;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.pcj;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.h */
/* JADX INFO: loaded from: classes9.dex */
public class C4893h extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f20745R;

    /* JADX INFO: renamed from: S */
    public jxd0 f20746S;

    /* JADX INFO: renamed from: T */
    public jxd0 f20747T;

    /* JADX INFO: renamed from: U */
    public jxd0 f20748U;

    /* JADX INFO: renamed from: V */
    public jxd0 f20749V;

    public C4893h(C4883c c4883c) {
        super(c4883c);
        this.f20745R = new byd0("profile_like_refresh_time_" + CoreModule.m30929H().userId(), 0L);
        String str = "has_life_tips_show_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20746S = new jxd0(str, bool);
        this.f20747T = new jxd0("ideal_tips_show" + CoreModule.m30929H().userId(), bool);
        this.f20748U = new jxd0("has_profile_like_entrance" + CoreModule.m30929H().userId(), bool);
        this.f20749V = new jxd0("showLabelTipsIgnoreCount" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ Boolean m34231c3(final CoreSuggested.UserInfo userInfo, Envelope envelope) {
        List<Relationship> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).relationships;
        if (!jyb.m147479J(list) && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            CoreModule.m30932N().processMomentLikeStatusChanged(list.get(0), (User) jyb.m147529r(((CommonData) envelope.data.getModuleData(CommonData.class)).users, new qcj() { // from class: l.jq8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user != null && TextUtils.equals(user.f56859id, userInfo.f20214id));
                }
            }), true, false);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: m3 */
    public void m34241m3() {
        l51.m152919y(new Runnable() { // from class: l.lq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f133157a.m34242n3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m34242n3() {
        final Conversation conversationNew_ = Conversation.new_();
        ExpandedProfileLikeCounter expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.new_();
        expandedProfileLikeCounterNew_.receive = 10;
        expandedProfileLikeCounterNew_.canLike = true;
        ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
        ProfileLikeSnapshot profileLikeSnapshot = new ProfileLikeSnapshot();
        profileLikeSnapshot.title = "你好啊";
        profileLikeSnapshot.desc = "这个是什么意思啊";
        profileLikeCommentNew_.comment = "你这个是什么意思啊";
        profileLikeCommentNew_.snapshot = profileLikeSnapshot.toJson();
        profileLikeCommentNew_.userId = CoreModule.m30929H().userId();
        profileLikeCommentNew_.createdTime = pzi0.m174454o();
        expandedProfileLikeCounterNew_.profileLikeComment = profileLikeCommentNew_;
        conversationNew_.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        conversationNew_.f56859id = "fake_conversation_profile_like_enter";
        conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
        conversationNew_.updatedTime = pzi0.m174454o();
        conversationNew_.localHasMessage = true;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.createdTime = pzi0.m174454o();
        conversationNew_.latestTime = pzi0.m174454o();
        conversationNew_.convType = "default";
        conversationNew_.unreadMessages = expandedProfileLikeCounterNew_.receive;
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.nq8
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115545m.upsert(conversationNew_);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m34243o3(Conversation conversation) {
        ExpandedProfileLikeCounter expandedProfileLikeCounterNew_;
        ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
        if (expandedProfileLikeCounter != null) {
            expandedProfileLikeCounterNew_ = expandedProfileLikeCounter.mo225055clone();
        } else {
            try {
                expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.new_();
            }
        }
        expandedProfileLikeCounterNew_.receive = 0;
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.profileLikeInfo = expandedProfileLikeCounterNew_;
        conversationMo225055clone.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        conversationMo225055clone.unreadMessages = 0;
        CoreModule.f18272k.f115545m.upsert(conversationMo225055clone);
        this.f20745R.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m34244p3(final Conversation conversation) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.kq8
            @Override // p153l.x20
            public final void call() {
                this.f128195a.m34243o3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22421c m34245q3(final String str, final CoreSuggested.UserInfo userInfo) {
        return qi20.m176658e(new pcj() { // from class: l.rq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32376y1()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.sq8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170152a.m34246r3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.iq8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4893h.m34231c3(userInfo, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m34246r3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Boolean m34247s3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22421c m34248t3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.oq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32380z1()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.pq8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153651a.m34247s3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u3 */
    public void m34249u3(final Conversation conversation) {
        if (conversation == null || !TextUtils.equals(conversation.f56859id, "fake_conversation_profile_like_enter")) {
            return;
        }
        l51.m152919y(new Runnable() { // from class: l.hq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f111095a.m34244p3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<Boolean> m34250v3(final CoreSuggested.UserInfo userInfo, final String str) {
        return scheduled(str, -1, new pcj() { // from class: l.qq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158964a.m34245q3(str, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Boolean> m34251w3(final String str) {
        return scheduled(str, -1, new pcj() { // from class: l.mq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138022a.m34248t3(str);
            }
        });
    }
}
