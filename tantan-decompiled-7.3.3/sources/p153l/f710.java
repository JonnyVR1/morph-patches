package p153l;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class f710 extends xpf0 {

    /* JADX INFO: renamed from: o */
    public final ig60 f97477o;

    public f710() {
        super("Mp4WebvttDecoder");
        this.f97477o = new ig60();
    }

    /* JADX INFO: renamed from: B */
    public static myb m124348B(ig60 ig60Var, int i) throws SubtitleDecoderException {
        CharSequence charSequenceM112836q = null;
        myb.C18746b c18746bM112834o = null;
        while (i > 0) {
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iM139827q = ig60Var.m139827q();
            int iM139827q2 = ig60Var.m139827q();
            int i2 = iM139827q - 8;
            String strM105075F = bmk0.m105075F(ig60Var.m139815e(), ig60Var.m139816f(), i2);
            ig60Var.m139809V(i2);
            i = (i - 8) - i2;
            if (iM139827q2 == 1937011815) {
                c18746bM112834o = cvp0.m112834o(strM105075F);
            } else if (iM139827q2 == 1885436268) {
                charSequenceM112836q = cvp0.m112836q(null, strM105075F.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceM112836q == null) {
            charSequenceM112836q = "";
        }
        return c18746bM112834o != null ? c18746bM112834o.m160768o(charSequenceM112836q).m160754a() : cvp0.m112831l(charSequenceM112836q);
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f97477o.m139806S(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f97477o.m139811a() > 0) {
            if (this.f97477o.m139811a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iM139827q = this.f97477o.m139827q();
            int iM139827q2 = this.f97477o.m139827q();
            ig60 ig60Var = this.f97477o;
            if (iM139827q2 == 1987343459) {
                arrayList.add(m124348B(ig60Var, iM139827q - 8));
            } else {
                ig60Var.m139809V(iM139827q - 8);
            }
        }
        return new g710(arrayList);
    }
}
