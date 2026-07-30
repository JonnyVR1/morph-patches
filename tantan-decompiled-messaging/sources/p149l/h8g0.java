package p149l;

import android.app.Activity;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.json.JSONObject;
import tech.sud.runtime.p137a.C22402c;

/* JADX INFO: loaded from: classes.dex */
public final class h8g0 {

    /* JADX INFO: renamed from: C */
    public static log0 f106406C;

    /* JADX INFO: renamed from: D */
    public static y5g0 f106407D;

    /* JADX INFO: renamed from: A */
    public boolean f106408A;

    /* JADX INFO: renamed from: B */
    public Integer f106409B;

    /* JADX INFO: renamed from: a */
    public qpg0 f106410a;

    /* JADX INFO: renamed from: b */
    public final Activity f106411b;

    /* JADX INFO: renamed from: g */
    public kag0 f106416g;

    /* JADX INFO: renamed from: h */
    public icg0 f106417h;

    /* JADX INFO: renamed from: i */
    public final float f106418i;

    /* JADX INFO: renamed from: j */
    public final FrameLayout f106419j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f106420k;

    /* JADX INFO: renamed from: l */
    public boolean f106421l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f106422m;

    /* JADX INFO: renamed from: n */
    public String f106423n;

    /* JADX INFO: renamed from: o */
    public boolean f106424o;

    /* JADX INFO: renamed from: q */
    public String f106426q;

    /* JADX INFO: renamed from: t */
    public boolean f106429t;

    /* JADX INFO: renamed from: y */
    public String f106434y;

    /* JADX INFO: renamed from: c */
    public final HashMap f106412c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final SparseArray f106413d = new SparseArray(100);

    /* JADX INFO: renamed from: e */
    public int f106414e = 0;

    /* JADX INFO: renamed from: f */
    public final SparseArray f106415f = new SparseArray(100);

    /* JADX INFO: renamed from: p */
    public final int f106425p = 1;

    /* JADX INFO: renamed from: r */
    public final String f106427r = ".zip";

    /* JADX INFO: renamed from: s */
    public String f106428s = "";

    /* JADX INFO: renamed from: u */
    public boolean f106430u = true;

    /* JADX INFO: renamed from: v */
    public boolean f106431v = true;

    /* JADX INFO: renamed from: w */
    public boolean f106432w = true;

    /* JADX INFO: renamed from: x */
    public final String f106433x = "zh";

    /* JADX INFO: renamed from: z */
    public final int f106435z = -1;

    public h8g0(Activity activity) {
        this.f106411b = activity;
        qpg0 qpg0Var = new qpg0(activity);
        this.f106410a = qpg0Var;
        log0 log0Var = f106406C;
        if (log0Var != null && f106407D == null) {
            y5g0 y5g0Var = new y5g0(log0Var);
            f106407D = y5g0Var;
            qpg0Var.f155754f = y5g0Var;
            C22402c c22402c = qpg0Var.f155751c;
            if (c22402c != null) {
                c22402c.mo221586a(y5g0Var);
            }
        }
        qpg0 qpg0Var2 = this.f106410a;
        kpg0 kpg0Var = qpg0Var2.f155750b;
        kpg0Var.f124146a = this.f106424o;
        kpg0Var.f124147b = true;
        kpg0Var.f124150e = true;
        kpg0Var.f124151f = true;
        qpg0Var2.m175837b("RTObjCreate", new oog0(this));
        this.f106410a.m175837b("RTObjMsg", new x7g0(this));
        this.f106410a.m175837b("RTObjDestroy", new a9g0(this));
        this.f106410a.m175837b("RTGlobalCallback", new beg0(this));
        this.f106410a.m175837b("exitRuntime", new ehg0(this));
        this.f106410a.m175837b("@enableConsole", new bng0(this));
        this.f106410a.m175837b("@onState", new eqg0(this));
        this.f106410a.m175837b("GameViewOnAttachedToWindowReload", new xgg0(this));
        this.f106410a.m175837b("GameViewOnSurfaceCreated", new tmg0(this));
        this.f106410a.m175837b("GameViewOnSurfaceDestroyed", new drg0(this));
        this.f106410a.m175837b("onGameANRDetected", new v6g0(this));
        m129890b("Button", new wdg0());
        m129890b("BannerAd", new lag0());
        m129890b("RewardedVideoAd", new krg0());
        m129890b("InterstitialAd", new umg0());
        m129890b("UpdateManager", new mag0());
        m129890b("GetLocation@", new qeg0(nag0.class));
        m129890b("Authorize@", new qeg0(rkg0.class));
        m129890b("Login@", new qeg0(ceg0.class));
        m129890b("CheckSession@", new qeg0(vmg0.class));
        m129890b("GetSetting@", new qeg0(y7g0.class));
        m129890b("GetUserInfo@", new qeg0(b9g0.class));
        m129890b("UserInfoButtonTap@", new qeg0(i8g0.class));
        m129890b("NavigateToMiniProgram@", new qeg0(fhg0.class));
        m129890b("CheckIsUserAdvisedToRest@", new qeg0(zgg0.class));
        m129890b("GetRunData@", new qeg0(e7g0.class));
        m129890b("AddCard@", new qeg0(pag0.class));
        m129890b("OpenCard@", new qeg0(cng0.class));
        m129890b("FeedbackButtonTap@", new qeg0(vog0.class));
        m129890b("GameClubButtonTap@", new qeg0(lrg0.class));
        m129890b("OpenCustomerServiceConversation@", new qeg0(fqg0.class));
        m129890b("OpenSettingButtonTap@", new qeg0(urg0.class));
        m129890b("OpenSetting@", new qeg0(z5g0.class));
        m129890b("RequestPayment@", new qeg0(qag0.class));
        m129890b("GetShareInfo@", new qeg0(rag0.class));
        m129890b("HideShareMenu@", new qeg0(skg0.class));
        m129890b("ShareAppMessage@", new qeg0(ahg0.class));
        m129890b("ShowShareMenu@", new qeg0(wmg0.class));
        m129890b("UpdateShareMenu@", new qeg0(wog0.class));
        m129890b("ShowLoading@", new qeg0(xog0.class));
        m129890b("HideLoading@", new qeg0(sag0.class));
        m129890b("ShowToast@", new qeg0(f7g0.class));
        m129890b("HideToast@", new qeg0(tkg0.class));
        m129890b("ShowModal@", new qeg0(mrg0.class));
        m129890b("ShowActionSheet@", new qeg0(xmg0.class));
        m129890b("SetMenuStyle@", new qeg0(zeg0.class));
        activity.getWindowManager().getDefaultDisplay().getRealSize(new Point());
        this.f106418i = activity.getResources().getDisplayMetrics().density;
        this.f106419j = new FrameLayout(activity);
        this.f106420k = new FrameLayout(activity);
        this.f106421l = false;
    }

