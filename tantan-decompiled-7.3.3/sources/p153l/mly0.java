package p153l;

import com.google.android.gms.measurement.internal.C2484j;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mly0 implements ncx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f137456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f137457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2484j f137458c;

    public mly0(C2484j c2484j, String str, List list) {
        this.f137456a = str;
        this.f137457b = list;
        this.f137458c = c2484j;
    }

    @Override // p153l.ncx0
    /* JADX INFO: renamed from: a */
    public final void mo130610a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f137458c.m15317G(true, i, th, bArr, this.f137456a, this.f137457b);
    }
}
