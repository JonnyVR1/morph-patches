package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C2484j;

/* JADX INFO: loaded from: classes6.dex */
public final class vly0 implements eny0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2484j f184652a;

    public vly0(C2484j c2484j) {
        this.f184652a = c2484j;
    }

    @Override // p153l.eny0
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2484j c2484j = this.f184652a;
        if (!zIsEmpty) {
            c2484j.zzl().m177841w(new bmy0(this, str, str2, bundle));
        } else if (c2484j.f10567l != null) {
            this.f184652a.f10567l.zzj().m114558A().m153301b("AppId not known when logging event", str2);
        }
    }
}
