package p153l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class s5u0 {

    /* JADX INFO: renamed from: a */
    public final Context f166509a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f166510b;

    /* JADX INFO: renamed from: c */
    public final Bundle f166511c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final c7w0 f166512d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final z3u0 f166513e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final tcv0 f166514f;

    public /* synthetic */ s5u0(q5u0 q5u0Var, r5u0 r5u0Var) {
        this.f166509a = q5u0Var.f155757a;
        this.f166510b = q5u0Var.f155758b;
        this.f166511c = q5u0Var.f155759c;
        this.f166512d = q5u0Var.f155760d;
        this.f166513e = q5u0Var.f155761e;
        this.f166514f = q5u0Var.f155762f;
    }

    /* JADX INFO: renamed from: a */
    public final Context m184812a(Context context) {
        return this.f166509a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Bundle m184813b() {
        return this.f166511c;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final z3u0 m184814c() {
        return this.f166513e;
    }

    /* JADX INFO: renamed from: d */
    public final q5u0 m184815d() {
        q5u0 q5u0Var = new q5u0();
        q5u0Var.m175527e(this.f166509a);
        q5u0Var.m175531i(this.f166510b);
        q5u0Var.m175528f(this.f166511c);
        q5u0Var.m175529g(this.f166513e);
        q5u0Var.m175526d(this.f166514f);
        return q5u0Var;
    }

    /* JADX INFO: renamed from: e */
    public final tcv0 m184816e(String str) {
        tcv0 tcv0Var = this.f166514f;
        return tcv0Var != null ? tcv0Var : new tcv0(str);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final c7w0 m184817f() {
        return this.f166512d;
    }

    /* JADX INFO: renamed from: g */
    public final o7w0 m184818g() {
        return this.f166510b;
    }
}