    /* JADX INFO: renamed from: c */
    public static void m129887c(h8g0 h8g0Var, int i, String str, JSONObject jSONObject) {
        gpg0 gpg0Var = (gpg0) h8g0Var.f106413d.get(i);
        if (gpg0Var == null) {
            qkg0.m175377c("WXGame", String.format("objectMsg: obj %d not found, cmd %s, data %s", Integer.valueOf(i), str, jSONObject != null ? jSONObject.toString() : "null"));
        } else {
            if (gpg0Var.mo110227c(str, jSONObject)) {
                return;
            }
            qkg0.m175377c("WXGame", String.format("objectMsg: cmd not processed obj %d cmd %s, data %s", Integer.valueOf(i), str, jSONObject != null ? jSONObject.toString() : "null"));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m129888d(h8g0 h8g0Var, String str, int i, JSONObject jSONObject) {
        if (h8g0Var.f106413d.get(i) != null) {
            qkg0.m175377c("WXGame", String.format("objectCreate: \"%s\" dup obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        mng0 mng0Var = (mng0) h8g0Var.f106412c.get(str);
        if (mng0Var == null) {
            qkg0.m175377c("WXGame", String.format("objectCreate: \"%s\" not found for obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        gpg0 gpg0VarMo146978a = mng0Var.mo146978a(jSONObject);
        if (gpg0VarMo146978a == null) {
            qkg0.m175377c("WXGame", String.format("objectCreate: \"%s\" failed for obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        gpg0VarMo146978a.f103801b = h8g0Var;
        gpg0VarMo146978a.f103800a = i;
        h8g0Var.f106413d.put(i, gpg0VarMo146978a);
        try {
            gpg0VarMo146978a.mo127353b(jSONObject);
            gpg0VarMo146978a.mo110226a();
        } catch (Exception e) {
            qkg0.m175377c("WXGame", "Dispatch:" + e.getMessage());
            gpg0VarMo146978a.mo127354e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m129889a() {
        qpg0 qpg0Var = this.f106410a;
        if (qpg0Var != null) {
            C22402c c22402c = qpg0Var.f155751c;
            if (c22402c != null) {
                c22402c.mo221587a(true);
            }
            this.f106410a = null;
            ViewParent parent = this.f106419j.getParent();
            boolean z = parent instanceof ViewGroup;
            FrameLayout frameLayout = this.f106419j;
            if (z) {
                ((ViewGroup) parent).removeView(frameLayout);
            } else {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m129890b(String str, mng0 mng0Var) {
        if (this.f106412c.get(str) == null) {
            this.f106412c.put(str, mng0Var);
            return;
        }
        qkg0.m175377c("WXGame", "registerFactory: \"" + str + "\" dup factory");
    }
}
