package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.gjx;
import p149l.hxs0;
import p149l.lzr0;
import p149l.s050;
import p149l.vcs0;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    @Nullable
    public gjx f9733a;

    /* JADX INFO: renamed from: b */
    public boolean f9734b;

    /* JADX INFO: renamed from: c */
    public ImageView.ScaleType f9735c;

    /* JADX INFO: renamed from: d */
    public boolean f9736d;

    /* JADX INFO: renamed from: e */
    public lzr0 f9737e;

    /* JADX INFO: renamed from: f */
    public hxs0 f9738f;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12347a(lzr0 lzr0Var) {
        this.f9737e = lzr0Var;
        if (this.f9734b) {
            lzr0Var.f130673a.m12350b(this.f9733a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m12348b(hxs0 hxs0Var) {
        this.f9738f = hxs0Var;
        if (this.f9736d) {
            hxs0Var.f109921a.m12351c(this.f9735c);
        }
    }

    @Nullable
    public gjx getMediaContent() {
        return this.f9733a;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f9736d = true;
        this.f9735c = scaleType;
        hxs0 hxs0Var = this.f9738f;
        if (hxs0Var != null) {
            hxs0Var.f109921a.m12351c(scaleType);
        }
    }

    public void setMediaContent(@Nullable gjx gjxVar) {
        boolean zMo184270H;
        this.f9734b = true;
        this.f9733a = gjxVar;
        lzr0 lzr0Var = this.f9737e;
        if (lzr0Var != null) {
            lzr0Var.f130673a.m12350b(gjxVar);
        }
        if (gjxVar == null) {
            return;
        }
        try {
            vcs0 vcs0VarZza = gjxVar.zza();
            if (vcs0VarZza != null) {
                if (!gjxVar.mo120409a()) {
                    if (gjxVar.zzb()) {
                        zMo184270H = vcs0VarZza.mo184270H(s050.m181848Y2(this));
                    }
                    removeAllViews();
                }
                zMo184270H = vcs0VarZza.mo184274o0(s050.m181848Y2(this));
                if (zMo184270H) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            x2t0.m206867e("", e);
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
