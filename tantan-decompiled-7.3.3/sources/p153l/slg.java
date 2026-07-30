package p153l;

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
public class slg implements qtl {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f169377a;

    /* JADX INFO: renamed from: b */
    private final Context f169378b;

    /* JADX INFO: renamed from: c */
    private final yw3 f169379c;

    /* JADX INFO: renamed from: d */
    private ManifestInfo f169380d;

    /* JADX INFO: renamed from: l.slg$a */
    public class C20094a implements OnCompleteListener<String> {
        public C20094a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (!task.mo15431p()) {
                slg.this.f169377a.log("PushProvider", "FCMFCM token using googleservices.json failed", task.mo15426k());
                slg.this.f169379c.mo111626a(null, slg.this.getPushType());
                return;
            }
            String strMo15427l = task.mo15427l() != null ? task.mo15427l() : null;
            slg.this.f169377a.log("PushProvider", "FCMFCM token using googleservices.json - " + strMo15427l);
            slg.this.f169379c.mo111626a(strMo15427l, slg.this.getPushType());
        }
    }

    public slg(yw3 yw3Var, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f169378b = context;
        this.f169377a = cleverTapInstanceConfig;
        this.f169379c = yw3Var;
        this.f169380d = ManifestInfo.getInstance(context);
    }

    /* JADX INFO: renamed from: c */
    public String m186574c() {
        return FirebaseApp.getInstance().getOptions().getGcmSenderId();
    }

    @Override // p153l.qtl
    public kob0 getPushType() {
        return gmb0.f104964a;
    }

    @Override // p153l.qtl
    public boolean isAvailable() {
        try {
            if (!xc60.m210129a(this.f169378b)) {
                this.f169377a.log("PushProvider", "FCMGoogle Play services is currently unavailable.");
                return false;
            }
            if (!TextUtils.isEmpty(m186574c())) {
                return true;
            }
            this.f169377a.log("PushProvider", "FCMThe FCM sender ID is not set. Unable to register for FCM.");
            return false;
        } catch (Throwable th) {
            this.f169377a.log("PushProvider", "FCMUnable to register with FCM.", th);
            return false;
        }
    }

    @Override // p153l.qtl
    public boolean isSupported() {
        return xc60.m210130b(this.f169378b);
    }

    @Override // p153l.qtl
    public void requestToken() {
        try {
            this.f169377a.log("PushProvider", "FCMRequesting FCM token using googleservices.json");
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new C20094a());
        } catch (Throwable th) {
            this.f169377a.log("PushProvider", "FCMError requesting FCM token", th);
            this.f169379c.mo111626a(null, getPushType());
        }
    }
}
