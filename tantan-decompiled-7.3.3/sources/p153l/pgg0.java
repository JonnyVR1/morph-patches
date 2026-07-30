package p153l;

import android.app.Activity;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.json.JSONObject;
import tech.sud.runtime.p141a.C22517c;

/* JADX INFO: loaded from: classes.dex */
public final class pgg0 {

    /* JADX INFO: renamed from: C */
    public static twg0 f152260C;

    /* JADX INFO: renamed from: D */
    public static geg0 f152261D;

    /* JADX INFO: renamed from: A */
    public boolean f152262A;

    /* JADX INFO: renamed from: B */
    public Integer f152263B;

    /* JADX INFO: renamed from: a */
    public yxg0 f152264a;

    /* JADX INFO: renamed from: b */
    public final Activity f152265b;

    /* JADX INFO: renamed from: g */
    public sig0 f152270g;

    /* JADX INFO: renamed from: h */
    public qkg0 f152271h;

    /* JADX INFO: renamed from: i */
    public final float f152272i;

    /* JADX INFO: renamed from: j */
    public final FrameLayout f152273j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f152274k;

    /* JADX INFO: renamed from: l */
    public boolean f152275l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f152276m;

    /* JADX INFO: renamed from: n */
    public String f152277n;

    /* JADX INFO: renamed from: o */
    public boolean f152278o;

    /* JADX INFO: renamed from: q */
    public String f152280q;

    /* JADX INFO: renamed from: t */
    public boolean f152283t;

    /* JADX INFO: renamed from: y */
    public String f152288y;

    /* JADX INFO: renamed from: c */
    public final HashMap f152266c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final SparseArray f152267d = new SparseArray(100);

    /* JADX INFO: renamed from: e */
    public int f152268e = 0;

    /* JADX INFO: renamed from: f */
    public final SparseArray f152269f = new SparseArray(100);

    /* JADX INFO: renamed from: p */
    public final int f152279p = 1;

    /* JADX INFO: renamed from: r */
    public final String f152281r = ".zip";

    /* JADX INFO: renamed from: s */
    public String f152282s = "";

    /* JADX INFO: renamed from: u */
    public boolean f152284u = true;

    /* JADX INFO: renamed from: v */
    public boolean f152285v = true;

    /* JADX INFO: renamed from: w */
    public boolean f152286w = true;

    /* JADX INFO: renamed from: x */
    public final String f152287x = "zh";

    /* JADX INFO: renamed from: z */
    public final int f152289z = -1;

    public pgg0(Activity activity) {
        this.f152265b = activity;
        yxg0 yxg0Var = new yxg0(activity);
        this.f152264a = yxg0Var;
        twg0 twg0Var = f152260C;
        if (twg0Var != null && f152261D == null) {
            geg0 geg0Var = new geg0(twg0Var);
            f152261D = geg0Var;
            yxg0Var.f201974f = geg0Var;
            C22517c c22517c = yxg0Var.f201971c;
            if (c22517c != null) {
                c22517c.mo222832a(geg0Var);
            }
        }
        yxg0 yxg0Var2 = this.f152264a;
        sxg0 sxg0Var = yxg0Var2.f201970b;
        sxg0Var.f171132a = this.f152278o;
        sxg0Var.f171133b = true;
        sxg0Var.f171136e = true;
        sxg0Var.f171137f = true;
        yxg0Var2.m217714b("RTObjCreate", new wwg0(this));
        this.f152264a.m217714b("RTObjMsg", new fgg0(this));
        this.f152264a.m217714b("RTObjDestroy", new ihg0(this));
        this.f152264a.m217714b("RTGlobalCallback", new jmg0(this));
        this.f152264a.m217714b("exitRuntime", new mpg0(this));
        this.f152264a.m217714b("@enableConsole", new jvg0(this));
        this.f152264a.m217714b("@onState", new myg0(this));
        this.f152264a.m217714b("GameViewOnAttachedToWindowReload", new fpg0(this));
        this.f152264a.m217714b("GameViewOnSurfaceCreated", new bvg0(this));
        this.f152264a.m217714b("GameViewOnSurfaceDestroyed", new lzg0(this));
        this.f152264a.m217714b("onGameANRDetected", new dfg0(this));
        m172231b("Button", new emg0());
        m172231b("BannerAd", new tig0());
        m172231b("RewardedVideoAd", new szg0());
        m172231b("InterstitialAd", new cvg0());
        m172231b("UpdateManager", new uig0());
        m172231b("GetLocation@", new ymg0(vig0.class));
        m172231b("Authorize@", new ymg0(zsg0.class));
        m172231b("Login@", new ymg0(kmg0.class));
        m172231b("CheckSession@", new ymg0(dvg0.class));
        m172231b("GetSetting@", new ymg0(ggg0.class));
        m172231b("GetUserInfo@", new ymg0(jhg0.class));
        m172231b("UserInfoButtonTap@", new ymg0(qgg0.class));
        m172231b("NavigateToMiniProgram@", new ymg0(npg0.class));
        m172231b("CheckIsUserAdvisedToRest@", new ymg0(hpg0.class));
        m172231b("GetRunData@", new ymg0(mfg0.class));
        m172231b("AddCard@", new ymg0(xig0.class));
        m172231b("OpenCard@", new ymg0(kvg0.class));
        m172231b("FeedbackButtonTap@", new ymg0(dxg0.class));
        m172231b("GameClubButtonTap@", new ymg0(tzg0.class));
        m172231b("OpenCustomerServiceConversation@", new ymg0(nyg0.class));
        m172231b("OpenSettingButtonTap@", new ymg0(c0h0.class));
        m172231b("OpenSetting@", new ymg0(heg0.class));
        m172231b("RequestPayment@", new ymg0(yig0.class));
        m172231b("GetShareInfo@", new ymg0(zig0.class));
        m172231b("HideShareMenu@", new ymg0(atg0.class));
        m172231b("ShareAppMessage@", new ymg0(ipg0.class));
        m172231b("ShowShareMenu@", new ymg0(evg0.class));
        m172231b("UpdateShareMenu@", new ymg0(exg0.class));
        m172231b("ShowLoading@", new ymg0(fxg0.class));
        m172231b("HideLoading@", new ymg0(ajg0.class));
        m172231b("ShowToast@", new ymg0(nfg0.class));
        m172231b("HideToast@", new ymg0(btg0.class));
        m172231b("ShowModal@", new ymg0(uzg0.class));
        m172231b("ShowActionSheet@", new ymg0(fvg0.class));
        m172231b("SetMenuStyle@", new ymg0(hng0.class));
        activity.getWindowManager().getDefaultDisplay().getRealSize(new Point());
        this.f152272i = activity.getResources().getDisplayMetrics().density;
        this.f152273j = new FrameLayout(activity);
        this.f152274k = new FrameLayout(activity);
        this.f152275l = false;
    }

