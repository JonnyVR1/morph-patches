package p149l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class mxm extends k3e {

    /* JADX INFO: renamed from: l.mxm$a */
    public class C18585a implements k3e.InterfaceC17919a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f136184a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f136185b;

        public C18585a(Context context, String str) {
            this.f136184a = context;
            this.f136185b = str;
        }

        @Override // p149l.k3e.InterfaceC17919a
        public File getCacheDirectory() {
            File cacheDir = this.f136184a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f136185b != null ? new File(cacheDir, this.f136185b) : cacheDir;
        }
    }

    public mxm(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public mxm(Context context, String str, long j) {
        super(new C18585a(context, str), j);
    }
}
