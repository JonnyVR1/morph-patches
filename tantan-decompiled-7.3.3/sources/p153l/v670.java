package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p051p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.C11460a;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class v670 extends ar2<y670> {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBaseFrag f182604a;

    /* JADX INFO: renamed from: b */
    public n570 f182605b;

    /* JADX INFO: renamed from: c */
    public String f182606c;

    /* JADX INFO: renamed from: d */
    public String f182607d;

    /* JADX INFO: renamed from: e */
    public boolean f182608e;

    /* JADX INFO: renamed from: f */
    public int f182609f;

    /* JADX INFO: renamed from: g */
    public String f182610g;

    /* JADX INFO: renamed from: h */
    public int f182611h;

    /* JADX INFO: renamed from: i */
    public boolean f182612i;

    /* JADX INFO: renamed from: j */
    public List<Moment> f182613j;

    /* JADX INFO: renamed from: k */
    public Links f182614k;

    /* JADX INFO: renamed from: l */
    public x20 f182615l;

    /* JADX INFO: renamed from: m */
    public bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> f182616m;

    /* JADX INFO: renamed from: n */
    public wyd0 f182617n;

    /* JADX INFO: renamed from: o */
    public int f182618o;

    /* JADX INFO: renamed from: p */
    public int f182619p;

    /* JADX INFO: renamed from: q */
    public boolean f182620q;

    public v670(ner nerVar) {
        super(nerVar);
        this.f182610g = User.ID_TEAM_ACCOUNT;
        this.f182613j = new ArrayList();
        this.f182617n = new wyd0("history_city_guide_" + FeedModule.m61405F().userId(), "");
        this.f182604a = (PhotoAlbumBaseFrag) nerVar;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m199968D0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m199980f0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m199982h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m199983i0(Boolean bool) {
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m199985j1() {
        return FeedModule.m61405F().userId().equals(this.f182606c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m199991o1(Bundle bundle) {
        ((y670) this.viewModel).m214396l();
        if (NullChecker.m82486a(this.f182615l)) {
            this.f182615l.call();
        }
        if (this.f182605b instanceof hv00) {
            duringCreated(mrb0.m159656j()).map(new qcj() { // from class: l.q670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.r670
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161454a.m200040n1((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m199993p1() {
        ((y670) this.viewModel).m214397m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m199995q1(C4470c c4470c) {
        V v2 = this.viewModel;
        if (((y670) v2).f197642f) {
            ((y670) v2).m214383B();
        }
        if (!(this.f182605b instanceof vpc0) || jyb.m147479J(this.f182613j)) {
            return;
        }
        ((vpc0) this.f182605b).m202223S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m199997r1(uxj0 uxj0Var) {
        V v2 = this.viewModel;
        if (((y670) v2).f197642f) {
            ((y670) v2).m214383B();
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
    public final void m200004B1(List<Moment> list, boolean z, User user) throws Throwable {
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
        List<MomentMessage> listMo137268j;
        PartialIdList partialIdList;
        int i4;
        n570 n570Var;
        Moment moment;
        Moment moment2;
        Moment moment3;
        int size;
        RawFeed rawFeedM177160c;
        String str2;
        int i5;
        int i6;
        int i7;
        List<Moment> list2 = list;
        jyb.m147503d0(list2, new qcj() { // from class: l.w570
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187484a.m200041s1((Moment) obj);
            }
        });
        n570 n570Var2 = this.f182605b;
        boolean z3 = n570Var2 instanceof hu60;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i8 = 1;
        if (z3 || (n570Var2 instanceof C11460a)) {
            Object obj = "";
            for (Moment moment4 : list2) {
                String strM200029a1 = (p6i.m170903l((long) moment4.createdTime, System.currentTimeMillis()) || moment4.createdTime == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? m200029a1() : p6i.m170894c((long) moment4.createdTime) + "/" + ksg.m151216m(p6i.m170895d((long) moment4.createdTime) + 1, true);
                if (strM200029a1.equals(obj)) {
                    moment4.feedTime = "";
                } else {
                    moment4.feedTime = strM200029a1;
                    obj = strM200029a1;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        HashMap map3 = new HashMap();
        int i9 = -1;
        if (NullChecker.m82486a(this.f182616m) && !jyb.m147479J(this.f182616m.f77081a)) {
            int i10 = -1;
            int i11 = 0;
            while (i11 < this.f182616m.f77081a.size()) {
                TopicOperations topicOperations8 = this.f182616m.f77081a.get(i11);
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
        if (NullChecker.m82486a(this.f182616m) && !jyb.m147479J(this.f182616m.f77081a)) {
            int i12 = -1;
            for (int i13 = 0; i13 < this.f182616m.f77081a.size(); i13++) {
                TopicOperations topicOperations9 = this.f182616m.f77081a.get(i13);
                if (TEnum.equals(topicOperations9.operationType, OperationType.nearby_online) && (i6 = topicOperations9.position) != i12) {
                    map4.put(Integer.valueOf(i6), topicOperations9);
                    i12 = i6;
                }
            }
        }
        HashMap map5 = new HashMap();
        if (cmg.m111177E() && NullChecker.m82486a(this.f182616m) && !jyb.m147479J(this.f182616m.f77081a)) {
            for (int i14 = 0; i14 < this.f182616m.f77081a.size(); i14++) {
                TopicOperations topicOperations10 = this.f182616m.f77081a.get(i14);
                if (TEnum.equals(topicOperations10.operationType, OperationType.state_square_entrance) && (i5 = topicOperations10.position) != i9) {
                    map5.put(Integer.valueOf(i5), topicOperations10);
                    i9 = i5;
                }
            }
        }
        if (!NullChecker.m82486a(this.f182616m) || jyb.m147479J(this.f182616m.f77081a)) {
            th = null;
            topicOperations = null;
            topicOperations2 = null;
            topicOperations3 = null;
            topicOperations4 = null;
            topicOperations5 = null;
            topicOperations6 = null;
        } else {
            topicOperations2 = (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.x570
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.category_topic));
                }
            });
            topicOperations5 = (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.y570
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.single_topic));
                }
            });
            topicOperations6 = (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.a670
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_user));
                }
            });
            th = null;
            topicOperations3 = (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.b670
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj2).operationType, OperationType.recommend_topic));
                }
            });
            topicOperations4 = cmg.m111186N() ? (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.c670
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    TopicOperations topicOperations11 = (TopicOperations) obj2;
                    return Boolean.valueOf(TEnum.equals(topicOperations11.operationType, "group") || (cmg.m111187O() && TEnum.equals(topicOperations11.operationType, OperationType.single_group)));
                }
            }) : null;
            topicOperations = cmg.m111192T() ? (TopicOperations) jyb.m147529r(this.f182616m.f77081a, new qcj() { // from class: l.d670
                @Override // p153l.qcj
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
            if (cch.m108707b() && this.f182611h == 12 && i15 == cch.m108706a()) {
                arrayList.add(new to00(list2.get(i15), i15));
                break;
            }
            if (!NullChecker.m82486a(this.f182616m) || jyb.m147479J(this.f182616m.f77081a)) {
                str3 = str3;
                topicOperations = topicOperations;
            } else {
                if (NullChecker.m82486a(topicOperations) && i15 == topicOperations.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), topicOperations.momentViewer));
                }
                if (NullChecker.m82486a(topicOperations4) && i15 == topicOperations4.position - 1) {
                    if (TextUtils.isEmpty(topicOperations4.group.momentId)) {
                        TopicOperationsGroup topicOperationsGroup = topicOperations4.singleGroup;
                        final String str4 = topicOperationsGroup.momentId;
                        arrayList.add(new MomentItem((pf60<TopicOperationsGroup, Group>) new pf60(topicOperationsGroup, FeedModule.f39703d.m145799u7(topicOperationsGroup.groupId)), (Moment) jyb.m147529r(this.f182616m.f77083c, new qcj() { // from class: l.e670
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((Moment) obj2).f56859id.equals(str4));
                            }
                        })));
                    } else {
                        TopicOperationsGroup topicOperationsGroup2 = topicOperations4.group;
                        final String str5 = topicOperationsGroup2.momentId;
                        arrayList.add(new MomentItem((pf60<TopicOperationsGroup, Group>) new pf60(topicOperationsGroup2, FeedModule.f39703d.m145799u7(topicOperationsGroup2.groupId)), (Moment) jyb.m147529r(this.f182616m.f77083c, new qcj() { // from class: l.f670
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(((Moment) obj2).f56859id.equals(str5));
                            }
                        })));
                    }
                }
                MomentItem momentItemM200023V0 = m200023V0(i15, topicOperations2, topicOperations5, topicOperations6);
                if (NullChecker.m82486a(momentItemM200023V0)) {
                    arrayList.add(momentItemM200023V0);
                }
                int i18 = i15 + 1;
                if (NullChecker.m82486a(map3.get(Integer.valueOf(i18)))) {
                    arrayList.add(new MomentItem(Moment.new_(), (pf60<TopicOperations, List<TopicMoment>>) new pf60((TopicOperations) map3.get(Integer.valueOf(i18)), this.f182616m.f77082b)));
                }
                if (NullChecker.m82486a(map4.get(Integer.valueOf(i18))) && ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline.userCount >= 3) {
                    arrayList.add(new MomentItem(Moment.new_(), ((TopicOperations) map4.get(Integer.valueOf(i18))).nearbyOnline));
                }
                if (NullChecker.m82486a(map5.get(Integer.valueOf(i18)))) {
                    Moment momentNew_ = Moment.new_();
                    TopicOperations topicOperations11 = (TopicOperations) map5.get(Integer.valueOf(i18));
                    Objects.requireNonNull(topicOperations11);
                    arrayList.add(new MomentItem(momentNew_, topicOperations11.stateSquareEntrance));
                }
                boolean zM82486a = NullChecker.m82486a(topicOperations3);
                topicOperations3 = topicOperations3;
                if (zM82486a && i15 == topicOperations3.position - 1) {
                    arrayList.add(new MomentItem(Moment.new_(), (pf60<TopicOperations, List<TopicMoment>>) new pf60(topicOperations3, this.f182616m.f77082b), 3));
                }
                if (NullChecker.m82486a(th)) {
                    throw th;
                }
            }
            list2 = list;
            Moment moment5 = list2.get(i15);
            if (NullChecker.m82487b(moment5)) {
                if (this.f182608e) {
                    map = map3;
                    HashMap map6 = map4;
                    if (moment5.createdTime > d3) {
                        StringBuilder sb = new StringBuilder();
                        map5 = map5;
                        sb.append(p6i.m170896e((long) moment5.createdTime));
                        sb.append(FeedModule.f39700a.getString(R$string.f39781M));
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
                            if (!p6i.m170901j((long) moment5.createdTime, System.currentTimeMillis())) {
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
                        if (NullChecker.m82486a(moment5.liveRecommendCard)) {
                            arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                        } else if (moment5.voiceLiveApiInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                        } else if (moment5.feedVoiceUserEntryInfo != null) {
                            arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                        } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null && moment5.liveCircleBanner == null) {
                            if (cmg.m111182J() && this.f182611h == 14 && this.f182605b.m161687p()) {
                                rawFeedM177160c = this.f182605b.f140315b.m177160c(list2.get(i15).f56859id);
                                if (!NullChecker.m82486a(rawFeedM177160c) && rawFeedM177160c.isRoamHighlight) {
                                    arrayList.add(new so00(moment5, rawFeedM177160c, i15));
                                }
                            }
                            listMo137268j = this.f182605b.mo137268j(moment5);
                            partialIdList = moment5.messages;
                            if (partialIdList == null) {
                                i4 = 0;
                            } else {
                                i4 = partialIdList.count;
                            }
                            if (!listMo137268j.isEmpty()) {
                                if (listMo137268j.size() >= 3) {
                                    size = listMo137268j.size() - 3;
                                } else {
                                    size = 0;
                                }
                                listMo137268j = listMo137268j.subList(size, listMo137268j.size());
                            }
                            n570Var = this.f182605b;
                            if (!(n570Var instanceof hu60) || (n570Var instanceof C11460a)) {
                                moment = moment5;
                                i2 = i15;
                            } else {
                                moment = moment5;
                                i2 = i15;
                                arrayList.add(new MomentItem(moment, listMo137268j.size(), i4, 0, i2));
                            }
                            moment2 = moment;
                            arrayList.add(new MomentItem(moment, listMo137268j.size(), i4, 1, i2));
                            i3 = i8;
                            if (this.f182611h == i3 || !moment2.isVoiceLive) {
                                MomentItem momentItem = new MomentItem(moment2, listMo137268j.size(), i4, 2, i2);
                                moment3 = moment2;
                                arrayList.add(momentItem);
                            } else {
                                moment3 = moment2;
                            }
                            if (i2 < this.f182609f) {
                                i16 += 3;
                            }
                            if (!t8c.m189652e().f172520a && this.f182611h == 0 && moment3.f56859id.equals(t8c.m189652e().f172521b)) {
                                t8c.m189652e().f172522c = arrayList.size() + 6;
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
                    if (NullChecker.m82486a(moment5.liveRecommendCard)) {
                        arrayList.add(new MomentItem(moment5, moment5.liveRecommendCard));
                    } else if (moment5.voiceLiveApiInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.card));
                    } else if (moment5.feedVoiceUserEntryInfo != null) {
                        arrayList.add(new MomentItem(moment5, MomentItem.VoiceType.profile));
                    } else if (moment5.mFeedSeeMoreFollowingMomentInfo != null) {
                        arrayList.add(new MomentItem(moment5));
                    } else {
                        if (cmg.m111182J()) {
                            rawFeedM177160c = this.f182605b.f140315b.m177160c(list2.get(i15).f56859id);
                            if (!NullChecker.m82486a(rawFeedM177160c)) {
                            }
                        }
                        listMo137268j = this.f182605b.mo137268j(moment5);
                        partialIdList = moment5.messages;
                        if (partialIdList == null) {
                            i4 = 0;
                        } else {
                            i4 = partialIdList.count;
                        }
                        if (!listMo137268j.isEmpty()) {
                            if (listMo137268j.size() >= 3) {
                                size = listMo137268j.size() - 3;
                            } else {
                                size = 0;
                            }
                            listMo137268j = listMo137268j.subList(size, listMo137268j.size());
                        }
                        n570Var = this.f182605b;
                        if (n570Var instanceof hu60) {
                            moment = moment5;
                            i2 = i15;
                        } else {
                            moment = moment5;
                            i2 = i15;
                        }
                        moment2 = moment;
                        arrayList.add(new MomentItem(moment, listMo137268j.size(), i4, 1, i2));
                        i3 = i8;
                        if (this.f182611h == i3) {
                            MomentItem momentItem2 = new MomentItem(moment2, listMo137268j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem2);
                        } else {
                            MomentItem momentItem3 = new MomentItem(moment2, listMo137268j.size(), i4, 2, i2);
                            moment3 = moment2;
                            arrayList.add(momentItem3);
                        }
                        if (i2 < this.f182609f) {
                            i16 += 3;
                        }
                        if (!t8c.m189652e().f172520a) {
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
        if (NullChecker.m82486a(this.f182604a.f42301C)) {
            z2 = z;
            user2 = user;
            i = i16;
            if (this.f182604a.f42301C.mo63216n1(arrayList, z2, user2, i)) {
                return;
            }
        } else {
            z2 = z;
            user2 = user;
            i = i16;
        }
        ((y670) this.viewModel).m214385E(arrayList, z2, user2, i);
    }

    /* JADX INFO: renamed from: C1 */
    public void m200005C1(Map<String, Moment> map) throws Throwable {
        ListIterator<Moment> listIterator = this.f182613j.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.m82487b(next) && NullChecker.m82486a(map.get(next.f56859id)) && !next.equals(map.get(next.f56859id))) {
                this.f182613j.set(this.f182613j.indexOf(next), map.get(next.f56859id));
            }
        }
        act().hideInput();
        if (this.f182613j.isEmpty()) {
            return;
        }
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: D1 */
    public void m200006D1(final String str, boolean z) {
        if (z) {
            this.f182613j = jyb.m147522n(this.f182613j, new qcj() { // from class: l.j670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Moment) obj).owner.equals(str));
                }
            });
        }
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: E1 */
    public void mo149176E1() {
        ((y670) this.viewModel).m214387G(true);
        if (this.f182613j.isEmpty()) {
            m200013P1(this.f182613j, false);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m200007F1() {
        n570 n570Var = this.f182605b;
        if (n570Var == null) {
            return;
        }
        n570Var.mo65689A();
        qvm.m178365d().m178366c(this.f182607d);
    }

    /* JADX INFO: renamed from: H1 */
    public void m200008H1(int i, int i2) {
        pf60<Integer, Integer> pf60VarM200030b1 = m200030b1();
        if (i == 0 && NullChecker.m82486a(pf60VarM200030b1)) {
            ((y670) this.viewModel).m214383B();
            m200009I1(pf60VarM200030b1.f152156a.intValue(), pf60VarM200030b1.f152157b.intValue());
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m200009I1(int i, int i2) {
        if (((y670) this.viewModel).m214394f()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i <= i2) {
            String strM214399q = ((y670) this.viewModel).m214399q(i);
            if (!TextUtils.isEmpty(strM214399q) && strM214399q.startsWith("http") && arrayList.size() < 5) {
                arrayList.add(strM214399q);
            }
            i++;
        }
        if (arrayList.size() > 0) {
            uqb0.m197248T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m200010J1(pf60<Links, List<Moment>> pf60Var) {
        this.f182614k = pf60Var.f152156a;
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            this.f182613j.addAll(jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.v570
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f182485a.m200042t1((Moment) obj);
                }
            }));
            m200013P1(this.f182613j, false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void mo149177L1(pf60<Links, List<Moment>> pf60Var) {
        if ("from_nearby_falls_feed".equals(this.f182607d)) {
            FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
        }
        this.f182614k = pf60Var.f152156a;
        if ((this.f182605b instanceof bg20) && jyb.m147479J(pf60Var.f152157b) && !jyb.m147479J(this.f182613j)) {
            return;
        }
        this.f182613j.clear();
        n570 n570Var = this.f182605b;
        if (!(n570Var instanceof hu60) && !(n570Var instanceof C11460a)) {
            this.f182613j.addAll(pf60Var.f152157b);
            m200013P1(this.f182613j, false);
            return;
        }
        User userMo137270m = n570Var.mo137270m(this.f182606c);
        if (NullChecker.m82486a(userMo137270m) && !FeedModule.m61405F().userId().equals(userMo137270m.f56859id) && userMo137270m.profile.moments.hidePublicMoments && !User.isMatched(userMo137270m)) {
            m200013P1(Collections.EMPTY_LIST, true);
            return;
        }
        if (userMo137270m == null) {
            MomentUserNullException.reportNullUserMoment(this.f182606c);
        }
        this.f182613j.addAll(pf60Var.f152157b);
        if ("from_activities_moment".equals(this.f182607d)) {
            this.f182613j = jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.u570
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f177583a.m200043u1((Moment) obj);
                }
            });
        }
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: N1 */
    public void m200011N1(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var) {
        this.f182616m = bkj0Var;
        m200012O1();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m200012O1() throws Throwable {
        if (!NullChecker.m82486a(this.f182616m) || jyb.m147479J(this.f182616m.f77081a)) {
            if (NullChecker.m82486a(this.f182616m)) {
                m200013P1(this.f182613j, false);
                return;
            }
            return;
        }
        ArrayList<TopicOperations> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f182616m.f77081a.size(); i++) {
            TopicOperations topicOperations = this.f182616m.f77081a.get(i);
            if (TEnum.equals(topicOperations.operationType, OperationType.change_city) && !(m200017R1() && m200038l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.new_user) && !(m200020T1() && m200038l1(topicOperations.operationType.toString()))) {
                arrayList.add(topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.album_num_inc)) {
                m200019S1(arrayList, topicOperations);
            } else if (TEnum.equals(topicOperations.operationType, OperationType.man_made) && !m200036i1(topicOperations.operationType.toString())) {
                arrayList.add(topicOperations);
            }
        }
        Iterator<TopicOperations> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f182616m.f77081a.remove(it.next());
        }
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: P1 */
    public void m200013P1(List<Moment> list, boolean z) throws Throwable {
        m200015Q1(list, z, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m200014Q0(Moment moment) throws Throwable {
        this.f182613j.add(0, moment);
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m200015Q1(List<Moment> list, boolean z, User user) throws Throwable {
        final v670 v670Var;
        final List<Moment> list2;
        final boolean z2;
        final User user2;
        m200004B1(list, z, user);
        if (!j4h.m143420d() || (act() instanceof TopicAggregationAct)) {
            return;
        }
        String strMo119423e = FeedModule.m61407M().feedEntry().mo119423e();
        final int iMo119421c = FeedModule.m61407M().feedEntry().mo119421c();
        if (!"from_nearby_falls_feed".equals(this.f182607d) || TextUtils.isEmpty(strMo119423e) || iMo119421c == -1) {
            v670Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
        } else if ("room".equals(strMo119423e)) {
            v670Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            duringCreated(FeedModule.m61407M().feedEntry().mo119426h()).subscribe(psd0.m173597H(new y20() { // from class: l.t670
                @Override // p153l.y20
                public final void call(Object obj) throws Throwable {
                    this.f172309a.m200046z1(list2, iMo119421c, z2, user2, (ftn0.C17070a) obj);
                }
            }, new y20() { // from class: l.u670
                @Override // p153l.y20
                public final void call(Object obj) {
                    v670.m199968D0((Throwable) obj);
                }
            }));
        } else {
            v670Var = this;
            list2 = list;
            z2 = z;
            user2 = user;
            if ("user".equals(strMo119423e)) {
                v670Var.duringCreated(FeedModule.m61407M().feedEntry().mo119425g()).subscribe(psd0.m173597H(new y20() { // from class: l.p570
                    @Override // p153l.y20
                    public final void call(Object obj) throws Throwable {
                        this.f150618a.m200044v1(list2, iMo119421c, z2, user2, (pbi) obj);
                    }
                }, new y20() { // from class: l.q570
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        v670.m199982h0((Throwable) obj);
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
        v670Var.duringCreated(FeedModule.f39703d.m145687e7(v670Var.m200028Y0(), hashSet)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.r570
            @Override // p153l.y20
            public final void call(Object obj) throws Throwable {
                this.f161322a.m200045x1(list2, z2, user2, (List) obj);
            }
        }, new y20() { // from class: l.s570
            @Override // p153l.y20
            public final void call(Object obj) {
                v670.m199980f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m200016R0(Moment moment, String str) throws Throwable {
        for (int i = 0; i < this.f182613j.size(); i++) {
            if (TextUtils.equals(this.f182613j.get(i).f56859id, moment.f56859id)) {
                return;
            }
        }
        int i2 = 0;
        while (i2 < this.f182613j.size()) {
            if (TextUtils.equals(this.f182613j.get(i2).f56859id, str)) {
                this.f182613j.add(i2 + 1, moment);
                m200013P1(this.f182613j, false);
            }
            i2++;
        }
        i2 = -1;
        this.f182613j.add(i2 + 1, moment);
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: R1 */
    public final boolean m200017R1() {
        String str = FeedModule.m61406H().me_().location.region.city;
        String str2 = this.f182617n.get();
        if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
            return true;
        }
        this.f182617n.put(str);
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public void m200018S0(List<Moment> list, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f182613j.size()) {
                    arrayList.add(list.get(i));
                    break;
                } else if (TextUtils.equals(this.f182613j.get(i2).f56859id, list.get(i).f56859id)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = 0;
        while (i3 < this.f182613j.size()) {
            if (TextUtils.equals(this.f182613j.get(i3).f56859id, str)) {
                this.f182613j.addAll(i3 + 1, arrayList);
                m200013P1(this.f182613j, false);
            }
            i3++;
        }
        i3 = -1;
        this.f182613j.addAll(i3 + 1, arrayList);
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m200019S1(ArrayList<TopicOperations> arrayList, TopicOperations topicOperations) {
        if (!m200038l1(topicOperations.operationType.toString())) {
            arrayList.add(topicOperations);
            return;
        }
        if (!PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            arrayList.add(topicOperations);
            return;
        }
        int i = this.f182619p;
        if (i == 0 || i <= FeedModule.f39707h.lastDetectedMediaCount.get().intValue() || FeedModule.f39707h.lastDetectedMediaCount.get().intValue() == 0) {
            arrayList.add(topicOperations);
        }
        if (cmg.m111194V()) {
            this.f182604a.duringCreated(m200032d1()).subscribe(psd0.m173596G(new y20() { // from class: l.i670
                @Override // p153l.y20
                public final void call(Object obj) {
                    v670.m199983i0((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final boolean m200020T1() {
        return p6i.m170898g((long) FeedModule.m61406H().me_().createdTime);
    }

    /* JADX INFO: renamed from: U0 */
    public void m200021U0(Moment moment) {
        if (moment.owner.equals(this.f182606c)) {
            int i = this.f182611h;
            if (i == 0 || i == 2) {
                m200014Q0(moment);
                if (moment.f56859id.startsWith("fake_id_")) {
                    return;
                }
                m200007F1();
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m200022U1(x20 x20Var) {
        this.f182615l = x20Var;
    }

    /* JADX INFO: renamed from: V0 */
    public final MomentItem m200023V0(int i, TopicOperations topicOperations, final TopicOperations topicOperations2, TopicOperations topicOperations3) {
        if (!jyb.m147479J(this.f182616m.f77082b) && topicOperations != null && !jyb.m147479J(topicOperations.categoryTopic) && i == topicOperations.position - 1) {
            return new MomentItem(Moment.new_(), (pf60<List<CategoryTopic>, List<TopicMoment>>) new pf60(topicOperations.categoryTopic, this.f182616m.f77082b), topicOperations.name, topicOperations.position);
        }
        if (NullChecker.m82486a(topicOperations2) && i == topicOperations2.position - 1) {
            return new MomentItem((Moment) jyb.m147529r(this.f182616m.f77083c, new qcj() { // from class: l.m670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).f56859id.equals(topicOperations2.singleTopic.momentId));
                }
            }), (TopicMoment) jyb.m147529r(this.f182616m.f77082b, new qcj() { // from class: l.n670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicOperations2.singleTopic.topicId));
                }
            }), topicOperations2.singleTopic);
        }
        if (NullChecker.m82486a(topicOperations3) && !jyb.m147479J(topicOperations3.recommendUsers) && i == topicOperations3.position - 1) {
            return new MomentItem(Moment.new_(), topicOperations3.name, 4, (pf60<List<RecommendUsers>, List<Moment>>) new pf60(topicOperations3.recommendUsers, this.f182616m.f77083c));
        }
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m200024V1(Moment moment) {
        if (NullChecker.m82486a(moment) && NullChecker.m82486a(moment.f56859id) && moment.f56859id.equals(lpg.m155193v().m155239u())) {
            lpg.m155193v().m155229j0();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m200025W0(final Moment moment) {
        int iM147476G = jyb.m147476G(this.f182613j, new qcj() { // from class: l.s670
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && moment2.f56859id.equals(moment.f56859id));
            }
        });
        if (iM147476G != -1) {
            this.f182613j.remove(iM147476G);
            m200013P1(this.f182613j, false);
        }
        m200024V1(moment);
    }

    /* JADX INFO: renamed from: W1 */
    public void m200026W1(Map<String, User> map) throws Throwable {
        if (this.f182613j.isEmpty()) {
            return;
        }
        if ("from_nearby_falls_feed".equals(this.f182607d) && "recommend_multiple".equals(this.f182607d) && "recommend_only_video".equals(this.f182607d)) {
            return;
        }
        m200013P1(this.f182613j, false);
    }

    /* JADX INFO: renamed from: X0 */
    public void m200027X0(final pf60<User, Boolean> pf60Var, boolean z) {
        if (!z || pf60Var.f152157b.booleanValue()) {
            m200015Q1(this.f182613j, false, pf60Var.f152156a);
            return;
        }
        ArrayList arrayListM147522n = jyb.m147522n(this.f182613j, new qcj() { // from class: l.t570
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Moment) obj).owner.equals(((User) pf60Var.f152156a).f56859id));
            }
        });
        this.f182613j = arrayListM147522n;
        m200013P1(arrayListM147522n, false);
    }

    /* JADX INFO: renamed from: Y0 */
    public String m200028Y0() {
        if ("from_nearby_focus".equals(this.f182607d)) {
            return "momentFollow";
        }
        if ("from_like".equals(this.f182607d)) {
            return "momentLike";
        }
        return (!"from_nearby_falls_feed".equals(this.f182607d) && "from_nearby_online".equals(this.f182607d)) ? "momentNearbyOnline" : "momentNearby";
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.o570
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145039a.m199991o1((Bundle) obj);
            }
        }, new x20() { // from class: l.z570
            @Override // p153l.x20
            public final void call() {
                this.f203011a.m199993p1();
            }
        });
        lifecycle().filter(new qcj() { // from class: l.k670
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.o670
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145146a.m199995q1((C4470c) obj);
            }
        }));
        duringCreated(FeedModule.m61406H().getAutoPlayVideoBs()).subscribe(psd0.m173596G(new y20() { // from class: l.p670
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150749a.m199997r1((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final String m200029a1() {
        if ((this.f182605b instanceof C11460a) && m199985j1() && this.f182608e) {
            return "";
        }
        return ((this.f182605b instanceof hu60) && !cmg.m111195W() && m199985j1()) ? "" : FeedModule.f39700a.getString(R$string.f39924i2);
    }

    /* JADX INFO: renamed from: b1 */
    public pf60<Integer, Integer> m200030b1() {
        if (((y670) this.viewModel).m214394f()) {
            return null;
        }
        RecyclerView.AbstractC0579o abstractC0579oM214398p = ((y670) this.viewModel).m214398p();
        if (!(abstractC0579oM214398p instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0579oM214398p;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition > 0) {
            return new pf60<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m200031c1() {
        return this.f182605b.mo149058n(this.f182614k) && !"from_activities_moment".equals(this.f182607d);
    }

    /* JADX INFO: renamed from: d1 */
    public final C22421c<Boolean> m200032d1() {
        avx avxVar = new avx(this.f182604a.act(), true, true);
        this.f182604a.act().getSupportLoaderManager().mo3089e(0, null, avxVar);
        return avxVar.m100542t().map(new qcj() { // from class: l.l670
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130238a.m200039m1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public void mo149178e1() {
        if ("recommend_only_video".equals(this.f182607d)) {
            this.f182605b = new vpc0((PhotoAlbumFeedBaseFrag) this.f182604a, true);
        } else if ("recommend_multiple".equals(this.f182607d)) {
            this.f182605b = new vpc0((PhotoAlbumFeedBaseFrag) this.f182604a, false);
        } else {
            m200034g1();
        }
        if (NullChecker.m82486a(this.f182605b)) {
            this.f182605b.mo65702o();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m200033f1() {
        this.f182620q = this.f182604a.getArguments().getBoolean("start_home_card");
        this.f182607d = this.f182604a.getArguments().getString("from");
        this.f182608e = this.f182604a.getArguments().getBoolean("from_feed_act");
        this.f182606c = this.f182604a.getArguments().getString("user_id");
        this.f182609f = this.f182604a.getArguments().getInt("selected_item_position");
        this.f182610g = this.f182604a.getArguments().getString("target_moment_id");
        this.f182611h = this.f182604a.getArguments().getInt("page_type", -1);
        this.f182612i = this.f182604a.getArguments().getBoolean("is_auto_refresh", true);
    }

    /* JADX INFO: renamed from: g1 */
    public void m200034g1() {
        this.f182605b = this.f182604a.f42301C.mo63211L0();
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m200035h1(int i, List<Moment> list) throws Throwable {
        if (this.f182613j.size() <= i) {
            return false;
        }
        this.f182613j.addAll(i, list);
        m200013P1(this.f182613j, false);
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m200036i1(String str) {
        byd0 byd0Var = new byd0("show_guide_time_" + str + FeedModule.m61405F().userId() + this.f182611h, 0L);
        vxd0 vxd0Var = new vxd0("show_man_made_guide_count_" + str + FeedModule.m61405F().userId() + this.f182611h, 0);
        long jLongValue = byd0Var.get().longValue();
        return jLongValue <= 0 || !p6i.m170903l(jLongValue, pzi0.m174454o()) || vxd0Var.get().intValue() < pu20.m173819n();
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m200037k1() {
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m200038l1(String str) {
        StringBuilder sb = new StringBuilder("show_guide_time_");
        sb.append(str);
        sb.append(FeedModule.m61405F().userId());
        sb.append(this.f182611h);
        return !p6i.m170903l(new byd0(sb.toString(), 0L).get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Boolean m200039m1(List list) {
        boolean z = list.size() > FeedModule.f39707h.lastDetectedMediaCount.get().intValue() && FeedModule.f39707h.lastDetectedMediaCount.get().intValue() > 0;
        this.f182619p = list.size();
        this.f182618o = list.size();
        if (FeedModule.f39707h.lastDetectedMediaCount.get().intValue() == 0) {
            FeedModule.f39707h.lastDetectedMediaCount.put(Integer.valueOf(this.f182619p));
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m200040n1(Integer num) {
        if (orb0.m168903t(act())) {
            orb0.m168872A(act(), num.intValue() > 0);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m200041s1(Moment moment) {
        return Boolean.valueOf(moment.owner.equals(this.f182606c) && moment.f56859id.startsWith("fake_id_"));
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ Boolean m200042t1(Moment moment) {
        return Boolean.valueOf(!this.f182613j.contains(moment));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ Boolean m200043u1(Moment moment) {
        return Boolean.valueOf(moment.f56859id.equals(this.f182610g));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m200044v1(List list, int i, boolean z, User user, pbi pbiVar) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) jyb.m147529r(list, new qcj() { // from class: l.h670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).feedVoiceUserEntryInfo != null);
                }
            });
            if (moment != null) {
                moment.feedVoiceUserEntryInfo = pbiVar;
            } else if (pbiVar.f151381b.size() != 0) {
                list.add(i2, FeedModule.f39703d.m145519G6(pbiVar));
            }
            m200004B1(list, z, user);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m200045x1(List list, boolean z, User user, List list2) throws Throwable {
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
                        moment.live.f39615id = feedUserLiveLabel.liveId;
                    }
                    moment.iconTitle = feedUserLiveLabel.iconTitle;
                    moment.multiCallInfo = feedUserLiveLabel.multiCallInfo;
                    moment.setLiveDataChange(true);
                }
            }
        }
        m200004B1(list, z, user);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m200046z1(List list, int i, boolean z, User user, ftn0.C17070a c17070a) throws Throwable {
        int i2 = i - 1;
        if (list.size() >= i2) {
            Moment moment = (Moment) jyb.m147529r(list, new qcj() { // from class: l.g670
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).voiceLiveApiInfo != null);
                }
            });
            if (moment != null) {
                moment.voiceLiveApiInfo = c17070a;
            } else if (c17070a.f100763a != 0) {
                list.add(i2, FeedModule.f39703d.m145526H6(c17070a));
            }
            m200004B1(list, z, user);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
