package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class cn80 {

    /* JADX INFO: renamed from: c */
    private static volatile cn80 f82696c;

    /* JADX INFO: renamed from: a */
    private xpy f82697a;

    /* JADX INFO: renamed from: b */
    private final HashMap<MKWebView, ArrayList<String>> f82698b = new HashMap<>();

    /* JADX INFO: renamed from: l.cn80$a */
    public class C16318a extends ed00 {
        public C16318a() {
        }

        @Override // p153l.xpy.InterfaceC21413b
        /* JADX INFO: renamed from: a */
        public Iterator<MKWebView> mo111495a() {
            List<MKWebView> listM127522c = fup0.m127520e().m127522c();
            listM127522c.addAll(cn80.this.f82698b.keySet());
            return listM127522c.iterator();
        }
    }

    private cn80() {
        if (lv0.f133671b) {
            xpy xpyVar = new xpy(new C16318a());
            this.f82697a = xpyVar;
            xpyVar.m212694h("PreRenderManager");
            this.f82697a.m212695i();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m111483b() {
        ArrayList arrayList = new ArrayList();
        for (MKWebView mKWebView : this.f82698b.keySet()) {
            ArrayList<String> arrayList2 = this.f82698b.get(mKWebView);
            if (arrayList2 == null || arrayList2.isEmpty()) {
                arrayList.add(mKWebView);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f82698b.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: d */
    private MKWebView m111484d(String str) {
        for (MKWebView mKWebView : this.f82698b.keySet()) {
            ArrayList<String> arrayList = this.f82698b.get(mKWebView);
            if (arrayList != null && arrayList.contains(str)) {
                return mKWebView;
            }
        }
        return null;
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    private static void m111485e(MKWebView mKWebView, String str, String str2) {
        mKWebView.m17935x0(str, str2, mKWebView.getUrl());
    }

    /* JADX INFO: renamed from: f */
    public static ViewGroup.LayoutParams m111486f() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: g */
    public static cn80 m111487g() {
        if (f82696c == null) {
            synchronized (cn80.class) {
                try {
                    if (f82696c == null) {
                        f82696c = new cn80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f82696c;
    }

    @UiThread
    /* JADX INFO: renamed from: i */
    public static void m111488i(MKWebView mKWebView, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("url", str);
        } catch (JSONException unused) {
        }
        m111485e(mKWebView, "view:destroy", jSONObject.toString());
    }

    @UiThread
    /* JADX INFO: renamed from: k */
    public static void m111489k(MKWebView mKWebView, String str) {
        m111485e(mKWebView, "view:show", str);
    }

    /* JADX INFO: renamed from: l */
    private void m111490l(MKWebView mKWebView, String str) {
        ArrayList<String> arrayList = this.f82698b.get(mKWebView);
        if (arrayList != null) {
            arrayList.remove(str);
        }
        m111483b();
    }

    /* JADX INFO: renamed from: m */
    private void m111491m(MKWebView mKWebView, String str) {
        ArrayList<String> arrayList = this.f82698b.get(mKWebView);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f82698b.put(mKWebView, arrayList);
        }
        arrayList.add(str);
    }

    @UiThread
    /* JADX INFO: renamed from: c */
    public void m111492c(@NonNull MKWebView mKWebView) {
        List<MKWebView> listM127521b = fup0.m127520e().m127521b(mKWebView);
        if (listM127521b == null) {
            return;
        }
        int size = listM127521b.size();
        for (int i = 0; i < size; i++) {
            MKWebView mKWebView2 = listM127521b.get(i);
            if (mKWebView2 != null) {
                mKWebView2.m17915b1();
            }
        }
    }

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: h */
    public MKWebView m111493h(@Nullable String str) {
        fg60 fg60VarM127523d;
        if (TextUtils.isEmpty(str) || (fg60VarM127523d = fup0.m127520e().m127523d(str)) == null) {
            return null;
        }
        MKWebView mKWebView = fg60VarM127523d.f98889b;
        MKWebView mKWebView2 = fg60VarM127523d.f98888a;
        if (mKWebView2 != null && mKWebView != null) {
            m111491m(mKWebView2, str);
        }
        return mKWebView;
    }

    /* JADX INFO: renamed from: j */
    public void m111494j(String str) {
        MKWebView mKWebViewM111484d = m111484d(str);
        if (mKWebViewM111484d != null) {
            m111488i(mKWebViewM111484d, str);
            m111490l(mKWebViewM111484d, str);
        }
    }
}
