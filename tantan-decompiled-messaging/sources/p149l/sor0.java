package p149l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class sor0 implements vnr0 {

    /* JADX INFO: renamed from: a */
    public File f165719a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f165720b;

    public sor0(Context context) {
        this.f165720b = context;
    }

    @Override // p149l.vnr0
    public final File zza() {
        if (this.f165719a == null) {
            this.f165719a = new File(this.f165720b.getCacheDir(), "volley");
        }
        return this.f165719a;
    }
}
