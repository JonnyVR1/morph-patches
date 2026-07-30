package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class iuv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f116986a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f116987b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f116988c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f116989d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Long f116990e;

    public iuv0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l2) {
        this.f116986a = str;
        this.f116987b = str2;
        this.f116988c = str3;
        this.f116989d = str4;
        this.f116990e = l2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        b8w0.m103040c(bundle, "gmp_app_id", this.f116986a);
        b8w0.m103040c(bundle, "fbs_aiid", this.f116987b);
        b8w0.m103040c(bundle, "fbs_aeid", this.f116988c);
        b8w0.m103040c(bundle, "apm_id_origin", this.f116989d);
        Long l2 = this.f116990e;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }
}
