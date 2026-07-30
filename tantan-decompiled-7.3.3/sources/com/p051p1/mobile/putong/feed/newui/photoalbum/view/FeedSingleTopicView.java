package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.SingleTopic;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.at0;
import p153l.bnl0;
import p153l.cmg;
import p153l.er60;
import p153l.h9i;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.p1i;
import p153l.pf60;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSingleTopicView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VImage f43358A;

    /* JADX INFO: renamed from: B */
    public VImage f43359B;

    /* JADX INFO: renamed from: C */
    public String f43360C;

    /* JADX INFO: renamed from: D */
    public boolean f43361D;

    /* JADX INFO: renamed from: E */
    public int f43362E;

    /* JADX INFO: renamed from: F */
    public SingleTopic f43363F;

    /* JADX INFO: renamed from: G */
    public TopicMoment f43364G;

    /* JADX INFO: renamed from: H */
    public String f43365H;

    /* JADX INFO: renamed from: I */
    public FeedCanVoteContentView f43366I;

    /* JADX INFO: renamed from: J */
    public HashMap<String, Boolean> f43367J;

    /* JADX INFO: renamed from: a */
    public int f43368a;

    /* JADX INFO: renamed from: b */
    public int f43369b;

    /* JADX INFO: renamed from: c */
    public int f43370c;

    /* JADX INFO: renamed from: d */
    public int f43371d;

    /* JADX INFO: renamed from: e */
    public int f43372e;

    /* JADX INFO: renamed from: f */
    public VRelative f43373f;

    /* JADX INFO: renamed from: g */
    public VImage f43374g;

    /* JADX INFO: renamed from: h */
    public VLinear f43375h;

    /* JADX INFO: renamed from: i */
    public VLinear f43376i;

    /* JADX INFO: renamed from: j */
    public TextView f43377j;

    /* JADX INFO: renamed from: k */
    public VLinear f43378k;

    /* JADX INFO: renamed from: l */
    public VFrame f43379l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f43380m;

    /* JADX INFO: renamed from: n */
    public VFrame f43381n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f43382o;

    /* JADX INFO: renamed from: p */
    public VFrame f43383p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43384q;

    /* JADX INFO: renamed from: r */
    public VText f43385r;

    /* JADX INFO: renamed from: s */
    public VImage f43386s;

    /* JADX INFO: renamed from: t */
    public TextView f43387t;

    /* JADX INFO: renamed from: u */
    public VFrame f43388u;

    /* JADX INFO: renamed from: v */
    public FeedAudioPlayerView f43389v;

    /* JADX INFO: renamed from: w */
    public VFrame f43390w;

    /* JADX INFO: renamed from: x */
    public VImage f43391x;

    /* JADX INFO: renamed from: y */
    public VFrame f43392y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f43393z;

    public FeedSingleTopicView(Context context) {
        super(context);
        this.f43368a = 3;
        this.f43369b = 80;
        this.f43370c = 6;
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(this.f43369b);
        this.f43371d = iM105592y0;
        this.f43372e = (iM105592y0 - (qa00.m175859d(this.f43370c) * 2)) / 3;
    }

    private String getPageId() {
        if (!cmg.m111233s() || !TextUtils.isEmpty(this.f43365H)) {
            return TextUtils.isEmpty(this.f43365H) ? OMSDialogPositon.p_nearby : this.f43365H;
        }
        int i = this.f43362E;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<pf60<String, String>> getSingleTopicViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("topic_id", this.f43363F.topicId));
        arrayList.add(pf60.m172085a("moment_id", this.f43363F.momentId));
        TopicMoment topicMoment = this.f43364G;
        if (topicMoment != null) {
            arrayList.add(pf60.m172085a("topic_type", topicMoment.topicType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m66421d(View view) {
        p1i.m170206a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m66422e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m66423f() {
        tfj0.m190940c("e_moment_topic", getPageId(), (pf60[]) getSingleTopicViewTrackingParis().toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: g */
    public final void m66424g(Moment moment) {
        if (this.f43366I != null) {
            bnl0.m105524M(this.f43389v, false);
            return;
        }
        bnl0.m105524M(this.f43388u, true);
        if (ksg.m151189X(moment)) {
            bnl0.m105524M(this.f43389v, true);
            bnl0.m105524M(this.f43390w, false);
            bnl0.m105524M(this.f43392y, false);
            this.f43389v.m67464Z0(moment, false);
            this.f43389v.m67467e1(this.f43360C, this.f43361D);
            return;
        }
        if (jyb.m147479J(moment.media)) {
            bnl0.m105524M(this.f43388u, false);
            bnl0.m105524M(this.f43389v, false);
            bnl0.m105524M(this.f43390w, false);
            bnl0.m105524M(this.f43392y, false);
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            bnl0.m105524M(this.f43389v, false);
            bnl0.m105524M(this.f43390w, false);
            bnl0.m105524M(this.f43392y, true);
            m66431n(media);
            return;
        }
        if (media instanceof Picture) {
            bnl0.m105524M(this.f43389v, false);
            bnl0.m105524M(this.f43390w, true);
            bnl0.m105524M(this.f43392y, false);
            m66430m(moment, moment.media);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m66425h(final Moment moment) {
        FeedCanVoteContentView feedCanVoteContentView = this.f43366I;
        if (feedCanVoteContentView != null) {
            bnl0.m105524M(feedCanVoteContentView, false);
        }
        this.f43377j.setText(this.f43364G.name);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f43363F.userIds.iterator();
        while (it.hasNext()) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(it.next());
            if (NullChecker.m82486a(userM145688e8)) {
                arrayList.add(userM145688e8);
            }
        }
        if (arrayList.size() >= 3) {
            bnl0.m105524M(this.f43379l, true);
            bnl0.m105524M(this.f43381n, true);
            at0.m100012f(this.f43364G, this.f43380m, (User) arrayList.get(2));
            at0.m100012f(this.f43364G, this.f43382o, (User) arrayList.get(1));
            at0.m100012f(this.f43364G, this.f43384q, (User) arrayList.get(0));
        } else if (arrayList.size() == 2) {
            bnl0.m105524M(this.f43379l, false);
            bnl0.m105524M(this.f43381n, true);
            at0.m100012f(this.f43364G, this.f43382o, (User) arrayList.get(1));
            at0.m100012f(this.f43364G, this.f43384q, (User) arrayList.get(0));
        } else {
            int size = arrayList.size();
            VFrame vFrame = this.f43379l;
            if (size == 1) {
                bnl0.m105524M(vFrame, false);
                bnl0.m105524M(this.f43381n, false);
                bnl0.m105524M(this.f43383p, true);
                at0.m100012f(this.f43364G, this.f43384q, (User) arrayList.get(0));
            } else {
                bnl0.m105524M(vFrame, false);
                bnl0.m105524M(this.f43381n, false);
                bnl0.m105524M(this.f43383p, false);
            }
        }
        this.f43385r.setText(q8g0.m175816u(this.f43364G.userViewCounter) + "人正在话题中讨论");
        if (this.f43364G.isQATopicType() && cmg.m111222m0()) {
            if (this.f43366I == null) {
                FeedCanVoteContentView feedCanVoteContentView2 = new FeedCanVoteContentView(m66422e());
                this.f43366I = feedCanVoteContentView2;
                feedCanVoteContentView2.setFrom(this.f43360C);
                FeedCanVoteContentView feedCanVoteContentView3 = this.f43366I;
                feedCanVoteContentView3.f43203h = this.f43367J;
                this.f43375h.addView(feedCanVoteContentView3);
            }
            this.f43387t.setVisibility(8);
            this.f43388u.setVisibility(8);
            bnl0.m105524M(this.f43366I, true);
            this.f43377j.setText("邀请你参与投票");
            this.f43385r.setText("看看多少人与你观点一致");
            this.f43366I.m66272s(this.f43364G);
            bnl0.m105537U(this.f43373f, qa00.m175859d(14.0f));
        } else {
            this.f43387t.setVisibility(0);
            this.f43388u.setVisibility(0);
            User userM145688e9 = FeedModule.f39703d.m145688e8(moment.owner);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + h9i.m134070k(userM145688e9 == null ? "" : userM145688e9.name, 8));
            if (!TextUtils.isEmpty(moment.value)) {
                spannableStringBuilder.append((CharSequence) ": ");
            }
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) moment.value);
            this.f43387t.setText(spannableStringBuilder);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.m1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134436a.m66426i(moment, view);
            }
        });
        bnl0.m105509E0(this.f43390w, new View.OnClickListener() { // from class: l.n1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139767a.m66427j(moment, view);
            }
        });
        bnl0.m105509E0(this.f43389v, new View.OnClickListener() { // from class: l.o1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144653a.m66428k(moment, view);
            }
        });
        this.f43389v.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        m66424g(moment);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m66426i(Moment moment, View view) {
        m66432o(moment);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m66427j(Moment moment, View view) {
        m66432o(moment);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m66428k(Moment moment, View view) {
        m66432o(moment);
    }

    /* JADX INFO: renamed from: l */
    public void m66429l(String str, boolean z, int i, SingleTopic singleTopic, TopicMoment topicMoment, Moment moment) {
        if (singleTopic == null || TextUtils.isEmpty(singleTopic.momentId) || TextUtils.isEmpty(singleTopic.topicId) || jyb.m147479J(singleTopic.userIds) || moment == null || topicMoment == null) {
            bnl0.m105524M(this.f43373f, false);
            return;
        }
        this.f43360C = str;
        this.f43361D = z;
        this.f43362E = i;
        this.f43363F = singleTopic;
        this.f43364G = topicMoment;
        bnl0.m105524M(this.f43373f, true);
        m66425h(moment);
    }

    /* JADX INFO: renamed from: m */
    public final void m66430m(Moment moment, List<Media> list) {
        for (int i = 0; i < this.f43390w.getChildCount(); i++) {
            if (this.f43390w.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) this.f43390w.getChildAt(i);
                View childAt = vRelative.getChildAt(0);
                bnl0.m105524M(vRelative, false);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    uqb0.f180374G.m98798o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                bnl0.m105524M(vRelative.getChildAt(1), false);
            }
        }
        bnl0.m105524M(this.f43391x, list.size() > this.f43368a);
        int iMin = Math.min(list.size(), this.f43368a);
        for (int i2 = 0; i2 < iMin; i2++) {
            Media media = list.get(i2);
            if (media instanceof Picture) {
                Picture picture = (Picture) media;
                VRelative vRelative2 = (VRelative) this.f43390w.getChildAt(i2);
                VDraweeView vDraweeView2 = (VDraweeView) vRelative2.getChildAt(0);
                if (cmg.m111174C0()) {
                    bnl0.m105524M(vRelative2.getChildAt(1), !jyb.m147479J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0));
                }
                bnl0.m105525M0(vRelative2, true);
                int i3 = this.f43372e;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                vDraweeView2.getHierarchy().m207045H(RoundingParams.m8303c(ksg.m151240y()).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
                vRelative2.setLayoutParams(layoutParams);
                if (i2 == 1) {
                    layoutParams.setMargins(qa00.m175859d(this.f43370c) + this.f43372e, 0, 0, 0);
                } else if (i2 == 2) {
                    layoutParams.setMargins(qa00.m175859d(this.f43370c * 2) + (this.f43372e * 2), 0, 0, 0);
                }
                if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                    uqb0.f180374G.m127125Q0(vDraweeView2, picture.calculatedWidth(qa00.m175859d(this.f43370c) + (this.f43372e * 2)));
                    vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m66431n(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f43393z.getHierarchy().m207045H(RoundingParams.m8303c(ksg.m151240y()).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        bnl0.m105524M(this.f43358A, false);
        this.f43359B.setImageResource(lbc0.f130813B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        uqb0.f180374G.m127125Q0(this.f43393z, picture.calculatedWidth(qa00.m175859d(94.0f)));
        this.f43393z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public final void m66432o(Moment moment) {
        moment.setRecommendTime(pzi0.m174454o() - ((long) ((new Random().nextInt(5) + 1) * 1000)));
        m66423f();
        if (this.f43364G.isTopicVoteType()) {
            Context context = getContext();
            Context context2 = getContext();
            TopicMoment topicMoment = this.f43364G;
            context.startActivity(TopicVoteAggregationAct.m67354X1(context2, topicMoment.f40095id, topicMoment.owner.f39607id, User.ID_TEAM_ACCOUNT));
            return;
        }
        if (this.f43364G.isQATopicType()) {
            getContext().startActivity(QATopicAggregationActivity.m67159Y1(getContext(), this.f43364G.f40095id, this.f43360C, moment.f56859id));
        } else {
            getContext().startActivity(TopicAggregationAct.m67265Y1(getContext(), this.f43364G.f40095id, this.f43360C, true, er60.m122104w().m122107E(this.f43364G), moment.f56859id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m66421d(this);
    }

    public void setPageId(String str) {
        this.f43365H = str;
    }

    public void setShowInputMomentMap(HashMap<String, Boolean> map) {
        this.f43367J = map;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43368a = 3;
        this.f43369b = 80;
        this.f43370c = 6;
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(this.f43369b);
        this.f43371d = iM105592y0;
        this.f43372e = (iM105592y0 - (qa00.m175859d(this.f43370c) * 2)) / 3;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43368a = 3;
        this.f43369b = 80;
        this.f43370c = 6;
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(this.f43369b);
        this.f43371d = iM105592y0;
        this.f43372e = (iM105592y0 - (qa00.m175859d(this.f43370c) * 2)) / 3;
    }
}
