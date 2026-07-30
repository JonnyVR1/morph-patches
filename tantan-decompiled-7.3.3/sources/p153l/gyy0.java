package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class gyy0 {

    /* JADX INFO: renamed from: a */
    public final atx0 f107132a;

    public gyy0(atx0 atx0Var) {
        this.f107132a = atx0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m133034a() {
        this.f107132a.zzl().mo15146h();
        if (m133037d()) {
            boolean zM133038e = m133038e();
            atx0 atx0Var = this.f107132a;
            if (zM133038e) {
                atx0Var.m100280A().f71918y.m105277b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f107132a.m100282C().m15251V0("auto", "_cmpx", bundle);
            } else {
                String strM105276a = atx0Var.m100280A().f71918y.m105276a();
                boolean zIsEmpty = TextUtils.isEmpty(strM105276a);
                atx0 atx0Var2 = this.f107132a;
                if (zIsEmpty) {
                    atx0Var2.zzj().m114560C().m153300a("Cache still valid but referrer not found");
                } else {
                    long jM219990a = ((atx0Var2.m100280A().f71919z.m219990a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strM105276a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jM219990a);
                    Object obj = pair.first;
                    this.f107132a.m100282C().m15251V0(obj == null ? "app" : (String) obj, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                }
                this.f107132a.m100280A().f71918y.m105277b(null);
            }
            this.f107132a.m100280A().f71919z.m219991b(0L);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m133035b(String str, Bundle bundle) {
        String string;
        this.f107132a.zzl().mo15146h();
        if (this.f107132a.m100298k()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f107132a.m100280A().f71918y.m105277b(string);
        this.f107132a.m100280A().f71919z.m219991b(this.f107132a.zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public final void m133036c() {
        if (m133037d() && m133038e()) {
            this.f107132a.m100280A().f71918y.m105277b(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m133037d() {
        return this.f107132a.m100280A().f71919z.m219990a() > 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m133038e() {
        return m133037d() && this.f107132a.zzb().currentTimeMillis() - this.f107132a.m100280A().f71919z.m219990a() > this.f107132a.m100308u().m98447u(null, whs0.f189236W);
    }
}
