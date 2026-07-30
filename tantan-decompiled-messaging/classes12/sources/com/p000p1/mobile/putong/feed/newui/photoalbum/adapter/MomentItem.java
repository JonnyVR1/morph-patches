package com.p000p1.mobile.putong.feed.newui.photoalbum.adapter;

import com.p000p1.mobile.putong.data.MomentType;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentViewerBox;
import com.p000p1.mobile.putong.feed.data.NearbyOnline;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.data.SingleTopic;
import com.p000p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.data.TopicOperationsGroup;
import java.util.List;
import l.j760;
import p007l.q5i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentItem {

    /* JADX INFO: renamed from: a */
    public int f2809a;

    /* JADX INFO: renamed from: b */
    public int f2810b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f2811c;

    /* JADX INFO: renamed from: d */
    public Moment f2812d;

    /* JADX INFO: renamed from: e */
    public boolean f2813e;

    /* JADX INFO: renamed from: f */
    public int f2814f;

    /* JADX INFO: renamed from: g */
    public int f2815g;

    /* JADX INFO: renamed from: h */
    public boolean f2816h;

    /* JADX INFO: renamed from: i */
    public boolean f2817i;

    /* JADX INFO: renamed from: j */
    public String f2818j;

    /* JADX INFO: renamed from: k */
    public VoiceType f2819k;

    /* JADX INFO: renamed from: l */
    public LiveRecommendCard f2820l;

    /* JADX INFO: renamed from: m */
    public int f2821m;

    /* JADX INFO: renamed from: n */
    public int f2822n;

    /* JADX INFO: renamed from: o */
    public j760<List<CategoryTopic>, List<TopicMoment>> f2823o;

    /* JADX INFO: renamed from: p */
    public int f2824p;

    /* JADX INFO: renamed from: q */
    public String f2825q;

    /* JADX INFO: renamed from: r */
    public j760<TopicOperations, List<TopicMoment>> f2826r;

    /* JADX INFO: renamed from: s */
    public NearbyOnline f2827s;

    /* JADX INFO: renamed from: t */
    public StateSquareEntrance f2828t;

    /* JADX INFO: renamed from: u */
    public MomentViewerBox f2829u;

    /* JADX INFO: renamed from: v */
    public SingleTopic f2830v;

    /* JADX INFO: renamed from: w */
    public TopicMoment f2831w;

    /* JADX INFO: renamed from: x */
    public j760<List<RecommendUsers>, List<Moment>> f2832x;

    /* JADX INFO: renamed from: y */
    public j760<TopicOperations, List<TopicMoment>> f2833y;

    /* JADX INFO: renamed from: z */
    public j760<TopicOperationsGroup, Group> f2834z;

    public enum VoiceType {
        card,
        profile
    }

    public MomentItem(Moment moment, int i, int i2, int i3) {
        this.f2811c = null;
        this.f2813e = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2810b = i3;
        this.f2814f = i;
        this.f2815g = i2;
        this.f2816h = false;
        this.f2821m = q5i.m13400l(FeedModule.f316d.m16628e8(moment.owner), true);
        this.f2822n = q5i.m13399k(FeedModule.f316d.m16628e8(moment.owner), true);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4908a() {
        return this.f2823o != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4909b() {
        Moment moment = this.f2812d;
        return (moment == null || moment.liveCircleBanner == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4910c() {
        return this.f2820l != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m4911d() {
        return this.f2811c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo4912e() {
        return (this.f2812d == null || this.f2816h || this.f2811c != null || m4918k() || m4920m() || this.f2819k != null || m4910c() || m4919l() || m4909b()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4913f() {
        return this.f2829u != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4914g() {
        return this.f2827s != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4915h() {
        return this.f2826r != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4916i() {
        return this.f2833y != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4917j() {
        return this.f2832x != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m4918k() {
        Moment moment = this.f2812d;
        return moment != null && TEnum.equals(moment.momentType, MomentType.seeAd);
    }

    /* JADX INFO: renamed from: l */
    public boolean m4919l() {
        Moment moment = this.f2812d;
        return (moment == null || moment.mFeedSeeMoreFollowingMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m4920m() {
        return this.f2817i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m4921n() {
        return this.f2834z != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m4922o() {
        return this.f2830v != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m4923p() {
        return this.f2828t != null;
    }

    public MomentItem(Moment moment) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
    }

    public MomentItem() {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
    }

    public MomentItem(Moment moment, int i, int i2, int i3, int i4) {
        this(moment, i, i2, i3);
        this.f2809a = i4;
    }

    public MomentItem(Moment moment, String str) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2818j = str;
        this.f2817i = true;
    }

    public MomentItem(Moment moment, VoiceType voiceType) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2819k = voiceType;
    }

    public MomentItem(Moment moment, j760<List<CategoryTopic>, List<TopicMoment>> j760Var, String str, int i) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2812d = moment;
        this.f2823o = j760Var;
        this.f2825q = str;
        this.f2824p = i;
    }

    public MomentItem(Moment moment, j760<TopicOperations, List<TopicMoment>> j760Var) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2826r = j760Var;
    }

    public MomentItem(Moment moment, j760<TopicOperations, List<TopicMoment>> j760Var, int i) {
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2833y = j760Var;
        this.f2810b = i;
    }

    public MomentItem(Moment moment, TopicMoment topicMoment, SingleTopic singleTopic) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2830v = singleTopic;
        this.f2831w = topicMoment;
    }

    public MomentItem(Moment moment, NearbyOnline nearbyOnline) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2827s = nearbyOnline;
    }

    public MomentItem(Moment moment, StateSquareEntrance stateSquareEntrance) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2828t = stateSquareEntrance;
    }

    public MomentItem(Moment moment, MomentViewerBox momentViewerBox) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2829u = momentViewerBox;
    }

    public MomentItem(Moment moment, String str, int i, j760<List<RecommendUsers>, List<Moment>> j760Var) {
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2832x = j760Var;
        this.f2825q = str;
        this.f2810b = i;
    }

    public MomentItem(Moment moment, LiveRecommendCard liveRecommendCard) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2820l = liveRecommendCard;
    }

    public MomentItem(j760<TopicOperationsGroup, Group> j760Var, Moment moment) {
        this.f2810b = -1;
        this.f2811c = null;
        this.f2813e = false;
        this.f2814f = 0;
        this.f2815g = 0;
        this.f2816h = false;
        this.f2821m = 0;
        this.f2822n = 0;
        this.f2824p = -1;
        this.f2812d = moment;
        this.f2834z = j760Var;
    }
}
