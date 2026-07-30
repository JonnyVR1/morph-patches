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
import androidx.appcompat.view.menu.C0087c;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.InterfaceC0092h;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.Lifecycle;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p149l.aac0;
import p149l.b50;
import p149l.bd50;
import p149l.bxc0;
import p149l.ctf0;
import p149l.ddl0;
import p149l.e01;
import p149l.ed80;
import p149l.fel0;
import p149l.fu0;
import p149l.g7c0;
import p149l.gbl0;
import p149l.gdl0;
import p149l.h6q0;
import p149l.hu0;
import p149l.i30;
import p149l.ig3;
import p149l.ii5;
import p149l.iu0;
import p149l.j6q0;
import p149l.jcr;
import p149l.jdj0;
import p149l.jhd;
import p149l.k30;
import p149l.lxq;
import p149l.m16;
import p149l.n0c0;
import p149l.n7r;
import p149l.nu0;
import p149l.p8c0;
import p149l.psk0;
import p149l.qkq0;
import p149l.qri0;
import p149l.s5c0;
import p149l.t1c0;
import p149l.u30;
import p149l.u620;
import p149l.wyg0;
import p149l.y6q0;
import p149l.ysi0;
import p149l.yyg0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatDelegateImpl extends AbstractC0075b implements MenuBuilder.InterfaceC0078a, LayoutInflater.Factory2 {

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
    public C0071l[] f227G;

    /* JADX INFO: renamed from: H */
    public C0071l f228H;

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
    public C0068i f250g;

    /* JADX INFO: renamed from: h */
    public final fu0 f251h;

    /* JADX INFO: renamed from: i */
    public i30 f252i;

    /* JADX INFO: renamed from: j */
    public MenuInflater f253j;

    /* JADX INFO: renamed from: k */
    public CharSequence f254k;

    /* JADX INFO: renamed from: l */
    public jhd f255l;

    /* JADX INFO: renamed from: m */
    public C0066g f256m;

    /* JADX INFO: renamed from: n */
    public C0072m f257n;

    /* JADX INFO: renamed from: o */
    public u30 f258o;

    /* JADX INFO: renamed from: p */
    public ActionBarContextView f259p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f260q;

    /* JADX INFO: renamed from: r */
    public Runnable f261r;

    /* JADX INFO: renamed from: s */
    public ddl0 f262s;

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
    public static final Map<Class<?>, Integer> f219k0 = new e01();

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
        public void m338a() {
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
        public abstract IntentFilter mo339b();

        /* JADX INFO: renamed from: c */
        public abstract int mo340c();

        /* JADX INFO: renamed from: d */
        public abstract void mo341d();

        /* JADX INFO: renamed from: e */
        public void m342e() {
            m338a();
            IntentFilter intentFilterMo339b = mo339b();
            if (intentFilterMo339b == null || intentFilterMo339b.countActions() == 0) {
                return;
            }
            if (this.f270a == null) {
                this.f270a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.mo341d();
                    }
                };
            }
            ii5.m136342l(AppCompatDelegateImpl.this.f248e, this.f270a, intentFilterMo339b);
        }
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m343c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m287U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m343c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.m282P(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(nu0.m161424b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class RunnableC0060a implements Runnable {
        public RunnableC0060a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f241U & 1) != 0) {
                appCompatDelegateImpl.m288V(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f241U & 4096) != 0) {
                appCompatDelegateImpl2.m288V(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f240T = false;
            appCompatDelegateImpl3.f241U = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0061b implements bd50 {
        public C0061b() {
        }

        @Override // p149l.bd50
        public y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
            int iM213185l = y6q0Var.m213185l();
            int iM277K0 = AppCompatDelegateImpl.this.m277K0(iM213185l);
            if (iM213185l != iM277K0) {
                y6q0Var = y6q0Var.m213189q(y6q0Var.m213183j(), iM277K0, y6q0Var.m213184k(), y6q0Var.m213182i());
            }
            return gbl0.m125178W(view, y6q0Var);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C0062c implements ContentFrameLayout.InterfaceC0128a {
        public C0062c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0128a
        /* JADX INFO: renamed from: a */
        public void mo344a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0128a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m286T();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class RunnableC0063d implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        public class a extends gdl0 {
            public a() {
            }

            @Override // p149l.gdl0, p149l.fdl0
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f259p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f262s.m111035g(null);
                AppCompatDelegateImpl.this.f262s = null;
            }

            @Override // p149l.gdl0, p149l.fdl0
            public void onAnimationStart(View view) {
                AppCompatDelegateImpl.this.f259p.setVisibility(0);
            }
        }

        public RunnableC0063d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f260q.showAtLocation(appCompatDelegateImpl.f259p, 55, 0, 0);
            AppCompatDelegateImpl.this.m289W();
            boolean zM263D0 = AppCompatDelegateImpl.this.m263D0();
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (!zM263D0) {
                appCompatDelegateImpl2.f259p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f259p.setVisibility(0);
            } else {
                appCompatDelegateImpl2.f259p.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f262s = gbl0.m125186c(appCompatDelegateImpl3.f259p).m111030b(1.0f);
                AppCompatDelegateImpl.this.f262s.m111035g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0064e extends gdl0 {
        public C0064e() {
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationEnd(View view) {
            AppCompatDelegateImpl.this.f259p.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f262s.m111035g(null);
            AppCompatDelegateImpl.this.f262s = null;
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationStart(View view) {
            AppCompatDelegateImpl.this.f259p.setVisibility(0);
            AppCompatDelegateImpl.this.f259p.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f259p.getParent() instanceof View) {
                gbl0.m125195g0((View) AppCompatDelegateImpl.this.f259p.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C0065f implements k30 {
        public C0065f() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public final class C0066g implements InterfaceC0091g.a {
        public C0066g() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        /* JADX INFO: renamed from: a */
        public boolean mo345a(MenuBuilder menuBuilder) {
            Window.Callback callbackM301f0 = AppCompatDelegateImpl.this.m301f0();
            if (callbackM301f0 == null) {
                return true;
            }
            callbackM301f0.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m280N(menuBuilder);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public class C0067h implements u30.InterfaceC20342a {

        /* JADX INFO: renamed from: a */
        public u30.InterfaceC20342a f282a;

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h$a */
        public class a extends gdl0 {
            public a() {
            }

            @Override // p149l.gdl0, p149l.fdl0
            public void onAnimationEnd(View view) {
                AppCompatDelegateImpl.this.f259p.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f260q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f259p.getParent() instanceof View) {
                    gbl0.m125195g0((View) AppCompatDelegateImpl.this.f259p.getParent());
                }
                AppCompatDelegateImpl.this.f259p.removeAllViews();
                AppCompatDelegateImpl.this.f262s.m111035g(null);
                AppCompatDelegateImpl.this.f262s = null;
            }
        }

        public C0067h(u30.InterfaceC20342a interfaceC20342a) {
            this.f282a = interfaceC20342a;
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(u30 u30Var, MenuItem menuItem) {
            return this.f282a.mo346a(u30Var, menuItem);
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: b */
        public boolean mo347b(u30 u30Var, Menu menu) {
            return this.f282a.mo347b(u30Var, menu);
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: c */
        public boolean mo348c(u30 u30Var, Menu menu) {
            return this.f282a.mo348c(u30Var, menu);
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: d */
        public void mo349d(u30 u30Var) {
            this.f282a.mo349d(u30Var);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f260q != null) {
                appCompatDelegateImpl.f249f.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f261r);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f259p != null) {
                appCompatDelegateImpl2.m289W();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f262s = gbl0.m125186c(appCompatDelegateImpl3.f259p).m111030b(0.0f);
                AppCompatDelegateImpl.this.f262s.m111035g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            fu0 fu0Var = appCompatDelegateImpl4.f251h;
            if (fu0Var != null) {
                fu0Var.onSupportActionModeFinished(appCompatDelegateImpl4.f258o);
            }
            AppCompatDelegateImpl.this.f258o = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public class C0069j extends AutoNightModeManager {

        /* JADX INFO: renamed from: c */
        public final PowerManager f286c;

        public C0069j(Context context) {
            super();
            this.f286c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: b */
        public IntentFilter mo339b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: c */
        public int mo340c() {
            return this.f286c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: d */
        public void mo341d() {
            AppCompatDelegateImpl.this.mo295b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public class C0070k extends AutoNightModeManager {

        /* JADX INFO: renamed from: c */
        public final jdj0 f288c;

        public C0070k(jdj0 jdj0Var) {
            super();
            this.f288c = jdj0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: b */
        public IntentFilter mo339b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: c */
        public int mo340c() {
            return this.f288c.m141033d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        /* JADX INFO: renamed from: d */
        public void mo341d() {
            AppCompatDelegateImpl.this.mo295b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public static final class C0071l {

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
        public C0087c f300k;

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

        public C0071l(int i) {
            this.f290a = i;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC0092h m351a(InterfaceC0091g.a aVar) {
            if (this.f299j == null) {
                return null;
            }
            if (this.f300k == null) {
                C0087c c0087c = new C0087c(this.f301l, g7c0.f101364l);
                this.f300k = c0087c;
                c0087c.setCallback(aVar);
                this.f299j.addMenuPresenter(this.f300k);
            }
            return this.f300k.m422b(this.f296g);
        }

        /* JADX INFO: renamed from: b */
        public boolean m352b() {
            if (this.f297h == null) {
                return false;
            }
            return this.f298i != null || this.f300k.m421a().getCount() > 0;
        }

        /* JADX INFO: renamed from: c */
        public void m353c(MenuBuilder menuBuilder) {
            C0087c c0087c;
            MenuBuilder menuBuilder2 = this.f299j;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.f300k);
            }
            this.f299j = menuBuilder;
            if (menuBuilder == null || (c0087c = this.f300k) == null) {
                return;
            }
            menuBuilder.addMenuPresenter(c0087c);
        }

        /* JADX INFO: renamed from: d */
        public void m354d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(n0c0.f136509a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(n0c0.f136499H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(p8c0.f147585d, true);
            }
            m16 m16Var = new m16(context, 0);
            m16Var.getTheme().setTo(themeNewTheme);
            this.f301l = m16Var;
            TypedArray typedArrayObtainStyledAttributes = m16Var.obtainStyledAttributes(aac0.f68534x0);
            this.f291b = typedArrayObtainStyledAttributes.getResourceId(aac0.f68294A0, 0);
            this.f295f = typedArrayObtainStyledAttributes.getResourceId(aac0.f68544z0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public final class C0072m implements InterfaceC0091g.a {
        public C0072m() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        /* JADX INFO: renamed from: a */
        public boolean mo345a(MenuBuilder menuBuilder) {
            Window.Callback callbackM301f0;
            if (menuBuilder != null) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f221A || (callbackM301f0 = appCompatDelegateImpl.m301f0()) == null || AppCompatDelegateImpl.this.f233M) {
                return true;
            }
            callbackM301f0.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            C0071l c0071lM292Z = appCompatDelegateImpl.m292Z(menuBuilder);
            if (c0071lM292Z != null) {
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if (!z2) {
                    appCompatDelegateImpl2.m283Q(c0071lM292Z, z);
                } else {
                    appCompatDelegateImpl2.m279M(c0071lM292Z.f290a, c0071lM292Z, rootMenu);
                    AppCompatDelegateImpl.this.m283Q(c0071lM292Z, true);
                }
            }
        }
    }

    static {
        f218F0 = Build.VERSION.SDK_INT <= 25;
    }

    public AppCompatDelegateImpl(Context context, Window window, fu0 fu0Var, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        AppCompatActivity appCompatActivityM271H0;
        this.f262s = null;
        this.f263t = true;
        this.f234N = -100;
        this.f242V = new RunnableC0060a();
        this.f248e = context;
        this.f251h = fu0Var;
        this.f247d = obj;
        if (this.f234N == -100 && (obj instanceof Dialog) && (appCompatActivityM271H0 = m271H0()) != null) {
            this.f234N = appCompatActivityM271H0.getDelegate().mo307j();
        }
        if (this.f234N == -100 && (num = (map = f219k0).get(obj.getClass())) != null) {
            this.f234N = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            m276K(window);
        }
        iu0.m138317h();
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: A */
    public void mo257A(int i) {
        m290X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f248e).inflate(i, viewGroup);
        this.f250g.m129520a().onContentChanged();
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m258A0(C0071l c0071l, KeyEvent keyEvent) {
        jhd jhdVar;
        jhd jhdVar2;
        jhd jhdVar3;
        if (this.f233M) {
            return false;
        }
        if (c0071l.f302m) {
            return true;
        }
        C0071l c0071l2 = this.f228H;
        if (c0071l2 != null && c0071l2 != c0071l) {
            m283Q(c0071l2, false);
        }
        Window.Callback callbackM301f0 = m301f0();
        if (callbackM301f0 != null) {
            c0071l.f298i = callbackM301f0.onCreatePanelView(c0071l.f290a);
        }
        int i = c0071l.f290a;
        boolean z = i == 0 || i == 108;
        if (z && (jhdVar3 = this.f255l) != null) {
            jhdVar3.mo469f();
        }
        if (c0071l.f298i == null && (!z || !(m335y0() instanceof ysi0))) {
            MenuBuilder menuBuilder = c0071l.f299j;
            if (menuBuilder == null || c0071l.f307r) {
                if (menuBuilder == null && (!m308j0(c0071l) || c0071l.f299j == null)) {
                    return false;
                }
                if (z && this.f255l != null) {
                    if (this.f256m == null) {
                        this.f256m = new C0066g();
                    }
                    this.f255l.mo468e(c0071l.f299j, this.f256m);
                }
                c0071l.f299j.stopDispatchingItemsChanged();
                if (!callbackM301f0.onCreatePanelMenu(c0071l.f290a, c0071l.f299j)) {
                    c0071l.m353c(null);
                    if (z && (jhdVar = this.f255l) != null) {
                        jhdVar.mo468e(null, this.f256m);
                    }
                    return false;
                }
                c0071l.f307r = false;
            }
            c0071l.f299j.stopDispatchingItemsChanged();
            Bundle bundle = c0071l.f308s;
            if (bundle != null) {
                c0071l.f299j.restoreActionViewStates(bundle);
                c0071l.f308s = null;
            }
            if (!callbackM301f0.onPreparePanel(0, c0071l.f298i, c0071l.f299j)) {
                if (z && (jhdVar2 = this.f255l) != null) {
                    jhdVar2.mo468e(null, this.f256m);
                }
                c0071l.f299j.startDispatchingItemsChanged();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0071l.f305p = z2;
            c0071l.f299j.setQwertyMode(z2);
            c0071l.f299j.startDispatchingItemsChanged();
        }
        c0071l.f302m = true;
        c0071l.f303n = false;
        this.f228H = c0071l;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: B */
    public void mo259B(View view) {
        m290X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f250g.m129520a().onContentChanged();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m260B0(MenuBuilder menuBuilder, boolean z) {
        jhd jhdVar = this.f255l;
        if (jhdVar == null || !jhdVar.mo464a() || (ViewConfiguration.get(this.f248e).hasPermanentMenuKey() && !this.f255l.mo470g())) {
            C0071l c0071lM299d0 = m299d0(0, true);
            c0071lM299d0.f306q = true;
            m283Q(c0071lM299d0, false);
            m334x0(c0071lM299d0, null);
            return;
        }
        Window.Callback callbackM301f0 = m301f0();
        if (this.f255l.mo466c() && z) {
            this.f255l.mo467d();
            if (this.f233M) {
                return;
            }
            callbackM301f0.onPanelClosed(108, m299d0(0, true).f299j);
            return;
        }
        if (callbackM301f0 == null || this.f233M) {
            return;
        }
        if (this.f240T && (this.f241U & 1) != 0) {
            this.f249f.getDecorView().removeCallbacks(this.f242V);
            this.f242V.run();
        }
        C0071l c0071lM299d1 = m299d0(0, true);
        MenuBuilder menuBuilder2 = c0071lM299d1.f299j;
        if (menuBuilder2 == null || c0071lM299d1.f307r || !callbackM301f0.onPreparePanel(0, c0071lM299d1.f298i, menuBuilder2)) {
            return;
        }
        callbackM301f0.onMenuOpened(108, c0071lM299d1.f299j);
        this.f255l.mo465b();
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: C */
    public void mo261C(View view, ViewGroup.LayoutParams layoutParams) {
        m290X();
        ViewGroup viewGroup = (ViewGroup) this.f265v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f250g.m129520a().onContentChanged();
    }

    /* JADX INFO: renamed from: C0 */
    public final int m262C0(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m263D0() {
        ViewGroup viewGroup;
        return this.f264u && (viewGroup = this.f265v) != null && gbl0.m125171P(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: E */
    public void mo264E(Toolbar toolbar) {
        if (this.f247d instanceof Activity) {
            i30 i30VarMo311l = mo311l();
            if (i30VarMo311l instanceof j6q0) {
                qkq0.m175383a("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.f253j = null;
            if (i30VarMo311l != null) {
                i30VarMo311l.mo134130q();
            }
            if (toolbar != null) {
                ysi0 ysi0Var = new ysi0(toolbar, m300e0(), this.f250g);
                this.f252i = ysi0Var;
                this.f249f.setCallback(ysi0Var.m215909J());
            } else {
                this.f252i = null;
                this.f249f.setCallback(this.f250g);
            }
            mo315n();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m265E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f249f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || gbl0.m125170O((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: F */
    public void mo266F(@StyleRes int i) {
        this.f235O = i;
    }

    /* JADX INFO: renamed from: F0 */
    public u30 m267F0(@NonNull u30.InterfaceC20342a interfaceC20342a) {
        u30 u30VarOnWindowStartingSupportActionMode;
        fu0 fu0Var;
        m289W();
        u30 u30Var = this.f258o;
        if (u30Var != null) {
            u30Var.mo108669a();
        }
        if (!(interfaceC20342a instanceof C0067h)) {
            interfaceC20342a = new C0067h(interfaceC20342a);
        }
        fu0 fu0Var2 = this.f251h;
        if (fu0Var2 == null || this.f233M) {
            u30VarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                u30VarOnWindowStartingSupportActionMode = fu0Var2.onWindowStartingSupportActionMode(interfaceC20342a);
            } catch (AbstractMethodError unused) {
                u30VarOnWindowStartingSupportActionMode = null;
            }
        }
        if (u30VarOnWindowStartingSupportActionMode != null) {
            this.f258o = u30VarOnWindowStartingSupportActionMode;
        } else {
            if (this.f259p == null) {
                if (this.f224D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f248e.getTheme();
                    theme.resolveAttribute(n0c0.f136515g, typedValue, true);
                    int i = typedValue.resourceId;
                    Context m16Var = this.f248e;
                    if (i != 0) {
                        Resources.Theme themeNewTheme = m16Var.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        m16Var = new m16(this.f248e, 0);
                        m16Var.getTheme().setTo(themeNewTheme);
                    }
                    this.f259p = new ActionBarContextView(m16Var);
                    PopupWindow popupWindow = new PopupWindow(m16Var, (AttributeSet) null, n0c0.f136518j);
                    this.f260q = popupWindow;
                    ed80.m115790b(popupWindow, 2);
                    this.f260q.setContentView(this.f259p);
                    this.f260q.setWidth(-1);
                    m16Var.getTheme().resolveAttribute(n0c0.f136510b, typedValue, true);
                    this.f259p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, m16Var.getResources().getDisplayMetrics()));
                    this.f260q.setHeight(-2);
                    this.f261r = new RunnableC0063d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f265v.findViewById(s5c0.f162524h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m294a0()));
                        this.f259p = (ActionBarContextView) viewStubCompat.m609a();
                    }
                }
            }
            if (this.f259p != null) {
                m289W();
                this.f259p.m461k();
                ctf0 ctf0Var = new ctf0(this.f259p.getContext(), this.f259p, interfaceC20342a, this.f260q == null);
                if (interfaceC20342a.mo347b(ctf0Var, ctf0Var.mo108671c())) {
                    ctf0Var.mo108675i();
                    this.f259p.m458h(ctf0Var);
                    this.f258o = ctf0Var;
                    boolean zM263D0 = m263D0();
                    ActionBarContextView actionBarContextView = this.f259p;
                    if (zM263D0) {
                        actionBarContextView.setAlpha(0.0f);
                        ddl0 ddl0VarM111030b = gbl0.m125186c(this.f259p).m111030b(1.0f);
                        this.f262s = ddl0VarM111030b;
                        ddl0VarM111030b.m111035g(new C0064e());
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        this.f259p.setVisibility(0);
                        this.f259p.sendAccessibilityEvent(32);
                        if (this.f259p.getParent() instanceof View) {
                            gbl0.m125195g0((View) this.f259p.getParent());
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
        u30 u30Var2 = this.f258o;
        if (u30Var2 != null && (fu0Var = this.f251h) != null) {
            fu0Var.onSupportActionModeStarted(u30Var2);
        }
        return this.f258o;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: G */
    public final void mo268G(CharSequence charSequence) {
        this.f254k = charSequence;
        jhd jhdVar = this.f255l;
        if (jhdVar != null) {
            jhdVar.setWindowTitle(charSequence);
            return;
        }
        if (m335y0() != null) {
            m335y0().mo134116F(charSequence);
            return;
        }
        TextView textView = this.f266w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m269G0() {
        if (this.f264u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: H */
    public u30 mo270H(@NonNull u30.InterfaceC20342a interfaceC20342a) {
        fu0 fu0Var;
        if (interfaceC20342a == null) {
            ig3.m135964a("ActionMode callback can not be null.");
            return null;
        }
        u30 u30Var = this.f258o;
        if (u30Var != null) {
            u30Var.mo108669a();
        }
        C0067h c0067h = new C0067h(interfaceC20342a);
        i30 i30VarMo311l = mo311l();
        if (i30VarMo311l != null) {
            u30 u30VarMo134118H = i30VarMo311l.mo134118H(c0067h);
            this.f258o = u30VarMo134118H;
            if (u30VarMo134118H != null && (fu0Var = this.f251h) != null) {
                fu0Var.onSupportActionModeStarted(u30VarMo134118H);
            }
        }
        if (this.f258o == null) {
            this.f258o = m267F0(c0067h);
        }
        return this.f258o;
    }

    @Nullable
    /* JADX INFO: renamed from: H0 */
    public final AppCompatActivity m271H0() {
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
    public final boolean m272I(boolean z) {
        if (this.f233M) {
            return false;
        }
        int iM278L = m278L();
        boolean zM273I0 = m273I0(m316n0(iM278L), z);
        if (iM278L == 0) {
            m297c0().m342e();
        } else {
            AutoNightModeManager autoNightModeManager = this.f238R;
            if (autoNightModeManager != null) {
                autoNightModeManager.m338a();
            }
        }
        if (iM278L == 3) {
            m296b0().m342e();
            return zM273I0;
        }
        AutoNightModeManager autoNightModeManager2 = this.f239S;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.m338a();
        }
        return zM273I0;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m273I0(int i, boolean z) {
        int i2;
        int i3 = this.f248e.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        if (i != 1) {
            i2 = i != 2 ? i3 : 32;
        } else {
            i2 = 16;
        }
        boolean zM312l0 = m312l0();
        boolean z3 = false;
        if ((f218F0 || i2 != i3) && !zM312l0 && !this.f230J && (this.f247d instanceof ContextThemeWrapper)) {
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
        if (!z3 && i4 != i2 && z && !zM312l0 && this.f230J) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                b50.m100286t((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i2) {
            z2 = z3;
        } else {
            m275J0(i2, zM312l0);
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
    public final void m274J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f265v.findViewById(R.id.content);
        View decorView = this.f249f.getDecorView();
        contentFrameLayout.m562b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f248e.obtainStyledAttributes(aac0.f68534x0);
        typedArrayObtainStyledAttributes.getValue(aac0.f68339J0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(aac0.f68344K0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68329H0)) {
            typedArrayObtainStyledAttributes.getValue(aac0.f68329H0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68334I0)) {
            typedArrayObtainStyledAttributes.getValue(aac0.f68334I0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68319F0)) {
            typedArrayObtainStyledAttributes.getValue(aac0.f68319F0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(aac0.f68324G0)) {
            typedArrayObtainStyledAttributes.getValue(aac0.f68324G0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public final void m275J0(int i, boolean z) {
        Resources resources = this.f248e.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            bxc0.m104310a(resources);
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
                if (activity instanceof jcr) {
                    if (((jcr) activity).getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f232L) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m276K(@NonNull Window window) {
        if (this.f249f != null) {
            qkq0.m175383a("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0068i) {
            qkq0.m175383a("AppCompat has already installed itself into the Window");
            return;
        }
        C0068i c0068i = new C0068i(callback);
        this.f250g = c0068i;
        window.setCallback(c0068i);
        qri0 qri0VarM175992t = qri0.m175992t(this.f248e, null, f217E0);
        Drawable drawableM176001h = qri0VarM175992t.m176001h(0);
        if (drawableM176001h != null) {
            window.setBackgroundDrawable(drawableM176001h);
        }
        qri0VarM175992t.m176012v();
        this.f249f = window;
    }

    /* JADX INFO: renamed from: K0 */
    public int m277K0(int i) {
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
                fel0.m121042a(this.f265v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f267x;
                    if (view == null) {
                        View view2 = new View(this.f248e);
                        this.f267x = view2;
                        view2.setBackgroundColor(this.f248e.getResources().getColor(t1c0.f167306a));
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
    public final int m278L() {
        int i = this.f234N;
        return i != -100 ? i : AbstractC0075b.m363h();
    }

    /* JADX INFO: renamed from: M */
    public void m279M(int i, C0071l c0071l, Menu menu) {
        if (menu == null) {
            if (c0071l == null && i >= 0) {
                C0071l[] c0071lArr = this.f227G;
                if (i < c0071lArr.length) {
                    c0071l = c0071lArr[i];
                }
            }
            if (c0071l != null) {
                menu = c0071l.f299j;
            }
        }
        if ((c0071l == null || c0071l.f304o) && !this.f233M) {
            this.f250g.m129520a().onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m280N(MenuBuilder menuBuilder) {
        if (this.f226F) {
            return;
        }
        this.f226F = true;
        this.f255l.mo472i();
        Window.Callback callbackM301f0 = m301f0();
        if (callbackM301f0 != null && !this.f233M) {
            callbackM301f0.onPanelClosed(108, menuBuilder);
        }
        this.f226F = false;
    }

    /* JADX INFO: renamed from: O */
    public final void m281O() {
        AutoNightModeManager autoNightModeManager = this.f238R;
        if (autoNightModeManager != null) {
            autoNightModeManager.m338a();
        }
        AutoNightModeManager autoNightModeManager2 = this.f239S;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.m338a();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m282P(int i) {
        m283Q(m299d0(i, true), true);
    }

    /* JADX INFO: renamed from: Q */
    public void m283Q(C0071l c0071l, boolean z) {
        ViewGroup viewGroup;
        jhd jhdVar;
        if (z && c0071l.f290a == 0 && (jhdVar = this.f255l) != null && jhdVar.mo466c()) {
            m280N(c0071l.f299j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f248e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null && c0071l.f304o && (viewGroup = c0071l.f296g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m279M(c0071l.f290a, c0071l, null);
            }
        }
        c0071l.f302m = false;
        c0071l.f303n = false;
        c0071l.f304o = false;
        c0071l.f297h = null;
        c0071l.f306q = true;
        if (this.f228H == c0071l) {
            this.f228H = null;
        }
    }

    /* JADX INFO: renamed from: R */
    public final ViewGroup m284R() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f248e.obtainStyledAttributes(aac0.f68534x0);
        if (!typedArrayObtainStyledAttributes.hasValue(aac0.f68304C0)) {
            typedArrayObtainStyledAttributes.recycle();
            qkq0.m175383a("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return null;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(aac0.f68349L0, false)) {
            mo336z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(aac0.f68304C0, false)) {
            mo336z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(aac0.f68309D0, false)) {
            mo336z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(aac0.f68314E0, false)) {
            mo336z(10);
        }
        this.f224D = typedArrayObtainStyledAttributes.getBoolean(aac0.f68539y0, false);
        typedArrayObtainStyledAttributes.recycle();
        m291Y();
        this.f249f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f248e);
        if (this.f225E) {
            viewGroup = this.f223C ? (ViewGroup) layoutInflaterFrom.inflate(g7c0.f101369q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(g7c0.f101368p, (ViewGroup) null);
            gbl0.m125231y0(viewGroup, new C0061b());
        } else if (this.f224D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(g7c0.f101360h, (ViewGroup) null);
            this.f222B = false;
            this.f221A = false;
        } else if (this.f221A) {
            TypedValue typedValue = new TypedValue();
            this.f248e.getTheme().resolveAttribute(n0c0.f136515g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m16(this.f248e, typedValue.resourceId) : this.f248e).inflate(g7c0.f101370r, (ViewGroup) null);
            jhd jhdVar = (jhd) viewGroup.findViewById(s5c0.f162533q);
            this.f255l = jhdVar;
            jhdVar.setWindowCallback(m301f0());
            if (this.f222B) {
                this.f255l.mo471h(109);
            }
            if (this.f268y) {
                this.f255l.mo471h(2);
            }
            if (this.f269z) {
                this.f255l.mo471h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (this.f255l == null) {
                this.f266w = (TextView) viewGroup.findViewById(s5c0.f162513S);
            }
            fel0.m121044c(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(s5c0.f162518b);
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
            contentFrameLayout.setAttachListener(new C0062c());
            return viewGroup;
        }
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f221A + ", windowActionBarOverlay: " + this.f222B + ", android:windowIsFloating: " + this.f224D + ", windowActionModeOverlay: " + this.f223C + ", windowNoTitle: " + this.f225E + " }");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public View m285S(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        if (this.f246Z == null) {
            String string = this.f248e.obtainStyledAttributes(aac0.f68534x0).getString(aac0.f68299B0);
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
        boolean zM265E0 = false;
        if (z) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zM265E0 = m265E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zM265E0 = true;
            }
        }
        return this.f246Z.createView(view, str, context, attributeSet, zM265E0, z, true, psk0.m171179b());
    }

    /* JADX INFO: renamed from: T */
    public void m286T() {
        MenuBuilder menuBuilder;
        jhd jhdVar = this.f255l;
        if (jhdVar != null) {
            jhdVar.mo472i();
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
        m289W();
        C0071l c0071lM299d0 = m299d0(0, false);
        if (c0071lM299d0 == null || (menuBuilder = c0071lM299d0.f299j) == null) {
            return;
        }
        menuBuilder.close();
    }

    /* JADX INFO: renamed from: U */
    public boolean m287U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f247d;
        if (((obj instanceof lxq.InterfaceC18347a) || (obj instanceof hu0)) && (decorView = this.f249f.getDecorView()) != null && lxq.m152081d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f250g.m129520a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m318p0(keyCode, keyEvent) : m324s0(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: V */
    public void m288V(int i) {
        C0071l c0071lM299d0;
        C0071l c0071lM299d1 = m299d0(i, true);
        if (c0071lM299d1.f299j != null) {
            Bundle bundle = new Bundle();
            c0071lM299d1.f299j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c0071lM299d1.f308s = bundle;
            }
            c0071lM299d1.f299j.stopDispatchingItemsChanged();
            c0071lM299d1.f299j.clear();
        }
        c0071lM299d1.f307r = true;
        c0071lM299d1.f306q = true;
        if ((i != 108 && i != 0) || this.f255l == null || (c0071lM299d0 = m299d0(0, false)) == null) {
            return;
        }
        c0071lM299d0.f302m = false;
        m258A0(c0071lM299d0, null);
    }

    /* JADX INFO: renamed from: W */
    public void m289W() {
        ddl0 ddl0Var = this.f262s;
        if (ddl0Var != null) {
            ddl0Var.m111031c();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m290X() {
        if (this.f264u) {
            return;
        }
        this.f265v = m284R();
        CharSequence charSequenceM300e0 = m300e0();
        if (!TextUtils.isEmpty(charSequenceM300e0)) {
            jhd jhdVar = this.f255l;
            if (jhdVar != null) {
                jhdVar.setWindowTitle(charSequenceM300e0);
            } else if (m335y0() != null) {
                m335y0().mo134116F(charSequenceM300e0);
            } else {
                TextView textView = this.f266w;
                if (textView != null) {
                    textView.setText(charSequenceM300e0);
                }
            }
        }
        m274J();
        m332w0(this.f265v);
        this.f264u = true;
        C0071l c0071lM299d0 = m299d0(0, false);
        if (this.f233M) {
            return;
        }
        if (c0071lM299d0 == null || c0071lM299d0.f299j == null) {
            m310k0(108);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m291Y() {
        if (this.f249f == null) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                m276K(((Activity) obj).getWindow());
            }
        }
        if (this.f249f != null) {
            return;
        }
        qkq0.m175383a("We have not been given a Window");
    }

    /* JADX INFO: renamed from: Z */
    public C0071l m292Z(Menu menu) {
        C0071l[] c0071lArr = this.f227G;
        int length = c0071lArr != null ? c0071lArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0071l c0071l = c0071lArr[i];
            if (c0071l != null && c0071l.f299j == menu) {
                return c0071l;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: a */
    public void mo293a(View view, ViewGroup.LayoutParams layoutParams) {
        m290X();
        ((ViewGroup) this.f265v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f250g.m129520a().onContentChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public final Context m294a0() {
        i30 i30VarMo311l = mo311l();
        Context contextMo134125l = i30VarMo311l != null ? i30VarMo311l.mo134125l() : null;
        return contextMo134125l == null ? this.f248e : contextMo134125l;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: b */
    public boolean mo295b() {
        return m272I(true);
    }

    /* JADX INFO: renamed from: b0 */
    public final AutoNightModeManager m296b0() {
        if (this.f239S == null) {
            this.f239S = new C0069j(this.f248e);
        }
        return this.f239S;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c0 */
    public final AutoNightModeManager m297c0() {
        if (this.f238R == null) {
            this.f238R = new C0070k(jdj0.m141030a(this.f248e));
        }
        return this.f238R;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: d */
    public void mo298d(Context context) {
        m272I(false);
        this.f230J = true;
    }

    /* JADX INFO: renamed from: d0 */
    public C0071l m299d0(int i, boolean z) {
        C0071l[] c0071lArr = this.f227G;
        if (c0071lArr == null || c0071lArr.length <= i) {
            C0071l[] c0071lArr2 = new C0071l[i + 1];
            if (c0071lArr != null) {
                System.arraycopy(c0071lArr, 0, c0071lArr2, 0, c0071lArr.length);
            }
            this.f227G = c0071lArr2;
            c0071lArr = c0071lArr2;
        }
        C0071l c0071l = c0071lArr[i];
        if (c0071l != null) {
            return c0071l;
        }
        C0071l c0071l2 = new C0071l(i);
        c0071lArr[i] = c0071l2;
        return c0071l2;
    }

    /* JADX INFO: renamed from: e0 */
    public final CharSequence m300e0() {
        Object obj = this.f247d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f254k;
    }

    /* JADX INFO: renamed from: f0 */
    public final Window.Callback m301f0() {
        return this.f249f.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    @Nullable
    /* JADX INFO: renamed from: g */
    public <T extends View> T mo302g(@IdRes int i) {
        m290X();
        return (T) this.f249f.findViewById(i);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m303g0() {
        m290X();
        if (this.f221A && this.f252i == null) {
            Object obj = this.f247d;
            if (obj instanceof Activity) {
                this.f252i = new j6q0((Activity) this.f247d, this.f222B);
            } else if (obj instanceof Dialog) {
                this.f252i = new j6q0((Dialog) this.f247d);
            }
            i30 i30Var = this.f252i;
            if (i30Var != null) {
                i30Var.mo134135v(this.f243W);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m304h0(C0071l c0071l) {
        View view = c0071l.f298i;
        if (view != null) {
            c0071l.f297h = view;
            return true;
        }
        if (c0071l.f299j == null) {
            return false;
        }
        if (this.f257n == null) {
            this.f257n = new C0072m();
        }
        View view2 = (View) c0071l.m351a(this.f257n);
        c0071l.f297h = view2;
        return view2 != null;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: i */
    public final k30 mo305i() {
        return new C0065f();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m306i0(C0071l c0071l) {
        c0071l.m354d(m294a0());
        c0071l.f296g = new ListMenuDecorView(c0071l.f301l);
        c0071l.f292c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: j */
    public int mo307j() {
        return this.f234N;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m308j0(C0071l c0071l) {
        Resources.Theme themeNewTheme;
        Context context = this.f248e;
        int i = c0071l.f290a;
        if ((i == 0 || i == 108) && this.f255l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(n0c0.f136515g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(n0c0.f136516h, typedValue, true);
            } else {
                theme.resolveAttribute(n0c0.f136516h, typedValue, true);
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
                m16 m16Var = new m16(context, 0);
                m16Var.getTheme().setTo(themeNewTheme);
                context = m16Var;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        c0071l.m353c(menuBuilder);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: k */
    public MenuInflater mo309k() {
        if (this.f253j == null) {
            m303g0();
            i30 i30Var = this.f252i;
            this.f253j = new yyg0(i30Var != null ? i30Var.mo134125l() : this.f248e);
        }
        return this.f253j;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m310k0(int i) {
        this.f241U = (1 << i) | this.f241U;
        if (this.f240T) {
            return;
        }
        gbl0.m125185b0(this.f249f.getDecorView(), this.f242V);
        this.f240T = true;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: l */
    public i30 mo311l() {
        m303g0();
        return this.f252i;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m312l0() {
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

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: m */
    public void mo313m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f248e);
        if (layoutInflaterFrom.getFactory() == null) {
            n7r.m158156a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m314m0() {
        return this.f263t;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: n */
    public void mo315n() {
        i30 i30VarMo311l = mo311l();
        if (i30VarMo311l == null || !i30VarMo311l.mo134127n()) {
            m310k0(0);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public int m316n0(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) this.f248e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                return m297c0().mo340c();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return m296b0().mo340c();
                }
                qkq0.m175383a("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m317o0() {
        u30 u30Var = this.f258o;
        if (u30Var != null) {
            u30Var.mo108669a();
            return true;
        }
        i30 i30VarMo311l = mo311l();
        return i30VarMo311l != null && i30VarMo311l.mo134120g();
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        C0071l c0071lM292Z;
        Window.Callback callbackM301f0 = m301f0();
        if (callbackM301f0 == null || this.f233M || (c0071lM292Z = m292Z(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return callbackM301f0.onMenuItemSelected(c0071lM292Z.f290a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        m260B0(menuBuilder, true);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m318p0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f229I = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m320q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: q */
    public void mo319q(Configuration configuration) {
        i30 i30VarMo311l;
        if (this.f221A && this.f264u && (i30VarMo311l = mo311l()) != null) {
            i30VarMo311l.mo134129p(configuration);
        }
        iu0.m138315b().m138322g(this.f248e);
        m272I(false);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m320q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0071l c0071lM299d0 = m299d0(i, true);
        if (c0071lM299d0.f304o) {
            return false;
        }
        return m258A0(c0071lM299d0, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: r */
    public void mo321r(Bundle bundle) {
        String strM191906c;
        this.f230J = true;
        m272I(false);
        m291Y();
        Object obj = this.f247d;
        if (obj instanceof Activity) {
            try {
                strM191906c = u620.m191906c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM191906c = null;
            }
            if (strM191906c != null) {
                i30 i30VarM335y0 = m335y0();
                if (i30VarM335y0 == null) {
                    this.f243W = true;
                } else {
                    i30VarM335y0.mo134135v(true);
                }
            }
        }
        this.f231K = true;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m322r0(int i, KeyEvent keyEvent) {
        i30 i30VarMo311l = mo311l();
        if (i30VarMo311l != null && i30VarMo311l.mo134131r(i, keyEvent)) {
            return true;
        }
        C0071l c0071l = this.f228H;
        if (c0071l != null && m337z0(c0071l, keyEvent.getKeyCode(), keyEvent, 1)) {
            C0071l c0071l2 = this.f228H;
            if (c0071l2 != null) {
                c0071l2.f303n = true;
            }
            return true;
        }
        if (this.f228H == null) {
            C0071l c0071lM299d0 = m299d0(0, true);
            m258A0(c0071lM299d0, keyEvent);
            boolean zM337z0 = m337z0(c0071lM299d0, keyEvent.getKeyCode(), keyEvent, 1);
            c0071lM299d0.f302m = false;
            if (zM337z0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: s */
    public void mo323s() {
        AbstractC0075b.m365p(this);
        if (this.f240T) {
            this.f249f.getDecorView().removeCallbacks(this.f242V);
        }
        this.f232L = false;
        this.f233M = true;
        i30 i30Var = this.f252i;
        if (i30Var != null) {
            i30Var.mo134130q();
        }
        m281O();
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m324s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f229I;
            this.f229I = false;
            C0071l c0071lM299d0 = m299d0(0, false);
            if (c0071lM299d0 != null && c0071lM299d0.f304o) {
                if (!z) {
                    m283Q(c0071lM299d0, true);
                }
                return true;
            }
            if (m317o0()) {
                return true;
            }
        } else if (i == 82) {
            m326t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: t */
    public void mo325t(Bundle bundle) {
        m290X();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX INFO: renamed from: t0 */
    public final boolean m326t0(int i, KeyEvent keyEvent) {
        boolean zM258A0;
        AudioManager audioManager;
        jhd jhdVar;
        if (this.f258o != null) {
            return false;
        }
        boolean zMo467d = true;
        C0071l c0071lM299d0 = m299d0(i, true);
        if (i != 0 || (jhdVar = this.f255l) == null || !jhdVar.mo464a() || ViewConfiguration.get(this.f248e).hasPermanentMenuKey()) {
            boolean z = c0071lM299d0.f304o;
            if (z || c0071lM299d0.f303n) {
                m283Q(c0071lM299d0, true);
                zMo467d = z;
            } else if (c0071lM299d0.f302m) {
                if (c0071lM299d0.f307r) {
                    c0071lM299d0.f302m = false;
                    zM258A0 = m258A0(c0071lM299d0, keyEvent);
                } else {
                    zM258A0 = true;
                }
                if (zM258A0) {
                    m334x0(c0071lM299d0, keyEvent);
                } else {
                    zMo467d = false;
                }
            } else {
                zMo467d = false;
            }
        } else if (this.f255l.mo466c()) {
            zMo467d = this.f255l.mo467d();
        } else if (this.f233M || !m258A0(c0071lM299d0, keyEvent)) {
            zMo467d = false;
        } else {
            zMo467d = this.f255l.mo465b();
        }
        if (zMo467d && (audioManager = (AudioManager) this.f248e.getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zMo467d;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: u */
    public void mo327u() {
        i30 i30VarMo311l = mo311l();
        if (i30VarMo311l != null) {
            i30VarMo311l.mo134114D(true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m328u0(int i) {
        i30 i30VarMo311l;
        if (i != 108 || (i30VarMo311l = mo311l()) == null) {
            return;
        }
        i30VarMo311l.mo134121h(true);
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: v */
    public void mo329v(Bundle bundle) {
        if (this.f234N != -100) {
            f219k0.put(this.f247d.getClass(), Integer.valueOf(this.f234N));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m330v0(int i) {
        if (i == 108) {
            i30 i30VarMo311l = mo311l();
            if (i30VarMo311l != null) {
                i30VarMo311l.mo134121h(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0071l c0071lM299d0 = m299d0(i, true);
            if (c0071lM299d0.f304o) {
                m283Q(c0071lM299d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: w */
    public void mo331w() {
        this.f232L = true;
        mo295b();
        AbstractC0075b.m364o(this);
    }

    /* JADX INFO: renamed from: w0 */
    public void m332w0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: x */
    public void mo333x() {
        this.f232L = false;
        AbstractC0075b.m365p(this);
        i30 i30VarMo311l = mo311l();
        if (i30VarMo311l != null) {
            i30VarMo311l.mo134114D(false);
        }
        if (this.f247d instanceof Dialog) {
            m281O();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m334x0(C0071l c0071l, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0071l.f304o || this.f233M) {
            return;
        }
        if (c0071l.f290a == 0 && (this.f248e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM301f0 = m301f0();
        if (callbackM301f0 != null && !callbackM301f0.onMenuOpened(c0071l.f290a, c0071l.f299j)) {
            m283Q(c0071l, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f248e.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null && m258A0(c0071l, keyEvent)) {
            ViewGroup viewGroup = c0071l.f296g;
            if (viewGroup != null && !c0071l.f306q) {
                View view = c0071l.f298i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c0071l.f303n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, c0071l.f293d, c0071l.f294e, 1002, 8519680, -3);
                layoutParams2.gravity = c0071l.f292c;
                layoutParams2.windowAnimations = c0071l.f295f;
                windowManager.addView(c0071l.f296g, layoutParams2);
                c0071l.f304o = true;
            }
            if (viewGroup == null) {
                if (!m306i0(c0071l) || c0071l.f296g == null) {
                    return;
                }
            } else if (c0071l.f306q && viewGroup.getChildCount() > 0) {
                c0071l.f296g.removeAllViews();
            }
            if (!m304h0(c0071l) || !c0071l.m352b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c0071l.f297h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0071l.f296g.setBackgroundResource(c0071l.f291b);
            ViewParent parent = c0071l.f297h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0071l.f297h);
            }
            c0071l.f296g.addView(c0071l.f297h, layoutParams3);
            if (!c0071l.f297h.hasFocus()) {
                c0071l.f297h.requestFocus();
            }
            i = -2;
            c0071l.f303n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, c0071l.f293d, c0071l.f294e, 1002, 8519680, -3);
            layoutParams4.gravity = c0071l.f292c;
            layoutParams4.windowAnimations = c0071l.f295f;
            windowManager.addView(c0071l.f296g, layoutParams4);
            c0071l.f304o = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final i30 m335y0() {
        return this.f252i;
    }

    @Override // androidx.appcompat.app.AbstractC0075b
    /* JADX INFO: renamed from: z */
    public boolean mo336z(int i) {
        int iM262C0 = m262C0(i);
        if (this.f225E && iM262C0 == 108) {
            return false;
        }
        if (this.f221A && iM262C0 == 1) {
            this.f221A = false;
        }
        if (iM262C0 == 1) {
            m269G0();
            this.f225E = true;
            return true;
        }
        if (iM262C0 == 2) {
            m269G0();
            this.f268y = true;
            return true;
        }
        if (iM262C0 == 5) {
            m269G0();
            this.f269z = true;
            return true;
        }
        if (iM262C0 == 10) {
            m269G0();
            this.f223C = true;
            return true;
        }
        if (iM262C0 == 108) {
            m269G0();
            this.f221A = true;
            return true;
        }
        if (iM262C0 != 109) {
            return this.f249f.requestFeature(iM262C0);
        }
        m269G0();
        this.f222B = true;
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m337z0(C0071l c0071l, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0071l.f302m || m258A0(c0071l, keyEvent)) && (menuBuilder = c0071l.f299j) != null) {
            zPerformShortcut = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.f255l == null) {
            m283Q(c0071l, true);
        }
        return zPerformShortcut;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m285S(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C0068i extends h6q0 {
        public C0068i(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: b */
        public final ActionMode m350b(ActionMode.Callback callback) {
            wyg0.C20993a c20993a = new wyg0.C20993a(AppCompatDelegateImpl.this.f248e, callback);
            u30 u30VarMo270H = AppCompatDelegateImpl.this.mo270H(c20993a);
            if (u30VarMo270H != null) {
                return c20993a.m206099e(u30VarMo270H);
            }
            return null;
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m287U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.m322r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m328u0(i);
            return true;
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m330v0(i);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
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

        @Override // p149l.h6q0, android.view.Window.Callback
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            C0071l c0071lM299d0 = AppCompatDelegateImpl.this.m299d0(0, true);
            if (c0071lM299d0 == null || (menuBuilder = c0071lM299d0.f299j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            }
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.m314m0() && i == 0) ? m350b(callback) : super.onWindowStartingActionMode(callback, i);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, fu0 fu0Var) {
        this(dialog.getContext(), dialog.getWindow(), fu0Var, dialog);
    }

    public AppCompatDelegateImpl(Activity activity, fu0 fu0Var) {
        this(activity, null, fu0Var, activity);
    }
}
