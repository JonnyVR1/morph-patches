package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dgs0 {

    /* JADX INFO: renamed from: a */
    public final int f88373a;

    /* JADX INFO: renamed from: b */
    public final String f88374b;

    /* JADX INFO: renamed from: c */
    public final Object f88375c;

    public /* synthetic */ dgs0(int i, String str, Object obj, cgs0 cgs0Var) {
        this.f88373a = i;
        this.f88374b = str;
        this.f88375c = obj;
        jas0.m144073a().m120799d(this);
    }

    /* JADX INFO: renamed from: f */
    public static dgs0 m115741f(int i, String str, float f) {
        return new ags0(1, str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: g */
    public static dgs0 m115742g(int i, String str, int i2) {
        return new yfs0(1, str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public static dgs0 m115743h(int i, String str, long j) {
        return new zfs0(1, str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: i */
    public static dgs0 m115744i(int i, String str, Boolean bool) {
        return new xfs0(i, str, bool);
    }

    /* JADX INFO: renamed from: j */
    public static dgs0 m115745j(int i, String str, String str2) {
        return new bgs0(1, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static dgs0 m115746k(int i, String str) {
        dgs0 dgs0VarM115745j = m115745j(1, "gads:sdk_core_constants:experiment_id", null);
        jas0.m144073a().m120798c(dgs0VarM115745j);
        return dgs0VarM115745j;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo97724a(JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    public abstract Object mo97725b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    public abstract Object mo97726c(SharedPreferences sharedPreferences);

    /* JADX INFO: renamed from: d */
    public abstract void mo97727d(SharedPreferences.Editor editor, Object obj);

    /* JADX INFO: renamed from: e */
    public final int m115747e() {
        return this.f88373a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m115748l() {
        return jas0.m144075c().m176505a(this);
    }

    /* JADX INFO: renamed from: m */
    public final Object m115749m() {
        return this.f88375c;
    }

    /* JADX INFO: renamed from: n */
    public final String m115750n() {
        return this.f88374b;
    }
}
