package p006l;

import android.os.Build;
import com.google.gson.Gson;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;
import l.u660;
import l.x8i0;
import l.zbc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t660 {
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24480a() {
        boolean z;
        int i = 10;
        try {
            r660 r660Var = (r660) new Gson().fromJson(RemoteConfig.x().F("pageLodStatisConfig"), r660.class);
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
                    u660.e().j(!z && zbc0.a(0, i) == 0);
                }
            }
            z = true;
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        u660.e().j(!z && zbc0.a(0, i) == 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m24481b() {
        boolean z = true;
        try {
            r660 r660Var = (r660) new Gson().fromJson(RemoteConfig.x().F("pageLodStatisConfig"), r660.class);
            if (r660Var != null) {
                z = r660Var.fragSts;
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        u660.e().i(z);
    }

    /* JADX INFO: renamed from: c */
    public static void m24482c() {
        x8i0.a(new Runnable() { // from class: l.s660
            @Override // java.lang.Runnable
            public final void run() {
                t660.m24480a();
            }
        });
    }
}
