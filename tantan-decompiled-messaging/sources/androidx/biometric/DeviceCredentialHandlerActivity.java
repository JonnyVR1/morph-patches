package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import p149l.e8c0;
import p149l.g6c0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DeviceCredentialHandlerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    public boolean f869c;

    /* JADX INFO: renamed from: G0 */
    public void m732G0(int i) {
        C0182a c0182aM785f = C0182a.m785f();
        if (c0182aM785f == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i == -1) {
            c0182aM785f.m797n(1);
            c0182aM785f.m796m(false);
            c0182aM785f.m799p();
        } else {
            c0182aM785f.m797n(2);
            c0182aM785f.m796m(false);
            c0182aM785f.m799p();
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        m732G0(i2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        C0182a c0182aM784e = C0182a.m784e();
        if (c0182aM784e.m787b() != 0) {
            setTheme(c0182aM784e.m787b());
            getTheme().applyStyle(e8c0.f89816a, true);
        }
        super.onCreate(bundle);
        boolean z = bundle != null && bundle.getBoolean("did_change_configuration", false);
        this.f869c = z;
        if (z) {
            this.f869c = false;
        } else {
            c0182aM784e.m800q();
        }
        setTitle((CharSequence) null);
        setContentView(g6c0.f101243a);
        if (c0182aM784e.m789d() != null && c0182aM784e.m786a() != null) {
            new BiometricPrompt(this, c0182aM784e.m789d(), c0182aM784e.m786a()).m717s(new BiometricPrompt.C0175e(getIntent().getBundleExtra("prompt_info_bundle")));
        } else {
            Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C0182a c0182aM785f = C0182a.m785f();
        if (!isChangingConfigurations() || c0182aM785f == null) {
            return;
        }
        c0182aM785f.m790g();
        this.f869c = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.f869c);
    }
}
