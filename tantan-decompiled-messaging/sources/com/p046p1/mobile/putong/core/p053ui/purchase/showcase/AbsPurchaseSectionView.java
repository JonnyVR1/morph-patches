package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsPurchaseSectionView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f35190a;

    public AbsPurchaseSectionView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo54324a(boolean z, boolean z2, C8765d.a aVar);

    /* JADX INFO: renamed from: b */
    public void m54325b(boolean z, boolean z2, C8765d.a aVar, PayMethod payMethod) {
        mo54324a(z, z2, aVar);
    }

    public String getFrom() {
        return this.f35190a;
    }

    public void setFrom(String str) {
        this.f35190a = str;
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsPurchaseSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
