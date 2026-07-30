package p149l;

import android.content.Context;
import android.graphics.Rect;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zyr0 extends Thread {

    /* JADX INFO: renamed from: a */
    public boolean f205709a;

    /* JADX INFO: renamed from: b */
    public boolean f205710b;

    /* JADX INFO: renamed from: c */
    public final Object f205711c;

    /* JADX INFO: renamed from: d */
    public final qyr0 f205712d;

    /* JADX INFO: renamed from: e */
    public final int f205713e;

    /* JADX INFO: renamed from: f */
    public final int f205714f;

    /* JADX INFO: renamed from: g */
    public final int f205715g;

    /* JADX INFO: renamed from: h */
    public final int f205716h;

    /* JADX INFO: renamed from: i */
    public final int f205717i;

    /* JADX INFO: renamed from: j */
    public final int f205718j;

    /* JADX INFO: renamed from: k */
    public final int f205719k;

    /* JADX INFO: renamed from: l */
    public final int f205720l;

    /* JADX INFO: renamed from: m */
    public final String f205721m;

    /* JADX INFO: renamed from: n */
    public final boolean f205722n;

    /* JADX INFO: renamed from: o */
    public final boolean f205723o;

    /* JADX INFO: renamed from: p */
    public final boolean f205724p;

    public zyr0() {
        qyr0 qyr0Var = new qyr0();
        this.f205709a = false;
        this.f205710b = false;
        this.f205712d = qyr0Var;
        this.f205711c = new Object();
        this.f205714f = ((Long) k9s0.f122067d.m115379e()).intValue();
        this.f205715g = ((Long) k9s0.f122064a.m115379e()).intValue();
        this.f205716h = ((Long) k9s0.f122068e.m115379e()).intValue();
        this.f205717i = ((Long) k9s0.f122066c.m115379e()).intValue();
        this.f205718j = ((Integer) d1s0.m109677c().m144697a(m7s0.f132060S)).intValue();
        this.f205719k = ((Integer) d1s0.m109677c().m144697a(m7s0.f132072T)).intValue();
        this.f205720l = ((Integer) d1s0.m109677c().m144697a(m7s0.f132084U)).intValue();
        this.f205713e = ((Long) k9s0.f122069f.m115379e()).intValue();
        this.f205721m = (String) d1s0.m109677c().m144697a(m7s0.f132108W);
        this.f205722n = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132120X)).booleanValue();
        this.f205723o = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132132Y)).booleanValue();
        this.f205724p = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132144Z)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX INFO: renamed from: a */
    public final pyr0 m220937a() {
        return this.f205712d.m177058a(this.f205724p);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final yyr0 m220938b(@Nullable View view, pyr0 pyr0Var) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    pyr0Var.m172159k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new yyr0(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof q9t0)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    pyr0Var.m172156h();
                    webView.post(new xyr0(this, pyr0Var, webView, globalVisibleRect));
                    return new yyr0(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    yyr0 yyr0VarM220938b = m220938b(viewGroup.getChildAt(i3), pyr0Var);
                    i += yyr0VarM220938b.f200799a;
                    i2 += yyr0VarM220938b.f200800b;
                }
                return new yyr0(this, i, i2);
            }
        }
        return new yyr0(this, 0, 0);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final void m220939c(View view) {
        try {
            pyr0 pyr0Var = new pyr0(this.f205714f, this.f205715g, this.f205716h, this.f205717i, this.f205718j, this.f205719k, this.f205720l, this.f205723o);
            Context contextM196344b = vny0.m199066d().m196344b();
            if (contextM196344b != null && !TextUtils.isEmpty(this.f205721m)) {
                String str = (String) view.getTag(contextM196344b.getResources().getIdentifier((String) d1s0.m109677c().m144697a(m7s0.f132096V), "id", contextM196344b.getPackageName()));
                if (str != null && str.equals(this.f205721m)) {
                    return;
                }
            }
            yyr0 yyr0VarM220938b = m220938b(view, pyr0Var);
            pyr0Var.m172161m();
            if (yyr0VarM220938b.f200799a == 0 && yyr0VarM220938b.f200800b == 0) {
                return;
            }
            int i = yyr0VarM220938b.f200800b;
            if (i != 0) {
                if (i == 0) {
                }
                this.f205712d.m177059b(pyr0Var);
            } else if (pyr0Var.m172151c() == 0) {
                return;
            }
            if (this.f205712d.m177061d(pyr0Var)) {
                return;
            }
            this.f205712d.m177059b(pyr0Var);
        } catch (Exception e) {
            x2t0.m206867e("Exception in fetchContentOnUIThread", e);
            vny0.m199079q().m212290w(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m220940d(pyr0 pyr0Var, WebView webView, String str, boolean z) {
        pyr0 pyr0Var2;
        pyr0Var.m172155g();
        try {
            if (TextUtils.isEmpty(str)) {
                pyr0Var2 = pyr0Var;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f205722n || TextUtils.isEmpty(webView.getTitle())) {
                    pyr0Var2 = pyr0Var;
                    pyr0Var2.m172160l(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    pyr0Var.m172160l(webView.getTitle() + SignParameters.NEW_LINE + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    pyr0Var2 = pyr0Var;
                }
            }
            if (pyr0Var2.m172163o()) {
                this.f205712d.m177060c(pyr0Var2);
            }
        } catch (JSONException unused) {
            x2t0.m206864b("Json string may be malformed.");
        } catch (Throwable th) {
            x2t0.m206865c("Failed to get webview content.", th);
            vny0.m199079q().m212290w(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m220941e() {
        synchronized (this.f205711c) {
            try {
                if (this.f205709a) {
                    x2t0.m206864b("Content hash thread already started, quitting...");
                } else {
                    this.f205709a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m220942f() {
        synchronized (this.f205711c) {
            this.f205710b = true;
            x2t0.m206864b("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m220943g() {
        synchronized (this.f205711c) {
            this.f205710b = false;
            this.f205711c.notifyAll();
            x2t0.m206864b("ContentFetchThread: wakeup");
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m220944h() {
        return this.f205710b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ed */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.zyr0.run():void");
    }
}
