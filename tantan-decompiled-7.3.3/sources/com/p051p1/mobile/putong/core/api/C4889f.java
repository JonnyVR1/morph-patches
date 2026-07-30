package com.p051p1.mobile.putong.core.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4889f;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FriendInfo;
import com.p051p1.mobile.putong.core.data.IceBreakFriendData;
import com.p051p1.mobile.putong.core.data.IceBreakFriendEnvelope;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p153l.byd0;
import p153l.dy6;
import p153l.pcj;
import p153l.pzi0;
import p153l.ti20;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f */
/* JADX INFO: loaded from: classes9.dex */
public class C4889f extends dy6 {

    /* JADX INFO: renamed from: V */
    public static int f20551V = 60;

    /* JADX INFO: renamed from: R */
    public byd0 f20552R;

    /* JADX INFO: renamed from: S */
    public byd0 f20553S;

    /* JADX INFO: renamed from: T */
    public boolean f20554T;

    /* JADX INFO: renamed from: U */
    public boolean f20555U;

    public C4889f(C4883c c4883c) {
        super(c4883c);
        this.f20552R = new byd0("conv_suggest_refresh_online_" + CoreModule.m30929H().userId(), -1L);
        this.f20553S = new byd0("conv_suggest_refresh_order_" + CoreModule.m30929H().userId(), -1L);
        this.f20554T = false;
        this.f20555U = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m32966g3(Envelope envelope) {
        List<Conversation> listM33918bq = CoreModule.f18264c.f20384f0.m33918bq();
        if (!listM33918bq.isEmpty()) {
            for (Conversation conversation : listM33918bq) {
                conversation.suggestionScore = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                CoreModule.f18264c.f20384f0.m34053mq(conversation);
            }
        }
        int size = ((CoreData) envelope.getModuleData(CoreData.class)).friends.size();
        Iterator<FriendInfo> it = ((CoreData) envelope.getModuleData(CoreData.class)).friends.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f18272k.f115545m.query(it.next().userId);
            if (NullChecker.m82486a(conversationQuery)) {
                conversationQuery.suggestionScore = size;
                size--;
                CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m32968i3(User user, double d) {
        if (!NullChecker.m82486a(user) || user.isTeamAccount()) {
            return false;
        }
        double dM174454o = pzi0.m174454o();
        if (!user.isHideActiveFromSVip()) {
            d = user.location.updatedTime;
        }
        return dM174454o - d < ((double) (((long) f20551V) * Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS));
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m32969j3(User user) {
        return m32970k3(user, 1);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m32970k3(User user, int i) {
        return NullChecker.m82486a(user) && !user.isTeamAccount() && !user.isHideActiveFromSVip() && ((double) pzi0.m174454o()) - user.location.updatedTime < ((double) ((((long) f20551V) * 1000) * ((long) i)));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m32971l3(Envelope envelope) {
        for (FriendInfo friendInfo : ((CoreData) envelope.getModuleData(CoreData.class)).friends) {
            User userM116506Q9 = this.f91137Q.f20381e0.m116506Q9(friendInfo.userId);
            if (NullChecker.m82486a(userM116506Q9)) {
                if (userM116506Q9.location == null) {
                    userM116506Q9.location = Location.new_();
                }
                Location location = userM116506Q9.location;
                location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
                uqb0.f180405k0.f184355d.upsert(userM116506Q9);
            }
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m32972m3(boolean z, final Envelope envelope) {
        C4883c c4883c = this.f91137Q;
        if (z) {
            c4883c.f20330N0.f20552R.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).nextTime));
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.jn7
                @Override // p153l.x20
                public final void call() {
                    this.f121752a.m32971l3(envelope);
                }
            });
        } else {
            c4883c.f20330N0.f20553S.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).nextTime));
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.kn7
                @Override // p153l.x20
                public final void call() {
                    C4889f.m32966g3(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m32973n3(final boolean z) {
        return new ti20(new pcj() { // from class: l.fn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32333n2(z ? "online" : RelationshipStatus.suggested)).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.gn7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105063a.m32972m3(z, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<IceBreakFriendData> m32974o3(final String str) {
        return this.f91137Q.scheduled("refreshIceBreakSuggest_" + str, 0, new pcj() { // from class: l.en7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.hn7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32333n2("icebreaking&filterUserId=" + str)).m209032f().m209028b();
                    }
                }, IceBreakFriendEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.in7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((IceBreakFriendEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<Envelope> m32975p3(final boolean z) {
        return this.f91137Q.scheduled("refreshSuggestConv_".concat(z ? "online" : RelationshipStatus.suggested), 0, new pcj() { // from class: l.dn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f89765a.m32973n3(z);
            }
        });
    }
}
