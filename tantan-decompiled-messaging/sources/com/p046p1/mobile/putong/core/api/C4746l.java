package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4746l;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.BuzzUser;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FloatUserCardData;
import com.p046p1.mobile.putong.core.data.FloatsCardData;
import com.p046p1.mobile.putong.core.data.InsertCard;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.RecallMembershipEnvelope;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.data.Voice;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.LiveState;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.ax6;
import p149l.d30;
import p149l.e30;
import p149l.ia20;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xma;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.l */
/* JADX INFO: loaded from: classes9.dex */
public class C4746l extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f20049R;

    /* JADX INFO: renamed from: S */
    public final String f20050S;

    /* JADX INFO: renamed from: T */
    public boolean f20051T;

    public C4746l(C4732c c4732c) {
        super(c4732c);
        this.f20049R = new zpd0("recall_membership_last_show_mills" + CoreModule.m29931H().userId(), 0L);
        this.f20050S = "CoreInserterHelper";
        this.f20051T = false;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m34193d3(RecallMembershipEnvelope recallMembershipEnvelope) {
        if (NullChecker.m81303a(recallMembershipEnvelope) && NullChecker.m81303a(recallMembershipEnvelope.data)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.IntlRecallMembershipCard;
            IntlInsertCardData intlInsertCardDataNew_ = IntlInsertCardData.new_();
            intlInsertCardDataNew_.recallMembership = recallMembershipEnvelope.data;
            userInfo.intlInsertCardData = intlInsertCardDataNew_;
            CoreModule.f17545c.f19663m0.m31146t6(userInfo, 0, true);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ int m34200k3(InsertCard insertCard, InsertCard insertCard2) {
        return insertCard.position - insertCard2.position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0161  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ j760 m34201A3(Envelope envelope, Map map, Map map2, Map map3, Envelope envelope2) {
        int i;
        SparseArray sparseArray = new SparseArray();
        if (vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f20051T = false;
            return vwb.m200311Y(envelope, sparseArray);
        }
        CoreData coreData = (CoreData) envelope2.getModuleData(CoreData.class);
        final CommonData commonData = (CommonData) envelope2.getModuleData(CommonData.class);
        if (!vwb.m200296J(commonData.users)) {
            ura.m195053e().m195057d().mo33673Dg("recommend merge suggested data start");
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.m39
                @Override // p149l.d30
                public final void call() {
                    CoreModule.m29934N().mo60314Rf(vwb.m200303Q(commonData.users, new w9j() { // from class: l.e39
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((User) obj).f56011id;
                        }
                    }));
                }
            });
            this.f72126Q.m31494y3(envelope2, null, true, false, true);
            ura.m195053e().m195057d().mo33673Dg("recommend merge suggested data end");
        }
        HashMap<String, List<Media>> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        CoreModule.m29934N().mo60406zd(envelope2, map5);
        if (ura.m195053e().m195057d().mo33918s()) {
            CoreModule.m29934N().mo60273Ee(envelope2, map4);
        }
        if (vwb.m200296J(coreData.intlInsertCardSets)) {
            i = 0;
            this.f20051T = false;
        } else {
            Collections.sort(coreData.intlInsertCardSets, new Comparator() { // from class: l.n39
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4746l.m34200k3((InsertCard) obj, (InsertCard) obj2);
                }
            });
            boolean z = false;
            for (InsertCard insertCard : coreData.intlInsertCardSets) {
                if (insertCard.position == 0) {
                    z = true;
                }
                SamesCardData samesCardDataM34214s3 = null;
                switch (insertCard.cardType) {
                    case 1:
                        if (!IntlCountryCodeController.m28126v() && qib0.f154713b0.f139232c.mo67264es()) {
                            User userM34213r3 = m34213r3(insertCard.f20423id, commonData.users);
                            if (NullChecker.m81303a(userM34213r3)) {
                                CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                                String str = userM34213r3.f56011id;
                                userInfo.f19472id = str;
                                userInfo.ussTags = userM34213r3.ussTags;
                                userInfo.hierarchy = userM34213r3.hierarchy;
                                userInfo.hasMoment = map5.containsKey(str);
                                userInfo.userMedia = map4.get(userM34213r3.f56011id);
                                m34217v3(userInfo, coreData.lives);
                                sparseArray.put(insertCard.position, userInfo);
                                m34207l3(insertCard, userInfo);
                                map.put(userInfo.f19472id, Integer.valueOf(insertCard.position));
                                if (ura.m195053e().m195057d().mo33743Ql(userInfo.f19472id)) {
                                    map2.put(userM34213r3.f56011id, Integer.valueOf(insertCard.position));
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
                        User userM34215t3 = m34215t3(insertCard.f20423id, commonData.users);
                        if (NullChecker.m81303a(userM34215t3)) {
                            CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                            String str2 = userM34215t3.f56011id;
                            userInfo2.f19472id = str2;
                            userInfo2.ussTags = userM34215t3.ussTags;
                            userInfo2.hierarchy = userM34215t3.hierarchy;
                            userInfo2.hasMoment = map5.containsKey(str2);
                            userInfo2.userMedia = map4.get(userM34215t3.f56011id);
                            if (insertCard.cardType == 10) {
                                userInfo2.disableUndo = true;
                                m34208m3(insertCard, userInfo2, m34211p3(userInfo2.f19472id, coreData.buzzUsers), null);
                            } else {
                                m34207l3(insertCard, userInfo2);
                            }
                            sparseArray.put(insertCard.position, userInfo2);
                        }
                        break;
                    case 3:
                        Active activeM34210o3 = m34210o3(insertCard.f20423id, coreData.actives);
                        if (NullChecker.m81303a(activeM34210o3)) {
                            CoreSuggested.UserInfo userInfo3 = new CoreSuggested.UserInfo();
                            switch (insertCard.showType) {
                                case 1:
                                    if (IntlCountryCodeController.m28126v()) {
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
                            if ((userInfo3.virtualCardType != VirtualCardType.IntlSeeCard || (!IntlCountryCodeController.m28115k() && !TextUtils.isEmpty(activeM34210o3.skuId))) && ((userInfo3.virtualCardType != VirtualCardType.IntlVipCard || !IntlCountryCodeController.m28115k()) && userInfo3.virtualCardType != VirtualCardType.Unknown)) {
                                userInfo3.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                userInfo3.active = activeM34210o3;
                                sparseArray.put(insertCard.position, userInfo3);
                            }
                        }
                        break;
                    case 4:
                        if (!IntlCountryCodeController.m28115k() && insertCard.showType == 1) {
                            CoreSuggested.UserInfo userInfo4 = new CoreSuggested.UserInfo();
                            userInfo4.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
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
                        User userM34215t4 = m34215t3(insertCard.f20423id, commonData.users);
                        int i2 = insertCard.cardType;
                        if (5 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.sames);
                        } else if (13 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.love520);
                        } else if (14 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.camping);
                        } else if (15 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.mkt_activity_regular);
                            samesCardDataM34214s3.type = IntlMarketToken.regular;
                        } else if (16 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.mkt_activity_quiz);
                            samesCardDataM34214s3.type = IntlMarketToken.quiz;
                        } else if (18 == i2) {
                            samesCardDataM34214s3 = m34214s3(insertCard.f20423id, coreData.mkt_activity_flash);
                            samesCardDataM34214s3.type = IntlMarketToken.flash;
                        }
                        if (NullChecker.m81303a(userM34215t4) && NullChecker.m81303a(samesCardDataM34214s3)) {
                            CoreSuggested.UserInfo userInfo5 = new CoreSuggested.UserInfo();
                            String str3 = userM34215t4.f56011id;
                            userInfo5.f19472id = str3;
                            userInfo5.ussTags = userM34215t4.ussTags;
                            userInfo5.hierarchy = userM34215t4.hierarchy;
                            userInfo5.hasMoment = map5.containsKey(str3);
                            userInfo5.userMedia = map4.get(userM34215t4.f56011id);
                            userInfo5.samesCardData = samesCardDataM34214s3;
                            m34207l3(insertCard, userInfo5);
                            sparseArray.put(insertCard.position, userInfo5);
                        }
                        break;
                    case 7:
                        if (!IntlCountryCodeController.m28126v()) {
                            if (!qib0.f154713b0.f139232c.mo67213C8() || qib0.f154717f0 == 0) {
                                break;
                            } else {
                                User userM34215t5 = m34215t3(insertCard.f20423id, commonData.users);
                                if (NullChecker.m81303a(userM34215t5)) {
                                    CoreSuggested.UserInfo userInfo6 = new CoreSuggested.UserInfo();
                                    String str4 = userM34215t5.f56011id;
                                    userInfo6.f19472id = str4;
                                    userInfo6.ussTags = userM34215t5.ussTags;
                                    userInfo6.hierarchy = userM34215t5.hierarchy;
                                    userInfo6.hasMoment = map5.containsKey(str4);
                                    userInfo6.userMedia = map4.get(userM34215t5.f56011id);
                                    m34218w3(userInfo6, coreData.voices);
                                    m34207l3(insertCard, userInfo6);
                                    sparseArray.put(insertCard.position, userInfo6);
                                    map3.put(userInfo6.f19472id, Integer.valueOf(insertCard.position));
                                }
                            }
                        }
                        break;
                    case 12:
                        if (qib0.f154717f0 != 0) {
                            User userM34215t6 = m34215t3(insertCard.f20423id, commonData.users);
                            FloatsCardData floatsCardDataM34212q3 = m34212q3(insertCard.f20423id, coreData.floats);
                            if (NullChecker.m81303a(userM34215t6)) {
                                CoreSuggested.UserInfo userInfo7 = new CoreSuggested.UserInfo();
                                userInfo7.virtualCardType = VirtualCardType.IntlPartnerActiveCard;
                                userInfo7.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                FloatUserCardData floatUserCardData = new FloatUserCardData();
                                floatUserCardData.user = userM34215t6;
                                floatUserCardData.floatCardData = floatsCardDataM34212q3;
                                m34208m3(insertCard, userInfo7, null, floatUserCardData);
                                sparseArray.put(insertCard.position, userInfo7);
                            }
                        }
                        break;
                    case 17:
                    default:
                        break;
                }
            }
            this.f20051T = z;
            i = 0;
        }
        if (!vwb.m200296J(coreData.swipeUpperLimit)) {
            User userM34215t7 = m34215t3(coreData.swipeUpperLimit.get(i).userID, commonData.users);
            if (NullChecker.m81303a(userM34215t7)) {
                CoreSuggested.UserInfo userInfo8 = new CoreSuggested.UserInfo();
                userInfo8.f19472id = userM34215t7.f56011id;
                userInfo8.isIntlLikeLimitInsert = true;
                sparseArray.put(CoreModule.m29932K().counter_().likeLimit.remaining, userInfo8);
            }
        }
        return vwb.m200311Y(envelope, sparseArray);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ C22306c m34202B3(final Envelope envelope, final Map map, final Map map2, final Map map3) {
        return ia20.m135119c(new v9j() { // from class: l.j39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31183B2(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, Envelope.JSON_ADAPTER).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.k39
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120803a.m34201A3(envelope, map, map2, map3, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.l39
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200311Y(envelope, new SparseArray());
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m34203C3(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m34204D3() {
        return !mqi0.m155929D(this.f20049R.get().longValue());
    }

    /* JADX INFO: renamed from: E3 */
    public void m34205E3() {
        if (IntlCountryCodeController.m28115k() || this.f20051T) {
            return;
        }
        if (!(ura.m195053e().m195057d().mo33801ar() && ura.m195053e().m195057d().mo33954yh()) && m34204D3()) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (!(NullChecker.m81303a(userM169520na) && userM169520na.isVIP()) && xma.m210087m4() && xma.m210077h4()) {
                this.f72126Q.scheduled("recall_members_ship", 0, new v9j() { // from class: l.d39
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return ia20.m135122f(new v9j() { // from class: l.i39
                            @Override // p149l.v9j, java.util.concurrent.Callable
                            public final Object call() {
                                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/intl/membership/recall")).m185887f().m185883b();
                            }
                        }, RecallMembershipEnvelope.JSON_ADAPTER);
                    }
                }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.f39
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C4746l.m34193d3((RecallMembershipEnvelope) obj);
                    }
                }, new e30() { // from class: l.g39
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f100372a.m34203C3((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public void m34206F3() {
        this.f20049R.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: l3 */
    public final void m34207l3(InsertCard insertCard, CoreSuggested.UserInfo userInfo) {
        m34208m3(insertCard, userInfo, null, null);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m34208m3(InsertCard insertCard, CoreSuggested.UserInfo userInfo, BuzzUser buzzUser, FloatUserCardData floatUserCardData) {
        if (NullChecker.m81303a(insertCard) && NullChecker.m81303a(userInfo)) {
            IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
            intlInsertCardData.f20424id = insertCard.f20423id;
            intlInsertCardData.cardType = insertCard.cardType;
            intlInsertCardData.showType = insertCard.showType;
            if (NullChecker.m81303a(buzzUser)) {
                intlInsertCardData.buzzUser = buzzUser;
            }
            if (NullChecker.m81303a(floatUserCardData)) {
                intlInsertCardData.floatUserCardData = floatUserCardData;
            }
            userInfo.intlInsertCardData = intlInsertCardData;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m34209n3(User user, CoreSuggested.UserInfo userInfo) {
        if (!m34219x3(userInfo) || user.pictures.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media instanceof Picture) {
                arrayList.add(media);
                break;
            }
        }
        if (vwb.m200296J(arrayList)) {
            Media media2 = user.pictures.get(0);
            if (media2 instanceof Video) {
                Picture picture = ((Video) media2).cover;
                if (NullChecker.m81303a(picture)) {
                    arrayList.add(picture);
                }
            }
        }
        user.pictures = arrayList;
    }

    /* JADX INFO: renamed from: o3 */
    public final Active m34210o3(String str, List<Active> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (Active active : list) {
            if (TextUtils.equals(str, active.f20341id)) {
                return active;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final BuzzUser m34211p3(String str, List<BuzzUser> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (BuzzUser buzzUser : list) {
            if (NullChecker.m81303a(buzzUser) && TextUtils.equals(buzzUser.userId, str)) {
                return buzzUser;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q3 */
    public final FloatsCardData m34212q3(String str, List<FloatsCardData> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (FloatsCardData floatsCardData : list) {
            if (TextUtils.equals(str, floatsCardData.f20392id)) {
                return floatsCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public final User m34213r3(String str, List<User> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, user.f56011id)) {
                if (ura.m195053e().m195057d().mo33802b()) {
                    user.liveState.state = LiveState.get("onlive");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    CoreModule.m29936Q().putLiveState(arrayList);
                }
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s3 */
    public final SamesCardData m34214s3(String str, List<SamesCardData> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (SamesCardData samesCardData : list) {
            if (TextUtils.equals(str, samesCardData.f20497id)) {
                return samesCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t3 */
    public final User m34215t3(String str, List<User> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, user.f56011id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<j760<Envelope, SparseArray<CoreSuggested.UserInfo>>> m34216u3(final Envelope envelope, final Map<String, Integer> map, final Map<String, Integer> map2, final Map<String, Integer> map3) {
        return this.f72126Q.scheduled("user-recommend", 0, new v9j() { // from class: l.h39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f105582a.m34202B3(envelope, map, map3, map2);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final void m34217v3(CoreSuggested.UserInfo userInfo, List<Live> list) {
        if (vwb.m200296J(list) || !NullChecker.m81303a(userInfo)) {
            return;
        }
        for (Live live : list) {
            if (NullChecker.m81303a(live) && NullChecker.m81303a(live.videoCapture) && TextUtils.equals(userInfo.f19472id, live.anchor.f38803id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f19472id, live, null);
                Media media = live.coverPicUrl;
                if (media instanceof Picture) {
                    qib0.f154691G.m102311A0(media.url);
                    Media media2 = live.videoCapture;
                    if (media2 instanceof Video) {
                        ((Video) media2).cover = (Picture) live.coverPicUrl;
                    }
                }
                if (TextUtils.isEmpty(live.videoCapture.url)) {
                    return;
                }
                qib0.m174796U0(live.videoCapture.url);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m34218w3(CoreSuggested.UserInfo userInfo, List<Voice> list) {
        if (vwb.m200296J(list) || !NullChecker.m81303a(userInfo)) {
            return;
        }
        for (Voice voice : list) {
            if (NullChecker.m81303a(voice) && !TextUtils.isEmpty(voice.voiceRoomId) && TextUtils.equals(userInfo.f19472id, voice.f20531id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f19472id, null, voice);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m34219x3(CoreSuggested.UserInfo userInfo) {
        if (m34220y3(userInfo) && NullChecker.m81303a(userInfo.intlInsertCardData.buzzUser)) {
            return userInfo.intlInsertCardData.buzzUser.isBlur;
        }
        return false;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m34220y3(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo) || !NullChecker.m81303a(userInfo.intlInsertCardData)) {
            return false;
        }
        IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
        return intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m34221z3(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.intlInsertCardData) && userInfo.intlInsertCardData.cardType == 6;
    }
}
