package p153l;

import com.google.android.gms.internal.measurement.zzcj;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class uft0 implements dht0 {
    @Override // p153l.dht0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String mo115812a(String str, bmt0 bmt0Var) {
        return mo115815d(str, bmt0Var, zzcj.RAW_FILE_IO_TYPE);
    }

    @Override // p153l.dht0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String mo115813b(File file, String str) {
        return mo115814c(file, str, bmt0.f77405a);
    }

    @Override // p153l.dht0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo115814c(File file, String str, bmt0 bmt0Var) {
        return mo115812a(new File(file, str).getPath(), bmt0Var);
    }

    @Override // p153l.dht0
    public final /* synthetic */ String zza(String str) {
        return mo115812a(str, bmt0.f77405a);
    }

    @Override // p153l.dht0
    /* JADX INFO: renamed from: d */
    public final String mo115815d(String str, bmt0 bmt0Var, zzcj zzcjVar) {
        return str;
    }
}
