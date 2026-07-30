package p153l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class nqr0 implements xor0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f143255a = new bgw0();

    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        u4v0 u4v0VarM143281p;
        this.f143255a.m104267i(bArr, i2 + i);
        this.f143255a.m104269k(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bgw0 bgw0Var = this.f143255a;
            if (bgw0Var.m104275q() <= 0) {
                hkv0Var.zza(new qor0(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            lev0.m153957e(bgw0Var.m104275q() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            bgw0 bgw0Var2 = this.f143255a;
            int iM104280v = bgw0Var2.m104280v() - 8;
            int iM104280v2 = bgw0Var2.m104280v();
            bgw0 bgw0Var3 = this.f143255a;
            if (iM104280v2 == 1987343459) {
                CharSequence charSequenceM136922a = null;
                j2v0 j2v0VarM136923b = null;
                while (iM104280v > 0) {
                    lev0.m153957e(iM104280v >= 8, "Incomplete vtt cue box header found.");
                    int iM104280v3 = bgw0Var3.m104280v();
                    int iM104280v4 = bgw0Var3.m104280v();
                    int i3 = iM104280v - 8;
                    int i4 = iM104280v3 - 8;
                    String strM159403a = mpw0.m159403a(bgw0Var3.m104271m(), bgw0Var3.m104277s(), i4);
                    bgw0Var3.m104270l(i4);
                    if (iM104280v4 == 1937011815) {
                        j2v0VarM136923b = hrr0.m136923b(strM159403a);
                    } else if (iM104280v4 == 1885436268) {
                        charSequenceM136922a = hrr0.m136922a(null, strM159403a.trim(), Collections.EMPTY_LIST);
                    }
                    iM104280v = i3 - i4;
                }
                if (charSequenceM136922a == null) {
                    charSequenceM136922a = "";
                }
                if (j2v0VarM136923b != null) {
                    j2v0VarM136923b.m143277l(charSequenceM136922a);
                    u4v0VarM143281p = j2v0VarM136923b.m143281p();
                } else {
                    grr0 grr0Var = new grr0();
                    grr0Var.f106135c = charSequenceM136922a;
                    u4v0VarM143281p = grr0Var.m131868a().m143281p();
                }
                arrayList.add(u4v0VarM143281p);
            } else {
                bgw0Var3.m104270l(iM104280v);
            }
        }
    }
}
