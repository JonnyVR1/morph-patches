package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.AbstractC0495a;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p153l.aly0;
import p153l.esr0;
import p153l.syv0;
import p153l.utv;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* JADX INFO: renamed from: h */
    public static boolean f9816h = false;

    /* JADX INFO: renamed from: c */
    public boolean f9817c = false;

    /* JADX INFO: renamed from: d */
    public SignInConfiguration f9818d;

    /* JADX INFO: renamed from: e */
    public boolean f9819e;

    /* JADX INFO: renamed from: f */
    public int f9820f;

    /* JADX INFO: renamed from: g */
    public Intent f9821g;

    /* JADX INFO: renamed from: I0 */
    public final void m12500I0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9816h = false;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m12501K0() {
        getSupportLoaderManager().mo3087c(0, null, new C2105a());
        f9816h = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.f9817c) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                aly0.m98768c(this).m98771b(this.f9818d.m12497F(), (GoogleSignInAccount) esr0.m122390a(googleSignInAccount));
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f9819e = true;
                this.f9820f = i2;
                this.f9821g = intent;
                m12501K0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m12500I0(intExtra);
                return;
            }
        }
        m12500I0(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) esr0.m122390a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m12500I0(12500);
            return;
        }
        if (!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) esr0.m122390a(intent.getBundleExtra(Constants.KEY_CONFIG))).getParcelable(Constants.KEY_CONFIG);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f9818d = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f9819e = z;
            if (z) {
                this.f9820f = bundle.getInt("signInResultCode");
                this.f9821g = (Intent) esr0.m122390a((Intent) bundle.getParcelable("signInResultData"));
                m12501K0();
                return;
            }
            return;
        }
        if (f9816h) {
            setResult(0);
            m12500I0(12502);
            return;
        }
        f9816h = true;
        Intent intent2 = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        } else {
            intent2.setPackage(getPackageName());
        }
        intent2.putExtra(Constants.KEY_CONFIG, this.f9818d);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f9817c = true;
            m12500I0(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9819e);
        if (this.f9819e) {
            bundle.putInt("signInResultCode", this.f9820f);
            bundle.putParcelable("signInResultData", this.f9821g);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    public class C2105a implements AbstractC0495a.a<Void> {
        public C2105a() {
        }

        @Override // androidx.loader.app.AbstractC0495a.a
        /* JADX INFO: renamed from: a */
        public final utv<Void> mo3109a(int i, Bundle bundle) {
            return new syv0(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }

        @Override // androidx.loader.app.AbstractC0495a.a
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo3110b(utv<Void> utvVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f9820f, SignInHubActivity.this.f9821g);
            SignInHubActivity.this.finish();
        }

        @Override // androidx.loader.app.AbstractC0495a.a
        /* JADX INFO: renamed from: c */
        public final void mo3111c(utv<Void> utvVar) {
        }
    }
}
