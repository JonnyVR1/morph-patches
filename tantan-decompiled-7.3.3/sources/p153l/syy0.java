package p153l;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;

/* JADX INFO: loaded from: classes6.dex */
public final class syy0 extends BinderC2096b {
    public syy0(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.BinderC2096b, p153l.r1t0
    /* JADX INFO: renamed from: z5 */
    public final void mo12334z5(@Nullable Bundle bundle) {
        d2v0.m113737k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f9741v = 4;
        this.f9720a.finish();
    }
}
