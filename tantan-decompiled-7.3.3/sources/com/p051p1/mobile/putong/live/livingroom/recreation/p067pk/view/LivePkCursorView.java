package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkCursorView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVisibleEffectPlayer f52492a;

    public LivePkCursorView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m77323a(String str) {
        if (TextUtils.isEmpty(str)) {
            m77324b();
        } else {
            this.f52492a.m69683j(str, -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77324b() {
        this.f52492a.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52492a = new AutoVisibleEffectPlayer(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(46.0f), qa00.f156339z);
        layoutParams.leftMargin = -qa00.m175859d(23.0f);
        addView(this.f52492a, layoutParams);
    }

    public void setCursorOffset(float f) {
        this.f52492a.setTranslationX(f);
    }

    public LivePkCursorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkCursorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
