package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class foq {

    /* JADX INFO: renamed from: a */
    private WeakReference<MKWebView> f98597a;

    /* JADX INFO: renamed from: b */
    private Map<String, fnl> f98598b;

    /* JADX INFO: renamed from: c */
    private nqf f98599c;

    /* JADX INFO: renamed from: l.foq$a */
    public class RunnableC16896a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ve3 f98600a;

        public RunnableC16896a(ve3 ve3Var) {
            this.f98600a = ve3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98600a.m198152i(foq.this.m122481a().getUrl());
            this.f98600a.m198150g(foq.this.m122481a().getBid());
        }
    }

    /* JADX INFO: renamed from: l.foq$b */
    public class RunnableC16897b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ fnl f98602a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f98603b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f98604c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f98605d;

        public RunnableC16897b(fnl fnlVar, String str, String str2, JSONObject jSONObject) {
            this.f98602a = fnlVar;
            this.f98603b = str;
            this.f98604c = str2;
            this.f98605d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f98602a.mo104437h(this.f98603b, this.f98604c, this.f98605d);
            } catch (Exception e) {
                MDLog.printErrStackTrace("JsBridgeProcessor", e);
            }
        }
    }

    public foq(MKWebView mKWebView) {
        this.f98597a = new WeakReference<>(mKWebView);
        HashMap map = new HashMap();
        this.f98598b = map;
        map.put(UserBanAppealSwitch.offline, new s750(mKWebView));
        this.f98598b.put(Device.TYPE, new byd(mKWebView));
        this.f98598b.put("http", new sjl(mKWebView));
        this.f98598b.put(PlaceTypes.STORAGE, new kxf0(mKWebView));
        this.f98598b.put("media", new vgx(mKWebView));
        this.f98598b.put("ui", new qfj0(mKWebView, null));
        this.f98598b.put(OMSTemplateModeType.view, new we80(mKWebView));
        this.f98598b.put("websocket", new ejp0(mKWebView));
        this.f98598b.put("boost", new y53(mKWebView));
        this.f98599c = new nqf(mKWebView);
    }

    /* JADX INFO: renamed from: b */
    private boolean m122480b(String str, String str2) {
        return "init".equalsIgnoreCase(str) && NotificationStatus.undefined.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: a */
    public MKWebView m122481a() {
        WeakReference<MKWebView> weakReference = this.f98597a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m122482c() {
        MKWebView mKWebViewM122481a = m122481a();
        return (mKWebViewM122481a == null || mKWebViewM122481a.m87089v0() || mKWebViewM122481a.getContext() == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public void m122483d() {
        nqf nqfVar = this.f98599c;
        if (nqfVar != null) {
            nqfVar.mo155888i();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m122484e() {
        nqf nqfVar = this.f98599c;
        if (nqfVar != null) {
            nqfVar.mo122327f();
        }
        Map<String, fnl> map = this.f98598b;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                fnl fnlVar = this.f98598b.get(it.next());
                if (fnlVar != null) {
                    fnlVar.mo122327f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m122485f() {
        nqf nqfVar = this.f98599c;
        if (nqfVar != null) {
            nqfVar.mo122328g();
        }
        Map<String, fnl> map = this.f98598b;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                fnl fnlVar = this.f98598b.get(it.next());
                if (fnlVar != null) {
                    fnlVar.mo122328g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m122486g(String str, String str2, JSONObject jSONObject) throws Exception {
        WeakReference<MKWebView> weakReference;
        if (!m122482c()) {
            mxv.m156930e("JsBridgeProcessor", "tang---isCanProcess FALSE");
            return false;
        }
        boolean zM122480b = m122480b(str, str2);
        if (!zM122480b) {
            try {
                lxv.m152102h(ze3.m218269j(m122481a().getLogSessionKey(), str, str2, jSONObject.toString(), thw.m188931a(m122481a())));
                ve3 ve3Var = new ve3(str, str2, jSONObject);
                if (m122481a() != null) {
                    m122481a().post(new RunnableC16896a(ve3Var));
                }
                lxv.m152096b(ve3Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        nqf nqfVar = this.f98599c;
        if (nqfVar != null && nqfVar.mo104437h(str, str2, jSONObject)) {
            mxv.m156928c("JsBridgeProcessor", "tang-----额外命令执行 " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "  " + jSONObject);
            return true;
        }
        mxv.m156928c("JsBridgeProcessor", "tang-----内部命令执行 " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "  " + jSONObject);
        fnl fnlVar = this.f98598b.get(str);
        if (fnlVar != null) {
            if (!"ui".equalsIgnoreCase(str) || (weakReference = this.f98597a) == null || weakReference.get() == null) {
                return fnlVar.mo104437h(str, str2, jSONObject);
            }
            this.f98597a.get().post(new RunnableC16897b(fnlVar, str, str2, jSONObject));
            return true;
        }
        if (!zM122480b) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    lxv.m152102h(ze3.m218271l(m122481a().getLogSessionKey(), "bridge not found&&&" + str + "&&&" + str2, thw.m188931a(m122481a())));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m122487h(@NonNull String str, @NonNull fnl fnlVar) {
        Map<String, fnl> map = this.f98598b;
        if (map != null) {
            map.put(str, fnlVar);
        }
    }
}
