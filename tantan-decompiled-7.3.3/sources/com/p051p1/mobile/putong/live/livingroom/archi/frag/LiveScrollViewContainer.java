package com.p051p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.AbstractC21253x5;
import p153l.df80;
import p153l.qwl;

/* JADX INFO: loaded from: classes4.dex */
public class LiveScrollViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public qwl f48584a;

    /* JADX INFO: renamed from: b */
    public AbstractC21253x5 f48585b;

    public LiveScrollViewContainer(@NonNull Context context, boolean z) {
        super(context);
        this.f48584a = df80.m115507a().m115508b(z);
    }

    /* JADX INFO: renamed from: a */
    public void m72976a(AbstractC21253x5 abstractC21253x5) {
        if (this.f48585b == abstractC21253x5) {
            return;
        }
        removeAllViews();
        if (abstractC21253x5.mo120612R3().getParent() != null) {
            ((ViewGroup) abstractC21253x5.mo120612R3().getParent()).removeView(abstractC21253x5.mo120612R3());
        }
        addView(abstractC21253x5.mo120612R3());
        abstractC21253x5.mo120625f4(this.f48584a);
        this.f48585b = abstractC21253x5;
    }

    public AbstractC21253x5 getPresenter() {
        return this.f48585b;
    }

    public LiveScrollViewContainer(@NonNull Context context) {
        super(context);
    }

    public LiveScrollViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveScrollViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
