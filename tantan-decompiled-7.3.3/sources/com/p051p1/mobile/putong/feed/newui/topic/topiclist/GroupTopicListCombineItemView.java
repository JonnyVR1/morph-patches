package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.h9i;
import p153l.k9c0;
import p153l.lbc0;
import p153l.qa00;
import p153l.xpk;

/* JADX INFO: loaded from: classes13.dex */
public class GroupTopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TextView f44046c;

    /* JADX INFO: renamed from: d */
    public TextView f44047d;

    /* JADX INFO: renamed from: e */
    public VImage f44048e;

    public GroupTopicListCombineItemView(@NonNull Context context) {
        super(context);
        m67272Q(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m67272Q(Context context) {
        addView(m67273P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m67273P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xpk.m212658b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m67274R(TopicMoment topicMoment) {
        bnl0.m105524M(this.f44047d, topicMoment.isTopicAnonymousType());
        this.f44046c.setText(h9i.m134070k(topicMoment.getTopicNameWithPrefix(), 15));
    }

    /* JADX INFO: renamed from: S */
    public void m67275S() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = qa00.m175859d(10.0f);
        layoutParams.topMargin = qa00.m175859d(12.0f);
    }

    /* JADX INFO: renamed from: T */
    public void m67276T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = qa00.m175859d(8.0f);
        layoutParams.topMargin = qa00.m175859d(8.0f);
        getChildAt(0).setPadding(qa00.m175859d(16.0f), qa00.m175859d(13.0f), qa00.m175859d(16.0f), qa00.m175859d(13.0f));
        getChildAt(0).setBackgroundResource(lbc0.f131139s4);
        this.f44046c.setTextColor(getResources().getColor(k9c0.f124503e));
        this.f44048e.setImageResource(lbc0.f130938S3);
        bnl0.m105524M(this.f44048e, true);
    }

    public void setViewSelected(boolean z) {
        setSelected(z);
        bnl0.m105524M(this.f44048e, z);
    }

    public void setViewSelectedNoDelete(boolean z) {
        setSelected(z);
        bnl0.m105524M(this.f44048e, false);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67272Q(context);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67272Q(context);
    }
}
