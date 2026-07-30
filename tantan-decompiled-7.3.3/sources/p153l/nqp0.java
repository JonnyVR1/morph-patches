package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class nqp0 {

    /* JADX INFO: renamed from: a */
    public iqp0 f143251a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, String> f143252b;

    /* JADX INFO: renamed from: l.nqp0$a */
    public static class C18928a {
        private static final nqp0 INSTANCE = new nqp0();
    }

    public nqp0() {
        this.f143251a = new iqp0();
        this.f143252b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m164336a(DownloadTask downloadTask, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m164338c(Context context, String str, DownloadTask downloadTask) {
        try {
            oki.m168014b(new File(pqp0.m173378d(context, str)));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static nqp0 m164340h() {
        return C18928a.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m164341e(File file, String str) {
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m164341e(file2, str);
                }
                if (file2.isFile()) {
                    String lastPathSegment = Uri.fromFile(file2).getLastPathSegment();
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        this.f143252b.put(str + File.separator + lastPathSegment, file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m164342f() {
        ABManager.m30356q().observeOn(Schedulers.m222739io()).subscribe(psd0.m173596G(new y20() { // from class: l.jqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122236a.m164344i((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m164343g(final Context context, final String str, String str2) {
        C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str2).m80823o(pqp0.m173376b(context, str, Uri.parse(str2).getLastPathSegment())).m80817i(new y20() { // from class: l.kqp0
            @Override // p153l.y20
            public final void call(Object obj) {
                nqp0.m164338c(context, str, (DownloadTask) obj);
            }
        }).m80818j(new z20() { // from class: l.lqp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f133237a.m164345j(context, str, (DownloadTask) obj, (File) obj2);
            }
        }).m80814f(new z20() { // from class: l.mqp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                nqp0.m164336a((DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m164344i(uxj0 uxj0Var) {
        this.f143251a.m141701a();
        m164346k(App.f16088e);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m164345j(Context context, String str, DownloadTask downloadTask, File file) {
        try {
            oki.m168019g(file, new File(pqp0.m173378d(context, str)));
            m164348m(context, str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m164346k(Context context) {
        m164347l(context);
        if (this.f143251a.m141703c()) {
            for (Map.Entry<String, iqp0.C17776a> entry : this.f143251a.m141702b().entrySet()) {
                String key = entry.getKey();
                iqp0.C17776a value = entry.getValue();
                bkj0<String, String, String> bkj0VarM164349n = m164349n(value);
                if (!TextUtils.isEmpty(bkj0VarM164349n.f77082b)) {
                    String strM173376b = pqp0.m173376b(context, key, bkj0VarM164349n.f77082b);
                    String str = bkj0VarM164349n.f77083c;
                    if (new File(strM173376b).exists() && pqp0.m173379e(context, key, str, bkj0VarM164349n.f77081a)) {
                        m164348m(context, key);
                    } else {
                        m164343g(context, key, value.f116449c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m164347l(Context context) {
        String strM30321P = ABManager.m30321P("H5_AB_EXP_001_TEST", "h5abConfig");
        try {
            if (TextUtils.isEmpty(strM30321P)) {
                File file = new File(pqp0.m173375a(context));
                if (file.isDirectory() && file.exists()) {
                    oki.m168014b(file);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject(strM30321P);
            this.f143251a.m141704d(jSONObject.getBoolean("start"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("allPositions");
            Iterator<String> itKeys = jSONObject2.keys();
            HashSet hashSet = new HashSet();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                hashSet.add(next);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                iqp0.C17776a c17776a = new iqp0.C17776a();
                c17776a.f116447a = jSONObject3.getString(FirebaseAnalytics.Param.INDEX);
                c17776a.f116448b = jSONObject3.getString(OMSTemplateModeType.page);
                c17776a.f116449c = jSONObject3.getString("zip");
                this.f143251a.m141702b().put(next, c17776a);
                File file2 = new File(pqp0.m173378d(context, next));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            File[] fileArrListFiles = new File(pqp0.m173375a(context)).listFiles();
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3.isDirectory() && !hashSet.contains(file3.getName())) {
                        oki.m168023k(file3);
                    }
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m164348m(Context context, String str) {
        m164341e(new File(pqp0.m173378d(context, str)), str);
    }

    /* JADX INFO: renamed from: n */
    public bkj0<String, String, String> m164349n(iqp0.C17776a c17776a) {
        Uri uri = Uri.parse(c17776a.f116449c);
        String str = c17776a.f116447a;
        if (TextUtils.isEmpty(str)) {
            str = "index.html";
        }
        String lastPathSegment = uri.getLastPathSegment();
        return new bkj0<>(str, lastPathSegment, TextUtils.isEmpty(lastPathSegment) ? "" : lastPathSegment.replace(".zip", ""));
    }
}
