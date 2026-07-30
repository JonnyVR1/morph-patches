package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bms0;
import p153l.dct0;
import p153l.dsx;
import p153l.h950;
import p153l.n6t0;
import p153l.r8s0;

/* JADX INFO: loaded from: classes6.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    @Nullable
    public dsx f9770a;

    /* JADX INFO: renamed from: b */
    public boolean f9771b;

    /* JADX INFO: renamed from: c */
    public ImageView.ScaleType f9772c;

    /* JADX INFO: renamed from: d */
    public boolean f9773d;

    /* JADX INFO: renamed from: e */
    public r8s0 f9774e;

    /* JADX INFO: renamed from: f */
    public n6t0 f9775f;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12401a(r8s0 r8s0Var) {
        this.f9774e = r8s0Var;
        if (this.f9771b) {
            r8s0Var.f161764a.m12404b(this.f9770a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12402b(n6t0 n6t0Var) {
        this.f9775f = n6t0Var;
        if (this.f9773d) {
            n6t0Var.f140487a.m12405c(this.f9772c);
        }
    }

    @Nullable
    public dsx getMediaContent() {
        return this.f9770a;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f9773d = true;
        this.f9772c = scaleType;
        n6t0 n6t0Var = this.f9775f;
        if (n6t0Var != null) {
            n6t0Var.f140487a.m12405c(scaleType);
        }
    }

    public void setMediaContent(@Nullable dsx dsxVar) {
        boolean zMo105256H;
        this.f9771b = true;
        this.f9770a = dsxVar;
        r8s0 r8s0Var = this.f9774e;
        if (r8s0Var != null) {
            r8s0Var.f161764a.m12404b(dsxVar);
        }
        if (dsxVar == null) {
            return;
        }
        try {
            bms0 bms0VarZza = dsxVar.zza();
            if (bms0VarZza != null) {
                if (!dsxVar.mo117781a()) {
                    if (dsxVar.zzb()) {
                        zMo105256H = bms0VarZza.mo105256H(h950.m134038Y2(this));
                    }
                    removeAllViews();
                }
                zMo105256H = bms0VarZza.mo105260o0(h950.m134038Y2(this));
                if (zMo105256H) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            dct0.m115296e("", e);
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
