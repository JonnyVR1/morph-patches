package p149l;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vy00 extends phf0 {

    /* JADX INFO: renamed from: o */
    public final d860 f183489o;

    public vy00() {
        super("Mp4WebvttDecoder");
        this.f183489o = new d860();
    }

    /* JADX INFO: renamed from: B */
    public static ywb m200604B(d860 d860Var, int i) throws SubtitleDecoderException {
        CharSequence charSequenceM215285q = null;
        ywb.C21557b c21557bM215283o = null;
        while (i > 0) {
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iM110311q = d860Var.m110311q();
            int iM110311q2 = d860Var.m110311q();
            int i2 = iM110311q - 8;
            String strM197797F = vck0.m197797F(d860Var.m110299e(), d860Var.m110300f(), i2);
            d860Var.m110293V(i2);
            i = (i - 8) - i2;
            if (iM110311q2 == 1937011815) {
                c21557bM215283o = ylp0.m215283o(strM197797F);
            } else if (iM110311q2 == 1885436268) {
                charSequenceM215285q = ylp0.m215285q(null, strM197797F.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceM215285q == null) {
            charSequenceM215285q = "";
        }
        return c21557bM215283o != null ? c21557bM215283o.m216325o(charSequenceM215285q).m216311a() : ylp0.m215280l(charSequenceM215285q);
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f183489o.m110290S(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f183489o.m110295a() > 0) {
            if (this.f183489o.m110295a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iM110311q = this.f183489o.m110311q();
            int iM110311q2 = this.f183489o.m110311q();
            d860 d860Var = this.f183489o;
            if (iM110311q2 == 1987343459) {
                arrayList.add(m200604B(d860Var, iM110311q - 8));
            } else {
                d860Var.m110293V(iM110311q - 8);
            }
        }
        return new wy00(arrayList);
    }
}
