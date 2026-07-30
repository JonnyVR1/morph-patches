package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.lbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class TopicListItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f44071c;

    /* JADX INFO: renamed from: d */
    public TextView f44072d;

    public TopicListItemView(@NonNull Context context) {
        super(context);
        m67303P(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m67301Q(Context context) {
        this.f44072d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(28.0f), qa00.m175859d(14.0f));
        layoutParams.rightMargin = qa00.m175859d(3.0f);
        this.f44072d.setLayoutParams(layoutParams);
        this.f44072d.setGravity(17);
        this.f44072d.setBackgroundResource(lbc0.f130955V);
        this.f44072d.setTextColor(-1);
        this.f44072d.setTextSize(10.0f);
        this.f44072d.setText("匿名");
        this.f44072d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f44072d);
    }

    /* JADX INFO: renamed from: R */
    private void m67302R(Context context) {
        this.f44071c = new VText(context);
        this.f44071c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f44071c.setGravity(19);
        this.f44071c.setPadding(0, qa00.m175859d(7.0f), qa00.m175859d(16.0f), qa00.m175859d(7.0f));
        this.f44071c.setTextColor(Color.parseColor("#4a4a4a"));
        this.f44071c.setTextSize(14.0f);
        addView(this.f44071c);
    }

    /* JADX INFO: renamed from: P */
    public void m67303P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = qa00.m175859d(16.0f);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(16.0f);
        setPadding(qa00.m175859d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(lbc0.f130861H6);
        m67301Q(context);
        m67302R(context);
    }

    /* JADX INFO: renamed from: S */
    public void m67304S(TopicMoment topicMoment) {
        this.f44071c.setText(topicMoment.getTopicNameWithPrefix());
    }

    public void setAnonymousTextViewVisible(boolean z) {
        bnl0.m105524M(this.f44072d, z);
    }

    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentTextColor(int i) {
        this.f44071c.setTextColor(i);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67303P(context);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67303P(context);
    }
}
