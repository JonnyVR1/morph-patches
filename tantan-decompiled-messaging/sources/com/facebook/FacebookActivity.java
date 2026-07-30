package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.internal.C1657e;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b7c0;
import p149l.d4c0;
import p149l.l0f;
import p149l.lsb;
import p149l.p620;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\b\u0016\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003R(\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\""}, m87232d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/Fragment;", "H0", "()Landroidx/fragment/app/Fragment;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", RequestParameters.PREFIX, "Ljava/io/FileDescriptor;", IjkMediaPlayer.OnNativeInvokeListener.ARG_FD, "Ljava/io/PrintWriter;", "writer", "", "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "I0", "<set-?>", "c", "Landroidx/fragment/app/Fragment;", "G0", "currentFragment", "Companion", "a", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public class FacebookActivity extends FragmentActivity {

    /* JADX INFO: renamed from: d */
    public static final String f5887d = FacebookActivity.class.getName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Fragment currentFragment;

    @Nullable
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public Fragment m7478H0() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("SingleFragment");
        if (fragmentM2557i0 != null) {
            return fragmentM2557i0;
        }
        if (Intrinsics.m87488d("FacebookDialogFragment", intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, "SingleFragment");
            return facebookDialogFragment;
        }
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setRetainInstance(true);
        supportFragmentManager.m2567m().m2804c(d4c0.f84293c, loginFragment, "SingleFragment").mo2707i();
        return loginFragment;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m7479I0() {
        Intent intent = getIntent();
        p620 p620Var = p620.INSTANCE;
        intent.getClass();
        FacebookException facebookExceptionM167590r = p620.m167590r(p620.m167593v(intent));
        Intent intent2 = getIntent();
        intent2.getClass();
        setResult(0, p620.m167586m(intent2, null, facebookExceptionM167590r));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(@NotNull String prefix, @Nullable FileDescriptor fd, @NotNull PrintWriter writer, @Nullable String[] args) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            prefix.getClass();
            writer.getClass();
            l0f.INSTANCE.m148038a();
            if (Intrinsics.m87488d(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fd, writer, args);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (!C1577c.m8027F()) {
            C1657e c1657e = C1657e.INSTANCE;
            C1657e.m8844j0(f5887d, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            C1577c.m8032L(applicationContext);
        }
        setContentView(b7c0.f73957a);
        if (Intrinsics.m87488d("PassThrough", intent.getAction())) {
            m7479I0();
        } else {
            this.currentFragment = m7478H0();
        }
    }
}
