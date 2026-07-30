package p149l;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.WebOfflineData;
import com.p046p1.mobile.putong.data.WebPageOfflineConfig;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p069ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class lip0 {

    /* JADX INFO: renamed from: e */
    public static final String f128238e;

    /* JADX INFO: renamed from: a */
    public boolean f128239a;

    /* JADX INFO: renamed from: b */
    public boolean f128240b;

    /* JADX INFO: renamed from: c */
    public boolean f128241c;

    /* JADX INFO: renamed from: d */
    public Map<String, WebPageOfflineConfig> f128242d;

    /* JADX INFO: renamed from: l.lip0$a */
    public static class C18229a {

        /* JADX INFO: renamed from: a */
        public static lip0 f128243a = new lip0();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(mu5.f135747o);
        sb.append("/commerce/offlineconfig_");
        sb.append(TextUtils.equals(mu5.m156378c(), "tantanapp") ? "release" : BuildConfig.BUILD_TYPE);
        sb.append(".json");
        f128238e = sb.toString();
    }

    public lip0() {
        this.f128242d = new HashMap();
    }

    /* JADX INFO: renamed from: i */
    public static lip0 m149927i() {
        return C18229a.f128243a;
    }

    /* JADX INFO: renamed from: g */
    public final void m149928g(Context context, String str) {
        File file = new File(nip0.m159548g(context, str));
        if (file.exists()) {
            rhi.m179367k(file);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m149929h(final Context context, final String str, final String str2) {
        final Uri uri = Uri.parse(str2);
        C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str2).m79640o(nip0.m159545d(context, uri.getLastPathSegment())).m79634i(new e30() { // from class: l.iip0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113421a.m149931k(context, str, (DownloadTask) obj);
            }
        }).m79635j(new f30() { // from class: l.jip0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f118123a.m149932l(str2, context, str, (DownloadTask) obj, (File) obj2);
            }
        }).m79631f(new f30() { // from class: l.kip0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f123372a.m149933m(context, str, uri, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a());
    }

    /* JADX INFO: renamed from: j */
    public String m149930j(Context context, String str) {
        WebPageOfflineConfig webPageOfflineConfig = this.f128242d.get(str);
        if (NullChecker.m81303a(webPageOfflineConfig)) {
            return nip0.m159551j(context, webPageOfflineConfig) ? nip0.m159547f(context, webPageOfflineConfig) : webPageOfflineConfig.url;
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m149931k(Context context, String str, DownloadTask downloadTask) {
        File file = new File(nip0.m159544c(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        m149928g(context, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m149932l(String str, Context context, String str2, DownloadTask downloadTask, File file) {
        try {
            rhi.m179363g(file, new File(nip0.m159542a(context)));
        } catch (Exception e) {
            m149928g(context, str2);
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m149933m(Context context, String str, Uri uri, DownloadTask downloadTask, Throwable th) {
        m149928g(context, str);
        File file = new File(nip0.m159545d(context, uri.getLastPathSegment()));
        if (file.exists()) {
            rhi.m179369m(file.getPath());
        }
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m149934n(Throwable th) {
        this.f128241c = false;
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: o */
    public boolean m149935o() {
        return (!this.f128239a || this.f128240b || this.f128241c) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m149936p(WebOfflineData webOfflineData) {
        this.f128240b = true;
        this.f128241c = false;
        for (WebPageOfflineConfig webPageOfflineConfig : webOfflineData.pages) {
            this.f128242d.put(webPageOfflineConfig.pageId, webPageOfflineConfig);
        }
        for (String str : webOfflineData.zips.keySet()) {
            String str2 = webOfflineData.zips.get(str);
            String lastPathSegment = Uri.parse(str2).getLastPathSegment();
            Application application = App.f15369e;
            if (!nip0.m159550i(application, lastPathSegment)) {
                m149929h(application, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m149937q() {
        if (this.f128241c || this.f128240b) {
            return;
        }
        this.f128239a = true;
        this.f128241c = true;
        qib0.f154694I.now("webPage/offlineCache", ia20.m135122f(new v9j() { // from class: l.fip0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(lip0.f128238e).m185887f().m185883b();
            }
        }, WebOfflineData.JSON_ADAPTER)).subscribe(mkd0.m154956H(new e30() { // from class: l.gip0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102952a.m149936p((WebOfflineData) obj);
            }
        }, new e30() { // from class: l.hip0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107953a.m149934n((Throwable) obj);
            }
        }));
    }
}
