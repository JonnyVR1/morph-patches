package p002l;

import androidx.annotation.NonNull;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.gift.GiftSDKPreferences;
import com.momo.xeengine.gift.IResourceDownloader;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.djt;
import l.gkh0;
import l.u0t;
import l.v0t;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oij {

    /* JADX INFO: renamed from: l.oij$a */
    public class C0723a implements IResourceDownloader {

        /* JADX INFO: renamed from: l.oij$a$a */
        public class a extends i7e {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IResourceDownloader.Callback f16627a;

            public a(IResourceDownloader.Callback callback) {
                this.f16627a = callback;
            }

            @Override // p002l.i7e, p002l.h7e
            /* JADX INFO: renamed from: a */
            public void mo7819a(@NonNull File file) {
                super.mo7819a(file);
                this.f16627a.onComplete(true, file.getAbsolutePath());
            }

            @Override // p002l.i7e, p002l.h7e
            public void onFailed(@NonNull String str) {
                super.onFailed(str);
                this.f16627a.onComplete(false, "");
            }
        }

        public void downloadResourceWithURL(String str, IResourceDownloader.Callback callback) {
            m7s.m17729B().m17758z(new q7e.C0782a(str, oij.m19546a(str)).m21055i(Priority.get("IMMEDIATE")).m21047a(), new a(callback));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m19546a(String str) {
        File file = new File(voe.m24084b(), "xeEffect" + File.separator + v0t.e(str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static void m19547b() {
        XEnginePreferences.setApplicationContext(App.e);
        GiftSDKPreferences.getInstance().setDownloader(new C0723a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19548c() {
        return djt.E();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19549d() {
        XEnginePreferences.setApplicationContext(App.e);
        boolean zE = djt.E();
        if (zE) {
            boolean zLoadEngineSO = XEngineSOManager.loadEngineSO();
            String str = "gameutil prepare  xeInit=" + zLoadEngineSO;
            gkh0.j(u0t.d, str);
            if (!zLoadEngineSO) {
                CrashHelper.c(new RuntimeException(str));
            }
        } else {
            gkh0.j(u0t.d, "normalAudienceSoLoaded unloaded");
        }
        return !zE;
    }

    /* JADX INFO: renamed from: e */
    public static void m19550e() {
        if (m19548c()) {
            return;
        }
        djt.D();
    }
}
