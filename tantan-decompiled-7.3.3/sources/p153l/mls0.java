package p153l;

import com.google.android.gms.internal.ads.zzapi;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mls0 extends xxr0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ byte[] f137443o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Map f137444p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ cct0 f137445q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mls0(bts0 bts0Var, int i, String str, owr0 owr0Var, nwr0 nwr0Var, byte[] bArr, Map map, cct0 cct0Var) {
        super(i, str, owr0Var, nwr0Var);
        this.f137443o = bArr;
        this.f137444p = map;
        this.f137445q = cct0Var;
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: B */
    public final byte[] mo147192B() throws zzapi {
        byte[] bArr = this.f137443o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // p153l.xxr0
    /* JADX INFO: renamed from: F */
    public final void mo158948F(String str) {
        this.f137445q.m109075g(str);
        super.mo158948F(str);
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: p */
    public final Map mo147203p() throws zzapi {
        Map map = this.f137444p;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ void mo147206s(Object obj) {
        mo158948F((String) obj);
    }
}
