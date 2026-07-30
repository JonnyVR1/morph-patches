package p149l;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class amp0 extends phf0 {

    /* JADX INFO: renamed from: o */
    public final d860 f70667o;

    /* JADX INFO: renamed from: p */
    public final vlp0 f70668p;

    public amp0() {
        super("WebvttDecoder");
        this.f70667o = new d860();
        this.f70668p = new vlp0();
    }

    /* JADX INFO: renamed from: B */
    public static int m97679B(d860 d860Var) {
        int i = -1;
        int iM110300f = 0;
        while (i == -1) {
            iM110300f = d860Var.m110300f();
            String strM110313s = d860Var.m110313s();
            if (strM110313s == null) {
                i = 0;
            } else if ("STYLE".equals(strM110313s)) {
                i = 2;
            } else {
                i = strM110313s.startsWith("NOTE") ? 1 : 3;
            }
        }
        d860Var.m110292U(iM110300f);
        return i;
    }

    /* JADX INFO: renamed from: C */
    public static void m97680C(d860 d860Var) {
        while (!TextUtils.isEmpty(d860Var.m110313s())) {
        }
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        xlp0 xlp0VarM215282n;
        this.f70667o.m110290S(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            cmp0.m107691e(this.f70667o);
            while (!TextUtils.isEmpty(this.f70667o.m110313s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iM97679B = m97679B(this.f70667o);
                if (iM97679B == 0) {
                    return new emp0(arrayList2);
                }
                if (iM97679B == 1) {
                    m97680C(this.f70667o);
                } else if (iM97679B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f70667o.m110313s();
                    arrayList.addAll(this.f70668p.m198836d(this.f70667o));
                } else if (iM97679B == 3 && (xlp0VarM215282n = ylp0.m215282n(this.f70667o, arrayList)) != null) {
                    arrayList2.add(xlp0VarM215282n);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
