package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class clv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f81471a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f81472b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f81473c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f81474d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Long f81475e;

    public clv0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l2) {
        this.f81471a = str;
        this.f81472b = str2;
        this.f81473c = str3;
        this.f81474d = str4;
        this.f81475e = l2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        vyv0.m200676c(bundle, "gmp_app_id", this.f81471a);
        vyv0.m200676c(bundle, "fbs_aiid", this.f81472b);
        vyv0.m200676c(bundle, "fbs_aeid", this.f81473c);
        vyv0.m200676c(bundle, "apm_id_origin", this.f81474d);
        Long l2 = this.f81475e;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }
}
