package com.p046p1.mobile.putong.feed.newui.photoalbum.adapter;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CategoryTopic;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentViewerBox;
import com.p046p1.mobile.putong.feed.data.NearbyOnline;
import com.p046p1.mobile.putong.feed.data.RecommendUsers;
import com.p046p1.mobile.putong.feed.data.SingleTopic;
import com.p046p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.data.TopicOperationsGroup;
import java.util.List;
import p149l.j760;
import p149l.q5i;

/* JADX INFO: loaded from: classes12.dex */
public class MomentItem {

    /* JADX INFO: renamed from: a */
    public int f41348a;

    /* JADX INFO: renamed from: b */
    public int f41349b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f41350c;

    /* JADX INFO: renamed from: d */
    public Moment f41351d;

    /* JADX INFO: renamed from: e */
    public boolean f41352e;

    /* JADX INFO: renamed from: f */
    public int f41353f;

    /* JADX INFO: renamed from: g */
    public int f41354g;

    /* JADX INFO: renamed from: h */
    public boolean f41355h;

    /* JADX INFO: renamed from: i */
    public boolean f41356i;

    /* JADX INFO: renamed from: j */
    public String f41357j;

    /* JADX INFO: renamed from: k */
    public VoiceType f41358k;

    /* JADX INFO: renamed from: l */
    public LiveRecommendCard f41359l;

    /* JADX INFO: renamed from: m */
    public int f41360m;

    /* JADX INFO: renamed from: n */
    public int f41361n;

    /* JADX INFO: renamed from: o */
    public j760<List<CategoryTopic>, List<TopicMoment>> f41362o;

    /* JADX INFO: renamed from: p */
    public int f41363p;

    /* JADX INFO: renamed from: q */
    public String f41364q;

    /* JADX INFO: renamed from: r */
    public j760<TopicOperations, List<TopicMoment>> f41365r;

    /* JADX INFO: renamed from: s */
    public NearbyOnline f41366s;

    /* JADX INFO: renamed from: t */
    public StateSquareEntrance f41367t;

    /* JADX INFO: renamed from: u */
    public MomentViewerBox f41368u;

    /* JADX INFO: renamed from: v */
    public SingleTopic f41369v;

    /* JADX INFO: renamed from: w */
    public TopicMoment f41370w;

    /* JADX INFO: renamed from: x */
    public j760<List<RecommendUsers>, List<Moment>> f41371x;

    /* JADX INFO: renamed from: y */
    public j760<TopicOperations, List<TopicMoment>> f41372y;

    /* JADX INFO: renamed from: z */
    public j760<TopicOperationsGroup, Group> f41373z;

    public enum VoiceType {
        card,
        profile
    }

    public MomentItem(Moment moment, int i, int i2, int i3) {
        this.f41350c = null;
        this.f41352e = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41349b = i3;
        this.f41353f = i;
        this.f41354g = i2;
        this.f41355h = false;
        this.f41360m = q5i.m173017l(FeedModule.f38855d.m209447e8(moment.owner), true);
        this.f41361n = q5i.m173016k(FeedModule.f38855d.m209447e8(moment.owner), true);
    }

    /* JADX INFO: renamed from: a */
    public boolean m63874a() {
        return this.f41362o != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m63875b() {
        Moment moment = this.f41351d;
        return (moment == null || moment.liveCircleBanner == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m63876c() {
        return this.f41359l != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m63877d() {
        return this.f41350c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo63878e() {
        return (this.f41351d == null || this.f41355h || this.f41350c != null || m63884k() || m63886m() || this.f41358k != null || m63876c() || m63885l() || m63875b()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m63879f() {
        return this.f41368u != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m63880g() {
        return this.f41366s != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m63881h() {
        return this.f41365r != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m63882i() {
        return this.f41372y != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m63883j() {
        return this.f41371x != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m63884k() {
        Moment moment = this.f41351d;
        return moment != null && TEnum.equals(moment.momentType, "seeAd");
    }

    /* JADX INFO: renamed from: l */
    public boolean m63885l() {
        Moment moment = this.f41351d;
        return (moment == null || moment.mFeedSeeMoreFollowingMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m63886m() {
        return this.f41356i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m63887n() {
        return this.f41373z != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m63888o() {
        return this.f41369v != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m63889p() {
        return this.f41367t != null;
    }

    public MomentItem(Moment moment) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
    }

    public MomentItem() {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
    }

    public MomentItem(Moment moment, int i, int i2, int i3, int i4) {
        this(moment, i, i2, i3);
        this.f41348a = i4;
    }

    public MomentItem(Moment moment, String str) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41357j = str;
        this.f41356i = true;
    }

    public MomentItem(Moment moment, VoiceType voiceType) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41358k = voiceType;
    }

    public MomentItem(Moment moment, j760<List<CategoryTopic>, List<TopicMoment>> j760Var, String str, int i) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41351d = moment;
        this.f41362o = j760Var;
        this.f41364q = str;
        this.f41363p = i;
    }

    public MomentItem(Moment moment, j760<TopicOperations, List<TopicMoment>> j760Var) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41365r = j760Var;
    }

    public MomentItem(Moment moment, j760<TopicOperations, List<TopicMoment>> j760Var, int i) {
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41372y = j760Var;
        this.f41349b = i;
    }

    public MomentItem(Moment moment, TopicMoment topicMoment, SingleTopic singleTopic) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41369v = singleTopic;
        this.f41370w = topicMoment;
    }

    public MomentItem(Moment moment, NearbyOnline nearbyOnline) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41366s = nearbyOnline;
    }

    public MomentItem(Moment moment, StateSquareEntrance stateSquareEntrance) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41367t = stateSquareEntrance;
    }

    public MomentItem(Moment moment, MomentViewerBox momentViewerBox) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41368u = momentViewerBox;
    }

    public MomentItem(Moment moment, String str, int i, j760<List<RecommendUsers>, List<Moment>> j760Var) {
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41371x = j760Var;
        this.f41364q = str;
        this.f41349b = i;
    }

    public MomentItem(Moment moment, LiveRecommendCard liveRecommendCard) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41359l = liveRecommendCard;
    }

    public MomentItem(j760<TopicOperationsGroup, Group> j760Var, Moment moment) {
        this.f41349b = -1;
        this.f41350c = null;
        this.f41352e = false;
        this.f41353f = 0;
        this.f41354g = 0;
        this.f41355h = false;
        this.f41360m = 0;
        this.f41361n = 0;
        this.f41363p = -1;
        this.f41351d = moment;
        this.f41373z = j760Var;
    }
}
