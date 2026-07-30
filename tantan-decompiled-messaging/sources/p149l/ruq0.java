package p149l;

import com.xiaomi.push.C14778hu;

/* JADX INFO: loaded from: classes2.dex */
public class ruq0 {

    /* JADX INFO: renamed from: a */
    private static int f161134a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public static void m181208a(quq0 quq0Var, byte b) {
        m181209b(quq0Var, b, f161134a);
    }

    /* JADX INFO: renamed from: b */
    public static void m181209b(quq0 quq0Var, byte b, int i) throws C14778hu {
        if (i <= 0) {
            throw new C14778hu("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                quq0Var.mo86240y();
                return;
            case 3:
                quq0Var.mo86216a();
                return;
            case 4:
                quq0Var.mo86217b();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                quq0Var.mo86227l();
                return;
            case 8:
                quq0Var.mo86218c();
                return;
            case 10:
                quq0Var.mo86219d();
                return;
            case 11:
                quq0Var.mo86221f();
                return;
            case 12:
                quq0Var.mo86226k();
                while (true) {
                    byte b2 = quq0Var.mo86222g().f104457b;
                    if (b2 == 0) {
                        quq0Var.mo86208D();
                        return;
                    } else {
                        m181209b(quq0Var, b2, i - 1);
                        quq0Var.mo86209E();
                    }
                }
                break;
            case 13:
                iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                while (i2 < iuq0VarMo86224i.f115048c) {
                    int i3 = i - 1;
                    m181209b(quq0Var, iuq0VarMo86224i.f115046a, i3);
                    m181209b(quq0Var, iuq0VarMo86224i.f115047b, i3);
                    i2++;
                }
                quq0Var.mo86210F();
                return;
            case 14:
                suq0 suq0VarMo86225j = quq0Var.mo86225j();
                while (i2 < suq0VarMo86225j.f166495b) {
                    m181209b(quq0Var, suq0VarMo86225j.f166494a, i - 1);
                    i2++;
                }
                quq0Var.mo86212H();
                return;
            case 15:
                huq0 huq0VarMo86223h = quq0Var.mo86223h();
                while (i2 < huq0VarMo86223h.f109582b) {
                    m181209b(quq0Var, huq0VarMo86223h.f109581a, i - 1);
                    i2++;
                }
                quq0Var.mo86211G();
                return;
        }
    }
}
