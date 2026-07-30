package com.p051p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.ndj0;
import p153l.pzi0;
import p153l.qa00;
import p153l.tec0;
import p153l.ucj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicVoteAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f44117a;

    /* JADX INFO: renamed from: b */
    public VText f44118b;

    /* JADX INFO: renamed from: c */
    public VText f44119c;

    /* JADX INFO: renamed from: d */
    public VText f44120d;

    /* JADX INFO: renamed from: e */
    public VFrame f44121e;

    /* JADX INFO: renamed from: f */
    public ucj0 f44122f;

    /* JADX INFO: renamed from: g */
    public FeedCenterVoteView f44123g;

    public TopicVoteAggregationHeaderView(Context context) {
        super(context);
        m67365c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m67363a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ndj0.m162713b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public User m67364b(TopicMoment topicMoment) {
        return this.f44122f.mo137270m(topicMoment.owner.f39607id);
    }

    /* JADX INFO: renamed from: c */
    public final void m67365c(Context context) {
        addView(m67363a(LayoutInflater.from(context), this));
        FeedCenterVoteView feedCenterVoteView = (FeedCenterVoteView) LayoutInflater.from(context).inflate(tec0.f173623a1, (ViewGroup) this.f44121e, false);
        this.f44123g = feedCenterVoteView;
        feedCenterVoteView.setVoteAggregationActClickable(false);
        bnl0.m105538V(this.f44123g.f42738e, qa00.m175859d(0.0f));
        this.f44121e.addView(this.f44123g);
    }

    /* JADX INFO: renamed from: d */
    public void m67366d(ucj0 ucj0Var, TopicMoment topicMoment, int i, String str) {
        if (topicMoment == null || ucj0Var == null) {
            return;
        }
        this.f44122f = ucj0Var;
        this.f44119c.setText(pzi0.m174442G(topicMoment.createdTime));
        boolean zIsEmpty = TextUtils.isEmpty(topicMoment.description);
        VText vText = this.f44120d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(topicMoment.description);
            this.f44120d.setVisibility(0);
        }
        User userM67364b = m67364b(topicMoment);
        this.f44118b.setText(userM67364b.name);
        uqb0.f180374G.m127125Q0(this.f44117a, userM67364b.m61308fp().profileSmall());
        this.f44123g.m65875W0(topicMoment, i, (Act) getContext(), str);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67365c(context);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67365c(context);
    }
}
