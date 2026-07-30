package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC1992m;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fj3 implements InterfaceC1992m {

    /* JADX INFO: renamed from: a */
    public final esf f99295a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public zrf f99296b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public asf f99297c;

    public fj3(esf esfVar) {
        this.f99295a = esfVar;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    /* JADX INFO: renamed from: a */
    public void mo11376a(long j, long j2) {
        ((zrf) w11.m204369e(this.f99296b)).mo11029a(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    /* JADX INFO: renamed from: b */
    public long mo11377b() {
        asf asfVar = this.f99297c;
        if (asfVar != null) {
            return asfVar.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    /* JADX INFO: renamed from: c */
    public int mo11378c(ll80 ll80Var) throws IOException {
        return ((zrf) w11.m204369e(this.f99296b)).mo11032h((asf) w11.m204369e(this.f99297c), ll80Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    /* JADX INFO: renamed from: d */
    public void mo11379d() {
        zrf zrfVar = this.f99296b;
        if (zrfVar instanceof z610) {
            ((z610) zrfVar).m218766j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    /* JADX INFO: renamed from: e */
    public void mo11380e(e6c e6cVar, Uri uri, Map<String, List<String>> map, long j, long j2, bsf bsfVar) throws IOException {
        qod qodVar = new qod(e6cVar, j, j2);
        this.f99297c = qodVar;
        if (this.f99296b != null) {
            return;
        }
        zrf[] zrfVarArrMo122322a = this.f99295a.mo122322a(uri, map);
        if (zrfVarArrMo122322a.length == 1) {
            this.f99296b = zrfVarArrMo122322a[0];
        } else {
            for (zrf zrfVar : zrfVarArrMo122322a) {
                try {
                    if (zrfVar.mo11031f(qodVar)) {
                        this.f99296b = zrfVar;
                        w11.m204371g(true);
                        qodVar.mo99902h();
                        break;
                    } else {
                        boolean z = this.f99296b != null || qodVar.getPosition() == j;
                        w11.m204371g(z);
                        qodVar.mo99902h();
                    }
                } catch (EOFException unused) {
                    if (this.f99296b != null || qodVar.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    w11.m204371g(this.f99296b != null || qodVar.getPosition() == j);
                    qodVar.mo99902h();
                    throw th;
                }
                w11.m204371g(z);
                qodVar.mo99902h();
            }
            if (this.f99296b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + bmk0.m105091N(zrfVarArrMo122322a) + ") could read the stream.", (Uri) w11.m204369e(uri));
            }
        }
        this.f99296b.mo11030b(bsfVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1992m
    public void release() {
        zrf zrfVar = this.f99296b;
        if (zrfVar != null) {
            zrfVar.release();
            this.f99296b = null;
        }
        this.f99297c = null;
    }
}
