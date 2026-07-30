package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CategoryTopic;
import com.p046p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.RecommendUsers;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p046p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11297a;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class py60 extends jq2<sy60> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBaseFrag f151802a;

    /* JADX INFO: renamed from: b */
    public hx60 f151803b;

    /* JADX INFO: renamed from: c */
    public String f151804c;

    /* JADX INFO: renamed from: d */
    public String f151805d;

    /* JADX INFO: renamed from: e */
    public boolean f151806e;

    /* JADX INFO: renamed from: f */
    public int f151807f;

    /* JADX INFO: renamed from: g */
    public String f151808g;

    /* JADX INFO: renamed from: h */
    public int f151809h;

    /* JADX INFO: renamed from: i */
    public boolean f151810i;

    /* JADX INFO: renamed from: j */
    public List<Moment> f151811j;

    /* JADX INFO: renamed from: k */
    public Links f151812k;

    /* JADX INFO: renamed from: l */
    public d30 f151813l;

    /* JADX INFO: renamed from: m */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f151814m;

    /* JADX INFO: renamed from: n */
    public uqd0 f151815n;

    /* JADX INFO: renamed from: o */
    public int f151816o;

    /* JADX INFO: renamed from: p */
    public int f151817p;

    /* JADX INFO: renamed from: q */
    public boolean f151818q;

    public py60(mcr mcrVar) {
        super(mcrVar);
        this.f151808g = User.ID_TEAM_ACCOUNT;
        this.f151811j = new ArrayList();
        this.f151815n = new uqd0("history_city_guide_" + FeedModule.m60221F().userId(), "");
        this.f151802a = (PhotoAlbumBaseFrag) mcrVar;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m172014D0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m172026f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m172028h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m172029i0(Boolean bool) {
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m172031j1() {
        return FeedModule.m60221F().userId().equals(this.f151804c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m172037o1(Bundle bundle) {
        ((sy60) this.viewModel).m186626l();
        if (NullChecker.m81303a(this.f151813l)) {
            this.f151813l.call();
        }
        if (this.f151803b instanceof ym00) {
            duringCreated(ijb0.m136570j()).map(new w9j() { // from class: l.ky60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ly60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130495a.m172086n1((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m172039p1() {
        ((sy60) this.viewModel).m186627m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m172041q1(C4319c c4319c) {
        V v2 = this.viewModel;
        if (((sy60) v2).f166903f) {
            ((sy60) v2).m186613B();
        }
        if (!(this.f151803b instanceof ohc0) || vwb.m200296J(this.f151811j)) {
            return;
        }
        ((ohc0) this.f151803b).m164344S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m172043r1(roj0 roj0Var) {
        V v2 = this.viewModel;
        if (((sy60) v2).f166903f) {
            ((sy60) v2).m186613B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x043c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0450 A[PHI: r3 r15 r21 r30 r31
      0x0450: PHI (r3v11 java.util.HashMap) = (r3v10 java.util.HashMap), (r3v13 java.util.HashMap) binds: [B:149:0x0448, B:146:0x043a] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r15v7 java.util.HashMap) = (r7v3 java.util.HashMap), (r15v10 java.util.HashMap) binds: [B:149:0x0448, B:146:0x043a] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v9 java.lang.String) binds: [B:149:0x0448, B:146:0x043a] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r30v3 com.p1.mobile.putong.feed.data.TopicOperations) = (r30v2 com.p1.mobile.putong.feed.data.TopicOperations), (r30v7 com.p1.mobile.putong.feed.data.TopicOperations) binds: [B:149:0x0448, B:146:0x043a] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r31v4 java.util.HashMap) = (r31v3 java.util.HashMap), (r31v9 java.util.HashMap) binds: [B:149:0x0448, B:146:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x045e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0466  */
    /* JADX WARN: Code duplicated, block: B:158:0x0472  */
    /* JADX WARN: Code duplicated, block: B:160:0x0476  */
    /* JADX WARN: Code duplicated, block: B:161:0x0481  */
    /* JADX WARN: Code duplicated, block: B:163:0x0485  */
    /* JADX WARN: Code duplicated, block: B:164:0x0490  */
    /* JADX WARN: Code duplicated, block: B:181:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:188:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:190:0x0503  */
    /* JADX WARN: Code duplicated, block: B:191:0x0509  */
    /* JADX WARN: Code duplicated, block: B:198:0x0531  */
    /* JADX WARN: Code duplicated, block: B:205:0x0556  */
    /* JADX WARN: Code duplicated, block: B:208:0x0570  */
    /* JADX INFO: renamed from: B1 */
    public final void m172050B1(List<Moment> list, boolean z, User user) throws Throwable {
        Throwable th;
        TopicOperations topicOperations;
        TopicOperations topicOperations2;
        TopicOperations topicOperations3;
        TopicOperations topicOperations4;
        TopicOperations topicOperations5;
        TopicOperations topicOperations6;
        boolean z2;
        User user2;
        int i;
        HashMap map;
        HashMap map2;
        int i2;
        TopicOperations topicOperations7;
        int i3;
        String str;
        List<MomentMessage> listMo133303j;
        PartialIdList partialIdList;
        int i4;
        hx60 hx60Var;
        Moment moment;
        Moment moment2;
        Moment moment3;
        int size;
        RawFeed rawFeedM130721c;
        String str2;
        int i5;
        int i6;
        int i7;
        List<Moment> list2 = list;
        vwb.m200320d0(list2, new w9j() { // from class: l.qx60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156811a.m172087s1((Moment) obj);
            }
        });
        hx60 hx60Var2 = this.f151803b;
        boolean z3 = hx60Var2 instanceof bm60;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i8 = 1;
        if (z3 || (hx60Var2 instanceof C11297a)) {
            Object obj = "";
            for (Moment moment4 : list2) {
                String strM172075a1 = (a5i.m95036l((long) moment4.createdTime, System.currentTimeMillis()) || moment4.createdTime == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? m172075a1() : a5i.m95027c((long) moment4.createdTime) + "/" + vqg.m199557m(a5i.m95028d((long) moment4.createdTime) + 1, true);
                if (strM172075a1.equals(obj)) {
                    moment4.feedTime = "";
                } else {
                    moment4.feedTime = strM172075a1;
                    obj = strM172075a1;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashMap map3 = new HashMap();
        int i9 = -1;
        if (NullChecker.m81303a(this.f151814m) && !vwb.m200296J(this.f151814m.f191751a)) {
            int i10 = -1;
            int i11 = 0;
            while (i11 < this.f151814m.f191751a.size()) {
                TopicOperations topicOperations8 = this.f151814m.f191751a.get(i11);
                double d2 = d;
                if ((TEnum.equals(topicOperations8.operationType, OperationType.change_city) || TEnum.equals(topicOperations8.operationType, OperationType.new_user) || TEnum.equals(topicOperations8.operationType, OperationType.man_made) || TEnum.equals(topicOperations8.operationType, OperationType.album_num_inc)) && (i7 = topicOperations8.position) != i10) {
                    map3.put(Integer.valueOf(i7), topicOperations8);
                    i10 = i7;
                }
                i11++;
                d = d2;
            }
        }
        double d3 = d;
        HashMap map4 = new HashMap();
        if (NullChecker.m81303a(this.f151814m) && !vwb.m200296J(this.f151814m.f191751a)) {
            int i12 = -1;
            for (int i13 = 0; i13 < this.f151814m.f191751a.size(); i13++) {
                TopicOperations topicOperations9 = this.f151814m.f191751a.get(i13);
                if (TEnum.equals(topicOperations9.operationType, OperationType.nearby_online) && (i6 = topicOperations9.position) != i12) {
                    map4.put(Integer.valueOf(i6), topicOperations9);
                    i12 = i6;
                }
            }
        }
        HashMap map5 = new HashMap();
        if (nkg.m159848E() && NullChecker.m81303a(this.f151814m) && !vwb.m200296J(this.f151814m.f191751a)) {
            for (int i14 = 0; i14 < this.f151814m.f191751a.size(); i14++) {
                TopicOperations topicOperations10 = this.f151814m.f191751a.get(i14);
                if (TEnum.equals(topicOperations10.operationType, OperationType.state_square_entrance) && (i5 = topicOperations10.position) != i9) {
                    map5.put(Integer.valueOf(i5), topicOperations10);
                    i9 = i5;
                }
            }
        }
        if (!NullChecker.m81303a(this.f151814m) || vwb.m200296J(this.f151814m.f191751a)) {
            th = null;
            topicOperations = null;
            topicOperations2 = null;
            topicOperations3 = null;
            topicOperations4 = null;
            topicOperations5 = null;
            topicOperations6 = null;
        } else {
            topicOperations2 = (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.rx60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.category_topic));
                }
            });
            topicOperations5 = (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.sx60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.single_topic));
                }
            });
            topicOperations6 = (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.ux60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_user));
                }
            });
            th = null;
            topicOperations3 = (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.vx60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_topic));
                }
            });
            topicOperations4 = nkg.m159857N() ? (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.wx60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    TopicOperations topicOperations11 = (TopicOperations) obj2;
                    return Boolean.valueOf(TEnum.equals(topicOperations11.operationType, "group") || (nkg.m159858O() && TEnum.equals(topicOperations11.operationType, OperationType.single_group)));
                }
            }) : null;
            topicOperations = nkg.m159863T() ? (TopicOperations) vwb.m200346r(this.f151814m.f191751a, new w9j() { // from class: l.xx60
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.moment_viewer));
                }
            }) : null;
        }
        int size2 = list2.size();
        String str3 = "";
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int i17 = size2;
            if (nah.m158678b() && this.f151809h == 12 && i15 == nah.m158677a()) {
                arrayList.add(new kg00(list2.get(i15), i15));
                break;
            }
            if (!NullChecker.m81303a(this.f151814m) || vwb.m200296J(this.f151814m.f191751a)) {
                str3 = str3;
                topicOperations = topicOperations;
            } else {
                if (NullChecker.m81303a(topicOperations) && i15 == topicOperations.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), topicOperations.momentViewer));
                }
                if (NullChecker.m81303a(topicOperations4) && i15 == topicOperations4.position - 1) {
                    if (TextUtils.isEmpty(topicOperations4.group.momentId)) {
                        TopicOperationsGroup topicOperationsGroup = topicOperations4.singleGroup;
                        final String str4 = topicOperationsGroup.momentId;
                        arrayList.add(new MomentItem((j760<TopicOperationsGroup, Group>) new j760(topicOperationsGroup, FeedModule.f38855d.m209558u7(topicOperationsGroup.groupId)), (Moment) vwb.m200346r(this.f151814m.f191753c, new w9j() { // from class: l.yx60
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((Moment) obj2).f56011id.equals(str4));
                            }
                        })));
                    } else {
                        TopicOperationsGroup topicOperationsGroup2 = topicOperations4.group;
                        final String str5 = topicOperationsGroup2.momentId;
                        arrayList.add(new MomentItem((j760<TopicOperationsGroup, Group>) new j760(topicOperationsGroup2, FeedModule.f38855d.m209558u7(topicOperationsGroup2.groupId)), (Moment) vwb.m200346r(this.f151814m.f191753c, new w9j() { // from class: l.zx60
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((Moment) obj2).f56011id.equals(str5));
                            }
                        })));
                    }
                }
                MomentItem momentItemM172069V0 = m172069V0(i15, topicOperations2, topicOperations5, topicOperations6);
                if (NullChecker.m81303a(momentItemM172069V0)) {
                    arrayList.add(momentItemM172069V0);
                }
                int i18 = i15 + 1;
                if (NullChecker.m81303a(map3.get(Integer.valueOf(i18)))) {
                    arrayList.add(new MomentItem(Moment.new_(), (j760<TopicOperations, List<TopicMoment>>) new j760((TopicOperations) map3.get(Integer.valueOf(i18)), this.f151814m.f191752b)));
                }
                if (NullChecker.m81303a(map4.get(Integer.valueOf(i18))) && ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline.userCount >= 3) {
                    arrayList.add(new MomentItem(Moment.new_(), ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline));
                }
                if (NullChecker.m81303a(map5.get(Integer.valueOf(i18)))) {
                    Moment momentNew_ = Moment.new_();
                    TopicOperations topicOperations11 = (TopicOperations) map5.get(Integer.valueOf(i18));
                    Objects.requireNonNull(topicOperations11);
                    arrayList.add(new MomentItem(momentNew_, topicOperations11.stateSquareEntrance));
                }
                boolean zM81303a = NullChecker.m81303a(topicOperations3);
                topicOperations3 = topicOperations3;
                if (zM81303a && i15 == topicOperations3.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), (j760<TopicOperations, List<TopicMoment>>) new j760(topicOperations3, this.f151814m.f191752b), 3));
                }
                if (NullChecker.m81303a(th)) {
                    throw th;
                }
            }
            list2 = list;
            Moment moment5 = list2.get(i15);
            if (NullChecker.m81304b(moment5)) {
                if (this.f151806e) {
                    map = map3;
                    HashMap map6 = map4;
                    if (moment5.createdTime > d3) {
                        StringBuilder sb = new StringBuilder();
                        map5 = map5;
                        sb.append(a5i.m95029e((long) moment5.createdTime));
                        sb.append(FeedModule.f38852a.getString(R$string.f38933M));
                        String string = sb.toString();
                        String str6 = str3;
                        if (string.equals(str6)) {
                            str = string;
                            str3 = str6;
                            map2 = map6;
                            topicOperations7 = topicOperations2;
                        } else {
                            str = string;
                            str3 = str6;
                            map2 = map6;
                            topicOperations7 = topicOperations2;
                            if (!a5i.m95034j((long) moment5.createdTime, System.currentTimeMillis())) {
                                str2 = str;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str = str3;
                            } else {
                                arrayList.add(new MomentItem(moment5, str2));
                            }
                        }
                        str2 = str3;
                        if (TextUtils.isEmpty(str2)) {
                            arrayList.add(new MomentItem(moment5, str2));
                        } else {
                            str = str3;
                        }
                    } else {
                        map2 = map6;
                    }
                    if (TEnum.equals(moment5.momentType, "seeAd")) {
                        i2 = i15;
                        i3 = i8;
                    } else {
                        if (NullChecker.m81303a(moment5.liveRecommendCard)) {
                            arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                        } else if (moment5.voiceLiveApiInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                        } else if (moment5.feedVoiceUserEntryInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                        } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null && moment5.liveCircleBanner == null) {
                            if (nkg.m159853J() && this.f151809h == 14 && this.f151803b.m133308p()) {
                                rawFeedM130721c = this.f151803b.f109833b.m130721c(list2.get(i15).f56011id);
                                if (!NullChecker.m81303a(rawFeedM130721c) && rawFeedM130721c.isRoamHighlight) {
                                    arrayList.add(new jg00(moment5, rawFeedM130721c, i15));
                                }
                            }
                            listMo133303j = this.f151803b.mo133303j(moment5);
                            partialIdList = moment5.messages;
                            if (partialIdList == null) {
                                i4 = 0;
                            } else {
                                i4 = partialIdList.count;
                            }
                            if (!listMo133303j.isEmpty()) {
                                if (listMo133303j.size() >= 3) {
                                    size = listMo133303j.size() - 3;
                                } else {
                                    size = 0;
                                }
                                listMo133303j = listMo133303j.subList(size, listMo133303j.size());
                            }
                            hx60Var = this.f151803b;
                            if (!(hx60Var instanceof bm60) || (hx60Var instanceof C11297a)) {
                                moment = moment5;
                                i2 = i15;
                            } else {
                                moment = moment5;
                                i2 = i15;
                                arrayList.add(new MomentItem(moment, listMo133303j.size(), i4, 0, i2));
                            }
                            moment2 = moment;
                            arrayList.add(new MomentItem(moment, listMo133303j.size(), i4, 1, i2));
                            i3 = i8;
                            if (this.f151809h == i3 || !moment2.isVoiceLive) {
                                MomentItem momentItem = new MomentItem(moment2, listMo133303j.size(), i4, 2, i2);
                                moment3 = moment2;
                                arrayList.add(momentItem);
                            } else {
                                moment3 = moment2;
                            }
                            if (i2 < this.f151807f) {
                                i16 += 3;
                            }
                            if (!n7c.m158118e().f137494a && this.f151809h == 0 && moment3.f56011id.equals(n7c.m158118e().f137495b)) {
                                n7c.m158118e().f137496c = arrayList.size() + 6;
                            }
                        } else {
                            arrayList.add(new MomentItem(moment5));
                        }
                        i2 = i15;
                        i3 = i8;
                    }
                } else {
                    map = map3;
                    map2 = map4;
                }
                topicOperations7 = topicOperations2;
                str = str3;
                if (TEnum.equals(moment5.momentType, "seeAd")) {
                    if (NullChecker.m81303a(moment5.liveRecommendCard)) {
                        arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                    } else if (moment5.voiceLiveApiInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                    } else if (moment5.feedVoiceUserEntryInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                    } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null) {
                        arrayList.add(new MomentItem(moment5));
                    } else {
                        if (nkg.m159853J()) {
                            rawFeedM130721c = this.f151803b.f109833b.m130721c(list2.get(i15).f56011id);
                            if (!NullChecker.m81303a(rawFeedM130721c)) {
                            }
                        }
                        listMo133303j = this.f151803b.mo133303j(moment5);
                        partialIdList = moment5.messages;
                        if (partialIdList == null) {
                            i4 = 0;
                        } else {
                            i4 = partialIdList.count;
                        }
                        if (!listMo133303j.isEmpty()) {
                            if (listMo133303j.size() >= 3) {
                                size = listMo133303j.size() - 3;
                            } else {
                                size = 0;
                            }
                            listMo133303j = listMo133303j.subList(size, listMo133303j.size());
                        }
                        hx60Var = this.f151803b;
                        if (hx60Var instanceof bm60) {
                            moment = moment5;
                            i2 = i15;
                        } else {
                            moment = moment5;
                            i2 = i15;
                        }
                        moment2 = moment;
                        arrayList.add(new MomentItem(moment, listMo133303j.size(), i4, 1, i2));
                        i3 = i8;
                        if (this.f151809h == i3) {
                            MomentItem momentItem2 = new MomentItem(moment2, listMo133303j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem2);
                        } else {
                            MomentItem momentItem3 = new MomentItem(moment2, listMo133303j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem3);
                        }
                        if (i2 < this.f151807f) {
                            i16 += 3;
                        }
                        if (!n7c.m158118e().f137494a) {
                        }
                    }
                    i2 = i15;
                    i3 = i8;
                } else {
                    i2 = i15;
                    i3 = i8;
                }
            } else {
                map = map3;
                map2 = map4;
                map5 = map5;
                i2 = i15;
                topicOperations7 = topicOperations2;
                i3 = i8;
                str = str3;
            }
            map3 = map;
            i8 = i3;
            topicOperations = topicOperations;
            topicOperations2 = topicOperations7;
            map4 = map2;
            i15 = i2 + 1;
            str3 = str;
            map5 = map5;
            size2 = i17;
        }
        if (NullChecker.m81303a(this.f151802a.f41453C)) {
            z2 = z;
            user2 = user;
            i = i16;
            if (this.f151802a.f41453C.mo62033n1(arrayList, z2, user2, i)) {
                return;
            }
        } else {
            z2 = z;
            user2 = user;
            i = i16;
        }
        ((sy60) this.viewModel).m186615E(arrayList, z2, user2, i);
    }

    /* JADX INFO: renamed from: C1 */
    public void m172051C1(Map<String, Moment> map) throws Throwable {
        ListIterator<Moment> listIterator = this.f151811j.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.m81304b(next) && NullChecker.m81303a(map.get(next.f56011id)) && !next.equals(map.get(next.f56011id))) {
                this.f151811j.set(this.f151811j.indexOf(next), map.get(next.f56011id));
            }
        }
        act().hideInput();
        if (this.f151811j.isEmpty()) {
            return;
        }
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: D1 */
    public void m172052D1(final String str, boolean z) {
        if (z) {
            this.f151811j = vwb.m200339n(this.f151811j, new w9j() { // from class: l.dy60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Moment) obj).owner.equals(str));
                }
            });
        }
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: E1 */
    public void mo114781E1() {
        ((sy60) this.viewModel).m186617G(true);
        if (this.f151811j.isEmpty()) {
            m172059P1(this.f151811j, false);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m172053F1() {
        hx60 hx60Var = this.f151803b;
        if (hx60Var == null) {
            return;
        }
        hx60Var.mo64506A();
        ptm.m171352d().m171353c(this.f151805d);
    }

    /* JADX INFO: renamed from: H1 */
    public void m172054H1(int i, int i2) {
        j760<Integer, Integer> j760VarM172076b1 = m172076b1();
        if (i == 0 && NullChecker.m81303a(j760VarM172076b1)) {
            ((sy60) this.viewModel).m186613B();
            m172055I1(j760VarM172076b1.f116564a.intValue(), j760VarM172076b1.f116565b.intValue());
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m172055I1(int i, int i2) {
        if (((sy60) this.viewModel).m186624f()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i <= i2) {
            String strM186629q = ((sy60) this.viewModel).m186629q(i);
            if (!TextUtils.isEmpty(strM186629q) && strM186629q.startsWith("http") && arrayList.size() < 5) {
                arrayList.add(strM186629q);
            }
            i++;
        }
        if (arrayList.size() > 0) {
            qib0.m174794T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m172056J1(j760<Links, List<Moment>> j760Var) {
        this.f151812k = j760Var.f116564a;
        if (NullChecker.m81303a(j760Var.f116565b)) {
            this.f151811j.addAll(vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.px60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f151642a.m172088t1((Moment) obj);
                }
            }));
            m172059P1(this.f151811j, false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void mo114782L1(j760<Links, List<Moment>> j760Var) {
        if ("from_nearby_falls_feed".equals(this.f151805d)) {
            FeedModule.f38855d.f193028Y0.onNext(Boolean.FALSE);
        }
        this.f151812k = j760Var.f116564a;
        if ((this.f151803b instanceof t720) && vwb.m200296J(j760Var.f116565b) && !vwb.m200296J(this.f151811j)) {
            return;
        }
        this.f151811j.clear();
        hx60 hx60Var = this.f151803b;
        if (!(hx60Var instanceof bm60) && !(hx60Var instanceof C11297a)) {
            this.f151811j.addAll(j760Var.f116565b);
            m172059P1(this.f151811j, false);
            return;
        }
        User userMo133306m = hx60Var.mo133306m(this.f151804c);
        if (NullChecker.m81303a(userMo133306m) && !FeedModule.m60221F().userId().equals(userMo133306m.f56011id) && userMo133306m.profile.moments.hidePublicMoments && !User.isMatched(userMo133306m)) {
            m172059P1(Collections.EMPTY_LIST, true);
            return;
        }
        if (userMo133306m == null) {
            MomentUserNullException.reportNullUserMoment(this.f151804c);
        }
        this.f151811j.addAll(j760Var.f116565b);
        if ("from_activities_moment".equals(this.f151805d)) {
            this.f151811j = vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.ox60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f146153a.m172089u1((Moment) obj);
                }
            });
        }
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: N1 */
    public void m172057N1(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var) {
        this.f151814m = xaj0Var;
        m172058O1();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m172058O1() throws Throwable {
        if (!NullChecker.m81303a(this.f151814m) || vwb.m200296J(this.f151814m.f191751a)) {
            if (NullChecker.m81303a(this.f151814m)) {
                m172059P1(this.f151811j, false);
                return;
            }
            return;
        }
        ArrayList<TopicOperations> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f151814m.f191751a.size(); i++) {
            TopicOperations topicOperations = this.f151814m.f191751a.get(i);
            if (TEnum.equals(topicOperations.operationType, OperationType.change_city) && !(m172063R1() && m172084l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.new_user) && !(m172066T1() && m172084l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.album_num_inc)) {
                m172065S1(arrayList, topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.man_made) && !m172082i1(topicOperations.operationType.toString())) {
                arrayList.add(topicOperations);
            }
        }
        Iterator<TopicOperations> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f151814m.f191751a.remove(it.next());
        }
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: P1 */
    public void m172059P1(List<Moment> list, boolean z) throws Throwable {
        m172061Q1(list, z, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m172060Q0(Moment moment) throws Throwable {
        this.f151811j.add(0, moment);
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m172061Q1(List<Moment> list, boolean z, User user) throws Throwable {
        final py60 py60Var;
        final List<Moment> list2;
        final boolean z2;
        final User user2;
        m172050B1(list, z, user);
        if (!u2h.m191495d() || (act() instanceof TopicAggregationAct)) {
            return;
        }
        String strMo167175e = FeedModule.m60223M().feedEntry().mo167175e();
        final int iMo167173c = FeedModule.m60223M().feedEntry().mo167173c();
        if (!"from_nearby_falls_feed".equals(this.f151805d) || TextUtils.isEmpty(strMo167175e) || iMo167173c == -1) {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
        } else if ("room".equals(strMo167175e)) {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            duringCreated(FeedModule.m60223M().feedEntry().mo167178h()).subscribe(mkd0.m154956H(new e30() { // from class: l.ny60
                @Override // p149l.e30
                public final void call(Object obj) throws Throwable {
                    this.f141083a.m172092z1(list2, iMo167173c, z2, user2, (bkn0.C15894a) obj);
                }
            }, new e30() { // from class: l.oy60
                @Override // p149l.e30
                public final void call(Object obj) {
                    py60.m172014D0((Throwable) obj);
                }
            }));
        } else {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            if ("user".equals(strMo167175e)) {
                py60Var.duringCreated(FeedModule.m60223M().feedEntry().mo167177g()).subscribe(mkd0.m154956H(new e30() { // from class: l.jx60
                    @Override // p149l.e30
                    public final void call(Object obj) throws Throwable {
                        this.f120196a.m172090v1(list2, iMo167173c, z2, user2, (aai) obj);
                    }
                }, new e30() { // from class: l.kx60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        py60.m172028h0((Throwable) obj);
                    }
                }));
            }
        }
        HashSet<String> hashSet = new HashSet<>();
        Iterator<Moment> it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().owner);
            if (hashSet.size() > 40) {
                break;
            }
        }
        py60Var.duringCreated(FeedModule.f38855d.m209446e7(py60Var.m172074Y0(), hashSet)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.lx60
            @Override // p149l.e30
            public final void call(Object obj) throws Throwable {
                this.f130389a.m172091x1(list2, z2, user2, (List) obj);
            }
        }, new e30() { // from class: l.mx60
            @Override // p149l.e30
            public final void call(Object obj) {
                py60.m172026f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m172062R0(Moment moment, String str) throws Throwable {
        for (int i = 0; i < this.f151811j.size(); i++) {
            if (TextUtils.equals(this.f151811j.get(i).f56011id, moment.f56011id)) {
                return;
            }
        }
        int i2 = 0;
        while (i2 < this.f151811j.size()) {
            if (TextUtils.equals(this.f151811j.get(i2).f56011id, str)) {
                this.f151811j.add(i2 + 1, moment);
                m172059P1(this.f151811j, false);
            }
            i2++;
        }
        i2 = -1;
        this.f151811j.add(i2 + 1, moment);
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: R1 */
    public final boolean m172063R1() {
        String str = FeedModule.m60222H().me_().location.region.city;
        String str2 = this.f151815n.get();
        if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
            return true;
        }
        this.f151815n.put(str);
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public void m172064S0(List<Moment> list, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f151811j.size()) {
                    arrayList.add(list.get(i));
                    break;
                } else if (TextUtils.equals(this.f151811j.get(i2).f56011id, list.get(i).f56011id)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = 0;
        while (i3 < this.f151811j.size()) {
            if (TextUtils.equals(this.f151811j.get(i3).f56011id, str)) {
                this.f151811j.addAll(i3 + 1, arrayList);
                m172059P1(this.f151811j, false);
            }
            i3++;
        }
        i3 = -1;
        this.f151811j.addAll(i3 + 1, arrayList);
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m172065S1(ArrayList<TopicOperations> arrayList, TopicOperations topicOperations) {
        if (!m172084l1(topicOperations.operationType.toString())) {
            arrayList.add(topicOperations);
            return;
        }
        if (!PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            arrayList.add(topicOperations);
            return;
        }
        int i = this.f151817p;
        if (i == 0 || i <= FeedModule.f38859h.lastDetectedMediaCount.get().intValue() || FeedModule.f38859h.lastDetectedMediaCount.get().intValue() == 0) {
            arrayList.add(topicOperations);
        }
        if (nkg.m159865V()) {
            this.f151802a.duringCreated(m172078d1()).subscribe(mkd0.m154955G(new e30() { // from class: l.cy60
                @Override // p149l.e30
                public final void call(Object obj) {
                    py60.m172029i0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final boolean m172066T1() {
        return a5i.m95031g((long) FeedModule.m60222H().me_().createdTime);
    }

    /* JADX INFO: renamed from: U0 */
    public void m172067U0(Moment moment) {
        if (moment.owner.equals(this.f151804c)) {
            int i = this.f151809h;
            if (i == 0 || i == 2) {
                m172060Q0(moment);
                if (moment.f56011id.startsWith("fake_id_")) {
                    return;
                }
                m172053F1();
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m172068U1(d30 d30Var) {
        this.f151813l = d30Var;
    }

    /* JADX INFO: renamed from: V0 */
    public final MomentItem m172069V0(int i, TopicOperations topicOperations, final TopicOperations topicOperations2, TopicOperations topicOperations3) {
        if (!vwb.m200296J(this.f151814m.f191752b) && topicOperations != null && !vwb.m200296J(topicOperations.categoryTopic) && i == topicOperations.position - 1) {
            return new MomentItem(Moment.new_(), (j760<List<CategoryTopic>, List<TopicMoment>>) new j760(topicOperations.categoryTopic, this.f151814m.f191752b), topicOperations.name, topicOperations.position);
        }
        if (NullChecker.m81303a(topicOperations2) && i == topicOperations2.position - 1) {
            return new MomentItem((Moment) vwb.m200346r(this.f151814m.f191753c, new w9j() { // from class: l.gy60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).f56011id.equals(topicOperations2.singleTopic.momentId));
                }
            }), (TopicMoment) vwb.m200346r(this.f151814m.f191752b, new w9j() { // from class: l.hy60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicOperations2.singleTopic.topicId));
                }
            }), topicOperations2.singleTopic);
        }
        if (NullChecker.m81303a(topicOperations3) && !vwb.m200296J(topicOperations3.recommendUsers) && i == topicOperations3.position - 1) {
            return new MomentItem(Moment.new_(), topicOperations3.name, 4, (j760<List<RecommendUsers>, List<Moment>>) new j760(topicOperations3.recommendUsers, this.f151814m.f191753c));
        }
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m172070V1(Moment moment) {
        if (NullChecker.m81303a(moment) && NullChecker.m81303a(moment.f56011id) && moment.f56011id.equals(wng.m204695v().m204741u())) {
            wng.m204695v().m204731j0();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m172071W0(final Moment moment) {
        int iM200293G = vwb.m200293G(this.f151811j, new w9j() { // from class: l.my60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && moment2.f56011id.equals(moment.f56011id));
            }
        });
        if (iM200293G != -1) {
            this.f151811j.remove(iM200293G);
            m172059P1(this.f151811j, false);
        }
        m172070V1(moment);
    }

    /* JADX INFO: renamed from: W1 */
    public void m172072W1(Map<String, User> map) throws Throwable {
        if (this.f151811j.isEmpty()) {
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f151805d) && "recommend_multiple".equals(this.f151805d) && "recommend_only_video".equals(this.f151805d)) {
            return;
        }
        m172059P1(this.f151811j, false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m172073X0(final j760<User, Boolean> j760Var, boolean z) {
        if (!z || j760Var.f116565b.booleanValue()) {
            m172061Q1(this.f151811j, false, j760Var.f116564a);
            return;
        }
        ArrayList arrayListM200339n = vwb.m200339n(this.f151811j, new w9j() { // from class: l.nx60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).owner.equals(((User) j760Var.f116564a).f56011id));
            }
        });
        this.f151811j = arrayListM200339n;
        m172059P1(arrayListM200339n, false);
    }

    /* JADX INFO: renamed from: Y0 */
    public String m172074Y0() {
        if ("from_nearby_focus".equals(this.f151805d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f151805d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f151805d) && "from_nearby_online".equals(this.f151805d)) ? "momentNearbyOnline" : "momentNearby";
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ix60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115332a.m172037o1((Bundle) obj);
            }
        }, new d30() { // from class: l.tx60
            @Override // p149l.d30
            public final void call() {
                this.f172487a.m172039p1();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.ey60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.iy60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115431a.m172041q1((C4319c) obj);
            }
        }));
        duringCreated(FeedModule.m60222H().getAutoPlayVideoBs()).subscribe(mkd0.m154955G(new e30() { // from class: l.jy60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120285a.m172043r1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final String m172075a1() {
        if ((this.f151803b instanceof C11297a) && m172031j1() && this.f151806e) {
            return "";
        }
        return ((this.f151803b instanceof bm60) && !nkg.m159866W() && m172031j1()) ? "" : FeedModule.f38852a.getString(R$string.f39076i2);
    }

    /* JADX INFO: renamed from: b1 */
    public j760<Integer, Integer> m172076b1() {
        if (((sy60) this.viewModel).m186624f()) {
            return null;
        }
        RecyclerView.AbstractC0577o abstractC0577oM186628p = ((sy60) this.viewModel).m186628p();
        if (!(abstractC0577oM186628p instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0577oM186628p;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition > 0) {
            return new j760<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m172077c1() {
        return this.f151803b.mo133307n(this.f151812k) && !"from_activities_moment".equals(this.f151805d);
    }

    /* JADX INFO: renamed from: d1 */
    public final C22306c<Boolean> m172078d1() {
        dmx dmxVar = new dmx(this.f151802a.act(), true, true);
        this.f151802a.act().getSupportLoaderManager().mo3088e(0, null, dmxVar);
        return dmxVar.m112546t().map(new w9j() { // from class: l.fy60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99835a.m172085m1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public void mo114783e1() {
        if ("recommend_only_video".equals(this.f151805d)) {
            this.f151803b = new ohc0((PhotoAlbumFeedBaseFrag) this.f151802a, true);
        } else if ("recommend_multiple".equals(this.f151805d)) {
            this.f151803b = new ohc0((PhotoAlbumFeedBaseFrag) this.f151802a, false);
        } else {
            m172080g1();
        }
        if (NullChecker.m81303a(this.f151803b)) {
            this.f151803b.mo64519o();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m172079f1() {
        this.f151818q = this.f151802a.getArguments().getBoolean("start_home_card");
        this.f151805d = this.f151802a.getArguments().getString("from");
        this.f151806e = this.f151802a.getArguments().getBoolean("from_feed_act");
        this.f151804c = this.f151802a.getArguments().getString("user_id");
        this.f151807f = this.f151802a.getArguments().getInt("selected_item_position");
        this.f151808g = this.f151802a.getArguments().getString("target_moment_id");
        this.f151809h = this.f151802a.getArguments().getInt("page_type", -1);
        this.f151810i = this.f151802a.getArguments().getBoolean("is_auto_refresh", true);
    }

    /* JADX INFO: renamed from: g1 */
    public void m172080g1() {
        this.f151803b = this.f151802a.f41453C.mo62028L0();
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m172081h1(int i, List<Moment> list) throws Throwable {
        if (this.f151811j.size() <= i) {
            return false;
        }
        this.f151811j.addAll(i, list);
        m172059P1(this.f151811j, false);
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m172082i1(String str) {
        zpd0 zpd0Var = new zpd0("show_guide_time_" + str + FeedModule.m60221F().userId() + this.f151809h, 0L);
        tpd0 tpd0Var = new tpd0("show_man_made_guide_count_" + str + FeedModule.m60221F().userId() + this.f151809h, 0);
        long jLongValue = zpd0Var.get().longValue();
        return jLongValue <= 0 || !a5i.m95036l(jLongValue, mqi0.m155944o()) || tpd0Var.get().intValue() < fm20.m122131n();
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m172083k1() {
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m172084l1(String str) {
        StringBuilder sb = new StringBuilder("show_guide_time_");
        sb.append(str);
        sb.append(FeedModule.m60221F().userId());
        sb.append(this.f151809h);
        return !a5i.m95036l(new zpd0(sb.toString(), 0L).get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Boolean m172085m1(List list) {
        boolean z = list.size() > FeedModule.f38859h.lastDetectedMediaCount.get().intValue() && FeedModule.f38859h.lastDetectedMediaCount.get().intValue() > 0;
        this.f151817p = list.size();
        this.f151816o = list.size();
        if (FeedModule.f38859h.lastDetectedMediaCount.get().intValue() == 0) {
            FeedModule.f38859h.lastDetectedMediaCount.put(Integer.valueOf(this.f151817p));
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m172086n1(Integer num) {
        if (kjb0.m146209t(act())) {
            kjb0.m146178A(act(), num.intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m172087s1(Moment moment) {
        return Boolean.valueOf(moment.owner.equals(this.f151804c) && moment.f56011id.startsWith("fake_id_"));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ Boolean m172088t1(Moment moment) {
        return Boolean.valueOf(!this.f151811j.contains(moment));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ Boolean m172089u1(Moment moment) {
        return Boolean.valueOf(moment.f56011id.equals(this.f151808g));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m172090v1(List list, int i, boolean z, User user, aai aaiVar) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) vwb.m200346r(list, new w9j() { // from class: l.by60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).feedVoiceUserEntryInfo != null);
                }
            });
            if (moment != null) {
                moment.feedVoiceUserEntryInfo = aaiVar;
            } else if (aaiVar.f68561b.size() != 0) {
                list.add(i2, FeedModule.f38855d.m209278G6(aaiVar));
            }
            m172050B1(list, z, user);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m172091x1(List list, boolean z, User user, List list2) throws Throwable {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            FeedUserLiveLabel feedUserLiveLabel = (FeedUserLiveLabel) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Moment moment = (Moment) it2.next();
                if (feedUserLiveLabel.userId.equals(moment.owner)) {
                    moment.liveState = feedUserLiveLabel.liveState;
                    LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(moment.live);
                    if (fromLive == null || !fromLive.isMultiCallType()) {
                        moment.live.f38767id = feedUserLiveLabel.liveId;
                    }
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                    moment.setLiveDataChange(true);
                }
            }
        }
        m172050B1(list, z, user);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m172092z1(List list, int i, boolean z, User user, bkn0.C15894a c15894a) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) vwb.m200346r(list, new w9j() { // from class: l.ay60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).voiceLiveApiInfo != null);
                }
            });
            if (moment != null) {
                moment.voiceLiveApiInfo = c15894a;
            } else if (c15894a.f76060a != 0) {
                list.add(i2, FeedModule.f38855d.m209285H6(c15894a));
            }
            m172050B1(list, z, user);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
