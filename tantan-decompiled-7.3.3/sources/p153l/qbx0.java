package p153l;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class qbx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ncx0 f156516a;

    /* JADX INFO: renamed from: b */
    public final int f156517b;

    /* JADX INFO: renamed from: c */
    public final Throwable f156518c;

    /* JADX INFO: renamed from: d */
    public final byte[] f156519d;

    /* JADX INFO: renamed from: e */
    public final String f156520e;

    /* JADX INFO: renamed from: f */
    public final Map<String, List<String>> f156521f;

    public qbx0(String str, ncx0 ncx0Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.checkNotNull(ncx0Var);
        this.f156516a = ncx0Var;
        this.f156517b = i;
        this.f156518c = th;
        this.f156519d = bArr;
        this.f156520e = str;
        this.f156521f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f156516a.mo130610a(this.f156520e, this.f156517b, this.f156518c, this.f156519d, this.f156521f);
    }
}
