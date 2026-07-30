package com.p051p1.mobile.putong.feed.newui.topic.topicpost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.d7j0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicAddItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f44105a;

    /* JADX INFO: renamed from: b */
    public VText f44106b;

    /* JADX INFO: renamed from: c */
    public VText f44107c;

    /* JADX INFO: renamed from: d */
    public VImage f44108d;

    /* JADX INFO: renamed from: e */
    public VImage f44109e;

    public TopicAddItemView(@NonNull Context context) {
        super(context);
        m67353b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m67352a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d7j0.m114750b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m67353b(Context context) {
        addView(m67352a(LayoutInflater.from(context), this));
    }

    public void setHintColor(int i) {
        this.f44107c.setTextColor(i);
    }

    public void setIcon(int i) {
        this.f44105a.setImageResource(i);
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f44109e, onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f44106b.setText(charSequence);
    }

    public void setTitleColor(int i) {
        this.f44106b.setTextColor(i);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67353b(context);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67353b(context);
    }
}
