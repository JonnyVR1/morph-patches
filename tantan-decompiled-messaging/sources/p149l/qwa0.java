package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class qwa0 {

    /* JADX INFO: renamed from: g */
    public boolean f156675g;

    /* JADX INFO: renamed from: h */
    public final wp3 f156676h;

    /* JADX INFO: renamed from: c */
    public int f156671c = 0;

    /* JADX INFO: renamed from: b */
    public int f156670b = 0;

    /* JADX INFO: renamed from: d */
    public int f156672d = 0;

    /* JADX INFO: renamed from: f */
    public int f156674f = 0;

    /* JADX INFO: renamed from: e */
    public int f156673e = 0;

    /* JADX INFO: renamed from: a */
    public int f156669a = 0;

    public qwa0(wp3 wp3Var) {
        this.f156676h = (wp3) rf80.m179116g(wp3Var);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m176778b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m176779a(InputStream inputStream) throws Throwable {
        int i;
        int i2 = this.f156673e;
        while (this.f156669a != 6 && (i = inputStream.read()) != -1) {
            try {
                int i3 = this.f156671c;
                this.f156671c = i3 + 1;
                if (this.f156675g) {
                    this.f156669a = 6;
                    this.f156675g = false;
                    return false;
                }
                int i4 = this.f156669a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f156669a = 5;
                                } else if (i4 != 5) {
                                    rf80.m179118i(false);
                                } else {
                                    int i5 = ((this.f156670b << 8) + i) - 2;
                                    qzf0.m177201a(inputStream, i5);
                                    this.f156671c += i5;
                                    this.f156669a = 2;
                                }
                            } else if (i == 255) {
                                this.f156669a = 3;
                            } else if (i == 0) {
                                this.f156669a = 2;
                            } else if (i == 217) {
                                this.f156675g = true;
                                m176783f(i3 - 1);
                                this.f156669a = 2;
                            } else {
                                if (i == 218) {
                                    m176783f(i3 - 1);
                                }
                                if (m176778b(i)) {
                                    this.f156669a = 4;
                                } else {
                                    this.f156669a = 2;
                                }
                            }
                        } else if (i == 255) {
                            this.f156669a = 3;
                        }
                    } else if (i == 216) {
                        this.f156669a = 2;
                    } else {
                        this.f156669a = 6;
                    }
                } else if (i == 255) {
                    this.f156669a = 1;
                } else {
                    this.f156669a = 6;
                }
                this.f156670b = i;
            } catch (IOException e) {
                spi0.m185369a(e);
            }
        }
        return (this.f156669a == 6 || this.f156673e == i2) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public int m176780c() {
        return this.f156674f;
    }

    /* JADX INFO: renamed from: d */
    public int m176781d() {
        return this.f156673e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m176782e() {
        return this.f156675g;
    }

    /* JADX INFO: renamed from: f */
    public final void m176783f(int i) {
        int i2 = this.f156672d;
        if (i2 > 0) {
            this.f156674f = i;
        }
        this.f156672d = i2 + 1;
        this.f156673e = i2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m176784g(jze jzeVar) {
        if (this.f156669a == 6 || jzeVar.m143902M() <= this.f156671c) {
            return false;
        }
        ya80 ya80Var = new ya80(jzeVar.m143900I(), this.f156676h.get(16384), this.f156676h);
        try {
            qzf0.m177201a(ya80Var, this.f156671c);
            return m176779a(ya80Var);
        } catch (IOException e) {
            spi0.m185369a(e);
            return false;
        } finally {
            la5.m149128b(ya80Var);
        }
    }
}
