package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fp50 {

    /* JADX INFO: renamed from: a */
    public int f98665a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public mnj f98667c;

    /* JADX INFO: renamed from: b */
    public String f98666b = "default";

    /* JADX INFO: renamed from: d */
    public List<Integer> f98668d = new ArrayList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public mnj m122557a() {
        return this.f98667c;
    }

    /* JADX INFO: renamed from: b */
    public int m122558b() {
        return this.f98665a;
    }

    /* JADX INFO: renamed from: c */
    public String m122559c() {
        return this.f98666b;
    }

    /* JADX INFO: renamed from: d */
    public String m122560d() {
        return m122562f() == null ? "" : m122562f().f134444e.f111520a;
    }

    /* JADX INFO: renamed from: e */
    public List<Integer> m122561e() {
        return this.f98668d;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public mlj m122562f() {
        mnj mnjVar = this.f98667c;
        if (mnjVar == null) {
            return null;
        }
        return mnjVar.m155518g();
    }

    /* JADX INFO: renamed from: g */
    public fp50 m122563g(List<Integer> list) {
        this.f98668d = list;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fp50 m122564h(mnj mnjVar) {
        this.f98667c = mnjVar;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public fp50 m122565i(int i) {
        this.f98665a = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public fp50 m122566j(String str) {
        this.f98666b = str;
        return this;
    }
}
