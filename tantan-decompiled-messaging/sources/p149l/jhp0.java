package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class jhp0 {

    /* JADX INFO: renamed from: a */
    public ehp0 f117968a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, String> f117969b;

    /* JADX INFO: renamed from: l.jhp0$a */
    public static class C17774a {
        private static final jhp0 INSTANCE = new jhp0();
    }

    public jhp0() {
        this.f117968a = new ehp0();
        this.f117969b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m141540a(DownloadTask downloadTask, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m141542c(Context context, String str, DownloadTask downloadTask) {
        try {
            rhi.m179358b(new File(lhp0.m149851d(context, str)));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static jhp0 m141544h() {
        return C17774a.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m141545e(File file, String str) {
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m141545e(file2, str);
                }
                if (file2.isFile()) {
                    String lastPathSegment = Uri.fromFile(file2).getLastPathSegment();
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        this.f117969b.put(str + File.separator + lastPathSegment, file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m141546f() {
        ABManager.m29358q().observeOn(Schedulers.m221493io()).subscribe(mkd0.m154955G(new e30() { // from class: l.fhp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97537a.m141548i((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m141547g(final Context context, final String str, String str2) {
        C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str2).m79640o(lhp0.m149849b(context, str, Uri.parse(str2).getLastPathSegment())).m79634i(new e30() { // from class: l.ghp0
            @Override // p149l.e30
            public final void call(Object obj) {
                jhp0.m141542c(context, str, (DownloadTask) obj);
            }
        }).m79635j(new f30() { // from class: l.hhp0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f107774a.m141549j(context, str, (DownloadTask) obj, (File) obj2);
            }
        }).m79631f(new f30() { // from class: l.ihp0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                jhp0.m141540a((DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m141548i(roj0 roj0Var) {
        this.f117968a.m116507a();
        m141550k(App.f15369e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m141549j(Context context, String str, DownloadTask downloadTask, File file) {
        try {
            rhi.m179363g(file, new File(lhp0.m149851d(context, str)));
            m141552m(context, str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m141550k(Context context) {
        m141551l(context);
        if (this.f117968a.m116509c()) {
            for (Map.Entry<String, ehp0.C16612a> entry : this.f117968a.m116508b().entrySet()) {
                String key = entry.getKey();
                ehp0.C16612a value = entry.getValue();
                xaj0<String, String, String> xaj0VarM141553n = m141553n(value);
                if (!TextUtils.isEmpty(xaj0VarM141553n.f191752b)) {
                    String strM149849b = lhp0.m149849b(context, key, xaj0VarM141553n.f191752b);
                    String str = xaj0VarM141553n.f191753c;
                    if (new File(strM149849b).exists() && lhp0.m149852e(context, key, str, xaj0VarM141553n.f191751a)) {
                        m141552m(context, key);
                    } else {
                        m141547g(context, key, value.f91369c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m141551l(Context context) {
        String strM29323P = ABManager.m29323P("H5_AB_EXP_001_TEST", "h5abConfig");
        try {
            if (TextUtils.isEmpty(strM29323P)) {
                File file = new File(lhp0.m149848a(context));
                if (file.isDirectory() && file.exists()) {
                    rhi.m179358b(file);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject(strM29323P);
            this.f117968a.m116510d(jSONObject.getBoolean("start"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("allPositions");
            Iterator<String> itKeys = jSONObject2.keys();
            HashSet hashSet = new HashSet();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                hashSet.add(next);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                ehp0.C16612a c16612a = new ehp0.C16612a();
                c16612a.f91367a = jSONObject3.getString(FirebaseAnalytics.Param.INDEX);
                c16612a.f91368b = jSONObject3.getString(OMSTemplateModeType.page);
                c16612a.f91369c = jSONObject3.getString("zip");
                this.f117968a.m116508b().put(next, c16612a);
                File file2 = new File(lhp0.m149851d(context, next));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            File[] fileArrListFiles = new File(lhp0.m149848a(context)).listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3.isDirectory() && !hashSet.contains(file3.getName())) {
                        rhi.m179367k(file3);
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m141552m(Context context, String str) {
        m141545e(new File(lhp0.m149851d(context, str)), str);
    }

    /* JADX INFO: renamed from: n */
    public xaj0<String, String, String> m141553n(ehp0.C16612a c16612a) {
        Uri uri = Uri.parse(c16612a.f91369c);
        String str = c16612a.f91367a;
        if (TextUtils.isEmpty(str)) {
            str = "index.html";
        }
        String lastPathSegment = uri.getLastPathSegment();
        return new xaj0<>(str, lastPathSegment, TextUtils.isEmpty(lastPathSegment) ? "" : lastPathSegment.replace(".zip", ""));
    }
}
