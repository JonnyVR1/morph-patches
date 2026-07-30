package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.SingleTopic;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l.i0g0;
import l.j760;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.a0i;
import p007l.f3c0;
import p007l.nkg;
import p007l.p6j0;
import p007l.s7i;
import p007l.vqg;
import p007l.vs0;
import p007l.zi60;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSingleTopicView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VImage f3971A;

    /* JADX INFO: renamed from: B */
    public VImage f3972B;

    /* JADX INFO: renamed from: C */
    public String f3973C;

    /* JADX INFO: renamed from: D */
    public boolean f3974D;

    /* JADX INFO: renamed from: E */
    public int f3975E;

    /* JADX INFO: renamed from: F */
    public SingleTopic f3976F;

    /* JADX INFO: renamed from: G */
    public TopicMoment f3977G;

    /* JADX INFO: renamed from: H */
    public String f3978H;

    /* JADX INFO: renamed from: I */
    public FeedCanVoteContentView f3979I;

    /* JADX INFO: renamed from: J */
    public HashMap<String, Boolean> f3980J;

    /* JADX INFO: renamed from: a */
    public int f3981a;

    /* JADX INFO: renamed from: b */
    public int f3982b;

    /* JADX INFO: renamed from: c */
    public int f3983c;

    /* JADX INFO: renamed from: d */
    public int f3984d;

    /* JADX INFO: renamed from: e */
    public int f3985e;

    /* JADX INFO: renamed from: f */
    public VRelative f3986f;

    /* JADX INFO: renamed from: g */
    public VImage f3987g;

    /* JADX INFO: renamed from: h */
    public VLinear f3988h;

    /* JADX INFO: renamed from: i */
    public VLinear f3989i;

    /* JADX INFO: renamed from: j */
    public TextView f3990j;

    /* JADX INFO: renamed from: k */
    public VLinear f3991k;

    /* JADX INFO: renamed from: l */
    public VFrame f3992l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f3993m;

    /* JADX INFO: renamed from: n */
    public VFrame f3994n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f3995o;

    /* JADX INFO: renamed from: p */
    public VFrame f3996p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f3997q;

    /* JADX INFO: renamed from: r */
    public VText f3998r;

    /* JADX INFO: renamed from: s */
    public VImage f3999s;

    /* JADX INFO: renamed from: t */
    public TextView f4000t;

    /* JADX INFO: renamed from: u */
    public VFrame f4001u;

    /* JADX INFO: renamed from: v */
    public FeedAudioPlayerView f4002v;

    /* JADX INFO: renamed from: w */
    public VFrame f4003w;

    /* JADX INFO: renamed from: x */
    public VImage f4004x;

    /* JADX INFO: renamed from: y */
    public VFrame f4005y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f4006z;

    public FeedSingleTopicView(Context context) {
        super(context);
        this.f3981a = 3;
        this.f3982b = 80;
        this.f3983c = 6;
        int iY0 = xdl0.y0() - t100.d(this.f3982b);
        this.f3984d = iY0;
        this.f3985e = (iY0 - (t100.d(this.f3983c) * 2)) / 3;
    }

    private String getPageId() {
        if (!nkg.m12263s() || !TextUtils.isEmpty(this.f3978H)) {
            return TextUtils.isEmpty(this.f3978H) ? OMSDialogPositon.p_nearby : this.f3978H;
        }
        int i = this.f3975E;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<j760<String, String>> getSingleTopicViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("topic_id", this.f3976F.topicId));
        arrayList.add(j760.a("moment_id", this.f3976F.momentId));
        TopicMoment topicMoment = this.f3977G;
        if (topicMoment != null) {
            arrayList.add(j760.a("topic_type", topicMoment.topicType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m6339d(View view) {
        a0i.m8386a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m6340e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m6341f() {
        p6j0.m12913c("e_moment_topic", getPageId(), (j760[]) getSingleTopicViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: g */
    public final void m6342g(Moment moment) {
        if (this.f3979I != null) {
            xdl0.M(this.f4002v, false);
            return;
        }
        xdl0.M(this.f4001u, true);
        if (vqg.m15500X(moment)) {
            xdl0.M(this.f4002v, true);
            xdl0.M(this.f4003w, false);
            xdl0.M(this.f4005y, false);
            this.f4002v.m7441Z0(moment, false);
            this.f4002v.m7444e1(this.f3973C, this.f3974D);
            return;
        }
        if (vwb.J(moment.media)) {
            xdl0.M(this.f4001u, false);
            xdl0.M(this.f4002v, false);
            xdl0.M(this.f4003w, false);
            xdl0.M(this.f4005y, false);
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            xdl0.M(this.f4002v, false);
            xdl0.M(this.f4003w, false);
            xdl0.M(this.f4005y, true);
            m6349n(media);
            return;
        }
        if (media instanceof Picture) {
            xdl0.M(this.f4002v, false);
            xdl0.M(this.f4003w, true);
            xdl0.M(this.f4005y, false);
            m6348m(moment, moment.media);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6343h(final Moment moment) {
        FeedCanVoteContentView feedCanVoteContentView = this.f3979I;
        if (feedCanVoteContentView != null) {
            xdl0.M(feedCanVoteContentView, false);
        }
        this.f3990j.setText(this.f3977G.name);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f3976F.userIds.iterator();
        while (it.hasNext()) {
            User userM16628e8 = FeedModule.f316d.m16628e8(it.next());
            if (NullChecker.a(userM16628e8)) {
                arrayList.add(userM16628e8);
            }
        }
        if (arrayList.size() >= 3) {
            xdl0.M(this.f3992l, true);
            xdl0.M(this.f3994n, true);
            vs0.m15568f(this.f3977G, this.f3993m, (User) arrayList.get(2));
            vs0.m15568f(this.f3977G, this.f3995o, (User) arrayList.get(1));
            vs0.m15568f(this.f3977G, this.f3997q, (User) arrayList.get(0));
        } else if (arrayList.size() == 2) {
            xdl0.M(this.f3992l, false);
            xdl0.M(this.f3994n, true);
            vs0.m15568f(this.f3977G, this.f3995o, (User) arrayList.get(1));
            vs0.m15568f(this.f3977G, this.f3997q, (User) arrayList.get(0));
        } else {
            int size = arrayList.size();
            VFrame vFrame = this.f3992l;
            if (size == 1) {
                xdl0.M(vFrame, false);
                xdl0.M(this.f3994n, false);
                xdl0.M(this.f3996p, true);
                vs0.m15568f(this.f3977G, this.f3997q, (User) arrayList.get(0));
            } else {
                xdl0.M(vFrame, false);
                xdl0.M(this.f3994n, false);
                xdl0.M(this.f3996p, false);
            }
        }
        this.f3998r.setText(i0g0.u(this.f3977G.userViewCounter) + "人正在话题中讨论");
        if (this.f3977G.isQATopicType() && nkg.m12252m0()) {
            if (this.f3979I == null) {
                FeedCanVoteContentView feedCanVoteContentView2 = new FeedCanVoteContentView(m6340e());
                this.f3979I = feedCanVoteContentView2;
                feedCanVoteContentView2.setFrom(this.f3973C);
                FeedCanVoteContentView feedCanVoteContentView3 = this.f3979I;
                feedCanVoteContentView3.f3816h = this.f3980J;
                this.f3988h.addView(feedCanVoteContentView3);
            }
            this.f4000t.setVisibility(8);
            this.f4001u.setVisibility(8);
            xdl0.M(this.f3979I, true);
            this.f3990j.setText("邀请你参与投票");
            this.f3998r.setText("看看多少人与你观点一致");
            this.f3979I.m6190s(this.f3977G);
            xdl0.U(this.f3986f, t100.d(14.0f));
        } else {
            this.f4000t.setVisibility(0);
            this.f4001u.setVisibility(0);
            User userM16628e9 = FeedModule.f316d.m16628e8(moment.owner);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + s7i.m14045k(userM16628e9 == null ? "" : userM16628e9.name, 8));
            if (!TextUtils.isEmpty(moment.value)) {
                spannableStringBuilder.append((CharSequence) ": ");
            }
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) moment.value);
            this.f4000t.setText(spannableStringBuilder);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.xzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15189a.m6344i(moment, view);
            }
        });
        xdl0.E0(this.f4003w, new View.OnClickListener() { // from class: l.yzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15540a.m6345j(moment, view);
            }
        });
        xdl0.E0(this.f4002v, new View.OnClickListener() { // from class: l.zzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15972a.m6346k(moment, view);
            }
        });
        this.f4002v.setMaxWidth(Integer.MAX_VALUE);
        m6342g(moment);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6344i(Moment moment, View view) {
        m6350o(moment);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6345j(Moment moment, View view) {
        m6350o(moment);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6346k(Moment moment, View view) {
        m6350o(moment);
    }

    /* JADX INFO: renamed from: l */
    public void m6347l(String str, boolean z, int i, SingleTopic singleTopic, TopicMoment topicMoment, Moment moment) {
        if (singleTopic == null || TextUtils.isEmpty(singleTopic.momentId) || TextUtils.isEmpty(singleTopic.topicId) || vwb.J(singleTopic.userIds) || moment == null || topicMoment == null) {
            xdl0.M(this.f3986f, false);
            return;
        }
        this.f3973C = str;
        this.f3974D = z;
        this.f3975E = i;
        this.f3976F = singleTopic;
        this.f3977G = topicMoment;
        xdl0.M(this.f3986f, true);
        m6343h(moment);
    }

    /* JADX INFO: renamed from: m */
    public final void m6348m(Moment moment, List<Media> list) {
        for (int i = 0; i < this.f4003w.getChildCount(); i++) {
            if (this.f4003w.getChildAt(i) instanceof VRelative) {
                VRelative childAt = this.f4003w.getChildAt(i);
                VDraweeView childAt2 = childAt.getChildAt(0);
                xdl0.M(childAt, false);
                if (childAt2 instanceof VDraweeView) {
                    VDraweeView vDraweeView = childAt2;
                    qib0.G.o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt2.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey((String) null);
                }
                xdl0.M(childAt.getChildAt(1), false);
            }
        }
        xdl0.M(this.f4004x, list.size() > this.f3981a);
        int iMin = Math.min(list.size(), this.f3981a);
        for (int i2 = 0; i2 < iMin; i2++) {
            Media media = list.get(i2);
            if (media instanceof Picture) {
                Picture picture = (Picture) media;
                VRelative childAt3 = this.f4003w.getChildAt(i2);
                VDraweeView vDraweeView2 = (VDraweeView) childAt3.getChildAt(0);
                if (nkg.m12204C0()) {
                    xdl0.M(childAt3.getChildAt(1), !vwb.J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0));
                }
                xdl0.M0(childAt3, true);
                int i3 = this.f3985e;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                vDraweeView2.getHierarchy().H(RoundingParams.c(vqg.m15551y()).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
                childAt3.setLayoutParams(layoutParams);
                if (i2 == 1) {
                    layoutParams.setMargins(t100.d(this.f3983c) + this.f3985e, 0, 0, 0);
                } else if (i2 == 2) {
                    layoutParams.setMargins(t100.d(this.f3983c * 2) + (this.f3985e * 2), 0, 0, 0);
                }
                if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
                    qib0.G.Q0(vDraweeView2, picture.calculatedWidth(t100.d(this.f3983c) + (this.f3985e * 2)));
                    vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6349n(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f4006z.getHierarchy().H(RoundingParams.c(vqg.m15551y()).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        xdl0.M(this.f3971A, false);
        this.f3972B.setImageResource(f3c0.f7578B6);
        if (TEnum.equals(picture.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.G.Q0(this.f4006z, picture.calculatedWidth(t100.d(94.0f)));
        this.f4006z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public final void m6350o(Moment moment) {
        moment.setRecommendTime(mqi0.o() - ((long) ((new Random().nextInt(5) + 1) * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
        m6341f();
        if (this.f3977G.isTopicVoteType()) {
            Context context = getContext();
            Context context2 = getContext();
            TopicMoment topicMoment = this.f3977G;
            context.startActivity(TopicVoteAggregationAct.m7327V1(context2, topicMoment.f708id, topicMoment.owner.f220id, User.ID_TEAM_ACCOUNT));
            return;
        }
        if (this.f3977G.isQATopicType()) {
            getContext().startActivity(QATopicAggregationActivity.m7128X1(getContext(), this.f3977G.f708id, this.f3973C, ((DbObject) moment).id));
        } else {
            getContext().startActivity(TopicAggregationAct.m7234X1(getContext(), this.f3977G.f708id, this.f3973C, true, zi60.m17436w().m17439E(this.f3977G), ((DbObject) moment).id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m6339d(this);
    }

    public void setPageId(String str) {
        this.f3978H = str;
    }

    public void setShowInputMomentMap(HashMap<String, Boolean> map) {
        this.f3980J = map;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3981a = 3;
        this.f3982b = 80;
        this.f3983c = 6;
        int iY0 = xdl0.y0() - t100.d(this.f3982b);
        this.f3984d = iY0;
        this.f3985e = (iY0 - (t100.d(this.f3983c) * 2)) / 3;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3981a = 3;
        this.f3982b = 80;
        this.f3983c = 6;
        int iY0 = xdl0.y0() - t100.d(this.f3982b);
        this.f3984d = iY0;
        this.f3985e = (iY0 - (t100.d(this.f3983c) * 2)) / 3;
    }
}
