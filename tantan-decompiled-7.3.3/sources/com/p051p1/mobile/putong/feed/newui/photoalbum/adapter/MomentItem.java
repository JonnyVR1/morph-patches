package com.p051p1.mobile.putong.feed.newui.photoalbum.adapter;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentViewerBox;
import com.p051p1.mobile.putong.feed.data.NearbyOnline;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import com.p051p1.mobile.putong.feed.data.SingleTopic;
import com.p051p1.mobile.putong.feed.data.StateSquareEntrance;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.data.TopicOperationsGroup;
import java.util.List;
import p153l.f7i;
import p153l.pf60;

/* JADX INFO: loaded from: classes13.dex */
public class MomentItem {

    /* JADX INFO: renamed from: a */
    public int f42196a;

    /* JADX INFO: renamed from: b */
    public int f42197b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f42198c;

    /* JADX INFO: renamed from: d */
    public Moment f42199d;

    /* JADX INFO: renamed from: e */
    public boolean f42200e;

    /* JADX INFO: renamed from: f */
    public int f42201f;

    /* JADX INFO: renamed from: g */
    public int f42202g;

    /* JADX INFO: renamed from: h */
    public boolean f42203h;

    /* JADX INFO: renamed from: i */
    public boolean f42204i;

    /* JADX INFO: renamed from: j */
    public String f42205j;

    /* JADX INFO: renamed from: k */
    public VoiceType f42206k;

    /* JADX INFO: renamed from: l */
    public LiveRecommendCard f42207l;

    /* JADX INFO: renamed from: m */
    public int f42208m;

    /* JADX INFO: renamed from: n */
    public int f42209n;

    /* JADX INFO: renamed from: o */
    public pf60<List<CategoryTopic>, List<TopicMoment>> f42210o;

    /* JADX INFO: renamed from: p */
    public int f42211p;

    /* JADX INFO: renamed from: q */
    public String f42212q;

    /* JADX INFO: renamed from: r */
    public pf60<TopicOperations, List<TopicMoment>> f42213r;

    /* JADX INFO: renamed from: s */
    public NearbyOnline f42214s;

    /* JADX INFO: renamed from: t */
    public StateSquareEntrance f42215t;

    /* JADX INFO: renamed from: u */
    public MomentViewerBox f42216u;

    /* JADX INFO: renamed from: v */
    public SingleTopic f42217v;

    /* JADX INFO: renamed from: w */
    public TopicMoment f42218w;

    /* JADX INFO: renamed from: x */
    public pf60<List<RecommendUsers>, List<Moment>> f42219x;

    /* JADX INFO: renamed from: y */
    public pf60<TopicOperations, List<TopicMoment>> f42220y;

    /* JADX INFO: renamed from: z */
    public pf60<TopicOperationsGroup, Group> f42221z;

    public enum VoiceType {
        card,
        profile
    }

    public MomentItem(Moment moment, int i, int i2, int i3) {
        this.f42198c = null;
        this.f42200e = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42197b = i3;
        this.f42201f = i;
        this.f42202g = i2;
        this.f42203h = false;
        this.f42208m = f7i.m124452l(FeedModule.f39703d.m145688e8(moment.owner), true);
        this.f42209n = f7i.m124451k(FeedModule.f39703d.m145688e8(moment.owner), true);
    }

    /* JADX INFO: renamed from: a */
    public boolean m65057a() {
        return this.f42210o != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m65058b() {
        Moment moment = this.f42199d;
        return (moment == null || moment.liveCircleBanner == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m65059c() {
        return this.f42207l != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m65060d() {
        return this.f42198c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo65061e() {
        return (this.f42199d == null || this.f42203h || this.f42198c != null || m65067k() || m65069m() || this.f42206k != null || m65059c() || m65068l() || m65058b()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m65062f() {
        return this.f42216u != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m65063g() {
        return this.f42214s != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m65064h() {
        return this.f42213r != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m65065i() {
        return this.f42220y != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m65066j() {
        return this.f42219x != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m65067k() {
        Moment moment = this.f42199d;
        return moment != null && TEnum.equals(moment.momentType, "seeAd");
    }

    /* JADX INFO: renamed from: l */
    public boolean m65068l() {
        Moment moment = this.f42199d;
        return (moment == null || moment.mFeedSeeMoreFollowingMomentInfo == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m65069m() {
        return this.f42204i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m65070n() {
        return this.f42221z != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m65071o() {
        return this.f42217v != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m65072p() {
        return this.f42215t != null;
    }

    public MomentItem(Moment moment) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
    }

    public MomentItem() {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
    }

    public MomentItem(Moment moment, int i, int i2, int i3, int i4) {
        this(moment, i, i2, i3);
        this.f42196a = i4;
    }

    public MomentItem(Moment moment, String str) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42205j = str;
        this.f42204i = true;
    }

    public MomentItem(Moment moment, VoiceType voiceType) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42206k = voiceType;
    }

    public MomentItem(Moment moment, pf60<List<CategoryTopic>, List<TopicMoment>> pf60Var, String str, int i) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42199d = moment;
        this.f42210o = pf60Var;
        this.f42212q = str;
        this.f42211p = i;
    }

    public MomentItem(Moment moment, pf60<TopicOperations, List<TopicMoment>> pf60Var) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42213r = pf60Var;
    }

    public MomentItem(Moment moment, pf60<TopicOperations, List<TopicMoment>> pf60Var, int i) {
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42220y = pf60Var;
        this.f42197b = i;
    }

    public MomentItem(Moment moment, TopicMoment topicMoment, SingleTopic singleTopic) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42217v = singleTopic;
        this.f42218w = topicMoment;
    }

    public MomentItem(Moment moment, NearbyOnline nearbyOnline) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42214s = nearbyOnline;
    }

    public MomentItem(Moment moment, StateSquareEntrance stateSquareEntrance) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42215t = stateSquareEntrance;
    }

    public MomentItem(Moment moment, MomentViewerBox momentViewerBox) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42216u = momentViewerBox;
    }

    public MomentItem(Moment moment, String str, int i, pf60<List<RecommendUsers>, List<Moment>> pf60Var) {
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42219x = pf60Var;
        this.f42212q = str;
        this.f42197b = i;
    }

    public MomentItem(Moment moment, LiveRecommendCard liveRecommendCard) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42207l = liveRecommendCard;
    }

    public MomentItem(pf60<TopicOperationsGroup, Group> pf60Var, Moment moment) {
        this.f42197b = -1;
        this.f42198c = null;
        this.f42200e = false;
        this.f42201f = 0;
        this.f42202g = 0;
        this.f42203h = false;
        this.f42208m = 0;
        this.f42209n = 0;
        this.f42211p = -1;
        this.f42199d = moment;
        this.f42221z = pf60Var;
    }
}
