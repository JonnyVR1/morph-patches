package p153l;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class frt0 extends qsy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f100476a;

    public frt0(sni0 sni0Var) {
        this.f100476a = sni0Var;
    }

    @Override // p153l.vuy0
    /* JADX INFO: renamed from: N0 */
    public final void mo126981N0(LocationSettingsResult locationSettingsResult) {
        TaskUtil.setResultOrApiException(locationSettingsResult.getStatus(), new LocationSettingsResponse(locationSettingsResult), this.f100476a);
    }
}
