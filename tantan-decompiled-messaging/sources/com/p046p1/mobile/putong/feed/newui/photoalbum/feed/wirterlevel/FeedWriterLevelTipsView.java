package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.rai;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWriterLevelTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f41766a;

    /* JADX INFO: renamed from: b */
    public TextView f41767b;

    /* JADX INFO: renamed from: c */
    public ImageView f41768c;

    public FeedWriterLevelTipsView(@NonNull Context context) {
        super(context);
        m64538b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m64537a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rai.m178495b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m64538b(Context context) {
        addView(m64537a(LayoutInflater.from(context), this));
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m64538b(context);
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64538b(context);
    }
}