    /* JADX INFO: renamed from: c */
    public static void m172228c(pgg0 pgg0Var, int i, String str, JSONObject jSONObject) {
        oxg0 oxg0Var = (oxg0) pgg0Var.f152267d.get(i);
        if (oxg0Var == null) {
            ysg0.m217257c("WXGame", String.format("objectMsg: obj %d not found, cmd %s, data %s", Integer.valueOf(i), str, jSONObject != null ? jSONObject.toString() : "null"));
        } else {
            if (oxg0Var.mo112982c(str, jSONObject)) {
                return;
            }
            ysg0.m217257c("WXGame", String.format("objectMsg: cmd not processed obj %d cmd %s, data %s", Integer.valueOf(i), str, jSONObject != null ? jSONObject.toString() : "null"));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m172229d(pgg0 pgg0Var, String str, int i, JSONObject jSONObject) {
        if (pgg0Var.f152267d.get(i) != null) {
            ysg0.m217257c("WXGame", String.format("objectCreate: \"%s\" dup obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        uvg0 uvg0Var = (uvg0) pgg0Var.f152266c.get(str);
        if (uvg0Var == null) {
            ysg0.m217257c("WXGame", String.format("objectCreate: \"%s\" not found for obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        oxg0 oxg0VarMo105060a = uvg0Var.mo105060a(jSONObject);
        if (oxg0VarMo105060a == null) {
            ysg0.m217257c("WXGame", String.format("objectCreate: \"%s\" failed for obj %d data %s", str, Integer.valueOf(i), jSONObject != null ? jSONObject.toString() : "null"));
            return;
        }
        oxg0VarMo105060a.f149667b = pgg0Var;
        oxg0VarMo105060a.f149666a = i;
        pgg0Var.f152267d.put(i, oxg0VarMo105060a);
        try {
            oxg0VarMo105060a.mo169706b(jSONObject);
            oxg0VarMo105060a.mo112981a();
        } catch (Exception e) {
            ysg0.m217257c("WXGame", "Dispatch:" + e.getMessage());
            oxg0VarMo105060a.mo126369e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m172230a() {
        yxg0 yxg0Var = this.f152264a;
        if (yxg0Var != null) {
            C22517c c22517c = yxg0Var.f201971c;
            if (c22517c != null) {
                c22517c.mo222833a(true);
            }
            this.f152264a = null;
            ViewParent parent = this.f152273j.getParent();
            boolean z = parent instanceof ViewGroup;
            FrameLayout frameLayout = this.f152273j;
            if (z) {
                ((ViewGroup) parent).removeView(frameLayout);
            } else {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m172231b(String str, uvg0 uvg0Var) {
        if (this.f152266c.get(str) == null) {
            this.f152266c.put(str, uvg0Var);
            return;
        }
        ysg0.m217257c("WXGame", "registerFactory: \"" + str + "\" dup factory");
    }
}
