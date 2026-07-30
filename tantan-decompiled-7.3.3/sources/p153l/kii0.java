package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class kii0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public int f126988h;

    /* JADX INFO: renamed from: i */
    public int f126989i;

    /* JADX INFO: renamed from: j */
    public int f126990j;

    /* JADX INFO: renamed from: k */
    public float f126991k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserver.OnGlobalLayoutListener f126992l;

    /* JADX INFO: renamed from: l.kii0$a */
    public class RunnableC18170a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f126993a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f126994b;

        public RunnableC18170a(xc00 xc00Var, VNavigationBar vNavigationBar) {
            this.f126993a = xc00Var;
            this.f126994b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f126993a.mo99542b()) {
                return;
            }
            this.f126994b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.kii0$b */
    public class ViewOnClickListenerC18171b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f126996a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f126997b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xc00 f126998c;

        public ViewOnClickListenerC18171b(String str, boolean z, xc00 xc00Var) {
            this.f126996a = str;
            this.f126997b = z;
            this.f126998c = xc00Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f126996a)) {
                kii0.this.m205738F(this.f126996a);
            }
            if (this.f126997b) {
                return;
            }
            this.f126998c.mo99543c().m68056e2();
        }
    }

    public kii0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f126988h = -1;
        this.f126989i = -1;
        this.f126990j = -1;
        this.f126991k = -1.0f;
        this.f126989i = putongAct.getWindow().getStatusBarColor();
        this.f126988h = putongAct.getWindow().getDecorView().getSystemUiVisibility();
        this.f126990j = putongAct.statusBarColor();
        if (NullChecker.m82486a(putongAct.getSupportActionBar())) {
            this.f126991k = putongAct.getSupportActionBar().mo102183j();
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m149882K(Act act, xc00 xc00Var, String str) {
        Rect rect = new Rect();
        act.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int iM105588w0 = bnl0.m105588w0() - (rect.bottom - rect.top);
        JSONObject jSONObject = new JSONObject();
        try {
            if (iM105588w0 > qa00.m175859d(100.0f)) {
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, "didShow");
                jSONObject.put("height", iM105588w0);
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, "didHide");
                jSONObject.put("height", 0);
            }
        } catch (JSONException unused) {
        }
        xc00Var.mo99544d().mo97004b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m149884M(xc00 xc00Var, VNavigationBar vNavigationBar) {
        if (xc00Var.mo99542b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m149887P(xc00 xc00Var, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!xc00Var.mo99542b() && NullChecker.m82487b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = qa00.f156292E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m149889R(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, bnl0.m105511F0()));
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m149890S(xc00 xc00Var, String str) {
        PutongAct putongActMo99543c = xc00Var.mo99543c();
        if (putongActMo99543c == null) {
            return;
        }
        ktp0.m151392c(putongActMo99543c, str.equals("black"));
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m149891T(xc00 xc00Var, int i) {
        if (xc00Var.mo99542b()) {
            return;
        }
        xc00Var.mo99541a().setHorizontalScrollBarEnabled(i == 1);
        xc00Var.mo99541a().setVerticalScrollBarEnabled(i == 1);
    }

    /* JADX INFO: renamed from: V */
    private void m149893V(xc00 xc00Var, JSONObject jSONObject) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        l51.m152893M(new Runnable() { // from class: l.jii0
            @Override // java.lang.Runnable
            public final void run() {
                kii0.m149889R(putongActMo99543c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final void m149895W(final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("color");
        l51.m152893M(new Runnable() { // from class: l.iii0
            @Override // java.lang.Runnable
            public final void run() {
                kii0.m149890S(xc00Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void m149894c0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString) || strOptString.equalsIgnoreCase("transparent")) {
            return;
        }
        if (!strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        try {
            xc00Var.mo99541a().setBackgroundColor(Color.parseColor(strOptString));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: Y */
    public final VNavigationBar m149897Y(@NonNull xc00 xc00Var) {
        if (!(xc00Var.mo99543c() instanceof MkWebViewAct) && !(xc00Var.mo99543c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (xc00Var.mo99543c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) xc00Var.mo99543c().findViewById(ycc0.f198442Y);
        }
        if (xc00Var.mo99543c() instanceof MkWebViewAct) {
            return (VNavigationBar) xc00Var.mo99543c().findViewById(ycc0.f198442Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m149898Z(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        m149899a0(xc00Var, jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m149899a0(@NonNull final xc00 xc00Var, String str, String str2) {
        final VNavigationBar vNavigationBarM149897Y = m149897Y(xc00Var);
        if (vNavigationBarM149897Y == null) {
            if (TextUtils.isEmpty(str2)) {
                m205738F(str2);
            }
        } else {
            l51.m152893M(new Runnable() { // from class: l.cii0
                @Override // java.lang.Runnable
                public final void run() {
                    kii0.m149884M(xc00Var, vNavigationBarM149897Y);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m205738F(str);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m149900b0(@NonNull xc00 xc00Var) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.dii0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88655a.m149902e0(putongActMo99543c);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m149902e0(Act act) {
        if (act == null) {
            return;
        }
        this.f126988h = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.f126989i = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f126990j = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.m82486a(act.getSupportActionBar())) {
            this.f126991k = act.getSupportActionBar().mo102183j();
            act.getSupportActionBar().mo102168A(0.0f);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m149903f0(Act act) {
        if (act == null || this.f126989i == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f126989i);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f126988h);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f126990j);
        if (NullChecker.m82486a(act.getSupportActionBar())) {
            act.getSupportActionBar().mo102168A(this.f126991k);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m149904g0(final xc00 xc00Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("callback");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final PutongAct putongActMo99543c = xc00Var.mo99543c();
            if (NullChecker.m82486a(this.f126992l)) {
                putongActMo99543c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f126992l);
            }
            this.f126992l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eii0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    kii0.m149882K(putongActMo99543c, xc00Var, string);
                }
            };
            putongActMo99543c.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.f126992l);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m149905h0(xc00 xc00Var) {
        PutongAct putongActMo99543c = xc00Var.mo99543c();
        if (NullChecker.m82486a(this.f126992l)) {
            putongActMo99543c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f126992l);
            this.f126992l = null;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m149906i0(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("imgUrl");
        jSONObject.optString("text");
        String strOptString2 = jSONObject.optString("handler");
        String strOptString3 = jSONObject.optString("sucessHandler");
        String strOptString4 = jSONObject.optString("errorHandler");
        boolean zOptBoolean = jSONObject.optBoolean("skipBack");
        final VNavigationBar vNavigationBarM149897Y = m149897Y(xc00Var);
        if (vNavigationBarM149897Y == null) {
            if (TextUtils.isEmpty(strOptString4)) {
                return;
            }
            m205738F(strOptString4);
            return;
        }
        l51.m152893M(new RunnableC18170a(xc00Var, vNavigationBarM149897Y));
        if (!TextUtils.isEmpty(strOptString)) {
            uqb0.f180374G.m127100E(strOptString).subscribe(psd0.m173596G(new y20() { // from class: l.fii0
                @Override // p153l.y20
                public final void call(Object obj) {
                    l51.m152893M(new Runnable() { // from class: l.aii0
                        @Override // java.lang.Runnable
                        public final void run() {
                            kii0.m149887P(xc00Var, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM149897Y.setLeftIconOnClick(new ViewOnClickListenerC18171b(strOptString2, zOptBoolean, xc00Var));
        if (TextUtils.isEmpty(strOptString3)) {
            return;
        }
        m205738F(strOptString3);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m149907j0(final xc00 xc00Var, JSONObject jSONObject) {
        final int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        l51.m152893M(new Runnable() { // from class: l.gii0
            @Override // java.lang.Runnable
            public final void run() {
                kii0.m149891T(xc00Var, iOptInt);
            }
        });
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final void m149901d0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title");
        VNavigationBar vNavigationBarM149897Y = m149897Y(xc00Var);
        if (vNavigationBarM149897Y != null) {
            vNavigationBarM149897Y.setTitle(strOptString);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m149909l0(@NonNull xc00 xc00Var) {
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.hii0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110030a.m149903f0(putongActMo99543c);
            }
        });
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull final xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "showNotch":
                m149909l0(xc00Var);
                return true;
            case "changeNotchBackgroundColor":
                m149893V(xc00Var, jSONObject);
                return true;
            case "setScrollBarStatus":
                m149907j0(xc00Var, jSONObject);
                return true;
            case "changeWebviewBackgroundColor":
                l51.m152893M(new Runnable() { // from class: l.zhi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f204418a.m149894c0(xc00Var, jSONObject);
                    }
                });
                return true;
            case "removeMonitorKeyboard":
                m149905h0(xc00Var);
                return true;
            case "setNavLeftButton":
                m149906i0(xc00Var, jSONObject);
                return true;
            case "hideNotch":
                m149900b0(xc00Var);
                return true;
            case "hideNavigation":
                m149898Z(xc00Var, jSONObject);
                return true;
            case "changeNotchTextColor":
                m149895W(xc00Var, jSONObject);
                return true;
            case "setTitle":
                l51.m152893M(new Runnable() { // from class: l.bii0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76883a.m149901d0(xc00Var, jSONObject);
                    }
                });
                return true;
            case "monitorKeyboard":
                m149904g0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
