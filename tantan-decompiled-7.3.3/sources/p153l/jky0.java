package p153l;

import com.google.android.gms.measurement.internal.C2484j;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jky0 implements ncx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f121455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f121456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2484j f121457c;

    public jky0(C2484j c2484j, String str, List list) {
        this.f121455a = str;
        this.f121456b = list;
        this.f121457c = c2484j;
    }

    @Override // p153l.ncx0
    /* JADX INFO: renamed from: a */
    public final void mo130610a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f121457c.m15317G(true, i, th, bArr, this.f121455a, this.f121456b);
    }
}
