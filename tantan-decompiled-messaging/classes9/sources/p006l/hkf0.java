package p006l;

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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import l.aub;
import l.e30;
import l.j760;
import l.xtb;
import l.ztb;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hkf0 {

    /* JADX INFO: renamed from: a */
    public final aub f13924a;

    /* JADX INFO: renamed from: b */
    public ztb f13925b;

    /* JADX INFO: renamed from: c */
    public a<Pair<String, String>> f13926c;

    /* JADX INFO: renamed from: l.hkf0$a */
    public static class C0804a {

        /* JADX INFO: renamed from: a */
        public static hkf0 f13927a = new hkf0();
    }

    public hkf0() {
        aub aubVarC = new aub.a().d().c();
        this.f13924a = aubVarC;
        this.f13925b = xtb.b(App.e, aubVarC);
        this.f13926c = a.b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16231a(Activity activity, Task task) {
        if (task.p()) {
            return;
        }
        ResolvableApiException resolvableApiExceptionK = task.k();
        if (resolvableApiExceptionK instanceof ResolvableApiException) {
            try {
                resolvableApiExceptionK.startResolutionForResult(activity, 10101);
            } catch (IntentSender.SendIntentException e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16232b(Activity activity, Task task) {
        if (task.p()) {
            return;
        }
        ResolvableApiException resolvableApiExceptionK = task.k();
        if (resolvableApiExceptionK instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = resolvableApiExceptionK;
            if (resolvableApiException.getStatusCode() == 6) {
                try {
                    zvf0.D("e_smart_lock_signin", "p_sign_in_phone_number_view", new j760[0]);
                    resolvableApiException.startResolutionForResult(activity, 10102);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static hkf0 m16233d() {
        return C0804a.f13927a;
    }

    /* JADX INFO: renamed from: c */
    public void m16234c(Credential credential) {
        this.f13925b.b(credential);
    }

    /* JADX INFO: renamed from: e */
    public a<Pair<String, String>> m16235e() {
        return this.f13926c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m16236f(int i, int i2, Intent intent, e30<Credential> e30Var) {
        if (i != 10102) {
            return i == 10101;
        }
        if (i2 == -1) {
            Credential parcelableExtra = intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
            if (e30Var != null) {
                e30Var.call(parcelableExtra);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m16237g(final Activity activity) {
        this.f13925b = xtb.a(activity, this.f13924a);
        CredentialRequest credentialRequestA = new CredentialRequest.a().b(true).a();
        this.f13925b.c();
        this.f13925b.d(credentialRequestA).addOnCompleteListener(new OnCompleteListener() { // from class: l.gkf0
            public final void onComplete(Task task) {
                hkf0.m16232b(activity, task);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m16238h(final Activity activity, String str, String str2) {
        this.f13926c.onNext((Object) null);
        this.f13925b = xtb.a(activity, new aub.a().d().c());
        Credential.a aVarC = new Credential.a(str).b(str).c(str2);
        User userMe_ = AccountModule.m27H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(((Media) userMe_.fp()).url)) {
            aVarC.d(Uri.parse(((Media) userMe_.fp()).url));
        }
        if (userMe_ != null && !TextUtils.isEmpty(userMe_.name)) {
            aVarC.b(userMe_.name);
        }
        this.f13925b.e(aVarC.a()).addOnCompleteListener(new OnCompleteListener() { // from class: l.fkf0
            public final void onComplete(Task task) {
                hkf0.m16231a(activity, task);
            }
        });
    }
}
