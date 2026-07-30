package p153l;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f8s0 extends Thread {

    /* JADX INFO: renamed from: a */
    public boolean f97757a;

    /* JADX INFO: renamed from: b */
    public boolean f97758b;

    /* JADX INFO: renamed from: c */
    public final Object f97759c;

    /* JADX INFO: renamed from: d */
    public final w7s0 f97760d;

    /* JADX INFO: renamed from: e */
    public final int f97761e;

    /* JADX INFO: renamed from: f */
    public final int f97762f;

    /* JADX INFO: renamed from: g */
    public final int f97763g;

    /* JADX INFO: renamed from: h */
    public final int f97764h;

    /* JADX INFO: renamed from: i */
    public final int f97765i;

    /* JADX INFO: renamed from: j */
    public final int f97766j;

    /* JADX INFO: renamed from: k */
    public final int f97767k;

    /* JADX INFO: renamed from: l */
    public final int f97768l;

    /* JADX INFO: renamed from: m */
    public final String f97769m;

    /* JADX INFO: renamed from: n */
    public final boolean f97770n;

    /* JADX INFO: renamed from: o */
    public final boolean f97771o;

    /* JADX INFO: renamed from: p */
    public final boolean f97772p;

    public f8s0() {
        w7s0 w7s0Var = new w7s0();
        this.f97757a = false;
        this.f97758b = false;
        this.f97760d = w7s0Var;
        this.f97759c = new Object();
        this.f97762f = ((Long) qis0.f157866d.m149974e()).intValue();
        this.f97763g = ((Long) qis0.f157863a.m149974e()).intValue();
        this.f97764h = ((Long) qis0.f157867e.m149974e()).intValue();
        this.f97765i = ((Long) qis0.f157865c.m149974e()).intValue();
        this.f97766j = ((Integer) jas0.m144075c().m176505a(sgs0.f168131S)).intValue();
        this.f97767k = ((Integer) jas0.m144075c().m176505a(sgs0.f168143T)).intValue();
        this.f97768l = ((Integer) jas0.m144075c().m176505a(sgs0.f168155U)).intValue();
        this.f97761e = ((Long) qis0.f157868f.m149974e()).intValue();
        this.f97769m = (String) jas0.m144075c().m176505a(sgs0.f168179W);
        this.f97770n = ((Boolean) jas0.m144075c().m176505a(sgs0.f168191X)).booleanValue();
        this.f97771o = ((Boolean) jas0.m144075c().m176505a(sgs0.f168203Y)).booleanValue();
        this.f97772p = ((Boolean) jas0.m144075c().m176505a(sgs0.f168215Z)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX INFO: renamed from: a */
    public final v7s0 m124554a() {
        return this.f97760d.m205384a(this.f97772p);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final e8s0 m124555b(@Nullable View view, v7s0 v7s0Var) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    v7s0Var.m200267k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new e8s0(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof wit0)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    v7s0Var.m200264h();
                    webView.post(new d8s0(this, v7s0Var, webView, globalVisibleRect));
                    return new e8s0(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    e8s0 e8s0VarM124555b = m124555b(viewGroup.getChildAt(i3), v7s0Var);
                    i += e8s0VarM124555b.f92559a;
                    i2 += e8s0VarM124555b.f92560b;
                }
                return new e8s0(this, i, i2);
            }
        }
        return new e8s0(this, 0, 0);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final void m124556c(View view) {
        try {
            v7s0 v7s0Var = new v7s0(this.f97762f, this.f97763g, this.f97764h, this.f97765i, this.f97766j, this.f97767k, this.f97768l, this.f97771o);
            Context contextM96484b = bxy0.m106920d().m96484b();
            if (contextM96484b != null && !TextUtils.isEmpty(this.f97769m)) {
                String str = (String) view.getTag(contextM96484b.getResources().getIdentifier((String) jas0.m144075c().m176505a(sgs0.f168167V), "id", contextM96484b.getPackageName()));
                if (str != null && str.equals(this.f97769m)) {
                    return;
                }
            }
            e8s0 e8s0VarM124555b = m124555b(view, v7s0Var);
            v7s0Var.m200269m();
            if (e8s0VarM124555b.f92559a == 0 && e8s0VarM124555b.f92560b == 0) {
                return;
            }
            int i = e8s0VarM124555b.f92560b;
            if (i != 0) {
                if (i == 0) {
                }
                this.f97760d.m205385b(v7s0Var);
            } else if (v7s0Var.m200259c() == 0) {
                return;
            }
            if (this.f97760d.m205387d(v7s0Var)) {
                return;
            }
            this.f97760d.m205385b(v7s0Var);
        } catch (Exception e) {
            dct0.m115296e("Exception in fetchContentOnUIThread", e);
            bxy0.m106933q().m120275w(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m124557d(v7s0 v7s0Var, WebView webView, String str, boolean z) {
        v7s0 v7s0Var2;
        v7s0Var.m200263g();
        try {
            if (TextUtils.isEmpty(str)) {
                v7s0Var2 = v7s0Var;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f97770n || TextUtils.isEmpty(webView.getTitle())) {
                    v7s0Var2 = v7s0Var;
                    v7s0Var2.m200268l(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    v7s0Var.m200268l(webView.getTitle() + SignParameters.NEW_LINE + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    v7s0Var2 = v7s0Var;
                }
            }
            if (v7s0Var2.m200271o()) {
                this.f97760d.m205386c(v7s0Var2);
            }
        } catch (JSONException unused) {
            dct0.m115293b("Json string may be malformed.");
        } catch (Throwable th) {
            dct0.m115294c("Failed to get webview content.", th);
            bxy0.m106933q().m120275w(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m124558e() {
        synchronized (this.f97759c) {
            try {
                if (this.f97757a) {
                    dct0.m115293b("Content hash thread already started, quitting...");
                } else {
                    this.f97757a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m124559f() {
        synchronized (this.f97759c) {
            this.f97758b = true;
            dct0.m115293b("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m124560g() {
        synchronized (this.f97759c) {
            this.f97758b = false;
            this.f97759c.notifyAll();
            dct0.m115293b("ContentFetchThread: wakeup");
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m124561h() {
        return this.f97758b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ed */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                Context contextM96484b = bxy0.m106920d().m96484b();
                try {
                    if (contextM96484b != null) {
                        ActivityManager activityManager = (ActivityManager) contextM96484b.getSystemService("activity");
                        KeyguardManager keyguardManager = (KeyguardManager) contextM96484b.getSystemService("keyguard");
                        if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (Process.myPid() == next.pid) {
                                        if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) contextM96484b.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                            Activity activityM96483a = bxy0.m106920d().m96483a();
                                            if (activityM96483a == null) {
                                                dct0.m115293b("ContentFetchThread: no activity. Sleeping.");
                                                m124559f();
                                            } else {
                                                View viewFindViewById = null;
                                                try {
                                                    if (activityM96483a.getWindow() != null && activityM96483a.getWindow().getDecorView() != null) {
                                                        viewFindViewById = activityM96483a.getWindow().getDecorView().findViewById(R.id.content);
                                                    }
                                                } catch (Exception e) {
                                                    bxy0.m106933q().m120275w(e, "ContentFetchTask.extractContent");
                                                    dct0.m115293b("Failed getting root view of activity. Content not extracted.");
                                                }
                                                if (viewFindViewById != null) {
                                                    viewFindViewById.post(new b8s0(this, viewFindViewById));
                                                }
                                            }
                                        }
                                        Thread.sleep(this.f97761e * 1000);
                                    }
                                }
                            }
                        }
                        synchronized (this.f97759c) {
                            while (this.f97758b) {
                                try {
                                    dct0.m115293b("ContentFetchTask: waiting");
                                    this.f97759c.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                    dct0.m115293b("ContentFetchTask: sleeping");
                    m124559f();
                    Thread.sleep(this.f97761e * 1000);
                } catch (InterruptedException e2) {
                    dct0.m115296e("Error in ContentFetchTask", e2);
                } catch (Exception e3) {
                    dct0.m115296e("Error in ContentFetchTask", e3);
                    bxy0.m106933q().m120275w(e3, "ContentFetchTask.run");
                }
            } catch (Throwable th) {
                bxy0.m106933q().m120275w(th, "ContentFetchTask.isInForeground");
            }
            synchronized (this.f97759c) {
                while (this.f97758b) {
                    dct0.m115293b("ContentFetchTask: waiting");
                    this.f97759c.wait();
                }
            }
        }
    }
}
