package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import p153l.fxh;
import p153l.k9c0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostTopicCategoryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f40887a;

    public FeedPostTopicCategoryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63159a(View view) {
        fxh.m127977a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m63160b(TopicCategorie topicCategorie) {
        this.f40887a.setText(topicCategorie.name);
        boolean z = topicCategorie.selected;
        TextView textView = this.f40887a;
        if (z) {
            textView.setTextColor(-1);
            this.f40887a.setTypeface(Typeface.DEFAULT_BOLD);
            setSelected(true);
        } else {
            textView.setTextColor(getResources().getColor(k9c0.f124515k));
            this.f40887a.setTypeface(Typeface.DEFAULT);
            setSelected(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63159a(this);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
