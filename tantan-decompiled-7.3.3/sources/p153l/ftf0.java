package p153l;

import java.io.EOFException;
import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ftf0 {

    /* JADX INFO: renamed from: a */
    public String f100735a = "default";

    /* JADX INFO: renamed from: a */
    public abstract void mo127313a(Buffer buffer, smc0 smc0Var) throws EOFException;

    /* JADX INFO: renamed from: b */
    public abstract void mo127314b(Buffer buffer, smc0 smc0Var) throws IllegalArgumentException;

    /* JADX INFO: renamed from: c */
    public abstract int mo127315c();

    /* JADX INFO: renamed from: d */
    public abstract int mo127316d();

    /* JADX INFO: renamed from: e */
    public boolean m127317e() {
        return "auth".equals(this.f100735a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m127318f() {
        return "connect".equals(this.f100735a);
    }

    /* JADX INFO: renamed from: g */
    public boolean m127319g() {
        return "normal".equals(this.f100735a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m127320h() {
        return "ping".equals(this.f100735a);
    }

    /* JADX INFO: renamed from: i */
    public void mo127321i(String str) {
        this.f100735a = str;
    }
}
