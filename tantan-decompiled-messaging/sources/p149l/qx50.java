package p149l;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qx50 extends ozf0 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f156808o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f156809p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f156810n;

    /* JADX INFO: renamed from: n */
    public static boolean m176943n(d860 d860Var, byte[] bArr) {
        if (d860Var.m110295a() < bArr.length) {
            return false;
        }
        int iM110300f = d860Var.m110300f();
        byte[] bArr2 = new byte[bArr.length];
        d860Var.m110306l(bArr2, 0, bArr.length);
        d860Var.m110292U(iM110300f);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m176944o(d860 d860Var) {
        return m176943n(d860Var, f156808o);
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: f */
    public long mo166763f(d860 d860Var) {
        return m166760c(rx50.m181474e(d860Var.m110299e()));
    }

    @Override // p149l.ozf0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: i */
    public boolean mo166766i(d860 d860Var, long j, ozf0.C19085b c19085b) throws ParserException {
        if (m176943n(d860Var, f156808o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d860Var.m110299e(), d860Var.m110301g());
            int iM181472c = rx50.m181472c(bArrCopyOf);
            List<byte[]> listM181470a = rx50.m181470a(bArrCopyOf);
            if (c19085b.f146435a != null) {
                return true;
            }
            c19085b.f146435a = new C1871k.b().m10346g0("audio/opus").m10323J(iM181472c).m10347h0(48000).m10335V(listM181470a).m10320G();
            return true;
        }
        byte[] bArr = f156809p;
        if (!m176943n(d860Var, bArr)) {
            p11.m167015i(c19085b.f146435a);
            return false;
        }
        p11.m167015i(c19085b.f146435a);
        if (this.f156810n) {
            return true;
        }
        this.f156810n = true;
        d860Var.m110293V(bArr.length);
        Metadata metadataM214313c = ydp0.m214313c(ImmutableList.copyOf(ydp0.m214319i(d860Var, false, false).f197578b));
        if (metadataM214313c == null) {
            return true;
        }
        c19085b.f146435a = c19085b.f146435a.m10282b().m10339Z(metadataM214313c.m10530b(c19085b.f146435a.f7746j)).m10320G();
        return true;
    }

    @Override // p149l.ozf0
    /* JADX INFO: renamed from: l */
    public void mo166769l(boolean z) {
        super.mo166769l(z);
        if (z) {
            this.f156810n = false;
        }
    }
}
