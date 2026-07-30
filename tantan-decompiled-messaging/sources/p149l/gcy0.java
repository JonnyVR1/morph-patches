package p149l;

import com.google.android.gms.measurement.internal.C2461j;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gcy0 implements h3x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f102060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f102061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2461j f102062c;

    public gcy0(C2461j c2461j, String str, List list) {
        this.f102060a = str;
        this.f102061b = list;
        this.f102062c = c2461j;
    }

    @Override // p149l.h3x0
    /* JADX INFO: renamed from: a */
    public final void mo95704a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f102062c.m15263G(true, i, th, bArr, this.f102060a, this.f102061b);
    }
}
