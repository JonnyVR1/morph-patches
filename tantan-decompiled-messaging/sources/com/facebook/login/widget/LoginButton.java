package com.facebook.login.widget;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.C1577c;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.appevents.C1554f;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R$string;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p149l.a60;
import p149l.bzv;
import p149l.c84;
import p149l.g60;
import p149l.h60;
import p149l.k8c0;
import p149l.lsb;
import p149l.n1c0;
import p149l.nu0;
import p149l.r3c0;
import p149l.s8c0;

/* JADX INFO: loaded from: classes6.dex */
public class LoginButton extends FacebookButtonBase {

    /* JADX INFO: renamed from: j */
    public boolean f6777j;

    /* JADX INFO: renamed from: k */
    public String f6778k;

    /* JADX INFO: renamed from: l */
    public String f6779l;

    /* JADX INFO: renamed from: m */
    public C1704e f6780m;

    /* JADX INFO: renamed from: n */
    public String f6781n;

    /* JADX INFO: renamed from: o */
    public boolean f6782o;

    /* JADX INFO: renamed from: p */
    public ToolTipPopup.Style f6783p;

    /* JADX INFO: renamed from: q */
    public ToolTipMode f6784q;

    /* JADX INFO: renamed from: r */
    public long f6785r;

    /* JADX INFO: renamed from: s */
    public ToolTipPopup f6786s;

    /* JADX INFO: renamed from: t */
    public AccessTokenTracker f6787t;

    /* JADX INFO: renamed from: u */
    public bzv f6788u;

    /* JADX INFO: renamed from: v */
    public Float f6789v;

    /* JADX INFO: renamed from: w */
    public int f6790w;

    /* JADX INFO: renamed from: x */
    public final String f6791x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public c84 f6792y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public g60<Collection<? extends String>> f6793z;

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        public static ToolTipMode DEFAULT = AUTOMATIC;
        private int intValue;
        private String stringValue;

        ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode fromInt(int i) {
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$b */
    public class RunnableC1701b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f6795a;

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1656d f6797a;

            public a(C1656d c1656d) {
                this.f6797a = c1656d;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (lsb.m151554d(this)) {
                    return;
                }
                try {
                    LoginButton.this.m9166E(this.f6797a);
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                }
            }
        }

