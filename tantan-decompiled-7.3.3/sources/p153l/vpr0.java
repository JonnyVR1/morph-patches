package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
public final class vpr0 implements xor0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f185297a = new bgw0();

    /* JADX INFO: renamed from: b */
    public final bgw0 f185298b = new bgw0();

    /* JADX INFO: renamed from: c */
    public final upr0 f185299c = new upr0();

    /* JADX INFO: renamed from: d */
    @Nullable
    public Inflater f185300d;

    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        this.f185297a.m104267i(bArr, i2 + i);
        this.f185297a.m104269k(i);
        bgw0 bgw0Var = this.f185297a;
        if (bgw0Var.m104275q() > 0 && bgw0Var.m104279u() == 120) {
            if (this.f185300d == null) {
                this.f185300d = new Inflater();
            }
            if (mpw0.m159409g(bgw0Var, this.f185298b, this.f185300d)) {
                bgw0 bgw0Var2 = this.f185298b;
                bgw0Var.m104267i(bgw0Var2.m104271m(), bgw0Var2.m104278t());
            }
        }
        this.f185299c.m197188e();
        ArrayList arrayList = new ArrayList();
        while (true) {
            bgw0 bgw0Var3 = this.f185297a;
            if (bgw0Var3.m104275q() < 3) {
                hkv0Var.zza(new qor0(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            upr0 upr0Var = this.f185299c;
            int iM104278t = bgw0Var3.m104278t();
            int iM104245B = bgw0Var3.m104245B();
            int iM104249F = bgw0Var3.m104249F();
            int iM104277s = bgw0Var3.m104277s() + iM104249F;
            u4v0 u4v0VarM197187a = null;
            if (iM104277s > iM104278t) {
                bgw0Var3.m104269k(iM104278t);
            } else {
                if (iM104245B != 128) {
                    switch (iM104245B) {
                        case 20:
                            upr0.m197186d(upr0Var, bgw0Var3, iM104249F);
                            break;
                        case 21:
                            upr0.m197184b(upr0Var, bgw0Var3, iM104249F);
                            break;
                        case 22:
                            upr0.m197185c(upr0Var, bgw0Var3, iM104249F);
                            break;
                    }
                } else {
                    u4v0VarM197187a = upr0Var.m197187a();
                    upr0Var.m197188e();
                }
                bgw0Var3.m104269k(iM104277s);
            }
            if (u4v0VarM197187a != null) {
                arrayList.add(u4v0VarM197187a);
            }
        }
    }
}
