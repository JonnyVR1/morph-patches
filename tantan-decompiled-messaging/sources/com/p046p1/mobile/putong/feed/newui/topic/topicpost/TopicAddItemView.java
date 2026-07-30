package com.p046p1.mobile.putong.feed.newui.topic.topicpost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.xdl0;
import p149l.zxi0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicAddItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f43257a;

    /* JADX INFO: renamed from: b */
    public VText f43258b;

    /* JADX INFO: renamed from: c */
    public VText f43259c;

    /* JADX INFO: renamed from: d */
    public VImage f43260d;

    /* JADX INFO: renamed from: e */
    public VImage f43261e;

    public TopicAddItemView(@NonNull Context context) {
        super(context);
        m66170b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m66169a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zxi0.m220837b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m66170b(Context context) {
        addView(m66169a(LayoutInflater.from(context), this));
    }

    public void setHintColor(int i) {
        this.f43259c.setTextColor(i);
    }

    public void setIcon(int i) {
        this.f43257a.setImageResource(i);
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f43261e, onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f43258b.setText(charSequence);
    }

    public void setTitleColor(int i) {
        this.f43258b.setTextColor(i);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66170b(context);
    }

    public TopicAddItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66170b(context);
    }
}
