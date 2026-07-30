package p153l;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes6.dex */
public final class l4z0 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l5z0 f130031a;

    public l4z0(m4z0 m4z0Var, l5z0 l5z0Var) {
        this.f130031a = l5z0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f130031a.m153044v();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f130031a.m153044v();
    }
}
