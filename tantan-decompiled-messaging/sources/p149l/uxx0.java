package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class uxx0 implements ydy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2458g f178781a;

    public uxx0(C2458g c2458g) {
        this.f178781a = c2458g;
    }

    @Override // p149l.ydy0
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2458g c2458g = this.f178781a;
        if (zIsEmpty) {
            c2458g.m15186N0("auto", str2, bundle);
        } else {
            c2458g.m15203Z("auto", str2, bundle, str);
        }
    }
}
