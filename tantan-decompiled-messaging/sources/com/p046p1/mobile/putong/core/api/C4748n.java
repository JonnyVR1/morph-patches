package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4748n;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.core.data.CardStyle;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.ia20;
import p149l.j760;
import p149l.qib0;
import p149l.roj0;
import p149l.rzh0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xob;
import p149l.zew;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.n */
/* JADX INFO: loaded from: classes9.dex */
public class C4748n extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f20056R;

    /* JADX INFO: renamed from: S */
    public zpd0 f20057S;

    /* JADX INFO: renamed from: T */
    public zpd0 f20058T;

    /* JADX INFO: renamed from: U */
    public User f20059U;

    /* JADX INFO: renamed from: V */
    public CoreSuggested.UserInfo f20060V;

    /* JADX INFO: renamed from: W */
    public CoreSuggested.UserInfo f20061W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f20062X;

    /* JADX INFO: renamed from: Y */
    public C22392a<PartialListOpt<CoreSuggested.UserInfo>> f20063Y;

    /* JADX INFO: renamed from: Z */
    public C22393b<roj0> f20064Z;

    /* JADX INFO: renamed from: a0 */
    public C22392a<roj0> f20065a0;

    /* JADX INFO: renamed from: b0 */
    public int f20066b0;

    /* JADX INFO: renamed from: c0 */
    public zew<String, Object> f20067c0;

    public C4748n(C4732c c4732c) {
        super(c4732c);
        this.f20059U = null;
        this.f20062X = new HashSet<>();
        this.f20063Y = C22392a.m221512b();
        this.f20064Z = C22393b.m221521b();
        this.f20065a0 = C22392a.m221512b();
        this.f20066b0 = 1;
        this.f20067c0 = new zew<>(20);
        this.f20056R = new zpd0("today_tribe_start_swipe_time_" + CoreModule.m29931H().userId(), 0L);
        this.f20057S = new zpd0("today_tribe_swipe_count_" + CoreModule.m29931H().userId(), 0L);
        this.f20058T = new zpd0("today_tribe_right_swipe_count_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Relationship m34282g3(Envelope envelope) {
        if (CoreModule.f17545c.m31484o3() == null) {
            CoreModule.f17545c.m31474F3(envelope.counters);
        } else {
            envelope.counters.mergeData(CoreModule.f17545c.m31484o3());
            CoreModule.f17545c.m31474F3(envelope.counters);
        }
        if (!((CoreData) envelope.getModuleData(CoreData.class)).relationships.isEmpty()) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m34288m3(User user) {
        if (user.hasPic()) {
            qib0.f154691G.m102379z0(ura.m195053e().m195057d().mo33782Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final int m34298A3() {
        return this.f20066b0;
    }

    /* JADX INFO: renamed from: B3 */
    public C22306c<roj0> m34299B3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f72126Q.scheduled("users/suggested/intl_tribe/insert", 0, new v9j() { // from class: l.ja9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f117069a.m34301D3(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m34300C3(int i, CoreSuggested.UserInfo userInfo, roj0 roj0Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = this.f20063Y.m221515e();
        List arrayList = partialListOptM221515e == null ? new ArrayList() : partialListOptM221515e.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f20062X.add(userInfo.f19472id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20063Y.m132487l(new PartialListOpt<>(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22306c m34301D3(final int i, final CoreSuggested.UserInfo userInfo) {
        return C22306c.fromCallable(new Callable() { // from class: l.ka9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.la9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127174a.m34300C3(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m34302E3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f72126Q.f19687u0.m30491x7(userInfo.f19472id);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22306c m34303F3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C4759y.m34905m3(userInfo.f19472id, relationship, map).compose(rzh0.m181751e(l2)).materialize().map(new w9j() { // from class: l.pa9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147957a.m34304G3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.qa9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4748n.m34282g3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.ra9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158494a.m34302E3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Notification m34304G3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m34317T3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m34305H3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
        Relationship relationship = ((CoreData) ((Envelope) notification.m221295f()).getModuleData(CoreData.class)).relationships.get(0);
        User userM169433Q9 = this.f72126Q.f19639e0.m169433Q9(userInfo.f19472id);
        if (userM169433Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM169433Q9 = user;
            }
        }
        userM169433Q9.localRelationship = relationship;
        if (TEnum.equals(relationship.state, "matched")) {
            if (user != null) {
                user.localRelationship = userM169433Q9.localRelationship;
            }
            qib0.f154722k0.f176631d.upsert(userM169433Q9);
            this.f72126Q.f19642f0.m33156vf(userM169433Q9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m34306I3(j760 j760Var) {
        Envelope envelope = (Envelope) j760Var.f116564a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        Counter counter = envelope.counters;
        if (counterM31484o3 == null) {
            CoreModule.f17545c.m31474F3(counter);
        } else {
            counter.mergeData(CoreModule.f17545c.m31484o3());
            CoreModule.f17545c.m31474F3(envelope.counters);
        }
        if (ConnectivityReceiver.m81286i()) {
            if (!vwb.m200296J(commonData.users)) {
                m34319V3(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
            this.f72126Q.m31494y3(envelope, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m34307J3(Throwable th) {
        qib0.f154693H.guessedCurrentServerTime();
        if (NullChecker.m81303a(this.f20063Y.m221515e()) && NullChecker.m81303a(this.f20063Y.m221515e().loaded)) {
            this.f20063Y.m221515e().loaded.size();
        }
        this.f20065a0.m132487l(roj0.f160388a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m34308K3(j760 j760Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = this.f20063Y.m221515e();
        List arrayList = partialListOptM221515e == null ? new ArrayList() : partialListOptM221515e.loaded;
        Envelope envelope = (Envelope) j760Var.f116564a;
        HashMap map = new HashMap();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cardInfos)) {
            for (CardInfos cardInfos : ((CoreData) envelope.getModuleData(CoreData.class)).cardInfos) {
                if (NullChecker.m81303a(cardInfos)) {
                    map.put(cardInfos.userId, cardInfos);
                }
            }
        }
        HashMap map2 = new HashMap();
        List<SuggestedComplimentItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).compliments;
        if (!vwb.m200296J(list)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list) {
                if (NullChecker.m81303a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.receiverId)) {
                    map2.putIfAbsent(suggestedComplimentItem.receiverId, suggestedComplimentItem);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).likedMes)) {
            for (CardStyle cardStyle : ((CoreData) envelope.getModuleData(CoreData.class)).likedMes) {
                if (NullChecker.m81303a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    arrayList2.add(cardStyle.userId);
                }
            }
        }
        boolean z = false;
        if (NullChecker.m81303a(envelope.getModuleData(CommonData.class)) && !vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list2 = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map3 = new HashMap();
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
                for (CoreMomentInfo coreMomentInfo : ((CoreData) envelope.getModuleData(CoreData.class)).moments) {
                    if (NullChecker.m81303a(coreMomentInfo)) {
                        map3.put(coreMomentInfo.f56008id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!vwb.m200296J(list2)) {
                for (final User user : list2) {
                    if (!this.f20062X.contains(user.f56011id) && !vwb.m200337m(arrayList, new w9j() { // from class: l.ea9
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).f19472id, user.f56011id));
                        }
                    })) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = user.f56011id;
                        userInfo.f19472id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(user.f56011id));
                        if (NullChecker.m81303a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map3.get(userInfo.cardInfos.momentId);
                        }
                        userInfo.compliment = (SuggestedComplimentItem) map2.get(userInfo.f19472id);
                        arrayList.add(userInfo);
                        this.f20062X.add(user.f56011id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        this.f20063Y.m132487l(new PartialListOpt<>(arrayList, dbLinksNew_));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22306c m34309L3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.y99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).flatMap(new w9j() { // from class: l.z99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(vwb.m200311Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new e30() { // from class: l.aa9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68282a.m34306I3((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.ba9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74660a.m34307J3((Throwable) obj);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.ca9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80012a.m34308K3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m34311N3(final String str, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.sa9
            @Override // java.lang.Runnable
            public final void run() {
                this.f163340a.m34310M3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m34312O3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            qib0.f154722k0.f176631d.insert(user);
            userInfo.isUndo = true;
            m34299B3(userInfo, 0);
            m34328w3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Relationship m34313P3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.da9
            @Override // p149l.d30
            public final void call() {
                this.f85202a.m34312O3(envelope, user, userInfo);
            }
        });
        return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ C22306c m34314Q3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C4759y.m34905m3(user.f56011id, relationship, map).map(new w9j() { // from class: l.ta9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169101a.m34313P3(user, userInfo, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: R3 */
    public C22306c<Relationship> m34315R3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, String str, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
        if (map == null) {
            map = new HashMap<>();
        }
        final Map<String, String> map2 = map;
        if (likeExtraData != null) {
            map2.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
        }
        if (userInfo == null) {
            CrashHelper.m81296c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation at moment"));
            return C22306c.just(Relationship.new_());
        }
        this.f20066b0 = i;
        final Relationship relationshipM34330y3 = m34330y3(z, z2, userInfo, str);
        final Long lM34331z3 = m34331z3(relationshipM34330y3);
        this.f20059U = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        this.f20060V = userInfo;
        return this.f72126Q.scheduled("intl_tribe_like_slide", -1, new v9j() { // from class: l.oa9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f142787a.m34303F3(userInfo, relationshipM34330y3, map2, lM34331z3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: S3 */
    public void m34316S3() {
        this.f20065a0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m34317T3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.m221299j()) {
            this.f20062X.remove(userInfo.f19472id);
            return;
        }
        if (notification.m221300k()) {
            User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(userInfo.f19472id);
            if (TEnum.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).state, "matched")) {
                ArrayList arrayList = new ArrayList();
                if (z && userM169433Q9 != null && userM169433Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLikedEach));
                } else if (z || (userM169433Q9 != null && userM169433Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get(MatchFrom.superLiked));
                }
                if (userM169433Q9 != null && userM169433Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status.contains(MatchFrom.get(MatchFrom.vipseen)) && !arrayList.contains(MatchFrom.get(MatchFrom.vipseen))) {
                    arrayList.add(MatchFrom.get(MatchFrom.vipseen));
                }
                ((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).status = arrayList;
                if (user == null && (user3 = this.f20059U) != null && user3.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                    m34328w3();
                }
            } else if (user == null && (user2 = this.f20059U) != null && user2.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                this.f20060V.canUndo = true;
            }
            this.f72126Q.m31492w3(notification.m221295f(), new d30() { // from class: l.ga9
                @Override // p149l.d30
                public final void call() {
                    this.f101648a.m34305H3(notification, userInfo, user);
                }
            });
            this.f72126Q.f19687u0.m30488w7(userInfo.f19472id);
        }
    }

    /* JADX INFO: renamed from: U3, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m34310M3(String str, String str2) {
        final String strM31314j2 = C4728a.m31314j2(qib0.f154717f0, str, str2);
        this.f20064Z.m132487l(roj0.f160388a);
        return this.f72126Q.scheduled("users/suggested/intl_tribe", 0, new v9j() { // from class: l.x99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f191581a.m34309L3(strM31314j2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m34319V3(List<User> list) {
        vwb.m200354z(vwb.m200291E(list), new e30() { // from class: l.fa9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4748n.m34288m3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m34320W3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m34321X3(new w9j() { // from class: l.ha9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f19472id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m34321X3(w9j<CoreSuggested.UserInfo, Boolean> w9jVar) {
        if (this.f20063Y.m221515e() == null || vwb.m200296J(this.f20063Y.m221515e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20063Y.m221515e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (w9jVar.call(next).booleanValue()) {
                this.f20062X.remove(next.f19472id);
                it.remove();
                this.f20063Y.m221515e().setRefreshValue(true);
                C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f20063Y;
                c22392a.m132487l(c22392a.m221515e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m34322Y3(List<String> list) {
        if (list == null || list.size() == 0 || this.f20063Y.m221515e() == null || vwb.m200296J(this.f20063Y.m221515e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20063Y.m221515e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m81303a(next) && list.contains(next.f19472id)) {
                this.f20062X.remove(next.f19472id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m34323Z3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f20063Y.m221515e() != null && !vwb.m200296J(this.f20063Y.m221515e().loaded)) {
            Iterator<CoreSuggested.UserInfo> it = this.f20063Y.m221515e().loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f20063Y.m221515e().loaded.size();
                    du2.m113670a("BifrostLayout", "moment 删除List数据：" + next.f19472id + ", " + this.f20063Y.m221515e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f20063Y.m221515e().setRefreshValue(vwb.m200296J(this.f20063Y.m221515e().loaded));
            C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f20063Y;
            c22392a.m132487l(c22392a.m221515e());
        }
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<roj0> m34324a4() {
        return this.f20064Z.asObservable();
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<roj0> m34325b4() {
        return this.f20065a0.asObservable();
    }

    /* JADX INFO: renamed from: c4 */
    public C22306c<PartialListOpt<CoreSuggested.UserInfo>> m34326c4(final String str, final String str2) {
        return this.f20063Y.doOnSubscribe(new d30() { // from class: l.ia9
            @Override // p149l.d30
            public final void call() {
                this.f112289a.m34311N3(str, str2);
            }
        }).filter(new w9j() { // from class: l.ma9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public C22306c<Relationship> m34327d4(final Map<String, String> map, String str) {
        User user = this.f20059U;
        if (user == null) {
            return null;
        }
        final User userMo223809clone = user.mo223809clone();
        final CoreSuggested.UserInfo userInfoM223816clone = this.f20060V.m223816clone();
        final Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get("default");
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userMo223809clone.f56011id);
        if (NullChecker.m81303a(userM169430Pa) && !TextUtils.isEmpty(userM169430Pa.ussTracker)) {
            relationship.ussTracker = userM169430Pa.ussTracker;
        }
        return this.f72126Q.scheduled("undo_theme_slide", -1, new v9j() { // from class: l.na9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137866a.m34314Q3(userMo223809clone, relationship, map, userInfoM223816clone);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m34328w3() {
        this.f20059U = null;
        this.f20060V = null;
        this.f20066b0 = 1;
    }

    /* JADX INFO: renamed from: x3 */
    public void m34329x3() {
        CoreModule.f17545c.clearRequests("users/suggested/intl_tribe", 0);
        CoreModule.f17545c.clearRequests("users/suggested/intl_tribe/insert", 0);
        this.f20062X.clear();
    }

    /* JADX INFO: renamed from: y3 */
    public final Relationship m34330y3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, String str) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get(z ? "liked" : RelationshipStatus.disliked);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            relationship.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("superLike"));
        }
        relationship.status = arrayList;
        if (userM169430Pa != null) {
            if (!TextUtils.isEmpty(userM169430Pa.ussTracker)) {
                relationship.ussTracker = userM169430Pa.ussTracker;
            }
            UssTags ussTags = userM169430Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM169430Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.m81303a(userM169430Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM169430Pa.anonymousLike.itemId;
            }
        }
        return relationship;
    }

    /* JADX INFO: renamed from: z3 */
    public final Long m34331z3(Relationship relationship) {
        boolean z = false;
        boolean z2 = !vwb.m200296J(relationship.status) && relationship.status.contains(MatchFrom.get(MatchFrom.superLiked));
        if (z2 && ura.m195053e().m195057d().mo33851ig()) {
            z = true;
        }
        String strM210300i4 = xob.m210300i4(z);
        relationship.consumeType = strM210300i4;
        if (z2) {
            return CoreModule.f17545c.f19570H0.m210377s5(strM210300i4, SummarizedPrivilegesId.get("superLike"));
        }
        return null;
    }
}
