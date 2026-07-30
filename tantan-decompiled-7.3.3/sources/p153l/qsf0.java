package p153l;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class qsf0 {

    /* JADX INFO: renamed from: a */
    public final ovb f159319a;

    /* JADX INFO: renamed from: b */
    public nvb f159320b;

    /* JADX INFO: renamed from: c */
    public C22507a<Pair<String, String>> f159321c;

    /* JADX INFO: renamed from: l.qsf0$a */
    public static class C19647a {

        /* JADX INFO: renamed from: a */
        public static qsf0 f159322a = new qsf0();
    }

    public qsf0() {
        ovb ovbVarMo169428b = new ovb.C19225a().m169430d().mo169428b();
        this.f159319a = ovbVarMo169428b;
        this.f159320b = lvb.m155980b(App.f16088e, ovbVarMo169428b);
        this.f159321c = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m177797a(Activity activity, Task task) {
        if (task.mo15431p()) {
            return;
        }
        Exception excMo15426k = task.mo15426k();
        if (excMo15426k instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) excMo15426k).startResolutionForResult(activity, 10101);
            } catch (IntentSender.SendIntentException e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m177798b(Activity activity, Task task) {
        if (task.mo15431p()) {
            return;
        }
        Exception excMo15426k = task.mo15426k();
        if (excMo15426k instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) excMo15426k;
            if (resolvableApiException.getStatusCode() == 6) {
                try {
                    i4g0.m138495D("e_smart_lock_signin", "p_sign_in_phone_number_view", new pf60[0]);
                    resolvableApiException.startResolutionForResult(activity, Constants.REQUEST_APPBAR);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static qsf0 m177799d() {
        return C19647a.f159322a;
    }

    /* JADX INFO: renamed from: c */
    public void m177800c(Credential credential) {
        this.f159320b.m164864b(credential);
    }

    /* JADX INFO: renamed from: e */
    public C22507a<Pair<String, String>> m177801e() {
        return this.f159321c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m177802f(int i, int i2, Intent intent, y20<Credential> y20Var) {
        if (i != 10102) {
            return i == 10101;
        }
        if (i2 == -1) {
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            if (y20Var != null) {
                y20Var.call(credential);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m177803g(final Activity activity) {
        this.f159320b = lvb.m155979a(activity, this.f159319a);
        CredentialRequest credentialRequestM12450a = new CredentialRequest.C2102a().m12451b(true).m12450a();
        this.f159320b.m164865c();
        this.f159320b.m164866d(credentialRequestM12450a).addOnCompleteListener(new OnCompleteListener() { // from class: l.psf0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                qsf0.m177798b(activity, task);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m177804h(final Activity activity, String str, String str2) {
        this.f159321c.m137019l(null);
        this.f159320b = lvb.m155979a(activity, new ovb.C19225a().m169430d().mo169428b());
        Credential.C2100a c2100aM12427c = new Credential.C2100a(str).m12426b(str).m12427c(str2);
        User userMe_ = AccountModule.m29131H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(userMe_.m61308fp().url)) {
            c2100aM12427c.m12428d(Uri.parse(userMe_.m61308fp().url));
        }
        if (userMe_ != null && !TextUtils.isEmpty(userMe_.name)) {
            c2100aM12427c.m12426b(userMe_.name);
        }
        this.f159320b.m164867e(c2100aM12427c.m12425a()).addOnCompleteListener(new OnCompleteListener() { // from class: l.osf0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                qsf0.m177797a(activity, task);
            }
        });
    }
}
