package com.p046p1.mobile.putong.feed.newui.mediapicker.post.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.f3c0;
import p149l.jd80;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PostBottomTitleTagsItemView extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final int f40815d = t100.f167262k;

    /* JADX INFO: renamed from: e */
    public static final int f40816e = t100.f167259h;

    /* JADX INFO: renamed from: a */
    public PostBottomTitleTagsItemView f40817a;

    /* JADX INFO: renamed from: b */
    public ImageView f40818b;

    /* JADX INFO: renamed from: c */
    public TextView f40819c;

    public PostBottomTitleTagsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63068a(View view) {
        jd80.m141014a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m63069b(boolean z) {
        this.f40819c.setSelected(z);
    }

    /* JADX INFO: renamed from: c */
    public void m63070c(String str, boolean z) {
        xdl0.m208344M(this.f40818b, false);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f40817a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f40817a.getPaddingTop(), f40815d, this.f40817a.getPaddingBottom());
        this.f40817a.setBackgroundResource(f3c0.f94332G3);
        this.f40819c.setText(str);
        this.f40819c.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m63071d(String str) {
        xdl0.m208344M(this.f40818b, true);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f40817a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f40817a.getPaddingTop(), f40816e, this.f40817a.getPaddingBottom());
        this.f40819c.setText(str);
        this.f40819c.setSelected(false);
        this.f40817a.setBackground(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63068a(this);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
