package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zcu0 {

    /* JADX INFO: renamed from: h */
    public static final zcu0 f202581h = new zcu0(new xcu0());

    /* JADX INFO: renamed from: a */
    @Nullable
    public final cds0 f202582a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zcs0 f202583b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final zds0 f202584c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final mds0 f202585d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final rjs0 f202586e;

    /* JADX INFO: renamed from: f */
    public final hgf0 f202587f;

    /* JADX INFO: renamed from: g */
    public final hgf0 f202588g;

    public zcu0(xcu0 xcu0Var) {
        this.f202582a = xcu0Var.f192267a;
        this.f202583b = xcu0Var.f192268b;
        this.f202584c = xcu0Var.f192269c;
        this.f202587f = new hgf0(xcu0Var.f192272f);
        this.f202588g = new hgf0(xcu0Var.f192273g);
        this.f202585d = xcu0Var.f192270d;
        this.f202586e = xcu0Var.f192271e;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final zcs0 m218102a() {
        return this.f202583b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final cds0 m218103b() {
        return this.f202582a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final fds0 m218104c(String str) {
        return (fds0) this.f202588g.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final ids0 m218105d(String str) {
        return (ids0) this.f202587f.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final mds0 m218106e() {
        return this.f202585d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final zds0 m218107f() {
        return this.f202584c;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final rjs0 m218108g() {
        return this.f202586e;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m218109h() {
        ArrayList arrayList = new ArrayList(this.f202587f.size());
        for (int i = 0; i < this.f202587f.size(); i++) {
            arrayList.add((String) this.f202587f.m130823i(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m218110i() {
        ArrayList arrayList = new ArrayList();
        if (this.f202584c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f202582a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f202583b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f202587f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f202586e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
