package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xe80 {

    /* JADX INFO: renamed from: c */
    private static volatile xe80 f192539c;

    /* JADX INFO: renamed from: a */
    private ahy f192540a;

    /* JADX INFO: renamed from: b */
    private final HashMap<MKWebView, ArrayList<String>> f192541b = new HashMap<>();

    /* JADX INFO: renamed from: l.xe80$a */
    public class C21121a extends p400 {
        public C21121a() {
        }

        @Override // p149l.ahy.InterfaceC15627b
        /* JADX INFO: renamed from: a */
        public Iterator<MKWebView> mo96758a() {
            List<MKWebView> listM102553c = blp0.m102551e().m102553c();
            listM102553c.addAll(xe80.this.f192541b.keySet());
            return listM102553c.iterator();
        }
    }

    private xe80() {
        if (ev0.f93301b) {
            ahy ahyVar = new ahy(new C21121a());
            this.f192540a = ahyVar;
            ahyVar.m96756h("PreRenderManager");
            this.f192540a.m96757i();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m208516b() {
        ArrayList arrayList = new ArrayList();
        for (MKWebView mKWebView : this.f192541b.keySet()) {
            ArrayList<String> arrayList2 = this.f192541b.get(mKWebView);
            if (arrayList2 == null || arrayList2.isEmpty()) {
                arrayList.add(mKWebView);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f192541b.remove(arrayList.get(i));
        }
    }

    @UiThread
    /* JADX INFO: renamed from: d */
    private static void m208517d(MKWebView mKWebView, String str, String str2) {
        mKWebView.m87085c0(str, str2, mKWebView.getUrl());
    }

    /* JADX INFO: renamed from: e */
    public static xe80 m208518e() {
        if (f192539c == null) {
            synchronized (xe80.class) {
                try {
                    if (f192539c == null) {
                        f192539c = new xe80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192539c;
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public static void m208519f(MKWebView mKWebView, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("url", str);
        } catch (JSONException unused) {
        }
        m208517d(mKWebView, "view:destroy", jSONObject.toString());
    }

    /* JADX INFO: renamed from: h */
    private void m208520h(MKWebView mKWebView, String str) {
        ArrayList<String> arrayList = this.f192541b.get(mKWebView);
        if (arrayList != null) {
            arrayList.remove(str);
        }
        m208516b();
    }

    @UiThread
    /* JADX INFO: renamed from: c */
    public void m208521c(@NonNull String str) {
        a860 a860VarM102554d;
        MKWebView mKWebView;
        if (TextUtils.isEmpty(str) || (mKWebView = (a860VarM102554d = blp0.m102551e().m102554d(str)).f67999b) == null) {
            return;
        }
        mKWebView.m87078C0();
        MKWebView mKWebView2 = a860VarM102554d.f67998a;
        if (mKWebView2 != null) {
            m208519f(mKWebView2, str);
            m208520h(a860VarM102554d.f67998a, str);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: g */
    public MKWebView m208522g(@NonNull MKWebView mKWebView, @NonNull String str) {
        if (TextUtils.isEmpty(str) || blp0.m102551e().m102552b(str)) {
            return null;
        }
        MKWebView mKWebView2 = new MKWebView(shw.m184283c());
        mKWebView2.setWebUserAgent(shw.m184291k());
        mKWebView2.loadUrl(str);
        blp0.m102551e().m102555f(mKWebView, str, mKWebView2);
        return mKWebView2;
    }
}
