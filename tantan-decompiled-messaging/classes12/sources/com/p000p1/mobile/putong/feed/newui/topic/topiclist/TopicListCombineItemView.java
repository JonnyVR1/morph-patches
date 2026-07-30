package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f4682c;

    /* JADX INFO: renamed from: d */
    public TextView f4683d;

    public TopicListCombineItemView(@NonNull Context context) {
        super(context);
        m7267P(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public void m7267P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPadding(t100.d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(f3c0.f7626H6);
        m7268Q(context);
        m7269R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m7268Q(Context context) {
        this.f4683d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(28.0f), t100.d(14.0f));
        layoutParams.rightMargin = t100.d(3.0f);
        this.f4683d.setLayoutParams(layoutParams);
        this.f4683d.setGravity(17);
        this.f4683d.setBackgroundResource(f3c0.f7720V);
        this.f4683d.setTextColor(-1);
        this.f4683d.setTextSize(10.0f);
        this.f4683d.setText("匿名");
        this.f4683d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f4683d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m7269R(Context context) {
        this.f4682c = new VText(context);
        this.f4682c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f4682c.setGravity(19);
        this.f4682c.setPadding(0, t100.d(4.0f), t100.d(16.0f), t100.d(4.0f));
        this.f4682c.setTextColor(Color.parseColor("#d84d37"));
        this.f4682c.setTextSize(14.0f);
        addView(this.f4682c);
    }

    public TextView getmAnonymousTextView() {
        return this.f4683d;
    }

    public VText getmContent() {
        return this.f4682c;
    }

    public void setAnonymousTextViewVisible(boolean z) {
        xdl0.M(this.f4683d, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentText(String str) {
        this.f4682c.setText(str);
    }

    public void setContentTextColor(int i) {
        this.f4682c.setTextColor(i);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7267P(context);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7267P(context);
    }
}
