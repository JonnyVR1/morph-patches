package p149l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class hhr0 implements rfr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f107824a = new v6w0();

    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        ovu0 ovu0VarM113598p;
        this.f107824a.m197260i(bArr, i2 + i);
        this.f107824a.m197262k(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            v6w0 v6w0Var = this.f107824a;
            if (v6w0Var.m197268q() <= 0) {
                bbv0Var.zza(new kfr0(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            f5v0.m119534e(v6w0Var.m197268q() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            v6w0 v6w0Var2 = this.f107824a;
            int iM197273v = v6w0Var2.m197273v() - 8;
            int iM197273v2 = v6w0Var2.m197273v();
            v6w0 v6w0Var3 = this.f107824a;
            if (iM197273v2 == 1987343459) {
                CharSequence charSequenceM102112a = null;
                dtu0 dtu0VarM102113b = null;
                while (iM197273v > 0) {
                    f5v0.m119534e(iM197273v >= 8, "Incomplete vtt cue box header found.");
                    int iM197273v3 = v6w0Var3.m197273v();
                    int iM197273v4 = v6w0Var3.m197273v();
                    int i3 = iM197273v - 8;
                    int i4 = iM197273v3 - 8;
                    String strM126059a = ggw0.m126059a(v6w0Var3.m197264m(), v6w0Var3.m197270s(), i4);
                    v6w0Var3.m197263l(i4);
                    if (iM197273v4 == 1937011815) {
                        dtu0VarM102113b = bir0.m102113b(strM126059a);
                    } else if (iM197273v4 == 1885436268) {
                        charSequenceM102112a = bir0.m102112a(null, strM126059a.trim(), Collections.EMPTY_LIST);
                    }
                    iM197273v = i3 - i4;
                }
                if (charSequenceM102112a == null) {
                    charSequenceM102112a = "";
                }
                if (dtu0VarM102113b != null) {
                    dtu0VarM102113b.m113594l(charSequenceM102112a);
                    ovu0VarM113598p = dtu0VarM102113b.m113598p();
                } else {
                    air0 air0Var = new air0();
                    air0Var.f70047c = charSequenceM102112a;
                    ovu0VarM113598p = air0Var.m96921a().m113598p();
                }
                arrayList.add(ovu0VarM113598p);
            } else {
                v6w0Var3.m197263l(iM197273v);
            }
        }
    }
}
