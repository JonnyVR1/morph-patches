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
import com.facebook.C1600c;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.appevents.C1577f;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
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
import p153l.b94;
import p153l.c60;
import p153l.d60;
import p153l.pgc0;
import p153l.t9c0;
import p153l.tu0;
import p153l.w50;
import p153l.xbc0;
import p153l.xgc0;
import p153l.z0w;
import p153l.ztb;

/* JADX INFO: loaded from: classes6.dex */
public class LoginButton extends FacebookButtonBase {

    /* JADX INFO: renamed from: j */
    public boolean f6814j;

    /* JADX INFO: renamed from: k */
    public String f6815k;

    /* JADX INFO: renamed from: l */
    public String f6816l;

    /* JADX INFO: renamed from: m */
    public C1727e f6817m;

    /* JADX INFO: renamed from: n */
    public String f6818n;

    /* JADX INFO: renamed from: o */
    public boolean f6819o;

    /* JADX INFO: renamed from: p */
    public ToolTipPopup.Style f6820p;

    /* JADX INFO: renamed from: q */
    public ToolTipMode f6821q;

    /* JADX INFO: renamed from: r */
    public long f6822r;

    /* JADX INFO: renamed from: s */
    public ToolTipPopup f6823s;

    /* JADX INFO: renamed from: t */
    public AccessTokenTracker f6824t;

    /* JADX INFO: renamed from: u */
    public z0w f6825u;

    /* JADX INFO: renamed from: v */
    public Float f6826v;

    /* JADX INFO: renamed from: w */
    public int f6827w;

    /* JADX INFO: renamed from: x */
    public final String f6828x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public b94 f6829y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public c60<Collection<? extends String>> f6830z;

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
    public class RunnableC1724b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f6832a;

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1679d f6834a;

