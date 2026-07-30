package com.p046p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.AbstractC15533a6;
import p149l.cul;
import p149l.x680;

/* JADX INFO: loaded from: classes4.dex */
public class LiveScrollViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public cul f47736a;

    /* JADX INFO: renamed from: b */
    public AbstractC15533a6 f47737b;

    public LiveScrollViewContainer(@NonNull Context context, boolean z) {
        super(context);
        this.f47736a = x680.m207168a().m207169b(z);
    }

    /* JADX INFO: renamed from: a */
    public void m71793a(AbstractC15533a6 abstractC15533a6) {
        if (this.f47737b == abstractC15533a6) {
            return;
        }
        removeAllViews();
        if (abstractC15533a6.mo95087R3().getParent() != null) {
            ((ViewGroup) abstractC15533a6.mo95087R3().getParent()).removeView(abstractC15533a6.mo95087R3());
        }
        addView(abstractC15533a6.mo95087R3());
        abstractC15533a6.mo95101f4(this.f47736a);
        this.f47737b = abstractC15533a6;
    }

    public AbstractC15533a6 getPresenter() {
        return this.f47737b;
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
