package p153l;

import android.os.Build;
import com.google.gson.Gson;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ze60 {
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m219402a() {
        boolean z;
        int i = 10;
        try {
            xe60 xe60Var = (xe60) new Gson().fromJson(RemoteConfig.m80481x().m80485F("pageLodStatisConfig"), xe60.class);
            if (xe60Var != null) {
                List<String> list = xe60Var.brands;
                int i2 = xe60Var.density;
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
                    af60.m97310e().m97319j(!z && gkc0.m130573a(0, i) == 0);
                }
            }
            z = true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        af60.m97310e().m97319j(!z && gkc0.m130573a(0, i) == 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m219403b() {
        boolean z = true;
        try {
            xe60 xe60Var = (xe60) new Gson().fromJson(RemoteConfig.m80481x().m80485F("pageLodStatisConfig"), xe60.class);
            if (xe60Var != null) {
                z = xe60Var.fragSts;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        af60.m97310e().m97318i(z);
    }

    /* JADX INFO: renamed from: c */
    public static void m219404c() {
        xhi0.m211045a(new Runnable() { // from class: l.ye60
            @Override // java.lang.Runnable
            public final void run() {
                ze60.m219402a();
            }
        });
    }
}
