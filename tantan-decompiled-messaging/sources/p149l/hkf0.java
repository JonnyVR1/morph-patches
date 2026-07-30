package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class hkf0 {

    /* JADX INFO: renamed from: a */
    public final aub f108183a;

    /* JADX INFO: renamed from: b */
    public ztb f108184b;

    /* JADX INFO: renamed from: c */
    public C22392a<Pair<String, String>> f108185c;

    /* JADX INFO: renamed from: l.hkf0$a */
    public static class C17333a {

        /* JADX INFO: renamed from: a */
        public static hkf0 f108186a = new hkf0();
    }

    public hkf0() {
        aub aubVarMo98961b = new aub.C15721a().m98963d().mo98961b();
        this.f108183a = aubVarMo98961b;
        this.f108184b = xtb.m210964b(App.f15369e, aubVarMo98961b);
        this.f108185c = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m131484a(Activity activity, Task task) {
        if (task.mo15377p()) {
            return;
        }
        Exception excMo15372k = task.mo15372k();
        if (excMo15372k instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) excMo15372k).startResolutionForResult(activity, 10101);
            } catch (IntentSender.SendIntentException e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m131485b(Activity activity, Task task) {
        if (task.mo15377p()) {
            return;
        }
        Exception excMo15372k = task.mo15372k();
        if (excMo15372k instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) excMo15372k;
            if (resolvableApiException.getStatusCode() == 6) {
                try {
                    zvf0.m220371D("e_smart_lock_signin", "p_sign_in_phone_number_view", new j760[0]);
                    resolvableApiException.startResolutionForResult(activity, Constants.REQUEST_APPBAR);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static hkf0 m131486d() {
        return C17333a.f108186a;
    }

    /* JADX INFO: renamed from: c */
    public void m131487c(Credential credential) {
        this.f108184b.m220118b(credential);
    }

    /* JADX INFO: renamed from: e */
    public C22392a<Pair<String, String>> m131488e() {
        return this.f108185c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m131489f(int i, int i2, Intent intent, e30<Credential> e30Var) {
        if (i != 10102) {
            return i == 10101;
        }
        if (i2 == -1) {
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            if (e30Var != null) {
                e30Var.call(credential);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m131490g(final Activity activity) {
        this.f108184b = xtb.m210963a(activity, this.f108183a);
        CredentialRequest credentialRequestM12396a = new CredentialRequest.C2079a().m12397b(true).m12396a();
        this.f108184b.m220119c();
        this.f108184b.m220120d(credentialRequestM12396a).addOnCompleteListener(new OnCompleteListener() { // from class: l.gkf0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                hkf0.m131485b(activity, task);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m131491h(final Activity activity, String str, String str2) {
        this.f108185c.m132487l(null);
        this.f108184b = xtb.m210963a(activity, new aub.C15721a().m98963d().mo98961b());
        Credential.C2077a c2077aM12373c = new Credential.C2077a(str).m12372b(str).m12373c(str2);
        User userMe_ = AccountModule.m28132H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(userMe_.m60124fp().url)) {
            c2077aM12373c.m12374d(Uri.parse(userMe_.m60124fp().url));
        }
        if (userMe_ != null && !TextUtils.isEmpty(userMe_.name)) {
            c2077aM12373c.m12372b(userMe_.name);
        }
        this.f108184b.m220121e(c2077aM12373c.m12371a()).addOnCompleteListener(new OnCompleteListener() { // from class: l.fkf0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                hkf0.m131484a(activity, task);
            }
        });
    }
}
