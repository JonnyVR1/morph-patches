package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p147v.VImage;
import p149l.gyh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSelectTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedLinearWithExtraIconsView f40011a;

    /* JADX INFO: renamed from: b */
    public TextView f40012b;

    /* JADX INFO: renamed from: c */
    public VImage f40013c;

    public FeedSelectTopicItem(@NonNull Context context) {
        super(context);
        m61932b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m61931a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gyh.m128710b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m61932b(Context context) {
        addView(m61931a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m61932b(context);
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61932b(context);
    }
}
