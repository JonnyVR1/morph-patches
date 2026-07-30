package com.p000p1.mobile.putong.feed.newui.mediapicker.buildtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.i0g0;
import p007l.e1c0;
import p007l.u2h;
import p007l.w1j0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicSearchAssociationItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopicSearchAssociationItemView f2046a;

    /* JADX INFO: renamed from: b */
    public VText f2047b;

    /* JADX INFO: renamed from: c */
    public VText f2048c;

    /* JADX INFO: renamed from: d */
    public boolean f2049d;

    public TopicSearchAssociationItemView(Context context) {
        super(context);
        this.f2049d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3632a(View view) {
        w1j0.m15677a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m3633b(int i, TopicMoment topicMoment) {
        this.f2047b.setText(topicMoment.getTopicNameWithPrefix());
        this.f2048c.setText(i0g0.u(topicMoment.momentCounter) + "条动态");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3632a(this);
        if (u2h.m14723h()) {
            this.f2047b.setTextColor(-16777216);
            this.f2048c.setTextColor(getResources().getColor(e1c0.f7142h));
        }
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2049d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2049d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2049d = false;
    }
}
