package com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import java.util.List;
import p149l.kcn0;
import p149l.t100;
import p149l.t6c0;
import p149l.w0o0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiDialogLayout extends ScrollView {

    /* JADX INFO: renamed from: a */
    public LinearLayout f53108a;

    /* JADX INFO: renamed from: b */
    public float f53109b;

    /* JADX INFO: renamed from: c */
    public float f53110c;

    public VoiceMicEmojiDialogLayout(Context context) {
        super(context);
        this.f53109b = 0.0f;
        this.f53110c = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m78118a(View view) {
        w0o0.m200897a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78119b(List<kcn0> list) {
        LinearLayout linearLayout = this.f53108a;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        scrollTo(0, 0);
        int i = 0;
        while (i < list.size()) {
            kcn0 kcn0Var = list.get(i);
            VoiceMicEmojiGroupView voiceMicEmojiGroupView = (VoiceMicEmojiGroupView) View.inflate(getContext(), t6c0.f168161Q9, null);
            voiceMicEmojiGroupView.m78123j0(kcn0Var.m145602a(), kcn0Var.m145603b());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, (list.size() == 1 || i == list.size() - 1) ? t100.m186890d(30.0f) : 0);
            this.f53108a.addView(voiceMicEmojiGroupView, layoutParams);
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78118a(this);
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
            if (Math.abs(x - this.f53109b) < Math.abs(y - this.f53110c)) {
                z = true;
            }
        }
        this.f53109b = x;
        this.f53110c = y;
        return z;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.m186890d(362.0f), Integer.MIN_VALUE));
    }

    public VoiceMicEmojiDialogLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53109b = 0.0f;
        this.f53110c = 0.0f;
    }

    public VoiceMicEmojiDialogLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53109b = 0.0f;
        this.f53110c = 0.0f;
    }

    public VoiceMicEmojiDialogLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f53109b = 0.0f;
        this.f53110c = 0.0f;
    }
}
