package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lrs0 extends mrs0 implements vgs0 {

    /* JADX INFO: renamed from: c */
    public final q9t0 f129752c;

    /* JADX INFO: renamed from: d */
    public final Context f129753d;

    /* JADX INFO: renamed from: e */
    public final WindowManager f129754e;

    /* JADX INFO: renamed from: f */
    public final p6s0 f129755f;

    /* JADX INFO: renamed from: g */
    public DisplayMetrics f129756g;

    /* JADX INFO: renamed from: h */
    public float f129757h;

    /* JADX INFO: renamed from: i */
    public int f129758i;

    /* JADX INFO: renamed from: j */
    public int f129759j;

    /* JADX INFO: renamed from: k */
    public int f129760k;

    /* JADX INFO: renamed from: l */
    public int f129761l;

    /* JADX INFO: renamed from: m */
    public int f129762m;

    /* JADX INFO: renamed from: n */
    public int f129763n;

    /* JADX INFO: renamed from: o */
    public int f129764o;

    public lrs0(q9t0 q9t0Var, Context context, p6s0 p6s0Var) {
        super(q9t0Var, "");
        this.f129758i = -1;
        this.f129759j = -1;
        this.f129761l = -1;
        this.f129762m = -1;
        this.f129763n = -1;
        this.f129764o = -1;
        this.f129752c = q9t0Var;
        this.f129753d = context;
        this.f129755f = p6s0Var;
        this.f129754e = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo12863a(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.f129756g = new DisplayMetrics();
        Display defaultDisplay = this.f129754e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f129756g);
        this.f129757h = this.f129756g.density;
        this.f129760k = defaultDisplay.getRotation();
        exr0.m118703b();
        DisplayMetrics displayMetrics = this.f129756g;
        this.f129758i = i2t0.m134094x(displayMetrics, displayMetrics.widthPixels);
        exr0.m118703b();
        DisplayMetrics displayMetrics2 = this.f129756g;
        this.f129759j = i2t0.m134094x(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.f129752c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f129761l = this.f129758i;
            this.f129762m = this.f129759j;
        } else {
            vny0.m199080r();
            int[] iArrM12323p = C2075b.m12323p(activityZzi);
            exr0.m118703b();
            this.f129761l = i2t0.m134094x(this.f129756g, iArrM12323p[0]);
            exr0.m118703b();
            this.f129762m = i2t0.m134094x(this.f129756g, iArrM12323p[1]);
        }
        if (this.f129752c.zzO().m178700i()) {
            this.f129763n = this.f129758i;
            this.f129764o = this.f129759j;
        } else {
            this.f129752c.measure(0, 0);
        }
        m156082e(this.f129758i, this.f129759j, this.f129761l, this.f129762m, this.f129757h, this.f129760k);
        krs0 krs0Var = new krs0();
        p6s0 p6s0Var = this.f129755f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        krs0Var.m147016e(p6s0Var.m167690a(intent));
        p6s0 p6s0Var2 = this.f129755f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        krs0Var.m147014c(p6s0Var2.m167690a(intent2));
        krs0Var.m147012a(this.f129755f.m167691b());
        krs0Var.m147015d(this.f129755f.m167692c());
        krs0Var.m147013b(true);
        boolean z = krs0Var.f124388a;
        boolean z2 = krs0Var.f124389b;
        boolean z3 = krs0Var.f124390c;
        boolean z4 = krs0Var.f124391d;
        boolean z5 = krs0Var.f124392e;
        q9t0 q9t0Var = this.f129752c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        q9t0Var.mo13705q("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f129752c.getLocationOnScreen(iArr);
        m151505h(exr0.m118703b().m134100e(this.f129753d, iArr[0]), exr0.m118703b().m134100e(this.f129753d, iArr[1]));
        if (x2t0.m206872j(2)) {
            x2t0.m206868f("Dispatching Ready Event.");
        }
        m156081d(this.f129752c.zzn().zza);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r3
      0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    public final void m151505h(int i, int i2) {
        int i3;
        Context context = this.f129753d;
        int i4 = 0;
        if (context instanceof Activity) {
            vny0.m199080r();
            i3 = C2075b.m12324q((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.f129752c.zzO() == null || !this.f129752c.zzO().m178700i()) {
            q9t0 q9t0Var = this.f129752c;
            int width = q9t0Var.getWidth();
            int height = q9t0Var.getHeight();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132048R)).booleanValue()) {
                if (width == 0) {
                    width = this.f129752c.zzO() != null ? this.f129752c.zzO().f158683c : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (this.f129752c.zzO() != null) {
                    i4 = this.f129752c.zzO().f158682b;
                }
            } else {
                i4 = height;
            }
            this.f129763n = exr0.m118703b().m134100e(this.f129753d, width);
            this.f129764o = exr0.m118703b().m134100e(this.f129753d, i4);
        }
        m156079b(i, i2 - i3, this.f129763n, this.f129764o);
        this.f129752c.zzN().zzC(i, i2);
    }
}
