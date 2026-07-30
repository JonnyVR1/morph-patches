package p153l;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.LinkedList;
import p153l.her;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public abstract class xtd<T extends her> {

    /* JADX INFO: renamed from: a */
    public her f196199a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bundle f196200b;

    /* JADX INFO: renamed from: c */
    public LinkedList f196201c;

    /* JADX INFO: renamed from: d */
    public final wl50 f196202d = new s6r0(this);

    @KeepForSdk
    public xtd() {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: o */
    public static void m213049o(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String strZac = zac.zac(context, iIsGooglePlayServicesAvailable);
        String strZab = zac.zab(context, iIsGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strZac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strZab);
            linearLayout.addView(button);
            button.setOnClickListener(new m7r0(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public abstract void mo15060a(@NonNull wl50<T> wl50Var);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public T m213054b() {
        return (T) this.f196199a;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m213055c(@NonNull FrameLayout frameLayout) {
        m213049o(frameLayout);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m213056d(@Nullable Bundle bundle) {
        m213068u(bundle, new c7r0(this, bundle));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public View m213057e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m213068u(bundle, new h7r0(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f196199a == null) {
            m213055c(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m213058f() {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.onDestroy();
        } else {
            m213067t(1);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: g */
    public void m213059g() {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.mo15058w();
        } else {
            m213067t(2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: h */
    public void m213060h(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        m213068u(bundle2, new w6r0(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m213061i() {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.onLowMemory();
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: j */
    public void m213062j() {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.onPause();
        } else {
            m213067t(5);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: k */
    public void m213063k() {
        m213068u(null, new w7r0(this));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: l */
    public void m213064l(@NonNull Bundle bundle) {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.mo15057m(bundle);
            return;
        }
        Bundle bundle2 = this.f196200b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: m */
    public void m213065m() {
        m213068u(null, new u7r0(this));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: n */
    public void m213066n() {
        her herVar = this.f196199a;
        if (herVar != null) {
            herVar.mo15055d();
        } else {
            m213067t(4);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m213067t(int i) {
        while (!this.f196201c.isEmpty() && ((z7r0) this.f196201c.getLast()).zaa() >= i) {
            this.f196201c.removeLast();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m213068u(@Nullable Bundle bundle, z7r0 z7r0Var) {
        her herVar = this.f196199a;
        if (herVar != null) {
            z7r0Var.mo108324a(herVar);
            return;
        }
        if (this.f196201c == null) {
            this.f196201c = new LinkedList();
        }
        this.f196201c.add(z7r0Var);
        if (bundle != null) {
            Bundle bundle2 = this.f196200b;
            if (bundle2 == null) {
                this.f196200b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo15060a(this.f196202d);
    }
}
