package com.p046p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVoteView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.j4j0;
import p149l.mqi0;
import p149l.o6c0;
import p149l.q3j0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicVoteAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f43269a;

    /* JADX INFO: renamed from: b */
    public VText f43270b;

    /* JADX INFO: renamed from: c */
    public VText f43271c;

    /* JADX INFO: renamed from: d */
    public VText f43272d;

    /* JADX INFO: renamed from: e */
    public VFrame f43273e;

    /* JADX INFO: renamed from: f */
    public q3j0 f43274f;

    /* JADX INFO: renamed from: g */
    public FeedCenterVoteView f43275g;

    public TopicVoteAggregationHeaderView(Context context) {
        super(context);
        m66182c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m66180a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j4j0.m139683b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public User m66181b(TopicMoment topicMoment) {
        return this.f43274f.mo133306m(topicMoment.owner.f38759id);
    }

    /* JADX INFO: renamed from: c */
    public final void m66182c(Context context) {
        addView(m66180a(LayoutInflater.from(context), this));
        FeedCenterVoteView feedCenterVoteView = (FeedCenterVoteView) LayoutInflater.from(context).inflate(o6c0.f142154a1, (ViewGroup) this.f43273e, false);
        this.f43275g = feedCenterVoteView;
        feedCenterVoteView.setVoteAggregationActClickable(false);
        xdl0.m208358V(this.f43275g.f41890e, t100.m186890d(0.0f));
        this.f43273e.addView(this.f43275g);
    }

    /* JADX INFO: renamed from: d */
    public void m66183d(q3j0 q3j0Var, TopicMoment topicMoment, int i, String str) {
        if (topicMoment == null || q3j0Var == null) {
            return;
        }
        this.f43274f = q3j0Var;
        this.f43271c.setText(mqi0.m155932G(topicMoment.createdTime));
        boolean zIsEmpty = TextUtils.isEmpty(topicMoment.description);
        VText vText = this.f43272d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(topicMoment.description);
            this.f43272d.setVisibility(0);
        }
        User userM66181b = m66181b(topicMoment);
        this.f43270b.setText(userM66181b.name);
        qib0.f154691G.m102341Q0(this.f43269a, userM66181b.m60124fp().profileSmall());
        this.f43275g.m64692W0(topicMoment, i, (Act) getContext(), str);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66182c(context);
    }

    public TopicVoteAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66182c(context);
    }
}
