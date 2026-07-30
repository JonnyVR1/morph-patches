package p149l;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes6.dex */
public final class fvy0 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fwy0 f99486a;

    public fvy0(gvy0 gvy0Var, fwy0 fwy0Var) {
        this.f99486a = fwy0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f99486a.m123595v();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f99486a.m123595v();
    }
}
