package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public final class ckg extends deb0 {
    private static final ckg INSTANCE = new ckg();

    /* JADX INFO: renamed from: d */
    public boolean f81333d = false;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m107409l(ckg ckgVar, Task task) {
        ckgVar.getClass();
        if (!task.mo15377p()) {
            if (task.mo15375n()) {
                String str = edk0.f90611a;
                return;
            } else {
                task.mo15372k();
                return;
            }
        }
        String str2 = (String) task.mo15373l();
        if (!NullChecker.m81303a(str2)) {
            String str3 = edk0.f90611a;
        } else {
            ckgVar.m107412o(str2);
            String str4 = edk0.f90611a;
        }
    }

    /* JADX INFO: renamed from: m */
    public static ckg m107410m() {
        return INSTANCE;
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: a */
    public boolean mo81431a(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("custom");
            if (edk0.f90612b) {
                Bundle extras = intent.getExtras();
                if (NullChecker.m81303a(extras)) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        String.format("%s %s (%s)", str, obj.toString(), obj.getClass().getName());
                    }
                }
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            return m111182c(stringExtra, true);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("checkIntentForOfflineClickedMessages:" + e.getMessage()));
            return false;
        }
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: e */
    public String mo81432e() {
        return Constants.ScionAnalytics.ORIGIN_FCM;
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: i */
    public void mo81433i() {
        if (this.f81333d) {
            return;
        }
        this.f81333d = true;
        FirebaseApp.initializeApp(f16.m119092a());
        du2.m113670a("[common][push]", "FcmPushController start!");
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: l.bkg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ckg.m107409l(this.f76017a, task);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m107411n(String str) {
        m111182c(str, false);
    }

    /* JADX INFO: renamed from: o */
    public void m107412o(String str) {
        if (TextUtils.isEmpty(str)) {
            m111186h(null);
            m111184f(false);
        } else {
            m111186h(str);
            m111184f(true);
        }
    }
}
