package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class v2j<E> extends t2j {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Activity f179553a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Context f179554b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Handler f179555c;

    /* JADX INFO: renamed from: d */
    public final int f179556d;

    /* JADX INFO: renamed from: e */
    public final FragmentManager f179557e;

    public v2j(@Nullable Activity activity, @NonNull Context context, @NonNull Handler handler, int i) {
        this.f179557e = new w2j();
        this.f179553a = activity;
        this.f179554b = (Context) tf80.m188659f(context, "context == null");
        this.f179555c = (Handler) tf80.m188659f(handler, "handler == null");
        this.f179556d = i;
    }

    @Override // p149l.t2j
    @Nullable
    /* JADX INFO: renamed from: c */
    public View mo2458c(int i) {
        return null;
    }

    @Override // p149l.t2j
    /* JADX INFO: renamed from: d */
    public boolean mo2459d() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Activity m196785e() {
        return this.f179553a;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Context m196786f() {
        return this.f179554b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public Handler m196787g() {
        return this.f179555c;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract E mo2472i();

    @NonNull
    /* JADX INFO: renamed from: j */
    public LayoutInflater mo2473j() {
        return LayoutInflater.from(this.f179554b);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo2474l(@NonNull Fragment fragment) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2475m(@NonNull String str) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m196789n(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            e16.m114386n(this.f179554b, intent, bundle);
        } else {
            qkq0.m175383a("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m196790o(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            b50.m100292z(this.f179553a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            qkq0.m175383a("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo2476p() {
    }

    public v2j(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m196788k(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2471h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
