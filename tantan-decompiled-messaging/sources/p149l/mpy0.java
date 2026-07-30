package p149l;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;

/* JADX INFO: loaded from: classes6.dex */
public final class mpy0 extends BinderC2073b {
    public mpy0(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.BinderC2073b, p149l.lss0
    /* JADX INFO: renamed from: z5 */
    public final void mo12280z5(@Nullable Bundle bundle) {
        xsu0.m210834k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f9704v = 4;
        this.f9683a.finish();
    }
}
