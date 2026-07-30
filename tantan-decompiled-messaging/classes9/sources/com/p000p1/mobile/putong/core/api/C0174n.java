package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0174n;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfos;
import com.p1.mobile.putong.core.data.CardStyle;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
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
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.j760;
import l.roj0;
import l.rzh0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zew;
import l.zpd0;
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import p006l.ura;
import p006l.xob;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.n */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0174n extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f4045R;

    /* JADX INFO: renamed from: S */
    public zpd0 f4046S;

    /* JADX INFO: renamed from: T */
    public zpd0 f4047T;

    /* JADX INFO: renamed from: U */
    public User f4048U;

    /* JADX INFO: renamed from: V */
    public CoreSuggested.UserInfo f4049V;

    /* JADX INFO: renamed from: W */
    public CoreSuggested.UserInfo f4050W;

    /* JADX INFO: renamed from: X */
    public final HashSet<String> f4051X;

    /* JADX INFO: renamed from: Y */
    public a<PartialListOpt<CoreSuggested.UserInfo>> f4052Y;

    /* JADX INFO: renamed from: Z */
    public b<roj0> f4053Z;

    /* JADX INFO: renamed from: a0 */
    public a<roj0> f4054a0;

    /* JADX INFO: renamed from: b0 */
    public int f4055b0;

    /* JADX INFO: renamed from: c0 */
    public zew<String, Object> f4056c0;

    public C0174n(C0158c c0158c) {
        super(c0158c);
        this.f4048U = null;
        this.f4051X = new HashSet<>();
        this.f4052Y = a.b();
        this.f4053Z = b.b();
        this.f4054a0 = a.b();
        this.f4055b0 = 1;
        this.f4056c0 = new zew<>(20);
        this.f4045R = new zpd0("today_tribe_start_swipe_time_" + CoreModule.m1850H().userId(), 0L);
        this.f4046S = new zpd0("today_tribe_swipe_count_" + CoreModule.m1850H().userId(), 0L);
        this.f4047T = new zpd0("today_tribe_right_swipe_count_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Relationship m6219g3(Envelope envelope) {
        if (CoreModule.f1534c.m3414o3() == null) {
            CoreModule.f1534c.m3404F3(envelope.counters);
        } else {
            envelope.counters.mergeData(CoreModule.f1534c.m3414o3());
            CoreModule.f1534c.m3404F3(envelope.counters);
        }
        if (!envelope.getModuleData(CoreData.class).relationships.isEmpty()) {
            return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m6225m3(User user) {
        if (user.hasPic()) {
            qib0.f19782G.m12792z0(ura.m25555e().m25559d().m5719Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final int m6235A3() {
        return this.f4055b0;
    }

    /* JADX INFO: renamed from: B3 */
    public c<roj0> m6236B3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f8580Q.scheduled("users/suggested/intl_tribe/insert", 0, new v9j() { // from class: l.ja9
            public final Object call() {
                return this.f15085a.m6238D3(i, userInfo);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m6237C3(int i, CoreSuggested.UserInfo userInfo, roj0 roj0Var) {
        PartialListOpt partialListOpt = (PartialListOpt) this.f4052Y.e();
        List arrayList = partialListOpt == null ? new ArrayList() : partialListOpt.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f4051X.add(userInfo.f3461id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f4052Y.onNext(new PartialListOpt(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ c m6238D3(final int i, final CoreSuggested.UserInfo userInfo) {
        return c.fromCallable(new Callable() { // from class: l.ka9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.la9
            public final void call(Object obj) {
                this.f16300a.m6237C3(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m6239E3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f8580Q.f3676u0.m2419x7(userInfo.f3461id);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ c m6240F3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C0185y.m6842m3(userInfo.f3461id, relationship, map).compose(rzh0.e(l2)).materialize().map(new w9j() { // from class: l.pa9
            public final Object call(Object obj) {
                return this.f18656a.m6241G3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.qa9
            public final Object call(Object obj) {
                return C0174n.m6219g3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.ra9
            public final void call(Object obj) {
                this.f20463a.m6239E3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ Notification m6241G3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m6254T3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m6242H3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
        Relationship relationship = (Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0);
        User userM21396Q9 = this.f8580Q.f3628e0.m21396Q9(userInfo.f3461id);
        if (userM21396Q9 == null) {
            if (user == null) {
                return;
            } else {
                userM21396Q9 = user;
            }
        }
        userM21396Q9.localRelationship = relationship;
        if (TEnum.equals(relationship.state, "matched")) {
            if (user != null) {
                user.localRelationship = userM21396Q9.localRelationship;
            }
            qib0.f19813k0.f23551d.upsert(userM21396Q9);
            this.f8580Q.f3631f0.m5086vf(userM21396Q9);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m6243I3(j760 j760Var) {
        Envelope envelope = (Envelope) j760Var.a;
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        Counter counterM3414o3 = CoreModule.f1534c.m3414o3();
        Counter counter = envelope.counters;
        if (counterM3414o3 == null) {
            CoreModule.f1534c.m3404F3(counter);
        } else {
            counter.mergeData(CoreModule.f1534c.m3414o3());
            CoreModule.f1534c.m3404F3(envelope.counters);
        }
        if (ConnectivityReceiver.i()) {
            if (!vwb.J(moduleData.users)) {
                m6256V3(envelope.getModuleData(CommonData.class).users);
            }
            this.f8580Q.m3424y3(envelope, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m6244J3(Throwable th) {
        qib0.f19784H.guessedCurrentServerTime();
        if (NullChecker.a(this.f4052Y.e()) && NullChecker.a(((PartialListOpt) this.f4052Y.e()).loaded)) {
            ((PartialListOpt) this.f4052Y.e()).loaded.size();
        }
        this.f4054a0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m6245K3(j760 j760Var) {
        PartialListOpt partialListOpt = (PartialListOpt) this.f4052Y.e();
        List arrayList = partialListOpt == null ? new ArrayList() : partialListOpt.loaded;
        Envelope envelope = (Envelope) j760Var.a;
        HashMap map = new HashMap();
        if (!vwb.J(envelope.getModuleData(CoreData.class).cardInfos)) {
            for (CardInfos cardInfos : envelope.getModuleData(CoreData.class).cardInfos) {
                if (NullChecker.a(cardInfos)) {
                    map.put(cardInfos.userId, cardInfos);
                }
            }
        }
        HashMap map2 = new HashMap();
        List<SuggestedComplimentItem> list = envelope.getModuleData(CoreData.class).compliments;
        if (!vwb.J(list)) {
            for (SuggestedComplimentItem suggestedComplimentItem : list) {
                if (NullChecker.a(suggestedComplimentItem) && !TextUtils.isEmpty(suggestedComplimentItem.receiverId)) {
                    map2.putIfAbsent(suggestedComplimentItem.receiverId, suggestedComplimentItem);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!vwb.J(envelope.getModuleData(CoreData.class).likedMes)) {
            for (CardStyle cardStyle : envelope.getModuleData(CoreData.class).likedMes) {
                if (NullChecker.a(cardStyle) && cardStyle.label.contains("liked_me")) {
                    arrayList2.add(cardStyle.userId);
                }
            }
        }
        boolean z = false;
        if (NullChecker.a(envelope.getModuleData(CommonData.class)) && !vwb.J(envelope.getModuleData(CommonData.class).users)) {
            List<User> list2 = envelope.getModuleData(CommonData.class).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map3 = new HashMap();
            if (!vwb.J(envelope.getModuleData(CoreData.class).moments)) {
                for (CoreMomentInfo coreMomentInfo : envelope.getModuleData(CoreData.class).moments) {
                    if (NullChecker.a(coreMomentInfo)) {
                        map3.put(((CopyObject) coreMomentInfo).id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!vwb.J(list2)) {
                for (final User user : list2) {
                    if (!this.f4051X.contains(((DbObject) user).id) && !vwb.m(arrayList, new w9j() { // from class: l.ea9
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).f3461id, ((DbObject) user).id));
                        }
                    })) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = ((DbObject) user).id;
                        userInfo.f3461id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(((DbObject) user).id));
                        if (NullChecker.a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map3.get(userInfo.cardInfos.momentId);
                        }
                        userInfo.compliment = (SuggestedComplimentItem) map2.get(userInfo.f3461id);
                        arrayList.add(userInfo);
                        this.f4051X.add(((DbObject) user).id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        this.f4052Y.onNext(new PartialListOpt(arrayList, dbLinksNew_));
        return roj0.a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ c m6246L3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.y99
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).flatMap(new w9j() { // from class: l.z99
            public final Object call(Object obj) {
                return c.just(vwb.Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new e30() { // from class: l.aa9
            public final void call(Object obj) {
                this.f8175a.m6243I3((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.ba9
            public final void call(Object obj) {
                this.f8789a.m6244J3((Throwable) obj);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.ca9
            public final Object call(Object obj) {
                return this.f9558a.m6245K3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m6248N3(final String str, final String str2) {
        e51.M(new Runnable() { // from class: l.sa9
            @Override // java.lang.Runnable
            public final void run() {
                this.f21170a.m6247M3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m6249O3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((Relationship) envelope.getModuleData(CoreData.class).relationships.get(0)).state, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            qib0.f19813k0.f23551d.insert(user);
            userInfo.isUndo = true;
            m6236B3(userInfo, 0);
            m6265w3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Relationship m6250P3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.da9
            public final void call() {
                this.f10250a.m6249O3(envelope, user, userInfo);
            }
        });
        return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ c m6251Q3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C0185y.m6842m3(((DbObject) user).id, relationship, map).map(new w9j() { // from class: l.ta9
            public final Object call(Object obj) {
                return this.f21973a.m6250P3(user, userInfo, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: R3 */
    public c<Relationship> m6252R3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, String str, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
        if (map == null) {
            map = new HashMap<>();
        }
        final Map<String, String> map2 = map;
        if (likeExtraData != null) {
            map2.put("receiver_user_id", likeExtraData.matchScData.receiverUserId);
        }
        if (userInfo == null) {
            CrashHelper.c(new Exception("Like Api Error: Perhaps suggested users were cleared or reset when doing Swipe Card Animation at moment"));
            return c.just(Relationship.new_());
        }
        this.f4055b0 = i;
        final Relationship relationshipM6267y3 = m6267y3(z, z2, userInfo, str);
        final Long lM6268z3 = m6268z3(relationshipM6267y3);
        this.f4048U = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        this.f4049V = userInfo;
        return this.f8580Q.scheduled("intl_tribe_like_slide", -1, new v9j() { // from class: l.oa9
            public final Object call() {
                return this.f18097a.m6240F3(userInfo, relationshipM6267y3, map2, lM6268z3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: S3 */
    public void m6253S3() {
        this.f4054a0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m6254T3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.j()) {
            this.f4051X.remove(userInfo.f3461id);
            return;
        }
        if (notification.k()) {
            User userM21396Q9 = CoreModule.f1534c.f3628e0.m21396Q9(userInfo.f3461id);
            if (TEnum.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).state, "matched")) {
                ArrayList arrayList = new ArrayList();
                if (z && userM21396Q9 != null && userM21396Q9.superLikedMe()) {
                    arrayList.add(MatchFrom.get("superLikedEach"));
                } else if (z || (userM21396Q9 != null && userM21396Q9.superLikedMe())) {
                    arrayList.add(MatchFrom.get("superLiked"));
                }
                if (userM21396Q9 != null && userM21396Q9.boosted()) {
                    arrayList.add(MatchFrom.get("boosted"));
                }
                if (((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("secretcrush"))) {
                    arrayList.add(MatchFrom.get("secretcrush"));
                }
                if (((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("online")) && !arrayList.contains(MatchFrom.get("online"))) {
                    arrayList.add(MatchFrom.get("online"));
                }
                if (((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status.contains(MatchFrom.get("vipseen")) && !arrayList.contains(MatchFrom.get("vipseen"))) {
                    arrayList.add(MatchFrom.get("vipseen"));
                }
                ((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).status = arrayList;
                if (user == null && (user3 = this.f4048U) != null && ((DbObject) user3).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                    m6265w3();
                }
            } else if (user == null && (user2 = this.f4048U) != null && ((DbObject) user2).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                this.f4049V.canUndo = true;
            }
            this.f8580Q.m3422w3((Envelope) notification.f(), new d30() { // from class: l.ga9
                public final void call() {
                    this.f13127a.m6242H3(notification, userInfo, user);
                }
            });
            this.f8580Q.f3676u0.m2416w7(userInfo.f3461id);
        }
    }

    /* JADX INFO: renamed from: U3, reason: merged with bridge method [inline-methods] */
    public c<roj0> m6247M3(String str, String str2) {
        final String strM3244j2 = C0154a.m3244j2(qib0.f19808f0, str, str2);
        this.f4053Z.onNext(roj0.a);
        return this.f8580Q.scheduled("users/suggested/intl_tribe", 0, new v9j() { // from class: l.x99
            public final Object call() {
                return this.f27394a.m6246L3(strM3244j2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m6256V3(List<User> list) {
        vwb.z(vwb.E(list), new e30() { // from class: l.fa9
            public final void call(Object obj) {
                C0174n.m6225m3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m6257W3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m6258X3(new w9j() { // from class: l.ha9
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f3461id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public void m6258X3(w9j<CoreSuggested.UserInfo, Boolean> w9jVar) {
        if (this.f4052Y.e() == null || vwb.J(((PartialListOpt) this.f4052Y.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f4052Y.e()).loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
            if (((Boolean) w9jVar.call(userInfo)).booleanValue()) {
                this.f4051X.remove(userInfo.f3461id);
                it.remove();
                ((PartialListOpt) this.f4052Y.e()).setRefreshValue(true);
                a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f4052Y;
                aVar.onNext((PartialListOpt) aVar.e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m6259Y3(List<String> list) {
        if (list == null || list.size() == 0 || this.f4052Y.e() == null || vwb.J(((PartialListOpt) this.f4052Y.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f4052Y.e()).loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
            if (NullChecker.a(userInfo) && list.contains(userInfo.f3461id)) {
                this.f4051X.remove(userInfo.f3461id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m6260Z3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f4052Y.e() != null && !vwb.J(((PartialListOpt) this.f4052Y.e()).loaded)) {
            Iterator it = ((PartialListOpt) this.f4052Y.e()).loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) it.next();
                if (NullChecker.a(userInfo2) && (userInfo2.equals(userInfo) || ((TextUtils.equals(userInfo.f3461id, userInfo2.f3461id) && !userInfo.isVirtualCard()) || (userInfo2.isVirtualCard() && userInfo.isVirtualCard() && userInfo2.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    ((PartialListOpt) this.f4052Y.e()).loaded.size();
                    du2.a("BifrostLayout", "moment 删除List数据：" + userInfo2.f3461id + ", " + ((PartialListOpt) this.f4052Y.e()).loaded.size());
                    z = true;
                    break;
                }
            }
            ((PartialListOpt) this.f4052Y.e()).setRefreshValue(vwb.J(((PartialListOpt) this.f4052Y.e()).loaded));
            a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f4052Y;
            aVar.onNext((PartialListOpt) aVar.e());
        }
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public c<roj0> m6261a4() {
        return this.f4053Z.asObservable();
    }

    /* JADX INFO: renamed from: b4 */
    public c<roj0> m6262b4() {
        return this.f4054a0.asObservable();
    }

    /* JADX INFO: renamed from: c4 */
    public c<PartialListOpt<CoreSuggested.UserInfo>> m6263c4(final String str, final String str2) {
        return this.f4052Y.doOnSubscribe(new d30() { // from class: l.ia9
            public final void call() {
                this.f14339a.m6248N3(str, str2);
            }
        }).filter(new w9j() { // from class: l.ma9
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public c<Relationship> m6264d4(final Map<String, String> map, String str) {
        User user = this.f4048U;
        if (user == null) {
            return null;
        }
        final User userClone = user.clone();
        final CoreSuggested.UserInfo userInfoM28959clone = this.f4049V.m28959clone();
        final Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) userClone).id);
        if (NullChecker.a(userM21393Pa) && !TextUtils.isEmpty(userM21393Pa.ussTracker)) {
            relationship.ussTracker = userM21393Pa.ussTracker;
        }
        return this.f8580Q.scheduled("undo_theme_slide", -1, new v9j() { // from class: l.na9
            public final Object call() {
                return this.f17556a.m6251Q3(userClone, relationship, map, userInfoM28959clone);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m6265w3() {
        this.f4048U = null;
        this.f4049V = null;
        this.f4055b0 = 1;
    }

    /* JADX INFO: renamed from: x3 */
    public void m6266x3() {
        CoreModule.f1534c.clearRequests("users/suggested/intl_tribe", 0);
        CoreModule.f1534c.clearRequests("users/suggested/intl_tribe/insert", 0);
        this.f4051X.clear();
    }

    /* JADX INFO: renamed from: y3 */
    public final Relationship m6267y3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, String str) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = str;
        relationship.state = RelationshipStatus.get(z ? "liked" : "disliked");
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get("superLiked"));
            relationship.coinSign = CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("superLike"));
        }
        relationship.status = arrayList;
        if (userM21393Pa != null) {
            if (!TextUtils.isEmpty(userM21393Pa.ussTracker)) {
                relationship.ussTracker = userM21393Pa.ussTracker;
            }
            UssTags ussTags = userM21393Pa.ussTags;
            if (ussTags != null && !TextUtils.isEmpty(ussTags.avatarIdentifier)) {
                relationship.avatarIdentifier = userM21393Pa.ussTags.avatarIdentifier;
            }
            if (NullChecker.a(userM21393Pa.anonymousLike)) {
                relationship.anonymousLikeItemId = userM21393Pa.anonymousLike.itemId;
            }
        }
        return relationship;
    }

    /* JADX INFO: renamed from: z3 */
    public final Long m6268z3(Relationship relationship) {
        boolean z = false;
        boolean z2 = !vwb.J(relationship.status) && relationship.status.contains(MatchFrom.get("superLiked"));
        if (z2 && ura.m25555e().m25559d().m5788ig()) {
            z = true;
        }
        String strM27475i4 = xob.m27475i4(z);
        relationship.consumeType = strM27475i4;
        if (z2) {
            return CoreModule.f1534c.f3559H0.m27552s5(strM27475i4, SummarizedPrivilegesId.get("superLike"));
        }
        return null;
    }
}
