package p153l;

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
public abstract class q5j<E> extends o5j {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Activity f155722a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Context f155723b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Handler f155724c;

    /* JADX INFO: renamed from: d */
    public final int f155725d;

    /* JADX INFO: renamed from: e */
    public final FragmentManager f155726e;

    public q5j(@Nullable Activity activity, @NonNull Context context, @NonNull Handler handler, int i) {
        this.f155726e = new r5j();
        this.f155722a = activity;
        this.f155723b = (Context) yn80.m216776f(context, "context == null");
        this.f155724c = (Handler) yn80.m216776f(handler, "handler == null");
        this.f155725d = i;
    }

    @Override // p153l.o5j
    @Nullable
    /* JADX INFO: renamed from: c */
    public View mo2459c(int i) {
        return null;
    }

    @Override // p153l.o5j
    /* JADX INFO: renamed from: d */
    public boolean mo2460d() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Activity m175361e() {
        return this.f155722a;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Context m175362f() {
        return this.f155723b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public Handler m175363g() {
        return this.f155724c;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract E mo2473i();

    @NonNull
    /* JADX INFO: renamed from: j */
    public LayoutInflater mo2474j() {
        return LayoutInflater.from(this.f155723b);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo2475l(@NonNull Fragment fragment) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2476m(@NonNull String str) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m175365n(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            j26.m143201n(this.f155723b, intent, bundle);
        } else {
            wtq0.m207906a("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public void m175366o(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            v40.m199649z(this.f155722a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            wtq0.m207906a("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo2477p() {
    }

    public q5j(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m175364k(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2472h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
