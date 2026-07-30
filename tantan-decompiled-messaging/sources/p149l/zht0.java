package p149l;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class zht0 extends kjy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f203233a;

    public zht0(sei0 sei0Var) {
        this.f203233a = sei0Var;
    }

    @Override // p149l.ply0
    /* JADX INFO: renamed from: N0 */
    public final void mo131406N0(LocationSettingsResult locationSettingsResult) {
        TaskUtil.setResultOrApiException(locationSettingsResult.getStatus(), new LocationSettingsResponse(locationSettingsResult), this.f203233a);
    }
}
