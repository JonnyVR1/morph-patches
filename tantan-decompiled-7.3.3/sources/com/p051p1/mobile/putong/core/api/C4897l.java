package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4897l;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.BuzzUser;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FloatUserCardData;
import com.p051p1.mobile.putong.core.data.FloatsCardData;
import com.p051p1.mobile.putong.core.data.InsertCard;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.RecallMembershipEnvelope;
import com.p051p1.mobile.putong.core.data.SamesCardData;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveState;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.byd0;
import p153l.dy6;
import p153l.gta;
import p153l.joa;
import p153l.jyb;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.l */
/* JADX INFO: loaded from: classes9.dex */
public class C4897l extends dy6 {

    /* JADX INFO: renamed from: R */
    public final byd0 f20791R;

    /* JADX INFO: renamed from: S */
    public final String f20792S;

    /* JADX INFO: renamed from: T */
    public boolean f20793T;

    public C4897l(C4883c c4883c) {
        super(c4883c);
        this.f20791R = new byd0("recall_membership_last_show_mills" + CoreModule.m30929H().userId(), 0L);
        this.f20792S = "CoreInserterHelper";
        this.f20793T = false;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m35196d3(RecallMembershipEnvelope recallMembershipEnvelope) {
        if (NullChecker.m82486a(recallMembershipEnvelope) && NullChecker.m82486a(recallMembershipEnvelope.data)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.IntlRecallMembershipCard;
            IntlInsertCardData intlInsertCardDataNew_ = IntlInsertCardData.new_();
            intlInsertCardDataNew_.recallMembership = recallMembershipEnvelope.data;
            userInfo.intlInsertCardData = intlInsertCardDataNew_;
            CoreModule.f18264c.f20405m0.m32149t6(userInfo, 0, true);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ int m35203k3(InsertCard insertCard, InsertCard insertCard2) {
        return insertCard.position - insertCard2.position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0161  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ pf60 m35204A3(Envelope envelope, Map map, Map map2, Map map3, Envelope envelope2) {
        int i;
        SparseArray sparseArray = new SparseArray();
        if (jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f20793T = false;
            return jyb.m147494Y(envelope, sparseArray);
        }
        CoreData coreData = (CoreData) envelope2.getModuleData(CoreData.class);
        final CommonData commonData = (CommonData) envelope2.getModuleData(CommonData.class);
        if (!jyb.m147479J(commonData.users)) {
            gta.m132210e().m132214d().mo34676Dg("recommend merge suggested data start");
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.v49
                @Override // p153l.x20
                public final void call() {
                    CoreModule.m30932N().mo61498Rf(jyb.m147486Q(commonData.users, new qcj() { // from class: l.n49
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((User) obj).f56859id;
                        }
                    }));
                }
            });
            this.f91137Q.m32497y3(envelope2, null, true, false, true);
            gta.m132210e().m132214d().mo34676Dg("recommend merge suggested data end");
        }
        HashMap<String, List<Media>> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        CoreModule.m30932N().mo61590zd(envelope2, map5);
        if (gta.m132210e().m132214d().mo34921s()) {
            CoreModule.m30932N().mo61457Ee(envelope2, map4);
        }
        if (jyb.m147479J(coreData.intlInsertCardSets)) {
            i = 0;
            this.f20793T = false;
        } else {
            Collections.sort(coreData.intlInsertCardSets, new Comparator() { // from class: l.w49
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4897l.m35203k3((InsertCard) obj, (InsertCard) obj2);
                }
            });
            boolean z = false;
            for (InsertCard insertCard : coreData.intlInsertCardSets) {
                if (insertCard.position == 0) {
                    z = true;
                }
                SamesCardData samesCardDataM35217s3 = null;
                switch (insertCard.cardType) {
                    case 1:
                        if (!IntlCountryCodeController.m29125v() && uqb0.f180396b0.f170326c.mo68447es()) {
                            User userM35216r3 = m35216r3(insertCard.f21165id, commonData.users);
                            if (NullChecker.m82486a(userM35216r3)) {
                                CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                                String str = userM35216r3.f56859id;
                                userInfo.f20214id = str;
                                userInfo.ussTags = userM35216r3.ussTags;
                                userInfo.hierarchy = userM35216r3.hierarchy;
                                userInfo.hasMoment = map5.containsKey(str);
                                userInfo.userMedia = map4.get(userM35216r3.f56859id);
                                m35220v3(userInfo, coreData.lives);
                                sparseArray.put(insertCard.position, userInfo);
                                m35210l3(insertCard, userInfo);
                                map.put(userInfo.f20214id, Integer.valueOf(insertCard.position));
                                if (gta.m132210e().m132214d().mo34746Ql(userInfo.f20214id)) {
                                    map2.put(userM35216r3.f56859id, Integer.valueOf(insertCard.position));
                                }
                                break;
                            }
                        }
                        break;
                    case 2:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        User userM35218t3 = m35218t3(insertCard.f21165id, commonData.users);
                        if (NullChecker.m82486a(userM35218t3)) {
                            CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                            String str2 = userM35218t3.f56859id;
                            userInfo2.f20214id = str2;
                            userInfo2.ussTags = userM35218t3.ussTags;
                            userInfo2.hierarchy = userM35218t3.hierarchy;
                            userInfo2.hasMoment = map5.containsKey(str2);
                            userInfo2.userMedia = map4.get(userM35218t3.f56859id);
                            if (insertCard.cardType == 10) {
                                userInfo2.disableUndo = true;
                                m35211m3(insertCard, userInfo2, m35214p3(userInfo2.f20214id, coreData.buzzUsers), null);
                            } else {
                                m35210l3(insertCard, userInfo2);
                            }
                            sparseArray.put(insertCard.position, userInfo2);
                        }
                        break;
                    case 3:
                        Active activeM35213o3 = m35213o3(insertCard.f21165id, coreData.actives);
                        if (NullChecker.m82486a(activeM35213o3)) {
                            CoreSuggested.UserInfo userInfo3 = new CoreSuggested.UserInfo();
                            switch (insertCard.showType) {
                                case 1:
                                    if (IntlCountryCodeController.m29125v()) {
                                        userInfo3.virtualCardType = VirtualCardType.Unknown;
                                    } else {
                                        userInfo3.virtualCardType = VirtualCardType.LiveActiveCard;
                                    }
                                    break;
                                case 2:
                                    userInfo3.virtualCardType = VirtualCardType.IntlVipCard;
                                    break;
                                case 3:
                                    userInfo3.virtualCardType = VirtualCardType.IntlSeeCard;
                                    break;
                                case 4:
                                    userInfo3.virtualCardType = VirtualCardType.MinBoostCard;
                                    break;
                                case 5:
                                    userInfo3.virtualCardType = VirtualCardType.IntlFreeSpotlightCard;
                                    break;
                                case 6:
                                    userInfo3.virtualCardType = VirtualCardType.IntlTextBuzzActiveCard;
                                    break;
                                case 7:
                                    userInfo3.virtualCardType = VirtualCardType.IntlVoiceBuzzActiveCard;
                                    break;
                                case 8:
                                    userInfo3.virtualCardType = VirtualCardType.IntlVideoBuzzActiveCard;
                                    break;
                                default:
                                    userInfo3.virtualCardType = VirtualCardType.Unknown;
                                    break;
                            }
                            if ((userInfo3.virtualCardType != VirtualCardType.IntlSeeCard || (!IntlCountryCodeController.m29114k() && !TextUtils.isEmpty(activeM35213o3.skuId))) && ((userInfo3.virtualCardType != VirtualCardType.IntlVipCard || !IntlCountryCodeController.m29114k()) && userInfo3.virtualCardType != VirtualCardType.Unknown)) {
                                userInfo3.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                userInfo3.active = activeM35213o3;
                                sparseArray.put(insertCard.position, userInfo3);
                            }
                        }
                        break;
                    case 4:
                        if (!IntlCountryCodeController.m29114k() && insertCard.showType == 1) {
                            CoreSuggested.UserInfo userInfo4 = new CoreSuggested.UserInfo();
                            userInfo4.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                            userInfo4.virtualCardType = VirtualCardType.NativeAdViewCard;
                            sparseArray.put(insertCard.position, userInfo4);
                        }
                        break;
                    case 5:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 18:
                        User userM35218t4 = m35218t3(insertCard.f21165id, commonData.users);
                        int i2 = insertCard.cardType;
                        if (5 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.sames);
                        } else if (13 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.love520);
                        } else if (14 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.camping);
                        } else if (15 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.mkt_activity_regular);
                            samesCardDataM35217s3.type = IntlMarketToken.regular;
                        } else if (16 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.mkt_activity_quiz);
                            samesCardDataM35217s3.type = IntlMarketToken.quiz;
                        } else if (18 == i2) {
                            samesCardDataM35217s3 = m35217s3(insertCard.f21165id, coreData.mkt_activity_flash);
                            samesCardDataM35217s3.type = IntlMarketToken.flash;
                        }
                        if (NullChecker.m82486a(userM35218t4) && NullChecker.m82486a(samesCardDataM35217s3)) {
                            CoreSuggested.UserInfo userInfo5 = new CoreSuggested.UserInfo();
                            String str3 = userM35218t4.f56859id;
                            userInfo5.f20214id = str3;
                            userInfo5.ussTags = userM35218t4.ussTags;
                            userInfo5.hierarchy = userM35218t4.hierarchy;
                            userInfo5.hasMoment = map5.containsKey(str3);
                            userInfo5.userMedia = map4.get(userM35218t4.f56859id);
                            userInfo5.samesCardData = samesCardDataM35217s3;
                            m35210l3(insertCard, userInfo5);
                            sparseArray.put(insertCard.position, userInfo5);
                        }
                        break;
                    case 7:
                        if (!IntlCountryCodeController.m29125v()) {
                            if (!uqb0.f180396b0.f170326c.mo68396C8() || uqb0.f180400f0 == 0) {
                                break;
                            } else {
                                User userM35218t5 = m35218t3(insertCard.f21165id, commonData.users);
                                if (NullChecker.m82486a(userM35218t5)) {
                                    CoreSuggested.UserInfo userInfo6 = new CoreSuggested.UserInfo();
                                    String str4 = userM35218t5.f56859id;
                                    userInfo6.f20214id = str4;
                                    userInfo6.ussTags = userM35218t5.ussTags;
                                    userInfo6.hierarchy = userM35218t5.hierarchy;
                                    userInfo6.hasMoment = map5.containsKey(str4);
                                    userInfo6.userMedia = map4.get(userM35218t5.f56859id);
                                    m35221w3(userInfo6, coreData.voices);
                                    m35210l3(insertCard, userInfo6);
                                    sparseArray.put(insertCard.position, userInfo6);
                                    map3.put(userInfo6.f20214id, Integer.valueOf(insertCard.position));
                                }
                            }
                        }
                        break;
                    case 12:
                        if (uqb0.f180400f0 != 0) {
                            User userM35218t6 = m35218t3(insertCard.f21165id, commonData.users);
                            FloatsCardData floatsCardDataM35215q3 = m35215q3(insertCard.f21165id, coreData.floats);
                            if (NullChecker.m82486a(userM35218t6)) {
                                CoreSuggested.UserInfo userInfo7 = new CoreSuggested.UserInfo();
                                userInfo7.virtualCardType = VirtualCardType.IntlPartnerActiveCard;
                                userInfo7.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                FloatUserCardData floatUserCardData = new FloatUserCardData();
                                floatUserCardData.user = userM35218t6;
                                floatUserCardData.floatCardData = floatsCardDataM35215q3;
                                m35211m3(insertCard, userInfo7, null, floatUserCardData);
                                sparseArray.put(insertCard.position, userInfo7);
                            }
                        }
                        break;
                    case 17:
                    default:
                        break;
                }
            }
            this.f20793T = z;
            i = 0;
        }
        if (!jyb.m147479J(coreData.swipeUpperLimit)) {
            User userM35218t7 = m35218t3(coreData.swipeUpperLimit.get(i).userID, commonData.users);
            if (NullChecker.m82486a(userM35218t7)) {
                CoreSuggested.UserInfo userInfo8 = new CoreSuggested.UserInfo();
                userInfo8.f20214id = userM35218t7.f56859id;
                userInfo8.isIntlLikeLimitInsert = true;
                sparseArray.put(CoreModule.m30930K().counter_().likeLimit.remaining, userInfo8);
            }
        }
        return jyb.m147494Y(envelope, sparseArray);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22421c m35205B3(final Envelope envelope, final Map map, final Map map2, final Map map3) {
        return qi20.m176656c(new pcj() { // from class: l.s49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32186B2(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, Envelope.JSON_ADAPTER).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.t49
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172054a.m35204A3(envelope, map, map2, map3, (Envelope) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.u49
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147494Y(envelope, new SparseArray());
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m35206C3(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m35207D3() {
        return !pzi0.m174439D(this.f20791R.get().longValue());
    }

    /* JADX INFO: renamed from: E3 */
    public void m35208E3() {
        if (IntlCountryCodeController.m29114k() || this.f20793T) {
            return;
        }
        if (!(gta.m132210e().m132214d().mo34804ar() && gta.m132210e().m132214d().mo34957yh()) && m35207D3()) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (!(NullChecker.m82486a(userM116593na) && userM116593na.isVIP()) && joa.m146401n4() && joa.m146392i4()) {
                this.f91137Q.scheduled("recall_members_ship", 0, new pcj() { // from class: l.m49
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return qi20.m176659f(new pcj() { // from class: l.r49
                            @Override // p153l.pcj, java.util.concurrent.Callable
                            public final Object call() {
                                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/intl/membership/recall")).m209032f().m209028b();
                            }
                        }, RecallMembershipEnvelope.JSON_ADAPTER);
                    }
                }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.o49
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C4897l.m35196d3((RecallMembershipEnvelope) obj);
                    }
                }, new y20() { // from class: l.p49
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f150513a.m35206C3((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public void m35209F3() {
        this.f20791R.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: l3 */
    public final void m35210l3(InsertCard insertCard, CoreSuggested.UserInfo userInfo) {
        m35211m3(insertCard, userInfo, null, null);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m35211m3(InsertCard insertCard, CoreSuggested.UserInfo userInfo, BuzzUser buzzUser, FloatUserCardData floatUserCardData) {
        if (NullChecker.m82486a(insertCard) && NullChecker.m82486a(userInfo)) {
            IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
            intlInsertCardData.f21166id = insertCard.f21165id;
            intlInsertCardData.cardType = insertCard.cardType;
            intlInsertCardData.showType = insertCard.showType;
            if (NullChecker.m82486a(buzzUser)) {
                intlInsertCardData.buzzUser = buzzUser;
            }
            if (NullChecker.m82486a(floatUserCardData)) {
                intlInsertCardData.floatUserCardData = floatUserCardData;
            }
            userInfo.intlInsertCardData = intlInsertCardData;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m35212n3(User user, CoreSuggested.UserInfo userInfo) {
        if (!m35222x3(userInfo) || user.pictures.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media instanceof Picture) {
                arrayList.add(media);
                break;
            }
        }
        if (jyb.m147479J(arrayList)) {
            Media media2 = user.pictures.get(0);
            if (media2 instanceof Video) {
                Picture picture = ((Video) media2).cover;
                if (NullChecker.m82486a(picture)) {
                    arrayList.add(picture);
                }
            }
        }
        user.pictures = arrayList;
    }

    /* JADX INFO: renamed from: o3 */
    public final Active m35213o3(String str, List<Active> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (Active active : list) {
            if (TextUtils.equals(str, active.f21083id)) {
                return active;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final BuzzUser m35214p3(String str, List<BuzzUser> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (BuzzUser buzzUser : list) {
            if (NullChecker.m82486a(buzzUser) && TextUtils.equals(buzzUser.userId, str)) {
                return buzzUser;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q3 */
    public final FloatsCardData m35215q3(String str, List<FloatsCardData> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (FloatsCardData floatsCardData : list) {
            if (TextUtils.equals(str, floatsCardData.f21134id)) {
                return floatsCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public final User m35216r3(String str, List<User> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, user.f56859id)) {
                if (gta.m132210e().m132214d().mo34805b()) {
                    user.liveState.state = LiveState.get("onlive");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    CoreModule.m30934Q().putLiveState(arrayList);
                }
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s3 */
    public final SamesCardData m35217s3(String str, List<SamesCardData> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (SamesCardData samesCardData : list) {
            if (TextUtils.equals(str, samesCardData.f21239id)) {
                return samesCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t3 */
    public final User m35218t3(String str, List<User> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, user.f56859id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<pf60<Envelope, SparseArray<CoreSuggested.UserInfo>>> m35219u3(final Envelope envelope, final Map<String, Integer> map, final Map<String, Integer> map2, final Map<String, Integer> map3) {
        return this.f91137Q.scheduled("user-recommend", 0, new pcj() { // from class: l.q49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f155543a.m35205B3(envelope, map, map3, map2);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final void m35220v3(CoreSuggested.UserInfo userInfo, List<Live> list) {
        if (jyb.m147479J(list) || !NullChecker.m82486a(userInfo)) {
            return;
        }
        for (Live live : list) {
            if (NullChecker.m82486a(live) && NullChecker.m82486a(live.videoCapture) && TextUtils.equals(userInfo.f20214id, live.anchor.f39651id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f20214id, live, null);
                Media media = live.coverPicUrl;
                if (media instanceof Picture) {
                    uqb0.f180374G.m127095A0(media.url);
                    Media media2 = live.videoCapture;
                    if (media2 instanceof Video) {
                        ((Video) media2).cover = (Picture) live.coverPicUrl;
                    }
                }
                if (TextUtils.isEmpty(live.videoCapture.url)) {
                    return;
                }
                uqb0.m197250U0(live.videoCapture.url);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m35221w3(CoreSuggested.UserInfo userInfo, List<Voice> list) {
        if (jyb.m147479J(list) || !NullChecker.m82486a(userInfo)) {
            return;
        }
        for (Voice voice : list) {
            if (NullChecker.m82486a(voice) && !TextUtils.isEmpty(voice.voiceRoomId) && TextUtils.equals(userInfo.f20214id, voice.f21273id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f20214id, null, voice);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m35222x3(CoreSuggested.UserInfo userInfo) {
        if (m35223y3(userInfo) && NullChecker.m82486a(userInfo.intlInsertCardData.buzzUser)) {
            return userInfo.intlInsertCardData.buzzUser.isBlur;
        }
        return false;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m35223y3(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo) || !NullChecker.m82486a(userInfo.intlInsertCardData)) {
            return false;
        }
        IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
        return intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m35224z3(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.intlInsertCardData) && userInfo.intlInsertCardData.cardType == 6;
    }
}
