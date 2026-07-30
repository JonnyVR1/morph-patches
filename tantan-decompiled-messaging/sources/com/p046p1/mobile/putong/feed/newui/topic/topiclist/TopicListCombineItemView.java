package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p147v.VText;
import p149l.f3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f43221c;

    /* JADX INFO: renamed from: d */
    public TextView f43222d;

    public TopicListCombineItemView(@NonNull Context context) {
        super(context);
        m66115P(context);
    }

    /* JADX INFO: renamed from: P */
    public void m66115P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPadding(t100.m186890d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(f3c0.f94343H6);
        m66116Q(context);
        m66117R(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m66116Q(Context context) {
        this.f43222d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(28.0f), t100.m186890d(14.0f));
        layoutParams.rightMargin = t100.m186890d(3.0f);
        this.f43222d.setLayoutParams(layoutParams);
        this.f43222d.setGravity(17);
        this.f43222d.setBackgroundResource(f3c0.f94437V);
        this.f43222d.setTextColor(-1);
        this.f43222d.setTextSize(10.0f);
        this.f43222d.setText("匿名");
        this.f43222d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f43222d);
    }

    /* JADX INFO: renamed from: R */
    public final void m66117R(Context context) {
        this.f43221c = new VText(context);
        this.f43221c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f43221c.setGravity(19);
        this.f43221c.setPadding(0, t100.m186890d(4.0f), t100.m186890d(16.0f), t100.m186890d(4.0f));
        this.f43221c.setTextColor(Color.parseColor("#d84d37"));
        this.f43221c.setTextSize(14.0f);
        addView(this.f43221c);
    }

    public TextView getmAnonymousTextView() {
        return this.f43222d;
    }

    public VText getmContent() {
        return this.f43221c;
    }

    public void setAnonymousTextViewVisible(boolean z) {
        xdl0.m208344M(this.f43222d, z);
    }

    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentText(String str) {
        this.f43221c.setText(str);
    }

    public void setContentTextColor(int i) {
        this.f43221c.setTextColor(i);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66115P(context);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66115P(context);
    }
}
