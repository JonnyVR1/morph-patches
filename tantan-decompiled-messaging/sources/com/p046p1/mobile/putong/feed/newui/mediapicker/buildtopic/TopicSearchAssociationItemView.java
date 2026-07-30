package com.p046p1.mobile.putong.feed.newui.mediapicker.buildtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VText;
import p149l.e1c0;
import p149l.i0g0;
import p149l.u2h;
import p149l.w1j0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class TopicSearchAssociationItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopicSearchAssociationItemView f40585a;

    /* JADX INFO: renamed from: b */
    public VText f40586b;

    /* JADX INFO: renamed from: c */
    public VText f40587c;

    /* JADX INFO: renamed from: d */
    public boolean f40588d;

    public TopicSearchAssociationItemView(Context context) {
        super(context);
        this.f40588d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m62627a(View view) {
        w1j0.m200936a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m62628b(int i, TopicMoment topicMoment) {
        this.f40586b.setText(topicMoment.getTopicNameWithPrefix());
        this.f40587c.setText(i0g0.m133881u(topicMoment.momentCounter) + "条动态");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62627a(this);
        if (u2h.m191499h()) {
            this.f40586b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f40587c.setTextColor(getResources().getColor(e1c0.f88786h));
        }
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40588d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40588d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f40588d = false;
    }
}
