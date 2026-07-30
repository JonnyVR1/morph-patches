package p009l;

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
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.e30;
import l.e51;
import l.mkd0;
import l.qib0;
import l.s4c0;
import l.t100;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k9i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public int f15549h;

    /* JADX INFO: renamed from: i */
    public int f15550i;

    /* JADX INFO: renamed from: j */
    public int f15551j;

    /* JADX INFO: renamed from: k */
    public float f15552k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserver.OnGlobalLayoutListener f15553l;

    /* JADX INFO: renamed from: l.k9i0$a */
    public class RunnableC0988a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f15554a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f15555b;

        public RunnableC0988a(f400 f400Var, VNavigationBar vNavigationBar) {
            this.f15554a = f400Var;
            this.f15555b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15554a.mo12183b()) {
                return;
            }
            this.f15555b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.k9i0$b */
    public class ViewOnClickListenerC0989b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f15557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f15558b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f400 f15559c;

        public ViewOnClickListenerC0989b(String str, boolean z, f400 f400Var) {
            this.f15557a = str;
            this.f15558b = z;
            this.f15559c = f400Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f15557a)) {
                k9i0.this.m13718x(this.f15557a);
            }
            if (this.f15558b) {
                return;
            }
            this.f15559c.mo12184c().finish();
        }
    }

    public k9i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f15549h = -1;
        this.f15550i = -1;
        this.f15551j = -1;
        this.f15552k = -1.0f;
        this.f15550i = putongAct.getWindow().getStatusBarColor();
        this.f15549h = putongAct.getWindow().getDecorView().getSystemUiVisibility();
        this.f15551j = putongAct.statusBarColor();
        if (NullChecker.a(putongAct.getSupportActionBar())) {
            this.f15552k = putongAct.getSupportActionBar().j();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m17349C(Act act, f400 f400Var, String str) {
        Rect rect = new Rect();
        act.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int iW0 = xdl0.w0() - (rect.bottom - rect.top);
        JSONObject jSONObject = new JSONObject();
        try {
            if (iW0 > t100.d(100.0f)) {
                jSONObject.put("event", "didShow");
                jSONObject.put("height", iW0);
            } else {
                jSONObject.put("event", "didHide");
                jSONObject.put("height", 0);
            }
        } catch (JSONException unused) {
        }
        f400Var.mo12185d().mo15130b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m17351E(f400 f400Var, VNavigationBar vNavigationBar) {
        if (f400Var.mo12183b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m17354H(f400 f400Var, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!f400Var.mo12183b() && NullChecker.b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m17356J(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, xdl0.F0()));
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m17357K(f400 f400Var, String str) {
        PutongAct putongActMo12184c = f400Var.mo12184c();
        if (putongActMo12184c == null) {
            return;
        }
        gkp0.m15106c(putongActMo12184c, str.equals("black"));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m17358L(f400 f400Var, int i) {
        if (f400Var.mo12183b()) {
            return;
        }
        f400Var.mo12182a().setHorizontalScrollBarEnabled(i == 1);
        f400Var.mo12182a().setVerticalScrollBarEnabled(i == 1);
    }

    /* JADX INFO: renamed from: N */
    private void m17360N(f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActMo12184c = f400Var.mo12184c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        e51.M(new Runnable() { // from class: l.j9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m17356J(putongActMo12184c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m17362O(final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("color");
        e51.M(new Runnable() { // from class: l.i9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m17357K(f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void m17361U(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString) || strOptString.equalsIgnoreCase("transparent")) {
            return;
        }
        if (!strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        try {
            f400Var.mo12182a().setBackgroundColor(Color.parseColor(strOptString));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public final VNavigationBar m17364Q(@NonNull f400 f400Var) {
        if (!(f400Var.mo12184c() instanceof MkWebViewAct) && !(f400Var.mo12184c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (f400Var.mo12184c() instanceof AccessTokenMkWebViewAct) {
            return f400Var.mo12184c().findViewById(s4c0.Y);
        }
        if (f400Var.mo12184c() instanceof MkWebViewAct) {
            return f400Var.mo12184c().findViewById(s4c0.Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final void m17365R(@NonNull f400 f400Var, JSONObject jSONObject) {
        m17366S(f400Var, jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: S */
    public final void m17366S(@NonNull final f400 f400Var, String str, String str2) {
        final VNavigationBar vNavigationBarM17364Q = m17364Q(f400Var);
        if (vNavigationBarM17364Q == null) {
            if (TextUtils.isEmpty(str2)) {
                m13718x(str2);
            }
        } else {
            e51.M(new Runnable() { // from class: l.c9i0
                @Override // java.lang.Runnable
                public final void run() {
                    k9i0.m17351E(f400Var, vNavigationBarM17364Q);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m13718x(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m17367T(@NonNull f400 f400Var) {
        final PutongAct putongActMo12184c = f400Var.mo12184c();
        e51.M(new Runnable() { // from class: l.d9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11679a.m17369W(putongActMo12184c);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m17369W(Act act) {
        if (act == null) {
            return;
        }
        this.f15549h = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(67108864);
        this.f15550i = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f15551j = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.a(act.getSupportActionBar())) {
            this.f15552k = act.getSupportActionBar().j();
            act.getSupportActionBar().A(0.0f);
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m17370X(Act act) {
        if (act == null || this.f15550i == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f15550i);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f15549h);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f15551j);
        if (NullChecker.a(act.getSupportActionBar())) {
            act.getSupportActionBar().A(this.f15552k);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m17371Y(final f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("callback");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final PutongAct putongActMo12184c = f400Var.mo12184c();
            if (NullChecker.a(this.f15553l)) {
                putongActMo12184c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f15553l);
            }
            this.f15553l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.e9i0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    k9i0.m17349C(putongActMo12184c, f400Var, string);
                }
            };
            putongActMo12184c.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.f15553l);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m17372Z(f400 f400Var) {
        PutongAct putongActMo12184c = f400Var.mo12184c();
        if (NullChecker.a(this.f15553l)) {
            putongActMo12184c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f15553l);
            this.f15553l = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m17373a0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("imgUrl");
        jSONObject.optString("text");
        String strOptString2 = jSONObject.optString("handler");
        String strOptString3 = jSONObject.optString("sucessHandler");
        String strOptString4 = jSONObject.optString("errorHandler");
        boolean zOptBoolean = jSONObject.optBoolean("skipBack");
        final VNavigationBar vNavigationBarM17364Q = m17364Q(f400Var);
        if (vNavigationBarM17364Q == null) {
            if (TextUtils.isEmpty(strOptString4)) {
                return;
            }
            m13718x(strOptString4);
            return;
        }
        e51.M(new RunnableC0988a(f400Var, vNavigationBarM17364Q));
        if (!TextUtils.isEmpty(strOptString)) {
            qib0.G.E(strOptString).subscribe(mkd0.G(new e30() { // from class: l.f9i0
                public final void call(Object obj) {
                    e51.M(new Runnable() { // from class: l.a9i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            k9i0.m17354H(f400Var, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM17364Q.setLeftIconOnClick(new ViewOnClickListenerC0989b(strOptString2, zOptBoolean, f400Var));
        if (TextUtils.isEmpty(strOptString3)) {
            return;
        }
        m13718x(strOptString3);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m17374b0(final f400 f400Var, JSONObject jSONObject) {
        final int iOptInt = jSONObject.optInt("status");
        e51.M(new Runnable() { // from class: l.g9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m17358L(f400Var, iOptInt);
            }
        });
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m17368V(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title");
        VNavigationBar vNavigationBarM17364Q = m17364Q(f400Var);
        if (vNavigationBarM17364Q != null) {
            vNavigationBarM17364Q.setTitle(strOptString);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m17376d0(@NonNull f400 f400Var) {
        final PutongAct putongActMo12184c = f400Var.mo12184c();
        e51.M(new Runnable() { // from class: l.h9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13912a.m17370X(putongActMo12184c);
            }
        });
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "showNotch":
                m17376d0(f400Var);
                return true;
            case "changeNotchBackgroundColor":
                m17360N(f400Var, jSONObject);
                return true;
            case "setScrollBarStatus":
                m17374b0(f400Var, jSONObject);
                return true;
            case "changeWebviewBackgroundColor":
                e51.M(new Runnable() { // from class: l.z8i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23516a.m17361U(f400Var, jSONObject);
                    }
                });
                return true;
            case "removeMonitorKeyboard":
                m17372Z(f400Var);
                return true;
            case "setNavLeftButton":
                m17373a0(f400Var, jSONObject);
                return true;
            case "hideNotch":
                m17367T(f400Var);
                return true;
            case "hideNavigation":
                m17365R(f400Var, jSONObject);
                return true;
            case "changeNotchTextColor":
                m17362O(f400Var, jSONObject);
                return true;
            case "setTitle":
                e51.M(new Runnable() { // from class: l.b9i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9971a.m17368V(f400Var, jSONObject);
                    }
                });
                return true;
            case "monitorKeyboard":
                m17371Y(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
