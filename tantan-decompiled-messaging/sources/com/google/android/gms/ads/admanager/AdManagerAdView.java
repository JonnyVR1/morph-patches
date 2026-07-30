package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.common.internal.Preconditions;
import p149l.a80;
import p149l.fv0;
import p149l.g6l0;
import p149l.ig3;
import p149l.q3l0;

/* JADX INFO: loaded from: classes6.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Nullable
    public a80[] getAdSizes() {
        return this.f9639a.m138255a();
    }

    @Nullable
    public fv0 getAppEventListener() {
        return this.f9639a.m138262k();
    }

    @NonNull
    public q3l0 getVideoController() {
        return this.f9639a.m138260i();
    }

    @Nullable
    public g6l0 getVideoOptions() {
        return this.f9639a.m138261j();
    }

    public void setAdSizes(@NonNull a80... a80VarArr) {
        if (a80VarArr == null || a80VarArr.length <= 0) {
            ig3.m135964a("The supported ad sizes must contain at least one valid ad size.");
        } else {
            this.f9639a.m138273v(a80VarArr);
        }
    }

    public void setAppEventListener(@Nullable fv0 fv0Var) {
        this.f9639a.m138275x(fv0Var);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f9639a.m138276y(z);
    }

    public void setVideoOptions(@NonNull g6l0 g6l0Var) {
        this.f9639a.m138254A(g6l0Var);
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
