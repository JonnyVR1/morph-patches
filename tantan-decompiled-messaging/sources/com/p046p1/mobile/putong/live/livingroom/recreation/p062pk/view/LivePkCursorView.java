package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkCursorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVisibleEffectPlayer f51644a;

    public LivePkCursorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m76140a(String str) {
        if (TextUtils.isEmpty(str)) {
            m76141b();
        } else {
            this.f51644a.m68500j(str, -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76141b() {
        this.f51644a.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51644a = new AutoVisibleEffectPlayer(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(46.0f), t100.f167277z);
        layoutParams.leftMargin = -t100.m186890d(23.0f);
        addView(this.f51644a, layoutParams);
    }

    public void setCursorOffset(float f) {
        this.f51644a.setTranslationX(f);
    }

    public LivePkCursorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkCursorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
