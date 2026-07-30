package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VLinear;
import p147v.VText;
import p149l.f3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicListItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f43223c;

    /* JADX INFO: renamed from: d */
    public TextView f43224d;

    public TopicListItemView(@NonNull Context context) {
        super(context);
        m66120P(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m66118Q(Context context) {
        this.f43224d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(28.0f), t100.m186890d(14.0f));
        layoutParams.rightMargin = t100.m186890d(3.0f);
        this.f43224d.setLayoutParams(layoutParams);
        this.f43224d.setGravity(17);
        this.f43224d.setBackgroundResource(f3c0.f94437V);
        this.f43224d.setTextColor(-1);
        this.f43224d.setTextSize(10.0f);
        this.f43224d.setText("匿名");
        this.f43224d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f43224d);
    }

    /* JADX INFO: renamed from: R */
    private void m66119R(Context context) {
        this.f43223c = new VText(context);
        this.f43223c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f43223c.setGravity(19);
        this.f43223c.setPadding(0, t100.m186890d(7.0f), t100.m186890d(16.0f), t100.m186890d(7.0f));
        this.f43223c.setTextColor(Color.parseColor("#4a4a4a"));
        this.f43223c.setTextSize(14.0f);
        addView(this.f43223c);
    }

    /* JADX INFO: renamed from: P */
    public void m66120P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.m186890d(16.0f);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(16.0f);
        setPadding(t100.m186890d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(f3c0.f94343H6);
        m66118Q(context);
        m66119R(context);
    }

    /* JADX INFO: renamed from: S */
    public void m66121S(TopicMoment topicMoment) {
        this.f43223c.setText(topicMoment.getTopicNameWithPrefix());
    }

    public void setAnonymousTextViewVisible(boolean z) {
        xdl0.m208344M(this.f43224d, z);
    }

    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentTextColor(int i) {
        this.f43223c.setTextColor(i);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66120P(context);
    }

    public TopicListItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66120P(context);
    }
}
