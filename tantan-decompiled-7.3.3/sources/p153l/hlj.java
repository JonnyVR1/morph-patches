package p153l;

import androidx.annotation.NonNull;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.gift.GiftSDKPreferences;
import com.momo.xeengine.gift.IResourceDownloader;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class hlj {

    /* JADX INFO: renamed from: l.hlj$a */
    public class C17493a implements IResourceDownloader {

        /* JADX INFO: renamed from: l.hlj$a$a */
        public class a extends x8e {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IResourceDownloader.Callback f110513a;

            public a(IResourceDownloader.Callback callback) {
                this.f110513a = callback;
            }

            @Override // p153l.x8e, p153l.w8e
            /* JADX INFO: renamed from: a */
            public void mo75431a(@NonNull File file) {
                super.mo75431a(file);
                this.f110513a.onComplete(true, file.getAbsolutePath());
            }

            @Override // p153l.x8e, p153l.w8e
            public void onFailed(@NonNull String str) {
                super.onFailed(str);
                this.f110513a.onComplete(false, "");
            }
        }

        @Override // com.momo.xeengine.gift.IResourceDownloader
        public void downloadResourceWithURL(String str, IResourceDownloader.Callback callback) {
            n9s.m162004B().m162033z(new f9e.C16927a(str, hlj.m135752a(str)).m124655i(Priority.get("IMMEDIATE")).m124647a(), new a(callback));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m135752a(String str) {
        File file = new File(zpe.m220835b(), "xeEffect" + File.separator + w2t.m204590e(str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static void m135753b() {
        XEnginePreferences.setApplicationContext(App.f16088e);
        GiftSDKPreferences.getInstance().setDownloader(new C17493a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m135754c() {
        return elt.m121261E();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m135755d() {
        XEnginePreferences.setApplicationContext(App.f16088e);
        boolean zM121261E = elt.m121261E();
        if (zM121261E) {
            boolean zLoadEngineSO = XEngineSOManager.loadEngineSO();
            String str = "gameutil prepare  xeInit=" + zLoadEngineSO;
            nsh0.m164608j(v2t.f182114d, str);
            if (!zLoadEngineSO) {
                CrashHelper.m82479c(new RuntimeException(str));
            }
        } else {
            nsh0.m164608j(v2t.f182114d, "normalAudienceSoLoaded unloaded");
        }
        return !zM121261E;
    }

    /* JADX INFO: renamed from: e */
    public static void m135756e() {
        if (m135754c()) {
            return;
        }
        elt.m121260D();
    }
}
