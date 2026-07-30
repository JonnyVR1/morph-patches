package p153l;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.GuideBoostMode;
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
public final class ahs0 {

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public String f71418d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public Context f71419e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public String f71420f;

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f71422h;

    /* JADX INFO: renamed from: i */
    public File f71423i;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final BlockingQueue f71415a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final LinkedHashMap f71416b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final Map f71417c = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashSet f71421g = new HashSet(Arrays.asList(GuideBoostMode.noop, "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m97911c(ahs0 ahs0Var) throws Throwable {
        while (true) {
            try {
                khs0 khs0Var = (khs0) ahs0Var.f71415a.take();
                jhs0 jhs0VarM149818a = khs0Var.m149818a();
                if (!TextUtils.isEmpty(jhs0VarM149818a.m144932b())) {
                    ahs0Var.m97917g(ahs0Var.m97913b(ahs0Var.f71416b, khs0Var.m149819b()), jhs0VarM149818a);
                }
            } catch (InterruptedException e) {
                dct0.m115299h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ghs0 m97912a(String str) {
        ghs0 ghs0Var = (ghs0) this.f71417c.get(str);
        return ghs0Var != null ? ghs0Var : ghs0.f104151a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m97913b(Map map, @Nullable Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, m97912a(str).mo115811a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final void m97914d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f71419e = context;
        this.f71420f = str;
        this.f71418d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f71422h = atomicBoolean;
        atomicBoolean.set(((Boolean) tis0.f174506c.m149974e()).booleanValue());
        if (this.f71422h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f71423i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f71416b.put((String) entry.getKey(), (String) entry.getValue());
        }
        oct0.f146733a.execute(new Runnable() { // from class: l.zgs0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ahs0.m97911c(this.f204336a);
            }
        });
        Map map2 = this.f71417c;
        ghs0 ghs0Var = ghs0.f104152b;
        map2.put("action", ghs0Var);
        this.f71417c.put(FirebaseAnalytics.Param.AD_FORMAT, ghs0Var);
        this.f71417c.put("e", ghs0.f104153c);
    }

    /* JADX INFO: renamed from: e */
    public final void m97915e(String str) throws Throwable {
        if (this.f71421g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f71420f);
        linkedHashMap.put("ue", str);
        m97917g(m97913b(this.f71416b, linkedHashMap), null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m97916f(khs0 khs0Var) {
        return this.f71415a.offer(khs0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m97917g(Map map, jhs0 jhs0Var) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f71418d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (jhs0Var != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(jhs0Var.m144932b())) {
                sb.append("&it=");
                sb.append(jhs0Var.m144932b());
            }
            if (!TextUtils.isEmpty(jhs0Var.m144931a())) {
                sb.append("&blat=");
                sb.append(jhs0Var.m144931a());
            }
            string = sb.toString();
        }
        if (!this.f71422h.get()) {
            bxy0.m106934r();
            C2098b.m12372k(this.f71419e, this.f71420f, string);
            return;
        }
        File file = this.f71423i;
        if (file == null) {
            dct0.m115298g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
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
                        dct0.m115299h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    dct0.m115299h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            dct0.m115299h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            dct0.m115299h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
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
