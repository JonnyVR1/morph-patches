package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class a7y0 implements eny0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2481g f68862a;

    public a7y0(C2481g c2481g) {
        this.f68862a = c2481g;
    }

    @Override // p153l.eny0
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2481g c2481g = this.f68862a;
        if (zIsEmpty) {
            c2481g.m15240N0("auto", str2, bundle);
        } else {
            c2481g.m15257Z("auto", str2, bundle, str);
        }
    }
}
