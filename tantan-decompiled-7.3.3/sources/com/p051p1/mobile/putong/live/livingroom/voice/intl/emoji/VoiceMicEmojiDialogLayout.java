package com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import java.util.List;
import p153l.aao0;
import p153l.oln0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiDialogLayout extends ScrollView {

    /* JADX INFO: renamed from: a */
    public LinearLayout f53956a;

    /* JADX INFO: renamed from: b */
    public float f53957b;

    /* JADX INFO: renamed from: c */
    public float f53958c;

    public VoiceMicEmojiDialogLayout(Context context) {
        super(context);
        this.f53957b = 0.0f;
        this.f53958c = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m79301a(View view) {
        aao0.m96654a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79302b(List<oln0> list) {
        LinearLayout linearLayout = this.f53956a;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        scrollTo(0, 0);
        int i = 0;
        while (i < list.size()) {
            oln0 oln0Var = list.get(i);
            VoiceMicEmojiGroupView voiceMicEmojiGroupView = (VoiceMicEmojiGroupView) View.inflate(getContext(), yec0.f198893Q9, null);
            voiceMicEmojiGroupView.m79306j0(oln0Var.m168141a(), oln0Var.m168142b());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, (list.size() == 1 || i == list.size() - 1) ? qa00.m175859d(30.0f) : 0);
            this.f53956a.addView(voiceMicEmojiGroupView, layoutParams);
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79301a(this);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            super.onInterceptTouchEvent(motionEvent);
        } else if (action != 1 && action == 2) {
            if (Math.abs(x - this.f53957b) < Math.abs(y - this.f53958c)) {
                z = true;
            }
        }
        this.f53957b = x;
        this.f53958c = y;
        return z;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(qa00.m175859d(362.0f), Integer.MIN_VALUE));
    }

    public VoiceMicEmojiDialogLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53957b = 0.0f;
        this.f53958c = 0.0f;
    }

    public VoiceMicEmojiDialogLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53957b = 0.0f;
        this.f53958c = 0.0f;
    }

    public VoiceMicEmojiDialogLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f53957b = 0.0f;
        this.f53958c = 0.0f;
    }
}
