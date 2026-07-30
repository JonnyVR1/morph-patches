package com.p000p1.mobile.putong.feed.newui.topic.topicpost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.xdl0;
import p007l.zxi0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicAddItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4718a;

    /* JADX INFO: renamed from: b */
    public VText f4719b;

    /* JADX INFO: renamed from: c */
    public VText f4720c;

    /* JADX INFO: renamed from: d */
    public VImage f4721d;

    /* JADX INFO: renamed from: e */
    public VImage f4722e;

    public TopicAddItemView(@NonNull Context context) {
        super(context);
        m7326b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m7325a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zxi0.m17576b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m7326b(Context context) {
        addView(m7325a(LayoutInflater.from(context), this));
    }

    public void setHintColor(int i) {
        this.f4720c.setTextColor(i);
    }

    public void setIcon(int i) {
        this.f4718a.setImageResource(i);
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        xdl0.E0(this.f4722e, onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4719b.setText(charSequence);
    }

    public void setTitleColor(int i) {
        this.f4719b.setTextColor(i);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7326b(context);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7326b(context);
    }
}
