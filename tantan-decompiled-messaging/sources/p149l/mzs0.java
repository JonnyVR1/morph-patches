package p149l;

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
import com.google.android.gms.internal.ads.C2127d6;
import com.google.android.gms.internal.ads.C2159h6;
import com.google.android.gms.internal.ads.C2166i5;
import com.google.android.gms.internal.ads.C2175j6;
import com.google.android.gms.internal.ads.C2231q6;
import com.google.android.gms.internal.ads.C2239r6;
import com.google.android.gms.internal.ads.C2247s6;
import com.google.android.gms.internal.ads.C2271v6;
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
public final class mzs0 implements qzs0 {

    /* JADX INFO: renamed from: m */
    public static final List f136420m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public final vdx0 f136421a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f136422b;

    /* JADX INFO: renamed from: e */
    public final Context f136425e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public boolean f136426f;

    /* JADX INFO: renamed from: g */
    public final zzcbp f136427g;

    /* JADX INFO: renamed from: l */
    public final nzs0 f136432l;

    /* JADX INFO: renamed from: c */
    public final List f136423c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List f136424d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Object f136428h = new Object();

    /* JADX INFO: renamed from: i */
    public HashSet f136429i = new HashSet();

    /* JADX INFO: renamed from: j */
    public boolean f136430j = false;

    /* JADX INFO: renamed from: k */
    public boolean f136431k = false;

