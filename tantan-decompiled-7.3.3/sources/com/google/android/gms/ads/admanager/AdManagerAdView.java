package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.common.internal.Preconditions;
import p153l.kfl0;
import p153l.mv0;
import p153l.vcl0;
import p153l.w70;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Nullable
    public w70[] getAdSizes() {
        return this.f9676a.m165772a();
    }

    @Nullable
    public mv0 getAppEventListener() {
        return this.f9676a.m165779k();
    }

    @NonNull
    public vcl0 getVideoController() {
        return this.f9676a.m165777i();
    }

    @Nullable
    public kfl0 getVideoOptions() {
        return this.f9676a.m165778j();
    }

    public void setAdSizes(@NonNull w70... w70VarArr) {
        if (w70VarArr == null || w70VarArr.length <= 0) {
            wg3.m206174a("The supported ad sizes must contain at least one valid ad size.");
        } else {
            this.f9676a.m165790v(w70VarArr);
        }
    }

    public void setAppEventListener(@Nullable mv0 mv0Var) {
        this.f9676a.m165792x(mv0Var);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f9676a.m165793y(z);
    }

    public void setVideoOptions(@NonNull kfl0 kfl0Var) {
        this.f9676a.m165771A(kfl0Var);
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
