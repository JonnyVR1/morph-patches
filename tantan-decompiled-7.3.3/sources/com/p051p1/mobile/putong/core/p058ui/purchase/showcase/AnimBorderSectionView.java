package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AnimBorderSectionView extends AbsPurchaseSectionView {
    public AnimBorderSectionView(@NonNull Context context) {
        super(context);
    }

    public abstract List<View> getAnimBackgroundList();

    public AnimBorderSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimBorderSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
