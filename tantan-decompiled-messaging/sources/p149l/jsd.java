package p149l;

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
import p149l.gcr;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public abstract class jsd<T extends gcr> {

    /* JADX INFO: renamed from: a */
    public gcr f119488a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bundle f119489b;

    /* JADX INFO: renamed from: c */
    public LinkedList f119490c;

    /* JADX INFO: renamed from: d */
    public final pd50 f119491d = new mxq0(this);

    @KeepForSdk
    public jsd() {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: o */
    public static void m143010o(@NonNull FrameLayout frameLayout) {
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
            button.setOnClickListener(new gyq0(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public abstract void mo15006a(@NonNull pd50<T> pd50Var);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public T m143015b() {
        return (T) this.f119488a;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m143016c(@NonNull FrameLayout frameLayout) {
        m143010o(frameLayout);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m143017d(@Nullable Bundle bundle) {
        m143029u(bundle, new wxq0(this, bundle));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public View m143018e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m143029u(bundle, new byq0(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f119488a == null) {
            m143016c(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m143019f() {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.onDestroy();
        } else {
            m143028t(1);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: g */
    public void m143020g() {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.mo15004w();
        } else {
            m143028t(2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: h */
    public void m143021h(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2) {
        m143029u(bundle2, new qxq0(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m143022i() {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.onLowMemory();
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: j */
    public void m143023j() {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.onPause();
        } else {
            m143028t(5);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: k */
    public void m143024k() {
        m143029u(null, new qyq0(this));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: l */
    public void m143025l(@NonNull Bundle bundle) {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.mo15003m(bundle);
            return;
        }
        Bundle bundle2 = this.f119489b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: m */
    public void m143026m() {
        m143029u(null, new oyq0(this));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: n */
    public void m143027n() {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            gcrVar.mo15001d();
        } else {
            m143028t(4);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m143028t(int i) {
        while (!this.f119490c.isEmpty() && ((tyq0) this.f119490c.getLast()).zaa() >= i) {
            this.f119490c.removeLast();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m143029u(@Nullable Bundle bundle, tyq0 tyq0Var) {
        gcr gcrVar = this.f119488a;
        if (gcrVar != null) {
            tyq0Var.mo104507a(gcrVar);
            return;
        }
        if (this.f119490c == null) {
            this.f119490c = new LinkedList();
        }
        this.f119490c.add(tyq0Var);
        if (bundle != null) {
            Bundle bundle2 = this.f119489b;
            if (bundle2 == null) {
                this.f119489b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo15006a(this.f119491d);
    }
}
