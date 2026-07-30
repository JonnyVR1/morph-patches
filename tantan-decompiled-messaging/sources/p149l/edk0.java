package p149l;

import android.content.Context;
import com.tencent.mmkv.MMKV;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class edk0 {

    /* JADX INFO: renamed from: a */
    public static final String f90611a = "edk0";

    /* JADX INFO: renamed from: b */
    public static boolean f90612b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f90613c = false;

    /* JADX INFO: renamed from: l.edk0$a */
    public class C16579a implements MMKV.LibLoader {
        @Override // com.tencent.mmkv.MMKV.LibLoader
        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m115811a(Context context, boolean z, boolean z2) {
        f16.m119093b(context);
        nxv.m161954a(z2);
        f90612b = z;
        f90613c = z2;
        kw0.m147407a(f16.m119092a());
        if (o460.m162550c().equals(context.getPackageName())) {
            File file = new File(context.getFilesDir().getParent(), fpd0.MMKV_DIR);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!file.exists()) {
                File file2 = new File(context.getFilesDir().getParent(), "tantan_save_value_dir_tmp");
                rhi.m179359c(new File(context.getFilesDir().getAbsolutePath() + File.separator + "mmkv").getAbsolutePath(), file2.getAbsolutePath());
                boolean zRenameTo = new File(file2, "mmkv").renameTo(file);
                du2.m113670a(f90611a, "copy to tantan_save_value_dir renameTo =" + zRenameTo);
            }
            du2.m113670a(f90611a, "copy to tantan_save_value_dir cost =" + (System.currentTimeMillis() - jCurrentTimeMillis));
            MMKV.initialize(new File(context.getFilesDir().getParent(), fpd0.MMKV_DIR).getAbsolutePath(), new C16579a());
        }
    }
}
