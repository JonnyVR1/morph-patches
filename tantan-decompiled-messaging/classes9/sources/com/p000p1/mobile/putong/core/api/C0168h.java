package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0168h;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.d30;
import l.e51;
import l.hpd0;
import l.jo0;
import l.mqi0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import p006l.ax6;
import p006l.ia20;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.h */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0168h extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f3992R;

    /* JADX INFO: renamed from: S */
    public hpd0 f3993S;

    /* JADX INFO: renamed from: T */
    public hpd0 f3994T;

    /* JADX INFO: renamed from: U */
    public hpd0 f3995U;

    /* JADX INFO: renamed from: V */
    public hpd0 f3996V;

    public C0168h(C0158c c0158c) {
        super(c0158c);
        this.f3992R = new zpd0("profile_like_refresh_time_" + CoreModule.m1850H().userId(), 0L);
        String str = "has_life_tips_show_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f3993S = new hpd0(str, bool);
        this.f3994T = new hpd0("ideal_tips_show" + CoreModule.m1850H().userId(), bool);
        this.f3995U = new hpd0("has_profile_like_entrance" + CoreModule.m1850H().userId(), bool);
        this.f3996V = new hpd0("showLabelTipsIgnoreCount" + CoreModule.m1850H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ Boolean m5158c3(final CoreSuggested.UserInfo userInfo, Envelope envelope) {
        List list = envelope.data.getModuleData(CoreData.class).relationships;
        if (!vwb.J(list) && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            CoreModule.m1853N().processMomentLikeStatusChanged((Relationship) list.get(0), (User) vwb.r(envelope.data.getModuleData(CommonData.class).users, new w9j() { // from class: l.ep8
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user != null && TextUtils.equals(((DbObject) user).id, userInfo.f3461id));
                }
            }), true, false);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: m3 */
    public void m5168m3() {
        e51.y(new Runnable() { // from class: l.gp8
            @Override // java.lang.Runnable
            public final void run() {
                this.f13424a.m5169n3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m5169n3() {
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
        profileLikeCommentNew_.userId = CoreModule.m1850H().userId();
        profileLikeCommentNew_.createdTime = mqi0.o();
        expandedProfileLikeCounterNew_.profileLikeComment = profileLikeCommentNew_;
        conversationNew_.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        ((DbObject) conversationNew_).id = "fake_conversation_profile_like_enter";
        conversationNew_.localNotificationStatus = NotificationStatus.get("removed");
        conversationNew_.updatedTime = mqi0.o();
        conversationNew_.localHasMessage = true;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.createdTime = mqi0.o();
        conversationNew_.latestTime = mqi0.o();
        conversationNew_.convType = CameraSticker.CATEGORY_DEFAULT_FILTER;
        conversationNew_.unreadMessages = expandedProfileLikeCounterNew_.receive;
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.ip8
            public final void call() {
                CoreModule.f1542k.f11205m.upsert(conversationNew_);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m5170o3(Conversation conversation) {
        ExpandedProfileLikeCounter expandedProfileLikeCounterNew_;
        ExpandedProfileLikeCounter expandedProfileLikeCounter = conversation.profileLikeInfo;
        if (expandedProfileLikeCounter != null) {
            expandedProfileLikeCounterNew_ = expandedProfileLikeCounter.clone();
        } else {
            try {
                expandedProfileLikeCounterNew_ = (ExpandedProfileLikeCounter) ExpandedProfileLikeCounter.JSON_ADAPTER.parse(conversation.localExtraInfo);
            } catch (Exception unused) {
                expandedProfileLikeCounterNew_ = ExpandedProfileLikeCounter.new_();
            }
        }
        expandedProfileLikeCounterNew_.receive = 0;
        Conversation conversationClone = conversation.clone();
        conversationClone.profileLikeInfo = expandedProfileLikeCounterNew_;
        conversationClone.localExtraInfo = expandedProfileLikeCounterNew_.toJson();
        conversationClone.unreadMessages = 0;
        CoreModule.f1542k.f11205m.upsert(conversationClone);
        this.f3992R.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m5171p3(final Conversation conversation) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.fp8
            public final void call() {
                this.f12827a.m5170o3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ c m5172q3(final String str, final CoreSuggested.UserInfo userInfo) {
        return ia20.m16571e(new v9j() { // from class: l.mp8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3303y1()).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.np8
            public final Object call(Object obj) {
                return this.f17790a.m5173r3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.dp8
            public final Object call(Object obj) {
                return C0168h.m5158c3(userInfo, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m5173r3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Boolean m5174s3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ c m5175t3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.jp8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3307z1()).l(utc0.create(Network.JSON, str)).b();
            }
        }).map(new w9j() { // from class: l.kp8
            public final Object call(Object obj) {
                return this.f15952a.m5174s3((Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: u3 */
    public void m5176u3(final Conversation conversation) {
        if (conversation == null || !TextUtils.equals(((DbObject) conversation).id, "fake_conversation_profile_like_enter")) {
            return;
        }
        e51.y(new Runnable() { // from class: l.cp8
            @Override // java.lang.Runnable
            public final void run() {
                this.f9777a.m5171p3(conversation);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public c<Boolean> m5177v3(final CoreSuggested.UserInfo userInfo, final String str) {
        return scheduled(str, -1, new v9j() { // from class: l.lp8
            public final Object call() {
                return this.f16549a.m5172q3(str, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public c<Boolean> m5178w3(final String str) {
        return scheduled(str, -1, new v9j() { // from class: l.hp8
            public final Object call() {
                return this.f14003a.m5175t3(str);
            }
        });
    }
}
