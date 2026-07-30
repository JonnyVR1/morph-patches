package p149l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcc;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class cir0 implements rfr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f81110a = new v6w0();

    /* JADX INFO: renamed from: b */
    public final ihr0 f81111b = new ihr0();

    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        this.f81110a.m197260i(bArr, i2 + i);
        this.f81110a.m197262k(i);
        ArrayList arrayList = new ArrayList();
        try {
            v6w0 v6w0Var = this.f81110a;
            int iM197270s = v6w0Var.m197270s();
            Charset charset = wew0.f185990c;
            String strM197250N = v6w0Var.m197250N(charset);
            if (strM197250N == null || !strM197250N.startsWith("WEBVTT")) {
                v6w0Var.m197262k(iM197270s);
                throw zzcc.zza("Expected WEBVTT. Got ".concat(String.valueOf(v6w0Var.m197250N(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f81110a.m197250N(wew0.f185990c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                v6w0 v6w0Var2 = this.f81110a;
                byte b = -1;
                int iM197270s2 = 0;
                while (b == -1) {
                    iM197270s2 = v6w0Var2.m197270s();
                    String strM197250N2 = v6w0Var2.m197250N(wew0.f185990c);
                    if (strM197250N2 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM197250N2)) {
                        b = 2;
                    } else {
                        b = strM197250N2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                v6w0Var2.m197262k(iM197270s2);
                if (b == 0) {
                    mfr0.m154408a(new fir0(arrayList2), qfr0Var, bbv0Var);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(this.f81110a.m197250N(wew0.f185990c))) {
                    }
                } else if (b != 2) {
                    uhr0 uhr0VarM102114c = bir0.m102114c(this.f81110a, arrayList);
                    if (uhr0VarM102114c != null) {
                        arrayList2.add(uhr0VarM102114c);
                    }
                } else if (!arrayList2.isEmpty()) {
                    ig3.m135964a("A style block was found after the first cue.");
                    return;
                } else {
                    this.f81110a.m197250N(wew0.f185990c);
                    arrayList.addAll(this.f81111b.m136274b(this.f81110a));
                }
            }
        } catch (zzcc e) {
            fg3.m121203a(e);
        }
    }
}
