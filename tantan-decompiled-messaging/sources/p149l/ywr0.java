package p149l;

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
public final class ywr0 implements qw5 {

    /* JADX INFO: renamed from: a */
    public final Application f200525a;

    /* JADX INFO: renamed from: b */
    public final vns0 f200526b;

    /* JADX INFO: renamed from: c */
    public final nhr0 f200527c;

    /* JADX INFO: renamed from: d */
    public final yes0 f200528d;

    /* JADX INFO: renamed from: e */
    public final veu0 f200529e;

    /* JADX INFO: renamed from: f */
    public Dialog f200530f;

    /* JADX INFO: renamed from: g */
    public zzbr f200531g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f200532h = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final AtomicReference f200533i = new AtomicReference();

    /* JADX INFO: renamed from: j */
    public final AtomicReference f200534j = new AtomicReference();

    /* JADX INFO: renamed from: k */
    public final AtomicReference f200535k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public boolean f200536l = false;

    public ywr0(Application application, b3r0 b3r0Var, vns0 vns0Var, nhr0 nhr0Var, yes0 yes0Var, veu0 veu0Var) {
        this.f200525a = application;
        this.f200526b = vns0Var;
        this.f200527c = nhr0Var;
        this.f200528d = yes0Var;
        this.f200529e = veu0Var;
    }

    @Override // p149l.qw5
    /* JADX INFO: renamed from: a */
    public final void mo176772a(Activity activity, qw5.InterfaceC19595a interfaceC19595a) {
        jft0.m141214a();
        if (!this.f200532h.compareAndSet(false, true)) {
            interfaceC19595a.mo162962a(new zzg(3, true != this.f200536l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.f200531g.m13762c();
        zsr0 zsr0Var = new zsr0(this, activity);
        this.f200525a.registerActivityLifecycleCallbacks(zsr0Var);
        this.f200535k.set(zsr0Var);
        this.f200526b.m199052a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f200531g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            interfaceC19595a.mo162962a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        i6q0.m134631b(window, false);
        this.f200534j.set(interfaceC19595a);
        dialog.show();
        this.f200530f = dialog;
        this.f200531g.m13763d("UMP_messagePresented", "");
    }

    /* JADX INFO: renamed from: d */
    public final zzbr m216416d() {
        return this.f200531g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m216417g(m6k0.InterfaceC18404b interfaceC18404b, m6k0.InterfaceC18403a interfaceC18403a) {
        zzbr zzbrVarM160155a = ((nms0) this.f200529e).zza();
        this.f200531g = zzbrVarM160155a;
        zzbrVarM160155a.setBackgroundColor(0);
        zzbrVarM160155a.getSettings().setJavaScriptEnabled(true);
        zzbrVarM160155a.setWebViewClient(new ois0(zzbrVarM160155a, null));
        this.f200533i.set(new gur0(interfaceC18404b, interfaceC18403a, 0 == true ? 1 : 0));
        zzbr zzbrVar = this.f200531g;
        yes0 yes0Var = this.f200528d;
        zzbrVar.loadDataWithBaseURL(yes0Var.m214383a(), yes0Var.m214384b(), MimeTypes.TEXT_HTML, "UTF-8", null);
        jft0.f117689a.postDelayed(new Runnable() { // from class: l.qrr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156043a.m216421k(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    /* JADX INFO: renamed from: h */
    public final void m216418h(int i) {
        m216422l();
        qw5.InterfaceC19595a interfaceC19595a = (qw5.InterfaceC19595a) this.f200534j.getAndSet(null);
        if (interfaceC19595a == null) {
            return;
        }
        this.f200527c.m159450e(3);
        interfaceC19595a.mo162962a(null);
    }

    /* JADX INFO: renamed from: i */
    public final void m216419i(zzg zzgVar) {
        m216422l();
        qw5.InterfaceC19595a interfaceC19595a = (qw5.InterfaceC19595a) this.f200534j.getAndSet(null);
        if (interfaceC19595a == null) {
            return;
        }
        interfaceC19595a.mo162962a(zzgVar.zza());
    }

    /* JADX INFO: renamed from: j */
    public final void m216420j() {
        gur0 gur0Var = (gur0) this.f200533i.getAndSet(null);
        if (gur0Var == null) {
            return;
        }
        gur0Var.mo114527a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m216421k(zzg zzgVar) {
        gur0 gur0Var = (gur0) this.f200533i.getAndSet(null);
        if (gur0Var == null) {
            return;
        }
        gur0Var.mo106024b(zzgVar.zza());
    }

    /* JADX INFO: renamed from: l */
    public final void m216422l() {
        Dialog dialog = this.f200530f;
        if (dialog != null) {
            dialog.dismiss();
            this.f200530f = null;
        }
        this.f200526b.m199052a(null);
        zsr0 zsr0Var = (zsr0) this.f200535k.getAndSet(null);
        if (zsr0Var != null) {
            zsr0Var.m220080b();
        }
    }
}
