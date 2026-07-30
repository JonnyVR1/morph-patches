package p149l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class fpg0 {

    /* JADX INFO: renamed from: a */
    public final k850 f98696a;

    public fpg0(Context context) {
        StringBuilder sb = slq0.f165256a;
        File file = new File(context.getApplicationContext().getCacheDir(), "sud-picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        k850 k850VarM144882c = new k850.C17954b().m144883d(new uw3(file, slq0.m184846c(file))).m144889j(new zrg0("PicassoIpv4PreferredDns")).m144882c();
        this.f98696a = k850VarM144882c;
        k850VarM144882c.m144851c();
    }
}
