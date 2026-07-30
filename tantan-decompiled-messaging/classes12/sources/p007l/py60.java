package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.MomentType;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.Room;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p000p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C2141a;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import l.aai;
import l.bkn0;
import l.d30;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class py60 extends jq2<sy60> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBaseFrag f12010a;

    /* JADX INFO: renamed from: b */
    public hx60 f12011b;

    /* JADX INFO: renamed from: c */
    public String f12012c;

    /* JADX INFO: renamed from: d */
    public String f12013d;

    /* JADX INFO: renamed from: e */
    public boolean f12014e;

    /* JADX INFO: renamed from: f */
    public int f12015f;

    /* JADX INFO: renamed from: g */
    public String f12016g;

    /* JADX INFO: renamed from: h */
    public int f12017h;

    /* JADX INFO: renamed from: i */
    public boolean f12018i;

    /* JADX INFO: renamed from: j */
    public List<Moment> f12019j;

    /* JADX INFO: renamed from: k */
    public Links f12020k;

    /* JADX INFO: renamed from: l */
    public d30 f12021l;

    /* JADX INFO: renamed from: m */
    public xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f12022m;

    /* JADX INFO: renamed from: n */
    public uqd0 f12023n;

    /* JADX INFO: renamed from: o */
    public int f12024o;

    /* JADX INFO: renamed from: p */
    public int f12025p;

    /* JADX INFO: renamed from: q */
    public boolean f12026q;

    public py60(mcr mcrVar) {
        super(mcrVar);
        this.f12016g = User.ID_TEAM_ACCOUNT;
        this.f12019j = new ArrayList();
        this.f12023n = new uqd0("history_city_guide_" + FeedModule.m1139F().userId(), "");
        this.f12010a = (PhotoAlbumBaseFrag) mcrVar;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m13272D0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13284f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m13286h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m13287i0(Boolean bool) {
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m13289j1() {
        return FeedModule.m1139F().userId().equals(this.f12012c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m13295o1(Bundle bundle) {
        ((sy60) ((jq2) this).viewModel).m14398l();
        if (NullChecker.a(this.f12021l)) {
            this.f12021l.call();
        }
        if (this.f12011b instanceof ym00) {
            duringCreated(ijb0.m10923j()).map(new w9j() { // from class: l.ky60
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ly60
                public final void call(Object obj) {
                    this.f10155a.m13345n1((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m13297p1() {
        ((sy60) ((jq2) this).viewModel).m14399m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m13299q1(c cVar) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (((sy60) s7mVar).f13118f) {
            ((sy60) s7mVar).m14384B();
        }
        if (!(this.f12011b instanceof ohc0) || vwb.J(this.f12019j)) {
            return;
        }
        ((ohc0) this.f12011b).m12651S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m13301r1(roj0 roj0Var) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (((sy60) s7mVar).f13118f) {
            ((sy60) s7mVar).m14384B();
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
    public final void m13308B1(List<Moment> list, boolean z, User user) throws Throwable {
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
        List<MomentMessage> listMo10738j;
        PartialIdList partialIdList;
        int i4;
        hx60 hx60Var;
        Moment moment;
        Moment moment2;
        Moment moment3;
        int size;
        RawFeed rawFeedM10602c;
        String str2;
        int i5;
        int i6;
        int i7;
        List<Moment> list2 = list;
        vwb.d0(list2, new w9j() { // from class: l.qx60
            public final Object call(Object obj) {
                return this.f12411a.m13346s1((Moment) obj);
            }
        });
        hx60 hx60Var2 = this.f12011b;
        double d = 0.0d;
        int i8 = 1;
        if ((hx60Var2 instanceof bm60) || (hx60Var2 instanceof C2141a)) {
            Object obj = "";
            for (Moment moment4 : list2) {
                String strM13334a1 = (a5i.m8412l((long) moment4.createdTime, System.currentTimeMillis()) || moment4.createdTime == 0.0d) ? m13334a1() : a5i.m8403c((long) moment4.createdTime) + "/" + vqg.m15527m(a5i.m8404d((long) moment4.createdTime) + 1, true);
                if (strM13334a1.equals(obj)) {
                    moment4.feedTime = "";
                } else {
                    moment4.feedTime = strM13334a1;
                    obj = strM13334a1;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashMap map3 = new HashMap();
        int i9 = -1;
        if (NullChecker.a(this.f12022m) && !vwb.J((Collection) this.f12022m.a)) {
            int i10 = -1;
            int i11 = 0;
            while (i11 < ((List) this.f12022m.a).size()) {
                TopicOperations topicOperations8 = (TopicOperations) ((List) this.f12022m.a).get(i11);
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
        if (NullChecker.a(this.f12022m) && !vwb.J((Collection) this.f12022m.a)) {
            int i12 = -1;
            for (int i13 = 0; i13 < ((List) this.f12022m.a).size(); i13++) {
                TopicOperations topicOperations9 = (TopicOperations) ((List) this.f12022m.a).get(i13);
                if (TEnum.equals(topicOperations9.operationType, OperationType.nearby_online) && (i6 = topicOperations9.position) != i12) {
                    map4.put(Integer.valueOf(i6), topicOperations9);
                    i12 = i6;
                }
            }
        }
        HashMap map5 = new HashMap();
        if (nkg.m12207E() && NullChecker.a(this.f12022m) && !vwb.J((Collection) this.f12022m.a)) {
            for (int i14 = 0; i14 < ((List) this.f12022m.a).size(); i14++) {
                TopicOperations topicOperations10 = (TopicOperations) ((List) this.f12022m.a).get(i14);
                if (TEnum.equals(topicOperations10.operationType, OperationType.state_square_entrance) && (i5 = topicOperations10.position) != i9) {
                    map5.put(Integer.valueOf(i5), topicOperations10);
                    i9 = i5;
                }
            }
        }
        if (!NullChecker.a(this.f12022m) || vwb.J((Collection) this.f12022m.a)) {
            th = null;
            topicOperations = null;
            topicOperations2 = null;
            topicOperations3 = null;
            topicOperations4 = null;
            topicOperations5 = null;
            topicOperations6 = null;
        } else {
            topicOperations2 = (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.rx60
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.category_topic));
                }
            });
            topicOperations5 = (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.sx60
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.single_topic));
                }
            });
            topicOperations6 = (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.ux60
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_user));
                }
            });
            th = null;
            topicOperations3 = (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.vx60
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_topic));
                }
            });
            topicOperations4 = nkg.m12216N() ? (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.wx60
                public final Object call(Object obj2) {
                    TopicOperations topicOperations11 = (TopicOperations) obj2;
                    return Boolean.valueOf(TEnum.equals(topicOperations11.operationType, "group") || (nkg.m12217O() && TEnum.equals(topicOperations11.operationType, OperationType.single_group)));
                }
            }) : null;
            topicOperations = nkg.m12222T() ? (TopicOperations) vwb.r((Collection) this.f12022m.a, new w9j() { // from class: l.xx60
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
            if (nah.m12132b() && this.f12017h == 12 && i15 == nah.m12131a()) {
                arrayList.add(new kg00(list2.get(i15), i15));
                break;
            }
            if (!NullChecker.a(this.f12022m) || vwb.J((Collection) this.f12022m.a)) {
                str3 = str3;
                topicOperations = topicOperations;
            } else {
                if (NullChecker.a(topicOperations) && i15 == topicOperations.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), topicOperations.momentViewer));
                }
                if (NullChecker.a(topicOperations4) && i15 == topicOperations4.position - 1) {
                    if (TextUtils.isEmpty(topicOperations4.group.momentId)) {
                        TopicOperationsGroup topicOperationsGroup = topicOperations4.singleGroup;
                        final String str4 = topicOperationsGroup.momentId;
                        arrayList.add(new MomentItem((j760<TopicOperationsGroup, Group>) new j760(topicOperationsGroup, FeedModule.f316d.m16739u7(topicOperationsGroup.groupId)), (Moment) vwb.r((Collection) this.f12022m.c, new w9j() { // from class: l.yx60
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((DbObject) ((Moment) obj2)).id.equals(str4));
                            }
                        })));
                    } else {
                        TopicOperationsGroup topicOperationsGroup2 = topicOperations4.group;
                        final String str5 = topicOperationsGroup2.momentId;
                        arrayList.add(new MomentItem((j760<TopicOperationsGroup, Group>) new j760(topicOperationsGroup2, FeedModule.f316d.m16739u7(topicOperationsGroup2.groupId)), (Moment) vwb.r((Collection) this.f12022m.c, new w9j() { // from class: l.zx60
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((DbObject) ((Moment) obj2)).id.equals(str5));
                            }
                        })));
                    }
                }
                MomentItem momentItemM13327V0 = m13327V0(i15, topicOperations2, topicOperations5, topicOperations6);
                if (NullChecker.a(momentItemM13327V0)) {
                    arrayList.add(momentItemM13327V0);
                }
                int i18 = i15 + 1;
                if (NullChecker.a(map3.get(Integer.valueOf(i18)))) {
                    arrayList.add(new MomentItem(Moment.new_(), (j760<TopicOperations, List<TopicMoment>>) new j760((TopicOperations) map3.get(Integer.valueOf(i18)), (List) this.f12022m.b)));
                }
                if (NullChecker.a(map4.get(Integer.valueOf(i18))) && ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline.userCount >= 3) {
                    arrayList.add(new MomentItem(Moment.new_(), ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline));
                }
                if (NullChecker.a(map5.get(Integer.valueOf(i18)))) {
                    Moment momentNew_ = Moment.new_();
                    TopicOperations topicOperations11 = (TopicOperations) map5.get(Integer.valueOf(i18));
                    Objects.requireNonNull(topicOperations11);
                    arrayList.add(new MomentItem(momentNew_, topicOperations11.stateSquareEntrance));
                }
                boolean zA = NullChecker.a(topicOperations3);
                topicOperations3 = topicOperations3;
                if (zA && i15 == topicOperations3.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), (j760<TopicOperations, List<TopicMoment>>) new j760(topicOperations3, (List) this.f12022m.b), 3));
                }
                if (NullChecker.a(th)) {
                    throw th;
                }
            }
            list2 = list;
            Moment moment5 = list2.get(i15);
            if (NullChecker.b(moment5)) {
                if (this.f12014e) {
                    map = map3;
                    HashMap map6 = map4;
                    if (moment5.createdTime > d3) {
                        StringBuilder sb = new StringBuilder();
                        map5 = map5;
                        sb.append(a5i.m8405e((long) moment5.createdTime));
                        sb.append(FeedModule.f313a.getString(R$string.f394M));
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
                            if (!a5i.m8410j((long) moment5.createdTime, System.currentTimeMillis())) {
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
                    if (TEnum.equals(moment5.momentType, MomentType.seeAd)) {
                        i2 = i15;
                        i3 = i8;
                    } else {
                        if (NullChecker.a(moment5.liveRecommendCard)) {
                            arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                        } else if (moment5.voiceLiveApiInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                        } else if (moment5.feedVoiceUserEntryInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                        } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null && moment5.liveCircleBanner == null) {
                            if (nkg.m12212J() && this.f12017h == 14 && this.f12011b.m10743p()) {
                                rawFeedM10602c = this.f12011b.f8835b.m10602c(((DbObject) list2.get(i15)).id);
                                if (!NullChecker.a(rawFeedM10602c) && rawFeedM10602c.isRoamHighlight) {
                                    arrayList.add(new jg00(moment5, rawFeedM10602c, i15));
                                }
                            }
                            listMo10738j = this.f12011b.mo10738j(moment5);
                            partialIdList = moment5.messages;
                            if (partialIdList == null) {
                                i4 = 0;
                            } else {
                                i4 = partialIdList.count;
                            }
                            if (!listMo10738j.isEmpty()) {
                                if (listMo10738j.size() >= 3) {
                                    size = listMo10738j.size() - 3;
                                } else {
                                    size = 0;
                                }
                                listMo10738j = listMo10738j.subList(size, listMo10738j.size());
                            }
                            hx60Var = this.f12011b;
                            if (!(hx60Var instanceof bm60) || (hx60Var instanceof C2141a)) {
                                moment = moment5;
                                i2 = i15;
                            } else {
                                moment = moment5;
                                i2 = i15;
                                arrayList.add(new MomentItem(moment, listMo10738j.size(), i4, 0, i2));
                            }
                            moment2 = moment;
                            arrayList.add(new MomentItem(moment, listMo10738j.size(), i4, 1, i2));
                            i3 = i8;
                            if (this.f12017h == i3 || !moment2.isVoiceLive) {
                                MomentItem momentItem = new MomentItem(moment2, listMo10738j.size(), i4, 2, i2);
                                moment3 = moment2;
                                arrayList.add(momentItem);
                            } else {
                                moment3 = moment2;
                            }
                            if (i2 < this.f12015f) {
                                i16 += 3;
                            }
                            if (!n7c.m12098e().f10689a && this.f12017h == 0 && ((DbObject) moment3).id.equals(n7c.m12098e().f10690b)) {
                                n7c.m12098e().f10691c = arrayList.size() + 6;
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
                if (TEnum.equals(moment5.momentType, MomentType.seeAd)) {
                    if (NullChecker.a(moment5.liveRecommendCard)) {
                        arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                    } else if (moment5.voiceLiveApiInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                    } else if (moment5.feedVoiceUserEntryInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                    } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null) {
                        arrayList.add(new MomentItem(moment5));
                    } else {
                        if (nkg.m12212J()) {
                            rawFeedM10602c = this.f12011b.f8835b.m10602c(((DbObject) list2.get(i15)).id);
                            if (!NullChecker.a(rawFeedM10602c)) {
                            }
                        }
                        listMo10738j = this.f12011b.mo10738j(moment5);
                        partialIdList = moment5.messages;
                        if (partialIdList == null) {
                            i4 = 0;
                        } else {
                            i4 = partialIdList.count;
                        }
                        if (!listMo10738j.isEmpty()) {
                            if (listMo10738j.size() >= 3) {
                                size = listMo10738j.size() - 3;
                            } else {
                                size = 0;
                            }
                            listMo10738j = listMo10738j.subList(size, listMo10738j.size());
                        }
                        hx60Var = this.f12011b;
                        if (hx60Var instanceof bm60) {
                            moment = moment5;
                            i2 = i15;
                        } else {
                            moment = moment5;
                            i2 = i15;
                        }
                        moment2 = moment;
                        arrayList.add(new MomentItem(moment, listMo10738j.size(), i4, 1, i2));
                        i3 = i8;
                        if (this.f12017h == i3) {
                            MomentItem momentItem2 = new MomentItem(moment2, listMo10738j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem2);
                        } else {
                            MomentItem momentItem3 = new MomentItem(moment2, listMo10738j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem3);
                        }
                        if (i2 < this.f12015f) {
                            i16 += 3;
                        }
                        if (!n7c.m12098e().f10689a) {
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
        if (NullChecker.a(this.f12010a.f2914C)) {
            z2 = z;
            user2 = user;
            i = i16;
            if (this.f12010a.f2914C.mo3011n1(arrayList, z2, user2, i)) {
                return;
            }
        } else {
            z2 = z;
            user2 = user;
            i = i16;
        }
        ((sy60) ((jq2) this).viewModel).m14387E(arrayList, z2, user2, i);
    }

    /* JADX INFO: renamed from: C1 */
    public void m13309C1(Map<String, Moment> map) throws Throwable {
        ListIterator<Moment> listIterator = this.f12019j.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.b(next) && NullChecker.a(map.get(((DbObject) next).id)) && !next.equals(map.get(((DbObject) next).id))) {
                this.f12019j.set(this.f12019j.indexOf(next), map.get(((DbObject) next).id));
            }
        }
        act().hideInput();
        if (this.f12019j.isEmpty()) {
            return;
        }
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: D1 */
    public void m13310D1(final String str, boolean z) {
        if (z) {
            this.f12019j = vwb.n(this.f12019j, new w9j() { // from class: l.dy60
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Moment) obj).owner.equals(str));
                }
            });
        }
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: E1 */
    public void mo9612E1() {
        ((sy60) ((jq2) this).viewModel).m14389G(true);
        if (this.f12019j.isEmpty()) {
            m13317P1(this.f12019j, false);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m13311F1() {
        hx60 hx60Var = this.f12011b;
        if (hx60Var == null) {
            return;
        }
        hx60Var.mo5597A();
        ptm.m13221d().m13222c(this.f12013d);
    }

    /* JADX INFO: renamed from: H1 */
    public void m13312H1(int i, int i2) {
        j760<Integer, Integer> j760VarM13335b1 = m13335b1();
        if (i == 0 && NullChecker.a(j760VarM13335b1)) {
            ((sy60) ((jq2) this).viewModel).m14384B();
            m13313I1(((Integer) j760VarM13335b1.a).intValue(), ((Integer) j760VarM13335b1.b).intValue());
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m13313I1(int i, int i2) {
        if (((sy60) ((jq2) this).viewModel).m14396f()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i <= i2) {
            String strM14401q = ((sy60) ((jq2) this).viewModel).m14401q(i);
            if (!TextUtils.isEmpty(strM14401q) && strM14401q.startsWith("http") && arrayList.size() < 5) {
                arrayList.add(strM14401q);
            }
            i++;
        }
        if (arrayList.size() > 0) {
            qib0.T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m13314J1(j760<Links, List<Moment>> j760Var) {
        this.f12020k = (Links) j760Var.a;
        if (NullChecker.a(j760Var.b)) {
            this.f12019j.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.px60
                public final Object call(Object obj) {
                    return this.f12002a.m13347t1((Moment) obj);
                }
            }));
            m13317P1(this.f12019j, false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void mo9613L1(j760<Links, List<Moment>> j760Var) {
        if ("from_nearby_falls_feed".equals(this.f12013d)) {
            FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
        }
        this.f12020k = (Links) j760Var.a;
        if ((this.f12011b instanceof t720) && vwb.J((Collection) j760Var.b) && !vwb.J(this.f12019j)) {
            return;
        }
        this.f12019j.clear();
        hx60 hx60Var = this.f12011b;
        if (!(hx60Var instanceof bm60) && !(hx60Var instanceof C2141a)) {
            this.f12019j.addAll((Collection) j760Var.b);
            m13317P1(this.f12019j, false);
            return;
        }
        User userMo10741m = hx60Var.mo10741m(this.f12012c);
        if (NullChecker.a(userMo10741m) && !FeedModule.m1139F().userId().equals(((DbObject) userMo10741m).id) && userMo10741m.profile.moments.hidePublicMoments && !User.isMatched(userMo10741m)) {
            m13317P1(Collections.EMPTY_LIST, true);
            return;
        }
        if (userMo10741m == null) {
            MomentUserNullException.reportNullUserMoment(this.f12012c);
        }
        this.f12019j.addAll((Collection) j760Var.b);
        if ("from_activities_moment".equals(this.f12013d)) {
            this.f12019j = vwb.n((Collection) j760Var.b, new w9j() { // from class: l.ox60
                public final Object call(Object obj) {
                    return this.f11638a.m13348u1((Moment) obj);
                }
            });
        }
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: N1 */
    public void m13315N1(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var) {
        this.f12022m = xaj0Var;
        m13316O1();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m13316O1() throws Throwable {
        if (!NullChecker.a(this.f12022m) || vwb.J((Collection) this.f12022m.a)) {
            if (NullChecker.a(this.f12022m)) {
                m13317P1(this.f12019j, false);
                return;
            }
            return;
        }
        ArrayList<TopicOperations> arrayList = new ArrayList<>();
        for (int i = 0; i < ((List) this.f12022m.a).size(); i++) {
            TopicOperations topicOperations = (TopicOperations) ((List) this.f12022m.a).get(i);
            if (TEnum.equals(topicOperations.operationType, OperationType.change_city) && !(m13321R1() && m13343l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.new_user) && !(m13324T1() && m13343l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.album_num_inc)) {
                m13323S1(arrayList, topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.man_made) && !m13341i1(topicOperations.operationType.toString())) {
                arrayList.add(topicOperations);
            }
        }
        Iterator<TopicOperations> it = arrayList.iterator();
        while (it.hasNext()) {
            ((List) this.f12022m.a).remove(it.next());
        }
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: P1 */
    public void m13317P1(List<Moment> list, boolean z) throws Throwable {
        m13319Q1(list, z, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m13318Q0(Moment moment) throws Throwable {
        this.f12019j.add(0, moment);
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m13319Q1(List<Moment> list, boolean z, User user) throws Throwable {
        final py60 py60Var;
        final List<Moment> list2;
        final boolean z2;
        final User user2;
        m13308B1(list, z, user);
        if (!u2h.m14719d() || (act() instanceof TopicAggregationAct)) {
            return;
        }
        String strE = FeedModule.m1141M().feedEntry().e();
        final int iC = FeedModule.m1141M().feedEntry().c();
        if (!"from_nearby_falls_feed".equals(this.f12013d) || TextUtils.isEmpty(strE) || iC == -1) {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
        } else if (Room.TYPE.equals(strE)) {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            duringCreated(FeedModule.m1141M().feedEntry().h()).subscribe(mkd0.H(new e30() { // from class: l.ny60
                public final void call(Object obj) throws Throwable {
                    this.f10933a.m13351z1(list2, iC, z2, user2, (bkn0.a) obj);
                }
            }, new e30() { // from class: l.oy60
                public final void call(Object obj) {
                    py60.m13272D0((Throwable) obj);
                }
            }));
        } else {
            py60Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            if ("user".equals(strE)) {
                py60Var.duringCreated(FeedModule.m1141M().feedEntry().g()).subscribe(mkd0.H(new e30() { // from class: l.jx60
                    public final void call(Object obj) throws Throwable {
                        this.f9544a.m13349v1(list2, iC, z2, user2, (aai) obj);
                    }
                }, new e30() { // from class: l.kx60
                    public final void call(Object obj) {
                        py60.m13286h0((Throwable) obj);
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
        py60Var.duringCreated(FeedModule.f316d.m16627e7(py60Var.m13332Y0(), hashSet)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.lx60
            public final void call(Object obj) throws Throwable {
                this.f10150a.m13350x1(list2, z2, user2, (List) obj);
            }
        }, new e30() { // from class: l.mx60
            public final void call(Object obj) {
                py60.m13284f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m13320R0(Moment moment, String str) throws Throwable {
        for (int i = 0; i < this.f12019j.size(); i++) {
            if (TextUtils.equals(((DbObject) this.f12019j.get(i)).id, ((DbObject) moment).id)) {
                return;
            }
        }
        int i2 = 0;
        while (i2 < this.f12019j.size()) {
            if (TextUtils.equals(((DbObject) this.f12019j.get(i2)).id, str)) {
                this.f12019j.add(i2 + 1, moment);
                m13317P1(this.f12019j, false);
            }
            i2++;
        }
        i2 = -1;
        this.f12019j.add(i2 + 1, moment);
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: R1 */
    public final boolean m13321R1() {
        String str = FeedModule.m1140H().me_().location.region.city;
        String str2 = (String) this.f12023n.get();
        if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
            return true;
        }
        this.f12023n.put(str);
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public void m13322S0(List<Moment> list, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f12019j.size()) {
                    arrayList.add(list.get(i));
                    break;
                } else if (TextUtils.equals(((DbObject) this.f12019j.get(i2)).id, ((DbObject) list.get(i)).id)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = 0;
        while (i3 < this.f12019j.size()) {
            if (TextUtils.equals(((DbObject) this.f12019j.get(i3)).id, str)) {
                this.f12019j.addAll(i3 + 1, arrayList);
                m13317P1(this.f12019j, false);
            }
            i3++;
        }
        i3 = -1;
        this.f12019j.addAll(i3 + 1, arrayList);
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m13323S1(ArrayList<TopicOperations> arrayList, TopicOperations topicOperations) {
        if (!m13343l1(topicOperations.operationType.toString())) {
            arrayList.add(topicOperations);
            return;
        }
        if (!PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            arrayList.add(topicOperations);
            return;
        }
        int i = this.f12025p;
        if (i == 0 || i <= ((Integer) FeedModule.f320h.lastDetectedMediaCount.get()).intValue() || ((Integer) FeedModule.f320h.lastDetectedMediaCount.get()).intValue() == 0) {
            arrayList.add(topicOperations);
        }
        if (nkg.m12224V()) {
            this.f12010a.duringCreated(m13337d1()).subscribe(mkd0.G(new e30() { // from class: l.cy60
                public final void call(Object obj) {
                    py60.m13287i0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final boolean m13324T1() {
        return a5i.m8407g((long) FeedModule.m1140H().me_().createdTime);
    }

    /* JADX INFO: renamed from: U0 */
    public void m13325U0(Moment moment) {
        if (moment.owner.equals(this.f12012c)) {
            int i = this.f12017h;
            if (i == 0 || i == 2) {
                m13318Q0(moment);
                if (((DbObject) moment).id.startsWith("fake_id_")) {
                    return;
                }
                m13311F1();
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m13326U1(d30 d30Var) {
        this.f12021l = d30Var;
    }

    /* JADX INFO: renamed from: V0 */
    public final MomentItem m13327V0(int i, TopicOperations topicOperations, final TopicOperations topicOperations2, TopicOperations topicOperations3) {
        if (!vwb.J((Collection) this.f12022m.b) && topicOperations != null && !vwb.J(topicOperations.categoryTopic) && i == topicOperations.position - 1) {
            return new MomentItem(Moment.new_(), (j760<List<CategoryTopic>, List<TopicMoment>>) new j760(topicOperations.categoryTopic, (List) this.f12022m.b), topicOperations.name, topicOperations.position);
        }
        if (NullChecker.a(topicOperations2) && i == topicOperations2.position - 1) {
            return new MomentItem((Moment) vwb.r((Collection) this.f12022m.c, new w9j() { // from class: l.gy60
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((Moment) obj)).id.equals(topicOperations2.singleTopic.momentId));
                }
            }), (TopicMoment) vwb.r((Collection) this.f12022m.b, new w9j() { // from class: l.hy60
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicOperations2.singleTopic.topicId));
                }
            }), topicOperations2.singleTopic);
        }
        if (NullChecker.a(topicOperations3) && !vwb.J(topicOperations3.recommendUsers) && i == topicOperations3.position - 1) {
            return new MomentItem(Moment.new_(), topicOperations3.name, 4, (j760<List<RecommendUsers>, List<Moment>>) new j760(topicOperations3.recommendUsers, (List) this.f12022m.c));
        }
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m13328V1(Moment moment) {
        if (NullChecker.a(moment) && NullChecker.a(((DbObject) moment).id) && ((DbObject) moment).id.equals(wng.m15855v().m15901u())) {
            wng.m15855v().m15891j0();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m13329W0(final Moment moment) {
        int iG = vwb.G(this.f12019j, new w9j() { // from class: l.my60
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && ((DbObject) moment2).id.equals(((DbObject) moment).id));
            }
        });
        if (iG != -1) {
            this.f12019j.remove(iG);
            m13317P1(this.f12019j, false);
        }
        m13328V1(moment);
    }

    /* JADX INFO: renamed from: W1 */
    public void m13330W1(Map<String, User> map) throws Throwable {
        if (this.f12019j.isEmpty()) {
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f12013d) && "recommend_multiple".equals(this.f12013d) && "recommend_only_video".equals(this.f12013d)) {
            return;
        }
        m13317P1(this.f12019j, false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m13331X0(final j760<User, Boolean> j760Var, boolean z) {
        if (!z || ((Boolean) j760Var.b).booleanValue()) {
            m13319Q1(this.f12019j, false, (User) j760Var.a);
            return;
        }
        ArrayList arrayListN = vwb.n(this.f12019j, new w9j() { // from class: l.nx60
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).owner.equals(((DbObject) ((User) j760Var.a)).id));
            }
        });
        this.f12019j = arrayListN;
        m13317P1(arrayListN, false);
    }

    /* JADX INFO: renamed from: Y0 */
    public String m13332Y0() {
        if ("from_nearby_focus".equals(this.f12013d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f12013d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f12013d) && "from_nearby_online".equals(this.f12013d)) ? "momentNearbyOnline" : "momentNearby";
    }

    /* JADX INFO: renamed from: a0 */
    public void m13333a0() {
        super.a0();
        creates(new e30() { // from class: l.ix60
            public final void call(Object obj) {
                this.f9156a.m13295o1((Bundle) obj);
            }
        }, new d30() { // from class: l.tx60
            public final void call() {
                this.f13461a.m13297p1();
            }
        });
        lifecycle().filter(new w9j() { // from class: l.ey60
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.iy60
            public final void call(Object obj) {
                this.f9160a.m13299q1((c) obj);
            }
        }));
        duringCreated(FeedModule.m1140H().getAutoPlayVideoBs()).subscribe(mkd0.G(new e30() { // from class: l.jy60
            public final void call(Object obj) {
                this.f9550a.m13301r1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final String m13334a1() {
        if ((this.f12011b instanceof C2141a) && m13289j1() && this.f12014e) {
            return "";
        }
        return ((this.f12011b instanceof bm60) && !nkg.m12225W() && m13289j1()) ? "" : FeedModule.f313a.getString(R$string.f537i2);
    }

    /* JADX INFO: renamed from: b1 */
    public j760<Integer, Integer> m13335b1() {
        if (((sy60) ((jq2) this).viewModel).m14396f()) {
            return null;
        }
        LinearLayoutManager linearLayoutManagerM14400p = ((sy60) ((jq2) this).viewModel).m14400p();
        if (!(linearLayoutManagerM14400p instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = linearLayoutManagerM14400p;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition > 0) {
            return new j760<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m13336c1() {
        return this.f12011b.mo10742n(this.f12020k) && !"from_activities_moment".equals(this.f12013d);
    }

    /* JADX INFO: renamed from: d1 */
    public final rx.c<Boolean> m13337d1() {
        dmx dmxVar = new dmx(this.f12010a.act(), true, true);
        this.f12010a.act().getSupportLoaderManager().e(0, (Bundle) null, dmxVar);
        return dmxVar.m9516t().map(new w9j() { // from class: l.fy60
            public final Object call(Object obj) {
                return this.f8272a.m13344m1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public void mo9614e1() {
        if ("recommend_only_video".equals(this.f12013d)) {
            this.f12011b = new ohc0((PhotoAlbumFeedBaseFrag) this.f12010a, true);
        } else if ("recommend_multiple".equals(this.f12013d)) {
            this.f12011b = new ohc0((PhotoAlbumFeedBaseFrag) this.f12010a, false);
        } else {
            m13339g1();
        }
        if (NullChecker.a(this.f12011b)) {
            this.f12011b.mo5610o();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m13338f1() {
        this.f12026q = this.f12010a.getArguments().getBoolean("start_home_card");
        this.f12013d = this.f12010a.getArguments().getString("from");
        this.f12014e = this.f12010a.getArguments().getBoolean("from_feed_act");
        this.f12012c = this.f12010a.getArguments().getString("user_id");
        this.f12015f = this.f12010a.getArguments().getInt("selected_item_position");
        this.f12016g = this.f12010a.getArguments().getString("target_moment_id");
        this.f12017h = this.f12010a.getArguments().getInt("page_type", -1);
        this.f12018i = this.f12010a.getArguments().getBoolean("is_auto_refresh", true);
    }

    /* JADX INFO: renamed from: g1 */
    public void m13339g1() {
        this.f12011b = this.f12010a.f2914C.mo3004L0();
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m13340h1(int i, List<Moment> list) throws Throwable {
        if (this.f12019j.size() <= i) {
            return false;
        }
        this.f12019j.addAll(i, list);
        m13317P1(this.f12019j, false);
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m13341i1(String str) {
        zpd0 zpd0Var = new zpd0("show_guide_time_" + str + FeedModule.m1139F().userId() + this.f12017h, 0L);
        tpd0 tpd0Var = new tpd0("show_man_made_guide_count_" + str + FeedModule.m1139F().userId() + this.f12017h, 0);
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        return jLongValue <= 0 || !a5i.m8412l(jLongValue, mqi0.o()) || ((Integer) tpd0Var.get()).intValue() < fm20.m10234n();
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m13342k1() {
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m13343l1(String str) {
        StringBuilder sb = new StringBuilder("show_guide_time_");
        sb.append(str);
        sb.append(FeedModule.m1139F().userId());
        sb.append(this.f12017h);
        return !a5i.m8412l(((Long) new zpd0(sb.toString(), 0L).get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Boolean m13344m1(List list) {
        boolean z = list.size() > ((Integer) FeedModule.f320h.lastDetectedMediaCount.get()).intValue() && ((Integer) FeedModule.f320h.lastDetectedMediaCount.get()).intValue() > 0;
        this.f12025p = list.size();
        this.f12024o = list.size();
        if (((Integer) FeedModule.f320h.lastDetectedMediaCount.get()).intValue() == 0) {
            FeedModule.f320h.lastDetectedMediaCount.put(Integer.valueOf(this.f12025p));
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m13345n1(Integer num) {
        if (kjb0.m11468t(act())) {
            kjb0.m11437A(act(), num.intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m13346s1(Moment moment) {
        return Boolean.valueOf(moment.owner.equals(this.f12012c) && ((DbObject) moment).id.startsWith("fake_id_"));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ Boolean m13347t1(Moment moment) {
        return Boolean.valueOf(!this.f12019j.contains(moment));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ Boolean m13348u1(Moment moment) {
        return Boolean.valueOf(((DbObject) moment).id.equals(this.f12016g));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m13349v1(List list, int i, boolean z, User user, aai aaiVar) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) vwb.r(list, new w9j() { // from class: l.by60
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).feedVoiceUserEntryInfo != null);
                }
            });
            if (moment != null) {
                moment.feedVoiceUserEntryInfo = aaiVar;
            } else if (aaiVar.b.size() != 0) {
                list.add(i2, FeedModule.f316d.m16459G6(aaiVar));
            }
            m13308B1(list, z, user);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m13350x1(List list, boolean z, User user, List list2) throws Throwable {
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
                        moment.live.f228id = feedUserLiveLabel.liveId;
                    }
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                    moment.setLiveDataChange(true);
                }
            }
        }
        m13308B1(list, z, user);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m13351z1(List list, int i, boolean z, User user, bkn0.a aVar) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) vwb.r(list, new w9j() { // from class: l.ay60
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).voiceLiveApiInfo != null);
                }
            });
            if (moment != null) {
                moment.voiceLiveApiInfo = aVar;
            } else if (aVar.a != 0) {
                list.add(i2, FeedModule.f316d.m16466H6(aVar));
            }
            m13308B1(list, z, user);
        }
    }

    public void destroy() {
    }
}
