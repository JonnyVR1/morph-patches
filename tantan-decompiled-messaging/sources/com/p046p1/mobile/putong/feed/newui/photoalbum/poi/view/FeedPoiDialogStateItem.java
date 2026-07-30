package com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.Emotion;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.qib0;
import p149l.roh;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiDialogStateItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogStateItem f42286c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42287d;

    /* JADX INFO: renamed from: e */
    public TextView f42288e;

    public FeedPoiDialogStateItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65014P(View view) {
        roh.m180242a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m65015Q(Emotion emotion, boolean z) {
        qib0.f154691G.m102325I0(this.f42287d, emotion.emojiUrl, t100.m186890d(52.0f), t100.m186890d(52.0f));
        this.f42288e.setText(emotion.text);
        this.f42286c.setSelected(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65014P(this);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogStateItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