        public RunnableC1701b(String str) {
            this.f6795a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                LoginButton.this.getActivity().runOnUiThread(new a(FetchedAppSettingsManager.m8693r(this.f6795a, false)));
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$c */
    public class C1702c extends AccessTokenTracker {
        public C1702c() {
        }

        @Override // com.facebook.AccessTokenTracker
        /* JADX INFO: renamed from: d */
        public void mo7444d(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.m9164C();
            LoginButton.this.m9162A();
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$d */
    public static /* synthetic */ class C1703d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6800a;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            f6800a = iArr;
            try {
                iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6800a[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6800a[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$e */
    public static class C1704e {

        /* JADX INFO: renamed from: a */
        public DefaultAudience f6801a = DefaultAudience.FRIENDS;

        /* JADX INFO: renamed from: b */
        public List<String> f6802b = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: c */
        public LoginBehavior f6803c = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* JADX INFO: renamed from: d */
        public String f6804d = "rerequest";

        /* JADX INFO: renamed from: e */
        public LoginTargetApp f6805e = LoginTargetApp.FACEBOOK;

        /* JADX INFO: renamed from: f */
        public boolean f6806f = false;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f6807g;

        /* JADX INFO: renamed from: h */
        public boolean f6808h;

        /* JADX INFO: renamed from: b */
        public String m9175b() {
            return this.f6804d;
        }

        /* JADX INFO: renamed from: c */
        public DefaultAudience m9176c() {
            return this.f6801a;
        }

        /* JADX INFO: renamed from: d */
        public LoginBehavior m9177d() {
            return this.f6803c;
        }

        /* JADX INFO: renamed from: e */
        public LoginTargetApp m9178e() {
            return this.f6805e;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public String m9179f() {
            return this.f6807g;
        }

        /* JADX INFO: renamed from: g */
        public List<String> m9180g() {
            return this.f6802b;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9181h() {
            return this.f6808h;
        }

        /* JADX INFO: renamed from: i */
        public boolean m9182i() {
            return this.f6806f;
        }

        /* JADX INFO: renamed from: j */
        public void m9183j(String str) {
            this.f6804d = str;
        }

        /* JADX INFO: renamed from: k */
        public void m9184k(DefaultAudience defaultAudience) {
            this.f6801a = defaultAudience;
        }

        /* JADX INFO: renamed from: l */
        public void m9185l(LoginBehavior loginBehavior) {
            this.f6803c = loginBehavior;
        }

        /* JADX INFO: renamed from: m */
        public void m9186m(LoginTargetApp loginTargetApp) {
            this.f6805e = loginTargetApp;
        }

        /* JADX INFO: renamed from: n */
        public void m9187n(@Nullable String str) {
            this.f6807g = str;
        }

        /* JADX INFO: renamed from: o */
        public void m9188o(List<String> list) {
            this.f6802b = list;
        }

        /* JADX INFO: renamed from: p */
        public void m9189p(boolean z) {
            this.f6808h = z;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$f */
    public class ViewOnClickListenerC1705f implements View.OnClickListener {

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$f$a */
        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ bzv f6810a;

            public a(bzv bzvVar) {
                this.f6810a = bzvVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f6810a.m104682u();
            }
        }

        public ViewOnClickListenerC1705f() {
        }

        /* JADX INFO: renamed from: a */
        public bzv mo9153a() {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                bzv bzvVarM104655m = bzv.m104655m();
                bzvVarM104655m.m104660C(LoginButton.this.getDefaultAudience());
                bzvVarM104655m.m104663F(LoginButton.this.getLoginBehavior());
                bzvVarM104655m.m104664G(m9190b());
                bzvVarM104655m.m104659B(LoginButton.this.getAuthType());
                bzvVarM104655m.m104662E(m9191c());
                bzvVarM104655m.m104667J(LoginButton.this.getShouldSkipAccountDeduplication());
                bzvVarM104655m.m104665H(LoginButton.this.getMessengerPageId());
                bzvVarM104655m.m104666I(LoginButton.this.getResetMessengerState());
                return bzvVarM104655m;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public LoginTargetApp m9190b() {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m9191c() {
            lsb.m151554d(this);
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m9192d() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                bzv bzvVarMo9153a = mo9153a();
                g60 g60Var = LoginButton.this.f6793z;
                LoginButton loginButton = LoginButton.this;
                if (g60Var != null) {
                    ((bzv.C16027c) LoginButton.this.f6793z.mo215a()).m104694f(loginButton.f6792y != null ? LoginButton.this.f6792y : new CallbackManagerImpl());
                    LoginButton.this.f6793z.m124547b(LoginButton.this.f6780m.f6802b);
                    return;
                }
                Fragment fragment = loginButton.getFragment();
                LoginButton loginButton2 = LoginButton.this;
                if (fragment != null) {
                    bzvVarMo9153a.m104679r(loginButton2.getFragment(), LoginButton.this.f6780m.f6802b, LoginButton.this.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = loginButton2.getNativeFragment();
                LoginButton loginButton3 = LoginButton.this;
                if (nativeFragment != null) {
                    bzvVarMo9153a.m104678q(loginButton3.getNativeFragment(), LoginButton.this.f6780m.f6802b, LoginButton.this.getLoggerID());
                } else {
                    bzvVarMo9153a.m104676o(loginButton3.getActivity(), LoginButton.this.f6780m.f6802b, LoginButton.this.getLoggerID());
                }
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m9193e(Context context) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                bzv bzvVarMo9153a = mo9153a();
                if (!LoginButton.this.f6777j) {
                    bzvVarMo9153a.m104682u();
                    return;
                }
                String string = LoginButton.this.getResources().getString(R$string.f6758d);
                String string2 = LoginButton.this.getResources().getString(R$string.f6755a);
                Profile profileM7614b = Profile.m7614b();
                String string3 = (profileM7614b == null || profileM7614b.getName() == null) ? LoginButton.this.getResources().getString(R$string.f6761g) : String.format(LoginButton.this.getResources().getString(R$string.f6760f), profileM7614b.getName());
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string3).setCancelable(true).setPositiveButton(string, new a(bzvVarMo9153a)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                LoginButton.this.m7482b(view);
                AccessToken accessTokenM7408d = AccessToken.m7408d();
                if (AccessToken.m7409p()) {
                    m9193e(LoginButton.this.getContext());
                } else {
                    m9192d();
                }
                C1554f c1554f = new C1554f(LoginButton.this.getContext());
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", accessTokenM7408d != null ? 0 : 1);
                bundle.putInt("access_token_expired", AccessToken.m7409p() ? 1 : 0);
                c1554f.m7777g(LoginButton.this.f6781n, bundle);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
        this.f6780m = new C1704e();
        this.f6781n = "fb_login_view_usage";
        this.f6783p = ToolTipPopup.Style.BLUE;
        this.f6785r = 6000L;
        this.f6790w = 255;
        this.f6791x = UUID.randomUUID().toString();
        this.f6792y = null;
        this.f6793z = null;
    }

    /* JADX INFO: renamed from: A */
    public void m9162A() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(nu0.m161424b(getContext(), r3c0.f157520a), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: B */
    public void m9163B() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (this.f6789v == null) {
                return;
            }
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                StateListDrawable stateListDrawable = (StateListDrawable) background;
                for (int i = 0; i < stateListDrawable.getStateCount(); i++) {
                    GradientDrawable gradientDrawable = (GradientDrawable) stateListDrawable.getStateDrawable(i);
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(this.f6789v.floatValue());
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(this.f6789v.floatValue());
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9164C() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.m7409p()) {
                String string = this.f6779l;
                if (string == null) {
                    string = resources.getString(R$string.f6759e);
                }
                setText(string);
                return;
            }
            String str = this.f6778k;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && m9171y(string2) > width) {
                string2 = resources.getString(R$string.f6756b);
            }
            setText(string2);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9165D() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.f6790w);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9166E(C1656d c1656d) {
        if (lsb.m151554d(this) || c1656d == null) {
            return;
        }
        try {
            if (c1656d.getNuxEnabled() && getVisibility() == 0) {
                m9169w(c1656d.getNuxContent());
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase
    /* JADX INFO: renamed from: c */
    public void mo7483c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.mo7483c(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            m9172z(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(n1c0.f136622a));
                this.f6778k = "Continue with Facebook";
            } else {
                this.f6787t = new C1702c();
            }
            m9164C();
            m9163B();
            m9165D();
            m9162A();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public String getAuthType() {
        return this.f6780m.m9175b();
    }

    @Nullable
    public c84 getCallbackManager() {
        return this.f6792y;
    }

    public DefaultAudience getDefaultAudience() {
        return this.f6780m.m9176c();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return k8c0.f121799a;
    }

    public String getLoggerID() {
        return this.f6791x;
    }

    public LoginBehavior getLoginBehavior() {
        return this.f6780m.m9177d();
    }

    @StringRes
    public int getLoginButtonContinueLabel() {
        return R$string.f6757c;
    }

    public bzv getLoginManager() {
        if (this.f6788u == null) {
            this.f6788u = bzv.m104655m();
        }
        return this.f6788u;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.f6780m.m9178e();
    }

    @Nullable
    public String getMessengerPageId() {
        return this.f6780m.m9179f();
    }

    public ViewOnClickListenerC1705f getNewLoginClickListener() {
        return new ViewOnClickListenerC1705f();
    }

    public List<String> getPermissions() {
        return this.f6780m.m9180g();
    }

    public boolean getResetMessengerState() {
        return this.f6780m.m9181h();
    }

    public boolean getShouldSkipAccountDeduplication() {
        return this.f6780m.m9182i();
    }

    public long getToolTipDisplayTime() {
        return this.f6785r;
    }

    public ToolTipMode getToolTipMode() {
        return this.f6784q;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof h60) {
                this.f6793z = ((h60) getContext()).getActivityResultRegistry().m211i("facebook-login", getLoginManager().m104671i(this.f6792y, this.f6791x), new C1700a());
            }
            AccessTokenTracker accessTokenTracker = this.f6787t;
            if (accessTokenTracker == null || accessTokenTracker.getIsTracking()) {
                return;
            }
            this.f6787t.m7445e();
            m9164C();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            g60<Collection<? extends String>> g60Var = this.f6793z;
            if (g60Var != null) {
                g60Var.mo217d();
            }
            AccessTokenTracker accessTokenTracker = this.f6787t;
            if (accessTokenTracker != null) {
                accessTokenTracker.m7446f();
            }
            m9168v();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.f6782o || isInEditMode()) {
                return;
            }
            this.f6782o = true;
            m9167u();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            m9164C();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iM9170x = m9170x(i);
            String string = this.f6779l;
            if (string == null) {
                string = resources.getString(R$string.f6759e);
            }
            setMeasuredDimension(View.resolveSize(Math.max(iM9170x, m9171y(string)), i), compoundPaddingTop);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                m9168v();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public void setAuthType(String str) {
        this.f6780m.m9183j(str);
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.f6780m.m9184k(defaultAudience);
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.f6780m.m9185l(loginBehavior);
    }

    public void setLoginManager(bzv bzvVar) {
        this.f6788u = bzvVar;
    }

    public void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.f6780m.m9186m(loginTargetApp);
    }

    public void setLoginText(String str) {
        this.f6778k = str;
        m9164C();
    }

    public void setLogoutText(String str) {
        this.f6779l = str;
        m9164C();
    }

    public void setMessengerPageId(String str) {
        this.f6780m.m9187n(str);
    }

    public void setPermissions(String... strArr) {
        this.f6780m.m9188o(Arrays.asList(strArr));
    }

    public void setProperties(C1704e c1704e) {
        this.f6780m = c1704e;
    }

    public void setPublishPermissions(String... strArr) {
        this.f6780m.m9188o(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.f6780m.m9188o(Arrays.asList(strArr));
    }

    public void setResetMessengerState(boolean z) {
        this.f6780m.m9189p(z);
    }

    public void setToolTipDisplayTime(long j) {
        this.f6785r = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.f6784q = toolTipMode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.f6783p = style;
    }

    /* JADX INFO: renamed from: u */
    public final void m9167u() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            int i = C1703d.f6800a[this.f6784q.ordinal()];
            if (i == 1) {
                C1577c.m8056u().execute(new RunnableC1701b(C1657e.m8817J(getContext())));
            } else {
                if (i != 2) {
                    return;
                }
                m9169w(getResources().getString(R$string.f6762h));
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9168v() {
        ToolTipPopup toolTipPopup = this.f6786s;
        if (toolTipPopup != null) {
            toolTipPopup.m9209d();
            this.f6786s = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9169w(String str) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            this.f6786s = toolTipPopup;
            toolTipPopup.m9212g(this.f6783p);
            this.f6786s.m9211f(this.f6785r);
            this.f6786s.m9213h();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: x */
    public int m9170x(int i) {
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.f6778k;
            if (string == null) {
                string = resources.getString(R$string.f6757c);
                int iM9171y = m9171y(string);
                if (View.resolveSize(iM9171y, i) < iM9171y) {
                    string = resources.getString(R$string.f6756b);
                }
            }
            return m9171y(string);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m9171y(String str) {
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + m7486f(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9172z(Context context, AttributeSet attributeSet, int i, int i2) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            this.f6784q = ToolTipMode.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s8c0.f163029a, i, i2);
            try {
                this.f6777j = typedArrayObtainStyledAttributes.getBoolean(s8c0.f163030b, true);
                this.f6778k = typedArrayObtainStyledAttributes.getString(s8c0.f163033e);
                this.f6779l = typedArrayObtainStyledAttributes.getString(s8c0.f163034f);
                this.f6784q = ToolTipMode.fromInt(typedArrayObtainStyledAttributes.getInt(s8c0.f163035g, ToolTipMode.DEFAULT.getValue()));
                if (typedArrayObtainStyledAttributes.hasValue(s8c0.f163031c)) {
                    this.f6789v = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(s8c0.f163031c, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(s8c0.f163032d, 255);
                this.f6790w = integer;
                if (integer < 0) {
                    this.f6790w = 0;
                }
                if (this.f6790w > 255) {
                    this.f6790w = 255;
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public void setPermissions(List<String> list) {
        this.f6780m.m9188o(list);
    }

    public void setPublishPermissions(List<String> list) {
        this.f6780m.m9188o(list);
    }

    public void setReadPermissions(List<String> list) {
        this.f6780m.m9188o(list);
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$a */
    public class C1700a implements a60<c84.C16093a> {
        public C1700a() {
        }

        @Override // p149l.a60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2610a(c84.C16093a c16093a) {
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context) {
        this(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }
}
