package p149l;

import com.google.android.gms.internal.measurement.zzcj;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class o6t0 implements x7t0 {
    @Override // p149l.x7t0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String mo162944a(String str, vct0 vct0Var) {
        return mo162947d(str, vct0Var, zzcj.RAW_FILE_IO_TYPE);
    }

    @Override // p149l.x7t0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String mo162945b(File file, String str) {
        return mo162946c(file, str, vct0.f180985a);
    }

    @Override // p149l.x7t0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo162946c(File file, String str, vct0 vct0Var) {
        return mo162944a(new File(file, str).getPath(), vct0Var);
    }

    @Override // p149l.x7t0
    public final /* synthetic */ String zza(String str) {
        return mo162944a(str, vct0.f180985a);
    }

    @Override // p149l.x7t0
    /* JADX INFO: renamed from: d */
    public final String mo162947d(String str, vct0 vct0Var, zzcj zzcjVar) {
        return str;
    }
}
