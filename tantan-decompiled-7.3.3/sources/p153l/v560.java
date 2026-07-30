package p153l;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v560 extends v7g0 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f182480o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f182481p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f182482n;

    /* JADX INFO: renamed from: n */
    public static boolean m199773n(ig60 ig60Var, byte[] bArr) {
        if (ig60Var.m139811a() < bArr.length) {
            return false;
        }
        int iM139816f = ig60Var.m139816f();
        byte[] bArr2 = new byte[bArr.length];
        ig60Var.m139822l(bArr2, 0, bArr.length);
        ig60Var.m139808U(iM139816f);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m199774o(ig60 ig60Var) {
        return m199773n(ig60Var, f182480o);
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: f */
    public long mo105604f(ig60 ig60Var) {
        return m200196c(w560.m204963e(ig60Var.m139815e()));
    }

    @Override // p153l.v7g0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo105605i(ig60 ig60Var, long j, v7g0.C20782b c20782b) throws ParserException {
        if (m199773n(ig60Var, f182480o)) {
            byte[] bArrCopyOf = Arrays.copyOf(ig60Var.m139815e(), ig60Var.m139817g());
            int iM204961c = w560.m204961c(bArrCopyOf);
            List<byte[]> listM204959a = w560.m204959a(bArrCopyOf);
            if (c20782b.f182771a != null) {
                return true;
            }
            c20782b.f182771a = new C1894k.b().m10400g0("audio/opus").m10377J(iM204961c).m10401h0(48000).m10389V(listM204959a).m10374G();
            return true;
        }
        byte[] bArr = f182481p;
        if (!m199773n(ig60Var, bArr)) {
            w11.m204373i(c20782b.f182771a);
            return false;
        }
        w11.m204373i(c20782b.f182771a);
        if (this.f182482n) {
            return true;
        }
        this.f182482n = true;
        ig60Var.m139809V(bArr.length);
        Metadata metadataM111524c = cnp0.m111524c(ImmutableList.copyOf(cnp0.m111530i(ig60Var, false, false).f82740b));
        if (metadataM111524c == null) {
            return true;
        }
        c20782b.f182771a = c20782b.f182771a.m10336b().m10393Z(metadataM111524c.m10584b(c20782b.f182771a.f7783j)).m10374G();
        return true;
    }

    @Override // p153l.v7g0
    /* JADX INFO: renamed from: l */
    public void mo105606l(boolean z) {
        super.mo105606l(z);
        if (z) {
            this.f182482n = false;
        }
    }
}
