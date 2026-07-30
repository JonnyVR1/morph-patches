package p153l;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class cor0 implements l4u0 {

    /* JADX INFO: renamed from: a */
    public final Application f82915a;

    /* JADX INFO: renamed from: b */
    public final tqr0 f82916b;

    /* JADX INFO: renamed from: c */
    public final Executor f82917c;

    public cor0(Application application, tqr0 tqr0Var, Executor executor) {
        this.f82915a = application;
        this.f82916b = tqr0Var;
        this.f82917c = executor;
    }

    @Override // p153l.l4u0
    /* JADX INFO: renamed from: a */
    public final boolean mo111689a(String str, JSONObject jSONObject) {
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                pjt0 pjt0Var = new pjt0(this.f82915a);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    String.valueOf(objOpt);
                    if (pjt0Var.m172525c(next, objOpt)) {
                        this.f82916b.m192353c().add(next);
                    } else {
                        "Failed writing key: ".concat(String.valueOf(next));
                    }
                }
                this.f82916b.m192354d();
                pjt0Var.m172524b();
                return true;
            }
        } else if (str.equals(BLiveResOperation.clear)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(UserMetadata.KEYDATA_FILENAME);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString()));
            } else {
                HashSet hashSet = new HashSet();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
                qkt0.m176970b(this.f82915a, hashSet);
            }
            return true;
        }
        return false;
    }

    @Override // p153l.l4u0
    public final Executor zza() {
        return this.f82917c;
    }
}
