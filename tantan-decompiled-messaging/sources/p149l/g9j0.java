package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g9j0 {

    /* JADX INFO: renamed from: b */
    public View f101571b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f101570a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<u7j0> f101572c = new ArrayList<>();

    public g9j0(@NonNull View view) {
        this.f101571b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g9j0)) {
            return false;
        }
        g9j0 g9j0Var = (g9j0) obj;
        return this.f101571b == g9j0Var.f101571b && this.f101570a.equals(g9j0Var.f101570a);
    }

    public int hashCode() {
        return (this.f101571b.hashCode() * 31) + this.f101570a.hashCode();
    }

    public String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f101571b + SignParameters.NEW_LINE).concat("    values:");
        for (String str : this.f101570a.keySet()) {
            strConcat = strConcat + "    " + str + ": " + this.f101570a.get(str) + SignParameters.NEW_LINE;
        }
        return strConcat;
    }

    @Deprecated
    public g9j0() {
    }
}
