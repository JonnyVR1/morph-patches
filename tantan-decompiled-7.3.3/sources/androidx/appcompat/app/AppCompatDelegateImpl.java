package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.C0088c;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.InterfaceC0093h;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.Lifecycle;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p153l.b2j0;
import p153l.c30;
import p153l.cf20;
import p153l.dgq0;
import p153l.e30;
import p153l.e7h0;
import p153l.f5d0;
import p153l.g7h0;
import p153l.gic0;
import p153l.hml0;
import p153l.il50;
import p153l.jj5;
import p153l.jnl0;
import p153l.ker;
import p153l.kfc0;
import p153l.kkl0;
import p153l.kl80;
import p153l.kml0;
import p153l.l01;
import p153l.l1g0;
import p153l.lu0;
import p153l.lzq;
import p153l.mfq0;
import p153l.nmj0;
import p153l.nu0;
import p153l.o30;
import p153l.o9r;
import p153l.ofq0;
import p153l.ou0;
import p153l.pid;
import p153l.r26;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;
import p153l.ugc0;
import p153l.v1l0;
import p153l.v40;
import p153l.wg3;
import p153l.wtq0;
import p153l.xdc0;
import p153l.z9c0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatDelegateImpl extends AbstractC0076b implements MenuBuilder.InterfaceC0079a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: F0 */
    public static final boolean f218F0;

    /* JADX INFO: renamed from: A */
    public boolean f221A;

    /* JADX INFO: renamed from: B */
    public boolean f222B;

    /* JADX INFO: renamed from: C */
    public boolean f223C;

    /* JADX INFO: renamed from: D */
    public boolean f224D;

    /* JADX INFO: renamed from: E */
    public boolean f225E;

    /* JADX INFO: renamed from: F */
    public boolean f226F;

    /* JADX INFO: renamed from: G */
    public C0072l[] f227G;

    /* JADX INFO: renamed from: H */
    public C0072l f228H;

    /* JADX INFO: renamed from: I */
    public boolean f229I;

    /* JADX INFO: renamed from: J */
    public boolean f230J;

    /* JADX INFO: renamed from: K */
    public boolean f231K;

    /* JADX INFO: renamed from: L */
    public boolean f232L;

    /* JADX INFO: renamed from: M */
    public boolean f233M;

    /* JADX INFO: renamed from: N */
    public int f234N;

    /* JADX INFO: renamed from: O */
    public int f235O;

    /* JADX INFO: renamed from: P */
    public boolean f236P;

    /* JADX INFO: renamed from: Q */
    public boolean f237Q;

    /* JADX INFO: renamed from: R */
    public AutoNightModeManager f238R;

    /* JADX INFO: renamed from: S */
    public AutoNightModeManager f239S;

    /* JADX INFO: renamed from: T */
    public boolean f240T;

    /* JADX INFO: renamed from: U */
    public int f241U;

    /* JADX INFO: renamed from: V */
    public final Runnable f242V;

    /* JADX INFO: renamed from: W */
    public boolean f243W;

    /* JADX INFO: renamed from: X */
    public Rect f244X;

    /* JADX INFO: renamed from: Y */
    public Rect f245Y;

    /* JADX INFO: renamed from: Z */
    public AppCompatViewInflater f246Z;

    /* JADX INFO: renamed from: d */
    public final Object f247d;

    /* JADX INFO: renamed from: e */
    public final Context f248e;

    /* JADX INFO: renamed from: f */
    public Window f249f;

    /* JADX INFO: renamed from: g */
    public C0069i f250g;

    /* JADX INFO: renamed from: h */
    public final lu0 f251h;

    /* JADX INFO: renamed from: i */
    public c30 f252i;

    /* JADX INFO: renamed from: j */
    public MenuInflater f253j;

    /* JADX INFO: renamed from: k */
    public CharSequence f254k;

    /* JADX INFO: renamed from: l */
    public pid f255l;

    /* JADX INFO: renamed from: m */
    public C0067g f256m;

    /* JADX INFO: renamed from: n */
    public C0073m f257n;

    /* JADX INFO: renamed from: o */
    public o30 f258o;

    /* JADX INFO: renamed from: p */
    public ActionBarContextView f259p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f260q;

    /* JADX INFO: renamed from: r */
    public Runnable f261r;

    /* JADX INFO: renamed from: s */
    public hml0 f262s;

    /* JADX INFO: renamed from: t */
    public boolean f263t;

    /* JADX INFO: renamed from: u */
    public boolean f264u;

    /* JADX INFO: renamed from: v */
    public ViewGroup f265v;

    /* JADX INFO: renamed from: w */
    public TextView f266w;

    /* JADX INFO: renamed from: x */
    public View f267x;

    /* JADX INFO: renamed from: y */
    public boolean f268y;

    /* JADX INFO: renamed from: z */
    public boolean f269z;

    /* JADX INFO: renamed from: k0 */
    public static final Map<Class<?>, Integer> f219k0 = new l01();

    /* JADX INFO: renamed from: p0 */
    public static final boolean f220p0 = false;

    /* JADX INFO: renamed from: E0 */
    public static final int[] f217E0 = {R.attr.windowBackground};

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public abstract class AutoNightModeManager {

        /* JADX INFO: renamed from: a */
        public BroadcastReceiver f270a;

        public AutoNightModeManager() {
        }

        /* JADX INFO: renamed from: a */
        public void m339a() {
            BroadcastReceiver broadcastReceiver = this.f270a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f248e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f270a = null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo340b();

        /* JADX INFO: renamed from: c */
        public abstract int mo341c();

        /* JADX INFO: renamed from: d */
        public abstract void mo342d();

        /* JADX INFO: renamed from: e */
        public void m343e() {
            m339a();
            IntentFilter intentFilterMo340b = mo340b();
            if (intentFilterMo340b == null || intentFilterMo340b.countActions() == 0) {
                return;
            }
            if (this.f270a == null) {
                this.f270a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.mo342d();
                    }
                };
            }
            jj5.m145018l(AppCompatDelegateImpl.this.f248e, this.f270a, intentFilterMo340b);
        }
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m344c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m288U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m344c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.m283P(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(tu0.m192702b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class RunnableC0061a implements Runnable {
        public RunnableC0061a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f241U & 1) != 0) {
                appCompatDelegateImpl.m289V(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f241U & 4096) != 0) {
                appCompatDelegateImpl2.m289V(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f240T = false;
            appCompatDelegateImpl3.f241U = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0062b implements il50 {
        public C0062b() {
        }

        @Override // p153l.il50
        public dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
            int iM115686l = dgq0Var.m115686l();
            int iM278K0 = AppCompatDelegateImpl.this.m278K0(iM115686l);
            if (iM115686l != iM278K0) {
                dgq0Var = dgq0Var.m115690q(dgq0Var.m115684j(), iM278K0, dgq0Var.m115685k(), dgq0Var.m115683i());
            }
            return kkl0.m150141W(view, dgq0Var);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C0063c implements ContentFrameLayout.InterfaceC0129a {
        public C0063c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0129a
        /* JADX INFO: renamed from: a */
        public void mo345a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0129a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m287T();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class RunnableC0064d implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        public class a extends kml0 {
            public a() {
            }

            @Override // p153l.kml0, p153l.jml0
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f259p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f262s.m135944g(null);
                AppCompatDelegateImpl.this.f262s = null;
            }

            @Override // p153l.kml0, p153l.jml0
            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f259p.setVisibility(0);
            }
        }

        public RunnableC0064d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f260q.showAtLocation(appCompatDelegateImpl.f259p, 55, 0, 0);
            AppCompatDelegateImpl.this.m290W();
            boolean zM264D0 = AppCompatDelegateImpl.this.m264D0();
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (!zM264D0) {
                appCompatDelegateImpl2.f259p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f259p.setVisibility(0);
            } else {
                appCompatDelegateImpl2.f259p.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f262s = kkl0.m150149c(appCompatDelegateImpl3.f259p).m135939b(1.0f);
                AppCompatDelegateImpl.this.f262s.m135944g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0065e extends kml0 {
        public C0065e() {
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f259p.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f262s.m135944g(null);
            AppCompatDelegateImpl.this.f262s = null;
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f259p.setVisibility(0);
            AppCompatDelegateImpl.this.f259p.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f259p.getParent() instanceof View) {
                kkl0.m150158g0((View) AppCompatDelegateImpl.this.f259p.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C0066f implements e30 {
        public C0066f() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public final class C0067g implements InterfaceC0092g.a {
        public C0067g() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(MenuBuilder menuBuilder) {
            Window.Callback callbackM302f0 = AppCompatDelegateImpl.this.m302f0();
            if (callbackM302f0 == null) {
                return true;
            }
            callbackM302f0.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m281N(menuBuilder);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public class C0068h implements o30.InterfaceC19018a {

        /* JADX INFO: renamed from: a */
        public o30.InterfaceC19018a f282a;

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h$a */
        public class a extends kml0 {
            public a() {
            }

            @Override // p153l.kml0, p153l.jml0
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f259p.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f260q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f259p.getParent() instanceof View) {
                    kkl0.m150158g0((View) AppCompatDelegateImpl.this.f259p.getParent());
                }
                AppCompatDelegateImpl.this.f259p.removeAllViews();
                AppCompatDelegateImpl.this.f262s.m135944g(null);
                AppCompatDelegateImpl.this.f262s = null;
            }
        }

        public C0068h(o30.InterfaceC19018a interfaceC19018a) {
            this.f282a = interfaceC19018a;
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: a */
        public boolean mo347a(o30 o30Var, MenuItem menuItem) {
            return this.f282a.mo347a(o30Var, menuItem);
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: b */
        public boolean mo348b(o30 o30Var, Menu menu) {
            return this.f282a.mo348b(o30Var, menu);
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: c */
        public boolean mo349c(o30 o30Var, Menu menu) {
            return this.f282a.mo349c(o30Var, menu);
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: d */
        public void mo350d(o30 o30Var) {
            this.f282a.mo350d(o30Var);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f260q != null) {
                appCompatDelegateImpl.f249f.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f261r);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f259p != null) {
                appCompatDelegateImpl2.m290W();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f262s = kkl0.m150149c(appCompatDelegateImpl3.f259p).m135939b(0.0f);
                AppCompatDelegateImpl.this.f262s.m135944g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            lu0 lu0Var = appCompatDelegateImpl4.f251h;
            if (lu0Var != null) {
                lu0Var.onSupportActionModeFinished(appCompatDelegateImpl4.f258o);
            }
            AppCompatDelegateImpl.this.f258o = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public class C0070j extends AutoNightModeManager {

        /* JADX INFO: renamed from: c */
        public final PowerManager f286c;

        public C0070j(Context context) {
            super();
            this.f286c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: b */
        public IntentFilter mo340b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: c */
        public int mo341c() {
            return this.f286c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: d */
        public void mo342d() {
            AppCompatDelegateImpl.this.mo296b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public class C0071k extends AutoNightModeManager {

        /* JADX INFO: renamed from: c */
        public final nmj0 f288c;

        public C0071k(nmj0 nmj0Var) {
            super();
            this.f288c = nmj0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: b */
        public IntentFilter mo340b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: c */
        public int mo341c() {
            return this.f288c.m163824d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: d */
        public void mo342d() {
            AppCompatDelegateImpl.this.mo296b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public static final class C0072l {

        /* JADX INFO: renamed from: a */
        public int f290a;

        /* JADX INFO: renamed from: b */
        public int f291b;

        /* JADX INFO: renamed from: c */
        public int f292c;

        /* JADX INFO: renamed from: d */
        public int f293d;

        /* JADX INFO: renamed from: e */
        public int f294e;

        /* JADX INFO: renamed from: f */
        public int f295f;

        /* JADX INFO: renamed from: g */
        public ViewGroup f296g;

        /* JADX INFO: renamed from: h */
        public View f297h;

        /* JADX INFO: renamed from: i */
        public View f298i;

        /* JADX INFO: renamed from: j */
        public MenuBuilder f299j;

        /* JADX INFO: renamed from: k */
        public C0088c f300k;

        /* JADX INFO: renamed from: l */
        public Context f301l;

        /* JADX INFO: renamed from: m */
        public boolean f302m;

        /* JADX INFO: renamed from: n */
        public boolean f303n;

        /* JADX INFO: renamed from: o */
        public boolean f304o;

        /* JADX INFO: renamed from: p */
        public boolean f305p;

        /* JADX INFO: renamed from: q */
        public boolean f306q = false;

        /* JADX INFO: renamed from: r */
        public boolean f307r;

        /* JADX INFO: renamed from: s */
        public Bundle f308s;

        public C0072l(int i) {
            this.f290a = i;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC0093h m352a(InterfaceC0092g.a aVar) {
            if (this.f299j == null) {
                return null;
            }
            if (this.f300k == null) {
                C0088c c0088c = new C0088c(this.f301l, kfc0.f126276l);
                this.f300k = c0088c;
                c0088c.setCallback(aVar);
                this.f299j.addMenuPresenter(this.f300k);
            }
            return this.f300k.m423b(this.f296g);
        }

        /* JADX INFO: renamed from: b */
        public boolean m353b() {
            if (this.f297h == null) {
                return false;
            }
            return this.f298i != null || this.f300k.m422a().getCount() > 0;
        }

        /* JADX INFO: renamed from: c */
        public void m354c(MenuBuilder menuBuilder) {
            C0088c c0088c;
            MenuBuilder menuBuilder2 = this.f299j;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.f300k);
            }
            this.f299j = menuBuilder;
            if (menuBuilder == null || (c0088c = this.f300k) == null) {
                return;
            }
            menuBuilder.addMenuPresenter(c0088c);
        }

        /* JADX INFO: renamed from: d */
        public void m355d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(s8c0.f166781a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(s8c0.f166771H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(ugc0.f178883d, true);
            }
            r26 r26Var = new r26(context, 0);
            r26Var.getTheme().setTo(themeNewTheme);
            this.f301l = r26Var;
            TypedArray typedArrayObtainStyledAttributes = r26Var.obtainStyledAttributes(gic0.f104460x0);
            this.f291b = typedArrayObtainStyledAttributes.getResourceId(gic0.f104220A0, 0);
            this.f295f = typedArrayObtainStyledAttributes.getResourceId(gic0.f104470z0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public final class C0073m implements InterfaceC0092g.a {
        public C0073m() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(MenuBuilder menuBuilder) {
            Window.Callback callbackM302f0;
            if (menuBuilder != null) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f221A || (callbackM302f0 = appCompatDelegateImpl.m302f0()) == null || AppCompatDelegateImpl.this.f233M) {
                return true;
            }
            callbackM302f0.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            C0072l c0072lM293Z = appCompatDelegateImpl.m293Z(menuBuilder);
            if (c0072lM293Z != null) {
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if (!z2) {
                    appCompatDelegateImpl2.m284Q(c0072lM293Z, z);
                } else {
                    appCompatDelegateImpl2.m280M(c0072lM293Z.f290a, c0072lM293Z, rootMenu);
                    AppCompatDelegateImpl.this.m284Q(c0072lM293Z, true);
                }
            }
        }
    }

    static {
        f218F0 = Build.VERSION.SDK_INT <= 25;
    }

    public AppCompatDelegateImpl(Context context, Window window, lu0 lu0Var, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        AppCompatActivity appCompatActivityM272H0;
        this.f262s = null;
        this.f263t = true;
        this.f234N = -100;
        this.f242V = new RunnableC0061a();
        this.f248e = context;
        this.f251h = lu0Var;
        this.f247d = obj;
        if (this.f234N == -100 && (obj instanceof Dialog) && (appCompatActivityM272H0 = m272H0()) != null) {
            this.f234N = appCompatActivityM272H0.getDelegate().mo308j();
        }
        if (this.f234N == -100 && (num = (map = f219k0).get(obj.getClass())) != null) {
            this.f234N = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            m277K(window);
        }
        ou0.m169200h();
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: A */
    public void mo258A(int i) {
        m291X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f248e).inflate(i, viewGroup);
        this.f250g.m158173a().onContentChanged();
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m259A0(C0072l c0072l, KeyEvent keyEvent) {
        pid pidVar;
        pid pidVar2;
        pid pidVar3;
        if (this.f233M) {
            return false;
        }
        if (c0072l.f302m) {
            return true;
        }
        C0072l c0072l2 = this.f228H;
        if (c0072l2 != null && c0072l2 != c0072l) {
            m284Q(c0072l2, false);
        }
        Window.Callback callbackM302f0 = m302f0();
        if (callbackM302f0 != null) {
            c0072l.f298i = callbackM302f0.onCreatePanelView(c0072l.f290a);
        }
        int i = c0072l.f290a;
        boolean z = i == 0 || i == 108;
        if (z && (pidVar3 = this.f255l) != null) {
            pidVar3.mo470f();
        }
        if (c0072l.f298i == null && (!z || !(m336y0() instanceof b2j0))) {
            MenuBuilder menuBuilder = c0072l.f299j;
            if (menuBuilder == null || c0072l.f307r) {
                if (menuBuilder == null && (!m309j0(c0072l) || c0072l.f299j == null)) {
                    return false;
                }
                if (z && this.f255l != null) {
                    if (this.f256m == null) {
                        this.f256m = new C0067g();
                    }
                    this.f255l.mo469e(c0072l.f299j, this.f256m);
                }
                c0072l.f299j.stopDispatchingItemsChanged();
                if (!callbackM302f0.onCreatePanelMenu(c0072l.f290a, c0072l.f299j)) {
                    c0072l.m354c(null);
                    if (z && (pidVar = this.f255l) != null) {
                        pidVar.mo469e(null, this.f256m);
                    }
                    return false;
                }
                c0072l.f307r = false;
            }
            c0072l.f299j.stopDispatchingItemsChanged();
            Bundle bundle = c0072l.f308s;
            if (bundle != null) {
                c0072l.f299j.restoreActionViewStates(bundle);
                c0072l.f308s = null;
            }
            if (!callbackM302f0.onPreparePanel(0, c0072l.f298i, c0072l.f299j)) {
                if (z && (pidVar2 = this.f255l) != null) {
                    pidVar2.mo469e(null, this.f256m);
                }
                c0072l.f299j.startDispatchingItemsChanged();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0072l.f305p = z2;
            c0072l.f299j.setQwertyMode(z2);
            c0072l.f299j.startDispatchingItemsChanged();
        }
        c0072l.f302m = true;
        c0072l.f303n = false;
        this.f228H = c0072l;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: B */
    public void mo260B(View view) {
        m291X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f250g.m158173a().onContentChanged();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m261B0(MenuBuilder menuBuilder, boolean z) {
        pid pidVar = this.f255l;
        if (pidVar == null || !pidVar.mo465a() || (ViewConfiguration.get(this.f248e).hasPermanentMenuKey() && !this.f255l.mo471g())) {
            C0072l c0072lM300d0 = m300d0(0, true);
            c0072lM300d0.f306q = true;
            m284Q(c0072lM300d0, false);
            m335x0(c0072lM300d0, null);
            return;
        }
        Window.Callback callbackM302f0 = m302f0();
        if (this.f255l.mo467c() && z) {
            this.f255l.mo468d();
            if (this.f233M) {
                return;
            }
            callbackM302f0.onPanelClosed(108, m300d0(0, true).f299j);
            return;
        }
        if (callbackM302f0 == null || this.f233M) {
            return;
        }
        if (this.f240T && (this.f241U & 1) != 0) {
            this.f249f.getDecorView().removeCallbacks(this.f242V);
            this.f242V.run();
        }
        C0072l c0072lM300d1 = m300d0(0, true);
        MenuBuilder menuBuilder2 = c0072lM300d1.f299j;
        if (menuBuilder2 == null || c0072lM300d1.f307r || !callbackM302f0.onPreparePanel(0, c0072lM300d1.f298i, menuBuilder2)) {
            return;
        }
        callbackM302f0.onMenuOpened(108, c0072lM300d1.f299j);
        this.f255l.mo466b();
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: C */
    public void mo262C(View view, ViewGroup.LayoutParams layoutParams) {
        m291X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f250g.m158173a().onContentChanged();
    }

    /* JADX INFO: renamed from: C0 */
    public final int m263C0(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m264D0() {
        ViewGroup viewGroup;
        return this.f264u && (viewGroup = this.f265v) != null && kkl0.m150134P(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: E */
    public void mo265E(Toolbar toolbar) {
        if (this.f247d instanceof Activity) {
            c30 c30VarMo312l = mo312l();
            if (c30VarMo312l instanceof ofq0) {
                wtq0.m207906a("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.f253j = null;
            if (c30VarMo312l != null) {
                c30VarMo312l.mo102190q();
            }
            if (toolbar != null) {
                b2j0 b2j0Var = new b2j0(toolbar, m301e0(), this.f250g);
                this.f252i = b2j0Var;
                this.f249f.setCallback(b2j0Var.m102176J());
            } else {
                this.f252i = null;
                this.f249f.setCallback(this.f250g);
            }
            mo316n();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m266E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f249f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || kkl0.m150133O((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: F */
    public void mo267F(@StyleRes int i) {
        this.f235O = i;
    }

    /* JADX INFO: renamed from: F0 */
    public o30 m268F0(@NonNull o30.InterfaceC19018a interfaceC19018a) {
        o30 o30VarOnWindowStartingSupportActionMode;
        lu0 lu0Var;
        m290W();
        o30 o30Var = this.f258o;
        if (o30Var != null) {
            o30Var.mo152473a();
        }
        if (!(interfaceC19018a instanceof C0068h)) {
            interfaceC19018a = new C0068h(interfaceC19018a);
        }
        lu0 lu0Var2 = this.f251h;
        if (lu0Var2 == null || this.f233M) {
            o30VarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                o30VarOnWindowStartingSupportActionMode = lu0Var2.onWindowStartingSupportActionMode(interfaceC19018a);
            } catch (AbstractMethodError unused) {
                o30VarOnWindowStartingSupportActionMode = null;
            }
        }
        if (o30VarOnWindowStartingSupportActionMode != null) {
            this.f258o = o30VarOnWindowStartingSupportActionMode;
        } else {
            if (this.f259p == null) {
                if (this.f224D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f248e.getTheme();
                    theme.resolveAttribute(s8c0.f166787g, typedValue, true);
                    int i = typedValue.resourceId;
                    Context r26Var = this.f248e;
                    if (i != 0) {
                        Resources.Theme themeNewTheme = r26Var.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        r26Var = new r26(this.f248e, 0);
                        r26Var.getTheme().setTo(themeNewTheme);
                    }
                    this.f259p = new ActionBarContextView(r26Var);
                    PopupWindow popupWindow = new PopupWindow(r26Var, (AttributeSet) null, s8c0.f166790j);
                    this.f260q = popupWindow;
                    kl80.m150357b(popupWindow, 2);
                    this.f260q.setContentView(this.f259p);
                    this.f260q.setWidth(-1);
                    r26Var.getTheme().resolveAttribute(s8c0.f166782b, typedValue, true);
                    this.f259p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, r26Var.getResources().getDisplayMetrics()));
                    this.f260q.setHeight(-2);
                    this.f261r = new RunnableC0064d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f265v.findViewById(xdc0.f193563h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m295a0()));
                        this.f259p = (ActionBarContextView) viewStubCompat.m610a();
                    }
                }
            }
            if (this.f259p != null) {
                m290W();
                this.f259p.m462k();
                l1g0 l1g0Var = new l1g0(this.f259p.getContext(), this.f259p, interfaceC19018a, this.f260q == null);
                if (interfaceC19018a.mo348b(l1g0Var, l1g0Var.mo152475c())) {
                    l1g0Var.mo152479i();
                    this.f259p.m459h(l1g0Var);
                    this.f258o = l1g0Var;
                    boolean zM264D0 = m264D0();
                    ActionBarContextView actionBarContextView = this.f259p;
                    if (zM264D0) {
                        actionBarContextView.setAlpha(0.0f);
                        hml0 hml0VarM135939b = kkl0.m150149c(this.f259p).m135939b(1.0f);
                        this.f262s = hml0VarM135939b;
                        hml0VarM135939b.m135944g(new C0065e());
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        this.f259p.setVisibility(0);
                        this.f259p.sendAccessibilityEvent(32);
                        if (this.f259p.getParent() instanceof View) {
                            kkl0.m150158g0((View) this.f259p.getParent());
                        }
                    }
                    if (this.f260q != null) {
                        this.f249f.getDecorView().post(this.f261r);
                    }
                } else {
                    this.f258o = null;
                }
            }
        }
        o30 o30Var2 = this.f258o;
        if (o30Var2 != null && (lu0Var = this.f251h) != null) {
            lu0Var.onSupportActionModeStarted(o30Var2);
        }
        return this.f258o;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: G */
    public final void mo269G(CharSequence charSequence) {
        this.f254k = charSequence;
        pid pidVar = this.f255l;
        if (pidVar != null) {
            pidVar.setWindowTitle(charSequence);
            return;
        }
        if (m336y0() != null) {
            m336y0().mo102173F(charSequence);
            return;
        }
        TextView textView = this.f266w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m270G0() {
        if (this.f264u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: H */
    public o30 mo271H(@NonNull o30.InterfaceC19018a interfaceC19018a) {
        lu0 lu0Var;
        if (interfaceC19018a == null) {
            wg3.m206174a("ActionMode callback can not be null.");
            return null;
        }
        o30 o30Var = this.f258o;
        if (o30Var != null) {
            o30Var.mo152473a();
        }
        C0068h c0068h = new C0068h(interfaceC19018a);
        c30 c30VarMo312l = mo312l();
        if (c30VarMo312l != null) {
            o30 o30VarMo107733H = c30VarMo312l.mo107733H(c0068h);
            this.f258o = o30VarMo107733H;
            if (o30VarMo107733H != null && (lu0Var = this.f251h) != null) {
                lu0Var.onSupportActionModeStarted(o30VarMo107733H);
            }
        }
        if (this.f258o == null) {
            this.f258o = m268F0(c0068h);
        }
        return this.f258o;
    }

    @Nullable
    /* JADX INFO: renamed from: H0 */
    public final AppCompatActivity m272H0() {
        for (Context baseContext = this.f248e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m273I(boolean z) {
        if (this.f233M) {
            return false;
        }
        int iM279L = m279L();
        boolean zM274I0 = m274I0(m317n0(iM279L), z);
        if (iM279L == 0) {
            m298c0().m343e();
        } else {
            AutoNightModeManager autoNightModeManager = this.f238R;
            if (autoNightModeManager != null) {
                autoNightModeManager.m339a();
            }
        }
        if (iM279L == 3) {
            m297b0().m343e();
            return zM274I0;
        }
        AutoNightModeManager autoNightModeManager2 = this.f239S;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.m339a();
        }
        return zM274I0;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m274I0(int i, boolean z) {
        int i2;
        int i3 = this.f248e.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        if (i != 1) {
            i2 = i != 2 ? i3 : 32;
        } else {
            i2 = 16;
        }
        boolean zM313l0 = m313l0();
        boolean z3 = false;
        if ((f218F0 || i2 != i3) && !zM313l0 && !this.f230J && (this.f247d instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i2;
            try {
                ((ContextThemeWrapper) this.f247d).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f248e.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i2 && z && !zM313l0 && this.f230J) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                v40.m199643t((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i2) {
            z2 = z3;
        } else {
            m276J0(i2, zM313l0);
        }
        if (z2) {
            Object obj2 = this.f247d;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i);
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: J */
    public final void m275J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f265v.findViewById(R.id.content);
        View decorView = this.f249f.getDecorView();
        contentFrameLayout.m563b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f248e.obtainStyledAttributes(gic0.f104460x0);
        typedArrayObtainStyledAttributes.getValue(gic0.f104265J0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(gic0.f104270K0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104255H0)) {
            typedArrayObtainStyledAttributes.getValue(gic0.f104255H0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104260I0)) {
            typedArrayObtainStyledAttributes.getValue(gic0.f104260I0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104245F0)) {
            typedArrayObtainStyledAttributes.getValue(gic0.f104245F0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(gic0.f104250G0)) {
            typedArrayObtainStyledAttributes.getValue(gic0.f104250G0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public final void m276J0(int i, boolean z) {
        Resources resources = this.f248e.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            f5d0.m124118a(resources);
        }
        int i2 = this.f235O;
        if (i2 != 0) {
            this.f248e.setTheme(i2);
            this.f248e.getTheme().applyStyle(this.f235O, true);
        }
        if (z) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof ker) {
                    if (((ker) activity).getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f232L) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m277K(@NonNull Window window) {
        if (this.f249f != null) {
            wtq0.m207906a("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0069i) {
            wtq0.m207906a("AppCompat has already installed itself into the Window");
            return;
        }
        C0069i c0069i = new C0069i(callback);
        this.f250g = c0069i;
        window.setCallback(c0069i);
        t0j0 t0j0VarM188781t = t0j0.m188781t(this.f248e, null, f217E0);
        Drawable drawableM188790h = t0j0VarM188781t.m188790h(0);
        if (drawableM188790h != null) {
            window.setBackgroundDrawable(drawableM188790h);
        }
        t0j0VarM188781t.m188801v();
        this.f249f = window;
    }

    /* JADX INFO: renamed from: K0 */
    public int m278K0(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f259p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f259p.getLayoutParams();
            boolean z3 = true;
            if (this.f259p.isShown()) {
                if (this.f244X == null) {
                    this.f244X = new Rect();
                    this.f245Y = new Rect();
                }
                Rect rect = this.f244X;
                Rect rect2 = this.f245Y;
                rect.set(0, i, 0, 0);
                jnl0.m146264a(this.f265v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f267x;
                    if (view == null) {
                        View view2 = new View(this.f248e);
                        this.f267x = view2;
                        view2.setBackgroundColor(this.f248e.getResources().getColor(z9c0.f203462a));
                        this.f265v.addView(this.f267x, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f267x.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = this.f267x != null;
                if (!this.f223C && z3) {
                    i = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f259p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f267x;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* JADX INFO: renamed from: L */
    public final int m279L() {
        int i = this.f234N;
        return i != -100 ? i : AbstractC0076b.m364h();
    }

    /* JADX INFO: renamed from: M */
    public void m280M(int i, C0072l c0072l, Menu menu) {
        if (menu == null) {
            if (c0072l == null && i >= 0) {
                C0072l[] c0072lArr = this.f227G;
                if (i < c0072lArr.length) {
                    c0072l = c0072lArr[i];
                }
            }
            if (c0072l != null) {
                menu = c0072l.f299j;
            }
        }
        if ((c0072l == null || c0072l.f304o) && !this.f233M) {
            this.f250g.m158173a().onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m281N(MenuBuilder menuBuilder) {
        if (this.f226F) {
            return;
        }
        this.f226F = true;
        this.f255l.mo473i();
        Window.Callback callbackM302f0 = m302f0();
        if (callbackM302f0 != null && !this.f233M) {
            callbackM302f0.onPanelClosed(108, menuBuilder);
        }
        this.f226F = false;
    }

    /* JADX INFO: renamed from: O */
    public final void m282O() {
        AutoNightModeManager autoNightModeManager = this.f238R;
        if (autoNightModeManager != null) {
            autoNightModeManager.m339a();
        }
        AutoNightModeManager autoNightModeManager2 = this.f239S;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.m339a();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m283P(int i) {
        m284Q(m300d0(i, true), true);
    }

    /* JADX INFO: renamed from: Q */
    public void m284Q(C0072l c0072l, boolean z) {
        ViewGroup viewGroup;
        pid pidVar;
        if (z && c0072l.f290a == 0 && (pidVar = this.f255l) != null && pidVar.mo467c()) {
            m281N(c0072l.f299j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f248e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null && c0072l.f304o && (viewGroup = c0072l.f296g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m280M(c0072l.f290a, c0072l, null);
            }
        }
        c0072l.f302m = false;
        c0072l.f303n = false;
        c0072l.f304o = false;
        c0072l.f297h = null;
        c0072l.f306q = true;
        if (this.f228H == c0072l) {
            this.f228H = null;
        }
    }

    /* JADX INFO: renamed from: R */
    public final ViewGroup m285R() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f248e.obtainStyledAttributes(gic0.f104460x0);
        if (!typedArrayObtainStyledAttributes.hasValue(gic0.f104230C0)) {
            typedArrayObtainStyledAttributes.recycle();
            wtq0.m207906a("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return null;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(gic0.f104275L0, false)) {
            mo337z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(gic0.f104230C0, false)) {
            mo337z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(gic0.f104235D0, false)) {
            mo337z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(gic0.f104240E0, false)) {
            mo337z(10);
        }
        this.f224D = typedArrayObtainStyledAttributes.getBoolean(gic0.f104465y0, false);
        typedArrayObtainStyledAttributes.recycle();
        m292Y();
        this.f249f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f248e);
        if (this.f225E) {
            viewGroup = this.f223C ? (ViewGroup) layoutInflaterFrom.inflate(kfc0.f126281q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(kfc0.f126280p, (ViewGroup) null);
            kkl0.m150194y0(viewGroup, new C0062b());
        } else if (this.f224D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(kfc0.f126272h, (ViewGroup) null);
            this.f222B = false;
            this.f221A = false;
        } else if (this.f221A) {
            TypedValue typedValue = new TypedValue();
            this.f248e.getTheme().resolveAttribute(s8c0.f166787g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new r26(this.f248e, typedValue.resourceId) : this.f248e).inflate(kfc0.f126282r, (ViewGroup) null);
            pid pidVar = (pid) viewGroup.findViewById(xdc0.f193572q);
            this.f255l = pidVar;
            pidVar.setWindowCallback(m302f0());
            if (this.f222B) {
                this.f255l.mo472h(109);
            }
            if (this.f268y) {
                this.f255l.mo472h(2);
            }
            if (this.f269z) {
                this.f255l.mo472h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (this.f255l == null) {
                this.f266w = (TextView) viewGroup.findViewById(xdc0.f193552S);
            }
            jnl0.m146266c(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(xdc0.f193557b);
            ViewGroup viewGroup2 = (ViewGroup) this.f249f.findViewById(R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.f249f.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new C0063c());
            return viewGroup;
        }
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f221A + ", windowActionBarOverlay: " + this.f222B + ", android:windowIsFloating: " + this.f224D + ", windowActionModeOverlay: " + this.f223C + ", windowNoTitle: " + this.f225E + " }");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public View m286S(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        if (this.f246Z == null) {
            String string = this.f248e.obtainStyledAttributes(gic0.f104460x0).getString(gic0.f104225B0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f246Z = new AppCompatViewInflater();
            } else {
                try {
                    this.f246Z = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f246Z = new AppCompatViewInflater();
                }
            }
        }
        boolean z = f220p0;
        boolean zM266E0 = false;
        if (z) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zM266E0 = m266E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zM266E0 = true;
            }
        }
        return this.f246Z.createView(view, str, context, attributeSet, zM266E0, z, true, v1l0.m199019b());
    }

    /* JADX INFO: renamed from: T */
    public void m287T() {
        MenuBuilder menuBuilder;
        pid pidVar = this.f255l;
        if (pidVar != null) {
            pidVar.mo473i();
        }
        if (this.f260q != null) {
            this.f249f.getDecorView().removeCallbacks(this.f261r);
            if (this.f260q.isShowing()) {
                try {
                    this.f260q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f260q = null;
        }
        m290W();
        C0072l c0072lM300d0 = m300d0(0, false);
        if (c0072lM300d0 == null || (menuBuilder = c0072lM300d0.f299j) == null) {
            return;
        }
        menuBuilder.close();
    }

    /* JADX INFO: renamed from: U */
    public boolean m288U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f247d;
        if (((obj instanceof lzq.InterfaceC18516a) || (obj instanceof nu0)) && (decorView = this.f249f.getDecorView()) != null && lzq.m156462d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f250g.m158173a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m319p0(keyCode, keyEvent) : m325s0(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: V */
    public void m289V(int i) {
        C0072l c0072lM300d0;
        C0072l c0072lM300d1 = m300d0(i, true);
        if (c0072lM300d1.f299j != null) {
            Bundle bundle = new Bundle();
            c0072lM300d1.f299j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c0072lM300d1.f308s = bundle;
            }
            c0072lM300d1.f299j.stopDispatchingItemsChanged();
            c0072lM300d1.f299j.clear();
        }
        c0072lM300d1.f307r = true;
        c0072lM300d1.f306q = true;
        if ((i != 108 && i != 0) || this.f255l == null || (c0072lM300d0 = m300d0(0, false)) == null) {
            return;
        }
        c0072lM300d0.f302m = false;
        m259A0(c0072lM300d0, null);
    }

    /* JADX INFO: renamed from: W */
    public void m290W() {
        hml0 hml0Var = this.f262s;
        if (hml0Var != null) {
            hml0Var.m135940c();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m291X() {
        if (this.f264u) {
            return;
        }
        this.f265v = m285R();
        CharSequence charSequenceM301e0 = m301e0();
        if (!TextUtils.isEmpty(charSequenceM301e0)) {
            pid pidVar = this.f255l;
            if (pidVar != null) {
                pidVar.setWindowTitle(charSequenceM301e0);
            } else if (m336y0() != null) {
                m336y0().mo102173F(charSequenceM301e0);
            } else {
                TextView textView = this.f266w;
                if (textView != null) {
                    textView.setText(charSequenceM301e0);
                }
            }
        }
        m275J();
        m333w0(this.f265v);
        this.f264u = true;
        C0072l c0072lM300d0 = m300d0(0, false);
        if (this.f233M) {
            return;
        }
        if (c0072lM300d0 == null || c0072lM300d0.f299j == null) {
            m311k0(108);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m292Y() {
        if (this.f249f == null) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                m277K(((Activity) obj).getWindow());
            }
        }
        if (this.f249f != null) {
            return;
        }
        wtq0.m207906a("We have not been given a Window");
    }

    /* JADX INFO: renamed from: Z */
    public C0072l m293Z(Menu menu) {
        C0072l[] c0072lArr = this.f227G;
        int length = c0072lArr != null ? c0072lArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0072l c0072l = c0072lArr[i];
            if (c0072l != null && c0072l.f299j == menu) {
                return c0072l;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: a */
    public void mo294a(View view, ViewGroup.LayoutParams layoutParams) {
        m291X();
        ((ViewGroup) this.f265v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f250g.m158173a().onContentChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public final Context m295a0() {
        c30 c30VarMo312l = mo312l();
        Context contextMo102185l = c30VarMo312l != null ? c30VarMo312l.mo102185l() : null;
        return contextMo102185l == null ? this.f248e : contextMo102185l;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: b */
    public boolean mo296b() {
        return m273I(true);
    }

    /* JADX INFO: renamed from: b0 */
    public final AutoNightModeManager m297b0() {
        if (this.f239S == null) {
            this.f239S = new C0070j(this.f248e);
        }
        return this.f239S;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c0 */
    public final AutoNightModeManager m298c0() {
        if (this.f238R == null) {
            this.f238R = new C0071k(nmj0.m163821a(this.f248e));
        }
        return this.f238R;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: d */
    public void mo299d(Context context) {
        m273I(false);
        this.f230J = true;
    }

    /* JADX INFO: renamed from: d0 */
    public C0072l m300d0(int i, boolean z) {
        C0072l[] c0072lArr = this.f227G;
        if (c0072lArr == null || c0072lArr.length <= i) {
            C0072l[] c0072lArr2 = new C0072l[i + 1];
            if (c0072lArr != null) {
                System.arraycopy(c0072lArr, 0, c0072lArr2, 0, c0072lArr.length);
            }
            this.f227G = c0072lArr2;
            c0072lArr = c0072lArr2;
        }
        C0072l c0072l = c0072lArr[i];
        if (c0072l != null) {
            return c0072l;
        }
        C0072l c0072l2 = new C0072l(i);
        c0072lArr[i] = c0072l2;
        return c0072l2;
    }

    /* JADX INFO: renamed from: e0 */
    public final CharSequence m301e0() {
        Object obj = this.f247d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f254k;
    }

    /* JADX INFO: renamed from: f0 */
    public final Window.Callback m302f0() {
        return this.f249f.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    @Nullable
    /* JADX INFO: renamed from: g */
    public <T extends View> T mo303g(@IdRes int i) {
        m291X();
        return (T) this.f249f.findViewById(i);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m304g0() {
        m291X();
        if (this.f221A && this.f252i == null) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                this.f252i = new ofq0((Activity) this.f247d, this.f222B);
            } else if (obj instanceof Dialog) {
                this.f252i = new ofq0((Dialog) this.f247d);
            }
            c30 c30Var = this.f252i;
            if (c30Var != null) {
                c30Var.mo102195v(this.f243W);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m305h0(C0072l c0072l) {
        View view = c0072l.f298i;
        if (view != null) {
            c0072l.f297h = view;
            return true;
        }
        if (c0072l.f299j == null) {
            return false;
        }
        if (this.f257n == null) {
            this.f257n = new C0073m();
        }
        View view2 = (View) c0072l.m352a(this.f257n);
        c0072l.f297h = view2;
        return view2 != null;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: i */
    public final e30 mo306i() {
        return new C0066f();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m307i0(C0072l c0072l) {
        c0072l.m355d(m295a0());
        c0072l.f296g = new ListMenuDecorView(c0072l.f301l);
        c0072l.f292c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: j */
    public int mo308j() {
        return this.f234N;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m309j0(C0072l c0072l) {
        Resources.Theme themeNewTheme;
        Context context = this.f248e;
        int i = c0072l.f290a;
        if ((i == 0 || i == 108) && this.f255l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(s8c0.f166787g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(s8c0.f166788h, typedValue, true);
            } else {
                theme.resolveAttribute(s8c0.f166788h, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                r26 r26Var = new r26(context, 0);
                r26Var.getTheme().setTo(themeNewTheme);
                context = r26Var;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        c0072l.m354c(menuBuilder);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: k */
    public MenuInflater mo310k() {
        if (this.f253j == null) {
            m304g0();
            c30 c30Var = this.f252i;
            this.f253j = new g7h0(c30Var != null ? c30Var.mo102185l() : this.f248e);
        }
        return this.f253j;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m311k0(int i) {
        this.f241U = (1 << i) | this.f241U;
        if (this.f240T) {
            return;
        }
        kkl0.m150148b0(this.f249f.getDecorView(), this.f242V);
        this.f240T = true;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: l */
    public c30 mo312l() {
        m304g0();
        return this.f252i;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m313l0() {
        if (!this.f237Q && (this.f247d instanceof Activity)) {
            PackageManager packageManager = this.f248e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f248e, this.f247d.getClass()), 0);
                this.f236P = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f236P = false;
            }
        }
        this.f237Q = true;
        return this.f236P;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: m */
    public void mo314m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f248e);
        if (layoutInflaterFrom.getFactory() == null) {
            o9r.m166805a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m315m0() {
        return this.f263t;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: n */
    public void mo316n() {
        c30 c30VarMo312l = mo312l();
        if (c30VarMo312l == null || !c30VarMo312l.mo102187n()) {
            m311k0(0);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int m317n0(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) this.f248e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                return m298c0().mo341c();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return m297b0().mo341c();
                }
                wtq0.m207906a("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m318o0() {
        o30 o30Var = this.f258o;
        if (o30Var != null) {
            o30Var.mo152473a();
            return true;
        }
        c30 c30VarMo312l = mo312l();
        return c30VarMo312l != null && c30VarMo312l.mo102180g();
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        C0072l c0072lM293Z;
        Window.Callback callbackM302f0 = m302f0();
        if (callbackM302f0 == null || this.f233M || (c0072lM293Z = m293Z(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return callbackM302f0.onMenuItemSelected(c0072lM293Z.f290a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        m261B0(menuBuilder, true);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m319p0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f229I = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m321q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: q */
    public void mo320q(Configuration configuration) {
        c30 c30VarMo312l;
        if (this.f221A && this.f264u && (c30VarMo312l = mo312l()) != null) {
            c30VarMo312l.mo102189p(configuration);
        }
        ou0.m169198b().m169205g(this.f248e);
        m273I(false);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m321q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0072l c0072lM300d0 = m300d0(i, true);
        if (c0072lM300d0.f304o) {
            return false;
        }
        return m259A0(c0072lM300d0, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: r */
    public void mo322r(Bundle bundle) {
        String strM109508c;
        this.f230J = true;
        m273I(false);
        m292Y();
        Object obj = this.f247d;
        if (obj instanceof Activity) {
            try {
                strM109508c = cf20.m109508c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM109508c = null;
            }
            if (strM109508c != null) {
                c30 c30VarM336y0 = m336y0();
                if (c30VarM336y0 == null) {
                    this.f243W = true;
                } else {
                    c30VarM336y0.mo102195v(true);
                }
            }
        }
        this.f231K = true;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m323r0(int i, KeyEvent keyEvent) {
        c30 c30VarMo312l = mo312l();
        if (c30VarMo312l != null && c30VarMo312l.mo102191r(i, keyEvent)) {
            return true;
        }
        C0072l c0072l = this.f228H;
        if (c0072l != null && m338z0(c0072l, keyEvent.getKeyCode(), keyEvent, 1)) {
            C0072l c0072l2 = this.f228H;
            if (c0072l2 != null) {
                c0072l2.f303n = true;
            }
            return true;
        }
        if (this.f228H == null) {
            C0072l c0072lM300d0 = m300d0(0, true);
            m259A0(c0072lM300d0, keyEvent);
            boolean zM338z0 = m338z0(c0072lM300d0, keyEvent.getKeyCode(), keyEvent, 1);
            c0072lM300d0.f302m = false;
            if (zM338z0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: s */
    public void mo324s() {
        AbstractC0076b.m366p(this);
        if (this.f240T) {
            this.f249f.getDecorView().removeCallbacks(this.f242V);
        }
        this.f232L = false;
        this.f233M = true;
        c30 c30Var = this.f252i;
        if (c30Var != null) {
            c30Var.mo102190q();
        }
        m282O();
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m325s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f229I;
            this.f229I = false;
            C0072l c0072lM300d0 = m300d0(0, false);
            if (c0072lM300d0 != null && c0072lM300d0.f304o) {
                if (!z) {
                    m284Q(c0072lM300d0, true);
                }
                return true;
            }
            if (m318o0()) {
                return true;
            }
        } else if (i == 82) {
            m327t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: t */
    public void mo326t(Bundle bundle) {
        m291X();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX INFO: renamed from: t0 */
    public final boolean m327t0(int i, KeyEvent keyEvent) {
        boolean zM259A0;
        AudioManager audioManager;
        pid pidVar;
        if (this.f258o != null) {
            return false;
        }
        boolean zMo468d = true;
        C0072l c0072lM300d0 = m300d0(i, true);
        if (i != 0 || (pidVar = this.f255l) == null || !pidVar.mo465a() || ViewConfiguration.get(this.f248e).hasPermanentMenuKey()) {
            boolean z = c0072lM300d0.f304o;
            if (z || c0072lM300d0.f303n) {
                m284Q(c0072lM300d0, true);
                zMo468d = z;
            } else if (c0072lM300d0.f302m) {
                if (c0072lM300d0.f307r) {
                    c0072lM300d0.f302m = false;
                    zM259A0 = m259A0(c0072lM300d0, keyEvent);
                } else {
                    zM259A0 = true;
                }
                if (zM259A0) {
                    m335x0(c0072lM300d0, keyEvent);
                } else {
                    zMo468d = false;
                }
            } else {
                zMo468d = false;
            }
        } else if (this.f255l.mo467c()) {
            zMo468d = this.f255l.mo468d();
        } else if (this.f233M || !m259A0(c0072lM300d0, keyEvent)) {
            zMo468d = false;
        } else {
            zMo468d = this.f255l.mo466b();
        }
        if (zMo468d && (audioManager = (AudioManager) this.f248e.getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zMo468d;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: u */
    public void mo328u() {
        c30 c30VarMo312l = mo312l();
        if (c30VarMo312l != null) {
            c30VarMo312l.mo102171D(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m329u0(int i) {
        c30 c30VarMo312l;
        if (i != 108 || (c30VarMo312l = mo312l()) == null) {
            return;
        }
        c30VarMo312l.mo102181h(true);
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: v */
    public void mo330v(Bundle bundle) {
        if (this.f234N != -100) {
            f219k0.put(this.f247d.getClass(), Integer.valueOf(this.f234N));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m331v0(int i) {
        if (i == 108) {
            c30 c30VarMo312l = mo312l();
            if (c30VarMo312l != null) {
                c30VarMo312l.mo102181h(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0072l c0072lM300d0 = m300d0(i, true);
            if (c0072lM300d0.f304o) {
                m284Q(c0072lM300d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: w */
    public void mo332w() {
        this.f232L = true;
        mo296b();
        AbstractC0076b.m365o(this);
    }

    /* JADX INFO: renamed from: w0 */
    public void m333w0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: x */
    public void mo334x() {
        this.f232L = false;
        AbstractC0076b.m366p(this);
        c30 c30VarMo312l = mo312l();
        if (c30VarMo312l != null) {
            c30VarMo312l.mo102171D(false);
        }
        if (this.f247d instanceof Dialog) {
            m282O();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m335x0(C0072l c0072l, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0072l.f304o || this.f233M) {
            return;
        }
        if (c0072l.f290a == 0 && (this.f248e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM302f0 = m302f0();
        if (callbackM302f0 != null && !callbackM302f0.onMenuOpened(c0072l.f290a, c0072l.f299j)) {
            m284Q(c0072l, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f248e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null && m259A0(c0072l, keyEvent)) {
            ViewGroup viewGroup = c0072l.f296g;
            if (viewGroup != null && !c0072l.f306q) {
                View view = c0072l.f298i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c0072l.f303n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, c0072l.f293d, c0072l.f294e, 1002, 8519680, -3);
                layoutParams2.gravity = c0072l.f292c;
                layoutParams2.windowAnimations = c0072l.f295f;
                windowManager.addView(c0072l.f296g, layoutParams2);
                c0072l.f304o = true;
            }
            if (viewGroup == null) {
                if (!m307i0(c0072l) || c0072l.f296g == null) {
                    return;
                }
            } else if (c0072l.f306q && viewGroup.getChildCount() > 0) {
                c0072l.f296g.removeAllViews();
            }
            if (!m305h0(c0072l) || !c0072l.m353b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c0072l.f297h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0072l.f296g.setBackgroundResource(c0072l.f291b);
            ViewParent parent = c0072l.f297h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0072l.f297h);
            }
            c0072l.f296g.addView(c0072l.f297h, layoutParams3);
            if (!c0072l.f297h.hasFocus()) {
                c0072l.f297h.requestFocus();
            }
            i = -2;
            c0072l.f303n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, c0072l.f293d, c0072l.f294e, 1002, 8519680, -3);
            layoutParams4.gravity = c0072l.f292c;
            layoutParams4.windowAnimations = c0072l.f295f;
            windowManager.addView(c0072l.f296g, layoutParams4);
            c0072l.f304o = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final c30 m336y0() {
        return this.f252i;
    }

    @Override // androidx.appcompat.app.AbstractC0076b
    /* JADX INFO: renamed from: z */
    public boolean mo337z(int i) {
        int iM263C0 = m263C0(i);
        if (this.f225E && iM263C0 == 108) {
            return false;
        }
        if (this.f221A && iM263C0 == 1) {
            this.f221A = false;
        }
        if (iM263C0 == 1) {
            m270G0();
            this.f225E = true;
            return true;
        }
        if (iM263C0 == 2) {
            m270G0();
            this.f268y = true;
            return true;
        }
        if (iM263C0 == 5) {
            m270G0();
            this.f269z = true;
            return true;
        }
        if (iM263C0 == 10) {
            m270G0();
            this.f223C = true;
            return true;
        }
        if (iM263C0 == 108) {
            m270G0();
            this.f221A = true;
            return true;
        }
        if (iM263C0 != 109) {
            return this.f249f.requestFeature(iM263C0);
        }
        m270G0();
        this.f222B = true;
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m338z0(C0072l c0072l, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0072l.f302m || m259A0(c0072l, keyEvent)) && (menuBuilder = c0072l.f299j) != null) {
            zPerformShortcut = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.f255l == null) {
            m284Q(c0072l, true);
        }
        return zPerformShortcut;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m286S(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C0069i extends mfq0 {
        public C0069i(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: b */
        public final ActionMode m351b(ActionMode.Callback callback) {
            e7h0.C16727a c16727a = new e7h0.C16727a(AppCompatDelegateImpl.this.f248e, callback);
            o30 o30VarMo271H = AppCompatDelegateImpl.this.mo271H(c16727a);
            if (o30VarMo271H != null) {
                return c16727a.m119710e(o30VarMo271H);
            }
            return null;
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m288U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.m323r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m329u0(i);
            return true;
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m331v0(i);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            C0072l c0072lM300d0 = AppCompatDelegateImpl.this.m300d0(0, true);
            if (c0072lM300d0 == null || (menuBuilder = c0072lM300d0.f299j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            }
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.m315m0() && i == 0) ? m351b(callback) : super.onWindowStartingActionMode(callback, i);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, lu0 lu0Var) {
        this(dialog.getContext(), dialog.getWindow(), lu0Var, dialog);
    }

    public AppCompatDelegateImpl(Activity activity, lu0 lu0Var) {
        this(activity, null, lu0Var, activity);
    }
}
