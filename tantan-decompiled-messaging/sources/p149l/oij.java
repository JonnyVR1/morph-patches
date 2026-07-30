package p149l;

import androidx.annotation.NonNull;
import com.momo.xeengine.XEnginePreferences;
import com.momo.xeengine.gift.GiftSDKPreferences;
import com.momo.xeengine.gift.IResourceDownloader;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class oij {

    /* JADX INFO: renamed from: l.oij$a */
    public class C18949a implements IResourceDownloader {

        /* JADX INFO: renamed from: l.oij$a$a */
        public class a extends i7e {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IResourceDownloader.Callback f144135a;

            public a(IResourceDownloader.Callback callback) {
                this.f144135a = callback;
            }

            @Override // p149l.i7e, p149l.h7e
            /* JADX INFO: renamed from: a */
            public void mo74248a(@NonNull File file) {
                super.mo74248a(file);
                this.f144135a.onComplete(true, file.getAbsolutePath());
            }

            @Override // p149l.i7e, p149l.h7e
            public void onFailed(@NonNull String str) {
                super.onFailed(str);
                this.f144135a.onComplete(false, "");
            }
        }

        @Override // com.momo.xeengine.gift.IResourceDownloader
        public void downloadResourceWithURL(String str, IResourceDownloader.Callback callback) {
            m7s.m153386B().m153415z(new q7e.C19441a(str, oij.m164525a(str)).m173256i(Priority.get("IMMEDIATE")).m173248a(), new a(callback));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m164525a(String str) {
        File file = new File(voe.m199164b(), "xeEffect" + File.separator + v0t.m196511e(str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static void m164526b() {
        XEnginePreferences.setApplicationContext(App.f15369e);
        GiftSDKPreferences.getInstance().setDownloader(new C18949a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m164527c() {
        return djt.m112116E();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m164528d() {
        XEnginePreferences.setApplicationContext(App.f15369e);
        boolean zM112116E = djt.m112116E();
        if (zM112116E) {
            boolean zLoadEngineSO = XEngineSOManager.loadEngineSO();
            String str = "gameutil prepare  xeInit=" + zLoadEngineSO;
            gkh0.m126627j(u0t.f172945d, str);
            if (!zLoadEngineSO) {
                CrashHelper.m81296c(new RuntimeException(str));
            }
        } else {
            gkh0.m126627j(u0t.f172945d, "normalAudienceSoLoaded unloaded");
        }
        return !zM112116E;
    }

    /* JADX INFO: renamed from: e */
    public static void m164529e() {
        if (m164527c()) {
            return;
        }
        djt.m112115D();
    }
}
