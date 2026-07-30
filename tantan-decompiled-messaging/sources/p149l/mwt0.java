package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class mwt0 {

    /* JADX INFO: renamed from: a */
    public final Context f136087a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f136088b;

    /* JADX INFO: renamed from: c */
    public final Bundle f136089c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final wxv0 f136090d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final tut0 f136091e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final n3v0 f136092f;

    public /* synthetic */ mwt0(kwt0 kwt0Var, lwt0 lwt0Var) {
        this.f136087a = kwt0Var.f125011a;
        this.f136088b = kwt0Var.f125012b;
        this.f136089c = kwt0Var.f125013c;
        this.f136090d = kwt0Var.f125014d;
        this.f136091e = kwt0Var.f125015e;
        this.f136092f = kwt0Var.f125016f;
    }

    /* JADX INFO: renamed from: a */
    public final Context m156767a(Context context) {
        return this.f136087a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Bundle m156768b() {
        return this.f136089c;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final tut0 m156769c() {
        return this.f136091e;
    }

    /* JADX INFO: renamed from: d */
    public final kwt0 m156770d() {
        kwt0 kwt0Var = new kwt0();
        kwt0Var.m147644e(this.f136087a);
        kwt0Var.m147648i(this.f136088b);
        kwt0Var.m147645f(this.f136089c);
        kwt0Var.m147646g(this.f136091e);
        kwt0Var.m147643d(this.f136092f);
        return kwt0Var;
    }

    /* JADX INFO: renamed from: e */
    public final n3v0 m156771e(String str) {
        n3v0 n3v0Var = this.f136092f;
        return n3v0Var != null ? n3v0Var : new n3v0(str);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final wxv0 m156772f() {
        return this.f136090d;
    }

    /* JADX INFO: renamed from: g */
    public final iyv0 m156773g() {
        return this.f136088b;
    }
}
