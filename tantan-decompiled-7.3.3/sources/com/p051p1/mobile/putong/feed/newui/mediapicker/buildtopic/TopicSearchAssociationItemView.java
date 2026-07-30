package com.p051p1.mobile.putong.feed.newui.mediapicker.buildtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VText;
import p153l.abj0;
import p153l.j4h;
import p153l.k9c0;
import p153l.q8g0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class TopicSearchAssociationItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopicSearchAssociationItemView f41433a;

    /* JADX INFO: renamed from: b */
    public VText f41434b;

    /* JADX INFO: renamed from: c */
    public VText f41435c;

    /* JADX INFO: renamed from: d */
    public boolean f41436d;

    public TopicSearchAssociationItemView(Context context) {
        super(context);
        this.f41436d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m63810a(View view) {
        abj0.m96770a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m63811b(int i, TopicMoment topicMoment) {
        this.f41434b.setText(topicMoment.getTopicNameWithPrefix());
        this.f41435c.setText(q8g0.m175816u(topicMoment.momentCounter) + "条动态");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63810a(this);
        if (j4h.m143424h()) {
            this.f41434b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f41435c.setTextColor(getResources().getColor(k9c0.f124509h));
        }
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41436d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41436d = false;
    }

    public TopicSearchAssociationItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f41436d = false;
    }
}
