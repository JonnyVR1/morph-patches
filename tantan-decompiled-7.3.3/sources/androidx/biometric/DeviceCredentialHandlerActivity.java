package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import p153l.igc0;
import p153l.lec0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DeviceCredentialHandlerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    public boolean f869c;

    /* JADX INFO: renamed from: H0 */
    public void m733H0(int i) {
        C0183a c0183aM786f = C0183a.m786f();
        if (c0183aM786f == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i == -1) {
            c0183aM786f.m798n(1);
            c0183aM786f.m797m(false);
            c0183aM786f.m800p();
        } else {
            c0183aM786f.m798n(2);
            c0183aM786f.m797m(false);
            c0183aM786f.m800p();
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        m733H0(i2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        C0183a c0183aM785e = C0183a.m785e();
        if (c0183aM785e.m788b() != 0) {
            setTheme(c0183aM785e.m788b());
            getTheme().applyStyle(igc0.f114775a, true);
        }
        super.onCreate(bundle);
        boolean z = bundle != null && bundle.getBoolean("did_change_configuration", false);
        this.f869c = z;
        if (z) {
            this.f869c = false;
        } else {
            c0183aM785e.m801q();
        }
        setTitle((CharSequence) null);
        setContentView(lec0.f131726a);
        if (c0183aM785e.m790d() != null && c0183aM785e.m787a() != null) {
            new BiometricPrompt(this, c0183aM785e.m790d(), c0183aM785e.m787a()).m718s(new BiometricPrompt.C0176e(getIntent().getBundleExtra("prompt_info_bundle")));
        } else {
            Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C0183a c0183aM786f = C0183a.m786f();
        if (!isChangingConfigurations() || c0183aM786f == null) {
            return;
        }
        c0183aM786f.m791g();
        this.f869c = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.f869c);
    }
}
