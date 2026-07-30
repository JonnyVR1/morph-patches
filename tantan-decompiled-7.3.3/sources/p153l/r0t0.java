package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r0t0 extends s0t0 implements bqs0 {

    /* JADX INFO: renamed from: c */
    public final wit0 f160670c;

    /* JADX INFO: renamed from: d */
    public final Context f160671d;

    /* JADX INFO: renamed from: e */
    public final WindowManager f160672e;

    /* JADX INFO: renamed from: f */
    public final vfs0 f160673f;

    /* JADX INFO: renamed from: g */
    public DisplayMetrics f160674g;

    /* JADX INFO: renamed from: h */
    public float f160675h;

    /* JADX INFO: renamed from: i */
    public int f160676i;

    /* JADX INFO: renamed from: j */
    public int f160677j;

    /* JADX INFO: renamed from: k */
    public int f160678k;

    /* JADX INFO: renamed from: l */
    public int f160679l;

    /* JADX INFO: renamed from: m */
    public int f160680m;

    /* JADX INFO: renamed from: n */
    public int f160681n;

    /* JADX INFO: renamed from: o */
    public int f160682o;

    public r0t0(wit0 wit0Var, Context context, vfs0 vfs0Var) {
        super(wit0Var, "");
        this.f160676i = -1;
        this.f160677j = -1;
        this.f160679l = -1;
        this.f160680m = -1;
        this.f160681n = -1;
        this.f160682o = -1;
        this.f160670c = wit0Var;
        this.f160671d = context;
        this.f160673f = vfs0Var;
        this.f160672e = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo12917a(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.f160674g = new DisplayMetrics();
        Display defaultDisplay = this.f160672e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f160674g);
        this.f160675h = this.f160674g.density;
        this.f160678k = defaultDisplay.getRotation();
        k6s0.m148569b();
        DisplayMetrics displayMetrics = this.f160674g;
        this.f160676i = obt0.m167047x(displayMetrics, displayMetrics.widthPixels);
        k6s0.m148569b();
        DisplayMetrics displayMetrics2 = this.f160674g;
        this.f160677j = obt0.m167047x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.f160670c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f160679l = this.f160676i;
            this.f160680m = this.f160677j;
        } else {
            bxy0.m106934r();
            int[] iArrM12377p = C2098b.m12377p(activityZzi);
            k6s0.m148569b();
            this.f160679l = obt0.m167047x(this.f160674g, iArrM12377p[0]);
            k6s0.m148569b();
            this.f160680m = obt0.m167047x(this.f160674g, iArrM12377p[1]);
        }
        if (this.f160670c.zzO().m211423i()) {
            this.f160681n = this.f160676i;
            this.f160682o = this.f160677j;
        } else {
            this.f160670c.measure(0, 0);
        }
        m183981e(this.f160676i, this.f160677j, this.f160679l, this.f160680m, this.f160675h, this.f160678k);
        q0t0 q0t0Var = new q0t0();
        vfs0 vfs0Var = this.f160673f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        q0t0Var.m174755e(vfs0Var.m201181a(intent));
        vfs0 vfs0Var2 = this.f160673f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        q0t0Var.m174753c(vfs0Var2.m201181a(intent2));
        q0t0Var.m174751a(this.f160673f.m201182b());
        q0t0Var.m174754d(this.f160673f.m201183c());
        q0t0Var.m174752b(true);
        boolean z = q0t0Var.f155084a;
        boolean z2 = q0t0Var.f155085b;
        boolean z3 = q0t0Var.f155086c;
        boolean z4 = q0t0Var.f155087d;
        boolean z5 = q0t0Var.f155088e;
        wit0 wit0Var = this.f160670c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        wit0Var.mo13759q("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f160670c.getLocationOnScreen(iArr);
        m179243h(k6s0.m148569b().m167053e(this.f160671d, iArr[0]), k6s0.m148569b().m167053e(this.f160671d, iArr[1]));
        if (dct0.m115301j(2)) {
            dct0.m115297f("Dispatching Ready Event.");
        }
        m183980d(this.f160670c.zzn().zza);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r3
      0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    public final void m179243h(int i, int i2) {
        int i3;
        Context context = this.f160671d;
        int i4 = 0;
        if (context instanceof Activity) {
            bxy0.m106934r();
            i3 = C2098b.m12378q((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.f160670c.zzO() == null || !this.f160670c.zzO().m211423i()) {
            wit0 wit0Var = this.f160670c;
            int width = wit0Var.getWidth();
            int height = wit0Var.getHeight();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168119R)).booleanValue()) {
                if (width == 0) {
                    width = this.f160670c.zzO() != null ? this.f160670c.zzO().f194816c : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (this.f160670c.zzO() != null) {
                    i4 = this.f160670c.zzO().f194815b;
                }
            } else {
                i4 = height;
            }
            this.f160681n = k6s0.m148569b().m167053e(this.f160671d, width);
            this.f160682o = k6s0.m148569b().m167053e(this.f160671d, i4);
        }
        m183978b(i, i2 - i3, this.f160681n, this.f160682o);
        this.f160670c.zzN().zzC(i, i2);
    }
}
