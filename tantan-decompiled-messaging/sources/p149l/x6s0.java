package p149l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x6s0 {

    /* JADX INFO: renamed from: a */
    public final int f191269a;

    /* JADX INFO: renamed from: b */
    public final String f191270b;

    /* JADX INFO: renamed from: c */
    public final Object f191271c;

    public /* synthetic */ x6s0(int i, String str, Object obj, w6s0 w6s0Var) {
        this.f191269a = i;
        this.f191270b = str;
        this.f191271c = obj;
        d1s0.m109675a().m213244d(this);
    }

    /* JADX INFO: renamed from: f */
    public static x6s0 m207200f(int i, String str, float f) {
        return new u6s0(1, str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: g */
    public static x6s0 m207201g(int i, String str, int i2) {
        return new s6s0(1, str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public static x6s0 m207202h(int i, String str, long j) {
        return new t6s0(1, str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: i */
    public static x6s0 m207203i(int i, String str, Boolean bool) {
        return new r6s0(i, str, bool);
    }

    /* JADX INFO: renamed from: j */
    public static x6s0 m207204j(int i, String str, String str2) {
        return new v6s0(1, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static x6s0 m207205k(int i, String str) {
        x6s0 x6s0VarM207204j = m207204j(1, "gads:sdk_core_constants:experiment_id", null);
        d1s0.m109675a().m213243c(x6s0VarM207204j);
        return x6s0VarM207204j;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo178095a(JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    public abstract Object mo178096b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    public abstract Object mo178097c(SharedPreferences sharedPreferences);

    /* JADX INFO: renamed from: d */
    public abstract void mo178098d(SharedPreferences.Editor editor, Object obj);

    /* JADX INFO: renamed from: e */
    public final int m207206e() {
        return this.f191269a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m207207l() {
        return d1s0.m109677c().m144697a(this);
    }

    /* JADX INFO: renamed from: m */
    public final Object m207208m() {
        return this.f191271c;
    }

    /* JADX INFO: renamed from: n */
    public final String m207209n() {
        return this.f191270b;
    }
}
