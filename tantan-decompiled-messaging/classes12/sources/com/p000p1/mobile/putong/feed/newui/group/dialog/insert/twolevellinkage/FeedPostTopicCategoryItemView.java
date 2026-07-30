package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import p007l.e1c0;
import p007l.qvh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostTopicCategoryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1500a;

    public FeedPostTopicCategoryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2950a(View view) {
        qvh.m13738a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2951b(TopicCategorie topicCategorie) {
        this.f1500a.setText(topicCategorie.name);
        boolean z = topicCategorie.selected;
        TextView textView = this.f1500a;
        if (z) {
            textView.setTextColor(-1);
            this.f1500a.setTypeface(Typeface.DEFAULT_BOLD);
            setSelected(true);
        } else {
            textView.setTextColor(getResources().getColor(e1c0.f7148k));
            this.f1500a.setTypeface(Typeface.DEFAULT);
            setSelected(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2950a(this);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
