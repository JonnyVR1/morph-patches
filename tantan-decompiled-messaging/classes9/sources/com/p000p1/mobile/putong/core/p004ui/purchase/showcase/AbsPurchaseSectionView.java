package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class AbsPurchaseSectionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f4971a;

    public AbsPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7659a(boolean z, boolean z2, d.a aVar);

    /* JADX INFO: renamed from: b */
    public void m7660b(boolean z, boolean z2, d.a aVar, PayMethod payMethod) {
        mo7659a(z, z2, aVar);
    }

    public String getFrom() {
        return this.f4971a;
    }

    public void setFrom(String str) {
        this.f4971a = str;
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
