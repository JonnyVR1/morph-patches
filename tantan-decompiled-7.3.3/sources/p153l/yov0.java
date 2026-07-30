package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class yov0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final String f201019a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final int f201020b;

    public yov0(@Nullable String str, int i) {
        this.f201019a = str;
        this.f201020b = i;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f201019a) || this.f201020b == -1) {
            return;
        }
        Bundle bundleM103038a = b8w0.m103038a(bundle, "pii");
        bundle.putBundle("pii", bundleM103038a);
        bundleM103038a.putString("pvid", this.f201019a);
        bundleM103038a.putInt("pvid_s", this.f201020b);
    }
}
