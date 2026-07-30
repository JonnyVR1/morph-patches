package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class k9i0 extends e400 {

    /* JADX INFO: renamed from: h */
    public int f122014h;

    /* JADX INFO: renamed from: i */
    public int f122015i;

    /* JADX INFO: renamed from: j */
    public int f122016j;

    /* JADX INFO: renamed from: k */
    public float f122017k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserver.OnGlobalLayoutListener f122018l;

    /* JADX INFO: renamed from: l.k9i0$a */
    public class RunnableC17959a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f122019a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VNavigationBar f122020b;

        public RunnableC17959a(f400 f400Var, VNavigationBar vNavigationBar) {
            this.f122019a = f400Var;
            this.f122020b = vNavigationBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122019a.mo102960b()) {
                return;
            }
            this.f122020b.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.k9i0$b */
    public class ViewOnClickListenerC17960b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f122022a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f122023b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f400 f122024c;

        public ViewOnClickListenerC17960b(String str, boolean z, f400 f400Var) {
            this.f122022a = str;
            this.f122023b = z;
            this.f122024c = f400Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f122022a)) {
                k9i0.this.m114659x(this.f122022a);
            }
            if (this.f122023b) {
                return;
            }
            this.f122024c.mo102961c().m66873d2();
        }
    }

    public k9i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
        this.f122014h = -1;
        this.f122015i = -1;
        this.f122016j = -1;
        this.f122017k = -1.0f;
        this.f122015i = putongAct.getWindow().getStatusBarColor();
        this.f122014h = putongAct.getWindow().getDecorView().getSystemUiVisibility();
        this.f122016j = putongAct.statusBarColor();
        if (NullChecker.m81303a(putongAct.getSupportActionBar())) {
            this.f122017k = putongAct.getSupportActionBar().mo134123j();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m145044C(Act act, f400 f400Var, String str) {
        Rect rect = new Rect();
        act.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int iM208408w0 = xdl0.m208408w0() - (rect.bottom - rect.top);
        JSONObject jSONObject = new JSONObject();
        try {
            if (iM208408w0 > t100.m186890d(100.0f)) {
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, "didShow");
                jSONObject.put("height", iM208408w0);
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, "didHide");
                jSONObject.put("height", 0);
            }
        } catch (JSONException unused) {
        }
        f400Var.mo102962d().mo127285b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m145046E(f400 f400Var, VNavigationBar vNavigationBar) {
        if (f400Var.mo102960b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m145049H(f400 f400Var, Bitmap bitmap, VNavigationBar vNavigationBar) {
        if (!f400Var.mo102960b() && NullChecker.m81304b(bitmap) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            int i = t100.f167230E;
            vNavigationBar.setLeftIconDrawable(new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, i, i, true)));
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m145051J(Act act, String str) {
        if (act == null) {
            return;
        }
        View view = new View(act);
        if (str.equalsIgnoreCase("transparent")) {
            act.getWindow().setStatusBarColor(0);
            return;
        }
        view.setBackgroundColor(Color.parseColor(str));
        ((ViewGroup) act.getWindow().getDecorView()).addView(view, new LinearLayout.LayoutParams(-1, xdl0.m208331F0()));
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m145052K(f400 f400Var, String str) {
        PutongAct putongActMo102961c = f400Var.mo102961c();
        if (putongActMo102961c == null) {
            return;
        }
        gkp0.m126668c(putongActMo102961c, str.equals("black"));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m145053L(f400 f400Var, int i) {
        if (f400Var.mo102960b()) {
            return;
        }
        f400Var.mo102959a().setHorizontalScrollBarEnabled(i == 1);
        f400Var.mo102959a().setVerticalScrollBarEnabled(i == 1);
    }

    /* JADX INFO: renamed from: N */
    private void m145055N(f400 f400Var, JSONObject jSONObject) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        final String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (!strOptString.equalsIgnoreCase("transparent") && !strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        e51.m114748M(new Runnable() { // from class: l.j9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m145051J(putongActMo102961c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m145057O(final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("color");
        e51.m114748M(new Runnable() { // from class: l.i9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m145052K(f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void m145056U(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("color");
        if (TextUtils.isEmpty(strOptString) || strOptString.equalsIgnoreCase("transparent")) {
            return;
        }
        if (!strOptString.contains("#")) {
            strOptString = "#".concat(strOptString);
        }
        try {
            f400Var.mo102959a().setBackgroundColor(Color.parseColor(strOptString));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public final VNavigationBar m145059Q(@NonNull f400 f400Var) {
        if (!(f400Var.mo102961c() instanceof MkWebViewAct) && !(f400Var.mo102961c() instanceof AccessTokenMkWebViewAct)) {
            return null;
        }
        if (f400Var.mo102961c() instanceof AccessTokenMkWebViewAct) {
            return (VNavigationBar) f400Var.mo102961c().findViewById(s4c0.f162321Y);
        }
        if (f400Var.mo102961c() instanceof MkWebViewAct) {
            return (VNavigationBar) f400Var.mo102961c().findViewById(s4c0.f162321Y);
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final void m145060R(@NonNull f400 f400Var, JSONObject jSONObject) {
        m145061S(f400Var, jSONObject.optString("sucessHandler"), jSONObject.optString("errorHandler"));
    }

    /* JADX INFO: renamed from: S */
    public final void m145061S(@NonNull final f400 f400Var, String str, String str2) {
        final VNavigationBar vNavigationBarM145059Q = m145059Q(f400Var);
        if (vNavigationBarM145059Q == null) {
            if (TextUtils.isEmpty(str2)) {
                m114659x(str2);
            }
        } else {
            e51.m114748M(new Runnable() { // from class: l.c9i0
                @Override // java.lang.Runnable
                public final void run() {
                    k9i0.m145046E(f400Var, vNavigationBarM145059Q);
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m114659x(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m145062T(@NonNull f400 f400Var) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.d9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85125a.m145064W(putongActMo102961c);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m145064W(Act act) {
        if (act == null) {
            return;
        }
        this.f122014h = act.getWindow().getDecorView().getSystemUiVisibility();
        act.getWindow().addFlags(Integer.MIN_VALUE);
        act.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.f122015i = act.getWindow().getStatusBarColor();
        act.getWindow().setStatusBarColor(0);
        this.f122016j = act.statusBarColor();
        PutongAct.setLightStatusBar(act.getWindow(), 1296);
        act.setStatusBarColor(0);
        PutongAct.FlymeSetStatusBarLightMode(act.getWindow(), true);
        PutongAct.MIUISetStatusBarLightMode(act.getWindow(), true);
        if (NullChecker.m81303a(act.getSupportActionBar())) {
            this.f122017k = act.getSupportActionBar().mo134123j();
            act.getSupportActionBar().mo134111A(0.0f);
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m145065X(Act act) {
        if (act == null || this.f122015i == -1) {
            return;
        }
        act.getWindow().setStatusBarColor(this.f122015i);
        act.getWindow().getDecorView().setSystemUiVisibility(this.f122014h);
        act.getWindow().clearFlags(1024);
        act.setStatusBarColor(this.f122016j);
        if (NullChecker.m81303a(act.getSupportActionBar())) {
            act.getSupportActionBar().mo134111A(this.f122017k);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m145066Y(final f400 f400Var, JSONObject jSONObject) {
        try {
            final String string = jSONObject.getString("callback");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final PutongAct putongActMo102961c = f400Var.mo102961c();
            if (NullChecker.m81303a(this.f122018l)) {
                putongActMo102961c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f122018l);
            }
            this.f122018l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.e9i0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    k9i0.m145044C(putongActMo102961c, f400Var, string);
                }
            };
            putongActMo102961c.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.f122018l);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m145067Z(f400 f400Var) {
        PutongAct putongActMo102961c = f400Var.mo102961c();
        if (NullChecker.m81303a(this.f122018l)) {
            putongActMo102961c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f122018l);
            this.f122018l = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m145068a0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("imgUrl");
        jSONObject.optString("text");
        String strOptString2 = jSONObject.optString("handler");
        String strOptString3 = jSONObject.optString("sucessHandler");
        String strOptString4 = jSONObject.optString("errorHandler");
        boolean zOptBoolean = jSONObject.optBoolean("skipBack");
        final VNavigationBar vNavigationBarM145059Q = m145059Q(f400Var);
        if (vNavigationBarM145059Q == null) {
            if (TextUtils.isEmpty(strOptString4)) {
                return;
            }
            m114659x(strOptString4);
            return;
        }
        e51.m114748M(new RunnableC17959a(f400Var, vNavigationBarM145059Q));
        if (!TextUtils.isEmpty(strOptString)) {
            qib0.f154691G.m102316E(strOptString).subscribe(mkd0.m154955G(new e30() { // from class: l.f9i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e51.m114748M(new Runnable() { // from class: l.a9i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            k9i0.m145049H(f400Var, bitmap, vNavigationBar);
                        }
                    });
                }
            }));
        }
        vNavigationBarM145059Q.setLeftIconOnClick(new ViewOnClickListenerC17960b(strOptString2, zOptBoolean, f400Var));
        if (TextUtils.isEmpty(strOptString3)) {
            return;
        }
        m114659x(strOptString3);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m145069b0(final f400 f400Var, JSONObject jSONObject) {
        final int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        e51.m114748M(new Runnable() { // from class: l.g9i0
            @Override // java.lang.Runnable
            public final void run() {
                k9i0.m145053L(f400Var, iOptInt);
            }
        });
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void m145063V(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title");
        VNavigationBar vNavigationBarM145059Q = m145059Q(f400Var);
        if (vNavigationBarM145059Q != null) {
            vNavigationBarM145059Q.setTitle(strOptString);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m145071d0(@NonNull f400 f400Var) {
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.h9i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106601a.m145065X(putongActMo102961c);
            }
        });
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "showNotch":
                m145071d0(f400Var);
                return true;
            case "changeNotchBackgroundColor":
                m145055N(f400Var, jSONObject);
                return true;
            case "setScrollBarStatus":
                m145069b0(f400Var, jSONObject);
                return true;
            case "changeWebviewBackgroundColor":
                e51.m114748M(new Runnable() { // from class: l.z8i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202171a.m145056U(f400Var, jSONObject);
                    }
                });
                return true;
            case "removeMonitorKeyboard":
                m145067Z(f400Var);
                return true;
            case "setNavLeftButton":
                m145068a0(f400Var, jSONObject);
                return true;
            case "hideNotch":
                m145062T(f400Var);
                return true;
            case "hideNavigation":
                m145060R(f400Var, jSONObject);
                return true;
            case "changeNotchTextColor":
                m145057O(f400Var, jSONObject);
                return true;
            case "setTitle":
                e51.m114748M(new Runnable() { // from class: l.b9i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74585a.m145063V(f400Var, jSONObject);
                    }
                });
                return true;
            case "monitorKeyboard":
                m145066Y(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }
}
