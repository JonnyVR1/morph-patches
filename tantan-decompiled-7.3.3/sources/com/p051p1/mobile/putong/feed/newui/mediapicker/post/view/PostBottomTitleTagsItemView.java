package com.p051p1.mobile.putong.feed.newui.mediapicker.post.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.lbc0;
import p153l.qa00;
import p153l.ql80;

/* JADX INFO: loaded from: classes13.dex */
public class PostBottomTitleTagsItemView extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final int f41663d = qa00.f156324k;

    /* JADX INFO: renamed from: e */
    public static final int f41664e = qa00.f156321h;

    /* JADX INFO: renamed from: a */
    public PostBottomTitleTagsItemView f41665a;

    /* JADX INFO: renamed from: b */
    public ImageView f41666b;

    /* JADX INFO: renamed from: c */
    public TextView f41667c;

    public PostBottomTitleTagsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m64251a(View view) {
        ql80.m176996a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m64252b(boolean z) {
        this.f41667c.setSelected(z);
    }

    /* JADX INFO: renamed from: c */
    public void m64253c(String str, boolean z) {
        bnl0.m105524M(this.f41666b, false);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f41665a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f41665a.getPaddingTop(), f41663d, this.f41665a.getPaddingBottom());
        this.f41665a.setBackgroundResource(lbc0.f130850G3);
        this.f41667c.setText(str);
        this.f41667c.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m64254d(String str) {
        bnl0.m105524M(this.f41666b, true);
        PostBottomTitleTagsItemView postBottomTitleTagsItemView = this.f41665a;
        postBottomTitleTagsItemView.setPadding(postBottomTitleTagsItemView.getPaddingLeft(), this.f41665a.getPaddingTop(), f41664e, this.f41665a.getPaddingBottom());
        this.f41667c.setText(str);
        this.f41667c.setSelected(false);
        this.f41665a.setBackground(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64251a(this);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PostBottomTitleTagsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
