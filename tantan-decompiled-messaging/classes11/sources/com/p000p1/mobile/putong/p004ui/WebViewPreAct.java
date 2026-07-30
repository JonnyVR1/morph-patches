package com.p000p1.mobile.putong.p004ui;

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
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Map;
import l.d30;
import l.dlp0;
import l.eqh0;
import l.p4c0;
import l.t100;
import l.thp0;
import l.u620;
import l.w9j;
import org.joor.Reflect;
import p009l.ge80;
import p009l.sw3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WebViewPreAct extends AppCompatActivity {

    /* JADX INFO: renamed from: o */
    public static Field f7890o = Reflect.on(Toolbar.class).field0("mNavButtonView");

    /* JADX INFO: renamed from: p */
    public static Field f7891p = Reflect.on(Toolbar.class).field0("mTitleTextView");

    /* JADX INFO: renamed from: c */
    public FrameLayout f7892c;

    /* JADX INFO: renamed from: d */
    public WebViewX f7893d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f7894e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7895f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f7896g;

    /* JADX INFO: renamed from: h */
    public ImageView f7897h;

    /* JADX INFO: renamed from: i */
    public String f7898i;

    /* JADX INFO: renamed from: j */
    public String f7899j;

    /* JADX INFO: renamed from: k */
    public boolean f7900k;

    /* JADX INFO: renamed from: l */
    public boolean f7901l;

    /* JADX INFO: renamed from: m */
    public ge80 f7902m;

    /* JADX INFO: renamed from: n */
    public d30 f7903n = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.WebViewPreAct$a */
    public class C0503a implements sw3.InterfaceC1195a {
        public C0503a() {
        }

        /* JADX WARN: Type inference failed for: r3v8, types: [android.app.Activity, com.p1.mobile.putong.ui.WebViewPreAct] */
        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            WebViewPreAct.this.f7894e.setVisibility(8);
            if (TextUtils.isEmpty(WebViewPreAct.this.f7898i) && !TextUtils.isEmpty(WebViewPreAct.this.f7893d.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && WebViewPreAct.this.f7895f.getVisibility() != 0) {
                ?? r3 = WebViewPreAct.this;
                r3.setTitle(r3.f7893d.getTitle());
            }
            if (NullChecker.a(WebViewPreAct.this.f7903n)) {
                WebViewPreAct.this.f7903n.call();
            }
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            WebViewPreAct.this.f7895f.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static Intent m9723J0(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    /* JADX INFO: renamed from: K0 */
    public static Intent m9724K0(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", "");
        intent.putExtra("url", str);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("isbridge", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ Boolean m9725P0(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f7893d.loadUrl(str);
        return Boolean.TRUE;
    }

    public static void defaultOnHomePressed(Activity activity) {
        try {
            try {
                u620.e(activity);
            } catch (Exception e) {
                CrashHelper.c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public View m9726I0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dlp0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L0 */
    public w9j<String, Boolean> m9727L0() {
        return new w9j() { // from class: l.clp0
            public final Object call(Object obj) {
                return this.f10662a.m9725P0((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public sw3.InterfaceC1195a m9728N0() {
        return new C0503a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public void m9729O0(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f7899j)) {
            return;
        }
        sw3 sw3Var = new sw3(this, m9727L0(), false);
        sw3Var.setListener(m9728N0());
        this.f7893d.setWebViewClientX(sw3Var);
        this.f7893d.setWebChromeClientX(new thp0());
        boolean zA = NullChecker.a(map);
        WebViewX webViewX = this.f7893d;
        if (zA) {
            webViewX.loadUrl(this.f7899j, map);
        } else {
            webViewX.loadUrl(this.f7899j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f7898i = getIntent().getStringExtra("title");
        this.f7899j = getIntent().getStringExtra("url");
        this.f7900k = getIntent().getBooleanExtra("isbridge", false);
        boolean booleanExtra = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f7901l = booleanExtra;
        if (booleanExtra && NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().w(true);
            getSupportActionBar().A(getSupportActionBar().j() / 2.0f);
            try {
                ImageButton imageButton = (ImageButton) f7890o.get(toolbar());
                if (NullChecker.b(imageButton)) {
                    imageButton.setFocusable(false);
                }
                TextView textView = (TextView) f7891p.get(toolbar());
                if (NullChecker.b(textView)) {
                    textView.setTypeface(eqh0.c(3));
                }
                imageButton.setMinimumWidth(t100.d(56.0f));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
            }
        }
        setContentView(m9726I0(LayoutInflater.from(this), null));
        setTitle(this.f7898i);
        m9729O0(null);
        if (this.f7900k) {
            ge80 ge80Var = new ge80(this, "", this.f7893d);
            this.f7902m = ge80Var;
            this.f7893d.addJavascriptInterface(ge80Var, "tantan");
        }
    }

    public void onDestroy() {
        if (NullChecker.a(this.f7902m)) {
            this.f7902m.m14918d();
        }
        if (NullChecker.a(this.f7893d)) {
            this.f7893d.removeAllViews();
            this.f7892c.removeView(this.f7893d);
            this.f7893d.setTag(null);
            this.f7893d.clearHistory();
            this.f7893d.destroy();
            this.f7893d = null;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f7893d.canGoBack() || this.f7893d.getUrl().equals(sw3.EMPTY_PAGE)) {
            finish();
            return true;
        }
        this.f7893d.goBack();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        defaultOnHomePressed(this);
        return true;
    }

    public Toolbar toolbar() {
        return findViewById(p4c0.a);
    }
}
