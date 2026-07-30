package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicListItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4684c;

    /* JADX INFO: renamed from: d */
    public TextView f4685d;

    public TopicListItemView(@NonNull Context context) {
        super(context);
        m7272P(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    private void m7270Q(Context context) {
        this.f4685d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(28.0f), t100.d(14.0f));
        layoutParams.rightMargin = t100.d(3.0f);
        this.f4685d.setLayoutParams(layoutParams);
        this.f4685d.setGravity(17);
        this.f4685d.setBackgroundResource(f3c0.f7720V);
        this.f4685d.setTextColor(-1);
        this.f4685d.setTextSize(10.0f);
        this.f4685d.setText("匿名");
        this.f4685d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f4685d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m7271R(Context context) {
        this.f4684c = new VText(context);
        this.f4684c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f4684c.setGravity(19);
        this.f4684c.setPadding(0, t100.d(7.0f), t100.d(16.0f), t100.d(7.0f));
        this.f4684c.setTextColor(Color.parseColor("#4a4a4a"));
        this.f4684c.setTextSize(14.0f);
        addView(this.f4684c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public void m7272P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.d(16.0f);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(16.0f);
        setPadding(t100.d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(f3c0.f7626H6);
        m7270Q(context);
        m7271R(context);
    }

    /* JADX INFO: renamed from: S */
    public void m7273S(TopicMoment topicMoment) {
        this.f4684c.setText(topicMoment.getTopicNameWithPrefix());
    }

    public void setAnonymousTextViewVisible(boolean z) {
        xdl0.M(this.f4685d, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentTextColor(int i) {
        this.f4684c.setTextColor(i);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7272P(context);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7272P(context);
    }
}
