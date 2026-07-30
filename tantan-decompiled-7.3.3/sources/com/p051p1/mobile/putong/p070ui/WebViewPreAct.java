package com.p051p1.mobile.putong.p070ui;

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
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.Map;
import org.joor.Reflect;
import p153l.cf20;
import p153l.hup0;
import p153l.lyh0;
import p153l.mm80;
import p153l.qa00;
import p153l.qcj;
import p153l.rx3;
import p153l.vcc0;
import p153l.wqp0;
import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewPreAct extends AppCompatActivity {

    /* JADX INFO: renamed from: o */
    public static Field f55132o = Reflect.m222381on((Class<?>) Toolbar.class).field0("mNavButtonView");

    /* JADX INFO: renamed from: p */
    public static Field f55133p = Reflect.m222381on((Class<?>) Toolbar.class).field0("mTitleTextView");

    /* JADX INFO: renamed from: c */
    public FrameLayout f55134c;

    /* JADX INFO: renamed from: d */
    public WebViewX f55135d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f55136e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f55137f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f55138g;

    /* JADX INFO: renamed from: h */
    public ImageView f55139h;

    /* JADX INFO: renamed from: i */
    public String f55140i;

    /* JADX INFO: renamed from: j */
    public String f55141j;

    /* JADX INFO: renamed from: k */
    public boolean f55142k;

    /* JADX INFO: renamed from: l */
    public boolean f55143l;

    /* JADX INFO: renamed from: m */
    public mm80 f55144m;

    /* JADX INFO: renamed from: n */
    public x20 f55145n = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.WebViewPreAct$a */
    public class C13264a implements rx3.InterfaceC19928a {
        public C13264a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            WebViewPreAct.this.f55136e.setVisibility(8);
            if (TextUtils.isEmpty(WebViewPreAct.this.f55140i) && !TextUtils.isEmpty(WebViewPreAct.this.f55135d.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && WebViewPreAct.this.f55137f.getVisibility() != 0) {
                WebViewPreAct webViewPreAct = WebViewPreAct.this;
                webViewPreAct.setTitle(webViewPreAct.f55135d.getTitle());
            }
            if (NullChecker.m82486a(WebViewPreAct.this.f55145n)) {
                WebViewPreAct.this.f55145n.call();
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            WebViewPreAct.this.f55137f.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static Intent m80585K0(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    /* JADX INFO: renamed from: L0 */
    public static Intent m80586L0(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) WebViewPreAct.class);
        intent.putExtra("title", "");
        intent.putExtra("url", str);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("isbridge", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ Boolean m80587Q0(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f55135d.loadUrl(str);
        return Boolean.TRUE;
    }

    public static void defaultOnHomePressed(Activity activity) {
        try {
            try {
                cf20.m109510e(activity);
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public View m80588J0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hup0.m137251b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N0 */
    public qcj<String, Boolean> m80589N0() {
        return new qcj() { // from class: l.gup0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106532a.m80587Q0((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: O0 */
    public rx3.InterfaceC19928a m80590O0() {
        return new C13264a();
    }

    /* JADX INFO: renamed from: P0 */
    public void m80591P0(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f55141j)) {
            return;
        }
        rx3 rx3Var = new rx3(this, m80589N0(), false);
        rx3Var.setListener(m80590O0());
        this.f55135d.setWebViewClientX(rx3Var);
        this.f55135d.setWebChromeClientX(new wqp0());
        boolean zM82486a = NullChecker.m82486a(map);
        WebViewX webViewX = this.f55135d;
        if (zM82486a) {
            webViewX.loadUrl(this.f55141j, map);
        } else {
            webViewX.loadUrl(this.f55141j);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f55140i = getIntent().getStringExtra("title");
        this.f55141j = getIntent().getStringExtra("url");
        this.f55142k = getIntent().getBooleanExtra("isbridge", false);
        boolean booleanExtra = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f55143l = booleanExtra;
        if (booleanExtra && NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102196w(true);
            getSupportActionBar().mo102168A(getSupportActionBar().mo102183j() / 2.0f);
            try {
                ImageButton imageButton = (ImageButton) f55132o.get(toolbar());
                if (NullChecker.m82487b(imageButton)) {
                    imageButton.setFocusable(false);
                }
                TextView textView = (TextView) f55133p.get(toolbar());
                if (NullChecker.m82487b(textView)) {
                    textView.setTypeface(lyh0.m156283c(3));
                }
                imageButton.setMinimumWidth(qa00.m175859d(56.0f));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
            }
        }
        setContentView(m80588J0(LayoutInflater.from(this), null));
        setTitle(this.f55140i);
        m80591P0(null);
        if (this.f55142k) {
            mm80 mm80Var = new mm80(this, "", this.f55135d);
            this.f55144m = mm80Var;
            this.f55135d.addJavascriptInterface(mm80Var, "tantan");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (NullChecker.m82486a(this.f55144m)) {
            this.f55144m.m159049d();
        }
        if (NullChecker.m82486a(this.f55135d)) {
            this.f55135d.removeAllViews();
            this.f55134c.removeView(this.f55135d);
            this.f55135d.setTag(null);
            this.f55135d.clearHistory();
            this.f55135d.destroy();
            this.f55135d = null;
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f55135d.canGoBack() || this.f55135d.getUrl().equals(rx3.EMPTY_PAGE)) {
            finish();
            return true;
        }
        this.f55135d.goBack();
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
        return (Toolbar) findViewById(vcc0.f183404a);
    }
}
