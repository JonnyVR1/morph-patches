package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class u7s0 {

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public String f175062d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Context f175063e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public String f175064f;

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f175066h;

    /* JADX INFO: renamed from: i */
    public File f175067i;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final BlockingQueue f175059a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final LinkedHashMap f175060b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final Map f175061c = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashSet f175065g = new HashSet(Arrays.asList(GuideBoostMode.noop, "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m192157c(u7s0 u7s0Var) throws Throwable {
        while (true) {
            try {
                e8s0 e8s0Var = (e8s0) u7s0Var.f175059a.take();
                d8s0 d8s0VarM115279a = e8s0Var.m115279a();
                if (!TextUtils.isEmpty(d8s0VarM115279a.m110368b())) {
                    u7s0Var.m192163g(u7s0Var.m192159b(u7s0Var.f175060b, e8s0Var.m115280b()), d8s0VarM115279a);
                }
            } catch (InterruptedException e) {
                x2t0.m206870h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final a8s0 m192158a(String str) {
        a8s0 a8s0Var = (a8s0) this.f175061c.get(str);
        return a8s0Var != null ? a8s0Var : a8s0.f68073a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m192159b(Map map, @Nullable Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, m192158a(str).mo95361a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final void m192160d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f175063e = context;
        this.f175064f = str;
        this.f175062d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f175066h = atomicBoolean;
        atomicBoolean.set(((Boolean) n9s0.f137832c.m115379e()).booleanValue());
        if (this.f175066h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f175067i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f175060b.put((String) entry.getKey(), (String) entry.getValue());
        }
        i3t0.f111372a.execute(new Runnable() { // from class: l.t7s0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                u7s0.m192157c(this.f168772a);
            }
        });
        Map map2 = this.f175061c;
        a8s0 a8s0Var = a8s0.f68074b;
        map2.put("action", a8s0Var);
        this.f175061c.put(FirebaseAnalytics.Param.AD_FORMAT, a8s0Var);
        this.f175061c.put("e", a8s0.f68075c);
    }

    /* JADX INFO: renamed from: e */
    public final void m192161e(String str) throws Throwable {
        if (this.f175065g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f175064f);
        linkedHashMap.put("ue", str);
        m192163g(m192159b(this.f175060b, linkedHashMap), null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m192162f(e8s0 e8s0Var) {
        return this.f175059a.offer(e8s0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m192163g(Map map, d8s0 d8s0Var) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f175062d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (d8s0Var != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(d8s0Var.m110368b())) {
                sb.append("&it=");
                sb.append(d8s0Var.m110368b());
            }
            if (!TextUtils.isEmpty(d8s0Var.m110367a())) {
                sb.append("&blat=");
                sb.append(d8s0Var.m110367a());
            }
            string = sb.toString();
        }
        if (!this.f175066h.get()) {
            vny0.m199080r();
            C2075b.m12318k(this.f175063e, this.f175064f, string);
            return;
        }
        File file = this.f175067i;
        if (file == null) {
            x2t0.m206869g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        x2t0.m206870h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    x2t0.m206870h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            x2t0.m206870h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            x2t0.m206870h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
