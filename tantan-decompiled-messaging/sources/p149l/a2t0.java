package p149l;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class a2t0 {

    /* JADX INFO: renamed from: a */
    public BigInteger f67291a = BigInteger.ONE;

    /* JADX INFO: renamed from: b */
    public String f67292b = "0";

    /* JADX INFO: renamed from: a */
    public final synchronized String m94623a() {
        String string;
        string = this.f67291a.toString();
        this.f67291a = this.f67291a.add(BigInteger.ONE);
        this.f67292b = string;
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m94624b() {
        return this.f67292b;
    }
}
