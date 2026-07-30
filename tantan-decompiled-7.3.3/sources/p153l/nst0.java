package p153l;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class nst0 extends qsy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseImplementation.ResultHolder f143541a;

    public nst0(BaseImplementation.ResultHolder resultHolder) {
        this.f143541a = resultHolder;
    }

    @Override // p153l.vuy0
    /* JADX INFO: renamed from: N0 */
    public final void mo126981N0(LocationSettingsResult locationSettingsResult) {
        this.f143541a.setResult(locationSettingsResult);
    }
}
