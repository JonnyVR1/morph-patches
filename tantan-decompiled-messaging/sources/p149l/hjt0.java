package p149l;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class hjt0 extends kjy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseImplementation.ResultHolder f108119a;

    public hjt0(BaseImplementation.ResultHolder resultHolder) {
        this.f108119a = resultHolder;
    }

    @Override // p149l.ply0
    /* JADX INFO: renamed from: N0 */
    public final void mo131406N0(LocationSettingsResult locationSettingsResult) {
        this.f108119a.setResult(locationSettingsResult);
    }
}
