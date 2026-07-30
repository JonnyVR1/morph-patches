package p149l;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class k2x0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final h3x0 f120777a;

    /* JADX INFO: renamed from: b */
    public final int f120778b;

    /* JADX INFO: renamed from: c */
    public final Throwable f120779c;

    /* JADX INFO: renamed from: d */
    public final byte[] f120780d;

    /* JADX INFO: renamed from: e */
    public final String f120781e;

    /* JADX INFO: renamed from: f */
    public final Map<String, List<String>> f120782f;

    public k2x0(String str, h3x0 h3x0Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.checkNotNull(h3x0Var);
        this.f120777a = h3x0Var;
        this.f120778b = i;
        this.f120779c = th;
        this.f120780d = bArr;
        this.f120781e = str;
        this.f120782f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f120777a.mo95704a(this.f120781e, this.f120778b, this.f120779c, this.f120780d, this.f120782f);
    }
}
