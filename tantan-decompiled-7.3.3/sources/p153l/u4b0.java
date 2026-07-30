package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class u4b0 {

    /* JADX INFO: renamed from: g */
    public boolean f177454g;

    /* JADX INFO: renamed from: h */
    public final wq3 f177455h;

    /* JADX INFO: renamed from: c */
    public int f177450c = 0;

    /* JADX INFO: renamed from: b */
    public int f177449b = 0;

    /* JADX INFO: renamed from: d */
    public int f177451d = 0;

    /* JADX INFO: renamed from: f */
    public int f177453f = 0;

    /* JADX INFO: renamed from: e */
    public int f177452e = 0;

    /* JADX INFO: renamed from: a */
    public int f177448a = 0;

    public u4b0(wq3 wq3Var) {
        this.f177455h = (wq3) wn80.m207182g(wq3Var);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m194468b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m194469a(InputStream inputStream) throws Throwable {
        int i;
        int i2 = this.f177452e;
        while (this.f177448a != 6 && (i = inputStream.read()) != -1) {
            try {
                int i3 = this.f177450c;
                this.f177450c = i3 + 1;
                if (this.f177454g) {
                    this.f177448a = 6;
                    this.f177454g = false;
                    return false;
                }
                int i4 = this.f177448a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f177448a = 5;
                                } else if (i4 != 5) {
                                    wn80.m207184i(false);
                                } else {
                                    int i5 = ((this.f177449b << 8) + i) - 2;
                                    x7g0.m209634a(inputStream, i5);
                                    this.f177450c += i5;
                                    this.f177448a = 2;
                                }
                            } else if (i == 255) {
                                this.f177448a = 3;
                            } else if (i == 0) {
                                this.f177448a = 2;
                            } else if (i == 217) {
                                this.f177454g = true;
                                m194473f(i3 - 1);
                                this.f177448a = 2;
                            } else {
                                if (i == 218) {
                                    m194473f(i3 - 1);
                                }
                                if (m194468b(i)) {
                                    this.f177448a = 4;
                                } else {
                                    this.f177448a = 2;
                                }
                            }
                        } else if (i == 255) {
                            this.f177448a = 3;
                        }
                    } else if (i == 216) {
                        this.f177448a = 2;
                    } else {
                        this.f177448a = 6;
                    }
                } else if (i == 255) {
                    this.f177448a = 1;
                } else {
                    this.f177448a = 6;
                }
                this.f177449b = i;
            } catch (IOException e) {
                vyi0.m203997a(e);
            }
        }
        return (this.f177448a == 6 || this.f177452e == i2) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public int m194470c() {
        return this.f177453f;
    }

    /* JADX INFO: renamed from: d */
    public int m194471d() {
        return this.f177452e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m194472e() {
        return this.f177454g;
    }

    /* JADX INFO: renamed from: f */
    public final void m194473f(int i) {
        int i2 = this.f177451d;
        if (i2 > 0) {
            this.f177453f = i;
        }
        this.f177451d = i2 + 1;
        this.f177452e = i2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m194474g(n0f n0fVar) {
        if (this.f177448a == 6 || n0fVar.m160965M() <= this.f177450c) {
            return false;
        }
        ej80 ej80Var = new ej80(n0fVar.m160963I(), this.f177455h.get(16384), this.f177455h);
        try {
            x7g0.m209634a(ej80Var, this.f177450c);
            return m194469a(ej80Var);
        } catch (IOException e) {
            vyi0.m203997a(e);
            return false;
        } finally {
            lb5.m153575b(ej80Var);
        }
    }
}
