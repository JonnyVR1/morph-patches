package com.p000p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.cul;
import p002l.AbstractC0485a6;
import p002l.x680;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveScrollViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public cul f3778a;

    /* JADX INFO: renamed from: b */
    public AbstractC0485a6 f3779b;

    public LiveScrollViewContainer(@NonNull Context context, boolean z) {
        super(context);
        this.f3778a = x680.m25692a().m25693b(z);
    }

    /* JADX INFO: renamed from: a */
    public void m5162a(AbstractC0485a6 abstractC0485a6) {
        if (this.f3779b == abstractC0485a6) {
            return;
        }
        removeAllViews();
        if (abstractC0485a6.mo9408R3().getParent() != null) {
            ((ViewGroup) abstractC0485a6.mo9408R3().getParent()).removeView(abstractC0485a6.mo9408R3());
        }
        addView(abstractC0485a6.mo9408R3());
        abstractC0485a6.mo9422f4(this.f3778a);
        this.f3779b = abstractC0485a6;
    }

    public AbstractC0485a6 getPresenter() {
        return this.f3779b;
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
