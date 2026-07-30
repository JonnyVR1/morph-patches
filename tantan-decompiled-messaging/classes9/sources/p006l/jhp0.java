package p006l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.e30;
import l.f30;
import l.mkd0;
import l.rhi;
import l.roj0;
import l.xaj0;
import org.json.JSONObject;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jhp0 {

    /* JADX INFO: renamed from: a */
    public ehp0 f15156a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, String> f15157b;

    /* JADX INFO: renamed from: l.jhp0$a */
    public static class C0883a {
        private static final jhp0 INSTANCE = new jhp0();
    }

    public jhp0() {
        this.f15156a = new ehp0();
        this.f15157b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17439a(DownloadTask downloadTask, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17441c(Context context, String str, DownloadTask downloadTask) {
        try {
            rhi.b(new File(lhp0.m18776d(context, str)));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static jhp0 m17443h() {
        return C0883a.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m17444e(File file, String str) {
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m17444e(file2, str);
                }
                if (file2.isFile()) {
                    String lastPathSegment = Uri.fromFile(file2).getLastPathSegment();
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        this.f15157b.put(str + File.separator + lastPathSegment, file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17445f() {
        ABManager.m1264q().observeOn(Schedulers.io()).subscribe(mkd0.G(new e30() { // from class: l.fhp0
            public final void call(Object obj) {
                this.f12717a.m17447i((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m17446g(final Context context, final String str, String str2) {
        a.u().o(new DownloadTask.b(qib0.f19784H.getDownloadHttp()).q(str2).o(lhp0.m18774b(context, str, Uri.parse(str2).getLastPathSegment())).i(new e30() { // from class: l.ghp0
            public final void call(Object obj) {
                jhp0.m17441c(context, str, (DownloadTask) obj);
            }
        }).j(new f30() { // from class: l.hhp0
            public final void call(Object obj, Object obj2) {
                this.f13882a.m17448j(context, str, (DownloadTask) obj, (File) obj2);
            }
        }).f(new f30() { // from class: l.ihp0
            public final void call(Object obj, Object obj2) {
                jhp0.m17439a((DownloadTask) obj, (Throwable) obj2);
            }
        }).a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m17447i(roj0 roj0Var) {
        this.f15156a.m14538a();
        m17449k(App.e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m17448j(Context context, String str, DownloadTask downloadTask, File file) {
        try {
            rhi.g(file, new File(lhp0.m18776d(context, str)));
            m17451m(context, str);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17449k(Context context) {
        m17450l(context);
        if (this.f15156a.m14540c()) {
            for (Map.Entry<String, ehp0.C0674a> entry : this.f15156a.m14539b().entrySet()) {
                String key = entry.getKey();
                ehp0.C0674a value = entry.getValue();
                xaj0<String, String, String> xaj0VarM17452n = m17452n(value);
                if (!TextUtils.isEmpty((CharSequence) xaj0VarM17452n.b)) {
                    String strM18774b = lhp0.m18774b(context, key, (String) xaj0VarM17452n.b);
                    String str = (String) xaj0VarM17452n.c;
                    if (new File(strM18774b).exists() && lhp0.m18777e(context, key, str, (String) xaj0VarM17452n.a)) {
                        m17451m(context, key);
                    } else {
                        m17446g(context, key, value.f11155c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m17450l(Context context) {
        String strM1229P = ABManager.m1229P("H5_AB_EXP_001_TEST", "h5abConfig");
        try {
            if (TextUtils.isEmpty(strM1229P)) {
                File file = new File(lhp0.m18773a(context));
                if (file.isDirectory() && file.exists()) {
                    rhi.b(file);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject(strM1229P);
            this.f15156a.m14541d(jSONObject.getBoolean("start"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("allPositions");
            Iterator<String> itKeys = jSONObject2.keys();
            HashSet hashSet = new HashSet();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                hashSet.add(next);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                ehp0.C0674a c0674a = new ehp0.C0674a();
                c0674a.f11153a = jSONObject3.getString("index");
                c0674a.f11154b = jSONObject3.getString("page");
                c0674a.f11155c = jSONObject3.getString("zip");
                this.f15156a.m14539b().put(next, c0674a);
                File file2 = new File(lhp0.m18776d(context, next));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            File[] fileArrListFiles = new File(lhp0.m18773a(context)).listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3.isDirectory() && !hashSet.contains(file3.getName())) {
                        rhi.k(file3);
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m17451m(Context context, String str) {
        m17444e(new File(lhp0.m18776d(context, str)), str);
    }

    /* JADX INFO: renamed from: n */
    public xaj0<String, String, String> m17452n(ehp0.C0674a c0674a) {
        Uri uri = Uri.parse(c0674a.f11155c);
        String str = c0674a.f11153a;
        if (TextUtils.isEmpty(str)) {
            str = "index.html";
        }
        String lastPathSegment = uri.getLastPathSegment();
        return new xaj0<>(str, lastPathSegment, TextUtils.isEmpty(lastPathSegment) ? "" : lastPathSegment.replace(".zip", ""));
    }
}
