package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4899n;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfos;
import com.p051p1.mobile.putong.core.data.CardStyle;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.byd0;
import p153l.dy6;
import p153l.gta;
import p153l.jyb;
import p153l.l51;
import p153l.lqb;
import p153l.pcj;
import p153l.pf60;
import p153l.qcj;
import p153l.qi20;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;
import p153l.xgw;
import p153l.y20;
import p153l.z7i0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.n */
/* JADX INFO: loaded from: classes9.dex */
public class C4899n extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f20798R;

    /* JADX INFO: renamed from: S */
    public byd0 f20799S;

    /* JADX INFO: renamed from: T */
    public byd0 f20800T;

    /* JADX INFO: renamed from: U */
    public User f20801U;

    /* JADX INFO: renamed from: V */
    public CoreSuggested.UserInfo f20802V;

    /* JADX INFO: renamed from: W */
    public CoreSuggested.UserInfo f20803W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f20804X;

    /* JADX INFO: renamed from: Y */
    public C22507a<PartialListOpt<CoreSuggested.UserInfo>> f20805Y;

    /* JADX INFO: renamed from: Z */
    public C22508b<uxj0> f20806Z;

    /* JADX INFO: renamed from: a0 */
    public C22507a<uxj0> f20807a0;

    /* JADX INFO: renamed from: b0 */
    public int f20808b0;

    /* JADX INFO: renamed from: c0 */
    public xgw<String, Object> f20809c0;

    public C4899n(C4883c c4883c) {
        super(c4883c);
        this.f20801U = null;
        this.f20804X = new HashSet<>();
        this.f20805Y = C22507a.m222758b();
        this.f20806Z = C22508b.m222767b();
        this.f20807a0 = C22507a.m222758b();
        this.f20808b0 = 1;
        this.f20809c0 = new xgw<>(20);
        this.f20798R = new byd0("today_tribe_start_swipe_time_" + CoreModule.m30929H().userId(), 0L);
        this.f20799S = new byd0("today_tribe_swipe_count_" + CoreModule.m30929H().userId(), 0L);
        this.f20800T = new byd0("today_tribe_right_swipe_count_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Relationship m35285g3(Envelope envelope) {
        if (CoreModule.f18264c.m32487o3() == null) {
            CoreModule.f18264c.m32477F3(envelope.counters);
        } else {
            envelope.counters.mergeData(CoreModule.f18264c.m32487o3());
            CoreModule.f18264c.m32477F3(envelope.counters);
        }
        if (!((CoreData) envelope.getModuleData(CoreData.class)).relationships.isEmpty()) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m35291m3(User user) {
        if (user.hasPic()) {
            uqb0.f180374G.m127162z0(gta.m132210e().m132214d().mo34785Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final int m35301A3() {
        return this.f20808b0;
    }

    /* JADX INFO: renamed from: B3 */
    public C22421c<uxj0> m35302B3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f91137Q.scheduled("users/suggested/intl_tribe/insert", 0, new pcj() { // from class: l.sb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f167114a.m35304D3(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m35303C3(int i, CoreSuggested.UserInfo userInfo, uxj0 uxj0Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = this.f20805Y.m222761e();
        List arrayList = partialListOptM222761e == null ? new ArrayList() : partialListOptM222761e.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f20804X.add(userInfo.f20214id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20805Y.m137019l(new PartialListOpt<>(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22421c m35304D3(final int i, final CoreSuggested.UserInfo userInfo) {
        return C22421c.fromCallable(new Callable() { // from class: l.tb9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.ub9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178291a.m35303C3(i, userInfo, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m35305E3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f91137Q.f20429u0.m31383C7(userInfo.f20214id);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22421c m35306F3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C4910y.m35908m3(userInfo.f20214id, relationship, map).compose(z7i0.m218893e(l2)).materialize().map(new qcj() { // from class: l.yb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198282a.m35307G3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.zb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4899n.m35285g3((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.ac9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69685a.m35305E3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Notification m35307G3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m35320T3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m35308H3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
        Relationship relationship = ((CoreData) ((Envelope) notification.m222541f()).getModuleData(CoreData.class)).relationships.get(0);
        User userM116506Q9 = this.f91137Q.f20381e0.m116506Q9(userInfo.f20214id);
        if (userM116506Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM116506Q9 = user;
            }
        }
        userM116506Q9.localRelationship = relationship;
        if (TEnum.equals(relationship.state, "matched")) {
            if (user != null) {
                user.localRelationship = userM116506Q9.localRelationship;
            }
            uqb0.f180405k0.f184355d.upsert(userM116506Q9);
            this.f91137Q.f20384f0.m34159vf(userM116506Q9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m35309I3(pf60 pf60Var) {
        Envelope envelope = (Envelope) pf60Var.f152156a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        Counter counter = envelope.counters;
        if (counterM32487o3 == null) {
            CoreModule.f18264c.m32477F3(counter);
        } else {
            counter.mergeData(CoreModule.f18264c.m32487o3());
            CoreModule.f18264c.m32477F3(envelope.counters);
        }
        if (ConnectivityReceiver.m82469i()) {
            if (!jyb.m147479J(commonData.users)) {
                m35322V3(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
            this.f91137Q.m32497y3(envelope, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m35310J3(Throwable th) {
        uqb0.f180376H.guessedCurrentServerTime();
        if (NullChecker.m82486a(this.f20805Y.m222761e()) && NullChecker.m82486a(this.f20805Y.m222761e().loaded)) {
            this.f20805Y.m222761e().loaded.size();
        }
        this.f20807a0.m137019l(uxj0.f181467a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ uxj0 m35311K3(pf60 pf60Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = this.f20805Y.m222761e();
        List arrayList = partialListOptM222761e == null ? new ArrayList() : partialListOptM222761e.loaded;
        Envelope envelope = (Envelope) pf60Var.f152156a;
        HashMap map = new HashMap();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cardInfos)) {
            for (CardInfos cardInfos : ((CoreData) envelope.getModuleData(CoreData.class)).cardInfos) {
                if (NullChecker.m82486a(cardInfos)) {
                    map.put(cardInfos.userId, cardInfos);
                }
            }
        }
        HashMap map2 = new HashMap();
        List<SuggestedComplimentItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        if (!jyb.m147479J(list)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list) {
                if (NullChecker.m82486a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.receiverId)) {
                    map2.putIfAbsent(suggestedComplimentItem.receiverId, suggestedComplimentItem);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).likedMes)) {
            for (CardStyle cardStyle : ((CoreData) envelope.getModuleData(CoreData.class)).likedMes) {
                if (NullChecker.m82486a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    arrayList2.add(cardStyle.userId);
                }
            }
        }
        boolean z = false;
        if (NullChecker.m82486a(envelope.getModuleData(CommonData.class)) && !jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list2 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map3 = new HashMap();
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
                for (CoreMomentInfo coreMomentInfo : ((CoreData) envelope.getModuleData(CoreData.class)).moments) {
                    if (NullChecker.m82486a(coreMomentInfo)) {
                        map3.put(coreMomentInfo.f56856id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!jyb.m147479J(list2)) {
                for (final User user : list2) {
                    if (!this.f20804X.contains(user.f56859id) && !jyb.m147520m(arrayList, new qcj() { // from class: l.nb9
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).f20214id, user.f56859id));
                        }
                    })) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = user.f56859id;
                        userInfo.f20214id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(user.f56859id));
                        if (NullChecker.m82486a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map3.get(userInfo.cardInfos.momentId);
                        }
                        userInfo.compliment = (SuggestedComplimentItem) map2.get(userInfo.f20214id);
                        arrayList.add(userInfo);
                        this.f20804X.add(user.f56859id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        this.f20805Y.m137019l(new PartialListOpt<>(arrayList, dbLinksNew_));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22421c m35312L3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.hb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).flatMap(new qcj() { // from class: l.ib9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(jyb.m147494Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new y20() { // from class: l.jb9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119137a.m35309I3((pf60) obj);
            }
        }).doOnError(new y20() { // from class: l.kb9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124764a.m35310J3((Throwable) obj);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.lb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130793a.m35311K3((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m35314N3(final String str, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.bc9
            @Override // java.lang.Runnable
            public final void run() {
                this.f76109a.m35313M3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m35315O3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            uqb0.f180405k0.f184355d.insert(user);
            userInfo.isUndo = true;
            m35302B3(userInfo, 0);
            m35331w3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Relationship m35316P3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.mb9
            @Override // p153l.x20
            public final void call() {
                this.f135631a.m35315O3(envelope, user, userInfo);
            }
        });
        return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ C22421c m35317Q3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C4910y.m35908m3(user.f56859id, relationship, map).map(new qcj() { // from class: l.cc9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80894a.m35316P3(user, userInfo, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: R3 */
    public C22421c<Relationship> m35318R3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, String str, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
        if (map == null) {
            map = new HashMap<>();
        }
        final Map<String, String> map2 = map;
        if (likeExtraData != null) {
            map2.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
        }
        if (userInfo == null) {
            CrashHelper.m82479c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation at moment"));
            return C22421c.just(Relationship.new_());
        }
        this.f20808b0 = i;
        final Relationship relationshipM35333y3 = m35333y3(z, z2, userInfo, str);
        final Long lM35334z3 = m35334z3(relationshipM35333y3);
        this.f20801U = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        this.f20802V = userInfo;
        return this.f91137Q.scheduled("intl_tribe_like_slide", -1, new pcj() { // from class: l.xb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f193137a.m35306F3(userInfo, relationshipM35333y3, map2, lM35334z3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: S3 */
    public void m35319S3() {
        this.f20807a0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m35320T3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.m222545j()) {
            this.f20804X.remove(userInfo.f20214id);
            return;
        }
        if (notification.m222546k()) {
            User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(userInfo.f20214id);
            if (TEnum.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).state, "matched")) {
                ArrayList arrayList = new ArrayList();
                if (z && userM116506Q9 != null && userM116506Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLikedEach));
                } else if (z || (userM116506Q9 != null && userM116506Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLiked));
                }
                if (userM116506Q9 != null && userM116506Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.vipseen)) && !arrayList.contains(MatchFrom.get(MatchFrom.vipseen))) {
                    arrayList.add(MatchFrom.get(MatchFrom.vipseen));
                }
                ((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).status = arrayList;
                if (user == null && (user3 = this.f20801U) != null && user3.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                    m35331w3();
                }
            } else if (user == null && (user2 = this.f20801U) != null && user2.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                this.f20802V.canUndo = true;
            }
            this.f91137Q.m32495w3(notification.m222541f(), new x20() { // from class: l.pb9
                @Override // p153l.x20
                public final void call() {
                    this.f151354a.m35308H3(notification, userInfo, user);
                }
            });
            this.f91137Q.f20429u0.m31380B7(userInfo.f20214id);
        }
    }

    /* JADX INFO: renamed from: U3, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m35313M3(String str, String str2) {
        final String strM32317j2 = C4879a.m32317j2(uqb0.f180400f0, str, str2);
        this.f20806Z.m137019l(uxj0.f181467a);
        return this.f91137Q.scheduled("users/suggested/intl_tribe", 0, new pcj() { // from class: l.gb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103063a.m35312L3(strM32317j2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m35322V3(List<User> list) {
        jyb.m147537z(jyb.m147474E(list), new y20() { // from class: l.ob9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4899n.m35291m3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m35323W3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m35324X3(new qcj() { // from class: l.qb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f20214id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m35324X3(qcj<CoreSuggested.UserInfo, Boolean> qcjVar) {
        if (this.f20805Y.m222761e() == null || jyb.m147479J(this.f20805Y.m222761e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20805Y.m222761e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (qcjVar.call(next).booleanValue()) {
                this.f20804X.remove(next.f20214id);
                it.remove();
                this.f20805Y.m222761e().setRefreshValue(true);
                C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f20805Y;
                c22507a.m137019l(c22507a.m222761e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m35325Y3(List<String> list) {
        if (list == null || list.size() == 0 || this.f20805Y.m222761e() == null || jyb.m147479J(this.f20805Y.m222761e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20805Y.m222761e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m82486a(next) && list.contains(next.f20214id)) {
                this.f20804X.remove(next.f20214id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m35326Z3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f20805Y.m222761e() != null && !jyb.m147479J(this.f20805Y.m222761e().loaded)) {
            Iterator<CoreSuggested.UserInfo> it = this.f20805Y.m222761e().loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f20805Y.m222761e().loaded.size();
                    tu2.m192703a("BifrostLayout", "moment 删除List数据：" + next.f20214id + ", " + this.f20805Y.m222761e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f20805Y.m222761e().setRefreshValue(jyb.m147479J(this.f20805Y.m222761e().loaded));
            C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f20805Y;
            c22507a.m137019l(c22507a.m222761e());
        }
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<uxj0> m35327a4() {
        return this.f20806Z.asObservable();
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<uxj0> m35328b4() {
        return this.f20807a0.asObservable();
    }

    /* JADX INFO: renamed from: c4 */
    public C22421c<PartialListOpt<CoreSuggested.UserInfo>> m35329c4(final String str, final String str2) {
        return this.f20805Y.doOnSubscribe(new x20() { // from class: l.rb9
            @Override // p153l.x20
            public final void call() {
                this.f161998a.m35314N3(str, str2);
            }
        }).filter(new qcj() { // from class: l.vb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public C22421c<Relationship> m35330d4(final Map<String, String> map, String str) {
        User user = this.f20801U;
        if (user == null) {
            return null;
        }
        final User userMo225055clone = user.mo225055clone();
        final CoreSuggested.UserInfo userInfoM225062clone = this.f20802V.m225062clone();
        final Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get("default");
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userMo225055clone.f56859id);
        if (NullChecker.m82486a(userM116503Pa) && !TextUtils.isEmpty(userM116503Pa.ussTracker)) {
            relationship.ussTracker = userM116503Pa.ussTracker;
        }
        return this.f91137Q.scheduled("undo_theme_slide", -1, new pcj() { // from class: l.wb9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f188213a.m35317Q3(userMo225055clone, relationship, map, userInfoM225062clone);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m35331w3() {
        this.f20801U = null;
        this.f20802V = null;
        this.f20808b0 = 1;
    }

    /* JADX INFO: renamed from: x3 */
    public void m35332x3() {
        CoreModule.f18264c.clearRequests("users/suggested/intl_tribe", 0);
        CoreModule.f18264c.clearRequests("users/suggested/intl_tribe/insert", 0);
        this.f20804X.clear();
    }

    /* JADX INFO: renamed from: y3 */
    public final Relationship m35333y3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, String str) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get(z ? "liked" : RelationshipStatus.disliked);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            relationship.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("superLike"));
        }
        relationship.status = arrayList;
        if (userM116503Pa != null) {
            if (!TextUtils.isEmpty(userM116503Pa.ussTracker)) {
                relationship.ussTracker = userM116503Pa.ussTracker;
            }
            UssTags ussTags = userM116503Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM116503Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.m82486a(userM116503Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM116503Pa.anonymousLike.itemId;
            }
        }
        return relationship;
    }

    /* JADX INFO: renamed from: z3 */
    public final Long m35334z3(Relationship relationship) {
        boolean z = false;
        boolean z2 = !jyb.m147479J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        if (z2 && gta.m132210e().m132214d().mo34854ig()) {
            z = true;
        }
        String strM155388i4 = lqb.m155388i4(z);
        relationship.consumeType = strM155388i4;
        if (z2) {
            return CoreModule.f18264c.f20312H0.m155465s5(strM155388i4, SummarizedPrivilegesId.get("superLike"));
        }
        return null;
    }
}
