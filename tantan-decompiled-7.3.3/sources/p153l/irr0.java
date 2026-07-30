package p153l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcc;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class irr0 implements xor0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f116598a = new bgw0();

    /* JADX INFO: renamed from: b */
    public final oqr0 f116599b = new oqr0();

    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        this.f116598a.m104267i(bArr, i2 + i);
        this.f116598a.m104269k(i);
        ArrayList arrayList = new ArrayList();
        try {
            bgw0 bgw0Var = this.f116598a;
            int iM104277s = bgw0Var.m104277s();
            Charset charset = cow0.f82931c;
            String strM104257N = bgw0Var.m104257N(charset);
            if (strM104257N == null || !strM104257N.startsWith("WEBVTT")) {
                bgw0Var.m104269k(iM104277s);
                throw zzcc.zza("Expected WEBVTT. Got ".concat(String.valueOf(bgw0Var.m104257N(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f116598a.m104257N(cow0.f82931c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                bgw0 bgw0Var2 = this.f116598a;
                byte b = -1;
                int iM104277s2 = 0;
                while (b == -1) {
                    iM104277s2 = bgw0Var2.m104277s();
                    String strM104257N2 = bgw0Var2.m104257N(cow0.f82931c);
                    if (strM104257N2 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM104257N2)) {
                        b = 2;
                    } else {
                        b = strM104257N2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                bgw0Var2.m104269k(iM104277s2);
                if (b == 0) {
                    sor0.m187275a(new lrr0(arrayList2), wor0Var, hkv0Var);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(this.f116598a.m104257N(cow0.f82931c))) {
                    }
                } else if (b != 2) {
                    arr0 arr0VarM136924c = hrr0.m136924c(this.f116598a, arrayList);
                    if (arr0VarM136924c != null) {
                        arrayList2.add(arr0VarM136924c);
                    }
                } else if (!arrayList2.isEmpty()) {
                    wg3.m206174a("A style block was found after the first cue.");
                    return;
                } else {
                    this.f116598a.m104257N(cow0.f82931c);
                    arrayList.addAll(this.f116599b.m168847b(this.f116598a));
                }
            }
        } catch (zzcc e) {
            tg3.m191013a(e);
        }
    }
}
