package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0164f;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FriendInfo;
import com.p1.mobile.putong.core.data.IceBreakFriendData;
import com.p1.mobile.putong.core.data.IceBreakFriendEnvelope;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.mqi0;
import l.v9j;
import l.w9j;
import l.zpd0;
import p006l.ax6;
import p006l.la20;
import p006l.qib0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0164f extends ax6 {

    /* JADX INFO: renamed from: V */
    public static int f3798V = 60;

    /* JADX INFO: renamed from: R */
    public zpd0 f3799R;

    /* JADX INFO: renamed from: S */
    public zpd0 f3800S;

    /* JADX INFO: renamed from: T */
    public boolean f3801T;

    /* JADX INFO: renamed from: U */
    public boolean f3802U;

    public C0164f(C0158c c0158c) {
        super(c0158c);
        this.f3799R = new zpd0("conv_suggest_refresh_online_" + CoreModule.m1850H().userId(), -1L);
        this.f3800S = new zpd0("conv_suggest_refresh_order_" + CoreModule.m1850H().userId(), -1L);
        this.f3801T = false;
        this.f3802U = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m3893g3(Envelope envelope) {
        List<Conversation> listM4845bq = CoreModule.f1534c.f3631f0.m4845bq();
        if (!listM4845bq.isEmpty()) {
            for (Conversation conversation : listM4845bq) {
                conversation.suggestionScore = 0.0d;
                CoreModule.f1534c.f3631f0.m4980mq(conversation);
            }
        }
        int size = envelope.getModuleData(CoreData.class).friends.size();
        Iterator it = envelope.getModuleData(CoreData.class).friends.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f1542k.f11205m.query(((FriendInfo) it.next()).userId);
            if (NullChecker.a(conversationQuery)) {
                conversationQuery.suggestionScore = size;
                size--;
                CoreModule.f1534c.f3631f0.m4980mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m3895i3(User user, double d) {
        if (!NullChecker.a(user) || user.isTeamAccount()) {
            return false;
        }
        double dO = mqi0.o();
        if (!user.isHideActiveFromSVip()) {
            d = user.location.updatedTime;
        }
        return dO - d < ((double) (((long) f3798V) * 5000));
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m3896j3(User user) {
        return m3897k3(user, 1);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m3897k3(User user, int i) {
        return NullChecker.a(user) && !user.isTeamAccount() && !user.isHideActiveFromSVip() && ((double) mqi0.o()) - user.location.updatedTime < ((double) ((((long) f3798V) * 1000) * ((long) i)));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m3898l3(Envelope envelope) {
        for (FriendInfo friendInfo : envelope.getModuleData(CoreData.class).friends) {
            User userM21396Q9 = this.f8580Q.f3628e0.m21396Q9(friendInfo.userId);
            if (NullChecker.a(userM21396Q9)) {
                if (userM21396Q9.location == null) {
                    userM21396Q9.location = Location.new_();
                }
                Location location = userM21396Q9.location;
                location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
                qib0.f19813k0.f23551d.upsert(userM21396Q9);
            }
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m3899m3(boolean z, final Envelope envelope) {
        C0158c c0158c = this.f8580Q;
        if (z) {
            c0158c.f3577N0.f3799R.put(Long.valueOf((long) envelope.getModuleData(CoreData.class).nextTime));
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.fm7
                public final void call() {
                    this.f12774a.m3898l3(envelope);
                }
            });
        } else {
            c0158c.f3577N0.f3800S.put(Long.valueOf((long) envelope.getModuleData(CoreData.class).nextTime));
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.gm7
                public final void call() {
                    C0164f.m3893g3(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m3900n3(final boolean z) {
        return new la20(new v9j() { // from class: l.bm7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3260n2(z ? "online" : "suggested")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.cm7
            public final void call(Object obj) {
                this.f9728a.m3899m3(z, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: o3 */
    public c<IceBreakFriendData> m3901o3(final String str) {
        return this.f8580Q.scheduled("refreshIceBreakSuggest_" + str, 0, new v9j() { // from class: l.am7
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.dm7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3260n2("icebreaking&filterUserId=" + str)).f().b();
                    }
                }, IceBreakFriendEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.em7
                    public final Object call(Object obj) {
                        return ((IceBreakFriendEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public c<Envelope> m3902p3(final boolean z) {
        return this.f8580Q.scheduled("refreshSuggestConv_".concat(z ? "online" : "suggested"), 0, new v9j() { // from class: l.zl7
            public final Object call() {
                return this.f28800a.m3900n3(z);
            }
        });
    }
}
