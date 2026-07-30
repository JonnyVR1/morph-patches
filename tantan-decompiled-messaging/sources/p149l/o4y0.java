package p149l;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o4y0 {

    /* JADX INFO: renamed from: a */
    public Bundle f141827a = new Bundle();

    /* JADX INFO: renamed from: b */
    public List f141828b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f141829c = false;

    /* JADX INFO: renamed from: d */
    public int f141830d = -1;

    /* JADX INFO: renamed from: e */
    public final Bundle f141831e = new Bundle();

    /* JADX INFO: renamed from: f */
    public final Bundle f141832f = new Bundle();

    /* JADX INFO: renamed from: g */
    public final List f141833g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f141834h = -1;

    /* JADX INFO: renamed from: i */
    public String f141835i = null;

    /* JADX INFO: renamed from: j */
    public final List f141836j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f141837k = HuiYanResultSender.TIMEOUT_MS;

    /* JADX INFO: renamed from: l */
    public final int f141838l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* JADX INFO: renamed from: a */
    public final zzl m162735a() {
        Bundle bundle = this.f141831e;
        Bundle bundle2 = this.f141827a;
        Bundle bundle3 = this.f141832f;
        return new zzl(8, -1L, bundle2, -1, this.f141828b, this.f141829c, this.f141830d, false, null, null, null, null, bundle, bundle3, this.f141833g, null, null, false, null, this.f141834h, this.f141835i, this.f141836j, this.f141837k, null, this.f141838l);
    }

    /* JADX INFO: renamed from: b */
    public final o4y0 m162736b(Bundle bundle) {
        this.f141827a = bundle;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final o4y0 m162737c(int i) {
        this.f141837k = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final o4y0 m162738d(boolean z) {
        this.f141829c = z;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final o4y0 m162739e(List list) {
        this.f141828b = list;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final o4y0 m162740f(String str) {
        this.f141835i = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final o4y0 m162741g(int i) {
        this.f141830d = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final o4y0 m162742h(int i) {
        this.f141834h = i;
        return this;
    }
}
