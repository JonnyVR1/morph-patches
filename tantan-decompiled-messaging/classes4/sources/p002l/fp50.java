package p002l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fp50 {

    /* JADX INFO: renamed from: a */
    public int f10578a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public mnj f10580c;

    /* JADX INFO: renamed from: b */
    public String f10579b = "default";

    /* JADX INFO: renamed from: d */
    public List<Integer> f10581d = new ArrayList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public mnj m13437a() {
        return this.f10580c;
    }

    /* JADX INFO: renamed from: b */
    public int m13438b() {
        return this.f10578a;
    }

    /* JADX INFO: renamed from: c */
    public String m13439c() {
        return this.f10579b;
    }

    /* JADX INFO: renamed from: d */
    public String m13440d() {
        return m13442f() == null ? "" : m13442f().f15446e.a;
    }

    /* JADX INFO: renamed from: e */
    public List<Integer> m13441e() {
        return this.f10581d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public mlj m13442f() {
        mnj mnjVar = this.f10580c;
        if (mnjVar == null) {
            return null;
        }
        return mnjVar.m18095g();
    }

    /* JADX INFO: renamed from: g */
    public fp50 m13443g(List<Integer> list) {
        this.f10581d = list;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fp50 m13444h(mnj mnjVar) {
        this.f10580c = mnjVar;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public fp50 m13445i(int i) {
        this.f10578a = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public fp50 m13446j(String str) {
        this.f10579b = str;
        return this;
    }
}
