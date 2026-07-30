package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4731b0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.core.data.CardStyle;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
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

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.b0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4731b0 extends ax6 {

    /* JADX INFO: renamed from: a0 */
    public static HashMap<String, String> f19538a0 = new HashMap<>();

    /* JADX INFO: renamed from: R */
    public User f19539R;

    /* JADX INFO: renamed from: S */
    public CoreSuggested.UserInfo f19540S;

    /* JADX INFO: renamed from: T */
    public CoreSuggested.UserInfo f19541T;

    /* JADX INFO: renamed from: U */
    public final HashSet<String> f19542U;

    /* JADX INFO: renamed from: V */
    public C22392a<PartialListOpt<CoreSuggested.UserInfo>> f19543V;

    /* JADX INFO: renamed from: W */
    public C22393b<roj0> f19544W;

    /* JADX INFO: renamed from: X */
    public C22392a<roj0> f19545X;

    /* JADX INFO: renamed from: Y */
    public int f19546Y;

    /* JADX INFO: renamed from: Z */
    public zew<String, Object> f19547Z;

    public C4731b0(C4732c c4732c) {
        super(c4732c);
        this.f19539R = null;
        this.f19542U = new HashSet<>();
        this.f19543V = C22392a.m221512b();
        this.f19544W = C22393b.m221521b();
        this.f19545X = C22392a.m221512b();
        this.f19546Y = 1;
        this.f19547Z = new zew<>(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m31409G3(j760 j760Var) {
        Envelope envelope = (Envelope) j760Var.f116564a;
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        ura.m195053e().m195057d().mo33673Dg("moment suggested data back");
        if (ConnectivityReceiver.m81286i()) {
            ura.m195053e().m195057d().mo33673Dg("moment prefetch image to disk");
            if (!vwb.m200296J(commonData.users)) {
                m31412T3(((CommonData) envelope.getModuleData(CommonData.class)).users);
            }
            this.f72126Q.m31494y3(envelope, null, true, false, true);
            ura.m195053e().m195057d().mo33673Dg("moment database merge suggested data end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m31410H3(Throwable th) {
        qib0.f154693H.guessedCurrentServerTime();
        if (NullChecker.m81303a(this.f19543V.m221515e()) && NullChecker.m81303a(this.f19543V.m221515e().loaded)) {
            this.f19543V.m221515e().loaded.size();
        }
        this.f19545X.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: R3 */
    private void m31411R3(final Notification<Envelope> notification, boolean z, final CoreSuggested.UserInfo userInfo, final User user) {
        User user2;
        User user3;
        if (notification.m221299j()) {
            this.f19542U.remove(userInfo.f19472id);
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
                if (user == null && (user3 = this.f19539R) != null && user3.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                    m31458v3();
                }
            } else if (user == null && (user2 = this.f19539R) != null && user2.f56011id.equals(((CoreData) notification.m221295f().getModuleData(CoreData.class)).relationships.get(0).f38806id)) {
                this.f19540S.canUndo = true;
            }
            this.f72126Q.m31492w3(notification.m221295f(), new d30() { // from class: l.q8b
                @Override // p149l.d30
                public final void call() {
                    this.f153149a.m31439F3(notification, userInfo, user);
                }
            });
            this.f72126Q.f19687u0.m30488w7(userInfo.f19472id);
        }
    }

    /* JADX INFO: renamed from: T3 */
    private void m31412T3(List<User> list) {
        vwb.m200354z(vwb.m200291E(list), new e30() { // from class: l.o8b
            @Override // p149l.e30
            public final void call(Object obj) {
                C4731b0.m31424l3((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Relationship m31420h3(Envelope envelope) {
        if (!((CoreData) envelope.getModuleData(CoreData.class)).relationships.isEmpty()) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
        }
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("unknown_");
        return relationship;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m31424l3(User user) {
        if (user.hasPic()) {
            qib0.f154691G.m102379z0(ura.m195053e().m195057d().mo33782Xf(user.media(0)));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m31434A3(int i, CoreSuggested.UserInfo userInfo, roj0 roj0Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = this.f19543V.m221515e();
        List arrayList = partialListOptM221515e == null ? new ArrayList() : partialListOptM221515e.loaded;
        if (arrayList.size() >= i) {
            arrayList.add(i, userInfo);
        } else {
            arrayList.add(userInfo);
        }
        this.f19542U.add(userInfo.f19472id);
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = "";
        this.f19543V.m132487l(new PartialListOpt<>(arrayList, dbLinksNew_));
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22306c m31435B3(final int i, final CoreSuggested.UserInfo userInfo) {
        return C22306c.fromCallable(new Callable() { // from class: l.u8b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.v8b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180457a.m31434A3(i, userInfo, (roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m31436C3(CoreSuggested.UserInfo userInfo, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            this.f72126Q.f19687u0.m30491x7(userInfo.f19472id);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22306c m31437D3(final CoreSuggested.UserInfo userInfo, Relationship relationship, Map map, Long l2, final boolean z, final User user) {
        return C4759y.m34905m3(userInfo.f19472id, relationship, map).compose(rzh0.m181751e(l2)).materialize().map(new w9j() { // from class: l.z8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202117a.m31438E3(z, userInfo, user, (Notification) obj);
            }
        }).dematerialize().take(1).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.a9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4731b0.m31420h3((Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.b9b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74214a.m31436C3(userInfo, (Relationship) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Notification m31438E3(boolean z, CoreSuggested.UserInfo userInfo, User user, Notification notification) {
        m31411R3(notification, z, userInfo, user);
        return notification;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m31439F3(Notification notification, CoreSuggested.UserInfo userInfo, User user) {
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
    public final /* synthetic */ roj0 m31440I3(j760 j760Var) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = this.f19543V.m221515e();
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
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            ArrayList arrayList3 = new ArrayList();
            HashMap map2 = new HashMap();
            if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).moments)) {
                for (CoreMomentInfo coreMomentInfo : ((CoreData) envelope.getModuleData(CoreData.class)).moments) {
                    if (NullChecker.m81303a(coreMomentInfo)) {
                        map2.put(coreMomentInfo.f56008id, coreMomentInfo);
                        arrayList3.add(coreMomentInfo);
                    }
                }
            }
            if (!vwb.m200296J(list)) {
                for (User user : list) {
                    if (!this.f19542U.contains(user.f56011id)) {
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        String str = user.f56011id;
                        userInfo.f19472id = str;
                        CardInfos cardInfos2 = (CardInfos) map.get(str);
                        userInfo.cardInfos = cardInfos2;
                        z = true;
                        userInfo.isCoreMomentThemeCard = true;
                        userInfo.setUserLikeMe(arrayList2.contains(user.f56011id));
                        if (NullChecker.m81303a(cardInfos2) && !TextUtils.isEmpty(cardInfos2.momentId)) {
                            userInfo.coreMomentInfo = (CoreMomentInfo) map2.get(userInfo.cardInfos.momentId);
                        }
                        arrayList.add(userInfo);
                        this.f19542U.add(user.f56011id);
                    }
                }
            }
        }
        DbLinks dbLinksNew_ = DbLinks.new_();
        dbLinksNew_.links.next = z ? "" : null;
        ura.m195053e().m195057d().mo33673Dg("moment suggested data emmit");
        this.f19543V.m132487l(new PartialListOpt<>(arrayList, dbLinksNew_));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ C22306c m31441J3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.c9b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).flatMap(new w9j() { // from class: l.d9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(vwb.m200311Y((Envelope) obj, new SparseArray()));
            }
        }).doOnNext(new e30() { // from class: l.j8b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116697a.m31409G3((j760) obj);
            }
        }).doOnError(new e30() { // from class: l.k8b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121797a.m31410H3((Throwable) obj);
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.l8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126800a.m31440I3((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m31443L3(final String str) {
        e51.m114748M(new Runnable() { // from class: l.n8b
            @Override // java.lang.Runnable
            public final void run() {
                this.f137608a.m31442K3(str);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m31444M3(Envelope envelope, User user, CoreSuggested.UserInfo userInfo) {
        if (TEnum.equals(((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0).state, "default")) {
            qib0.f154722k0.f176631d.insert(user);
            userInfo.isUndo = true;
            m31462z3(userInfo, 0);
            m31458v3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Relationship m31445N3(final User user, final CoreSuggested.UserInfo userInfo, final Envelope envelope) {
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.p8b
            @Override // p149l.d30
            public final void call() {
                this.f147577a.m31444M3(envelope, user, userInfo);
            }
        });
        return ((CoreData) envelope.getModuleData(CoreData.class)).relationships.get(0);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22306c m31446O3(final User user, Relationship relationship, Map map, final CoreSuggested.UserInfo userInfo) {
        return C4759y.m34905m3(user.f56011id, relationship, map).map(new w9j() { // from class: l.m8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132556a.m31445N3(user, userInfo, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<Relationship> m31447P3(boolean z, final boolean z2, @Nullable Map<String, String> map, final User user, LikeFrom likeFrom, boolean z3, @Nullable LikeExtraData likeExtraData, int i, final CoreSuggested.UserInfo userInfo) {
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
        this.f19546Y = i;
        final Relationship relationshipM31459w3 = m31459w3(z, z2, userInfo, likeFrom);
        final Long lM31460x3 = m31460x3(relationshipM31459w3, likeFrom);
        this.f19539R = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        this.f19540S = userInfo;
        return this.f72126Q.scheduled("cardlike_theme_slide", -1, new v9j() { // from class: l.y8b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f196788a.m31437D3(userInfo, relationshipM31459w3, map2, lM31460x3, z2, user);
            }
        }, z3);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m31448Q3() {
        this.f19545X.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: S3, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m31442K3(String str) {
        final String strM31318k2 = C4728a.m31318k2(str);
        this.f19544W.m132487l(roj0.f160388a);
        return this.f72126Q.scheduled("users/suggested/themeSlide", 0, new v9j() { // from class: l.t8b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f168816a.m31441J3(strM31318k2);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m31450U3(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m31451V3(new w9j() { // from class: l.s8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreSuggested.UserInfo) obj).f19472id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m31451V3(w9j<CoreSuggested.UserInfo, Boolean> w9jVar) {
        if (this.f19543V.m221515e() == null || vwb.m200296J(this.f19543V.m221515e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f19543V.m221515e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (w9jVar.call(next).booleanValue()) {
                this.f19542U.remove(next.f19472id);
                it.remove();
                this.f19543V.m221515e().setRefreshValue(true);
                C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f19543V;
                c22392a.m132487l(c22392a.m221515e());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m31452W3(List<String> list) {
        if (list == null || list.size() == 0 || this.f19543V.m221515e() == null || vwb.m200296J(this.f19543V.m221515e().loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f19543V.m221515e().loaded.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m81303a(next) && list.contains(next.f19472id)) {
                this.f19542U.remove(next.f19472id);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public boolean m31453X3(CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (this.f19543V.m221515e() != null && !vwb.m200296J(this.f19543V.m221515e().loaded)) {
            Iterator<CoreSuggested.UserInfo> it = this.f19543V.m221515e().loaded.iterator();
            while (it.hasNext()) {
                CoreSuggested.UserInfo next = it.next();
                if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                    it.remove();
                    this.f19543V.m221515e().loaded.size();
                    du2.m113670a("BifrostLayout", "moment 删除List数据：" + next.f19472id + ", " + this.f19543V.m221515e().loaded.size());
                    z = true;
                    break;
                }
            }
            this.f19543V.m221515e().setRefreshValue(vwb.m200296J(this.f19543V.m221515e().loaded));
            C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f19543V;
            c22392a.m132487l(c22392a.m221515e());
        }
        return z;
    }

    /* JADX INFO: renamed from: Y3 */
    public C22306c<roj0> m31454Y3() {
        return this.f19544W.asObservable();
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<roj0> m31455Z3() {
        return this.f19545X.asObservable();
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<PartialListOpt<CoreSuggested.UserInfo>> m31456a4(final String str) {
        return this.f19543V.doOnSubscribe(new d30() { // from class: l.w8b
            @Override // p149l.d30
            public final void call() {
                this.f185174a.m31443L3(str);
            }
        }).filter(new w9j() { // from class: l.x8b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81304b((PartialListOpt) obj));
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<Relationship> m31457b4(final Map<String, String> map) {
        User user = this.f19539R;
        if (user == null) {
            return null;
        }
        final User userMo223809clone = user.mo223809clone();
        final CoreSuggested.UserInfo userInfoM223816clone = this.f19540S.m223816clone();
        final Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("default");
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userMo223809clone.f56011id);
        if (NullChecker.m81303a(userM169430Pa) && !TextUtils.isEmpty(userM169430Pa.ussTracker)) {
            relationship.ussTracker = userM169430Pa.ussTracker;
        }
        return this.f72126Q.scheduled("undo_theme_slide", -1, new v9j() { // from class: l.i8b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f111998a.m31446O3(userMo223809clone, relationship, map, userInfoM223816clone);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public void m31458v3() {
        this.f19539R = null;
        this.f19540S = null;
        this.f19546Y = 1;
    }

    /* JADX INFO: renamed from: w3 */
    public final Relationship m31459w3(boolean z, boolean z2, CoreSuggested.UserInfo userInfo, LikeFrom likeFrom) {
        Relationship relationship = new Relationship();
        relationship.localLikeFrom = likeFrom.toString();
        relationship.state = RelationshipStatus.get(z ? "liked" : RelationshipStatus.disliked);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(MatchFrom.get(MatchFrom.superLiked));
            if (TEnum.equals(likeFrom, "myLiked")) {
                arrayList.add(MatchFrom.get("myLiked"));
            }
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

    /* JADX INFO: renamed from: x3 */
    public final Long m31460x3(Relationship relationship, LikeFrom likeFrom) {
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

    /* JADX INFO: renamed from: y3 */
    public final int m31461y3() {
        return this.f19546Y;
    }

    /* JADX INFO: renamed from: z3 */
    public C22306c<roj0> m31462z3(final CoreSuggested.UserInfo userInfo, final int i) {
        return this.f72126Q.scheduled("users/suggested/themeSlide/insert", 0, new v9j() { // from class: l.r8b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158167a.m31435B3(i, userInfo);
            }
        });
    }
}
