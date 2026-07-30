package com.hellogroup.p036mk.business.p038ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.thread.MMThreadExecutors;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.R$string;
import com.hellogroup.p036mk.business.base.activity.BaseMkActivity;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.hellogroup.p036mk.business.debug.DebugTips;
import com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity;
import com.hellogroup.p036mk.business.widget.MKResizeListenerLayout;
import com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import p153l.a6k0;
import p153l.ajw;
import p153l.amw;
import p153l.ave0;
import p153l.bjw;
import p153l.brw;
import p153l.c2j0;
import p153l.c8c0;
import p153l.cn80;
import p153l.ej2;
import p153l.glw;
import p153l.gpj0;
import p153l.i8g0;
import p153l.jkw;
import p153l.jzv;
import p153l.kjw;
import p153l.kx2;
import p153l.lpj0;
import p153l.lv0;
import p153l.mjw;
import p153l.njw;
import p153l.nxl;
import p153l.pcc0;
import p153l.q4g0;
import p153l.rkw;
import p153l.sjw;
import p153l.skw;
import p153l.t1j0;
import p153l.tkw;
import p153l.ukw;
import p153l.w9c0;
import p153l.wam;
import p153l.wi20;
import p153l.x310;
import p153l.xac0;
import p153l.yfi;
import p153l.zkw;
import p153l.zlw;
import p153l.zqw;
import p153l.zue0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseMKProxyActivity extends BaseMkActivity implements View.OnTouchListener, ukw {

    /* JADX INFO: renamed from: Y */
    public static int f12174Y = lpj0.m155251g();

    /* JADX INFO: renamed from: A */
    private View f12175A;

    /* JADX INFO: renamed from: B */
    private Toolbar f12176B;

    /* JADX INFO: renamed from: C */
    private TextView f12177C;

    /* JADX INFO: renamed from: E */
    private amw f12179E;

    /* JADX INFO: renamed from: F */
    protected boolean f12180F;

    /* JADX INFO: renamed from: G */
    protected String f12181G;

    /* JADX INFO: renamed from: H */
    protected String f12182H;

    /* JADX INFO: renamed from: I */
    protected String f12183I;

    /* JADX INFO: renamed from: J */
    private njw f12184J;

    /* JADX INFO: renamed from: N */
    private Configuration f12188N;

    /* JADX INFO: renamed from: O */
    private DebugTips f12189O;

    /* JADX INFO: renamed from: R */
    private int f12192R;

    /* JADX INFO: renamed from: h */
    public MKResizeListenerLayout f12202h;

    /* JADX INFO: renamed from: i */
    private MKSwipeRefreshLayout f12203i;

    /* JADX INFO: renamed from: j */
    @Nullable
    protected MKWebView f12204j;

    /* JADX INFO: renamed from: k */
    @Nullable
    protected MKWebViewHelper f12205k;

    /* JADX INFO: renamed from: l */
    protected tkw f12206l;

    /* JADX INFO: renamed from: n */
    protected TextView f12208n;

    /* JADX INFO: renamed from: o */
    protected ImageView f12209o;

    /* JADX INFO: renamed from: p */
    private MenuItem f12210p;

    /* JADX INFO: renamed from: q */
    private MenuItem f12211q;

    /* JADX INFO: renamed from: r */
    private C3545i f12212r;

    /* JADX INFO: renamed from: s */
    private View f12213s;

    /* JADX INFO: renamed from: t */
    private View f12214t;

    /* JADX INFO: renamed from: u */
    private View f12215u;

    /* JADX INFO: renamed from: w */
    private wam f12217w;

    /* JADX INFO: renamed from: x */
    public String f12218x;

    /* JADX INFO: renamed from: y */
    private Disposable f12219y;

    /* JADX INFO: renamed from: e */
    private final long f12199e = 15000;

    /* JADX INFO: renamed from: f */
    public int f12200f = (int) (lpj0.m155250f() * 265.0f);

    /* JADX INFO: renamed from: g */
    public int f12201g = lpj0.m155252h();

    /* JADX INFO: renamed from: m */
    private ArrayList<rkw> f12207m = null;

    /* JADX INFO: renamed from: v */
    private int f12216v = 0;

    /* JADX INFO: renamed from: z */
    private int f12220z = 5;

    /* JADX INFO: renamed from: D */
    private Object f12178D = "MomoMKWebActivity#" + hashCode();

    /* JADX INFO: renamed from: K */
    private boolean f12185K = false;

    /* JADX INFO: renamed from: L */
    private boolean f12186L = false;

    /* JADX INFO: renamed from: M */
    private boolean f12187M = false;

    /* JADX INFO: renamed from: P */
    boolean f12190P = false;

    /* JADX INFO: renamed from: Q */
    private MKWebView.InterfaceC3514f f12191Q = new C3537a();

    /* JADX INFO: renamed from: S */
    private int f12193S = -404;

    /* JADX INFO: renamed from: T */
    private String f12194T = null;

    /* JADX INFO: renamed from: U */
    protected MenuItem.OnMenuItemClickListener f12195U = new MenuItemOnMenuItemClickListenerC3540d();

    /* JADX INFO: renamed from: V */
    private skw f12196V = new C3541e();

    /* JADX INFO: renamed from: W */
    protected String f12197W = null;

    /* JADX INFO: renamed from: X */
    private HandlerC3544h f12198X = new HandlerC3544h(this);

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$a */
    public class C3537a implements MKWebView.InterfaceC3514f {
        public C3537a() {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m18124e(C3537a c3537a, String str, int i) {
            c3537a.getClass();
            jzv.m147734g("MKActivity", "loadError");
            BaseMKProxyActivity.this.m18093D2(false, false, "loadError");
            BaseMKProxyActivity baseMKProxyActivity = BaseMKProxyActivity.this;
            baseMKProxyActivity.m18095F2(true, str, false, "loadError", baseMKProxyActivity.m18048F1(i), wi20.m206537a() != -1);
            BaseMKProxyActivity.this.m18078n2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m18126g(boolean z, final String str) {
            BaseMKProxyActivity.this.m18093D2(true, false, "native");
            if (z) {
                BaseMKProxyActivity.this.m18078n2();
                BaseMKProxyActivity baseMKProxyActivity = BaseMKProxyActivity.this;
                baseMKProxyActivity.f12219y = Flowable.timer(baseMKProxyActivity.f12220z, TimeUnit.SECONDS, MMThreadExecutors.INSTANCE.m17549a().mo17551a()).subscribe(new Consumer() { // from class: com.hellogroup.mk.business.ui.c
                });
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: a */
        public void mo17937a(String str) {
            if (BaseMKProxyActivity.this.mo18105Q2()) {
                return;
            }
            BaseMKProxyActivity.this.m18064c2(str);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: b */
        public void mo17938b(String str) {
            if (BaseMKProxyActivity.this.mo18105Q2()) {
                BaseMKProxyActivity.this.m18064c2(str);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: c */
        public void mo17939c(final String str, final boolean z) {
            jzv.m147734g("MKActivity", "loadUrlStart url --> " + str);
            BaseMKProxyActivity baseMKProxyActivity = BaseMKProxyActivity.this;
            baseMKProxyActivity.f12190P = false;
            x310.m209185c(baseMKProxyActivity.f12178D, new Runnable() { // from class: com.hellogroup.mk.business.ui.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12290a.m18126g(z, str);
                }
            });
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: d */
        public void mo17940d(final String str, final int i, String str2) {
            BaseMKProxyActivity baseMKProxyActivity = BaseMKProxyActivity.this;
            baseMKProxyActivity.f12190P = true;
            x310.m209185c(baseMKProxyActivity.f12178D, new Runnable() { // from class: com.hellogroup.mk.business.ui.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseMKProxyActivity.C3537a.m18124e(this.f12293a, str, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$b */
    public class ViewOnClickListenerC3538b implements View.OnClickListener {
        public ViewOnClickListenerC3538b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMKProxyActivity.this.mo17780Q0();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$c */
    public class ViewOnClickListenerC3539c implements View.OnClickListener {
        public ViewOnClickListenerC3539c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jkw.m145928a(BaseMKProxyActivity.this);
            BaseMKProxyActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$d */
    public class MenuItemOnMenuItemClickListenerC3540d implements MenuItem.OnMenuItemClickListener {
        public MenuItemOnMenuItemClickListenerC3540d() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            BaseMKProxyActivity.this.m18069g2();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$e */
    public class C3541e implements skw {
        public C3541e() {
        }

        @Override // p153l.skw
        /* JADX INFO: renamed from: a */
        public void mo18127a(View view, rkw rkwVar) {
            BaseMKProxyActivity.this.f12204j.mo17918d(rkwVar.f163654d, null);
            BaseMKProxyActivity.this.f12206l.m191595e();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$f */
    public class RunnableC3542f implements Runnable {
        public RunnableC3542f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseMKProxyActivity.this.f12211q != null) {
                BaseMKProxyActivity.this.f12211q.setVisible(false);
            }
            BaseMKProxyActivity.this.f12211q = null;
            BaseMKProxyActivity.this.m18109Z1();
            ((BaseMkActivity) BaseMKProxyActivity.this).f12005c.m107693e();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$g */
    public class C3543g implements MKSwipeRefreshLayout.InterfaceC3584j {
        public C3543g() {
        }

        @Override // com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout.InterfaceC3584j
        /* JADX INFO: renamed from: p */
        public void mo18128p() {
            boolean zM206544h = wi20.m206544h();
            BaseMKProxyActivity baseMKProxyActivity = BaseMKProxyActivity.this;
            if (!zM206544h) {
                baseMKProxyActivity.f12203i.setRefreshing(false);
                t1j0.m188919o(R$string.f12003a);
                BaseMKProxyActivity.this.f12198X.removeMessages(1);
            } else {
                if (TextUtils.isEmpty(baseMKProxyActivity.f12197W)) {
                    BaseMKProxyActivity.this.f12203i.setRefreshing(false);
                    return;
                }
                jzv.m147728a("MKActivity", "触发下拉刷新");
                BaseMKProxyActivity baseMKProxyActivity2 = BaseMKProxyActivity.this;
                baseMKProxyActivity2.f12204j.mo17918d(baseMKProxyActivity2.f12197W, null);
                BaseMKProxyActivity.this.f12198X.removeMessages(1);
                BaseMKProxyActivity.this.f12198X.sendEmptyMessageDelayed(1, 15000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$h */
    public static class HandlerC3544h extends gpj0<BaseMKProxyActivity> {
        public HandlerC3544h(BaseMKProxyActivity baseMKProxyActivity) {
            super(baseMKProxyActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseMKProxyActivity baseMKProxyActivityM131281a;
            if (m131281a() == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                m131281a().m18067e2();
            } else if (i == 2) {
                BaseMKProxyActivity baseMKProxyActivityM131281a2 = m131281a();
                if (baseMKProxyActivityM131281a2 != null) {
                    baseMKProxyActivityM131281a2.m18066d2();
                }
            } else if (i == 3 && (baseMKProxyActivityM131281a = m131281a()) != null) {
                baseMKProxyActivityM131281a.m18103N2();
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.BaseMKProxyActivity$i */
    public class C3545i extends MKWebViewHelper.C3521b {
        public C3545i(nxl nxlVar) {
            super(nxlVar);
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ Unit m18129p(C3545i c3545i) {
            BaseMKProxyActivity.this.m18118w1();
            return null;
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            BaseMKProxyActivity.this.m18112h2(webView, i, str, str2);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            i8g0.m139003e(str);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
            BaseMKProxyActivity.this.m18120y1();
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: h */
        public void mo18130h(WebView webView, int i) {
            super.mo18130h(webView, i);
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: l */
        public void mo18131l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            super.mo18131l(webView, renderProcessGoneDetail);
            if (BaseMKProxyActivity.this.f12179E != null) {
                BaseMKProxyActivity.this.f12179E.m98862c(BaseMKProxyActivity.this.f12204j, webView, new Function0() { // from class: com.hellogroup.mk.business.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseMKProxyActivity.C3545i.m18129p(this.f12298a);
                    }
                });
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: n */
        public WebResourceResponse mo18132n(WebView webView, String str) {
            return BaseMKProxyActivity.this.m18111b2(webView, str);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private void m18044A2() {
        MKSwipeRefreshLayout mKSwipeRefreshLayout = (MKSwipeRefreshLayout) findViewById(pcc0.f151559m);
        this.f12203i = mKSwipeRefreshLayout;
        mKSwipeRefreshLayout.setColorSchemeColors(getResources().getColor(w9c0.f187995a));
        this.f12203i.m18290n(true, lpj0.m155247c(64.0f));
        this.f12203i.setOnRefreshListener(new C3543g());
        m18121y2(false);
    }

    /* JADX INFO: renamed from: B1 */
    private void m18045B1(String str) {
        if (i8g0.m139002d(str)) {
            Uri uri = Uri.parse(str);
            this.f12180F = "1".equals(uri.getQueryParameter("_clsL"));
            this.f12181G = uri.getQueryParameter("_loading");
            this.f12182H = uri.getQueryParameter("_bg_color");
            this.f12183I = uri.getQueryParameter("_navbar");
        }
    }

    /* JADX INFO: renamed from: C1 */
    private boolean m18046C1(Uri uri, boolean z, String str, String str2, String str3, String str4) {
        if (!String.valueOf(512).equals(str)) {
            return false;
        }
        m18083q2(uri);
        q4g0.m175218f(getWindow());
        View viewM107694f = this.f12005c.m107694f();
        if (viewM107694f != null) {
            int iM175215c = q4g0.m175215c(lv0.m155971a());
            m18086s2(viewM107694f, iM175215c);
            View view = this.f12213s;
            if (view != null) {
                m18086s2(view, iM175215c);
            }
        }
        m17782S0("1".equals(str2));
        if (!z) {
            return true;
        }
        ajw.m98498g(this, null);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: E1 */
    private static Integer m18047E1(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 6) {
            return null;
        }
        if (!str.startsWith("#")) {
            str = "#".concat(str);
        }
        return Integer.valueOf(Color.parseColor(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public String m18048F1(int i) {
        if (i < 400 || i >= 500) {
            return (i < 500 || i >= 600) ? "Oops! 出错了" : "Internal Server Error";
        }
        return "PAGE NOT FOUND";
    }

    /* JADX INFO: renamed from: J1 */
    private Uri m18049J1(String str) {
        if (i8g0.m139001c(str)) {
            str = getIntent().getStringExtra("param_start_url");
        }
        if (i8g0.m139001c(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    /* JADX INFO: renamed from: K2 */
    public static void m18050K2(Class<? extends BaseMKProxyActivity> cls, Context context, String str) {
        m18052L2(cls, context, str, null, null);
    }

    /* JADX INFO: renamed from: L1 */
    private String m18051L1(String str) {
        Uri uriM18049J1 = m18049J1(str);
        if (uriM18049J1 != null) {
            return uriM18049J1.getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: L2 */
    public static void m18052L2(Class<? extends BaseMKProxyActivity> cls, Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("param_start_url", str);
        if (i8g0.m139002d(str2)) {
            intent.putExtra("PARAM_PRE_FETCHE", str2);
        }
        if (i8g0.m139002d(str3)) {
            intent.putExtra("PARAMS_FOR_URL", str3);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        zqw.m221059k(intent, str);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: M2 */
    private void m18053M2(final Configuration configuration) {
        MKWebView mKWebView;
        HandlerC3544h handlerC3544h;
        if (configuration != null) {
            try {
                jzv.m147732e("MKActivity", "Configuration=" + configuration.screenWidthDp);
                int iM155251g = lpj0.m155251g();
                int iM155252h = lpj0.m155252h();
                if (iM155252h > 0 && (mKWebView = this.f12204j) != null) {
                    boolean z = this.f12186L;
                    if (!z) {
                        mKWebView.m17921e1();
                    }
                    this.f12204j.m17931s1(this.f12202h, iM155252h, iM155251g, true);
                    HandlerC3544h handlerC3544h2 = this.f12198X;
                    if (handlerC3544h2 != null) {
                        handlerC3544h2.postDelayed(new Runnable() { // from class: l.cp2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f82955a.m18110a2(configuration);
                            }
                        }, 300L);
                    }
                    if (!z && (handlerC3544h = this.f12198X) != null) {
                        handlerC3544h.sendEmptyMessageDelayed(2, 1000L);
                    }
                }
            } catch (Throwable th) {
                try {
                    jzv.m147730c("MKActivity", "", th);
                } finally {
                    this.f12188N = null;
                    this.f12187M = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O1 */
    private void m18054O1() {
        if (this.f12213s == null) {
            View viewInflate = ((ViewStub) findViewById(pcc0.f151554h)).inflate();
            this.f12213s = viewInflate;
            this.f12214t = viewInflate.findViewById(pcc0.f151550d);
            this.f12215u = this.f12213s.findViewById(pcc0.f151551e);
            this.f12177C = (TextView) this.f12213s.findViewById(pcc0.f151567u);
            this.f12175A = this.f12213s.findViewById(pcc0.f151549c);
            Toolbar toolbar = (Toolbar) this.f12213s.findViewById(pcc0.f151565s);
            this.f12176B = toolbar;
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ap2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72684a.finish();
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    private boolean m18055S1(String str, String str2) {
        return m18056T1(str, str2, null);
    }

    /* JADX INFO: renamed from: T1 */
    private boolean m18056T1(String str, String str2, zlw zlwVar) {
        boolean z;
        this.f12218x = str;
        setTitle("");
        try {
            MKWebView mKWebViewM111493h = cn80.m111487g().m111493h(str);
            this.f12204j = mKWebViewM111493h;
            if (mKWebViewM111493h == null) {
                MKWebView mKWebViewM158641s = mjw.INSTANCE.m158641s(this, str, getIntent());
                if (mKWebViewM158641s != null) {
                    this.f12204j = mKWebViewM158641s;
                } else {
                    this.f12204j = new MKWebView(this, brw.m106162a(getIntent(), str));
                }
                z = false;
            } else {
                z = true;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f12204j.setLayerType(2, null);
            }
            if (zlwVar != null) {
                this.f12204j.m17906I0(zlwVar.getMkRebuildData());
            }
            this.f12204j.setLayoutParams(cn80.m111486f());
            this.f12204j.m17930r1(this.f12202h, this.f12201g, f12174Y);
            if (this.f12204j.getParent() == null) {
                this.f12203i.addView(this.f12204j);
            }
            this.f12204j.setOnTouchListener(this);
            if (this.f12205k == null) {
                MKWebViewHelper mKWebViewHelperM18097H1 = m18097H1();
                this.f12205k = mKWebViewHelperM18097H1;
                if (mKWebViewHelperM18097H1 == null) {
                    this.f12205k = new zkw(str);
                }
            }
            this.f12205k.m17975z(this, this.f12204j);
            this.f12205k.mo17971s(sjw.m186321j(str), str);
            if (this.f12212r == null) {
                this.f12212r = new C3545i(this.f12205k);
            }
            this.f12204j.setMKWebLoadListener(this.f12212r);
            this.f12204j.setOnLoadUrlListener(this.f12191Q);
            m18104P1();
            m18113l2(str);
            if (this.f12217w == null) {
                this.f12217w = mo18102M1();
            }
            wam wamVar = this.f12217w;
            if (wamVar != null) {
                this.f12204j.setWebChooseFile(wamVar);
            }
            m18051L1(str);
            if (z) {
                jzv.m147728a("MKActivity", String.format("预加载，需要手动触发 onPageStarted:%s", str));
                this.f12212r.mo17980g(this.f12204j, str, null);
            } else {
                this.f12204j.loadUrl(str);
            }
            if (kx2.m151779a(str)) {
                this.f12204j.mo17924h("forbidLeftSlide");
            }
            cn80.m111489k(this.f12204j, str2);
            m18057U1(str);
            return true;
        } catch (Throwable th) {
            jzv.m147730c("MKActivity", "", th);
            MKWebView mKWebView = this.f12204j;
            if (mKWebView != null && !mKWebView.mo17920e()) {
                MKCoreLogManager.m18431i(this.f12204j.getLogSessionKey()).m211441P(th.getMessage());
            }
            t1j0.m188916l(R$string.f12004b);
            finish();
            return false;
        }
    }

    /* JADX INFO: renamed from: U1 */
    private void m18057U1(String str) {
        if (sjw.m186327p()) {
            DebugTips debugTips = this.f12189O;
            if (debugTips != null) {
                debugTips.setText(DebugTips.m18029c(a6k0.m96329a(str)));
            } else {
                this.f12189O = DebugTips.m18033g(this, str, lpj0.m155252h(), lpj0.m155251g());
                DebugTips.m18028b(this).addView(this.f12189O);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m18059W0(BaseMKProxyActivity baseMKProxyActivity, String str) {
        baseMKProxyActivity.getClass();
        jzv.m147734g("MKActivity", "loadUrlEnd + url --> " + str);
        baseMKProxyActivity.m18093D2(false, false, "native");
        baseMKProxyActivity.m18095F2(false, str, false, "native", null, true);
        baseMKProxyActivity.m18078n2();
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m18062Y1() {
        return TextUtils.equals(ej2.m120960e(), "M353");
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Unit m18063a1(BaseMKProxyActivity baseMKProxyActivity, zlw zlwVar, String str) {
        String stringExtra;
        baseMKProxyActivity.getClass();
        if (i8g0.m139002d(str)) {
            baseMKProxyActivity.f12218x = str;
        }
        Intent intent = baseMKProxyActivity.getIntent();
        if (intent != null) {
            intent.getStringExtra("PARAM_PRE_FETCHE");
            stringExtra = intent.getStringExtra("PARAMS_FOR_URL");
        } else {
            stringExtra = null;
        }
        baseMKProxyActivity.m18056T1(baseMKProxyActivity.f12218x, stringExtra, zlwVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m18064c2(final String str) {
        if (this.f12190P) {
            return;
        }
        x310.m209185c(this.f12178D, new Runnable() { // from class: l.yo2
            @Override // java.lang.Runnable
            public final void run() {
                BaseMKProxyActivity.m18059W0(this.f200944a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m18066d2() {
        MKWebView mKWebView = this.f12204j;
        if (mKWebView != null) {
            mKWebView.m17919d1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m18067e2() {
        jzv.m147728a("MKActivity", "刷新超时");
        if (this.f12203i.m18287i()) {
            this.f12203i.setRefreshing(false);
            this.f12198X.removeMessages(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public void m18069g2() {
        if (this.f12207m != null) {
            m18094E2();
        } else {
            if (TextUtils.isEmpty(this.f12194T)) {
                return;
            }
            this.f12204j.mo17918d(this.f12194T, null);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public static int m18071i2(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split(Constants.SEPARATOR_COMMA)) == null || (strArrSplit.length != 3 && strArrSplit.length != 4)) {
            return -404;
        }
        return Color.argb(strArrSplit.length == 4 ? (int) (Math.min(Float.valueOf(strArrSplit[3]).floatValue(), 1.0f) * 255.0f) : 255, Math.min(Integer.valueOf(strArrSplit[0]).intValue(), 255), Math.min(Integer.valueOf(strArrSplit[1]).intValue(), 255), Math.min(Integer.valueOf(strArrSplit[2]).intValue(), 255));
    }

    /* JADX INFO: renamed from: k2 */
    private String m18074k2(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.startsWith("https://passport.immomo.com/authorize?redirect_uri=") ? URLDecoder.decode(str.substring(51)) : str.startsWith("https://www.immomo.com/checkurl/?url=") ? URLDecoder.decode(str.substring(37)) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public void m18078n2() {
        Disposable disposable = this.f12219y;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.f12219y.dispose();
        this.f12219y = null;
    }

    /* JADX INFO: renamed from: o2 */
    private void m18080o2() {
        HandlerC3544h handlerC3544h = this.f12198X;
        if (handlerC3544h != null) {
            handlerC3544h.removeMessages(2);
        }
    }

    /* JADX INFO: renamed from: q2 */
    private void m18083q2(Uri uri) {
        boolean zEquals;
        if (uri != null) {
            try {
                zEquals = "1".equals(uri.getQueryParameter("_safe_keyboard"));
            } catch (Throwable th) {
                jzv.m147730c("MKActivity", "", th);
                return;
            }
        } else {
            zEquals = false;
        }
        if (zEquals) {
            this.f12202h.setFitsSystemWindows(true);
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m18086s2(View view, int i) {
        view.setPadding(view.getLeft(), view.getPaddingTop() + i, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: v1 */
    public static boolean m18089v1(String str) {
        return "1".equals(Uri.parse(str).getQueryParameter("_ui_web_panel"));
    }

    /* JADX INFO: renamed from: v2 */
    private void m18090v2(int i, int i2, int i3) {
        MenuItem menuItem;
        if (i != -404) {
            Drawable drawableMutate = getResources().getDrawable(xac0.f193011b).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawableMutate.setColorFilter(i, mode);
            this.f12005c.m107700m(drawableMutate);
            Drawable drawableMutate2 = getResources().getDrawable(xac0.f193013d).mutate();
            drawableMutate2.setColorFilter(i, mode);
            this.f12209o.setImageDrawable(drawableMutate2);
        }
        if (i2 != -404) {
            this.f12208n.setTextColor(i2);
        }
        if (i3 == -404 || (menuItem = this.f12210p) == null) {
            return;
        }
        this.f12005c.m107698k(menuItem, i3);
        this.f12193S = i3;
    }

    /* JADX INFO: renamed from: B2 */
    public void mo18091B2(boolean z) {
        c2j0 c2j0Var = this.f12005c;
        if (z) {
            c2j0Var.m107703p();
        } else {
            c2j0Var.m107696h();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void mo18092C2(boolean z) {
        View view = this.f12213s;
        if (view != null) {
            if (!z) {
                if (view.getVisibility() != 8) {
                    this.f12213s.setVisibility(8);
                }
                this.f12175A.clearAnimation();
                return;
            }
            if (view != null && view.getVisibility() != 0) {
                this.f12213s.setVisibility(0);
                this.f12213s.setBackgroundColor(getResources().getColor(w9c0.f188001g));
            }
            if (this.f12176B.getVisibility() != 8) {
                this.f12176B.setVisibility(8);
            }
            if (this.f12215u.getVisibility() != 8) {
                this.f12215u.setVisibility(8);
            }
            if (this.f12214t.getVisibility() != 0) {
                this.f12214t.setVisibility(0);
            }
            this.f12175A.startAnimation(AnimationUtils.loadAnimation(m17784U0(), c8c0.f80195a));
        }
    }

    /* JADX INFO: renamed from: D2 */
    public void m18093D2(boolean z, boolean z2, String str) {
        if (!this.f12180F) {
            mo18092C2(z);
        }
        if (this.f12204j != null) {
            MKCoreLogManager.m18431i(this.f12204j.getLogSessionKey()).m211446U("showLoadingPage&&&" + str);
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m18094E2() {
        if (this.f12210p == null) {
            return;
        }
        if (this.f12206l == null) {
            this.f12206l = new tkw(this).m191598i(xac0.f193015f).m191594d();
        }
        this.f12206l.m191596g(this.f12196V);
        this.f12206l.m191597h(this.f12207m);
        View viewFindViewById = this.f12006d.findViewById(pcc0.f151566t);
        if (viewFindViewById == null) {
            viewFindViewById = this.f12006d;
        }
        this.f12206l.m191599j(viewFindViewById);
    }

    /* JADX INFO: renamed from: F2 */
    public void m18095F2(boolean z, String str, boolean z2, String str2, String str3, boolean z3) {
        if (this.f12204j == null) {
            return;
        }
        mo18100I2(z, str, str3);
        if (this.f12204j == null || !z3) {
            return;
        }
        m18122z1(z, str2, z2);
    }

    /* JADX INFO: renamed from: G1 */
    public abstract int mo18096G1();

    /* JADX INFO: renamed from: H1 */
    public MKWebViewHelper m18097H1() {
        return new zkw(this.f12218x);
    }

    /* JADX INFO: renamed from: H2 */
    public void m18098H2(boolean z, boolean z2, String str, String str2, boolean z3) {
        m18095F2(z, null, z2, str, str2, z3);
    }

    /* JADX INFO: renamed from: I1 */
    public int m18099I1() {
        if (!m18062Y1()) {
            return 0;
        }
        int iM155253i = lpj0.m155253i();
        return iM155253i <= 0 ? q4g0.m175214b(this) : iM155253i;
    }

    /* JADX INFO: renamed from: I2 */
    public void mo18100I2(boolean z, String str, String str2) {
        View view = this.f12213s;
        if (view != null) {
            if (!z) {
                this.f12175A.clearAnimation();
                if (this.f12213s.getVisibility() != 8) {
                    this.f12213s.setVisibility(8);
                    return;
                }
                return;
            }
            if (view.getVisibility() != 0) {
                this.f12213s.setVisibility(0);
                this.f12213s.setBackgroundColor(getResources().getColor(w9c0.f188002h));
            }
            if (this.f12176B.getVisibility() != 0) {
                this.f12176B.setVisibility(0);
            }
            if (this.f12214t.getVisibility() != 8) {
                this.f12214t.setVisibility(8);
            }
            this.f12175A.clearAnimation();
            if (this.f12215u.getVisibility() != 0) {
                this.f12215u.setVisibility(0);
            }
            if (i8g0.m139001c(str2)) {
                str2 = "Oops! 出错了";
            }
            this.f12177C.setText(str2);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public String m18101K1(String str, String str2) {
        Uri uriM18049J1;
        if (i8g0.m139001c(str2) || (uriM18049J1 = m18049J1(str)) == null) {
            return null;
        }
        return uriM18049J1.getQueryParameter(str2);
    }

    @Nullable
    /* JADX INFO: renamed from: M1 */
    public wam mo18102M1() {
        return null;
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity
    /* JADX INFO: renamed from: N0 */
    public void mo17777N0() {
        c2j0 c2j0VarM107688c = c2j0.m107688c(m17784U0(), new ViewOnClickListenerC3538b());
        this.f12005c = c2j0VarM107688c;
        this.f12006d = c2j0VarM107688c.m107695g();
        if (!mo17779P0() && this.f12006d != null) {
            this.f12005c.m107699l(0);
        }
        m18106R1();
    }

    /* JADX INFO: renamed from: N2 */
    public void m18103N2() {
        if (bjw.m104780c()) {
            this.f12187M = true;
        } else {
            m18053M2(this.f12188N);
        }
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity
    /* JADX INFO: renamed from: P0 */
    public boolean mo17779P0() {
        return true;
    }

    /* JADX INFO: renamed from: P1 */
    public void m18104P1() {
        kjw.INSTANCE.m150072a(this, this.f12204j, this.f12205k);
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity
    /* JADX INFO: renamed from: Q0 */
    public void mo17780Q0() {
        lpj0.m155254j(m17784U0());
        onBackPressed();
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean mo18105Q2() {
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m18106R1() {
        ImageView imageView = (ImageView) findViewById(pcc0.f151568v);
        this.f12209o = imageView;
        imageView.setVisibility(8);
        this.f12209o.setOnClickListener(new ViewOnClickListenerC3539c());
        this.f12208n = (TextView) findViewById(pcc0.f151569w);
    }

    /* JADX INFO: renamed from: V1 */
    public void m18107V1() {
        String stringExtra;
        String stringExtra2;
        m18054O1();
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("param_start_url");
            stringExtra2 = intent.getStringExtra("PARAMS_FOR_URL");
        } else {
            stringExtra = "";
            stringExtra2 = null;
        }
        m18045B1(stringExtra);
        this.f12202h = (MKResizeListenerLayout) findViewById(pcc0.f151557k);
        m18044A2();
        this.f12220z = yfi.m215600p();
        m18055S1(stringExtra, stringExtra2);
        m18116r2();
    }

    /* JADX INFO: renamed from: X1 */
    public void m18108X1(String str) {
    }

    /* JADX INFO: renamed from: Z1 */
    public void m18109Z1() {
    }

    /* JADX INFO: renamed from: a2 */
    public void m18110a2(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (Build.VERSION.SDK_INT <= 29) {
            super.attachBaseContext(context.createConfigurationContext(new Configuration(context.getResources().getConfiguration())));
            return;
        }
        super.attachBaseContext(context);
        try {
            applyOverrideConfiguration(new Configuration(context.getResources().getConfiguration()));
        } catch (Exception e) {
            jzv.m147730c("MKActivity", "", e);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public WebResourceResponse m18111b2(WebView webView, String str) {
        return null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX INFO: renamed from: h2 */
    public void m18112h2(WebView webView, int i, String str, String str2) {
    }

    /* JADX INFO: renamed from: l2 */
    public void m18113l2(String str) {
        String strM18074k2 = m18074k2(str);
        try {
            m18108X1(strM18074k2);
            Uri uri = Uri.parse(strM18074k2);
            String host = uri.getHost();
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("_resize", false);
            if (booleanQueryParameter) {
                getWindow().setSoftInputMode(16);
            }
            if (!glw.m130713j(host) && !MKConfigSetter.INSTANCE.m17762a()) {
                jzv.m147728a("MKActivity", "非 immomo.com域名不能使用 ui_mode");
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.f12005c.m107694f().setForceDarkAllowed(false);
            }
            String queryParameter = uri.getQueryParameter("_ui");
            String queryParameter2 = uri.getQueryParameter("_ui_mode");
            String queryParameter3 = uri.getQueryParameter("_ui_theme");
            String queryParameter4 = uri.getQueryParameter("_ac_mode");
            this.f12204j.setVerticalScrollBarEnabled(uri.getBooleanQueryParameter("_show_scrollbar", false));
            if (TextUtils.isEmpty(queryParameter4) || !"1".equals(queryParameter4)) {
                this.f12203i.setBackgroundColor(-1);
                Integer numM18047E1 = m18047E1(this.f12182H);
                if (numM18047E1 != null) {
                    MKWebView mKWebView = this.f12204j;
                    if (mKWebView != null) {
                        mKWebView.setBackgroundColor(numM18047E1.intValue());
                    }
                    MKResizeListenerLayout mKResizeListenerLayout = this.f12202h;
                    if (mKResizeListenerLayout != null) {
                        mKResizeListenerLayout.setBackgroundColor(numM18047E1.intValue());
                    }
                }
            } else {
                MKWebView mKWebView2 = this.f12204j;
                if (mKWebView2 != null) {
                    mKWebView2.setBackgroundColor(0);
                }
                this.f12203i.setBackgroundColor(0);
                MKResizeListenerLayout mKResizeListenerLayout2 = this.f12202h;
                if (mKResizeListenerLayout2 != null) {
                    mKResizeListenerLayout2.setBackgroundColor(0);
                }
            }
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = "0";
            }
            String str2 = queryParameter2;
            boolean zM18046C1 = m18046C1(uri, booleanQueryParameter, queryParameter, str2, strM18074k2, queryParameter3);
            Integer numM18047E2 = m18047E1(uri.getQueryParameter("_ui_bg"));
            if (numM18047E2 == null) {
                return;
            }
            int iIntValue = Integer.valueOf(str2).intValue();
            this.f12216v = iIntValue;
            if (iIntValue != 1) {
                if (!zM18046C1) {
                    m17781R0(numM18047E2.intValue(), true);
                }
                this.f12005c.m107697j(numM18047E2.intValue());
                this.f12208n.setTextColor(getResources().getColor(w9c0.f188000f));
                this.f12209o.setImageResource(xac0.f193012c);
                return;
            }
            if (!zM18046C1) {
                m17781R0(numM18047E2.intValue(), false);
            }
            this.f12005c.m107697j(numM18047E2.intValue());
            this.f12005c.m107699l(xac0.f193011b);
            this.f12208n.setTextColor(-1);
            this.f12005c.m107704q(false);
            this.f12209o.setImageResource(xac0.f193013d);
        } catch (Exception e) {
            jzv.m147730c("MKActivity", "", e);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public void m18114m2() {
        if (this.f12185K) {
            return;
        }
        this.f12185K = true;
        this.f12184J.m163474f(this, this.f12204j);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        MKWebViewHelper mKWebViewHelper = this.f12205k;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.m17956E(i, i2, intent);
        }
        wam wamVar = this.f12217w;
        if (wamVar != null) {
            wamVar.mo135784a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // p153l.ukw
    public void onBack() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m17784U0() != null) {
            lpj0.m155254j(m17784U0());
        }
        MKWebView mKWebView = this.f12204j;
        if (mKWebView != null) {
            if (mKWebView.m17913a1()) {
                return;
            }
            if (this.f12204j.canGoBack()) {
                this.f12204j.goBack();
                ImageView imageView = this.f12209o;
                if (imageView == null || imageView.getVisibility() == 0) {
                    return;
                }
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300L);
                this.f12209o.startAnimation(scaleAnimation);
                this.f12209o.setVisibility(0);
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (glw.m130711h()) {
            this.f12188N = configuration;
            this.f12198X.sendEmptyMessageDelayed(3, 500L);
        }
        MKWebView mKWebView = this.f12204j;
        if (mKWebView != null) {
            mKWebView.m17929q1(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.equals("true", m18101K1(null, "document_draw_whole"))) {
            WebView.enableSlowWholeDocumentDraw();
        }
        this.f12179E = new amw();
        this.f12184J = new njw();
        setContentView(mo18096G1());
        m18107V1();
        m18114m2();
        bjw.INSTANCE.m104783c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m18078n2();
        bjw.INSTANCE.m104784d(this);
        m18080o2();
        HandlerC3544h handlerC3544h = this.f12198X;
        if (handlerC3544h != null) {
            handlerC3544h.removeCallbacksAndMessages(null);
        }
        this.f12184J.m163475g(this);
        cn80.m111487g().m111492c(this.f12204j);
        cn80.m111487g().m111494j(this.f12218x);
        if (this.f12191Q != null) {
            this.f12191Q = null;
        }
        MKWebViewHelper mKWebViewHelper = this.f12205k;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.mo17963d();
        }
        wam wamVar = this.f12217w;
        if (wamVar != null) {
            wamVar.mo135790g();
        }
        amw amwVar = this.f12179E;
        if (amwVar != null) {
            amwVar.m98860a(this.f12204j);
        }
        this.f12217w = null;
        x310.m209183a(this.f12178D);
        super.onDestroy();
    }

    @Override // p153l.ukw
    public void onFront() {
        Configuration configuration;
        if (!this.f12187M || (configuration = this.f12188N) == null) {
            return;
        }
        m18053M2(configuration);
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity, androidx.appcompat.widget.Toolbar.InterfaceC0161f
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.f12186L = false;
        amw amwVar = this.f12179E;
        if (amwVar != null) {
            amwVar.m98861b();
        }
        super.onPause();
        MKWebViewHelper mKWebViewHelper = this.f12205k;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.mo17973u();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        wam wamVar = this.f12217w;
        if (wamVar != null) {
            wamVar.mo135788e(i, strArr, iArr);
        }
        MKWebViewHelper mKWebViewHelper = this.f12205k;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.m17957G(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.f12186L = true;
        m18080o2();
        super.onResume();
        m18118w1();
        MKWebViewHelper mKWebViewHelper = this.f12205k;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.mo17974v();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p2 */
    public void m18115p2() {
        MenuItem menuItem = this.f12210p;
        if (menuItem != null) {
            menuItem.setOnMenuItemClickListener(null);
            this.f12210p.setVisible(false);
            this.f12210p = null;
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m18116r2() {
        int iM18099I1 = m18099I1();
        if (iM18099I1 > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12203i.getLayoutParams();
            this.f12192R = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = iM18099I1;
            this.f12203i.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity, android.app.Activity
    public void setTitle(int i) {
        Toolbar toolbar = this.f12176B;
        if (toolbar != null) {
            toolbar.setTitle(getResources().getText(i));
        }
        TextView textView = this.f12208n;
        if (textView != null) {
            textView.setText(i);
        } else {
            super.setTitle(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r1 r2 r3
      0x0045: PHI (r1v8 int) = (r1v4 int), (r1v10 int) binds: [B:25:0x0076, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r2v6 int) = (r2v2 int), (r2v7 int) binds: [B:25:0x0076, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r3v5 int) = (r3v2 int), (r3v6 int) binds: [B:25:0x0076, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: u2 */
    public void m18117u2(ave0 ave0Var) {
        int color;
        if (ave0Var == null) {
            return;
        }
        int iM100453b = ave0Var.m100453b();
        int iM18071i2 = m18071i2(ave0Var.m100454c());
        int iM18071i3 = m18071i2(ave0Var.m100455d());
        int iM18071i4 = m18071i2(ave0Var.m100452a());
        int iM18071i5 = m18071i2(ave0Var.m100456e());
        if (iM100453b == 1) {
            if (iM18071i2 != -404) {
                m17781R0(iM18071i2, false);
                this.f12005c.m107697j(iM18071i2);
            }
            this.f12005c.m107704q(false);
            color = -1;
            if (iM18071i3 == -404) {
                iM18071i3 = -1;
            }
            if (iM18071i4 == -404) {
                iM18071i4 = -1;
            }
            if (iM18071i5 == -404) {
                iM18071i5 = color;
            }
        } else if (iM100453b == 0) {
            if (iM18071i2 == -404) {
                iM18071i2 = getResources().getColor(w9c0.f187999e);
            }
            m17781R0(iM18071i2, true);
            this.f12005c.m107697j(iM18071i2);
            if (iM18071i3 == -404) {
                iM18071i3 = getResources().getColor(w9c0.f188000f);
            }
            color = getResources().getColor(w9c0.f187997c);
            if (iM18071i4 == -404) {
                iM18071i4 = color;
            }
            if (iM18071i5 == -404) {
                iM18071i5 = color;
            }
        }
        this.f12216v = iM100453b;
        m18090v2(iM18071i4, iM18071i3, iM18071i5);
    }

    /* JADX INFO: renamed from: w1 */
    public void m18118w1() {
        amw amwVar = this.f12179E;
        if (amwVar != null) {
            amwVar.m98863d(this.f12204j, this.f12203i, this.f12218x, new Function2() { // from class: l.zo2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseMKProxyActivity.m18063a1(this.f205269a, (zlw) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m18119w2() {
        m18115p2();
    }

    /* JADX INFO: renamed from: y1 */
    public void m18120y1() {
        runOnUiThread(new RunnableC3542f());
    }

    /* JADX INFO: renamed from: y2 */
    public void m18121y2(final boolean z) {
        runOnUiThread(new Runnable() { // from class: l.bp2
            @Override // java.lang.Runnable
            public final void run() {
                BaseMKProxyActivity baseMKProxyActivity = this.f77723a;
                baseMKProxyActivity.f12203i.setEnabled(z && !TextUtils.isEmpty(baseMKProxyActivity.f12197W));
            }
        });
    }

    /* JADX INFO: renamed from: z1 */
    public void m18122z1(boolean z, String str, boolean z2) {
        if (this.f12204j == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "showWhiteScreenPage" : "hideWhiteScreenPage");
        sb.append("&&&");
        sb.append(str);
        String string = sb.toString();
        if (z2) {
            MKWebView mKWebView = this.f12204j;
            if (z) {
                MKCoreLogManager.m18431i(mKWebView.getLogSessionKey()).m211447V(string);
                return;
            } else {
                MKCoreLogManager.m18431i(mKWebView.getLogSessionKey()).m211450u(string);
                return;
            }
        }
        if (!z) {
            MKCoreLogManager.m18431i(this.f12204j.getLogSessionKey()).m211450u(string);
            return;
        }
        boolean zM138999a = i8g0.m138999a(str, "overTime");
        MKWebView mKWebView2 = this.f12204j;
        if (zM138999a) {
            MKCoreLogManager.m18431i(mKWebView2.getLogSessionKey()).m211448W(string);
        } else {
            MKCoreLogManager.m18431i(mKWebView2.getLogSessionKey()).m211432G(string);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m18123z2(zue0 zue0Var) throws JSONException {
        if (zue0Var == null) {
            return;
        }
        m18120y1();
        m18115p2();
        if (zue0Var.m221638e()) {
            this.f12207m = null;
            return;
        }
        this.f12207m = zue0Var.m221636c();
        String strM221637d = zue0Var.m221637d();
        String strM221635b = zue0Var.m221635b();
        if (TextUtils.isEmpty(strM221637d) || TextUtils.isEmpty(strM221635b)) {
            m18119w2();
            return;
        }
        this.f12194T = strM221635b;
        MenuItem menuItem = this.f12210p;
        if (menuItem != null) {
            menuItem.setVisible(true);
            this.f12210p.setTitle(strM221637d);
            this.f12210p.setOnMenuItemClickListener(this.f12195U);
            return;
        }
        MenuItem menuItemM107691a = this.f12005c.m107691a(pcc0.f151566t, strM221637d, 0, this.f12195U);
        this.f12210p = menuItemM107691a;
        int i = this.f12193S;
        c2j0 c2j0Var = this.f12005c;
        if (i != -404) {
            c2j0Var.m107698k(menuItemM107691a, i);
        } else {
            c2j0Var.m107698k(menuItemM107691a, this.f12216v == 1 ? -1 : -6908266);
        }
    }

    @Override // com.hellogroup.p036mk.business.base.activity.BaseMkActivity, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        Toolbar toolbar = this.f12176B;
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
        TextView textView = this.f12208n;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }
}
