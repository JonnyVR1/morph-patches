package p153l;

import com.xiaomi.push.C14926hu;

/* JADX INFO: loaded from: classes2.dex */
public class x3r0 {

    /* JADX INFO: renamed from: a */
    private static int f192292a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public static void m209259a(w3r0 w3r0Var, byte b) {
        m209260b(w3r0Var, b, f192292a);
    }

    /* JADX INFO: renamed from: b */
    public static void m209260b(w3r0 w3r0Var, byte b, int i) throws C14926hu {
        if (i <= 0) {
            throw new C14926hu("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                w3r0Var.mo87411y();
                return;
            case 3:
                w3r0Var.mo87387a();
                return;
            case 4:
                w3r0Var.mo87388b();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                w3r0Var.mo87398l();
                return;
            case 8:
                w3r0Var.mo87389c();
                return;
            case 10:
                w3r0Var.mo87390d();
                return;
            case 11:
                w3r0Var.mo87392f();
                return;
            case 12:
                w3r0Var.mo87397k();
                while (true) {
                    byte b2 = w3r0Var.mo87393g().f134700b;
                    if (b2 == 0) {
                        w3r0Var.mo87379D();
                        return;
                    } else {
                        m209260b(w3r0Var, b2, i - 1);
                        w3r0Var.mo87380E();
                    }
                }
                break;
            case 13:
                o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                while (i2 < o3r0VarMo87395i.f144851c) {
                    int i3 = i - 1;
                    m209260b(w3r0Var, o3r0VarMo87395i.f144849a, i3);
                    m209260b(w3r0Var, o3r0VarMo87395i.f144850b, i3);
                    i2++;
                }
                w3r0Var.mo87381F();
                return;
            case 14:
                y3r0 y3r0VarMo87396j = w3r0Var.mo87396j();
                while (i2 < y3r0VarMo87396j.f197387b) {
                    m209260b(w3r0Var, y3r0VarMo87396j.f197386a, i - 1);
                    i2++;
                }
                w3r0Var.mo87383H();
                return;
            case 15:
                n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                while (i2 < n3r0VarMo87394h.f140033b) {
                    m209260b(w3r0Var, n3r0VarMo87394h.f140032a, i - 1);
                    i2++;
                }
                w3r0Var.mo87382G();
                return;
        }
    }
}
