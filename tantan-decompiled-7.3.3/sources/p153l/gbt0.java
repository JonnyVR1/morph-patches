package p153l;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class gbt0 {

    /* JADX INFO: renamed from: a */
    public BigInteger f103491a = BigInteger.ONE;

    /* JADX INFO: renamed from: b */
    public String f103492b = "0";

    /* JADX INFO: renamed from: a */
    public final synchronized String m129804a() {
        String string;
        string = this.f103491a.toString();
        this.f103491a = this.f103491a.add(BigInteger.ONE);
        this.f103492b = string;
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m129805b() {
        return this.f103492b;
    }
}
