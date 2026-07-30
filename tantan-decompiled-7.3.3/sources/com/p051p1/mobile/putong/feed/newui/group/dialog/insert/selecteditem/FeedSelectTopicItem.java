package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p151v.VImage;
import p153l.vzh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSelectTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedLinearWithExtraIconsView f40859a;

    /* JADX INFO: renamed from: b */
    public TextView f40860b;

    /* JADX INFO: renamed from: c */
    public VImage f40861c;

    public FeedSelectTopicItem(@NonNull Context context) {
        super(context);
        m63115b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m63114a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vzh.m204096b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m63115b(Context context) {
        addView(m63114a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63115b(context);
    }

    public FeedSelectTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63115b(context);
    }
}
