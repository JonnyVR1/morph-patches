package p149l;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wer0 implements fvt0 {

    /* JADX INFO: renamed from: a */
    public final Application f185968a;

    /* JADX INFO: renamed from: b */
    public final nhr0 f185969b;

    /* JADX INFO: renamed from: c */
    public final Executor f185970c;

    public wer0(Application application, nhr0 nhr0Var, Executor executor) {
        this.f185968a = application;
        this.f185969b = nhr0Var;
        this.f185970c = executor;
    }

    @Override // p149l.fvt0
    /* JADX INFO: renamed from: a */
    public final boolean mo123369a(String str, JSONObject jSONObject) {
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                jat0 jat0Var = new jat0(this.f185968a);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    String.valueOf(objOpt);
                    if (jat0Var.m140712c(next, objOpt)) {
                        this.f185969b.m159448c().add(next);
                    } else {
                        "Failed writing key: ".concat(String.valueOf(next));
                    }
                }
                this.f185969b.m159449d();
                jat0Var.m140711b();
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
                kbt0.m145323b(this.f185968a, hashSet);
            }
            return true;
        }
        return false;
    }

    @Override // p149l.fvt0
    public final Executor zza() {
        return this.f185970c;
    }
}
