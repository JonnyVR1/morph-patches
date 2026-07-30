package p153l;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import com.google.android.gms.internal.consent_sdk.zzbr;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
@UiThread
public final class e6s0 implements vx5 {

    /* JADX INFO: renamed from: a */
    public final Application f92344a;

    /* JADX INFO: renamed from: b */
    public final bxs0 f92345b;

    /* JADX INFO: renamed from: c */
    public final tqr0 f92346c;

    /* JADX INFO: renamed from: d */
    public final eos0 f92347d;

    /* JADX INFO: renamed from: e */
    public final bou0 f92348e;

    /* JADX INFO: renamed from: f */
    public Dialog f92349f;

    /* JADX INFO: renamed from: g */
    public zzbr f92350g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f92351h = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final AtomicReference f92352i = new AtomicReference();

    /* JADX INFO: renamed from: j */
    public final AtomicReference f92353j = new AtomicReference();

    /* JADX INFO: renamed from: k */
    public final AtomicReference f92354k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public boolean f92355l = false;

    public e6s0(Application application, hcr0 hcr0Var, bxs0 bxs0Var, tqr0 tqr0Var, eos0 eos0Var, bou0 bou0Var) {
        this.f92344a = application;
        this.f92345b = bxs0Var;
        this.f92346c = tqr0Var;
        this.f92347d = eos0Var;
        this.f92348e = bou0Var;
    }

    @Override // p153l.vx5
    /* JADX INFO: renamed from: a */
    public final void mo119672a(Activity activity, vx5.InterfaceC20951a interfaceC20951a) {
        pot0.m173113a();
        if (!this.f92351h.compareAndSet(false, true)) {
            interfaceC20951a.mo148588a(new zzg(3, true != this.f92355l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.f92350g.m13816c();
        f2s0 f2s0Var = new f2s0(this, activity);
        this.f92344a.registerActivityLifecycleCallbacks(f2s0Var);
        this.f92354k.set(f2s0Var);
        this.f92345b.m106903a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f92350g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            interfaceC20951a.mo148588a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        nfq0.m162936b(window, false);
        this.f92353j.set(interfaceC20951a);
        dialog.show();
        this.f92349f = dialog;
        this.f92350g.m13817d("UMP_messagePresented", "");
    }

    /* JADX INFO: renamed from: d */
    public final zzbr m119673d() {
        return this.f92350g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m119674g(sfk0.InterfaceC20034b interfaceC20034b, sfk0.InterfaceC20033a interfaceC20033a) {
        zzbr zzbrVarM192832a = ((tvs0) this.f92348e).zza();
        this.f92350g = zzbrVarM192832a;
        zzbrVarM192832a.setBackgroundColor(0);
        zzbrVarM192832a.getSettings().setJavaScriptEnabled(true);
        zzbrVarM192832a.setWebViewClient(new urs0(zzbrVarM192832a, null));
        this.f92352i.set(new m3s0(interfaceC20034b, interfaceC20033a, 0 == true ? 1 : 0));
        zzbr zzbrVar = this.f92350g;
        eos0 eos0Var = this.f92347d;
        zzbrVar.loadDataWithBaseURL(eos0Var.m121758a(), eos0Var.m121759b(), MimeTypes.TEXT_HTML, "UTF-8", null);
        pot0.f153428a.postDelayed(new Runnable() { // from class: l.w0s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186719a.m119678k(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    /* JADX INFO: renamed from: h */
    public final void m119675h(int i) {
        m119679l();
        vx5.InterfaceC20951a interfaceC20951a = (vx5.InterfaceC20951a) this.f92353j.getAndSet(null);
        if (interfaceC20951a == null) {
            return;
        }
        this.f92346c.m192355e(3);
        interfaceC20951a.mo148588a(null);
    }

    /* JADX INFO: renamed from: i */
    public final void m119676i(zzg zzgVar) {
        m119679l();
        vx5.InterfaceC20951a interfaceC20951a = (vx5.InterfaceC20951a) this.f92353j.getAndSet(null);
        if (interfaceC20951a == null) {
            return;
        }
        interfaceC20951a.mo148588a(zzgVar.zza());
    }

    /* JADX INFO: renamed from: j */
    public final void m119677j() {
        m3s0 m3s0Var = (m3s0) this.f92352i.getAndSet(null);
        if (m3s0Var == null) {
            return;
        }
        m3s0Var.mo98453a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m119678k(zzg zzgVar) {
        m3s0 m3s0Var = (m3s0) this.f92352i.getAndSet(null);
        if (m3s0Var == null) {
            return;
        }
        m3s0Var.mo140415b(zzgVar.zza());
    }

    /* JADX INFO: renamed from: l */
    public final void m119679l() {
        Dialog dialog = this.f92349f;
        if (dialog != null) {
            dialog.dismiss();
            this.f92349f = null;
        }
        this.f92345b.m106903a(null);
        f2s0 f2s0Var = (f2s0) this.f92354k.getAndSet(null);
        if (f2s0Var != null) {
            f2s0Var.m123670b();
        }
    }
}
