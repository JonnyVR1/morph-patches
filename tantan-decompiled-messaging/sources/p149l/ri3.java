package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1969m;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ri3 implements InterfaceC1969m {

    /* JADX INFO: renamed from: a */
    public final xqf f159515a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public sqf f159516b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public tqf f159517c;

    public ri3(xqf xqfVar) {
        this.f159515a = xqfVar;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    /* JADX INFO: renamed from: a */
    public void mo11322a(long j, long j2) {
        ((sqf) p11.m167011e(this.f159516b)).mo10975a(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    /* JADX INFO: renamed from: b */
    public long mo11323b() {
        tqf tqfVar = this.f159517c;
        if (tqfVar != null) {
            return tqfVar.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    /* JADX INFO: renamed from: c */
    public int mo11324c(fd80 fd80Var) throws IOException {
        return ((sqf) p11.m167011e(this.f159516b)).mo10978h((tqf) p11.m167011e(this.f159517c), fd80Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    /* JADX INFO: renamed from: d */
    public void mo11325d() {
        sqf sqfVar = this.f159516b;
        if (sqfVar instanceof py00) {
            ((py00) sqfVar).m171995j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    /* JADX INFO: renamed from: e */
    public void mo11326e(w4c w4cVar, Uri uri, Map<String, List<String>> map, long j, long j2, uqf uqfVar) throws IOException {
        lnd lndVar = new lnd(w4cVar, j, j2);
        this.f159517c = lndVar;
        if (this.f159516b != null) {
            return;
        }
        sqf[] sqfVarArrMo165164a = this.f159515a.mo165164a(uri, map);
        if (sqfVarArrMo165164a.length == 1) {
            this.f159516b = sqfVarArrMo165164a[0];
        } else {
            for (sqf sqfVar : sqfVarArrMo165164a) {
                try {
                    if (sqfVar.mo10977f(lndVar)) {
                        this.f159516b = sqfVar;
                        p11.m167013g(true);
                        lndVar.mo150657h();
                        break;
                    } else {
                        boolean z = this.f159516b != null || lndVar.getPosition() == j;
                        p11.m167013g(z);
                        lndVar.mo150657h();
                    }
                } catch (EOFException unused) {
                    if (this.f159516b != null || lndVar.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    p11.m167013g(this.f159516b != null || lndVar.getPosition() == j);
                    lndVar.mo150657h();
                    throw th;
                }
                p11.m167013g(z);
                lndVar.mo150657h();
            }
            if (this.f159516b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + vck0.m197813N(sqfVarArrMo165164a) + ") could read the stream.", (Uri) p11.m167011e(uri));
            }
        }
        this.f159516b.mo10976b(uqfVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1969m
    public void release() {
        sqf sqfVar = this.f159516b;
        if (sqfVar != null) {
            sqfVar.release();
            this.f159516b = null;
        }
        this.f159517c = null;
    }
}
