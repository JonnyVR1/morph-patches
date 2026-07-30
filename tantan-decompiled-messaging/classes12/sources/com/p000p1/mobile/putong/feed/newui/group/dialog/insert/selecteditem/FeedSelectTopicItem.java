package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p007l.gyh;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSelectTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedLinearWithExtraIconsView f1472a;

    /* JADX INFO: renamed from: b */
    public TextView f1473b;

    /* JADX INFO: renamed from: c */
    public VImage f1474c;

    public FeedSelectTopicItem(@NonNull Context context) {
        super(context);
        m2906b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m2905a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gyh.m10505b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m2906b(Context context) {
        addView(m2905a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2906b(context);
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2906b(context);
    }
}
