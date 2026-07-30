package p006l;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.WebOfflineData;
import com.p1.mobile.putong.data.WebPageOfflineConfig;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.f30;
import l.mkd0;
import l.rhi;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lip0 {

    /* JADX INFO: renamed from: e */
    public static final String f16431e;

    /* JADX INFO: renamed from: a */
    public boolean f16432a;

    /* JADX INFO: renamed from: b */
    public boolean f16433b;

    /* JADX INFO: renamed from: c */
    public boolean f16434c;

    /* JADX INFO: renamed from: d */
    public Map<String, WebPageOfflineConfig> f16435d;

    /* JADX INFO: renamed from: l.lip0$a */
    public static class C0978a {

        /* JADX INFO: renamed from: a */
        public static lip0 f16436a = new lip0();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(mu5.f17266o);
        sb.append("/commerce/offlineconfig_");
        sb.append(TextUtils.equals(mu5.m19510c(), "tantanapp") ? "release" : "debug");
        sb.append(".json");
        f16431e = sb.toString();
    }

    public lip0() {
        this.f16435d = new HashMap();
    }

    /* JADX INFO: renamed from: i */
    public static lip0 m18785i() {
        return C0978a.f16436a;
    }

    /* JADX INFO: renamed from: g */
    public final void m18786g(Context context, String str) {
        File file = new File(nip0.m20149g(context, str));
        if (file.exists()) {
            rhi.k(file);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18787h(final Context context, final String str, final String str2) {
        final Uri uri = Uri.parse(str2);
        a.u().o(new DownloadTask.b(qib0.f19784H.getDownloadHttp()).q(str2).o(nip0.m20146d(context, uri.getLastPathSegment())).i(new e30() { // from class: l.iip0
            public final void call(Object obj) {
                this.f14494a.m18789k(context, str, (DownloadTask) obj);
            }
        }).j(new f30() { // from class: l.jip0
            public final void call(Object obj, Object obj2) {
                this.f15167a.m18790l(str2, context, str, (DownloadTask) obj, (File) obj2);
            }
        }).f(new f30() { // from class: l.kip0
            public final void call(Object obj, Object obj2) {
                this.f15846a.m18791m(context, str, uri, (DownloadTask) obj, (Throwable) obj2);
            }
        }).a());
    }

    /* JADX INFO: renamed from: j */
    public String m18788j(Context context, String str) {
        WebPageOfflineConfig webPageOfflineConfig = this.f16435d.get(str);
        if (NullChecker.a(webPageOfflineConfig)) {
            return nip0.m20152j(context, webPageOfflineConfig) ? nip0.m20148f(context, webPageOfflineConfig) : webPageOfflineConfig.url;
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m18789k(Context context, String str, DownloadTask downloadTask) {
        File file = new File(nip0.m20145c(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        m18786g(context, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m18790l(String str, Context context, String str2, DownloadTask downloadTask, File file) {
        try {
            rhi.g(file, new File(nip0.m20143a(context)));
        } catch (Exception e) {
            m18786g(context, str2);
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m18791m(Context context, String str, Uri uri, DownloadTask downloadTask, Throwable th) {
        m18786g(context, str);
        File file = new File(nip0.m20146d(context, uri.getLastPathSegment()));
        if (file.exists()) {
            rhi.m(file.getPath());
        }
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m18792n(Throwable th) {
        this.f16434c = false;
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: o */
    public boolean m18793o() {
        return (!this.f16432a || this.f16433b || this.f16434c) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m18794p(WebOfflineData webOfflineData) {
        this.f16433b = true;
        this.f16434c = false;
        for (WebPageOfflineConfig webPageOfflineConfig : webOfflineData.pages) {
            this.f16435d.put(webPageOfflineConfig.pageId, webPageOfflineConfig);
        }
        for (String str : webOfflineData.zips.keySet()) {
            String str2 = (String) webOfflineData.zips.get(str);
            String lastPathSegment = Uri.parse(str2).getLastPathSegment();
            Application application = App.e;
            if (!nip0.m20151i(application, lastPathSegment)) {
                m18787h(application, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m18795q() {
        if (this.f16434c || this.f16433b) {
            return;
        }
        this.f16432a = true;
        this.f16434c = true;
        qib0.f19785I.now("webPage/offlineCache", ia20.m16572f(new v9j() { // from class: l.fip0
            public final Object call() {
                return xh5.network.auth().q(lip0.f16431e).f().b();
            }
        }, WebOfflineData.JSON_ADAPTER)).subscribe(mkd0.H(new e30() { // from class: l.gip0
            public final void call(Object obj) {
                this.f13334a.m18794p((WebOfflineData) obj);
            }
        }, new e30() { // from class: l.hip0
            public final void call(Object obj) {
                this.f13902a.m18792n((Throwable) obj);
            }
        }));
    }
}
