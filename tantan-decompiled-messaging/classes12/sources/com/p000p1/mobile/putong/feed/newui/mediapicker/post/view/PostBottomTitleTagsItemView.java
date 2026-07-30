package com.p000p1.mobile.putong.feed.newui.mediapicker.post.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import p007l.jd80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PostBottomTitleTagsItemView extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final int f2276d = t100.k;

    /* JADX INFO: renamed from: e */
    public static final int f2277e = t100.h;

    /* JADX INFO: renamed from: a */
    public PostBottomTitleTagsItemView f2278a;

    /* JADX INFO: renamed from: b */
    public ImageView f2279b;

    /* JADX INFO: renamed from: c */
    public TextView f2280c;

    public PostBottomTitleTagsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m4084a(View view) {
        jd80.m11128a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m4085b(boolean z) {
        this.f2280c.setSelected(z);
    }

    /* JADX INFO: renamed from: c */
    public void m4086c(String str, boolean z) {
        xdl0.M(this.f2279b, false);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f2278a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f2278a.getPaddingTop(), f2276d, this.f2278a.getPaddingBottom());
        this.f2278a.setBackgroundResource(f3c0.f7615G3);
        this.f2280c.setText(str);
        this.f2280c.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m4087d(String str) {
        xdl0.M(this.f2279b, true);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f2278a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f2278a.getPaddingTop(), f2277e, this.f2278a.getPaddingBottom());
        this.f2280c.setText(str);
        this.f2280c.setSelected(false);
        this.f2278a.setBackground(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4084a(this);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
