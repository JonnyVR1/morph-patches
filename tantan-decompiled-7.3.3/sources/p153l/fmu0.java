package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fmu0 {

    /* JADX INFO: renamed from: h */
    public static final fmu0 f99840h = new fmu0(new dmu0());

    /* JADX INFO: renamed from: a */
    @Nullable
    public final ims0 f99841a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final fms0 f99842b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final fns0 f99843c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final sms0 f99844d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final xss0 f99845e;

    /* JADX INFO: renamed from: f */
    public final oof0 f99846f;

    /* JADX INFO: renamed from: g */
    public final oof0 f99847g;

    public fmu0(dmu0 dmu0Var) {
        this.f99841a = dmu0Var.f89731a;
        this.f99842b = dmu0Var.f89732b;
        this.f99843c = dmu0Var.f89733c;
        this.f99846f = new oof0(dmu0Var.f89736f);
        this.f99847g = new oof0(dmu0Var.f89737g);
        this.f99844d = dmu0Var.f89734d;
        this.f99845e = dmu0Var.f89735e;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final fms0 m126325a() {
        return this.f99842b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ims0 m126326b() {
        return this.f99841a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final lms0 m126327c(String str) {
        return (lms0) this.f99847g.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final oms0 m126328d(String str) {
        return (oms0) this.f99846f.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final sms0 m126329e() {
        return this.f99844d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final fns0 m126330f() {
        return this.f99843c;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final xss0 m126331g() {
        return this.f99845e;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m126332h() {
        ArrayList arrayList = new ArrayList(this.f99846f.size());
        for (int i = 0; i < this.f99846f.size(); i++) {
            arrayList.add((String) this.f99846f.m168582i(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m126333i() {
        ArrayList arrayList = new ArrayList();
        if (this.f99843c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f99841a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f99842b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f99846f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f99845e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
