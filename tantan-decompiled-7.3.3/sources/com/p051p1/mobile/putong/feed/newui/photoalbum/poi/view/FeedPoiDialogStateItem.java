package com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.Emotion;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.gqh;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiDialogStateItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogStateItem f43134c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43135d;

    /* JADX INFO: renamed from: e */
    public TextView f43136e;

    public FeedPoiDialogStateItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66197P(View view) {
        gqh.m131375a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m66198Q(Emotion emotion, boolean z) {
        uqb0.f180374G.m127109I0(this.f43135d, emotion.emojiUrl, qa00.m175859d(52.0f), qa00.m175859d(52.0f));
        this.f43136e.setText(emotion.text);
        this.f43134c.setSelected(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66197P(this);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
