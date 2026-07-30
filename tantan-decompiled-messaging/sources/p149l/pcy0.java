package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C2461j;

/* JADX INFO: loaded from: classes6.dex */
public final class pcy0 implements ydy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2461j f148243a;

    public pcy0(C2461j c2461j) {
        this.f148243a = c2461j;
    }

    @Override // p149l.ydy0
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2461j c2461j = this.f148243a;
        if (!zIsEmpty) {
            c2461j.zzl().m146305w(new vcy0(this, str, str2, bundle));
        } else if (c2461j.f10530l != null) {
            this.f148243a.f10530l.zzj().m211412A().m123937b("AppId not known when logging event", str2);
        }
    }
}
