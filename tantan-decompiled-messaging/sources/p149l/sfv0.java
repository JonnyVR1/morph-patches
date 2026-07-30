package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class sfv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final String f164344a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final int f164345b;

    public sfv0(@Nullable String str, int i) {
        this.f164344a = str;
        this.f164345b = i;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f164344a) || this.f164345b == -1) {
            return;
        }
        Bundle bundleM200674a = vyv0.m200674a(bundle, "pii");
        bundle.putBundle("pii", bundleM200674a);
        bundleM200674a.putString("pvid", this.f164344a);
        bundleM200674a.putInt("pvid_s", this.f164345b);
    }
}
