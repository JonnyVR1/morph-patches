package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.SingleTopic;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.a0i;
import p149l.f3c0;
import p149l.i0g0;
import p149l.j760;
import p149l.mqi0;
import p149l.nkg;
import p149l.p6j0;
import p149l.qib0;
import p149l.s7i;
import p149l.t100;
import p149l.vqg;
import p149l.vs0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSingleTopicView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VImage f42510A;

    /* JADX INFO: renamed from: B */
    public VImage f42511B;

    /* JADX INFO: renamed from: C */
    public String f42512C;

    /* JADX INFO: renamed from: D */
    public boolean f42513D;

    /* JADX INFO: renamed from: E */
    public int f42514E;

    /* JADX INFO: renamed from: F */
    public SingleTopic f42515F;

    /* JADX INFO: renamed from: G */
    public TopicMoment f42516G;

    /* JADX INFO: renamed from: H */
    public String f42517H;

    /* JADX INFO: renamed from: I */
    public FeedCanVoteContentView f42518I;

    /* JADX INFO: renamed from: J */
    public HashMap<String, Boolean> f42519J;

    /* JADX INFO: renamed from: a */
    public int f42520a;

    /* JADX INFO: renamed from: b */
    public int f42521b;

    /* JADX INFO: renamed from: c */
    public int f42522c;

    /* JADX INFO: renamed from: d */
    public int f42523d;

    /* JADX INFO: renamed from: e */
    public int f42524e;

    /* JADX INFO: renamed from: f */
    public VRelative f42525f;

    /* JADX INFO: renamed from: g */
    public VImage f42526g;

    /* JADX INFO: renamed from: h */
    public VLinear f42527h;

    /* JADX INFO: renamed from: i */
    public VLinear f42528i;

    /* JADX INFO: renamed from: j */
    public TextView f42529j;

    /* JADX INFO: renamed from: k */
    public VLinear f42530k;

    /* JADX INFO: renamed from: l */
    public VFrame f42531l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f42532m;

    /* JADX INFO: renamed from: n */
    public VFrame f42533n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f42534o;

    /* JADX INFO: renamed from: p */
    public VFrame f42535p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f42536q;

    /* JADX INFO: renamed from: r */
    public VText f42537r;

    /* JADX INFO: renamed from: s */
    public VImage f42538s;

    /* JADX INFO: renamed from: t */
    public TextView f42539t;

    /* JADX INFO: renamed from: u */
    public VFrame f42540u;

    /* JADX INFO: renamed from: v */
    public FeedAudioPlayerView f42541v;

    /* JADX INFO: renamed from: w */
    public VFrame f42542w;

    /* JADX INFO: renamed from: x */
    public VImage f42543x;

    /* JADX INFO: renamed from: y */
    public VFrame f42544y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f42545z;

    public FeedSingleTopicView(Context context) {
        super(context);
        this.f42520a = 3;
        this.f42521b = 80;
        this.f42522c = 6;
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(this.f42521b);
        this.f42523d = iM208412y0;
        this.f42524e = (iM208412y0 - (t100.m186890d(this.f42522c) * 2)) / 3;
    }

    private String getPageId() {
        if (!nkg.m159904s() || !TextUtils.isEmpty(this.f42517H)) {
            return TextUtils.isEmpty(this.f42517H) ? OMSDialogPositon.p_nearby : this.f42517H;
        }
        int i = this.f42514E;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    private List<j760<String, String>> getSingleTopicViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("topic_id", this.f42515F.topicId));
        arrayList.add(j760.m140076a("moment_id", this.f42515F.momentId));
        TopicMoment topicMoment = this.f42516G;
        if (topicMoment != null) {
            arrayList.add(j760.m140076a("topic_type", topicMoment.topicType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m65238d(View view) {
        a0i.m94425a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final Act m65239e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m65240f() {
        p6j0.m167669c("e_moment_topic", getPageId(), (j760[]) getSingleTopicViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: g */
    public final void m65241g(Moment moment) {
        if (this.f42518I != null) {
            xdl0.m208344M(this.f42541v, false);
            return;
        }
        xdl0.m208344M(this.f42540u, true);
        if (vqg.m199530X(moment)) {
            xdl0.m208344M(this.f42541v, true);
            xdl0.m208344M(this.f42542w, false);
            xdl0.m208344M(this.f42544y, false);
            this.f42541v.m66281Z0(moment, false);
            this.f42541v.m66284e1(this.f42512C, this.f42513D);
            return;
        }
        if (vwb.m200296J(moment.media)) {
            xdl0.m208344M(this.f42540u, false);
            xdl0.m208344M(this.f42541v, false);
            xdl0.m208344M(this.f42542w, false);
            xdl0.m208344M(this.f42544y, false);
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            xdl0.m208344M(this.f42541v, false);
            xdl0.m208344M(this.f42542w, false);
            xdl0.m208344M(this.f42544y, true);
            m65248n(media);
            return;
        }
        if (media instanceof Picture) {
            xdl0.m208344M(this.f42541v, false);
            xdl0.m208344M(this.f42542w, true);
            xdl0.m208344M(this.f42544y, false);
            m65247m(moment, moment.media);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m65242h(final Moment moment) {
        FeedCanVoteContentView feedCanVoteContentView = this.f42518I;
        if (feedCanVoteContentView != null) {
            xdl0.m208344M(feedCanVoteContentView, false);
        }
        this.f42529j.setText(this.f42516G.name);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f42515F.userIds.iterator();
        while (it.hasNext()) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(it.next());
            if (NullChecker.m81303a(userM209447e8)) {
                arrayList.add(userM209447e8);
            }
        }
        if (arrayList.size() >= 3) {
            xdl0.m208344M(this.f42531l, true);
            xdl0.m208344M(this.f42533n, true);
            vs0.m199800f(this.f42516G, this.f42532m, (User) arrayList.get(2));
            vs0.m199800f(this.f42516G, this.f42534o, (User) arrayList.get(1));
            vs0.m199800f(this.f42516G, this.f42536q, (User) arrayList.get(0));
        } else if (arrayList.size() == 2) {
            xdl0.m208344M(this.f42531l, false);
            xdl0.m208344M(this.f42533n, true);
            vs0.m199800f(this.f42516G, this.f42534o, (User) arrayList.get(1));
            vs0.m199800f(this.f42516G, this.f42536q, (User) arrayList.get(0));
        } else {
            int size = arrayList.size();
            VFrame vFrame = this.f42531l;
            if (size == 1) {
                xdl0.m208344M(vFrame, false);
                xdl0.m208344M(this.f42533n, false);
                xdl0.m208344M(this.f42535p, true);
                vs0.m199800f(this.f42516G, this.f42536q, (User) arrayList.get(0));
            } else {
                xdl0.m208344M(vFrame, false);
                xdl0.m208344M(this.f42533n, false);
                xdl0.m208344M(this.f42535p, false);
            }
        }
        this.f42537r.setText(i0g0.m133881u(this.f42516G.userViewCounter) + "人正在话题中讨论");
        if (this.f42516G.isQATopicType() && nkg.m159893m0()) {
            if (this.f42518I == null) {
                FeedCanVoteContentView feedCanVoteContentView2 = new FeedCanVoteContentView(m65239e());
                this.f42518I = feedCanVoteContentView2;
                feedCanVoteContentView2.setFrom(this.f42512C);
                FeedCanVoteContentView feedCanVoteContentView3 = this.f42518I;
                feedCanVoteContentView3.f42355h = this.f42519J;
                this.f42527h.addView(feedCanVoteContentView3);
            }
            this.f42539t.setVisibility(8);
            this.f42540u.setVisibility(8);
            xdl0.m208344M(this.f42518I, true);
            this.f42529j.setText("邀请你参与投票");
            this.f42537r.setText("看看多少人与你观点一致");
            this.f42518I.m65089s(this.f42516G);
            xdl0.m208357U(this.f42525f, t100.m186890d(14.0f));
        } else {
            this.f42539t.setVisibility(0);
            this.f42540u.setVisibility(0);
            User userM209447e9 = FeedModule.f38855d.m209447e8(moment.owner);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + s7i.m182497k(userM209447e9 == null ? "" : userM209447e9.name, 8));
            if (!TextUtils.isEmpty(moment.value)) {
                spannableStringBuilder.append((CharSequence) ": ");
            }
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) moment.value);
            this.f42539t.setText(spannableStringBuilder);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.xzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195201a.m65243i(moment, view);
            }
        });
        xdl0.m208329E0(this.f42542w, new View.OnClickListener() { // from class: l.yzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200887a.m65244j(moment, view);
            }
        });
        xdl0.m208329E0(this.f42541v, new View.OnClickListener() { // from class: l.zzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205800a.m65245k(moment, view);
            }
        });
        this.f42541v.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        m65241g(moment);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m65243i(Moment moment, View view) {
        m65249o(moment);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m65244j(Moment moment, View view) {
        m65249o(moment);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m65245k(Moment moment, View view) {
        m65249o(moment);
    }

    /* JADX INFO: renamed from: l */
    public void m65246l(String str, boolean z, int i, SingleTopic singleTopic, TopicMoment topicMoment, Moment moment) {
        if (singleTopic == null || TextUtils.isEmpty(singleTopic.momentId) || TextUtils.isEmpty(singleTopic.topicId) || vwb.m200296J(singleTopic.userIds) || moment == null || topicMoment == null) {
            xdl0.m208344M(this.f42525f, false);
            return;
        }
        this.f42512C = str;
        this.f42513D = z;
        this.f42514E = i;
        this.f42515F = singleTopic;
        this.f42516G = topicMoment;
        xdl0.m208344M(this.f42525f, true);
        m65242h(moment);
    }

    /* JADX INFO: renamed from: m */
    public final void m65247m(Moment moment, List<Media> list) {
        for (int i = 0; i < this.f42542w.getChildCount(); i++) {
            if (this.f42542w.getChildAt(i) instanceof VRelative) {
                VRelative vRelative = (VRelative) this.f42542w.getChildAt(i);
                View childAt = vRelative.getChildAt(0);
                xdl0.m208344M(vRelative, false);
                if (childAt instanceof VDraweeView) {
                    VDraweeView vDraweeView = (VDraweeView) childAt;
                    qib0.f154691G.m184725o(vDraweeView);
                    vDraweeView.setOnClickListener(null);
                    childAt.setOnClickListener(null);
                    vDraweeView.setZoomAnimationKey(null);
                }
                xdl0.m208344M(vRelative.getChildAt(1), false);
            }
        }
        xdl0.m208344M(this.f42543x, list.size() > this.f42520a);
        int iMin = Math.min(list.size(), this.f42520a);
        for (int i2 = 0; i2 < iMin; i2++) {
            Media media = list.get(i2);
            if (media instanceof Picture) {
                Picture picture = (Picture) media;
                VRelative vRelative2 = (VRelative) this.f42542w.getChildAt(i2);
                VDraweeView vDraweeView2 = (VDraweeView) vRelative2.getChildAt(0);
                if (nkg.m159845C0()) {
                    xdl0.m208344M(vRelative2.getChildAt(1), !vwb.m200296J(moment.mediaRepeatIndexList) && moment.mediaRepeatIndexList.contains(0));
                }
                xdl0.m208345M0(vRelative2, true);
                int i3 = this.f42524e;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                vDraweeView2.getHierarchy().m112053H(RoundingParams.m8249c(vqg.m199581y()).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
                vRelative2.setLayoutParams(layoutParams);
                if (i2 == 1) {
                    layoutParams.setMargins(t100.m186890d(this.f42522c) + this.f42524e, 0, 0, 0);
                } else if (i2 == 2) {
                    layoutParams.setMargins(t100.m186890d(this.f42522c * 2) + (this.f42524e * 2), 0, 0, 0);
                }
                if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                    qib0.f154691G.m102341Q0(vDraweeView2, picture.calculatedWidth(t100.m186890d(this.f42522c) + (this.f42524e * 2)));
                    vDraweeView2.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m65248n(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f42545z.getHierarchy().m112053H(RoundingParams.m8249c(vqg.m199581y()).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        xdl0.m208344M(this.f42510A, false);
        this.f42511B.setImageResource(f3c0.f94295B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.f154691G.m102341Q0(this.f42545z, picture.calculatedWidth(t100.m186890d(94.0f)));
        this.f42545z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: o */
    public final void m65249o(Moment moment) {
        moment.setRecommendTime(mqi0.m155944o() - ((long) ((new Random().nextInt(5) + 1) * 1000)));
        m65240f();
        if (this.f42516G.isTopicVoteType()) {
            Context context = getContext();
            Context context2 = getContext();
            TopicMoment topicMoment = this.f42516G;
            context.startActivity(TopicVoteAggregationAct.m66171V1(context2, topicMoment.f39247id, topicMoment.owner.f38759id, User.ID_TEAM_ACCOUNT));
            return;
        }
        if (this.f42516G.isQATopicType()) {
            getContext().startActivity(QATopicAggregationActivity.m65976X1(getContext(), this.f42516G.f39247id, this.f42512C, moment.f56011id));
        } else {
            getContext().startActivity(TopicAggregationAct.m66082X1(getContext(), this.f42516G.f39247id, this.f42512C, true, zi60.m218961w().m218964E(this.f42516G), moment.f56011id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m65238d(this);
    }

    public void setPageId(String str) {
        this.f42517H = str;
    }

    public void setShowInputMomentMap(HashMap<String, Boolean> map) {
        this.f42519J = map;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42520a = 3;
        this.f42521b = 80;
        this.f42522c = 6;
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(this.f42521b);
        this.f42523d = iM208412y0;
        this.f42524e = (iM208412y0 - (t100.m186890d(this.f42522c) * 2)) / 3;
    }

    public FeedSingleTopicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42520a = 3;
        this.f42521b = 80;
        this.f42522c = 6;
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(this.f42521b);
        this.f42523d = iM208412y0;
        this.f42524e = (iM208412y0 - (t100.m186890d(this.f42522c) * 2)) / 3;
    }
}
