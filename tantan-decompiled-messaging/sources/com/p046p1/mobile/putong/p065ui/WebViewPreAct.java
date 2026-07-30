package com.p046p1.mobile.putong.p065ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Map;
import org.joor.Reflect;
import p149l.d30;
import p149l.dlp0;
import p149l.eqh0;
import p149l.ge80;
import p149l.p4c0;
import p149l.sw3;
import p149l.t100;
import p149l.thp0;
import p149l.u620;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class WebViewPreAct extends AppCompatActivity {

    /* JADX INFO: renamed from: o */
    public static Field f54284o = Reflect.m221135on((Class<?>) Toolbar.class).field0("mNavButtonView");

    /* JADX INFO: renamed from: p */
    public static Field f54285p = Reflect.m221135on((Class<?>) Toolbar.class).field0("mTitleTextView");

    /* JADX INFO: renamed from: c */
    public FrameLayout f54286c;

    /* JADX INFO: renamed from: d */
    public WebViewX f54287d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f54288e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54289f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f54290g;

    /* JADX INFO: renamed from: h */
    public ImageView f54291h;

    /* JADX INFO: renamed from: i */
    public String f54292i;

    /* JADX INFO: renamed from: j */
    public String f54293j;

    /* JADX INFO: renamed from: k */
    public boolean f54294k;

    /* JADX INFO: renamed from: l */
    public boolean f54295l;

    /* JADX INFO: renamed from: m */
    public ge80 f54296m;

    /* JADX INFO: renamed from: n */
    public d30 f54297n = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.WebViewPreAct$a */
    public class C13101a implements sw3.InterfaceC20043a {
        public C13101a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            WebViewPreAct.this.f54288e.setVisibility(8);
            if (TextUtils.isEmpty(WebViewPreAct.this.f54292i) && !TextUtils.isEmpty(WebViewPreAct.this.f54287d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && WebViewPreAct.this.f54289f.getVisibility() != 0) {
                WebViewPreAct webViewPreAct = WebViewPreAct.this;
                webViewPreAct.setTitle(webViewPreAct.f54287d.getTitle());
            }
            if (NullChecker.m81303a(WebViewPreAct.this.f54297n)) {
                WebViewPreAct.this.f54297n.call();
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            WebViewPreAct.this.f54289f.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static Intent m79402J0(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    /* JADX INFO: renamed from: K0 */
    public static Intent m79403K0(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", "");
        intent.putExtra("url", str);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("isbridge", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ Boolean m79404P0(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f54287d.loadUrl(str);
        return Boolean.TRUE;
    }

    public static void defaultOnHomePressed(Activity activity) {
        try {
            try {
                u620.m191908e(activity);
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public View m79405I0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dlp0.m112409b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L0 */
    public w9j<String, Boolean> m79406L0() {
        return new w9j() { // from class: l.clp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81457a.m79404P0((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public sw3.InterfaceC20043a m79407N0() {
        return new C13101a();
    }

    /* JADX INFO: renamed from: O0 */
    public void m79408O0(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f54293j)) {
            return;
        }
        sw3 sw3Var = new sw3(this, m79406L0(), false);
        sw3Var.setListener(m79407N0());
        this.f54287d.setWebViewClientX(sw3Var);
        this.f54287d.setWebChromeClientX(new thp0());
        boolean zM81303a = NullChecker.m81303a(map);
        WebViewX webViewX = this.f54287d;
        if (zM81303a) {
            webViewX.loadUrl(this.f54293j, map);
        } else {
            webViewX.loadUrl(this.f54293j);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f54292i = getIntent().getStringExtra("title");
        this.f54293j = getIntent().getStringExtra("url");
        this.f54294k = getIntent().getBooleanExtra("isbridge", false);
        boolean booleanExtra = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f54295l = booleanExtra;
        if (booleanExtra && NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134136w(true);
            getSupportActionBar().mo134111A(getSupportActionBar().mo134123j() / 2.0f);
            try {
                ImageButton imageButton = (ImageButton) f54284o.get(toolbar());
                if (NullChecker.m81304b(imageButton)) {
                    imageButton.setFocusable(false);
                }
                TextView textView = (TextView) f54285p.get(toolbar());
                if (NullChecker.m81304b(textView)) {
                    textView.setTypeface(eqh0.m117752c(3));
                }
                imageButton.setMinimumWidth(t100.m186890d(56.0f));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
            }
        }
        setContentView(m79405I0(LayoutInflater.from(this), null));
        setTitle(this.f54292i);
        m79408O0(null);
        if (this.f54294k) {
            ge80 ge80Var = new ge80(this, "", this.f54287d);
            this.f54296m = ge80Var;
            this.f54287d.addJavascriptInterface(ge80Var, "tantan");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (NullChecker.m81303a(this.f54296m)) {
            this.f54296m.m125684d();
        }
        if (NullChecker.m81303a(this.f54287d)) {
            this.f54287d.removeAllViews();
            this.f54286c.removeView(this.f54287d);
            this.f54287d.setTag(null);
            this.f54287d.clearHistory();
            this.f54287d.destroy();
            this.f54287d = null;
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f54287d.canGoBack() || this.f54287d.getUrl().equals(sw3.EMPTY_PAGE)) {
            finish();
            return true;
        }
        this.f54287d.goBack();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        defaultOnHomePressed(this);
        return true;
    }

    public Toolbar toolbar() {
        return (Toolbar) findViewById(p4c0.f147104a);
    }
}
