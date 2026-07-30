package p153l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class mzm extends y4e {

    /* JADX INFO: renamed from: l.mzm$a */
    public class C18749a implements y4e.InterfaceC21513a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f139533a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f139534b;

        public C18749a(Context context, String str) {
            this.f139533a = context;
            this.f139534b = str;
        }

        @Override // p153l.y4e.InterfaceC21513a
        public File getCacheDirectory() {
            File cacheDir = this.f139533a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f139534b != null ? new File(cacheDir, this.f139534b) : cacheDir;
        }
    }

    public mzm(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public mzm(Context context, String str, long j) {
        super(new C18749a(context, str), j);
    }
}
