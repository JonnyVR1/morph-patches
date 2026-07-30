package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4882b0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfos;
import com.p051p1.mobile.putong.core.data.CardStyle;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.b0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4882b0 extends dy6 {

    /* JADX INFO: renamed from: a0 */
    public static HashMap<String, String> f20280a0 = new HashMap<>();

    /* JADX INFO: renamed from: R */
    public User f20281R;

    /* JADX INFO: renamed from: S */
    public CoreSuggested.UserInfo f20282S;

    /* JADX INFO: renamed from: T */
    public CoreSuggested.UserInfo f20283T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f20284U;

    /* JADX INFO: renamed from: V */
    public C22507a<PartialListOpt<CoreSuggested.UserInfo>> f20285V;

    /* JADX INFO: renamed from: W */
    public C22508b<uxj0> f20286W;

    /* JADX INFO: renamed from: X */
    public C22507a<uxj0> f20287X;

    /* JADX INFO: renamed from: Y */
    public int f20288Y;

    /* JADX INFO: renamed from: Z */
    public xgw<String, Object> f20289Z;

    public C4882b0(C4883c c4883c) {
        super(c4883c);
        this.f20281R = null;
        this.f20284U = new HashSet<>();
        this.f20285V = C22507a.m222758b();
        this.f20286W = C22508b.m222767b();
        this.f20287X = C22507a.m222758b();
        this.f20288Y = 1;
        this.f20289Z = new xgw<>(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m32412G3(pf60 pf60Var) {
        Envelope envelope = (Envelope) pf60Var.f152156a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        gta.m132210e().m132214d().mo34676Dg("moment suggested data back");
        if (ConnectivityReceiver.m82469i()) {
            gta.m132210e().m132214d().mo34676Dg("moment prefetch image to disk");
            if (!jyb.m147479J(commonData.users)) {
                m32415T3(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
            this.f91137Q.m32497y3(envelope, null, true, false, true);
            gta.m132210e().m132214d().mo34676Dg("moment database merge suggested data end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m32413H3(Throwable th) {
        uqb0.f180376H.guessedCurrentServerTime();
        if (NullChecker.m82486a(this.f20285V.m222761e()) && NullChecker.m82486a(this.f20285V.m222761e().loaded)) {
            this.f20285V.m222761e().loaded.size();
        }
        this.f20287X.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: R3 */
    private void m32414R3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.m222545j()) {
            this.f20284U.remove(userInfo.f20214id);
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
                if (user == null && (user3 = this.f20281R) != null && user3.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                    m32461v3();
                }
            } else if (user == null && (user2 = this.f20281R) != null && user2.f56859id.equals(((CoreData) notification.m222541f().getModuleData(CoreData.class)).relationships.get(0).f39654id)) {
                this.f20282S.canUndo = true;
            }
            this.f91137Q.m32495w3(notification.m222541f(), new x20() { // from class: l.dab
                @Override // p153l.x20
                public final void call() {
                    this.f85859a.m32442F3(notification, userInfo, user);
                }
            });
            this.f91137Q.f20429u0.m31380B7(userInfo.f20214id);
        }
    }

    /* JADX INFO: renamed from: T3 */
    private void m32415T3(List<User> list) {
        jyb.m147537z(jyb.m147474E(list), new y20() { // from class: l.bab
            @Override // p153l.y20
            public final void call(Object obj) {
                C4882b0.m32427l3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Relationship m32423h3(Envelope envelope) {
        if (!((CoreData) envelope.getModuleData(CoreData.class)).relationships.isEmpty()) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m32427l3(User user) {
        if (user.hasPic()) {
            uqb0.f180374G.m127162z0(gta.m132210e().m132214d().mo34785Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m32437A3(int i, CoreSuggested.UserInfo userInfo, uxj0 uxj0Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = this.f20285V.m222761e();
        List arrayList = partialListOptM222761e == null ? new ArrayList() : partialListOptM222761e.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f20284U.add(userInfo.f20214id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f20285V.m137019l(new PartialListOpt<>(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22421c m32438B3(final int i, final CoreSuggested.UserInfo userInfo) {
        return C22421c.fromCallable(new Callable() { // from class: l.hab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.iab
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113572a.m32437A3(i, userInfo, (uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m32439C3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f91137Q.f20429u0.m31383C7(userInfo.f20214id);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22421c m32440D3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C4910y.m35908m3(userInfo.f20214id, relationship, map).compose(z7i0.m218893e(l2)).materialize().map(new qcj() { // from class: l.mab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135495a.m32441E3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.nab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4882b0.m32423h3((Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.oab
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145677a.m32439C3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Notification m32441E3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m32414R3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m32442F3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
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
    public final /* synthetic */ uxj0 m32443I3(pf60 pf60Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = this.f20285V.m222761e();
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
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map2 = new HashMap();
            if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
                for (CoreMomentInfo coreMomentInfo : ((CoreData) envelope.getModuleData(CoreData.class)).moments) {
                    if (NullChecker.m82486a(coreMomentInfo)) {
                        map2.put(coreMomentInfo.f56856id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!jyb.m147479J(list)) {
                for (User user : list) {
                    if (!this.f20284U.contains(user.f56859id)) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = user.f56859id;
                        userInfo.f20214id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(user.f56859id));
                        if (NullChecker.m82486a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map2.get(userInfo.cardInfos.momentId);
                        }
                        arrayList.add(userInfo);
                        this.f20284U.add(user.f56859id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        gta.m132210e().m132214d().mo34676Dg("moment suggested data emmit");
        this.f20285V.m137019l(new PartialListOpt<>(arrayList, dbLinksNew_));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ C22421c m32444J3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.pab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).flatMap(new qcj() { // from class: l.qab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(jyb.m147494Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new y20() { // from class: l.w9b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187991a.m32412G3((pf60) obj);
            }
        }).doOnError(new y20() { // from class: l.x9b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192926a.m32413H3((Throwable) obj);
            }
        }).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.y9b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198073a.m32443I3((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m32446L3(final String str) {
        l51.m152893M(new Runnable() { // from class: l.aab
            @Override // java.lang.Runnable
            public final void run() {
                this.f69114a.m32445K3(str);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m32447M3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            uqb0.f180405k0.f184355d.insert(user);
            userInfo.isUndo = true;
            m32465z3(userInfo, 0);
            m32461v3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Relationship m32448N3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.cab
            @Override // p153l.x20
            public final void call() {
                this.f80565a.m32447M3(envelope, user, userInfo);
            }
        });
        return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22421c m32449O3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C4910y.m35908m3(user.f56859id, relationship, map).map(new qcj() { // from class: l.z9b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203458a.m32448N3(user, userInfo, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<Relationship> m32450P3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
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
        this.f20288Y = i;
        final Relationship relationshipM32462w3 = m32462w3(z, z2, userInfo, likeFrom);
        final Long lM32463x3 = m32463x3(relationshipM32462w3, likeFrom);
        this.f20281R = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        this.f20282S = userInfo;
        return this.f91137Q.scheduled("cardlike_theme_slide", -1, new pcj() { // from class: l.lab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130673a.m32440D3(userInfo, relationshipM32462w3, map2, lM32463x3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m32451Q3() {
        this.f20287X.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: S3, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m32445K3(String str) {
        final String strM32321k2 = C4879a.m32321k2(str);
        this.f20286W.m137019l(uxj0.f181467a);
        return this.f91137Q.scheduled("users/suggested/themeSlide", 0, new pcj() { // from class: l.gab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102972a.m32444J3(strM32321k2);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m32453U3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m32454V3(new qcj() { // from class: l.fab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f20214id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m32454V3(qcj<CoreSuggested.UserInfo, Boolean> qcjVar) {
        if (this.f20285V.m222761e() == null || jyb.m147479J(this.f20285V.m222761e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20285V.m222761e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (qcjVar.call(next).booleanValue()) {
                this.f20284U.remove(next.f20214id);
                it.remove();
                this.f20285V.m222761e().setRefreshValue(true);
                C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f20285V;
                c22507a.m137019l(c22507a.m222761e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m32455W3(List<String> list) {
        if (list == null || list.size() == 0 || this.f20285V.m222761e() == null || jyb.m147479J(this.f20285V.m222761e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f20285V.m222761e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m82486a(next) && list.contains(next.f20214id)) {
                this.f20284U.remove(next.f20214id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public boolean m32456X3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f20285V.m222761e() != null && !jyb.m147479J(this.f20285V.m222761e().loaded)) {
            Iterator<CoreSuggested.UserInfo> it = this.f20285V.m222761e().loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f20285V.m222761e().loaded.size();
                    tu2.m192703a("BifrostLayout", "moment 删除List数据：" + next.f20214id + ", " + this.f20285V.m222761e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f20285V.m222761e().setRefreshValue(jyb.m147479J(this.f20285V.m222761e().loaded));
            C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f20285V;
            c22507a.m137019l(c22507a.m222761e());
        }
        return z;
    }

    /* JADX INFO: renamed from: Y3 */
    public C22421c<uxj0> m32457Y3() {
        return this.f20286W.asObservable();
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<uxj0> m32458Z3() {
        return this.f20287X.asObservable();
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<PartialListOpt<CoreSuggested.UserInfo>> m32459a4(final String str) {
        return this.f20285V.doOnSubscribe(new x20() { // from class: l.jab
            @Override // p153l.x20
            public final void call() {
                this.f118967a.m32446L3(str);
            }
        }).filter(new qcj() { // from class: l.kab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82487b((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<Relationship> m32460b4(final Map<String, String> map) {
        User user = this.f20281R;
        if (user == null) {
            return null;
        }
        final User userMo225055clone = user.mo225055clone();
        final CoreSuggested.UserInfo userInfoM225062clone = this.f20282S.m225062clone();
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userMo225055clone.f56859id);
        if (NullChecker.m82486a(userM116503Pa) && !TextUtils.isEmpty(userM116503Pa.ussTracker)) {
            relationship.ussTracker = userM116503Pa.ussTracker;
        }
        return this.f91137Q.scheduled("undo_theme_slide", -1, new pcj() { // from class: l.v9b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182979a.m32449O3(userMo225055clone, relationship, map, userInfoM225062clone);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m32461v3() {
        this.f20281R = null;
        this.f20282S = null;
        this.f20288Y = 1;
    }

    /* JADX INFO: renamed from: w3 */
    public final Relationship m32462w3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, LikeFrom likeFrom) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        relationship.state = RelationshipStatus.get(z ? "liked" : RelationshipStatus.disliked);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
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

    /* JADX INFO: renamed from: x3 */
    public final Long m32463x3(Relationship relationship, LikeFrom likeFrom) {
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

    /* JADX INFO: renamed from: y3 */
    public final int m32464y3() {
        return this.f20288Y;
    }

    /* JADX INFO: renamed from: z3 */
    public C22421c<uxj0> m32465z3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f91137Q.scheduled("users/suggested/themeSlide/insert", 0, new pcj() { // from class: l.eab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f92749a.m32438B3(i, userInfo);
            }
        });
    }
}
