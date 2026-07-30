package p153l;

import android.content.Context;
import com.tencent.mmkv.MMKV;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class kmk0 {

    /* JADX INFO: renamed from: a */
    public static final String f127508a = "kmk0";

    /* JADX INFO: renamed from: b */
    public static boolean f127509b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f127510c = false;

    /* JADX INFO: renamed from: l.kmk0$a */
    public class C18211a implements MMKV.LibLoader {
        @Override // com.tencent.mmkv.MMKV.LibLoader
        public void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m150487a(Context context, boolean z, boolean z2) {
        k26.m147944b(context);
        kzv.m152233a(z2);
        f127509b = z;
        f127510c = z2;
        rw0.m183334a(k26.m147943a());
        if (uc60.m195380c().equals(context.getPackageName())) {
            File file = new File(context.getFilesDir().getParent(), hxd0.MMKV_DIR);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!file.exists()) {
                File file2 = new File(context.getFilesDir().getParent(), "tantan_save_value_dir_tmp");
                oki.m168015c(new File(context.getFilesDir().getAbsolutePath() + File.separator + "mmkv").getAbsolutePath(), file2.getAbsolutePath());
                boolean zRenameTo = new File(file2, "mmkv").renameTo(file);
                tu2.m192703a(f127508a, "copy to tantan_save_value_dir renameTo =" + zRenameTo);
            }
            tu2.m192703a(f127508a, "copy to tantan_save_value_dir cost =" + (System.currentTimeMillis() - jCurrentTimeMillis));
            MMKV.initialize(new File(context.getFilesDir().getParent(), hxd0.MMKV_DIR).getAbsolutePath(), new C18211a());
        }
    }
}
