package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.SparseArray;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0172l;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.BuzzUser;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FloatUserCardData;
import com.p1.mobile.putong.core.data.FloatsCardData;
import com.p1.mobile.putong.core.data.InsertCard;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.data.RecallMembershipEnvelope;
import com.p1.mobile.putong.core.data.SamesCardData;
import com.p1.mobile.putong.core.data.SwipeUpperLimit;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.data.Voice;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.LiveState;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import p006l.ura;
import p006l.xma;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.l */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0172l extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f4038R;

    /* JADX INFO: renamed from: S */
    public final String f4039S;

    /* JADX INFO: renamed from: T */
    public boolean f4040T;

    public C0172l(C0158c c0158c) {
        super(c0158c);
        this.f4038R = new zpd0("recall_membership_last_show_mills" + CoreModule.m1850H().userId(), 0L);
        this.f4039S = "CoreInserterHelper";
        this.f4040T = false;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m6130d3(RecallMembershipEnvelope recallMembershipEnvelope) {
        if (NullChecker.a(recallMembershipEnvelope) && NullChecker.a(recallMembershipEnvelope.data)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.IntlRecallMembershipCard;
            IntlInsertCardData intlInsertCardDataNew_ = IntlInsertCardData.new_();
            intlInsertCardDataNew_.recallMembership = recallMembershipEnvelope.data;
            userInfo.intlInsertCardData = intlInsertCardDataNew_;
            CoreModule.f1534c.f3652m0.m3076t6(userInfo, 0, true);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ int m6137k3(InsertCard insertCard, InsertCard insertCard2) {
        return insertCard.position - insertCard2.position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0161  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ j760 m6138A3(Envelope envelope, Map map, Map map2, Map map3, Envelope envelope2) {
        int i;
        SparseArray sparseArray = new SparseArray();
        if (vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f4040T = false;
            return vwb.Y(envelope, sparseArray);
        }
        CoreData moduleData = envelope2.getModuleData(CoreData.class);
        final CommonData moduleData2 = envelope2.getModuleData(CommonData.class);
        if (!vwb.J(moduleData2.users)) {
            ura.m25555e().m25559d().m5610Dg("recommend merge suggested data start");
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.m39
                public final void call() {
                    CoreModule.m1853N().Rf(vwb.Q(moduleData2.users, new w9j() { // from class: l.e39
                        public final Object call(Object obj) {
                            return ((DbObject) ((User) obj)).id;
                        }
                    }));
                }
            });
            this.f8580Q.m3424y3(envelope2, null, true, false, true);
            ura.m25555e().m25559d().m5610Dg("recommend merge suggested data end");
        }
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        CoreModule.m1853N().zd(envelope2, map5);
        if (ura.m25555e().m25559d().m5855s()) {
            CoreModule.m1853N().Ee(envelope2, map4);
        }
        if (vwb.J(moduleData.intlInsertCardSets)) {
            i = 0;
            this.f4040T = false;
        } else {
            Collections.sort(moduleData.intlInsertCardSets, new Comparator() { // from class: l.n39
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C0172l.m6137k3((InsertCard) obj, (InsertCard) obj2);
                }
            });
            boolean z = false;
            for (InsertCard insertCard : moduleData.intlInsertCardSets) {
                if (insertCard.position == 0) {
                    z = true;
                }
                SamesCardData samesCardDataM6151s3 = null;
                switch (insertCard.cardType) {
                    case 1:
                        if (!IntlCountryCodeController.m21v() && qib0.f19804b0.f17708c.es()) {
                            User userM6150r3 = m6150r3(insertCard.id, moduleData2.users);
                            if (NullChecker.a(userM6150r3)) {
                                CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                                String str = ((DbObject) userM6150r3).id;
                                userInfo.f3461id = str;
                                userInfo.ussTags = userM6150r3.ussTags;
                                userInfo.hierarchy = userM6150r3.hierarchy;
                                userInfo.hasMoment = map5.containsKey(str);
                                userInfo.userMedia = (List) map4.get(((DbObject) userM6150r3).id);
                                m6154v3(userInfo, moduleData.lives);
                                sparseArray.put(insertCard.position, userInfo);
                                m6144l3(insertCard, userInfo);
                                map.put(userInfo.f3461id, Integer.valueOf(insertCard.position));
                                if (ura.m25555e().m25559d().m5680Ql(userInfo.f3461id)) {
                                    map2.put(((DbObject) userM6150r3).id, Integer.valueOf(insertCard.position));
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
                        User userM6152t3 = m6152t3(insertCard.id, moduleData2.users);
                        if (NullChecker.a(userM6152t3)) {
                            CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
                            String str2 = ((DbObject) userM6152t3).id;
                            userInfo2.f3461id = str2;
                            userInfo2.ussTags = userM6152t3.ussTags;
                            userInfo2.hierarchy = userM6152t3.hierarchy;
                            userInfo2.hasMoment = map5.containsKey(str2);
                            userInfo2.userMedia = (List) map4.get(((DbObject) userM6152t3).id);
                            if (insertCard.cardType == 10) {
                                userInfo2.disableUndo = true;
                                m6145m3(insertCard, userInfo2, m6148p3(userInfo2.f3461id, moduleData.buzzUsers), null);
                            } else {
                                m6144l3(insertCard, userInfo2);
                            }
                            sparseArray.put(insertCard.position, userInfo2);
                        }
                        break;
                    case CameraSticker.STATE_COMPLETE /* 3 */:
                        Active activeM6147o3 = m6147o3(insertCard.id, moduleData.actives);
                        if (NullChecker.a(activeM6147o3)) {
                            CoreSuggested.UserInfo userInfo3 = new CoreSuggested.UserInfo();
                            switch (insertCard.showType) {
                                case 1:
                                    if (IntlCountryCodeController.m21v()) {
                                        userInfo3.virtualCardType = VirtualCardType.Unknown;
                                    } else {
                                        userInfo3.virtualCardType = VirtualCardType.LiveActiveCard;
                                    }
                                    break;
                                case 2:
                                    userInfo3.virtualCardType = VirtualCardType.IntlVipCard;
                                    break;
                                case CameraSticker.STATE_COMPLETE /* 3 */:
                                    userInfo3.virtualCardType = VirtualCardType.IntlSeeCard;
                                    break;
                                case CameraSticker.STATE_ERROR /* 4 */:
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
                            if ((userInfo3.virtualCardType != VirtualCardType.IntlSeeCard || (!IntlCountryCodeController.m10k() && !TextUtils.isEmpty(activeM6147o3.skuId))) && ((userInfo3.virtualCardType != VirtualCardType.IntlVipCard || !IntlCountryCodeController.m10k()) && userInfo3.virtualCardType != VirtualCardType.Unknown)) {
                                userInfo3.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                userInfo3.active = activeM6147o3;
                                sparseArray.put(insertCard.position, userInfo3);
                            }
                        }
                        break;
                    case CameraSticker.STATE_ERROR /* 4 */:
                        if (!IntlCountryCodeController.m10k() && insertCard.showType == 1) {
                            CoreSuggested.UserInfo userInfo4 = new CoreSuggested.UserInfo();
                            userInfo4.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
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
                        User userM6152t4 = m6152t3(insertCard.id, moduleData2.users);
                        int i2 = insertCard.cardType;
                        if (5 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.sames);
                        } else if (13 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.love520);
                        } else if (14 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.camping);
                        } else if (15 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.mkt_activity_regular);
                            samesCardDataM6151s3.type = "regular";
                        } else if (16 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.mkt_activity_quiz);
                            samesCardDataM6151s3.type = "quiz";
                        } else if (18 == i2) {
                            samesCardDataM6151s3 = m6151s3(insertCard.id, moduleData.mkt_activity_flash);
                            samesCardDataM6151s3.type = "flash";
                        }
                        if (NullChecker.a(userM6152t4) && NullChecker.a(samesCardDataM6151s3)) {
                            CoreSuggested.UserInfo userInfo5 = new CoreSuggested.UserInfo();
                            String str3 = ((DbObject) userM6152t4).id;
                            userInfo5.f3461id = str3;
                            userInfo5.ussTags = userM6152t4.ussTags;
                            userInfo5.hierarchy = userM6152t4.hierarchy;
                            userInfo5.hasMoment = map5.containsKey(str3);
                            userInfo5.userMedia = (List) map4.get(((DbObject) userM6152t4).id);
                            userInfo5.samesCardData = samesCardDataM6151s3;
                            m6144l3(insertCard, userInfo5);
                            sparseArray.put(insertCard.position, userInfo5);
                        }
                        break;
                    case 7:
                        if (!IntlCountryCodeController.m21v()) {
                            if (!qib0.f19804b0.f17708c.C8() || qib0.f19808f0 == 0) {
                                break;
                            } else {
                                User userM6152t5 = m6152t3(insertCard.id, moduleData2.users);
                                if (NullChecker.a(userM6152t5)) {
                                    CoreSuggested.UserInfo userInfo6 = new CoreSuggested.UserInfo();
                                    String str4 = ((DbObject) userM6152t5).id;
                                    userInfo6.f3461id = str4;
                                    userInfo6.ussTags = userM6152t5.ussTags;
                                    userInfo6.hierarchy = userM6152t5.hierarchy;
                                    userInfo6.hasMoment = map5.containsKey(str4);
                                    userInfo6.userMedia = (List) map4.get(((DbObject) userM6152t5).id);
                                    m6155w3(userInfo6, moduleData.voices);
                                    m6144l3(insertCard, userInfo6);
                                    sparseArray.put(insertCard.position, userInfo6);
                                    map3.put(userInfo6.f3461id, Integer.valueOf(insertCard.position));
                                }
                            }
                        }
                        break;
                    case 12:
                        if (qib0.f19808f0 != 0) {
                            User userM6152t6 = m6152t3(insertCard.id, moduleData2.users);
                            FloatsCardData floatsCardDataM6149q3 = m6149q3(insertCard.id, moduleData.floats);
                            if (NullChecker.a(userM6152t6)) {
                                CoreSuggested.UserInfo userInfo7 = new CoreSuggested.UserInfo();
                                userInfo7.virtualCardType = VirtualCardType.IntlPartnerActiveCard;
                                userInfo7.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                                FloatUserCardData floatUserCardData = new FloatUserCardData();
                                floatUserCardData.user = userM6152t6;
                                floatUserCardData.floatCardData = floatsCardDataM6149q3;
                                m6145m3(insertCard, userInfo7, null, floatUserCardData);
                                sparseArray.put(insertCard.position, userInfo7);
                            }
                        }
                        break;
                    case 17:
                    default:
                        break;
                }
            }
            this.f4040T = z;
            i = 0;
        }
        if (!vwb.J(moduleData.swipeUpperLimit)) {
            User userM6152t7 = m6152t3(((SwipeUpperLimit) moduleData.swipeUpperLimit.get(i)).userID, moduleData2.users);
            if (NullChecker.a(userM6152t7)) {
                CoreSuggested.UserInfo userInfo8 = new CoreSuggested.UserInfo();
                userInfo8.f3461id = ((DbObject) userM6152t7).id;
                userInfo8.isIntlLikeLimitInsert = true;
                sparseArray.put(CoreModule.m1851K().counter_().likeLimit.remaining, userInfo8);
            }
        }
        return vwb.Y(envelope, sparseArray);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ c m6139B3(final Envelope envelope, final Map map, final Map map2, final Map map3) {
        return ia20.m16569c(new v9j() { // from class: l.j39
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3113B2(CoreModule.m1850H().userId())).f().b();
            }
        }, Envelope.JSON_ADAPTER).observeOn(Schedulers.io()).map(new w9j() { // from class: l.k39
            public final Object call(Object obj) {
                return this.f15577a.m6138A3(envelope, map, map2, map3, (Envelope) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.l39
            public final Object call(Object obj) {
                return vwb.Y(envelope, new SparseArray());
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m6140C3(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m6141D3() {
        return !mqi0.D(((Long) this.f4038R.get()).longValue());
    }

    /* JADX INFO: renamed from: E3 */
    public void m6142E3() {
        if (IntlCountryCodeController.m10k() || this.f4040T) {
            return;
        }
        if (!(ura.m25555e().m25559d().m5738ar() && ura.m25555e().m25559d().m5891yh()) && m6141D3()) {
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (!(NullChecker.a(userM21483na) && userM21483na.isVIP()) && xma.m27395m4() && xma.m27385h4()) {
                this.f8580Q.scheduled("recall_members_ship", 0, new v9j() { // from class: l.d39
                    public final Object call() {
                        return ia20.m16572f(new v9j() { // from class: l.i39
                            public final Object call() {
                                return C0154a.f3483P.auth().q(C0154a.m3130G("/intl/membership/recall")).f().b();
                            }
                        }, RecallMembershipEnvelope.JSON_ADAPTER);
                    }
                }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.f39
                    public final void call(Object obj) {
                        C0172l.m6130d3((RecallMembershipEnvelope) obj);
                    }
                }, new e30() { // from class: l.g39
                    public final void call(Object obj) {
                        this.f13040a.m6140C3((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public void m6143F3() {
        this.f4038R.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: l3 */
    public final void m6144l3(InsertCard insertCard, CoreSuggested.UserInfo userInfo) {
        m6145m3(insertCard, userInfo, null, null);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m6145m3(InsertCard insertCard, CoreSuggested.UserInfo userInfo, BuzzUser buzzUser, FloatUserCardData floatUserCardData) {
        if (NullChecker.a(insertCard) && NullChecker.a(userInfo)) {
            IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
            intlInsertCardData.id = insertCard.id;
            intlInsertCardData.cardType = insertCard.cardType;
            intlInsertCardData.showType = insertCard.showType;
            if (NullChecker.a(buzzUser)) {
                intlInsertCardData.buzzUser = buzzUser;
            }
            if (NullChecker.a(floatUserCardData)) {
                intlInsertCardData.floatUserCardData = floatUserCardData;
            }
            userInfo.intlInsertCardData = intlInsertCardData;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m6146n3(User user, CoreSuggested.UserInfo userInfo) {
        if (!m6156x3(userInfo) || user.pictures.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Media media : user.pictures) {
            if (media instanceof Picture) {
                arrayList.add(media);
                break;
            }
        }
        if (vwb.J(arrayList)) {
            Video video = (Media) user.pictures.get(0);
            if (video instanceof Video) {
                Picture picture = video.cover;
                if (NullChecker.a(picture)) {
                    arrayList.add(picture);
                }
            }
        }
        user.pictures = arrayList;
    }

    /* JADX INFO: renamed from: o3 */
    public final Active m6147o3(String str, List<Active> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (Active active : list) {
            if (TextUtils.equals(str, active.id)) {
                return active;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final BuzzUser m6148p3(String str, List<BuzzUser> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (BuzzUser buzzUser : list) {
            if (NullChecker.a(buzzUser) && TextUtils.equals(buzzUser.userId, str)) {
                return buzzUser;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q3 */
    public final FloatsCardData m6149q3(String str, List<FloatsCardData> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (FloatsCardData floatsCardData : list) {
            if (TextUtils.equals(str, floatsCardData.id)) {
                return floatsCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public final User m6150r3(String str, List<User> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, ((DbObject) user).id)) {
                if (ura.m25555e().m25559d().m5739b()) {
                    user.liveState.state = LiveState.get("onlive");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user);
                    CoreModule.m1855Q().putLiveState(arrayList);
                }
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s3 */
    public final SamesCardData m6151s3(String str, List<SamesCardData> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (SamesCardData samesCardData : list) {
            if (TextUtils.equals(str, samesCardData.id)) {
                return samesCardData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t3 */
    public final User m6152t3(String str, List<User> list) {
        if (vwb.J(list)) {
            return null;
        }
        for (User user : list) {
            if (TextUtils.equals(str, ((DbObject) user).id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    public c<j760<Envelope, SparseArray<CoreSuggested.UserInfo>>> m6153u3(final Envelope envelope, final Map<String, Integer> map, final Map<String, Integer> map2, final Map<String, Integer> map3) {
        return this.f8580Q.scheduled("user-recommend", 0, new v9j() { // from class: l.h39
            public final Object call() {
                return this.f13661a.m6139B3(envelope, map, map3, map2);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public final void m6154v3(CoreSuggested.UserInfo userInfo, List<Live> list) {
        if (vwb.J(list) || !NullChecker.a(userInfo)) {
            return;
        }
        for (Live live : list) {
            if (NullChecker.a(live) && NullChecker.a(live.videoCapture) && TextUtils.equals(userInfo.f3461id, live.anchor.id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f3461id, live, (Voice) null);
                Media media = live.coverPicUrl;
                if (media instanceof Picture) {
                    qib0.f19782G.m12724A0(media.url);
                    Video video = live.videoCapture;
                    if (video instanceof Video) {
                        video.cover = live.coverPicUrl;
                    }
                }
                if (TextUtils.isEmpty(live.videoCapture.url)) {
                    return;
                }
                qib0.m22140U0(live.videoCapture.url);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m6155w3(CoreSuggested.UserInfo userInfo, List<Voice> list) {
        if (vwb.J(list) || !NullChecker.a(userInfo)) {
            return;
        }
        for (Voice voice : list) {
            if (NullChecker.a(voice) && !TextUtils.isEmpty(voice.voiceRoomId) && TextUtils.equals(userInfo.f3461id, voice.id)) {
                userInfo.intlLiveCardPartDataWrapper = new LiveLivingCardDataWrapper(userInfo.f3461id, (Live) null, voice);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m6156x3(CoreSuggested.UserInfo userInfo) {
        if (m6157y3(userInfo) && NullChecker.a(userInfo.intlInsertCardData.buzzUser)) {
            return userInfo.intlInsertCardData.buzzUser.isBlur;
        }
        return false;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m6157y3(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo) || !NullChecker.a(userInfo.intlInsertCardData)) {
            return false;
        }
        IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
        return intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m6158z3(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && NullChecker.a(userInfo.intlInsertCardData) && userInfo.intlInsertCardData.cardType == 6;
    }
}
