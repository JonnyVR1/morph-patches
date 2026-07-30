package com.p046p1.mobile.putong.core.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4738f;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FriendInfo;
import com.p046p1.mobile.putong.core.data.IceBreakFriendData;
import com.p046p1.mobile.putong.core.data.IceBreakFriendEnvelope;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p149l.ax6;
import p149l.d30;
import p149l.e30;
import p149l.la20;
import p149l.mqi0;
import p149l.qib0;
import p149l.v9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.f */
/* JADX INFO: loaded from: classes9.dex */
public class C4738f extends ax6 {

    /* JADX INFO: renamed from: V */
    public static int f19809V = 60;

    /* JADX INFO: renamed from: R */
    public zpd0 f19810R;

    /* JADX INFO: renamed from: S */
    public zpd0 f19811S;

    /* JADX INFO: renamed from: T */
    public boolean f19812T;

    /* JADX INFO: renamed from: U */
    public boolean f19813U;

    public C4738f(C4732c c4732c) {
        super(c4732c);
        this.f19810R = new zpd0("conv_suggest_refresh_online_" + CoreModule.m29931H().userId(), -1L);
        this.f19811S = new zpd0("conv_suggest_refresh_order_" + CoreModule.m29931H().userId(), -1L);
        this.f19812T = false;
        this.f19813U = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m31963g3(Envelope envelope) {
        List<Conversation> listM32915bq = CoreModule.f17545c.f19642f0.m32915bq();
        if (!listM32915bq.isEmpty()) {
            for (Conversation conversation : listM32915bq) {
                conversation.suggestionScore = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                CoreModule.f17545c.f19642f0.m33050mq(conversation);
            }
        }
        int size = ((CoreData) envelope.getModuleData(CoreData.class)).friends.size();
        Iterator<FriendInfo> it = ((CoreData) envelope.getModuleData(CoreData.class)).friends.iterator();
        while (it.hasNext()) {
            Conversation conversationQuery = CoreModule.f17553k.f91950m.query(it.next().userId);
            if (NullChecker.m81303a(conversationQuery)) {
                conversationQuery.suggestionScore = size;
                size--;
                CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
            }
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m31965i3(User user, double d) {
        if (!NullChecker.m81303a(user) || user.isTeamAccount()) {
            return false;
        }
        double dM155944o = mqi0.m155944o();
        if (!user.isHideActiveFromSVip()) {
            d = user.location.updatedTime;
        }
        return dM155944o - d < ((double) (((long) f19809V) * Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS));
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m31966j3(User user) {
        return m31967k3(user, 1);
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m31967k3(User user, int i) {
        return NullChecker.m81303a(user) && !user.isTeamAccount() && !user.isHideActiveFromSVip() && ((double) mqi0.m155944o()) - user.location.updatedTime < ((double) ((((long) f19809V) * 1000) * ((long) i)));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m31968l3(Envelope envelope) {
        for (FriendInfo friendInfo : ((CoreData) envelope.getModuleData(CoreData.class)).friends) {
            User userM169433Q9 = this.f72126Q.f19639e0.m169433Q9(friendInfo.userId);
            if (NullChecker.m81303a(userM169433Q9)) {
                if (userM169433Q9.location == null) {
                    userM169433Q9.location = Location.new_();
                }
                Location location = userM169433Q9.location;
                location.updatedTime = Math.max(friendInfo.lastActivity, location.updatedTime);
                qib0.f154722k0.f176631d.upsert(userM169433Q9);
            }
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m31969m3(boolean z, final Envelope envelope) {
        C4732c c4732c = this.f72126Q;
        if (z) {
            c4732c.f19588N0.f19810R.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).nextTime));
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.fm7
                @Override // p149l.d30
                public final void call() {
                    this.f98272a.m31968l3(envelope);
                }
            });
        } else {
            c4732c.f19588N0.f19811S.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).nextTime));
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.gm7
                @Override // p149l.d30
                public final void call() {
                    C4738f.m31963g3(envelope);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m31970n3(final boolean z) {
        return new la20(new v9j() { // from class: l.bm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31330n2(z ? "online" : RelationshipStatus.suggested)).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.cm7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81515a.m31969m3(z, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<IceBreakFriendData> m31971o3(final String str) {
        return this.f72126Q.scheduled("refreshIceBreakSuggest_" + str, 0, new v9j() { // from class: l.am7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.dm7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31330n2("icebreaking&filterUserId=" + str)).m185887f().m185883b();
                    }
                }, IceBreakFriendEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.em7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((IceBreakFriendEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<Envelope> m31972p3(final boolean z) {
        return this.f72126Q.scheduled("refreshSuggestConv_".concat(z ? "online" : RelationshipStatus.suggested), 0, new v9j() { // from class: l.zl7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203595a.m31970n3(z);
            }
        });
    }
}
