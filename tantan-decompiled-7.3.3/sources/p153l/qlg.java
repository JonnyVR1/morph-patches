package p153l;

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

/* JADX INFO: loaded from: classes12.dex */
public final class qlg extends hmb0 {
    private static final qlg INSTANCE = new qlg();

    /* JADX INFO: renamed from: d */
    public boolean f158227d = false;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m176999l(qlg qlgVar, Task task) {
        qlgVar.getClass();
        if (!task.mo15431p()) {
            if (task.mo15429n()) {
                String str = kmk0.f127508a;
                return;
            } else {
                task.mo15426k();
                return;
            }
        }
        String str2 = (String) task.mo15427l();
        if (!NullChecker.m82486a(str2)) {
            String str3 = kmk0.f127508a;
        } else {
            qlgVar.m177002o(str2);
            String str4 = kmk0.f127508a;
        }
    }

    /* JADX INFO: renamed from: m */
    public static qlg m177000m() {
        return INSTANCE;
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: a */
    public boolean mo82614a(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("custom");
            if (kmk0.f127509b) {
                Bundle extras = intent.getExtras();
                if (NullChecker.m82486a(extras)) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        String.format("%s %s (%s)", str, obj.toString(), obj.getClass().getName());
                    }
                }
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            return m135827c(stringExtra, true);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("checkIntentForOfflineClickedMessages:" + e.getMessage()));
            return false;
        }
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: e */
    public String mo82615e() {
        return Constants.ScionAnalytics.ORIGIN_FCM;
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: i */
    public void mo82616i() {
        if (this.f158227d) {
            return;
        }
        this.f158227d = true;
        FirebaseApp.initializeApp(k26.m147943a());
        tu2.m192703a("[common][push]", "FcmPushController start!");
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: l.plg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                qlg.m176999l(this.f153029a, task);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m177001n(String str) {
        m135827c(str, false);
    }

    /* JADX INFO: renamed from: o */
    public void m177002o(String str) {
        if (TextUtils.isEmpty(str)) {
            m135831h(null);
            m135829f(false);
        } else {
            m135831h(str);
            m135829f(true);
        }
    }
}
