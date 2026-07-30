package p149l;

import com.google.android.gms.measurement.internal.C2461j;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dby0 implements h3x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f85349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f85350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2461j f85351c;

    public dby0(C2461j c2461j, String str, List list) {
        this.f85349a = str;
        this.f85350b = list;
        this.f85351c = c2461j;
    }

    @Override // p149l.h3x0
    /* JADX INFO: renamed from: a */
    public final void mo95704a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f85351c.m15263G(true, i, th, bArr, this.f85349a, this.f85350b);
    }
}
