package p149l;

import android.os.Build;
import com.google.gson.Gson;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class t660 {
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m187359a() {
        boolean z;
        int i = 10;
        try {
            r660 r660Var = (r660) new Gson().fromJson(RemoteConfig.m79298x().m79302F("pageLodStatisConfig"), r660.class);
            if (r660Var != null) {
                List<String> list = r660Var.brands;
                int i2 = r660Var.density;
                if (i2 > 0) {
                    i = i2;
                }
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!"all".equals(next) && !Build.BRAND.toLowerCase().equals(next.toLowerCase())) {
                        }
                    }
                    z = false;
                    u660.m191956e().m191965j(!z && zbc0.m217835a(0, i) == 0);
                }
            }
            z = true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        u660.m191956e().m191965j(!z && zbc0.m217835a(0, i) == 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m187360b() {
        boolean z = true;
        try {
            r660 r660Var = (r660) new Gson().fromJson(RemoteConfig.m79298x().m79302F("pageLodStatisConfig"), r660.class);
            if (r660Var != null) {
                z = r660Var.fragSts;
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        u660.m191956e().m191964i(z);
    }

    /* JADX INFO: renamed from: c */
    public static void m187361c() {
        x8i0.m207417a(new Runnable() { // from class: l.s660
            @Override // java.lang.Runnable
            public final void run() {
                t660.m187359a();
            }
        });
    }
}
