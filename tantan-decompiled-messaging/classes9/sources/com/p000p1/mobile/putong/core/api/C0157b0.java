package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0157b0;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfos;
import com.p1.mobile.putong.core.data.CardStyle;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
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
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import p006l.ura;
import p006l.xob;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.b0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0157b0 extends ax6 {

    /* JADX INFO: renamed from: a0 */
    public static HashMap<String, String> f3527a0 = new HashMap<>();

    /* JADX INFO: renamed from: R */
    public User f3528R;

    /* JADX INFO: renamed from: S */
    public CoreSuggested.UserInfo f3529S;

    /* JADX INFO: renamed from: T */
    public CoreSuggested.UserInfo f3530T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f3531U;

    /* JADX INFO: renamed from: V */
    public a<PartialListOpt<CoreSuggested.UserInfo>> f3532V;

    /* JADX INFO: renamed from: W */
    public b<roj0> f3533W;

    /* JADX INFO: renamed from: X */
    public a<roj0> f3534X;

    /* JADX INFO: renamed from: Y */
    public int f3535Y;

    /* JADX INFO: renamed from: Z */
    public zew<String, Object> f3536Z;

    public C0157b0(C0158c c0158c) {
        super(c0158c);
        this.f3528R = null;
        this.f3531U = new HashSet<>();
        this.f3532V = a.b();
        this.f3533W = b.b();
        this.f3534X = a.b();
        this.f3535Y = 1;
        this.f3536Z = new zew<>(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m3339G3(j760 j760Var) {
        Envelope envelope = (Envelope) j760Var.a;
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        ura.m25555e().m25559d().m5610Dg("moment suggested data back");
        if (ConnectivityReceiver.i()) {
            ura.m25555e().m25559d().m5610Dg("moment prefetch image to disk");
            if (!vwb.J(moduleData.users)) {
                m3342T3(envelope.getModuleData(CommonData.class).users);
            }
            this.f8580Q.m3424y3(envelope, null, true, false, true);
            ura.m25555e().m25559d().m5610Dg("moment database merge suggested data end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m3340H3(Throwable th) {
        qib0.f19784H.guessedCurrentServerTime();
        if (NullChecker.a(this.f3532V.e()) && NullChecker.a(((PartialListOpt) this.f3532V.e()).loaded)) {
            ((PartialListOpt) this.f3532V.e()).loaded.size();
        }
        this.f3534X.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: R3 */
    private void m3341R3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.j()) {
            this.f3531U.remove(userInfo.f3461id);
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
                if (user == null && (user3 = this.f3528R) != null && ((DbObject) user3).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                    m3388v3();
                }
            } else if (user == null && (user2 = this.f3528R) != null && ((DbObject) user2).id.equals(((Relationship) ((Envelope) notification.f()).getModuleData(CoreData.class).relationships.get(0)).id)) {
                this.f3529S.canUndo = true;
            }
            this.f8580Q.m3422w3((Envelope) notification.f(), new d30() { // from class: l.q8b
                public final void call() {
                    this.f19667a.m3369F3(notification, userInfo, user);
                }
            });
            this.f8580Q.f3676u0.m2416w7(userInfo.f3461id);
        }
    }

    /* JADX INFO: renamed from: T3 */
    private void m3342T3(List<User> list) {
        vwb.z(vwb.E(list), new e30() { // from class: l.o8b
            public final void call(Object obj) {
                C0157b0.m3354l3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Relationship m3350h3(Envelope envelope) {
        if (!envelope.getModuleData(CoreData.class).relationships.isEmpty()) {
            return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m3354l3(User user) {
        if (user.hasPic()) {
            qib0.f19782G.m12792z0(ura.m25555e().m25559d().m5719Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m3364A3(int i, CoreSuggested.UserInfo userInfo, roj0 roj0Var) {
        PartialListOpt partialListOpt = (PartialListOpt) this.f3532V.e();
        List arrayList = partialListOpt == null ? new ArrayList() : partialListOpt.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f3531U.add(userInfo.f3461id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f3532V.onNext(new PartialListOpt(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ c m3365B3(final int i, final CoreSuggested.UserInfo userInfo) {
        return c.fromCallable(new Callable() { // from class: l.u8b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.v8b
            public final void call(Object obj) {
                this.f24216a.m3364A3(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m3366C3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f8580Q.f3676u0.m2419x7(userInfo.f3461id);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ c m3367D3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C0185y.m6842m3(userInfo.f3461id, relationship, map).compose(rzh0.e(l2)).materialize().map(new w9j() { // from class: l.z8b
            public final Object call(Object obj) {
                return this.f28669a.m3368E3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.a9b
            public final Object call(Object obj) {
                return C0157b0.m3350h3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.b9b
            public final void call(Object obj) {
                this.f8781a.m3366C3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Notification m3368E3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m3341R3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m3369F3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
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
    public final /* synthetic */ roj0 m3370I3(j760 j760Var) {
        PartialListOpt partialListOpt = (PartialListOpt) this.f3532V.e();
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
            List<User> list = envelope.getModuleData(CommonData.class).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map2 = new HashMap();
            if (!vwb.J(envelope.getModuleData(CoreData.class).moments)) {
                for (CoreMomentInfo coreMomentInfo : envelope.getModuleData(CoreData.class).moments) {
                    if (NullChecker.a(coreMomentInfo)) {
                        map2.put(((CopyObject) coreMomentInfo).id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!vwb.J(list)) {
                for (User user : list) {
                    if (!this.f3531U.contains(((DbObject) user).id)) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = ((DbObject) user).id;
                        userInfo.f3461id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(((DbObject) user).id));
                        if (NullChecker.a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map2.get(userInfo.cardInfos.momentId);
                        }
                        arrayList.add(userInfo);
                        this.f3531U.add(((DbObject) user).id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        ura.m25555e().m25559d().m5610Dg("moment suggested data emmit");
        this.f3532V.onNext(new PartialListOpt(arrayList, dbLinksNew_));
        return roj0.a;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ c m3371J3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.c9b
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).flatMap(new w9j() { // from class: l.d9b
            public final Object call(Object obj) {
                return c.just(vwb.Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new e30() { // from class: l.j8b
            public final void call(Object obj) {
                this.f15055a.m3339G3((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.k8b
            public final void call(Object obj) {
                this.f15650a.m3340H3((Throwable) obj);
            }
        }).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.l8b
            public final Object call(Object obj) {
                return this.f16265a.m3370I3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m3373L3(final String str) {
        e51.M(new Runnable() { // from class: l.n8b
            @Override // java.lang.Runnable
            public final void run() {
                this.f17531a.m3372K3(str);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m3374M3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((Relationship) envelope.getModuleData(CoreData.class).relationships.get(0)).state, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            qib0.f19813k0.f23551d.insert(user);
            userInfo.isUndo = true;
            m3392z3(userInfo, 0);
            m3388v3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Relationship m3375N3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.p8b
            public final void call() {
                this.f18628a.m3374M3(envelope, user, userInfo);
            }
        });
        return (Relationship) envelope.getModuleData(CoreData.class).relationships.get(0);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ c m3376O3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C0185y.m6842m3(((DbObject) user).id, relationship, map).map(new w9j() { // from class: l.m8b
            public final Object call(Object obj) {
                return this.f16852a.m3375N3(user, userInfo, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: P3 */
    public c<Relationship> m3377P3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
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
        this.f3535Y = i;
        final Relationship relationshipM3389w3 = m3389w3(z, z2, userInfo, likeFrom);
        final Long lM3390x3 = m3390x3(relationshipM3389w3, likeFrom);
        this.f3528R = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        this.f3529S = userInfo;
        return this.f8580Q.scheduled("cardlike_theme_slide", -1, new v9j() { // from class: l.y8b
            public final Object call() {
                return this.f28070a.m3367D3(userInfo, relationshipM3389w3, map2, lM3390x3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m3378Q3() {
        this.f3534X.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: S3, reason: merged with bridge method [inline-methods] */
    public c<roj0> m3372K3(String str) {
        final String strM3248k2 = C0154a.m3248k2(str);
        this.f3533W.onNext(roj0.a);
        return this.f8580Q.scheduled("users/suggested/themeSlide", 0, new v9j() { // from class: l.t8b
            public final Object call() {
                return this.f21950a.m3371J3(strM3248k2);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m3380U3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m3381V3(new w9j() { // from class: l.s8b
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f3461id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m3381V3(w9j<CoreSuggested.UserInfo, Boolean> w9jVar) {
        if (this.f3532V.e() == null || vwb.J(((PartialListOpt) this.f3532V.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f3532V.e()).loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
            if (((Boolean) w9jVar.call(userInfo)).booleanValue()) {
                this.f3531U.remove(userInfo.f3461id);
                it.remove();
                ((PartialListOpt) this.f3532V.e()).setRefreshValue(true);
                a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f3532V;
                aVar.onNext((PartialListOpt) aVar.e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m3382W3(List<String> list) {
        if (list == null || list.size() == 0 || this.f3532V.e() == null || vwb.J(((PartialListOpt) this.f3532V.e()).loaded)) {
            return;
        }
        Iterator it = ((PartialListOpt) this.f3532V.e()).loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
            if (NullChecker.a(userInfo) && list.contains(userInfo.f3461id)) {
                this.f3531U.remove(userInfo.f3461id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public boolean m3383X3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f3532V.e() != null && !vwb.J(((PartialListOpt) this.f3532V.e()).loaded)) {
            Iterator it = ((PartialListOpt) this.f3532V.e()).loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) it.next();
                if (NullChecker.a(userInfo2) && (userInfo2.equals(userInfo) || ((TextUtils.equals(userInfo.f3461id, userInfo2.f3461id) && !userInfo.isVirtualCard()) || (userInfo2.isVirtualCard() && userInfo.isVirtualCard() && userInfo2.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    ((PartialListOpt) this.f3532V.e()).loaded.size();
                    du2.a("BifrostLayout", "moment 删除List数据：" + userInfo2.f3461id + ", " + ((PartialListOpt) this.f3532V.e()).loaded.size());
                    z = true;
                    break;
                }
            }
            ((PartialListOpt) this.f3532V.e()).setRefreshValue(vwb.J(((PartialListOpt) this.f3532V.e()).loaded));
            a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f3532V;
            aVar.onNext((PartialListOpt) aVar.e());
        }
        return z;
    }

    /* JADX INFO: renamed from: Y3 */
    public c<roj0> m3384Y3() {
        return this.f3533W.asObservable();
    }

    /* JADX INFO: renamed from: Z3 */
    public c<roj0> m3385Z3() {
        return this.f3534X.asObservable();
    }

    /* JADX INFO: renamed from: a4 */
    public c<PartialListOpt<CoreSuggested.UserInfo>> m3386a4(final String str) {
        return this.f3532V.doOnSubscribe(new d30() { // from class: l.w8b
            public final void call() {
                this.f25029a.m3373L3(str);
            }
        }).filter(new w9j() { // from class: l.x8b
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.b((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public c<Relationship> m3387b4(final Map<String, String> map) {
        User user = this.f3528R;
        if (user == null) {
            return null;
        }
        final User userClone = user.clone();
        final CoreSuggested.UserInfo userInfoM28959clone = this.f3529S.m28959clone();
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get(CameraSticker.CATEGORY_DEFAULT_FILTER);
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) userClone).id);
        if (NullChecker.a(userM21393Pa) && !TextUtils.isEmpty(userM21393Pa.ussTracker)) {
            relationship.ussTracker = userM21393Pa.ussTracker;
        }
        return this.f8580Q.scheduled("undo_theme_slide", -1, new v9j() { // from class: l.i8b
            public final Object call() {
                return this.f14301a.m3376O3(userClone, relationship, map, userInfoM28959clone);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m3388v3() {
        this.f3528R = null;
        this.f3529S = null;
        this.f3535Y = 1;
    }

    /* JADX INFO: renamed from: w3 */
    public final Relationship m3389w3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, LikeFrom likeFrom) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        relationship.state = RelationshipStatus.get(z ? "liked" : "disliked");
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(userInfo.f3461id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get("superLiked"));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
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

    /* JADX INFO: renamed from: x3 */
    public final Long m3390x3(Relationship relationship, LikeFrom likeFrom) {
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

    /* JADX INFO: renamed from: y3 */
    public final int m3391y3() {
        return this.f3535Y;
    }

    /* JADX INFO: renamed from: z3 */
    public c<roj0> m3392z3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f8580Q.scheduled("users/suggested/themeSlide/insert", 0, new v9j() { // from class: l.r8b
            public final Object call() {
                return this.f20407a.m3365B3(i, userInfo);
            }
        });
    }
}
