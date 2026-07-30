package p153l;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.WebOfflineData;
import com.p051p1.mobile.putong.data.WebPageOfflineConfig;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p074ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class prp0 {

    /* JADX INFO: renamed from: e */
    public static final String f153820e;

    /* JADX INFO: renamed from: a */
    public boolean f153821a;

    /* JADX INFO: renamed from: b */
    public boolean f153822b;

    /* JADX INFO: renamed from: c */
    public boolean f153823c;

    /* JADX INFO: renamed from: d */
    public Map<String, WebPageOfflineConfig> f153824d;

    /* JADX INFO: renamed from: l.prp0$a */
    public static class C19427a {

        /* JADX INFO: renamed from: a */
        public static prp0 f153825a = new prp0();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(qv5.f159711o);
        sb.append("/commerce/offlineconfig_");
        sb.append(TextUtils.equals(qv5.m178249c(), "tantanapp") ? "release" : BuildConfig.BUILD_TYPE);
        sb.append(".json");
        f153820e = sb.toString();
    }

    public prp0() {
        this.f153824d = new HashMap();
    }

    /* JADX INFO: renamed from: i */
    public static prp0 m173528i() {
        return C19427a.f153825a;
    }

    /* JADX INFO: renamed from: g */
    public final void m173529g(Context context, String str) {
        File file = new File(rrp0.m182811g(context, str));
        if (file.exists()) {
            oki.m168023k(file);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m173530h(final Context context, final String str, final String str2) {
        final Uri uri = Uri.parse(str2);
        C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str2).m80823o(rrp0.m182808d(context, uri.getLastPathSegment())).m80817i(new y20() { // from class: l.mrp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138402a.m173532k(context, str, (DownloadTask) obj);
            }
        }).m80818j(new z20() { // from class: l.nrp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f143420a.m173533l(str2, context, str, (DownloadTask) obj, (File) obj2);
            }
        }).m80814f(new z20() { // from class: l.orp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f148738a.m173534m(context, str, uri, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a());
    }

    /* JADX INFO: renamed from: j */
    public String m173531j(Context context, String str) {
        WebPageOfflineConfig webPageOfflineConfig = this.f153824d.get(str);
        if (NullChecker.m82486a(webPageOfflineConfig)) {
            return rrp0.m182814j(context, webPageOfflineConfig) ? rrp0.m182810f(context, webPageOfflineConfig) : webPageOfflineConfig.url;
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m173532k(Context context, String str, DownloadTask downloadTask) {
        File file = new File(rrp0.m182807c(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        m173529g(context, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m173533l(String str, Context context, String str2, DownloadTask downloadTask, File file) {
        try {
            oki.m168019g(file, new File(rrp0.m182805a(context)));
        } catch (Exception e) {
            m173529g(context, str2);
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m173534m(Context context, String str, Uri uri, DownloadTask downloadTask, Throwable th) {
        m173529g(context, str);
        File file = new File(rrp0.m182808d(context, uri.getLastPathSegment()));
        if (file.exists()) {
            oki.m168025m(file.getPath());
        }
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m173535n(Throwable th) {
        this.f153823c = false;
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: o */
    public boolean m173536o() {
        return (!this.f153821a || this.f153822b || this.f153823c) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m173537p(WebOfflineData webOfflineData) {
        this.f153822b = true;
        this.f153823c = false;
        for (WebPageOfflineConfig webPageOfflineConfig : webOfflineData.pages) {
            this.f153824d.put(webPageOfflineConfig.pageId, webPageOfflineConfig);
        }
        for (String str : webOfflineData.zips.keySet()) {
            String str2 = webOfflineData.zips.get(str);
            String lastPathSegment = Uri.parse(str2).getLastPathSegment();
            Application application = App.f16088e;
            if (!rrp0.m182813i(application, lastPathSegment)) {
                m173530h(application, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m173538q() {
        if (this.f153823c || this.f153822b) {
            return;
        }
        this.f153821a = true;
        this.f153823c = true;
        uqb0.f180377I.now("webPage/offlineCache", qi20.m176659f(new pcj() { // from class: l.jrp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(prp0.f153820e).m209032f().m209028b();
            }
        }, WebOfflineData.JSON_ADAPTER)).subscribe(psd0.m173597H(new y20() { // from class: l.krp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128495a.m173537p((WebOfflineData) obj);
            }
        }, new y20() { // from class: l.lrp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133350a.m173535n((Throwable) obj);
            }
        }));
    }
}
