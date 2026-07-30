package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.C2150d6;
import com.google.android.gms.internal.ads.C2182h6;
import com.google.android.gms.internal.ads.C2189i5;
import com.google.android.gms.internal.ads.C2198j6;
import com.google.android.gms.internal.ads.C2254q6;
import com.google.android.gms.internal.ads.C2262r6;
import com.google.android.gms.internal.ads.C2270s6;
import com.google.android.gms.internal.ads.C2294v6;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s8t0 implements w8t0 {

    /* JADX INFO: renamed from: m */
    public static final List f166849m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public final bnx0 f166850a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f166851b;

    /* JADX INFO: renamed from: e */
    public final Context f166854e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public boolean f166855f;

    /* JADX INFO: renamed from: g */
    public final zzcbp f166856g;

    /* JADX INFO: renamed from: l */
    public final t8t0 f166861l;

    /* JADX INFO: renamed from: c */
    public final List f166852c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List f166853d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Object f166857h = new Object();

    /* JADX INFO: renamed from: i */
    public HashSet f166858i = new HashSet();

    /* JADX INFO: renamed from: j */
    public boolean f166859j = false;

    /* JADX INFO: renamed from: k */
    public boolean f166860k = false;

    public s8t0(Context context, zzcei zzceiVar, zzcbp zzcbpVar, @Nullable String str, t8t0 t8t0Var) {
        Preconditions.checkNotNull(zzcbpVar, "SafeBrowsing config is not present.");
        this.f166854e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f166851b = new LinkedHashMap();
        this.f166861l = t8t0Var;
        this.f166856g = zzcbpVar;
        Iterator it = zzcbpVar.zze.iterator();
        while (it.hasNext()) {
            this.f166858i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f166858i.remove("cookie".toLowerCase(Locale.ENGLISH));
        bnx0 bnx0VarM13438L = C2294v6.m13438L();
        bnx0VarM13438L.m105635D(9);
        bnx0VarM13438L.m105645z(str);
        bnx0VarM13438L.m105643x(str);
        cnx0 cnx0VarM12717L = C2150d6.m12717L();
        String str2 = this.f166856g.zza;
        if (str2 != null) {
            cnx0VarM12717L.m111558q(str2);
        }
        bnx0VarM13438L.m105642w((C2150d6) cnx0VarM12717L.m185950m());
        gox0 gox0VarM13357L = C2270s6.m13357L();
        gox0VarM13357L.m131194s(Wrappers.packageManager(this.f166854e).isCallerInstantApp());
        String str3 = zzceiVar.zza;
        if (str3 != null) {
            gox0VarM13357L.m131192q(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f166854e);
        if (apkVersion > 0) {
            gox0VarM13357L.m131193r(apkVersion);
        }
        bnx0VarM13438L.m105641v((C2270s6) gox0VarM13357L.m185950m());
        this.f166850a = bnx0VarM13438L;
    }

    @Override // p153l.w8t0
    /* JADX INFO: renamed from: A */
    public final void mo185106A(String str) {
        synchronized (this.f166857h) {
            bnx0 bnx0Var = this.f166850a;
            try {
                if (str == null) {
                    bnx0Var.m105639t();
                } else {
                    bnx0Var.m105640u(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.w8t0
    /* JADX INFO: renamed from: a */
    public final void mo185107a(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f166856g.zzc && !this.f166859j) {
            bxy0.m106934r();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        dct0.m115296e("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            dct0.m115298g("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        dct0.m115296e("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                v8t0.m200322a("Failed to capture the webview bitmap.");
                return;
            }
            this.f166859j = true;
            Runnable runnable = new Runnable() { // from class: l.o8t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145467a.m185110e(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                oct0.f146733a.execute(runnable);
            }
        }
    }

    @Override // p153l.w8t0
    /* JADX INFO: renamed from: b */
    public final void mo185108b(String str, Map map, int i) {
        synchronized (this.f166857h) {
            if (i == 3) {
                try {
                    this.f166860k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f166851b.containsKey(str)) {
                if (i == 3) {
                    ((fox0) this.f166851b.get(str)).m126505u(4);
                }
                return;
            }
            fox0 fox0VarM13291M = C2262r6.m13291M();
            int iM121822a = eox0.m121822a(i);
            if (iM121822a != 0) {
                fox0VarM13291M.m126505u(iM121822a);
            }
            fox0VarM13291M.m126502r(this.f166851b.size());
            fox0VarM13291M.m126504t(str);
            jnx0 jnx0VarM12867L = C2198j6.m12867L();
            if (!this.f166858i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f166858i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        inx0 inx0VarM12799L = C2182h6.m12799L();
                        inx0VarM12799L.m141172q(zzgyl.zzw(str2));
                        inx0VarM12799L.m141173r(zzgyl.zzw(str3));
                        jnx0VarM12867L.m146288q((C2182h6) inx0VarM12799L.m185950m());
                    }
                }
            }
            fox0VarM13291M.m126503s((C2198j6) jnx0VarM12867L.m185950m());
            this.f166851b.put(str, fox0VarM13291M);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m185109c(Map map) throws Exception {
        fox0 fox0Var;
        hpr hprVarM173986m;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f166857h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f166857h) {
                                    fox0Var = (fox0) this.f166851b.get(str);
                                }
                                if (fox0Var == null) {
                                    v8t0.m200322a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        fox0Var.m126501q(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.f166855f = (length > 0) | this.f166855f;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) pjs0.f152740b.m149974e()).booleanValue()) {
                    dct0.m115294c("Failed to get SafeBrowsing metadata", e);
                }
                return pvw0.m173980g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f166855f) {
            synchronized (this.f166857h) {
                this.f166850a.m105635D(10);
            }
        }
        boolean z = this.f166855f;
        if (!(z && this.f166856g.zzg) && (!(this.f166860k && this.f166856g.zzf) && (z || !this.f166856g.zzd))) {
            return pvw0.m173981h(null);
        }
        synchronized (this.f166857h) {
            try {
                Iterator it = this.f166851b.values().iterator();
                while (it.hasNext()) {
                    this.f166850a.m105638s((C2262r6) ((fox0) it.next()).m185950m());
                }
                this.f166850a.m105636q(this.f166852c);
                this.f166850a.m105637r(this.f166853d);
                if (v8t0.m200323b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.f166850a.m105633B() + "\n  clickUrl: " + this.f166850a.m105632A() + "\n  resources: \n");
                    for (C2262r6 c2262r6 : this.f166850a.m105634C()) {
                        sb.append("    [");
                        sb.append(c2262r6.m13298L());
                        sb.append("] ");
                        sb.append(c2262r6.m13299O());
                    }
                    v8t0.m200322a(sb.toString());
                }
                hpr hprVarM106383b = new bts0(this.f166854e).m106383b(1, this.f166856g.zzb, null, ((C2294v6) this.f166850a.m185950m()).m12798h());
                if (v8t0.m200323b()) {
                    hprVarM106383b.addListener(new Runnable() { // from class: l.p8t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            v8t0.m200322a("Pinged SB successfully.");
                        }
                    }, oct0.f146733a);
                }
                hprVarM173986m = pvw0.m173986m(hprVarM106383b, new eow0() { // from class: l.q8t0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        List list = s8t0.f166849m;
                        return null;
                    }
                }, oct0.f146738f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hprVarM173986m;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m185110e(Bitmap bitmap) {
        C2189i5 c2189i5Zzt = zzgyl.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c2189i5Zzt);
        synchronized (this.f166857h) {
            bnx0 bnx0Var = this.f166850a;
            znx0 znx0VarM13266L = C2254q6.m13266L();
            znx0VarM13266L.m220683q(c2189i5Zzt.m12825m());
            znx0VarM13266L.m220684r(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            znx0VarM13266L.m220685s(2);
            bnx0Var.m105644y((C2254q6) znx0VarM13266L.m185950m());
        }
    }

    @Override // p153l.w8t0
    public final zzcbp zza() {
        return this.f166856g;
    }

    @Override // p153l.w8t0
    public final void zze() {
        synchronized (this.f166857h) {
            this.f166851b.keySet();
            hpr hprVarM173981h = pvw0.m173981h(Collections.EMPTY_MAP);
            xuw0 xuw0Var = new xuw0() { // from class: l.n8t0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f140712a.m185109c((Map) obj);
                }
            };
            xvw0 xvw0Var = oct0.f146738f;
            hpr hprVarM173987n = pvw0.m173987n(hprVarM173981h, xuw0Var, xvw0Var);
            hpr hprVarM173988o = pvw0.m173988o(hprVarM173987n, 10L, TimeUnit.SECONDS, oct0.f146736d);
            pvw0.m173991r(hprVarM173987n, new r8t0(this, hprVarM173988o), xvw0Var);
            f166849m.add(hprVarM173988o);
        }
    }

    @Override // p153l.w8t0
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.f166856g.zzc && !this.f166859j;
    }
}
