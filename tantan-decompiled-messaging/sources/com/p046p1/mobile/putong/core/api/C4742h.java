package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4742h;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;
import p149l.ax6;
import p149l.d30;
import p149l.e51;
import p149l.hpd0;
import p149l.ia20;
import p149l.jo0;
import p149l.mqi0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.h */
/* JADX INFO: loaded from: classes9.dex */
public class C4742h extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f20003R;

    /* JADX INFO: renamed from: S */
    public hpd0 f20004S;

    /* JADX INFO: renamed from: T */
    public hpd0 f20005T;

    /* JADX INFO: renamed from: U */
    public hpd0 f20006U;

    /* JADX INFO: renamed from: V */
    public hpd0 f20007V;

    public C4742h(C4732c c4732c) {
        super(c4732c);
        this.f20003R = new zpd0("profile_like_refresh_time_" + CoreModule.m29931H().userId(), 0L);
        String str = "has_life_tips_show_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20004S = new hpd0(str, bool);
        this.f20005T = new hpd0("ideal_tips_show" + CoreModule.m29931H().userId(), bool);
        this.f20006U = new hpd0("has_profile_like_entrance" + CoreModule.m29931H().userId(), bool);
        this.f20007V = new hpd0("showLabelTipsIgnoreCount" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ Boolean m33228c3(final CoreSuggested.UserInfo userInfo, Envelope envelope) {
        List<Relationship> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).relationships;
        if (!vwb.m200296J(list) && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            CoreModule.m29934N().processMomentLikeStatusChanged(list.get(0), (User) vwb.m200346r(((CommonData) envelope.data.getModuleData(CommonData.class)).users, new w9j() { // from class: l.ep8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user != null && TextUtils.equals(user.f56011id, userInfo.f19472id));
                }
            }), true, false);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: m3 */
    public void m33238m3() {
        e51.m114774y(new Runnable() { // from class: l.gp8
            @Override // java.lang.Runnable
            public final void run() {
                this.f103767a.m33239n3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m33239n3() {
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
        profileLikeCommentNew_.userId = CoreModule.m29931H().userId();
        profileLikeCommentNew_.createdTime = mqi0.m155944o();
        expandedProfileLikeCounterNew_.profileLikeComment = profileLikeCommentNew_;
        conversationNew_.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        conversationNew_.f56011id = "fake_conversation_profile_like_enter";
        conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
        conversationNew_.updatedTime = mqi0.m155944o();
        conversationNew_.localHasMessage = true;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.createdTime = mqi0.m155944o();
        conversationNew_.latestTime = mqi0.m155944o();
        conversationNew_.convType = "default";
        conversationNew_.unreadMessages = expandedProfileLikeCounterNew_.receive;
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.ip8
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91950m.upsert(conversationNew_);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m33240o3(Conversation conversation) {
        ExpandedProfileLikeCounter expandedProfileLikeCounterNew_;
        ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
        if (expandedProfileLikeCounter != null) {
            expandedProfileLikeCounterNew_ = expandedProfileLikeCounter.mo223809clone();
        } else {
            try {
                expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.new_();
            }
        }
        expandedProfileLikeCounterNew_.receive = 0;
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.profileLikeInfo = expandedProfileLikeCounterNew_;
        conversationMo223809clone.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        conversationMo223809clone.unreadMessages = 0;
        CoreModule.f17553k.f91950m.upsert(conversationMo223809clone);
        this.f20003R.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m33241p3(final Conversation conversation) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.fp8
            @Override // p149l.d30
            public final void call() {
                this.f98671a.m33240o3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22306c m33242q3(final String str, final CoreSuggested.UserInfo userInfo) {
        return ia20.m135121e(new v9j() { // from class: l.mp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31373y1()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.np8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139937a.m33243r3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.dp8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4742h.m33228c3(userInfo, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m33243r3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Boolean m33244s3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22306c m33245t3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.jp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31377z1()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.kp8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124127a.m33244s3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u3 */
    public void m33246u3(final Conversation conversation) {
        if (conversation == null || !TextUtils.equals(conversation.f56011id, "fake_conversation_profile_like_enter")) {
            return;
        }
        e51.m114774y(new Runnable() { // from class: l.cp8
            @Override // java.lang.Runnable
            public final void run() {
                this.f81908a.m33241p3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<Boolean> m33247v3(final CoreSuggested.UserInfo userInfo, final String str) {
        return scheduled(str, -1, new v9j() { // from class: l.lp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129182a.m33242q3(str, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Boolean> m33248w3(final String str) {
        return scheduled(str, -1, new v9j() { // from class: l.hp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108901a.m33245t3(str);
            }
        });
    }
}
