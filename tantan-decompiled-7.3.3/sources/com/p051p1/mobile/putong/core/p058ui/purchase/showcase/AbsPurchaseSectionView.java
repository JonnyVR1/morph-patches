package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsPurchaseSectionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f36038a;

    public AbsPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo55507a(boolean z, boolean z2, C8928d.a aVar);

    /* JADX INFO: renamed from: b */
    public void m55508b(boolean z, boolean z2, C8928d.a aVar, PayMethod payMethod) {
        mo55507a(z, z2, aVar);
    }

    public String getFrom() {
        return this.f36038a;
    }

    public void setFrom(String str) {
        this.f36038a = str;
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
