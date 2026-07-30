package p149l;

import java.io.EOFException;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkf0 {

    /* JADX INFO: renamed from: a */
    public String f186744a = "default";

    /* JADX INFO: renamed from: a */
    public abstract void mo152006a(Buffer buffer, lec0 lec0Var) throws EOFException;

    /* JADX INFO: renamed from: b */
    public abstract void mo152007b(Buffer buffer, lec0 lec0Var) throws IllegalArgumentException;

    /* JADX INFO: renamed from: c */
    public abstract int mo152008c();

    /* JADX INFO: renamed from: d */
    public abstract int mo152009d();

    /* JADX INFO: renamed from: e */
    public boolean m203665e() {
        return "auth".equals(this.f186744a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m203666f() {
        return "connect".equals(this.f186744a);
    }

    /* JADX INFO: renamed from: g */
    public boolean m203667g() {
        return "normal".equals(this.f186744a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m203668h() {
        return "ping".equals(this.f186744a);
    }

    /* JADX INFO: renamed from: i */
    public void mo152010i(String str) {
        this.f186744a = str;
    }
}
