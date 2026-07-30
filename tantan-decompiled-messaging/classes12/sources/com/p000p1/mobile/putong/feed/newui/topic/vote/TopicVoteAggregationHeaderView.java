package com.p000p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import com.p1.mobile.android.app.Act;
import l.mqi0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.j4j0;
import p007l.o6c0;
import p007l.q3j0;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicVoteAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4730a;

    /* JADX INFO: renamed from: b */
    public VText f4731b;

    /* JADX INFO: renamed from: c */
    public VText f4732c;

    /* JADX INFO: renamed from: d */
    public VText f4733d;

    /* JADX INFO: renamed from: e */
    public VFrame f4734e;

    /* JADX INFO: renamed from: f */
    public q3j0 f4735f;

    /* JADX INFO: renamed from: g */
    public FeedCenterVoteView f4736g;

    public TopicVoteAggregationHeaderView(Context context) {
        super(context);
        m7340c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m7338a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j4j0.m11071b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public User m7339b(TopicMoment topicMoment) {
        return this.f4735f.mo10741m(topicMoment.owner.f220id);
    }

    /* JADX INFO: renamed from: c */
    public final void m7340c(Context context) {
        addView(m7338a(LayoutInflater.from(context), this));
        FeedCenterVoteView feedCenterVoteView = (FeedCenterVoteView) LayoutInflater.from(context).inflate(o6c0.f11173a1, (ViewGroup) this.f4734e, false);
        this.f4736g = feedCenterVoteView;
        feedCenterVoteView.setVoteAggregationActClickable(false);
        xdl0.V(this.f4736g.f3351e, t100.d(0.0f));
        this.f4734e.addView(this.f4736g);
    }

    /* JADX INFO: renamed from: d */
    public void m7341d(q3j0 q3j0Var, TopicMoment topicMoment, int i, String str) {
        if (topicMoment == null || q3j0Var == null) {
            return;
        }
        this.f4735f = q3j0Var;
        this.f4732c.setText(mqi0.G(topicMoment.createdTime));
        boolean zIsEmpty = TextUtils.isEmpty(topicMoment.description);
        VText vText = this.f4733d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(topicMoment.description);
            this.f4733d.setVisibility(0);
        }
        User userM7339b = m7339b(topicMoment);
        this.f4731b.setText(userM7339b.name);
        qib0.G.Q0(this.f4730a, userM7339b.m1042fp().profileSmall());
        this.f4736g.m5786W0(topicMoment, i, (Act) getContext(), str);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7340c(context);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7340c(context);
    }
}
