package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import p149l.e1c0;
import p149l.qvh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostTopicCategoryItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f40039a;

    public FeedPostTopicCategoryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m61976a(View view) {
        qvh.m176701a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m61977b(TopicCategorie topicCategorie) {
        this.f40039a.setText(topicCategorie.name);
        boolean z = topicCategorie.selected;
        TextView textView = this.f40039a;
        if (z) {
            textView.setTextColor(-1);
            this.f40039a.setTypeface(Typeface.DEFAULT_BOLD);
            setSelected(true);
        } else {
            textView.setTextColor(getResources().getColor(e1c0.f88792k));
            this.f40039a.setTypeface(Typeface.DEFAULT);
            setSelected(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61976a(this);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostTopicCategoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
