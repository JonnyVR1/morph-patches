package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class apy0 {

    /* JADX INFO: renamed from: a */
    public final ujx0 f71093a;

    public apy0(ujx0 ujx0Var) {
        this.f71093a = ujx0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m98200a() {
        this.f71093a.zzl().mo15092h();
        if (m98203d()) {
            boolean zM98204e = m98204e();
            ujx0 ujx0Var = this.f71093a;
            if (zM98204e) {
                ujx0Var.m194100A().f175537y.m197914b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f71093a.m194102C().m15197V0("auto", "_cmpx", bundle);
            } else {
                String strM197913a = ujx0Var.m194100A().f175537y.m197913a();
                boolean zIsEmpty = TextUtils.isEmpty(strM197913a);
                ujx0 ujx0Var2 = this.f71093a;
                if (zIsEmpty) {
                    ujx0Var2.zzj().m211414C().m123936a("Cache still valid but referrer not found");
                } else {
                    long jM187782a = ((ujx0Var2.m194100A().f175538z.m187782a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strM197913a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jM187782a);
                    Object obj = pair.first;
                    this.f71093a.m194102C().m15197V0(obj == null ? "app" : (String) obj, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                }
                this.f71093a.m194100A().f175537y.m197914b(null);
            }
            this.f71093a.m194100A().f175538z.m187783b(0L);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m98201b(String str, Bundle bundle) {
        String string;
        this.f71093a.zzl().mo15092h();
        if (this.f71093a.m194118k()) {
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
        this.f71093a.m194100A().f175537y.m197914b(string);
        this.f71093a.m194100A().f175538z.m187783b(this.f71093a.zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public final void m98202c() {
        if (m98203d() && m98204e()) {
            this.f71093a.m194100A().f175537y.m197914b(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m98203d() {
        return this.f71093a.m194100A().f175538z.m187782a() > 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m98204e() {
        return m98203d() && this.f71093a.zzb().currentTimeMillis() - this.f71093a.m194100A().f175538z.m187782a() > this.f71093a.m194128u().m192655u(null, q8s0.f153260W);
    }
}
