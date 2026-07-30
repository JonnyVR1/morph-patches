package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kij0 {

    /* JADX INFO: renamed from: b */
    public View f127001b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f127000a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<ygj0> f127002c = new ArrayList<>();

    public kij0(@NonNull View view) {
        this.f127001b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kij0)) {
            return false;
        }
        kij0 kij0Var = (kij0) obj;
        return this.f127001b == kij0Var.f127001b && this.f127000a.equals(kij0Var.f127000a);
    }

    public int hashCode() {
        return (this.f127001b.hashCode() * 31) + this.f127000a.hashCode();
    }

    public String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f127001b + SignParameters.NEW_LINE).concat("    values:");
        for (String str : this.f127000a.keySet()) {
            strConcat = strConcat + "    " + str + ": " + this.f127000a.get(str) + SignParameters.NEW_LINE;
        }
        return strConcat;
    }

    @Deprecated
    public kij0() {
    }
}
