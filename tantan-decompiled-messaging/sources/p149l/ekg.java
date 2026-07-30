package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.ManifestInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public class ekg implements drl {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f91972a;

    /* JADX INFO: renamed from: b */
    private final Context f91973b;

    /* JADX INFO: renamed from: c */
    private final zv3 f91974c;

    /* JADX INFO: renamed from: d */
    private ManifestInfo f91975d;

    /* JADX INFO: renamed from: l.ekg$a */
    public class C16638a implements OnCompleteListener<String> {
        public C16638a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (!task.mo15377p()) {
                ekg.this.f91972a.log("PushProvider", "FCMFCM token using googleservices.json failed", task.mo15372k());
                ekg.this.f91974c.mo214537a(null, ekg.this.getPushType());
                return;
            }
            String strMo15373l = task.mo15373l() != null ? task.mo15373l() : null;
            ekg.this.f91972a.log("PushProvider", "FCMFCM token using googleservices.json - " + strMo15373l);
            ekg.this.f91974c.mo214537a(strMo15373l, ekg.this.getPushType());
        }
    }

    public ekg(zv3 zv3Var, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f91973b = context;
        this.f91972a = cleverTapInstanceConfig;
        this.f91974c = zv3Var;
        this.f91975d = ManifestInfo.getInstance(context);
    }

    /* JADX INFO: renamed from: c */
    public String m116964c() {
        return FirebaseApp.getInstance().getOptions().getGcmSenderId();
    }

    @Override // p149l.drl
    public ggb0 getPushType() {
        return ceb0.f80450a;
    }

    @Override // p149l.drl
    public boolean isAvailable() {
        try {
            if (!r460.m177777a(this.f91973b)) {
                this.f91972a.log("PushProvider", "FCMGoogle Play services is currently unavailable.");
                return false;
            }
            if (!TextUtils.isEmpty(m116964c())) {
                return true;
            }
            this.f91972a.log("PushProvider", "FCMThe FCM sender ID is not set. Unable to register for FCM.");
            return false;
        } catch (Throwable th) {
            this.f91972a.log("PushProvider", "FCMUnable to register with FCM.", th);
            return false;
        }
    }

    @Override // p149l.drl
    public boolean isSupported() {
        return r460.m177778b(this.f91973b);
    }

    @Override // p149l.drl
    public void requestToken() {
        try {
            this.f91972a.log("PushProvider", "FCMRequesting FCM token using googleservices.json");
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new C16638a());
        } catch (Throwable th) {
            this.f91972a.log("PushProvider", "FCMError requesting FCM token", th);
            this.f91974c.mo214537a(null, getPushType());
        }
    }
}
