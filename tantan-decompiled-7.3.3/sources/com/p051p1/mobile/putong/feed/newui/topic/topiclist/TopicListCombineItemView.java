package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.lbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class TopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f44069c;

    /* JADX INFO: renamed from: d */
    public TextView f44070d;

    public TopicListCombineItemView(@NonNull Context context) {
        super(context);
        m67298P(context);
    }

    /* JADX INFO: renamed from: P */
    public void m67298P(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPadding(qa00.m175859d(16.0f), 0, 0, 0);
        setLayoutParams(layoutParams);
        setGravity(16);
        setBackgroundResource(lbc0.f130861H6);
        m67299Q(context);
        m67300R(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m67299Q(Context context) {
        this.f44070d = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(28.0f), qa00.m175859d(14.0f));
        layoutParams.rightMargin = qa00.m175859d(3.0f);
        this.f44070d.setLayoutParams(layoutParams);
        this.f44070d.setGravity(17);
        this.f44070d.setBackgroundResource(lbc0.f130955V);
        this.f44070d.setTextColor(-1);
        this.f44070d.setTextSize(10.0f);
        this.f44070d.setText("匿名");
        this.f44070d.setTypeface(Typeface.defaultFromStyle(1));
        addView(this.f44070d);
    }

    /* JADX INFO: renamed from: R */
    public final void m67300R(Context context) {
        this.f44069c = new VText(context);
        this.f44069c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f44069c.setGravity(19);
        this.f44069c.setPadding(0, qa00.m175859d(4.0f), qa00.m175859d(16.0f), qa00.m175859d(4.0f));
        this.f44069c.setTextColor(Color.parseColor("#d84d37"));
        this.f44069c.setTextSize(14.0f);
        addView(this.f44069c);
    }

    public TextView getmAnonymousTextView() {
        return this.f44070d;
    }

    public VText getmContent() {
        return this.f44069c;
    }

    public void setAnonymousTextViewVisible(boolean z) {
        bnl0.m105524M(this.f44070d, z);
    }

    public void setContentBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setContentLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setContentText(String str) {
        this.f44069c.setText(str);
    }

    public void setContentTextColor(int i) {
        this.f44069c.setTextColor(i);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67298P(context);
    }

    public TopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67298P(context);
    }
}
