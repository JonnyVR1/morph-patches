package p153l;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class evp0 extends xpf0 {

    /* JADX INFO: renamed from: o */
    public final ig60 f96019o;

    /* JADX INFO: renamed from: p */
    public final zup0 f96020p;

    public evp0() {
        super("WebvttDecoder");
        this.f96019o = new ig60();
        this.f96020p = new zup0();
    }

    /* JADX INFO: renamed from: B */
    public static int m122809B(ig60 ig60Var) {
        int i = -1;
        int iM139816f = 0;
        while (i == -1) {
            iM139816f = ig60Var.m139816f();
            String strM139829s = ig60Var.m139829s();
            if (strM139829s == null) {
                i = 0;
            } else if ("STYLE".equals(strM139829s)) {
                i = 2;
            } else {
                i = strM139829s.startsWith("NOTE") ? 1 : 3;
            }
        }
        ig60Var.m139808U(iM139816f);
        return i;
    }

    /* JADX INFO: renamed from: C */
    public static void m122810C(ig60 ig60Var) {
        while (!TextUtils.isEmpty(ig60Var.m139829s())) {
        }
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        bvp0 bvp0VarM112833n;
        this.f96019o.m139806S(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            gvp0.m132578e(this.f96019o);
            while (!TextUtils.isEmpty(this.f96019o.m139829s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iM122809B = m122809B(this.f96019o);
                if (iM122809B == 0) {
                    return new ivp0(arrayList2);
                }
                if (iM122809B == 1) {
                    m122810C(this.f96019o);
                } else if (iM122809B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f96019o.m139829s();
                    arrayList.addAll(this.f96020p.m221698d(this.f96019o));
                } else if (iM122809B == 3 && (bvp0VarM112833n = cvp0.m112833n(this.f96019o, arrayList)) != null) {
                    arrayList2.add(bvp0VarM112833n);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
