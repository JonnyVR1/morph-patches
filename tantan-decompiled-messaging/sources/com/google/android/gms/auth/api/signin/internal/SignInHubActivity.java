package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.AbstractC0494a;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p149l.mpv0;
import p149l.trv;
import p149l.uby0;
import p149l.yir0;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* JADX INFO: renamed from: h */
    public static boolean f9779h = false;

    /* JADX INFO: renamed from: c */
    public boolean f9780c = false;

    /* JADX INFO: renamed from: d */
    public SignInConfiguration f9781d;

    /* JADX INFO: renamed from: e */
    public boolean f9782e;

    /* JADX INFO: renamed from: f */
    public int f9783f;

    /* JADX INFO: renamed from: g */
    public Intent f9784g;

    /* JADX INFO: renamed from: H0 */
    public final void m12446H0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9779h = false;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m12447J0() {
        getSupportLoaderManager().mo3086c(0, null, new C2082a());
        f9779h = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.f9780c) {
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
                uby0.m192973c(this).m192976b(this.f9781d.m12443F(), (GoogleSignInAccount) yir0.m215020a(googleSignInAccount));
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f9782e = true;
                this.f9783f = i2;
                this.f9784g = intent;
                m12447J0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m12446H0(intExtra);
                return;
            }
        }
        m12446H0(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) yir0.m215020a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m12446H0(12500);
            return;
        }
        if (!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) yir0.m215020a(intent.getBundleExtra(Constants.KEY_CONFIG))).getParcelable(Constants.KEY_CONFIG);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f9781d = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f9782e = z;
            if (z) {
                this.f9783f = bundle.getInt("signInResultCode");
                this.f9784g = (Intent) yir0.m215020a((Intent) bundle.getParcelable("signInResultData"));
                m12447J0();
                return;
            }
            return;
        }
        if (f9779h) {
            setResult(0);
            m12446H0(12502);
            return;
        }
        f9779h = true;
        Intent intent2 = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        } else {
            intent2.setPackage(getPackageName());
        }
        intent2.putExtra(Constants.KEY_CONFIG, this.f9781d);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f9780c = true;
            m12446H0(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9782e);
        if (this.f9782e) {
            bundle.putInt("signInResultCode", this.f9783f);
            bundle.putParcelable("signInResultData", this.f9784g);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    public class C2082a implements AbstractC0494a.a<Void> {
        public C2082a() {
        }

        @Override // androidx.loader.app.AbstractC0494a.a
        /* JADX INFO: renamed from: a */
        public final trv<Void> mo3108a(int i, Bundle bundle) {
            return new mpv0(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }

        @Override // androidx.loader.app.AbstractC0494a.a
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo3109b(trv<Void> trvVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f9783f, SignInHubActivity.this.f9784g);
            SignInHubActivity.this.finish();
        }

        @Override // androidx.loader.app.AbstractC0494a.a
        /* JADX INFO: renamed from: c */
        public final void mo3110c(trv<Void> trvVar) {
        }
    }
}