    public mzs0(Context context, zzcei zzceiVar, zzcbp zzcbpVar, @Nullable String str, nzs0 nzs0Var) {
        Preconditions.checkNotNull(zzcbpVar, "SafeBrowsing config is not present.");
        this.f136425e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f136422b = new LinkedHashMap();
        this.f136432l = nzs0Var;
        this.f136427g = zzcbpVar;
        Iterator it = zzcbpVar.zze.iterator();
        while (it.hasNext()) {
            this.f136429i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f136429i.remove("cookie".toLowerCase(Locale.ENGLISH));
        vdx0 vdx0VarM13384L = C2271v6.m13384L();
        vdx0VarM13384L.m198117D(9);
        vdx0VarM13384L.m198127z(str);
        vdx0VarM13384L.m198125x(str);
        wdx0 wdx0VarM12663L = C2127d6.m12663L();
        String str2 = this.f136427g.zza;
        if (str2 != null) {
            wdx0VarM12663L.m202815q(str2);
        }
        vdx0VarM13384L.m198124w((C2127d6) wdx0VarM12663L.m153521m());
        afx0 afx0VarM13303L = C2247s6.m13303L();
        afx0VarM13303L.m96277s(Wrappers.packageManager(this.f136425e).isCallerInstantApp());
        String str3 = zzceiVar.zza;
        if (str3 != null) {
            afx0VarM13303L.m96275q(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f136425e);
        if (apkVersion > 0) {
            afx0VarM13303L.m96276r(apkVersion);
        }
        vdx0VarM13384L.m198123v((C2247s6) afx0VarM13303L.m153521m());
        this.f136421a = vdx0VarM13384L;
    }

    @Override // p149l.qzs0
    /* JADX INFO: renamed from: A */
    public final void mo157164A(String str) {
        synchronized (this.f136428h) {
            vdx0 vdx0Var = this.f136421a;
            try {
                if (str == null) {
                    vdx0Var.m198121t();
                } else {
                    vdx0Var.m198122u(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.qzs0
    /* JADX INFO: renamed from: a */
    public final void mo157165a(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f136427g.zzc && !this.f136430j) {
            vny0.m199080r();
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
                        x2t0.m206867e("Fail to capture the web view", e);
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
                            x2t0.m206869g("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        x2t0.m206867e("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                pzs0.m172251a("Failed to capture the webview bitmap.");
                return;
            }
            this.f136430j = true;
            Runnable runnable = new Runnable() { // from class: l.izs0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115598a.m157168e(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                i3t0.f111372a.execute(runnable);
            }
        }
    }

    @Override // p149l.qzs0
    /* JADX INFO: renamed from: b */
    public final void mo157166b(String str, Map map, int i) {
        synchronized (this.f136428h) {
            if (i == 3) {
                try {
                    this.f136431k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f136422b.containsKey(str)) {
                if (i == 3) {
                    ((zex0) this.f136422b.get(str)).m218433u(4);
                }
                return;
            }
            zex0 zex0VarM13237M = C2239r6.m13237M();
            int iM214446a = yex0.m214446a(i);
            if (iM214446a != 0) {
                zex0VarM13237M.m218433u(iM214446a);
            }
            zex0VarM13237M.m218430r(this.f136422b.size());
            zex0VarM13237M.m218432t(str);
            dex0 dex0VarM12813L = C2175j6.m12813L();
            if (!this.f136429i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f136429i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        cex0 cex0VarM12745L = C2159h6.m12745L();
                        cex0VarM12745L.m106355q(zzgyl.zzw(str2));
                        cex0VarM12745L.m106356r(zzgyl.zzw(str3));
                        dex0VarM12813L.m111402q((C2159h6) cex0VarM12745L.m153521m());
                    }
                }
            }
            zex0VarM13237M.m218431s((C2175j6) dex0VarM12813L.m153521m());
            this.f136422b.put(str, zex0VarM13237M);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m157167c(Map map) throws Exception {
        zex0 zex0Var;
        gnr gnrVarM142240m;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f136428h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.f136428h) {
                                    zex0Var = (zex0) this.f136422b.get(str);
                                }
                                if (zex0Var == null) {
                                    pzs0.m172251a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        zex0Var.m218429q(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.f136426f = (length > 0) | this.f136426f;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) jas0.f117117b.m115379e()).booleanValue()) {
                    x2t0.m206865c("Failed to get SafeBrowsing metadata", e);
                }
                return jmw0.m142234g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f136426f) {
            synchronized (this.f136428h) {
                this.f136421a.m198117D(10);
            }
        }
        boolean z = this.f136426f;
        if (!(z && this.f136427g.zzg) && (!(this.f136431k && this.f136427g.zzf) && (z || !this.f136427g.zzd))) {
            return jmw0.m142235h(null);
        }
        synchronized (this.f136428h) {
            try {
                Iterator it = this.f136422b.values().iterator();
                while (it.hasNext()) {
                    this.f136421a.m198120s((C2239r6) ((zex0) it.next()).m153521m());
                }
                this.f136421a.m198118q(this.f136423c);
                this.f136421a.m198119r(this.f136424d);
                if (pzs0.m172252b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.f136421a.m198115B() + "\n  clickUrl: " + this.f136421a.m198114A() + "\n  resources: \n");
                    for (C2239r6 c2239r6 : this.f136421a.m198116C()) {
                        sb.append("    [");
                        sb.append(c2239r6.m13244L());
                        sb.append("] ");
                        sb.append(c2239r6.m13245O());
                    }
                    pzs0.m172251a(sb.toString());
                }
                gnr gnrVarM198686b = new vjs0(this.f136425e).m198686b(1, this.f136427g.zzb, null, ((C2271v6) this.f136421a.m153521m()).m12744h());
                if (pzs0.m172252b()) {
                    gnrVarM198686b.addListener(new Runnable() { // from class: l.jzs0
                        @Override // java.lang.Runnable
                        public final void run() {
                            pzs0.m172251a("Pinged SB successfully.");
                        }
                    }, i3t0.f111372a);
                }
                gnrVarM142240m = jmw0.m142240m(gnrVarM198686b, new yew0() { // from class: l.kzs0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        List list = mzs0.f136420m;
                        return null;
                    }
                }, i3t0.f111377f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gnrVarM142240m;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m157168e(Bitmap bitmap) {
        C2166i5 c2166i5Zzt = zzgyl.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c2166i5Zzt);
        synchronized (this.f136428h) {
            vdx0 vdx0Var = this.f136421a;
            tex0 tex0VarM13212L = C2231q6.m13212L();
            tex0VarM13212L.m188641q(c2166i5Zzt.m12771m());
            tex0VarM13212L.m188642r(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
            tex0VarM13212L.m188643s(2);
            vdx0Var.m198126y((C2231q6) tex0VarM13212L.m153521m());
        }
    }

    @Override // p149l.qzs0
    public final zzcbp zza() {
        return this.f136427g;
    }

    @Override // p149l.qzs0
    public final void zze() {
        synchronized (this.f136428h) {
            this.f136422b.keySet();
            gnr gnrVarM142235h = jmw0.m142235h(Collections.EMPTY_MAP);
            rlw0 rlw0Var = new rlw0() { // from class: l.hzs0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return this.f110224a.m157167c((Map) obj);
                }
            };
            rmw0 rmw0Var = i3t0.f111377f;
            gnr gnrVarM142241n = jmw0.m142241n(gnrVarM142235h, rlw0Var, rmw0Var);
            gnr gnrVarM142242o = jmw0.m142242o(gnrVarM142241n, 10L, TimeUnit.SECONDS, i3t0.f111375d);
            jmw0.m142245r(gnrVarM142241n, new lzs0(this, gnrVarM142242o), rmw0Var);
            f136420m.add(gnrVarM142242o);
        }
    }

    @Override // p149l.qzs0
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.f136427g.zzc && !this.f136430j;
    }
}