            public a(C1679d c1679d) {
                this.f6834a = c1679d;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ztb.m221490d(this)) {
                    return;
                }
                try {
                    LoginButton.this.m9220E(this.f6834a);
                } catch (Throwable th) {
                    ztb.m221488b(th, this);
                }
            }
        }

        public RunnableC1724b(String str) {
            this.f6832a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                LoginButton.this.getActivity().runOnUiThread(new a(FetchedAppSettingsManager.m8747r(this.f6832a, false)));
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$c */
    public class C1725c extends AccessTokenTracker {
        public C1725c() {
        }

        @Override // com.facebook.AccessTokenTracker
        /* JADX INFO: renamed from: d */
        public void mo7498d(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.m9218C();
            LoginButton.this.m9216A();
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$d */
    public static /* synthetic */ class C1726d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6837a;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            f6837a = iArr;
            try {
                iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6837a[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6837a[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$e */
    public static class C1727e {

        /* JADX INFO: renamed from: a */
        public DefaultAudience f6838a = DefaultAudience.FRIENDS;

        /* JADX INFO: renamed from: b */
        public List<String> f6839b = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: c */
        public LoginBehavior f6840c = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* JADX INFO: renamed from: d */
        public String f6841d = "rerequest";

        /* JADX INFO: renamed from: e */
        public LoginTargetApp f6842e = LoginTargetApp.FACEBOOK;

        /* JADX INFO: renamed from: f */
        public boolean f6843f = false;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f6844g;

        /* JADX INFO: renamed from: h */
        public boolean f6845h;

        /* JADX INFO: renamed from: b */
        public String m9229b() {
            return this.f6841d;
        }

        /* JADX INFO: renamed from: c */
        public DefaultAudience m9230c() {
            return this.f6838a;
        }

        /* JADX INFO: renamed from: d */
        public LoginBehavior m9231d() {
            return this.f6840c;
        }

        /* JADX INFO: renamed from: e */
        public LoginTargetApp m9232e() {
            return this.f6842e;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public String m9233f() {
            return this.f6844g;
        }

        /* JADX INFO: renamed from: g */
        public List<String> m9234g() {
            return this.f6839b;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9235h() {
            return this.f6845h;
        }

        /* JADX INFO: renamed from: i */
        public boolean m9236i() {
            return this.f6843f;
        }

        /* JADX INFO: renamed from: j */
        public void m9237j(String str) {
            this.f6841d = str;
        }

        /* JADX INFO: renamed from: k */
        public void m9238k(DefaultAudience defaultAudience) {
            this.f6838a = defaultAudience;
        }

        /* JADX INFO: renamed from: l */
        public void m9239l(LoginBehavior loginBehavior) {
            this.f6840c = loginBehavior;
        }

        /* JADX INFO: renamed from: m */
        public void m9240m(LoginTargetApp loginTargetApp) {
            this.f6842e = loginTargetApp;
        }

        /* JADX INFO: renamed from: n */
        public void m9241n(@Nullable String str) {
            this.f6844g = str;
        }

        /* JADX INFO: renamed from: o */
        public void m9242o(List<String> list) {
            this.f6839b = list;
        }

        /* JADX INFO: renamed from: p */
        public void m9243p(boolean z) {
            this.f6845h = z;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$f */
    public class ViewOnClickListenerC1728f implements View.OnClickListener {

        /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$f$a */
        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z0w f6847a;

            public a(z0w z0wVar) {
                this.f6847a = z0wVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f6847a.m218213u();
            }
        }

        public ViewOnClickListenerC1728f() {
        }

        /* JADX INFO: renamed from: a */
        public z0w mo9207a() {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                z0w z0wVarM218186m = z0w.m218186m();
                z0wVarM218186m.m218191C(LoginButton.this.getDefaultAudience());
                z0wVarM218186m.m218194F(LoginButton.this.getLoginBehavior());
                z0wVarM218186m.m218195G(m9244b());
                z0wVarM218186m.m218190B(LoginButton.this.getAuthType());
                z0wVarM218186m.m218193E(m9245c());
                z0wVarM218186m.m218198J(LoginButton.this.getShouldSkipAccountDeduplication());
                z0wVarM218186m.m218196H(LoginButton.this.getMessengerPageId());
                z0wVarM218186m.m218197I(LoginButton.this.getResetMessengerState());
                return z0wVarM218186m;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public LoginTargetApp m9244b() {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m9245c() {
            ztb.m221490d(this);
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m9246d() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                z0w z0wVarMo9207a = mo9207a();
                c60 c60Var = LoginButton.this.f6830z;
                LoginButton loginButton = LoginButton.this;
                if (c60Var != null) {
                    ((z0w.C21734c) LoginButton.this.f6830z.mo216a()).m218224f(loginButton.f6829y != null ? LoginButton.this.f6829y : new CallbackManagerImpl());
                    LoginButton.this.f6830z.m108087b(LoginButton.this.f6817m.f6839b);
                    return;
                }
                Fragment fragment = loginButton.getFragment();
                LoginButton loginButton2 = LoginButton.this;
                if (fragment != null) {
                    z0wVarMo9207a.m218210r(loginButton2.getFragment(), LoginButton.this.f6817m.f6839b, LoginButton.this.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = loginButton2.getNativeFragment();
                LoginButton loginButton3 = LoginButton.this;
                if (nativeFragment != null) {
                    z0wVarMo9207a.m218209q(loginButton3.getNativeFragment(), LoginButton.this.f6817m.f6839b, LoginButton.this.getLoggerID());
                } else {
                    z0wVarMo9207a.m218207o(loginButton3.getActivity(), LoginButton.this.f6817m.f6839b, LoginButton.this.getLoggerID());
                }
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m9247e(Context context) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                z0w z0wVarMo9207a = mo9207a();
                if (!LoginButton.this.f6814j) {
                    z0wVarMo9207a.m218213u();
                    return;
                }
                String string = LoginButton.this.getResources().getString(R$string.f6795d);
                String string2 = LoginButton.this.getResources().getString(R$string.f6792a);
                Profile profileM7668b = Profile.m7668b();
                String string3 = (profileM7668b == null || profileM7668b.getName() == null) ? LoginButton.this.getResources().getString(R$string.f6798g) : String.format(LoginButton.this.getResources().getString(R$string.f6797f), profileM7668b.getName());
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string3).setCancelable(true).setPositiveButton(string, new a(z0wVarMo9207a)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                LoginButton.this.m7536b(view);
                AccessToken accessTokenM7462d = AccessToken.m7462d();
                if (AccessToken.m7463p()) {
                    m9247e(LoginButton.this.getContext());
                } else {
                    m9246d();
                }
                C1577f c1577f = new C1577f(LoginButton.this.getContext());
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", accessTokenM7462d != null ? 0 : 1);
                bundle.putInt("access_token_expired", AccessToken.m7463p() ? 1 : 0);
                c1577f.m7831g(LoginButton.this.f6818n, bundle);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
        this.f6817m = new C1727e();
        this.f6818n = "fb_login_view_usage";
        this.f6820p = ToolTipPopup.Style.BLUE;
        this.f6822r = 6000L;
        this.f6827w = 255;
        this.f6828x = UUID.randomUUID().toString();
        this.f6829y = null;
        this.f6830z = null;
    }

    /* JADX INFO: renamed from: A */
    public void m9216A() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(tu0.m192702b(getContext(), xbc0.f193150a), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: B */
    public void m9217B() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (this.f6826v == null) {
                return;
            }
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                StateListDrawable stateListDrawable = (StateListDrawable) background;
                for (int i = 0; i < stateListDrawable.getStateCount(); i++) {
                    GradientDrawable gradientDrawable = (GradientDrawable) stateListDrawable.getStateDrawable(i);
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(this.f6826v.floatValue());
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(this.f6826v.floatValue());
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9218C() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.m7463p()) {
                String string = this.f6816l;
                if (string == null) {
                    string = resources.getString(R$string.f6796e);
                }
                setText(string);
                return;
            }
            String str = this.f6815k;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && m9225y(string2) > width) {
                string2 = resources.getString(R$string.f6793b);
            }
            setText(string2);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9219D() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.f6827w);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9220E(C1679d c1679d) {
        if (ztb.m221490d(this) || c1679d == null) {
            return;
        }
        try {
            if (c1679d.getNuxEnabled() && getVisibility() == 0) {
                m9223w(c1679d.getNuxContent());
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase
    /* JADX INFO: renamed from: c */
    public void mo7537c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.mo7537c(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            m9226z(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(t9c0.f172630a));
                this.f6815k = "Continue with Facebook";
            } else {
                this.f6824t = new C1725c();
            }
            m9218C();
            m9217B();
            m9219D();
            m9216A();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public String getAuthType() {
        return this.f6817m.m9229b();
    }

    @Nullable
    public b94 getCallbackManager() {
        return this.f6829y;
    }

    public DefaultAudience getDefaultAudience() {
        return this.f6817m.m9230c();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return pgc0.f152254a;
    }

    public String getLoggerID() {
        return this.f6828x;
    }

    public LoginBehavior getLoginBehavior() {
        return this.f6817m.m9231d();
    }

    @StringRes
    public int getLoginButtonContinueLabel() {
        return R$string.f6794c;
    }

    public z0w getLoginManager() {
        if (this.f6825u == null) {
            this.f6825u = z0w.m218186m();
        }
        return this.f6825u;
    }

    public LoginTargetApp getLoginTargetApp() {
        return this.f6817m.m9232e();
    }

    @Nullable
    public String getMessengerPageId() {
        return this.f6817m.m9233f();
    }

    public ViewOnClickListenerC1728f getNewLoginClickListener() {
        return new ViewOnClickListenerC1728f();
    }

    public List<String> getPermissions() {
        return this.f6817m.m9234g();
    }

    public boolean getResetMessengerState() {
        return this.f6817m.m9235h();
    }

    public boolean getShouldSkipAccountDeduplication() {
        return this.f6817m.m9236i();
    }

    public long getToolTipDisplayTime() {
        return this.f6822r;
    }

    public ToolTipMode getToolTipMode() {
        return this.f6821q;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof d60) {
                this.f6830z = ((d60) getContext()).getActivityResultRegistry().m212i("facebook-login", getLoginManager().m218202i(this.f6829y, this.f6828x), new C1723a());
            }
            AccessTokenTracker accessTokenTracker = this.f6824t;
            if (accessTokenTracker == null || accessTokenTracker.getIsTracking()) {
                return;
            }
            this.f6824t.m7499e();
            m9218C();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            c60<Collection<? extends String>> c60Var = this.f6830z;
            if (c60Var != null) {
                c60Var.mo218d();
            }
            AccessTokenTracker accessTokenTracker = this.f6824t;
            if (accessTokenTracker != null) {
                accessTokenTracker.m7500f();
            }
            m9222v();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.f6819o || isInEditMode()) {
                return;
            }
            this.f6819o = true;
            m9221u();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            m9218C();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iM9224x = m9224x(i);
            String string = this.f6816l;
            if (string == null) {
                string = resources.getString(R$string.f6796e);
            }
            setMeasuredDimension(View.resolveSize(Math.max(iM9224x, m9225y(string)), i), compoundPaddingTop);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                m9222v();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public void setAuthType(String str) {
        this.f6817m.m9237j(str);
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.f6817m.m9238k(defaultAudience);
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.f6817m.m9239l(loginBehavior);
    }

    public void setLoginManager(z0w z0wVar) {
        this.f6825u = z0wVar;
    }

    public void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        this.f6817m.m9240m(loginTargetApp);
    }

    public void setLoginText(String str) {
        this.f6815k = str;
        m9218C();
    }

    public void setLogoutText(String str) {
        this.f6816l = str;
        m9218C();
    }

    public void setMessengerPageId(String str) {
        this.f6817m.m9241n(str);
    }

    public void setPermissions(String... strArr) {
        this.f6817m.m9242o(Arrays.asList(strArr));
    }

    public void setProperties(C1727e c1727e) {
        this.f6817m = c1727e;
    }

    public void setPublishPermissions(String... strArr) {
        this.f6817m.m9242o(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.f6817m.m9242o(Arrays.asList(strArr));
    }

    public void setResetMessengerState(boolean z) {
        this.f6817m.m9243p(z);
    }

    public void setToolTipDisplayTime(long j) {
        this.f6822r = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.f6821q = toolTipMode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style) {
        this.f6820p = style;
    }

    /* JADX INFO: renamed from: u */
    public final void m9221u() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            int i = C1726d.f6837a[this.f6821q.ordinal()];
            if (i == 1) {
                C1600c.m8110u().execute(new RunnableC1724b(C1680e.m8871J(getContext())));
            } else {
                if (i != 2) {
                    return;
                }
                m9223w(getResources().getString(R$string.f6799h));
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9222v() {
        ToolTipPopup toolTipPopup = this.f6823s;
        if (toolTipPopup != null) {
            toolTipPopup.m9263d();
            this.f6823s = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9223w(String str) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            this.f6823s = toolTipPopup;
            toolTipPopup.m9266g(this.f6820p);
            this.f6823s.m9265f(this.f6822r);
            this.f6823s.m9267h();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: x */
    public int m9224x(int i) {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.f6815k;
            if (string == null) {
                string = resources.getString(R$string.f6794c);
                int iM9225y = m9225y(string);
                if (View.resolveSize(iM9225y, i) < iM9225y) {
                    string = resources.getString(R$string.f6793b);
                }
            }
            return m9225y(string);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m9225y(String str) {
        if (ztb.m221490d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + m7540f(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return 0;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9226z(Context context, AttributeSet attributeSet, int i, int i2) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.f6821q = ToolTipMode.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, xgc0.f194170a, i, i2);
            try {
                this.f6814j = typedArrayObtainStyledAttributes.getBoolean(xgc0.f194171b, true);
                this.f6815k = typedArrayObtainStyledAttributes.getString(xgc0.f194174e);
                this.f6816l = typedArrayObtainStyledAttributes.getString(xgc0.f194175f);
                this.f6821q = ToolTipMode.fromInt(typedArrayObtainStyledAttributes.getInt(xgc0.f194176g, ToolTipMode.DEFAULT.getValue()));
                if (typedArrayObtainStyledAttributes.hasValue(xgc0.f194172c)) {
                    this.f6826v = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(xgc0.f194172c, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(xgc0.f194173d, 255);
                this.f6827w = integer;
                if (integer < 0) {
                    this.f6827w = 0;
                }
                if (this.f6827w > 255) {
                    this.f6827w = 255;
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public void setPermissions(List<String> list) {
        this.f6817m.m9242o(list);
    }

    public void setPublishPermissions(List<String> list) {
        this.f6817m.m9242o(list);
    }

    public void setReadPermissions(List<String> list) {
        this.f6817m.m9242o(list);
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.LoginButton$a */
    public class C1723a implements w50<b94.C15948a> {
        public C1723a() {
        }

        @Override // p153l.w50
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2611a(b94.C15948a c15948a) {
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
