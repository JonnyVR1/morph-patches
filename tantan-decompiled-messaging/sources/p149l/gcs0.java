package p149l;

import com.google.android.gms.internal.ads.zzapi;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gcs0 extends ror0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ byte[] f102049o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Map f102050p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ w2t0 f102051q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcs0(vjs0 vjs0Var, int i, String str, inr0 inr0Var, hnr0 hnr0Var, byte[] bArr, Map map, w2t0 w2t0Var) {
        super(i, str, inr0Var, hnr0Var);
        this.f102049o = bArr;
        this.f102050p = map;
        this.f102051q = w2t0Var;
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: B */
    public final byte[] mo112654B() throws zzapi {
        byte[] bArr = this.f102049o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // p149l.ror0
    /* JADX INFO: renamed from: F */
    public final void mo125521F(String str) {
        this.f102051q.m201228g(str);
        super.mo125521F(str);
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: p */
    public final Map mo112665p() throws zzapi {
        Map map = this.f102050p;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ void mo112668s(Object obj) {
        mo125521F((String) obj);
    }
}
