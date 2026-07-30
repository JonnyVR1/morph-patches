package p153l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class yxr0 implements bxr0 {

    /* JADX INFO: renamed from: a */
    public File f202005a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f202006b;

    public yxr0(Context context) {
        this.f202006b = context;
    }

    @Override // p153l.bxr0
    public final File zza() {
        if (this.f202005a == null) {
            this.f202005a = new File(this.f202006b.getCacheDir(), "volley");
        }
        return this.f202005a;
    }
}
